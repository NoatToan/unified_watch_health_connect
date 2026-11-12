package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityLongSitAlertBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile dndEnd;

    @NonNull
    public final ListTile dndStart;

    @NonNull
    public final ListTile enableSwitch;

    @NonNull
    public final ListTile longSitAlertStartLayout;

    @NonNull
    public final ListTile longSitAlertStopLayout;

    @NonNull
    public final ListTile longSitNoAlertLayout;

    @NonNull
    public final ListTile vibrateModeIv;

    private ActivityLongSitAlertBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull ListTile listTile7) {
        this.a = linearLayout;
        this.dndEnd = listTile;
        this.dndStart = listTile2;
        this.enableSwitch = listTile3;
        this.longSitAlertStartLayout = listTile4;
        this.longSitAlertStopLayout = listTile5;
        this.longSitNoAlertLayout = listTile6;
        this.vibrateModeIv = listTile7;
    }

    @NonNull
    public static ActivityLongSitAlertBinding bind(@NonNull View view) {
        int i = R.id.dnd_end;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.dnd_start;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.enable_switch;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile3 != null) {
                    i = R.id.long_sit_alert_start_layout;
                    ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile4 != null) {
                        i = R.id.long_sit_alert_stop_layout;
                        ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile5 != null) {
                            i = R.id.long_sit_no_alert_layout;
                            ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile6 != null) {
                                i = R.id.vibrate_mode_iv;
                                ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile7 != null) {
                                    return new ActivityLongSitAlertBinding((LinearLayout) view, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityLongSitAlertBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLongSitAlertBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_long_sit_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
