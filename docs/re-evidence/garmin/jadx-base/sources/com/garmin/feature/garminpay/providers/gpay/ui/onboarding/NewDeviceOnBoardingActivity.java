package com.garmin.feature.garminpay.providers.gpay.ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.s0;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import gt2.b;
import hn2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ry2.d;
import wd2.h0;
import xn.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/onboarding/NewDeviceOnBoardingActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewDeviceOnBoardingActivity extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f51700k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f51701l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f51702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xp2.a f51705j;

    static {
        int i14 = gt2.c.f79010a;
        f51701l = b.f79005a.h("PAY#NEW_FITPAY#NewDeviceOnBoardingActivity");
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger logger = f51701l;
        logger.debug("onCreate");
        R9(R.layout.activity_empty, c.a.BACK, "");
        this.f51702g = Long.valueOf(getIntent().getLongExtra("device.unit.id", -1L));
        this.f51703h = getIntent().getStringExtra("device.image.url");
        this.f51704i = getIntent().getStringExtra("device.name");
        Long l14 = this.f51702g;
        if (l14 == null || l14.longValue() < 0) {
            logger.debug("onCreate: devcieUnitId is missing, can not onBoard the device " + this.f51702g);
            br2.c.h(br2.c.f19585a, this, new r(this, 1), null, 4);
        }
        aa(Boolean.TRUE, getString(R.string.wallet_title_provisioning_device, this.f51704i), getString(R.string.wallet_message_provisioning_device), this.f51703h);
        xp2.a aVar = (xp2.a) new d(this, new x1(this)).f155186a.a(xp2.a.class, xp2.c.class);
        aVar.w3();
        Long l15 = this.f51702g;
        l15.getClass();
        aVar.S3(l15.longValue());
        this.f51705j = aVar;
        s0<Boolean> s0VarL3 = aVar.L3();
        if (s0VarL3 != null) {
            s0VarL3.f(this, new h0(this, 11));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/onboarding/NewDeviceOnBoardingActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, String str, String str2) {
            Intent intentD = sn.a.d(context, context, NewDeviceOnBoardingActivity.class);
            intentD.putExtra("device.unit.id", j8);
            intentD.putExtra("device.image.url", str2);
            Intent intentPutExtra = intentD.putExtra("device.name", str);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        private a() {
        }
    }
}
