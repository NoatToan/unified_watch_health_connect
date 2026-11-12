package com.xiaomi.fitness.settingitem;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.settingitem.DeviceBigSettingHelper;
import com.xiaomi.fitness.settingitem.db.SettingItemDatabase;
import com.xiaomi.fitness.settingitem.db.dao.SettingItemDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.net.SettingItemRequest;
import com.xiaomi.fitness.settingitem.net.model.SettingItemModel;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.bg4;
import defpackage.ga8;
import defpackage.j5h;
import defpackage.o4h;
import defpackage.ua1;
import defpackage.udp;
import defpackage.v4h;
import defpackage.vbq;
import defpackage.vc0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J9\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceBigSettingHelper;", "Lcom/xiaomi/fitness/settingitem/BaseSettingHelper;", "", "did", RnReportConst.ApiReport.PARAM_MODULE, "key", "Lo4h;", "Ljava/util/HashMap;", "updateSettingByKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo4h;", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "deviceInfo", "updateBigSettings", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)Lo4h;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "itemResult", "getUpdateHashMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;)Ljava/util/HashMap;", "deviceModelDid", "", "isHuamiDevice", "Lga8;", "endCallBack", "", "updateSettings", "(Ljava/lang/String;ZLga8;)V", "itemInfo", "uploadSettingItem", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)V", "", "bigKeyHuaMi", "[Ljava/lang/String;", "bigKeys", "Lcom/xiaomi/fitness/settingitem/net/SettingItemRequest;", "settingItemRequest", "Lcom/xiaomi/fitness/settingitem/net/SettingItemRequest;", "getSettingItemRequest", "()Lcom/xiaomi/fitness/settingitem/net/SettingItemRequest;", "Lvbq;", "callBack", "<init>", "(Lvbq;)V", "settingitem_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceBigSettingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBigSettingHelper.kt\ncom/xiaomi/fitness/settingitem/DeviceBigSettingHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class DeviceBigSettingHelper extends BaseSettingHelper {

    @NotNull
    private final String[] bigKeyHuaMi;

    @Nullable
    private String[] bigKeys;

    @NotNull
    private final SettingItemRequest settingItemRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceBigSettingHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final HashMap<String, String> getUpdateHashMap(String did, String module, SettingItemModel.SettingItemResult itemResult) {
        HashMap<String, String> map = new HashMap<>();
        if (itemResult.getKey() != null) {
            String key = itemResult.getKey();
            Intrinsics.checkNotNull(key);
            SettingItemEntity settingItemEntity = new SettingItemEntity(key, itemResult.getValue(), did, module, itemResult.getUpdateTime(), itemResult.getUpdateTime(), true, true);
            SettingItemDao settingItemDao = SettingItemDatabase.INSTANCE.getInstance().settingItemDao();
            String key2 = itemResult.getKey();
            Intrinsics.checkNotNull(key2);
            SettingItemEntity settingByKey = settingItemDao.getSettingByKey(did, module, key2);
            if (settingByKey == null || settingByKey.getUpdateTime() <= itemResult.getUpdateTime()) {
                settingItemDao.insertOrUpdateSettingItem(settingItemEntity);
                String key3 = settingItemEntity.getKey();
                String jsonValue = settingItemEntity.getJsonValue();
                if (jsonValue == null) {
                    jsonValue = "";
                }
                map.put(key3, jsonValue);
            }
        }
        Logger.i(getTAG(), "getUpdateHashMap:" + map + " itemResult:" + itemResult);
        return map;
    }

    private final o4h<HashMap<String, String>> updateBigSettings(final SettingItemEntity deviceInfo) {
        Logger.i("[DeviceSetting]start updateBigSettings,deviceInfo" + deviceInfo, new Object[0]);
        o4h<HashMap<String, String>> o4hVarF = o4h.f(new j5h() { // from class: x16
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                DeviceBigSettingHelper.updateBigSettings$lambda$7(this.f38569a, deviceInfo, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        return o4hVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBigSettings$lambda$7(final DeviceBigSettingHelper this$0, final SettingItemEntity deviceInfo, final v4h emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.settingItemRequest.getDeviceBigSetting(deviceInfo.getDid(), deviceInfo.getModule(), deviceInfo.getKey(), deviceInfo.getUpdateTime(), new Function1() { // from class: v16
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceBigSettingHelper.updateBigSettings$lambda$7$lambda$5(emitter, this$0, deviceInfo, (SettingItemModel.SettingItemResult) obj);
            }
        }, new Function1() { // from class: w16
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceBigSettingHelper.updateBigSettings$lambda$7$lambda$6(emitter, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBigSettings$lambda$7$lambda$5(v4h emitter, DeviceBigSettingHelper this$0, SettingItemEntity deviceInfo, SettingItemModel.SettingItemResult result) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        Intrinsics.checkNotNullParameter(result, "result");
        emitter.onNext(this$0.getUpdateHashMap(deviceInfo.getDid(), deviceInfo.getModule(), result));
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBigSettings$lambda$7$lambda$6(v4h emitter, ApiException it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it, "it");
        emitter.onNext(new HashMap());
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    private final o4h<HashMap<String, String>> updateSettingByKey(String did, String module, String key) {
        SettingItemEntity settingByKey = SettingItemDatabase.INSTANCE.getInstance().settingItemDao().getSettingByKey(did, module, key);
        if (settingByKey == null) {
            settingByKey = new SettingItemEntity(key, null, did, module, 0L, System.currentTimeMillis() / ((long) 1000), false, true);
        }
        return updateBigSettings(settingByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSettings$lambda$0(DeviceBigSettingHelper this$0, String deviceModelDid, HashMap map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModelDid, "$deviceModelDid");
        if (map == null || map.size() <= 0) {
            Logger.d(this$0.getTAG(), "updateBigSettings success,value: null");
        } else {
            vbq updateFinishCallBack = this$0.getUpdateFinishCallBack();
            if (updateFinishCallBack != null) {
                updateFinishCallBack.a(deviceModelDid, map);
            }
            Logger.d(this$0.getTAG(), "updateBigSettings success,value:%s", map.values().toString(), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSettings$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSettings$lambda$2(ga8 endCallBack, DeviceBigSettingHelper this$0, String deviceModelDid, Throwable th) {
        Intrinsics.checkNotNullParameter(endCallBack, "$endCallBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModelDid, "$deviceModelDid");
        endCallBack.a(false);
        Logger.e(this$0.getTAG(), "updateDeviceSettings error, did=" + deviceModelDid + " ", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSettings$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSettings$lambda$4(ga8 endCallBack, DeviceBigSettingHelper this$0, String deviceModelDid) {
        Intrinsics.checkNotNullParameter(endCallBack, "$endCallBack");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModelDid, "$deviceModelDid");
        endCallBack.a(true);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s updateDeviceSettings complete,did=%s", Arrays.copyOf(new Object[]{this$0.getTAG(), deviceModelDid}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSettingItem$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object[] objArr = new Object[2];
        objArr[0] = BaseSettingRequestHelper.TAG;
        Throwable cause = it.getCause();
        objArr[1] = cause != null ? udp.a(cause) : null;
        String str = String.format("%s uploadSettingItem error:%s", objArr);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSettingItem$lambda$8(SettingItemEntity itemInfo, DeviceBigSettingHelper this$0, SettingItemModel.SetConfigResult result) {
        Intrinsics.checkNotNullParameter(itemInfo, "$itemInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        itemInfo.setUpload(true);
        itemInfo.setUpdateTime(result.getUpdateTime());
        this$0.saveDeviceSetItemSync(itemInfo);
        String str = String.format("%s uploadSettingItem result:%b", BaseSettingRequestHelper.TAG, Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        return Unit.INSTANCE;
    }

    @NotNull
    public final SettingItemRequest getSettingItemRequest() {
        return this.settingItemRequest;
    }

    public final void updateSettings(@NotNull final String deviceModelDid, boolean isHuamiDevice, @NotNull final ga8 endCallBack) {
        Intrinsics.checkNotNullParameter(deviceModelDid, "deviceModelDid");
        Intrinsics.checkNotNullParameter(endCallBack, "endCallBack");
        if (isHuamiDevice) {
            this.bigKeys = this.bigKeyHuaMi;
        }
        String[] strArr = this.bigKeys;
        if (strArr != null) {
            Intrinsics.checkNotNull(strArr);
            if (strArr.length != 0) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = this.bigKeys;
                Intrinsics.checkNotNull(strArr2);
                for (String str : strArr2) {
                    arrayList.add(updateSettingByKey(deviceModelDid, "device_setting", str));
                }
                o4h o4hVarH = o4h.d(arrayList).H(ua1.c());
                final Function1 function1 = new Function1() { // from class: y16
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceBigSettingHelper.updateSettings$lambda$0(this.f39676a, deviceModelDid, (HashMap) obj);
                    }
                };
                bg4 bg4Var = new bg4() { // from class: z16
                    @Override // defpackage.bg4
                    public final void accept(Object obj) {
                        DeviceBigSettingHelper.updateSettings$lambda$1(function1, obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: a26
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DeviceBigSettingHelper.updateSettings$lambda$2(endCallBack, this, deviceModelDid, (Throwable) obj);
                    }
                };
                setGetDisposable(o4hVarH.P(bg4Var, new bg4() { // from class: b26
                    @Override // defpackage.bg4
                    public final void accept(Object obj) {
                        DeviceBigSettingHelper.updateSettings$lambda$3(function2, obj);
                    }
                }, new vc0() { // from class: c26
                    @Override // defpackage.vc0
                    public final void run() {
                        DeviceBigSettingHelper.updateSettings$lambda$4(endCallBack, this, deviceModelDid);
                    }
                }));
                return;
            }
        }
        endCallBack.a(true);
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingHelper
    public void uploadSettingItem(@NotNull final SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        if (!NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp())) {
            saveDeviceSetItem(itemInfo);
        } else {
            saveDeviceSetItem(itemInfo);
            this.settingItemRequest.sendDeviceBigSetting(itemInfo.getDid(), itemInfo.getModule(), itemInfo.getKey(), itemInfo.getValue(), new Function1() { // from class: t16
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceBigSettingHelper.uploadSettingItem$lambda$8(itemInfo, this, (SettingItemModel.SetConfigResult) obj);
                }
            }, new Function1() { // from class: u16
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceBigSettingHelper.uploadSettingItem$lambda$10((ApiException) obj);
                }
            });
        }
    }

    public /* synthetic */ DeviceBigSettingHelper(vbq vbqVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : vbqVar);
    }

    public DeviceBigSettingHelper(@Nullable vbq vbqVar) {
        super(vbqVar);
        this.bigKeyHuaMi = new String[]{DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, DeviceSettingConfigKey.BIG_KEY_WORLDCLOCK, DeviceSettingConfigKey.BIG_KEY_EVENT_REMINDER, DeviceSettingConfigKey.BIG_KEY_NOTIFY_SETTINGS};
        this.settingItemRequest = new SettingItemRequest();
    }
}
