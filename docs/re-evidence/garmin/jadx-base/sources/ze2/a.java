package ze2;

import android.app.AlertDialog;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import re2.l0;
import xe2.n0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$handleInoperableWebView$2", f = "AbstractMFAFlowActivity.kt", l = {}, m = "invokeSuspend")
public final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204266a;

    /* JADX INFO: renamed from: ze2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$handleInoperableWebView$2$1$1", f = "AbstractMFAFlowActivity.kt", l = {232}, m = "invokeSuspend")
    public static final class C3812a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204268b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3812a(com.garmin.android.library.mobileauth.ui.mfa.a aVar, t13.d<? super C3812a> dVar) {
            super(2, dVar);
            this.f204268b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3812a(this.f204268b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3812a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204267a;
            if (i14 == 0) {
                r.b(obj);
                l lVar = l.INOPERABLE_WEBVIEW;
                this.f204267a = 1;
                if (com.garmin.android.library.mobileauth.ui.mfa.a.ha(this.f204268b, lVar, this, 5) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.library.mobileauth.ui.mfa.a aVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f204266a = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f204266a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = this.f204266a;
        aVar2.f50497q.warn("handleInoperableWebView");
        AlertDialog alertDialog = aVar2.f50501w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        aVar2.f50501w = null;
        l0.f152316a.getClass();
        aVar2.getClass();
        String string = aVar2.getString(R.string.mobile_auth_title_unable_to_continue);
        string.getClass();
        String string2 = aVar2.getString(R.string.msg_inoperable_webview);
        string2.getClass();
        af2.b bVar = new af2.b(aVar2, 7);
        String string3 = aVar2.getString(R.string.lbl_cancel);
        string3.getClass();
        aVar2.f50501w = n0.a(aVar2, string, string2, bVar, null, string3, null, 64);
        return Unit.INSTANCE;
    }
}
