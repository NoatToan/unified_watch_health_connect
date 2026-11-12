package w61;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lfw/m;", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getLastUsedDevice$1", f = "TrainingStatusViewModel.kt", l = {769, 772, 774, 777, 780, 783, 783}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<t0<fw.m<? extends com.garmin.android.apps.connectmobile.performance.model.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f183152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f183153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f183155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.model.a f183156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f183157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.performance.model.a aVar, x xVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f183156e = aVar;
        this.f183157f = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f183156e, this.f183157f, dVar);
        b0Var.f183155d = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<fw.m<? extends com.garmin.android.apps.connectmobile.performance.model.a>> t0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        v2 v2Var;
        String str2;
        t0 t0Var = (t0) this.f183155d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183154c;
        x xVar = this.f183157f;
        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = this.f183156e;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                str = aVar2 != null ? aVar2.f39917a : null;
                if (aVar2 != null) {
                    if (!xVar.f183268d) {
                        fw.m mVarG = fw.m.a.g(fw.m.f73767e, aVar2, 1);
                        this.f183155d = null;
                        this.f183152a = null;
                        this.f183154c = 5;
                    } else {
                        iw.e eVar = xVar.f183265a;
                        this.f183155d = t0Var;
                        this.f183152a = str;
                        this.f183154c = 1;
                        eVar.getClass();
                        obj = com.garmin.android.apps.connectmobile.f0.J(eVar, new iw.h(eVar, null), this);
                        if (obj != aVar) {
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                fw.m.a aVar3 = fw.m.f73767e;
                                Throwable th3 = new Throwable(((v2.a) v2Var).f47383a.toString());
                                aVar3.getClass();
                                fw.m mVarA = fw.m.a.a(null, th3);
                                this.f183155d = null;
                                this.f183152a = null;
                                this.f183153b = null;
                                this.f183154c = 4;
                            } else if (p005kotlin.jvm.internal.s.g(((TrainingStatusDeviceDTO) ((v2.b) v2Var).f47386a).f39908a, str)) {
                                str2 = aVar2.f39917a;
                                this.f183155d = t0Var;
                                this.f183152a = null;
                                this.f183153b = null;
                                this.f183154c = 2;
                                int i15 = x.O0;
                                if (xVar.J4(str2, this) != aVar) {
                                    fw.m mVarG2 = fw.m.a.g(fw.m.f73767e, aVar2, 1);
                                    this.f183155d = null;
                                    this.f183152a = null;
                                    this.f183153b = null;
                                    this.f183154c = 3;
                                }
                            } else {
                                fw.m mVarG3 = fw.m.a.g(fw.m.f73767e, aVar2, 1);
                                this.f183155d = null;
                                this.f183152a = null;
                                this.f183153b = null;
                                this.f183154c = 3;
                            }
                        }
                    }
                    break;
                } else {
                    this.f183155d = null;
                    this.f183152a = null;
                    this.f183153b = t0Var;
                    this.f183154c = 6;
                    obj = x.y4(xVar, this);
                    if (obj != aVar) {
                        this.f183155d = null;
                        this.f183152a = null;
                        this.f183153b = null;
                        this.f183154c = 7;
                    }
                    break;
                }
                return aVar;
            case 1:
                str = this.f183152a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    fw.m.a aVar4 = fw.m.f73767e;
                    Throwable th4 = new Throwable(((v2.a) v2Var).f47383a.toString());
                    aVar4.getClass();
                    fw.m mVarA2 = fw.m.a.a(null, th4);
                    this.f183155d = null;
                    this.f183152a = null;
                    this.f183153b = null;
                    this.f183154c = 4;
                    break;
                } else {
                    if (p005kotlin.jvm.internal.s.g(((TrainingStatusDeviceDTO) ((v2.b) v2Var).f47386a).f39908a, str)) {
                        fw.m mVarG4 = fw.m.a.g(fw.m.f73767e, aVar2, 1);
                        this.f183155d = null;
                        this.f183152a = null;
                        this.f183153b = null;
                        this.f183154c = 3;
                    } else {
                        str2 = aVar2.f39917a;
                        this.f183155d = t0Var;
                        this.f183152a = null;
                        this.f183153b = null;
                        this.f183154c = 2;
                        int i16 = x.O0;
                        if (xVar.J4(str2, this) != aVar) {
                            fw.m mVarG5 = fw.m.a.g(fw.m.f73767e, aVar2, 1);
                            this.f183155d = null;
                            this.f183152a = null;
                            this.f183153b = null;
                            this.f183154c = 3;
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                fw.m mVarG6 = fw.m.a.g(fw.m.f73767e, aVar2, 1);
                this.f183155d = null;
                this.f183152a = null;
                this.f183153b = null;
                this.f183154c = 3;
                break;
            case 3:
            case 4:
            case 5:
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 6:
                t0Var = this.f183153b;
                o13.r.b(obj);
                this.f183155d = null;
                this.f183152a = null;
                this.f183153b = null;
                this.f183154c = 7;
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
