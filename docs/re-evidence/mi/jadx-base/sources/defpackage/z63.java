package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class z63 implements tqk<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f40936a;

    public z63(a aVar) {
        this.f40936a = aVar;
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, cch cchVar) throws IOException {
        return this.f40936a.g(byteBuffer, i, i2, cchVar);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, cch cchVar) {
        return this.f40936a.q(byteBuffer);
    }
}
