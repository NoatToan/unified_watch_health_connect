package com.xiaomi.fitness.electronic.scale;

import android.content.DialogInterface;
import android.content.Intent;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.data.DeleteByDidAndCreateTimeBean;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.av6;
import defpackage.f4b;
import defpackage.ld8;
import defpackage.qal;
import defpackage.uno;
import defpackage.zcp;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\u001fJ8\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0080\u0001\u0010&\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002J2\u00101\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00162\u0006\u00102\u001a\u0002032\u0018\u00104\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u000b\u0012\u0004\u0012\u00020\u001805H\u0002J\u0010\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\fH\u0002J8\u00108\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002JN\u00109\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200J\u001c\u0010:\u001a\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010;\u001a\u00020<J$\u0010=\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u001a2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180?Jj\u0010@\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u001a2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180?H\u0002J\u0010\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020DH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsHelper;", "", "<init>", "()V", "TAG", "", "nickName", "did", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "weightRecordList", "", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "showNoBodyFatErrorDialog", "", "delList", "Lcom/xiaomi/fitness/electronic/scale/data/DeleteByDidAndCreateTimeBean;", "getDelList", "()Ljava/util/List;", "setDelList", "(Ljava/util/List;)V", MediaStoreUtil.MediaInfo.SIZE, "", "claimVirtualAccountRecordGet", "", "virtualId", "", "sex", "age", "height", "", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Ljava/lang/String;Ljava/lang/Long;IIFLjava/lang/String;Ljava/util/List;)V", "claimRecordGet", "userType", "deleteRecord", "claimRecord", "finishActivity", "getCheckList", "addRealAccountWeightRecord", "model", "userId", "icon", "heartRate", "weight", "intArray", "", "time", "onAddToDbListener", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnAddToDbListener;", "queryByUidAndDid", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "callBack", "Lkotlin/Function1;", "hasZK", "record", "showEnsureClaimDialog", "addVirtualAccountWeightRecord", "deleteByDidAndCreateTime", "onDelListener", "Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel$OnDeleteByDidAndCreateTimeListener;", "deleteClaimedRecordInDb", "createTime", "Lkotlin/Function0;", "saveVirtualUserBodyMakeUpData", "sn", "onBodyCompositionSDKMeasure", "event", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBodyCompositionSDKMeasureEvent;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClaimRecordsHelper {

    @NotNull
    public static final ClaimRecordsHelper INSTANCE;

    @NotNull
    private static final String TAG = "ClaimRecordsHelper";
    private static BaseActivity activity;

    @NotNull
    private static List<DeleteByDidAndCreateTimeBean> delList;
    private static String did;
    private static String nickName;
    private static boolean showNoBodyFatErrorDialog;
    private static int size;
    private static List<ClaimRecord> weightRecordList;

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper$saveVirtualUserBodyMakeUpData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper$saveVirtualUserBodyMakeUpData$1", f = "ClaimRecordsHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C23211(Continuation<? super C23211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23211(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScaleUtil.INSTANCE.sendDataChangedBroadcast(true, Boxing.boxInt(0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        ClaimRecordsHelper claimRecordsHelper = new ClaimRecordsHelper();
        INSTANCE = claimRecordsHelper;
        delList = new ArrayList();
        ld8.c().p(claimRecordsHelper);
    }

    private ClaimRecordsHelper() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    private final void addRealAccountWeightRecord(String did2, String model, int userType, String userId, long virtualId, String icon, String nickName2, int heartRate, int sex, int age, float height, float weight, int[] intArray, long time, final ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        WeightManager.Companion companion = WeightManager.INSTANCE;
        WeightManager companion2 = companion.getInstance();
        WeightManager companion3 = companion.getInstance();
        Long lValueOf = Long.valueOf(virtualId);
        EcoDeviceManager.Companion companion4 = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion4).getDeviceModel(did2);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            sn = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion4).getDeviceModel(did2);
            sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                sn = "0";
            }
        }
        WeightManager.saveBodyMakeUpData$default(companion2, companion3.getBodyMakeUpData(did2, model, userType, userId, lValueOf, icon, nickName2, heartRate, sex, age, height, weight, intArray, time, sn, false), null, new Function0() { // from class: bz3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimRecordsHelper.addRealAccountWeightRecord$lambda$4(onAddToDbListener);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addRealAccountWeightRecord$lambda$4(ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener) {
        Intrinsics.checkNotNullParameter(onAddToDbListener, "$onAddToDbListener");
        Logger.i(TAG, "addRealAccountWeightRecord success");
        onAddToDbListener.onSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccountWeightRecord$lambda$8(ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener) {
        Intrinsics.checkNotNullParameter(onAddToDbListener, "$onAddToDbListener");
        Logger.i(TAG, "addVirtualAccountWeightRecord success");
        onAddToDbListener.onSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void claimRecordGet(int userType, final long virtualId, int sex, int age, float height, String nickName2) {
        final long j = virtualId;
        Logger.i(ClaimRecordsActivity.TAG, "claimRecordGet, userType: " + userType + ", virtualId: " + j);
        List<ClaimRecord> checkList = getCheckList();
        List<ClaimRecord> list = checkList;
        if (list == null || list.isEmpty()) {
            return;
        }
        NetUtil netUtil = NetUtil.INSTANCE;
        BaseActivity baseActivity = activity;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
            baseActivity = null;
        }
        if (!netUtil.getNetWorkAvailable(baseActivity)) {
            ToastUtil.INSTANCE.showToast(zzi.common_hint_network_unavailable);
            return;
        }
        BaseActivity baseActivity2 = activity;
        if (baseActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
            baseActivity2 = null;
        }
        baseActivity2.showLoading(zzi.e, false);
        size = 0;
        delList = new ArrayList();
        for (final ClaimRecord claimRecord : checkList) {
            if (hasZK(claimRecord)) {
                int[] iArr = {claimRecord.getLfz12(), claimRecord.getLfz13(), claimRecord.getLfz14(), claimRecord.getLfz23(), claimRecord.getLfz24(), claimRecord.getLfz34(), claimRecord.getHfz12(), claimRecord.getHfz13(), claimRecord.getHfz14(), claimRecord.getHfz23(), claimRecord.getHfz24(), claimRecord.getHfz34()};
                String str = did;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("did");
                    str = null;
                }
                addRealAccountWeightRecord(str, "yunmai.scales.ms3001", userType, AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), virtualId, "", nickName2, claimRecord.getHeartRate(), sex, age, height, claimRecord.getWeight(), iArr, claimRecord.getCreateTime(), new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper.claimRecordGet.1
                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
                    public void onSuccess() throws JSONException {
                        ClaimRecordsHelper.INSTANCE.deleteRecord(claimRecord, j);
                    }
                });
                j = virtualId;
            } else {
                String str2 = did;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("did");
                    str2 = null;
                }
                addVirtualAccountWeightRecord(str2, "yunmai.scales.ms3001", "", virtualId, "", claimRecord.getWeight(), userType, claimRecord.getCreateTime(), new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper.claimRecordGet.2
                    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
                    public void onSuccess() throws JSONException {
                        ClaimRecordsHelper.INSTANCE.deleteRecord(claimRecord, virtualId);
                    }
                });
                j = virtualId;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByDidAndCreateTime$lambda$10(ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener onDelListener, ApiException it) {
        Intrinsics.checkNotNullParameter(onDelListener, "$onDelListener");
        Intrinsics.checkNotNullParameter(it, "it");
        onDelListener.onError();
        qal.c("getClaimedRecords it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByDidAndCreateTime$lambda$9(ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener onDelListener, ScaleData it) {
        Intrinsics.checkNotNullParameter(onDelListener, "$onDelListener");
        Intrinsics.checkNotNullParameter(it, "it");
        JSONObject jSONObject = new JSONObject(it.getResp());
        jSONObject.optInt("code");
        jSONObject.optString("message");
        jSONObject.optString("data");
        qal.c("deleteByDidAndCreateTime result is " + jSONObject);
        onDelListener.onSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteClaimedRecordInDb$lambda$11(String did2, long j, Function0 callBack) {
        Intrinsics.checkNotNullParameter(did2, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        qal.c("deleteClaimedRecordInDb success did : " + did2 + "  createTime : " + j);
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteRecord(ClaimRecord claimRecord, long virtualId) throws JSONException {
        String str = null;
        if (!claimRecord.getIsCloud()) {
            String str2 = did;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("did");
            } else {
                str = str2;
            }
            deleteClaimedRecordInDb(str, claimRecord.getCreateTime(), new Function0() { // from class: cz3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClaimRecordsHelper.deleteRecord$lambda$0();
                }
            });
            return;
        }
        String str3 = did;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("did");
        } else {
            str = str3;
        }
        ListExtKt.add(delList, new DeleteByDidAndCreateTimeBean(str, claimRecord.getCreateTime()));
        Logger.i(ClaimRecordsActivity.TAG, "add real user success");
        int i = size + 1;
        size = i;
        if (i == getCheckList().size()) {
            deleteByDidAndCreateTime(delList, new ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper.deleteRecord.1
                @Override // com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener
                public void onError() {
                    BaseActivity baseActivity = ClaimRecordsHelper.activity;
                    if (baseActivity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
                        baseActivity = null;
                    }
                    baseActivity.hideLoading();
                    ClaimRecordsHelper.size = 0;
                    ClaimRecordsHelper.INSTANCE.setDelList(new ArrayList());
                    ToastUtil.showShortToast(zzi.u0);
                }

                @Override // com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener
                public void onSuccess() {
                    BaseActivity baseActivity = ClaimRecordsHelper.activity;
                    if (baseActivity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
                        baseActivity = null;
                    }
                    baseActivity.hideLoading();
                    ClaimRecordsHelper.size = 0;
                    ClaimRecordsHelper claimRecordsHelper = ClaimRecordsHelper.INSTANCE;
                    claimRecordsHelper.setDelList(new ArrayList());
                    ToastUtil.showShortToast(zzi.v0);
                    claimRecordsHelper.finishActivity();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteRecord$lambda$0() {
        BaseActivity baseActivity = activity;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
            baseActivity = null;
        }
        baseActivity.hideLoading();
        ToastUtil.showShortToast(zzi.v0);
        INSTANCE.finishActivity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivity() {
        zcp.a(new Runnable() { // from class: dz3
            @Override // java.lang.Runnable
            public final void run() {
                ClaimRecordsHelper.finishActivity$lambda$1();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishActivity$lambda$1() {
        qal.c("ClaimRecordsHelper#finishActivity");
        BaseActivity baseActivity = activity;
        BaseActivity baseActivity2 = null;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
            baseActivity = null;
        }
        baseActivity.setResult(-1, new Intent());
        BaseActivity baseActivity3 = activity;
        if (baseActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        } else {
            baseActivity2 = baseActivity3;
        }
        baseActivity2.finish();
    }

    private final List<ClaimRecord> getCheckList() {
        List<ClaimRecord> list = weightRecordList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("weightRecordList");
        return null;
    }

    private final boolean hasZK(ClaimRecord record) {
        return (record.getLfz12() == 0 || record.getLfz13() == 0 || record.getLfz14() == 0 || record.getLfz23() == 0 || record.getLfz24() == 0 || record.getLfz34() == 0 || record.getHfz12() == 0 || record.getHfz13() == 0 || record.getHfz14() == 0 || record.getHfz23() == 0 || record.getHfz24() == 0 || record.getHfz34() == 0) ? false : true;
    }

    private final void queryByUidAndDid(int userType, VirtualAccount virtualAccount, final Function1<? super List<VirtualAccount>, Unit> callBack) {
        VirtualAccountHelper.INSTANCE.queryByUidAndDidAndUserType(userType, virtualAccount, new Function1() { // from class: gz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsHelper.queryByUidAndDid$lambda$5(callBack, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryByUidAndDid$lambda$5(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        callBack.invoke2(list);
        return Unit.INSTANCE;
    }

    private final void saveVirtualUserBodyMakeUpData(String did2, String model, String userId, long virtualId, String icon, String nickName2, float weight, String sn, int userType, long time, Function0<Unit> callBack) {
        WeightResult weightResult = new WeightResult(1, userId, weight, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (short) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, String.valueOf(virtualId), sn, time, -8, Integer.MAX_VALUE, 0, null);
        VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
        virtualAccount.setDid(did2);
        virtualAccount.setModel(model);
        virtualAccount.setAccountId(virtualId);
        virtualAccount.setUid(Long.parseLong(userId));
        virtualAccount.setDel(false);
        virtualAccount.setIcon(icon == null ? "" : icon);
        virtualAccount.setName(nickName2 != null ? nickName2 : "");
        virtualAccount.setType(userType);
        virtualAccount.setBodyComposition(f4b.c(weightResult));
        virtualAccount.setCreateTime(time);
        virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(time, "yyyyMMdd"));
        qal.c("saveVirtualUserBodyMakeUpData() virtualId : " + virtualAccount.getAccountId() + " ====== createDate : " + virtualAccount.getCreateDate() + " === userType : " + userType);
        if (userType == 1) {
            WeightInfoUtil.INSTANCE.recordWeight(did2, FitnessDateUtils.getCurrentTZOffsetInSec(), time, weightResult);
            AnyExtKt.main$default(null, new C23211(null), 1, null);
        }
        VirtualAccountHelper.insertVirtualAccount$default(VirtualAccountHelper.INSTANCE, virtualAccount, callBack, null, 4, null);
    }

    private final void showEnsureClaimDialog(final int userType, final long virtualId, final int sex, final int age, final float height, final String nickName2) {
        CommonDialog.c dialogTitle = new CommonDialog.c("show_ensure_claim_dialog").setDialogTitle(zzi.s0);
        BaseActivity baseActivity = activity;
        BaseActivity baseActivity2 = null;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
            baseActivity = null;
        }
        CommonDialog commonDialogCreate = dialogTitle.setDialogDescriptionString(new DialogParams.DialogDescriptionString(baseActivity.getString(zzi.t0, nickName2))).setPositiveText(zzi.c).setNegativeText(zzi.f41831b).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsHelper.showEnsureClaimDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    } else if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                ClaimRecordsHelper.INSTANCE.claimRecordGet(userType, virtualId, sex, age, height, nickName2);
            }
        });
        BaseActivity baseActivity3 = activity;
        if (baseActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(LifecycleConstantKt.TYPE_ACTIVITY);
        } else {
            baseActivity2 = baseActivity3;
        }
        commonDialogCreate.showIfNeed(baseActivity2.getSupportFragmentManager());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    public final void addVirtualAccountWeightRecord(@NotNull String did2, @NotNull String model, @NotNull String icon, long virtualId, @NotNull String nickName2, float weight, int userType, long time, @NotNull final ElectronicScaleBaseViewModel.OnAddToDbListener onAddToDbListener) {
        String sn;
        EcoDeviceInfo deviceInfo;
        EcoDeviceInfo deviceInfo2;
        Intrinsics.checkNotNullParameter(did2, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName2, "nickName");
        Intrinsics.checkNotNullParameter(onAddToDbListener, "onAddToDbListener");
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did2);
        if (ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || deviceInfo.getSn() == null) {
            sn = "0";
        } else {
            EcoDeviceModel ecoDeviceModel2 = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getDeviceModel(did2);
            sn = (ecoDeviceModel2 == null || (deviceInfo2 = ecoDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo2.getSn();
            if (sn == null) {
                sn = "0";
            }
        }
        saveVirtualUserBodyMakeUpData(did2, model, userId, virtualId, icon, nickName2, weight, sn, userType, time, new Function0() { // from class: zy3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimRecordsHelper.addVirtualAccountWeightRecord$lambda$8(onAddToDbListener);
            }
        });
    }

    public final void claimVirtualAccountRecordGet(@NotNull BaseActivity activity2, @NotNull String did2, @Nullable Long virtualId, int sex, int age, float height, @NotNull String nickName2, @NotNull List<ClaimRecord> weightRecordList2) {
        Intrinsics.checkNotNullParameter(activity2, "activity");
        Intrinsics.checkNotNullParameter(did2, "did");
        Intrinsics.checkNotNullParameter(nickName2, "nickName");
        Intrinsics.checkNotNullParameter(weightRecordList2, "weightRecordList");
        weightRecordList = weightRecordList2;
        activity = activity2;
        did = did2;
        nickName = nickName2;
        Intrinsics.checkNotNull(virtualId);
        claimRecordGet(2, virtualId.longValue(), sex, age, height, nickName2);
    }

    public final void deleteByDidAndCreateTime(@NotNull List<DeleteByDidAndCreateTimeBean> delList2, @NotNull final ClaimRecordsViewModel.OnDeleteByDidAndCreateTimeListener onDelListener) throws JSONException {
        Intrinsics.checkNotNullParameter(delList2, "delList");
        Intrinsics.checkNotNullParameter(onDelListener, "onDelListener");
        new ScaleRequest().deleteByDidAndCreateTimeParamsList(new NetCoroutineScope(null, null, null, 7, null), delList2, new Function1() { // from class: ez3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsHelper.deleteByDidAndCreateTime$lambda$9(onDelListener, (ScaleData) obj);
            }
        }, new Function1() { // from class: fz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsHelper.deleteByDidAndCreateTime$lambda$10(onDelListener, (ApiException) obj);
            }
        });
    }

    public final void deleteClaimedRecordInDb(@NotNull final String did2, final long createTime, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(did2, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        ClaimRecordHelper.INSTANCE.deleteClaimRecord(did2, createTime, new Function0() { // from class: az3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimRecordsHelper.deleteClaimedRecordInDb$lambda$11(did2, createTime, callBack);
            }
        });
    }

    @NotNull
    public final List<DeleteByDidAndCreateTimeBean> getDelList() {
        return delList;
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onBodyCompositionSDKMeasure(@NotNull ScaleEventBusIds.OnBodyCompositionSDKMeasureEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        showNoBodyFatErrorDialog = !event.getIsSuccess();
    }

    public final void setDelList(@NotNull List<DeleteByDidAndCreateTimeBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        delList = list;
    }
}
