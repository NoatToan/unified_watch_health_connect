package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public class SizeConfigStrategy implements e {
    private static final int d = 8;
    private static final Bitmap.Config[] e;
    private static final Bitmap.Config[] f;
    private static final Bitmap.Config[] g;
    private static final Bitmap.Config[] h;
    private static final Bitmap.Config[] i;
    private final c a = new c();
    private final d<b, Bitmap> b = new d<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static class c extends com.bumptech.glide.load.engine.bitmap_recycle.c<b> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
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
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        e = configArr;
        f = configArr;
        g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapE = e(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapE.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapE.remove(num);
                return;
            } else {
                navigableMapE.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + logBitmap(bitmap) + ", this: " + this);
    }

    private b b(int i2, Bitmap.Config config) {
        b bVarE = this.a.e(i2, config);
        for (Bitmap.Config config2 : d(config)) {
            Integer numCeilingKey = e(config2).ceilingKey(Integer.valueOf(i2));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i2 * 8) {
                if (numCeilingKey.intValue() == i2) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.a.c(bVarE);
                return this.a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    public static String c(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    private static Bitmap.Config[] d(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f;
        }
        int i2 = a.a[config.ordinal()];
        if (i2 == 1) {
            return e;
        }
        if (i2 == 2) {
            return g;
        }
        if (i2 != 3) {
            return i2 != 4 ? new Bitmap.Config[]{config} : i;
        }
        return h;
    }

    private NavigableMap<Integer, Integer> e(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @Nullable
    public Bitmap get(int i2, int i3, Bitmap.Config config) {
        b bVarB = b(Util.getBitmapByteSize(i2, i3, config), config);
        Bitmap bitmapA = this.b.a(bVarB);
        if (bitmapA != null) {
            a(Integer.valueOf(bVarB.b), bitmapA);
            bitmapA.reconfigure(i2, i3, bitmapA.getConfig() != null ? bitmapA.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public int getSize(Bitmap bitmap) {
        return Util.getBitmapByteSize(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public String logBitmap(Bitmap bitmap) {
        return c(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void put(Bitmap bitmap) {
        b bVarE = this.a.e(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
        this.b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapE = e(bitmap.getConfig());
        Integer num = (Integer) navigableMapE.get(Integer.valueOf(bVarE.b));
        navigableMapE.put(Integer.valueOf(bVarE.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.b.f();
        if (bitmapF != null) {
            a(Integer.valueOf(Util.getBitmapByteSize(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append(JsonLexerKt.BEGIN_LIST);
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @VisibleForTesting
    public static final class b implements f {
        private final c a;
        public int b;
        private Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && Util.bothNullOrEqual(this.c, bVar.c);
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return SizeConfigStrategy.c(this.b, this.c);
        }

        @VisibleForTesting
        public b(c cVar, int i, Bitmap.Config config) {
            this(cVar);
            b(i, config);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public String logBitmap(int i2, int i3, Bitmap.Config config) {
        return c(Util.getBitmapByteSize(i2, i3, config), config);
    }
}
