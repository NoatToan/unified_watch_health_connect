package com.xiaomi.fitness.electronic.scale;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.electronic.scale.UserAddActivity;
import com.xiaomi.fitness.electronic.scale.adapter.HeightAdapter;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.dialog.FloatNumberPickerDialog;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.UserManageViewModel;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.ScalePageUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.electronic.scale.widget.ElectronicScaleSingleChoiceDialog;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.av1;
import defpackage.av6;
import defpackage.b6l;
import defpackage.bg4;
import defpackage.bri;
import defpackage.eji;
import defpackage.f4b;
import defpackage.ff2;
import defpackage.gui;
import defpackage.kb;
import defpackage.ld8;
import defpackage.nk0;
import defpackage.qal;
import defpackage.t48;
import defpackage.uno;
import defpackage.wc0;
import defpackage.yaa;
import defpackage.zee;
import defpackage.zp5;
import defpackage.zzi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import miuix.androidbasewidget.widget.EditText;
import miuix.pickerwidget.widget.DatePicker;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_ADD)
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 z2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001zB\u0007¢\u0006\u0004\by\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u0007J\u0019\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0007J'\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0007J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H\u0014¢\u0006\u0004\b0\u0010\u0007J\u0017\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010;\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001e\u0010>\u001a\n =*\u0004\u0018\u00010<0<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010E\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bD\u0010:R\u001b\u0010H\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010\u000bR\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010O\u001a\u0004\u0018\u00010K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010NR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010V\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bU\u0010:R\u001d\u0010Z\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u00108\u001a\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u00108\u001a\u0004\b\\\u0010\u0016R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00106R\u0014\u0010h\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\bo\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\bs\u0010nR\u0016\u0010t\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010nR\u0014\u0010v\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010:R\u0014\u0010x\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010:¨\u0006{"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/UserAddActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/model/UserManageViewModel;", "Lnk0;", "Lyaa;", "", "initInfo", "()V", "initView", "", "getPreSelectedWeight", "()F", "", "selectValue", "", "birthStr", "", CardUIInfo.KEY_SUBTITILE, "teenagerTipDialog", "(JLjava/lang/String;I)V", "", "isAddBtnDisable", "()Z", "haveNoUserWeight", "gender", "isInit", "setSex", "(IZ)V", "save", "saveVirtualAccount", "addVirtualAccount", "modifyVirtualAccount", "showGiveUpDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "updateSaveBtnEnableStatus", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "onBackPressed", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;", "event", "onBodyCompositionSDKMeasure", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;)V", "saveBtnIsEnabled", "Z", "pageFrom$delegate", "Lkotlin/Lazy;", "getPageFrom", "()I", "pageFrom", "Lorg/joda/time/LocalDate;", "kotlin.jvm.PlatformType", "curDate", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", SceneRecogBroadcastReceiver.FROM_USER, "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "pageType$delegate", "getPageType", "pageType", "userWeightSourceTranFromOtherPage$delegate", "getUserWeightSourceTranFromOtherPage", "userWeightSourceTranFromOtherPage", "userWeight", "F", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResult$delegate", "getWeightResult", "()Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResult", "", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "weightRecordList", "Ljava/util/List;", "weightUnit$delegate", "getWeightUnit", "weightUnit", "deviceId$delegate", "getDeviceId", "()Ljava/lang/String;", "deviceId", "isConfirmInfo$delegate", "isConfirmInfo", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "timeOutRunnable", "Ljava/lang/Runnable;", "showNoBodyFatErrorDialog", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "mHeightDialog", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "REQ_GENDER", "I", "REQ_HEIGHT", "Lcom/xiaomi/fitness/electronic/scale/widget/ElectronicScaleSingleChoiceDialog;", "mGenderDialog", "Lcom/xiaomi/fitness/electronic/scale/widget/ElectronicScaleSingleChoiceDialog;", "REQ_WEIGHT", "miAccountAge", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUserAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAddActivity.kt\ncom/xiaomi/fitness/electronic/scale/UserAddActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1011:1\n1062#2:1012\n1062#2:1013\n*S KotlinDebug\n*F\n+ 1 UserAddActivity.kt\ncom/xiaomi/fitness/electronic/scale/UserAddActivity\n*L\n227#1:1012\n284#1:1013\n*E\n"})
public final class UserAddActivity extends Hilt_UserAddActivity<UserManageViewModel, nk0> implements yaa {
    public static final int ADD_NEW_USER = 0;
    public static final int ADD_VIRTUAL_MEMBER = 1;
    public static final int CODE_ADD_FAILED = 100120003;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final float DEFAULT_SELECTED_USER_WEIGHT = 60.0f;

    @NotNull
    public static final String KEY_CONFIRM_INFO = "KEY_CONFIRM_INFO";

    @NotNull
    public static final String KEY_PAGE_DID = "KEY_PAGE_DID";

    @NotNull
    public static final String KEY_PAGE_TYPE = "KEY_PAGE_TYPE";

    @NotNull
    public static final String KEY_PAGE_UNIT = "KEY_PAGE_UNIT";

    @NotNull
    public static final String KEY_PAGE_WEIGHT = "KEY_PAGE_WEIGHT";

    @NotNull
    public static final String KEY_PAGE_WEIGHT_LIST = "KEY_PAGE_WEIGHT_LIST";

    @NotNull
    public static final String KEY_USER = "KEY_USER";

    @NotNull
    public static final String KEY_WEIGHT_RESULT = "KEY_WEIGHT_RESULT";
    public static final int MODIFY_VIRTUAL_MEMBER = 2;
    public static final int REQUEST_CODE_ADD_USER = 100;

    @NotNull
    public static final String TO_DATA_DISPLAY_PAGE = "toDataDisplayPage";

    @NotNull
    public static final String USER_NAME = "USER_NAME";

    @Nullable
    private ElectronicScaleSingleChoiceDialog mGenderDialog;

    @Nullable
    private PickerDialog mHeightDialog;
    private int miAccountAge;
    private boolean saveBtnIsEnabled;
    private volatile boolean showNoBodyFatErrorDialog;
    private VirtualAccount user;
    private float userWeight;

    @Nullable
    private List<ClaimRecord> weightRecordList;

