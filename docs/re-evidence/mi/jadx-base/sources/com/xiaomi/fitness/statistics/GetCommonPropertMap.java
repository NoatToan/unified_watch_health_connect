package com.xiaomi.fitness.statistics;

import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.export.compare.ICompareKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.statistics.GetCommonPropertMap;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010*\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`+¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/statistics/GetCommonPropertMap;", "", "<init>", "()V", "TAG", "", "GYM_MODEL", "GYM_MODEL_M2", "commonPropertyMap", "Ljava/util/HashMap;", "getCommonPropertyMap", "()Ljava/util/HashMap;", "setCommonPropertyMap", "(Ljava/util/HashMap;)V", "userinfomanager", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getUserinfomanager", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "setUserinfomanager", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "gender", "getGender", "()Ljava/lang/String;", "setGender", "(Ljava/lang/String;)V", "bmi", "getBmi", "()Ljava/lang/Object;", "setBmi", "(Ljava/lang/Object;)V", "deviceCount", "", "getDeviceCount", "()I", "setDeviceCount", "(I)V", "hasTreadmill", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getHasTreadmill", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setHasTreadmill", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "getCommonPropert", "Lkotlin/collections/HashMap;", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCommonPropertMap {

    @NotNull
    private static final String GYM_MODEL = "ksmb.treadmill.m1v1";

    @NotNull
    private static final String GYM_MODEL_M2 = "ksmb.treadmill.m2";

    @NotNull
    private static final String TAG = "GetCommonPropertMap";

    @NotNull
    private static Object bmi;
    private static int deviceCount;

    @Nullable
    private static String gender;

    @Nullable
    private static WearableDeviceModel hasTreadmill;

    @NotNull
    private static UserProfile userinfomanager;

    @NotNull
    public static final GetCommonPropertMap INSTANCE = new GetCommonPropertMap();

    @NotNull
    private static HashMap<String, Object> commonPropertyMap = new HashMap<>();

    static {
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        userinfomanager = userProfile$default;
        String sex = userProfile$default.getSex();
        gender = sex != null ? sex : null;
        bmi = (userinfomanager.getWeight() <= 0.0f || userinfomanager.getHeight() <= 0.0f) ? 0 : Double.valueOf(((double) userinfomanager.getWeight()) / Math.pow(((double) userinfomanager.getHeight()) / ((double) 100), 2.0d));
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        deviceCount = DeviceManagerExtKt.getInstance(companion).getDeviceSize();
        hasTreadmill = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).findDeviceModel(new Function1() { // from class: uya
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(GetCommonPropertMap.hasTreadmill$lambda$0((WearableDeviceModel) obj));
            }
        });
    }

    private GetCommonPropertMap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasTreadmill$lambda$0(WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getDeviceInfo().getModel(), "ksmb.treadmill.m1v1") || Intrinsics.areEqual(it.getDeviceInfo().getModel(), "ksmb.treadmill.m2");
    }

    @NotNull
    public final Object getBmi() {
        return bmi;
    }

    @NotNull
    public final HashMap<String, Object> getCommonPropert() {
        String model;
        String name;
        Product product;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        commonPropertyMap.put("gender", gender);
        commonPropertyMap.put("age", Integer.valueOf(userinfomanager.getAge()));
        commonPropertyMap.put("language", Locale.getDefault().getLanguage());
        commonPropertyMap.put("BMI", decimalFormat.format(bmi));
        commonPropertyMap.put("device_user", Boolean.valueOf(deviceCount > 0 || hasTreadmill != null));
        commonPropertyMap.put("wearable_num", Integer.valueOf(deviceCount));
        HashMap<String, Object> map = commonPropertyMap;
        String str = AbstractJsonLexerKt.NULL;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = AbstractJsonLexerKt.NULL;
        }
        map.put("wearable_model", model);
        HashMap<String, Object> map2 = commonPropertyMap;
        if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
            name = AbstractJsonLexerKt.NULL;
        }
        map2.put("wearable_name", name);
        HashMap<String, Object> map3 = commonPropertyMap;
        RegionManager.Companion companion = RegionManager.INSTANCE;
        map3.put("common_region", RegionExtKt.getInstance(companion).getLocalCountry());
        HashMap<String, Object> map4 = commonPropertyMap;
        ICompare.Companion companion2 = ICompare.INSTANCE;
        map4.put("abtest_id", ICompareKt.getINSTANCE(companion2).getLayerName());
        commonPropertyMap.put("abtest_group_id", ICompareKt.getINSTANCE(companion2).getGroupId());
        commonPropertyMap.put("exp_id", ICompareKt.getINSTANCE(companion2).getGroupId());
        HashMap<String, Object> map5 = commonPropertyMap;
        if (wearableDeviceModel != null) {
            str = wearableDeviceModel.getIsDeviceConnected() ? "connected" : "disconnected";
        }
        map5.put("device_connect_status", str);
        commonPropertyMap.put("membership", MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE).getMemberStatus());
        String str2 = gender;
        int age = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge();
        String language = Locale.getDefault().getLanguage();
        String str3 = decimalFormat.format(bmi);
        int i = deviceCount;
        String model2 = (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null) ? null : product.getModel();
        float weight = userinfomanager.getWeight();
        float height = userinfomanager.getHeight();
        WearableDeviceModel wearableDeviceModel2 = hasTreadmill;
        String name2 = wearableDeviceModel != null ? DeviceModelExtKt.getName(wearableDeviceModel) : null;
        Logger.i(TAG, "gender IS " + str2 + " Bmi is " + age + " language is " + language + " BMI is " + str3 + " deviceCount is " + i + "currentDevice?.product?.model is " + model2 + "weight is " + weight + "height is " + height + "hasTreadmill is " + wearableDeviceModel2 + "currentDevice?.name is " + name2 + ",region=" + RegionExtKt.getInstance(companion).getLocalCountry());
        return commonPropertyMap;
    }

    @NotNull
    public final HashMap<String, Object> getCommonPropertyMap() {
        return commonPropertyMap;
    }

    public final int getDeviceCount() {
        return deviceCount;
    }

    @Nullable
    public final String getGender() {
        return gender;
    }

    @Nullable
    public final WearableDeviceModel getHasTreadmill() {
        return hasTreadmill;
    }

    @NotNull
    public final UserProfile getUserinfomanager() {
        return userinfomanager;
    }

    public final void setBmi(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        bmi = obj;
    }

    public final void setCommonPropertyMap(@NotNull HashMap<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        commonPropertyMap = map;
    }

    public final void setDeviceCount(int i) {
        deviceCount = i;
    }

    public final void setGender(@Nullable String str) {
        gender = str;
    }

    public final void setHasTreadmill(@Nullable WearableDeviceModel wearableDeviceModel) {
        hasTreadmill = wearableDeviceModel;
    }

    public final void setUserinfomanager(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "<set-?>");
        userinfomanager = userProfile;
    }
}
