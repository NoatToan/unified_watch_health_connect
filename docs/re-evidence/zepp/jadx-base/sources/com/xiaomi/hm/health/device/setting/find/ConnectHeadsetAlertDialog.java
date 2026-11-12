package com.xiaomi.hm.health.device.setting.find;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.databinding.DialogConnectHeadsetAlertBinding;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.find.ConnectHeadsetAlertDialog;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001a\u0010%\u001a\u00060#R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "lastTimeInMill", "", "i", "Landroid/view/View;", "initView", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setConfirmListener", "setCancelListener", "Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "", "hasPadding", "Landroidx/fragment/app/FragmentManager;", "manager", "show", "Lcom/huami/devicex/databinding/DialogConnectHeadsetAlertBinding;", "e", "Lcom/huami/devicex/databinding/DialogConnectHeadsetAlertBinding;", "binding", "f", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "g", "Landroid/view/View$OnClickListener;", "cancelListener", "h", "confirmListener", "Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog$AutoDismissTask;", "Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog$AutoDismissTask;", "autoDismissTask", "<init>", "()V", z.j, "AutoDismissTask", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ConnectHeadsetAlertDialog extends BaseDialogFragment {

    @NotNull
    private static final a j = new a(null);

    @Deprecated
    private static final long k = 60000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private DialogConnectHeadsetAlertBinding binding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private DialogInterface.OnDismissListener dismissListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener cancelListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener confirmListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AutoDismissTask autoDismissTask = new AutoDismissTask();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog$AutoDismissTask;", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "onFinish", "<init>", "(Lcom/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class AutoDismissTask extends CountDownTimer {
        public AutoDismissTask() {
            super(60000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ConnectHeadsetAlertDialog.this.dismissAllowingStateLoss();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            ConnectHeadsetAlertDialog.this.i(millisUntilFinished);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/setting/find/ConnectHeadsetAlertDialog$a", "", "", "MINUTE", "J", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ConnectHeadsetAlertDialog connectHeadsetAlertDialog, DialogInterface dialogInterface) {
        connectHeadsetAlertDialog.autoDismissTask.cancel();
        DialogInterface.OnDismissListener onDismissListener = connectHeadsetAlertDialog.dismissListener;
        if (onDismissListener == null) {
            return;
        }
        onDismissListener.onDismiss(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ConnectHeadsetAlertDialog connectHeadsetAlertDialog, View view) {
        connectHeadsetAlertDialog.dismissAllowingStateLoss();
        View.OnClickListener onClickListener = connectHeadsetAlertDialog.cancelListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ConnectHeadsetAlertDialog connectHeadsetAlertDialog, View view) {
        connectHeadsetAlertDialog.dismissAllowingStateLoss();
        View.OnClickListener onClickListener = connectHeadsetAlertDialog.confirmListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long lastTimeInMill) {
        Resources resources;
        int iRoundToInt = c.roundToInt(lastTimeInMill / 1000.0d);
        DialogConnectHeadsetAlertBinding dialogConnectHeadsetAlertBinding = this.binding;
        Objects.requireNonNull(dialogConnectHeadsetAlertBinding);
        TextView textView = dialogConnectHeadsetAlertBinding.dialogNegativeButton;
        Context context = getContext();
        String quantityString = null;
        if (context != null && (resources = context.getResources()) != null) {
            quantityString = resources.getQuantityString(R.plurals.find_device_counter, iRoundToInt, Integer.valueOf(iRoundToInt));
        }
        textView.setText(quantityString);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        this.binding = DialogConnectHeadsetAlertBinding.inflate(getLayoutInflater());
        setGravity(17);
        DialogConnectHeadsetAlertBinding dialogConnectHeadsetAlertBinding = this.binding;
        Objects.requireNonNull(dialogConnectHeadsetAlertBinding);
        return dialogConnectHeadsetAlertBinding.getRoot();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: zy0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ConnectHeadsetAlertDialog.f(this.a, dialogInterface);
            }
        });
        DialogConnectHeadsetAlertBinding dialogConnectHeadsetAlertBinding = this.binding;
        Objects.requireNonNull(dialogConnectHeadsetAlertBinding);
        dialogConnectHeadsetAlertBinding.dialogNegativeButton.setOnClickListener(new View.OnClickListener() { // from class: bz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectHeadsetAlertDialog.g(this.a, view2);
            }
        });
        DialogConnectHeadsetAlertBinding dialogConnectHeadsetAlertBinding2 = this.binding;
        Objects.requireNonNull(dialogConnectHeadsetAlertBinding2);
        dialogConnectHeadsetAlertBinding2.dialogPositiveButton.setOnClickListener(new View.OnClickListener() { // from class: az0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConnectHeadsetAlertDialog.h(this.a, view2);
            }
        });
    }

    @NotNull
    public final ConnectHeadsetAlertDialog setCancelListener(@NotNull View.OnClickListener listener) {
        this.cancelListener = listener;
        return this;
    }

    @NotNull
    public final ConnectHeadsetAlertDialog setConfirmListener(@NotNull View.OnClickListener listener) {
        this.confirmListener = listener;
        return this;
    }

    @NotNull
    public final ConnectHeadsetAlertDialog setDismissListener(@NotNull DialogInterface.OnDismissListener listener) {
        this.dismissListener = listener;
        return this;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public void show(@Nullable FragmentManager manager) {
        super.show(manager);
        this.autoDismissTask.cancel();
        this.autoDismissTask.start();
    }
}
