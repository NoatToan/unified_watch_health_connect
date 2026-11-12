package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import vg1.a1;
import vg1.b1;
import vg1.d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/TransferSensorsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TransferSensorsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f42801h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f42802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f42804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f42805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42806e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42807f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d1 f42808g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42809a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f42809a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f42810a;

        public c(l lVar) {
            lVar.getClass();
            this.f42810a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f42810a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f42810a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_transfer_sensors);
        int i14 = 1;
        initActionBar(true, R.string.lbl_transfer_sensors);
        Intent intent = getIntent();
        this.f42806e = (intent == null || (extras2 = intent.getExtras()) == null) ? -1L : extras2.getLong("GCM_deviceUnitID", -1L);
        Intent intent2 = getIntent();
        String string = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : extras.getString("GCM_deviceName");
        if (string == null) {
            string = "";
        }
        this.f42807f = string;
        if (this.f42806e == -1 || string.length() == 0) {
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.transfer_sensors_container);
        viewFindViewById.getClass();
        this.f42802a = viewFindViewById;
        viewFindViewById.setVisibility(8);
        View viewFindViewById2 = findViewById(R.id.title_tv);
        viewFindViewById2.getClass();
        this.f42803b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.message_tv);
        viewFindViewById3.getClass();
        this.f42804c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.transfer_btn);
        viewFindViewById4.getClass();
        Button button = (Button) viewFindViewById4;
        this.f42805d = button;
        button.setOnClickListener(new vg1.z0(this, 0));
        d1 d1Var = (d1) new x1(this).b(s0.f105811a.b(d1.class));
        this.f42808g = d1Var;
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(d1Var);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new b1(y0Var, d1Var, null), 2);
        y0Var.f(this, new c(new a1(this, i14)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/TransferSensorsActivity$a;", "", "<init>", "()V", "", "TRANSFER_SENSORS_SUCCESS_DELAY", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
