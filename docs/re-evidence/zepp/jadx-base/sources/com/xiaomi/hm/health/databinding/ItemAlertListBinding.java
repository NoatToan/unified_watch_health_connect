package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemAlertListBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView alertListItemLogo;

    @NonNull
    public final ImageView alertListItemMore;

    @NonNull
    public final TextView alertListItemStatus;

    @NonNull
    public final TextView alertListItemSummary;

    @NonNull
    public final TextView alertListItemText;

    private ItemAlertListBinding(@NonNull RelativeLayout rootView, @NonNull ImageView alertListItemLogo, @NonNull ImageView alertListItemMore, @NonNull TextView alertListItemStatus, @NonNull TextView alertListItemSummary, @NonNull TextView alertListItemText) {
        this.a = rootView;
        this.alertListItemLogo = alertListItemLogo;
        this.alertListItemMore = alertListItemMore;
        this.alertListItemStatus = alertListItemStatus;
        this.alertListItemSummary = alertListItemSummary;
        this.alertListItemText = alertListItemText;
    }

    @NonNull
    public static ItemAlertListBinding bind(@NonNull View rootView) {
        int i = R.id.alert_list_item_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.alert_list_item_logo);
        if (imageView != null) {
            i = R.id.alert_list_item_more;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.alert_list_item_more);
            if (imageView2 != null) {
                i = R.id.alert_list_item_status;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.alert_list_item_status);
                if (textView != null) {
                    i = R.id.alert_list_item_summary;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alert_list_item_summary);
                    if (textView2 != null) {
                        i = R.id.alert_list_item_text;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.alert_list_item_text);
                        if (textView3 != null) {
                            return new ItemAlertListBinding((RelativeLayout) rootView, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAlertListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAlertListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_alert_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
