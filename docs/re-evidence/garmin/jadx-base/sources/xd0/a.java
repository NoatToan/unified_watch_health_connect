package xd0;

import androidx.room.a0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\f\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lxd0/a;", "", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "f", JWKParameterNames.RSA_EXPONENT, "a", "h", "b", IntegerTokenConverter.CONVERTER_KEY, "j", "c", "d", JWKParameterNames.OCT_KEY_VALUE, "l", "m", "g", "Lxd0/a$a;", "Lxd0/a$b;", "Lxd0/a$c;", "Lxd0/a$d;", "Lxd0/a$e;", "Lxd0/a$f;", "Lxd0/a$h;", "Lxd0/a$i;", "Lxd0/a$j;", "Lxd0/a$k;", "Lxd0/a$l;", "Lxd0/a$m;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public abstract class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f189991a = o13.m.a(n.PUBLICATION, new xa1.j(10));

    /* JADX INFO: renamed from: xd0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$a;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class C3539a extends a {
        public static final C3539a INSTANCE = new C3539a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f189992b = o13.m.a(n.PUBLICATION, new xa1.j(11));

        private C3539a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3539a);
        }

        public final int hashCode() {
            return 1305535516;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<C3539a> serializer() {
            return (i63.c) f189992b.getValue();
        }

        public final String toString() {
            return "AddDog";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$b;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends a {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f189993b = o13.m.a(n.PUBLICATION, new xa1.j(12));

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1864549807;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f189993b.getValue();
        }

        public final String toString() {
            return "AddDogProfilePicture";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$c;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class c extends a {
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f189994b = o13.m.a(n.PUBLICATION, new xa1.j(13));

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1054484914;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<c> serializer() {
            return (i63.c) f189994b.getValue();
        }

        public final String toString() {
            return "AddPrimaryBreed";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$d;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d extends a {
        public static final d INSTANCE = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f189995b = o13.m.a(n.PUBLICATION, new xa1.j(14));

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 975985395;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) f189995b.getValue();
        }

        public final String toString() {
            return "AddSecondaryBreeds";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$e;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e extends a {
        public static final e INSTANCE = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f189996b = o13.m.a(n.PUBLICATION, new xa1.j(15));

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 280897577;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<e> serializer() {
            return (i63.c) f189996b.getValue();
        }

        public final String toString() {
            return "AllDogActivities";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$f;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f extends a {
        public static final f INSTANCE = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f189997b = o13.m.a(n.PUBLICATION, new xa1.j(16));

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2053316823;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<f> serializer() {
            return (i63.c) f189997b.getValue();
        }

        public final String toString() {
            return "AllDogs";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$k;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class k extends a {
        public static final k INSTANCE = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f190004b = o13.m.a(n.PUBLICATION, new xa1.j(17));

        private k() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1911722429;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<k> serializer() {
            return (i63.c) f190004b.getValue();
        }

        public final String toString() {
            return "EditPrimaryBreed";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxd0/a$l;", "Lxd0/a;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class l extends a {
        public static final l INSTANCE = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f190005b = o13.m.a(n.PUBLICATION, new xa1.j(18));

        private l() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1063252744;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<l> serializer() {
            return (i63.c) f190005b.getValue();
        }

        public final String toString() {
            return "EditSecondaryBreeds";
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lxd0/a$h;", "Lxd0/a;", "", "dogId", "<init>", "(J)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLm63/u1;)V", "Companion", "a", "b", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class h extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f189998b;

        /* JADX INFO: renamed from: xd0.a$h$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/dogs/presentation/navigation/DogsRoute.DogProfile.$serializer", "Lm63/e0;", "Lxd0/a$h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C3540a implements e0<h> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3540a f189999a;
            private static final k63.e descriptor;

            static {
                C3540a c3540a = new C3540a();
                f189999a = c3540a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.dogs.presentation.navigation.DogsRoute.DogProfile", c3540a, 1);
                m1Var.j("dogId", false);
                descriptor = m1Var;
            }

            private C3540a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{v0.f117027a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                long jW = 0;
                boolean z14 = true;
                int i15 = 0;
                while (true) {
                    u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new h(i15, jW, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        jW = cVarC.w(eVar2, 0);
                        i15 = 1;
                    }
                }
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                h hVar = (h) obj;
                hVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, hVar.f189998b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(int i14, long j8, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, C3540a.f189999a.getF158591b());
                throw null;
            }
            this.f189998b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f189998b == ((h) obj).f189998b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f189998b);
        }

        public final String toString() {
            return a0.f(this.f189998b, "DogProfile(dogId=", ")");
        }

        /* JADX INFO: renamed from: xd0.a$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd0/a$h$b;", "", "<init>", "()V", "Li63/c;", "Lxd0/a$h;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<h> serializer() {
                return C3540a.f189999a;
            }

            private Companion() {
            }
        }

        public h(long j8) {
            super(null);
            this.f189998b = j8;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lxd0/a$i;", "Lxd0/a;", "", "dogId", "<init>", "(J)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLm63/u1;)V", "Companion", "a", "b", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class i extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f190000b;

        /* JADX INFO: renamed from: xd0.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/dogs/presentation/navigation/DogsRoute.EditDog.$serializer", "Lm63/e0;", "Lxd0/a$i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C3541a implements e0<i> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3541a f190001a;
            private static final k63.e descriptor;

            static {
                C3541a c3541a = new C3541a();
                f190001a = c3541a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.dogs.presentation.navigation.DogsRoute.EditDog", c3541a, 1);
                m1Var.j("dogId", false);
                descriptor = m1Var;
            }

            private C3541a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{v0.f117027a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                long jW = 0;
                boolean z14 = true;
                int i15 = 0;
                while (true) {
                    u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new i(i15, jW, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        jW = cVarC.w(eVar2, 0);
                        i15 = 1;
                    }
                }
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
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, iVar.f190000b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ i(int i14, long j8, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, C3541a.f190001a.getF158591b());
                throw null;
            }
            this.f190000b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f190000b == ((i) obj).f190000b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f190000b);
        }

        public final String toString() {
            return a0.f(this.f190000b, "EditDog(dogId=", ")");
        }

        /* JADX INFO: renamed from: xd0.a$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd0/a$i$b;", "", "<init>", "()V", "Li63/c;", "Lxd0/a$i;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<i> serializer() {
                return C3541a.f190001a;
            }

            private Companion() {
            }
        }

        public i(long j8) {
            super(null);
            this.f190000b = j8;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lxd0/a$j;", "Lxd0/a;", "", "dogId", "<init>", "(J)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLm63/u1;)V", "Companion", "a", "b", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class j extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f190002b;

        /* JADX INFO: renamed from: xd0.a$j$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/dogs/presentation/navigation/DogsRoute.EditDogProfilePicture.$serializer", "Lm63/e0;", "Lxd0/a$j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C3542a implements e0<j> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3542a f190003a;
            private static final k63.e descriptor;

            static {
                C3542a c3542a = new C3542a();
                f190003a = c3542a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.dogs.presentation.navigation.DogsRoute.EditDogProfilePicture", c3542a, 1);
                m1Var.j("dogId", false);
                descriptor = m1Var;
            }

            private C3542a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{v0.f117027a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                long jW = 0;
                boolean z14 = true;
                int i15 = 0;
                while (true) {
                    u1 u1Var = null;
                    if (!z14) {
                        cVarC.b(eVar2);
                        return new j(i15, jW, u1Var);
                    }
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        jW = cVarC.w(eVar2, 0);
                        i15 = 1;
                    }
                }
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                j jVar = (j) obj;
                jVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.z(eVar, 0, jVar.f190002b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ j(int i14, long j8, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, C3542a.f190003a.getF158591b());
                throw null;
            }
            this.f190002b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f190002b == ((j) obj).f190002b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f190002b);
        }

        public final String toString() {
            return a0.f(this.f190002b, "EditDogProfilePicture(dogId=", ")");
        }

        /* JADX INFO: renamed from: xd0.a$j$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd0/a$j$b;", "", "<init>", "()V", "Li63/c;", "Lxd0/a$j;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<j> serializer() {
                return C3542a.f190003a;
            }

            private Companion() {
            }
        }

        public j(long j8) {
            super(null);
            this.f190002b = j8;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0002\r\u000eB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lxd0/a$m;", "Lxd0/a;", "", "Lro0/i;", "extras", "<init>", "(Lro0/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILro0/i;Lm63/u1;)V", "Companion", "a", "b", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public static final /* data */ class m extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ro0.i f190006b;

        /* JADX INFO: renamed from: xd0.a$m$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/dogs/presentation/navigation/DogsRoute.Help.$serializer", "Lm63/e0;", "Lxd0/a$m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class C3543a implements e0<m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3543a f190007a;
            private static final k63.e descriptor;

            static {
                C3543a c3543a = new C3543a();
                f190007a = c3543a;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.dogs.presentation.navigation.DogsRoute.Help", c3543a, 1);
                m1Var.j("extras", true);
                descriptor = m1Var;
            }

            private C3543a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                return new i63.c[]{ro0.i.a.f153770a};
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
                ro0.i iVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else {
                        if (iE != 0) {
                            hb.a.o(iE);
                            return null;
                        }
                        iVar = (ro0.i) cVarC.l(eVar2, 0, ro0.i.a.f153770a, iVar);
                        i15 = 1;
                    }
                }
                cVarC.b(eVar2);
                return new m(i15, iVar, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                m mVar = (m) obj;
                mVar.getClass();
                ro0.i iVar = mVar.f190006b;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || !s.g(iVar, new ro0.i(ro0.l.DOGS, (String) null, 2, (p005kotlin.jvm.internal.j) null))) {
                    dVarC.e(eVar, 0, ro0.i.a.f153770a, iVar);
                }
                dVarC.b(eVar);
            }
        }

        static {
            ro0.i.Companion companion = ro0.i.INSTANCE;
        }

        public /* synthetic */ m(int i14, ro0.i iVar, u1 u1Var) {
            super(i14, u1Var);
            if ((i14 & 1) == 0) {
                this.f190006b = new ro0.i(ro0.l.DOGS, (String) null, 2, (p005kotlin.jvm.internal.j) null);
            } else {
                this.f190006b = iVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && s.g(this.f190006b, ((m) obj).f190006b);
        }

        public final int hashCode() {
            return this.f190006b.hashCode();
        }

        public final String toString() {
            return "Help(extras=" + this.f190006b + ")";
        }

        /* JADX INFO: renamed from: xd0.a$m$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd0/a$m$b;", "", "<init>", "()V", "Li63/c;", "Lxd0/a$m;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public final i63.c<m> serializer() {
                return C3543a.f190007a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m() {
            this((ro0.i) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ro0.i iVar) {
            super(null);
            iVar.getClass();
            this.f190006b = iVar;
        }

        public /* synthetic */ m(ro0.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? new ro0.i(ro0.l.DOGS, (String) null, 2, (p005kotlin.jvm.internal.j) null) : iVar);
        }
    }

    /* JADX INFO: renamed from: xd0.a$g, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxd0/a$g;", "", "<init>", "()V", "Li63/c;", "Lxd0/a;", "serializer", "()Li63/c;", "gcm-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<a> serializer() {
            return (i63.c) a.f189991a.getValue();
        }

        private Companion() {
        }
    }

    private a() {
    }

    public /* synthetic */ a(int i14, u1 u1Var) {
    }
}
