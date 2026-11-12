package w51;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesViewModel$declinePendingActivity$1", f = "PendingActivitiesViewModel.kt", l = {256}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z51.h f182238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f182240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f182241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f182242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, b63.o oVar, String str, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f182240c = h0Var;
        this.f182241d = oVar;
        this.f182242e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f182240c, this.f182241d, this.f182242e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<z51.h> list;
        String str;
        Object next;
        Object value;
        Object objB;
        z51.h hVar;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182239b;
        b63.o oVar = this.f182241d;
        h0 h0Var = this.f182240c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = h0Var.f182267b;
            p2 p2Var2 = h0Var.f182267b;
            Map<b63.o, List<z51.h>> map = ((w) p2Var.getValue()).f182449e;
            if (map != null && (list = map.get(oVar)) != null) {
                Iterator<T> it = list.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = this.f182242e;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((z51.h) next).f202505a, str));
                z51.h hVar2 = (z51.h) next;
                if (hVar2 != null) {
                    sz0.f.a aVar2 = sz0.f.f161394a;
                    Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                    str.getClass();
                    int iHashCode = str.hashCode();
                    aVar2.getClass();
                    boolean zE = sz0.f.a.e(iHashCode, contextC);
                    Map mapZ4 = h0.z4(h0Var, oVar, hVar2, ((w) p2Var2.getValue()).f182449e);
                    do {
                        value = p2Var2.getValue();
                    } while (!p2Var2.b(value, w.a((w) p2Var2.getValue(), mapZ4 == null || mapZ4.isEmpty(), false, null, mapZ4, false, 46)));
                    if (mapZ4 == null || mapZ4.isEmpty() || zE) {
                        sz0.f.a aVar3 = sz0.f.f161394a;
                        Context contextC2 = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                        aVar3.getClass();
                        sz0.f.a.b(contextC2);
                    }
                    y51.a aVar4 = h0Var.f182266a;
                    b63.o oVar2 = hVar2.f202506b;
                    if (oVar2 == null) {
                        oVar2 = oVar;
                    }
                    this.f182238a = hVar2;
                    this.f182239b = 1;
                    objB = aVar4.b(oVar2, str, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                    hVar = hVar2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hVar = this.f182238a;
        o13.r.b(obj);
        objB = obj;
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            h0Var.f182269d = true;
            p2 p2Var3 = h0Var.f182267b;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, w.a((w) p2Var3.getValue(), false, false, null, null, false, 62)));
            sn.a.o(f12.l.f68084a, true);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var4 = h0Var.f182267b;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, w.a((w) h0Var.f182267b.getValue(), false, false, f.b.f182257b, h0.x4(h0Var, oVar, hVar, ((w) value2).f182449e), false, 38)));
        }
        return Unit.INSTANCE;
    }
}
