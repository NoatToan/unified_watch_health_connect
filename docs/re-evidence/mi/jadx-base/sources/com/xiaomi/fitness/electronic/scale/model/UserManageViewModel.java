package com.xiaomi.fitness.electronic.scale.model;

import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.common.CommonConstants;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.WeightManager;
import com.xiaomi.fitness.electronic.scale.model.UserManageViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.ScalePageUtil;
import com.xiaomi.fitness.electronic.scale.util.WeightInfoUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.bu7;
import defpackage.ex7;
import defpackage.fx7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.qal;
import defpackage.u7r;
import defpackage.ww7;
import defpackage.zzi;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u00102\u001a\u0002032\u0006\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020\n2\u001e\u00106\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0908\u0012\u0004\u0012\u00020307JP\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020>2\u0006\u0010\u0012\u001a\u00020%2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020:08\u0012\u0004\u0012\u00020307J(\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020\n2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020A08\u0012\u0004\u0012\u00020307J\"\u0010B\u001a\u0002032\u0006\u00104\u001a\u00020%2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020307J@\u0010D\u001a\u0002032\b\u0010E\u001a\u0004\u0018\u00010\n2\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020+JP\u0010I\u001a\u0002032\u0006\u0010J\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0006\u0010E\u001a\u00020\n2\u0006\u0010K\u001a\u00020>2\u0006\u0010H\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020+2\u0006\u0010L\u001a\u00020MH\u0002J\u000e\u0010N\u001a\u0002032\u0006\u0010F\u001a\u00020\nJ2\u0010O\u001a\u0002032\b\u0010P\u001a\u0004\u0018\u00010\n2\u0006\u0010F\u001a\u00020%2\b\u0010Q\u001a\u0004\u0018\u00010\n2\u0006\u0010K\u001a\u00020>2\u0006\u0010H\u001a\u00020+J\b\u0010R\u001a\u0004\u0018\u00010SR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020+X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010-\"\u0004\b0\u00101¨\u0006T"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/UserManageViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "isDeleteMode", "", "()Z", "setDeleteMode", "(Z)V", CommonConstants.KEY_USER_NAME, "", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "sex", "getSex", "setSex", MedicalIdSPContract.PREF_BIRTHDAY, "getBirth", "setBirth", "height", "getHeight", "setHeight", "weightTarget", "getWeightTarget", "setWeightTarget", "hasEditName", "getHasEditName", "setHasEditName", "scaleRequest", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "getScaleRequest", "()Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "setScaleRequest", "(Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;)V", "userId", "", "getUserId", "()J", "userId$delegate", "Lkotlin/Lazy;", "maxAddNum", "", "getMaxAddNum", "()I", "addedNum", "getAddedNum", "setAddedNum", "(I)V", "getVirtualAccount", "", "uid", "did", "callBack", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "addVirtualAccount", "name", "icon", "", "deleteVirtualAccount", Column.ACCOUNT_ID, "Ljava/lang/Object;", "uploadScaleIcon", "Lorg/json/JSONObject;", "addVirtualUserToDevice", "deviceId", "virtualId", "userWeight", "unit", "addOrUpdateVirtualUserToDevice", "miID", "weight", "onSyncCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "delUserToDevice", "addVirtualAccountWeightRecord", "url", "nickName", "getBirthdayRange", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserManageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManageViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/UserManageViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1863#2,2:322\n1863#2,2:324\n*S KotlinDebug\n*F\n+ 1 UserManageViewModel.kt\ncom/xiaomi/fitness/electronic/scale/model/UserManageViewModel\n*L\n166#1:322,2\n243#1:324,2\n*E\n"})
public final class UserManageViewModel extends ElectronicScaleBaseViewModel {
    private int addedNum;
    private boolean hasEditName;
    private boolean isDeleteMode;
    public ScaleRequest scaleRequest;

    @NotNull
    private String userName = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String sex = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String birth = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String height = ResourceExtKt.getString(zzi.f4);

    @NotNull
    private String weightTarget = ResourceExtKt.getString(zzi.f4);

    /* JADX INFO: renamed from: userId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lhq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(UserManageViewModel.userId_delegate$lambda$0());
        }
    });
    private final int maxAddNum = 5;

    private final void addOrUpdateVirtualUserToDevice(String miID, long userId, String deviceId, float weight, int unit, int sex, long birth, int height, OnEcoSyncCallback onSyncCallback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(miID);
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = userId;
        fx7Var.d = kx7Var;
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        String dateToString = weightInfoUtil.getDateToString(birth, "yyyy-MM-dd");
        Intrinsics.checkNotNull(dateToString);
        fx7Var.g = weightInfoUtil.getAge(weightInfoUtil.parseDate(dateToString));
        fx7Var.f = sex;
        fx7Var.e = 1;
        fx7Var.h = height;
        fx7Var.i = (int) (WeightManager.INSTANCE.getInstance().convertToKg(weight, unit) * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        qal.c("addVirtualAccount() send addOrUpdateVirtualUserToDevice: " + u7rVar + " - " + deviceId);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccount$lambda$2(Function1 callBack, ScaleData it) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            JSONObject jSONObject = new JSONObject(it.getResp());
            int iOptInt = jSONObject.optInt("code");
            String strOptString = jSONObject.optString("message");
            VirtualAccount virtualAccount = (VirtualAccount) bu7.a(jSONObject.optString("data"), VirtualAccount.class);
            Intrinsics.checkNotNull(strOptString);
            callBack.invoke2(new ProxyResponse(iOptInt, strOptString, virtualAccount));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addVirtualAccount$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("addVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteVirtualAccount$lambda$4(Function1 callBack, ScaleData it) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            JSONObject jSONObject = new JSONObject(it.getResp());
            int iOptInt = jSONObject.optInt("code");
            String strOptString = jSONObject.optString("message");
            Intrinsics.checkNotNull(strOptString);
            callBack.invoke2(new ProxyResponse(iOptInt, strOptString, null, 4, null));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteVirtualAccount$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("deleteVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccount$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("getVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadScaleIcon$lambda$6(Function1 callBack, ScaleData it) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            Object obj = new JSONObject(it.getResp()).get("result");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            callBack.invoke2((JSONObject) obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadScaleIcon$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("uploadScaleIcon it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long userId_delegate$lambda$0() {
        return Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
    }

    public final void addVirtualAccount(@NotNull String name, @NotNull String icon, int sex, int height, float weightTarget, long birth, @NotNull final Function1<? super ProxyResponse<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getScaleRequest().addVirtualAccount(ViewModelKt.getViewModelScope(this), name, icon, sex, height, weightTarget, birth, new Function1() { // from class: ohq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.addVirtualAccount$lambda$2(callBack, (ScaleData) obj);
            }
        }, new Function1() { // from class: phq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.addVirtualAccount$lambda$3((ApiException) obj);
            }
        });
    }

    public final void addVirtualAccountWeightRecord(@Nullable String url, final long virtualId, @Nullable String nickName, float weight, int unit) {
        if (virtualId == 0) {
            return;
        }
        WeightManager.Companion companion = WeightManager.INSTANCE;
        companion.getInstance().addVirtualAccountWeightRecord("", "yunmai.scales.ms3001", url != null ? url : "", virtualId, nickName != null ? nickName : "", companion.getInstance().convertToKg(weight, unit), new ElectronicScaleBaseViewModel.OnAddToDbListener() { // from class: com.xiaomi.fitness.electronic.scale.model.UserManageViewModel.addVirtualAccountWeightRecord.5
            @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel.OnAddToDbListener
            public void onSuccess() {
                Logger.i(ElectronicScaleBaseViewModel.TAG, "handleWeight add virtual user success");
                ScalePageUtil.goVmData$default(ScalePageUtil.INSTANCE, virtualId, false, true, 2, null);
            }
        }, (128 & 128) != 0 ? System.currentTimeMillis() : 0L);
    }

    public final void addVirtualUserToDevice(@Nullable String deviceId, long virtualId, float userWeight, int unit, int sex, long birth, int height) {
        qal.c("addVirtualAccount() addVirtualUserToDevice deviceId:" + deviceId);
        qal.c("addVirtualAccount() addVirtualUserToDevice virtualId:" + virtualId);
        qal.c("addVirtualAccount() addVirtualUserToDevice userWeight:" + userWeight);
        if (deviceId != null && deviceId.length() != 0) {
            addOrUpdateVirtualUserToDevice(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), virtualId, deviceId, userWeight, unit, sex, birth, height, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.model.UserManageViewModel.addVirtualUserToDevice.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did, int type, int code) {
                    qal.c("addVirtualAccount addVirtualAccount() response:" + type + "," + code);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did, int type, EcoSyncResult result) {
                    qal.c("addVirtualAccount addVirtualUserToDevice() response:" + (result != null ? result.getPacket() : null));
                }
            });
            return;
        }
        for (EcoDeviceModel ecoDeviceModel : EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels()) {
            if (EcoDeviceModelExtKt.isEco(ecoDeviceModel) && ecoDeviceModel.isDeviceConnected()) {
                addOrUpdateVirtualUserToDevice(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), virtualId, ecoDeviceModel.getDid(), userWeight, unit, sex, birth, height, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.model.UserManageViewModel$addVirtualUserToDevice$2$1
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did, int type, int code) {
                        qal.c("addVirtualAccount addVirtualAccount() response all:" + type + "," + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onSuccess(String did, int type, EcoSyncResult result) {
                        qal.c("addVirtualAccount addVirtualUserToDevice() response all:" + (result != null ? result.getPacket() : null));
                    }
                });
            }
        }
    }

    public final void delUserToDevice(@NotNull String virtualId) {
        Intrinsics.checkNotNullParameter(virtualId, "virtualId");
        if (Intrinsics.areEqual(virtualId, "0")) {
            return;
        }
        for (EcoDeviceModel ecoDeviceModel : EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels()) {
            if (EcoDeviceModelExtKt.isEco(ecoDeviceModel) && ecoDeviceModel.isDeviceConnected()) {
                u7r u7rVar = new u7r();
                u7rVar.e = 32;
                u7rVar.f = 1;
                ww7 ww7Var = new ww7();
                ex7 ex7Var = new ex7();
                jx7 jx7Var = new jx7();
                jx7Var.c = Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
                ex7Var.c = jx7Var;
                kx7 kx7Var = new kx7();
                kx7Var.c = Long.parseLong(virtualId);
                ex7Var.d = kx7Var;
                ww7Var.y(ex7Var);
                u7rVar.D(ww7Var);
                EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(ecoDeviceModel.getDid(), u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.model.UserManageViewModel$delUserToDevice$1$1
                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onError(String did, int type, int code) {
                        qal.c("delUserToDevice() response:" + type + "," + code);
                    }

                    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                    public void onSuccess(String did, int type, EcoSyncResult result) {
                        qal.c("delUserToDevice() response:" + (result != null ? result.getPacket() : null));
                    }
                }, 2000);
            }
        }
    }

    public final void deleteVirtualAccount(@NotNull String accountId, @NotNull final Function1<? super ProxyResponse<Object>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getScaleRequest().deleteVirtualAccount(ViewModelKt.getViewModelScope(this), accountId, new Function1() { // from class: mhq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.deleteVirtualAccount$lambda$4(callBack, (ScaleData) obj);
            }
        }, new Function1() { // from class: nhq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.deleteVirtualAccount$lambda$5((ApiException) obj);
            }
        });
    }

    public final int getAddedNum() {
        return this.addedNum;
    }

    @NotNull
    public final String getBirth() {
        return this.birth;
    }

    @Nullable
    public final long[] getBirthdayRange() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        return new long[]{calendar.getTimeInMillis(), timeInMillis};
    }

    public final boolean getHasEditName() {
        return this.hasEditName;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    public final int getMaxAddNum() {
        return this.maxAddNum;
    }

    @NotNull
    public final ScaleRequest getScaleRequest() {
        ScaleRequest scaleRequest = this.scaleRequest;
        if (scaleRequest != null) {
            return scaleRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scaleRequest");
        return null;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    public final long getUserId() {
        return ((Number) this.userId.getValue()).longValue();
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final void getVirtualAccount(long uid, @NotNull String did, @NotNull Function1<? super ProxyResponse<List<VirtualAccount>>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), uid, did, callBack, new Function1() { // from class: khq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.getVirtualAccount$lambda$1((ApiException) obj);
            }
        });
    }

    @NotNull
    public final String getWeightTarget() {
        return this.weightTarget;
    }

    /* JADX INFO: renamed from: isDeleteMode, reason: from getter */
    public final boolean getIsDeleteMode() {
        return this.isDeleteMode;
    }

    public final void setAddedNum(int i) {
        this.addedNum = i;
    }

    public final void setBirth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birth = str;
    }

    public final void setDeleteMode(boolean z) {
        this.isDeleteMode = z;
    }

    public final void setHasEditName(boolean z) {
        this.hasEditName = z;
    }

    public final void setHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.height = str;
    }

    public final void setScaleRequest(@NotNull ScaleRequest scaleRequest) {
        Intrinsics.checkNotNullParameter(scaleRequest, "<set-?>");
        this.scaleRequest = scaleRequest;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setWeightTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weightTarget = str;
    }

    public final void uploadScaleIcon(long uid, @NotNull final Function1<? super JSONObject, Unit> callBack) throws JSONException {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getScaleRequest().uploadScaleIcon(ViewModelKt.getViewModelScope(this), uid, new Function1() { // from class: qhq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.uploadScaleIcon$lambda$6(callBack, (ScaleData) obj);
            }
        }, new Function1() { // from class: rhq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserManageViewModel.uploadScaleIcon$lambda$7((ApiException) obj);
            }
        });
    }
}
