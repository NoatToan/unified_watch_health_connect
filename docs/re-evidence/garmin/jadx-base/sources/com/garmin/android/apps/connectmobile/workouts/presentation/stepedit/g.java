package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import am.x0;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import java.util.List;
import o62.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
public interface g {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "", "reps", "", "isRepsPlusSupported", "isRepsPlusEnabled", "<init>", "(IZZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f49670c;

        public a(int i14, boolean z14, boolean z15) {
            this.f49668a = i14;
            this.f49669b = z14;
            this.f49670c = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49668a == aVar.f49668a && this.f49669b == aVar.f49669b && this.f49670c == aVar.f49670c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f49670c) + q6.f.g(Integer.hashCode(this.f49668a) * 31, 31, this.f49669b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("EditReps(reps=");
            sb3.append(this.f49668a);
            sb3.append(", isRepsPlusSupported=");
            sb3.append(this.f49669b);
            sb3.append(", isRepsPlusEnabled=");
            return hb.a.k(sb3, this.f49670c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "", "isStarting", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49671a;

        public b(boolean z14) {
            this.f49671a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f49671a == ((b) obj).f49671a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f49671a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("Loading(isStarting=", ")", this.f49671a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "", "isSuccessful", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49672a;

        public c(boolean z14) {
            this.f49672a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f49672a == ((c) obj).f49672a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f49672a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("OnAudioUploaded(isSuccessful=", ")", this.f49672a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "", "isPrimary", "", "functionalThresholdPower", "", "valueOne", "valueTwo", "Lm52/h;", "valueUnit", "isForRunning", "<init>", "(ZIDDLm52/h;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f49675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f49676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final m52.h f49677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f49678f;

        public d(boolean z14, int i14, double d14, double d15, m52.h hVar, boolean z15) {
            this.f49673a = z14;
            this.f49674b = i14;
            this.f49675c = d14;
            this.f49676d = d15;
            this.f49677e = hVar;
            this.f49678f = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f49673a == dVar.f49673a && this.f49674b == dVar.f49674b && Double.compare(this.f49675c, dVar.f49675c) == 0 && Double.compare(this.f49676d, dVar.f49676d) == 0 && this.f49677e == dVar.f49677e && this.f49678f == dVar.f49678f;
        }

        public final int hashCode() {
            int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.f49674b, Boolean.hashCode(this.f49673a) * 31, 31), 31, this.f49675c), 31, this.f49676d);
            m52.h hVar = this.f49677e;
            return Boolean.hashCode(this.f49678f) + ((iB + (hVar == null ? 0 : hVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SelectCustomPowerTarget(isPrimary=");
            sb3.append(this.f49673a);
            sb3.append(", functionalThresholdPower=");
            sb3.append(this.f49674b);
            sb3.append(", valueOne=");
            sb3.append(this.f49675c);
            am.j.x(sb3, ", valueTwo=", this.f49676d, ", valueUnit=");
            sb3.append(this.f49677e);
            sb3.append(", isForRunning=");
            sb3.append(this.f49678f);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$e;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "selectedUpdateExerciseSet", "Lam/x0;", "activityType", "<init>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Lcom/garmin/android/apps/connectmobile/repcounting/model/e;Lam/x0;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.c f49679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.e f49680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x0 f49681c;

        public e(com.garmin.android.apps.connectmobile.repcounting.model.c cVar, com.garmin.android.apps.connectmobile.repcounting.model.e eVar, x0 x0Var) {
            this.f49679a = cVar;
            this.f49680b = eVar;
            this.f49681c = x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f49679a, eVar.f49679a) && s.g(this.f49680b, eVar.f49680b) && this.f49681c == eVar.f49681c;
        }

        public final int hashCode() {
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f49679a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar = this.f49680b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            x0 x0Var = this.f49681c;
            return iHashCode2 + (x0Var != null ? x0Var.hashCode() : 0);
        }

        public final String toString() {
            return "SelectExerciseType(exerciseList=" + this.f49679a + ", selectedUpdateExerciseSet=" + this.f49680b + ", activityType=" + this.f49681c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$f;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "Lo62/v0;", "weightData", "<init>", "(Lo62/v0;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v0 f49682a;

        public f(v0 v0Var) {
            v0Var.getClass();
            this.f49682a = v0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f49682a.equals(((f) obj).f49682a);
        }

        public final int hashCode() {
            return this.f49682a.hashCode();
        }

        public final String toString() {
            return "SelectExerciseWeight(weightData=" + this.f49682a + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$g;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "", "isPrimary", "", "stepDuration", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "targetList", "", "powerCurveDuration", "powerCurveScale", "powerCurveRange", "<init>", "(ZDLjava/util/List;III)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0983g implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f49684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<v> f49685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49688f;

        public C0983g(boolean z14, double d14, List<v> list, int i14, int i15, int i16) {
            this.f49683a = z14;
            this.f49684b = d14;
            this.f49685c = list;
            this.f49686d = i14;
            this.f49687e = i15;
            this.f49688f = i16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0983g)) {
                return false;
            }
            C0983g c0983g = (C0983g) obj;
            return this.f49683a == c0983g.f49683a && Double.compare(this.f49684b, c0983g.f49684b) == 0 && s.g(this.f49685c, c0983g.f49685c) && this.f49686d == c0983g.f49686d && this.f49687e == c0983g.f49687e && this.f49688f == c0983g.f49688f;
        }

        public final int hashCode() {
            int iB = org.apache.commons.lang3.e.b(Boolean.hashCode(this.f49683a) * 31, 31, this.f49684b);
            List<v> list = this.f49685c;
            return Integer.hashCode(this.f49688f) + q2.d(this.f49687e, q2.d(this.f49686d, (iB + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SelectPowerCurveTarget(isPrimary=");
            sb3.append(this.f49683a);
            sb3.append(", stepDuration=");
            sb3.append(this.f49684b);
            sb3.append(", targetList=");
            sb3.append(this.f49685c);
            sb3.append(", powerCurveDuration=");
            sb3.append(this.f49686d);
            androidx.core.view.j.m(this.f49687e, this.f49688f, ", powerCurveScale=", ", powerCurveRange=", sb3);
            sb3.append(")");
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$h;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "", "audioUrl", "audioFile", "Lkotlin/Function0;", "", "playFunc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f49691c;

        public h(String str, String str2, e23.a<Unit> aVar) {
            str.getClass();
            str2.getClass();
            aVar.getClass();
            this.f49689a = str;
            this.f49690b = str2;
            this.f49691c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f49689a.equals(hVar.f49689a) && this.f49690b.equals(hVar.f49690b) && this.f49691c.equals(hVar.f49691c);
        }

        public final int hashCode() {
            return this.f49691c.hashCode() + wr.g.j(this.f49689a.hashCode() * 31, 31, this.f49690b);
        }

        public final String toString() {
            return n23.j.i(p6.b.i("ShowRetryDownloadAudioNoteDialog(audioUrl=", this.f49689a, ", audioFile=", this.f49690b, ", playFunc="), this.f49691c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$i;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "Lm52/a;", "endConditionType", "<init>", "(Lm52/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m52.a f49692a;

        public i(m52.a aVar) {
            aVar.getClass();
            this.f49692a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f49692a == ((i) obj).f49692a;
        }

        public final int hashCode() {
            return this.f49692a.hashCode();
        }

        public final String toString() {
            return "ViewEndConditionTypeHelpText(endConditionType=" + this.f49692a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g$j;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/g;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f49693a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1665746518;
        }

        public final String toString() {
            return "ViewIntensityTargetHelpText";
        }
    }
}
