package xi;

import android.graphics.Bitmap;
import i3.e5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class m implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f191095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f191096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f191097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f191098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f191099h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f191100a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<b, Bitmap> f191101b = new g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f191102c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191103a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f191103a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f191103a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f191103a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f191103a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class c extends xi.c<b> {
        public final l b() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f191095d = configArr;
        f191096e = configArr;
        f191097f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f191098g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f191099h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i14, Bitmap.Config config) {
        return "[" + i14 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder("Tried to decrement empty size, size: ");
        sb3.append(num);
        String strC = c(qj.m.c(bitmap), bitmap.getConfig());
        sb3.append(", removed: ");
        sb3.append(strC);
        sb3.append(", this: ");
        sb3.append(this);
        throw new NullPointerException(sb3.toString());
    }

    public final Bitmap b(int i14, int i15, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = qj.m.d(config) * i14 * i15;
        c cVar = this.f191100a;
        l lVarB = (l) cVar.f191073a.poll();
        if (lVarB == null) {
            lVarB = cVar.b();
        }
        b bVar = (b) lVarB;
        bVar.f191105b = iD;
        bVar.f191106c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f191096e;
        } else {
            int i16 = a.f191103a[config.ordinal()];
            if (i16 == 1) {
                configArr = f191095d;
            } else if (i16 == 2) {
                configArr = f191097f;
            } else if (i16 != 3) {
                configArr = i16 != 4 ? new Bitmap.Config[]{config} : f191099h;
            } else {
                configArr = f191098g;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iD));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iD * 8) {
                if (numCeilingKey.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                cVar.a(bVar);
                int iIntValue = numCeilingKey.intValue();
                l lVarB2 = (l) cVar.f191073a.poll();
                if (lVarB2 == null) {
                    lVarB2 = cVar.b();
                }
                bVar = (b) lVarB2;
                bVar.f191105b = iIntValue;
                bVar.f191106c = config2;
                break;
            }
        }
        Bitmap bitmapA = this.f191101b.a(bVar);
        if (bitmapA != null) {
            a(Integer.valueOf(bVar.f191105b), bitmapA);
            bitmapA.reconfigure(i14, i15, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap map = this.f191102c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = qj.m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.f191100a;
        l lVarB = (l) cVar.f191073a.poll();
        if (lVarB == null) {
            lVarB = cVar.b();
        }
        b bVar = (b) lVarB;
        bVar.f191105b = iC;
        bVar.f191106c = config;
        this.f191101b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = navigableMapD.get(Integer.valueOf(bVar.f191105b));
        navigableMapD.put(Integer.valueOf(bVar.f191105b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbK = e5.k("SizeConfigStrategy{groupedMap=");
        sbK.append(this.f191101b);
        sbK.append(", sortedSizes=(");
        HashMap map = this.f191102c;
        for (Map.Entry entry : map.entrySet()) {
            sbK.append(entry.getKey());
            sbK.append('[');
            sbK.append(entry.getValue());
            sbK.append("], ");
        }
        if (!map.isEmpty()) {
            sbK.replace(sbK.length() - 2, sbK.length(), "");
        }
        sbK.append(")}");
        return sbK.toString();
    }

    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f191104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f191105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f191106c;

        public b(c cVar, int i14, Bitmap.Config config) {
            this(cVar);
            this.f191105b = i14;
            this.f191106c = config;
        }

        @Override // xi.l
        public final void a() {
            this.f191104a.a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f191105b == bVar.f191105b && qj.m.b(this.f191106c, bVar.f191106c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i14 = this.f191105b * 31;
            Bitmap.Config config = this.f191106c;
            return i14 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return m.c(this.f191105b, this.f191106c);
        }

        public b(c cVar) {
            this.f191104a = cVar;
        }
    }
}
