package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
public interface g {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;", "", "currentLegIndex", "otherLegStepCounts", "", "hasMorePoolSwimLeg", "<init>", "(IIZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48994c;

        public a(int i14, int i15, boolean z14) {
            this.f48992a = i14;
            this.f48993b = i15;
            this.f48994c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f48992a == aVar.f48992a && this.f48993b == aVar.f48993b && this.f48994c == aVar.f48994c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f48994c) + q2.d(this.f48993b, Integer.hashCode(this.f48992a) * 31, 31);
        }

        public final String toString() {
            return hb.a.k(e5.j(this.f48992a, this.f48993b, "MultiSport(currentLegIndex=", ", otherLegStepCounts=", ", hasMorePoolSwimLeg="), this.f48994c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48995a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1833228438;
        }

        public final String toString() {
            return "SingleSport";
        }
    }
}
