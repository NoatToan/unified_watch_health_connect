package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.electronic.scale.MainViewModel;
import com.xiaomi.fitness.electronic.scale.data.RecordResult;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.PullWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.bean.WeightRecord;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import defpackage.bu7;
import defpackage.dx7;
import defpackage.f4b;
import defpackage.qal;
import defpackage.r90;
import defpackage.u7r;
import defpackage.ub0;
import defpackage.ww7;
import defpackage.xw7;
import defpackage.zzi;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010\"\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010&\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J*\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+2\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0.\u0012\u0004\u0012\u00020\u00170-H\u0002J\u000e\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0005J(\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00052\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020403\u0012\u0004\u0012\u00020\u00170-J(\u00105\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00052\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0.\u0012\u0004\u0012\u00020\u00170-J<\u00106\u001a\u00020\u00172\u001e\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080.03\u0012\u0004\u0012\u00020\u00170-2\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00170-J2\u0010;\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?2\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AJ4\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020=2\u0006\u00100\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=H\u0082@¢\u0006\u0002\u0010HJ\u007f\u0010;\u001a\u00020\u00172\u0006\u0010F\u001a\u00020=2\u0006\u00100\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?2,\u0010I\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D\u0012\u0004\u0012\u00020\u0017\u0018\u00010-j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D\u0018\u0001`J2\u001a\u0010K\u001a\u0016\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0017\u0018\u00010-j\u0004\u0018\u0001`L¢\u0006\u0002\u0010MR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/MainViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "TAG", "", "mUnit", "", "getMUnit", "()I", "setMUnit", "(I)V", "weightUnitResCmd", "", "weightUnit", "getWeightUnit", "()Ljava/lang/String;", "setWeightUnit", "(Ljava/lang/String;)V", "weightUnitResString", "getWeightUnitResString", "()[I", "setUnitByIndex", "", "index", "attach", "savedInstanceState", "Landroid/os/Bundle;", "getDeviceStatus", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "onSyncCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "getDeviceVersion", "geNetConfig", "updateBaseWeight", "weight", "unit", "getHistoryData", "getBindInfo", "deviceId", "queryByUidAndDid", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "callBack", "Lkotlin/Function1;", "", "syncWeightRecord", "did", "addRecord", "params", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "Ljava/lang/Object;", "getLocalWeightRecord", "getWeightRecords", "success", "Lcom/xiaomi/fitness/electronic/scale/export/bean/WeightRecord;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "requestRecordResult", "time", "", "needMore", "", "pullWeightRecordCallback", "Ljava/lang/ref/SoftReference;", "Lcom/xiaomi/fitness/electronic/scale/export/PullWeightRecordCallback;", "pullRecord", "", "Lcom/xiaomi/fitness/electronic/scale/data/RecordResult;", "uid", "pageSize", "(JLjava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "(JIIJZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainViewModel extends ElectronicScaleBaseViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isPullRecord;

    @NotNull
    private final String TAG = "MainViewModel";
    private int mUnit = 1;

    @NotNull
    private final int[] weightUnitResCmd = {1, 3, 2};

    @NotNull
    private String weightUnit = "";

    @NotNull
    private final int[] weightUnitResString = {zzi.Y5, zzi.X5, zzi.V5};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/MainViewModel$Companion;", "", "<init>", "()V", "isPullRecord", "", "()Z", "setPullRecord", "(Z)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPullRecord() {
            return MainViewModel.isPullRecord;
        }

        public final void setPullRecord(boolean z) {
            MainViewModel.isPullRecord = z;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.MainViewModel$pullRecord$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.MainViewModel", f = "MainViewModel.kt", i = {}, l = {343}, m = "pullRecord", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MainViewModel.this.pullRecord(0L, null, 0, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addRecord$lambda$4(MainViewModel this$0, Function1 callBack, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "addRecord resp is " + it.getResp());
        JSONObject jSONObject = new JSONObject(it.getResp());
        int iOptInt = jSONObject.optInt("code");
        String strOptString = jSONObject.optString("message");
        Intrinsics.checkNotNull(strOptString);
        callBack.invoke2(new ProxyResponse(iOptInt, strOptString, null, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addRecord$lambda$5(MainViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "addRecord it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLocalWeightRecord$lambda$6(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        callBack.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWeightRecords$default(MainViewModel mainViewModel, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: o2f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MainViewModel.getWeightRecords$lambda$7((ApiException) obj2);
                }
            };
        }
        mainViewModel.getWeightRecords(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeightRecords$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeightRecords$lambda$8(MainViewModel this$0, Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "getWeightRecords resp is " + it.getResp());
        JSONObject jSONObject = new JSONObject(it.getResp());
        int iOptInt = jSONObject.optInt("code");
        String strOptString = jSONObject.optString("message");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            List listB = bu7.b(jSONArrayOptJSONArray.toString(), WeightRecord.class);
            Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.electronic.scale.export.bean.WeightRecord>");
            arrayList = (ArrayList) listB;
        }
        Intrinsics.checkNotNull(strOptString);
        success.invoke2(new ProxyResponse(iOptInt, strOptString, arrayList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object pullRecord(long j, String str, int i, long j2, Continuation<? super List<RecordResult>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objPullRecord = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objPullRecord);
            ScaleRequest scaleRequest = new ScaleRequest();
            qal.c("pullRecord() do realTime time is " + j2);
            anonymousClass2.label = 1;
            objPullRecord = scaleRequest.pullRecord(j, str, i, j2, anonymousClass2);
            if (objPullRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPullRecord);
        }
        ScaleData scaleData = (ScaleData) objPullRecord;
        qal.c("pullRecord() scaleData is " + scaleData);
        JSONObject jSONObject = new JSONObject(scaleData.getResp());
        int iOptInt = jSONObject.optInt("code");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        ArrayList arrayList = new ArrayList();
        if (iOptInt != 200 || jSONArrayOptJSONArray == null) {
            qal.c("pullRecord() do break");
            return arrayList;
        }
        List listB = bu7.b(jSONArrayOptJSONArray.toString(), RecordResult.class);
        Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.electronic.scale.data.RecordResult>");
        List listAsMutableList = TypeIntrinsics.asMutableList(listB);
        qal.c("pullRecord() do dataList.size is " + listAsMutableList.size());
        return listAsMutableList;
    }

    private final void queryByUidAndDid(VirtualAccount virtualAccount, final Function1<? super List<VirtualAccount>, Unit> callBack) {
        VirtualAccountHelper.INSTANCE.queryByUidAndDid(virtualAccount, new Function1() { // from class: h2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.queryByUidAndDid$lambda$0(callBack, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryByUidAndDid$lambda$0(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        callBack.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestRecordResult$default(MainViewModel mainViewModel, int i, long j, boolean z, SoftReference softReference, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            softReference = null;
        }
        mainViewModel.requestRecordResult(i, j, z2, softReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRecordResult$lambda$10(int i, SoftReference softReference, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("requestRecordResult size is " + it.size());
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            RecordResult recordResult = (RecordResult) it2.next();
            VirtualAccount virtualAccount = new VirtualAccount(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
            virtualAccount.setDid(String.valueOf(recordResult.getDeviceId()));
            virtualAccount.setModel(recordResult.getModel());
            virtualAccount.setAccountId(recordResult.getAccountId());
            virtualAccount.setUid(recordResult.getUserId());
            virtualAccount.setDel(false);
            virtualAccount.setSyn(true);
            if (virtualAccount.getUid() == virtualAccount.getAccountId()) {
                virtualAccount.setType(1);
            } else {
                virtualAccount.setType(2);
                WeightResult weightResultChangeRecordToWeight = recordResult.changeRecordToWeight();
                virtualAccount.setBodyComposition(f4b.c(weightResultChangeRecordToWeight));
                virtualAccount.setCreateTime(recordResult.getCreateTime());
                virtualAccount.setCreateDate(DateUtil.INSTANCE.getDateToString(recordResult.getCreateTime(), "yyyyMMdd"));
                VirtualAccountHelper.insertVirtualAccount$default(VirtualAccountHelper.INSTANCE, virtualAccount, new Function0() { // from class: g2f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, null, 4, null);
                if (virtualAccount.getType() == 1) {
                    WeightInfoUtil.INSTANCE.recordWeight(String.valueOf(i), FitnessDateUtils.getCurrentTZOffsetInSec(), recordResult.getCreateTime(), weightResultChangeRecordToWeight);
                }
            }
        }
        AnyExtKt.main$default(null, new MainViewModel$requestRecordResult$1$2(it, softReference, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRecordResult$lambda$11(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("requestRecordResult with exception " + it);
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestRecordResult$lambda$13(final MainViewModel this$0, final long j, final int i, final int i2, final Ref.LongRef realTime, final boolean z, final Function1 function1, final Function1 function2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(realTime, "$realTime");
        ScopeExtKt.scopeNet(Dispatchers.getIO(), new MainViewModel$requestRecordResult$3$1(this$0, j, i, i2, realTime, z, function1, null)).m503catch(new Function2() { // from class: f2f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainViewModel.requestRecordResult$lambda$13$lambda$12(this.f17332a, j, i, i2, realTime, z, function1, function2, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRecordResult$lambda$13$lambda$12(MainViewModel this$0, long j, int i, int i2, Ref.LongRef realTime, boolean z, Function1 function1, Function1 function2, AndroidScope androidScope, Throwable it) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(realTime, "$realTime");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        isPullRecord = false;
        OTALogExtKt.loge(this$0.TAG, "requestRecordResult fail with " + it);
        ApiException apiException = (ApiException) it;
        OTALogExtKt.loge(this$0.TAG, "requestRecordResult fail exception " + apiException);
        Thread.sleep(VibrateModeProgressBar.sLongToLong);
        this$0.requestRecordResult(j, i, i2, realTime.element, z, function1, function2);
        if (function2 != null) {
            function2.invoke2(apiException);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncWeightRecord$lambda$3(final MainViewModel this$0, final List virtualAccounts, String did, String str, List it) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtualAccounts, "$virtualAccounts");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty()) {
            Logger.i(this$0.TAG, "addRecord() isNullOrEmpty");
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                VirtualAccount virtualAccount = (VirtualAccount) it2.next();
                if (!virtualAccount.isSyn()) {
                    virtualAccount.setSyn(true);
                    virtualAccounts.add(virtualAccount);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("did", did);
                    jSONObject.put("model", str);
                    WeightResult weightResult = (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class);
                    jSONObject.put("data", weightResult != null ? weightResult.spliceAllProperties() : null);
                    jSONObject.put("createTime", virtualAccount.getCreateTime());
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() < 1) {
                Logger.i(this$0.TAG, "addRecord() jsonArray is empty");
            } else {
                Logger.i(this$0.TAG, "addRecord() jsonArray length " + jSONArray.length());
                String string = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this$0.addRecord(string, new Function1() { // from class: j2f
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MainViewModel.syncWeightRecord$lambda$3$lambda$2(this.f22353a, virtualAccounts, (ProxyResponse) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncWeightRecord$lambda$3$lambda$2(final MainViewModel this$0, List virtualAccounts, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtualAccounts, "$virtualAccounts");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "addRecord() response:" + it.getCode() + it.getMessage());
        if (it.getCode() == 200) {
            VirtualAccountHelper.INSTANCE.updateList(virtualAccounts, new Function0() { // from class: m2f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainViewModel.syncWeightRecord$lambda$3$lambda$2$lambda$1(this.f25679a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncWeightRecord$lambda$3$lambda$2$lambda$1(MainViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "addRecord() updateList success");
        return Unit.INSTANCE;
    }

    private final void updateBaseWeight(EcoDeviceModel deviceModel, int weight, int unit, OnEcoSyncCallback onSyncCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 7;
        ww7 ww7Var = new ww7();
        dx7 dx7Var = new dx7();
        dx7Var.c = weight;
        dx7Var.d = unit;
        ww7Var.E(dx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, " updateBaseWeight send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceModel.getDid(), u7rVar, true, onSyncCallback, 2000);
    }

    public final void addRecord(@NotNull String params, @NotNull final Function1<? super ProxyResponse<Object>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        new ScaleRequest().addRecord(ViewModelKt.getViewModelScope(this), params, new Function1() { // from class: p2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.addRecord$lambda$4(this.f29935a, callBack, (ScaleData) obj);
            }
        }, new Function1() { // from class: d2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.addRecord$lambda$5(this.f14995a, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void geNetConfig(@NotNull EcoDeviceModel deviceModel, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 5;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceModel.getDid(), u7rVar, true, onSyncCallback, 2000);
    }

    public final void getBindInfo(@NotNull String deviceId, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 17;
        ub0 ub0Var = new ub0();
        ub0Var.c = false;
        r90 r90Var = new r90();
        r90Var.Q(ub0Var);
        u7rVar.z(r90Var);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }

    public final void getDeviceStatus(@NotNull EcoDeviceModel deviceModel, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 2;
        u7rVar.f = 1;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceModel.getDid(), u7rVar, true, onSyncCallback, 2000);
    }

    public final void getDeviceVersion(@NotNull EcoDeviceModel deviceModel, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 1;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceModel.getDid(), u7rVar, true, onSyncCallback, 2000);
    }

    public final void getHistoryData(@NotNull EcoDeviceModel deviceModel, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 10;
        Logger.i(this.TAG, " getHistoryData send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceModel.getDid(), u7rVar, true, onSyncCallback, 2000);
    }

    public final void getLocalWeightRecord(@NotNull String did, @NotNull final Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        VirtualAccountHelper.INSTANCE.queryByUidAndDid(new VirtualAccount(did, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524282, null), new Function1() { // from class: c2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.getLocalWeightRecord$lambda$6(callBack, (List) obj);
            }
        });
    }

    public final int getMUnit() {
        return this.mUnit;
    }

    public final void getWeightRecords(@NotNull final Function1<? super ProxyResponse<List<WeightRecord>>, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new ScaleRequest().getWeightRecords(ViewModelKt.getViewModelScope(this), MiAccountManager.INSTANCE.getInstance().getMiId(), 1, 10, new Function1() { // from class: e2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.getWeightRecords$lambda$8(this.f16192a, success, (ScaleData) obj);
            }
        }, error);
    }

    @NotNull
    public final String getWeightUnit() {
        return this.weightUnit;
    }

    @NotNull
    public final int[] getWeightUnitResString() {
        return this.weightUnitResString;
    }

    public final void requestRecordResult(final int did, long time, boolean needMore, @Nullable final SoftReference<PullWeightRecordCallback> pullWeightRecordCallback) {
        long j = Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        qal.c("requestRecordResult id is " + time);
        requestRecordResult(j, did, 200, time, needMore, new Function1() { // from class: k2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.requestRecordResult$lambda$10(did, pullWeightRecordCallback, (List) obj);
            }
        }, new Function1() { // from class: l2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.requestRecordResult$lambda$11((ApiException) obj);
            }
        });
    }

    public final void setMUnit(int i) {
        this.mUnit = i;
    }

    public final void setUnitByIndex(int index) {
        this.mUnit = this.weightUnitResCmd[index];
    }

    public final void setWeightUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weightUnit = str;
    }

    public final void syncWeightRecord(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        VirtualAccount virtualAccount = new VirtualAccount(did, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524282, null);
        DeviceInfo<? extends Device> deviceInfoInAll = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceInfoInAll(did);
        final String model = deviceInfoInAll != null ? deviceInfoInAll.getModel() : null;
        Logger.i(this.TAG, "addRecord() model:" + model + " did: " + did);
        final ArrayList arrayList = new ArrayList();
        queryByUidAndDid(virtualAccount, new Function1() { // from class: n2f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainViewModel.syncWeightRecord$lambda$3(this.f27477a, arrayList, did, model, (List) obj);
            }
        });
    }

    public final void setWeightUnit(int index, @NotNull EcoDeviceModel deviceModel, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 3;
        ww7 ww7Var = new ww7();
        xw7 xw7Var = new xw7();
        xw7Var.c = this.weightUnitResCmd[index];
        u7rVar.D(ww7Var);
        u7rVar.t().z(xw7Var);
        Logger.i(this.TAG, " setWeightUnit send " + u7rVar);
        Logger.i(this.TAG, "MainViewModel setUnit unit:" + xw7Var.c);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceModel.getDid(), u7rVar, true, onSyncCallback, 2000);
    }

    public final void requestRecordResult(final long uid, final int did, final int pageSize, long time, final boolean needMore, @Nullable final Function1<? super List<RecordResult>, Unit> onSuccess, @Nullable final Function1<? super ApiException, Unit> onFail) {
        qal.c("requestRecordResult isPullRecord : " + isPullRecord + " ");
        if (isPullRecord) {
            return;
        }
        isPullRecord = true;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = time;
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: i2f
            @Override // java.lang.Runnable
            public final void run() {
                MainViewModel.requestRecordResult$lambda$13(this.f20699a, uid, did, pageSize, longRef, needMore, onSuccess, onFail);
            }
        });
    }
}
