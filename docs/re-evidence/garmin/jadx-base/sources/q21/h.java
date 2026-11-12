package q21;

import b63.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import g01.x;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.LegacyMealWindowsAndTimelineViewModel$saveMealWindowsAndTimelineSettings$1", f = "LegacyMealWindowsAndTimelineViewModel.kt", l = {192}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f142240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f142241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, boolean z14, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f142240b = kVar;
        this.f142241c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f142240b, this.f142241c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object objO;
        Object next;
        v vVar;
        v vVar2;
        Object value3;
        Object value4;
        Object value5;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142239a;
        k kVar = this.f142240b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = kVar.f142251g;
            p2 p2Var2 = kVar.f142251g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p.a((p) value, true, null, false, false, false, null, null, null, 510)));
            z zVar = kVar.f142249e;
            if (zVar != null) {
                List<x> list = zVar.f74294a;
                if (list != null) {
                    arrayList = new ArrayList(y.r(list, 10));
                    for (x xVar : list) {
                        Iterator<T> it = ((p) p2Var2.getValue()).f142275g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            long j8 = ((o21.f) next).f128669a;
                            Long l14 = xVar.f74274a;
                            if (l14 != null && j8 == l14.longValue()) {
                                break;
                            }
                        }
                        o21.f fVar = (o21.f) next;
                        if (fVar == null || (vVar = fVar.f128671c) == null) {
                            vVar = xVar.f74278e;
                        }
                        if (fVar == null || (vVar2 = fVar.f128672d) == null) {
                            vVar2 = xVar.f74279f;
                        }
                        v21.f fVar2 = v21.f.f175333a;
                        k01.d dVar = xVar.f74280g;
                        fVar2.getClass();
                        arrayList.add(x.a(xVar, vVar, vVar2, v21.f.z(dVar), 3983));
                    }
                } else {
                    arrayList = null;
                }
                z zVarA = z.a(zVar, arrayList, Boolean.valueOf(this.f142241c), ((p) p2Var2.getValue()).f142276h.f156100a, ((p) p2Var2.getValue()).f142277i.f156100a, 16);
                m01.g gVar = kVar.f142246b;
                int iB = kVar.f142248d.b();
                b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                this.f142239a = 1;
                objO = gVar.o(iB, oVarD, zVarA, this);
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, p.a((p) value2, false, new Integer(R.string.generic_error_message), false, false, false, null, null, null, 506)));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objO = obj;
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            kVar.f142247c.d();
            kVar.f142247c.a();
            p2 p2Var3 = kVar.f142251g;
            do {
                value5 = p2Var3.getValue();
            } while (!p2Var3.b(value5, p.a((p) value5, false, new Integer(R.string.msg_settings_saved_successfully), true, false, false, null, null, null, 498)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            Integer num = ((v2.a) v2Var).f47384b;
            if (num != null && num.intValue() == 409) {
                p2 p2Var4 = kVar.f142251g;
                do {
                    value4 = p2Var4.getValue();
                } while (!p2Var4.b(value4, p.a((p) value4, false, null, false, false, true, null, null, null, 478)));
            } else {
                p2 p2Var5 = kVar.f142251g;
                do {
                    value3 = p2Var5.getValue();
                } while (!p2Var5.b(value3, p.a((p) value3, false, new Integer(R.string.generic_error_message), false, false, false, null, null, null, 506)));
            }
        }
        return Unit.INSTANCE;
    }
}
