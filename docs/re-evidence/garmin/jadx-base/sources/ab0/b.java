package ab0;

import b63.o;
import ca0.o1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.p2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import y80.s0;
import z80.f;
import z80.k;
import z80.l;
import z80.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.ProfileSetupViewModel$initData$1", f = "ProfileSetupViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f2528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f2528c = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f2528c, dVar);
        bVar.f2527b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        int i14;
        String str;
        m mVar;
        b0 b0Var = (b0) this.f2527b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f2526a;
        a aVar2 = this.f2528c;
        if (i15 == 0) {
            r.b(obj);
            s0 s0Var = aVar2.f2511d;
            this.f2527b = b0Var;
            this.f2526a = 1;
            objA = s0Var.a(this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = obj;
        }
        l lVar = (l) objA;
        z80.h.b bVar = z80.h.f203056a;
        q90.c cVar = aVar2.f2508a;
        q90.c cVar2 = aVar2.f2508a;
        f fVar = cVar.f143497e;
        Boolean bool = fVar != null ? fVar.f203049g : null;
        bVar.getClass();
        l lVarA = l.a(lVar, null, null, null, null, null, 0L, null, null, null, null, cVar2.f143501i, null, bool != null ? new z80.h.a(bool.booleanValue()) : z80.h.c.f203058b, 3071);
        k kVar = lVarA.f203074c;
        Double d14 = lVarA.f203072a;
        Double d15 = lVarA.f203073b;
        o oVar = lVarA.f203075d;
        a2 a2Var = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ProfileSetupViewModel", "Profile data: " + lVarA);
        List<u90.a> list = cVar2.f143495c.f111531p.f58439e;
        i2.a.b(a2Var, "ProfileSetupViewModel", "Initial wizard steps from config: " + list);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Set<String> set = ((u90.a) it.next()).f169524a;
            if (set != null) {
                arrayList.add(set);
            }
        }
        aVar2.f2521n = h0.g1(y.s(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            u90.a aVar3 = (u90.a) obj2;
            s90.b bVar2 = aVar2.f2514g;
            o1 o1Var = aVar2.f2509b;
            boolean z14 = aVar2.f2510c;
            bVar2.getClass();
            x80.b bVar3 = bVar2.f158026a;
            o1Var.getClass();
            boolean z15 = lVarA.f203082k;
            aVar3.getClass();
            switch (s90.b.a.f158027a[aVar3.ordinal()]) {
                case 1:
                    int[] iArr = s90.b.a.f158028b;
                    z15 = iArr[o1Var.ordinal()] == 1 || z15 || iArr[o1Var.ordinal()] == 1 || kVar == null || iArr[o1Var.ordinal()] == 1 || d14 == null || d14.doubleValue() <= 0.0d || (i14 = iArr[o1Var.ordinal()]) == 1 || i14 == 2 || d15 == null || d15.doubleValue() <= 0.0d || (!bVar3.m() && (iArr[o1Var.ordinal()] == 1 || oVar == null));
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 2:
                    if (s90.b.a.f158028b[o1Var.ordinal()] == 1 || (str = lVarA.f203080i) == null || str.length() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 3:
                    if (s90.b.a.f158028b[o1Var.ordinal()] == 1 || kVar == null || z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 4:
                    if (s90.b.a.f158028b[o1Var.ordinal()] == 1 || d14 == null || d14.doubleValue() <= 0.0d || z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 5:
                    int i16 = s90.b.a.f158028b[o1Var.ordinal()];
                    if (i16 == 1 || i16 == 2 || d15 == null || d15.doubleValue() <= 0.0d || z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 6:
                    if (!bVar3.m() && (s90.b.a.f158028b[o1Var.ordinal()] == 1 || oVar == null || z14)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 7:
                    if (s90.b.a.f158028b[o1Var.ordinal()] == 1 || lVarA.f203083l == null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 8:
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 9:
                    if (s90.b.a.f158028b[o1Var.ordinal()] == 1 || (lVarA.f203084m instanceof z80.h.a) || (mVar = lVarA.f203078g) == null || mVar.f203087c || mVar.f203088d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 10:
                case 12:
                    z15 = true;
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                case 11:
                    if (s90.b.a.f158028b[o1Var.ordinal()] == 1 || lVarA.f203077f == -1 || z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList2.add(obj2);
                    }
                    break;
                default:
                    u0.r();
                    return null;
            }
        }
        aVar2.f2520m = arrayList2;
        aVar2.f2519l = lVarA;
        p2 p2Var = aVar2.f2517j;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, lVarA));
        p2 p2Var2 = aVar2.f2522o;
        do {
            value2 = p2Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!p2Var2.b(value2, Boolean.TRUE));
        return Unit.INSTANCE;
    }
}
