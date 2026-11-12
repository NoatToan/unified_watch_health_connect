package u4;

import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;
import o13.z;
import o4.d0;
import o4.t1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lu4/d;", "", "", "name", "Lg6/f;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lu4/l;", "root", "Lo4/d0;", "tintColor", "Lo4/q;", "tintBlendMode", "", "autoMirror", "", "genId", "<init>", "(Ljava/lang/String;FFFFLu4/l;JIZILkotlin/jvm/internal/j;)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f168373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f168374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f168375m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f168377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f168378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f168379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f168380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f168381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f168382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f168383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f168384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f168385j;

    static {
        b bVar = new b(null);
        f168373k = bVar;
        f168375m = bVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, float f14, float f15, float f16, float f17, l lVar, long j8, int i14, boolean z14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        int i17;
        int i18;
        if ((i16 & 512) != 0) {
            f168373k.getClass();
            synchronized (f168375m) {
                i18 = f168374l;
                f168374l = i18 + 1;
            }
            i17 = i18;
        } else {
            i17 = i15;
        }
        this(str, f14, f15, f16, f17, lVar, j8, i14, z14, i17, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!s.g(this.f168376a, dVar.f168376a) || !g6.f.c(this.f168377b, dVar.f168377b) || !g6.f.c(this.f168378c, dVar.f168378c) || this.f168379d != dVar.f168379d || this.f168380e != dVar.f168380e || !s.g(this.f168381f, dVar.f168381f) || !d0.d(this.f168382g, dVar.f168382g)) {
            return false;
        }
        int i14 = dVar.f168383h;
        o4.q.a aVar = o4.q.f128930b;
        return this.f168383h == i14 && this.f168384i == dVar.f168384i;
    }

    public final int hashCode() {
        int iHashCode = this.f168376a.hashCode() * 31;
        g6.f.a aVar = g6.f.f75994b;
        int iHashCode2 = (this.f168381f.hashCode() + q6.f.d(this.f168380e, q6.f.d(this.f168379d, q6.f.d(this.f168378c, q6.f.d(this.f168377b, iHashCode, 31), 31), 31), 31)) * 31;
        d0.a aVar2 = d0.f128823b;
        z.a aVar3 = z.f128618b;
        int iE = q6.f.e(iHashCode2, 31, this.f168382g);
        o4.q.a aVar4 = o4.q.f128930b;
        return Boolean.hashCode(this.f168384i) + q2.d(this.f168383h, iE, 31);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u00060\u0001j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu4/d$b;", "", "<init>", "()V", "", "imageVectorCount", "I", "Landroidx/compose/ui/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    private d(String str, float f14, float f15, float f16, float f17, l lVar, long j8, int i14, boolean z14, int i15) {
        this.f168376a = str;
        this.f168377b = f14;
        this.f168378c = f15;
        this.f168379d = f16;
        this.f168380e = f17;
        this.f168381f = lVar;
        this.f168382g = j8;
        this.f168383h = i14;
        this.f168384i = z14;
        this.f168385j = i15;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu4/d$a;", "", "", "name", "Lg6/f;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lo4/d0;", "tintColor", "Lo4/q;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/j;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/j;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f168386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f168387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f168388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f168389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f168390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f168391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f168392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f168393h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList<C3159a> f168394i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C3159a f168395j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f168396k;

        private a(String str, float f14, float f15, float f16, float f17, long j8, int i14, boolean z14) {
            this.f168386a = str;
            this.f168387b = f14;
            this.f168388c = f15;
            this.f168389d = f16;
            this.f168390e = f17;
            this.f168391f = j8;
            this.f168392g = i14;
            this.f168393h = z14;
            ArrayList<C3159a> arrayList = new ArrayList<>();
            this.f168394i = arrayList;
            C3159a c3159a = new C3159a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f168395j = c3159a;
            arrayList.add(c3159a);
        }

        public static void b(a aVar, ArrayList arrayList, int i14, t1 t1Var, float f14, t1 t1Var2, float f15, int i15, float f16) {
            if (aVar.f168396k) {
                e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C3159a) am.j.f(1, aVar.f168394i)).f168406j.add(new q("", arrayList, i14, t1Var, f14, t1Var2, 1.0f, f15, 0, i15, f16, 0.0f, 1.0f, 0.0f, null));
        }

        public final void a(String str, float f14, float f15, float f16, float f17, float f18, float f19, float f22, List list) {
            if (this.f168396k) {
                e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            this.f168394i.add(new C3159a(str, f14, f15, f16, f17, f18, f19, f22, list, null, 512, null));
        }

        public final d c() {
            if (this.f168396k) {
                e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (this.f168394i.size() > 1) {
                d();
            }
            C3159a c3159a = this.f168395j;
            d dVar = new d(this.f168386a, this.f168387b, this.f168388c, this.f168389d, this.f168390e, new l(c3159a.f168397a, c3159a.f168398b, c3159a.f168399c, c3159a.f168400d, c3159a.f168401e, c3159a.f168402f, c3159a.f168403g, c3159a.f168404h, c3159a.f168405i, c3159a.f168406j), this.f168391f, this.f168392g, this.f168393h, 0, 512, null);
            this.f168396k = true;
            return dVar;
        }

        public final void d() {
            if (this.f168396k) {
                e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ArrayList<C3159a> arrayList = this.f168394i;
            C3159a c3159aRemove = arrayList.remove(arrayList.size() - 1);
            ((C3159a) am.j.f(1, arrayList)).f168406j.add(new l(c3159aRemove.f168397a, c3159aRemove.f168398b, c3159aRemove.f168399c, c3159aRemove.f168400d, c3159aRemove.f168401e, c3159aRemove.f168402f, c3159aRemove.f168403g, c3159aRemove.f168404h, c3159aRemove.f168405i, c3159aRemove.f168406j));
        }

        public /* synthetic */ a(String str, float f14, float f15, float f16, float f17, long j8, int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
            this(str, f14, f15, f16, f17, j8, i14, z14);
        }

        @o13.e
        public /* synthetic */ a(String str, float f14, float f15, float f16, float f17, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, f14, f15, f16, f17, j8, i14);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, float f14, float f15, float f16, float f17, long j8, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
            long j14;
            int i16;
            String str2 = (i15 & 1) != 0 ? "" : str;
            if ((i15 & 32) != 0) {
                d0.f128823b.getClass();
                j14 = d0.f128832k;
            } else {
                j14 = j8;
            }
            if ((i15 & 64) != 0) {
                o4.q.f128930b.getClass();
                i16 = o4.q.f128935g;
            } else {
                i16 = i14;
            }
            this(str2, f14, f15, f16, f17, j14, i16, (i15 & 128) != 0 ? false : z14, (p005kotlin.jvm.internal.j) null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, float f14, float f15, float f16, float f17, long j8, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            long j14;
            int i16;
            String str2 = (i15 & 1) != 0 ? "" : str;
            if ((i15 & 32) != 0) {
                d0.f128823b.getClass();
                j14 = d0.f128832k;
            } else {
                j14 = j8;
            }
            if ((i15 & 64) != 0) {
                o4.q.f128930b.getClass();
                i16 = o4.q.f128935g;
            } else {
                i16 = i14;
            }
            this(str2, f14, f15, f16, f17, j14, i16, (p005kotlin.jvm.internal.j) null);
        }

        /* JADX INFO: renamed from: u4.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu4/d$a$a;", "", "", "name", "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lu4/g;", "clipPathData", "", "Lu4/n;", MapboxMap.QFE_CHILDREN, "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3159a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f168397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f168398b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f168399c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final float f168400d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final float f168401e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final float f168402f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final float f168403g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final float f168404h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final List<? extends g> f168405i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final List<n> f168406j;

            public C3159a(String str, float f14, float f15, float f16, float f17, float f18, float f19, float f22, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0.0f : f14, (i14 & 4) != 0 ? 0.0f : f15, (i14 & 8) != 0 ? 0.0f : f16, (i14 & 16) != 0 ? 1.0f : f17, (i14 & 32) != 0 ? 1.0f : f18, (i14 & 64) != 0 ? 0.0f : f19, (i14 & 128) != 0 ? 0.0f : f22, (i14 & 256) != 0 ? m.f168519a : list, (i14 & 512) != 0 ? new ArrayList() : list2);
            }

            public C3159a(String str, float f14, float f15, float f16, float f17, float f18, float f19, float f22, List<? extends g> list, List<n> list2) {
                this.f168397a = str;
                this.f168398b = f14;
                this.f168399c = f15;
                this.f168400d = f16;
                this.f168401e = f17;
                this.f168402f = f18;
                this.f168403g = f19;
                this.f168404h = f22;
                this.f168405i = list;
                this.f168406j = list2;
            }

            public C3159a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }
        }

        private a(String str, float f14, float f15, float f16, float f17, long j8, int i14) {
            this(str, f14, f15, f16, f17, j8, i14, false, (p005kotlin.jvm.internal.j) null);
        }
    }

    public /* synthetic */ d(String str, float f14, float f15, float f16, float f17, l lVar, long j8, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, f14, f15, f16, f17, lVar, j8, i14, z14, i15);
    }
}
