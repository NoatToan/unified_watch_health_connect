package com.huami.utils.easypermission;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;
import com.huami.utils.easypermission.utils.FastClickUtils;

/* JADX INFO: loaded from: classes15.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class PermissionDialogFragmentCompat extends AppCompatDialogFragment implements View.OnClickListener {
    public static final int APP_SETTINGS_RC = 7534;
    public static final String TAG = "PermissionDialogFragmentCompat";
    private b a;

    public static class b {
        public String a;
        public View.OnClickListener b;
        public CharSequence c;
        public View.OnClickListener d;
        public CharSequence e;
        public View.OnClickListener f;
        public CharSequence g;
        public String h;

        private b() {
        }
    }

    private void b() {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, getActivity().getPackageName(), null));
        data.addFlags(536870912);
        startActivityForResult(data, APP_SETTINGS_RC);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        if (view.getId() == R.id.btn_text_link) {
            if (FastClickUtils.isFastClick()) {
                return;
            }
            startActivity(new Intent(getActivity(), (Class<?>) PermissionManagerActivity.class));
            b bVar = this.a;
            if (bVar == null || (onClickListener2 = bVar.f) == null) {
                return;
            }
            onClickListener2.onClick(view);
            return;
        }
        if (view.getId() == R.id.btn_positive) {
            if (FastClickUtils.isFastClick()) {
                return;
            }
            dismissAllowingStateLoss();
            b bVar2 = this.a;
            if (bVar2 == null || (onClickListener = bVar2.b) == null) {
                b();
                return;
            } else {
                onClickListener.onClick(view);
                return;
            }
        }
        if (view.getId() != R.id.btn_negative || FastClickUtils.isFastClick()) {
            return;
        }
        dismissAllowingStateLoss();
        b bVar3 = this.a;
        if (bVar3 != null) {
            View.OnClickListener onClickListener3 = bVar3.d;
            if (onClickListener3 != null) {
                onClickListener3.onClick(view);
            }
            String str = this.a.h;
            if (str != null) {
                PermissionRationaleSpHelper.saveShowTime(str, System.currentTimeMillis());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        View viewInflate = layoutInflater.inflate(R.layout.easypermission_layout_permission_dialog, viewGroup);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_message);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.btn_text_link);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_positive);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.btn_negative);
        b bVar = this.a;
        if (bVar != null) {
            if (TextUtils.isEmpty(bVar.g)) {
                this.a.g = getString(R.string.easypermission_permission_link_detail);
            }
            if (TextUtils.isEmpty(this.a.e)) {
                this.a.e = getString(R.string.easypermission_permission_dialog_cancel);
            }
            if (TextUtils.isEmpty(this.a.c)) {
                this.a.c = getString(R.string.easypermission_permission_go_to_setting);
            }
            textView.setText(this.a.a);
            if (!this.a.a.contains("\n")) {
                textView.setGravity(17);
                textView2.setGravity(17);
            }
            textView2.setText(this.a.g);
            textView3.setText(this.a.c);
            textView4.setText(this.a.e);
            textView2.setOnClickListener(this);
            textView3.setOnClickListener(this);
            textView4.setOnClickListener(this);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        dismissAllowingStateLoss();
    }

    public void setParam(b bVar) {
        this.a = bVar;
    }

    public void showAllowingStateLoss(FragmentManager fragmentManager, String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        show(fragmentManager, str);
    }

    public static class Builder {
        private final b a = new b();

        public PermissionDialogFragmentCompat create() {
            PermissionDialogFragmentCompat permissionDialogFragmentCompat = new PermissionDialogFragmentCompat();
            permissionDialogFragmentCompat.setParam(this.a);
            permissionDialogFragmentCompat.setStyle(1, R.style.EasyPermissionsDialog);
            return permissionDialogFragmentCompat;
        }

        public Builder setMessage(String str) {
            this.a.a = str;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            b bVar = this.a;
            bVar.e = charSequence;
            bVar.d = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            b bVar = this.a;
            bVar.c = charSequence;
            bVar.b = onClickListener;
            return this;
        }

        public Builder setRequestKey(@Nullable String str) {
            this.a.h = str;
            return this;
        }

        public Builder setTextLinkButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            b bVar = this.a;
            bVar.g = charSequence;
            bVar.f = onClickListener;
            return this;
        }

        public Builder setTextLinkButton(View.OnClickListener onClickListener) {
            this.a.f = onClickListener;
            return this;
        }
    }
}
