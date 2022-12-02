package com.example.bloodbank.activities;

public class Haversine {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            final int R = 6371; // Radious of the earth
            Double lat1 = Double.parseDouble(args[0]);
            Double lon1 = Double.parseDouble(args[1]);
            Double lat2 = Double.parseDouble(args[2]);
            Double lon2 = Double.parseDouble(args[3]);
            Double latDistance = toRad(lat2-lat1);
            Double lonDistance = toRad(lon2-lon1);
            Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                    Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) *
                            Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
            Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
            Double distance = R * c;

            System.out.println("The distance between two lat and long is: " + distance);

        }

        private static Double toRad(Double value) {
            return value * Math.PI / 180;
        }

    }
