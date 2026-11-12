package com.xiaomi.fitness.electronic.scale;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.BalanceWeightActivity;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper;
import defpackage.av1;
import defpackage.gui;
import defpackage.jj0;
import defpackage.ld8;
import defpackage.mhi;
import defpackage.u7r;
import defpackage.uno;
import defpackage.wc0;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0007¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0006J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\tH\u0014¢\u0006\u0004\b&\u0010\fR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010/R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/BalanceWeightActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/BalanceWeightViewModel;", "Ljj0;", "", "startBalanced", "()V", "endBalanced", "handleBalanceTimeResult", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "registerReceivers", "unRegisterReceivers", Feature.GUIDE, "measure", "result", "", "index", "balancedShow", "(I)V", "showBarLevel", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "event", "onEcoPacketEvent", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;)V", "onCreate", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "featureId", "Landroid/view/MenuItem;", "item", "", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onBackPressed", "outState", "onSaveInstanceState", "", "colors", "[I", "", "TAG", "Ljava/lang/String;", "mDid", "mBalanceTime", "I", "mBalanceStatus", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "askCount", "Landroid/content/BroadcastReceiver;", "bluetoothMonitorReceiver", "Landroid/content/BroadcastReceiver;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BalanceWeightActivity extends Hilt_BalanceWeightActivity<BalanceWeightViewModel, jj0> {
    public static final int BALANCED_TEST_DISABLE = 0;
    public static final int BALANCED_TEST_STOP = 2;
    public static final int BALANCED_TEST_TIMEOUT = 3;
    public static final int BALANCED_TEST_TIMING = 1;
    public static final int BALANCED_TEST_WAIT = 4;
    public static final int BALANCED_UNTEST_TIMEOUT = 5;

    @NotNull
    public static final String KEY_BALANCE_STATUS = "electronic_weight_status";

    @NotNull
    public static final String KEY_BALANCE_TIME = "electronic_weight_time";

    @NotNull
    public static final String KEY_DID = "electronic_weight_did";
    public static final int MESSAGE_SHOW_BAR_LEVEL = 1;
    private int askCount;

    @NotNull
    private final BroadcastReceiver bluetoothMonitorReceiver;

    @NotNull
    private Handler handler;
    private volatile int mBalanceStatus;
    private volatile int mBalanceTime;

    @NotNull
    private final int[] colors = {-10650, -17664, -30203};

    @NotNull
    private final String TAG = "BalanceWeightActivity";

    @NotNull
    private String mDid = "";

    public BalanceWeightActivity() {
        final Looper mainLooper = Looper.getMainLooper();
        this.handler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.electronic.scale.BalanceWeightActivity$handler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what != 1 || this.this$0.askCount >= 4) {
                    return;
                }
                this.this$0.showBarLevel();
            }
        };
        this.bluetoothMonitorReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.electronic.scale.BalanceWeightActivity$bluetoothMonitorReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                String action = intent.getAction();
                if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) == 10) {
                    ToastUtil.showToast(this.this$0.getString(zzi.m0));
                    this.this$0.finish();
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void balancedShow(int index) {
        ((jj0) getMBinding()).E.f(getResources().getStringArray(mhi.f26186b), this.colors, index, false);
        showBarLevel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void endBalanced() {
        ((BalanceWeightViewModel) getMViewModel()).switchMode(this.mDid, 3, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BalanceWeightActivity.endBalanced.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(BalanceWeightActivity.this.TAG, "switchMode end balanced error type: " + type + " code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(BalanceWeightActivity.this.TAG, "switchMode end balanced success");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void guide() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.Z));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setSubtitle(getString(zzi.a0));
        }
        ((jj0) getMBinding()).M.setVisibility(0);
        ((jj0) getMBinding()).N.setVisibility(8);
        ((jj0) getMBinding()).C.setVisibility(4);
        ((jj0) getMBinding()).B.setVisibility(4);
    }

    private final void handleBalanceTimeResult() {
        Logger.i(this.TAG, "status " + this.mBalanceStatus);
        if (this.mBalanceStatus == 1) {
            Logger.i(this.TAG, "measure " + this.mBalanceTime);
            measure();
            return;
        }
        if (this.mBalanceStatus != 2 && this.mBalanceStatus != 3) {
            if (this.mBalanceStatus == 5) {
                ToastUtil.INSTANCE.showToast(zzi.y4);
                finish();
                return;
            }
            return;
        }
        Logger.i(this.TAG, "result " + this.mBalanceTime);
        result();
    }

    private final void initView(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            String stringExtra = getIntent().getStringExtra("did");
            Intrinsics.checkNotNull(stringExtra);
            this.mDid = stringExtra;
            startBalanced();
            guide();
            return;
        }
        String string = savedInstanceState.getString("electronic_weight_did");
        Intrinsics.checkNotNull(string);
        this.mDid = string;
        this.mBalanceStatus = savedInstanceState.getInt("electronic_weight_status");
        this.mBalanceTime = savedInstanceState.getInt(KEY_BALANCE_TIME);
        guide();
        handleBalanceTimeResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void measure() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.b0));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setSubtitle(getString(zzi.c0));
        }
        ((jj0) getMBinding()).M.setVisibility(0);
        ((jj0) getMBinding()).N.setVisibility(8);
        ((jj0) getMBinding()).C.setVisibility(0);
        ((jj0) getMBinding()).B.setVisibility(0);
        ((jj0) getMBinding()).C.setText(String.valueOf(this.mBalanceTime / 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacketEvent$lambda$0(BalanceWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleBalanceTimeResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResume$lambda$1(BalanceWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iCalculateResult = ((BalanceWeightViewModel) this$0.getMViewModel()).calculateResult(this$0.mBalanceTime / 10);
        Logger.i(this$0.TAG, "calculateResult " + iCalculateResult);
        float width = ((jj0) this$0.getMBinding()).E.getmoveWidth() - ((float) ((jj0) this$0.getMBinding()).F.getWidth());
        if (width <= 0.0f) {
            width = 0.0f;
        }
        ((jj0) this$0.getMBinding()).F.setTranslationX(0.0f);
        ((jj0) this$0.getMBinding()).F.animate().translationX(width).setDuration(0L);
    }

    private final void registerReceivers() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.bluetoothMonitorReceiver, intentFilter);
        ld8.c().p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void result() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.d0));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setSubtitle("");
        }
        float f = 10;
        ((jj0) getMBinding()).K.setText(String.valueOf(this.mBalanceTime / f));
        ((jj0) getMBinding()).M.setVisibility(8);
        ((jj0) getMBinding()).N.setVisibility(0);
        int iCalculateResult = ((BalanceWeightViewModel) getMViewModel()).calculateResult(this.mBalanceTime / f);
        ((jj0) getMBinding()).E.setTimeRange(((BalanceWeightViewModel) getMViewModel()).getTimeRange(this.mBalanceTime / f));
        Logger.i(this.TAG, "calculateResult " + iCalculateResult);
        balancedShow(iCalculateResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showBarLevel() {
        if (!((jj0) getMBinding()).E.d()) {
            this.askCount++;
            this.handler.sendEmptyMessageDelayed(1, 20L);
            return;
        }
        float width = ((jj0) getMBinding()).E.getmoveWidth() - ((jj0) getMBinding()).F.getWidth();
        if (width <= 0.0f) {
            width = 0.0f;
        }
        ((jj0) getMBinding()).F.setTranslationX(0.0f);
        ((jj0) getMBinding()).F.animate().translationX(width).setDuration(1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startBalanced() {
        ((BalanceWeightViewModel) getMViewModel()).switchMode(this.mDid, 2, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BalanceWeightActivity.startBalanced.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(BalanceWeightActivity.this.TAG, "switchMode balanced error type: " + type + " code : " + code);
                ToastUtil.showToast(BalanceWeightActivity.this.getString(zzi.Y));
                BalanceWeightActivity.this.finish();
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(BalanceWeightActivity.this.TAG, "switchMode balanced success");
            }
        });
    }

    private final void unRegisterReceivers() {
        unregisterReceiver(this.bluetoothMonitorReceiver);
        ld8.c().r(this);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        endBalanced();
        super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_BalanceWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(savedInstanceState);
        registerReceivers();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_BalanceWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
        unRegisterReceivers();
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onEcoPacketEvent(@NotNull ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.i(this.TAG, "onEcoPacketEvent");
        if (!Intrinsics.areEqual(this.mDid, event.getDid()) || isDestroyed()) {
            Logger.i(this.TAG, "use scale error mDid : " + this.mDid + " , did : " + event.getDid());
            return;
        }
        u7r packet = event.getPacket();
        if (packet == null || packet.f != 8) {
            return;
        }
        u7r packet2 = event.getPacket();
        Intrinsics.checkNotNull(packet2);
        this.mBalanceTime = packet2.t().r().d;
        u7r packet3 = event.getPacket();
        Intrinsics.checkNotNull(packet3);
        this.mBalanceStatus = packet3.t().r().c;
        this.handler.post(new Runnable() { // from class: px1
            @Override // java.lang.Runnable
            public final void run() {
                BalanceWeightActivity.onEcoPacketEvent$lambda$0(this.f30869a);
            }
        });
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onMenuItemSelected(featureId, item);
        }
        endBalanced();
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.mBalanceStatus == 2 || this.mBalanceStatus == 3) {
            ((jj0) getMBinding()).E.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qx1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    BalanceWeightActivity.onResume$lambda$1(this.f31923a);
                }
            });
        }
        EcoDataHandlerHelper.INSTANCE.updateDataHandler();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_BALANCE_TIME, this.mBalanceTime);
        outState.putInt("electronic_weight_status", this.mBalanceStatus);
        outState.putString("electronic_weight_did", this.mDid);
    }
}
