package com.garmin.android.apps.connectmobile.workouts.presentation.list;

import am.j;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.workouts.data.model.TrainingPlanSearchResultsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49444a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -622520386;
        }

        public final String toString() {
            return "AddWorkoutToCalendar";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e;", "", "workoutID", "<init>", "(J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f49445a;

        public b(long j8) {
            this.f49445a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f49445a == ((b) obj).f49445a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f49445a);
        }

        public final String toString() {
            return a0.f(this.f49445a, "CopyWorkout(workoutID=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f49446a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1913437946;
        }

        public final String toString() {
            return "Failed";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/list/e;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/TrainingPlanSearchResultsDTO;", "trainingPlan", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "workout", "", "dateTime", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/TrainingPlanSearchResultsDTO;Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrainingPlanSearchResultsDTO f49447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkoutDTO f49448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f49449c;

        public d(TrainingPlanSearchResultsDTO trainingPlanSearchResultsDTO, WorkoutDTO workoutDTO, long j8) {
            trainingPlanSearchResultsDTO.getClass();
            workoutDTO.getClass();
            this.f49447a = trainingPlanSearchResultsDTO;
            this.f49448b = workoutDTO;
            this.f49449c = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f49447a.equals(dVar.f49447a) && this.f49448b.equals(dVar.f49448b) && this.f49449c == dVar.f49449c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f49449c) + ((this.f49448b.hashCode() + (this.f49447a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("TrainingPlan(trainingPlan=");
            sb3.append(this.f49447a);
            sb3.append(", workout=");
            sb3.append(this.f49448b);
            sb3.append(", dateTime=");
            return j.i(this.f49449c, ")", sb3);
        }
    }
}
