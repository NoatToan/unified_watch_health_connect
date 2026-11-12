package com.huami.phn.coach.ui.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.phn.coach.R;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.ui.dialog.DeviceDisconnectedDialog;
import com.huami.phn.core.source.LocalKeeper;
import com.huami.phn.util.WebHelper;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/phn/coach/ui/dialog/DeviceDisconnectedDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "", "c", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "", "tag", "showAllowingStateLoss", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceDisconnectedDialog extends AppCompatDialogFragment {
    private final void c() {
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 19) {
                attributes.flags |= 67108864;
            }
            window.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null) {
            return;
        }
        dialog2.setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DeviceDisconnectedDialog deviceDisconnectedDialog, View view) {
        LocalKeeper localKeeper = (LocalKeeper) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(LocalKeeper.class), null, null);
        if (!(localKeeper.getPHNSupportDeviceUrl().length() > 0)) {
            Toast.makeText(deviceDisconnectedDialog.getContext(), "phn-support-device-url is null", 1).show();
        } else {
            HMLog.i("TAG", "start phn support device url", new Object[0]);
            WebHelper.launch(localKeeper.getPHNSupportDeviceUrl(), true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DeviceDisconnectedDialog deviceDisconnectedDialog, View view) {
        deviceDisconnectedDialog.dismiss();
    }

    private final void initView(View view) {
        TextView textView = (TextView) view.findViewById(R.id.tv_content_link);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_confirm);
        textView.setOnClickListener(new View.OnClickListener() { // from class: r71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceDisconnectedDialog.d(this.a, view2);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: q71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceDisconnectedDialog.e(this.a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.phn_dialog_device_disconnected, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c();
        initView(view);
    }

    public final void showAllowingStateLoss(@NotNull FragmentManager manager, @Nullable String tag) {
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, false);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(this, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (isAdded() || manager.findFragmentByTag(tag) != null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, tag);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
