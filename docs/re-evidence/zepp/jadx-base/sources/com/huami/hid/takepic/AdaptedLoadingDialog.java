package com.huami.hid.takepic;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingView;
import com.huami.hid.R;
import com.huami.hid.bluetooth.BluetoothUtil;
import com.huami.hid.takepic.AdaptedLoadingDialog;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J4\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00066"}, d2 = {"Lcom/huami/hid/takepic/AdaptedLoadingDialog;", "", "", "msg", "", z.j, "", "delayTime", "Lcom/huami/hid/takepic/OnAnimEndListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "loadingChanged", "h", "e", "setSuccess$hid_release", "(Ljava/lang/CharSequence;ILcom/huami/hid/takepic/OnAnimEndListener;)V", "setSuccess", "setFailed$hid_release", "setFailed", "dismiss$hid_release", "()V", "dismiss", "show$hid_release", "(Ljava/lang/CharSequence;)V", "show", "a", LogUtil.I, "DEFAULT_DURATION", "Landroid/app/Dialog;", "b", "Landroid/app/Dialog;", "mDialog", "Lcom/huami/android/design/dialog/loading/LoadingView;", "c", "Lcom/huami/android/design/dialog/loading/LoadingView;", "mLoadingView", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "mTvMsg", "mDelayTime", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "mLoadingRunnable", "g", "Lcom/huami/hid/takepic/OnAnimEndListener;", "mAnimListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "cancelable", "<init>", "(Landroid/content/Context;Z)V", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class AdaptedLoadingDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int DEFAULT_DURATION;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Dialog mDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private LoadingView mLoadingView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private TextView mTvMsg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mDelayTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Runnable mLoadingRunnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private OnAnimEndListener mAnimListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("delayTime reset to: ", Integer.valueOf(AdaptedLoadingDialog.this.mDelayTime));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AdaptedLoadingDialog.this.mLoadingView.setFailed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AdaptedLoadingDialog.this.mLoadingView.setSuccess();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "showLoadingDialog";
        }
    }

    public AdaptedLoadingDialog(@NotNull Context context, boolean z) {
        this.DEFAULT_DURATION = 800;
        this.mDialog = new Dialog(context, R.style.LoadingDialog);
        this.mDialog.setContentView(View.inflate(context, R.layout.loading_dialog_layout_dialog, null));
        this.mDialog.setCancelable(z);
        Window window = this.mDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        this.mLoadingView = (LoadingView) this.mDialog.findViewById(R.id.loading);
        TextView textView = (TextView) this.mDialog.findViewById(R.id.message);
        this.mTvMsg = textView;
        textView.setVisibility(0);
        this.mDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: b7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AdaptedLoadingDialog.d(this.a, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AdaptedLoadingDialog adaptedLoadingDialog, DialogInterface dialogInterface) {
        adaptedLoadingDialog.mLoadingView.stopLoading();
    }

    private final void e() {
        HMLog.info(BluetoothUtil.TAG, new a());
        this.mLoadingView.setOnAnimEndListener(new LoadingView.OnAnimEndListener() { // from class: c7
            @Override // com.huami.android.design.dialog.loading.LoadingView.OnAnimEndListener
            public final void onAnimEnd() {
                AdaptedLoadingDialog.f(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final AdaptedLoadingDialog adaptedLoadingDialog) {
        OnAnimEndListener onAnimEndListener = adaptedLoadingDialog.mAnimListener;
        if (onAnimEndListener != null) {
            onAnimEndListener.onAnimEnd(adaptedLoadingDialog);
        }
        Runnable runnable = new Runnable() { // from class: d7
            @Override // java.lang.Runnable
            public final void run() {
                AdaptedLoadingDialog.g(this.a);
            }
        };
        adaptedLoadingDialog.mLoadingRunnable = runnable;
        adaptedLoadingDialog.mLoadingView.postDelayed(runnable, adaptedLoadingDialog.mDelayTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AdaptedLoadingDialog adaptedLoadingDialog) {
        adaptedLoadingDialog.dismiss$hid_release();
        OnAnimEndListener onAnimEndListener = adaptedLoadingDialog.mAnimListener;
        if (onAnimEndListener != null) {
            onAnimEndListener.onDismiss(adaptedLoadingDialog);
        }
        adaptedLoadingDialog.mLoadingView.reset();
    }

    private final void h(CharSequence msg, int delayTime, OnAnimEndListener listener, Function0<Unit> loadingChanged) {
        this.mTvMsg.setText(msg);
        this.mDelayTime = delayTime;
        this.mAnimListener = listener;
        loadingChanged.invoke();
        e();
    }

    public static /* synthetic */ void i(AdaptedLoadingDialog adaptedLoadingDialog, CharSequence charSequence, int i, OnAnimEndListener onAnimEndListener, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = adaptedLoadingDialog.DEFAULT_DURATION;
        }
        if ((i2 & 4) != 0) {
            onAnimEndListener = null;
        }
        adaptedLoadingDialog.h(charSequence, i, onAnimEndListener, function0);
    }

    private final void j(CharSequence msg) {
        this.mTvMsg.setText(msg);
    }

    public static /* synthetic */ void setFailed$hid_release$default(AdaptedLoadingDialog adaptedLoadingDialog, CharSequence charSequence, int i, OnAnimEndListener onAnimEndListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = adaptedLoadingDialog.DEFAULT_DURATION;
        }
        if ((i2 & 4) != 0) {
            onAnimEndListener = null;
        }
        adaptedLoadingDialog.setFailed$hid_release(charSequence, i, onAnimEndListener);
    }

    public static /* synthetic */ void setSuccess$hid_release$default(AdaptedLoadingDialog adaptedLoadingDialog, CharSequence charSequence, int i, OnAnimEndListener onAnimEndListener, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = adaptedLoadingDialog.DEFAULT_DURATION;
        }
        if ((i2 & 4) != 0) {
            onAnimEndListener = null;
        }
        adaptedLoadingDialog.setSuccess$hid_release(charSequence, i, onAnimEndListener);
    }

    public static /* synthetic */ void show$hid_release$default(AdaptedLoadingDialog adaptedLoadingDialog, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = null;
        }
        adaptedLoadingDialog.show$hid_release(charSequence);
    }

    public final void dismiss$hid_release() {
        this.mLoadingView.stopLoading();
        Dialog dialog = this.mDialog;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public final void setFailed$hid_release(@NotNull CharSequence msg, int delayTime, @Nullable OnAnimEndListener listener) {
        h(msg, delayTime, listener, new b());
    }

    public final void setSuccess$hid_release(@NotNull CharSequence msg, int delayTime, @Nullable OnAnimEndListener listener) {
        h(msg, delayTime, listener, new c());
    }

    public final void show$hid_release(@Nullable CharSequence msg) {
        this.mDelayTime = 0;
        this.mLoadingView.reset();
        this.mLoadingView.removeCallbacks(this.mLoadingRunnable);
        this.mLoadingView.startLoading();
        if (msg != null) {
            j(msg);
        }
        this.mDialog.show();
        HMLog.info(BluetoothUtil.TAG, d.a);
    }

    public /* synthetic */ AdaptedLoadingDialog(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z);
    }
}
