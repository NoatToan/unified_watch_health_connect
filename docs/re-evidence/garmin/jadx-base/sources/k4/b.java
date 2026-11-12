package k4;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import e23.l;
import g6.o;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk4/b;", "Landroid/view/View$DragShadowBuilder;", "Lg6/c;", "density", "Ln4/g;", "decorationSize", "Lkotlin/Function1;", "Lq4/f;", "", "drawDragDecoration", "<init>", "(Lg6/c;JLe23/l;Lkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6.c f102802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<q4.f, Unit> f102804c;

    /* JADX WARN: Multi-variable type inference failed */
    private b(g6.c cVar, long j8, l<? super q4.f, Unit> lVar) {
        this.f102802a = cVar;
        this.f102803b = j8;
        this.f102804c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        q4.a aVar = new q4.a();
        o oVar = o.Ltr;
        Canvas canvas2 = o4.d.f128822a;
        o4.c cVar = new o4.c();
        cVar.f128816a = canvas;
        q4.a.C2680a c2680a = aVar.f142542a;
        g6.c cVar2 = c2680a.f142546a;
        o oVar2 = c2680a.f142547b;
        y yVar = c2680a.f142548c;
        long j8 = c2680a.f142549d;
        c2680a.f142546a = this.f102802a;
        c2680a.f142547b = oVar;
        c2680a.f142548c = cVar;
        c2680a.f142549d = this.f102803b;
        cVar.l();
        this.f102804c.invoke(aVar);
        cVar.i();
        c2680a.f142546a = cVar2;
        c2680a.f142547b = oVar2;
        c2680a.f142548c = yVar;
        c2680a.f142549d = j8;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j8 = this.f102803b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        g6.c cVar = this.f102802a;
        point.set(cVar.f0(cVar.d1(fIntBitsToFloat)), cVar.f0(cVar.d1(Float.intBitsToFloat((int) (j8 & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    public /* synthetic */ b(g6.c cVar, long j8, l lVar, p005kotlin.jvm.internal.j jVar) {
        this(cVar, j8, lVar);
    }
}
