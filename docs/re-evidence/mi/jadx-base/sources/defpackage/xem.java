package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(19)
public class xem implements yve {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39047a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3b<b, Bitmap> f39048b = new x3b<>();
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39049a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f39049a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39049a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39049a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39049a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class b implements l3i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f39050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39051b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.f39050a = cVar;
        }

        @Override // defpackage.l3i
        public void a() {
            this.f39050a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.f39051b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39051b == bVar.f39051b && ulq.e(this.c, bVar.c);
        }

        public int hashCode() {
            int i = this.f39051b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return xem.h(this.f39051b, this.c);
        }
    }

    @VisibleForTesting
    public static class c extends n82<b> {
        @Override // defpackage.n82
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return e;
        }
        int i = a.f39049a[config.ordinal()];
        if (i == 1) {
            return d;
        }
        if (i == 2) {
            return f;
        }
        if (i != 3) {
            return i != 4 ? new Bitmap.Config[]{config} : h;
        }
        return g;
    }

    @Override // defpackage.yve
    public void a(Bitmap bitmap) {
        b bVarE = this.f39047a.e(ulq.i(bitmap), bitmap.getConfig());
        this.f39048b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f39051b));
        navigableMapJ.put(Integer.valueOf(bVarE.f39051b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // defpackage.yve
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        b bVarG = g(ulq.h(i, i2, config), config);
        Bitmap bitmapA = this.f39048b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f39051b), bitmapA);
            bitmapA.reconfigure(i, i2, config);
        }
        return bitmapA;
    }

    @Override // defpackage.yve
    public String c(int i, int i2, Bitmap.Config config) {
        return h(ulq.h(i, i2, config), config);
    }

    @Override // defpackage.yve
    public int d(Bitmap bitmap) {
        return ulq.i(bitmap);
    }

    @Override // defpackage.yve
    public String e(Bitmap bitmap) {
        return h(ulq.i(bitmap), bitmap.getConfig());
    }

    public final void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public final b g(int i, Bitmap.Config config) {
        b bVarE = this.f39047a.e(i, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f39047a.c(bVarE);
                return this.f39047a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    @Override // defpackage.yve
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f39048b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(ulq.i(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f39048b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
