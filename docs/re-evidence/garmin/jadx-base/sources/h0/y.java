package h0;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f80584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p0.b f80585g = new p0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f80586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.v0 f80587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f80588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f80589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f80590e;

    public y(l1 l1Var, Size size, CameraCharacteristics cameraCharacteristics, b0.l lVar, boolean z14, e0 e0Var) {
        int iIntValue;
        androidx.camera.core.impl.s sVarA;
        androidx.camera.core.impl.s sVarA2;
        androidx.camera.core.f fVar;
        o1 o1Var;
        k7.b bVar;
        int i14;
        androidx.camera.core.f fVar2;
        j0.u.a();
        this.f80586a = l1Var;
        androidx.camera.core.impl.v0.b bVar2 = (androidx.camera.core.impl.v0.b) l1Var.f(b3.f5511x, null);
        if (bVar2 == null) {
            androidx.room.a0.s(l1Var.j(l1Var.toString()), "Implementation is missing option unpacker for ");
            throw null;
        }
        androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
        bVar2.a(l1Var, aVar);
        this.f80587b = aVar.e();
        final s sVar = new s();
        this.f80588c = sVar;
        Executor executor = (Executor) l1Var.f(m0.f.J, k0.b.c());
        Objects.requireNonNull(executor);
        final i0 i0Var = new i0(executor, cameraCharacteristics, lVar != null ? new r0.i(lVar) : null);
        this.f80589d = i0Var;
        ArrayList arrayList = new ArrayList();
        if (l1Var.Q() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            Integer num = (Integer) l1Var.f(l1.R, null);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer num2 = (Integer) l1Var.f(m1.f5632h, null);
                iIntValue = (num2 == null || num2.intValue() != 4101) ? (num2 == null || num2.intValue() != 32) ? 256 : 32 : 4101;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        b bVar3 = new b(size, l1Var.z(), arrayList, z14, (b0.p0) l1Var.f(l1.T, null), e0Var, new r0.f(), new r0.f());
        this.f80590e = bVar3;
        final int i15 = 1;
        k7.h.f(sVar.f80561f == null && sVar.f80557b == null, "CaptureNode does not support recreation yet.");
        sVar.f80561f = bVar3;
        r rVar = new r(sVar);
        List<Integer> list = bVar3.f80451h;
        boolean z15 = list.size() > 1;
        final int i16 = 2;
        b0.p0 p0Var = bVar3.f80453j;
        Size size2 = bVar3.f80449f;
        androidx.camera.core.f fVar3 = null;
        int i17 = bVar3.f80450g;
        if (bVar3.f80452i || p0Var != null) {
            d0 d0Var = new d0(p0Var != null ? p0Var.newInstance() : b0.q0.a(size2.getWidth(), size2.getHeight(), i17, 4));
            sVar.f80562g = d0Var;
            sVarA = rVar;
            sVarA2 = null;
            fVar = null;
            bVar = new k7.b() { // from class: h0.o
                @Override // k7.b
                public final void accept(Object obj) {
                    switch (i15) {
                        case 0:
                            sVar.c((j0) obj);
                            break;
                        case 1:
                            j0 j0Var = (j0) obj;
                            s sVar2 = sVar;
                            sVar2.c(j0Var);
                            d0 d0Var2 = sVar2.f80562g;
                            k7.h.f(d0Var2.f80463b == null, "Pending request should be null");
                            d0Var2.f80463b = j0Var;
                            break;
                        default:
                            sVar.d((p0.a) obj);
                            break;
                    }
                }
            };
            o1Var = d0Var;
        } else {
            if (z15) {
                i14 = 0;
                androidx.camera.core.f fVar4 = new androidx.camera.core.f(size2.getWidth(), size2.getHeight(), 256, 4);
                androidx.camera.core.impl.s sVarA3 = androidx.camera.core.impl.t.a(rVar, fVar4.f5442b);
                androidx.camera.core.f fVar5 = new androidx.camera.core.f(size2.getWidth(), size2.getHeight(), 32, 4);
                sVarA2 = androidx.camera.core.impl.t.a(rVar, fVar5.f5442b);
                sVarA = sVarA3;
                fVar3 = fVar5;
                fVar2 = fVar4;
            } else {
                i14 = 0;
                androidx.camera.core.f fVar6 = new androidx.camera.core.f(size2.getWidth(), size2.getHeight(), i17, 4);
                sVarA = androidx.camera.core.impl.t.a(rVar, fVar6.f5442b);
                sVarA2 = null;
                fVar2 = fVar6;
            }
            final int i18 = i14;
            k7.b bVar4 = new k7.b() { // from class: h0.o
                @Override // k7.b
                public final void accept(Object obj) {
                    switch (i18) {
                        case 0:
                            sVar.c((j0) obj);
                            break;
                        case 1:
                            j0 j0Var = (j0) obj;
                            s sVar2 = sVar;
                            sVar2.c(j0Var);
                            d0 d0Var2 = sVar2.f80562g;
                            k7.h.f(d0Var2.f80463b == null, "Pending request should be null");
                            d0Var2.f80463b = j0Var;
                            break;
                        default:
                            sVar.d((p0.a) obj);
                            break;
                    }
                }
            };
            fVar = fVar3;
            bVar = bVar4;
            o1Var = fVar2;
        }
        bVar3.f80565a = sVarA;
        if (z15 && sVarA2 != null) {
            bVar3.f80566b = sVarA2;
        }
        Surface surface = o1Var.getSurface();
        Objects.requireNonNull(surface);
        k7.h.f(bVar3.f80567c == null, "The surface is already set.");
        bVar3.f80567c = new p1(surface, size2, i17);
        sVar.f80557b = new androidx.camera.core.g(o1Var);
        final int i19 = 1;
        o1Var.d(new o1.a() { // from class: h0.p
            @Override // androidx.camera.core.impl.o1.a
            public final void a(o1 o1Var2) throws Exception {
                switch (i19) {
                    case 0:
                        s sVar2 = sVar;
                        try {
                            androidx.camera.core.e eVarB = o1Var2.b();
                            if (eVarB != null) {
                                if (sVar2.f80556a == null) {
                                    eVarB.close();
                                } else {
                                    g gVar = sVar2.f80560e;
                                    Objects.requireNonNull(gVar);
                                    gVar.f80469b.accept(new h(sVar2.f80556a, eVarB));
                                }
                            }
                        } catch (IllegalStateException unused) {
                            return;
                        }
                        break;
                    default:
                        s sVar3 = sVar;
                        try {
                            androidx.camera.core.e eVarB2 = o1Var2.b();
                            if (eVarB2 != null) {
                                sVar3.b(eVarB2);
                            } else {
                                j0 j0Var = sVar3.f80556a;
                                if (j0Var != null) {
                                    sVar3.d(new i(j0Var.f80508a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                                }
                            }
                        } catch (IllegalStateException e4) {
                            j0 j0Var2 = sVar3.f80556a;
                            if (j0Var2 != null) {
                                sVar3.d(new i(j0Var2.f80508a, new ImageCaptureException(2, "Failed to acquire latest image", e4)));
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
        }, k0.b.d());
        e0 e0Var2 = bVar3.f80454k;
        if (e0Var2 != null) {
            o1 o1VarNewInstance = p0Var != null ? p0Var.newInstance() : b0.q0.a(e0Var2.b().getWidth(), e0Var2.b().getHeight(), e0Var2.a(), 4);
            final int i24 = 0;
            o1VarNewInstance.d(new o1.a() { // from class: h0.p
                @Override // androidx.camera.core.impl.o1.a
                public final void a(o1 o1Var2) throws Exception {
                    switch (i24) {
                        case 0:
                            s sVar2 = sVar;
                            try {
                                androidx.camera.core.e eVarB = o1Var2.b();
                                if (eVarB != null) {
                                    if (sVar2.f80556a == null) {
                                        eVarB.close();
                                    } else {
                                        g gVar = sVar2.f80560e;
                                        Objects.requireNonNull(gVar);
                                        gVar.f80469b.accept(new h(sVar2.f80556a, eVarB));
                                    }
                                }
                            } catch (IllegalStateException unused) {
                                return;
                            }
                            break;
                        default:
                            s sVar3 = sVar;
                            try {
                                androidx.camera.core.e eVarB2 = o1Var2.b();
                                if (eVarB2 != null) {
                                    sVar3.b(eVarB2);
                                } else {
                                    j0 j0Var = sVar3.f80556a;
                                    if (j0Var != null) {
                                        sVar3.d(new i(j0Var.f80508a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                                    }
                                }
                            } catch (IllegalStateException e4) {
                                j0 j0Var2 = sVar3.f80556a;
                                if (j0Var2 != null) {
                                    sVar3.d(new i(j0Var2.f80508a, new ImageCaptureException(2, "Failed to acquire latest image", e4)));
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                }
            }, k0.b.d());
            sVar.f80559d = new androidx.camera.core.g(o1VarNewInstance);
            bVar3.f80569e = new p1(o1VarNewInstance.getSurface(), e0Var2.b(), e0Var2.a());
        }
        if (z15 && fVar != null) {
            Surface surface2 = fVar.getSurface();
            k7.h.f(bVar3.f80568d == null, "The secondary surface is already set.");
            bVar3.f80568d = new p1(surface2, size2, i17);
            sVar.f80558c = new androidx.camera.core.g(fVar);
            final int i25 = 1;
            fVar.d(new o1.a() { // from class: h0.p
                @Override // androidx.camera.core.impl.o1.a
                public final void a(o1 o1Var2) throws Exception {
                    switch (i25) {
                        case 0:
                            s sVar2 = sVar;
                            try {
                                androidx.camera.core.e eVarB = o1Var2.b();
                                if (eVarB != null) {
                                    if (sVar2.f80556a == null) {
                                        eVarB.close();
                                    } else {
                                        g gVar = sVar2.f80560e;
                                        Objects.requireNonNull(gVar);
                                        gVar.f80469b.accept(new h(sVar2.f80556a, eVarB));
                                    }
                                }
                            } catch (IllegalStateException unused) {
                                return;
                            }
                            break;
                        default:
                            s sVar3 = sVar;
                            try {
                                androidx.camera.core.e eVarB2 = o1Var2.b();
                                if (eVarB2 != null) {
                                    sVar3.b(eVarB2);
                                } else {
                                    j0 j0Var = sVar3.f80556a;
                                    if (j0Var != null) {
                                        sVar3.d(new i(j0Var.f80508a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                                    }
                                }
                            } catch (IllegalStateException e4) {
                                j0 j0Var2 = sVar3.f80556a;
                                if (j0Var2 != null) {
                                    sVar3.d(new i(j0Var2.f80508a, new ImageCaptureException(2, "Failed to acquire latest image", e4)));
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                }
            }, k0.b.d());
        }
        bVar3.f80455l.f148718a = bVar;
        bVar3.f80456m.f148718a = new k7.b() { // from class: h0.o
            @Override // k7.b
            public final void accept(Object obj) {
                switch (i16) {
                    case 0:
                        sVar.c((j0) obj);
                        break;
                    case 1:
                        j0 j0Var = (j0) obj;
                        s sVar2 = sVar;
                        sVar2.c(j0Var);
                        d0 d0Var2 = sVar2.f80562g;
                        k7.h.f(d0Var2.f80463b == null, "Pending request should be null");
                        d0Var2.f80463b = j0Var;
                        break;
                    default:
                        sVar.d((p0.a) obj);
                        break;
                }
            }
        };
        g gVar = new g(new r0.f(), new r0.f(), i17, list);
        sVar.f80560e = gVar;
        i0Var.f80485e = gVar;
        final int i26 = 0;
        gVar.f80468a.f148718a = new k7.b() { // from class: h0.g0
            @Override // k7.b
            public final void accept(Object obj) throws Exception {
                final i0.b bVar5 = (i0.b) obj;
                switch (i26) {
                    case 0:
                        if (!((k0) bVar5.b().f80516i).f80527g) {
                            final i0 i0Var2 = i0Var;
                            final int i27 = 1;
                            i0Var2.f80481a.execute(new Runnable() { // from class: h0.h0
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i27) {
                                        case 0:
                                            i0 i0Var3 = i0Var2;
                                            i0.b bVar6 = bVar5;
                                            j0 j0VarB = bVar6.b();
                                            try {
                                                r0.k kVar = (r0.k) i0Var3.f80486f.a(bVar6);
                                                int iE = kVar.e();
                                                k7.h.b(iE == 35 || iE == 256 || iE == 4101, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + iE);
                                                k0.b.d().execute(new df.d(28, j0VarB, (Bitmap) i0Var3.f80493m.a(kVar)));
                                            } catch (Exception unused) {
                                                bVar6.a().close();
                                                return;
                                            }
                                            break;
                                        default:
                                            i0 i0Var4 = i0Var2;
                                            i0.b bVar7 = bVar5;
                                            j0 j0VarB2 = bVar7.b();
                                            try {
                                                boolean z16 = true;
                                                if (i0Var4.f80485e.f80471d.size() <= 1) {
                                                    z16 = false;
                                                }
                                                j0 j0VarB3 = bVar7.b();
                                                if (j0VarB3.f80510c == null && j0VarB3.f80511d == null) {
                                                    k0.b.d().execute(new df.d(26, j0VarB2, i0Var4.b(bVar7)));
                                                } else {
                                                    b0.l0.i iVarC = i0Var4.c(bVar7);
                                                    if (!z16 || j0VarB2.f80509b.l()) {
                                                        k0.b.d().execute(new df.d(27, j0VarB2, iVarC));
                                                    }
                                                }
                                            } catch (ImageCaptureException e4) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, e4));
                                                return;
                                            } catch (OutOfMemoryError e14) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed due to low memory.", e14)));
                                                return;
                                            } catch (RuntimeException e15) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed.", e15)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            bVar5.a().close();
                        }
                        break;
                    default:
                        if (!((k0) bVar5.b().f80516i).f80527g) {
                            final i0 i0Var3 = i0Var;
                            final int i28 = 0;
                            i0Var3.f80481a.execute(new Runnable() { // from class: h0.h0
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i28) {
                                        case 0:
                                            i0 i0Var4 = i0Var3;
                                            i0.b bVar6 = bVar5;
                                            j0 j0VarB = bVar6.b();
                                            try {
                                                r0.k kVar = (r0.k) i0Var4.f80486f.a(bVar6);
                                                int iE = kVar.e();
                                                k7.h.b(iE == 35 || iE == 256 || iE == 4101, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + iE);
                                                k0.b.d().execute(new df.d(28, j0VarB, (Bitmap) i0Var4.f80493m.a(kVar)));
                                            } catch (Exception unused) {
                                                bVar6.a().close();
                                                return;
                                            }
                                            break;
                                        default:
                                            i0 i0Var5 = i0Var3;
                                            i0.b bVar7 = bVar5;
                                            j0 j0VarB2 = bVar7.b();
                                            try {
                                                boolean z16 = true;
                                                if (i0Var5.f80485e.f80471d.size() <= 1) {
                                                    z16 = false;
                                                }
                                                j0 j0VarB3 = bVar7.b();
                                                if (j0VarB3.f80510c == null && j0VarB3.f80511d == null) {
                                                    k0.b.d().execute(new df.d(26, j0VarB2, i0Var5.b(bVar7)));
                                                } else {
                                                    b0.l0.i iVarC = i0Var5.c(bVar7);
                                                    if (!z16 || j0VarB2.f80509b.l()) {
                                                        k0.b.d().execute(new df.d(27, j0VarB2, iVarC));
                                                    }
                                                }
                                            } catch (ImageCaptureException e4) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, e4));
                                                return;
                                            } catch (OutOfMemoryError e14) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed due to low memory.", e14)));
                                                return;
                                            } catch (RuntimeException e15) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed.", e15)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            bVar5.a().close();
                        }
                        break;
                }
            }
        };
        final int i27 = 1;
        gVar.f80469b.f148718a = new k7.b() { // from class: h0.g0
            @Override // k7.b
            public final void accept(Object obj) throws Exception {
                final i0.b bVar5 = (i0.b) obj;
                switch (i27) {
                    case 0:
                        if (!((k0) bVar5.b().f80516i).f80527g) {
                            final i0 i0Var2 = i0Var;
                            final int i28 = 1;
                            i0Var2.f80481a.execute(new Runnable() { // from class: h0.h0
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i28) {
                                        case 0:
                                            i0 i0Var4 = i0Var2;
                                            i0.b bVar6 = bVar5;
                                            j0 j0VarB = bVar6.b();
                                            try {
                                                r0.k kVar = (r0.k) i0Var4.f80486f.a(bVar6);
                                                int iE = kVar.e();
                                                k7.h.b(iE == 35 || iE == 256 || iE == 4101, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + iE);
                                                k0.b.d().execute(new df.d(28, j0VarB, (Bitmap) i0Var4.f80493m.a(kVar)));
                                            } catch (Exception unused) {
                                                bVar6.a().close();
                                                return;
                                            }
                                            break;
                                        default:
                                            i0 i0Var5 = i0Var2;
                                            i0.b bVar7 = bVar5;
                                            j0 j0VarB2 = bVar7.b();
                                            try {
                                                boolean z16 = true;
                                                if (i0Var5.f80485e.f80471d.size() <= 1) {
                                                    z16 = false;
                                                }
                                                j0 j0VarB3 = bVar7.b();
                                                if (j0VarB3.f80510c == null && j0VarB3.f80511d == null) {
                                                    k0.b.d().execute(new df.d(26, j0VarB2, i0Var5.b(bVar7)));
                                                } else {
                                                    b0.l0.i iVarC = i0Var5.c(bVar7);
                                                    if (!z16 || j0VarB2.f80509b.l()) {
                                                        k0.b.d().execute(new df.d(27, j0VarB2, iVarC));
                                                    }
                                                }
                                            } catch (ImageCaptureException e4) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, e4));
                                                return;
                                            } catch (OutOfMemoryError e14) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed due to low memory.", e14)));
                                                return;
                                            } catch (RuntimeException e15) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed.", e15)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            bVar5.a().close();
                        }
                        break;
                    default:
                        if (!((k0) bVar5.b().f80516i).f80527g) {
                            final i0 i0Var3 = i0Var;
                            final int i29 = 0;
                            i0Var3.f80481a.execute(new Runnable() { // from class: h0.h0
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
                                    switch (i29) {
                                        case 0:
                                            i0 i0Var4 = i0Var3;
                                            i0.b bVar6 = bVar5;
                                            j0 j0VarB = bVar6.b();
                                            try {
                                                r0.k kVar = (r0.k) i0Var4.f80486f.a(bVar6);
                                                int iE = kVar.e();
                                                k7.h.b(iE == 35 || iE == 256 || iE == 4101, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + iE);
                                                k0.b.d().execute(new df.d(28, j0VarB, (Bitmap) i0Var4.f80493m.a(kVar)));
                                            } catch (Exception unused) {
                                                bVar6.a().close();
                                                return;
                                            }
                                            break;
                                        default:
                                            i0 i0Var5 = i0Var3;
                                            i0.b bVar7 = bVar5;
                                            j0 j0VarB2 = bVar7.b();
                                            try {
                                                boolean z16 = true;
                                                if (i0Var5.f80485e.f80471d.size() <= 1) {
                                                    z16 = false;
                                                }
                                                j0 j0VarB3 = bVar7.b();
                                                if (j0VarB3.f80510c == null && j0VarB3.f80511d == null) {
                                                    k0.b.d().execute(new df.d(26, j0VarB2, i0Var5.b(bVar7)));
                                                } else {
                                                    b0.l0.i iVarC = i0Var5.c(bVar7);
                                                    if (!z16 || j0VarB2.f80509b.l()) {
                                                        k0.b.d().execute(new df.d(27, j0VarB2, iVarC));
                                                    }
                                                }
                                            } catch (ImageCaptureException e4) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, e4));
                                                return;
                                            } catch (OutOfMemoryError e14) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed due to low memory.", e14)));
                                                return;
                                            } catch (RuntimeException e15) {
                                                k0.b.d().execute(new df.d(29, j0VarB2, new ImageCaptureException(0, "Processing failed.", e15)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            bVar5.a().close();
                        }
                        break;
                }
            }
        };
        i0Var.f80486f = new f0();
        i0Var.f80487g = new w(i0Var.f80495o);
        i0Var.f80490j = new z();
        i0Var.f80488h = new k();
        i0Var.f80489i = new a0();
        i0Var.f80491k = new c0();
        i0Var.f80493m = new v();
        int i28 = gVar.f80470c;
        r0.i iVar = i0Var.f80482b;
        if (i28 == 35 || iVar != null || i0Var.f80496p) {
            i0Var.f80492l = new b0();
        }
        if (iVar != null) {
            i0Var.f80494n = new l(iVar);
        }
    }

    public final void a() {
        p1 p1Var;
        j0.u.a();
        s sVar = this.f80588c;
        sVar.getClass();
        j0.u.a();
        b bVar = sVar.f80561f;
        Objects.requireNonNull(bVar);
        final androidx.camera.core.g gVar = sVar.f80557b;
        Objects.requireNonNull(gVar);
        final androidx.camera.core.g gVar2 = sVar.f80558c;
        final androidx.camera.core.g gVar3 = sVar.f80559d;
        p1 p1Var2 = bVar.f80567c;
        Objects.requireNonNull(p1Var2);
        p1Var2.a();
        p1 p1Var3 = bVar.f80567c;
        Objects.requireNonNull(p1Var3);
        final int i14 = 0;
        l0.j.f(p1Var3.f5471e).addListener(new Runnable() { // from class: h0.q
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        gVar.e();
                        break;
                    case 1:
                        androidx.camera.core.g gVar4 = gVar;
                        if (gVar4 != null) {
                            gVar4.e();
                        }
                        break;
                    default:
                        androidx.camera.core.g gVar5 = gVar;
                        if (gVar5 != null) {
                            gVar5.e();
                        }
                        break;
                }
            }
        }, k0.b.d());
        p1 p1Var4 = bVar.f80569e;
        if (p1Var4 != null) {
            p1Var4.a();
            final int i15 = 1;
            l0.j.f(bVar.f80569e.f5471e).addListener(new Runnable() { // from class: h0.q
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            gVar3.e();
                            break;
                        case 1:
                            androidx.camera.core.g gVar4 = gVar3;
                            if (gVar4 != null) {
                                gVar4.e();
                            }
                            break;
                        default:
                            androidx.camera.core.g gVar5 = gVar3;
                            if (gVar5 != null) {
                                gVar5.e();
                            }
                            break;
                    }
                }
            }, k0.b.d());
        }
        if (bVar.f80451h.size() > 1 && (p1Var = bVar.f80568d) != null) {
            p1Var.a();
            final int i16 = 2;
            l0.j.f(bVar.f80568d.f5471e).addListener(new Runnable() { // from class: h0.q
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            gVar2.e();
                            break;
                        case 1:
                            androidx.camera.core.g gVar4 = gVar2;
                            if (gVar4 != null) {
                                gVar4.e();
                            }
                            break;
                        default:
                            androidx.camera.core.g gVar5 = gVar2;
                            if (gVar5 != null) {
                                gVar5.e();
                            }
                            break;
                    }
                }
            }, k0.b.d());
        }
        this.f80589d.getClass();
    }

    public y(l1 l1Var, Size size, CameraCharacteristics cameraCharacteristics, b0.l lVar, boolean z14) {
        this(l1Var, size, cameraCharacteristics, lVar, z14, null);
    }

    public y(l1 l1Var, Size size, CameraCharacteristics cameraCharacteristics) {
        this(l1Var, size, cameraCharacteristics, null, false, null);
    }
}
