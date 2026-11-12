package com.mi.health.course.service;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mi.health.course.data.CastScreenCMD;
import com.mi.health.course.service.FloatWindowFragment;
import com.mi.health.course.util.LogUtil;
import com.milink.sdk.Constants;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.client.MiLinkCastCallback;
import com.milink.sdk.client.MiLinkCastClient;
import com.milink.sdk.client.MiLinkDataCallback;
import com.milink.sdk.client.MiLinkDeviceListener;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ded;
import defpackage.er4;
import defpackage.sti;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 _2\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b^\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J-\u0010 \u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u0004J\u0015\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002050:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020;0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR#\u0010R\u001a\n N*\u0004\u0018\u00010M0M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010IR\u0016\u0010T\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010IR\u0016\u0010U\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00109R\u0016\u0010V\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00109R\u0014\u0010W\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bW\u0010IR\u0014\u0010X\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u0010IR\u0014\u0010Y\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bY\u0010IR\u0014\u0010Z\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010LR\u0014\u0010]\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/mi/health/course/service/FloatWindowFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "initSpinner", "()V", "", "isSupportSendData", "()Z", "initMiLinkClient", "stopCast", "stopConnect", "stopDiscoveryAndStopConnect", "", "statue", "sendCmdToTV", "(I)V", "clearDevices", "startCustomCast", "Lcom/mi/health/course/service/DeviceRecyclerDialog;", "createCustomDeviceDialog", "()Lcom/mi/health/course/service/DeviceRecyclerDialog;", "showCustomDeviceDialog", "updateCustomDeviceDialog", "dismissCustomDeviceDialog", "isDataCasting", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lded;", "projectionData", "sendDataToTV", "(Lded;)V", "Ler4;", "_binding", "Ler4;", "Lcom/milink/sdk/client/MiLinkCastClient;", "mCastClient", "Lcom/milink/sdk/client/MiLinkCastClient;", "mCustomDeviceDialog$delegate", "Lkotlin/Lazy;", "getMCustomDeviceDialog", "mCustomDeviceDialog", "Ljava/util/ArrayList;", "Lcom/milink/sdk/cast/MiLinkDevice;", "mDeviceList", "Ljava/util/ArrayList;", "isSupportFloatCast", "Z", "", "", "mDeviceMap", "Ljava/util/Map;", "Lcom/xiaomi/fitness/account/HrZone;", "hrZone$delegate", "getHrZone", "()Lcom/xiaomi/fitness/account/HrZone;", "hrZone", "mUid", "Ljava/lang/String;", "", "starArray", "[Ljava/lang/String;", DailyRecordKey.sportType, "I", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "mGson$delegate", "getMGson", "()Lcom/google/gson/Gson;", "mGson", "dataCount", "mState", "mPendingCast", "mPendingCustomCast", "MSG_FOUND", "MSG_UPDATE", "MSG_LOST", "mDeviceHandler", "getMBinding", "()Ler4;", "mBinding", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FloatWindowFragment extends BaseFragment {

    @NotNull
    public static final String MILINK_CALLER_SUFFIX = "main_processor";
    private static final int STATE_CASTING = 2;
    private static final int STATE_IDLE = 0;
    private static final int STATE_INIT = 1;

    @NotNull
    public static final String TAG = "FloatWindowFragment";
    private final int MSG_FOUND;
    private final int MSG_LOST;
    private final int MSG_UPDATE;

    @Nullable
    private er4 _binding;
    private int dataCount;

    /* JADX INFO: renamed from: hrZone$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrZone;
    private boolean isSupportFloatCast;
    private MiLinkCastClient mCastClient;

    /* JADX INFO: renamed from: mCustomDeviceDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCustomDeviceDialog;

    @NotNull
    private final Handler mDeviceHandler;

    @NotNull
    private final ArrayList<MiLinkDevice> mDeviceList;

    @NotNull
    private final Map<String, MiLinkDevice> mDeviceMap;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson;

    @NotNull
    private final Handler mHandler;
    private boolean mPendingCast;
    private boolean mPendingCustomCast;
    private int mState;

    @NotNull
    private String mUid;
    private int sportType;

    @NotNull
    private final String[] starArray;

    public FloatWindowFragment() {
        super(sti.course_fragment_float_window);
        this.mCustomDeviceDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qy9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatWindowFragment.mCustomDeviceDialog_delegate$lambda$0(this.f31962a);
            }
        });
        this.mDeviceList = new ArrayList<>();
        this.mDeviceMap = new LinkedHashMap();
        this.hrZone = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ry9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatWindowFragment.hrZone_delegate$lambda$1();
            }
        });
        this.mUid = "";
        this.starArray = new String[]{"跑步机", "健身车", "智能跳绳", "室内跑步", "自由活动", "椭圆机", "划船机", "跳绳", "高强度训练"};
        this.sportType = 3;
        final Looper mainLooper = Looper.getMainLooper();
        this.mHandler = new Handler(mainLooper) { // from class: com.mi.health.course.service.FloatWindowFragment$mHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what != 0) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                if (this.this$0.dataCount >= 100) {
                    sendEmptyMessageDelayed(1, 3000L);
                    return;
                }
                Logger.d(FloatWindowFragment.TAG, "send data to TV again " + this.this$0.dataCount + ", sportType: " + this.this$0.sportType);
                FloatWindowFragment floatWindowFragment = this.this$0;
                floatWindowFragment.sendDataToTV(ScreenCastMockUtil.INSTANCE.mockPhoneSportData(floatWindowFragment.sportType));
                sendEmptyMessageDelayed(0, 3000L);
                this.this$0.dataCount = this.this$0.dataCount + 1;
            }
        };
        this.mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hy9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatWindowFragment.mGson_delegate$lambda$2();
            }
        });
        this.dataCount = 1;
        this.MSG_FOUND = 7;
        this.MSG_UPDATE = 8;
        this.MSG_LOST = 9;
        this.mDeviceHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: iy9
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return FloatWindowFragment.mDeviceHandler$lambda$11(this.f22224a, message);
            }
        });
    }

    private final void clearDevices() {
        this.mDeviceList.clear();
        this.mDeviceMap.clear();
    }

    private final DeviceRecyclerDialog createCustomDeviceDialog() {
        DeviceRecyclerDialog deviceRecyclerDialog = new DeviceRecyclerDialog();
        deviceRecyclerDialog.setOnNeutralClickListener(new BaseDialogFragment.a() { // from class: oy9
            @Override // com.mi.health.course.service.BaseDialogFragment.a
            public final void a() {
                FloatWindowFragment.createCustomDeviceDialog$lambda$12(this.f29810a);
            }
        });
        deviceRecyclerDialog.setOnItemClickListener(new a.b() { // from class: py9
            @Override // com.mi.health.course.service.a.b
            public final void a(MiLinkDevice miLinkDevice, int i) {
                FloatWindowFragment.createCustomDeviceDialog$lambda$13(this.f30893a, miLinkDevice, i);
            }
        });
        return deviceRecyclerDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCustomDeviceDialog$lambda$12(FloatWindowFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stopCast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCustomDeviceDialog$lambda$13(FloatWindowFragment this$0, MiLinkDevice miLinkDevice, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "startConnect: " + miLinkDevice);
        MiLinkCastClient miLinkCastClient = this$0.mCastClient;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        miLinkCastClient.startConnect(miLinkDevice, 36);
        ToastUtil.showShortToast("连接中。。。");
        this$0.dismissCustomDeviceDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissCustomDeviceDialog() {
        if (getMCustomDeviceDialog().isShowing()) {
            getMCustomDeviceDialog().dismiss();
        }
    }

    private final HrZone getHrZone() {
        return (HrZone) this.hrZone.getValue();
    }

    private final er4 getMBinding() {
        er4 er4Var = this._binding;
        Intrinsics.checkNotNull(er4Var);
        return er4Var;
    }

    private final DeviceRecyclerDialog getMCustomDeviceDialog() {
        return (DeviceRecyclerDialog) this.mCustomDeviceDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrZone hrZone_delegate$lambda$1() {
        return new HrZone();
    }

    private final void initMiLinkClient() {
        LogUtil.INSTANCE.i(TAG, "milink init start isSupportSendData==" + isSupportSendData());
        MiLinkCastClient miLinkCastClient = new MiLinkCastClient(ApplicationExtKt.getApplication(), true, MILINK_CALLER_SUFFIX);
        this.mCastClient = miLinkCastClient;
        miLinkCastClient.init(new MiLinkCastCallback() { // from class: com.mi.health.course.service.FloatWindowFragment.initMiLinkClient.1
            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onConnected(MiLinkDevice p0, int p1) {
                FloatWindowFragment.this.mState = 2;
                FloatWindowFragment.this.dismissCustomDeviceDialog();
                Logger.d(FloatWindowFragment.TAG, "milink connected");
                FloatWindowFragment.this.mHandler.sendEmptyMessage(0);
                Logger.d(FloatWindowFragment.TAG, "milink connected");
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onConnectionChange(int p0, MiLinkDevice p1, int p2) {
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onDisconnected(MiLinkDevice p0, int p1) {
                Logger.d(FloatWindowFragment.TAG, "milink onDisconnected");
                FloatWindowFragment.this.mState = 1;
                FloatWindowFragment.this.stopCast();
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onFailure(int p0, int p1) {
                FloatWindowFragment.this.mState = 1;
                Logger.d(FloatWindowFragment.TAG, "milink onFailure code==" + p0 + "  *** flag==" + p1);
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onInit() {
                Logger.d(FloatWindowFragment.TAG, "milink init success");
                FloatWindowFragment.this.mState = 1;
                if (FloatWindowFragment.this.mPendingCustomCast) {
                    FloatWindowFragment.this.startCustomCast();
                    FloatWindowFragment.this.mPendingCustomCast = false;
                }
            }

            @Override // com.milink.sdk.cast.IMiLinkCastCallback
            public void onPrivateProtectChange(int p0, int p1) {
            }
        });
        MiLinkCastClient miLinkCastClient2 = this.mCastClient;
        if (miLinkCastClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient2 = null;
        }
        miLinkCastClient2.setDataCallback(new MiLinkDataCallback() { // from class: com.mi.health.course.service.FloatWindowFragment.initMiLinkClient.2
            @Override // com.milink.sdk.cast.IMiLinkDataCallback
            public void onReceived(byte[] p0) {
                if (p0 == null) {
                    return;
                }
                CastScreenCMD.GetVideoDataFromTV getVideoDataFromTV = (CastScreenCMD.GetVideoDataFromTV) FloatWindowFragment.this.getMGson().fromJson(new String(p0, Charsets.UTF_8), CastScreenCMD.GetVideoDataFromTV.class);
                Logger.d(FloatWindowFragment.TAG, "milink onReceived status==" + getVideoDataFromTV.status + "***progress==" + getVideoDataFromTV.progress + "***clarity==" + getVideoDataFromTV.clarity);
            }
        });
    }

    private final void initSpinner() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), sti.l, this.starArray);
        arrayAdapter.setDropDownViewResource(sti.f33976k);
        getMBinding().E.setPrompt("请选择Sport Type");
        getMBinding().E.setAdapter((SpinnerAdapter) arrayAdapter);
        getMBinding().E.setSelection(3);
        getMBinding().E.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.mi.health.course.service.FloatWindowFragment.initSpinner.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                FloatWindowFragment.this.sportType = position;
                Logger.d(FloatWindowFragment.TAG, " sportType selected " + FloatWindowFragment.this.sportType);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private final boolean isDataCasting() {
        return this.mState == 2;
    }

    private final boolean isSupportSendData() {
        MiLinkCastClient miLinkCastClient = new MiLinkCastClient(ApplicationExtKt.getApplication(), true, MILINK_CALLER_SUFFIX);
        this.mCastClient = miLinkCastClient;
        return miLinkCastClient.support(Constants.FEATURE_DATA_FLOAT_WINDIW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceRecyclerDialog mCustomDeviceDialog_delegate$lambda$0(FloatWindowFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createCustomDeviceDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mDeviceHandler$lambda$11(FloatWindowFragment this$0, Message msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == this$0.MSG_FOUND) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.milink.sdk.cast.MiLinkDevice");
            MiLinkDevice miLinkDevice = (MiLinkDevice) obj;
            String key = miLinkDevice.getKey();
            if (this$0.mDeviceMap.containsKey(key)) {
                return false;
            }
            this$0.mDeviceMap.put(key, miLinkDevice);
            this$0.mDeviceList.add(miLinkDevice);
            this$0.updateCustomDeviceDialog();
            return false;
        }
        if (i != this$0.MSG_UPDATE) {
            if (i != this$0.MSG_LOST) {
                return false;
            }
            Object obj2 = msg.obj;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            if (!this$0.mDeviceMap.containsKey(str)) {
                return false;
            }
            this$0.mDeviceMap.remove(str);
            for (int size = this$0.mDeviceList.size() - 1; size >= 0; size--) {
                MiLinkDevice miLinkDevice2 = this$0.mDeviceList.get(size);
                Intrinsics.checkNotNullExpressionValue(miLinkDevice2, "get(...)");
                MiLinkDevice miLinkDevice3 = miLinkDevice2;
                if (Intrinsics.areEqual(miLinkDevice3.getKey(), str)) {
                    this$0.mDeviceList.remove(miLinkDevice3);
                }
            }
            this$0.updateCustomDeviceDialog();
            return false;
        }
        Object obj3 = msg.obj;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.milink.sdk.cast.MiLinkDevice");
        MiLinkDevice miLinkDevice4 = (MiLinkDevice) obj3;
        String key2 = miLinkDevice4.getKey();
        if (!this$0.mDeviceMap.containsKey(key2)) {
            return false;
        }
        this$0.mDeviceMap.put(key2, miLinkDevice4);
        for (int size2 = this$0.mDeviceList.size() - 1; size2 >= 0; size2--) {
            MiLinkDevice miLinkDevice5 = this$0.mDeviceList.get(size2);
            Intrinsics.checkNotNullExpressionValue(miLinkDevice5, "get(...)");
            MiLinkDevice miLinkDevice6 = miLinkDevice5;
            if (Intrinsics.areEqual(miLinkDevice6.getKey(), key2)) {
                miLinkDevice6.setName(miLinkDevice4.getName());
                miLinkDevice6.setType(miLinkDevice4.getType());
                miLinkDevice6.setIp(miLinkDevice4.getIp());
                miLinkDevice6.setBleMac(miLinkDevice4.getBleMac());
                miLinkDevice6.setP2pMac(miLinkDevice4.getP2pMac());
                miLinkDevice6.setWifiMac(miLinkDevice4.getWifiMac());
                miLinkDevice6.setState(miLinkDevice4.getState());
                this$0.updateCustomDeviceDialog();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$2() {
        return new GsonBuilder().disableHtmlEscaping().create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(FloatWindowFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.stopDiscoveryAndStopConnect();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(FloatWindowFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.stopConnect();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(FloatWindowFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.startCustomCast();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(FloatWindowFragment this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(FloatWindowFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mHandler.sendEmptyMessageDelayed(1, 1000L);
        this$0.sendCmdToTV(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(FloatWindowFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dataCount = 0;
        this$0.mHandler.sendEmptyMessage(0);
        this$0.sendCmdToTV(3);
        return Unit.INSTANCE;
    }

    private final void sendCmdToTV(int statue) {
        if (isDataCasting()) {
            CastScreenCMD.SendVideoCMD sendVideoCMD = new CastScreenCMD.SendVideoCMD();
            sendVideoCMD.type = 2;
            sendVideoCMD.uid = "1225";
            sendVideoCMD.operation = statue;
            MiLinkCastClient miLinkCastClient = this.mCastClient;
            if (miLinkCastClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
                miLinkCastClient = null;
            }
            String json = getMGson().toJson(sendVideoCMD);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            miLinkCastClient.send(bytes);
            Logger.i(TAG, "sendCmdToTV==" + getMGson().toJson(sendVideoCMD));
        }
    }

    private final void showCustomDeviceDialog() {
        getMCustomDeviceDialog().show(getFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCustomCast() {
        if (!this.isSupportFloatCast) {
            ToastUtil.showShortToast("milink apk is low version");
            return;
        }
        if (this.mState == 0) {
            this.mPendingCustomCast = true;
            return;
        }
        if (isDataCasting()) {
            Logger.i(TAG, "startDiscovery invoke, but is casting now!");
            return;
        }
        clearDevices();
        ToastUtil.showShortToast("has add Logs!!");
        MiLinkCastClient miLinkCastClient = this.mCastClient;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        miLinkCastClient.startDiscovery(36, new MiLinkDeviceListener() { // from class: com.mi.health.course.service.FloatWindowFragment.startCustomCast.1
            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onFound(MiLinkDevice miLinkDevice) {
                Intrinsics.checkNotNullParameter(miLinkDevice, "miLinkDevice");
                Message messageObtainMessage = FloatWindowFragment.this.mDeviceHandler.obtainMessage();
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                messageObtainMessage.what = FloatWindowFragment.this.MSG_FOUND;
                messageObtainMessage.obj = miLinkDevice;
                messageObtainMessage.sendToTarget();
                StringBuilder sb = new StringBuilder();
                sb.append("milink startDiscovery Found ");
                sb.append(miLinkDevice);
            }

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onLost(MiLinkDevice miLinkDevice) {
                Intrinsics.checkNotNullParameter(miLinkDevice, "miLinkDevice");
                Message messageObtainMessage = FloatWindowFragment.this.mDeviceHandler.obtainMessage();
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                messageObtainMessage.what = FloatWindowFragment.this.MSG_LOST;
                messageObtainMessage.obj = miLinkDevice.getKey();
                messageObtainMessage.sendToTarget();
                StringBuilder sb = new StringBuilder();
                sb.append("milink startDiscovery onLost ");
                sb.append(miLinkDevice);
            }

            @Override // com.milink.sdk.cast.IMiLinkDeviceListener
            public void onUpdate(MiLinkDevice miLinkDevice) {
                Intrinsics.checkNotNullParameter(miLinkDevice, "miLinkDevice");
                Message messageObtainMessage = FloatWindowFragment.this.mDeviceHandler.obtainMessage();
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                messageObtainMessage.what = FloatWindowFragment.this.MSG_UPDATE;
                messageObtainMessage.obj = miLinkDevice;
                messageObtainMessage.sendToTarget();
                StringBuilder sb = new StringBuilder();
                sb.append("milink startDiscovery onUpdate ");
                sb.append(miLinkDevice);
            }
        });
        showCustomDeviceDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCast() {
        if (this.mState == 0) {
            Logger.d(TAG, "stopCast not init, ignore");
            return;
        }
        MiLinkCastClient miLinkCastClient = null;
        this.mHandler.removeCallbacksAndMessages(null);
        Logger.d(TAG, "stop connect!");
        MiLinkCastClient miLinkCastClient2 = this.mCastClient;
        if (miLinkCastClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
        } else {
            miLinkCastClient = miLinkCastClient2;
        }
        miLinkCastClient.stopConnect(36);
    }

    private final void stopConnect() {
        int i = this.mState;
        if (i == 0) {
            Logger.w(TAG, "stopDiscoveryAndStopConnect not init, ignore");
            return;
        }
        if (i != 2) {
            Logger.w(TAG, "stopConnect not casting, ignore");
            return;
        }
        Logger.w(TAG, "stopConnect");
        MiLinkCastClient miLinkCastClient = this.mCastClient;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        miLinkCastClient.stopConnect(36);
    }

    private final void stopDiscoveryAndStopConnect() {
        if (this.mState == 0) {
            Logger.w(TAG, "stopDiscoveryAndStopConnect not init, ignore");
            return;
        }
        Logger.w(TAG, "stopDiscovery");
        clearDevices();
        MiLinkCastClient miLinkCastClient = this.mCastClient;
        MiLinkCastClient miLinkCastClient2 = null;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        miLinkCastClient.stopDiscovery(36);
        if (this.mState != 2) {
            Logger.w(TAG, "stopConnect not casting, ignore");
            return;
        }
        Logger.w(TAG, "stopConnect");
        MiLinkCastClient miLinkCastClient3 = this.mCastClient;
        if (miLinkCastClient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
        } else {
            miLinkCastClient2 = miLinkCastClient3;
        }
        miLinkCastClient2.stopConnect(36);
    }

    private final void updateCustomDeviceDialog() {
        if (getMCustomDeviceDialog().isShowing()) {
            getMCustomDeviceDialog().w(this.mDeviceList);
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        stopDiscoveryAndStopConnect();
        this.mPendingCast = false;
        MiLinkCastClient miLinkCastClient = this.mCastClient;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        miLinkCastClient.release();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = er4.A0(inflater, container, false);
        View root = getMBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        if (isSupportSendData()) {
            initMiLinkClient();
            this.isSupportFloatCast = true;
            Logger.i(TAG, "check the milink version is Okay.");
        } else {
            Logger.i(TAG, "milink and miplay version is low, please update current new version!!");
        }
        initSpinner();
        ViewExtKt.clickWithTrigger$default(getMBinding().F, 0L, new Function1() { // from class: gy9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FloatWindowFragment.onViewCreated$lambda$3(this.f19458a, (Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().G, 0L, new Function1() { // from class: jy9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FloatWindowFragment.onViewCreated$lambda$4(this.f23242a, (Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().C, 0L, new Function1() { // from class: ky9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FloatWindowFragment.onViewCreated$lambda$5(this.f24415a, (Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().A, 0L, new Function1() { // from class: ly9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FloatWindowFragment.onViewCreated$lambda$6(this.f25548a, (ImageView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().D, 0L, new Function1() { // from class: my9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FloatWindowFragment.onViewCreated$lambda$7(this.f27343a, (Button) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().B, 0L, new Function1() { // from class: ny9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FloatWindowFragment.onViewCreated$lambda$8(this.f28561a, (Button) obj);
            }
        }, 1, null);
    }

    public final void sendDataToTV(@NotNull ded projectionData) {
        Intrinsics.checkNotNullParameter(projectionData, "projectionData");
        CastScreenCMD.FloatWindowData floatWindowData = new CastScreenCMD.FloatWindowData();
        ScreenCastMockUtil.INSTANCE.builderFloatWindowData(floatWindowData, projectionData);
        CastScreenCMD.SendVideoData sendVideoData = new CastScreenCMD.SendVideoData();
        sendVideoData.type = 1;
        sendVideoData.uid = "1225";
        sendVideoData.currentTime = projectionData.d;
        sendVideoData.maxHr = getHrZone().getMaxHr();
        sendVideoData.floatWindowData = floatWindowData;
        sendVideoData.dataType = 1;
        MiLinkCastClient miLinkCastClient = this.mCastClient;
        if (miLinkCastClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCastClient");
            miLinkCastClient = null;
        }
        String json = getMGson().toJson(sendVideoData);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        miLinkCastClient.send(bytes);
        Logger.d(TAG, "sendDataToTV==" + getMGson().toJson(sendVideoData));
    }
}
