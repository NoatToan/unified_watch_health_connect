package com.xiaomi.fit.fitness.device.cgm.thirdparty;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager;
import com.xiaomi.fit.fitness.device.cgm.utils.CGMDeviceUtils;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.utils.BloodSugarComputeUtil;
import com.xiaomi.fit.fitness.export.utils.BloodSugarTargetRange;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.DeviceTime;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.StringUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.api.b;
import defpackage.ccp;
import defpackage.dcp;
import defpackage.gcp;
import defpackage.jcp;
import defpackage.s7r;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J%\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyDataManager;", "", "", "did", "", MiuiCursorConstants.CONTENT, "", "onReceiveThirdBloodSugarRequest", "(Ljava/lang/String;[B)V", "", "requestStatus", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "glucoseDevice", "sendGlucoseResponseToWear", "(ZZLcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;", "getCGMStatus", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyCgmStatus;", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseResponse;", b.I, "getBloodSugarAndSendResponse", "(Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseResponse;)V", "sendGlucoseResponseToWearThirdParty", "packageName", "checkIsBloodSugarThirdApp", "(Ljava/lang/String;)Z", "Lgcp;", "messageContent", "handleBloodSugarThirdParty", "(Ljava/lang/String;Lgcp;)Z", "cgmDevice", "onCGmDeviceStatusChanged", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "item", "", "abnormalLevel", "needNotify", "sendCurrentBloodSugarToWear", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;IZ)V", "<init>", "()V", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdPartyDataManager {

    @NotNull
    private static final String TAG = "ThirdPartyDataManager";

    @NotNull
    private static final String THIRD_PARTY_APP_FINGERPRINT = "e81b06b63656b40675c06b6bc68525656af02dd6";

    @NotNull
    private static final String THIRD_PARTY_APP_PACKAGE_NAME = "com.synapsor.watch.xiaomi";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<ThirdPartyDataManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sbp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ThirdPartyDataManager.instance_delegate$lambda$7();
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyDataManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyDataManager;", "getInstance", "()Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyDataManager;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "THIRD_PARTY_APP_PACKAGE_NAME", "THIRD_PARTY_APP_FINGERPRINT", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ThirdPartyDataManager getInstance() {
            return (ThirdPartyDataManager) ThirdPartyDataManager.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager$getBloodSugarAndSendResponse$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager$getBloodSugarAndSendResponse$1", f = "ThirdPartyDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LiveData<List<DailyBloodSugarReport>> $liveData;
        final /* synthetic */ ThirdPartyGlucoseResponse $response;
        final /* synthetic */ long $today0Time;
        int label;
        final /* synthetic */ ThirdPartyDataManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<List<DailyBloodSugarReport>> liveData, long j, ThirdPartyGlucoseResponse thirdPartyGlucoseResponse, ThirdPartyDataManager thirdPartyDataManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$liveData = liveData;
            this.$today0Time = j;
            this.$response = thirdPartyGlucoseResponse;
            this.this$0 = thirdPartyDataManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$liveData, this.$today0Time, this.$response, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final LiveData<List<DailyBloodSugarReport>> liveData = this.$liveData;
            final long j = this.$today0Time;
            final ThirdPartyGlucoseResponse thirdPartyGlucoseResponse = this.$response;
            final ThirdPartyDataManager thirdPartyDataManager = this.this$0;
            liveData.observeForever(new Observer<List<? extends DailyBloodSugarReport>>() { // from class: com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager.getBloodSugarAndSendResponse.1.1
                @Override // androidx.lifecycle.Observer
                public /* bridge */ /* synthetic */ void onChanged(List<? extends DailyBloodSugarReport> list) {
                    onChanged2((List<DailyBloodSugarReport>) list);
                }

                /* JADX INFO: renamed from: onChanged, reason: avoid collision after fix types in other method */
                public void onChanged2(List<DailyBloodSugarReport> t) {
                    BloodSugarItem minItem;
                    BloodSugarItem maxItem;
                    Intrinsics.checkNotNullParameter(t, "t");
                    try {
                        if (t.isEmpty()) {
                            FitnessLogUtils.i(ThirdPartyDataManager.TAG, "no bloodSugar");
                        } else {
                            DailyBloodSugarReport dailyBloodSugarReport = t.get(0);
                            if (dailyBloodSugarReport.getLatestItem() != null) {
                                ThirdPartyCgmData thirdPartyCgmData = new ThirdPartyCgmData(null, null, null, null, null, 31, null);
                                StatisticBloodSugar statisticBloodSugar = dailyBloodSugarReport.getStatisticBloodSugar();
                                Float fValueOf = null;
                                thirdPartyCgmData.setHighestGlucose((statisticBloodSugar == null || (maxItem = statisticBloodSugar.getMaxItem()) == null) ? null : Float.valueOf(maxItem.bloodSugar()));
                                StatisticBloodSugar statisticBloodSugar2 = dailyBloodSugarReport.getStatisticBloodSugar();
                                if (statisticBloodSugar2 != null && (minItem = statisticBloodSugar2.getMinItem()) != null) {
                                    fValueOf = Float.valueOf(minItem.bloodSugar());
                                }
                                thirdPartyCgmData.setLowesGlucose(fValueOf);
                                BloodSugarComputeUtil bloodSugarComputeUtil = BloodSugarComputeUtil.INSTANCE;
                                BloodSugarTargetRange bloodSugarTargetRange = bloodSugarComputeUtil.getBloodSugarTargetRange();
                                thirdPartyCgmData.setTarget(new ThirdPartyGlucoseTarget(bloodSugarTargetRange.getHighValue(), bloodSugarTargetRange.getLowValue()));
                                Map<Integer, Integer> targetDistMap = dailyBloodSugarReport.getTargetDistMap();
                                if (targetDistMap != null && !targetDistMap.isEmpty()) {
                                    Map<Integer, Integer> targetDistMap2 = dailyBloodSugarReport.getTargetDistMap();
                                    Intrinsics.checkNotNull(targetDistMap2);
                                    thirdPartyCgmData.setTargetRate(Integer.valueOf(bloodSugarComputeUtil.computeLevelDistPercent(targetDistMap2).getNormalPercent()));
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                                long j2 = 60;
                                long seconds = ((jCurrentTimeMillis - TimeUnit.HOURS.toSeconds(3L)) / j2) * j2;
                                ArrayList arrayList = new ArrayList();
                                Map<Long, BloodSugarItem> bloodSugarMap = dailyBloodSugarReport.getBloodSugarMap();
                                if (bloodSugarMap != null) {
                                    Iterator<Map.Entry<Long, BloodSugarItem>> it = bloodSugarMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        BloodSugarItem value = it.next().getValue();
                                        long time = value.getTime();
                                        if (seconds <= time && time <= jCurrentTimeMillis) {
                                            arrayList.add(new ThirdPartyGlucoseItem(value.getTime(), value.bloodSugar(), value.getTrend()));
                                        }
                                    }
                                }
                                thirdPartyCgmData.setGlucoseList(arrayList);
                                thirdPartyGlucoseResponse.setCgmData(thirdPartyCgmData);
                                liveData.removeObserver(this);
                                thirdPartyDataManager.sendGlucoseResponseToWearThirdParty(thirdPartyGlucoseResponse);
                                return;
                            }
                            FitnessLogUtils.i(ThirdPartyDataManager.TAG, "no today bloodSugar(" + j + ")");
                        }
                        liveData.removeObserver(this);
                        thirdPartyDataManager.sendGlucoseResponseToWearThirdParty(thirdPartyGlucoseResponse);
                    } catch (Throwable th) {
                        liveData.removeObserver(this);
                        thirdPartyDataManager.sendGlucoseResponseToWearThirdParty(thirdPartyGlucoseResponse);
                        throw th;
                    }
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private ThirdPartyDataManager() {
    }

    private final void getBloodSugarAndSendResponse(ThirdPartyGlucoseResponse response) {
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
        AnyExtKt.main$default(null, new AnonymousClass1(IRepository.DefaultImpls.getReportList$default(FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IBloodSugarRepository.class), null, "days", todayZeroTimeInSec, 0, 0, false, 32, null), todayZeroTimeInSec, response, this, null), 1, null);
    }

    private final ThirdPartyCgmStatus getCGMStatus(WearableDeviceModel glucoseDevice) {
        int i;
        if (glucoseDevice == null) {
            glucoseDevice = CGMDeviceUtils.INSTANCE.getCGMDevice();
        }
        if (glucoseDevice == null) {
            i = 2;
        } else {
            i = glucoseDevice.getIsDeviceConnected() ? 0 : 1;
        }
        DeviceTime deviceExpireTime = glucoseDevice != null ? BloodSugarExtKt.getDeviceExpireTime(glucoseDevice) : null;
        return new ThirdPartyCgmStatus(i, deviceExpireTime != null ? deviceExpireTime.getActiveTime() : null, deviceExpireTime != null ? deviceExpireTime.getActiveExpireTime() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBloodSugarThirdParty$lambda$0(ThirdPartyDataManager this$0, String did, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        this$0.onReceiveThirdBloodSugarRequest(did, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThirdPartyDataManager instance_delegate$lambda$7() {
        return new ThirdPartyDataManager();
    }

    private final void onReceiveThirdBloodSugarRequest(String did, byte[] content) {
        String str = new String(content, Charsets.UTF_8);
        FitnessLogUtils.e(TAG, "onReceiveThirdBloodSugarRequest(" + did + "):" + str);
        ThirdPartyGlucoseRequest thirdPartyGlucoseRequest = (ThirdPartyGlucoseRequest) xpd.f(str, ThirdPartyGlucoseRequest.class);
        if (thirdPartyGlucoseRequest == null) {
            return;
        }
        int requestType = thirdPartyGlucoseRequest.getRequestType();
        if (requestType == 1) {
            sendGlucoseResponseToWear$default(this, false, true, null, 4, null);
            return;
        }
        if (requestType == 2) {
            sendGlucoseResponseToWear$default(this, true, false, null, 4, null);
            return;
        }
        if (requestType == 3) {
            sendGlucoseResponseToWear$default(this, true, true, null, 4, null);
            return;
        }
        FitnessLogUtils.w(TAG, "onReceiveThirdBloodSugarRequest: invalid request(" + thirdPartyGlucoseRequest.getRequestType() + ")");
    }

    private final void sendGlucoseResponseToWear(boolean requestStatus, boolean requestData, WearableDeviceModel glucoseDevice) {
        FitnessLogUtils.i(TAG, "sendResponseToWear:requestStatus(" + requestStatus + "),requestData(" + requestData + ")");
        ThirdPartyGlucoseResponse thirdPartyGlucoseResponse = new ThirdPartyGlucoseResponse(null, null, 3, null);
        if (requestStatus) {
            thirdPartyGlucoseResponse.setCgmStatus(getCGMStatus(glucoseDevice));
        }
        if (requestData) {
            getBloodSugarAndSendResponse(thirdPartyGlucoseResponse);
        } else {
            sendGlucoseResponseToWearThirdParty(thirdPartyGlucoseResponse);
        }
    }

    public static /* synthetic */ void sendGlucoseResponseToWear$default(ThirdPartyDataManager thirdPartyDataManager, boolean z, boolean z2, WearableDeviceModel wearableDeviceModel, int i, Object obj) {
        if ((i & 4) != 0) {
            wearableDeviceModel = null;
        }
        thirdPartyDataManager.sendGlucoseResponseToWear(z, z2, wearableDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendGlucoseResponseToWearThirdParty(ThirdPartyGlucoseResponse response) {
        String strA = xpd.a(response);
        FitnessLogUtils.i(TAG, "sendGlucoseResponseToWearThirdParty(" + strA + ")");
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 8;
        ccp ccpVar = new ccp();
        ccpVar.c = THIRD_PARTY_APP_PACKAGE_NAME;
        ccpVar.d = StringUtil.INSTANCE.hexStringToByteArray(THIRD_PARTY_APP_FINGERPRINT);
        gcp gcpVar = new gcp();
        Intrinsics.checkNotNull(strA);
        byte[] bytes = strA.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        gcpVar.d = bytes;
        gcpVar.c = ccpVar;
        jcp jcpVar = new jcp();
        jcpVar.F(gcpVar);
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager.sendGlucoseResponseToWearThirdParty.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i(ThirdPartyDataManager.TAG, "sendBloodSugarToThirdParty(" + did + "), error(" + code + ")");
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                FitnessLogUtils.i(ThirdPartyDataManager.TAG, "sendBloodSugarToThirdParty(" + did + "), succeed");
            }
        }, 0, 8, null);
    }

    public final boolean checkIsBloodSugarThirdApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return Intrinsics.areEqual(THIRD_PARTY_APP_PACKAGE_NAME, packageName);
    }

    public final boolean handleBloodSugarThirdParty(@NotNull final String did, @NotNull gcp messageContent) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        ccp ccpVar = messageContent.c;
        final byte[] bArr = messageContent.d;
        String packageName = ccpVar.c;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        if (checkIsBloodSugarThirdApp(packageName) && bArr != null && bArr.length != 0) {
            ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: tbp
                @Override // java.lang.Runnable
                public final void run() {
                    ThirdPartyDataManager.handleBloodSugarThirdParty$lambda$0(this.f34548a, did, bArr);
                }
            });
            return true;
        }
        FitnessLogUtils.i(TAG, "not blood sugar third app(" + ccpVar.c + ")");
        return false;
    }

    public final void onCGmDeviceStatusChanged(@NotNull WearableDeviceModel cgmDevice) {
        Intrinsics.checkNotNullParameter(cgmDevice, "cgmDevice");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_sugar")) {
            sendGlucoseResponseToWear(true, false, cgmDevice);
        }
    }

    public final void sendCurrentBloodSugarToWear(@NotNull BloodSugarItem item, int abnormalLevel, boolean needNotify) {
        Intrinsics.checkNotNullParameter(item, "item");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "blood_sugar")) {
            FitnessLogUtils.i(TAG, "sendCurrentBloodSugarToWear(" + item + ")");
            s7r s7rVar = new s7r();
            s7rVar.e = 20;
            s7rVar.f = 20;
            dcp dcpVar = new dcp();
            dcpVar.c = item.getTimestamp();
            dcpVar.d = item.bloodSugar();
            dcpVar.e = abnormalLevel;
            dcpVar.f = needNotify;
            jcp jcpVar = new jcp();
            jcpVar.B(dcpVar);
            s7rVar.d0(jcpVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager.sendCurrentBloodSugarToWear.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    FitnessLogUtils.i(ThirdPartyDataManager.TAG, "sendCurrentBloodSugarToWear(" + did + "), error(" + code + ")");
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    FitnessLogUtils.i(ThirdPartyDataManager.TAG, "sendCurrentBloodSugarToWear(" + did + "), succeed");
                }
            }, 0, 8, null);
        }
    }
}
