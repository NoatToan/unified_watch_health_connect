package com.xiaomi.hm.health.device.setting.find;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.databinding.DialogFindDeviceAnimateBinding;
import com.xiaomi.hm.health.device.setting.find.FindDeviceAnimateDialog;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002 !B\u0011\b\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00060\u001bR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "lastTimeInMill", "", "g", "Landroid/view/View;", "initView", "Landroidx/fragment/app/FragmentManager;", "manager", "show", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "hasPadding", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$Builder;", "e", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$Builder;", "getBuilder", "()Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$Builder;", "builder", "Lcom/huami/devicex/databinding/DialogFindDeviceAnimateBinding;", "f", "Lcom/huami/devicex/databinding/DialogFindDeviceAnimateBinding;", "binding", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$AutoDismissTask;", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$AutoDismissTask;", "autoDismissTask", "<init>", "(Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$Builder;)V", "AutoDismissTask", ShareStoryContent.Builder.k, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceAnimateDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Builder builder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private DialogFindDeviceAnimateBinding binding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final AutoDismissTask autoDismissTask;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$AutoDismissTask;", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "onFinish", "<init>", "(Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class AutoDismissTask extends CountDownTimer {
        public AutoDismissTask() {
            super(FindDeviceAnimateDialog.this.getBuilder().getDurationInMill(), 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            FindDeviceAnimateDialog.this.dismissAllowingStateLoss();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            FindDeviceAnimateDialog.this.g(millisUntilFinished);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR$\u00102\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog$Builder;", "", "", "path", "animationPath", "", "count", "repeatCount", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "cancelListener", "str", "tip", "", "duration", "durationInMill", "resId", "tipRes", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceAnimateDialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Ljava/lang/String;", "getAnimationPath$devicex_zeppRelease", "()Ljava/lang/String;", "setAnimationPath$devicex_zeppRelease", "(Ljava/lang/String;)V", "b", LogUtil.I, "getAnimRepeatCount$devicex_zeppRelease", "()I", "setAnimRepeatCount$devicex_zeppRelease", "(I)V", "animRepeatCount", "c", "Landroid/view/View$OnClickListener;", "getCancelListener$devicex_zeppRelease", "()Landroid/view/View$OnClickListener;", "setCancelListener$devicex_zeppRelease", "(Landroid/view/View$OnClickListener;)V", GoogleApiAvailabilityLight.a, "getTip$devicex_zeppRelease", "setTip$devicex_zeppRelease", "e", "Ljava/lang/Integer;", "getTipResId$devicex_zeppRelease", "()Ljava/lang/Integer;", "setTipResId$devicex_zeppRelease", "(Ljava/lang/Integer;)V", "tipResId", "f", "J", "getDurationInMill$devicex_zeppRelease", "()J", "setDurationInMill$devicex_zeppRelease", "(J)V", "g", "Landroid/content/DialogInterface$OnDismissListener;", "getDismissListener$devicex_zeppRelease", "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener$devicex_zeppRelease", "(Landroid/content/DialogInterface$OnDismissListener;)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private String animationPath;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private View.OnClickListener cancelListener;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private String tip;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private Integer tipResId;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private DialogInterface.OnDismissListener dismissListener;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int animRepeatCount = -1;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private long durationInMill = 60000;

        @NotNull
        public final Builder animationPath(@NotNull String path) {
            setAnimationPath$devicex_zeppRelease(path);
            return this;
        }

        @NotNull
        public final FindDeviceAnimateDialog build() {
            return new FindDeviceAnimateDialog(this, null);
        }

        @NotNull
        public final Builder cancelListener(@NotNull View.OnClickListener listener) {
            setCancelListener$devicex_zeppRelease(listener);
            return this;
        }

        @NotNull
        public final Builder dismissListener(@NotNull DialogInterface.OnDismissListener listener) {
            setDismissListener$devicex_zeppRelease(listener);
            return this;
        }

        @NotNull
        public final Builder durationInMill(long duration) {
            setDurationInMill$devicex_zeppRelease(duration);
            return this;
        }

        /* JADX INFO: renamed from: getAnimRepeatCount$devicex_zeppRelease, reason: from getter */
        public final int getAnimRepeatCount() {
            return this.animRepeatCount;
        }

        @Nullable
        /* JADX INFO: renamed from: getAnimationPath$devicex_zeppRelease, reason: from getter */
        public final String getAnimationPath() {
            return this.animationPath;
        }

        @Nullable
        /* JADX INFO: renamed from: getCancelListener$devicex_zeppRelease, reason: from getter */
        public final View.OnClickListener getCancelListener() {
            return this.cancelListener;
        }

        @Nullable
        /* JADX INFO: renamed from: getDismissListener$devicex_zeppRelease, reason: from getter */
        public final DialogInterface.OnDismissListener getDismissListener() {
            return this.dismissListener;
        }

        /* JADX INFO: renamed from: getDurationInMill$devicex_zeppRelease, reason: from getter */
        public final long getDurationInMill() {
            return this.durationInMill;
        }

        @Nullable
        /* JADX INFO: renamed from: getTip$devicex_zeppRelease, reason: from getter */
        public final String getTip() {
            return this.tip;
        }

        @Nullable
        /* JADX INFO: renamed from: getTipResId$devicex_zeppRelease, reason: from getter */
        public final Integer getTipResId() {
            return this.tipResId;
        }

        @NotNull
        public final Builder repeatCount(int count) {
            setAnimRepeatCount$devicex_zeppRelease(count);
            return this;
        }

        public final void setAnimRepeatCount$devicex_zeppRelease(int i) {
            this.animRepeatCount = i;
        }

        public final void setAnimationPath$devicex_zeppRelease(@Nullable String str) {
            this.animationPath = str;
        }

        public final void setCancelListener$devicex_zeppRelease(@Nullable View.OnClickListener onClickListener) {
            this.cancelListener = onClickListener;
        }

        public final void setDismissListener$devicex_zeppRelease(@Nullable DialogInterface.OnDismissListener onDismissListener) {
            this.dismissListener = onDismissListener;
        }

        public final void setDurationInMill$devicex_zeppRelease(long j) {
            this.durationInMill = j;
        }

        public final void setTip$devicex_zeppRelease(@Nullable String str) {
            this.tip = str;
        }

        public final void setTipResId$devicex_zeppRelease(@Nullable Integer num) {
            this.tipResId = num;
        }

        @NotNull
        public final Builder tip(@NotNull String str) {
            setTip$devicex_zeppRelease(str);
            return this;
        }

        @NotNull
        public final Builder tipRes(@StringRes int resId) {
            setTipResId$devicex_zeppRelease(Integer.valueOf(resId));
            return this;
        }
    }

    private FindDeviceAnimateDialog(Builder builder) {
        this.builder = builder;
        this.autoDismissTask = new AutoDismissTask();
    }

    public /* synthetic */ FindDeviceAnimateDialog(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FindDeviceAnimateDialog findDeviceAnimateDialog, View view) {
        findDeviceAnimateDialog.dismissAllowingStateLoss();
        View.OnClickListener cancelListener = findDeviceAnimateDialog.getBuilder().getCancelListener();
        if (cancelListener == null) {
            return;
        }
        cancelListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(FindDeviceAnimateDialog findDeviceAnimateDialog, DialogInterface dialogInterface) {
        findDeviceAnimateDialog.autoDismissTask.cancel();
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding = findDeviceAnimateDialog.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding);
        dialogFindDeviceAnimateBinding.animIv.cancelAnimation();
        DialogInterface.OnDismissListener dismissListener = findDeviceAnimateDialog.getBuilder().getDismissListener();
        if (dismissListener == null) {
            return;
        }
        dismissListener.onDismiss(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(long lastTimeInMill) {
        Resources resources;
        int iRoundToInt = c.roundToInt(lastTimeInMill / 1000.0d);
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding = this.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding);
        TextView textView = dialogFindDeviceAnimateBinding.cancelTv;
        Context context = getContext();
        String quantityString = null;
        if (context != null && (resources = context.getResources()) != null) {
            quantityString = resources.getQuantityString(R.plurals.find_device_counter, iRoundToInt, Integer.valueOf(iRoundToInt));
        }
        textView.setText(quantityString);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final Builder getBuilder() {
        return this.builder;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        this.binding = DialogFindDeviceAnimateBinding.inflate(getLayoutInflater());
        setGravity(17);
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding = this.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding);
        return dialogFindDeviceAnimateBinding.getRoot();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);
        Integer tipResId = this.builder.getTipResId();
        if (tipResId != null) {
            int iIntValue = tipResId.intValue();
            DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding = this.binding;
            Objects.requireNonNull(dialogFindDeviceAnimateBinding);
            dialogFindDeviceAnimateBinding.tipTv.setText(iIntValue);
        }
        String tip = this.builder.getTip();
        if (tip != null) {
            DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding2 = this.binding;
            Objects.requireNonNull(dialogFindDeviceAnimateBinding2);
            dialogFindDeviceAnimateBinding2.tipTv.setText(tip);
        }
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding3 = this.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding3);
        dialogFindDeviceAnimateBinding3.animIv.setAnimation(this.builder.getAnimationPath());
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding4 = this.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding4);
        dialogFindDeviceAnimateBinding4.animIv.setRepeatCount(this.builder.getAnimRepeatCount());
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding5 = this.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding5);
        dialogFindDeviceAnimateBinding5.cancelTv.setOnClickListener(new View.OnClickListener() { // from class: t62
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FindDeviceAnimateDialog.e(this.a, view2);
            }
        });
        g(this.builder.getDurationInMill());
        DialogFindDeviceAnimateBinding dialogFindDeviceAnimateBinding6 = this.binding;
        Objects.requireNonNull(dialogFindDeviceAnimateBinding6);
        dialogFindDeviceAnimateBinding6.animIv.playAnimation();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: s62
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FindDeviceAnimateDialog.f(this.a, dialogInterface);
            }
        });
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public void show(@Nullable FragmentManager manager) {
        super.show(manager);
        this.autoDismissTask.cancel();
        this.autoDismissTask.start();
    }
}
