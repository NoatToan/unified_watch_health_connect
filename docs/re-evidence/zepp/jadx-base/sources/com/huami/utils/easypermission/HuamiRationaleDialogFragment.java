package com.huami.utils.easypermission;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.huami.utils.easypermission.helper.PermissionHelper;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;

/* JADX INFO: loaded from: classes15.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class HuamiRationaleDialogFragment extends DialogFragment {
    public static final String TAG = "HuamiRationaleDialogFragment";
    private EasyPermissions.RationaleCallbacks a;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(e eVar, View view) {
        startActivity(new Intent(getActivity(), (Class<?>) PermissionManagerActivity.class));
        EasyPermissions.RationaleCallbacks rationaleCallbacks = this.a;
        if (rationaleCallbacks != null) {
            rationaleCallbacks.onRationaleDenied(eVar.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(e eVar, View view) {
        dismissAllowingStateLoss();
        EasyPermissions.RationaleCallbacks rationaleCallbacks = this.a;
        if (rationaleCallbacks != null) {
            rationaleCallbacks.onRationaleAccepted(eVar.e);
            e();
        }
    }

    private void e() {
        String str;
        e eVar = new e(getArguments());
        if (eVar.f && (str = eVar.d) != null) {
            PermissionRationaleSpHelper.saveShowTime(str, System.currentTimeMillis());
        }
        PermissionHelper.newInstance(getActivity()).directRequestPermissions(eVar.e, eVar.h);
    }

    public static HuamiRationaleDialogFragment newInstance(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, String str4, int i2, boolean z, @NonNull String[] strArr) {
        HuamiRationaleDialogFragment huamiRationaleDialogFragment = new HuamiRationaleDialogFragment();
        huamiRationaleDialogFragment.setArguments(new e(str, str2, str3, i, str4, i2, z, strArr).c());
        huamiRationaleDialogFragment.setStyle(1, R.style.EasyPermissionsDialog);
        return huamiRationaleDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null && (getParentFragment() instanceof EasyPermissions.RationaleCallbacks)) {
            this.a = (EasyPermissions.RationaleCallbacks) getParentFragment();
        }
        if (context instanceof EasyPermissions.RationaleCallbacks) {
            this.a = (EasyPermissions.RationaleCallbacks) context;
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        View viewInflate = layoutInflater.inflate(R.layout.easypermission_layout_rationale_dialog, viewGroup);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_message);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.btn_text_link);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_positive);
        final e eVar = new e(getArguments());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.huami.utils.easypermission.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(eVar, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.huami.utils.easypermission.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(eVar, view);
            }
        });
        textView.setText(eVar.g);
        if (!eVar.g.contains("\n")) {
            textView.setGravity(17);
        }
        return viewInflate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.a = null;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.b = true;
        super.onSaveInstanceState(bundle);
    }

    public void showAllowingStateLoss(FragmentManager fragmentManager, String str) {
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !this.b) {
            show(fragmentManager, str);
        }
    }
}
