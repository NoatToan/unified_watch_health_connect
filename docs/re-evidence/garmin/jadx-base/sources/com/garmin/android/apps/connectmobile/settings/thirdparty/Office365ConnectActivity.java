package com.garmin.android.apps.connectmobile.settings.thirdparty;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.j;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import cw.p;
import gw.b0;
import gw.t;
import gw.x;
import gw.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wi1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/Office365ConnectActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lak1/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Office365ConnectActivity extends com.garmin.android.apps.connectmobile.c implements ak1.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f43946j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Office365SettingDTO f43947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f43954h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f43955i = new b();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/thirdparty/Office365ConnectActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43957a;

            static {
                int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f43957a = iArr;
            }
        }

        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            Office365ConnectActivity office365ConnectActivity = Office365ConnectActivity.this;
            office365ConnectActivity.hideProgressOverlay();
            int i14 = a.f43957a[cVar.ordinal()];
            if (i14 != 1 && i14 != 2) {
                Toast.makeText(office365ConnectActivity, office365ConnectActivity.getString(R.string.txt_error_occurred), 0).show();
                return;
            }
            if (office365ConnectActivity.f43950d) {
                v supportFragmentManager = office365ConnectActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                com.garmin.android.apps.connectmobile.settings.thirdparty.b.a aVar = com.garmin.android.apps.connectmobile.settings.thirdparty.b.f43967d;
                String str = office365ConnectActivity.f43948b;
                aVar.getClass();
                com.garmin.android.apps.connectmobile.settings.thirdparty.b bVar = new com.garmin.android.apps.connectmobile.settings.thirdparty.b();
                Bundle bundle = new Bundle();
                bundle.putString("login_url", str);
                bVar.setArguments(bundle);
                aVarB.l(R.id.content_frame, bVar, null);
                aVarB.d(null);
                aVarB.e();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            Office365ConnectActivity.this.f43948b = (String) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/thirdparty/Office365ConnectActivity$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43959a;

            static {
                int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f43959a = iArr;
            }
        }

        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            Office365ConnectActivity office365ConnectActivity = Office365ConnectActivity.this;
            office365ConnectActivity.hideProgressOverlay();
            int i14 = a.f43959a[cVar.ordinal()];
            boolean z14 = false;
            if (i14 != 1 && i14 != 2) {
                Toast.makeText(office365ConnectActivity, office365ConnectActivity.getString(R.string.txt_error_occurred), 0).show();
                return;
            }
            if (office365ConnectActivity.f43953g) {
                office365ConnectActivity.finish();
            } else {
                office365ConnectActivity.ca();
            }
            Intent intent = new Intent();
            Office365SettingDTO office365SettingDTO = office365ConnectActivity.f43947a;
            if (office365SettingDTO != null && office365SettingDTO.f43515e) {
                z14 = true;
            }
            intent.putExtra("GCM_calendar_office_365_connected", z14);
            office365ConnectActivity.setResult(-1, intent);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            Office365ConnectActivity.this.f43947a = (Office365SettingDTO) obj;
        }
    }

    @Override // ak1.c
    public final void R2() {
        p.f55942b.getClass();
        p pVarA = p.a.a();
        if (pVarA != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.d(new x(pVarA), this.f43955i);
        }
    }

    public final void ca() {
        String string;
        Office365SettingDTO office365SettingDTO = this.f43947a;
        if (office365SettingDTO != null) {
            int i14 = office365SettingDTO.f43516f;
            int i15 = g.f185499a;
            if (i14 == 0 || i14 != 1) {
                string = "";
            } else {
                string = getString(R.string.social_office365_account_not_supported_message);
                string.getClass();
            }
            if (!TextUtils.isEmpty(string)) {
                fa(string);
            }
            Office365SettingDTO office365SettingDTO2 = this.f43947a;
            if (office365SettingDTO2 == null || !office365SettingDTO2.f43515e) {
                if (!this.f43950d) {
                    this.f43952f = true;
                    return;
                }
                this.f43952f = false;
                v supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                com.garmin.android.apps.connectmobile.settings.thirdparty.c.f43972b.getClass();
                aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.settings.thirdparty.c(), null);
                aVarB.e();
                return;
            }
            if (!this.f43950d) {
                this.f43952f = true;
                return;
            }
            this.f43952f = false;
            Office365SettingDTO office365SettingDTO3 = this.f43947a;
            Office365SettingDTO office365SettingDTO4 = new Office365SettingDTO(null, office365SettingDTO3 != null && office365SettingDTO3.f43512b, office365SettingDTO3 != null && office365SettingDTO3.f43513c, office365SettingDTO3 != null && office365SettingDTO3.f43514d);
            v supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
            com.garmin.android.apps.connectmobile.settings.thirdparty.a.f43960g.getClass();
            com.garmin.android.apps.connectmobile.settings.thirdparty.a aVar = new com.garmin.android.apps.connectmobile.settings.thirdparty.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("office_settings", office365SettingDTO4);
            aVar.setArguments(bundle);
            aVarB2.l(R.id.content_frame, aVar, "officeSettingsFragmentTag");
            aVarB2.e();
        }
    }

    public final void da() {
        this.f43951e = false;
        getSupportFragmentManager().Z();
        showProgressOverlay();
        Office365SettingDTO office365SettingDTO = new Office365SettingDTO(this.f43949c, true, true, true);
        p.f55942b.getClass();
        p pVarA = p.a.a();
        if (pVarA != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.d(new t(office365SettingDTO, pVarA), this.f43954h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x009a, code lost:
    
        if (p005kotlin.jvm.internal.s.g(r3 != null ? java.lang.Boolean.valueOf(r3.f43513c) : null, r0 != null ? java.lang.Boolean.valueOf(r0.f43513c) : null) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ea() {
        Office365SettingDTO office365SettingDTO;
        com.garmin.android.apps.connectmobile.settings.thirdparty.a aVar = (com.garmin.android.apps.connectmobile.settings.thirdparty.a) getSupportFragmentManager().G("officeSettingsFragmentTag");
        if (aVar != null) {
            Office365SettingDTO office365SettingDTO2 = aVar.f43962b;
            boolean z14 = false;
            if (office365SettingDTO2 != null) {
                SwitchCompat switchCompat = aVar.f43964d;
                office365SettingDTO2.f43512b = switchCompat != null && switchCompat.isChecked();
            }
            Office365SettingDTO office365SettingDTO3 = aVar.f43962b;
            if (office365SettingDTO3 != null) {
                SwitchCompat switchCompat2 = aVar.f43966f;
                office365SettingDTO3.f43513c = switchCompat2 != null && switchCompat2.isChecked();
            }
            Office365SettingDTO office365SettingDTO4 = aVar.f43962b;
            if (office365SettingDTO4 != null) {
                SwitchCompat switchCompat3 = aVar.f43965e;
                if (switchCompat3 != null && switchCompat3.isChecked()) {
                    z14 = true;
                }
                office365SettingDTO4.f43514d = z14;
            }
            office365SettingDTO = aVar.f43962b;
        } else {
            office365SettingDTO = null;
        }
        Office365SettingDTO office365SettingDTO5 = this.f43947a;
        if (office365SettingDTO5 != null) {
            if (s.g(Boolean.valueOf(office365SettingDTO5.f43512b), office365SettingDTO != null ? Boolean.valueOf(office365SettingDTO.f43512b) : null)) {
                Office365SettingDTO office365SettingDTO6 = this.f43947a;
                if (s.g(office365SettingDTO6 != null ? Boolean.valueOf(office365SettingDTO6.f43514d) : null, office365SettingDTO != null ? Boolean.valueOf(office365SettingDTO.f43514d) : null)) {
                    Office365SettingDTO office365SettingDTO7 = this.f43947a;
                }
            }
            this.f43953g = true;
            showProgressOverlay();
            if (office365SettingDTO != null) {
                p.f55942b.getClass();
                p pVarA = p.a.a();
                if (pVarA != null) {
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new z(office365SettingDTO, pVarA), this.f43954h);
                    return;
                }
                return;
            }
            return;
        }
        finish();
    }

    public final void fa(String str) {
        new e.a(this).setMessage(str).setCancelable(true).setPositiveButton(R.string.lbl_close, new ag0.e(3)).create().show();
    }

    @Override // ak1.c
    public final void n2(String str) {
        this.f43949c = str;
        if (TextUtils.isEmpty(str)) {
            getSupportFragmentManager().Z();
            String string = getString(R.string.social_office365_permissions_not_granted);
            string.getClass();
            fa(string);
            return;
        }
        if (this.f43950d) {
            da();
        } else {
            this.f43951e = true;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Office365SettingDTO office365SettingDTO = this.f43947a;
        if (office365SettingDTO != null && office365SettingDTO != null && office365SettingDTO.f43515e) {
            ea();
        }
        if (getSupportFragmentManager() == null || getSupportFragmentManager().M() <= 0) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().Z();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.common_layout);
        initActionBar(true, R.string.lbl_feature_tour_office365_title);
        showProgressOverlay();
        p.f55942b.getClass();
        p pVarA = p.a.a();
        if (pVarA != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.d(new b0(pVarA), this.f43954h);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        Office365SettingDTO office365SettingDTO = this.f43947a;
        if (office365SettingDTO == null || office365SettingDTO == null || !office365SettingDTO.f43515e) {
            onNavigateUp();
        } else {
            ea();
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f43950d = false;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f43950d = true;
        if (this.f43951e) {
            da();
        }
        if (this.f43952f) {
            ca();
        }
    }

    @Override // ak1.c
    public final void z0() {
        showProgressOverlay();
        p.f55942b.getClass();
        p pVarA = p.a.a();
        if (pVarA != null) {
            com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.v(pVarA), this.f43954h);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/thirdparty/Office365ConnectActivity$a;", "", "<init>", "()V", "", "OFFICE_SETTINGS_FRAG_TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
