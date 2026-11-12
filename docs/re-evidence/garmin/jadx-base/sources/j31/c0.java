package j31;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj31/c0;", "Lj31/z0;", "Landroid/content/Context;", "applicationContext", "Lb31/f;", "onboardingChecksRepository", "Lui1/l;", "inReachSubscriptionRepository", "<init>", "(Landroid/content/Context;Lb31/f;Lui1/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b31.f f96877c;

    public c0(Context context, b31.f fVar, ui1.l lVar) {
        context.getClass();
        fVar.getClass();
        lVar.getClass();
        this.f96876b = context;
        this.f96877c = fVar;
    }

    @Override // j31.z0
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        b0 b0Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f96873d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f96873d = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objD = b0Var.f96871b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f96873d;
        b31.f fVar = this.f96877c;
        if (i15 == 0) {
            o13.r.b(objD);
            if (hb2.g.b(this.f96876b, hb2.g.a.GARMIN_MESSENGER)) {
                fVar.a(j8, e31.a.HAS_MESSENGER_APP_INSTALLED);
            }
            b0Var.f96870a = j8;
            b0Var.f96873d = 1;
            ui1.e eVarB = ui1.l.b(j8, "isInReachMessagingActivatedOnDevice");
            objD = eVarB == null ? Boolean.FALSE : eVarB.d(b0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = b0Var.f96870a;
            o13.r.b(objD);
        }
        if (((Boolean) objD).booleanValue()) {
            fVar.a(j8, e31.a.INREACH_SUBSCRIPTION_ACTIVATED_ON_DEVICE);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new a0(this, j8, null), 3);
        new en.k(context).execute();
    }
}
