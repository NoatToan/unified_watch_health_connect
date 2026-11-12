package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import ak0.t;
import c80.q;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \t2\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\n\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", JWKParameterNames.OCT_KEY_VALUE, "l", "a", IntegerTokenConverter.CONVERTER_KEY, "h", "f", JWKParameterNames.RSA_EXPONENT, "g", "d", "c", "j", "b", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$e;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$f;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$g;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$h;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$j;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$k;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$l;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public abstract class c implements sc.j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f35378a = m.a(n.PUBLICATION, new a03.d(23));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$d;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        API,
        NO_PAIRED_DEVICE,
        UNAVAILABLE
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$f;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f extends c {
        public static final f INSTANCE = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f35392b = m.a(n.PUBLICATION, new a03.d(25));

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1408264081;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<f> serializer() {
            return (i63.c) f35392b.getValue();
        }

        public final String toString() {
            return "ExclusiveOffersScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$h;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h extends c {
        public static final h INSTANCE = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f35396b = m.a(n.PUBLICATION, new a03.d(27));

        private h() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1815389173;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<h> serializer() {
            return (i63.c) f35396b.getValue();
        }

        public final String toString() {
            return "FeatureSettingsScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$j;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j extends c {
        public static final j INSTANCE = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f35403b = m.a(n.PUBLICATION, new a03.d(29));

        private j() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -604391381;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<j> serializer() {
            return (i63.c) f35403b.getValue();
        }

        public final String toString() {
            return "NotSupported";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$k;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k extends c {
        public static final k INSTANCE = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f35404b = m.a(n.PUBLICATION, new t(0));

        private k() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 507866734;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<k> serializer() {
            return (i63.c) f35404b.getValue();
        }

        public final String toString() {
            return "PaywallScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$l;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l extends c {
        public static final l INSTANCE = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f35405b = m.a(n.PUBLICATION, new t(1));

        private l() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -2109220961;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<l> serializer() {
            return (i63.c) f35405b.getValue();
        }

        public final String toString() {
            return "PlanSelectionScreen";
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0002\u000f\u0010B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "", "activationComplete", "notificationsEnabled", "activeAfterDeepLink", "<init>", "(ZZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZZZLm63/u1;)V", "Companion", "a", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f35379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35381d;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeDestination.ActivationScreen.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C0612a implements e0<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0612a f35382a;
            private static final k63.e descriptor;

            static {
                C0612a c0612a = new C0612a();
                f35382a = c0612a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.ActivationScreen", c0612a, 3);
                m1Var.j("activationComplete", false);
                m1Var.j("notificationsEnabled", false);
                m1Var.j("activeAfterDeepLink", true);
                descriptor = m1Var;
            }

            private C0612a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m63.g gVar = m63.g.f116948a;
                return new i63.c[]{gVar, gVar, gVar};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                boolean zG = false;
                boolean zG2 = false;
                boolean zG3 = false;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        zG = cVarC.g(eVar2, 0);
                        i15 |= 1;
                    } else if (iE == 1) {
                        zG2 = cVarC.g(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        zG3 = cVarC.g(eVar2, 2);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new a(i15, zG, zG2, zG3, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                boolean z14 = aVar.f35379b;
                boolean z15 = aVar.f35381d;
                dVarC.n(eVar, 0, z14);
                dVarC.n(eVar, 1, aVar.f35380c);
                if (dVarC.C(eVar) || z15) {
                    dVarC.n(eVar, 2, z15);
                }
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i14, boolean z14, boolean z15, boolean z16, u1 u1Var) {
            super(i14, u1Var);
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, C0612a.f35382a.getF158591b());
                throw null;
            }
            this.f35379b = z14;
            this.f35380c = z15;
            if ((i14 & 4) == 0) {
                this.f35381d = false;
            } else {
                this.f35381d = z16;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35379b == aVar.f35379b && this.f35380c == aVar.f35380c && this.f35381d == aVar.f35381d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f35381d) + q6.f.g(Boolean.hashCode(this.f35379b) * 31, 31, this.f35380c);
        }

        public final String toString() {
            return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("ActivationScreen(activationComplete=", ", notificationsEnabled=", ", activeAfterDeepLink=", this.f35379b, this.f35380c), this.f35381d, ")");
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$a;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<a> serializer() {
                return C0612a.f35382a;
            }

            private Companion() {
            }
        }

        public a(boolean z14, boolean z15, boolean z16) {
            super(null);
            this.f35379b = z14;
            this.f35380c = z15;
            this.f35381d = z16;
        }

        public /* synthetic */ a(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
            this(z14, z15, (i14 & 4) != 0 ? false : z16);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$d;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$d;Lm63/u1;)V", "Companion", "a", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class C0613c extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35383c = {m.a(n.PUBLICATION, new a03.d(24))};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f35384b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$c$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeDestination.Error.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<C0613c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35385a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f35385a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.Error", aVar, 1);
                m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{C0613c.f35383c[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = C0613c.f35383c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                d dVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        dVar = (d) cVarC.l(eVar2, 0, lVarArr[0].getValue(), dVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new C0613c(i15, dVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                C0613c c0613c = (C0613c) obj;
                c0613c.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, C0613c.f35383c[0].getValue(), c0613c.f35384b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0613c(int i14, d dVar, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35385a.getF158591b());
                throw null;
            }
            this.f35384b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0613c) && this.f35384b == ((C0613c) obj).f35384b;
        }

        public final int hashCode() {
            return this.f35384b.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.f35384b + ")";
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$c$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<C0613c> serializer() {
                return a.f35385a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0613c(d dVar) {
            super(null);
            dVar.getClass();
            this.f35384b = dVar;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$e;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35390b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeDestination.ExclusiveOfferDetailsScreen.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35391a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f35391a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.ExclusiveOfferDetailsScreen", aVar, 1);
                m1Var.j(TtmlNode.ATTR_ID, false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{y1.f117048a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                String strR = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR = cVarC.r(eVar2, 0);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new e(i15, strR, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.d dVarC = fVar.c(eVar2);
                dVarC.k(eVar2, 0, eVar.f35390b);
                dVarC.b(eVar2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(int i14, String str, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35391a.getF158591b());
                throw null;
            }
            this.f35390b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && s.g(this.f35390b, ((e) obj).f35390b);
        }

        public final int hashCode() {
            return this.f35390b.hashCode();
        }

        public final String toString() {
            return am.j.m("ExclusiveOfferDetailsScreen(id=", this.f35390b, ")");
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$e$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$e;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<e> serializer() {
                return a.f35391a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            str.getClass();
            this.f35390b = str;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$g;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "Lc80/q;", "feature", "<init>", "(Lc80/q;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/q;Lm63/u1;)V", "Companion", "a", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35393c = {m.a(n.PUBLICATION, new a03.d(26))};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f35394b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeDestination.FeatureEducationScreen.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35395a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f35395a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.FeatureEducationScreen", aVar, 1);
                m1Var.j("feature", false);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{g.f35393c[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = g.f35393c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                q qVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        qVar = (q) cVarC.l(eVar2, 0, lVarArr[0].getValue(), qVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new g(i15, qVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                g gVar = (g) obj;
                gVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.e(eVar, 0, g.f35393c[0].getValue(), gVar.f35394b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(int i14, q qVar, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f35395a.getF158591b());
                throw null;
            }
            this.f35394b = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f35394b == ((g) obj).f35394b;
        }

        public final int hashCode() {
            return this.f35394b.hashCode();
        }

        public final String toString() {
            return "FeatureEducationScreen(feature=" + this.f35394b + ")";
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$g$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$g;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<g> serializer() {
                return a.f35395a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q qVar) {
            super(null);
            qVar.getClass();
            this.f35394b = qVar;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0003\r\u000e\u000fB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "Lsc/j;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i$c;", "initialTab", "<init>", "(Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i$c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i$c;Lm63/u1;)V", "Companion", "c", "a", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i extends c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o13.l<i63.c<Object>>[] f35397c = {m.a(n.PUBLICATION, new a03.d(28))};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EnumC0614c f35398b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeDestination.HomeScreen.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35399a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f35399a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeDestination.HomeScreen", aVar, 1);
                m1Var.j("initialTab", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{i.f35397c[0].getValue()};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                o13.l<i63.c<Object>>[] lVarArr = i.f35397c;
                int i14 = l63.c.f110557a;
                u1 u1Var = null;
                boolean z14 = true;
                int i15 = 0;
                EnumC0614c enumC0614c = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        enumC0614c = (EnumC0614c) cVarC.l(eVar2, 0, lVarArr[0].getValue(), enumC0614c);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new i(i15, enumC0614c, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                i iVar = (i) obj;
                iVar.getClass();
                EnumC0614c enumC0614c = iVar.f35398b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                o13.l<i63.c<Object>>[] lVarArr = i.f35397c;
                if (dVarC.C(eVar) || enumC0614c != EnumC0614c.EDUCATION) {
                    dVarC.e(eVar, 0, lVarArr[0].getValue(), enumC0614c);
                }
                dVarC.b(eVar);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$i$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum EnumC0614c {
            EDUCATION,
            SETTINGS
        }

        public /* synthetic */ i(int i14, EnumC0614c enumC0614c, u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f35398b = EnumC0614c.EDUCATION;
            } else {
                this.f35398b = enumC0614c;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f35398b == ((i) obj).f35398b;
        }

        public final int hashCode() {
            return this.f35398b.hashCode();
        }

        public final String toString() {
            return "HomeScreen(initialTab=" + this.f35398b + ")";
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$i;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return a.f35399a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i() {
            this((EnumC0614c) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EnumC0614c enumC0614c) {
            super(null);
            enumC0614c.getClass();
            this.f35398b = enumC0614c;
        }

        public /* synthetic */ i(EnumC0614c enumC0614c, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? EnumC0614c.EDUCATION : enumC0614c);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/c;", "serializer", "()Li63/c;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) c.f35378a.getValue();
        }

        private Companion() {
        }
    }

    private c() {
    }

    public /* synthetic */ c(int i14, u1 u1Var) {
    }
}
