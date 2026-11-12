package com.garmin.android.apps.connectmobile.samd.presentation.mfa;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import g.h;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import sz0.f;
import t13.d;
import tr2.y;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/samd/presentation/mfa/MfaSetupActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MfaSetupActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41181c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.b f41182a = (qf1.b) KoinJavaComponent.get$default(qf1.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.c<Intent> f41183b = registerForActivityResult(new h(), new y(this, 9));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.samd.presentation.mfa.MfaSetupActivity$onCreate$1", f = "MfaSetupActivity.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f41185b;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            b bVar = MfaSetupActivity.this.new b(dVar);
            bVar.f41185b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f41185b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f41184a;
            MfaSetupActivity mfaSetupActivity = MfaSetupActivity.this;
            if (i14 == 0) {
                r.b(obj);
                qf1.b bVar = mfaSetupActivity.f41182a;
                this.f41185b = b0Var;
                this.f41184a = 1;
                obj = bVar.h(mfaSetupActivity, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            Intent intent = (Intent) obj;
            mfaSetupActivity.hideProgressOverlay();
            if (intent != null) {
                mfaSetupActivity.f41183b.a(intent, null);
                a2 a2Var = a2.USER;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "MfaSetupActivity", "[mfaFlowLauncher] MFA flow started");
            } else {
                a2 a2Var2 = a2.USER;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "MfaSetupActivity", "[mfaFlowLauncher] MFA flow couldn't be started");
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.f161394a.getClass();
        f.a.a(38, this);
        showProgressOverlay();
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/samd/presentation/mfa/MfaSetupActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