    /* JADX INFO: renamed from: pageFrom$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageFrom = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: neq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(UserAddActivity.pageFrom_delegate$lambda$0(this.f27867a));
        }
    });
    private LocalDate curDate = LocalDate.now();

    /* JADX INFO: renamed from: pageType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageType = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oeq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(UserAddActivity.pageType_delegate$lambda$1(this.f29087a));
        }
    });

    /* JADX INFO: renamed from: userWeightSourceTranFromOtherPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userWeightSourceTranFromOtherPage = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: peq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Float.valueOf(UserAddActivity.userWeightSourceTranFromOtherPage_delegate$lambda$2(this.f30329a));
        }
    });

    /* JADX INFO: renamed from: weightResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qeq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserAddActivity.weightResult_delegate$lambda$3(this.f31448a);
        }
    });

    /* JADX INFO: renamed from: weightUnit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightUnit = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: req
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(UserAddActivity.weightUnit_delegate$lambda$4(this.f32475a));
        }
    });

    /* JADX INFO: renamed from: deviceId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: seq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserAddActivity.deviceId_delegate$lambda$5(this.f33571a);
        }
    });

    /* JADX INFO: renamed from: isConfirmInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isConfirmInfo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: teq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(UserAddActivity.isConfirmInfo_delegate$lambda$6(this.f34627a));
        }
    });

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private final Runnable timeOutRunnable = new Runnable() { // from class: ueq
        @Override // java.lang.Runnable
        public final void run() {
            UserAddActivity.timeOutRunnable$lambda$7(this.f35694a);
        }
    };

    @NotNull
    private final String TAG = "UserAddActivity";
    private final int REQ_GENDER = 10;
    private final int REQ_HEIGHT = 20;
    private final int REQ_WEIGHT = 2;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JZ\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\"JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/UserAddActivity$Companion;", "", "<init>", "()V", "KEY_PAGE_TYPE", "", "ADD_NEW_USER", "", "ADD_VIRTUAL_MEMBER", "MODIFY_VIRTUAL_MEMBER", "CODE_ADD_FAILED", UserAddActivity.KEY_USER, UserAddActivity.KEY_PAGE_WEIGHT, UserAddActivity.KEY_WEIGHT_RESULT, UserAddActivity.KEY_PAGE_WEIGHT_LIST, UserAddActivity.KEY_PAGE_DID, UserAddActivity.KEY_PAGE_UNIT, "TO_DATA_DISPLAY_PAGE", UserAddActivity.KEY_CONFIRM_INFO, UserAddActivity.USER_NAME, "REQUEST_CODE_ADD_USER", "DEFAULT_SELECTED_USER_WEIGHT", "", StatConstants.PARAM_START, "", "context", "Landroid/content/Context;", SceneRecogBroadcastReceiver.FROM_USER, "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "pageType", "mDid", "mWeight", "mUnit", UserAddActivity.TO_DATA_DISPLAY_PAGE, "", "weightResult", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "isConfirmInfo", "Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsActivity;", "list", "", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @NotNull VirtualAccount user, int pageType, @NotNull String mDid, float mWeight, int mUnit, boolean toDataDisplayPage, @Nullable WeightResult weightResult, boolean isConfirmInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(mDid, "mDid");
            Intent intent = new Intent(context, (Class<?>) UserAddActivity.class);
            intent.putExtra("KEY_PAGE_TYPE", pageType);
            intent.putExtra(UserAddActivity.KEY_USER, user);
            intent.putExtra(UserAddActivity.KEY_PAGE_DID, mDid);
            intent.putExtra(UserAddActivity.KEY_PAGE_WEIGHT, mWeight);
            intent.putExtra(UserAddActivity.KEY_WEIGHT_RESULT, weightResult);
            intent.putExtra(UserAddActivity.KEY_PAGE_UNIT, mUnit);
            intent.putExtra(UserAddActivity.TO_DATA_DISPLAY_PAGE, toDataDisplayPage);
            intent.putExtra(UserAddActivity.KEY_CONFIRM_INFO, isConfirmInfo);
            context.startActivity(intent);
        }

        public final void start(@NotNull ClaimRecordsActivity context, @NotNull VirtualAccount user, int pageType, @NotNull String mDid, @NotNull List<ClaimRecord> list, int mUnit, boolean toDataDisplayPage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(mDid, "mDid");
            Intrinsics.checkNotNullParameter(list, "list");
            Intent intent = new Intent(context, (Class<?>) UserAddActivity.class);
            intent.putExtra("KEY_PAGE_TYPE", pageType);
            intent.putExtra(UserAddActivity.KEY_USER, user);
            intent.putExtra(UserAddActivity.KEY_PAGE_DID, mDid);
            intent.putParcelableArrayListExtra(UserAddActivity.KEY_PAGE_WEIGHT_LIST, (ArrayList) list);
            intent.putExtra(UserAddActivity.KEY_PAGE_UNIT, mUnit);
            intent.putExtra(UserAddActivity.TO_DATA_DISPLAY_PAGE, toDataDisplayPage);
            context.startActivityForResult(intent, 100);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ nk0 access$getMBinding(UserAddActivity userAddActivity) {
        return (nk0) userAddActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserManageViewModel access$getMViewModel(UserAddActivity userAddActivity) {
        return (UserManageViewModel) userAddActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addVirtualAccount() {
        String string = StringsKt__StringsKt.trim((CharSequence) ((UserManageViewModel) getMViewModel()).getUserName()).toString();
        if (isAddBtnDisable()) {
            hideLoading();
            ToastUtil.showShortToast(getResources().getString(zzi.c4));
            return;
        }
        VirtualAccount virtualAccount = this.user;
        VirtualAccount virtualAccount2 = null;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        virtualAccount.setName(string);
        UserManageViewModel userManageViewModel = (UserManageViewModel) getMViewModel();
        VirtualAccount virtualAccount3 = this.user;
        if (virtualAccount3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount3 = null;
        }
        String name = virtualAccount3.getName();
        VirtualAccount virtualAccount4 = this.user;
        if (virtualAccount4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount4 = null;
        }
        String icon = virtualAccount4.getIcon();
        VirtualAccount virtualAccount5 = this.user;
        if (virtualAccount5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount5 = null;
        }
        int sex = virtualAccount5.getSex();
        VirtualAccount virtualAccount6 = this.user;
        if (virtualAccount6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount6 = null;
        }
        int height = virtualAccount6.getHeight();
        VirtualAccount virtualAccount7 = this.user;
        if (virtualAccount7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount7 = null;
        }
        float weightTarget = virtualAccount7.getWeightTarget();
        VirtualAccount virtualAccount8 = this.user;
        if (virtualAccount8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
        } else {
            virtualAccount2 = virtualAccount8;
        }
        userManageViewModel.addVirtualAccount(name, icon, sex, height, weightTarget, virtualAccount2.getBirth(), new Function1() { // from class: veq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserAddActivity.addVirtualAccount$lambda$25(this.f36825a, (ProxyResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addVirtualAccount$lambda$25(final UserAddActivity this$0, final ProxyResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        qal.c("addVirtualAccount() response:" + response.getCode() + response.getResult());
        this$0.hideLoading();
        this$0.handler.removeCallbacks(this$0.timeOutRunnable);
        if (response.getCode() == 0) {
            int pageType = this$0.getPageType();
            VirtualAccount virtualAccount = null;
            VirtualAccount virtualAccount2 = null;
            if (pageType == 0) {
                VirtualAccount virtualAccount3 = (VirtualAccount) response.getResult();
                qal.c("addNewUser() response accountId:" + (virtualAccount3 != null ? Long.valueOf(virtualAccount3.getAccountId()) : null));
                VirtualAccount virtualAccount4 = (VirtualAccount) response.getResult();
                if (virtualAccount4 != null) {
                    long accountId = virtualAccount4.getAccountId();
                    UserManageViewModel userManageViewModel = (UserManageViewModel) this$0.getMViewModel();
                    String deviceId = this$0.getDeviceId();
                    VirtualAccount virtualAccount5 = this$0.user;
                    if (virtualAccount5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount5 = null;
                    }
                    float weightTarget = virtualAccount5.getWeightTarget();
                    int weight_unit_kg = WeightManager.INSTANCE.getWEIGHT_UNIT_KG();
                    VirtualAccount virtualAccount6 = this$0.user;
                    if (virtualAccount6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount6 = null;
                    }
                    int sex = virtualAccount6.getSex();
                    VirtualAccount virtualAccount7 = this$0.user;
                    if (virtualAccount7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount7 = null;
                    }
                    long birth = virtualAccount7.getBirth();
                    VirtualAccount virtualAccount8 = this$0.user;
                    if (virtualAccount8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount8 = null;
                    }
                    userManageViewModel.addVirtualUserToDevice(deviceId, accountId, weightTarget, weight_unit_kg, sex, birth, virtualAccount8.getHeight());
                }
                qal.c("addNewUser() weightResult : " + this$0.getWeightResult());
                if (this$0.getWeightResult() != null) {
                    ToastUtil.showShortToast(this$0.getResources().getString(zzi.U3));
                    UserManageViewModel userManageViewModel2 = (UserManageViewModel) this$0.getMViewModel();
                    String strValueOf = String.valueOf(this$0.getDeviceId());
                    String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
                    VirtualAccount virtualAccount9 = (VirtualAccount) response.getResult();
                    Long lValueOf = virtualAccount9 != null ? Long.valueOf(virtualAccount9.getAccountId()) : null;
                    Intrinsics.checkNotNull(lValueOf);
                    long jLongValue = lValueOf.longValue();
                    VirtualAccount virtualAccount10 = this$0.user;
                    if (virtualAccount10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount10 = null;
                    }
                    String icon = virtualAccount10.getIcon();
                    VirtualAccount virtualAccount11 = this$0.user;
                    if (virtualAccount11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount11 = null;
                    }
                    String name = virtualAccount11.getName();
                    VirtualAccount virtualAccount12 = this$0.user;
                    if (virtualAccount12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount12 = null;
                    }
                    int sex2 = virtualAccount12.getSex();
                    WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
                    VirtualAccount virtualAccount13 = this$0.user;
                    if (virtualAccount13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount13 = null;
                    }
                    String dateToString = weightInfoUtil.getDateToString(virtualAccount13.getBirth(), "yyyy-MM-dd");
                    Intrinsics.checkNotNull(dateToString);
                    int age = weightInfoUtil.getAge(dateToString);
                    VirtualAccount virtualAccount14 = this$0.user;
                    if (virtualAccount14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount14 = null;
                    }
                    int height = virtualAccount14.getHeight();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WeightResult weightResult = this$0.getWeightResult();
                    Intrinsics.checkNotNull(weightResult);
                    userManageViewModel2.saveVirtualUserWeightResult(strValueOf, "yunmai.scales.ms3001", userId, jLongValue, icon, name, 2, sex2, age, height, jCurrentTimeMillis, weightResult, true, new Function0() { // from class: deq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserAddActivity.addVirtualAccount$lambda$25$lambda$19(response, this$0);
                        }
                    });
                } else {
                    List<ClaimRecord> list = this$0.weightRecordList;
                    if (list == null || list.isEmpty()) {
                        ToastUtil.showShortToast(this$0.getResources().getString(zzi.U3));
                        VirtualAccount virtualAccount15 = (VirtualAccount) response.getResult();
                        if (virtualAccount15 != null) {
                            t48.c().e(Long.valueOf(virtualAccount15.getAccountId()), (int) (this$0.userWeight * 10));
                            UserManageViewModel userManageViewModel3 = (UserManageViewModel) this$0.getMViewModel();
                            VirtualAccount virtualAccount16 = (VirtualAccount) response.getResult();
                            String icon2 = virtualAccount16 != null ? virtualAccount16.getIcon() : null;
                            VirtualAccount virtualAccount17 = (VirtualAccount) response.getResult();
                            Long lValueOf2 = virtualAccount17 != null ? Long.valueOf(virtualAccount17.getAccountId()) : null;
                            Intrinsics.checkNotNull(lValueOf2);
                            long jLongValue2 = lValueOf2.longValue();
                            VirtualAccount virtualAccount18 = (VirtualAccount) response.getResult();
                            userManageViewModel3.addVirtualAccountWeightRecord(icon2, jLongValue2, virtualAccount18 != null ? virtualAccount18.getName() : null, this$0.userWeight, WeightManager.INSTANCE.getWEIGHT_UNIT_KG());
                        }
                        this$0.setResult(-1);
                        this$0.finish();
                    } else {
                        VirtualAccount virtualAccount19 = (VirtualAccount) response.getResult();
                        if (virtualAccount19 != null) {
                            ClaimRecordsHelper claimRecordsHelper = ClaimRecordsHelper.INSTANCE;
                            String deviceId2 = this$0.getDeviceId();
                            Intrinsics.checkNotNull(deviceId2);
                            Long lValueOf3 = Long.valueOf(virtualAccount19.getAccountId());
                            VirtualAccount virtualAccount20 = this$0.user;
                            if (virtualAccount20 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                                virtualAccount20 = null;
                            }
                            int sex3 = virtualAccount20.getSex();
                            WeightInfoUtil weightInfoUtil2 = WeightInfoUtil.INSTANCE;
                            VirtualAccount virtualAccount21 = this$0.user;
                            if (virtualAccount21 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                                virtualAccount21 = null;
                            }
                            String dateToString2 = weightInfoUtil2.getDateToString(virtualAccount21.getBirth(), "yyyy-MM-dd");
                            Intrinsics.checkNotNull(dateToString2);
                            int age2 = weightInfoUtil2.getAge(dateToString2);
                            VirtualAccount virtualAccount22 = this$0.user;
                            if (virtualAccount22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                                virtualAccount22 = null;
                            }
                            float height2 = virtualAccount22.getHeight();
                            String name2 = virtualAccount19.getName();
                            List<ClaimRecord> list2 = this$0.weightRecordList;
                            Intrinsics.checkNotNull(list2);
                            claimRecordsHelper.claimVirtualAccountRecordGet(this$0, deviceId2, lValueOf3, sex3, age2, height2, name2, list2);
                        }
                    }
                }
                ld8 ld8VarC = ld8.c();
                VirtualAccount virtualAccount23 = (VirtualAccount) response.getResult();
                ld8VarC.l(new ScaleEventBusIds.OnUserAddEvent(virtualAccount23 != null ? Long.valueOf(virtualAccount23.getAccountId()) : null));
            } else if (pageType == 1) {
                ld8.c().l(new ScaleEventBusIds.OnUserAddEvent(null));
                qal.c("addVirtualMember() weightResult : " + this$0.getWeightResult());
                VirtualAccount virtualAccount24 = (VirtualAccount) response.getResult();
                if (virtualAccount24 != null) {
                    long accountId2 = virtualAccount24.getAccountId();
                    UserManageViewModel userManageViewModel4 = (UserManageViewModel) this$0.getMViewModel();
                    String deviceId3 = this$0.getDeviceId();
                    VirtualAccount virtualAccount25 = this$0.user;
                    if (virtualAccount25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount25 = null;
                    }
                    float weightTarget2 = virtualAccount25.getWeightTarget();
                    int weight_unit_kg2 = WeightManager.INSTANCE.getWEIGHT_UNIT_KG();
                    VirtualAccount virtualAccount26 = this$0.user;
                    if (virtualAccount26 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount26 = null;
                    }
                    int sex4 = virtualAccount26.getSex();
                    VirtualAccount virtualAccount27 = this$0.user;
                    if (virtualAccount27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount27 = null;
                    }
                    long birth2 = virtualAccount27.getBirth();
                    VirtualAccount virtualAccount28 = this$0.user;
                    if (virtualAccount28 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount28 = null;
                    }
                    userManageViewModel4.addVirtualUserToDevice(deviceId3, accountId2, weightTarget2, weight_unit_kg2, sex4, birth2, virtualAccount28.getHeight());
                }
                if (this$0.getWeightResult() != null) {
                    ToastUtil.showShortToast(this$0.getResources().getString(zzi.U3));
                    UserManageViewModel userManageViewModel5 = (UserManageViewModel) this$0.getMViewModel();
                    String strValueOf2 = String.valueOf(this$0.getDeviceId());
                    String userId2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
                    VirtualAccount virtualAccount29 = this$0.user;
                    if (virtualAccount29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount29 = null;
                    }
                    long accountId3 = virtualAccount29.getAccountId();
                    VirtualAccount virtualAccount30 = this$0.user;
                    if (virtualAccount30 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount30 = null;
                    }
                    String icon3 = virtualAccount30.getIcon();
                    VirtualAccount virtualAccount31 = this$0.user;
                    if (virtualAccount31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount31 = null;
                    }
                    String name3 = virtualAccount31.getName();
                    VirtualAccount virtualAccount32 = this$0.user;
                    if (virtualAccount32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount32 = null;
                    }
                    int sex5 = virtualAccount32.getSex();
                    WeightInfoUtil weightInfoUtil3 = WeightInfoUtil.INSTANCE;
                    VirtualAccount virtualAccount33 = this$0.user;
                    if (virtualAccount33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount33 = null;
                    }
                    String dateToString3 = weightInfoUtil3.getDateToString(virtualAccount33.getBirth(), "yyyy-MM-dd");
                    Intrinsics.checkNotNull(dateToString3);
                    int age3 = weightInfoUtil3.getAge(dateToString3);
                    VirtualAccount virtualAccount34 = this$0.user;
                    if (virtualAccount34 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    } else {
                        virtualAccount = virtualAccount34;
                    }
                    int height3 = virtualAccount.getHeight();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    WeightResult weightResult2 = this$0.getWeightResult();
                    Intrinsics.checkNotNull(weightResult2);
                    userManageViewModel5.saveVirtualUserWeightResult(strValueOf2, "yunmai.scales.ms3001", userId2, accountId3, icon3, name3, 2, sex5, age3, height3, jCurrentTimeMillis2, weightResult2, true, new Function0() { // from class: eeq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserAddActivity.addVirtualAccount$lambda$25$lambda$23(this.f16572a);
                        }
                    });
                } else {
                    List<ClaimRecord> list3 = this$0.weightRecordList;
                    if (list3 == null || list3.isEmpty()) {
                        ToastUtil.showShortToast(this$0.getResources().getString(zzi.U3));
                        if (this$0.getPageFrom() == 100) {
                            kb.c().a("/electronic/activity/VirtualMemberData").withSerializable("local_date", this$0.curDate).navigation();
                        }
                    } else {
                        VirtualAccount virtualAccount35 = (VirtualAccount) response.getResult();
                        if (virtualAccount35 != null) {
                            ClaimRecordsHelper claimRecordsHelper2 = ClaimRecordsHelper.INSTANCE;
                            String deviceId4 = this$0.getDeviceId();
                            Intrinsics.checkNotNull(deviceId4);
                            Long lValueOf4 = Long.valueOf(virtualAccount35.getAccountId());
                            VirtualAccount virtualAccount36 = this$0.user;
                            if (virtualAccount36 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                                virtualAccount36 = null;
                            }
                            int sex6 = virtualAccount36.getSex();
                            WeightInfoUtil weightInfoUtil4 = WeightInfoUtil.INSTANCE;
                            VirtualAccount virtualAccount37 = this$0.user;
                            if (virtualAccount37 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                                virtualAccount37 = null;
                            }
                            String dateToString4 = weightInfoUtil4.getDateToString(virtualAccount37.getBirth(), "yyyy-MM-dd");
                            Intrinsics.checkNotNull(dateToString4);
                            int age4 = weightInfoUtil4.getAge(dateToString4);
                            VirtualAccount virtualAccount38 = this$0.user;
                            if (virtualAccount38 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                            } else {
                                virtualAccount2 = virtualAccount38;
                            }
                            float height4 = virtualAccount2.getHeight();
                            String name4 = virtualAccount35.getName();
                            List<ClaimRecord> list4 = this$0.weightRecordList;
                            Intrinsics.checkNotNull(list4);
                            claimRecordsHelper2.claimVirtualAccountRecordGet(this$0, deviceId4, lValueOf4, sex6, age4, height4, name4, list4);
                        }
                    }
                }
            }
            this$0.setResult(-1);
            this$0.finish();
        } else if (response.getCode() == 100120003) {
            ToastUtil.showShortToast(zzi.v5);
        } else {
            ToastUtil.showShortToast(response.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccount$lambda$25$lambda$19(ProxyResponse response, UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
        VirtualAccount virtualAccount = (VirtualAccount) response.getResult();
        Long lValueOf = virtualAccount != null ? Long.valueOf(virtualAccount.getAccountId()) : null;
        Intrinsics.checkNotNull(lValueOf);
        scalePageUtil.goVmData(lValueOf.longValue(), this$0.showNoBodyFatErrorDialog, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccount$lambda$25$lambda$23(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
        VirtualAccount virtualAccount = this$0.user;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        scalePageUtil.goVmData(virtualAccount.getAccountId(), this$0.showNoBodyFatErrorDialog, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deviceId_delegate$lambda$5(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getStringExtra(KEY_PAGE_DID);
    }

    private final String getDeviceId() {
        return (String) this.deviceId.getValue();
    }

    private final int getPageFrom() {
        return ((Number) this.pageFrom.getValue()).intValue();
    }

    private final int getPageType() {
        return ((Number) this.pageType.getValue()).intValue();
    }

    private final float getPreSelectedWeight() {
        VirtualAccount virtualAccount = this.user;
        VirtualAccount virtualAccount2 = null;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        if (virtualAccount.getWeightTarget() <= 0.0f) {
            float f = this.userWeight;
            if (f > 0.0f) {
                return f;
            }
            return 60.0f;
        }
        VirtualAccount virtualAccount3 = this.user;
        if (virtualAccount3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
        } else {
            virtualAccount2 = virtualAccount3;
        }
        return virtualAccount2.getWeightTarget();
    }

    private final float getUserWeightSourceTranFromOtherPage() {
        return ((Number) this.userWeightSourceTranFromOtherPage.getValue()).floatValue();
    }

    private final WeightResult getWeightResult() {
        return (WeightResult) this.weightResult.getValue();
    }

    private final int getWeightUnit() {
        return ((Number) this.weightUnit.getValue()).intValue();
    }

    private final boolean haveNoUserWeight() {
        VirtualAccount virtualAccount = this.user;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        return virtualAccount.getWeightTarget() <= 0.0f && this.userWeight <= 0.0f;
    }

    private final void initInfo() {
        this.miAccountAge = MiAccountManager.INSTANCE.getInstance().getAge();
        if (getIntent().getParcelableArrayListExtra(KEY_PAGE_WEIGHT_LIST) != null) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(KEY_PAGE_WEIGHT_LIST);
            Intrinsics.checkNotNull(parcelableArrayListExtra, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fitness.electronic.scale.data.ClaimRecord>");
            this.weightRecordList = parcelableArrayListExtra;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        int pageType = getPageType();
        VirtualAccount virtualAccount = null;
        if (pageType == 0) {
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setTitle(getString(zzi.B));
            }
            ((nk0) getMBinding()).D.setText("");
            if (getWeightResult() != null) {
                WeightResult weightResult = getWeightResult();
                Intrinsics.checkNotNull(weightResult);
                ((UserManageViewModel) getMViewModel()).setWeightTarget(weightResult.getWeight() + getString(zzi.q5));
                VirtualAccount virtualAccount2 = this.user;
                if (virtualAccount2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount2 = null;
                }
                WeightResult weightResult2 = getWeightResult();
                Intrinsics.checkNotNull(weightResult2);
                virtualAccount2.setWeightTarget(weightResult2.getWeight());
            }
            List<ClaimRecord> list = this.weightRecordList;
            if (list == null || list.isEmpty()) {
                float f = this.userWeight;
                if (f > 0.0f) {
                    ((UserManageViewModel) getMViewModel()).setWeightTarget(WeightInfoUtil.INSTANCE.getFormatFloat(f) + getString(zzi.q5));
                    VirtualAccount virtualAccount3 = this.user;
                    if (virtualAccount3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    } else {
                        virtualAccount = virtualAccount3;
                    }
                    virtualAccount.setWeightTarget(this.userWeight);
                }
            } else {
                List<ClaimRecord> list2 = this.weightRecordList;
                Intrinsics.checkNotNull(list2);
                ClaimRecord claimRecord = (ClaimRecord) CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.UserAddActivity$initView$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((ClaimRecord) t2).getCreateTime()), Long.valueOf(((ClaimRecord) t).getCreateTime()));
                    }
                }).get(0);
                ((UserManageViewModel) getMViewModel()).setWeightTarget(claimRecord.getWeight() + getString(zzi.q5));
                VirtualAccount virtualAccount4 = this.user;
                if (virtualAccount4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                } else {
                    virtualAccount = virtualAccount4;
                }
                virtualAccount.setWeightTarget(claimRecord.getWeight());
            }
        } else if (pageType == 1) {
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null) {
                miuiActionBar2.setTitle(getString(zzi.C));
            }
            ((nk0) getMBinding()).D.setText(getString(zzi.Y0));
        } else if (pageType == 2) {
            wc0 miuiActionBar3 = getMiuiActionBar();
            if (miuiActionBar3 != null) {
                miuiActionBar3.setTitle(getString(zzi.z));
            }
            ((nk0) getMBinding()).D.setText(getString(zzi.Y0));
            UserManageViewModel userManageViewModel = (UserManageViewModel) getMViewModel();
            VirtualAccount virtualAccount5 = this.user;
            if (virtualAccount5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount5 = null;
            }
            userManageViewModel.setUserName(virtualAccount5.getName());
            ((nk0) getMBinding()).E.setRemindText(((UserManageViewModel) getMViewModel()).getUserName());
            VirtualAccount virtualAccount6 = this.user;
            if (virtualAccount6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount6 = null;
            }
            setSex(virtualAccount6.getSex(), true);
            VirtualAccount virtualAccount7 = this.user;
            if (virtualAccount7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount7 = null;
            }
            if (virtualAccount7.getBirth() != 0) {
                WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
                VirtualAccount virtualAccount8 = this.user;
                if (virtualAccount8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount8 = null;
                }
                String dateToString = weightInfoUtil.getDateToString(virtualAccount8.getBirth(), "yyyy-MM-dd");
                ((UserManageViewModel) getMViewModel()).setBirth(dateToString != null ? dateToString : "");
            }
            ((nk0) getMBinding()).A.setRemindText(((UserManageViewModel) getMViewModel()).getBirth());
            VirtualAccount virtualAccount9 = this.user;
            if (virtualAccount9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount9 = null;
            }
            if (virtualAccount9.getHeight() > 0) {
                UserManageViewModel userManageViewModel2 = (UserManageViewModel) getMViewModel();
                VirtualAccount virtualAccount10 = this.user;
                if (virtualAccount10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount10 = null;
                }
                userManageViewModel2.setHeight(virtualAccount10.getHeight() + getString(zzi.w0));
            }
            ((nk0) getMBinding()).B.setRemindText(((UserManageViewModel) getMViewModel()).getHeight());
            if (getWeightResult() != null) {
                WeightResult weightResult3 = getWeightResult();
                Intrinsics.checkNotNull(weightResult3);
                ((UserManageViewModel) getMViewModel()).setWeightTarget(weightResult3.getWeight() + getString(zzi.q5));
                VirtualAccount virtualAccount11 = this.user;
                if (virtualAccount11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount11 = null;
                }
                WeightResult weightResult4 = getWeightResult();
                Intrinsics.checkNotNull(weightResult4);
                virtualAccount11.setWeightTarget(weightResult4.getWeight());
            } else {
                float f2 = this.userWeight;
                if (f2 > 0.0f) {
                    WeightInfoUtil weightInfoUtil2 = WeightInfoUtil.INSTANCE;
                    ((UserManageViewModel) getMViewModel()).setWeightTarget(weightInfoUtil2.getFormatFloat(f2) + getString(zzi.q5));
                    VirtualAccount virtualAccount12 = this.user;
                    if (virtualAccount12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount12 = null;
                    }
                    virtualAccount12.setWeightTarget(weightInfoUtil2.getFormatFloat(this.userWeight));
                } else {
                    VirtualAccount virtualAccount13 = this.user;
                    if (virtualAccount13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount13 = null;
                    }
                    if (virtualAccount13.getWeightTarget() > 0.0f) {
                        WeightInfoUtil weightInfoUtil3 = WeightInfoUtil.INSTANCE;
                        VirtualAccount virtualAccount14 = this.user;
                        if (virtualAccount14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                            virtualAccount14 = null;
                        }
                        ((UserManageViewModel) getMViewModel()).setWeightTarget(weightInfoUtil3.getFormatFloat(virtualAccount14.getWeightTarget()) + getString(zzi.q5));
                    }
                }
            }
            List<ClaimRecord> list3 = this.weightRecordList;
            if (list3 != null && !list3.isEmpty()) {
                List<ClaimRecord> list4 = this.weightRecordList;
                Intrinsics.checkNotNull(list4);
                ClaimRecord claimRecord2 = (ClaimRecord) CollectionsKt___CollectionsKt.sortedWith(list4, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.UserAddActivity$initView$$inlined$sortedByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((ClaimRecord) t2).getCreateTime()), Long.valueOf(((ClaimRecord) t).getCreateTime()));
                    }
                }).get(0);
                ((UserManageViewModel) getMViewModel()).setWeightTarget(claimRecord2.getWeight() + getString(zzi.q5));
                VirtualAccount virtualAccount15 = this.user;
                if (virtualAccount15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                } else {
                    virtualAccount = virtualAccount15;
                }
                virtualAccount.setWeightTarget(claimRecord2.getWeight());
            }
            ((nk0) getMBinding()).H.setRemindText(((UserManageViewModel) getMViewModel()).getWeightTarget());
            ((UserManageViewModel) getMViewModel()).setHasEditName(true);
            updateSaveBtnEnableStatus();
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        b6l.b(((nk0) getMBinding()).G, new bg4() { // from class: geq
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                UserAddActivity.initView$lambda$10(this.f18906a, obj);
            }
        });
        if (isConfirmInfo()) {
            ((nk0) getMBinding()).G.setText(zzi.D0);
        }
        ((nk0) getMBinding()).E.setRemindText(StringsKt__StringsKt.trim((CharSequence) ((UserManageViewModel) getMViewModel()).getUserName()).toString());
        ((nk0) getMBinding()).C.setRemindText(((UserManageViewModel) getMViewModel()).getSex());
        ((nk0) getMBinding()).A.setRemindText(((UserManageViewModel) getMViewModel()).getBirth());
        ((nk0) getMBinding()).B.setRemindText(((UserManageViewModel) getMViewModel()).getHeight());
        ((nk0) getMBinding()).H.setRemindText(((UserManageViewModel) getMViewModel()).getWeightTarget());
        ((nk0) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: heq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAddActivity.initView$lambda$11(this.f19994a, view);
            }
        });
        updateSaveBtnEnableStatus();
        ((nk0) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: ieq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAddActivity.initView$lambda$12(this.f21066a, view);
            }
        });
        ((nk0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: jeq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAddActivity.initView$lambda$15(this.f22716a, view);
            }
        });
        ((nk0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: keq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAddActivity.initView$lambda$16(this.f23784a, view);
            }
        });
        ((nk0) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: leq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAddActivity.initView$lambda$17(this.f24983a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(UserAddActivity this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int pageType = this$0.getPageType();
        if (pageType == 0) {
            this$0.save();
        } else if (pageType == 1) {
            this$0.save();
        } else {
            if (pageType != 2) {
                return;
            }
            this$0.save();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$11(final UserAddActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View viewInflate = LayoutInflater.from(this$0).inflate(gui.s0, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(bri.d1);
        if (this$0.isAddBtnDisable()) {
            editText.setText("");
        } else {
            String string = StringsKt__StringsKt.trim((CharSequence) ((UserManageViewModel) this$0.getMViewModel()).getUserName()).toString();
            editText.setText(string);
            editText.setSelection(string.length());
        }
        editText.setFilters(new InputFilter[]{new zee(10)});
        new CommonDialog.c(USER_NAME).setDialogTitle(zzi.d4).setNegativeText(zzi.f41831b).setPositiveText(zzi.c).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.UserAddActivity$initView$2$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this$0.updateSaveBtnEnableStatus();
                } else if (which == -1) {
                    String string2 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(editText.getText())).toString();
                    if (TextUtils.isEmpty(string2)) {
                        UserAddActivity.access$getMViewModel(this$0).setUserName(this$0.getString(zzi.f4));
                        ToastUtil.showShortToast(zzi.J3);
                        UserAddActivity.access$getMViewModel(this$0).setHasEditName(false);
                    } else {
                        UserAddActivity.access$getMViewModel(this$0).setHasEditName(true);
                        UserAddActivity.access$getMViewModel(this$0).setUserName(string2);
                        VirtualAccount virtualAccount = this$0.user;
                        if (virtualAccount == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                            virtualAccount = null;
                        }
                        virtualAccount.setName(UserAddActivity.access$getMViewModel(this$0).getUserName());
                    }
                    UserAddActivity.access$getMBinding(this$0).E.setRemindText(StringsKt__StringsKt.trim((CharSequence) UserAddActivity.access$getMViewModel(this$0).getUserName()).toString());
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    this$0.updateSaveBtnEnableStatus();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$12(UserAddActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = 1;
        if (this$0.mGenderDialog == null) {
            ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialogCreate = new ElectronicScaleSingleChoiceDialog.c("GENDER_NAME").setCustomLayoutId(gui.z0).setDialogTitle(zzi.U4).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this$0.mGenderDialog = electronicScaleSingleChoiceDialogCreate;
            int[] iArr = {zzi.W4, zzi.V4};
            if (electronicScaleSingleChoiceDialogCreate != null) {
                electronicScaleSingleChoiceDialogCreate.H(iArr);
            }
            ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialog = this$0.mGenderDialog;
            if (electronicScaleSingleChoiceDialog != null) {
                electronicScaleSingleChoiceDialog.setRequestCode(this$0.REQ_GENDER);
            }
        }
        ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialog2 = this$0.mGenderDialog;
        if (electronicScaleSingleChoiceDialog2 != null) {
            electronicScaleSingleChoiceDialog2.showIfNeed(this$0.getSupportFragmentManager());
        }
        VirtualAccount virtualAccount = this$0.user;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        int sex = virtualAccount.getSex();
        if (sex == 0) {
            i = 2;
        } else if (sex != 1) {
            i = 0;
        }
        ElectronicScaleSingleChoiceDialog electronicScaleSingleChoiceDialog3 = this$0.mGenderDialog;
        if (electronicScaleSingleChoiceDialog3 != null) {
            electronicScaleSingleChoiceDialog3.G(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$15(final UserAddActivity this$0, View view) {
        long birth;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VirtualAccount virtualAccount = this$0.user;
        VirtualAccount virtualAccount2 = null;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        if (virtualAccount.getBirth() != 0) {
            VirtualAccount virtualAccount3 = this$0.user;
            if (virtualAccount3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            } else {
                virtualAccount2 = virtualAccount3;
            }
            birth = virtualAccount2.getBirth();
        } else {
            birth = 946656000000L;
        }
        LocalDate localDate = new LocalDate(birth);
        zp5 zp5Var = new zp5(this$0, new zp5.d() { // from class: meq
            @Override // zp5.d
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                UserAddActivity.initView$lambda$15$lambda$13(this.f26085a, datePicker, i, i2, i3);
            }
        }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        DatePicker datePickerH = zp5Var.H();
        zp5Var.setTitle(zzi.h0);
        long[] birthdayRange = ((UserManageViewModel) this$0.getMViewModel()).getBirthdayRange();
        datePickerH.setMinDate(birthdayRange != null ? birthdayRange[0] : 0L);
        long[] birthdayRange2 = ((UserManageViewModel) this$0.getMViewModel()).getBirthdayRange();
        datePickerH.setMaxDate(birthdayRange2 != null ? birthdayRange2[1] : 0L);
        zp5Var.K(false);
        zp5Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$15$lambda$13(UserAddActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "DatePickerDialog, p1: " + i + ", p2: " + i2 + ", p3: " + i3);
        long zeroMills = DateUtil.INSTANCE.getZeroMills(new LocalDate(i, i2 + 1, i3));
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(zeroMills, "yyyy-MM-dd");
        String str = this$0.TAG;
        Intrinsics.checkNotNull(dateToString);
        Logger.i(str, "age : " + weightInfoUtil.getAge(weightInfoUtil.parseDate(dateToString)));
        int age = weightInfoUtil.getAge(weightInfoUtil.parseDate(dateToString));
        int i4 = this$0.miAccountAge;
        if (i4 >= 18 && age < 14) {
            this$0.teenagerTipDialog(zeroMills, dateToString, zzi.Z0);
            return;
        }
        if (i4 >= 18 || age >= 14) {
            ((UserManageViewModel) this$0.getMViewModel()).setBirth(dateToString);
            VirtualAccount virtualAccount = this$0.user;
            if (virtualAccount == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount = null;
            }
            virtualAccount.setBirth(zeroMills);
            ((nk0) this$0.getMBinding()).A.setRemindText(((UserManageViewModel) this$0.getMViewModel()).getBirth());
            this$0.updateSaveBtnEnableStatus();
            return;
        }
        ToastUtil.showShortToast(zzi.X0);
        Logger.i(this$0.TAG, "miAccountAge: " + this$0.miAccountAge + ", age: " + age);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$16(final UserAddActivity this$0, View view) {
        int height;
        PickerDialog.b bVarBuildUpon;
        PickerDialog.b bVarC;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mHeightDialog == null) {
            PickerDialog pickerDialogCreate = new PickerDialog.b("HEIGHT_NAME").setCustomLayoutId(gui.y0).setPositiveText(zzi.c).setNegativeText(zzi.f41831b).setDialogTitle(zzi.A3).setCancelable(true).setCanceledOnTouchOutside(true).create();
            this$0.mHeightDialog = pickerDialogCreate;
            if (pickerDialogCreate != null && (bVarBuildUpon = pickerDialogCreate.buildUpon()) != null && (bVarC = bVarBuildUpon.c(new HeightAdapter())) != null) {
                bVarC.create();
            }
            PickerDialog pickerDialog = this$0.mHeightDialog;
            if (pickerDialog != null) {
                pickerDialog.setRequestCode(this$0.REQ_HEIGHT);
            }
        }
        VirtualAccount virtualAccount = this$0.user;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        if (virtualAccount.getHeight() == 0) {
            height = 170;
        } else {
            VirtualAccount virtualAccount2 = this$0.user;
            if (virtualAccount2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount2 = null;
            }
            height = virtualAccount2.getHeight();
        }
        PickerDialog pickerDialog2 = this$0.mHeightDialog;
        if (pickerDialog2 != null) {
            pickerDialog2.setValue(height);
        }
        PickerDialog pickerDialog3 = this$0.mHeightDialog;
        if (pickerDialog3 != null) {
            pickerDialog3.setPickerHintText(this$0.getString(zzi.w0));
        }
        PickerDialog pickerDialog4 = this$0.mHeightDialog;
        if (pickerDialog4 != null) {
            pickerDialog4.showIfNeed(this$0.getSupportFragmentManager());
        }
        PickerDialog pickerDialog5 = this$0.mHeightDialog;
        Intrinsics.checkNotNull(pickerDialog5 != null ? pickerDialog5.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.UserAddActivity$initView$5$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                PickerDialog pickerDialog6 = this.this$0.mHeightDialog;
                VirtualAccount virtualAccount3 = null;
                Integer numValueOf = pickerDialog6 != null ? Integer.valueOf(pickerDialog6.getValue()) : null;
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue = numValueOf.intValue();
                if (which == -1) {
                    VirtualAccount virtualAccount4 = this.this$0.user;
                    if (virtualAccount4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    } else {
                        virtualAccount3 = virtualAccount4;
                    }
                    virtualAccount3.setHeight(iIntValue);
                    UserAddActivity.access$getMViewModel(this.this$0).setHeight(iIntValue + this.this$0.getString(zzi.w0));
                    UserAddActivity.access$getMBinding(this.this$0).B.setRemindText(UserAddActivity.access$getMViewModel(this.this$0).getHeight());
                    this.this$0.updateSaveBtnEnableStatus();
                }
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$17(UserAddActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FloatNumberPickerDialog floatNumberPickerDialogCreate = new FloatNumberPickerDialog.b("weight").setCustomLayoutId(gui.M).setCustomTitleId(gui.E).setPositiveText(zzi.H0).setNegativeText(zzi.r0).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(floatNumberPickerDialogCreate, "create(...)");
        FloatNumberPickerDialog floatNumberPickerDialog = floatNumberPickerDialogCreate;
        floatNumberPickerDialog.setRequestCode(this$0.REQ_WEIGHT);
        floatNumberPickerDialog.T(false);
        floatNumberPickerDialog.R(9);
        floatNumberPickerDialog.S(0);
        floatNumberPickerDialog.setTitle(zzi.o0);
        floatNumberPickerDialog.U(250.0f);
        floatNumberPickerDialog.V(0.0f);
        floatNumberPickerDialog.X(this$0.getPreSelectedWeight());
        floatNumberPickerDialog.W(zzi.q5);
        floatNumberPickerDialog.showIfNeed(this$0.getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isAddBtnDisable() {
        return TextUtils.isEmpty(StringsKt__StringsKt.trim((CharSequence) ((UserManageViewModel) getMViewModel()).getUserName()).toString()) || (Intrinsics.areEqual(((UserManageViewModel) getMViewModel()).getUserName(), getString(zzi.f4)) && !((UserManageViewModel) getMViewModel()).getHasEditName());
    }

    private final boolean isConfirmInfo() {
        return ((Boolean) this.isConfirmInfo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isConfirmInfo_delegate$lambda$6(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getBooleanExtra(KEY_CONFIRM_INFO, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void modifyVirtualAccount() {
        String string = StringsKt__StringsKt.trim((CharSequence) ((UserManageViewModel) getMViewModel()).getUserName()).toString();
        if (isAddBtnDisable()) {
            hideLoading();
            ToastUtil.showShortToast(getResources().getString(zzi.c4));
            return;
        }
        VirtualAccount virtualAccount = this.user;
        VirtualAccount virtualAccount2 = null;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        virtualAccount.setName(string);
        UserManageViewModel userManageViewModel = (UserManageViewModel) getMViewModel();
        VirtualAccount virtualAccount3 = this.user;
        if (virtualAccount3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount3 = null;
        }
        String strValueOf = String.valueOf(virtualAccount3.getAccountId());
        VirtualAccount virtualAccount4 = this.user;
        if (virtualAccount4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount4 = null;
        }
        String name = virtualAccount4.getName();
        VirtualAccount virtualAccount5 = this.user;
        if (virtualAccount5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount5 = null;
        }
        String icon = virtualAccount5.getIcon();
        VirtualAccount virtualAccount6 = this.user;
        if (virtualAccount6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount6 = null;
        }
        int sex = virtualAccount6.getSex();
        VirtualAccount virtualAccount7 = this.user;
        if (virtualAccount7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount7 = null;
        }
        int height = virtualAccount7.getHeight();
        VirtualAccount virtualAccount8 = this.user;
        if (virtualAccount8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount8 = null;
        }
        float weightTarget = virtualAccount8.getWeightTarget();
        VirtualAccount virtualAccount9 = this.user;
        if (virtualAccount9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
        } else {
            virtualAccount2 = virtualAccount9;
        }
        userManageViewModel.modifyVirtualAccount(strValueOf, name, icon, sex, height, weightTarget, virtualAccount2.getBirth(), new Function1() { // from class: ceq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserAddActivity.modifyVirtualAccount$lambda$29(this.f5258a, (ProxyResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit modifyVirtualAccount$lambda$29(final UserAddActivity this$0, ProxyResponse response) {
        List<ClaimRecord> list;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "response");
        qal.c("modifyVirtualAccount() response:" + response.getCode() + response.getMessage());
        this$0.hideLoading();
        this$0.handler.removeCallbacks(this$0.timeOutRunnable);
        VirtualAccount virtualAccount = this$0.user;
        VirtualAccount virtualAccount2 = null;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        long accountId = virtualAccount.getAccountId();
        UserManageViewModel userManageViewModel = (UserManageViewModel) this$0.getMViewModel();
        String deviceId = this$0.getDeviceId();
        VirtualAccount virtualAccount3 = this$0.user;
        if (virtualAccount3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount3 = null;
        }
        float weightTarget = virtualAccount3.getWeightTarget();
        WeightManager.Companion companion = WeightManager.INSTANCE;
        int weight_unit_kg = companion.getWEIGHT_UNIT_KG();
        VirtualAccount virtualAccount4 = this$0.user;
        if (virtualAccount4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount4 = null;
        }
        int sex = virtualAccount4.getSex();
        VirtualAccount virtualAccount5 = this$0.user;
        if (virtualAccount5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount5 = null;
        }
        long birth = virtualAccount5.getBirth();
        VirtualAccount virtualAccount6 = this$0.user;
        if (virtualAccount6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount6 = null;
        }
        userManageViewModel.addVirtualUserToDevice(deviceId, accountId, weightTarget, weight_unit_kg, sex, birth, virtualAccount6.getHeight());
        if (this$0.getWeightResult() != null) {
            UserManageViewModel userManageViewModel2 = (UserManageViewModel) this$0.getMViewModel();
            String strValueOf = String.valueOf(this$0.getDeviceId());
            String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
            VirtualAccount virtualAccount7 = this$0.user;
            if (virtualAccount7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount7 = null;
            }
            long accountId2 = virtualAccount7.getAccountId();
            VirtualAccount virtualAccount8 = this$0.user;
            if (virtualAccount8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount8 = null;
            }
            String icon = virtualAccount8.getIcon();
            VirtualAccount virtualAccount9 = this$0.user;
            if (virtualAccount9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount9 = null;
            }
            String name = virtualAccount9.getName();
            VirtualAccount virtualAccount10 = this$0.user;
            if (virtualAccount10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount10 = null;
            }
            int sex2 = virtualAccount10.getSex();
            WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
            VirtualAccount virtualAccount11 = this$0.user;
            if (virtualAccount11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount11 = null;
            }
            String dateToString = weightInfoUtil.getDateToString(virtualAccount11.getBirth(), "yyyy-MM-dd");
            Intrinsics.checkNotNull(dateToString);
            int age = weightInfoUtil.getAge(dateToString);
            VirtualAccount virtualAccount12 = this$0.user;
            if (virtualAccount12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            } else {
                virtualAccount2 = virtualAccount12;
            }
            int height = virtualAccount2.getHeight();
            long jCurrentTimeMillis = System.currentTimeMillis();
            WeightResult weightResult = this$0.getWeightResult();
            Intrinsics.checkNotNull(weightResult);
            userManageViewModel2.saveVirtualUserWeightResult(strValueOf, "yunmai.scales.ms3001", userId, accountId2, icon, name, 2, sex2, age, height, jCurrentTimeMillis, weightResult, true, new Function0() { // from class: feq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserAddActivity.modifyVirtualAccount$lambda$29$lambda$27(this.f17716a);
                }
            });
        } else {
            List<ClaimRecord> list2 = this$0.weightRecordList;
            if (list2 != null && !list2.isEmpty()) {
                ClaimRecordsHelper claimRecordsHelper = ClaimRecordsHelper.INSTANCE;
                String deviceId2 = this$0.getDeviceId();
                Intrinsics.checkNotNull(deviceId2);
                VirtualAccount virtualAccount13 = this$0.user;
                if (virtualAccount13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount13 = null;
                }
                Long lValueOf = Long.valueOf(virtualAccount13.getAccountId());
                VirtualAccount virtualAccount14 = this$0.user;
                if (virtualAccount14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount14 = null;
                }
                int sex3 = virtualAccount14.getSex();
                WeightInfoUtil weightInfoUtil2 = WeightInfoUtil.INSTANCE;
                VirtualAccount virtualAccount15 = this$0.user;
                if (virtualAccount15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount15 = null;
                }
                String dateToString2 = weightInfoUtil2.getDateToString(virtualAccount15.getBirth(), "yyyy-MM-dd");
                Intrinsics.checkNotNull(dateToString2);
                int age2 = weightInfoUtil2.getAge(dateToString2);
                VirtualAccount virtualAccount16 = this$0.user;
                if (virtualAccount16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount16 = null;
                }
                float height2 = virtualAccount16.getHeight();
                VirtualAccount virtualAccount17 = this$0.user;
                if (virtualAccount17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                } else {
                    virtualAccount2 = virtualAccount17;
                }
                String name2 = virtualAccount2.getName();
                List<ClaimRecord> list3 = this$0.weightRecordList;
                Intrinsics.checkNotNull(list3);
                claimRecordsHelper.claimVirtualAccountRecordGet(this$0, deviceId2, lValueOf, sex3, age2, height2, name2, list3);
            } else if (this$0.getIntent().getBooleanExtra(TO_DATA_DISPLAY_PAGE, false)) {
                VirtualAccount virtualAccount18 = this$0.user;
                if (virtualAccount18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount18 = null;
                }
                t48.c().e(Long.valueOf(virtualAccount18.getAccountId()), (int) (this$0.userWeight * 10));
                UserManageViewModel userManageViewModel3 = (UserManageViewModel) this$0.getMViewModel();
                VirtualAccount virtualAccount19 = this$0.user;
                if (virtualAccount19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount19 = null;
                }
                String icon2 = virtualAccount19.getIcon();
                VirtualAccount virtualAccount20 = this$0.user;
                if (virtualAccount20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount20 = null;
                }
                long accountId3 = virtualAccount20.getAccountId();
                VirtualAccount virtualAccount21 = this$0.user;
                if (virtualAccount21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                } else {
                    virtualAccount2 = virtualAccount21;
                }
                userManageViewModel3.addVirtualAccountWeightRecord(icon2, accountId3, virtualAccount2.getName(), this$0.userWeight, companion.getWEIGHT_UNIT_KG());
            }
        }
        if (response.getCode() == 0) {
            if (this$0.getWeightResult() == null && ((list = this$0.weightRecordList) == null || list.isEmpty())) {
                ToastUtil.showShortToast(this$0.getResources().getString(zzi.Z3));
            }
            ld8.c().l(new ScaleEventBusIds.OnUserModifyEvent());
            this$0.setResult(-1);
            this$0.finish();
        } else if (response.getCode() == 100120003) {
            ToastUtil.showShortToast(zzi.v5);
        } else {
            ToastUtil.showShortToast(response.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modifyVirtualAccount$lambda$29$lambda$27(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScalePageUtil scalePageUtil = ScalePageUtil.INSTANCE;
        VirtualAccount virtualAccount = this$0.user;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        scalePageUtil.goVmData(virtualAccount.getAccountId(), this$0.showNoBodyFatErrorDialog, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pageFrom_delegate$lambda$0(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra(ElectronicScaleManagerExtKt.KEY_PAGE_FROM, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pageType_delegate$lambda$1(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra("KEY_PAGE_TYPE", 0);
    }

    private final void save() {
        if (this.saveBtnIsEnabled) {
            saveVirtualAccount();
        } else {
            ToastUtil.showShortToast(zzi.J3);
        }
    }

    private final void saveVirtualAccount() {
        this.handler.postDelayed(this.timeOutRunnable, 10000L);
        showLoading(zzi.e, false);
        int pageType = getPageType();
        if (pageType == 0) {
            addVirtualAccount();
        } else if (pageType == 1) {
            addVirtualAccount();
        } else {
            if (pageType != 2) {
                return;
            }
            modifyVirtualAccount();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSex(int gender, boolean isInit) {
        if (isInit) {
            if (this.user == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            }
            VirtualAccount virtualAccount = this.user;
            if (virtualAccount == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount = null;
            }
            if (virtualAccount.isIncomplete()) {
                ((nk0) getMBinding()).C.setRemindText(((UserManageViewModel) getMViewModel()).getSex());
                return;
            }
        }
        if (gender > -1) {
            ((UserManageViewModel) getMViewModel()).setSex(gender == 0 ? ResourceExtKt.getString(zzi.V4) : ResourceExtKt.getString(zzi.W4));
        }
        ((nk0) getMBinding()).C.setRemindText(((UserManageViewModel) getMViewModel()).getSex());
    }

    public static /* synthetic */ void setSex$default(UserAddActivity userAddActivity, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        userAddActivity.setSex(i, z);
    }

