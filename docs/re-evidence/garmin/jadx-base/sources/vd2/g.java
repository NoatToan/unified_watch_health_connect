package vd2;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Size;
import ch.qos.logback.classic.Logger;
import com.garmin.android.library.handalignment.WatchHandDetector;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvd2/g;", "Lvd2/d;", "<init>", "()V", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f177509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Size f177510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f177511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<h> f177512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f177513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WatchHandDetector f177514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[][] f177515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f177516i;

    public g() {
        super(null, 1, null);
        int i14 = gt2.c.f79010a;
        this.f177509b = gt2.b.f79005a.i("HandAlignment");
        this.f177511d = e.Vivomove3;
        this.f177512e = new AtomicReference<>();
        this.f177513f = new AtomicBoolean();
        this.f177514g = new WatchHandDetector();
        this.f177515h = new byte[3][];
        this.f177516i = new Handler();
    }

    public final void a(Throwable th3) {
        this.f177509b.error(th3.getMessage());
        h hVar = this.f177512e.get();
        if (hVar != null) {
            hVar.x0(th3);
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        byte[][] bArr;
        WatchHandDetector watchHandDetector = this.f177514g;
        imageReader.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage == null) {
            return;
        }
        if (this.f177513f.get()) {
            try {
                Image.Plane[] planes = imageAcquireLatestImage.getPlanes();
                planes.getClass();
                int length = planes.length;
                int i14 = 0;
                while (true) {
                    bArr = this.f177515h;
                    if (i14 >= length) {
                        break;
                    }
                    ByteBuffer buffer = planes[i14].getBuffer();
                    if (bArr[i14] == null) {
                        bArr[i14] = new byte[buffer.capacity()];
                    }
                    byte[] bArr2 = bArr[i14];
                    bArr2.getClass();
                    buffer.get(bArr2);
                    i14++;
                }
                int rowStride = planes[0].getRowStride();
                byte[] bArr3 = bArr[0];
                Size size = this.f177510c;
                size.getClass();
                int iA = watchHandDetector.a(bArr3, size, rowStride);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                i.b.a aVar = i.b.f177524a;
                int errorCodePerFrame = watchHandDetector.getErrorCodePerFrame();
                aVar.getClass();
                i.b bVar = (i.b) u.L(errorCodePerFrame, i.b.values());
                if (bVar == null) {
                    bVar = i.b.Undefined;
                }
                i.a aVar2 = new i.a(bVar, watchHandDetector.getHourHandOffsetAnglePerFrame(), watchHandDetector.getMinuteHandOffsetAnglePerFrame(), jCurrentTimeMillis2, watchHandDetector.f50158a);
                i.b bVar2 = (i.b) u.L(iA, i.b.values());
                if (bVar2 == null) {
                    bVar2 = i.b.Undefined;
                }
                this.f177516i.post(new r0.h(28, this, new i(aVar2, new i.c(bVar2, watchHandDetector.getHourHandOffsetAngleResult(), watchHandDetector.getMinuteHandOffsetAngleResult()))));
            } catch (Throwable th3) {
                this.f177509b.error("Frame processing error: " + th3);
            }
        }
        imageAcquireLatestImage.close();
    }
}
