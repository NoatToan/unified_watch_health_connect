package com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseViewModelFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.av6;
import defpackage.eui;
import defpackage.s33;
import defpackage.se6;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002Z[B\u0007¢\u0006\u0004\bY\u0010\fJ%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\fJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\fJ\u0019\u0010\"\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ/\u0010)\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b,\u0010\u000fJ)\u0010/\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b1\u0010\u000fJ\u0019\u00102\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b2\u0010\u000fR\u001a\u00103\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00107\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u0017R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010D\u001a\u00060CR\u00020\u00008\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u00104R\u0017\u0010Q\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010X\u001a\n U*\u0004\u0018\u00010\u001b0\u001b8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseViewModelFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneViewModel;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Landroid/content/ContentResolver;", "resolver", "Lkotlin/Pair;", "", "queryDeviceInfo", "(Landroid/content/ContentResolver;)Lkotlin/Pair;", "", "switchFromOut", "()V", "packageName", "startAppDefault", "(Ljava/lang/String;)V", "switch", "showLoadingDialog", "showBluetoothDialog", "showConnectFailureDialog", "", "state", "onPostState", "(I)V", "sendConnectNewPhone2Device", "showSuccessDialog", "showFailureDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "initOnViewCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "did", "onConnectStart", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "curState", "I", "getCurState", "()I", "setCurState", "Lse6;", "dialogBinding", "Lse6;", "getDialogBinding", "()Lse6;", "setDialogBinding", "(Lse6;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment$BindNewReceiver;", "receiver", "Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment$BindNewReceiver;", "getReceiver", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment$BindNewReceiver;", "", "finishFlag", "Z", "getFinishFlag", "()Z", "setFinishFlag", "(Z)V", "NOTIFY_NEW_BIND_ACTION", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "kotlin.jvm.PlatformType", "getDialogView", "()Landroid/view/View;", "dialogView", "<init>", "Companion", "BindNewReceiver", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nConnectNewPhoneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectNewPhoneFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,555:1\n54#2,3:556\n24#2:559\n59#2,6:560\n54#2,3:566\n24#2:569\n59#2,6:570\n54#2,3:576\n24#2:579\n59#2,6:580\n54#2,3:586\n24#2:589\n59#2,6:590\n54#2,3:596\n24#2:599\n59#2,6:600\n54#2,3:606\n24#2:609\n59#2,6:610\n54#2,3:616\n24#2:619\n59#2,6:620\n*S KotlinDebug\n*F\n+ 1 ConnectNewPhoneFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment\n*L\n134#1:556,3\n134#1:559\n134#1:560,6\n197#1:566,3\n197#1:569\n197#1:570,6\n244#1:576,3\n244#1:579\n244#1:580,6\n283#1:586,3\n283#1:589\n283#1:590,6\n334#1:596,3\n334#1:599\n334#1:600,6\n465#1:606,3\n465#1:609\n465#1:610,6\n500#1:616,3\n500#1:619\n500#1:620,6\n*E\n"})
public final class ConnectNewPhoneFragment extends BaseViewModelFragment<ConnectNewPhoneViewModel> implements OnDeviceStatusListener {
    public static final int BLUETOOTH_CLOSED = 1;
    public static final int CONNECT_FAILURE = 3;
    public static final int DEVICE_CONNECTED = 2;
    public static final int FROMOUT = 7;
    public static final int LOADING = 6;
    public static final int MSG_TIMEOUT = 1234;
    public static final int START = 0;
    public static final int SWITCH_FAILURE = 4;
    public static final int SWITCH_SUCCESS = 5;

    @Nullable
    private se6 dialogBinding;

    @NotNull
    private final Handler handler;

    @NotNull
    private final String TAG = "ConnectNewPhoneFragment";
    private int curState = -1;

    @NotNull
    private final BindNewReceiver receiver = new BindNewReceiver();
    private boolean finishFlag = true;

