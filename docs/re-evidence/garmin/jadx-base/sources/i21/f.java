package i21;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$checkPregnancyCompletionData$1", f = "NutritionReportsViewModel.kt", l = {952, 953}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f87314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f87316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(2, dVar2);
        this.f87316c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f87316c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objF0;
        a0 a0Var;
        v2 v2Var;
        List list;
        Boolean boolG;
        boolean z14;
        LocalDate endDate;
        p2 p2Var;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87315b;
        d dVar = this.f87316c;
        boolean zBooleanValue = true;
        if (i14 == 0) {
            o13.r.b(obj);
            p01.a aVar2 = (p01.a) KoinJavaComponent.get$default(p01.a.class, null, null, 6, null);
            this.f87315b = 1;
            objB = aVar2.b(this);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objB = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a0Var = this.f87314a;
            o13.r.b(obj);
            objF0 = obj;
        }
        v2Var = (v2) objF0;
        if (v2Var instanceof v2.b) {
            list = (List) a0Var.f25746b;
            boolean zBooleanValue2 = ((Boolean) ((v2.b) v2Var).f47386a).booleanValue();
            boolG = dVar.f87276h.g();
            if (boolG != null) {
                zBooleanValue = boolG.booleanValue();
            } else {
                if (list != null || list.isEmpty()) {
                    a2 a2Var = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "NutritionReportsViewModel", "hasPregnancyCompleted: no pregnancy snapshot data");
                    z14 = false;
                } else {
                    a2 a2Var2 = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "NutritionReportsViewModel", "hasPregnancyCompleted: has pregnancy snapshot data");
                    b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        db1.m mVar = (db1.m) obj2;
                        if (mVar == null || (endDate = mVar.getDeliveryDate()) == null) {
                            endDate = mVar != null ? mVar.getEndDate() : null;
                        }
                        if (endDate != null) {
                            b63.o oVarT = g22.k.t(endDate);
                            b63.i.INSTANCE.getClass();
                            if (b63.q.e(oVarT, 60, b63.i.f16190d).compareTo(oVarD) <= 0) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    z14 = !arrayList.isEmpty();
                }
                if (z14 || zBooleanValue2) {
                    zBooleanValue = false;
                }
            }
            if (zBooleanValue) {
                p2Var = dVar.f87285q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, c.a((c) value, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, false, null, null, 4161535)));
            }
        }
        return Unit.INSTANCE;
        a0 a0Var2 = (a0) objB;
        m01.g gVar = dVar.f87269a;
        this.f87314a = a0Var2;
        this.f87315b = 2;
        objF0 = gVar.f0(this);
        if (objF0 != aVar) {
            a0Var = a0Var2;
            v2Var = (v2) objF0;
            if (v2Var instanceof v2.b) {
                list = (List) a0Var.f25746b;
                boolean zBooleanValue3 = ((Boolean) ((v2.b) v2Var).f47386a).booleanValue();
                boolG = dVar.f87276h.g();
                if (boolG != null) {
                    zBooleanValue = boolG.booleanValue();
                } else {
                    if (list != null) {
                        a2 a2Var3 = a2.NUTRITION;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "NutritionReportsViewModel", "hasPregnancyCompleted: no pregnancy snapshot data");
                        z14 = false;
                    } else {
                        a2 a2Var4 = a2.NUTRITION;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var4, "NutritionReportsViewModel", "hasPregnancyCompleted: no pregnancy snapshot data");
                        z14 = false;
                    }
                    if (z14) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = false;
                    }
                }
                if (zBooleanValue) {
                    p2Var = dVar.f87285q;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, c.a((c) value, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, false, null, null, 4161535)));
                }
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
