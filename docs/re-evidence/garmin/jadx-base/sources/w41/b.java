package w41;

import android.content.Intent;
import androidx.room.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw41/b$a;", "Lw41/b;", "", "wasPlanUpdated", "<init>", "(Z)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f181976a;

        public a(boolean z14) {
            this.f181976a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f181976a == ((a) obj).f181976a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f181976a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("NavigateBack(wasPlanUpdated=", ")", this.f181976a);
        }
    }

    /* JADX INFO: renamed from: w41.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw41/b$b;", "Lw41/b;", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3388b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f181977a;

        public C3388b(Intent intent) {
            intent.getClass();
            this.f181977a = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3388b) && this.f181977a.equals(((C3388b) obj).f181977a);
        }

        public final int hashCode() {
            return this.f181977a.hashCode();
        }

        public final String toString() {
            return "NavigateToEditCourse(intent=" + this.f181977a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw41/b$c;", "Lw41/b;", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f181978a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -956419815;
        }

        public final String toString() {
            return "NavigateToPaceIntensityHelp";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw41/b$d;", "Lw41/b;", "Ln51/b;", "route", "<init>", "(Ln51/b;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n51.b f181979a;

        public d(n51.b bVar) {
            bVar.getClass();
            this.f181979a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f181979a.equals(((d) obj).f181979a);
        }

        public final int hashCode() {
            return this.f181979a.hashCode();
        }

        public final String toString() {
            return "NavigateToPaceProRoute(route=" + this.f181979a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw41/b$e;", "Lw41/b;", "", "paceBandPk", "<init>", "(J)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f181980a;

        public e(long j8) {
            this.f181980a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f181980a == ((e) obj).f181980a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f181980a);
        }

        public final String toString() {
            return a0.f(this.f181980a, "NavigateToRelatedPaceProPlan(paceBandPk=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw41/b$f;", "Lw41/b;", "", "paceBandPk", "<init>", "(J)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f181981a;

        public f(long j8) {
            this.f181981a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f181981a == ((f) obj).f181981a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f181981a);
        }

        public final String toString() {
            return a0.f(this.f181981a, "NavigateToSendToDevice(paceBandPk=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw41/b$g;", "Lw41/b;", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f181982a = new g();

        private g() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -61851331;
        }

        public final String toString() {
            return "ShowBackConfirmationDialog";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw41/b$h;", "Lw41/b;", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f181983a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 743980807;
        }

        public final String toString() {
            return "ShowEventGoalsDialog";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw41/b$i;", "Lw41/b;", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f181984a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 332545854;
        }

        public final String toString() {
            return "ShowNewTimeAndPaceDialog";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw41/b$j;", "Lw41/b;", "", "message", "<init>", "(Ljava/lang/String;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f181985a;

        public j(String str) {
            str.getClass();
            this.f181985a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f181985a.equals(((j) obj).f181985a);
        }

        public final int hashCode() {
            return this.f181985a.hashCode();
        }

        public final String toString() {
            return am.j.m("ShowSnackbar(message=", this.f181985a, ")");
        }
    }
}