    @NotNull
    private final String NOTIFY_NEW_BIND_ACTION = "com.mi.health.notify_new_bind";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment$BindNewReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BindNewReceiver extends BroadcastReceiver {
        public BindNewReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual(ConnectNewPhoneFragment.this.NOTIFY_NEW_BIND_ACTION, intent != null ? intent.getAction() : null)) {
                ConnectNewPhoneFragment.this.getHandler().removeMessages(ConnectNewPhoneFragment.MSG_TIMEOUT);
                ConnectNewPhoneFragment.this.onPostState(5);
                Logger.i(ConnectNewPhoneFragment.this.getTAG(), "bind new success");
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment$showBluetoothDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/connectnewphone/ConnectNewPhoneFragment$showBluetoothDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        final /* synthetic */ Ref.BooleanRef $onBack;
        final /* synthetic */ ConnectNewPhoneFragment this$0;

        public AnonymousClass1(Ref.BooleanRef booleanRef, ConnectNewPhoneFragment connectNewPhoneFragment) {
            this.$onBack = booleanRef;
            this.this$0 = connectNewPhoneFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(ConnectNewPhoneFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onPostState(6);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(ConnectNewPhoneFragment this$0, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onPostState(0);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            this.$onBack.element = false;
            if (which == -2) {
                this.this$0.onPostState(0);
            } else if (which == -1) {
                ConnectNewPhoneViewModel connectNewPhoneViewModelAccess$getMViewModel = ConnectNewPhoneFragment.access$getMViewModel(this.this$0);
                FragmentActivity mActivity = this.this$0.getMActivity();
                if (mActivity == null) {
                    mActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(mActivity, "requireActivity(...)");
                }
                final ConnectNewPhoneFragment connectNewPhoneFragment = this.this$0;
                Function0<Unit> function0 = new Function0() { // from class: de4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectNewPhoneFragment.AnonymousClass1.onDialogClick$lambda$0(connectNewPhoneFragment);
                    }
                };
                final ConnectNewPhoneFragment connectNewPhoneFragment2 = this.this$0;
                connectNewPhoneViewModelAccess$getMViewModel.openBluetooth((BaseActivity) mActivity, function0, new Function1() { // from class: ee4
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ConnectNewPhoneFragment.AnonymousClass1.onDialogClick$lambda$1(connectNewPhoneFragment2, ((Integer) obj).intValue());
                    }
                });
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public ConnectNewPhoneFragment() {
        final Looper mainLooper = Looper.getMainLooper();
        this.handler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment$handler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 1234) {
                    this.this$0.onPostState(4);
                }
            }
        };
    }

