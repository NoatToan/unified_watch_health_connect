package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.PagedReviewsUseCase$loadNextReviewPage$1", f = "PagedReviewsUseCase.kt", l = {124, 128, 146, ModuleDescriptor.MODULE_VERSION, 163}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f179863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f179864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f179865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Context context, Set<Long> set, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f179863b = lVar;
        this.f179864c = context;
        this.f179865d = set;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f179863b, this.f179864c, this.f179865d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        if (r1.emit(r0, r22) == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
    
        if (r0.emit(r1, r22) == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01af, code lost:
    
        if (r0.emit(r1, r22) == r7) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objW0;
        v2 v2Var;
        qs1.v vVar;
        List<qs1.u> listB;
        boolean resultsFiltered;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179862a;
        l lVar = this.f179863b;
        if (i14 == 0) {
            o13.r.b(obj);
            z1<pt1.w> z1Var = lVar.f179850c;
            pt1.w wVarA = pt1.w.a(z1Var.getValue(), false, true, null, false, false, false, 109);
            this.f179862a = 1;
            if (z1Var.emit(wVarA, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            objW0 = obj;
            v2Var = (v2) objW0;
            if (v2Var instanceof v2.b) {
                vVar = (qs1.v) ((v2.b) v2Var).f47386a;
                if (vVar != null) {
                    listB = vVar.b();
                } else {
                    listB = null;
                }
                if (vVar != null) {
                    resultsFiltered = vVar.getResultsFiltered();
                } else {
                    resultsFiltered = false;
                }
                if (listB != null || listB.isEmpty()) {
                    z1<pt1.w> z1Var2 = lVar.f179850c;
                    pt1.w wVarA2 = pt1.w.a(z1Var2.getValue(), false, false, null, true, false, false, 109);
                    this.f179862a = 4;
                } else {
                    ArrayList arrayList = new ArrayList(p13.y.r(listB, 10));
                    for (qs1.u uVar : listB) {
                        lt1.j jVar = lt1.j.f114865a;
                        boolean zR = p13.h0.R(this.f179865d, uVar.getTripReportId());
                        qs1.h hVar = (qs1.h) lVar.f179852e.getF182175a();
                        String str = (String) lVar.f179853f.getF182175a();
                        jVar.getClass();
                        arrayList.add(lt1.j.e(uVar, this.f179864c, zR, hVar, str));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        pt1.x xVar = (pt1.x) obj2;
                        if (!d53.w.J(xVar.f141010g) || !xVar.f141012i.isEmpty() || !xVar.f141013j.isEmpty()) {
                            arrayList2.add(obj2);
                        }
                    }
                    boolean z14 = (!resultsFiltered && listB.size() < 20) || listB.isEmpty();
                    i53.c<pt1.x> cVar = lVar.f179850c.getValue().f141000d;
                    ArrayList arrayListC0 = cVar != null ? p13.h0.C0(cVar, arrayList2) : null;
                    z1<pt1.w> z1Var3 = lVar.f179850c;
                    pt1.w wVarA3 = pt1.w.a(z1Var3.getValue(), false, false, arrayListC0 != null ? i53.a.e(arrayListC0) : null, z14, false, false, 101);
                    this.f179862a = 3;
                }
                return aVar;
            }
            z1<pt1.w> z1Var4 = lVar.f179850c;
            pt1.w wVarA4 = pt1.w.a(z1Var4.getValue(), false, false, null, false, false, true, 61);
            this.f179862a = 5;
        } else if (i14 == 3) {
            o13.r.b(obj);
            lVar.f179855h += 20;
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ss1.a0 a0Var = lVar.f179849b;
        long j8 = lVar.f179851d.j();
        us1.e eVar = lVar.f179850c.getValue().f140999c;
        int i15 = lVar.f179855h;
        this.f179862a = 2;
        objW0 = a0Var.w0(j8, eVar, i15, i15 + 20, this);
        if (objW0 != aVar) {
            v2Var = (v2) objW0;
            if (v2Var instanceof v2.b) {
                vVar = (qs1.v) ((v2.b) v2Var).f47386a;
                if (vVar != null) {
                    listB = vVar.b();
                } else {
                    listB = null;
                }
                if (vVar != null) {
                    resultsFiltered = vVar.getResultsFiltered();
                } else {
                    resultsFiltered = false;
                }
                if (listB != null) {
                }
                z1<pt1.w> z1Var5 = lVar.f179850c;
                pt1.w wVarA5 = pt1.w.a(z1Var5.getValue(), false, false, null, true, false, false, 109);
                this.f179862a = 4;
            } else {
                z1<pt1.w> z1Var6 = lVar.f179850c;
                pt1.w wVarA6 = pt1.w.a(z1Var6.getValue(), false, false, null, false, false, true, 61);
                this.f179862a = 5;
            }
        }
        return aVar;
    }
}
