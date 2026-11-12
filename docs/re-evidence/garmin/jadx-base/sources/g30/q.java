package g30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import d60.x;
import gl1.y;
import java.util.List;
import k30.u;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lk30/u;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.planner.GetOnCourseRouteFeaturesUseCase$invoke$1", f = "GetOnCourseRouteFeaturesUseCase.kt", l = {23, 25, 30, 30, 33, 36}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super u>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f75670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f75671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.garmin.android.apps.connectmobile.courses.model.e eVar, r rVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f75670d = eVar;
        this.f75671e = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f75670d, this.f75671e, dVar);
        qVar.f75669c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super u> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r0.emit(null, r10) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r0.emit(null, r10) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
    
        if (r0.emit(null, r10) == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        boolean z14;
        List<GeoPointDTO> list;
        v2 v2Var;
        u uVar;
        r53.j jVar = (r53.j) this.f75669c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (this.f75668b) {
            case 0:
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f75670d;
                String str = eVar.courseId;
                boolean zC = eVar.m().c();
                int i14 = r.f75672b;
                r rVar = this.f75671e;
                rVar.getClass();
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
                if (zC && (lValueOf != null || ((list = eVar.geoPoints) != null && !list.isEmpty()))) {
                    d60.b bVar = rVar.f75673a;
                    if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        this.f75669c = jVar;
                        this.f75667a = zC;
                        this.f75668b = 1;
                        obj = bVar.C(new x(bVar, jLongValue, null), this);
                        if (obj != aVar) {
                            z14 = zC;
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                uVar = (u) ((v2.b) v2Var).f47386a;
                                if (uVar != null) {
                                    this.f75669c = null;
                                    this.f75667a = z14;
                                    this.f75668b = 4;
                                } else {
                                    y.U(uVar);
                                    this.f75669c = jVar;
                                    this.f75667a = z14;
                                    this.f75668b = 3;
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                this.f75669c = null;
                                this.f75667a = z14;
                                this.f75668b = 5;
                            }
                        }
                    } else {
                        List list2 = eVar.geoPoints;
                        if (list2 == null) {
                            list2 = j0.f134944a;
                        }
                        this.f75669c = jVar;
                        this.f75667a = zC;
                        this.f75668b = 2;
                        obj = bVar.C(new d60.y(list2, bVar, null), this);
                        if (obj != aVar) {
                            z14 = zC;
                            v2Var = (v2) obj;
                            if (v2Var instanceof v2.b) {
                                uVar = (u) ((v2.b) v2Var).f47386a;
                                if (uVar != null) {
                                    this.f75669c = null;
                                    this.f75667a = z14;
                                    this.f75668b = 4;
                                } else {
                                    y.U(uVar);
                                    this.f75669c = jVar;
                                    this.f75667a = z14;
                                    this.f75668b = 3;
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                this.f75669c = null;
                                this.f75667a = z14;
                                this.f75668b = 5;
                            }
                        }
                    }
                    break;
                } else {
                    this.f75669c = null;
                    this.f75667a = zC;
                    this.f75668b = 6;
                    break;
                }
                return aVar;
            case 1:
                z14 = this.f75667a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    uVar = (u) ((v2.b) v2Var).f47386a;
                    if (uVar != null) {
                        this.f75669c = null;
                        this.f75667a = z14;
                        this.f75668b = 4;
                    } else {
                        y.U(uVar);
                        this.f75669c = jVar;
                        this.f75667a = z14;
                        this.f75668b = 3;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f75669c = null;
                    this.f75667a = z14;
                    this.f75668b = 5;
                }
                break;
            case 2:
                z14 = this.f75667a;
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    uVar = (u) ((v2.b) v2Var).f47386a;
                    if (uVar != null) {
                        this.f75669c = null;
                        this.f75667a = z14;
                        this.f75668b = 4;
                    } else {
                        y.U(uVar);
                        this.f75669c = jVar;
                        this.f75667a = z14;
                        this.f75668b = 3;
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    this.f75669c = null;
                    this.f75667a = z14;
                    this.f75668b = 5;
                }
                break;
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
