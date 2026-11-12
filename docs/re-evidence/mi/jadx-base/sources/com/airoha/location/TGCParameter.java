package com.airoha.location;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TGCParameter {
    ArrayList<Long> pauseTimePointMs = new ArrayList<>();
    ExercisesMode exercisesMode = ExercisesMode.UNKNOWN;

    public enum ExercisesMode {
        UNKNOWN(0),
        WALKING(1),
        RUNNING(2),
        BIKING(3);

        private int value;

        ExercisesMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public ExercisesMode getExercisesMode() {
        return this.exercisesMode;
    }

    public ArrayList<Long> getPauseTimePointMs() {
        return this.pauseTimePointMs;
    }

    public void setExercisesMode(ExercisesMode exercisesMode) {
        this.exercisesMode = exercisesMode;
    }

    public void setPauseTimePointMs(ArrayList<Long> arrayList) {
        this.pauseTimePointMs = arrayList;
    }
}
