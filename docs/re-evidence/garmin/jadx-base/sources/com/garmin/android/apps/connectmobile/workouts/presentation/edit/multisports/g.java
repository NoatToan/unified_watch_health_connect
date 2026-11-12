package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/g;", "", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/g$a;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g {
    public /* synthetic */ g(j jVar) {
        this();
    }

    private g() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/g$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/g;", "", "isNextButtonEnabled", "isAddAnotherLegButtonEnabled", "hasExerciseOnAllSteps", "", "snackBarFooterTextResourceID", "shouldShowAudioNotes", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListMap", "<init>", "(ZZZIZLjava/util/Map;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f49188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f49190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map<Integer, com.garmin.android.apps.connectmobile.repcounting.model.c> f49191f;

        public /* synthetic */ a(boolean z14, boolean z15, boolean z16, int i14, boolean z17, Map map, int i15, j jVar) {
            this((i15 & 1) != 0 ? true : z14, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? true : z16, (i15 & 8) != 0 ? -1 : i14, (i15 & 16) != 0 ? true : z17, map);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49186a == aVar.f49186a && this.f49187b == aVar.f49187b && this.f49188c == aVar.f49188c && this.f49189d == aVar.f49189d && this.f49190e == aVar.f49190e && s.g(this.f49191f, aVar.f49191f);
        }

        public final int hashCode() {
            return this.f49191f.hashCode() + q6.f.g(q2.d(this.f49189d, q6.f.g(q6.f.g(Boolean.hashCode(this.f49186a) * 31, 31, this.f49187b), 31, this.f49188c), 31), 31, this.f49190e);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UpdateUIBasedOnLimits(isNextButtonEnabled=", ", isAddAnotherLegButtonEnabled=", ", hasExerciseOnAllSteps=", this.f49186a, this.f49187b);
            sbM.append(this.f49188c);
            sbM.append(", snackBarFooterTextResourceID=");
            sbM.append(this.f49189d);
            sbM.append(", shouldShowAudioNotes=");
            sbM.append(this.f49190e);
            sbM.append(", exerciseListMap=");
            sbM.append(this.f49191f);
            sbM.append(")");
            return sbM.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, boolean z15, boolean z16, int i14, boolean z17, Map<Integer, com.garmin.android.apps.connectmobile.repcounting.model.c> map) {
            super(null);
            map.getClass();
            this.f49186a = z14;
            this.f49187b = z15;
            this.f49188c = z16;
            this.f49189d = i14;
            this.f49190e = z17;
            this.f49191f = map;
        }
    }
}
