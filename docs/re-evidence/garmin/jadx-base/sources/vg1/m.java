package vg1;

import android.text.Editable;
import android.text.TextWatcher;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceCustomWidgetActivity;

/* JADX INFO: loaded from: classes10.dex */
public class m implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceCustomWidgetActivity f178137a;

    public m(DeviceCustomWidgetActivity deviceCustomWidgetActivity) {
        this.f178137a = deviceCustomWidgetActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DeviceCustomWidgetActivity deviceCustomWidgetActivity = this.f178137a;
        if (deviceCustomWidgetActivity.f42621b) {
            return;
        }
        int i14 = deviceCustomWidgetActivity.f42623d + deviceCustomWidgetActivity.f42622c;
        String string = editable.toString();
        String strConcat = string.substring(0, deviceCustomWidgetActivity.f42623d).concat(string.substring(i14, editable.length()));
        int i15 = deviceCustomWidgetActivity.f42623d;
        deviceCustomWidgetActivity.f42620a.setText(strConcat);
        deviceCustomWidgetActivity.f42620a.setSelection(i15);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        DeviceCustomWidgetActivity deviceCustomWidgetActivity = this.f178137a;
        deviceCustomWidgetActivity.f42622c = i16;
        deviceCustomWidgetActivity.f42623d = i14;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        DeviceCustomWidgetActivity deviceCustomWidgetActivity = this.f178137a;
        if (i15 >= i16) {
            deviceCustomWidgetActivity.f42621b = true;
        } else if (charSequence.charAt(i14) <= 127) {
            deviceCustomWidgetActivity.f42621b = true;
        } else {
            deviceCustomWidgetActivity.f42621b = false;
        }
    }
}
