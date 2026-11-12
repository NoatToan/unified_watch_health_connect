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
import ym0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupManageMembersViewModel$leaveGroup$1", f = "GroupManageMembersViewModel.kt", l = {127, 128, 132, 137, 139}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.about.member.c f132935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f132936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f132937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f132938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.android.apps.connectmobile.group.details.about.member.c cVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f132935c = cVar;
        this.f132936d = str;
        this.f132937e = aVar;
        this.f132938f = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f132935c, this.f132936d, this.f132937e, this.f132938f, dVar);
        lVar.f132934b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
        return ((l) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        r53.j jVar = (r53.j) this.f132934b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132933a;
        String str = this.f132936d;
        com.garmin.android.apps.connectmobile.group.details.about.member.c cVar = this.f132935c;
        if (i14 == 0) {
            o13.r.b(obj);
            Boolean bool = Boolean.TRUE;
            this.f132934b = jVar;
            this.f132933a = 1;
            if (jVar.emit(bool, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    String str2 = ((v2.a) v2Var).f47385c;
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "GroupManageMembersViewModel", str2);
                    this.f132937e.invoke();
                    Boolean bool2 = Boolean.FALSE;
                    this.f132934b = null;
                    this.f132933a = 3;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    LinkedHashMap linkedHashMapN = p13.u0.n((Map) cVar.f36239f.getValue());
                    linkedHashMapN.put(str, GroupDTO.c.NOT_DEFINED);
                    p2 p2Var = cVar.f36239f;
                    this.f132934b = jVar;
                    this.f132933a = 4;
                    p2Var.k(null, linkedHashMapN);
                    if (Unit.INSTANCE != aVar) {
                        this.f132938f.invoke();
                        Boolean bool3 = Boolean.FALSE;
                        this.f132934b = null;
                        this.f132933a = 5;
                    }
                }
                return aVar;
            }
            if (i14 != 3) {
                if (i14 == 4) {
                    o13.r.b(obj);
                    this.f132938f.invoke();
                    Boolean bool4 = Boolean.FALSE;
                    this.f132934b = null;
                    this.f132933a = 5;
                } else if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ym0.a aVar3 = cVar.f36235b;
        GroupDTO groupDTO = cVar.f36234a;
        String str3 = groupDTO != null ? groupDTO.f31558a : null;
        if (str3 == null) {
            str3 = "";
        }
        this.f132934b = jVar;
        this.f132933a = 2;
        aVar3.getClass();
        obj = f0.J(aVar3, new l0(aVar3, str3, str, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                String str4 = ((v2.a) v2Var).f47385c;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "GroupManageMembersViewModel", str4);
                this.f132937e.invoke();
                Boolean bool5 = Boolean.FALSE;
                this.f132934b = null;
                this.f132933a = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                LinkedHashMap linkedHashMapN2 = p13.u0.n((Map) cVar.f36239f.getValue());
                linkedHashMapN2.put(str, GroupDTO.c.NOT_DEFINED);
                p2 p2Var2 = cVar.f36239f;
                this.f132934b = jVar;
                this.f132933a = 4;
                p2Var2.k(null, linkedHashMapN2);
                if (Unit.INSTANCE != aVar) {
                    this.f132938f.invoke();
                    Boolean bool6 = Boolean.FALSE;
                    this.f132934b = null;
                    this.f132933a = 5;
                }
            }
        }
        return aVar;
    }
}
