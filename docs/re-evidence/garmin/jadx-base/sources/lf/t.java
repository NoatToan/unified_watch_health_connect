package lf;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Size;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.math.MathKt;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Llf/t;", "Llf/h;", "Landroid/graphics/ImageDecoder$Source;", "source", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lwf/m;", "options", "Lz53/d;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lwf/m;Lz53/d;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageDecoder.Source f112118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoCloseable f112119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wf.m f112120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z53.d f112121d;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @v13.e(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.d f112123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f112124b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112126d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f112124b = obj;
            this.f112126d |= Integer.MIN_VALUE;
            return t.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    public static final class c implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0 f112128b;

        public c(m0 m0Var) {
            this.f112128b = m0Var;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            t tVar = t.this;
            wf.m mVar = tVar.f112120c;
            wf.m mVar2 = tVar.f112120c;
            long jA = g.a(width, height, mVar.f184997b, mVar.f184998c, (xf.g) hf.g.b(mVar, wf.g.f184982b));
            int i14 = (int) (jA >> 32);
            int i15 = (int) (jA & 4294967295L);
            if (width > 0 && height > 0 && (width != i14 || height != i15)) {
                double dB = g.b(width, height, i14, i15, mVar2.f184998c);
                boolean z14 = dB < 1.0d;
                this.f112128b.f105804a = z14;
                if (z14 || mVar2.f184999d == xf.c.EXACT) {
                    imageDecoder.setTargetSize(MathKt.b(((double) width) * dB), MathKt.b(dB * ((double) height)));
                }
            }
            imageDecoder.setOnPartialImageListener(new s());
            imageDecoder.setAllocator(wf.h.b(mVar2) == Bitmap.Config.HARDWARE ? 3 : 1);
            imageDecoder.setMemorySizePolicy(!((Boolean) hf.g.b(mVar2, wf.h.f184991g)).booleanValue() ? 1 : 0);
            hf.f.c<ColorSpace> cVar = wf.h.f184987c;
            if (((ColorSpace) hf.g.b(mVar2, cVar)) != null) {
                imageDecoder.setTargetColorSpace((ColorSpace) hf.g.b(mVar2, cVar));
            }
            imageDecoder.setUnpremultipliedRequired(!((Boolean) hf.g.b(mVar2, wf.h.f184988d)).booleanValue());
        }
    }

    public t(ImageDecoder.Source source, AutoCloseable autoCloseable, wf.m mVar, z53.d dVar) {
        this.f112118a = source;
        this.f112119b = autoCloseable;
        this.f112120c = mVar;
        this.f112121d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lf.h
    public final Object a(t13.d<? super f> dVar) {
        b bVar;
        z53.d dVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f112126d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f112126d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f112124b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f112126d;
        if (i15 == 0) {
            o13.r.b(obj);
            z53.d dVar3 = this.f112121d;
            bVar.f112123a = dVar3;
            bVar.f112126d = 1;
            if (dVar3.b(bVar) == aVar) {
                return aVar;
            }
            dVar2 = dVar3;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar2 = bVar.f112123a;
            o13.r.b(obj);
        }
        try {
            AutoCloseable autoCloseable = this.f112119b;
            try {
                m0 m0Var = new m0();
                f fVar = new f(hf.m.c(ImageDecoder.decodeBitmap(this.f112118a, new c(m0Var))), m0Var.f105804a);
                zf.b.h(autoCloseable, null);
                dVar2.release();
                return fVar;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zf.b.h(autoCloseable, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            dVar2.release();
            throw th5;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llf/t$a;", "Llf/h$a;", "Lz53/d;", "parallelismLock", "<init>", "(Lz53/d;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z53.d f112122a;

        public /* synthetic */ a(z53.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? z53.h.a(4) : dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0081  */
        /* JADX WARN: Code duplicated, block: B:27:0x0085  */
        /* JADX WARN: Code duplicated, block: B:28:0x008e  */
        @Override // lf.h.a
        public final h a(nf.o oVar, wf.m mVar) {
            ImageDecoder.Source sourceCreateSource;
            y yVarB3;
            Bitmap.Config configB = wf.h.b(mVar);
            Context context = mVar.f184996a;
            if (configB == Bitmap.Config.ARGB_8888 || configB == Bitmap.Config.HARDWARE) {
                o oVar2 = oVar.f125762a;
                if (oVar2.getF112113a() != w63.l.f183387a || (yVarB3 = oVar2.b3()) == null) {
                    o.a f112114b = oVar2.getF112114b();
                    if (f112114b instanceof lf.a) {
                        sourceCreateSource = ImageDecoder.createSource(context.getAssets(), ((lf.a) f112114b).f112069a);
                    } else if ((f112114b instanceof d) && Build.VERSION.SDK_INT >= 29) {
                        try {
                            AssetFileDescriptor assetFileDescriptor = ((d) f112114b).f112084a;
                            Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                            sourceCreateSource = ImageDecoder.createSource(new a73.h(assetFileDescriptor, 7));
                        } catch (ErrnoException unused) {
                            sourceCreateSource = null;
                        }
                    } else if (f112114b instanceof q) {
                        q qVar = (q) f112114b;
                        if (p005kotlin.jvm.internal.s.g(qVar.f112111a, context.getPackageName())) {
                            sourceCreateSource = ImageDecoder.createSource(context.getResources(), qVar.f112112b);
                        } else if (f112114b instanceof lf.c) {
                            sourceCreateSource = ImageDecoder.createSource(((lf.c) f112114b).f112083a);
                        } else {
                            sourceCreateSource = null;
                        }
                    } else if (f112114b instanceof lf.c) {
                        sourceCreateSource = ImageDecoder.createSource(((lf.c) f112114b).f112083a);
                    } else {
                        sourceCreateSource = null;
                    }
                } else {
                    sourceCreateSource = ImageDecoder.createSource(yVarB3.toFile());
                }
                if (sourceCreateSource != null) {
                    return new t(sourceCreateSource, oVar.f125762a, mVar, this.f112122a);
                }
            }
            return null;
        }

        public a(z53.d dVar) {
            this.f112122a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
