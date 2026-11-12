package k10;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g22.n;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import ym0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.details.settings.GroupSettingsImageViewModel$setGroupDefaultImage$1", f = "GroupSettingsImageViewModel.kt", l = {50, 51, 52, 55}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t0<g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f102145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupDTO f102146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f102147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f102148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GroupDTO groupDTO, String str, d dVar, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f102146c = groupDTO;
        this.f102147d = str;
        this.f102148e = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f102146c, this.f102147d, this.f102148e, dVar);
        bVar.f102145b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((b) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L34;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        t0 t0Var = (t0) this.f102145b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102144a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f102145b = null;
                    this.f102144a = 2;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    g3.a aVar2 = g3.f35298f;
                    Unit unit = Unit.INSTANCE;
                    aVar2.getClass();
                    g3 g3VarD = g3.a.d(unit);
                    this.f102145b = null;
                    this.f102144a = 3;
                }
            } else {
                if (i14 != 2 && i14 != 3 && i14 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        String str = this.f102147d;
        GroupDTO groupDTO = this.f102146c;
        groupDTO.I = str;
        String str2 = groupDTO.f31564g;
        if (str2 == null || !n.d(str2)) {
            g3.f35298f.getClass();
            g3 g3VarD2 = g3.a.d(null);
            this.f102145b = null;
            this.f102144a = 4;
        } else {
            ym0.a aVar3 = this.f102148e.f102156b;
            String str3 = groupDTO.f31558a;
            str3.getClass();
            this.f102145b = t0Var;
            this.f102144a = 1;
            aVar3.getClass();
            obj = f0.J(aVar3, new j(aVar3, str3, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                    this.f102145b = null;
                    this.f102144a = 2;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    g3.a aVar4 = g3.f35298f;
                    Unit unit2 = Unit.INSTANCE;
                    aVar4.getClass();
                    g3 g3VarD3 = g3.a.d(unit2);
                    this.f102145b = null;
                    this.f102144a = 3;
                }
            }
        }
        return aVar;
    }
}
