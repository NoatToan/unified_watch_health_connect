package com.garmin.feature.garminpay.providers.gpay.alipay;

import androidx.lifecycle.v;
import bo2.k;
import br2.i;
import e23.l;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import r53.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/alipay/b;", "Lbr2/i$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlipayAppletInstallationActivity f51114a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<aq2.l<? extends Unit>, Unit> {
        public a(Object obj) {
            super(1, obj, AlipayAppletInstallationActivity.class, "onDownloadProgressUpdated", "onDownloadProgressUpdated(Lcom/garmin/feature/garminpay/providers/gpay/util/Process;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(aq2.l<? extends Unit> lVar) {
            aq2.l<? extends Unit> lVar2 = lVar;
            lVar2.getClass();
            AlipayAppletInstallationActivity alipayAppletInstallationActivity = (AlipayAppletInstallationActivity) this.receiver;
            AlipayAppletInstallationActivity.a aVar = AlipayAppletInstallationActivity.f51097j;
            alipayAppletInstallationActivity.getClass();
            gl.b.I(f0.w(alipayAppletInstallationActivity), null, new c(lVar2, alipayAppletInstallationActivity, null), 3);
            return Unit.INSTANCE;
        }
    }

    public b(AlipayAppletInstallationActivity alipayAppletInstallationActivity) {
        this.f51114a = alipayAppletInstallationActivity;
    }

    @Override // br2.i.b
    public final void a() {
        AlipayAppletInstallationActivity.a aVar = AlipayAppletInstallationActivity.f51097j;
        AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f51114a;
        v.b(s.i(new k(alipayAppletInstallationActivity.ea(), null))).f(alipayAppletInstallationActivity, new AlipayAppletInstallationActivity.e(new a(alipayAppletInstallationActivity)));
    }
}
