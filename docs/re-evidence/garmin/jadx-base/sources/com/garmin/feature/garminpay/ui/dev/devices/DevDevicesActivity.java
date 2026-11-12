package com.garmin.feature.garminpay.ui.dev.devices;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import gt2.b;
import hn2.c;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps2.w;
import sd2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/dev/devices/DevDevicesActivity;", "Lhn2/c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevDevicesActivity extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f51893l = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f51894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.feature.garminpay.ui.dev.devices.a f51895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f51896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f51897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f51898k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/dev/devices/DevDevicesActivity$a", "Lcom/garmin/feature/garminpay/ui/dev/devices/a$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.feature.garminpay.ui.dev.devices.a.b {
        public a() {
        }

        @Override // com.garmin.feature.garminpay.ui.dev.devices.a.b
        public final void a(f fVar) {
            if (TextUtils.isEmpty(fVar.d0())) {
                return;
            }
            int i14 = DevDevicesActivity.f51893l;
            DevDevicesActivity devDevicesActivity = DevDevicesActivity.this;
            devDevicesActivity.getClass();
            w wVar = w.f140538a;
            long unitID = fVar.getUnitID();
            wVar.getClass();
            if (w.i(unitID) != null) {
                return;
            }
            Toast.makeText(devDevicesActivity, "Sorry, this device is not GarminPay capable.", 1).show();
        }
    }

    public DevDevicesActivity() {
        int i14 = gt2.c.f79010a;
        this.f51894g = b.f79005a.h("PAY#DevDevicesActivity");
        this.f51896i = new a();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.layout_dev_devices, c.a.BACK, "Devices");
        this.f51894g.debug("onCreate");
        TextView textView = (TextView) findViewById(R.id.empty_view);
        this.f51898k = textView;
        textView.getClass();
        textView.setText("Pair a GarminPay device.");
        ((TextView) findViewById(R.id.server_environment)).setText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).h().f77335a.name());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f51897j = recyclerView;
        recyclerView.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        com.garmin.feature.garminpay.ui.dev.devices.a aVar = new com.garmin.feature.garminpay.ui.dev.devices.a(this, this.f51896i);
        this.f51895h = aVar;
        aVar.f51921c = new ArrayList(0);
        RecyclerView recyclerView2 = this.f51897j;
        recyclerView2.getClass();
        recyclerView2.setAdapter(this.f51895h);
        com.garmin.feature.garminpay.ui.dev.devices.a aVar2 = this.f51895h;
        aVar2.getClass();
        aVar2.notifyDataSetChanged();
        ab2.b.f2642a.getClass();
        y0 y0VarA = ab2.b.a();
        if (y0VarA != null) {
            y0VarA.f(this, new a4.b(this, 28));
        } else {
            s.m("liveData");
            throw null;
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f51894g.debug("onStart");
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f51894g.debug("onStop");
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
