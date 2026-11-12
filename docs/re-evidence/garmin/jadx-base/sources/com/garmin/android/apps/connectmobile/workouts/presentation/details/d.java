package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.room.a0;
import c62.m2;
import com.garmin.android.apps.connectmobile.workouts.data.model.TrainingPlanSearchResultsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface d extends r52.a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/c;", "requestOption", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/c;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.details.c f48518a;

        public a(com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVar) {
            cVar.getClass();
            this.f48518a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f48518a == ((a) obj).f48518a;
        }

        public final int hashCode() {
            return this.f48518a.hashCode();
        }

        public final String toString() {
            return "AppRequest(requestOption=" + this.f48518a + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.details.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0946d implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0946d f48521a = new C0946d();

        private C0946d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0946d);
        }

        public final int hashCode() {
            return 1226823002;
        }

        public final String toString() {
            return "DeleteWorkout";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$e;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements d {
        static {
            new e();
        }

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1732356282;
        }

        public final String toString() {
            return "ErrorAction";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$f;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/TrainingPlanSearchResultsDTO;", "trainingPlanSearchResult", "", "timeInMillis", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/TrainingPlanSearchResultsDTO;J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrainingPlanSearchResultsDTO f48522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48523b;

        public f(TrainingPlanSearchResultsDTO trainingPlanSearchResultsDTO, long j8) {
            trainingPlanSearchResultsDTO.getClass();
            this.f48522a = trainingPlanSearchResultsDTO;
            this.f48523b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f48522a.equals(fVar.f48522a) && this.f48523b == fVar.f48523b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f48523b) + (this.f48522a.hashCode() * 31);
        }

        public final String toString() {
            return "FetchActiveTrainingPlan(trainingPlanSearchResult=" + this.f48522a + ", timeInMillis=" + this.f48523b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$h;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f48527a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -265647249;
        }

        public final String toString() {
            return "NoAction";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$i;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f48528a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 5146851;
        }

        public final String toString() {
            return "OpenActivityInProgress";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$j;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f48529a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -946455582;
        }

        public final String toString() {
            return "OpenDeviceTroubleshooting";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$k;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f48530a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1931994013;
        }

        public final String toString() {
            return "RefreshAfterWorkoutSaved";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$l;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f48531a = new l();

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1667879839;
        }

        public final String toString() {
            return "RemoveWorkout";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$m;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "deviceUnitId", "", "Ld62/i;", "workoutActivityProfiles", "<init>", "(JLjava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d62.i> f48533b;

        public m(long j8, List<d62.i> list) {
            list.getClass();
            this.f48532a = j8;
            this.f48533b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f48532a == mVar.f48532a && this.f48533b.equals(mVar.f48533b);
        }

        public final int hashCode() {
            return this.f48533b.hashCode() + (Long.hashCode(this.f48532a) * 31);
        }

        public final String toString() {
            return "SelectActivityTypeForWorkout(deviceUnitId=" + this.f48532a + ", workoutActivityProfiles=" + this.f48533b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$n;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "Lsd2/f;", "devices", "", "isMultiDevice", "<init>", "(Ljava/util/List;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<sd2.f> f48534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48535b;

        /* JADX WARN: Multi-variable type inference failed */
        public n(List<? extends sd2.f> list, boolean z14) {
            list.getClass();
            this.f48534a = list;
            this.f48535b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f48534a.equals(nVar.f48534a) && this.f48535b == nVar.f48535b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f48535b) + (this.f48534a.hashCode() * 31);
        }

        public final String toString() {
            return "SelectDeviceForWorkout(devices=" + this.f48534a + ", isMultiDevice=" + this.f48535b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$o;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f48536a = new o();

        private o() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 2042422901;
        }

        public final String toString() {
            return "SendAddWorkoutToCalendar";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$p;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f48537a = new p();

        private p() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1226852392;
        }

        public final String toString() {
            return "SendScheduleToDevice";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "Lm52/k;", "sportType", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/f0;", "featurePreferences", "<init>", "(Lm52/k;Lcom/garmin/android/apps/connectmobile/workouts/data/model/f0;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m52.k f48538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0 f48539b;

        public q(m52.k kVar, f0 f0Var) {
            kVar.getClass();
            f0Var.getClass();
            this.f48538a = kVar;
            this.f48539b = f0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f48538a == qVar.f48538a && this.f48539b.equals(qVar.f48539b);
        }

        public final int hashCode() {
            return this.f48539b.hashCode() + (this.f48538a.hashCode() * 31);
        }

        public final String toString() {
            return "SendWorkoutToDevice(sportType=" + this.f48538a + ", featurePreferences=" + this.f48539b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$r;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "audioUrl", "audioFile", "Lkotlin/Function0;", "", "playFunc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f48542c;

        public r(String str, String str2, e23.a<Unit> aVar) {
            str.getClass();
            str2.getClass();
            aVar.getClass();
            this.f48540a = str;
            this.f48541b = str2;
            this.f48542c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f48540a.equals(rVar.f48540a) && this.f48541b.equals(rVar.f48541b) && this.f48542c.equals(rVar.f48542c);
        }

        public final int hashCode() {
            return this.f48542c.hashCode() + wr.g.j(this.f48540a.hashCode() * 31, 31, this.f48541b);
        }

        public final String toString() {
            return n23.j.i(p6.b.i("ShowRetryDownloadAudioNoteDialog(audioUrl=", this.f48540a, ", audioFile=", this.f48541b, ", playFunc="), this.f48542c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$s;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f48543a = new s();

        private s() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 1837801340;
        }

        public final String toString() {
            return "ShowSaveMSNWorkoutProgressDialog";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$t;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "category", "name", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/m;", "Lkotlin/collections/ArrayList;", "exercises", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.m> f48546c;

        public t(String str, String str2, ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.m> arrayList) {
            str.getClass();
            str2.getClass();
            arrayList.getClass();
            this.f48544a = str;
            this.f48545b = str2;
            this.f48546c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.f48544a.equals(tVar.f48544a) && this.f48545b.equals(tVar.f48545b) && this.f48546c.equals(tVar.f48546c);
        }

        public final int hashCode() {
            return this.f48546c.hashCode() + wr.g.j(this.f48544a.hashCode() * 31, 31, this.f48545b);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("StartMSNWorkoutExerciseActivity(category=", this.f48544a, ", name=", this.f48545b, ", exercises=");
            sbI.append(this.f48546c);
            sbI.append(")");
            return sbI.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$u;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "deviceUnitId", "Lc62/m2;", "workoutSport", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;", "workoutType", "<init>", "(JLc62/m2;Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m2 f48548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z f48549c;

        public u(long j8, m2 m2Var, z zVar) {
            m2Var.getClass();
            zVar.getClass();
            this.f48547a = j8;
            this.f48548b = m2Var;
            this.f48549c = zVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f48547a == uVar.f48547a && this.f48548b.equals(uVar.f48548b) && this.f48549c.equals(uVar.f48549c);
        }

        public final int hashCode() {
            return this.f48549c.hashCode() + ((this.f48548b.hashCode() + (Long.hashCode(this.f48547a) * 31)) * 31);
        }

        public final String toString() {
            return "StartWorkout(deviceUnitId=" + this.f48547a + ", workoutSport=" + this.f48548b + ", workoutType=" + this.f48549c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$w;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "ownedMSNWorkoutId", "<init>", "(J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48551a;

        public w(long j8) {
            this.f48551a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f48551a == ((w) obj).f48551a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f48551a);
        }

        public final String toString() {
            return a0.f(this.f48551a, "ViewMultisportWorkoutCopy(ownedMSNWorkoutId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$x;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "ownedMSNWorkoutId", "<init>", "(J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48552a;

        public x(long j8) {
            this.f48552a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f48552a == ((x) obj).f48552a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f48552a);
        }

        public final String toString() {
            return a0.f(this.f48552a, "ViewMyMSNWorkoutCopy(ownedMSNWorkoutId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$y;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f48553a = new y();

        private y() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1945948420;
        }

        public final String toString() {
            return "WorkoutsPaywall";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "workoutDetails", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkoutDetailsDTO f48519a;

        public /* synthetic */ b(WorkoutDetailsDTO workoutDetailsDTO, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : workoutDetailsDTO);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f48519a, ((b) obj).f48519a);
        }

        public final int hashCode() {
            WorkoutDetailsDTO workoutDetailsDTO = this.f48519a;
            if (workoutDetailsDTO == null) {
                return 0;
            }
            return workoutDetailsDTO.hashCode();
        }

        public final String toString() {
            return "CopyWorkout(workoutDetails=" + this.f48519a + ")";
        }

        public b(WorkoutDetailsDTO workoutDetailsDTO) {
            this.f48519a = workoutDetailsDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "isSuccessful", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f48520a;

        public /* synthetic */ c(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f48520a == ((c) obj).f48520a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f48520a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("CreateWorkout(isSuccessful=", ")", this.f48520a);
        }

        public c(boolean z14) {
            this.f48520a = z14;
        }

        public c() {
            this(false, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$v;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "isSuccessful", "<init>", "(Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f48550a;

        public /* synthetic */ v(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f48550a == ((v) obj).f48550a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f48550a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateWorkout(isSuccessful=", ")", this.f48550a);
        }

        public v(boolean z14) {
            this.f48550a = z14;
        }

        public v() {
            this(false, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d$g;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/d;", "", "deviceUnitId", "", "sportId", "subSportId", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f48525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f48526c;

        public /* synthetic */ g(long j8, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(j8, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f48524a == gVar.f48524a && p005kotlin.jvm.internal.s.g(this.f48525b, gVar.f48525b) && p005kotlin.jvm.internal.s.g(this.f48526c, gVar.f48526c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f48524a) * 31;
            Integer num = this.f48525b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f48526c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "LoadWorkout(deviceUnitId=" + this.f48524a + ", sportId=" + this.f48525b + ", subSportId=" + this.f48526c + ")";
        }

        public g(long j8, Integer num, Integer num2) {
            this.f48524a = j8;
            this.f48525b = num;
            this.f48526c = num2;
        }
    }
}
