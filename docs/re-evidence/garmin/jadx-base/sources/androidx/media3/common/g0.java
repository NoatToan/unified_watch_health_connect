package androidx.media3.common;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g0 {
    public static final g0 C = new g0(new c());
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f8226a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f8227b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f8228c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f8229d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f8230e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f8231f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f8232g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f8233h0;
    public final ImmutableMap<e0, f0> A;
    public final ImmutableSet<Integer> B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImmutableList<String> f8245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImmutableList<String> f8247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImmutableList<String> f8251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f8252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImmutableList<String> f8253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f8258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f8259z;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f8260d = new b(new a());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f8261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f8262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f8263g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8266c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8267a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f8268b = false;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f8269c = false;
        }

        static {
            int i14 = fa.z.f70071a;
            f8261e = Integer.toString(1, 36);
            f8262f = Integer.toString(2, 36);
            f8263g = Integer.toString(3, 36);
        }

        private b(a aVar) {
            this.f8264a = aVar.f8267a;
            this.f8265b = aVar.f8268b;
            this.f8266c = aVar.f8269c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f8264a == bVar.f8264a && this.f8265b == bVar.f8265b && this.f8266c == bVar.f8266c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((this.f8264a + 31) * 31) + (this.f8265b ? 1 : 0)) * 31) + (this.f8266c ? 1 : 0);
        }
    }

    static {
        int i14 = fa.z.f70071a;
        D = Integer.toString(1, 36);
        E = Integer.toString(2, 36);
        F = Integer.toString(3, 36);
        G = Integer.toString(4, 36);
        H = Integer.toString(5, 36);
        I = Integer.toString(6, 36);
        J = Integer.toString(7, 36);
        K = Integer.toString(8, 36);
        L = Integer.toString(9, 36);
        M = Integer.toString(10, 36);
        N = Integer.toString(11, 36);
        O = Integer.toString(12, 36);
        P = Integer.toString(13, 36);
        Q = Integer.toString(14, 36);
        R = Integer.toString(15, 36);
        S = Integer.toString(16, 36);
        T = Integer.toString(17, 36);
        U = Integer.toString(18, 36);
        V = Integer.toString(19, 36);
        W = Integer.toString(20, 36);
        X = Integer.toString(21, 36);
        Y = Integer.toString(22, 36);
        Z = Integer.toString(23, 36);
        f8226a0 = Integer.toString(24, 36);
        f8227b0 = Integer.toString(25, 36);
        f8228c0 = Integer.toString(26, 36);
        f8229d0 = Integer.toString(27, 36);
        f8230e0 = Integer.toString(28, 36);
        f8231f0 = Integer.toString(29, 36);
        f8232g0 = Integer.toString(30, 36);
        f8233h0 = Integer.toString(31, 36);
    }

    public g0(c cVar) {
        this.f8234a = cVar.f8270a;
        this.f8235b = cVar.f8271b;
        this.f8236c = cVar.f8272c;
        this.f8237d = cVar.f8273d;
        this.f8238e = cVar.f8274e;
        this.f8239f = cVar.f8275f;
        this.f8240g = cVar.f8276g;
        this.f8241h = cVar.f8277h;
        this.f8242i = cVar.f8278i;
        this.f8243j = cVar.f8279j;
        this.f8244k = cVar.f8280k;
        this.f8245l = cVar.f8281l;
        this.f8246m = cVar.f8282m;
        this.f8247n = cVar.f8283n;
        this.f8248o = cVar.f8284o;
        this.f8249p = cVar.f8285p;
        this.f8250q = cVar.f8286q;
        this.f8251r = cVar.f8287r;
        this.f8252s = cVar.f8288s;
        this.f8253t = cVar.f8289t;
        this.f8254u = cVar.f8290u;
        this.f8255v = cVar.f8291v;
        this.f8256w = cVar.f8292w;
        this.f8257x = cVar.f8293x;
        this.f8258y = cVar.f8294y;
        this.f8259z = cVar.f8295z;
        this.A = ImmutableMap.copyOf((Map) cVar.A);
        this.B = ImmutableSet.copyOf((Collection) cVar.B);
    }

    public c a() {
        return new c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            g0 g0Var = (g0) obj;
            if (this.f8234a == g0Var.f8234a && this.f8235b == g0Var.f8235b && this.f8236c == g0Var.f8236c && this.f8237d == g0Var.f8237d && this.f8238e == g0Var.f8238e && this.f8239f == g0Var.f8239f && this.f8240g == g0Var.f8240g && this.f8241h == g0Var.f8241h && this.f8244k == g0Var.f8244k && this.f8242i == g0Var.f8242i && this.f8243j == g0Var.f8243j && this.f8245l.equals(g0Var.f8245l) && this.f8246m == g0Var.f8246m && this.f8247n.equals(g0Var.f8247n) && this.f8248o == g0Var.f8248o && this.f8249p == g0Var.f8249p && this.f8250q == g0Var.f8250q && this.f8251r.equals(g0Var.f8251r) && this.f8252s.equals(g0Var.f8252s) && this.f8253t.equals(g0Var.f8253t) && this.f8254u == g0Var.f8254u && this.f8255v == g0Var.f8255v && this.f8256w == g0Var.f8256w && this.f8257x == g0Var.f8257x && this.f8258y == g0Var.f8258y && this.f8259z == g0Var.f8259z && this.A.equals(g0Var.A) && this.B.equals(g0Var.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ((((((((((((((this.f8253t.hashCode() + ((this.f8252s.hashCode() + ((this.f8251r.hashCode() + ((((((((this.f8247n.hashCode() + ((((this.f8245l.hashCode() + ((((((((((((((((((((((this.f8234a + 31) * 31) + this.f8235b) * 31) + this.f8236c) * 31) + this.f8237d) * 31) + this.f8238e) * 31) + this.f8239f) * 31) + this.f8240g) * 31) + this.f8241h) * 31) + (this.f8244k ? 1 : 0)) * 31) + this.f8242i) * 31) + this.f8243j) * 31)) * 31) + this.f8246m) * 31)) * 31) + this.f8248o) * 31) + this.f8249p) * 31) + this.f8250q) * 31)) * 31)) * 31)) * 31) + this.f8254u) * 31) + this.f8255v) * 31) + (this.f8256w ? 1 : 0)) * 31) + (this.f8257x ? 1 : 0)) * 31) + (this.f8258y ? 1 : 0)) * 31) + (this.f8259z ? 1 : 0)) * 31)) * 31);
    }

    public static class c {
        public HashMap<e0, f0> A;
        public HashSet<Integer> B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8277h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8278i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8279j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f8280k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImmutableList<String> f8281l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f8282m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImmutableList<String> f8283n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8284o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f8285p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f8286q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ImmutableList<String> f8287r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public b f8288s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImmutableList<String> f8289t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f8290u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8291v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f8292w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f8293x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f8294y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f8295z;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Bundle bundle) {
            b bVar;
            ImmutableList immutableListBuild;
            String str = g0.I;
            g0 g0Var = g0.C;
            this.f8270a = bundle.getInt(str, g0Var.f8234a);
            this.f8271b = bundle.getInt(g0.J, g0Var.f8235b);
            this.f8272c = bundle.getInt(g0.K, g0Var.f8236c);
            this.f8273d = bundle.getInt(g0.L, g0Var.f8237d);
            this.f8274e = bundle.getInt(g0.M, g0Var.f8238e);
            this.f8275f = bundle.getInt(g0.N, g0Var.f8239f);
            this.f8276g = bundle.getInt(g0.O, g0Var.f8240g);
            this.f8277h = bundle.getInt(g0.P, g0Var.f8241h);
            this.f8278i = bundle.getInt(g0.Q, g0Var.f8242i);
            this.f8279j = bundle.getInt(g0.R, g0Var.f8243j);
            this.f8280k = bundle.getBoolean(g0.S, g0Var.f8244k);
            this.f8281l = ImmutableList.copyOf((String[]) MoreObjects.firstNonNull(bundle.getStringArray(g0.T), new String[0]));
            this.f8282m = bundle.getInt(g0.f8227b0, g0Var.f8246m);
            this.f8283n = d((String[]) MoreObjects.firstNonNull(bundle.getStringArray(g0.D), new String[0]));
            this.f8284o = bundle.getInt(g0.E, g0Var.f8248o);
            this.f8285p = bundle.getInt(g0.U, g0Var.f8249p);
            this.f8286q = bundle.getInt(g0.V, g0Var.f8250q);
            this.f8287r = ImmutableList.copyOf((String[]) MoreObjects.firstNonNull(bundle.getStringArray(g0.W), new String[0]));
            Bundle bundle2 = bundle.getBundle(g0.f8232g0);
            if (bundle2 != null) {
                b bVar2 = b.f8260d;
                b.a aVar = new b.a();
                String str2 = b.f8261e;
                b bVar3 = b.f8260d;
                aVar.f8267a = bundle2.getInt(str2, bVar3.f8264a);
                aVar.f8268b = bundle2.getBoolean(b.f8262f, bVar3.f8265b);
                aVar.f8269c = bundle2.getBoolean(b.f8263g, bVar3.f8266c);
                bVar = new b(aVar);
            } else {
                b.a aVar2 = new b.a();
                String str3 = g0.f8229d0;
                b bVar4 = b.f8260d;
                aVar2.f8267a = bundle.getInt(str3, bVar4.f8264a);
                aVar2.f8268b = bundle.getBoolean(g0.f8230e0, bVar4.f8265b);
                aVar2.f8269c = bundle.getBoolean(g0.f8231f0, bVar4.f8266c);
                bVar = new b(aVar2);
            }
            this.f8288s = bVar;
            this.f8289t = d((String[]) MoreObjects.firstNonNull(bundle.getStringArray(g0.F), new String[0]));
            this.f8290u = bundle.getInt(g0.G, g0Var.f8254u);
            this.f8291v = bundle.getInt(g0.f8228c0, g0Var.f8255v);
            this.f8292w = bundle.getBoolean(g0.H, g0Var.f8256w);
            this.f8293x = bundle.getBoolean(g0.f8233h0, g0Var.f8257x);
            this.f8294y = bundle.getBoolean(g0.X, g0Var.f8258y);
            this.f8295z = bundle.getBoolean(g0.Y, g0Var.f8259z);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(g0.Z);
            if (parcelableArrayList == null) {
                immutableListBuild = ImmutableList.of();
            } else {
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                    Bundle bundle3 = (Bundle) parcelableArrayList.get(i14);
                    bundle3.getClass();
                    Bundle bundle4 = bundle3.getBundle(f0.f8221c);
                    bundle4.getClass();
                    e0 e0VarA = e0.a(bundle4);
                    int[] intArray = bundle3.getIntArray(f0.f8222d);
                    intArray.getClass();
                    builder.add(new f0(e0VarA, Ints.asList(intArray)));
                }
                immutableListBuild = builder.build();
            }
            this.A = new HashMap<>();
            for (int i15 = 0; i15 < immutableListBuild.size(); i15++) {
                f0 f0Var = (f0) immutableListBuild.get(i15);
                this.A.put(f0Var.f8223a, f0Var);
            }
            int[] iArr = (int[]) MoreObjects.firstNonNull(bundle.getIntArray(g0.f8226a0), new int[0]);
            this.B = new HashSet<>();
            for (int i16 : iArr) {
                this.B.add(Integer.valueOf(i16));
            }
        }

        public static ImmutableList<String> d(String[] strArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            strArr.getClass();
            for (String str : strArr) {
                str.getClass();
                builder.add(fa.z.P(str));
            }
            return builder.build();
        }

        public g0 a() {
            return new g0(this);
        }

        @CanIgnoreReturnValue
        public c b(int i14) {
            Iterator<f0> it = this.A.values().iterator();
            while (it.hasNext()) {
                if (it.next().f8223a.f8216c == i14) {
                    it.remove();
                }
            }
            return this;
        }

        public final void c(g0 g0Var) {
            this.f8270a = g0Var.f8234a;
            this.f8271b = g0Var.f8235b;
            this.f8272c = g0Var.f8236c;
            this.f8273d = g0Var.f8237d;
            this.f8274e = g0Var.f8238e;
            this.f8275f = g0Var.f8239f;
            this.f8276g = g0Var.f8240g;
            this.f8277h = g0Var.f8241h;
            this.f8278i = g0Var.f8242i;
            this.f8279j = g0Var.f8243j;
            this.f8280k = g0Var.f8244k;
            this.f8281l = g0Var.f8245l;
            this.f8282m = g0Var.f8246m;
            this.f8283n = g0Var.f8247n;
            this.f8284o = g0Var.f8248o;
            this.f8285p = g0Var.f8249p;
            this.f8286q = g0Var.f8250q;
            this.f8287r = g0Var.f8251r;
            this.f8288s = g0Var.f8252s;
            this.f8289t = g0Var.f8253t;
            this.f8290u = g0Var.f8254u;
            this.f8291v = g0Var.f8255v;
            this.f8292w = g0Var.f8256w;
            this.f8293x = g0Var.f8257x;
            this.f8294y = g0Var.f8258y;
            this.f8295z = g0Var.f8259z;
            this.B = new HashSet<>(g0Var.B);
            this.A = new HashMap<>(g0Var.A);
        }

        @CanIgnoreReturnValue
        public c e() {
            this.f8291v = -3;
            return this;
        }

        @CanIgnoreReturnValue
        public c f(f0 f0Var) {
            e0 e0Var = f0Var.f8223a;
            b(e0Var.f8216c);
            this.A.put(e0Var, f0Var);
            return this;
        }

        public c g() {
            return h(new String[0]);
        }

        @CanIgnoreReturnValue
        public c h(String... strArr) {
            this.f8289t = d(strArr);
            return this;
        }

        @CanIgnoreReturnValue
        public c i() {
            this.f8290u = 0;
            return this;
        }

        @CanIgnoreReturnValue
        public c j(int i14) {
            this.B.remove(Integer.valueOf(i14));
            return this;
        }

        @CanIgnoreReturnValue
        public c k(int i14, int i15) {
            this.f8278i = i14;
            this.f8279j = i15;
            this.f8280k = true;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
        public c(Context context) {
            CaptioningManager captioningManager;
            Point point;
            Point point2;
            String strB;
            this();
            if ((fa.z.f70071a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f8290u = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f8289t = ImmutableList.of(locale.toLanguageTag());
                }
            }
            int i14 = fa.z.f70071a;
            DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.getClass();
                display = windowManager.getDefaultDisplay();
            }
            int i15 = fa.z.f70071a;
            if (display.getDisplayId() == 0 && fa.z.L(context)) {
                if (i15 < 28) {
                    strB = fa.z.B("sys.display-size");
                } else {
                    strB = fa.z.B("vendor.display-size");
                }
                if (!TextUtils.isEmpty(strB)) {
                    try {
                        String[] strArrSplit = strB.trim().split("x", -1);
                        if (strArrSplit.length == 2) {
                            int i16 = Integer.parseInt(strArrSplit[0]);
                            int i17 = Integer.parseInt(strArrSplit[1]);
                            if (i16 > 0 && i17 > 0) {
                                point2 = new Point(i16, i17);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    fa.k.c("Invalid display size: " + strB);
                }
                if ("Sony".equals(fa.z.f70073c) && fa.z.f70074d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    point = new Point();
                    if (i15 >= 23) {
                        Display.Mode mode = display.getMode();
                        point.x = mode.getPhysicalWidth();
                        point.y = mode.getPhysicalHeight();
                    } else {
                        display.getRealSize(point);
                    }
                }
                point2 = point;
            } else {
                point = new Point();
                if (i15 >= 23) {
                    Display.Mode mode2 = display.getMode();
                    point.x = mode2.getPhysicalWidth();
                    point.y = mode2.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
                point2 = point;
            }
            k(point2.x, point2.y);
        }

        public c(g0 g0Var) {
            c(g0Var);
        }

        @Deprecated
        public c() {
            this.f8270a = Integer.MAX_VALUE;
            this.f8271b = Integer.MAX_VALUE;
            this.f8272c = Integer.MAX_VALUE;
            this.f8273d = Integer.MAX_VALUE;
            this.f8278i = Integer.MAX_VALUE;
            this.f8279j = Integer.MAX_VALUE;
            this.f8280k = true;
            this.f8281l = ImmutableList.of();
            this.f8282m = 0;
            this.f8283n = ImmutableList.of();
            this.f8284o = 0;
            this.f8285p = Integer.MAX_VALUE;
            this.f8286q = Integer.MAX_VALUE;
            this.f8287r = ImmutableList.of();
            this.f8288s = b.f8260d;
            this.f8289t = ImmutableList.of();
            this.f8290u = 0;
            this.f8291v = 0;
            this.f8292w = false;
            this.f8293x = false;
            this.f8294y = false;
            this.f8295z = false;
            this.A = new HashMap<>();
            this.B = new HashSet<>();
        }
    }
}
