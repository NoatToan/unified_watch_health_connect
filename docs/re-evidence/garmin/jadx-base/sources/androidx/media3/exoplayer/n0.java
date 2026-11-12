package androidx.media3.exoplayer;

import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.camera.core.impl.x2;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9291g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n0(BarLineChartBase barLineChartBase, p005kotlin.jvm.internal.r0 r0Var, e23.r rVar, e23.p pVar, boolean z14, um.a aVar) {
        this.f9285a = 3;
        this.f9288d = barLineChartBase;
        this.f9289e = r0Var;
        this.f9290f = (p005kotlin.jvm.internal.q) rVar;
        this.f9291g = (p005kotlin.jvm.internal.q) pVar;
        this.f9287c = z14;
        this.f9286b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [e23.p, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r5v2, types: [e23.r, kotlin.jvm.internal.q] */
    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f9285a;
        boolean z14 = this.f9287c;
        Object obj = this.f9286b;
        Object obj2 = this.f9291g;
        Object obj3 = this.f9290f;
        Object obj4 = this.f9289e;
        Object obj5 = this.f9288d;
        switch (i14) {
            case 0:
                Pair pair = (Pair) obj4;
                o0.this.f9300h.d(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.j.b) pair.second, (sa.i) obj3, (sa.j) obj2, (IOException) obj, this.f9287c);
                break;
            case 1:
                ((MediaSourceEventListener.EventDispatcher) obj5).lambda$loadError$3((MediaSourceEventListener) obj4, (LoadEventInfo) obj3, (MediaLoadData) obj2, (IOException) obj, this.f9287c);
                break;
            case 2:
                z0.h0 h0Var = (z0.h0) obj5;
                r0.o oVar = (r0.o) obj4;
                androidx.camera.core.impl.l0 l0Var = (androidx.camera.core.impl.l0) obj3;
                a1.a aVar = (a1.a) obj2;
                x2 x2Var = (x2) obj;
                z0.h0.c cVar = z0.h0.G;
                if (l0Var == h0Var.c()) {
                    h0Var.f200635w = oVar.d(l0Var, true);
                    z0.n0 n0Var = (z0.n0) aVar.e(a1.a.O);
                    Objects.requireNonNull(n0Var);
                    n0Var.b(h0Var.f200635w, x2Var, z14);
                    h0Var.P();
                }
                break;
            default:
                BarLineChartBase barLineChartBase = (BarLineChartBase) obj5;
                ?? r14 = (p005kotlin.jvm.internal.q) obj3;
                ?? r15 = (p005kotlin.jvm.internal.q) obj2;
                um.a aVar2 = (um.a) obj;
                MotionEvent motionEvent = (MotionEvent) ((p005kotlin.jvm.internal.r0) obj4).f105810a;
                barLineChartBase.getClass();
                if (motionEvent != null) {
                    barLineChartBase.setHighlightPerDragEnabled(true);
                    barLineChartBase.setDragEnabled(false);
                    barLineChartBase.setScaleEnabled(false);
                    if (!z14 || motionEvent.getPointerCount() <= 1) {
                        if (aVar2 != null) {
                            aVar2.setDoubleLongPress(false);
                        }
                        r15.invoke(Float.valueOf(motionEvent.getX(0)), Float.valueOf(motionEvent.getY(0)));
                    } else {
                        if (aVar2 != null) {
                            aVar2.setDoubleLongPress(true);
                        }
                        r14.invoke(Float.valueOf(motionEvent.getX(0)), Float.valueOf(motionEvent.getY(0)), Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
                    }
                    ViewParent parent = barLineChartBase.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z14, int i14) {
        this.f9285a = i14;
        this.f9288d = obj;
        this.f9289e = obj2;
        this.f9290f = obj3;
        this.f9291g = obj4;
        this.f9286b = serializable;
        this.f9287c = z14;
    }
}
