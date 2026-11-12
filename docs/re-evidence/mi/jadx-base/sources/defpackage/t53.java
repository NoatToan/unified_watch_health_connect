package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(21)
public class t53 extends BasePool<Bitmap> implements bq2 {
    public t53(spf spfVar, j3i j3iVar, k3i k3iVar) {
        super(spfVar, j3iVar, k3iVar);
        n();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(Bitmap bitmap) {
        b6i.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Bitmap l(r53<Bitmap> r53Var) {
        Bitmap bitmap = (Bitmap) super.l(r53Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean p(Bitmap bitmap) {
        b6i.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int i(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int k(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Bitmap a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(Bitmap bitmap) {
        b6i.g(bitmap);
        bitmap.recycle();
    }
}
