package com.garmin.feature.garminpay.providers.gpay.ui.common;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f51574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<EnumC1069a> f51575b;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.ui.common.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC1069a {
        SETUP_COMPLETE,
        SETUP_FAILED,
        UNDER_MAINTENANCE
    }

    public a() {
        int i14 = gt2.c.f79010a;
        this.f51574a = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPaySetupRecoveryViewModel");
        this.f51575b = new y0<>();
    }

    public final void x4() {
        ge1.b.T(v1.a(this), s0.f129406a, null, new b(this, null), 2);
    }
}
