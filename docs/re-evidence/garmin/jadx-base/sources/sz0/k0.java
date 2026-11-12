package sz0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupNotFoundException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupPrivacyException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupRequestInvitationRemovedException;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsViewModel$acceptGroupMemberRequest$1", f = "NotificationsViewModel.kt", l = {286, 290, 292, 299, MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 303}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<t0<g3<? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f161440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f161441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f161442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f161443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i0 i0Var, long j8, long j14, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f161441c = i0Var;
        this.f161442d = j8;
        this.f161443e = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k0 k0Var = new k0(this.f161441c, this.f161442d, this.f161443e, dVar);
        k0Var.f161440b = obj;
        return k0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        v2 v2Var;
        Integer num;
        t0 t0Var = (t0) this.f161440b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (this.f161439a) {
            case 0:
                o13.r.b(obj);
                jm0.b bVar = this.f161441c.f161421i;
                this.f161440b = t0Var;
                this.f161439a = 1;
                k0Var = this;
                obj = bVar.c(this.f161442d, this.f161443e, k0Var);
                if (obj != aVar) {
                    v2Var = (v2) obj;
                    if (v2Var instanceof v2.b) {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        num = ((v2.a) v2Var).f47384b;
                        if (num != null && num.intValue() == 404) {
                            g3 g3VarA = g3.a.a(g3.f35298f, null, new GroupNotFoundException(), null, null, 13);
                            k0Var.f161440b = null;
                            k0Var.f161439a = 4;
                        } else if (num == null || num.intValue() != 403) {
                            g3 g3VarA2 = g3.a.a(g3.f35298f, null, new UnavailableReasonUnknownException(), null, null, 13);
                            k0Var.f161440b = null;
                            k0Var.f161439a = 6;
                        } else {
                            g3 g3VarA3 = g3.a.a(g3.f35298f, null, new GroupPrivacyException(), null, null, 13);
                            k0Var.f161440b = null;
                            k0Var.f161439a = 5;
                        }
                    } else if (((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                        g3 g3VarA4 = g3.a.a(g3.f35298f, null, new GroupRequestInvitationRemovedException(), null, null, 13);
                        k0Var.f161440b = null;
                        k0Var.f161439a = 3;
                    } else {
                        g3.a aVar2 = g3.f35298f;
                        Boolean bool = Boolean.TRUE;
                        aVar2.getClass();
                        g3 g3VarD = g3.a.d(bool);
                        k0Var.f161440b = null;
                        k0Var.f161439a = 2;
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                k0Var = this;
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    num = ((v2.a) v2Var).f47384b;
                    if (num != null) {
                        g3 g3VarA5 = g3.a.a(g3.f35298f, null, new GroupNotFoundException(), null, null, 13);
                        k0Var.f161440b = null;
                        k0Var.f161439a = 4;
                    }
                    if (num == null) {
                        g3 g3VarA6 = g3.a.a(g3.f35298f, null, new GroupPrivacyException(), null, null, 13);
                        k0Var.f161440b = null;
                        k0Var.f161439a = 5;
                    }
                    g3 g3VarA7 = g3.a.a(g3.f35298f, null, new UnavailableReasonUnknownException(), null, null, 13);
                    k0Var.f161440b = null;
                    k0Var.f161439a = 6;
                } else if (((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                    g3 g3VarA8 = g3.a.a(g3.f35298f, null, new GroupRequestInvitationRemovedException(), null, null, 13);
                    k0Var.f161440b = null;
                    k0Var.f161439a = 3;
                } else {
                    g3.a aVar3 = g3.f35298f;
                    Boolean bool2 = Boolean.TRUE;
                    aVar3.getClass();
                    g3 g3VarD2 = g3.a.d(bool2);
                    k0Var.f161440b = null;
                    k0Var.f161439a = 2;
                }
                break;
            case 2:
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
