package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
final class h implements e {
    private static final int d = 8;
    private final b a = new b();
    private final d<a, Bitmap> b = new d<>();
    private final NavigableMap<Integer, Integer> c = new g();

    @VisibleForTesting
    public static final class a implements f {
        private final b a;
        public int b;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f
        public void a() {
            this.a.c(this);
        }

        public void b(int i) {
            this.b = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return this.b;
        }

        public String toString() {
            return h.b(this.b);
        }
    }

    @VisibleForTesting
    public static class b extends c<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i) {
            a aVar = (a) super.b();
            aVar.b(i);
            return aVar;
        }
    }

    private void a(Integer num) {
        Integer num2 = (Integer) this.c.get(num);
        if (num2.intValue() == 1) {
            this.c.remove(num);
        } else {
            this.c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public static String b(int i) {
        return "[" + i + "]";
    }

    private static String c(Bitmap bitmap) {
        return b(Util.getBitmapByteSize(bitmap));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @Nullable
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        int bitmapByteSize = Util.getBitmapByteSize(i, i2, config);
        a aVarE = this.a.e(bitmapByteSize);
        Integer numCeilingKey = this.c.ceilingKey(Integer.valueOf(bitmapByteSize));
        if (numCeilingKey != null && numCeilingKey.intValue() != bitmapByteSize && numCeilingKey.intValue() <= bitmapByteSize * 8) {
            this.a.c(aVarE);
            aVarE = this.a.e(numCeilingKey.intValue());
        }
        Bitmap bitmapA = this.b.a(aVarE);
        if (bitmapA != null) {
            bitmapA.reconfigure(i, i2, config);
            a(numCeilingKey);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public int getSize(Bitmap bitmap) {
        return Util.getBitmapByteSize(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public String logBitmap(Bitmap bitmap) {
        return c(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public void put(Bitmap bitmap) {
        a aVarE = this.a.e(Util.getBitmapByteSize(bitmap));
        this.b.d(aVarE, bitmap);
        Integer num = (Integer) this.c.get(Integer.valueOf(aVarE.b));
        this.c.put(Integer.valueOf(aVarE.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.b.f();
        if (bitmapF != null) {
            a(Integer.valueOf(Util.getBitmapByteSize(bitmapF)));
        }
        return bitmapF;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.b + "\n  SortedSizes" + this.c;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.e
    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return b(Util.getBitmapByteSize(i, i2, config));
    }
}
