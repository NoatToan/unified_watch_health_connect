package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class d73 implements tqk<ByteBuffer, kza> {
    public static final a f = new a();
    public static final b g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f15168b;
    public final b c;
    public final a d;
    public final iza e;

    @VisibleForTesting
    public static class a {
        public jza a(jza.a aVar, sza szaVar, ByteBuffer byteBuffer, int i) {
            return new obo(aVar, szaVar, byteBuffer, i);
        }
    }

    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<tza> f15169a = ulq.g(0);

        public synchronized tza a(ByteBuffer byteBuffer) {
            tza tzaVarPoll;
            try {
                tzaVarPoll = this.f15169a.poll();
                if (tzaVarPoll == null) {
                    tzaVarPoll = new tza();
                }
            } catch (Throwable th) {
                throw th;
            }
            return tzaVarPoll.p(byteBuffer);
        }

        public synchronized void b(tza tzaVar) {
            tzaVar.a();
            this.f15169a.offer(tzaVar);
        }
    }

    public d73(Context context, List<ImageHeaderParser> list, cq2 cq2Var, nj1 nj1Var) {
        this(context, list, cq2Var, nj1Var, g, f);
    }

    public static int e(sza szaVar, int i, int i2) {
        int iMin = Math.min(szaVar.a() / i2, szaVar.d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(iMax);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(szaVar.d());
            sb.append("x");
            sb.append(szaVar.a());
            sb.append("]");
        }
        return iMax;
    }

    public final nza c(ByteBuffer byteBuffer, int i, int i2, tza tzaVar, cch cchVar) {
        long jB = epe.b();
        try {
            sza szaVarC = tzaVar.c();
            if (szaVarC.b() > 0 && szaVarC.c() == 0) {
                Bitmap.Config config = cchVar.c(uza.f36307a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                jza jzaVarA = this.d.a(this.e, szaVarC, byteBuffer, e(szaVarC, i, i2));
                jzaVarA.a(config);
                jzaVarA.f();
                Bitmap bitmapE = jzaVarA.e();
                if (bitmapE == null) {
                    return null;
                }
                return new nza(new kza(this.f15167a, jzaVarA, haq.c(), i, i2, bitmapE));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded GIF from stream in ");
                sb.append(epe.a(jB));
            }
        }
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public nza b(ByteBuffer byteBuffer, int i, int i2, cch cchVar) {
        tza tzaVarA = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, tzaVarA, cchVar);
        } finally {
            this.c.b(tzaVarA);
        }
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, cch cchVar) throws IOException {
        return !((Boolean) cchVar.c(uza.f36308b)).booleanValue() && com.bumptech.glide.load.a.g(this.f15168b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @VisibleForTesting
    public d73(Context context, List<ImageHeaderParser> list, cq2 cq2Var, nj1 nj1Var, b bVar, a aVar) {
        this.f15167a = context.getApplicationContext();
        this.f15168b = list;
        this.d = aVar;
        this.e = new iza(cq2Var, nj1Var);
        this.c = bVar;
    }
}
