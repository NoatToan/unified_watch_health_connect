package vb;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m1;
import androidx.core.view.z;
import c2.t;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import j20.x;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import p3.o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements bb.r, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176747a = 29;

    public static /* synthetic */ void A(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void B(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void C(String str) throws IOException {
        throw new IOException(str);
    }

    public static int c(Integer num, t tVar, u82.f fVar) {
        int iIntValue = num.intValue();
        tVar.getClass();
        fVar.getClass();
        return iIntValue;
    }

    public static int d(Integer num, o82.g gVar, o82.a aVar) {
        int iIntValue = num.intValue();
        gVar.getClass();
        aVar.getClass();
        return iIntValue;
    }

    public static long e(d92.b bVar, p3.m mVar) {
        bVar.getClass();
        return d92.b.a(mVar).c().c();
    }

    public static long f(d92.b bVar, o0 o0Var) {
        bVar.getClass();
        return d92.b.a(o0Var).c().b();
    }

    public static long g(o0 o0Var) {
        return d92.b.a(o0Var).k().d();
    }

    public static String h(int i14, String str, String str2) {
        return str + str2 + i14;
    }

    public static String i(String str, md.n nVar, String str2, md.n nVar2) {
        return str + nVar + str2 + nVar2;
    }

    public static LinkedHashSet j(LinkedHashMap linkedHashMap, String str, md.n.a aVar) {
        linkedHashMap.put(str, aVar);
        return new LinkedHashSet();
    }

    public static DateTime k(b63.o oVar) {
        DateTime dateTimeAtStartOfDay = g22.l.h(oVar).toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        return dateTimeAtStartOfDay;
    }

    public static o0 l(int i14, e23.a aVar, String str, p3.m mVar) {
        str.getClass();
        aVar.getClass();
        return mVar.E(i14);
    }

    public static /* synthetic */ void m() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void n(int i14, StringBuilder sb3) {
        sb3.append(i14);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public static void o(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        viewPortHandler.getClass();
        yAxis.getClass();
        transformer.getClass();
    }

    public static /* synthetic */ void p(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                w();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z14 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z14) {
                    executorService.shutdownNow();
                    z14 = true;
                }
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void q(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void r(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) throws IOException {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void u(String str, Throwable th3) throws IOException {
        throw new IOException(str, th3);
    }

    public static void v(ud.a aVar, ud.a aVar2, String str, ud.a aVar3, String str2) {
        aVar.getClass();
        oe2.f.o(aVar2, str);
        oe2.f.o(aVar3, str2);
    }

    public static /* synthetic */ void w() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void x(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void z(String str) {
        throw new IllegalStateException(str);
    }

    @Override // bb.r
    public bb.n[] createExtractors() {
        switch (this.f176747a) {
            case 1:
                return new bb.n[]{new j(yb.n.a.f195662a, 16)};
            default:
                return new bb.n[]{new wb.c()};
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(3);
        eVarI.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = eVarI.f25191b;
        marginLayoutParams.leftMargin = eVarI.f25190a;
        marginLayoutParams.rightMargin = eVarI.f25192c;
        view2.setLayoutParams(marginLayoutParams);
        return m1.f6507b;
    }
}
