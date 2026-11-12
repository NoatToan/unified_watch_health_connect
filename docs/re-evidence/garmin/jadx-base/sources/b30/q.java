package b30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.x;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ln30/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.automatic.SelectCourseUseCase$invoke$1", f = "SelectCourseUseCase.kt", l = {17, 24, 28, 39}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super n30.k>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w20.a f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n30.k f15564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f15566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n30.k kVar, int i14, r rVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f15564d = kVar;
        this.f15565e = i14;
        this.f15566f = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f15564d, this.f15565e, this.f15566f, dVar);
        qVar.f15563c = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super n30.k> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r1.emit(r9, r18) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L56;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w20.a aVar;
        Object objA;
        k30.u uVar;
        List<ClimbDTO> listB;
        ArrayList arrayList;
        x unpavedSections;
        k30.t highTrafficSections;
        List<fn0.b> listD;
        r53.j jVar = (r53.j) this.f15563c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f15562b;
        int i15 = this.f15565e;
        n30.k kVar = this.f15564d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                aVar = this.f15561a;
                o13.r.b(obj);
                objA = obj;
                w20.a aVar3 = aVar;
                uVar = (k30.u) objA;
                if (uVar != null) {
                    listB = uVar.b();
                } else {
                    listB = null;
                }
                if (uVar != null || (listD = uVar.d()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(y.r(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(d30.b.d((fn0.b) it.next()));
                    }
                    arrayList = arrayList2;
                }
                if (uVar != null) {
                    unpavedSections = uVar.getUnpavedSections();
                } else {
                    unpavedSections = null;
                }
                if (uVar != null) {
                    highTrafficSections = uVar.getHighTrafficSections();
                } else {
                    highTrafficSections = null;
                }
                w20.a aVarB = w20.a.b(aVar3, null, listB, arrayList, unpavedSections, highTrafficSections, 1);
                ArrayList arrayListD1 = h0.d1(kVar.f123522a);
                arrayListD1.set(i15, aVarB);
                n30.k kVarA = n30.k.a(kVar, arrayListD1, i15, null, 4);
                this.f15563c = null;
                this.f15561a = null;
                this.f15562b = 4;
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        List<w20.a> list = kVar.f123522a;
        aVar = list != null ? (w20.a) h0.e0(i15, list) : null;
        if (aVar == null) {
            this.f15563c = null;
            this.f15561a = null;
            this.f15562b = 1;
        } else if (aVar.f181481f) {
            n30.k kVarA2 = n30.k.a(kVar, null, i15, null, 5);
            this.f15563c = null;
            this.f15561a = null;
            this.f15562b = 2;
        } else {
            z20.r rVar = this.f15566f.f15567a;
            com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
            List<GeoPointDTO> list2 = eVar.geoPoints;
            boolean zC = eVar.m().c();
            this.f15563c = jVar;
            this.f15561a = aVar;
            this.f15562b = 3;
            objA = rVar.a(list2, zC, this);
            if (objA != aVar2) {
                w20.a aVar4 = aVar;
                uVar = (k30.u) objA;
                if (uVar != null) {
                    listB = uVar.b();
                } else {
                    listB = null;
                }
                if (uVar != null) {
                    arrayList = null;
                } else {
                    arrayList = null;
                }
                if (uVar != null) {
                    unpavedSections = uVar.getUnpavedSections();
                } else {
                    unpavedSections = null;
                }
                if (uVar != null) {
                    highTrafficSections = uVar.getHighTrafficSections();
                } else {
                    highTrafficSections = null;
                }
                w20.a aVarB2 = w20.a.b(aVar4, null, listB, arrayList, unpavedSections, highTrafficSections, 1);
                ArrayList arrayListD2 = h0.d1(kVar.f123522a);
                arrayListD2.set(i15, aVarB2);
                n30.k kVarA3 = n30.k.a(kVar, arrayListD2, i15, null, 4);
                this.f15563c = null;
                this.f15561a = null;
                this.f15562b = 4;
            }
        }
        return aVar2;
    }
}
