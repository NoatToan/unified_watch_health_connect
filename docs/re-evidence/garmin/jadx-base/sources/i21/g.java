package i21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$checkPregnancyStartingData$1", f = "NutritionReportsViewModel.kt", l = {927, 928, 944}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l01.k f87317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f87319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f87320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f87320d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f87320d, dVar);
        gVar.f87319c = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
    
        if (r7.K4(r24) == r2) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA4;
        l01.k kVar;
        Object objM;
        Object value;
        b0 b0Var = (b0) this.f87319c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87318b;
        d dVar = this.f87320d;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            this.f87319c = b0Var;
            this.f87318b = 1;
            objA4 = d.A4(dVar, oVarD, this);
            if (objA4 != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA4 = obj;
        } else if (i14 == 2) {
            l01.k kVar2 = this.f87317a;
            o13.r.b(obj);
            kVar = kVar2;
            objM = obj;
            v2 v2Var = (v2) objM;
            if (kVar == null && (v2Var instanceof v2.b)) {
                a2 a2Var = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "NutritionReportsViewModel", "checkPregnancyStartingData: successfully retrieved pregnancy data");
                Boolean boolY = dVar.f87276h.y();
                boolean zBooleanValue = boolY != null ? boolY.booleanValue() : dVar.f87277i.d1();
                Boolean boolR = dVar.f87276h.r();
                boolean zBooleanValue2 = boolR != null ? boolR.booleanValue() : ((Boolean) ((v2.b) v2Var).f47386a).booleanValue();
                boolean zG = p005kotlin.jvm.internal.s.g(kVar.f107878a, s21.s.NO_GOAL.f156170a);
                if (zBooleanValue && !zBooleanValue2 && !zG) {
                    p2 p2Var = dVar.f87285q;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, c.a((c) value, null, null, null, null, null, null, null, null, null, null, true, false, null, false, false, false, null, null, 4177919)));
                } else if (!zBooleanValue && !zBooleanValue2) {
                    this.f87319c = null;
                    this.f87317a = null;
                    this.f87318b = 3;
                }
            } else {
                a2 a2Var2 = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "NutritionReportsViewModel", "checkPregnancyStartingData: error retrieving pregnancy data");
            }
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        kVar = (l01.k) objA4;
        m01.g gVar = dVar.f87269a;
        this.f87319c = b0Var;
        this.f87317a = kVar;
        this.f87318b = 2;
        objM = gVar.m(this);
        if (objM != aVar) {
            v2 v2Var2 = (v2) objM;
            if (kVar == null) {
                a2 a2Var3 = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "NutritionReportsViewModel", "checkPregnancyStartingData: error retrieving pregnancy data");
            } else {
                a2 a2Var4 = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "NutritionReportsViewModel", "checkPregnancyStartingData: error retrieving pregnancy data");
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
