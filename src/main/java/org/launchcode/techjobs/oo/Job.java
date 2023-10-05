package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    public Job() {
            id = nextId;
            nextId++;
        }

        public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
            this();
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Job)) return false;
            Job job = (Job) o;
            return getId() == job.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employer getEmployer() {
            return employer;
        }

        public void setEmployer(Employer employer) {
            this.employer = employer;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public PositionType getPositionType() {
            return positionType;
        }

        public void setPositionType(PositionType positionType) {
            this.positionType = positionType;
        }

        public CoreCompetency getCoreCompetency() {
            return coreCompetency;
        }

        public void setCoreCompetency(CoreCompetency coreCompetency) {
            this.coreCompetency = coreCompetency;
        }

        @Override

        public String toString() {
            String idString = "ID: " + id + "\n";
            String nameString = "Name: " + (name != null && !name.isEmpty() ? name : "Data Not Available") + "\n";
            String employerString = "Employer: " + (employer != null ? employer : "Data Not Available") + "\n";
            String locationString = "Location: " + (location != null ? location : "Data Not Available") + "\n";
            String positionTypeString = "Position Type: " + (positionType != null ? positionType : "Data Not Available") + "\n";
            String coreCompetencyString = "Core Competency: " + (coreCompetency != null ? coreCompetency : "Data Not Available") + "\n";

            return "\n" + idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
        }

//        public String toString() {
//            String newline = System.lineSeparator();
//            // System.out.println(employer.getValue());
//
//            if (this.name==null||name.isEmpty()) {
//                //name=
//                name ="Data not available";
//            }
//            if(this.employer.getValue()==null||employer.getValue().isEmpty()) {
//
//                this.employer.setValue("Data not available");
//            }
//            if(this.location.getValue()==null||location.getValue().isEmpty()) {
//                this.location.setValue("Data not available");
//            }
//            if(this.positionType.getValue()==null||positionType.getValue().isEmpty()) {
//                this.positionType.setValue("Data not available");
//            }
//            if(this.coreCompetency.getValue()==null||coreCompetency.getValue().isEmpty()){
//                this.coreCompetency.setValue("Data not available");
//            }
//            return  newline + "ID: " + id +
//                    newline + "Name: " + name +
//                    newline + "Employer: " + employer +
//                    newline + "Location: " + location +
//                    newline + "Position Type: " + positionType +
//                    newline + "Core Competency: " + coreCompetency +
//                    newline;
//        }

    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


