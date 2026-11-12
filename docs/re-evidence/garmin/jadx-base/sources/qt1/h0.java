package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$refreshOverviewReviews$1", f = "TrailDetailsViewModel.kt", l = {608, 612, 631, 633}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f147647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f147648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f147649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f147651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f147652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f147653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k kVar, Context context, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f147652f = kVar;
        this.f147653g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f147652f, this.f147653g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a0  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f1, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r7) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i14;
        Object objW0;
        k kVar;
        long j8;
        Context context;
        v2 v2Var;
        List<qs1.u> listB;
        i53.c cVarE;
        ArrayList arrayList;
        qs1.d dVar;
        qs1.h hVar;
        qs1.d dVar2;
        String courseNameUriComponent;
        qs1.v vVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f147651e;
        k kVar2 = this.f147652f;
        if (i15 == 0) {
            o13.r.b(obj);
            p2 p2Var = kVar2.f147673h;
            pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
            this.f147651e = 1;
            p2Var.k(null, oVarA);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 == 2) {
                int i16 = this.f147650d;
                j8 = this.f147649c;
                context = this.f147648b;
                kVar = this.f147647a;
                o13.r.b(obj);
                i14 = i16;
                objW0 = obj;
                v2Var = (v2) objW0;
                if ((v2Var instanceof v2.b) || (vVar = (qs1.v) ((v2.b) v2Var).f47386a) == null) {
                    listB = null;
                } else {
                    listB = vVar.b();
                }
                if (listB != null) {
                    arrayList = new ArrayList(p13.y.r(listB, 10));
                    for (qs1.u uVar : listB) {
                        lt1.j jVar = lt1.j.f114865a;
                        boolean zR = p13.h0.R(kVar.f147684t.f179847f, uVar.getTripReportId());
                        dVar = kVar.f147672g;
                        if (dVar != null || (hVar = dVar.getLocationDTO()) == null) {
                            hVar = new qs1.h(null, null, null, null, null, 31, null);
                        }
                        dVar2 = kVar.f147672g;
                        if (dVar2 != null || (courseNameUriComponent = dVar2.getCourseNameUriComponent()) == null) {
                            courseNameUriComponent = "";
                        }
                        jVar.getClass();
                        arrayList.add(lt1.j.e(uVar, context, zR, hVar, courseNameUriComponent));
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                p2 p2Var2 = kVar.f147673h;
                pt1.o oVarA2 = pt1.o.a((pt1.o) p2Var2.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                this.f147647a = null;
                this.f147648b = null;
                this.f147649c = j8;
                this.f147650d = i14;
                this.f147651e = 3;
                p2Var2.k(null, oVarA2);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var3 = kVar2.f147673h;
                    pt1.o oVarA3 = pt1.o.a((pt1.o) p2Var3.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f147647a = null;
                    this.f147648b = null;
                    this.f147651e = 4;
                    p2Var3.k(null, oVarA3);
                }
                return aVar;
            }
            if (i15 == 3) {
                o13.r.b(obj);
                p2 p2Var4 = kVar2.f147673h;
                pt1.o oVarA4 = pt1.o.a((pt1.o) p2Var4.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f147647a = null;
                this.f147648b = null;
                this.f147651e = 4;
                p2Var4.k(null, oVarA4);
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        qs1.d dVar3 = kVar2.f147672g;
        Long curatedCourseId = dVar3 != null ? dVar3.getCuratedCourseId() : null;
        if (curatedCourseId != null) {
            long jLongValue = curatedCourseId.longValue();
            Long l14 = curatedCourseId;
            ss1.a0 a0Var = kVar2.f147667b;
            long jLongValue2 = l14.longValue();
            us1.e eVar = us1.e.MOST_HELPFUL;
            this.f147647a = kVar2;
            Context context2 = this.f147653g;
            this.f147648b = context2;
            this.f147649c = jLongValue;
            i14 = 0;
            this.f147650d = 0;
            this.f147651e = 2;
            objW0 = a0Var.w0(jLongValue2, eVar, 0, 5, this);
            if (objW0 != aVar) {
                kVar = kVar2;
                j8 = jLongValue;
                context = context2;
                v2Var = (v2) objW0;
                if (v2Var instanceof v2.b) {
                    listB = null;
                } else {
                    listB = null;
                }
                if (listB != null) {
                    arrayList = new ArrayList(p13.y.r(listB, 10));
                    while (r0.hasNext()) {
                        lt1.j jVar2 = lt1.j.f114865a;
                        boolean zR2 = p13.h0.R(kVar.f147684t.f179847f, uVar.getTripReportId());
                        dVar = kVar.f147672g;
                        if (dVar != null) {
                            hVar = new qs1.h(null, null, null, null, null, 31, null);
                        } else {
                            hVar = new qs1.h(null, null, null, null, null, 31, null);
                        }
                        dVar2 = kVar.f147672g;
                        if (dVar2 != null) {
                            courseNameUriComponent = "";
                        } else {
                            courseNameUriComponent = "";
                        }
                        jVar2.getClass();
                        arrayList.add(lt1.j.e(uVar, context, zR2, hVar, courseNameUriComponent));
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                p2 p2Var5 = kVar.f147673h;
                pt1.o oVarA5 = pt1.o.a((pt1.o) p2Var5.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                this.f147647a = null;
                this.f147648b = null;
                this.f147649c = j8;
                this.f147650d = i14;
                this.f147651e = 3;
                p2Var5.k(null, oVarA5);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var6 = kVar2.f147673h;
                    pt1.o oVarA6 = pt1.o.a((pt1.o) p2Var6.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f147647a = null;
                    this.f147648b = null;
                    this.f147651e = 4;
                    p2Var6.k(null, oVarA6);
                }
            }
        } else {
            p2 p2Var7 = kVar2.f147673h;
            pt1.o oVarA7 = pt1.o.a((pt1.o) p2Var7.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
            this.f147647a = null;
            this.f147648b = null;
            this.f147651e = 4;
            p2Var7.k(null, oVarA7);
        }
        return aVar;
    }
}
