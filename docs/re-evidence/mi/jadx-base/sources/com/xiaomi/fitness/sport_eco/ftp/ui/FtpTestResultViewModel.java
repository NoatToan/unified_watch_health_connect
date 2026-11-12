package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.os.Bundle;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpRequest;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.bt7;
import defpackage.e1j;
import defpackage.fs9;
import defpackage.lp5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b/\u00100J#\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u000b2 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "Lfs9;", "", "key", "findEco", "([Lfs9;I)Lfs9;", "value", "Lkotlin/Function1;", "", "", "callback", "setEcoSettingItem", "(IILkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "it", "goSportReport", "(Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultActivity;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function2;", "readEcoSettingConfig", "(Lkotlin/jvm/functions/Function2;)V", "getConfigValue", "(I)I", "ftpResult", "setFtpResult", "(ILkotlin/jvm/functions/Function1;)V", "uploadFtpValue", "(I)V", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;", "request", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;", "", "TAG", "Ljava/lang/String;", "localSportType", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mEcoSettingList", "[Lfs9;", "<init>", "(Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpRequest;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFtpTestResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtpTestResultViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,161:1\n1#2:162\n13402#3,2:163\n*S KotlinDebug\n*F\n+ 1 FtpTestResultViewModel.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestResultViewModel\n*L\n89#1:163,2\n*E\n"})
public final class FtpTestResultViewModel extends AbsViewModel {

    @NotNull
    private final String TAG;

    @NotNull
    private String localSportType;
    private EcoDeviceModel mDeviceModel;

    @Nullable
    private fs9[] mEcoSettingList;

