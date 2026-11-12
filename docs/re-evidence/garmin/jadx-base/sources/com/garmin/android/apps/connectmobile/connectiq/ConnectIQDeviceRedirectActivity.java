package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import com.garmin.android.apps.connectmobile.connectiq.settings.ConnectIQAppSettingsActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQDeviceRedirectActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.connectiq.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31766i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f31767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f31773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r0 f31774h;

    public enum a {
        SEARCH,
        SETTINGS,
        DETAILS
    }

    public final void ca() {
        ConnectIQAppSettingsActivity.a aVar = ConnectIQAppSettingsActivity.f32003k;
        String str = this.f31771e;
        String strValueOf = String.valueOf(this.f31772f);
        String strValueOf2 = String.valueOf(this.f31768b);
        String str2 = this.f31770d;
        String str3 = this.f31769c;
        aVar.getClass();
        str.getClass();
        strValueOf.getClass();
        strValueOf2.getClass();
        str2.getClass();
        str3.getClass();
        Boolean bool = Boolean.FALSE;
        if (je.b.a(this) != null) {
            Intent intent = new Intent(this, (Class<?>) ConnectIQAppSettingsActivity.class);
            intent.putExtra("CONNECT_IQ_APP_ID", str);
            intent.putExtra("GCM_app_version", strValueOf);
            intent.putExtra("GCM_deviceUnitID", strValueOf2);
            intent.putExtra("GCM_macAddress", str2);
            intent.putExtra("GCM_devicePartNbr", str3);
            startActivity(intent);
            bool = Boolean.TRUE;
        } else {
            new androidx.appcompat.app.e.a(this).setCancelable(false).setTitle(R.string.mobile_auth_title_unable_to_continue).setMessage(R.string.mobile_auth_msg_unable_to_proceed_browser_not_available).setPositiveButton(R.string.lbl_ok, new x10.d(this)).show();
        }
        if (bool.booleanValue()) {
            i2.d("ConnectIQDeviceRedirectActivity", "App settings for:" + this.f31771e + StringUtils.SPACE + this.f31772f + StringUtils.SPACE + this.f31768b + StringUtils.SPACE + this.f31770d + StringUtils.SPACE + this.f31769c);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        setResult(i15);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.connect_iq_title);
        this.f31768b = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        if (getIntent().getSerializableExtra("APP_TYPE") != null) {
            this.f31767a = (l) getIntent().getSerializableExtra("APP_TYPE");
        }
        if (getIntent().getStringExtra("GCM_deviceProductNbr") != null) {
            this.f31769c = getIntent().getStringExtra("GCM_deviceProductNbr");
        }
        if (getIntent().getStringExtra("GCM_macAddress") != null) {
            this.f31770d = getIntent().getStringExtra("GCM_macAddress");
        }
        if (getIntent().getStringExtra("CONNECT_IQ_APP_ID") != null) {
            this.f31771e = getIntent().getStringExtra("CONNECT_IQ_APP_ID");
        }
        if (getIntent().getIntExtra("GCM_app_version", -1) != -1) {
            this.f31772f = getIntent().getIntExtra("GCM_app_version", -1);
        }
        if (getIntent().getIntExtra("deepLinkType", -1) != -1) {
            this.f31773g = a.values()[getIntent().getIntExtra("deepLinkType", -1)];
        }
        r0 r0Var = new r0(this);
        this.f31774h = r0Var;
        r0Var.c(new Void[0]);
        showProgressOverlay();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f31774h.a();
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.a
    public final void w5(List<sd2.f> list) {
        sd2.f next;
        hideProgressOverlay();
        Iterator<sd2.f> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getUnitID() != this.f31768b);
        if (next == null) {
            i2.i("ConnectIQDeviceRedirectActivity", "currentDevice is null!");
            finish();
            return;
        }
        boolean zIsMultiLinkSupported = next.isMultiLinkSupported();
        a aVar = this.f31773g;
        if (!zIsMultiLinkSupported) {
            if (aVar == a.SEARCH) {
                Bundle extras = getIntent().getExtras();
                Intent intent = new Intent(this, (Class<?>) ConnectIQAppStoreActivity.class);
                if (extras != null) {
                    intent.putExtras(extras);
                }
                startActivityForResult(intent, 0);
                return;
            }
            if (aVar == a.SETTINGS) {
                ca();
                return;
            }
            if (aVar != a.DETAILS) {
                i2.i("ConnectIQDeviceRedirectActivity", "Deeplink path was not set!");
                finish();
                return;
            }
            Bundle extras2 = getIntent().getExtras();
            Intent intent2 = new Intent(this, (Class<?>) ConnectIQAppStoreActivity.class);
            if (extras2 != null) {
                intent2.putExtras(extras2);
            }
            startActivityForResult(intent2, 0);
            return;
        }
        if (aVar == a.SEARCH) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            if (hb2.j.b(this, com.garmin.android.apps.connectmobile.l.f())) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("connectiq").authority("search").appendPath("").appendQueryParameter("deviceId", String.valueOf(this.f31768b)).appendQueryParameter("appType", this.f31767a.f31894a);
                intent3.setData(builder.build());
                if (intent3.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
            } else {
                AppPromoPopupActivity.a aVar2 = AppPromoPopupActivity.f29002e;
                en.n nVar = en.n.CONNECT_IQ;
                aVar2.getClass();
                nVar.getClass();
                AppPromoPopupActivity.a.c(aVar2, this, nVar, 48);
            }
            finish();
            return;
        }
        if (aVar == a.SETTINGS) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            if (!hb2.j.b(this, com.garmin.android.apps.connectmobile.l.f())) {
                ca();
                return;
            }
            Intent intent4 = new Intent("android.intent.action.VIEW");
            Uri.Builder builder2 = new Uri.Builder();
            builder2.scheme("connectiq").authority("settings").appendPath("").appendQueryParameter("deviceId", String.valueOf(this.f31768b)).appendQueryParameter("partNumber", this.f31769c).appendQueryParameter("deviceMacAddress", this.f31770d).appendQueryParameter(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f31771e).appendQueryParameter("internalVersionNumber", String.valueOf(this.f31772f));
            intent4.setData(builder2.build());
            if (intent4.resolveActivity(getPackageManager()) != null) {
                startActivity(intent4);
            }
            finish();
            return;
        }
        if (aVar != a.DETAILS) {
            i2.i("ConnectIQDeviceRedirectActivity", "Deeplink path was not set!");
            finish();
            return;
        }
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (hb2.j.b(this, com.garmin.android.apps.connectmobile.l.f())) {
            Intent intent5 = new Intent("android.intent.action.VIEW");
            Uri.Builder builder3 = new Uri.Builder();
            builder3.scheme("connectiq").authority("details").appendPath("").appendQueryParameter("deviceId", String.valueOf(this.f31768b)).appendQueryParameter(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f31771e);
            intent5.setData(builder3.build());
            if (intent5.resolveActivity(getPackageManager()) != null) {
                startActivity(intent5);
            }
        } else {
            Intent intent6 = new Intent(this, (Class<?>) ConnectIQAppStoreActivity.class);
            intent6.putExtra("GCM_deviceUnitID", this.f31768b);
            String str = this.f31771e;
            if (str != null) {
                intent6.putExtra("CONNECT_IQ_APP_ID", str);
            }
            startActivity(intent6);
        }
        finish();
    }
}
