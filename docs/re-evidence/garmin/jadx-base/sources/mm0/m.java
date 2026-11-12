package mm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$leaveGroup$1", f = "GroupDetailViewModel.kt", l = {210, 211, 212, 216, 217}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<t0<g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f119557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, String str, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f119556c = eVar;
        this.f119557d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f119556c, this.f119557d, dVar);
        mVar.f119555b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Unit>> t0Var, t13.d<? super Unit> dVar) {
        return ((m) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        v2 v2Var;
        GroupDetailsDTO groupDetailsDTO;
        t0 t0Var = (t0) this.f119555b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119554a;
        e eVar = this.f119556c;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f119555b = t0Var;
            this.f119554a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    g3 g3VarA = g3.a.a(g3.f35298f, com.airbnb.lottie.animation.keyframe.a.d(aVar2.f47383a, "Leave failed: "), aVar2.f47383a, null, null, 12);
                    this.f119555b = null;
                    this.f119554a = 3;
                } else {
                    if (v2Var instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    groupDetailsDTO = eVar.f119507c;
                    if (groupDetailsDTO != null) {
                        groupDetailsDTO.f31578w = GroupDTO.c.NOT_DEFINED;
                    }
                    this.f119555b = t0Var;
                    this.f119554a = 4;
                    if (eVar.z4(groupDetailsDTO, this) != aVar) {
                        g3 g3VarE = g3.a.e(g3.f35298f);
                        this.f119555b = null;
                        this.f119554a = 5;
                    }
                }
                return aVar;
            }
            if (i14 != 3) {
                if (i14 == 4) {
                    o13.r.b(obj);
                    g3 g3VarE2 = g3.a.e(g3.f35298f);
                    this.f119555b = null;
                    this.f119554a = 5;
                } else if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ym0.a aVar3 = eVar.f119505a;
        this.f119555b = t0Var;
        this.f119554a = 2;
        ym0.a.C3709a c3709a = ym0.a.f197886f;
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        aVar3.getClass();
        objJ = f0.J(aVar3, new l0(aVar3, this.f119557d, strValueOf, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                v2.a aVar4 = (v2.a) v2Var;
                g3 g3VarA2 = g3.a.a(g3.f35298f, com.airbnb.lottie.animation.keyframe.a.d(aVar4.f47383a, "Leave failed: "), aVar4.f47383a, null, null, 12);
                this.f119555b = null;
                this.f119554a = 3;
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                groupDetailsDTO = eVar.f119507c;
                if (groupDetailsDTO != null) {
                    groupDetailsDTO.f31578w = GroupDTO.c.NOT_DEFINED;
                }
                this.f119555b = t0Var;
                this.f119554a = 4;
                if (eVar.z4(groupDetailsDTO, this) != aVar) {
                    g3 g3VarE3 = g3.a.e(g3.f35298f);
                    this.f119555b = null;
                    this.f119554a = 5;
                }
            }
        }
        return aVar;
    }
}
