package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;

/* JADX INFO: loaded from: classes4.dex */
public class n67 implements bq2 {
    @Override // defpackage.f3i
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // defpackage.f3i, defpackage.frk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.rpf
    public void d(MemoryTrimType memoryTrimType) {
    }
}
