package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.http.serverfault.widget.ServerFaultView;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivitySettingBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final ListTile about;

    @NonNull
    public final ListTile accountBind;

    @NonNull
    public final ListTile cache;

    @NonNull
    public final AppCompatTextView currentLoginInfoText;

    @NonNull
    public final ListTile developer;

    @NonNull
    public final ListTile lab;

    @NonNull
    public final Button logout;

    @NonNull
    public final ListTile nightSettingMode;

    @NonNull
    public final ListTile notify;

    @NonNull
    public final ListTile permission;

    @NonNull
    public final ListTile revoke;

    @NonNull
    public final ServerFaultView serverFaultView;

    @NonNull
    public final ListTile unit;

    @NonNull
    public final ListTile update;

    private ActivitySettingBinding(@NonNull ScrollView rootView, @NonNull ListTile about, @NonNull ListTile accountBind, @NonNull ListTile cache, @NonNull AppCompatTextView currentLoginInfoText, @NonNull ListTile developer, @NonNull ListTile lab, @NonNull Button logout, @NonNull ListTile nightSettingMode, @NonNull ListTile notify, @NonNull ListTile permission, @NonNull ListTile revoke, @NonNull ServerFaultView serverFaultView, @NonNull ListTile unit, @NonNull ListTile update) {
        this.a = rootView;
        this.about = about;
        this.accountBind = accountBind;
        this.cache = cache;
        this.currentLoginInfoText = currentLoginInfoText;
        this.developer = developer;
        this.lab = lab;
        this.logout = logout;
        this.nightSettingMode = nightSettingMode;
        this.notify = notify;
        this.permission = permission;
        this.revoke = revoke;
        this.serverFaultView = serverFaultView;
        this.unit = unit;
        this.update = update;
    }

    @NonNull
    public static ActivitySettingBinding bind(@NonNull View rootView) {
        int i = R.id.about;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.about);
        if (listTile != null) {
            i = R.id.account_bind;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.account_bind);
            if (listTile2 != null) {
                i = R.id.cache;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.cache);
                if (listTile3 != null) {
                    i = R.id.current_login_info_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.current_login_info_text);
                    if (appCompatTextView != null) {
                        i = R.id.developer;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.developer);
                        if (listTile4 != null) {
                            i = R.id.lab;
                            ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.lab);
                            if (listTile5 != null) {
                                i = R.id.logout;
                                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.logout);
                                if (button != null) {
                                    i = R.id.night_setting_mode;
                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.night_setting_mode);
                                    if (listTile6 != null) {
                                        i = R.id.notify;
                                        ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.notify);
                                        if (listTile7 != null) {
                                            i = R.id.permission;
                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.permission);
                                            if (listTile8 != null) {
                                                i = R.id.revoke;
                                                ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.revoke);
                                                if (listTile9 != null) {
                                                    i = R.id.server_fault_view;
                                                    ServerFaultView serverFaultView = (ServerFaultView) ViewBindings.findChildViewById(rootView, R.id.server_fault_view);
                                                    if (serverFaultView != null) {
                                                        i = R.id.unit;
                                                        ListTile listTile10 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.unit);
                                                        if (listTile10 != null) {
                                                            i = R.id.update;
                                                            ListTile listTile11 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.update);
                                                            if (listTile11 != null) {
                                                                return new ActivitySettingBinding((ScrollView) rootView, listTile, listTile2, listTile3, appCompatTextView, listTile4, listTile5, button, listTile6, listTile7, listTile8, listTile9, serverFaultView, listTile10, listTile11);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_setting, parent, false);
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
