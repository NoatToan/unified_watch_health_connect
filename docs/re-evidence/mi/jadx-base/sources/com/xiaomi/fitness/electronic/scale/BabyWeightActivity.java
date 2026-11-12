package com.xiaomi.fitness.electronic.scale;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.BabyWeightActivity;
import com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter;
import com.xiaomi.fitness.electronic.scale.data.AddUserIcon;
import com.xiaomi.fitness.electronic.scale.data.Icon;
import com.xiaomi.fitness.electronic.scale.data.UserPhotoIcon;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.util.EcoDataHandlerHelper;
import com.xiaomi.fitness.electronic.scale.util.ScalePageUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import defpackage.av1;
import defpackage.av6;
import defpackage.bri;
import defpackage.cx7;
import defpackage.gui;
import defpackage.hj0;
import defpackage.kx7;
import defpackage.ld8;
import defpackage.lni;
import defpackage.qw7;
import defpackage.t48;
import defpackage.tw7;
import defpackage.u7r;
import defpackage.uno;
import defpackage.vw7;
import defpackage.ww7;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import miuix.recyclerview.widget.RecyclerView;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_BABY_WEIGHT_EIGHT)
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0099\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0099\u0001B\b¢\u0006\u0005\b\u0098\u0001\u0010\u0015J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0015J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u000fJ\u001f\u0010+\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J9\u00100\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J)\u00103\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u0002022\b\u0010.\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u0010\u0015J\u0017\u00106\u001a\u00020\u00072\u0006\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010;\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\bA\u0010\u0013J\u0017\u0010C\u001a\u00020\u00072\u0006\u0010>\u001a\u00020BH\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u000fJ\u000f\u0010J\u001a\u00020\u0007H\u0014¢\u0006\u0004\bJ\u0010\u0015J\u001f\u0010N\u001a\u00020\u001a2\u0006\u0010K\u001a\u0002082\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0007H\u0016¢\u0006\u0004\bP\u0010\u0015J\u0017\u0010R\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0010H\u0014¢\u0006\u0004\bR\u0010\u0013J\u000f\u0010S\u001a\u00020\u0007H\u0014¢\u0006\u0004\bS\u0010\u0015R\"\u0010U\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR\"\u0010n\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010f\u001a\u0004\bo\u0010h\"\u0004\bp\u0010jR\u0016\u0010q\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010rR\"\u0010t\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010r\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020\f0y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R+\u0010}\u001a\b\u0012\u0002\b\u0003\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001d\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010y8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010{R.\u0010\u0088\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010~\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001\"\u0006\b\u008a\u0001\u0010\u0082\u0001R.\u0010\u008b\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008b\u0001\u0010~\u001a\u0006\b\u008c\u0001\u0010\u0080\u0001\"\u0006\b\u008d\u0001\u0010\u0082\u0001R.\u0010\u008e\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010~\u001a\u0006\b\u008f\u0001\u0010\u0080\u0001\"\u0006\b\u0090\u0001\u0010\u0082\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0095\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010vR\u0016\u0010\u0097\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010v¨\u0006\u009a\u0001"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/BabyWeightActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/BabyWeightViewModel;", "Lhj0;", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter$OnItemClickListener;", "Lu7r;", "packet", "", "handleWeightProcedure", "(Lu7r;)V", "handleUpdateInfantRes", "handleUploadChildData", "", "virtualId", "addVirtualAccount", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "startBaby", "()V", "endBaby", "registerReceivers", "unRegisterReceivers", "stepOne", "", "isSecond", "isRestore", "stepBaby", "(ZZ)V", "handleBabyWeight", "exceedMax", "showStartGuideDialog", "showAddBabyDialog", "showZeroDialog", "showTooSmallDialog", "reWeight", "showSaveWeightDialog", "did", "getAllVirtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "addVirtualAccountIcon", "(Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "url", "nickName", "account", "syncRecordToVirtualUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "", "addVirtualAccountWeightRecord", "(Ljava/lang/String;JLjava/lang/String;)V", "showGiveUpDialog", "updateVirtualUserWeightToCloud", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "", "titleID", "subTitleId", "setTitleText", "(II)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;", "event", "onEcoPacket", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnEcoPaketEvent;)V", "onCreate", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;", "refreshData", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;", "icon", "onClick", "(Lcom/xiaomi/fitness/electronic/scale/data/UserPhotoIcon;)V", "onAddUser", LifecycleConstantKt.ON_DESTROY, "featureId", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onBackPressed", "outState", "onSaveInstanceState", LifecycleConstantKt.ON_RESUME, "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "mDid", "Ljava/lang/String;", "Lcx7;", "mUpdateInfantData", "Lcx7;", "getMUpdateInfantData", "()Lcx7;", "setMUpdateInfantData", "(Lcx7;)V", "", "mFistWeight", "F", "getMFistWeight", "()F", "setMFistWeight", "(F)V", "mSecondWeight", "getMSecondWeight", "setMSecondWeight", "mDiffWeight", "getMDiffWeight", "setMDiffWeight", "mMatchNum", "I", "mDialogFlag", "mUnit", "getMUnit", "()I", "setMUnit", "(I)V", "", "uIdList", "Ljava/util/List;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "commonDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getCommonDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setCommonDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "userAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/UserPhotoAdapter;", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "userIcons", "zeroDialog", "getZeroDialog", "setZeroDialog", "smallGuideDialog", "getSmallGuideDialog", "setSmallGuideDialog", "addBabyDialog", "getAddBabyDialog", "setAddBabyDialog", "Landroid/content/BroadcastReceiver;", "bluetoothMonitorReceiver", "Landroid/content/BroadcastReceiver;", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BabyWeightActivity extends Hilt_BabyWeightActivity<BabyWeightViewModel, hj0> implements UserPhotoAdapter.OnItemClickListener {
    public static final int FLAG_ADD_DIALOG = 2;
    public static final int FLAG_SMALL_DIALOG = 1;
    public static final int FLAG_USER_DIALOG = 3;
    public static final int FLAG_ZERO_DIALOG = 0;

    @NotNull
    public static final String KEY_DIALOG_FLAG = "electronic_weight_dialog";

    @NotNull
    public static final String KEY_DID = "electronic_weight_did";

    @NotNull
    public static final String KEY_DIFF_WEIGHT = "electronic_weight_diff";

    @NotNull
    public static final String KEY_FIRST_WEIGHT = "electronic_weight_first";

    @NotNull
    public static final String KEY_IS_FINISH = "electronic_weight_finish";

    @NotNull
    public static final String KEY_MATCH_NUM = "electronic_weight_num";

    @NotNull
    public static final String KEY_SECOND_WEIGHT = "electronic_weight_second";

    @NotNull
    public static final String KEY_UNIT = "electronic_weight_unit";
    private static boolean isFinish;
    private static boolean isSyncOver;

    @Nullable
    private CommonDialog<?> addBabyDialog;

    @Nullable
    private CommonDialog<?> commonDialog;
    private volatile float mDiffWeight;
    private volatile float mFistWeight;
    private volatile int mMatchNum;
    private volatile float mSecondWeight;

    @Nullable
    private volatile cx7 mUpdateInfantData;

    @Nullable
    private CommonDialog<?> smallGuideDialog;

    @Nullable
    private UserPhotoAdapter userAdapter;

    @Nullable
    private CommonDialog<?> zeroDialog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BabyWeightActivity";
    private static final int maxWeight = 150;

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private String mDid = "";
    private volatile int mDialogFlag = -1;
    private volatile int mUnit = 1;

    @NotNull
    private volatile List<String> uIdList = new ArrayList();

    @NotNull
    private final List<Icon> userIcons = new ArrayList();

    @NotNull
    private final BroadcastReceiver bluetoothMonitorReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity$bluetoothMonitorReceiver$1
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/BabyWeightActivity$Companion;", "", "<init>", "()V", "TAG", "", "isSyncOver", "", "()Z", "setSyncOver", "(Z)V", "isFinish", "setFinish", "maxWeight", "", "getMaxWeight", "()I", "FLAG_ZERO_DIALOG", "FLAG_SMALL_DIALOG", "FLAG_ADD_DIALOG", "FLAG_USER_DIALOG", "KEY_IS_FINISH", "KEY_FIRST_WEIGHT", "KEY_SECOND_WEIGHT", "KEY_DIFF_WEIGHT", "KEY_UNIT", "KEY_DID", "KEY_MATCH_NUM", "KEY_DIALOG_FLAG", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMaxWeight() {
            return BabyWeightActivity.maxWeight;
        }

        public final boolean isFinish() {
            return BabyWeightActivity.isFinish;
        }

        public final boolean isSyncOver() {
            return BabyWeightActivity.isSyncOver;
        }

        public final void setFinish(boolean z) {
            BabyWeightActivity.isFinish = z;
        }

        public final void setSyncOver(boolean z) {
            BabyWeightActivity.isSyncOver = z;
        }
    }

    private final void addVirtualAccount(String virtualId) {
        String str = TAG;
        Logger.i(str, "handleWeight addVirtualAccount" + virtualId);
        if (this.uIdList.contains(virtualId)) {
            return;
        }
        Logger.i(str, "handleWeight addVirtualAccounted " + virtualId);
        this.uIdList.add(virtualId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addVirtualAccountIcon(String did, VirtualAccount virtualAccount) {
        String strValueOf = String.valueOf(virtualAccount.getUid());
        String strValueOf2 = String.valueOf(virtualAccount.getAccountId());
        String icon = virtualAccount.getIcon();
        String name = virtualAccount.getName();
        int sex = virtualAccount.getSex();
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(virtualAccount.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        this.userIcons.add(0, new UserPhotoIcon(did, strValueOf, strValueOf2, 0, icon, name, 0, sex, weightInfoUtil.getAge(dateToString), virtualAccount.getHeight(), null, true, 0L, false, virtualAccount, 12288, null));
        UserPhotoAdapter userPhotoAdapter = this.userAdapter;
        if (userPhotoAdapter != null) {
            userPhotoAdapter.updateData(this.userIcons);
        }
    }

    private final void addVirtualAccountWeightRecord(String url, final long virtualId, String nickName) {
        WeightManager.Companion companion = WeightManager.INSTANCE;
        companion.getInstance().addVirtualAccountWeightRecord(this.mDid, "yunmai.scales.ms3001", url, virtualId, nickName != null ? nickName : "", companion.getInstance().convertToKg(this.mDiffWeight, this.mUnit), new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.addVirtualAccountWeightRecord.3
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() {
                CommonDialog<?> commonDialog = BabyWeightActivity.this.getCommonDialog();
                if (commonDialog != null) {
                    commonDialog.dismiss();
                }
                Logger.i(BabyWeightActivity.TAG, "handleWeight add virtual user success");
                BabyWeightActivity.this.finish();
                ScalePageUtil.goVmData$default(ScalePageUtil.INSTANCE, virtualId, false, false, 6, null);
            }
        }, (128 & 128) != 0 ? System.currentTimeMillis() : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void endBaby() {
        ((BabyWeightViewModel) getMViewModel()).switchMode(this.mDid, 3, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.endBaby.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(BabyWeightActivity.TAG, "switchMode end baby error type: " + type + " code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(BabyWeightActivity.TAG, "switchMode end baby success");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void exceedMax() {
        ((hj0) getMBinding()).L.setVisibility(0);
        float fKgConvertOther = WeightManager.INSTANCE.getInstance().kgConvertOther(150.0f, this.mUnit);
        ((hj0) getMBinding()).L.setText(getResources().getString(zzi.O, String.valueOf(fKgConvertOther)) + ((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit));
        ((hj0) getMBinding()).N.setText(String.valueOf(Math.max(this.mFistWeight, this.mSecondWeight)));
        ((hj0) getMBinding()).M.setText(((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit));
        if (isFinish) {
            return;
        }
        this.handler.postDelayed(new Runnable() { // from class: kw1
            @Override // java.lang.Runnable
            public final void run() {
                BabyWeightActivity.exceedMax$lambda$11(this.f24357a);
            }
        }, 5000L);
        isFinish = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exceedMax$lambda$11(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getAllVirtualAccount(final String did) {
        Logger.i(TAG, "handleWeight getAllVirtualAccount weight : " + this.mDiffWeight);
        ((BabyWeightViewModel) getMViewModel()).getAllVirtualAccount(did, new ElectronicScaleBaseViewModel.OnVirtualAccountListener() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.getAllVirtualAccount.1
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onFailed() {
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onFinishVirtualAccount() {
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onNoVirtualAccount() {
                Logger.i(BabyWeightActivity.TAG, "handleWeight getAllVirtualAccount onNoVirtualAccount");
            }

            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
            public void onVirtualAccount(VirtualAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                BabyWeightActivity.this.addVirtualAccountIcon(did, account);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleBabyWeight() {
        if (this.mMatchNum == 0) {
            showAddBabyDialog();
            return;
        }
        if (this.mMatchNum == 1) {
            if (this.uIdList.size() > 0) {
                ((BabyWeightViewModel) getMViewModel()).getVirtualAccountByVirtualId(this.mDid, Long.parseLong(this.uIdList.get(0)), new ElectronicScaleBaseViewModel.OnVirtualAccountListener() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.handleBabyWeight.1
                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onFailed() {
                    }

                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onFinishVirtualAccount() {
                    }

                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onNoVirtualAccount() {
                        BabyWeightActivity.this.showSaveWeightDialog();
                        BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                        babyWeightActivity.getAllVirtualAccount(babyWeightActivity.mDid);
                        Logger.i(BabyWeightActivity.TAG, "handleWeight onNoVirtualAccount it ： " + BabyWeightActivity.this.uIdList.get(0));
                        ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).delVirtualUserToDevice(MiAccountManager.INSTANCE.getInstance().getMiId(), Long.parseLong((String) BabyWeightActivity.this.uIdList.get(0)), BabyWeightActivity.this.mDid, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity$handleBabyWeight$1$onNoVirtualAccount$1
                            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                            public void onError(String did, int type, int code) {
                                Logger.i(BabyWeightActivity.TAG, "delVirtualUserToDevice error it " + type + "  " + code);
                            }

                            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                            public void onSuccess(String did, int type, EcoSyncResult result) {
                                Logger.i(BabyWeightActivity.TAG, "delVirtualUserToDevice success it " + (result != null ? result.getPacket() : null));
                            }
                        });
                    }

                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                    public void onVirtualAccount(VirtualAccount account) {
                        Intrinsics.checkNotNullParameter(account, "account");
                        BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                        babyWeightActivity.syncRecordToVirtualUser(babyWeightActivity.mDid, account.getIcon(), (String) BabyWeightActivity.this.uIdList.get(0), account.getName(), account);
                    }
                });
                return;
            }
            Logger.i(TAG, "handleWeight uIdList == 0");
            showSaveWeightDialog();
            getAllVirtualAccount(this.mDid);
            return;
        }
        if (this.mMatchNum > 1) {
            Logger.i(TAG, "handleWeight mMatchNum > 1");
            this.mDialogFlag = 3;
            showSaveWeightDialog();
            getAllVirtualAccount(this.mDid);
        }
    }

    private final void handleUpdateInfantRes(u7r packet) {
        if (isFinish) {
            return;
        }
        cx7 cx7VarT = packet.t().t();
        this.mUpdateInfantData = cx7VarT;
        float f = 10;
        this.mFistWeight = cx7VarT.c / f;
        this.mSecondWeight = cx7VarT.d / f;
        this.mDiffWeight = cx7VarT.e / f;
        if (this.mFistWeight == 0.0f && this.mSecondWeight == 0.0f && this.mDiffWeight == 0.0f) {
            ToastUtil.showToast(getString(zzi.y4));
            finish();
            return;
        }
        this.mUnit = cx7VarT.f;
        WeightManager.Companion companion = WeightManager.INSTANCE;
        float fConvertToKg = companion.getInstance().convertToKg(this.mFistWeight, this.mUnit);
        int i = maxWeight;
        if (fConvertToKg > i || companion.getInstance().convertToKg(this.mSecondWeight, this.mUnit) > i) {
            this.handler.post(new Runnable() { // from class: ow1
                @Override // java.lang.Runnable
                public final void run() {
                    BabyWeightActivity.handleUpdateInfantRes$lambda$4(this.f29747a);
                }
            });
        } else if (this.mSecondWeight == 0.0f) {
            this.handler.post(new Runnable() { // from class: pw1
                @Override // java.lang.Runnable
                public final void run() {
                    BabyWeightActivity.handleUpdateInfantRes$lambda$5(this.f30840a);
                }
            });
        } else {
            this.handler.post(new Runnable() { // from class: qw1
                @Override // java.lang.Runnable
                public final void run() {
                    BabyWeightActivity.handleUpdateInfantRes$lambda$6(this.f31898a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleUpdateInfantRes$lambda$4(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.exceedMax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleUpdateInfantRes$lambda$5(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stepBaby(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleUpdateInfantRes$lambda$6(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stepBaby(true, false);
    }

    private final void handleUploadChildData(u7r packet) {
        kx7 kx7Var;
        String str = TAG;
        Logger.i(str, "handleWeight UPLOAD_CHILD_DATA");
        ww7 ww7VarT = packet.t();
        Long lValueOf = null;
        tw7 tw7VarQ = ww7VarT != null ? ww7VarT.q() : null;
        Logger.i(str, " handleWeight matchNum " + this.mMatchNum);
        if (tw7VarQ != null && (kx7Var = tw7VarQ.d) != null) {
            lValueOf = Long.valueOf(kx7Var.c);
        }
        Intrinsics.checkNotNull(lValueOf);
        addVirtualAccount(String.valueOf(lValueOf.longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleWeightProcedure(u7r packet) {
        final float f = packet.t().w().c / 10;
        Logger.i(TAG, "handleWeight handleWeightProcedure " + packet.t().w());
        if (WeightManager.INSTANCE.getInstance().convertToKg(f, this.mUnit) > maxWeight) {
            this.handler.post(new Runnable() { // from class: fw1
                @Override // java.lang.Runnable
                public final void run() {
                    BabyWeightActivity.handleWeightProcedure$lambda$3(this.f18308a, f);
                }
            });
        } else {
            if (isFinish) {
                return;
            }
            ((hj0) getMBinding()).L.setVisibility(8);
            ((hj0) getMBinding()).N.setText(String.valueOf(f));
            ((hj0) getMBinding()).M.setText(((BabyWeightViewModel) getMViewModel()).getUnitString(packet.t().w().d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleWeightProcedure$lambda$3(BabyWeightActivity this$0, float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mFistWeight = f;
        this$0.exceedMax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            this.mUnit = getIntent().getIntExtra("unit", 1);
            String stringExtra = getIntent().getStringExtra("did");
            Intrinsics.checkNotNull(stringExtra);
            this.mDid = stringExtra;
            if (this.mUnit < 1) {
                ((BabyWeightViewModel) getMViewModel()).getWeightUnit(this.mDid, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.initView.1
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.e(BabyWeightActivity.TAG, "getWeightUnit onOnError  did : " + did + " , type : " + type + " , code : " + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    @SuppressLint({"SetTextI18n"})
                    public void onSuccess(String did, int type, EcoSyncResult result) {
                        u7r packet;
                        ww7 ww7VarT;
                        qw7 qw7VarO;
                        Integer numValueOf = null;
                        Logger.i(BabyWeightActivity.TAG, "getWeightUnit success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
                        BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                        if (result != null && (packet = result.getPacket()) != null && (ww7VarT = packet.t()) != null && (qw7VarO = ww7VarT.o()) != null) {
                            numValueOf = Integer.valueOf(qw7VarO.c);
                        }
                        Intrinsics.checkNotNull(numValueOf);
                        babyWeightActivity.setMUnit(numValueOf.intValue());
                        BabyWeightActivity.this.stepOne();
                    }
                });
            } else {
                stepOne();
            }
            ((BabyWeightViewModel) getMViewModel()).initVirtualAccount(this.mDid);
            showStartGuideDialog();
        } else {
            this.mUnit = savedInstanceState.getInt("electronic_weight_unit");
            String string = savedInstanceState.getString("electronic_weight_did");
            Intrinsics.checkNotNull(string);
            this.mDid = string;
            isFinish = savedInstanceState.getBoolean("electronic_weight_finish");
            this.mFistWeight = savedInstanceState.getFloat(KEY_FIRST_WEIGHT);
            this.mSecondWeight = savedInstanceState.getFloat(KEY_SECOND_WEIGHT);
            this.mDiffWeight = savedInstanceState.getFloat(KEY_DIFF_WEIGHT);
            this.mDialogFlag = savedInstanceState.getInt("electronic_weight_dialog");
            ((BabyWeightViewModel) getMViewModel()).initVirtualAccount(this.mDid);
            WeightManager.Companion companion = WeightManager.INSTANCE;
            float fConvertToKg = companion.getInstance().convertToKg(this.mFistWeight, this.mUnit);
            int i = maxWeight;
            if (fConvertToKg > i || companion.getInstance().convertToKg(this.mSecondWeight, this.mUnit) > i) {
                this.handler.post(new Runnable() { // from class: sw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BabyWeightActivity.initView$lambda$7(this.f34046a);
                    }
                });
            } else if (this.mFistWeight == 0.0f) {
                stepOne();
            } else if (this.mSecondWeight == 0.0f) {
                this.handler.post(new Runnable() { // from class: tw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BabyWeightActivity.initView$lambda$8(this.f35118a);
                    }
                });
            } else {
                this.handler.post(new Runnable() { // from class: gw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BabyWeightActivity.initView$lambda$9(this.f19384a);
                    }
                });
            }
        }
        ((hj0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: hw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BabyWeightActivity.initView$lambda$10(this.f20530a, view);
            }
        });
        ViewGroup.LayoutParams layoutParams = ((hj0) getMBinding()).D.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = DisplayUtil.getStatusBarHeight();
        ((hj0) getMBinding()).D.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(BabyWeightActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.endBaby();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$7(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.exceedMax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$8(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stepBaby(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(BabyWeightActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stepBaby(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacket$lambda$0(BabyWeightActivity this$0, ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        u7r packet = event.getPacket();
        Intrinsics.checkNotNull(packet);
        this$0.handleWeightProcedure(packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacket$lambda$1(BabyWeightActivity this$0, ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        u7r packet = event.getPacket();
        Intrinsics.checkNotNull(packet);
        this$0.handleUpdateInfantRes(packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEcoPacket$lambda$2(BabyWeightActivity this$0, ScaleEventBusIds.OnEcoPaketEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        u7r packet = event.getPacket();
        Intrinsics.checkNotNull(packet);
        this$0.handleUploadChildData(packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reWeight() {
        isSyncOver = false;
        isFinish = false;
        this.mUpdateInfantData = null;
        this.mFistWeight = 0.0f;
        this.mSecondWeight = 0.0f;
        this.mDiffWeight = 0.0f;
        this.mMatchNum = 0;
        this.uIdList.clear();
        stepOne();
        startBaby();
    }

    private final void registerReceivers() {
        ld8.c().p(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.bluetoothMonitorReceiver, intentFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTitleText(int titleID, int subTitleId) {
        ((hj0) getMBinding()).K.setText(getString(titleID));
        ((hj0) getMBinding()).J.setText(getString(subTitleId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showAddBabyDialog() {
        this.mDialogFlag = 2;
        CommonDialog<?> commonDialog = this.addBabyDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("guide_baby_add_baby").setDialogTitle(new DialogParams.DialogDescriptionString(zzi.Q, this.mDiffWeight + ((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit))).setDialogDescription(zzi.P).setPositiveText(zzi.Q0).setNegativeText(zzi.f1).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        this.addBabyDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.showAddBabyDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which != -3) {
                        if (which == -2) {
                            BabyWeightActivity.this.mDialogFlag = -1;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            BabyWeightActivity.this.reWeight();
                            return;
                        }
                        if (which != -1) {
                            return;
                        }
                    }
                    BabyWeightActivity.this.mDialogFlag = -1;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    BabyWeightActivity.this.showSaveWeightDialog();
                    BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                    babyWeightActivity.getAllVirtualAccount(babyWeightActivity.mDid);
                }
            });
        }
        CommonDialog<?> commonDialog2 = this.addBabyDialog;
        if (commonDialog2 != null) {
            commonDialog2.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showGiveUpDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("guide_give_up").setDialogDescription(zzi.h1).setPositiveText(zzi.f1).setNegativeText(zzi.f41831b).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.showGiveUpDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        BabyWeightActivity.this.showSaveWeightDialog();
                        BabyWeightActivity babyWeightActivity = BabyWeightActivity.this;
                        babyWeightActivity.getAllVirtualAccount(babyWeightActivity.mDid);
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                BabyWeightActivity.this.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSaveWeightDialog() {
        this.mDialogFlag = 3;
        CommonDialog<?> commonDialog = this.commonDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        this.userIcons.clear();
        this.userIcons.add(new AddUserIcon("", lni.A, getString(zzi.F)));
        UserPhotoAdapter userPhotoAdapter = new UserPhotoAdapter(this.userIcons);
        this.userAdapter = userPhotoAdapter;
        Intrinsics.checkNotNull(userPhotoAdapter);
        userPhotoAdapter.setOnItemClickListener(this);
        View viewInflate = LayoutInflater.from(this).inflate(gui.v0, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(bri.O0);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(this.userAdapter);
        this.commonDialog = new CommonDialog.c(WeightActivity.SAVE_WEIGHT).setDialogTitle(zzi.u5).setCustomView(viewInflate).setCanceledOnBackPressed(true).setCanceledOnTouchOutside(true).create();
        Logger.i(TAG, "handleWeight shouldPop commonDialog");
        CommonDialog<?> commonDialog2 = this.commonDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
        viewInflate.postDelayed(new Runnable() { // from class: rw1
            @Override // java.lang.Runnable
            public final void run() {
                BabyWeightActivity.showSaveWeightDialog$lambda$13(this.f32957a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaveWeightDialog$lambda$13(final BabyWeightActivity this$0) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.commonDialog;
        if (commonDialog == null || (dialog = commonDialog.getDialog()) == null) {
            return;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: jw1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BabyWeightActivity.showSaveWeightDialog$lambda$13$lambda$12(this.f23196a, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaveWeightDialog$lambda$13$lambda$12(BabyWeightActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showGiveUpDialog();
    }

    private final void showStartGuideDialog() {
        final String str = ElectronicScalePreference.SCALE_RECORD_BABY_GUIDE_KEY + this.mDid;
        if (ElectronicScalePreference.getBoolean(str, false)) {
            startBaby();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("guide_baby_weigh").setDialogDescription(zzi.U).setPositiveText(zzi.V).setNegativeText(zzi.W).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.showStartGuideDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        ElectronicScalePreference.putBoolean(str, true);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        BabyWeightActivity.this.startBaby();
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                BabyWeightActivity.this.startBaby();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showTooSmallDialog() {
        this.mDialogFlag = 1;
        CommonDialog<?> commonDialog = this.smallGuideDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("guide_baby_small").setDialogTitle(new DialogParams.DialogDescriptionString(zzi.S, this.mDiffWeight + ((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit))).setDialogDescription(zzi.R).setPositiveText(zzi.H0).setNegativeText(zzi.P4).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        this.smallGuideDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.showTooSmallDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which != -3) {
                        if (which == -2) {
                            BabyWeightActivity.this.mDialogFlag = -1;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            BabyWeightActivity.this.reWeight();
                            return;
                        }
                        if (which != -1) {
                            return;
                        }
                    }
                    BabyWeightActivity.this.mDialogFlag = -1;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    BabyWeightActivity.this.handleBabyWeight();
                }
            });
        }
        CommonDialog<?> commonDialog2 = this.smallGuideDialog;
        if (commonDialog2 != null) {
            commonDialog2.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showZeroDialog() {
        this.mDialogFlag = 0;
        CommonDialog<?> commonDialog = this.zeroDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        String str = this.mDiffWeight + ((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit) + "\n" + getString(zzi.i4);
        View viewInflate = LayoutInflater.from(this).inflate(gui.t0, (ViewGroup) null);
        String string = getString(zzi.S);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView = (TextView) viewInflate.findViewById(bri.I5);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        textView.setText(str2);
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("guide_baby_zero").setCustomView(viewInflate).setPositiveText(zzi.P4).setNegativeText(zzi.common_exit).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        this.zeroDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.showZeroDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which != -3) {
                        if (which == -2) {
                            BabyWeightActivity.this.mDialogFlag = -1;
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            BabyWeightActivity.this.finish();
                            return;
                        }
                        if (which != -1) {
                            return;
                        }
                    }
                    BabyWeightActivity.this.mDialogFlag = -1;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    BabyWeightActivity.this.reWeight();
                }
            });
        }
        CommonDialog<?> commonDialog2 = this.zeroDialog;
        if (commonDialog2 != null) {
            commonDialog2.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startBaby() {
        ((BabyWeightViewModel) getMViewModel()).switchMode(this.mDid, 1, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.startBaby.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                ToastUtil.showToast(BabyWeightActivity.this.getString(zzi.N));
                BabyWeightActivity.this.finish();
                Logger.i(BabyWeightActivity.TAG, "switchMode baby error type: " + type + " code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                Logger.i(BabyWeightActivity.TAG, "switchMode baby success");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void stepBaby(boolean isSecond, boolean isRestore) {
        setTitleText(zzi.T, zzi.M);
        ((hj0) getMBinding()).L.setVisibility(8);
        if (this.mUpdateInfantData == null && !isRestore) {
            ((hj0) getMBinding()).N.setText("0.0");
        } else if (isSecond) {
            ((hj0) getMBinding()).N.setText(String.valueOf(this.mDiffWeight));
        } else {
            ((hj0) getMBinding()).N.setText(String.valueOf(this.mFistWeight));
        }
        ((hj0) getMBinding()).B.setText("2");
        ((hj0) getMBinding()).G.setImageResource(lni.f25247r);
        ((hj0) getMBinding()).M.setText(((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit));
        ((hj0) getMBinding()).L.setVisibility(8);
        if (isSecond) {
            isFinish = true;
            if (!isRestore) {
                if (this.mDiffWeight == 0.0f) {
                    showZeroDialog();
                    return;
                } else if (WeightManager.INSTANCE.getInstance().convertToKg(this.mDiffWeight, this.mUnit) < 1.0f) {
                    showTooSmallDialog();
                    return;
                } else {
                    handleBabyWeight();
                    return;
                }
            }
            if (this.mDialogFlag == 0) {
                showZeroDialog();
                return;
            }
            if (this.mDialogFlag == 1) {
                showTooSmallDialog();
                return;
            }
            if (this.mDialogFlag == 3) {
                showSaveWeightDialog();
                getAllVirtualAccount(this.mDid);
            } else if (this.mDialogFlag == 2) {
                showAddBabyDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stepOne() {
        setTitleText(zzi.H, zzi.G);
        ((hj0) getMBinding()).L.setVisibility(8);
        if (this.mUpdateInfantData == null) {
            ((hj0) getMBinding()).N.setText("0.0");
        } else {
            ((hj0) getMBinding()).N.setText(String.valueOf(this.mFistWeight));
        }
        ((hj0) getMBinding()).B.setText("1");
        ((hj0) getMBinding()).G.setImageResource(lni.q);
        ((hj0) getMBinding()).M.setText(((BabyWeightViewModel) getMViewModel()).getUnitString(this.mUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncRecordToVirtualUser(String did, String url, String virtualId, String nickName, VirtualAccount account) {
        if (isSyncOver) {
            return;
        }
        isSyncOver = true;
        addVirtualAccountWeightRecord(url, Long.parseLong(virtualId), nickName);
        t48.c().e(Long.valueOf(Long.parseLong(virtualId)), (int) (WeightManager.INSTANCE.getInstance().convertToKg(this.mDiffWeight, this.mUnit) * 10));
        BabyWeightViewModel babyWeightViewModel = (BabyWeightViewModel) getMViewModel();
        long j = Long.parseLong(virtualId);
        float f = this.mDiffWeight;
        int i = this.mUnit;
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(account.getBirth(), "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        babyWeightViewModel.updateVirtualUserToDeviceNew(j, did, f, i, weightInfoUtil.getAge(dateToString), account.getSex(), account.getHeight(), new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity.syncRecordToVirtualUser.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(BabyWeightActivity.TAG, "handleWeight updateVirtualUserToDevice " + type + " " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(BabyWeightActivity.TAG, "handleWeight updateVirtualUserToDevice user success " + (result != null ? result.getPacket() : null));
            }
        });
        updateVirtualUserWeightToCloud(account);
    }

    private final void unRegisterReceivers() {
        unregisterReceiver(this.bluetoothMonitorReceiver);
        ld8.c().r(this);
    }

    private final void updateVirtualUserWeightToCloud(final VirtualAccount account) {
        Logger.i(TAG, "updateVirtualUserWeightToCloud");
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: iw1
            @Override // java.lang.Runnable
            public final void run() {
                BabyWeightActivity.updateVirtualUserWeightToCloud$lambda$17(this.f22155a, account);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void updateVirtualUserWeightToCloud$lambda$17(BabyWeightActivity this$0, VirtualAccount account) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(account, "$account");
        ((BabyWeightViewModel) this$0.getMViewModel()).modifyVirtualAccount(String.valueOf(account.getAccountId()), account.getName(), account.getIcon(), account.getSex(), account.getHeight(), WeightManager.INSTANCE.getInstance().convertToKg(this$0.mDiffWeight, this$0.mUnit), account.getBirth(), null);
    }

    @Nullable
    public final CommonDialog<?> getAddBabyDialog() {
        return this.addBabyDialog;
    }

    @Nullable
    public final CommonDialog<?> getCommonDialog() {
        return this.commonDialog;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.c;
    }

    public final float getMDiffWeight() {
        return this.mDiffWeight;
    }

    public final float getMFistWeight() {
        return this.mFistWeight;
    }

    public final float getMSecondWeight() {
        return this.mSecondWeight;
    }

    public final int getMUnit() {
        return this.mUnit;
    }

    @Nullable
    public final cx7 getMUpdateInfantData() {
        return this.mUpdateInfantData;
    }

    @Nullable
    public final CommonDialog<?> getSmallGuideDialog() {
        return this.smallGuideDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Nullable
    public final CommonDialog<?> getZeroDialog() {
        return this.zeroDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter.OnItemClickListener
    public void onAddUser(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (((BabyWeightViewModel) getMViewModel()).getVirtualUserCount() >= ((BabyWeightViewModel) getMViewModel()).getVirtualUserMax()) {
            ToastUtil.showShortToast(getResources().getString(zzi.W3));
            return;
        }
        UserAddActivity.INSTANCE.start(this, new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null), 0, this.mDid, (FileUtils.S_IRWXU & 16) != 0 ? 0.0f : this.mDiffWeight, (FileUtils.S_IRWXU & 32) != 0 ? 1 : this.mUnit, (FileUtils.S_IRWXU & 64) != 0 ? false : false, (FileUtils.S_IRWXU & 128) != 0 ? null : null, (FileUtils.S_IRWXU & 256) != 0 ? false : false);
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        endBaby();
        super.lambda$onCreate$0();
    }

    @Override // com.xiaomi.fitness.electronic.scale.adapter.UserPhotoAdapter.OnItemClickListener
    public void onClick(@NotNull UserPhotoIcon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        String did = icon.getDid();
        String url = icon.getUrl();
        String virtualId = icon.getVirtualId();
        String nickName = icon.getNickName();
        VirtualAccount virtualAccount = icon.getVirtualAccount();
        Intrinsics.checkNotNull(virtualAccount);
        syncRecordToVirtualUser(did, url, virtualId, nickName, virtualAccount);
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_BabyWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitle("");
        initView(savedInstanceState);
        registerReceivers();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_BabyWeightActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unRegisterReceivers();
        this.handler.removeCallbacksAndMessages(null);
        isSyncOver = false;
        isFinish = false;
        ScaleUtil.INSTANCE.setInWeight(false);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onEcoPacket(@NotNull final ScaleEventBusIds.OnEcoPaketEvent event) {
        vw7 vw7VarW;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = TAG;
        Logger.i(str, "onEcoPacket");
        if (!Intrinsics.areEqual(this.mDid, event.getDid()) || isDestroyed()) {
            Logger.i(str, "use scale error mDid : " + this.mDid + " , did : " + event.getDid());
            return;
        }
        u7r packet = event.getPacket();
        if (packet != null && packet.f == 13) {
            isSyncOver = false;
            u7r packet2 = event.getPacket();
            Intrinsics.checkNotNull(packet2);
            ww7 ww7VarT = packet2.t();
            Integer numValueOf = (ww7VarT == null || (vw7VarW = ww7VarT.w()) == null) ? null : Integer.valueOf(vw7VarW.f);
            Intrinsics.checkNotNull(numValueOf);
            this.mMatchNum = numValueOf.intValue();
            this.handler.post(new Runnable() { // from class: lw1
                @Override // java.lang.Runnable
                public final void run() {
                    BabyWeightActivity.onEcoPacket$lambda$0(this.f25483a, event);
                }
            });
        }
        u7r packet3 = event.getPacket();
        if (packet3 != null && packet3.f == 9) {
            this.handler.post(new Runnable() { // from class: mw1
                @Override // java.lang.Runnable
                public final void run() {
                    BabyWeightActivity.onEcoPacket$lambda$1(this.f27274a, event);
                }
            });
        }
        u7r packet4 = event.getPacket();
        if (packet4 == null || packet4.f != 16) {
            return;
        }
        this.handler.post(new Runnable() { // from class: nw1
            @Override // java.lang.Runnable
            public final void run() {
                BabyWeightActivity.onEcoPacket$lambda$2(this.f28494a, event);
            }
        });
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onMenuItemSelected(featureId, item);
        }
        endBaby();
        finish();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EcoDataHandlerHelper.INSTANCE.updateDataHandler();
        ScaleUtil.INSTANCE.setInWeight(true);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("electronic_weight_finish", isFinish);
        outState.putFloat(KEY_FIRST_WEIGHT, this.mFistWeight);
        outState.putFloat(KEY_SECOND_WEIGHT, this.mSecondWeight);
        outState.putFloat(KEY_DIFF_WEIGHT, this.mDiffWeight);
        outState.putInt("electronic_weight_unit", this.mUnit);
        outState.putString("electronic_weight_did", this.mDid);
        outState.putInt(KEY_MATCH_NUM, this.mMatchNum);
        outState.putInt("electronic_weight_dialog", this.mDialogFlag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshData(@NotNull ScaleEventBusIds.OnUserAddEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.i(TAG, "handleWeight add virtual user success " + event.getVId());
        Long vId = event.getVId();
        if (vId != null) {
            ((BabyWeightViewModel) getMViewModel()).getVirtualAccountByVirtualId(this.mDid, vId.longValue(), new ElectronicScaleBaseViewModel.OnVirtualAccountListener() { // from class: com.xiaomi.fitness.electronic.scale.BabyWeightActivity$refreshData$1$1
                @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                public void onFailed() {
                }

                @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                public void onFinishVirtualAccount() {
                }

                @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                public void onNoVirtualAccount() {
                    Logger.i(BabyWeightActivity.TAG, "handleWeight refreshData onNoVirtualAccount");
                }

                @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnVirtualAccountListener
                public void onVirtualAccount(VirtualAccount account) {
                    Intrinsics.checkNotNullParameter(account, "account");
                    BabyWeightActivity babyWeightActivity = this.this$0;
                    babyWeightActivity.addVirtualAccountIcon(babyWeightActivity.mDid, account);
                }
            });
        }
    }

    public final void setAddBabyDialog(@Nullable CommonDialog<?> commonDialog) {
        this.addBabyDialog = commonDialog;
    }

    public final void setCommonDialog(@Nullable CommonDialog<?> commonDialog) {
        this.commonDialog = commonDialog;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setMDiffWeight(float f) {
        this.mDiffWeight = f;
    }

    public final void setMFistWeight(float f) {
        this.mFistWeight = f;
    }

    public final void setMSecondWeight(float f) {
        this.mSecondWeight = f;
    }

    public final void setMUnit(int i) {
        this.mUnit = i;
    }

    public final void setMUpdateInfantData(@Nullable cx7 cx7Var) {
        this.mUpdateInfantData = cx7Var;
    }

    public final void setSmallGuideDialog(@Nullable CommonDialog<?> commonDialog) {
        this.smallGuideDialog = commonDialog;
    }

    public final void setZeroDialog(@Nullable CommonDialog<?> commonDialog) {
        this.zeroDialog = commonDialog;
    }
}
