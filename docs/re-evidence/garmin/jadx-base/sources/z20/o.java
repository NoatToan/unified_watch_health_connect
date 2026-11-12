package z20;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lk30/u;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.GetOnCourseFeaturesUseCase$invoke$1", f = "GetOnCourseFeaturesUseCase.kt", l = {19, 21, 21, 24, 27, 30}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<r53.j<? super k30.u>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f201933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f201934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f201935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, boolean z14, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f201933c = pVar;
        this.f201934d = str;
        this.f201935e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f201933c, this.f201934d, this.f201935e, dVar);
        oVar.f201932b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super k30.u> jVar, t13.d<? super Unit> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r0.emit(null, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r0.emit(null, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r0.emit(null, r8) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r0.emit(null, r8) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        v2 v2Var;
        k30.u uVar;
        r53.j jVar = (r53.j) this.f201932b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (this.f201931a) {
            case 0:
                o13.r.b(obj);
                int i14 = p.f201936b;
                p pVar = this.f201933c;
                pVar.getClass();
                String str = this.f201934d;
                if (str == null || str.length() == 0) {
                    lValueOf = null;
                } else {
                    try {
                        long j8 = Long.parseLong(str);
                        if (j8 > 0) {
                            lValueOf = Long.valueOf(j8);
                        } else {
                            lValueOf = null;
                        }
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                if (lValueOf != null) {
                    if (this.f201935e) {
                        d60.b bVar = pVar.f201937a;
                        long jLongValue = lValueOf.longValue();
                        this.f201932b = jVar;
                        this.f201931a = 1;
                        obj = bVar.C(new d60.x(bVar, jLongValue, null), this);
                        if (obj != aVar) {
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                uVar = (k30.u) ((v2.b) v2Var).f47386a;
                                if (uVar != null) {
                                    this.f201932b = null;
                                    this.f201931a = 3;
                                } else {
                                    gl1.y.U(uVar);
                                    this.f201932b = jVar;
                                    this.f201931a = 2;
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                this.f201932b = null;
                                this.f201931a = 4;
                            }
                        }
                        break;
                    } else {
                        this.f201932b = null;
                        this.f201931a = 5;
                        break;
                    }
                    return aVar;
                }
                this.f201932b = null;
                this.f201931a = 6;
                break;
            case 1:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    uVar = (k30.u) ((v2.b) v2Var).f47386a;
                    if (uVar != null) {
                        this.f201932b = null;
                        this.f201931a = 3;
                    } else {
                        gl1.y.U(uVar);
                        this.f201932b = jVar;
                        this.f201931a = 2;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f201932b = null;
                    this.f201931a = 4;
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
