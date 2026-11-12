package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pm0.h;
import tv.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/VectorDeviceSettingsEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VectorDeviceSettingsEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30808d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f30809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatEditText f30811c;

    @Override // android.app.Activity
    public final void finish() {
        Float f14;
        try {
            AppCompatEditText appCompatEditText = this.f30811c;
            float f15 = Float.parseFloat(String.valueOf(appCompatEditText != null ? appCompatEditText.getText() : null));
            j jVar = this.f30809a;
            if (jVar == null) {
                s.m("settingProprieties");
                throw null;
            }
            float f16 = jVar.f166519i;
            if (f15 > jVar.f166520j || f16 > f15 || !((f14 = jVar.f166521k) == null || Float.valueOf(f15 % f14.floatValue()).equals(Float.valueOf(0.0f)))) {
                throw new NumberFormatException();
            }
            Intent intent = new Intent();
            intent.putExtra("SETTING_VALUE", f15);
            setResult(-1, intent);
            super.finish();
        } catch (NumberFormatException unused) {
            AppCompatEditText appCompatEditText2 = this.f30811c;
            if (appCompatEditText2 != null) {
                appCompatEditText2.setText(String.valueOf(this.f30810b));
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
            j jVar2 = this.f30809a;
            if (jVar2 == null) {
                s.m("settingProprieties");
                throw null;
            }
            androidx.appcompat.app.e.a message = aVar.setMessage(jVar2.f166515e);
            j jVar3 = this.f30809a;
            if (jVar3 != null) {
                message.setTitle(jVar3.f166514d).setCancelable(false).setPositiveButton(getString(R.string.lbl_ok), new qh1.j(22)).create().show();
            } else {
                s.m("settingProprieties");
                throw null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j jVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            jVar = new j(null, null, null, null, null, null, null, null, 0.0f, 0.0f, null, 2047, null);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_VECTOR_DEVICE_SETTING_TEXTS", j.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_VECTOR_DEVICE_SETTING_TEXTS");
                if (!(parcelableExtra instanceof j)) {
                    parcelableExtra = null;
                }
                parcelable = (j) parcelableExtra;
            }
            jVar = (j) parcelable;
            if (jVar == null) {
                jVar = new j(null, null, null, null, null, null, null, null, 0.0f, 0.0f, null, 2047, null);
            }
        }
        this.f30809a = jVar;
        Intent intent2 = getIntent();
        float floatExtra = this.f30810b;
        if (intent2 != null) {
            floatExtra = intent2.getFloatExtra("EXTRA_CURRENT_VALUE", floatExtra);
        }
        this.f30810b = floatExtra;
        setContentView(R.layout.gcm3_vector_settings_edit_text);
        j jVar2 = this.f30809a;
        if (jVar2 == null) {
            s.m("settingProprieties");
            throw null;
        }
        initActionBar(true, jVar2.f166511a);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.value);
        appCompatEditText.setText(String.valueOf(this.f30810b));
        Editable text = appCompatEditText.getText();
        if (text != null) {
            appCompatEditText.setSelection(text.length());
        }
        this.f30811c = appCompatEditText;
        TextView textView = (TextView) findViewById(R.id.subTitle);
        j jVar3 = this.f30809a;
        if (jVar3 == null) {
            s.m("settingProprieties");
            throw null;
        }
        String str = jVar3.f166512b;
        if (str != null) {
            textView.getClass();
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.getClass();
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) findViewById(R.id.description);
        j jVar4 = this.f30809a;
        if (jVar4 == null) {
            s.m("settingProprieties");
            throw null;
        }
        String str2 = jVar4.f166513c;
        if (str2 != null) {
            textView2.getClass();
            textView2.setVisibility(0);
            textView2.setText(str2);
        } else {
            textView2.getClass();
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) findViewById(R.id.units);
        j jVar5 = this.f30809a;
        if (jVar5 == null) {
            s.m("settingProprieties");
            throw null;
        }
        String str3 = jVar5.f166518h;
        if (str3 != null) {
            textView3.getClass();
            textView3.setVisibility(0);
            textView3.setText(str3);
        } else {
            textView3.getClass();
            textView3.setVisibility(8);
        }
        View viewFindViewById = findViewById(R.id.help_web_link);
        j jVar6 = this.f30809a;
        if (jVar6 == null) {
            s.m("settingProprieties");
            throw null;
        }
        String str4 = jVar6.f166516f;
        if (str4 == null) {
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new h(28, this, str4));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/VectorDeviceSettingsEditActivity$a;", "", "<init>", "()V", "", "SETTING_VALUE", "Ljava/lang/String;", "EXTRA_VECTOR_DEVICE_SETTING_TEXTS", "EXTRA_CURRENT_VALUE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(VectorGeneralSettingsActivity vectorGeneralSettingsActivity, int i14, Float f14, j jVar) {
            Intent intent = new Intent(vectorGeneralSettingsActivity, (Class<?>) VectorDeviceSettingsEditActivity.class);
            intent.putExtra("EXTRA_VECTOR_DEVICE_SETTING_TEXTS", jVar);
            intent.putExtra("EXTRA_CURRENT_VALUE", f14);
            vectorGeneralSettingsActivity.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
