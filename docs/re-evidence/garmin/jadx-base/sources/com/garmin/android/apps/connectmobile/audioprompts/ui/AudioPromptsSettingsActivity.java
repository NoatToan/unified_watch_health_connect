package com.garmin.android.apps.connectmobile.audioprompts.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsConfigActivity;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import ig1.l0;
import java.util.ArrayList;
import java.util.Arrays;
import l73.k;
import lu.e;
import org.greenrobot.eventbus.ThreadMode;
import org.koin.java.KoinJavaComponent;
import ou.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/AudioPromptsSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioPromptsSettingsActivity extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f30263h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexTwoLineButton f30264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexTwoLineButton f30265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f30266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f30267d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f30269f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30268e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f30270g = new b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/garmin/android/apps/connectmobile/audioprompts/ui/AudioPromptsSettingsActivity$b", "Lku/b;", "Lku/a;", "textSpokenEvent", "", "textSpoken", "(Lku/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ku.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30273c;

        public b() {
        }

        @Override // ku.b
        @k(threadMode = ThreadMode.MAIN)
        public void textSpoken(ku.a textSpokenEvent) {
            textSpokenEvent.getClass();
            String str = textSpokenEvent.f106535a;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 147440860) {
                    if (iHashCode != 1245291027) {
                        if (iHashCode == 1331988336 && str.equals("TestAlertVolumeOperation.lap")) {
                            this.f30271a = true;
                        }
                    } else if (str.equals("TestAlertVolumeOperation.heart.rate")) {
                        this.f30273c = true;
                    }
                } else if (str.equals("TestAlertVolumeOperation.speed")) {
                    this.f30272b = true;
                }
                if (this.f30271a && this.f30272b && this.f30273c) {
                    this.f30271a = false;
                    this.f30272b = false;
                    this.f30273c = false;
                    AudioPromptsSettingsActivity audioPromptsSettingsActivity = AudioPromptsSettingsActivity.this;
                    GCMComplexTwoLineButton gCMComplexTwoLineButton = audioPromptsSettingsActivity.f30267d;
                    if (gCMComplexTwoLineButton != null) {
                        gCMComplexTwoLineButton.e(false);
                    }
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = audioPromptsSettingsActivity.f30267d;
                    if (gCMComplexTwoLineButton2 != null) {
                        gCMComplexTwoLineButton2.d(true);
                    }
                    GCMComplexTwoLineButton gCMComplexTwoLineButton3 = audioPromptsSettingsActivity.f30267d;
                    if (gCMComplexTwoLineButton3 != null) {
                        gCMComplexTwoLineButton3.setEnabled(true);
                    }
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).l(this.f30268e);
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f30268e = extras.getLong("GCM_deviceUnitID", -1L);
            this.f30269f = extras.getString("GCM_deviceProductNbr");
        }
        if (this.f30268e == -1) {
            Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
            finish();
        }
        if (this.f30269f == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioPromptsSettingsActivity", "Invalid device product number! Exit Audio Prompts settings.");
            finish();
            return;
        }
        setContentView(R.layout.gcm_device_audio_prompts_settings);
        initActionBar(true, R.string.device_settings_audio_prompts);
        View viewFindViewById = findViewById(R.id.lap_outer_layout);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.lap_switch_right);
        viewFindViewById2.getClass();
        SwitchCompat switchCompat = (SwitchCompat) viewFindViewById2;
        if (km2.a.i(this.f30268e, null, SupportedCapability.AUDIO_PROMPT_LAP.ordinal())) {
            final gu.b bVar = (gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null);
            switchCompat.setChecked(bVar.m(this.f30268e, lu.a.LAP));
            final int i14 = 0;
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ou.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                    switch (i14) {
                        case 0:
                            bVar.n(this.f30268e, z14, lu.a.LAP);
                            break;
                        default:
                            bVar.n(this.f30268e, z14, lu.a.NAVIGATION);
                            break;
                    }
                }
            });
            viewFindViewById.setOnClickListener(new d(switchCompat, 0));
        } else {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById3 = findViewById(R.id.navigation_outer_layout);
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.navigation_alert_switch);
        viewFindViewById4.getClass();
        SwitchCompat switchCompat2 = (SwitchCompat) viewFindViewById4;
        if (km2.a.i(this.f30268e, null, SupportedCapability.AUDIO_PROMPT_NAVIGATION.ordinal())) {
            final gu.b bVar2 = (gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null);
            switchCompat2.setChecked(bVar2.m(this.f30268e, lu.a.NAVIGATION));
            final int i15 = 1;
            switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ou.c
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                    switch (i15) {
                        case 0:
                            bVar2.n(this.f30268e, z14, lu.a.LAP);
                            break;
                        default:
                            bVar2.n(this.f30268e, z14, lu.a.NAVIGATION);
                            break;
                    }
                }
            });
            viewFindViewById3.setOnClickListener(new d(switchCompat2, 1));
        } else {
            viewFindViewById3.setVisibility(8);
        }
        View viewFindViewById5 = findViewById(R.id.heart_rate_alert_btn);
        viewFindViewById5.getClass();
        this.f30264a = (GCMComplexTwoLineButton) viewFindViewById5;
        boolean zI = km2.a.i(this.f30268e, null, SupportedCapability.AUDIO_PROMPT_HEART_RATE.ordinal());
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f30264a;
        if (zI) {
            if (gCMComplexTwoLineButton != null) {
                final int i16 = 0;
                gCMComplexTwoLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: ou.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AudioPromptsSettingsActivity f133960b;

                    {
                        this.f133960b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i17 = i16;
                        AudioPromptsSettingsActivity audioPromptsSettingsActivity = this.f133960b;
                        switch (i17) {
                            case 0:
                                AudioPromptsSettingsActivity.a aVar2 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent.putExtra("extra.type.enum.name", "HEART_RATE");
                                audioPromptsSettingsActivity.startActivity(intent);
                                break;
                            case 1:
                                AudioPromptsSettingsActivity.a aVar3 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent2 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent2.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent2.putExtra("extra.type.enum.name", "PACE_SPEED");
                                audioPromptsSettingsActivity.startActivity(intent2);
                                break;
                            case 2:
                                AudioPromptsSettingsActivity.a aVar4 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent3 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent3.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent3.putExtra("extra.type.enum.name", "POWER");
                                audioPromptsSettingsActivity.startActivity(intent3);
                                break;
                            default:
                                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton2 != null) {
                                    gCMComplexTwoLineButton2.setEnabled(false);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton3 != null) {
                                    gCMComplexTwoLineButton3.e(true);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton4 != null) {
                                    gCMComplexTwoLineButton4.d(false);
                                }
                                ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).g(audioPromptsSettingsActivity.f30268e);
                                break;
                        }
                    }
                });
            }
        } else if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setVisibility(8);
        }
        View viewFindViewById6 = findViewById(R.id.speed_pace_alert_btn);
        viewFindViewById6.getClass();
        this.f30265b = (GCMComplexTwoLineButton) viewFindViewById6;
        boolean zI2 = km2.a.i(this.f30268e, null, SupportedCapability.AUDIO_PROMPT_PACE_SPEED.ordinal());
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f30265b;
        if (zI2) {
            if (gCMComplexTwoLineButton2 != null) {
                final int i17 = 1;
                gCMComplexTwoLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: ou.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AudioPromptsSettingsActivity f133960b;

                    {
                        this.f133960b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i18 = i17;
                        AudioPromptsSettingsActivity audioPromptsSettingsActivity = this.f133960b;
                        switch (i18) {
                            case 0:
                                AudioPromptsSettingsActivity.a aVar2 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent.putExtra("extra.type.enum.name", "HEART_RATE");
                                audioPromptsSettingsActivity.startActivity(intent);
                                break;
                            case 1:
                                AudioPromptsSettingsActivity.a aVar3 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent2 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent2.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent2.putExtra("extra.type.enum.name", "PACE_SPEED");
                                audioPromptsSettingsActivity.startActivity(intent2);
                                break;
                            case 2:
                                AudioPromptsSettingsActivity.a aVar4 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent3 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent3.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent3.putExtra("extra.type.enum.name", "POWER");
                                audioPromptsSettingsActivity.startActivity(intent3);
                                break;
                            default:
                                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton3 != null) {
                                    gCMComplexTwoLineButton3.setEnabled(false);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton4 != null) {
                                    gCMComplexTwoLineButton4.e(true);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton5 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton5 != null) {
                                    gCMComplexTwoLineButton5.d(false);
                                }
                                ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).g(audioPromptsSettingsActivity.f30268e);
                                break;
                        }
                    }
                });
            }
        } else if (gCMComplexTwoLineButton2 != null) {
            gCMComplexTwoLineButton2.setVisibility(8);
        }
        View viewFindViewById7 = findViewById(R.id.power_alert_btn);
        viewFindViewById7.getClass();
        this.f30266c = (GCMComplexTwoLineButton) viewFindViewById7;
        boolean zI3 = km2.a.i(this.f30268e, null, SupportedCapability.AUDIO_PROMPT_POWER.ordinal());
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f30266c;
        if (zI3) {
            if (gCMComplexTwoLineButton3 != null) {
                final int i18 = 2;
                gCMComplexTwoLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: ou.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AudioPromptsSettingsActivity f133960b;

                    {
                        this.f133960b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i19 = i18;
                        AudioPromptsSettingsActivity audioPromptsSettingsActivity = this.f133960b;
                        switch (i19) {
                            case 0:
                                AudioPromptsSettingsActivity.a aVar2 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent.putExtra("extra.type.enum.name", "HEART_RATE");
                                audioPromptsSettingsActivity.startActivity(intent);
                                break;
                            case 1:
                                AudioPromptsSettingsActivity.a aVar3 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent2 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent2.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent2.putExtra("extra.type.enum.name", "PACE_SPEED");
                                audioPromptsSettingsActivity.startActivity(intent2);
                                break;
                            case 2:
                                AudioPromptsSettingsActivity.a aVar4 = AudioPromptsSettingsActivity.f30263h;
                                Intent intent3 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                                intent3.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                                intent3.putExtra("extra.type.enum.name", "POWER");
                                audioPromptsSettingsActivity.startActivity(intent3);
                                break;
                            default:
                                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton4 != null) {
                                    gCMComplexTwoLineButton4.setEnabled(false);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton5 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton5 != null) {
                                    gCMComplexTwoLineButton5.e(true);
                                }
                                GCMComplexTwoLineButton gCMComplexTwoLineButton6 = audioPromptsSettingsActivity.f30267d;
                                if (gCMComplexTwoLineButton6 != null) {
                                    gCMComplexTwoLineButton6.d(false);
                                }
                                ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).g(audioPromptsSettingsActivity.f30268e);
                                break;
                        }
                    }
                });
            }
        } else if (gCMComplexTwoLineButton3 != null) {
            gCMComplexTwoLineButton3.setVisibility(8);
        }
        setVolumeControlStream(3);
        View viewFindViewById8 = findViewById(R.id.alert_volume_btn);
        viewFindViewById8.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) viewFindViewById8;
        this.f30267d = gCMComplexTwoLineButton4;
        final int i19 = 3;
        gCMComplexTwoLineButton4.setOnClickListener(new View.OnClickListener(this) { // from class: ou.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudioPromptsSettingsActivity f133960b;

            {
                this.f133960b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i110 = i19;
                AudioPromptsSettingsActivity audioPromptsSettingsActivity = this.f133960b;
                switch (i110) {
                    case 0:
                        AudioPromptsSettingsActivity.a aVar2 = AudioPromptsSettingsActivity.f30263h;
                        Intent intent = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                        intent.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                        intent.putExtra("extra.type.enum.name", "HEART_RATE");
                        audioPromptsSettingsActivity.startActivity(intent);
                        break;
                    case 1:
                        AudioPromptsSettingsActivity.a aVar3 = AudioPromptsSettingsActivity.f30263h;
                        Intent intent2 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                        intent2.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                        intent2.putExtra("extra.type.enum.name", "PACE_SPEED");
                        audioPromptsSettingsActivity.startActivity(intent2);
                        break;
                    case 2:
                        AudioPromptsSettingsActivity.a aVar4 = AudioPromptsSettingsActivity.f30263h;
                        Intent intent3 = new Intent(audioPromptsSettingsActivity, (Class<?>) AudioPromptsConfigActivity.class);
                        intent3.putExtra("GCM_deviceUnitID", audioPromptsSettingsActivity.f30268e);
                        intent3.putExtra("extra.type.enum.name", "POWER");
                        audioPromptsSettingsActivity.startActivity(intent3);
                        break;
                    default:
                        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = audioPromptsSettingsActivity.f30267d;
                        if (gCMComplexTwoLineButton5 != null) {
                            gCMComplexTwoLineButton5.setEnabled(false);
                        }
                        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = audioPromptsSettingsActivity.f30267d;
                        if (gCMComplexTwoLineButton6 != null) {
                            gCMComplexTwoLineButton6.e(true);
                        }
                        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = audioPromptsSettingsActivity.f30267d;
                        if (gCMComplexTwoLineButton7 != null) {
                            gCMComplexTwoLineButton7.d(false);
                        }
                        ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).g(audioPromptsSettingsActivity.f30268e);
                        break;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        gu.b bVar = (gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null);
        long j8 = this.f30268e;
        lu.a aVar = lu.a.HEART_RATE;
        if (bVar.m(j8, aVar)) {
            lu.c cVarE = bVar.e(this.f30268e);
            cVarE.getClass();
            String strS = bVar.s(new ArrayList<>(Arrays.asList(getString(cVarE.f114933a), bVar.f(this.f30268e, aVar))));
            String strA = oi0.d.a(this, strS, new l0(4));
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f30264a;
            if (gCMComplexTwoLineButton != null) {
                gCMComplexTwoLineButton.b(strS, strA);
            }
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f30264a;
            if (gCMComplexTwoLineButton2 != null) {
                gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(R.string.lbl_off));
            }
        }
        long j14 = this.f30268e;
        lu.a aVar2 = lu.a.PACE_SPEED;
        if (bVar.m(j14, aVar2)) {
            lu.d dVarD = bVar.d(this.f30268e);
            dVarD.getClass();
            String strS2 = bVar.s(new ArrayList<>(Arrays.asList(getString(dVarD.f114941a), bVar.f(this.f30268e, aVar2))));
            String strA2 = oi0.d.a(this, strS2, new l0(5));
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f30265b;
            if (gCMComplexTwoLineButton3 != null) {
                gCMComplexTwoLineButton3.b(strS2, strA2);
            }
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f30265b;
            if (gCMComplexTwoLineButton4 != null) {
                gCMComplexTwoLineButton4.setButtonBottomLeftLabel(getString(R.string.lbl_off));
            }
        }
        long j15 = this.f30268e;
        lu.a aVar3 = lu.a.POWER;
        if (!bVar.m(j15, aVar3)) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f30266c;
            if (gCMComplexTwoLineButton5 != null) {
                gCMComplexTwoLineButton5.setButtonBottomLeftLabel(getString(R.string.lbl_off));
                return;
            }
            return;
        }
        e eVarK = bVar.k(this.f30268e);
        eVarK.getClass();
        String strS3 = bVar.s(new ArrayList<>(Arrays.asList(getString(eVarK.f114950a), bVar.f(this.f30268e, aVar3))));
        String strA3 = oi0.d.a(this, strS3, new l0(3));
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f30266c;
        if (gCMComplexTwoLineButton6 != null) {
            gCMComplexTwoLineButton6.b(strS3, strA3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).i(this.f30270g);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).q(this.f30270g);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/AudioPromptsSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
