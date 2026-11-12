package com.xiaomi.fitness.settingitem;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.settingitem.DeviceSmallSettingHelper;
import com.xiaomi.fitness.settingitem.db.SettingItemDatabase;
import com.xiaomi.fitness.settingitem.db.dao.SettingDeviceDao;
import com.xiaomi.fitness.settingitem.db.dao.SettingItemDao;
import com.xiaomi.fitness.settingitem.db.entity.SettingDeviceEntity;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.net.SettingItemRequest;
import com.xiaomi.fitness.settingitem.net.model.SettingItemModel;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ga8;
import defpackage.udp;
import defpackage.vbq;
import java.net.ConnectException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0001.B\u0015\b\u0000\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\fJ'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/settingitem/DeviceSmallSettingHelper;", "Lcom/xiaomi/fitness/settingitem/BaseSettingHelper;", "", "did", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingDeviceEntity;", "getSettingDeviceInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/settingitem/db/entity/SettingDeviceEntity;", "deviceInfo", "Lga8;", "endCallBack", "", "updateDeviceSettings", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingDeviceEntity;Lga8;)V", RnReportConst.ApiReport.PARAM_MODULE, "", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "datas", "Ljava/util/HashMap;", "getUpdateHashMap", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/HashMap;", "onUpdateFinish", "", "updateTime", "saveDeviceSetInfoSync", "(Ljava/lang/String;Ljava/lang/String;J)V", "updateSettings", "(Ljava/lang/String;Lga8;)V", "Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;", "itemInfo", "uploadSettingItem", "(Lcom/xiaomi/fitness/settingitem/db/entity/SettingItemEntity;)V", "maps", "uploadSettingItems", "(Ljava/lang/String;Ljava/util/HashMap;)V", "Lcom/xiaomi/fitness/settingitem/net/SettingItemRequest;", "settingItemRequest$delegate", "Lkotlin/Lazy;", "getSettingItemRequest", "()Lcom/xiaomi/fitness/settingitem/net/SettingItemRequest;", "settingItemRequest", "updateTimeMap", "Ljava/util/HashMap;", "Lvbq;", "callBack", "<init>", "(Lvbq;)V", "Companion", "settingitem_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceSmallSettingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSmallSettingHelper.kt\ncom/xiaomi/fitness/settingitem/DeviceSmallSettingHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
public final class DeviceSmallSettingHelper extends BaseSettingHelper {
    private static final int LIMIT_SETTING_ITEM = 20;

