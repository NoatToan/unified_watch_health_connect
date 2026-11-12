package t61;

import am.e2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lo61/l;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectViewModel$getTrainingEffectDailyStats$2", f = "TrainingEffectViewModel.kt", l = {30, 32, 33, 34}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<r53.j<? super g3<? extends List<? extends o61.l>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f162788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f162789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f162790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f162791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, DateTime dateTime, DateTime dateTime2, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f162789c = rVar;
        this.f162790d = dateTime;
        this.f162791e = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f162789c, this.f162790d, this.f162791e, dVar);
        pVar.f162788b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super g3<? extends List<? extends o61.l>>> jVar, t13.d<? super Unit> dVar) {
        return ((p) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0155, code lost:
    
        if (r1.emit(r3, r27) == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
    
        if (r1.emit(r3, r27) == r2) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [T, o61.l] */
    /* JADX WARN: Type inference failed for: r16v2, types: [T, o61.l] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, o61.l] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        List list;
        ArrayList arrayList;
        DateTime dateTime;
        o61.l lVar;
        r53.j jVar = (r53.j) this.f162788b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162787a;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f162788b = jVar;
            this.f162787a = 1;
            if (jVar.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                g3.a aVar2 = g3.f35298f;
                list = (List) ((v2.b) v2Var).f47386a;
                if (list != null || list.isEmpty()) {
                    arrayList = null;
                } else {
                    List listN0 = h0.N0(list, new o61.m());
                    arrayList = new ArrayList();
                    r0 r0Var = new r0();
                    int size = list.size();
                    int i15 = 0;
                    DateTime dateTime2 = null;
                    for (Object obj2 : listN0) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            x.q();
                            throw null;
                        }
                        o61.k kVar = (o61.k) obj2;
                        DateTime dateTimeH = kVar != null ? kVar.h() : null;
                        if (i15 == 0) {
                            dateTime = dateTimeH;
                            r0Var.f105810a = new o61.l(null, 0.0d, 0.0d, dateTimeH, null, 23, null);
                            dateTime2 = dateTime;
                        } else {
                            dateTime = dateTimeH;
                        }
                        boolean zG = s.g(dateTime, dateTime2);
                        boolean z15 = z14;
                        T t7 = r0Var.f105810a;
                        if (zG) {
                            o61.l lVar2 = (o61.l) t7;
                            r0Var.f105810a = lVar2 != null ? gl.b.U(lVar2, kVar) : 0;
                        } else {
                            o61.l lVar3 = (o61.l) t7;
                            if (lVar3 != null) {
                                arrayList.add(lVar3);
                            }
                            DateTime dateTime3 = dateTime;
                            ?? lVar4 = new o61.l(null, 0.0d, 0.0d, dateTime3, null, 23, null);
                            r0Var.f105810a = lVar4;
                            r0Var.f105810a = gl.b.U(lVar4, kVar);
                            dateTime2 = dateTime3;
                        }
                        if (i15 == size - 1 && (lVar = (o61.l) r0Var.f105810a) != null) {
                            arrayList.add(lVar);
                        }
                        i15 = i16;
                        z14 = z15;
                    }
                }
                aVar2.getClass();
                g3 g3VarD = g3.a.d(arrayList);
                this.f162788b = null;
                this.f162787a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                g3 g3VarA = g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.getMessage(), null, null, null, 14);
                this.f162788b = null;
                this.f162787a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        p61.e eVar = this.f162789c.f162796a;
        this.f162788b = jVar;
        this.f162787a = 2;
        eVar.getClass();
        objJ = f0.J(eVar, new p61.d(eVar, new p40.h(1), this.f162790d, this.f162791e, false, x.k(e2.ACTIVITY_AEROBIC_TRAINING_EFFECT.f3931a, e2.ACTIVITY_ANAEROBIC_TRAINING_EFFECT.f3931a, e2.TRAINING_EFFECT_LABELS.f3931a, e2.TRAINING_EFFECT_LABELS_SRVR_CALC.f3931a, e2.ACTIVITY_TRAINING_LOAD_SRVR_CALC.f3931a), null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                g3.a aVar3 = g3.f35298f;
                list = (List) ((v2.b) v2Var).f47386a;
                if (list != null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                }
                aVar3.getClass();
                g3 g3VarD2 = g3.a.d(arrayList);
                this.f162788b = null;
                this.f162787a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                g3 g3VarA2 = g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.getMessage(), null, null, null, 14);
                this.f162788b = null;
                this.f162787a = 4;
            }
        }
        return aVar;
    }
}
