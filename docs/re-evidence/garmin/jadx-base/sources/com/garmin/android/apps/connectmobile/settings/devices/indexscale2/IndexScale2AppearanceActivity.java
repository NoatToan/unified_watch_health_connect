package com.garmin.android.apps.connectmobile.settings.devices.indexscale2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import ch1.j6;
import ch1.r0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.IndexScaleScreenListActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.IndexDisplayNameActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.IndexScale2AppearanceActivity;
import fw.p;
import java.util.ArrayList;
import java.util.Observable;
import lc.u0;
import ng1.k0;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p40.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexscale2/IndexScale2AppearanceActivity;", "Lng1/k0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexScale2AppearanceActivity extends k0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f43088w = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f43089o = m.b(new f(17));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f43090p = new w1(s0.f105811a.b(mh1.f.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DeviceSettingsDTO f43091q = new DeviceSettingsDTO();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f43092r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r0 f43093t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j6 f43094v;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43095a;

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
            f43095a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43096a;

        public c(g gVar) {
            this.f43096a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43096a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43097a;

        public d(g gVar) {
            this.f43097a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43097a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43099b;

        public e(e23.a aVar, g gVar) {
            this.f43098a = aVar;
            this.f43099b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43098a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43099b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    public static void ja(IndexScale2AppearanceActivity indexScale2AppearanceActivity, fw.m mVar) {
        t tVar = indexScale2AppearanceActivity.f43089o;
        mVar.getClass();
        int i14 = b.f43095a[mVar.f73769b.ordinal()];
        if (i14 == 1) {
            ((Logger) tVar.getValue()).debug("Received loading status...");
            indexScale2AppearanceActivity.showProgressOverlay();
        } else if (i14 == 2) {
            indexScale2AppearanceActivity.hideProgressOverlay();
            Toast.makeText(indexScale2AppearanceActivity, indexScale2AppearanceActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
            super.onBackPressed();
        } else if (i14 != 3) {
            u0.r();
        } else {
            ((Logger) tVar.getValue()).debug("Received error status");
            indexScale2AppearanceActivity.hideProgressOverlay();
        }
    }

    @Override // ng1.k0
    public final void fa() {
        this.f43093t = new r0(this);
        this.f43094v = new j6(this);
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        r0 r0Var = this.f43093t;
        if (r0Var == null) {
            s.m("displayNameField");
            throw null;
        }
        arrayList.add(r0Var);
        j6 j6Var = this.f43094v;
        if (j6Var != null) {
            arrayList.add(j6Var);
        } else {
            s.m("widgetOptionsField");
            throw null;
        }
    }

    @Override // ng1.k0
    public final void ha() {
        View viewFindViewById = findViewById(R.id.page_content);
        viewFindViewById.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        for (fb2.e eVar : this.f125956m) {
            linearLayout.addView(fb2.g.a(this));
            linearLayout.addView(eVar.a());
            eVar.addObserver(this);
        }
        linearLayout.addView(fb2.g.a(this));
        r0 r0Var = this.f43093t;
        if (r0Var == null) {
            s.m("displayNameField");
            throw null;
        }
        r0Var.m(r0Var.g(this, this.f43091q));
        j6 j6Var = this.f43094v;
        if (j6Var == null) {
            s.m("widgetOptionsField");
            throw null;
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        j6Var.m(deviceSettingsDTO != null ? j6Var.g(this, deviceSettingsDTO) : false);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        DeviceSettingsDTO deviceSettingsDTO;
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 100 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO2 = (DeviceSettingsDTO) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings"));
            if (deviceSettingsDTO2 == null || TextUtils.isEmpty(deviceSettingsDTO2.B)) {
                return;
            }
            r0 r0Var = this.f43093t;
            if (r0Var == null) {
                s.m("displayNameField");
                throw null;
            }
            boolean zK = r0Var.k(deviceSettingsDTO2);
            r0 r0Var2 = this.f43093t;
            if (r0Var2 == null) {
                s.m("displayNameField");
                throw null;
            }
            r0Var2.m(zK);
            this.f43091q = deviceSettingsDTO2;
            return;
        }
        if (i15 == -1 && i14 == 200) {
            if (intent == null || intent.getExtras() == null) {
                deviceSettingsDTO = null;
            } else {
                Bundle extras2 = intent.getExtras();
                extras2.getClass();
                Object obj = extras2.get("GCM_deviceSettings");
                obj.getClass();
                deviceSettingsDTO = (DeviceSettingsDTO) obj;
            }
            if (deviceSettingsDTO != null) {
                j6 j6Var = this.f43094v;
                if (j6Var == null) {
                    s.m("widgetOptionsField");
                    throw null;
                }
                j6Var.k(deviceSettingsDTO);
                j6 j6Var2 = this.f43094v;
                if (j6Var2 == null) {
                    s.m("widgetOptionsField");
                    throw null;
                }
                j6Var2.m(true);
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        showProgressOverlay();
        if (s.g(this.f43092r, this.f43091q.B)) {
            super.onBackPressed();
            return;
        }
        com.garmin.android.apps.connectmobile.smartscale.model.f fVar = new com.garmin.android.apps.connectmobile.smartscale.model.f(Integer.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), String.valueOf(this.f43091q.f33860a), this.f43091q.B, null, null, null, null, null, null, null, null, 2040, null);
        mh1.f fVar2 = (mh1.f) this.f43090p.getValue();
        long j8 = this.f125976b;
        y0<fw.m<DeviceSettingsDTO>> y0Var = fVar2.f118471d;
        fw.m<DeviceSettingsDTO> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(fVar2), null, null, new mh1.e(fVar2, fVar, j8, null), 3);
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w1 w1Var = this.f43090p;
        final int i14 = 0;
        dh.b.L(((mh1.f) w1Var.getValue()).f118470c, this, new z0(this) { // from class: ph1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexScale2AppearanceActivity f137712b;

            {
                this.f137712b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                IndexScale2AppearanceActivity indexScale2AppearanceActivity = this.f137712b;
                switch (i15) {
                    case 0:
                        t tVar = indexScale2AppearanceActivity.f43089o;
                        fw.m mVar = (fw.m) obj;
                        int i16 = IndexScale2AppearanceActivity.f43088w;
                        mVar.getClass();
                        int i17 = IndexScale2AppearanceActivity.b.f43095a[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            ((Logger) tVar.getValue()).debug("Received loading status...");
                            indexScale2AppearanceActivity.showProgressOverlay();
                            return;
                        }
                        if (i17 != 2) {
                            if (i17 != 3) {
                                u0.r();
                                return;
                            } else {
                                ((Logger) tVar.getValue()).debug("Received error status");
                                indexScale2AppearanceActivity.hideProgressOverlay();
                                return;
                            }
                        }
                        indexScale2AppearanceActivity.hideProgressOverlay();
                        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) mVar.f73770c;
                        if (deviceSettingsDTO != null) {
                            indexScale2AppearanceActivity.f43091q = deviceSettingsDTO;
                            indexScale2AppearanceActivity.f43092r = deviceSettingsDTO.B;
                            r0 r0Var = indexScale2AppearanceActivity.f43093t;
                            if (r0Var == null) {
                                s.m("displayNameField");
                                throw null;
                            }
                            boolean zK = r0Var.k(deviceSettingsDTO);
                            r0 r0Var2 = indexScale2AppearanceActivity.f43093t;
                            if (r0Var2 != null) {
                                r0Var2.m(zK);
                                return;
                            } else {
                                s.m("displayNameField");
                                throw null;
                            }
                        }
                        return;
                    default:
                        IndexScale2AppearanceActivity.ja(indexScale2AppearanceActivity, (fw.m) obj);
                        return;
                }
            }
        });
        final int i15 = 1;
        dh.b.L(((mh1.f) w1Var.getValue()).f118471d, this, new z0(this) { // from class: ph1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexScale2AppearanceActivity f137712b;

            {
                this.f137712b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                IndexScale2AppearanceActivity indexScale2AppearanceActivity = this.f137712b;
                switch (i16) {
                    case 0:
                        t tVar = indexScale2AppearanceActivity.f43089o;
                        fw.m mVar = (fw.m) obj;
                        int i17 = IndexScale2AppearanceActivity.f43088w;
                        mVar.getClass();
                        int i18 = IndexScale2AppearanceActivity.b.f43095a[mVar.f73769b.ordinal()];
                        if (i18 == 1) {
                            ((Logger) tVar.getValue()).debug("Received loading status...");
                            indexScale2AppearanceActivity.showProgressOverlay();
                            return;
                        }
                        if (i18 != 2) {
                            if (i18 != 3) {
                                u0.r();
                                return;
                            } else {
                                ((Logger) tVar.getValue()).debug("Received error status");
                                indexScale2AppearanceActivity.hideProgressOverlay();
                                return;
                            }
                        }
                        indexScale2AppearanceActivity.hideProgressOverlay();
                        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) mVar.f73770c;
                        if (deviceSettingsDTO != null) {
                            indexScale2AppearanceActivity.f43091q = deviceSettingsDTO;
                            indexScale2AppearanceActivity.f43092r = deviceSettingsDTO.B;
                            r0 r0Var = indexScale2AppearanceActivity.f43093t;
                            if (r0Var == null) {
                                s.m("displayNameField");
                                throw null;
                            }
                            boolean zK = r0Var.k(deviceSettingsDTO);
                            r0 r0Var2 = indexScale2AppearanceActivity.f43093t;
                            if (r0Var2 != null) {
                                r0Var2.m(zK);
                                return;
                            } else {
                                s.m("displayNameField");
                                throw null;
                            }
                        }
                        return;
                    default:
                        IndexScale2AppearanceActivity.ja(indexScale2AppearanceActivity, (fw.m) obj);
                        return;
                }
            }
        });
        mh1.f fVar = (mh1.f) w1Var.getValue();
        long j8 = this.f125976b;
        y0<fw.m<DeviceSettingsDTO>> y0Var = fVar.f118470c;
        fw.m<DeviceSettingsDTO> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(fVar), null, null, new mh1.d(fVar, j8, null), 3);
        }
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof r0) {
            IndexDisplayNameActivity.a aVar = IndexDisplayNameActivity.f42789f;
            DeviceSettingsDTO deviceSettingsDTO = this.f43091q;
            aVar.getClass();
            deviceSettingsDTO.getClass();
            Intent intent = new Intent(this, (Class<?>) IndexDisplayNameActivity.class);
            intent.putExtra("GCM_extra_user_personal_information", deviceSettingsDTO);
            intent.putExtra("GCM_deviceProductNbr", (String) null);
            startActivityForResult(intent, 100);
            return;
        }
        if (observable instanceof j6) {
            IndexScaleScreenListActivity.a aVar2 = IndexScaleScreenListActivity.f42138k;
            DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
            deviceSettingsDTO2.getClass();
            String string = getString(R.string.device_settings_visible_widgets);
            string.getClass();
            aVar2.getClass();
            Intent intent2 = new Intent(this, (Class<?>) IndexScaleScreenListActivity.class);
            intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
            intent2.putExtra("GCM_deviceSettingsTitle", string);
            startActivityForResult(intent2, 200);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexscale2/IndexScale2AppearanceActivity$a;", "", "<init>", "()V", "", "CHANGE_NAME_REQUEST_CODE", "I", "WIDGETS_REQUEST_CODE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