    /* JADX INFO: renamed from: settingItemRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingItemRequest;

    @NotNull
    private final HashMap<String, Long> updateTimeMap;

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.DeviceSmallSettingHelper$saveDeviceSetInfoSync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.DeviceSmallSettingHelper$saveDeviceSetInfoSync$1", f = "DeviceSmallSettingHelper.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SettingDeviceEntity $info;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SettingDeviceEntity settingDeviceEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$info = settingDeviceEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$info, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingDeviceDao settingDeviceDao = SettingItemDatabase.INSTANCE.getInstance().settingDeviceDao();
                SettingDeviceEntity settingDeviceEntity = this.$info;
                this.label = 1;
                if (settingDeviceDao.update(settingDeviceEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSmallSettingHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final SettingDeviceEntity getSettingDeviceInfo(String did) {
        SettingDeviceEntity setting = SettingItemDatabase.INSTANCE.getInstance().settingDeviceDao().getSetting(did, "device_setting");
        return setting == null ? new SettingDeviceEntity("device_setting", did, 0L, 0) : setting;
    }

    private final HashMap<String, String> getUpdateHashMap(String did, String module, List<SettingItemModel.SettingItemResult> datas) {
        HashMap<String, String> map = new HashMap<>();
        if (datas != null && (!datas.isEmpty())) {
            SettingItemDao settingItemDao = SettingItemDatabase.INSTANCE.getInstance().settingItemDao();
            long jCoerceAtLeast = 0;
            for (SettingItemModel.SettingItemResult settingItemResult : datas) {
                String key = settingItemResult.getKey();
                long j = jCoerceAtLeast;
                SettingItemEntity settingItemEntity = new SettingItemEntity(key == null ? "" : key, settingItemResult.getValue(), did, module, settingItemResult.getUpdateTime(), settingItemResult.getUpdateTime(), true, false);
                String key2 = settingItemResult.getKey();
                if (key2 == null) {
                    key2 = "";
                }
                SettingItemEntity settingByKey = settingItemDao.getSettingByKey(did, module, key2);
                if ((settingByKey != null ? settingByKey.getUpdateTime() : 0L) <= settingItemResult.getUpdateTime()) {
                    Logger.d(getTAG(), "insertOrUpdateSettingItem: " + settingItemEntity);
                    settingItemDao.insertOrUpdateSettingItem(settingItemEntity);
                    map.put(settingItemEntity.getKey(), settingItemEntity.getJsonValue());
                }
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j, settingItemEntity.getUpdateTime());
            }
            this.updateTimeMap.put(did, Long.valueOf(jCoerceAtLeast));
        }
        return map;
    }

    private final synchronized void onUpdateFinish(SettingDeviceEntity deviceInfo, ga8 endCallBack) {
        try {
            Long l = this.updateTimeMap.get(deviceInfo.getDid());
            deviceInfo.setUpdateTime(l != null ? l.longValue() : 0L);
            deviceInfo.setLastId(0);
            long jInsertOrUpdateSettingDevice = SettingItemDatabase.INSTANCE.getInstance().settingDeviceDao().insertOrUpdateSettingDevice(deviceInfo);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s saveDeviceSettings result is " + jInsertOrUpdateSettingDevice, Arrays.copyOf(new Object[]{BaseSettingRequestHelper.TAG}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Logger.i(str, new Object[0]);
            endCallBack.a(jInsertOrUpdateSettingDevice > 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void saveDeviceSetInfoSync(String did, String module, long updateTime) {
        AnyExtKt.io$default(null, new AnonymousClass1(new SettingDeviceEntity(module, did, updateTime, 0), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SettingItemRequest settingItemRequest_delegate$lambda$0() {
        return new SettingItemRequest();
    }

    private final void updateDeviceSettings(final SettingDeviceEntity deviceInfo, final ga8 endCallBack) {
        Logger.i(getTAG(), "updateDeviceSettings: " + deviceInfo.getDid() + ", updateTime:" + deviceInfo.getUpdateTime() + " lastId:" + deviceInfo.getLastId());
        getSettingItemRequest().getDeviceSetting(deviceInfo.getDid(), deviceInfo.getModule(), deviceInfo.getUpdateTime(), deviceInfo.getLastId(), 20, new Function1() { // from class: lp6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceSmallSettingHelper.updateDeviceSettings$lambda$1(this.f25291a, deviceInfo, endCallBack, (SettingItemModel.GetConfigByModuleResult) obj);
            }
        }, new Function1() { // from class: mp6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceSmallSettingHelper.updateDeviceSettings$lambda$3(endCallBack, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceSettings$lambda$1(DeviceSmallSettingHelper this$0, SettingDeviceEntity deviceInfo, ga8 endCallBack, SettingItemModel.GetConfigByModuleResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        Intrinsics.checkNotNullParameter(endCallBack, "$endCallBack");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i(this$0.getTAG(), "updateDeviceSettings: result = " + result);
        HashMap<String, String> map = new HashMap<>();
        if (result.getDatas() != null) {
            map = this$0.getUpdateHashMap(deviceInfo.getDid(), deviceInfo.getModule(), result.getDatas());
        }
        if (map.size() <= 0) {
            endCallBack.a(true);
        } else if (result.getLastId() != -1) {
            deviceInfo.setLastId(result.getLastId());
            this$0.updateDeviceSettings(deviceInfo, endCallBack);
        } else {
            this$0.onUpdateFinish(deviceInfo, endCallBack);
        }
        vbq updateFinishCallBack = this$0.getUpdateFinishCallBack();
        if (updateFinishCallBack != null) {
            updateFinishCallBack.a(deviceInfo.getDid(), map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDeviceSettings$lambda$3(ga8 endCallBack, ApiException it) {
        Intrinsics.checkNotNullParameter(endCallBack, "$endCallBack");
        Intrinsics.checkNotNullParameter(it, "it");
        Object[] objArr = new Object[2];
        objArr[0] = BaseSettingRequestHelper.TAG;
        Throwable cause = it.getCause();
        objArr[1] = cause != null ? udp.a(cause) : null;
        String str = String.format("%s updateDeviceSettings error:%s", objArr);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        endCallBack.a(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSettingItem$lambda$7$lambda$4(SettingItemEntity itemInfo, DeviceSmallSettingHelper this$0, SettingItemModel.SetConfigResult setResult) {
        Intrinsics.checkNotNullParameter(itemInfo, "$itemInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(setResult, "setResult");
        itemInfo.setUpload(true);
        itemInfo.setUpdateTime(setResult.getUpdateTime());
        itemInfo.setModifyTime(setResult.getUpdateTime());
        this$0.saveDeviceSetItemSync(itemInfo);
        this$0.saveDeviceSetInfoSync(itemInfo.getDid(), itemInfo.getModule(), itemInfo.getUpdateTime());
        String str = String.format("%s uploadSettingItem result:%b", BaseSettingRequestHelper.TAG, Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSettingItem$lambda$7$lambda$6(DeviceSmallSettingHelper this$0, SettingItemEntity itemInfo, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemInfo, "$itemInfo");
        Intrinsics.checkNotNullParameter(it, "it");
        Object[] objArr = new Object[2];
        objArr[0] = BaseSettingRequestHelper.TAG;
        Throwable cause = it.getCause();
        objArr[1] = cause != null ? udp.a(cause) : null;
        String str = String.format("%s uploadSettingItem error:%s", objArr);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        if (it.getCause() instanceof ConnectException) {
            this$0.saveDeviceSetItem(itemInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSettingItems$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object[] objArr = new Object[2];
        objArr[0] = BaseSettingRequestHelper.TAG;
        Throwable cause = it.getCause();
        objArr[1] = cause != null ? udp.a(cause) : null;
        String str = String.format("%s uploadSettingItems error:%s", objArr);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.i(str, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSettingItems$lambda$8(String did, DeviceSmallSettingHelper this$0, SettingItemModel.SetConfigResult setResult) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(setResult, "setResult");
        List<SettingItemEntity> settingByDid = SettingItemDatabase.INSTANCE.getInstance().settingItemDao().getSettingByDid(did, false);
        if (settingByDid != null) {
            long updateTime = 0;
            for (SettingItemEntity settingItemEntity : settingByDid) {
                settingItemEntity.setUpload(true);
                settingItemEntity.setUpdateTime(setResult.getUpdateTime());
                updateTime = setResult.getUpdateTime();
            }
            if (updateTime > 0) {
                this$0.saveDeviceSetInfoSync(did, "device_setting", updateTime);
            }
            String str = String.format("%s uploadSettingItems result:%b", BaseSettingRequestHelper.TAG, Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Logger.i(str, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final SettingItemRequest getSettingItemRequest() {
        return (SettingItemRequest) this.settingItemRequest.getValue();
    }

    public final void updateSettings(@NotNull String did, @NotNull ga8 endCallBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(endCallBack, "endCallBack");
        updateDeviceSettings(getSettingDeviceInfo(did), endCallBack);
    }

    @Override // com.xiaomi.fitness.settingitem.BaseSettingHelper
    public void uploadSettingItem(@NotNull final SettingItemEntity itemInfo) {
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        NetUtil netUtil = NetUtil.INSTANCE;
        if (!netUtil.getNetWorkAvailable(AppUtil.getApp()) || !AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            Logger.i(BaseSettingRequestHelper.TAG, " uploadSettingItem saveDeviceSetItem:NetWorkAvailable:" + netUtil.getNetWorkAvailable(AppUtil.getApp()) + " isLogin:" + AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin());
            saveDeviceSetItem(itemInfo);
            return;
        }
        Logger.i(getTAG(), "uploadSettingItem,item key: " + itemInfo.getKey() + ",value:" + itemInfo.getValue());
        String value = itemInfo.getValue();
        if (value != null) {
            getSettingItemRequest().sendDeviceSetting(itemInfo.getDid(), itemInfo.getModule(), itemInfo.getKey(), value, new Function1() { // from class: jp6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceSmallSettingHelper.uploadSettingItem$lambda$7$lambda$4(itemInfo, this, (SettingItemModel.SetConfigResult) obj);
                }
            }, new Function1() { // from class: kp6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceSmallSettingHelper.uploadSettingItem$lambda$7$lambda$6(this.f24129a, itemInfo, (ApiException) obj);
                }
            });
        }
    }

    public final void uploadSettingItems(@NotNull final String did, @NotNull HashMap<String, String> maps) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(maps, "maps");
        getSettingItemRequest().sendDeviceSetting(did, "device_setting", maps, new Function1() { // from class: op6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceSmallSettingHelper.uploadSettingItems$lambda$8(did, this, (SettingItemModel.SetConfigResult) obj);
            }
        }, new Function1() { // from class: pp6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceSmallSettingHelper.uploadSettingItems$lambda$10((ApiException) obj);
            }
        });
    }

    public /* synthetic */ DeviceSmallSettingHelper(vbq vbqVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : vbqVar);
    }

    public DeviceSmallSettingHelper(@Nullable vbq vbqVar) {
        super(vbqVar);
        this.settingItemRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: np6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceSmallSettingHelper.settingItemRequest_delegate$lambda$0();
            }
        });
        this.updateTimeMap = new HashMap<>();
    }
}
