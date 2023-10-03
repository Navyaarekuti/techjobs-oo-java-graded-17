package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    public abstract class JobField {
        private int id;
        private static int nextId = 1;
        private String value;

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this();
            this.value = value;
        }

        // Getters and Setters:

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        // Custom equals and hashCode methods:

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof JobField)) return false;
            JobField jobField = (JobField) o;
            return getId() == jobField.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }

        // Custom toString method:

        @Override
        public String toString() {
            return value;
        }
    }
}
