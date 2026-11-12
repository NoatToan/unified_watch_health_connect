package p008y1;

import com.mapbox.maps.MapboxMap;
import e23.p;
import n4.c;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/c;", MapboxMap.QFE_OFFSET, "<anonymous>", "(Ln4/c;)Ln4/c;"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {579}, m = "invokeSuspend", v = 1)
public final class d3 extends i implements p<c, d<? super c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f193168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f193169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(a3 a3Var, d<? super d3> dVar) {
        super(2, dVar);
        this.f193169c = a3Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        d3 d3Var = new d3(this.f193169c, dVar);
        d3Var.f193168b = ((c) obj).f123544a;
        return d3Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super c> dVar) {
        return ((d3) create(c.a(cVar.f123544a), dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193167a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        long j8 = this.f193168b;
        h3 h3Var = this.f193169c.C;
        this.f193167a = 1;
        Object objA = t2.a(h3Var, j8, this);
        return objA == aVar ? aVar : objA;
    }
}
