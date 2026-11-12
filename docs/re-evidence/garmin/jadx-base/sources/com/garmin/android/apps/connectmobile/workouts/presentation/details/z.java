package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.room.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface z {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;", "", "timestamp", FirebaseAnalytics.Param.INDEX, "<init>", "(II)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48841b;

        public a(int i14, int i15) {
            this.f48840a = i14;
            this.f48841b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f48840a == aVar.f48840a && this.f48841b == aVar.f48841b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f48841b) + (Integer.hashCode(this.f48840a) * 31);
        }

        public final String toString() {
            return am.j.g(this.f48840a, this.f48841b, "AdaptiveCoachWorkout(timestamp=", ", index=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;", "", TtmlNode.ATTR_ID, "<init>", "(J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48842a;

        public b(long j8) {
            this.f48842a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f48842a == ((b) obj).f48842a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f48842a);
        }

        public final String toString() {
            return a0.f(this.f48842a, "SavedWorkout(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f48843a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -626912890;
        }

        public final String toString() {
            return "UnsavedWorkout";
        }
    }
}
