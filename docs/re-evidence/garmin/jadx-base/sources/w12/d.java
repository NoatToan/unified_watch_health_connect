package w12;

import i63.h;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lw12/d;", "", "<init>", "()V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILm63/u1;)V", "Companion", "b", "c", "a", "Lw12/d$b;", "Lw12/d$c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public abstract class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f181267a = m.a(n.PUBLICATION, new w11.b(5));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw12/d$b;", "Lw12/d;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final class b extends d {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f181268b = m.a(n.PUBLICATION, new w11.b(6));

        private b() {
            super(null);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<b> serializer() {
            return (i63.c) f181268b.getValue();
        }
    }

    public /* synthetic */ d(j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lw12/d$c;", "Lw12/d;", "", "itemKey", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f181269b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/presentation/profile/privacy/ProfilePrivacyRoute.Section.$serializer", "Lm63/e0;", "Lw12/d$c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f181270a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f181270a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.ProfilePrivacyRoute.Section", aVar, 1);
                m1Var.j("itemKey", false);
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
                return new c(i15, strR, u1Var);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF116202c() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                dVarC.k(eVar, 0, cVar.f181269b);
                dVarC.b(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i14, String str, u1 u1Var) {
            super(i14, u1Var);
            if (1 != (i14 & 1)) {
                k1.h(i14, 1, a.f181270a.getF116202c());
                throw null;
            }
            this.f181269b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f181269b, ((c) obj).f181269b);
        }

        public final int hashCode() {
            return this.f181269b.hashCode();
        }

        public final String toString() {
            return am.j.m("Section(itemKey=", this.f181269b, ")");
        }

        /* JADX INFO: renamed from: w12.d$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw12/d$c$b;", "", "<init>", "()V", "Li63/c;", "Lw12/d$c;", "serializer", "()Li63/c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<c> serializer() {
                return a.f181270a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f181269b = str;
        }
    }

    /* JADX INFO: renamed from: w12.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw12/d$a;", "", "<init>", "()V", "Li63/c;", "Lw12/d;", "serializer", "()Li63/c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<d> serializer() {
            return (i63.c) d.f181267a.getValue();
        }

        private Companion() {
        }
    }

    private d() {
    }

    public /* synthetic */ d(int i14, u1 u1Var) {
    }
}
