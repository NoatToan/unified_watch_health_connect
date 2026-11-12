package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityAboutBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final ImageView aboutAppIcon;

    @NonNull
    public final ListTile algoVersion;

    @NonNull
    public final TextView appName;

    @NonNull
    public final ListTile appVersion;

    @NonNull
    public final RelativeLayout iconLayout;

    @NonNull
    public final ListTile itemEdm;

    @NonNull
    public final ListTile userDataSecurityAndPrivacy;

    private ActivityAboutBinding(@NonNull ScrollView rootView, @NonNull ImageView aboutAppIcon, @NonNull ListTile algoVersion, @NonNull TextView appName, @NonNull ListTile appVersion, @NonNull RelativeLayout iconLayout, @NonNull ListTile itemEdm, @NonNull ListTile userDataSecurityAndPrivacy) {
        this.a = rootView;
        this.aboutAppIcon = aboutAppIcon;
        this.algoVersion = algoVersion;
        this.appName = appName;
        this.appVersion = appVersion;
        this.iconLayout = iconLayout;
        this.itemEdm = itemEdm;
        this.userDataSecurityAndPrivacy = userDataSecurityAndPrivacy;
    }

    @NonNull
    public static ActivityAboutBinding bind(@NonNull View rootView) {
        int i = R.id.about_app_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.about_app_icon);
        if (imageView != null) {
            i = R.id.algo_version;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.algo_version);
            if (listTile != null) {
                i = R.id.app_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.app_name);
                if (textView != null) {
                    i = R.id.app_version;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.app_version);
                    if (listTile2 != null) {
                        i = R.id.icon_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.icon_layout);
                        if (relativeLayout != null) {
                            i = R.id.item_edm;
                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_edm);
                            if (listTile3 != null) {
                                i = R.id.user_data_security_and_privacy;
                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.user_data_security_and_privacy);
                                if (listTile4 != null) {
                                    return new ActivityAboutBinding((ScrollView) rootView, imageView, listTile, textView, listTile2, relativeLayout, listTile3, listTile4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_about, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
