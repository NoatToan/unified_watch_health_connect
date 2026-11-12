package hj;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.firebase.messaging.l;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import qj.m;

/* JADX INFO: loaded from: classes7.dex */
public class a implements ui.j<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1660a f83913f = new C1660a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f83914g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f83916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f83917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1660a f83918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hj.b f83919e;

    /* JADX INFO: renamed from: hj.a$a, reason: collision with other inner class name */
    public static class C1660a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f83920a;

        public b() {
            char[] cArr = m.f144982a;
            this.f83920a = new ArrayDeque(0);
        }

        public final synchronized void a(si.d dVar) {
            dVar.f159337b = null;
            dVar.f159338c = null;
            this.f83920a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.b.b(context).f28456d.a().e(), com.bumptech.glide.b.b(context).f28454b, com.bumptech.glide.b.b(context).f28457e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // ui.j
    public final wi.u<hj.c> a(java.nio.ByteBuffer r8, int r9, int r10, ui.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            hj.a$b r8 = r7.f83917c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f83920a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            si.d r0 = (si.d) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            si.d r0 = new si.d     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f159337b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f159336a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            si.c r0 = new si.c     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f159338c = r0     // Catch: java.lang.Throwable -> L54
            r5.f159339d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f159337b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f159337b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            hj.e r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            hj.a$b r9 = r1.f83917c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            hj.a$b r9 = r1.f83917c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.a.a(java.lang.Object, int, int, ui.h):wi.u");
    }

    @Override // ui.j
    public final boolean b(ByteBuffer byteBuffer, ui.h hVar) {
        ImageHeaderParser.ImageType imageTypeD;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) hVar.c(i.f83959b)).booleanValue()) {
            return false;
        }
        if (byteBuffer2 == null) {
            imageTypeD = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            imageTypeD = com.bumptech.glide.load.a.d(this.f83916b, new com.bumptech.glide.load.b(byteBuffer2));
        }
        return imageTypeD == ImageHeaderParser.ImageType.GIF;
    }

    public final e c(ByteBuffer byteBuffer, int i14, int i15, si.d dVar, ui.h hVar) {
        boolean zIsLoggable;
        Bitmap.Config config;
        int i16 = qj.h.f144972a;
        SystemClock.elapsedRealtimeNanos();
        try {
            si.c cVarB = dVar.b();
            if (cVarB.f159327c > 0 && cVarB.f159326b == 0) {
                Bitmap.Config config2 = hVar.c(i.f83958a) == ui.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(cVarB.f159331g / i15, cVarB.f159330f / i14);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                C1660a c1660a = this.f83918d;
                hj.b bVar = this.f83919e;
                c1660a.getClass();
                si.e eVar = new si.e(bVar, cVarB, byteBuffer, iMax);
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                if (config2 == config3 || config2 == (config = Bitmap.Config.RGB_565)) {
                    eVar.f159359t = config2;
                } else {
                    l.k(config2, "Unsupported format: ", ", must be one of ", config3, " or ", config);
                }
                eVar.f();
                Bitmap bitmapB = eVar.b();
                if (bitmapB != null) {
                    return new e(new c(this.f83915a, eVar, cj.c.f27731b, i14, i15, bitmapB));
                }
                if (zIsLoggable) {
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    public a(Context context, List<ImageHeaderParser> list, xi.d dVar, xi.b bVar) {
        this(context, list, dVar, bVar, f83914g, f83913f);
    }

    public a(Context context, List<ImageHeaderParser> list, xi.d dVar, xi.b bVar, b bVar2, C1660a c1660a) {
        this.f83915a = context.getApplicationContext();
        this.f83916b = list;
        this.f83918d = c1660a;
        this.f83919e = new hj.b(dVar, bVar);
        this.f83917c = bVar2;
    }
}
