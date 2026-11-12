package w61;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/performance/model/TrainingStatusReportDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getTrainingStatusSummary$2", f = "TrainingStatusViewModel.kt", l = {645, 651, 653, 654, 658, 659}, m = "invokeSuspend", v = 2)
public final class j0 extends v13.i implements e23.p<t0<fw.m<? extends TrainingStatusReportDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f183200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f183201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f183202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f183203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f183204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i14, x xVar, String str, String str2, t13.d<? super j0> dVar) {
        super(2, dVar);
        this.f183201c = i14;
        this.f183202d = xVar;
        this.f183203e = str;
        this.f183204f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j0 j0Var = new j0(this.f183201c, this.f183202d, this.f183203e, this.f183204f, dVar);
        j0Var.f183200b = obj;
        return j0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<fw.m<? extends TrainingStatusReportDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((j0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L40;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x xVar;
        String str;
        String str2;
        int i14;
        v2 v2Var;
        t0 t0Var = (t0) this.f183200b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (this.f183199a) {
            case 0:
                o13.r.b(obj);
                fw.m mVarF = fw.m.a.f(fw.m.f73767e, null, null, 3);
                this.f183200b = t0Var;
                this.f183199a = 1;
                if (t0Var.emit(mVarF, this) != aVar) {
                    xVar = this.f183202d;
                    str = this.f183204f;
                    str2 = this.f183203e;
                    i14 = this.f183201c;
                    if (i14 != 0 || i14 == 1) {
                        s61.a aVar2 = xVar.Z;
                        this.f183200b = t0Var;
                        this.f183199a = 2;
                        aVar2.getClass();
                        obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new s61.f(aVar2, str2, str, null), this);
                    } else if (i14 == 2) {
                        s61.a aVar3 = xVar.Z;
                        this.f183200b = t0Var;
                        this.f183199a = 3;
                        aVar3.getClass();
                        obj = com.garmin.android.apps.connectmobile.f0.J(aVar3, new s61.d(aVar3, str2, str, null), this);
                    } else {
                        s61.a aVar4 = xVar.Z;
                        this.f183200b = t0Var;
                        this.f183199a = 4;
                        aVar4.getClass();
                        obj = com.garmin.android.apps.connectmobile.f0.J(aVar4, new s61.f(aVar4, str2, str, null), this);
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                xVar = this.f183202d;
                str = this.f183204f;
                str2 = this.f183203e;
                i14 = this.f183201c;
                if (i14 != 0) {
                    s61.a aVar5 = xVar.Z;
                    this.f183200b = t0Var;
                    this.f183199a = 2;
                    aVar5.getClass();
                    obj = com.garmin.android.apps.connectmobile.f0.J(aVar5, new s61.f(aVar5, str2, str, null), this);
                    break;
                } else {
                    s61.a aVar6 = xVar.Z;
                    this.f183200b = t0Var;
                    this.f183199a = 2;
                    aVar6.getClass();
                    obj = com.garmin.android.apps.connectmobile.f0.J(aVar6, new s61.f(aVar6, str2, str, null), this);
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    fw.m mVarG = fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1);
                    this.f183200b = null;
                    this.f183199a = 5;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    fw.m mVarB = fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5);
                    this.f183200b = null;
                    this.f183199a = 6;
                }
                break;
            case 3:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    fw.m mVarG2 = fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1);
                    this.f183200b = null;
                    this.f183199a = 5;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    fw.m mVarB2 = fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5);
                    this.f183200b = null;
                    this.f183199a = 6;
                }
                break;
            case 4:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    fw.m mVarG3 = fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1);
                    this.f183200b = null;
                    this.f183199a = 5;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    fw.m mVarB3 = fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5);
                    this.f183200b = null;
                    this.f183199a = 6;
                }
                break;
            case 5:
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
