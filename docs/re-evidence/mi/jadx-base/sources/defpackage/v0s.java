package defpackage;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.m;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public class v0s implements zj3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Rect f36358k = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36359a;

    @IntRange(from = 0, to = 100)
    @GuardedBy("mLock")
    public int c;

    @GuardedBy("mLock")
    public ImageWriter g;

    @GuardedBy("mLock")
    public cb3.a<Void> i;

    @GuardedBy("mLock")
    public lhe<Void> j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36360b = new Object();

    @GuardedBy("mLock")
    public int d = 0;

    @GuardedBy("mLock")
    public boolean e = false;

    @GuardedBy("mLock")
    public int f = 0;

    @GuardedBy("mLock")
    public Rect h = f36358k;

    public v0s(@IntRange(from = 0, to = 100) int i, int i2) {
        this.c = i;
        this.f36359a = i2;
    }

    public static ExifData f(m mVar, int i) {
        ExifData.b bVarA = ExifData.a();
        mVar.H().b(bVarA);
        bVarA.m(i);
        return bVarA.j(mVar.getWidth()).i(mVar.getHeight()).a();
    }

    @Override // defpackage.zj3
    public void a(Surface surface, int i) {
        g6i.j(i == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f36360b) {
            try {
                if (this.e) {
                    zpe.k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
                } else {
                    if (this.g != null) {
                        throw new IllegalStateException("Output surface already set.");
                    }
                    this.g = f6d.d(surface, this.f36359a, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zj3
    public lhe<Void> b() {
        lhe<Void> lheVarJ;
        synchronized (this.f36360b) {
            try {
                if (this.e && this.f == 0) {
                    lheVarJ = oua.h(null);
                } else {
                    if (this.j == null) {
                        this.j = cb3.a(new cb3.c() { // from class: u0s
                            @Override // cb3.c
                            public final Object a(cb3.a aVar) {
                                return this.f35265a.g(aVar);
                            }
                        });
                    }
                    lheVarJ = oua.j(this.j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lheVarJ;
    }

    @Override // defpackage.zj3
    public void c(Size size) {
        synchronized (this.f36360b) {
            this.h = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    @Override // defpackage.zj3
    public void close() {
        cb3.a<Void> aVar;
        synchronized (this.f36360b) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                if (this.f != 0 || this.g == null) {
                    zpe.a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                    aVar = null;
                } else {
                    zpe.a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.g.close();
                    aVar = this.i;
                }
                if (aVar != null) {
                    aVar.c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zj3
    public void d(o5d o5dVar) throws Throwable {
        ImageWriter imageWriter;
        boolean z;
        Rect rect;
        int i;
        int i2;
        m mVar;
        Image imageDequeueInputImage;
        cb3.a<Void> aVar;
        cb3.a<Void> aVar2;
        cb3.a<Void> aVar3;
        List<Integer> listA = o5dVar.a();
        boolean z2 = false;
        g6i.b(listA.size() == 1, "Processing image bundle have single capture id, but found " + listA.size());
        lhe<m> lheVarB = o5dVar.b(listA.get(0).intValue());
        g6i.a(lheVarB.isDone());
        synchronized (this.f36360b) {
            try {
                imageWriter = this.g;
                z = !this.e;
                rect = this.h;
                if (z) {
                    this.f++;
                }
                i = this.c;
                i2 = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            mVar = lheVarB.get();
            try {
                if (!z) {
                    zpe.k("YuvToJpegProcessor", "Image enqueued for processing on closed processor.");
                    mVar.close();
                    synchronized (this.f36360b) {
                        if (z) {
                            try {
                                int i3 = this.f;
                                this.f = i3 - 1;
                                if (i3 == 0 && this.e) {
                                    z2 = true;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        aVar3 = this.i;
                    }
                    if (z2) {
                        imageWriter.close();
                        zpe.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                        if (aVar3 != null) {
                            aVar3.c(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                imageDequeueInputImage = imageWriter.dequeueInputImage();
                try {
                    try {
                        m mVar2 = lheVarB.get();
                        try {
                            g6i.j(mVar2.getFormat() == 35, "Input image is not expected YUV_420_888 image format");
                            YuvImage yuvImage = new YuvImage(ImageUtil.j(mVar2), 17, mVar2.getWidth(), mVar2.getHeight(), null);
                            ByteBuffer buffer = imageDequeueInputImage.getPlanes()[0].getBuffer();
                            int iPosition = buffer.position();
                            yuvImage.compressToJpeg(rect, i, new androidx.camera.core.impl.utils.a(new a(buffer), f(mVar2, i2)));
                            mVar2.close();
                            try {
                                buffer.limit(buffer.position());
                                buffer.position(iPosition);
                                imageWriter.queueInputImage(imageDequeueInputImage);
                                synchronized (this.f36360b) {
                                    if (z) {
                                        try {
                                            int i4 = this.f;
                                            this.f = i4 - 1;
                                            if (i4 == 0 && this.e) {
                                                z2 = true;
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    aVar2 = this.i;
                                }
                                if (z2) {
                                    imageWriter.close();
                                    zpe.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                                    if (aVar2 == null) {
                                        return;
                                    }
                                    aVar2.c(null);
                                }
                            } catch (Exception e) {
                                e = e;
                                mVar = null;
                                if (z) {
                                    zpe.d("YuvToJpegProcessor", "Failed to process YUV -> JPEG", e);
                                    imageDequeueInputImage = imageWriter.dequeueInputImage();
                                    ByteBuffer buffer2 = imageDequeueInputImage.getPlanes()[0].getBuffer();
                                    buffer2.rewind();
                                    buffer2.limit(0);
                                    imageWriter.queueInputImage(imageDequeueInputImage);
                                }
                                synchronized (this.f36360b) {
                                    if (z) {
                                        try {
                                            int i5 = this.f;
                                            this.f = i5 - 1;
                                            if (i5 == 0 && this.e) {
                                                z2 = true;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    aVar2 = this.i;
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (mVar != null) {
                                    mVar.close();
                                }
                                if (!z2) {
                                    return;
                                }
                                imageWriter.close();
                                zpe.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                                if (aVar2 == null) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                mVar = null;
                                synchronized (this.f36360b) {
                                    if (z) {
                                        try {
                                            int i6 = this.f;
                                            this.f = i6 - 1;
                                            if (i6 == 0 && this.e) {
                                                z2 = true;
                                            }
                                        } catch (Throwable th6) {
                                            throw th6;
                                        }
                                    }
                                    aVar = this.i;
                                }
                                if (imageDequeueInputImage != null) {
                                    imageDequeueInputImage.close();
                                }
                                if (mVar != null) {
                                    mVar.close();
                                }
                                if (z2) {
                                    imageWriter.close();
                                    zpe.a("YuvToJpegProcessor", "Closed after completion of last image processed.");
                                    if (aVar != null) {
                                        aVar.c(null);
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            mVar = mVar2;
                        } catch (Throwable th7) {
                            th = th7;
                            mVar = mVar2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Exception e4) {
                e = e4;
                imageDequeueInputImage = null;
            } catch (Throwable th9) {
                th = th9;
                imageDequeueInputImage = null;
            }
        } catch (Exception e5) {
            e = e5;
            mVar = null;
            imageDequeueInputImage = null;
        } catch (Throwable th10) {
            th = th10;
            mVar = null;
            imageDequeueInputImage = null;
        }
    }

    public final /* synthetic */ Object g(cb3.a aVar) throws Exception {
        synchronized (this.f36360b) {
            this.i = aVar;
        }
        return "YuvToJpegProcessor-close";
    }

    public void h(@IntRange(from = 0, to = 100) int i) {
        synchronized (this.f36360b) {
            this.c = i;
        }
    }

    public void i(int i) {
        synchronized (this.f36360b) {
            this.d = i;
        }
    }

    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f36361a;

        public a(ByteBuffer byteBuffer) {
            this.f36361a = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            if (!this.f36361a.hasRemaining()) {
                throw new EOFException("Output ByteBuffer has no bytes remaining.");
            }
            this.f36361a.put((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            if (this.f36361a.remaining() >= i2) {
                this.f36361a.put(bArr, i, i2);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}
