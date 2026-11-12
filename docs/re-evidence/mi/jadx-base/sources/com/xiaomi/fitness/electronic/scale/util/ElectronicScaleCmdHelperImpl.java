package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import defpackage.bx7;
import defpackage.cz7;
import defpackage.ex7;
import defpackage.fx7;
import defpackage.hz7;
import defpackage.jx7;
import defpackage.kx7;
import defpackage.lx7;
import defpackage.sw7;
import defpackage.u7r;
import defpackage.ww7;
import defpackage.zw7;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016JH\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\nH\u0016J@\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010$\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010%\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010&\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ElectronicScaleCmdHelperImpl;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleCMDHelper;", "<init>", "()V", "TAG", "", "getDeviceBattery", "", "did", "onSyncCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "getWifiStatus", "getHistoryData", "syncBindUer", "syncMainUserInfo", "isSync", "", "getUserList", "updateVirtualUserToDevice", "miID", "userId", "deviceId", "userWeight", "", "userSex", "userAge", "userHeight", "updateShareUserToDevice", "", "addOrUpdateMainUser", "age", "sex", "height", "weight", "", "bindUser", "delVirtualUserToDevice", "delSharedMember", "restoreFactory", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElectronicScaleCmdHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectronicScaleCmdHelperImpl.kt\ncom/xiaomi/fitness/electronic/scale/util/ElectronicScaleCmdHelperImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n1863#2,2:352\n*S KotlinDebug\n*F\n+ 1 ElectronicScaleCmdHelperImpl.kt\ncom/xiaomi/fitness/electronic/scale/util/ElectronicScaleCmdHelperImpl\n*L\n95#1:352,2\n*E\n"})
public final class ElectronicScaleCmdHelperImpl implements ElectronicScaleCMDHelper {

