package com.huami.moving.ui.view.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.R;
import com.huami.moving.ui.view.dialog.SportVideoShareDialog;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u0003234B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog;", "Landroidx/fragment/app/DialogFragment;", "", "c", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", GoogleApiAvailabilityLight.a, "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "a", "Landroid/view/View;", "mRootView", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "mTitleTV", "mMessageTV", "mCancelTV", "e", "mConfirmTV", "f", "mDivideV", "", "g", "Ljava/lang/CharSequence;", "mTitle", "h", "mMessage", "i", "mCancel", z.j, "mConfirm", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnCancelListener;", hl.k, "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnCancelListener;", "mCancelListener", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnConfirmListener;", "l", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnConfirmListener;", "mConfirmListener", "<init>", "()V", "Companion", "OnCancelListener", "OnConfirmListener", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportVideoShareDialog extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private View mRootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private TextView mTitleTV;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView mMessageTV;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView mCancelTV;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView mConfirmTV;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private View mDivideV;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private CharSequence mTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private CharSequence mMessage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private CharSequence mCancel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private CharSequence mConfirm;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private OnCancelListener mCancelListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private OnConfirmListener mConfirmListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$Companion;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "title", "message", g.g, "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnCancelListener;", "cancelListener", "confirm", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnConfirmListener;", "confirmListener", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog;", "show", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportVideoShareDialog show(@NotNull AppCompatActivity activity, @Nullable CharSequence title, @Nullable CharSequence message, @Nullable CharSequence cancel, @Nullable OnCancelListener cancelListener, @Nullable CharSequence confirm, @Nullable OnConfirmListener confirmListener) {
            SportVideoShareDialog sportVideoShareDialog = new SportVideoShareDialog();
            sportVideoShareDialog.mTitle = title;
            sportVideoShareDialog.mMessage = message;
            sportVideoShareDialog.mCancel = cancel;
            sportVideoShareDialog.mCancelListener = cancelListener;
            sportVideoShareDialog.mConfirm = confirm;
            sportVideoShareDialog.mConfirmListener = confirmListener;
            sportVideoShareDialog.show(activity.getSupportFragmentManager(), "");
            return sportVideoShareDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnCancelListener;", "", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog;", "dialogVideoShare", "", "onCancel", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface OnCancelListener {
        void onCancel(@Nullable SportVideoShareDialog dialogVideoShare);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog$OnConfirmListener;", "", "Lcom/huami/moving/ui/view/dialog/SportVideoShareDialog;", "dialogVideoShare", "", "onConfirm", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface OnConfirmListener {
        void onConfirm(@Nullable SportVideoShareDialog dialogVideoShare);
    }

    private final void c() {
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
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

    private final void d() {
        this.mCancelTV.setOnClickListener(new View.OnClickListener() { // from class: ie7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportVideoShareDialog.e(this.a, view);
            }
        });
        this.mConfirmTV.setOnClickListener(new View.OnClickListener() { // from class: he7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportVideoShareDialog.f(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SportVideoShareDialog sportVideoShareDialog, View view) {
        OnCancelListener onCancelListener = sportVideoShareDialog.mCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(sportVideoShareDialog);
        }
        sportVideoShareDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SportVideoShareDialog sportVideoShareDialog, View view) {
        OnConfirmListener onConfirmListener = sportVideoShareDialog.mConfirmListener;
        if (onConfirmListener != null) {
            onConfirmListener.onConfirm(sportVideoShareDialog);
        }
        sportVideoShareDialog.dismiss();
    }

    private final void initData() {
        this.mTitleTV.setText(this.mTitle);
        this.mMessageTV.setText(this.mMessage);
        if (TextUtils.isEmpty(this.mCancel)) {
            this.mCancelTV.setVisibility(8);
            this.mDivideV.setVisibility(8);
        } else {
            this.mCancelTV.setText(this.mCancel);
        }
        if (!TextUtils.isEmpty(this.mConfirm)) {
            this.mConfirmTV.setText(this.mConfirm);
        } else {
            this.mConfirmTV.setVisibility(8);
            this.mDivideV.setVisibility(8);
        }
    }

    private final void initView(View view) {
        this.mRootView = view;
        this.mTitleTV = (TextView) view.findViewById(R.id.tv_title);
        this.mMessageTV = (TextView) view.findViewById(R.id.tv_message);
        this.mCancelTV = (TextView) view.findViewById(R.id.tv_cancel);
        this.mConfirmTV = (TextView) view.findViewById(R.id.tv_confirm);
        this.mDivideV = view.findViewById(R.id.v_divide);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @androidx.annotation.Nullable @Nullable ViewGroup container, @androidx.annotation.Nullable @Nullable Bundle savedInstanceState) {
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.requestFeature(1);
        }
        return inflater.inflate(R.layout.dialog_sport_video_share, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @androidx.annotation.Nullable @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        c();
        initView(view);
        d();
        initData();
    }
}
