package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import c22.t0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import t61.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmResetPassCodeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/settings/devices/common/c$a;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BikeAlarmResetPassCodeActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.settings.devices.common.c.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f42565o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<EditText> f42566a = new ArrayList<>(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Boolean> f42567b = new ArrayList<>(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f42569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f42570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f42571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f42572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f42573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f42574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f42575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f42576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f42577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c32.f f42578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f42579n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmResetPassCodeActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        DISPLAY,
        HIDE
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmResetPassCodeActivity$c", "Lc22/t0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends t0 {
        public c() {
        }

        @Override // c22.t0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
            BikeAlarmResetPassCodeActivity bikeAlarmResetPassCodeActivity = BikeAlarmResetPassCodeActivity.this;
            if (zIsEmpty || strValueOf.length() <= 1) {
                new Handler().postDelayed(new vg1.d(0, editable, bikeAlarmResetPassCodeActivity), 10L);
                return;
            }
            EditText editText = bikeAlarmResetPassCodeActivity.f42566a.get(bikeAlarmResetPassCodeActivity.f42568c);
            String[] strArr = bikeAlarmResetPassCodeActivity.f42571f;
            if (strValueOf.length() > 1) {
                boolean zG = s.g(strArr[bikeAlarmResetPassCodeActivity.f42568c], strValueOf.substring(0, 1));
                int i14 = bikeAlarmResetPassCodeActivity.f42568c;
                if (zG) {
                    strArr[i14] = strValueOf.substring(1);
                } else {
                    strArr[i14] = strValueOf.substring(0, 1);
                }
                strValueOf = strArr[bikeAlarmResetPassCodeActivity.f42568c];
            }
            editText.setText(strValueOf);
        }
    }

    public BikeAlarmResetPassCodeActivity() {
        String[] strArr = new String[4];
        for (int i14 = 0; i14 < 4; i14++) {
            strArr[i14] = "";
        }
        this.f42571f = strArr;
        this.f42578m = new c32.f(this, 15);
        this.f42579n = new c();
    }

    public final void ca() {
        ArrayList<EditText> arrayList = this.f42566a;
        Iterator<EditText> it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            EditText next = it.next();
            next.getClass();
            next.setText("");
        }
        arrayList.get(0).requestFocus();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.c.a
    public final void i5(com.garmin.android.apps.connectmobile.settings.devices.common.c.b bVar, GDISmartProto.Smart smart) {
        bVar.getClass();
        if (bVar != com.garmin.android.apps.connectmobile.settings.devices.common.c.b.SUCCESS || smart == null || !vg1.f.a(smart).hasResetPinResponse()) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            return;
        }
        GDIAntiTheftAlarmProto.ResetPINResponse resetPinResponse = vg1.f.a(smart).getResetPinResponse();
        if ((resetPinResponse != null ? resetPinResponse.getResponse() : null) != GDIAntiTheftAlarmProto.ResetPINResponse.Response.SUCCESS) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            return;
        }
        u20.e eVarV6 = u20.e.v6("", getString(R.string.wallet_passcode_was_reset));
        eVarV6.f167882a = new sa2.b(this, 13);
        eVarV6.g(getSupportFragmentManager());
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_bike_alarm_reset_passcode);
        initActionBar(true, getString(R.string.wallet_reset_passcode));
        updateActionBarNavigation(3);
        View viewFindViewById = findViewById(R.id.bike_alarm_reset_pass_code);
        viewFindViewById.getClass();
        this.f42572g = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.bike_alarm_hide_display_pass_code);
        viewFindViewById2.getClass();
        this.f42573h = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.bike_alarm_pass_code);
        View viewFindViewById4 = viewFindViewById3.findViewById(R.id.bike_alarm_passcode_input1);
        viewFindViewById4.getClass();
        this.f42574i = (EditText) viewFindViewById4;
        View viewFindViewById5 = viewFindViewById3.findViewById(R.id.bike_alarm_passcode_input2);
        viewFindViewById5.getClass();
        this.f42575j = (EditText) viewFindViewById5;
        View viewFindViewById6 = viewFindViewById3.findViewById(R.id.bike_alarm_passcode_input3);
        viewFindViewById6.getClass();
        this.f42576k = (EditText) viewFindViewById6;
        View viewFindViewById7 = viewFindViewById3.findViewById(R.id.bike_alarm_passcode_input4);
        viewFindViewById7.getClass();
        this.f42577l = (EditText) viewFindViewById7;
        Intent intent = getIntent();
        if (intent != null && (extras2 = intent.getExtras()) != null) {
            this.f42570e = Long.valueOf(extras2.getLong("PIN_DEVICE_ID"));
        }
        EditText editText = this.f42574i;
        if (editText == null) {
            s.m("bikeAlarmPasscodeInput1");
            throw null;
        }
        c cVar = this.f42579n;
        editText.addTextChangedListener(cVar);
        EditText editText2 = this.f42575j;
        if (editText2 == null) {
            s.m("bikeAlarmPasscodeInput2");
            throw null;
        }
        editText2.addTextChangedListener(cVar);
        EditText editText3 = this.f42576k;
        if (editText3 == null) {
            s.m("bikeAlarmPasscodeInput3");
            throw null;
        }
        editText3.addTextChangedListener(cVar);
        EditText editText4 = this.f42577l;
        if (editText4 == null) {
            s.m("bikeAlarmPasscodeInput4");
            throw null;
        }
        editText4.addTextChangedListener(cVar);
        EditText editText5 = this.f42574i;
        if (editText5 == null) {
            s.m("bikeAlarmPasscodeInput1");
            throw null;
        }
        c32.f fVar = this.f42578m;
        editText5.setOnFocusChangeListener(fVar);
        EditText editText6 = this.f42575j;
        if (editText6 == null) {
            s.m("bikeAlarmPasscodeInput2");
            throw null;
        }
        editText6.setOnFocusChangeListener(fVar);
        EditText editText7 = this.f42576k;
        if (editText7 == null) {
            s.m("bikeAlarmPasscodeInput3");
            throw null;
        }
        editText7.setOnFocusChangeListener(fVar);
        EditText editText8 = this.f42577l;
        if (editText8 == null) {
            s.m("bikeAlarmPasscodeInput4");
            throw null;
        }
        editText8.setOnFocusChangeListener(fVar);
        EditText editText9 = this.f42574i;
        if (editText9 == null) {
            s.m("bikeAlarmPasscodeInput1");
            throw null;
        }
        ArrayList<EditText> arrayList = this.f42566a;
        arrayList.add(editText9);
        EditText editText10 = this.f42575j;
        if (editText10 == null) {
            s.m("bikeAlarmPasscodeInput2");
            throw null;
        }
        arrayList.add(editText10);
        EditText editText11 = this.f42576k;
        if (editText11 == null) {
            s.m("bikeAlarmPasscodeInput3");
            throw null;
        }
        arrayList.add(editText11);
        EditText editText12 = this.f42577l;
        if (editText12 == null) {
            s.m("bikeAlarmPasscodeInput4");
            throw null;
        }
        arrayList.add(editText12);
        Boolean bool = Boolean.FALSE;
        ArrayList<Boolean> arrayList2 = this.f42567b;
        arrayList2.add(bool);
        arrayList2.add(bool);
        arrayList2.add(bool);
        arrayList2.add(bool);
        EditText editText13 = this.f42574i;
        if (editText13 == null) {
            s.m("bikeAlarmPasscodeInput1");
            throw null;
        }
        editText13.setTag(Integer.valueOf(arrayList.indexOf(editText13)));
        EditText editText14 = this.f42575j;
        if (editText14 == null) {
            s.m("bikeAlarmPasscodeInput2");
            throw null;
        }
        editText14.setTag(Integer.valueOf(arrayList.indexOf(editText14)));
        EditText editText15 = this.f42576k;
        if (editText15 == null) {
            s.m("bikeAlarmPasscodeInput3");
            throw null;
        }
        editText15.setTag(Integer.valueOf(arrayList.indexOf(editText15)));
        EditText editText16 = this.f42577l;
        if (editText16 == null) {
            s.m("bikeAlarmPasscodeInput4");
            throw null;
        }
        editText16.setTag(Integer.valueOf(arrayList.indexOf(editText16)));
        Intent intent2 = getIntent();
        if (intent2 != null && (extras = intent2.getExtras()) != null) {
            extras.getBoolean("CONFIRM_PASS_CODE_KEY");
        }
        TextView textView = this.f42572g;
        if (textView == null) {
            s.m("bikeAlarmResetPassCode");
            throw null;
        }
        textView.setTag("PASS_CODE_RESET_TAG");
        TextView textView2 = this.f42573h;
        if (textView2 == null) {
            s.m("bikeAlarmHideDisplayPassCode");
            throw null;
        }
        textView2.setTag(b.HIDE);
        TextView textView3 = this.f42573h;
        if (textView3 == null) {
            s.m("bikeAlarmHideDisplayPassCode");
            throw null;
        }
        textView3.setText(getString(R.string.lbl_hide));
        TextView textView4 = this.f42573h;
        if (textView4 != null) {
            textView4.setOnClickListener(new m(this, 28));
        } else {
            s.m("bikeAlarmHideDisplayPassCode");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmResetPassCodeActivity$a;", "", "<init>", "()V", "", "CONFIRM_PASS_CODE_KEY", "Ljava/lang/String;", "PIN_KEY", "PIN_DEVICE_ID", "PASS_CODE_RESET_TAG", "PASS_CODE_CONFIRM_TAG", "", "DELAY_MILLIS", "I", "PASSCODE_LENGTH", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
