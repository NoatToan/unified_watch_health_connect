package v2;

import android.view.DragEvent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv2/a2;", "Lk4/i;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a2 implements k4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<k4.c, Unit> f174876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<kotlin.m1, kotlin.n1, Boolean> f174877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<k4.c, Unit> f174878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<k4.c, Unit> f174879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<n4.c, Unit> f174880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<k4.c, Unit> f174881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l<k4.c, Unit> f174882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<k4.c, Unit> f174883h;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(e23.l<? super k4.c, Unit> lVar, e23.p<? super kotlin.m1, ? super kotlin.n1, Boolean> pVar, e23.l<? super k4.c, Unit> lVar2, e23.l<? super k4.c, Unit> lVar3, e23.l<? super n4.c, Unit> lVar4, e23.l<? super k4.c, Unit> lVar5, e23.l<? super k4.c, Unit> lVar6, e23.l<? super k4.c, Unit> lVar7) {
        this.f174876a = lVar;
        this.f174877b = pVar;
        this.f174878c = lVar2;
        this.f174879d = lVar3;
        this.f174880e = lVar4;
        this.f174881f = lVar5;
        this.f174882g = lVar6;
        this.f174883h = lVar7;
    }

    @Override // k4.i
    public final void E1(k4.c cVar) {
        e23.l<k4.c, Unit> lVar = this.f174881f;
        if (lVar != null) {
            lVar.invoke(cVar);
        }
    }

    @Override // k4.i
    public final void F1(k4.c cVar) {
        e23.l<k4.c, Unit> lVar = this.f174879d;
        if (lVar != null) {
            lVar.invoke(cVar);
        }
    }

    @Override // k4.i
    public final boolean G0(k4.c cVar) {
        this.f174876a.invoke(cVar);
        DragEvent dragEvent = cVar.f102805a;
        return this.f174877b.invoke(new kotlin.m1(dragEvent.getClipData()), new kotlin.n1(dragEvent.getClipDescription())).booleanValue();
    }

    @Override // k4.i
    public final void K(k4.c cVar) {
        DragEvent dragEvent = cVar.f102805a;
        e23.l<n4.c, Unit> lVar = this.f174880e;
        if (lVar != null) {
            float x14 = dragEvent.getX();
            float y14 = dragEvent.getY();
            lVar.invoke(n4.c.a((((long) Float.floatToRawIntBits(x14)) << 32) | (((long) Float.floatToRawIntBits(y14)) & 4294967295L)));
        }
    }

    @Override // k4.i
    public final void f1(k4.c cVar) {
        e23.l<k4.c, Unit> lVar = this.f174883h;
        if (lVar != null) {
            lVar.invoke(cVar);
        }
    }

    @Override // k4.i
    public final void j0(k4.c cVar) {
        e23.l<k4.c, Unit> lVar = this.f174878c;
        if (lVar != null) {
            lVar.invoke(cVar);
        }
    }
}
