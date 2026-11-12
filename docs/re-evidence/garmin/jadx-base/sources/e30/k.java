package e30;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lw20/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCoursePaceProStrategiesUseCase$invoke$1", f = "GetCoursePaceProStrategiesUseCase.kt", l = {17, 20, 22, 26, 29, 32}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<r53.j<? super w20.d>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f62692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f62693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f62694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, boolean z14, l lVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f62692c = str;
        this.f62693d = z14;
        this.f62694e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f62692c, this.f62693d, this.f62694e, dVar);
        kVar.f62691b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super w20.d> jVar, t13.d<? super Unit> dVar) {
        return ((k) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r0.emit(null, r6) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r0.emit(null, r6) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r0.emit(null, r6) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r0.emit(null, r6) == r1) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        T t7;
        r53.j jVar = (r53.j) this.f62691b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (this.f62690a) {
            case 0:
                o13.r.b(obj);
                String str = this.f62692c;
                if (str != null) {
                    if (this.f62693d) {
                        r41.a aVar2 = this.f62694e.f62695a;
                        Long l14 = new Long(Long.parseLong(str));
                        this.f62691b = jVar;
                        this.f62690a = 1;
                        obj = f0.J(aVar2, new r41.e(aVar2, l14, null), this);
                        if (obj != aVar) {
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                t7 = ((v2.b) v2Var).f47386a;
                                if (((Collection) t7).isEmpty()) {
                                    w20.d dVar = new w20.d(h0.M0((Iterable) t7));
                                    this.f62691b = null;
                                    this.f62690a = 2;
                                } else {
                                    this.f62691b = null;
                                    this.f62690a = 3;
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                this.f62691b = null;
                                this.f62690a = 4;
                            }
                        }
                        break;
                    } else {
                        this.f62691b = null;
                        this.f62690a = 5;
                        break;
                    }
                    return aVar;
                }
                this.f62691b = null;
                this.f62690a = 6;
                break;
            case 1:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    t7 = ((v2.b) v2Var).f47386a;
                    if (((Collection) t7).isEmpty()) {
                        this.f62691b = null;
                        this.f62690a = 3;
                    } else {
                        w20.d dVar2 = new w20.d(h0.M0((Iterable) t7));
                        this.f62691b = null;
                        this.f62690a = 2;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f62691b = null;
                    this.f62690a = 4;
                }
                break;
            case 2:
            case 3:
            case 4:
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
