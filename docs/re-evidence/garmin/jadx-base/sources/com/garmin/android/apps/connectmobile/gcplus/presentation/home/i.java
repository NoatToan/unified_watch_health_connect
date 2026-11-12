package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import ak0.u;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import dk0.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i;", "", "<init>", "()V", "d", "a", JWKParameterNames.RSA_EXPONENT, "c", "b", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$b;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$d;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$e;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a;", "initialDestination", "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a f35479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a aVar) {
            super(null);
            aVar.getClass();
            this.f35479a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f35479a, ((a) obj).f35479a);
        }

        public final int hashCode() {
            return this.f35479a.hashCode();
        }

        public final String toString() {
            return "ActivationOnly(initialDestination=" + this.f35479a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$b;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$d;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$d;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d f35480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.d dVar) {
            super(null);
            dVar.getClass();
            this.f35480a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f35480a == ((b) obj).f35480a;
        }

        public final int hashCode() {
            return this.f35480a.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.f35480a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "initialDestination", "Lak0/u;", "homeData", "Lbk0/d;", "educationData", "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;Lak0/u;Lbk0/d;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.c f35481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f35482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bk0.d f35483c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c cVar, u uVar, bk0.d dVar) {
            super(null);
            cVar.getClass();
            uVar.getClass();
            this.f35481a = cVar;
            this.f35482b = uVar;
            this.f35483c = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f35481a, cVar.f35481a) && s.g(this.f35482b, cVar.f35482b) && s.g(this.f35483c, cVar.f35483c);
        }

        public final int hashCode() {
            int iHashCode = (this.f35482b.hashCode() + (this.f35481a.hashCode() * 31)) * 31;
            bk0.d dVar = this.f35483c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "Home(initialDestination=" + this.f35481a + ", homeData=" + this.f35482b + ", educationData=" + this.f35483c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$d;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35484a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -148708454;
        }

        public final String toString() {
            return "NotSupported";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i$e;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/i;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "initialDestination", "Li53/c;", "Ldk0/g;", "promotedFeatures", "Lbk0/a;", "additionalFeatures", "Lyx2/i;", "subscriptions", "", "trialDuration", "", "priceDetailsText", "buttonText", "Ldk0/f;", "disclaimer", "Ldk0/m;", "planSelectionScreenData", "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;Li53/c;Li53/c;Li53/c;ILjava/lang/String;Ljava/lang/String;Ldk0/f;Ldk0/m;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.c f35485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i53.c<dk0.g> f35486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i53.c<bk0.a> f35487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i53.c<yx2.i> f35488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f35489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f35490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f35491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final dk0.f f35492h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final m f35493i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.garmin.android.apps.connectmobile.gcplus.presentation.home.c cVar, i53.c<dk0.g> cVar2, i53.c<bk0.a> cVar3, i53.c<yx2.i> cVar4, int i14, String str, String str2, dk0.f fVar, m mVar) {
            super(null);
            cVar.getClass();
            cVar2.getClass();
            cVar3.getClass();
            cVar4.getClass();
            str2.getClass();
            fVar.getClass();
            mVar.getClass();
            this.f35485a = cVar;
            this.f35486b = cVar2;
            this.f35487c = cVar3;
            this.f35488d = cVar4;
            this.f35489e = i14;
            this.f35490f = str;
            this.f35491g = str2;
            this.f35492h = fVar;
            this.f35493i = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f35485a, eVar.f35485a) && s.g(this.f35486b, eVar.f35486b) && s.g(this.f35487c, eVar.f35487c) && s.g(this.f35488d, eVar.f35488d) && this.f35489e == eVar.f35489e && s.g(this.f35490f, eVar.f35490f) && s.g(this.f35491g, eVar.f35491g) && s.g(this.f35492h, eVar.f35492h) && s.g(this.f35493i, eVar.f35493i);
        }

        public final int hashCode() {
            int iD = q2.d(this.f35489e, l2.a(this.f35488d, l2.a(this.f35487c, l2.a(this.f35486b, this.f35485a.hashCode() * 31, 31), 31), 31), 31);
            String str = this.f35490f;
            return this.f35493i.hashCode() + ((this.f35492h.hashCode() + wr.g.j((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f35491g)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Paywall(initialDestination=");
            sb3.append(this.f35485a);
            sb3.append(", promotedFeatures=");
            sb3.append(this.f35486b);
            sb3.append(", additionalFeatures=");
            q6.f.w(sb3, this.f35487c, ", subscriptions=", this.f35488d, ", trialDuration=");
            wr.g.t(this.f35489e, ", priceDetailsText=", this.f35490f, ", buttonText=", sb3);
            sb3.append(this.f35491g);
            sb3.append(", disclaimer=");
            sb3.append(this.f35492h);
            sb3.append(", planSelectionScreenData=");
            sb3.append(this.f35493i);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i() {
    }
}
