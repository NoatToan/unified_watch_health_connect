package com.garmin.android.apps.connectmobile.settings.devices.indexbpm;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.room.a0;
import b.g;
import ch1.t0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.MercuryDisplayNameActivity;
import fw.p;
import java.util.ArrayList;
import java.util.Observable;
import lc.u0;
import ng1.k0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexbpm/IndexBpmAppearanceActivity;", "Lng1/k0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexBpmAppearanceActivity extends k0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f43074t = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1 f43075o = new w1(s0.f105811a.b(nh1.b.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t0 f43076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DeviceSettingsDTO f43077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f43078r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43079a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43079a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43080a;

        public c(g gVar) {
            this.f43080a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43080a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43081a;

        public d(g gVar) {
            this.f43081a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43081a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43083b;

        public e(e23.a aVar, g gVar) {
            this.f43082a = aVar;
            this.f43083b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43082a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43083b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public static void ja(IndexBpmAppearanceActivity indexBpmAppearanceActivity, g3 g3Var) {
        g3Var.getClass();
        int i14 = b.f43079a[g3Var.f35300a.ordinal()];
        if (i14 == 1) {
            indexBpmAppearanceActivity.showProgressOverlay();
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                u0.r();
                return;
            }
            indexBpmAppearanceActivity.hideProgressOverlay();
            Toast.makeText(indexBpmAppearanceActivity, indexBpmAppearanceActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
            super.onBackPressed();
            return;
        }
        indexBpmAppearanceActivity.hideProgressOverlay();
        indexBpmAppearanceActivity.displayFailedMessage();
        a2 a2Var = a2.GENERAL;
        String strF = a0.f(indexBpmAppearanceActivity.f125976b, "saveWeightScaleUserInfo(", ") failed");
        i2.f36769a.getClass();
        i2.a.f(a2Var, "MercuryAppearanceActivity", strF);
        super.onBackPressed();
    }

    @Override // ng1.k0
    public final void fa() {
        this.f43076p = new t0(this, getString(R.string.smart_scale_device_setup_short_name_label));
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        t0 t0Var = this.f43076p;
        if (t0Var != null) {
            arrayList.add(t0Var);
        } else {
            s.m("displayNameField");
            throw null;
        }
    }

    @Override // ng1.k0
    public final void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : this.f125956m) {
            linearLayout.addView(fb2.g.a(this));
            linearLayout.addView(eVar.a());
            eVar.addObserver(this);
            if (eVar instanceof t0) {
                String string = getString(R.string.lbl_chars_limit, 5);
                string.getClass();
                linearLayout.addView(fb2.g.c(this, string));
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 100 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings"));
            if (deviceSettingsDTO == null || TextUtils.isEmpty(deviceSettingsDTO.B)) {
                return;
            }
            this.f43077q = deviceSettingsDTO;
            t0 t0Var = this.f43076p;
            if (t0Var == null) {
                s.m("displayNameField");
                throw null;
            }
            boolean zK = t0Var.k(deviceSettingsDTO);
            t0 t0Var2 = this.f43076p;
            if (t0Var2 != null) {
                t0Var2.m(zK);
            } else {
                s.m("displayNameField");
                throw null;
            }
        }
    }

    @Override // ng1.k0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        String str = this.f43078r;
        DeviceSettingsDTO deviceSettingsDTO = this.f43077q;
        if (deviceSettingsDTO == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        if (s.g(str, deviceSettingsDTO.B)) {
            super.onBackPressed();
            return;
        }
        DeviceSettingsDTO deviceSettingsDTO2 = this.f43077q;
        if (deviceSettingsDTO2 == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        this.f43078r = deviceSettingsDTO2.B;
        nh1.b bVar = (nh1.b) this.f43075o.getValue();
        long j8 = this.f125976b;
        DeviceSettingsDTO deviceSettingsDTO3 = this.f43077q;
        if (deviceSettingsDTO3 == null) {
            s.m("deviceSettingsDTO");
            throw null;
        }
        nh1.a aVar = new nh1.a(this, 0);
        String string = deviceSettingsDTO3.Y1().toString();
        string.getClass();
        aVar.onChanged(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(bVar), null, null, new nh1.d(bVar, j8, string, aVar, null), 3);
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.appearance_title);
        nh1.b bVar = (nh1.b) this.f43075o.getValue();
        long j8 = this.f125976b;
        nh1.a aVar = new nh1.a(this, 1);
        aVar.onChanged(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(bVar), null, null, new nh1.c(bVar, j8, aVar, null), 3);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof t0) {
            MercuryDisplayNameActivity.a aVar = MercuryDisplayNameActivity.f42790f;
            DeviceSettingsDTO deviceSettingsDTO = this.f43077q;
            if (deviceSettingsDTO == null) {
                s.m("deviceSettingsDTO");
                throw null;
            }
            String str = this.f125978d;
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) MercuryDisplayNameActivity.class);
            intent.putExtra("GCM_extra_user_personal_information", deviceSettingsDTO);
            intent.putExtra("GCM_deviceProductNbr", str);
            startActivityForResult(intent, 100);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexbpm/IndexBpmAppearanceActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CHANGE_DISPLAY_NAME_REQUEST_CODE", "I", "MAX_CHARS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