    private final void showGiveUpDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("user_give_up").setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(zzi.g1))).setPositiveText(zzi.f1).setNegativeText(zzi.r0).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.UserAddActivity.showGiveUpDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    UserAddActivity.this.finish();
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void teenagerTipDialog(final long selectValue, final String birthStr, int subTitle) {
        CommonDialog commonDialogCreate = new CommonDialog.c("teenager_add").setDialogTitle(zzi.a1).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(subTitle))).setPositiveText(zzi.f41830a).setNegativeText(zzi.r0).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.UserAddActivity.teenagerTipDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    UserAddActivity.access$getMBinding(UserAddActivity.this).A.callOnClick();
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                UserAddActivity.access$getMViewModel(UserAddActivity.this).setBirth(birthStr);
                VirtualAccount virtualAccount = UserAddActivity.this.user;
                if (virtualAccount == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount = null;
                }
                virtualAccount.setBirth(selectValue);
                UserAddActivity.access$getMBinding(UserAddActivity.this).A.setRemindText(UserAddActivity.access$getMViewModel(UserAddActivity.this).getBirth());
                UserAddActivity.this.updateSaveBtnEnableStatus();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeOutRunnable$lambda$7(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        ToastUtil.INSTANCE.showToast(zzi.e6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float userWeightSourceTranFromOtherPage_delegate$lambda$2(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getFloatExtra(KEY_PAGE_WEIGHT, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeightResult weightResult_delegate$lambda$3(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (WeightResult) this$0.getIntent().getSerializableExtra(KEY_WEIGHT_RESULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int weightUnit_delegate$lambda$4(UserAddActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra(KEY_PAGE_UNIT, 1);
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.s;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        List<ClaimRecord> list;
        if (getPageType() == 0 && ((list = this.weightRecordList) == null || list.isEmpty())) {
            showGiveUpDialog();
        } else {
            super.lambda$onCreate$0();
        }
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onBodyCompositionSDKMeasure(@NotNull ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.showNoBodyFatErrorDialog = !event.getIsSuccess();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_UserAddActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ld8.c().p(this);
        if (getPageFrom() == 100) {
            this.curDate = (LocalDate) getIntent().getSerializableExtra("local_date");
            this.user = new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null);
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra(KEY_USER);
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount");
            this.user = (VirtualAccount) serializableExtra;
        }
        WeightManager.Companion companion = WeightManager.INSTANCE;
        this.userWeight = companion.getInstance().convertToKg(getUserWeightSourceTranFromOtherPage(), getWeightUnit());
        if (getWeightResult() != null) {
            WeightResult weightResult = getWeightResult();
            Intrinsics.checkNotNull(weightResult);
            weightResult.setWeight(companion.getInstance().convertToKg(getUserWeightSourceTranFromOtherPage(), getWeightUnit()));
        }
        String str = this.TAG;
        VirtualAccount virtualAccount = this.user;
        if (virtualAccount == null) {
            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
            virtualAccount = null;
        }
        Logger.i(str, "user : " + f4b.c(virtualAccount));
        Logger.i(this.TAG, "type : " + getPageType());
        initInfo();
        initView();
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_UserAddActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ff2.f17725a = "";
        this.handler.removeCallbacksAndMessages(null);
        ld8.c().r(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        VirtualAccount virtualAccount = null;
        if (requestCode == this.REQ_GENDER) {
            int i = data.getInt("selected_option", 0);
            if (i != 0) {
                int i2 = i == 2 ? 0 : 1;
                setSex$default(this, i2, false, 2, null);
                VirtualAccount virtualAccount2 = this.user;
                if (virtualAccount2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                } else {
                    virtualAccount = virtualAccount2;
                }
                virtualAccount.setSex(i2);
            } else {
                ((UserManageViewModel) getMViewModel()).setSex(getString(zzi.f4));
                ((nk0) getMBinding()).C.setRemindText(((UserManageViewModel) getMViewModel()).getSex());
            }
        } else if (requestCode == this.REQ_WEIGHT) {
            float f = data.getFloat("key_value", 0.0f);
            if (f != 0.0f) {
                VirtualAccount virtualAccount3 = this.user;
                if (virtualAccount3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                } else {
                    virtualAccount = virtualAccount3;
                }
                virtualAccount.setWeightTarget(f);
                ((UserManageViewModel) getMViewModel()).setWeightTarget(WeightInfoUtil.INSTANCE.getFormatFloat(f) + getString(zzi.q5));
                ((nk0) getMBinding()).H.setRemindText(((UserManageViewModel) getMViewModel()).getWeightTarget());
            }
            if (getWeightResult() != null) {
                WeightResult weightResult = getWeightResult();
                Intrinsics.checkNotNull(weightResult);
                weightResult.setWeight(f);
            }
        }
        updateSaveBtnEnableStatus();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        List<ClaimRecord> list;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332 || getPageType() != 0 || ((list = this.weightRecordList) != null && !list.isEmpty())) {
            return super.onOptionsItemSelected(item);
        }
        showGiveUpDialog();
        return true;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSaveBtnEnableStatus() {
        boolean z;
        if (isAddBtnDisable()) {
            z = false;
        } else {
            VirtualAccount virtualAccount = this.user;
            VirtualAccount virtualAccount2 = null;
            if (virtualAccount == null) {
                Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                virtualAccount = null;
            }
            if (virtualAccount.getName().length() != 0) {
                VirtualAccount virtualAccount3 = this.user;
                if (virtualAccount3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                    virtualAccount3 = null;
                }
                if (virtualAccount3.getSex() < 0) {
                    z = false;
                } else {
                    VirtualAccount virtualAccount4 = this.user;
                    if (virtualAccount4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        virtualAccount4 = null;
                    }
                    if (virtualAccount4.getBirth() == 0) {
                        z = false;
                    } else {
                        VirtualAccount virtualAccount5 = this.user;
                        if (virtualAccount5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(SceneRecogBroadcastReceiver.FROM_USER);
                        } else {
                            virtualAccount2 = virtualAccount5;
                        }
                        if (virtualAccount2.getHeight() <= 0 || haveNoUserWeight()) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                }
            } else {
                z = false;
            }
        }
        this.saveBtnIsEnabled = z;
        ((nk0) getMBinding()).G.setTextColor(z ? getColor(eji.common_btn_primary_text_color) : getColor(eji.common_btn_primary_text_color_unenabled));
    }
}
