package b0;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.h2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f14087r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SparseArray<Integer> f14088s = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.r0 f14089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f14091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f14092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f14093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f14094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.camera.core.impl.j0 f14095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.impl.i0 f14096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c3 f14097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.camera.core.internal.b f14098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f14099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0 f14100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f14101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.camera.core.impl.o0 f14102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f14103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListenableFuture<Void> f14104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f14105q;

    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:93:0x01d9
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public x(android.content.Context r9, b0.y.b r10, p.a<android.content.Context, androidx.camera.core.impl.f2> r11) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x.<init>(android.content.Context, b0.y$b, p.a):void");
    }

    public static void a(Integer num) {
        synchronized (f14087r) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = f14088s;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void b() {
        SparseArray<Integer> sparseArray = f14088s;
        if (sparseArray.size() == 0) {
            t0.f14053a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            t0.f14053a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            t0.f14053a = 4;
        } else if (sparseArray.get(5) != null) {
            t0.f14053a = 5;
        } else if (sparseArray.get(6) != null) {
            t0.f14053a = 6;
        }
    }

    public x(Context context, y.b bVar) {
        this(context, bVar, new h2());
    }
}