    @NotNull
    private final FtpRequest request;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultViewModel$uploadFtpValue$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultViewModel$uploadFtpValue$1", f = "FtpTestResultViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $ftpResult;
        int label;
        final /* synthetic */ FtpTestResultViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31091(int i, FtpTestResultViewModel ftpTestResultViewModel, Continuation<? super C31091> continuation) {
            super(2, continuation);
            this.$ftpResult = i;
            this.this$0 = ftpTestResultViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31091(this.$ftpResult, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
                    sportManagerExportPreference.setKEY_GYM_LOCAL_LAST_FTP_RESULT(this.$ftpResult);
                    sportManagerExportPreference.setKEY_GYM_LOCAL_FTP_RESULT(this.$ftpResult);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
                    jSONObject.put("createTime", System.currentTimeMillis());
                    jSONObject.put("ftp", this.$ftpResult);
                    FtpRequest ftpRequest = this.this$0.request;
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this.label = 1;
                    obj = ftpRequest.requestEcoApi("eco/general-equipment/exercise_bike/ftp/add", string, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                int iOptInt = new JSONObject(((FtpModel.RespData) obj).getResp()).optInt("code");
                if (iOptInt == 0 || iOptInt == 200) {
                    SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_FTP_RESULT(-1);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FtpTestResultViewModel(@NotNull FtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.TAG = "FtpTestResultViewModel";
        this.localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        this.mEcoSettingList = new fs9[0];
    }

    private final fs9 findEco(fs9[] fs9VarArr, int i) {
        for (fs9 fs9Var : fs9VarArr) {
            if (fs9Var.c == i) {
                return fs9Var;
            }
        }
        return null;
    }

    private final void setEcoSettingItem(final int key, final int value, final Function1<? super Boolean, Unit> callback) {
        fs9 fs9Var = new fs9();
        fs9Var.c = key;
        fs9Var.d = value;
        Unit unit = Unit.INSTANCE;
        fs9[] fs9VarArr = {fs9Var};
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        EcoDeviceModelExtKt.setEcoGYMSettings(ecoDeviceModel, fs9VarArr, new bt7<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultViewModel.setEcoSettingItem.1
            @Override // defpackage.bt7
            public void onError(int errorCode) {
                ScopeExtKt.scope(Dispatchers.getMain(), new FtpTestResultViewModel$setEcoSettingItem$1$onError$1(FtpTestResultViewModel.this, key, value, errorCode, callback, null));
            }

            @Override // defpackage.bt7
            public void onResult(Boolean result) {
                ScopeExtKt.scope(Dispatchers.getMain(), new FtpTestResultViewModel$setEcoSettingItem$1$onResult$1(FtpTestResultViewModel.this, key, value, callback, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFtpResult$lambda$3(FtpTestResultViewModel this$0, int i, Function1 callback, boolean z) {
        fs9 fs9VarFindEco;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        FitnessLogUtils.d(this$0.TAG, "setFtpResult " + i + " result:" + z);
        if (z) {
            fs9[] fs9VarArr = this$0.mEcoSettingList;
            if (fs9VarArr != null && (fs9VarFindEco = this$0.findEco(fs9VarArr, 7)) != null) {
                fs9VarFindEco.d = i;
            }
        } else {
            ToastUtil.showToast(ResourceExtKt.getString(e1j.common_set_error));
        }
        if (!z) {
            i = -1;
        }
        callback.invoke2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadFtpValue$lambda$5(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.localSportType;
        if (str.length() == 0) {
            str = "ksmb.treadmill.m1v1";
        }
        EcoDeviceModel localDeviceModel = ecoDeviceManagerExtKt.getLocalDeviceModel(str);
        if (localDeviceModel == null) {
            throw new IllegalStateException("local device is null");
        }
        this.mDeviceModel = localDeviceModel;
    }

    public final int getConfigValue(int key) {
        fs9 fs9VarFindEco;
        fs9[] fs9VarArr = this.mEcoSettingList;
        if (fs9VarArr == null || (fs9VarFindEco = findEco(fs9VarArr, key)) == null) {
            return -1;
        }
        return fs9VarFindEco.d;
    }

    public final void goSportReport(@NotNull FtpTestResultActivity activity, @Nullable SportBasicReport it) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (it == null) {
            activity.finish();
            return;
        }
        FitnessLogUtils.d(this.TAG, "SportBasicReport has data");
        Bundle bundle = new Bundle();
        int iA = lp5.a(it);
        bundle.putLong("time_stamp", it.getTimeStamp());
        bundle.putSerializable("sport_report", it);
        bundle.putInt("sport_type", iA);
        if (Intrinsics.areEqual(this.localSportType, "yesoul.exbike.jsc01y")) {
            SportRecordApiKt.getSportRecordApi().goEcoSportBicycleDetail(activity, bundle, it);
        } else {
            SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), activity, bundle, it, false, 8, null);
        }
        activity.finish();
    }

    public final void readEcoSettingConfig(@NotNull final Function2<? super Boolean, ? super fs9[], Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        EcoDeviceModelExtKt.getEcoGYMSettings(ecoDeviceModel, new bt7<fs9[]>() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultViewModel.readEcoSettingConfig.1
            @Override // defpackage.bt7
            public void onError(int errorCode) {
                ScopeExtKt.scope(Dispatchers.getMain(), new FtpTestResultViewModel$readEcoSettingConfig$1$onError$1(callback, null));
            }

            @Override // defpackage.bt7
            public void onResult(fs9[] result) {
                ScopeExtKt.scope(Dispatchers.getMain(), new FtpTestResultViewModel$readEcoSettingConfig$1$onResult$1(FtpTestResultViewModel.this, result, callback, null));
            }
        });
    }

    public final void setFtpResult(final int ftpResult, @NotNull final Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        setEcoSettingItem(7, ftpResult, new Function1() { // from class: dsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpTestResultViewModel.setFtpResult$lambda$3(this.f15882a, ftpResult, callback, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void uploadFtpValue(int ftpResult) {
        androidx.lifecycle.ScopeExtKt.scopeNetLife$default(this, null, new C31091(ftpResult, this, null), 1, null).m503catch(new Function2() { // from class: esa
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FtpTestResultViewModel.uploadFtpValue$lambda$5((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }
}
