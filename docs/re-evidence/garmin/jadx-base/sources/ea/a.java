package ea;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.common.base.Objects;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f63542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f63543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f63544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f63545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f63546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f63547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f63548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f63549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f63550z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f63551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f63552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f63553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f63554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f63555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f63558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f63559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f63560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f63561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f63562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f63563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f63564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f63565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f63566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f63567q;

    static {
        b bVar = new b();
        bVar.f63568a = "";
        bVar.a();
        int i14 = z.f70071a;
        f63542r = Integer.toString(0, 36);
        f63543s = Integer.toString(17, 36);
        f63544t = Integer.toString(1, 36);
        f63545u = Integer.toString(2, 36);
        f63546v = Integer.toString(3, 36);
        f63547w = Integer.toString(18, 36);
        f63548x = Integer.toString(4, 36);
        f63549y = Integer.toString(5, 36);
        f63550z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f14, int i14, int i15, float f15, int i16, int i17, float f16, float f17, float f18, boolean z14, int i18, int i19, float f19) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            fa.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f63551a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f63551a = charSequence.toString();
        } else {
            this.f63551a = null;
        }
        this.f63552b = alignment;
        this.f63553c = alignment2;
        this.f63554d = bitmap;
        this.f63555e = f14;
        this.f63556f = i14;
        this.f63557g = i15;
        this.f63558h = f15;
        this.f63559i = i16;
        this.f63560j = f17;
        this.f63561k = f18;
        this.f63562l = z14;
        this.f63563m = i18;
        this.f63564n = i17;
        this.f63565o = f16;
        this.f63566p = i19;
        this.f63567q = f19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f63551a, aVar.f63551a) && this.f63552b == aVar.f63552b && this.f63553c == aVar.f63553c) {
                Bitmap bitmap = aVar.f63554d;
                Bitmap bitmap2 = this.f63554d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f63555e == aVar.f63555e && this.f63556f == aVar.f63556f && this.f63557g == aVar.f63557g && this.f63558h == aVar.f63558h && this.f63559i == aVar.f63559i && this.f63560j == aVar.f63560j && this.f63561k == aVar.f63561k && this.f63562l == aVar.f63562l && this.f63563m == aVar.f63563m && this.f63564n == aVar.f63564n && this.f63565o == aVar.f63565o && this.f63566p == aVar.f63566p && this.f63567q == aVar.f63567q) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f63551a, this.f63552b, this.f63553c, this.f63554d, Float.valueOf(this.f63555e), Integer.valueOf(this.f63556f), Integer.valueOf(this.f63557g), Float.valueOf(this.f63558h), Integer.valueOf(this.f63559i), Float.valueOf(this.f63560j), Float.valueOf(this.f63561k), Boolean.valueOf(this.f63562l), Integer.valueOf(this.f63563m), Integer.valueOf(this.f63564n), Float.valueOf(this.f63565o), Integer.valueOf(this.f63566p), Float.valueOf(this.f63567q));
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f63568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f63569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Layout.Alignment f63570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Layout.Alignment f63571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f63572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f63573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f63574g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f63575h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f63576i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f63577j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f63578k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f63579l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f63580m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f63581n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f63582o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f63583p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f63584q;

        private b(a aVar) {
            this.f63568a = aVar.f63551a;
            this.f63569b = aVar.f63554d;
            this.f63570c = aVar.f63552b;
            this.f63571d = aVar.f63553c;
            this.f63572e = aVar.f63555e;
            this.f63573f = aVar.f63556f;
            this.f63574g = aVar.f63557g;
            this.f63575h = aVar.f63558h;
            this.f63576i = aVar.f63559i;
            this.f63577j = aVar.f63564n;
            this.f63578k = aVar.f63565o;
            this.f63579l = aVar.f63560j;
            this.f63580m = aVar.f63561k;
            this.f63581n = aVar.f63562l;
            this.f63582o = aVar.f63563m;
            this.f63583p = aVar.f63566p;
            this.f63584q = aVar.f63567q;
        }

        public final a a() {
            return new a(this.f63568a, this.f63570c, this.f63571d, this.f63569b, this.f63572e, this.f63573f, this.f63574g, this.f63575h, this.f63576i, this.f63577j, this.f63578k, this.f63579l, this.f63580m, this.f63581n, this.f63582o, this.f63583p, this.f63584q);
        }

        public b() {
            this.f63568a = null;
            this.f63569b = null;
            this.f63570c = null;
            this.f63571d = null;
            this.f63572e = -3.4028235E38f;
            this.f63573f = Integer.MIN_VALUE;
            this.f63574g = Integer.MIN_VALUE;
            this.f63575h = -3.4028235E38f;
            this.f63576i = Integer.MIN_VALUE;
            this.f63577j = Integer.MIN_VALUE;
            this.f63578k = -3.4028235E38f;
            this.f63579l = -3.4028235E38f;
            this.f63580m = -3.4028235E38f;
            this.f63581n = false;
            this.f63582o = -16777216;
            this.f63583p = Integer.MIN_VALUE;
        }
    }
}
