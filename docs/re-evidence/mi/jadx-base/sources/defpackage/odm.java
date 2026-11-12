package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class odm extends rcm<voo, woo, SubtitleDecoderException> implements too {
    public final String n;

    public odm(String str) {
        super(new voo[2], new woo[2]);
        this.n = str;
        u(1024);
    }

    @Override // defpackage.rcm
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException j(voo vooVar, woo wooVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) rk1.e(vooVar.c);
            wooVar.s(vooVar.e, z(byteBuffer.array(), byteBuffer.limit(), z), vooVar.i);
            wooVar.i(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // defpackage.too
    public void b(long j) {
    }

    @Override // defpackage.rcm
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final voo g() {
        return new voo();
    }

    @Override // defpackage.rcm
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final woo h() {
        return new pdm(new ieh.a() { // from class: ndm
            @Override // ieh.a
            public final void a(ieh iehVar) {
                this.f27816a.r((woo) iehVar);
            }
        });
    }

    @Override // defpackage.rcm
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    public abstract soo z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
