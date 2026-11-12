package om0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.LinkedHashMap;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import ym0.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$changeUserRole$1", f = "GroupManageMembersViewModel.kt", l = {96, 99, 104, 113, 118, 120}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.connections.groups.services.model.b f132928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupDTO.c f132929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.c f132930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f132931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f132932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, GroupDTO.c cVar, com.garmin.android.apps.connectmobile.group.details.about.member.c cVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f132928c = bVar;
        this.f132929d = cVar;
        this.f132930e = cVar2;
        this.f132931f = aVar;
        this.f132932g = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f132928c, this.f132929d, this.f132930e, this.f132931f, this.f132932g, dVar);
        kVar.f132927b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
        return ((k) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L52;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        r53.j jVar = (r53.j) this.f132927b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132926a;
        GroupDTO.c cVar = this.f132929d;
        com.garmin.android.apps.connectmobile.group.details.about.member.c cVar2 = this.f132930e;
        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = this.f132928c;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                Boolean bool = Boolean.TRUE;
                this.f132927b = jVar;
                this.f132926a = 1;
                if (jVar.emit(bool, this) != aVar) {
                    if (bVar.getGroupRole() != cVar || cVar == null) {
                        Boolean bool2 = Boolean.FALSE;
                        this.f132927b = null;
                        this.f132926a = 2;
                    } else {
                        ym0.a aVar2 = cVar2.f36235b;
                        String groupId = bVar.getGroupId();
                        String str = groupId == null ? "" : groupId;
                        String userProfileId = bVar.getUserProfileId();
                        String str2 = userProfileId == null ? "" : userProfileId;
                        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVarC = com.garmin.android.apps.connectmobile.connections.groups.services.model.b.C(bVar, cVar, null, 32703);
                        this.f132927b = jVar;
                        this.f132926a = 3;
                        aVar2.getClass();
                        obj = f0.J(aVar2, new t0(aVar2, str, str2, bVarC, null), this);
                        if (obj != aVar) {
                            v2Var = (v2) obj;
                            if (!(v2Var instanceof v2.a)) {
                                String str3 = ((v2.a) v2Var).f47385c;
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar3.getClass();
                                i2.a.f(a2Var, "GroupManageMembersViewModel", str3);
                                this.f132931f.invoke();
                                Boolean bool3 = Boolean.FALSE;
                                this.f132927b = null;
                                this.f132926a = 4;
                            } else {
                                if (v2Var instanceof v2.b) {
                                    u0.r();
                                    return null;
                                }
                                LinkedHashMap linkedHashMapN = p13.u0.n((Map) cVar2.f36239f.getValue());
                                String userProfileId2 = bVar.getUserProfileId();
                                linkedHashMapN.put(userProfileId2 != null ? userProfileId2 : "", cVar);
                                p2 p2Var = cVar2.f36239f;
                                this.f132927b = jVar;
                                this.f132926a = 5;
                                p2Var.k(null, linkedHashMapN);
                                if (Unit.INSTANCE != aVar) {
                                    this.f132932g.invoke();
                                    Boolean bool4 = Boolean.FALSE;
                                    this.f132927b = null;
                                    this.f132926a = 6;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                if (bVar.getGroupRole() != cVar) {
                    Boolean bool5 = Boolean.FALSE;
                    this.f132927b = null;
                    this.f132926a = 2;
                    break;
                } else {
                    Boolean bool6 = Boolean.FALSE;
                    this.f132927b = null;
                    this.f132926a = 2;
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 3:
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (!(v2Var instanceof v2.a)) {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    LinkedHashMap linkedHashMapN2 = p13.u0.n((Map) cVar2.f36239f.getValue());
                    String userProfileId3 = bVar.getUserProfileId();
                    linkedHashMapN2.put(userProfileId3 != null ? userProfileId3 : "", cVar);
                    p2 p2Var2 = cVar2.f36239f;
                    this.f132927b = jVar;
                    this.f132926a = 5;
                    p2Var2.k(null, linkedHashMapN2);
                    if (Unit.INSTANCE != aVar) {
                        this.f132932g.invoke();
                        Boolean bool7 = Boolean.FALSE;
                        this.f132927b = null;
                        this.f132926a = 6;
                    }
                    break;
                } else {
                    String str4 = ((v2.a) v2Var).f47385c;
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var2, "GroupManageMembersViewModel", str4);
                    this.f132931f.invoke();
                    Boolean bool8 = Boolean.FALSE;
                    this.f132927b = null;
                    this.f132926a = 4;
                    break;
                }
                return aVar;
            case 4:
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 5:
                o13.r.b(obj);
                this.f132932g.invoke();
                Boolean bool9 = Boolean.FALSE;
                this.f132927b = null;
                this.f132926a = 6;
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
