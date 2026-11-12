package com.garmin.feature.garminpay.providers.gpay.ui.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import rd2.f;
import rd2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/GarminPayDeepLinkActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminPayDeepLinkActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f51547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51548b;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f51547a = gt2.b.f79005a.h("PAY#GarminPayDeepLinkActivity");
        f51548b = "deviceUnitId";
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String queryParameter;
        super.onCreate(bundle);
        setContentView();
        showProgressOverlay();
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (data == null || (queryParameter = data.getQueryParameter(f51548b)) == null) {
            return;
        }
        long j8 = Long.parseLong(queryParameter);
        f.a().f152045a.getClass();
        sd2.f fVarI = j.i(j8, null);
        if (fVarI != null) {
            f51547a.debug(fVarI.toString());
            GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            kj0.a.c cVar = new kj0.a.c(Long.valueOf(fVarI.getUnitID()), fVarI.getImageURL(), fVarI.getProductDisplayName());
            aVar.getClass();
            startActivity(GarminPayLaunchScreenActivity.a.a(contextC, cVar));
            finish();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/GarminPayDeepLinkActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "QUERY_PARAMETER", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
