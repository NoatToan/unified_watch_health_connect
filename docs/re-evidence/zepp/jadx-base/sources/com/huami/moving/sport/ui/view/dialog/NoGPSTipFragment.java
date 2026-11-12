package com.huami.moving.sport.ui.view.dialog;

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
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.dialog.NoGPSTipFragment;
import com.huami.moving.ui.utils.SportFunctionUtil;
import java.lang.reflect.Field;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/moving/sport/ui/view/dialog/NoGPSTipFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "c", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onActivityCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "", "tag", "showAllowingStateLoss", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "mTitleTV", "mMessageTV", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class NoGPSTipFragment extends AppCompatDialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private TextView mTitleTV;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView mMessageTV;

    private final void b() {
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

    private final void c() {
        this.mTitleTV.setText(getString(SportFunctionUtil.isKoreaNoGps ? R.string.sport_detail_alert_title : R.string.moving_ui_no_gps_dialog_title));
        this.mMessageTV.setText(getString(SportFunctionUtil.isKoreaNoGps ? R.string.sport_detail_alert_msg : R.string.moving_ui_no_gps_dialog_content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(NoGPSTipFragment noGPSTipFragment, View view) {
        noGPSTipFragment.dismiss();
    }

    private final void initView(View view) {
        this.mTitleTV = (TextView) view.findViewById(R.id.tv_title);
        this.mMessageTV = (TextView) view.findViewById(R.id.tv_content);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_confirm))).setOnClickListener(new View.OnClickListener() { // from class: nf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NoGPSTipFragment.d(this.a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.moving_ui_no_gps_tip, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
        initView(view);
        c();
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
