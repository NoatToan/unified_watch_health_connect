package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/b;", "Lcom/garmin/android/apps/connectmobile/view/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/view/a$a;", "mDurationListener", "", "first", "", "editTextValue", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/view/a$a;IF)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, a.InterfaceC0927a interfaceC0927a, int i14, float f14) {
        super(context, interfaceC0927a, i14, f14);
        context.getClass();
        interfaceC0927a.getClass();
        setTitle(context.getString(R.string.user_stride_measured_distance));
        this.f47559b.getFirstPicker().setDisplayedValues(new String[]{context.getString(R.string.common_feet_string), context.getString(R.string.common_meters_string)});
        this.f47559b.getFirstPicker().setMinValue(0);
        this.f47559b.getFirstPicker().setMaxValue(1);
        this.f47559b.getFirstPicker().setValue(i14);
        this.f47559b.getEditTextNumber().setText(String.valueOf(f14));
    }

    @Override // com.garmin.android.apps.connectmobile.view.a
    public final String j(Number number) {
        number.getClass();
        String string = getContext().getString(R.string.user_stride_measured_distance);
        string.getClass();
        return string;
    }
}
