package xz0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupNotFoundException;
import com.garmin.android.apps.connectmobile.group.excpetion.GroupRequestInvitationRemovedException;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestViewModel$acceptGroupInvitation$1", f = "InboxRequestViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_DTS, 140, 146, 148}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<t0<g3<? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f192833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f192834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f192835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f192836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, long j8, Long l14, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f192834c = pVar;
        this.f192835d = j8;
        this.f192836e = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f192834c, this.f192835d, this.f192836e, dVar);
        sVar.f192833b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((s) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0 t0Var = (t0) this.f192833b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192832a;
        if (i14 == 0) {
            o13.r.b(obj);
            jm0.b bVar = this.f192834c.f192818g;
            this.f192833b = t0Var;
            this.f192832a = 1;
            obj = bVar.q(this.f192835d, this.f192836e, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            if (((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                g3.a aVar2 = g3.f35298f;
                Boolean bool = Boolean.TRUE;
                aVar2.getClass();
                g3 g3VarD = g3.a.d(bool);
                this.f192833b = null;
                this.f192832a = 2;
            } else {
                g3 g3VarA = g3.a.a(g3.f35298f, null, new GroupRequestInvitationRemovedException(), null, null, 13);
                this.f192833b = null;
                this.f192832a = 3;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            Integer num = ((v2.a) v2Var).f47384b;
            if (num != null && num.intValue() == 404) {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, new GroupNotFoundException(), null, null, 13);
                this.f192833b = null;
                this.f192832a = 4;
            } else {
                g3 g3VarA3 = g3.a.a(g3.f35298f, null, new UnavailableReasonUnknownException(), null, null, 13);
                this.f192833b = null;
                this.f192832a = 5;
            }
        }
    }
}
