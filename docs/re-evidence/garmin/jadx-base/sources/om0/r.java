package om0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipViewModel$editGroupOwnership$1", f = "GroupTransferOwnershipViewModel.kt", l = {54, 55, 56, 59}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<r53.j<? super g3<? extends GroupDetailsDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.d f132966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f132967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.apps.connectmobile.group.details.about.member.d dVar, String str, t13.d<? super r> dVar2) {
        super(2, dVar2);
        this.f132966c = dVar;
        this.f132967d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f132966c, this.f132967d, dVar);
        rVar.f132965b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super g3<? extends GroupDetailsDTO>> jVar, t13.d<? super Unit> dVar) {
        return ((r) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r1.emit(r8, r17) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        r53.j jVar = (r53.j) this.f132965b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132964a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    g3.a aVar2 = g3.f35298f;
                    v2.a aVar3 = (v2.a) v2Var;
                    String str = aVar3.f47385c;
                    Exception exc = aVar3.f47383a;
                    Integer num = aVar3.f47384b;
                    aVar2.getClass();
                    g3 g3Var = new g3(fw.p.ERROR, null, str, exc, num);
                    this.f132965b = null;
                    this.f132964a = 2;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    g3.a aVar4 = g3.f35298f;
                    T t7 = ((v2.b) v2Var).f47386a;
                    aVar4.getClass();
                    g3 g3VarD = g3.a.d(t7);
                    this.f132965b = null;
                    this.f132964a = 3;
                }
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.group.details.about.member.d dVar = this.f132966c;
        GroupDTO groupDTO = dVar.f36251a;
        if (groupDTO != null) {
            groupDTO.f31561d = this.f132967d;
            ym0.a aVar5 = dVar.f36252b;
            String str2 = groupDTO.f31558a;
            str2.getClass();
            GroupDTO groupDTO2 = dVar.f36251a;
            this.f132965b = jVar;
            this.f132964a = 1;
            aVar5.getClass();
            objJ = f0.J(aVar5, new ym0.l(aVar5, str2, groupDTO2, null), this);
            if (objJ != aVar) {
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    g3.a aVar6 = g3.f35298f;
                    v2.a aVar7 = (v2.a) v2Var;
                    String str3 = aVar7.f47385c;
                    Exception exc2 = aVar7.f47383a;
                    Integer num2 = aVar7.f47384b;
                    aVar6.getClass();
                    g3 g3Var2 = new g3(fw.p.ERROR, null, str3, exc2, num2);
                    this.f132965b = null;
                    this.f132964a = 2;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    g3.a aVar8 = g3.f35298f;
                    T t14 = ((v2.b) v2Var).f47386a;
                    aVar8.getClass();
                    g3 g3VarD2 = g3.a.d(t14);
                    this.f132965b = null;
                    this.f132964a = 3;
                }
            }
        } else {
            g3 g3VarA = g3.a.a(g3.f35298f, "GroupDTO is null", null, null, null, 14);
            this.f132965b = null;
            this.f132964a = 4;
        }
        return aVar;
    }
}
