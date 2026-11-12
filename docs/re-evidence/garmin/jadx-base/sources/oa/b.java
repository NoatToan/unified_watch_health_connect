package oa;

import androidx.media3.common.q;
import androidx.media3.common.x;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.u0;
import fa.z;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ia.e<DecoderInputBuffer, d, ImageDecoderException> implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f131018n;

    public interface a {
    }

    private b(a aVar) {
        super(new DecoderInputBuffer[1], new d[1]);
        this.f131018n = aVar;
    }

    @Override // ia.e
    public final DecoderInputBuffer d() {
        return new DecoderInputBuffer(1);
    }

    @Override // ia.e
    public final ia.d e() {
        return new oa.a(this);
    }

    @Override // ia.e
    public final DecoderException f(Throwable th3) {
        return new ImageDecoderException("Unexpected decode error", th3);
    }

    @Override // ia.e
    public final DecoderException g(DecoderInputBuffer decoderInputBuffer, ia.d dVar, boolean z14) {
        d dVar2 = (d) dVar;
        try {
            ByteBuffer byteBuffer = decoderInputBuffer.f8631d;
            byteBuffer.getClass();
            fa.a.d(byteBuffer.hasArray());
            fa.a.a(byteBuffer.arrayOffset() == 0);
            dVar2.f131021d = ((o2.c) this.f131018n).a(byteBuffer.remaining(), byteBuffer.array());
            dVar2.f92385b = decoderInputBuffer.f8633f;
            return null;
        } catch (ImageDecoderException e4) {
            return e4;
        }
    }

    public /* synthetic */ b(a aVar, oa.a aVar2) {
        this(aVar);
    }

    /* JADX INFO: renamed from: oa.b$b, reason: collision with other inner class name */
    public static final class C2489b implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f131019b;

        public C2489b() {
            this.f131019b = new o2.c(8);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        
            if (r0 >= 26) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
        
            if (r0 >= 34) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int a(q qVar) {
            String str = qVar.f8386n;
            if (str == null || !x.k(str)) {
                return u0.h(0, 0, 0, 0);
            }
            String str2 = qVar.f8386n;
            int i14 = z.f70071a;
            str2.getClass();
            switch (str2) {
                case "image/avif":
                    break;
                case "image/heic":
                case "image/heif":
                    break;
                case "image/jpeg":
                case "image/webp":
                case "image/bmp":
                case "image/png":
                    return u0.h(4, 0, 0, 0);
            }
            return u0.h(1, 0, 0, 0);
        }

        public C2489b(a aVar) {
            this.f131019b = aVar;
        }
    }
}
