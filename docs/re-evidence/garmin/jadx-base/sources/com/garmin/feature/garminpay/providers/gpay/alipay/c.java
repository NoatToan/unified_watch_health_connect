package com.garmin.feature.garminpay.providers.gpay.alipay;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import aq2.l;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import hs2.f;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity$onDownloadProgressUpdated$1", f = "AlipayAppletInstallationActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<Unit> f51115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlipayAppletInstallationActivity f51116b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity$onDownloadProgressUpdated$1$1", f = "AlipayAppletInstallationActivity.kt", l = {104}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AlipayAppletInstallationActivity f51118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AlipayAppletInstallationActivity alipayAppletInstallationActivity, d<? super a> dVar) {
            super(2, dVar);
            this.f51118b = alipayAppletInstallationActivity;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f51118b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51117a;
            if (i14 == 0) {
                r.b(obj);
                this.f51117a = 1;
                if (m0.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f51118b;
            alipayAppletInstallationActivity.setResult(-1);
            alipayAppletInstallationActivity.finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l<Unit> lVar, AlipayAppletInstallationActivity alipayAppletInstallationActivity, d<? super c> dVar) {
        super(2, dVar);
        this.f51115a = lVar;
        this.f51116b = alipayAppletInstallationActivity;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f51115a, this.f51116b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        l<Unit> lVar = this.f51115a;
        if (!(lVar instanceof l.b)) {
            boolean z14 = lVar instanceof l.c;
            AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f51116b;
            if (z14) {
                try {
                    Fragment fragmentG = alipayAppletInstallationActivity.getSupportFragmentManager().G("GP_DOWNLOAD_FRAGMENT");
                    fragmentG.getClass();
                    ((br2.i) fragmentG).v6(((l.c) lVar).f12514a);
                } catch (Throwable th3) {
                    AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Failed to update progress", th3);
                }
            } else if (lVar instanceof l.a) {
                AlipayAppletInstallationActivity.f51097j.f51101a.a().debug("Download failed", ((l.a) lVar).f12512a);
                alipayAppletInstallationActivity.ea().E4(f.AlipayAppletInstallationFailed);
                AlipayAppletInstallationActivity.da(alipayAppletInstallationActivity);
            } else {
                if (!(lVar instanceof l.d)) {
                    u0.r();
                    return null;
                }
                try {
                    AlipayAppletInstallationActivity.a aVar2 = AlipayAppletInstallationActivity.f51097j;
                    alipayAppletInstallationActivity.ea().E4(f.AlipayAppletInstallationSuccess);
                    Fragment fragmentG2 = alipayAppletInstallationActivity.getSupportFragmentManager().G("GP_DOWNLOAD_FRAGMENT");
                    fragmentG2.getClass();
                    br2.i iVar = (br2.i) fragmentG2;
                    TextView textView = iVar.f19629e;
                    if (textView == null) {
                        s.m("downloadPrimaryMessageView");
                        throw null;
                    }
                    textView.setText(R.string.wallet_installation_complete);
                    TextView textView2 = iVar.f19630f;
                    if (textView2 == null) {
                        s.m("downloadSecondaryMessageView");
                        throw null;
                    }
                    textView2.setText(R.string.download_complete_message);
                    iVar.u6();
                    ge1.b.T(f0.w(alipayAppletInstallationActivity), null, null, new a(alipayAppletInstallationActivity, null), 3);
                } catch (Throwable th4) {
                    AlipayAppletInstallationActivity.f51097j.f51101a.a().error("Failed to update progress", th4);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
