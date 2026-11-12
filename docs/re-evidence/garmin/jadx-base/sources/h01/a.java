package h01;

import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.g;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lh01/a;", "", "", "customMealId", "", "isFavorite", "<init>", "(JZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f80630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80631b;

    /* JADX INFO: renamed from: h01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/favorite/FavoriteCustomMealRequestDTO.$serializer", "Lm63/e0;", "Lh01/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C1608a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1608a f80632a;
        private static final k63.e descriptor;

        static {
            C1608a c1608a = new C1608a();
            f80632a = c1608a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.favorite.FavoriteCustomMealRequestDTO", c1608a, 2);
            m1Var.j("customMealId", false);
            m1Var.j("isFavorite", false);
            descriptor = m1Var;
        }

        private C1608a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{v0.f117027a, g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            long jW = 0;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    jW = cVarC.w(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 1);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, jW, zG, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            dVarC.z(eVar, 0, aVar.f80630a);
            dVarC.n(eVar, 1, aVar.f80631b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, long j8, boolean z14, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, C1608a.f80632a.getF158591b());
            throw null;
        }
        this.f80630a = j8;
        this.f80631b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80630a == aVar.f80630a && this.f80631b == aVar.f80631b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80631b) + (Long.hashCode(this.f80630a) * 31);
    }

    public final String toString() {
        return "FavoriteCustomMealRequestDTO(customMealId=" + this.f80630a + ", isFavorite=" + this.f80631b + ")";
    }

    /* JADX INFO: renamed from: h01.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh01/a$b;", "", "<init>", "()V", "Li63/c;", "Lh01/a;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C1608a.f80632a;
        }

        private Companion() {
        }
    }

    public a(long j8, boolean z14) {
        this.f80630a = j8;
        this.f80631b = z14;
    }
}
