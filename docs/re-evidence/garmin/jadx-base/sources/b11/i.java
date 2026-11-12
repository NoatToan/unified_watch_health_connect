package b11;

import com.garmin.android.apps.connectmobile.R;
import g21.f0;
import lc.u0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lb11/i;", "", "<init>", "()V", "a", "b", "c", "Lb11/i$a;", "Lb11/i$b;", "Lb11/i$c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lb11/i$c;", "Lb11/i;", "", "logId", "name", "Lb63/v;", "time", "", "mealId", "Lb11/f;", "nutritionContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb63/v;JLb11/f;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b63.v f14317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f14318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f f14319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f14320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i01.i f14321g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, b63.v vVar, long j8, f fVar) {
            super(null);
            vVar.getClass();
            fVar.getClass();
            this.f14315a = str;
            this.f14316b = str2;
            this.f14317c = vVar;
            this.f14318d = j8;
            this.f14319e = fVar;
            this.f14320f = new t(null, null, null, 7, null);
            this.f14321g = i01.i.QUICK_ADD;
        }

        public static c i(c cVar, String str, b63.v vVar, long j8, f fVar, int i14) {
            String str2 = (i14 & 1) != 0 ? cVar.f14315a : null;
            if ((i14 & 2) != 0) {
                str = cVar.f14316b;
            }
            if ((i14 & 4) != 0) {
                vVar = cVar.f14317c;
            }
            if ((i14 & 8) != 0) {
                j8 = cVar.f14318d;
            }
            if ((i14 & 16) != 0) {
                fVar = cVar.f14319e;
            }
            f fVar2 = fVar;
            cVar.getClass();
            vVar.getClass();
            fVar2.getClass();
            long j14 = j8;
            return new c(str2, str, vVar, j14, fVar2);
        }

        @Override // b11.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF14320f() {
            return this.f14320f;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public final i01.i getF14321g() {
            return this.f14321g;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF14315a() {
            return this.f14315a;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getF14318d() {
            return this.f14318d;
        }

        @Override // b11.i
        public final String e(l22.a aVar) {
            String str = this.f14316b;
            return str == null ? aVar.getString(R.string.lbl_quick_add) : str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p005kotlin.jvm.internal.s.g(this.f14315a, cVar.f14315a) && p005kotlin.jvm.internal.s.g(this.f14316b, cVar.f14316b) && p005kotlin.jvm.internal.s.g(this.f14317c, cVar.f14317c) && this.f14318d == cVar.f14318d && p005kotlin.jvm.internal.s.g(this.f14319e, cVar.f14319e);
        }

        @Override // b11.i
        /* JADX INFO: renamed from: f, reason: from getter */
        public final b63.v getF14317c() {
            return this.f14317c;
        }

        @Override // b11.i
        public final f0 g() {
            return this.f14319e.g();
        }

        public final int hashCode() {
            String str = this.f14315a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f14316b;
            return this.f14319e.hashCode() + q6.f.e(l2.c(this.f14317c.f16219a, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f14318d);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("QuickAddFoodUIModel(logId=", this.f14315a, ", name=", this.f14316b, ", time=");
            sbI.append(this.f14317c);
            sbI.append(", mealId=");
            sbI.append(this.f14318d);
            sbI.append(", nutritionContent=");
            sbI.append(this.f14319e);
            sbI.append(")");
            return sbI.toString();
        }
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract t getF14320f();

    /* JADX INFO: renamed from: b */
    public abstract i01.i getF14321g();

    /* JADX INFO: renamed from: c */
    public abstract String getF14315a();

    /* JADX INFO: renamed from: d */
    public abstract long getF14318d();

    public abstract String e(l22.a aVar);

    /* JADX INFO: renamed from: f */
    public abstract b63.v getF14317c();

    public abstract f0 g();

    public final i h(b63.v vVar) {
        vVar.getClass();
        if (this instanceof a) {
            return a.i((a) this, vVar, 0.0d, false, 0L, null, null, null, 1019);
        }
        if (this instanceof b) {
            return b.i((b) this, vVar, 0.0d, false, 0L, 1019);
        }
        if (this instanceof c) {
            return c.i((c) this, null, vVar, 0L, null, 27);
        }
        u0.r();
        return null;
    }

    private i() {
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb11/i$a;", "Lb11/i;", "Lb11/h;", "", "logId", "Li01/i;", "logCategory", "Lb63/v;", "time", "", "servingQty", "", "isFavorite", "", "mealId", "Lb11/d;", "foodMetadata", "Lb11/s;", "nutritionContent", "foodInactive", "Lb11/t;", "images", "<init>", "(Ljava/lang/String;Li01/i;Lb63/v;DZJLb11/d;Lb11/s;ZLb11/t;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends i implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i01.i f14296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b63.v f14297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f14298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f14300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f14301g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f14302h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f14303i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final t f14304j;

        public /* synthetic */ a(String str, i01.i iVar, b63.v vVar, double d14, boolean z14, long j8, d dVar, s sVar, boolean z15, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
            t tVar2;
            if ((i14 & 512) != 0) {
                tVar2 = new t(null, null, null, 7, null);
            } else {
                tVar2 = tVar;
            }
            this(str, iVar, vVar, d14, z14, j8, dVar, sVar, z15, tVar2);
        }

        public static a i(a aVar, b63.v vVar, double d14, boolean z14, long j8, d dVar, s sVar, t tVar, int i14) {
            String str = (i14 & 1) != 0 ? aVar.f14295a : null;
            i01.i iVar = aVar.f14296b;
            b63.v vVar2 = (i14 & 4) != 0 ? aVar.f14297c : vVar;
            double d15 = (i14 & 8) != 0 ? aVar.f14298d : d14;
            boolean z15 = (i14 & 16) != 0 ? aVar.f14299e : z14;
            long j14 = (i14 & 32) != 0 ? aVar.f14300f : j8;
            d dVar2 = (i14 & 64) != 0 ? aVar.f14301g : dVar;
            s sVar2 = (i14 & 128) != 0 ? aVar.f14302h : sVar;
            boolean z16 = aVar.f14303i;
            t tVar2 = (i14 & 512) != 0 ? aVar.f14304j : tVar;
            aVar.getClass();
            iVar.getClass();
            vVar2.getClass();
            dVar2.getClass();
            sVar2.getClass();
            tVar2.getClass();
            return new a(str, iVar, vVar2, d15, z15, j14, dVar2, sVar2, z16, tVar2);
        }

        @Override // b11.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF14320f() {
            return this.f14304j;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public final i01.i getF14321g() {
            return this.f14296b;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF14315a() {
            return this.f14295a;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getF14318d() {
            return this.f14300f;
        }

        @Override // b11.i
        public final String e(l22.a aVar) {
            return this.f14301g.f14254b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f14295a, aVar.f14295a) && this.f14296b == aVar.f14296b && p005kotlin.jvm.internal.s.g(this.f14297c, aVar.f14297c) && Double.compare(this.f14298d, aVar.f14298d) == 0 && this.f14299e == aVar.f14299e && this.f14300f == aVar.f14300f && p005kotlin.jvm.internal.s.g(this.f14301g, aVar.f14301g) && p005kotlin.jvm.internal.s.g(this.f14302h, aVar.f14302h) && this.f14303i == aVar.f14303i && p005kotlin.jvm.internal.s.g(this.f14304j, aVar.f14304j);
        }

        @Override // b11.i
        /* JADX INFO: renamed from: f, reason: from getter */
        public final b63.v getF14317c() {
            return this.f14297c;
        }

        @Override // b11.i
        public final f0 g() {
            return this.f14302h.f14375d.g().c(this.f14298d);
        }

        public final int hashCode() {
            String str = this.f14295a;
            return this.f14304j.hashCode() + q6.f.g((this.f14302h.hashCode() + ((this.f14301g.hashCode() + q6.f.e(q6.f.g(org.apache.commons.lang3.e.b(l2.c(this.f14297c.f16219a, (this.f14296b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31), 31, this.f14298d), 31, this.f14299e), 31, this.f14300f)) * 31)) * 31, 31, this.f14303i);
        }

        @Override // b11.h
        /* JADX INFO: renamed from: l, reason: from getter */
        public final double getF14308d() {
            return this.f14298d;
        }

        public final String toString() {
            return "LoggedFoodUIModel(logId=" + this.f14295a + ", logCategory=" + this.f14296b + ", time=" + this.f14297c + ", servingQty=" + this.f14298d + ", isFavorite=" + this.f14299e + ", mealId=" + this.f14300f + ", foodMetadata=" + this.f14301g + ", nutritionContent=" + this.f14302h + ", foodInactive=" + this.f14303i + ", images=" + this.f14304j + ")";
        }

        @Override // b11.h
        /* JADX INFO: renamed from: v, reason: from getter */
        public final s getF14312h() {
            return this.f14302h;
        }

        @Override // b11.h
        /* JADX INFO: renamed from: x, reason: from getter */
        public final d getF14311g() {
            return this.f14301g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, i01.i iVar, b63.v vVar, double d14, boolean z14, long j8, d dVar, s sVar, boolean z15, t tVar) {
            super(null);
            iVar.getClass();
            vVar.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            this.f14295a = str;
            this.f14296b = iVar;
            this.f14297c = vVar;
            this.f14298d = d14;
            this.f14299e = z14;
            this.f14300f = j8;
            this.f14301g = dVar;
            this.f14302h = sVar;
            this.f14303i = z15;
            this.f14304j = tVar;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb11/i$b;", "Lb11/i;", "Lb11/h;", "", "logId", "Li01/i;", "logCategory", "Lb63/v;", "time", "", "servingQty", "", "isFavorite", "", "mealId", "Lb11/d;", "foodMetadata", "Lb11/s;", "nutritionContent", "foodInactive", "Lb11/t;", "images", "<init>", "(Ljava/lang/String;Li01/i;Lb63/v;DZJLb11/d;Lb11/s;ZLb11/t;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends i implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i01.i f14306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b63.v f14307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f14308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f14310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f14311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f14312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f14313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final t f14314j;

        public /* synthetic */ b(String str, i01.i iVar, b63.v vVar, double d14, boolean z14, long j8, d dVar, s sVar, boolean z15, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
            t tVar2;
            if ((i14 & 512) != 0) {
                tVar2 = new t(null, null, null, 7, null);
            } else {
                tVar2 = tVar;
            }
            this(str, iVar, vVar, d14, z14, j8, dVar, sVar, z15, tVar2);
        }

        public static b i(b bVar, b63.v vVar, double d14, boolean z14, long j8, int i14) {
            String str = (i14 & 1) != 0 ? bVar.f14305a : null;
            i01.i iVar = bVar.f14306b;
            if ((i14 & 4) != 0) {
                vVar = bVar.f14307c;
            }
            b63.v vVar2 = vVar;
            double d15 = (i14 & 8) != 0 ? bVar.f14308d : d14;
            boolean z15 = (i14 & 16) != 0 ? bVar.f14309e : z14;
            long j14 = (i14 & 32) != 0 ? bVar.f14310f : j8;
            d dVar = bVar.f14311g;
            s sVar = bVar.f14312h;
            boolean z16 = bVar.f14313i;
            t tVar = bVar.f14314j;
            bVar.getClass();
            iVar.getClass();
            vVar2.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            return new b(str, iVar, vVar2, d15, z15, j14, dVar, sVar, z16, tVar);
        }

        @Override // b11.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getF14320f() {
            return this.f14314j;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: b, reason: from getter */
        public final i01.i getF14321g() {
            return this.f14306b;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF14315a() {
            return this.f14305a;
        }

        @Override // b11.i
        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getF14318d() {
            return this.f14310f;
        }

        @Override // b11.i
        public final String e(l22.a aVar) {
            return this.f14311g.f14254b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f14305a, bVar.f14305a) && this.f14306b == bVar.f14306b && p005kotlin.jvm.internal.s.g(this.f14307c, bVar.f14307c) && Double.compare(this.f14308d, bVar.f14308d) == 0 && this.f14309e == bVar.f14309e && this.f14310f == bVar.f14310f && p005kotlin.jvm.internal.s.g(this.f14311g, bVar.f14311g) && p005kotlin.jvm.internal.s.g(this.f14312h, bVar.f14312h) && this.f14313i == bVar.f14313i && p005kotlin.jvm.internal.s.g(this.f14314j, bVar.f14314j);
        }

        @Override // b11.i
        /* JADX INFO: renamed from: f, reason: from getter */
        public final b63.v getF14317c() {
            return this.f14307c;
        }

        @Override // b11.i
        public final f0 g() {
            return this.f14312h.f14375d.g().c(this.f14308d);
        }

        public final int hashCode() {
            String str = this.f14305a;
            return this.f14314j.hashCode() + q6.f.g((this.f14312h.hashCode() + ((this.f14311g.hashCode() + q6.f.e(q6.f.g(org.apache.commons.lang3.e.b(l2.c(this.f14307c.f16219a, (this.f14306b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31), 31, this.f14308d), 31, this.f14309e), 31, this.f14310f)) * 31)) * 31, 31, this.f14313i);
        }

        @Override // b11.h
        /* JADX INFO: renamed from: l, reason: from getter */
        public final double getF14308d() {
            return this.f14308d;
        }

        public final String toString() {
            return "LoggedRecipeUIModel(logId=" + this.f14305a + ", logCategory=" + this.f14306b + ", time=" + this.f14307c + ", servingQty=" + this.f14308d + ", isFavorite=" + this.f14309e + ", mealId=" + this.f14310f + ", foodMetadata=" + this.f14311g + ", nutritionContent=" + this.f14312h + ", foodInactive=" + this.f14313i + ", images=" + this.f14314j + ")";
        }

        @Override // b11.h
        /* JADX INFO: renamed from: v, reason: from getter */
        public final s getF14312h() {
            return this.f14312h;
        }

        @Override // b11.h
        /* JADX INFO: renamed from: x, reason: from getter */
        public final d getF14311g() {
            return this.f14311g;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, i01.i iVar, b63.v vVar, double d14, boolean z14, long j8, d dVar, s sVar, boolean z15, t tVar) {
            super(null);
            iVar.getClass();
            vVar.getClass();
            dVar.getClass();
            sVar.getClass();
            tVar.getClass();
            this.f14305a = str;
            this.f14306b = iVar;
            this.f14307c = vVar;
            this.f14308d = d14;
            this.f14309e = z14;
            this.f14310f = j8;
            this.f14311g = dVar;
            this.f14312h = sVar;
            this.f14313i = z15;
            this.f14314j = tVar;
        }
    }
}
