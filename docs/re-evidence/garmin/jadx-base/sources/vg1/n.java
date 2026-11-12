package vg1;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceNameWidgetActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvg1/n;", "Landroid/text/TextWatcher;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceNameWidgetActivity f178140a;

    public n(DeviceNameWidgetActivity deviceNameWidgetActivity) {
        this.f178140a = deviceNameWidgetActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        DeviceNameWidgetActivity deviceNameWidgetActivity = this.f178140a;
        if (deviceNameWidgetActivity.f42635b) {
            return;
        }
        int i14 = deviceNameWidgetActivity.f42637d + deviceNameWidgetActivity.f42636c;
        String string = editable.toString();
        String strConcat = string.substring(0, deviceNameWidgetActivity.f42637d).concat(string.substring(i14, editable.length()));
        int i15 = deviceNameWidgetActivity.f42637d;
        AppCompatEditText appCompatEditText = deviceNameWidgetActivity.f42634a;
        if (appCompatEditText != null) {
            appCompatEditText.setText(strConcat);
        }
        AppCompatEditText appCompatEditText2 = deviceNameWidgetActivity.f42634a;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setSelection(i15);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        DeviceNameWidgetActivity deviceNameWidgetActivity = this.f178140a;
        deviceNameWidgetActivity.f42636c = i16;
        deviceNameWidgetActivity.f42637d = i14;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        DeviceNameWidgetActivity deviceNameWidgetActivity = this.f178140a;
        if (i15 < i16) {
            deviceNameWidgetActivity.f42635b = charSequence.charAt(i14) <= 127;
        } else {
            deviceNameWidgetActivity.f42635b = true;
        }
    }
}
