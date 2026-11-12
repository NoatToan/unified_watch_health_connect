package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationRedirectActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj31/f;", "Lj31/z0;", "Lb31/f;", "onboardingChecksRepository", "<init>", "(Lb31/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.f f96889b;

    public f(b31.f fVar) {
        fVar.getClass();
        this.f96889b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f96886d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f96886d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f96884b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f96886d;
        if (i15 == 0) {
            o13.r.b(objJ);
            ui1.l.f171314e.getClass();
            ui1.l lVarA = ui1.l.a.a();
            eVar.f96883a = j8;
            eVar.f96886d = 1;
            objJ = lVarA.j(j8, eVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = eVar.f96883a;
            o13.r.b(objJ);
        }
        if (((Boolean) objJ).booleanValue()) {
            this.f96889b.a(j8, e31.a.HAS_INREACH_SUBSCRIPTION);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        context.startActivity(InReachLTEActivationRedirectActivity.a.a(InReachLTEActivationRedirectActivity.f43507a, context, Long.valueOf(j8), 8));
    }
}
