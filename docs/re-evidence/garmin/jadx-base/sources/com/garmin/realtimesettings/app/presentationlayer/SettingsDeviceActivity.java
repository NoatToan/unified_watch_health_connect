package com.garmin.realtimesettings.app.presentationlayer;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import cx2.h;
import ew2.e;
import o13.m;
import o13.p;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import yw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/SettingsDeviceActivity;", "Lcom/garmin/realtimesettings/app/presentationlayer/a;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsDeviceActivity extends com.garmin.realtimesettings.app.presentationlayer.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f52599w = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f52600p = new h("SettingsDeviceActivity", null, 2, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rw2.a f52601q = new rw2.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f52602r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f52603t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f52604v;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/realtimesettings/app/presentationlayer/SettingsDeviceActivity$b", "Lb/s;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            SettingsDeviceActivity settingsDeviceActivity = SettingsDeviceActivity.this;
            settingsDeviceActivity.f52600p.getClass();
            if (settingsDeviceActivity.getSupportFragmentManager().M() == 0) {
                settingsDeviceActivity.finish();
            } else {
                settingsDeviceActivity.getOnBackPressedDispatcher().d();
            }
        }
    }

    public SettingsDeviceActivity() {
        final int i14 = 0;
        this.f52602r = m.b(new e23.a(this) { // from class: yw2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsDeviceActivity f199999b;

            {
                this.f199999b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                SettingsDeviceActivity settingsDeviceActivity = this.f199999b;
                switch (i15) {
                    case 0:
                        SettingsDeviceActivity.a aVar = SettingsDeviceActivity.f52599w;
                        return Integer.valueOf(settingsDeviceActivity.getIntent().getIntExtra("PARENT_COMPOSITION_ID_KEY", -1));
                    case 1:
                        SettingsDeviceActivity.a aVar2 = SettingsDeviceActivity.f52599w;
                        return Integer.valueOf(settingsDeviceActivity.getIntent().getIntExtra("RealTimeSettingInitializer_Composition_Id", -1));
                    default:
                        SettingsDeviceActivity.a aVar3 = SettingsDeviceActivity.f52599w;
                        return Boolean.valueOf(settingsDeviceActivity.getIntent().getBooleanExtra("IS_COMPOSITION_BAKED_TO_APP", false));
                }
            }
        });
        final int i15 = 1;
        this.f52603t = m.b(new e23.a(this) { // from class: yw2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsDeviceActivity f199999b;

            {
                this.f199999b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                SettingsDeviceActivity settingsDeviceActivity = this.f199999b;
                switch (i16) {
                    case 0:
                        SettingsDeviceActivity.a aVar = SettingsDeviceActivity.f52599w;
                        return Integer.valueOf(settingsDeviceActivity.getIntent().getIntExtra("PARENT_COMPOSITION_ID_KEY", -1));
                    case 1:
                        SettingsDeviceActivity.a aVar2 = SettingsDeviceActivity.f52599w;
                        return Integer.valueOf(settingsDeviceActivity.getIntent().getIntExtra("RealTimeSettingInitializer_Composition_Id", -1));
                    default:
                        SettingsDeviceActivity.a aVar3 = SettingsDeviceActivity.f52599w;
                        return Boolean.valueOf(settingsDeviceActivity.getIntent().getBooleanExtra("IS_COMPOSITION_BAKED_TO_APP", false));
                }
            }
        });
        final int i16 = 2;
        this.f52604v = m.b(new e23.a(this) { // from class: yw2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsDeviceActivity f199999b;

            {
                this.f199999b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                SettingsDeviceActivity settingsDeviceActivity = this.f199999b;
                switch (i17) {
                    case 0:
                        SettingsDeviceActivity.a aVar = SettingsDeviceActivity.f52599w;
                        return Integer.valueOf(settingsDeviceActivity.getIntent().getIntExtra("PARENT_COMPOSITION_ID_KEY", -1));
                    case 1:
                        SettingsDeviceActivity.a aVar2 = SettingsDeviceActivity.f52599w;
                        return Integer.valueOf(settingsDeviceActivity.getIntent().getIntExtra("RealTimeSettingInitializer_Composition_Id", -1));
                    default:
                        SettingsDeviceActivity.a aVar3 = SettingsDeviceActivity.f52599w;
                        return Boolean.valueOf(settingsDeviceActivity.getIntent().getBooleanExtra("IS_COMPOSITION_BAKED_TO_APP", false));
                }
            }
        });
    }

    public final void V9() {
        this.f52600p.getClass();
        Intent intent = new Intent();
        intent.putExtra("PARENT_COMPOSITION_ID_KEY", ((Number) this.f52602r.getValue()).intValue());
        setResult(0, intent);
        finish();
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (intent == null || intent.getIntExtra("PARENT_COMPOSITION_ID_KEY", -1) != ((Number) this.f52602r.getValue()).intValue()) {
            return;
        }
        setResult(i15, intent);
        finish();
    }

    @Override // com.garmin.realtimesettings.app.presentationlayer.a, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.rts_activity_settings);
        this.f52600p.getClass();
        String string = getString(R.string.lbl_settings);
        string.getClass();
        S9(string);
        if (getIntent().getExtras() != null) {
            rw2.a aVar = this.f52601q;
            c.a aVar2 = c.f52641v;
            int iIntValue = ((Number) this.f52603t.getValue()).intValue();
            boolean zBooleanValue = ((Boolean) this.f52604v.getValue()).booleanValue();
            aVar2.getClass();
            c cVarA = c.a.a(aVar, iIntValue, zBooleanValue);
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            aVar3.l(R.id.settings_fragment_container, cVarA, null);
            aVar3.e();
        } else {
            Logger logger = h.f56678c;
            e.a.a(e.f66901a, this, getString(R.string.unable_to_update_settings), getString(R.string.unable_to_update_settings_description), new p(getString(R.string.lbl_ok), new f(this, 0)), null, 1008).show();
        }
        getOnBackPressedDispatcher().b(new b(), this);
    }

    @Override // com.garmin.realtimesettings.app.presentationlayer.a, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        com.garmin.realtimesettings.app.initialization.b.a().c(((Number) this.f52603t.getValue()).intValue(), false);
        super.onDestroy();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/presentationlayer/SettingsDeviceActivity$a;", "", "<init>", "()V", "", "RTS_DEFAULT_REQUEST_CODE", "I", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(com.garmin.realtimesettings.app.presentationlayer.a aVar, int i14, int i15, boolean z14) {
            Intent intent = new Intent(aVar, (Class<?>) SettingsDeviceActivity.class);
            intent.putExtra("RealTimeSettingInitializer_Composition_Id", i14);
            intent.putExtra("PARENT_COMPOSITION_ID_KEY", i15);
            intent.putExtra("IS_COMPOSITION_BAKED_TO_APP", z14);
            aVar.startActivityForResult(intent, 100);
        }

        private a() {
        }
    }
}
