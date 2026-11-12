package vg2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Map;
import k23.p;
import lc.q0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lvg2/a;", "", "<init>", "()V", "a", "f", JWKParameterNames.RSA_EXPONENT, "g", "c", "h", "d", "b", "Lvg2/a$a;", "Lvg2/a$b;", "Lvg2/a$c;", "Lvg2/a$d;", "Lvg2/a$e;", "Lvg2/a$f;", "Lvg2/a$g;", "Lvg2/a$h;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: vg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg2/a$a;", "Lvg2/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class C3329a extends a {
        public static final C3329a INSTANCE = new C3329a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f178245a = m.a(n.PUBLICATION, new vd1.c(3));

        private C3329a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3329a);
        }

        public final int hashCode() {
            return -352921972;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<C3329a> serializer() {
            return (i63.c) f178245a.getValue();
        }

        public final String toString() {
            return "Dashboard";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg2/a$b;", "Lvg2/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends a {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f178246a = m.a(n.PUBLICATION, new vd1.c(4));

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1299017901;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f178246a.getValue();
        }

        public final String toString() {
            return "DistanceCalibration";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg2/a$c;", "Lvg2/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c extends a {
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f178247a = m.a(n.PUBLICATION, new vd1.c(5));

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1229339435;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) f178247a.getValue();
        }

        public final String toString() {
            return "EditWorkout";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg2/a$e;", "Lvg2/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e extends a {
        public static final e INSTANCE = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f178252a = m.a(n.PUBLICATION, new vd1.c(6));

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2088814924;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<e> serializer() {
            return (i63.c) f178252a.getValue();
        }

        public final String toString() {
            return "FullScreenBreathwork";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg2/a$g;", "Lvg2/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class g extends a {
        public static final g INSTANCE = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f178255a = m.a(n.PUBLICATION, new vd1.c(7));

        private g() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1172699999;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<g> serializer() {
            return (i63.c) f178255a.getValue();
        }

        public final String toString() {
            return "FullScreenMeditation";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvg2/a$h;", "Lvg2/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h extends a {
        public static final h INSTANCE = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f178256a = m.a(n.PUBLICATION, new vd1.c(8));

        private h() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1590996476;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<h> serializer() {
            return (i63.c) f178256a.getValue();
        }

        public final String toString() {
            return "SelectExercise";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lvg2/a$d;", "Lvg2/a;", "", "translatedName", "Lbg2/h;", "exerciseDetails", "<init>", "(Ljava/lang/String;Lbg2/h;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lbg2/h;Lm63/u1;)V", "Companion", "b", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Map<p, q0<bg2.h>> f178248c = t0.b(new o13.p(s0.c(bg2.h.class), new c(false)));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bg2.h f178250b;

        /* JADX INFO: renamed from: vg2.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/livesessionview/ui/navigation/LiveActivityRouting.ExerciseInformation.$serializer", "Lm63/e0;", "Lvg2/a$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C3330a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3330a f178251a;
            private static final k63.e descriptor;

            static {
                C3330a c3330a = new C3330a();
                f178251a = c3330a;
                m1 m1Var = new m1("com.garmin.android.livesessionview.ui.navigation.LiveActivityRouting.ExerciseInformation", c3330a, 2);
                m1Var.j("translatedName", false);
                m1Var.j("exerciseDetails", false);
                descriptor = m1Var;
            }

            private C3330a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{y1.f117048a, bg2.h.a.f17888a};
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
                bg2.h hVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                    } else {
                        if (iE != 1) {
                            hb.a.o(iE);
                            return null;
                        }
                        hVar = (bg2.h) cVarC.l(eVar2, 1, bg2.h.a.f17888a, hVar);
                        i15 |= 2;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, strR, hVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, dVar.f178249a);
                dVarC.e(eVar, 1, bg2.h.a.f17888a, dVar.f178250b);
                dVarC.b(eVar);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"vg2/a$d$c", "Llc/q0;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends q0<bg2.h> {
            public c(boolean z14) {
                super(z14);
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Parcelable, bg2.h] */
            /* JADX WARN: Type inference failed for: r3v3, types: [android.os.Parcelable, bg2.h] */
            @Override // lc.q0
            public final bg2.h a(Bundle bundle, String str) {
                bundle.getClass();
                str.getClass();
                return Build.VERSION.SDK_INT < 34 ? bundle.getParcelable(str) : (Parcelable) bundle.getParcelable(str, bg2.h.class);
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Parcelable, bg2.h] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final bg2.h h(String str) {
                str.getClass();
                n63.b.a aVar = n63.b.f123892d;
                aVar.getClass();
                return (Parcelable) aVar.c(bg2.h.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, bg2.h hVar) {
                bg2.h hVar2 = hVar;
                str.getClass();
                hVar2.getClass();
                bundle.putParcelable(str, hVar2);
            }

            @Override // lc.q0
            public final String f(bg2.h hVar) {
                bg2.h hVar2 = hVar;
                hVar2.getClass();
                n63.b.a aVar = n63.b.f123892d;
                aVar.getClass();
                String strEncode = Uri.encode(aVar.b(bg2.h.INSTANCE.serializer(), hVar2));
                strEncode.getClass();
                return strEncode;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ d(int i14, String str, bg2.h hVar, u1 u1Var) {
            j jVar = null;
            if (3 != (i14 & 3)) {
                k1.h(i14, 3, C3330a.f178251a.getF158591b());
                throw null;
            }
            super(jVar);
            this.f178249a = str;
            this.f178250b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f178249a, dVar.f178249a) && s.g(this.f178250b, dVar.f178250b);
        }

        public final int hashCode() {
            return this.f178250b.hashCode() + (this.f178249a.hashCode() * 31);
        }

        public final String toString() {
            return "ExerciseInformation(translatedName=" + this.f178249a + ", exerciseDetails=" + this.f178250b + ")";
        }

        /* JADX INFO: renamed from: vg2.a$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvg2/a$d$b;", "", "<init>", "()V", "Li63/c;", "Lvg2/a$d;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return C3330a.f178251a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, bg2.h hVar) {
            super(null);
            str.getClass();
            hVar.getClass();
            this.f178249a = str;
            this.f178250b = hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lvg2/a$f;", "Lvg2/a;", "", "chartTypeKey", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178253a;

        /* JADX INFO: renamed from: vg2.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/livesessionview/ui/navigation/LiveActivityRouting.FullScreenChart.$serializer", "Lm63/e0;", "Lvg2/a$f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C3331a implements e0<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3331a f178254a;
            private static final k63.e descriptor;

            static {
                C3331a c3331a = new C3331a();
                f178254a = c3331a;
                m1 m1Var = new m1("com.garmin.android.livesessionview.ui.navigation.LiveActivityRouting.FullScreenChart", c3331a, 1);
                m1Var.j("chartTypeKey", false);
                descriptor = m1Var;
            }

            private C3331a() {
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
                return new f(i15, strR, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                f fVar2 = (f) obj;
                fVar2.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, fVar2.f178253a);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ f(int i14, String str, u1 u1Var) {
            j jVar = null;
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, C3331a.f178254a.getF158591b());
                throw null;
            }
            super(jVar);
            this.f178253a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f178253a, ((f) obj).f178253a);
        }

        public final int hashCode() {
            return this.f178253a.hashCode();
        }

        public final String toString() {
            return am.j.m("FullScreenChart(chartTypeKey=", this.f178253a, ")");
        }

        /* JADX INFO: renamed from: vg2.a$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvg2/a$f$b;", "", "<init>", "()V", "Li63/c;", "Lvg2/a$f;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<f> serializer() {
                return C3331a.f178254a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            str.getClass();
            this.f178253a = str;
        }
    }

    private a() {
    }
}