    public static final /* synthetic */ ConnectNewPhoneViewModel access$getMViewModel(ConnectNewPhoneFragment connectNewPhoneFragment) {
        return connectNewPhoneFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initOnViewCreate$lambda$0(ConnectNewPhoneFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.onPostState(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPostState(int state) {
        DialogFragment dialogFragment;
        Logger.i(this.TAG, "currentState = " + state + ", activity = " + getActivity());
        if (getActivity() == null) {
        }
        this.curState = state;
        try {
            switch (state) {
                case 0:
                    m263switch();
                    break;
                case 1:
                    showBluetoothDialog();
                    break;
                case 2:
                    sendConnectNewPhone2Device();
                    break;
                case 3:
                    FragmentActivity mActivity = getMActivity();
                    if (mActivity == null) {
                        mActivity = requireActivity();
                    }
                    Fragment fragmentL0 = mActivity.getSupportFragmentManager().l0("loading");
                    dialogFragment = fragmentL0 instanceof DialogFragment ? (DialogFragment) fragmentL0 : null;
                    if (dialogFragment != null) {
                        dialogFragment.dismiss();
                    }
                    showConnectFailureDialog();
                    break;
                case 4:
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 == null) {
                        mActivity2 = requireActivity();
                    }
                    Fragment fragmentL1 = mActivity2.getSupportFragmentManager().l0("loading");
                    dialogFragment = fragmentL1 instanceof DialogFragment ? (DialogFragment) fragmentL1 : null;
                    if (dialogFragment != null) {
                        dialogFragment.dismiss();
                    }
                    showFailureDialog();
                    break;
                case 5:
                    try {
                        Context context = getContext();
                        if (context != null) {
                            context.unregisterReceiver(this.receiver);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    FragmentActivity mActivity3 = getMActivity();
                    if (mActivity3 == null) {
                        mActivity3 = requireActivity();
                    }
                    Fragment fragmentL2 = mActivity3.getSupportFragmentManager().l0("loading");
                    dialogFragment = fragmentL2 instanceof DialogFragment ? (DialogFragment) fragmentL2 : null;
                    if (dialogFragment != null) {
                        dialogFragment.dismiss();
                    }
                    showSuccessDialog();
                    break;
                case 6:
                    showLoadingDialog();
                    break;
                case 7:
                    switchFromOut();
                    break;
            }
        } catch (Exception e) {
            Logger.e(this.TAG, "onPostState " + state, e);
        }
    }

    private final Pair<String, String> queryDeviceInfo(ContentResolver resolver) {
        Cursor cursorQuery = resolver.query(Uri.parse("content://com.mi.health.provider.device/status"), null, null, null, null);
        if (cursorQuery != null && cursorQuery.moveToNext()) {
            return new Pair<>(cursorQuery.getString(cursorQuery.getColumnIndex("device_name")), cursorQuery.getString(cursorQuery.getColumnIndex("device_icon")));
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    private final void sendConnectNewPhone2Device() {
        this.finishFlag = false;
        Handler handler = this.handler;
        handler.sendMessageDelayed(handler.obtainMessage(MSG_TIMEOUT), 5000L);
        IntentFilter intentFilter = new IntentFilter(this.NOTIFY_NEW_BIND_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            Context context = getContext();
            if (context != null) {
                context.registerReceiver(this.receiver, intentFilter, 2);
            }
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                context2.registerReceiver(this.receiver, intentFilter);
            }
        }
        getMViewModel().sendConnectNewPhone2Device();
        Logger.i(this.TAG, "start send connect new phone");
    }

    private final void showBluetoothDialog() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        CommonDialog.c cVar = new CommonDialog.c("bluetooth");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String bigIcon = getMViewModel().getBigIcon();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bigIcon).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.K0));
        CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(wzi.L0).setPositiveText(wzi.R0).setNegativeText(wzi.d).create();
        commonDialogCreate.getLifecycle().addObserver(new ConnectNewPhoneFragment$showBluetoothDialog$observer$1(commonDialogCreate, booleanRef, this));
        CommonDialog commonDialogAddDialogCallback = commonDialogCreate.addDialogCallback(new AnonymousClass1(booleanRef, this));
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogAddDialogCallback.showIfNeed(mActivity.getSupportFragmentManager());
    }

    private final void showConnectFailureDialog() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        CommonDialog.c cVar = new CommonDialog.c("connect_failure");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String bigIcon = getMViewModel().getBigIcon();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bigIcon).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.M0));
        CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(wzi.N0).setPositiveText(wzi.common_retry).setNegativeText(wzi.d).setButtonVertical(true).create();
        commonDialogCreate.getLifecycle().addObserver(new ConnectNewPhoneFragment$showConnectFailureDialog$observer$1(commonDialogCreate, booleanRef, this));
        CommonDialog commonDialogAddDialogCallback = commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment.showConnectFailureDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                booleanRef.element = false;
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.onPostState(0);
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.onPostState(6);
                }
            }
        });
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogAddDialogCallback.showIfNeed(mActivity.getSupportFragmentManager());
    }

    private final void showFailureDialog() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        CommonDialog.c cVar = new CommonDialog.c("result");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String bigIcon = getMViewModel().getBigIcon();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bigIcon).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.O0));
        CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(wzi.I0).setPositiveText(wzi.common_retry).setNegativeText(wzi.d).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment.showFailureDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                booleanRef.element = false;
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    this.onPostState(6);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        });
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
    }

    private final void showLoadingDialog() {
        CommonDialog.c cVar = new CommonDialog.c("loading");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String bigIcon = getMViewModel().getBigIcon();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bigIcon).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.Q0));
        final CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(new DialogParams.DialogDescriptionString(getMViewModel().getProductName())).setNegativeText(wzi.P0).setCancelable(false).setCanceledOnBackPressed(true).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment.showLoadingDialog.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                Dialog dialog = commonDialogCreate.getDialog();
                Intrinsics.checkNotNull(dialog, "null cannot be cast to non-null type miuix.appcompat.app.AlertDialog");
                ((c) dialog).m(-2).setEnabled(false);
            }
        });
        WearableDeviceModel deviceModel = getMViewModel().getDeviceModel();
        if (deviceModel != null) {
            if (deviceModel.getIsDeviceConnected()) {
                commonDialogCreate.showIfNeed(requireActivity().getSupportFragmentManager());
                sendConnectNewPhone2Device();
            } else {
                if (!s33.e()) {
                    onPostState(1);
                    return;
                }
                FragmentActivity mActivity = getMActivity();
                if (mActivity == null) {
                    mActivity = requireActivity();
                }
                commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
                getMViewModel().connectDevice();
            }
        }
    }

    private final void showSuccessDialog() {
        CommonDialog.c cVar = new CommonDialog.c("result");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String bigIcon = getMViewModel().getBigIcon();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bigIcon).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.S0));
        CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(wzi.J0).setPositiveText(wzi.d).create();
        commonDialogCreate.getLifecycle().addObserver(new ConnectNewPhoneFragment$showSuccessDialog$observer$1(commonDialogCreate, this));
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment.showSuccessDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                ConnectNewPhoneFragment.this.finish();
            }
        });
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAppDefault(String packageName) {
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        Intent launchIntentForPackage = mActivity.getPackageManager().getLaunchIntentForPackage(packageName);
        Bundle bundle = new Bundle();
        bundle.putBoolean("showLoginDialog", true);
        bundle.putBoolean("bindNew", true);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.putExtra("flag", bundle);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(335544320);
        }
        if (launchIntentForPackage != null) {
            startActivity(launchIntentForPackage);
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    private final void m263switch() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        CommonDialog.c cVar = new CommonDialog.c("switch");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String bigIcon = getMViewModel().getBigIcon();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(bigIcon).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.H0));
        CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(new DialogParams.DialogDescriptionString(getMViewModel().getProductName())).setPositiveText(wzi.T0).setNegativeText(wzi.d).create();
        commonDialogCreate.getLifecycle().addObserver(new ConnectNewPhoneFragment$switch$observer$1(commonDialogCreate, booleanRef, this));
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment.switch.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                booleanRef.element = false;
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.requireActivity().finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.onPostState(6);
                }
            }
        });
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        commonDialogCreate.showIfNeed(mActivity.getSupportFragmentManager());
    }

    private final void switchFromOut() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        ContentResolver contentResolver = mActivity.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        Pair<String, String> pairQueryDeviceInfo = queryDeviceInfo(contentResolver);
        if (pairQueryDeviceInfo == null) {
            finish();
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        CommonDialog.c cVar = new CommonDialog.c("switchFromOut");
        View dialogView = getDialogView();
        View viewFindViewById = dialogView.findViewById(zqi.p1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        String second = pairQueryDeviceInfo.getSecond();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(second).target(imageView);
        builderTarget.lifecycle(requireActivity());
        imageLoader.enqueue(builderTarget.build());
        ((TextView) dialogView.findViewById(zqi.Z1)).setText(getString(wzi.H0));
        CommonDialog commonDialogCreate = cVar.setCustomView(dialogView).setDialogTitle(new DialogParams.DialogDescriptionString(pairQueryDeviceInfo.getFirst())).setPositiveText(wzi.T0).setNegativeText(wzi.d).create();
        commonDialogCreate.getLifecycle().addObserver(new ConnectNewPhoneFragment$switchFromOut$observer$1(commonDialogCreate, booleanRef, this));
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.connectnewphone.ConnectNewPhoneFragment.switchFromOut.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                booleanRef.element = false;
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this.requireActivity().finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    ConnectNewPhoneFragment connectNewPhoneFragment = this;
                    String packageName = ApplicationExtKt.getApplication().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    connectNewPhoneFragment.startAppDefault(packageName);
                    this.finish();
                }
            }
        });
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 == null) {
            mActivity2 = requireActivity();
        }
        commonDialogCreate.showIfNeed(mActivity2.getSupportFragmentManager());
    }

    public final int getCurState() {
        return this.curState;
    }

    @Nullable
    public final se6 getDialogBinding() {
        return this.dialogBinding;
    }

    public final View getDialogView() {
        return LayoutInflater.from(AppUtil.getApp()).inflate(eui.y, (ViewGroup) null);
    }

    public final boolean getFinishFlag() {
        return this.finishFlag;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final BindNewReceiver getReceiver() {
        return this.receiver;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment
    public void initOnViewCreate(@Nullable Bundle savedInstanceState) {
        super.initOnViewCreate(savedInstanceState);
        getMViewModel().getSwitchStatus().observe(this, new ConnectNewPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ce4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConnectNewPhoneFragment.initOnViewCreate$lambda$0(this.f5240a, (Integer) obj);
            }
        }));
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        hideBack();
        Logger.i(this.TAG, "initOnViewCreate() called with: savedInstanceState = " + savedInstanceState);
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null) {
            mActivity = requireActivity();
        }
        if (mActivity.getIntent().getIntExtra("from", -1) == 1) {
            Logger.i(this.TAG, "switchFromOut");
            switchFromOut();
            return;
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 == null) {
            mActivity2 = requireActivity();
        }
        if (mActivity2.getIntent().getBooleanExtra("fromMain", false)) {
            Logger.i(this.TAG, "fromMain = true");
            onPostState(6);
        } else if (ServiceConnector.isConnected$default(ServiceConnector.INSTANCE.getInstance(), 0, 1, null)) {
            Logger.i(this.TAG, "entrance switch");
            onPostState(0);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeMessages(MSG_TIMEOUT);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        if (this.finishFlag) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
                finish();
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }

    public final void setCurState(int i) {
        this.curState = i;
    }

    public final void setDialogBinding(@Nullable se6 se6Var) {
        this.dialogBinding = se6Var;
    }

    public final void setFinishFlag(boolean z) {
        this.finishFlag = z;
    }
}
