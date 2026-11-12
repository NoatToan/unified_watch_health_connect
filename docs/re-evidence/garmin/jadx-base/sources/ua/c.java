package ua;

import androidx.media3.common.q;
import com.google.android.exoplayer2.C;
import fa.z;
import ha.f;
import ha.g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f169592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f169593k;

    public c(ha.d dVar, g gVar, int i14, q qVar, int i15, Object obj, byte[] bArr) {
        super(dVar, gVar, i14, qVar, i15, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f169592j = bArr == null ? z.f70076f : bArr;
    }

    public abstract void a(byte[] bArr, int i14);

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void cancelLoad() {
        this.f169593k = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void load() {
        try {
            this.f169591i.b(this.f169584b);
            int i14 = 0;
            int i15 = 0;
            while (i14 != -1 && !this.f169593k) {
                byte[] bArr = this.f169592j;
                if (bArr.length < i15 + 16384) {
                    this.f169592j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i14 = this.f169591i.read(this.f169592j, i15, 16384);
                if (i14 != -1) {
                    i15 += i14;
                }
            }
            if (!this.f169593k) {
                a(this.f169592j, i15);
            }
        } finally {
            f.a(this.f169591i);
        }
    }
}
