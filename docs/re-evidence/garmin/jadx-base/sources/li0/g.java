package li0;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.follow.exception.FollowerOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.FollowingOverLimitException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.ui.FollowAction$acceptRequest$1$1", f = "FollowAction.kt", l = {SyslogConstants.LOG_LOCAL3, 166}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.b f112721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f112723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f112724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f.b f112725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f112726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, d0 d0Var, f.b bVar, Context context, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f112723d = fVar;
        this.f112724e = d0Var;
        this.f112725f = bVar;
        this.f112726g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f112723d, this.f112724e, this.f112725f, this.f112726g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        f.b bVar;
        g12.k kVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112722c;
        d0 d0Var = this.f112724e;
        f fVar = this.f112723d;
        if (i14 == 0) {
            o13.r.b(obj);
            ei0.d dVar = fVar.f112664e;
            Long l14 = d0Var != null ? d0Var.f112655h : null;
            this.f112722c = 1;
            obj = dVar.I3(l14, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.f112721b;
            o13.r.b(obj);
        }
        kVar = bVar.f112668c;
        if (kVar != null) {
            kVar.invoke();
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.a;
        f.b bVar2 = this.f112725f;
        if (!z14) {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            l0 l0VarB = m0.b(fVar.f112665f, d0Var != null ? e0.e(d0Var) : null, m0.a.ACCEPT_REQUEST);
            str = d0Var != null ? d0Var.f112650c : null;
            this.f112720a = obj;
            this.f112721b = bVar2;
            this.f112722c = 2;
            if (f.a(fVar, str, l0VarB, this) != aVar) {
                bVar = bVar2;
                kVar = bVar.f112668c;
                if (kVar != null) {
                    kVar.invoke();
                }
            }
            return aVar;
        }
        e23.a<Unit> aVar2 = bVar2.f112667b;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        v2.a aVar3 = (v2.a) v2Var;
        Exception exc = aVar3.f47383a;
        str = d0Var != null ? d0Var.f112651d : null;
        if (str == null) {
            str = "";
        }
        Context context = this.f112726g;
        context.getClass();
        exc.getClass();
        if (exc instanceof FollowerOverLimitException) {
            Context contextA = ei0.q0.a(context);
            if (contextA == null) {
                contextA = context;
            }
            new androidx.appcompat.app.e.a(contextA).setTitle(R.string.follow_error_unable_to_accept_follower_request_title).setMessage(context.getString(R.string.follow_error_unable_to_accept_follower_request_description, String.format("%,d", Arrays.copyOf(new Object[]{100000}, 1)))).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(23)).show();
        } else if (exc instanceof FollowingOverLimitException) {
            Context contextA2 = ei0.q0.a(context);
            if (contextA2 == null) {
                contextA2 = context;
            }
            new androidx.appcompat.app.e.a(contextA2).setTitle(R.string.follow_error_unable_to_accept_follow_request_title).setMessage(context.getString(R.string.follow_error_unable_to_accept_follow_request_description, str, String.format("%,d", Arrays.copyOf(new Object[]{1000}, 1)))).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(24)).show();
        } else {
            ei0.q0.b(context);
        }
        String strI = lc.u0.i(aVar3.f47384b, "Accept request failed (", "): ", aVar3.f47385c);
        i2.a aVar4 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar4.getClass();
        i2.a.f(a2Var, "FollowItemViewAction", strI);
        return Unit.INSTANCE;
    }
}
