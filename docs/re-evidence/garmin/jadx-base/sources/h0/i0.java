package h0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.i2;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import b0.a1;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f80481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0.i f80482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraCharacteristics f80483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f80484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f80485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f80486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f80487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f80488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f80489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f80490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f80491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b0 f80492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f80493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f80494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i2 f80495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f80496p;

    @AutoValue
    public static abstract class a {
        public abstract r0.f<b> a();

        public abstract int b();

        public abstract List<Integer> c();

        public abstract r0.f<b> d();
    }

    @AutoValue
    public static abstract class b {
        public abstract androidx.camera.core.e a();

        public abstract j0 b();
    }

    public i0(Executor executor, CameraCharacteristics cameraCharacteristics, r0.i iVar, i2 i2Var) {
        if (o0.a.f128480a.b(LowMemoryQuirk.class) != null) {
            this.f80481a = new k0.h(executor);
        } else {
            this.f80481a = executor;
        }
        this.f80482b = iVar;
        this.f80483c = cameraCharacteristics;
        this.f80495o = i2Var;
        this.f80496p = i2Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public final r0.k<byte[]> a(r0.k<byte[]> kVar, int i14) throws ImageCaptureException {
        k7.h.f(ImageUtil.c(kVar.e()), null);
        this.f80490j.getClass();
        Rect rectB = kVar.b();
        byte[] bArrC = kVar.c();
        try {
            Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArrC, 0, bArrC.length, false).decodeRegion(rectB, new BitmapFactory.Options());
            j0.g gVarD = kVar.d();
            Objects.requireNonNull(gVarD);
            Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
            int iF = kVar.f();
            Matrix matrixG = kVar.g();
            RectF rectF = j0.v.f95963a;
            Matrix matrix = new Matrix(matrixG);
            matrix.postTranslate(-rectB.left, -rectB.top);
            r0.b bVar = new r0.b(bitmapDecodeRegion, gVarD, 42, new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), rect, iF, matrix, kVar.a());
            l lVar = this.f80494n;
            if (lVar != null) {
                r0.i iVar = lVar.f80530a;
                r0.g gVar = new r0.g(new n0(bVar), 1);
                iVar.getClass();
                try {
                    androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
                    androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
                    aVar.f6080b = dVar;
                    aVar.f6079a = v.h.class;
                    try {
                        iVar.f148723a.execute(new r0.h(iVar, gVar, aVar));
                        aVar.f6079a = "InternalImageProcessor#process " + gVar.hashCode();
                    } catch (Exception e4) {
                        dVar.a(e4);
                    }
                    androidx.camera.core.e eVarA = ((b0.o0.a) dVar.f6084b.get()).a();
                    Objects.requireNonNull(eVarA);
                    androidx.camera.core.e.a[] aVarArrA2 = eVarA.A2();
                    int width = eVarA.getWidth();
                    int height = eVarA.getHeight();
                    k7.h.b(aVarArrA2.length == 1, "Expect a single plane");
                    k7.h.b(aVarArrA2[0].f() == 4, "Expect pixelStride=4");
                    k7.h.b(aVarArrA2[0].e() == width * 4, "Expect rowStride=width*4");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    aVarArrA2[0].d().rewind();
                    ImageProcessingUtil.f(bitmapCreateBitmap, aVarArrA2[0].d(), aVarArrA2[0].e());
                    j0.g gVarD2 = bVar.d();
                    Objects.requireNonNull(gVarD2);
                    bVar = new r0.b(bitmapCreateBitmap, gVarD2, 42, new Size(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), bVar.b(), bVar.f(), bVar.g(), bVar.a());
                } catch (Exception e14) {
                    e = e14;
                    if (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
                }
            }
            k kVar2 = this.f80488h;
            h0.a aVar2 = new h0.a(bVar, i14);
            kVar2.getClass();
            r0.k<Bitmap> kVarB = aVar2.b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            kVarB.c().compress(Bitmap.CompressFormat.JPEG, aVar2.a(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j0.g gVarD3 = kVarB.d();
            Objects.requireNonNull(gVarD3);
            return new r0.b(byteArray, gVarD3, (Build.VERSION.SDK_INT < 34 || !k.a.a(kVarB.c())) ? 256 : 4101, kVarB.h(), kVarB.b(), kVarB.f(), kVarB.g(), kVarB.a());
        } catch (IOException e15) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e15);
        }
    }

    public final androidx.camera.core.e b(b bVar) throws ImageCaptureException {
        j0 j0VarB = bVar.b();
        r0.k bVar2 = (r0.k) this.f80486f.a(bVar);
        List<Integer> list = this.f80485e.f80471d;
        k7.h.a(!list.isEmpty());
        int iIntValue = list.get(0).intValue();
        if ((bVar2.e() == 35 || this.f80494n != null || this.f80496p) && iIntValue == 256) {
            r0.k<byte[]> kVarA = (r0.k) this.f80487g.a(new d(bVar2, j0VarB.f80514g));
            if (this.f80494n != null) {
                kVarA = a(kVarA, j0VarB.f80514g);
            }
            this.f80492l.getClass();
            androidx.camera.core.g gVar = new androidx.camera.core.g(b0.q0.a(kVarA.h().getWidth(), kVarA.h().getHeight(), 256, 2));
            androidx.camera.core.e eVarB = ImageProcessingUtil.b(gVar, kVarA.c());
            gVar.e();
            Objects.requireNonNull(eVarB);
            j0.g gVarD = kVarA.d();
            Objects.requireNonNull(gVarD);
            Rect rectB = kVarA.b();
            int iF = kVarA.f();
            Matrix matrixG = kVarA.g();
            androidx.camera.core.impl.c0 c0VarA = kVarA.a();
            androidx.camera.core.b bVar3 = (androidx.camera.core.b) eVarB;
            Size size = new Size(bVar3.getWidth(), bVar3.getHeight());
            bVar3.getFormat();
            bVar2 = new r0.b(eVarB, gVarD, bVar3.getFormat(), size, rectB, iF, matrixG, c0VarA);
        }
        this.f80491k.getClass();
        androidx.camera.core.e eVar = (androidx.camera.core.e) bVar2.c();
        a1 a1Var = new a1(eVar, bVar2.h(), new b0.f(eVar.A0().a(), eVar.A0().getTimestamp(), bVar2.f(), bVar2.g(), eVar.A0().b()));
        a1Var.c(bVar2.b());
        if (list.size() > 1) {
            j0VarB.f80509b.n(a1Var.getFormat());
        }
        return a1Var;
    }

    public final b0.l0.i c(b bVar) throws Exception {
        List<Integer> list = this.f80485e.f80471d;
        k7.h.a(!list.isEmpty());
        Integer num = list.get(0);
        int iIntValue = num.intValue();
        k7.h.b(ImageUtil.c(iIntValue) || iIntValue == 32, "On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num);
        j0 j0VarB = bVar.b();
        b0.l0.h hVar = j0VarB.f80510c;
        v0 v0Var = j0VarB.f80509b;
        int i14 = j0VarB.f80514g;
        b0.l0.h hVar2 = j0VarB.f80511d;
        k7.h.b(hVar != null, "OutputFileOptions cannot be empty");
        r0.k<androidx.camera.core.e> kVar = (r0.k) this.f80486f.a(bVar);
        if (list.size() <= 1) {
            if (iIntValue != 32) {
                Objects.requireNonNull(hVar);
                return d(kVar, hVar, i14);
            }
            Objects.requireNonNull(hVar);
            return e(kVar, hVar);
        }
        k7.h.b((hVar == null || hVar2 == null) ? false : true, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (kVar.e() != 32) {
            Objects.requireNonNull(hVar2);
            b0.l0.i iVarD = d(kVar, hVar2, i14);
            v0Var.n(256);
            return iVarD;
        }
        Objects.requireNonNull(hVar);
        b0.l0.i iVarE = e(kVar, hVar);
        v0Var.n(32);
        return iVarE;
    }

    public final b0.l0.i d(r0.k<androidx.camera.core.e> kVar, b0.l0.h hVar, int i14) throws ImageCaptureException {
        r0.k<byte[]> kVarA = (r0.k) this.f80487g.a(new d(kVar, i14));
        if (j0.v.c(kVarA.b(), kVarA.h()) || this.f80494n != null) {
            kVarA = a(kVarA, i14);
        }
        a0 a0Var = this.f80489i;
        e eVar = new e(kVarA, hVar);
        a0Var.getClass();
        r0.k<byte[]> kVarB = eVar.b();
        b0.l0.h hVarA = eVar.a();
        File fileE = u.e(hVarA);
        byte[] bArrC = kVarB.c();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
            try {
                fileOutputStream.write(bArrC, 0, new p0.c().a(bArrC));
                fileOutputStream.close();
                j0.g gVarD = kVarB.d();
                Objects.requireNonNull(gVarD);
                int iF = kVarB.f();
                try {
                    j0.g gVarB = j0.g.b(fileE);
                    gVarD.a(gVarB);
                    if (gVarB.d() == 0 && iF != 0) {
                        d8.a aVar = gVarB.f95918a;
                        if (iF % 90 != 0) {
                            Locale locale = Locale.US;
                            aVar.G("Orientation", String.valueOf(0));
                        } else {
                            int i15 = iF % 360;
                            int iD = aVar.d(0, "Orientation");
                            while (i15 < 0) {
                                i15 += 90;
                                switch (iD) {
                                    case 2:
                                        iD = 5;
                                        break;
                                    case 3:
                                    case 8:
                                        iD = 6;
                                        break;
                                    case 4:
                                        iD = 7;
                                        break;
                                    case 5:
                                        iD = 4;
                                        break;
                                    case 6:
                                        iD = 1;
                                        break;
                                    case 7:
                                        iD = 2;
                                        break;
                                    default:
                                        iD = 8;
                                        break;
                                }
                            }
                            while (i15 > 0) {
                                i15 -= 90;
                                switch (iD) {
                                    case 2:
                                        iD = 7;
                                        break;
                                    case 3:
                                        iD = 8;
                                        break;
                                    case 4:
                                        iD = 5;
                                        break;
                                    case 5:
                                        iD = 2;
                                        break;
                                    case 6:
                                        iD = 3;
                                        break;
                                    case 7:
                                        iD = 4;
                                        break;
                                    case 8:
                                        iD = 1;
                                        break;
                                    default:
                                        iD = 6;
                                        break;
                                }
                            }
                            aVar.G("Orientation", String.valueOf(iD));
                        }
                    }
                    hVarA.f14033f.getClass();
                    gVarB.e();
                    return new b0.l0.i(u.f(fileE, hVarA), 256);
                } catch (IOException e4) {
                    throw new ImageCaptureException(1, "Failed to update Exif data", e4);
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e14) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e14);
        }
    }

    public final b0.l0.i e(r0.k<androidx.camera.core.e> kVar, b0.l0.h hVar) throws Exception {
        int i14 = 0;
        if (this.f80484d == null) {
            CameraCharacteristics cameraCharacteristics = this.f80483c;
            if (cameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (kVar.a().g() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultG = kVar.a().g();
            Objects.requireNonNull(captureResultG);
            this.f80484d = new t(cameraCharacteristics, captureResultG);
        }
        t tVar = this.f80484d;
        c cVar = new c(kVar.c(), kVar.f(), hVar);
        tVar.getClass();
        b0.l0.h hVar2 = cVar.f80459c;
        File fileE = u.e(hVar2);
        androidx.camera.core.e eVar = cVar.f80457a;
        DngCreator dngCreator = tVar.f80572a;
        try {
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                        int i15 = cVar.f80458b;
                        if (i15 == 0) {
                            i14 = 1;
                        } else if (i15 == 90) {
                            i14 = 6;
                        } else if (i15 == 180) {
                            i14 = 3;
                        } else if (i15 == 270) {
                            i14 = 8;
                        }
                        try {
                            dngCreator.setOrientation(i14);
                            dngCreator.writeImage(fileOutputStream, eVar.getImage());
                            fileOutputStream.close();
                            eVar.close();
                            return new b0.l0.i(u.f(fileE, hVar2), 32);
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IllegalStateException e4) {
                        throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e4);
                    }
                } catch (IOException e14) {
                    throw new ImageCaptureException(1, "Failed to write to temp file", e14);
                }
            } catch (IllegalArgumentException e15) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e15);
            }
        } catch (Throwable th5) {
            eVar.close();
            throw th5;
        }
    }

    public i0(Executor executor, CameraCharacteristics cameraCharacteristics, r0.i iVar) {
        this(executor, cameraCharacteristics, iVar, o0.a.f128480a);
    }

    public i0(Executor executor, i2 i2Var, CameraCharacteristics cameraCharacteristics) {
        this(executor, cameraCharacteristics, null, i2Var);
    }

    public i0(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this(executor, cameraCharacteristics, null, o0.a.f128480a);
    }
}