    @NotNull
    private final String TAG = "ElectronicScaleCmdHelperImpl";

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void addOrUpdateMainUser(@NotNull String miID, int age, int sex, int height, float weight, @NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(miID, "miID");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(miID);
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = 0L;
        fx7Var.d = kx7Var;
        fx7Var.g = age;
        fx7Var.f = sex;
        fx7Var.e = UserHelper.INSTANCE.getMainUserType(did);
        fx7Var.h = height;
        fx7Var.i = (int) (weight * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, " addOrUpdateMainUser send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void bindUser(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 14;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = 0L;
        fx7Var.d = kx7Var;
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        fx7Var.g = companion.getInstance().getAge();
        fx7Var.f = companion.getInstance().getSex();
        fx7Var.e = UserHelper.INSTANCE.getMainUserType(did);
        fx7Var.h = (int) companion.getInstance().getHeight();
        fx7Var.i = (int) (companion.getInstance().getWeight() * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, " bindUser send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void delSharedMember(long userId, @NotNull String deviceId, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 2;
        ww7 ww7Var = new ww7();
        zw7 zw7Var = new zw7();
        jx7 jx7Var = new jx7();
        jx7Var.c = userId;
        zw7Var.c = jx7Var;
        ww7Var.B(zw7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, "syncMainUser isDelUserToDevice delSharedMember pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void delVirtualUserToDevice(@NotNull String miID, long userId, @NotNull String deviceId, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(miID, "miID");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 1;
        ww7 ww7Var = new ww7();
        ex7 ex7Var = new ex7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(miID);
        ex7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = userId;
        ex7Var.d = kx7Var;
        ww7Var.y(ex7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, "syncMainUser isDelUserToDevice delVirtualUserToDevice pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void getDeviceBattery(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        String model;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel)) == null || EcoDeviceModelExtKt.isEightScale(model)) {
            u7r u7rVar = new u7r();
            u7rVar.e = 33;
            u7rVar.f = 3;
            EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 10000);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void getHistoryData(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        String model;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel)) == null || EcoDeviceModelExtKt.isEightScale(model)) {
            u7r u7rVar = new u7r();
            u7rVar.e = 32;
            u7rVar.f = 10;
            jx7 jx7Var = new jx7();
            jx7Var.c = Long.parseLong(MiAccountManager.INSTANCE.getInstance().getMiId());
            bx7 bx7Var = new bx7();
            bx7Var.c = jx7Var;
            bx7Var.h = new sw7();
            bx7Var.i = new sw7();
            bx7Var.j = new lx7();
            bx7Var.d = new kx7();
            ww7 ww7Var = new ww7();
            ww7Var.D(bx7Var);
            u7rVar.D(ww7Var);
            EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 5000);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void getUserList(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 17;
        Logger.i(this.TAG, " isDelUserToDevice getUserList send " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.util.ElectronicScaleCmdHelperImpl.getUserList.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i(ElectronicScaleCmdHelperImpl.this.TAG, "isDelUserToDevice getUserList error it " + type + "  " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did2, int type, EcoSyncResult result) {
                Logger.i(ElectronicScaleCmdHelperImpl.this.TAG, "isDelUserToDevice getUserList success it " + (result != null ? result.getPacket() : null));
            }
        }, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void getWifiStatus(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        String model;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel)) == null || EcoDeviceModelExtKt.isEightScale(model)) {
            u7r u7rVar = new u7r();
            u7rVar.e = 33;
            u7rVar.f = 2;
            EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 3000);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void restoreFactory(@NotNull String did, @Nullable OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 30;
        cz7 cz7Var = new cz7();
        hz7 hz7Var = new hz7();
        hz7Var.c = 2;
        cz7Var.x(hz7Var);
        u7rVar.A(cz7Var);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, (int) TimeUnit.SECONDS.toMillis(5L));
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void syncBindUer(@Nullable String did) {
        String model;
        if (did == null) {
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel)) == null || EcoDeviceModelExtKt.isEightScale(model)) {
            ElectronicScaleActivityFinishHelperExtKt.getInstance(ElectronicScaleActivityFinishHelper.INSTANCE).finish();
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void syncMainUserInfo(boolean isSync) {
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        String miId = companion.getInstance().getMiId();
        int age = companion.getInstance().getAge();
        int sex = companion.getInstance().getSex();
        int height = (int) companion.getInstance().getHeight();
        float weight = companion.getInstance().getWeight();
        for (EcoDeviceModel ecoDeviceModel : EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels()) {
            if (EcoDeviceModelExtKt.isEightScale(EcoDeviceModelExtKt.getModel(ecoDeviceModel))) {
                final String str = ElectronicScalePreference.SCALE_UPDATE_INFO_KEY + ecoDeviceModel.getDid();
                ElectronicScalePreference.putBoolean(str, false);
                if (ecoDeviceModel.isDeviceConnected() && isSync) {
                    addOrUpdateMainUser(miId, age, sex, height, weight, ecoDeviceModel.getDid(), new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.util.ElectronicScaleCmdHelperImpl$syncMainUserInfo$1$1
                        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                        public void onError(String did, int type, int code) {
                            Logger.e(this.TAG, "syncMainUser error  did : " + did + " , type : " + type + " , code : " + code);
                        }

                        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                        public void onSuccess(String did, int type, EcoSyncResult result) {
                            ElectronicScalePreference.putBoolean(str, true);
                            Logger.i(this.TAG, "syncMainUser success  did : " + did + " , type : " + type + " , packet : " + (result != null ? result.getPacket() : null));
                        }
                    });
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void updateShareUserToDevice(@NotNull String deviceId, long miID, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = miID;
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = 0L;
        fx7Var.d = kx7Var;
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        fx7Var.g = companion.getInstance().getAge();
        fx7Var.f = companion.getInstance().getSex();
        fx7Var.e = UserHelper.INSTANCE.getMainUserType(deviceId);
        fx7Var.h = (int) companion.getInstance().getHeight();
        fx7Var.i = (int) (companion.getInstance().getWeight() * 10);
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, "syncVirtualUser addOrUpdateVirtualUserToDevice pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper
    public void updateVirtualUserToDevice(@NotNull String miID, @NotNull String userId, @NotNull String deviceId, int userWeight, int userSex, int userAge, int userHeight, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(miID, "miID");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 32;
        u7rVar.f = 0;
        ww7 ww7Var = new ww7();
        fx7 fx7Var = new fx7();
        jx7 jx7Var = new jx7();
        jx7Var.c = Long.parseLong(miID);
        fx7Var.c = jx7Var;
        kx7 kx7Var = new kx7();
        kx7Var.c = Long.parseLong(userId);
        fx7Var.d = kx7Var;
        fx7Var.g = userAge;
        if (userSex == 2) {
            userSex = 0;
        }
        fx7Var.f = userSex;
        fx7Var.e = 1;
        fx7Var.h = userHeight;
        fx7Var.i = userWeight;
        ww7Var.F(fx7Var);
        u7rVar.D(ww7Var);
        Logger.i(this.TAG, "syncVirtualUser addOrUpdateVirtualUserToDevice pack: " + u7rVar);
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(deviceId, u7rVar, true, onSyncCallback, 2000);
    }
}
