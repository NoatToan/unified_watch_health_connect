package ti2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \t2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lti2/j;", "", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "a", "b", "f", "d", JWKParameterNames.RSA_EXPONENT, "c", "Lti2/j$a;", "Lti2/j$b;", "Lti2/j$d;", "Lti2/j$e;", "Lti2/j$f;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@n63.f(discriminator = "eventType")
@i63.h
public abstract class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f164629a = m.a(n.PUBLICATION, new ta0.g(14));

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lti2/j$a;", "Lti2/j;", "Lti2/k;", "eventType", "", "flowName", "logMessage", "Lti2/d;", "data", "<init>", "(Lti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/d;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h
    public static final /* data */ class a extends j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final l<i63.c<Object>>[] f164630f = {m.a(n.PUBLICATION, new ta0.g(15)), null, null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f164631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f164633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ti2.d f164634e;

        /* JADX INFO: renamed from: ti2.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/WebMessageDTO.ChildAccountMessageDTO.$serializer", "Lm63/e0;", "Lti2/j$a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @o13.e
        public /* synthetic */ class C3089a implements e0<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3089a f164635a;
            private static final k63.e descriptor;

            /* JADX INFO: renamed from: ti2.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class C3090a implements n63.f {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f164636c;

                public C3090a(String str) {
                    str.getClass();
                    this.f164636c = str;
                }

                @Override // java.lang.annotation.Annotation
                public final /* synthetic */ Class annotationType() {
                    return n63.f.class;
                }

                @Override // n63.f
                public final /* synthetic */ String discriminator() {
                    return this.f164636c;
                }

                @Override // java.lang.annotation.Annotation
                public final boolean equals(Object obj) {
                    return (obj instanceof n63.f) && this.f164636c.equals(((n63.f) obj).discriminator());
                }

                @Override // java.lang.annotation.Annotation
                public final int hashCode() {
                    return this.f164636c.hashCode() ^ 707790692;
                }

                @Override // java.lang.annotation.Annotation
                public final String toString() {
                    return am.j.m("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.f164636c, ")");
                }
            }

            static {
                C3089a c3089a = new C3089a();
                f164635a = c3089a;
                m1 m1Var = new m1("CHILD_ACCOUNT_REQUEST_COMPLETED", c3089a, 4);
                m1Var.j("eventType", false);
                m1Var.j("flowName", false);
                m1Var.j("logMessage", false);
                m1Var.j("data", false);
                m1Var.k(new C3090a("eventType"));
                descriptor = m1Var;
            }

            private C3089a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{j63.a.d(a.f164630f[0].getValue()), y1Var, y1Var, ti2.d.a.f164615a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                l<i63.c<Object>>[] lVarArr = a.f164630f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                k kVar = null;
                String strR = null;
                String strR2 = null;
                ti2.d dVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        kVar = (k) cVarC.v(eVar2, 0, lVarArr[0].getValue(), kVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        dVar = (ti2.d) cVarC.l(eVar2, 3, ti2.d.a.f164615a, dVar);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new a(i15, kVar, strR, strR2, dVar, null);
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
                dVarC.d(eVar, 0, a.f164630f[0].getValue(), aVar.f164631b);
                dVarC.k(eVar, 1, aVar.f164632c);
                dVarC.k(eVar, 2, aVar.f164633d);
                dVarC.e(eVar, 3, ti2.d.a.f164615a, aVar.f164634e);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i14, k kVar, String str, String str2, ti2.d dVar, u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                k1.h(i14, 15, C3089a.f164635a.getF158591b());
                throw null;
            }
            this.f164631b = kVar;
            this.f164632c = str;
            this.f164633d = str2;
            this.f164634e = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f164631b == aVar.f164631b && s.g(this.f164632c, aVar.f164632c) && s.g(this.f164633d, aVar.f164633d) && s.g(this.f164634e, aVar.f164634e);
        }

        public final int hashCode() {
            k kVar = this.f164631b;
            return this.f164634e.f164614a.hashCode() + wr.g.j(wr.g.j((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f164632c), 31, this.f164633d);
        }

        public final String toString() {
            return "ChildAccountMessageDTO(eventType=" + this.f164631b + ", flowName=" + this.f164632c + ", logMessage=" + this.f164633d + ", data=" + this.f164634e + ")";
        }

        /* JADX INFO: renamed from: ti2.j$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/j$a$b;", "", "<init>", "()V", "Li63/c;", "Lti2/j$a;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<a> serializer() {
                return C3089a.f164635a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, String str, String str2, ti2.d dVar) {
            super(null);
            str.getClass();
            str2.getClass();
            dVar.getClass();
            this.f164631b = kVar;
            this.f164632c = str;
            this.f164633d = str2;
            this.f164634e = dVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lti2/j$b;", "Lti2/j;", "Lti2/k;", "eventType", "", "flowName", "logMessage", "Lti2/f;", "data", "<init>", "(Lti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/f;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h
    public static final /* data */ class b extends j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final l<i63.c<Object>>[] f164637f = {m.a(n.PUBLICATION, new ta0.g(16)), null, null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f164638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f164640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ti2.f f164641e;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/WebMessageDTO.CommunicationMessageDTO.$serializer", "Lm63/e0;", "Lti2/j$b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @o13.e
        public /* synthetic */ class a implements e0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f164642a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f164642a = aVar;
                m1 m1Var = new m1("COMMUNICATION", aVar, 4);
                m1Var.j("eventType", false);
                m1Var.j("flowName", false);
                m1Var.j("logMessage", false);
                m1Var.j("data", false);
                m1Var.k(new a.C3089a.C3090a("eventType"));
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{j63.a.d(b.f164637f[0].getValue()), y1Var, y1Var, ti2.f.a.f164622a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                l<i63.c<Object>>[] lVarArr = b.f164637f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                k kVar = null;
                String strR = null;
                String strR2 = null;
                ti2.f fVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        kVar = (k) cVarC.v(eVar2, 0, lVarArr[0].getValue(), kVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        fVar = (ti2.f) cVarC.l(eVar2, 3, ti2.f.a.f164622a, fVar);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new b(i15, kVar, strR, strR2, fVar, null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.d(eVar, 0, b.f164637f[0].getValue(), bVar.f164638b);
                dVarC.k(eVar, 1, bVar.f164639c);
                dVarC.k(eVar, 2, bVar.f164640d);
                dVarC.e(eVar, 3, ti2.f.a.f164622a, bVar.f164641e);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i14, k kVar, String str, String str2, ti2.f fVar, u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                k1.h(i14, 15, a.f164642a.getF158591b());
                throw null;
            }
            this.f164638b = kVar;
            this.f164639c = str;
            this.f164640d = str2;
            this.f164641e = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f164638b == bVar.f164638b && s.g(this.f164639c, bVar.f164639c) && s.g(this.f164640d, bVar.f164640d) && s.g(this.f164641e, bVar.f164641e);
        }

        public final int hashCode() {
            k kVar = this.f164638b;
            return this.f164641e.f164621a.hashCode() + wr.g.j(wr.g.j((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f164639c), 31, this.f164640d);
        }

        public final String toString() {
            return "CommunicationMessageDTO(eventType=" + this.f164638b + ", flowName=" + this.f164639c + ", logMessage=" + this.f164640d + ", data=" + this.f164641e + ")";
        }

        /* JADX INFO: renamed from: ti2.j$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/j$b$b;", "", "<init>", "()V", "Li63/c;", "Lti2/j$b;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<b> serializer() {
                return a.f164642a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, String str, String str2, ti2.f fVar) {
            super(null);
            str.getClass();
            str2.getClass();
            fVar.getClass();
            this.f164638b = kVar;
            this.f164639c = str;
            this.f164640d = str2;
            this.f164641e = fVar;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lti2/j$d;", "Lti2/j;", "Lti2/k;", "eventType", "", "flowName", "logMessage", "Lti2/g;", "data", "<init>", "(Lti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/g;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/g;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h
    public static final /* data */ class d extends j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final l<i63.c<Object>>[] f164643f = {m.a(n.PUBLICATION, new ta0.g(17)), null, null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f164644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f164646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g f164647e;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/WebMessageDTO.ExternalLinkDTO.$serializer", "Lm63/e0;", "Lti2/j$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @o13.e
        public /* synthetic */ class a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f164648a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f164648a = aVar;
                m1 m1Var = new m1("EXTERNAL_LINK", aVar, 4);
                m1Var.j("eventType", false);
                m1Var.j("flowName", false);
                m1Var.j("logMessage", false);
                m1Var.j("data", false);
                m1Var.k(new a.C3089a.C3090a("eventType"));
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{j63.a.d(d.f164643f[0].getValue()), y1Var, y1Var, g.a.f164624a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                l<i63.c<Object>>[] lVarArr = d.f164643f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                k kVar = null;
                String strR = null;
                String strR2 = null;
                g gVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        kVar = (k) cVarC.v(eVar2, 0, lVarArr[0].getValue(), kVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        gVar = (g) cVarC.l(eVar2, 3, g.a.f164624a, gVar);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, kVar, strR, strR2, gVar, null);
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
                dVarC.d(eVar, 0, d.f164643f[0].getValue(), dVar.f164644b);
                dVarC.k(eVar, 1, dVar.f164645c);
                dVarC.k(eVar, 2, dVar.f164646d);
                dVarC.e(eVar, 3, g.a.f164624a, dVar.f164647e);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i14, k kVar, String str, String str2, g gVar, u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                k1.h(i14, 15, a.f164648a.getF158591b());
                throw null;
            }
            this.f164644b = kVar;
            this.f164645c = str;
            this.f164646d = str2;
            this.f164647e = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f164644b == dVar.f164644b && s.g(this.f164645c, dVar.f164645c) && s.g(this.f164646d, dVar.f164646d) && s.g(this.f164647e, dVar.f164647e);
        }

        public final int hashCode() {
            k kVar = this.f164644b;
            return this.f164647e.f164623a.hashCode() + wr.g.j(wr.g.j((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f164645c), 31, this.f164646d);
        }

        public final String toString() {
            return "ExternalLinkDTO(eventType=" + this.f164644b + ", flowName=" + this.f164645c + ", logMessage=" + this.f164646d + ", data=" + this.f164647e + ")";
        }

        /* JADX INFO: renamed from: ti2.j$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/j$d$b;", "", "<init>", "()V", "Li63/c;", "Lti2/j$d;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<d> serializer() {
                return a.f164648a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar, String str, String str2, g gVar) {
            super(null);
            str.getClass();
            str2.getClass();
            gVar.getClass();
            this.f164644b = kVar;
            this.f164645c = str;
            this.f164646d = str2;
            this.f164647e = gVar;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lti2/j$e;", "Lti2/j;", "Lti2/k;", "eventType", "", "flowName", "logMessage", "<init>", "(Lti2/k;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/k;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h
    public static final /* data */ class e extends j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final l<i63.c<Object>>[] f164649e = {m.a(n.PUBLICATION, new ta0.g(18)), null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f164650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f164652d;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/WebMessageDTO.MessageDTO.$serializer", "Lm63/e0;", "Lti2/j$e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @o13.e
        public /* synthetic */ class a implements e0<e> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f164653a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f164653a = aVar;
                m1 m1Var = new m1("com.garmin.auth.cmc.data.model.WebMessageDTO.MessageDTO", aVar, 3);
                m1Var.j("eventType", true);
                m1Var.j("flowName", false);
                m1Var.j("logMessage", false);
                m1Var.k(new a.C3089a.C3090a("eventType"));
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{j63.a.d(e.f164649e[0].getValue()), y1Var, y1Var};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                l<i63.c<Object>>[] lVarArr = e.f164649e;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                k kVar = null;
                String strR = null;
                String strR2 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        kVar = (k) cVarC.v(eVar2, 0, lVarArr[0].getValue(), kVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new e(i15, kVar, strR, strR2, (u1) null);
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
                k kVar = eVar.f164650b;
                k63.e eVar2 = descriptor;
                l63.d dVarC = fVar.c(eVar2);
                l<i63.c<Object>>[] lVarArr = e.f164649e;
                if (dVarC.C(eVar2) || kVar != k.UNKNOWN_EVENT_TYPE) {
                    dVarC.d(eVar2, 0, lVarArr[0].getValue(), kVar);
                }
                dVarC.k(eVar2, 1, eVar.f164651c);
                dVarC.k(eVar2, 2, eVar.f164652d);
                dVarC.b(eVar2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(int i14, k kVar, String str, String str2, u1 u1Var) {
            super(i14, u1Var);
            if (6 != (i14 & 6)) {
                k1.h(i14, 6, a.f164653a.getF158591b());
                throw null;
            }
            if ((i14 & 1) == 0) {
                this.f164650b = k.UNKNOWN_EVENT_TYPE;
            } else {
                this.f164650b = kVar;
            }
            this.f164651c = str;
            this.f164652d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f164650b == eVar.f164650b && s.g(this.f164651c, eVar.f164651c) && s.g(this.f164652d, eVar.f164652d);
        }

        public final int hashCode() {
            k kVar = this.f164650b;
            return this.f164652d.hashCode() + wr.g.j((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f164651c);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MessageDTO(eventType=");
            sb3.append(this.f164650b);
            sb3.append(", flowName=");
            sb3.append(this.f164651c);
            sb3.append(", logMessage=");
            return am.j.o(this.f164652d, ")", sb3);
        }

        /* JADX INFO: renamed from: ti2.j$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/j$e$b;", "", "<init>", "()V", "Li63/c;", "Lti2/j$e;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<e> serializer() {
                return a.f164653a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        public /* synthetic */ e(k kVar, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? k.UNKNOWN_EVENT_TYPE : kVar, str, str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k kVar, String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f164650b = kVar;
            this.f164651c = str;
            this.f164652d = str2;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lti2/j$f;", "Lti2/j;", "Lti2/k;", "eventType", "", "flowName", "logMessage", "Lti2/h;", "data", "<init>", "(Lti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/h;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILti2/k;Ljava/lang/String;Ljava/lang/String;Lti2/h;Lm63/u1;)V", "Companion", "a", "b", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h
    public static final /* data */ class f extends j {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final l<i63.c<Object>>[] f164654f = {m.a(n.PUBLICATION, new ta0.g(19)), null, null, null};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f164655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f164657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h f164658e;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/auth/cmc/data/model/WebMessageDTO.SignOutMessageDTO.$serializer", "Lm63/e0;", "Lti2/j$f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @o13.e
        public /* synthetic */ class a implements e0<f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f164659a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f164659a = aVar;
                m1 m1Var = new m1("GLOBAL_SIGNOUT", aVar, 4);
                m1Var.j("eventType", false);
                m1Var.j("flowName", false);
                m1Var.j("logMessage", false);
                m1Var.j("data", false);
                m1Var.k(new a.C3089a.C3090a("eventType"));
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                y1 y1Var = y1.f117048a;
                return new i63.c[]{j63.a.d(f.f164654f[0].getValue()), y1Var, y1Var, h.a.f164627a};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                l<i63.c<Object>>[] lVarArr = f.f164654f;
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                k kVar = null;
                String strR = null;
                String strR2 = null;
                h hVar = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        kVar = (k) cVarC.v(eVar2, 0, lVarArr[0].getValue(), kVar);
                        i15 |= 1;
                    } else if (iE == 1) {
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                    } else if (iE == 2) {
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                    } else {
                        if (iE != 3) {
                            hb.a.o(iE);
                            return null;
                        }
                        hVar = (h) cVarC.l(eVar2, 3, h.a.f164627a, hVar);
                        i15 |= 8;
                    }
                }
                cVarC.b(eVar2);
                return new f(i15, kVar, strR, strR2, hVar, null);
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
                dVarC.d(eVar, 0, f.f164654f[0].getValue(), fVar2.f164655b);
                dVarC.k(eVar, 1, fVar2.f164656c);
                dVarC.k(eVar, 2, fVar2.f164657d);
                dVarC.e(eVar, 3, h.a.f164627a, fVar2.f164658e);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ f(int i14, k kVar, String str, String str2, h hVar, u1 u1Var) {
            super(i14, u1Var);
            if (15 != (i14 & 15)) {
                k1.h(i14, 15, a.f164659a.getF158591b());
                throw null;
            }
            this.f164655b = kVar;
            this.f164656c = str;
            this.f164657d = str2;
            this.f164658e = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f164655b == fVar.f164655b && s.g(this.f164656c, fVar.f164656c) && s.g(this.f164657d, fVar.f164657d) && s.g(this.f164658e, fVar.f164658e);
        }

        public final int hashCode() {
            k kVar = this.f164655b;
            return this.f164658e.f164626a.hashCode() + wr.g.j(wr.g.j((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f164656c), 31, this.f164657d);
        }

        public final String toString() {
            return "SignOutMessageDTO(eventType=" + this.f164655b + ", flowName=" + this.f164656c + ", logMessage=" + this.f164657d + ", data=" + this.f164658e + ")";
        }

        /* JADX INFO: renamed from: ti2.j$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/j$f$b;", "", "<init>", "()V", "Li63/c;", "Lti2/j$f;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<f> serializer() {
                return a.f164659a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k kVar, String str, String str2, h hVar) {
            super(null);
            str.getClass();
            str2.getClass();
            hVar.getClass();
            this.f164655b = kVar;
            this.f164656c = str;
            this.f164657d = str2;
            this.f164658e = hVar;
        }
    }

    /* JADX INFO: renamed from: ti2.j$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lti2/j$c;", "", "<init>", "()V", "Li63/c;", "Lti2/j;", "serializer", "()Li63/c;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<j> serializer() {
            return (i63.c) j.f164629a.getValue();
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private j() {
    }

    public /* synthetic */ j(int i14, u1 u1Var) {
    }
}
