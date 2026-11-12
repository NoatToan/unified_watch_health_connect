package xe2;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$launchLegalGateway$1", f = "TermsOfUseFrag.kt", l = {414, 419, 431}, m = "invokeSuspend")
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc2.a f190557c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$launchLegalGateway$1$1", f = "TermsOfUseFrag.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc2.a f190559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f190560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f190561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f190562e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.library.mobileauth.ui.e eVar, lc2.a aVar, boolean z14, boolean z15, boolean z16, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f190558a = eVar;
            this.f190559b = aVar;
            this.f190560c = z14;
            this.f190561d = z15;
            this.f190562e = z16;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f190558a, this.f190559b, this.f190560c, this.f190561d, this.f190562e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            LegalGatewayActivity.a aVar2 = LegalGatewayActivity.f49928n;
            com.garmin.android.library.mobileauth.ui.e eVar = this.f190558a;
            androidx.fragment.app.m activity = eVar.getActivity();
            activity.getClass();
            LegalGatewayActivity.a.b(aVar2, activity, 201, this.f190559b, this.f190560c, this.f190561d, null, this.f190562e, eVar.getText(R.string.legal_host_app_name), 32);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$launchLegalGateway$1$2", f = "TermsOfUseFrag.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190563a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.library.mobileauth.ui.e eVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f190563a = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f190563a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Toast.makeText(this.f190563a.getActivity(), R.string.txt_no_internet_connection, 1).show();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.garmin.android.library.mobileauth.ui.e eVar, lc2.a aVar, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f190556b = eVar;
        this.f190557c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u0(this.f190556b, this.f190557c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (ge1.b.e0(r15, r7, r14) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (ge1.b.e0(r15, r1, r14) == r0) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190555a;
        com.garmin.android.library.mobileauth.ui.e eVar = this.f190556b;
        if (i14 == 0) {
            o13.r.b(obj);
            com.garmin.android.library.mobileauth.ui.b fragListener$mobile_auth_release = eVar.getFragListener$mobile_auth_release();
            this.f190555a = 1;
            obj = fragListener$mobile_auth_release.K6(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2 && i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z14 = !eVar.getMobileAuthConfig$mobile_auth_release().f177775p;
        boolean z15 = eVar.getMobileAuthConfig$mobile_auth_release().E;
        re2.l0 l0Var = re2.l0.f152316a;
        Context contextRequireContext = eVar.requireContext();
        contextRequireContext.getClass();
        l0Var.getClass();
        if (re2.l0.e(contextRequireContext)) {
            x53.c cVar = o53.s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(this.f190556b, this.f190557c, zBooleanValue, z14, z15, null);
            this.f190555a = 2;
        } else {
            x53.c cVar2 = o53.s0.f129406a;
            t1 t1Var2 = u53.o.f168762a;
            b bVar = new b(eVar, null);
            this.f190555a = 3;
        }
    }
}
