package qa0;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import rd2.j;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.migration.DeviceMigrationViewModel$initData$1", f = "DeviceMigrationViewModel.kt", l = {89, 91}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f143849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f143850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f143851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f143851c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f143851c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        p2 p2Var;
        Object value;
        ArrayList arrayListA;
        p2 p2Var2;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143850b;
        f fVar = this.f143851c;
        if (i14 == 0) {
            r.b(obj);
            long j8 = fVar.f143852a;
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = j.i(j8, null);
            if (fVarI != null ? fVarI.p3() : false) {
                rg1.a aVar2 = fVar.f143853b;
                long j14 = fVar.f143852a;
                this.f143850b = 1;
                obj = aVar2.f(j14, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            p2Var = fVar.f143856e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c.a((c) value, null, 30)));
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f143849a;
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            sg1.g gVar = sg1.g.f159217a;
            l22.b bVar = fVar.f143854c;
            List list = (List) ((v2.b) v2Var).f47386a;
            long j15 = fVar.f143852a;
            gVar.getClass();
            arrayListA = sg1.g.a(bVar, list, j15, false, true);
            p2Var2 = fVar.f143856e;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, c.a((c) value2, arrayListA, 25)));
        }
        p2Var = fVar.f143856e;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, c.a((c) value, null, 30)));
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var2;
            if (!((Collection) bVar2.f47386a).isEmpty()) {
                x80.b bVar3 = fVar.f143855d;
                long j16 = fVar.f143852a;
                this.f143849a = bVar2;
                this.f143850b = 2;
                Object objK = bVar3.k(j16, this);
                if (objK != aVar) {
                    v2Var = v2Var2;
                    obj = objK;
                    if (((Boolean) obj).booleanValue()) {
                        sg1.g gVar2 = sg1.g.f159217a;
                        l22.b bVar4 = fVar.f143854c;
                        List list2 = (List) ((v2.b) v2Var).f47386a;
                        long j17 = fVar.f143852a;
                        gVar2.getClass();
                        arrayListA = sg1.g.a(bVar4, list2, j17, false, true);
                        p2Var2 = fVar.f143856e;
                        do {
                            value2 = p2Var2.getValue();
                        } while (!p2Var2.b(value2, c.a((c) value2, arrayListA, 25)));
                    }
                }
                return aVar;
            }
        }
        p2Var = fVar.f143856e;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, c.a((c) value, null, 30)));
        return Unit.INSTANCE;
    }
}
