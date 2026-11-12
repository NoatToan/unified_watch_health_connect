package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import java.net.UnknownHostException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuthOperation$getMFAToken$2", f = "AbstractOAuthOperation.kt", l = {61, 71}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f164301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f164301b = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f164301b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164300a;
        u uVar = this.f164301b;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    boolean z14 = uVar.f164317d;
                    if (z14) {
                        e2 e2Var = new e2();
                        this.f164300a = 1;
                        x53.c cVar = o53.s0.f129406a;
                        Object objE0 = ge1.b.e0(x53.b.f189152a, new w1(e2Var, false, true, null), this);
                        if (objE0 != aVar) {
                            return objE0;
                        }
                    } else {
                        if (z14) {
                            lc.u0.r();
                            return null;
                        }
                        uVar.f164316c.debug("getMFAToken: calling 'MFAManager().getMFATokenValidateWithITServer'...");
                        e2 e2Var2 = new e2();
                        Context context = uVar.f164315b;
                        this.f164300a = 2;
                        x53.c cVar2 = o53.s0.f129406a;
                        obj = ge1.b.e0(x53.b.f189152a, new z1(e2Var2, context, null), this);
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                String str = (String) obj;
                uVar.f164317d = true;
                return str;
            } catch (MFATokenExpiredException unused) {
                return null;
            }
        } catch (Exception e4) {
            if ((e4 instanceof RateLimitException) || (e4 instanceof UnknownHostException)) {
                throw e4;
            }
            return null;
        }
    }
}
