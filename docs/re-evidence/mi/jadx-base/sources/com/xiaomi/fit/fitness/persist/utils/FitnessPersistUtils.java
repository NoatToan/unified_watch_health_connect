package com.xiaomi.fit.fitness.persist.utils;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.persist.data.CloudSyncCheckResult;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.tjg;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0001J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014J+\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019¢\u0006\u0002\u0010\u001aJ4\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001c\"\u0004\b\u0000\u0010\u00162\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001f0\u001e2\u0006\u0010 \u001a\u00020\u0005J.\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001f0\u001f\"\u0004\b\u0000\u0010\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001f2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006-"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/utils/FitnessPersistUtils;", "", "<init>", "()V", "TAG", "", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "accountMgr", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getAccountMgr", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "accountMgr$delegate", "toJson", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", "fromJson", "T", "value", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getMapValueList", "", "map", "", "", "key", "computeBatchGroupList", "modelList", "limit", "", "getZoneName", "zoneOffsetInSec", "checkServerRequestEnable", "Lcom/xiaomi/fit/fitness/persist/data/CloudSyncCheckResult;", "notUploadGps2Server", "", "isNotUploadGpsSwitchEnable", "isGpsLimitCountry", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessPersistUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessPersistUtils.kt\ncom/xiaomi/fit/fitness/persist/utils/FitnessPersistUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final class FitnessPersistUtils {

    @NotNull
    private static final String TAG = "FitnessPersistUtils";

    @NotNull
    public static final FitnessPersistUtils INSTANCE = new FitnessPersistUtils();

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessPersistUtils.mGson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: accountMgr$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy accountMgr = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessPersistUtils.accountMgr_delegate$lambda$1();
        }
    });

    private FitnessPersistUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountManager accountMgr_delegate$lambda$1() {
        return AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
    }

    private final AccountManager getAccountMgr() {
        return (AccountManager) accountMgr.getValue();
    }

    private final Gson getMGson() {
        return (Gson) mGson.getValue();
    }

    private final boolean isGpsLimitCountry() {
        RegionManager.Companion companion = RegionManager.INSTANCE;
        return StringsKt__StringsJVMKt.contentEquals(RegionExtKt.getInstance(companion).getCurrentRegion(), "sg", true) && StringsKt__StringsJVMKt.contentEquals(RegionExtKt.getInstance(companion).getLocalCountry(), ServerConstants.NEW_KR_COUNTRY_CODE, true);
    }

    private final boolean isNotUploadGpsSwitchEnable() {
        return !StringsKt__StringsJVMKt.contentEquals(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion(), "cn", true) && AboutManagerExtKt.getInstance(AboutManager.INSTANCE).getNotUploadGpsEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    @NotNull
    public final CloudSyncCheckResult checkServerRequestEnable() {
        if (!getAccountMgr().isLogin()) {
            FitnessLogUtils.i(TAG, "no login account");
            return CloudSyncCheckResult.NO_ACCOUNT_LOGIN;
        }
        if (!RegionPreference.INSTANCE.getSyncWeb()) {
            FitnessLogUtils.i(TAG, "cloud sync switch close");
            return CloudSyncCheckResult.CLOUD_SWITCH_CLOSE;
        }
        if (!tjg.a(ApplicationExtKt.getApplication())) {
            FitnessLogUtils.i(TAG, "no network");
            return CloudSyncCheckResult.NO_NETWORK;
        }
        if (ApplicationExtKt.isForeground(ApplicationExtKt.getApplication())) {
            return CloudSyncCheckResult.SUCCESS;
        }
        FitnessLogUtils.i(TAG, "app running in background");
        return CloudSyncCheckResult.BACKGROUND_RUNNING;
    }

    @NotNull
    public final <T> List<List<T>> computeBatchGroupList(@NotNull List<? extends T> modelList, int limit) {
        Intrinsics.checkNotNullParameter(modelList, "modelList");
        if (limit <= 0) {
            throw new IllegalArgumentException(("computeBatchGroupList invalid limit = " + limit).toString());
        }
        ArrayList arrayList = new ArrayList();
        int size = modelList.size();
        int i = size / limit;
        int i2 = size % limit;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 * limit;
            i3++;
            arrayList.add(modelList.subList(i4, i3 * limit));
        }
        FitnessLogUtils.i(TAG, "computeBatchGroupList: source size = " + size + ", batchSize = " + i);
        if (i3 == i && i2 > 0) {
            arrayList.add(modelList.subList(i3 * limit, size));
        }
        return arrayList;
    }

    @Nullable
    public final <T> T fromJson(@Nullable String value, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (value != null) {
            try {
                if (value.length() != 0) {
                    return (T) getMGson().fromJson(value, (Class) clazz);
                }
            } catch (Exception e) {
                FitnessLogUtils.e(TAG, "FitnessPersistUtils: fromJson parse error, " + value, e);
            }
        }
        return null;
    }

    @NotNull
    public final <T> List<T> getMapValueList(@NotNull Map<String, List<T>> map, @NotNull String key) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(key, "key");
        List<T> arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(key, arrayList);
        }
        return TypeIntrinsics.asMutableList(arrayList);
    }

    @Nullable
    public final String getZoneName(int zoneOffsetInSec) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        String currentTimeZoneID = FitnessDateUtils.getCurrentTimeZoneID();
        if (currentTZOffsetInSec == zoneOffsetInSec) {
            return currentTimeZoneID;
        }
        return null;
    }

    public final boolean notUploadGps2Server() {
        return isNotUploadGpsSwitchEnable() || isGpsLimitCountry();
    }

    @NotNull
    public final String toJson(@NotNull Object src) {
        Intrinsics.checkNotNullParameter(src, "src");
        String json = getMGson().toJson(src);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public final String toJson(@NotNull Object src, @NotNull Type typeOfSrc) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        String json = getMGson().toJson(src, typeOfSrc);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
