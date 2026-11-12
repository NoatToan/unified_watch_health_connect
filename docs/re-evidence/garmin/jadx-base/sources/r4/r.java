package r4;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import o4.y;
import o4.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00118\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lr4/r;", "Landroid/view/View;", "ownerView", "Lo4/z;", "canvasHolder", "Lq4/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;Lo4/z;Lq4/a;)V", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "b", "Lo4/z;", "getCanvasHolder", "()Lo4/z;", "", "d", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "value", "f", "getCanUseCompositingLayer$ui_graphics", "setCanUseCompositingLayer$ui_graphics", "canUseCompositingLayer", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f150254k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final View ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z canvasHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.a f150257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f150259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g6.c f150261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g6.o f150262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.l<? super q4.f, Unit> f150263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f150264j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"r4/r$a", "Landroid/view/ViewOutlineProvider;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view2, Outline outline) {
            Outline outline2;
            if (!(view2 instanceof r) || (outline2 = ((r) view2).f150259e) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    static {
        new b(null);
        f150254k = new a();
    }

    public r(View view2, z zVar, q4.a aVar) {
        super(view2.getContext());
        this.ownerView = view2;
        this.canvasHolder = zVar;
        this.f150257c = aVar;
        setOutlineProvider(f150254k);
        this.canUseCompositingLayer = true;
        this.f150261g = q4.e.f142554a;
        this.f150262h = g6.o.Ltr;
        d.f150167a.getClass();
        this.f150263i = d.a.f150169b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z zVar = this.canvasHolder;
        o4.c cVar = zVar.f129040a;
        Canvas canvas2 = cVar.f128816a;
        cVar.f128816a = canvas;
        g6.c cVar2 = this.f150261g;
        g6.o oVar = this.f150262h;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        n4.g.a aVar = n4.g.f123559b;
        c cVar3 = this.f150264j;
        e23.l<? super q4.f, Unit> lVar = this.f150263i;
        q4.a aVar2 = this.f150257c;
        g6.c cVarD = aVar2.f142543b.d();
        q4.a.b bVar = aVar2.f142543b;
        g6.o oVarE = bVar.e();
        y yVarA = bVar.a();
        long jB = bVar.b();
        c cVar4 = bVar.f142551b;
        bVar.g(cVar2);
        bVar.h(oVar);
        bVar.f(cVar);
        bVar.c(jFloatToRawIntBits);
        bVar.f142551b = cVar3;
        cVar.l();
        try {
            lVar.invoke(aVar2);
            cVar.i();
            bVar.g(cVarD);
            bVar.h(oVarE);
            bVar.f(yVarA);
            bVar.c(jB);
            bVar.f142551b = cVar4;
            zVar.f129040a.f128816a = canvas2;
            this.isInvalidated = false;
        } catch (Throwable th3) {
            cVar.i();
            bVar.g(cVarD);
            bVar.h(oVarE);
            bVar.f(yVarA);
            bVar.c(jB);
            bVar.f142551b = cVar4;
            throw th3;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final z getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z14) {
        if (this.canUseCompositingLayer != z14) {
            this.canUseCompositingLayer = z14;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z14) {
        this.isInvalidated = z14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr4/r$b;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ r(View view2, z zVar, q4.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(view2, (i14 & 2) != 0 ? new z() : zVar, (i14 & 4) != 0 ? new q4.a() : aVar);
    }
}
