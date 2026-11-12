package com.xiaomi.fitness.sport.utils;

import com.google.gson.Gson;
import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010;\u001a\u00020<2\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0005J\u0010\u0010M\u001a\u00020<2\b\u0010L\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\u001fR+\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0017\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R+\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R+\u0010)\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\u001fR+\u0010-\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0017\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u0010\u0015R+\u00101\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0017\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\u001fR+\u00105\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0017\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010\u0015R+\u0010=\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0017\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001a\u0010A\u001a\u00020BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010G\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u0017\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\u001fR+\u0010N\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u0017\u001a\u0004\bO\u0010\u0013\"\u0004\bP\u0010\u0015R+\u0010R\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0017\u001a\u0004\bS\u0010\u0013\"\u0004\bT\u0010\u0015R+\u0010V\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0017\u001a\u0004\bW\u0010\u0013\"\u0004\bX\u0010\u0015R+\u0010Z\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0017\u001a\u0004\b[\u0010\u0013\"\u0004\b\\\u0010\u0015R+\u0010^\u001a\u00020B2\u0006\u0010\u000f\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010\u0017\u001a\u0004\b_\u0010D\"\u0004\b`\u0010F¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/SportPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "TAG", "", "spName", "getSpName", "()Ljava/lang/String;", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "<set-?>", "", "PROMPT_USERINFO", "getPROMPT_USERINFO", "()Z", "setPROMPT_USERINFO", "(Z)V", "PROMPT_USERINFO$delegate", "Lkotlin/properties/ReadWriteProperty;", "USE_TREADMILL_BEFORE", "getUSE_TREADMILL_BEFORE", "setUSE_TREADMILL_BEFORE", "USE_TREADMILL_BEFORE$delegate", "USE_TREADMILL_BEFORE_MODEL", "getUSE_TREADMILL_BEFORE_MODEL", "setUSE_TREADMILL_BEFORE_MODEL", "(Ljava/lang/String;)V", "USE_TREADMILL_BEFORE_MODEL$delegate", "GYM_REPORT_REMIND", "getGYM_REPORT_REMIND", "setGYM_REPORT_REMIND", "GYM_REPORT_REMIND$delegate", "KEY_BG_PERMISSION", "getKEY_BG_PERMISSION", "setKEY_BG_PERMISSION", "KEY_BG_PERMISSION$delegate", "KEY_RECOVER_SPORT_GPS", "getKEY_RECOVER_SPORT_GPS", "setKEY_RECOVER_SPORT_GPS", "KEY_RECOVER_SPORT_GPS$delegate", "KEY_SHOW_SPORT_SETTING_BADGE", "getKEY_SHOW_SPORT_SETTING_BADGE", "setKEY_SHOW_SPORT_SETTING_BADGE", "KEY_SHOW_SPORT_SETTING_BADGE$delegate", "LOCAL_DEVICE_RED_POINT_SHOW", "getLOCAL_DEVICE_RED_POINT_SHOW", "setLOCAL_DEVICE_RED_POINT_SHOW", "LOCAL_DEVICE_RED_POINT_SHOW$delegate", "SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE", "getSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE", "setSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE", "SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE$delegate", "getDeviceUpgradeRedPoint", "mac", "setDeviceUpgradeRedPoint", "", "SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE", "getSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE", "setSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE", "SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE$delegate", "LAUNCH_SPORT_PAGE_GET_WEAR_MODE", "", "getLAUNCH_SPORT_PAGE_GET_WEAR_MODE", "()I", "setLAUNCH_SPORT_PAGE_GET_WEAR_MODE", "(I)V", "WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST", "getWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST", "setWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST", "WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST$delegate", "isInWearingInstructionAlreadyPoppedListBySid", "sid", "addDeviceToWearingInstructionPoppedList", "IS_SHOW_SPORT_TAB_ROUTE_GUIDE", "getIS_SHOW_SPORT_TAB_ROUTE_GUIDE", "setIS_SHOW_SPORT_TAB_ROUTE_GUIDE", "IS_SHOW_SPORT_TAB_ROUTE_GUIDE$delegate", "SHOW_JD_TOUCH_GUIDE", "getSHOW_JD_TOUCH_GUIDE", "setSHOW_JD_TOUCH_GUIDE", "SHOW_JD_TOUCH_GUIDE$delegate", "SHOW_JD_POWER_GUIDE", "getSHOW_JD_POWER_GUIDE", "setSHOW_JD_POWER_GUIDE", "SHOW_JD_POWER_GUIDE$delegate", "SHOW_FOCUS_NOTIFY_DIALOG", "getSHOW_FOCUS_NOTIFY_DIALOG", "setSHOW_FOCUS_NOTIFY_DIALOG", "SHOW_FOCUS_NOTIFY_DIALOG$delegate", "FOCUS_NOTIFY_CANCEL_SPORT_TYPE", "getFOCUS_NOTIFY_CANCEL_SPORT_TYPE", "setFOCUS_NOTIFY_CANCEL_SPORT_TYPE", "FOCUS_NOTIFY_CANCEL_SPORT_TYPE$delegate", "WearingInstructionPopupModel", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportPreference.kt\ncom/xiaomi/fitness/sport/utils/SportPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,158:1\n346#2,8:159\n217#2:167\n135#2,6:168\n211#2,7:174\n211#2,7:181\n211#2,7:188\n211#2,7:195\n135#2,6:202\n211#2,7:208\n211#2,7:215\n135#2,6:222\n135#2,6:228\n135#2,6:234\n135#2,6:240\n135#2,6:246\n135#2,6:252\n135#2,6:258\n135#2,6:264\n*S KotlinDebug\n*F\n+ 1 SportPreference.kt\ncom/xiaomi/fitness/sport/utils/SportPreference\n*L\n68#1:159,8\n77#1:167\n17#1:168,6\n20#1:174,7\n27#1:181,7\n34#1:188,7\n41#1:195,7\n47#1:202,6\n49#1:208,7\n55#1:215,7\n64#1:222,6\n88#1:228,6\n92#1:234,6\n143#1:240,6\n148#1:246,6\n153#1:252,6\n155#1:258,6\n157#1:264,6\n*E\n"})
public final class SportPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "PROMPT_USERINFO", "getPROMPT_USERINFO()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "USE_TREADMILL_BEFORE", "getUSE_TREADMILL_BEFORE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "USE_TREADMILL_BEFORE_MODEL", "getUSE_TREADMILL_BEFORE_MODEL()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "GYM_REPORT_REMIND", "getGYM_REPORT_REMIND()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "KEY_BG_PERMISSION", "getKEY_BG_PERMISSION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "KEY_RECOVER_SPORT_GPS", "getKEY_RECOVER_SPORT_GPS()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "KEY_SHOW_SPORT_SETTING_BADGE", "getKEY_SHOW_SPORT_SETTING_BADGE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "LOCAL_DEVICE_RED_POINT_SHOW", "getLOCAL_DEVICE_RED_POINT_SHOW()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE", "getSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE", "getSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST", "getWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "IS_SHOW_SPORT_TAB_ROUTE_GUIDE", "getIS_SHOW_SPORT_TAB_ROUTE_GUIDE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "SHOW_JD_TOUCH_GUIDE", "getSHOW_JD_TOUCH_GUIDE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "SHOW_JD_POWER_GUIDE", "getSHOW_JD_POWER_GUIDE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "SHOW_FOCUS_NOTIFY_DIALOG", "getSHOW_FOCUS_NOTIFY_DIALOG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "FOCUS_NOTIFY_CANCEL_SPORT_TYPE", "getFOCUS_NOTIFY_CANCEL_SPORT_TYPE()I", 0))};

    /* JADX INFO: renamed from: FOCUS_NOTIFY_CANCEL_SPORT_TYPE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FOCUS_NOTIFY_CANCEL_SPORT_TYPE;

    /* JADX INFO: renamed from: GYM_REPORT_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty GYM_REPORT_REMIND;

    @NotNull
    public static final SportPreference INSTANCE;

    /* JADX INFO: renamed from: IS_SHOW_SPORT_TAB_ROUTE_GUIDE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SHOW_SPORT_TAB_ROUTE_GUIDE;

    /* JADX INFO: renamed from: KEY_BG_PERMISSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_BG_PERMISSION;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_GPS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_GPS;

    /* JADX INFO: renamed from: KEY_SHOW_SPORT_SETTING_BADGE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SHOW_SPORT_SETTING_BADGE;
    private static int LAUNCH_SPORT_PAGE_GET_WEAR_MODE = 0;

    /* JADX INFO: renamed from: LOCAL_DEVICE_RED_POINT_SHOW$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LOCAL_DEVICE_RED_POINT_SHOW;

    /* JADX INFO: renamed from: PROMPT_USERINFO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PROMPT_USERINFO;

    /* JADX INFO: renamed from: SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE;

    /* JADX INFO: renamed from: SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE;

    /* JADX INFO: renamed from: SHOW_FOCUS_NOTIFY_DIALOG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_FOCUS_NOTIFY_DIALOG;

    /* JADX INFO: renamed from: SHOW_JD_POWER_GUIDE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_JD_POWER_GUIDE;

    /* JADX INFO: renamed from: SHOW_JD_TOUCH_GUIDE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_JD_TOUCH_GUIDE;

    @NotNull
    public static final String TAG = "SportPreference";

    /* JADX INFO: renamed from: USE_TREADMILL_BEFORE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty USE_TREADMILL_BEFORE;

    /* JADX INFO: renamed from: USE_TREADMILL_BEFORE_MODEL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty USE_TREADMILL_BEFORE_MODEL;

    /* JADX INFO: renamed from: WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST;

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mGson;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/SportPreference$WearingInstructionPopupModel;", "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "", "<init>", "(Ljava/util/Set;)V", "getSet", "()Ljava/util/Set;", "setSet", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WearingInstructionPopupModel {

        @Nullable
        private Set<String> set;

        public WearingInstructionPopupModel(@Nullable Set<String> set) {
            this.set = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WearingInstructionPopupModel copy$default(WearingInstructionPopupModel wearingInstructionPopupModel, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = wearingInstructionPopupModel.set;
            }
            return wearingInstructionPopupModel.copy(set);
        }

        @Nullable
        public final Set<String> component1() {
            return this.set;
        }

        @NotNull
        public final WearingInstructionPopupModel copy(@Nullable Set<String> set) {
            return new WearingInstructionPopupModel(set);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WearingInstructionPopupModel) && Intrinsics.areEqual(this.set, ((WearingInstructionPopupModel) other).set);
        }

        @Nullable
        public final Set<String> getSet() {
            return this.set;
        }

        public int hashCode() {
            Set<String> set = this.set;
            if (set == null) {
                return 0;
            }
            return set.hashCode();
        }

        public final void setSet(@Nullable Set<String> set) {
            this.set = set;
        }

        @NotNull
        public String toString() {
            return "WearingInstructionPopupModel(set=" + this.set + ")";
        }
    }

    static {
        SportPreference sportPreference = new SportPreference();
        INSTANCE = sportPreference;
        mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xsn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportPreference.mGson_delegate$lambda$0();
            }
        });
        Boolean bool = Boolean.TRUE;
        PROMPT_USERINFO = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        USE_TREADMILL_BEFORE = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), Boolean.FALSE, null, "app_pref", "use_treadmill_before");
        USE_TREADMILL_BEFORE_MODEL = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), "", null, "app_pref", "use_treadmill_before");
        GYM_REPORT_REMIND = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), bool, null, "app_pref", "SPORT_REPOET");
        KEY_BG_PERMISSION = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$4
        }.getType(), bool, null, "app_pref", "show_sport_background_permission");
        KEY_RECOVER_SPORT_GPS = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
        KEY_SHOW_SPORT_SETTING_BADGE = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$5
        }.getType(), bool, null, "app_pref", "show_sport_setting_badge");
        LOCAL_DEVICE_RED_POINT_SHOW = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$6
        }.getType(), "", null, "app_pref", "local_device_red_point_show");
        SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, true);
        SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, true);
        LAUNCH_SPORT_PAGE_GET_WEAR_MODE = SportManagerExtKt.getInstance(ISportManagerPreference.INSTANCE).getLaunchSportPageGetWearMode();
        WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), "{}", null, true);
        IS_SHOW_SPORT_TAB_ROUTE_GUIDE = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, true);
        SHOW_JD_TOUCH_GUIDE = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), bool, null, true);
        SHOW_JD_POWER_GUIDE = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), bool, null, true);
        SHOW_FOCUS_NOTIFY_DIALOG = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), bool, null, true);
        FOCUS_NOTIFY_CANCEL_SPORT_TYPE = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$special$$inlined$bindToPreferenceField$default$10
        }.getType(), -1, null, true);
    }

    private SportPreference() {
    }

    private final Gson getMGson() {
        return (Gson) mGson.getValue();
    }

    private final String getWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST() {
        return (String) WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST.getValue(this, $$delegatedProperties[10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    private final void setWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST(String str) {
        WEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST.setValue(this, $$delegatedProperties[10], str);
    }

    public final void addDeviceToWearingInstructionPoppedList(@Nullable String sid) {
        if (sid == null) {
            return;
        }
        try {
            WearingInstructionPopupModel wearingInstructionPopupModel = (WearingInstructionPopupModel) getMGson().fromJson(getWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST(), WearingInstructionPopupModel.class);
            if (wearingInstructionPopupModel.getSet() == null) {
                wearingInstructionPopupModel.setSet(new LinkedHashSet());
            }
            Set<String> set = wearingInstructionPopupModel.getSet();
            Intrinsics.checkNotNull(set);
            set.add(sid);
            setWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST(getMGson().toJson(wearingInstructionPopupModel));
            Logger.d(TAG, "addDeviceToWearingInstructionPoppedList set=" + wearingInstructionPopupModel.getSet());
        } catch (Exception e) {
            Logger.i(TAG, "addDeviceToWearingInstructionPoppedList failed. e=" + e);
        }
    }

    @NotNull
    public final String getDeviceUpgradeRedPoint(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), mac + "local_device_red_point_show", "", getSpName(), "app_pref", mac + "local_device_red_point_show");
    }

    public final int getFOCUS_NOTIFY_CANCEL_SPORT_TYPE() {
        return ((Number) FOCUS_NOTIFY_CANCEL_SPORT_TYPE.getValue(this, $$delegatedProperties[15])).intValue();
    }

    public final boolean getGYM_REPORT_REMIND() {
        return ((Boolean) GYM_REPORT_REMIND.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getIS_SHOW_SPORT_TAB_ROUTE_GUIDE() {
        return ((Boolean) IS_SHOW_SPORT_TAB_ROUTE_GUIDE.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    public final boolean getKEY_BG_PERMISSION() {
        return ((Boolean) KEY_BG_PERMISSION.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_GPS() {
        return (String) KEY_RECOVER_SPORT_GPS.getValue(this, $$delegatedProperties[5]);
    }

    public final boolean getKEY_SHOW_SPORT_SETTING_BADGE() {
        return ((Boolean) KEY_SHOW_SPORT_SETTING_BADGE.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public final int getLAUNCH_SPORT_PAGE_GET_WEAR_MODE() {
        return LAUNCH_SPORT_PAGE_GET_WEAR_MODE;
    }

    @NotNull
    public final String getLOCAL_DEVICE_RED_POINT_SHOW() {
        return (String) LOCAL_DEVICE_RED_POINT_SHOW.getValue(this, $$delegatedProperties[7]);
    }

    public final boolean getPROMPT_USERINFO() {
        return ((Boolean) PROMPT_USERINFO.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE() {
        return ((Boolean) SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public final boolean getSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE() {
        return ((Boolean) SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    public final boolean getSHOW_FOCUS_NOTIFY_DIALOG() {
        return ((Boolean) SHOW_FOCUS_NOTIFY_DIALOG.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    public final boolean getSHOW_JD_POWER_GUIDE() {
        return ((Boolean) SHOW_JD_POWER_GUIDE.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    public final boolean getSHOW_JD_TOUCH_GUIDE() {
        return ((Boolean) SHOW_JD_TOUCH_GUIDE.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_ui";
    }

    public final boolean getUSE_TREADMILL_BEFORE() {
        return ((Boolean) USE_TREADMILL_BEFORE.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @NotNull
    public final String getUSE_TREADMILL_BEFORE_MODEL() {
        return (String) USE_TREADMILL_BEFORE_MODEL.getValue(this, $$delegatedProperties[2]);
    }

    public final boolean isInWearingInstructionAlreadyPoppedListBySid(@NotNull String sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        boolean z = false;
        if (StringsKt__StringsKt.isBlank(getWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST())) {
            return false;
        }
        try {
            WearingInstructionPopupModel wearingInstructionPopupModel = (WearingInstructionPopupModel) getMGson().fromJson(getWEARING_INSTRUCTION_ALREADY_POPPED_SID_LIST(), WearingInstructionPopupModel.class);
            Logger.d(TAG, "isInWearingInstructionAlreadyPoppedListBySid set=" + wearingInstructionPopupModel.getSet());
            Set<String> set = wearingInstructionPopupModel.getSet();
            if (set != null && set.contains(sid)) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            Logger.i(TAG, "isInWearingInstructionAlreadyPoppedListBySid failed. e=" + e);
            return true;
        }
    }

    public final void setDeviceUpgradeRedPoint(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport.utils.SportPreference$setDeviceUpgradeRedPoint$$inlined$bindAndMigratePrefer$1
        }.getType(), "", mac + "local_device_red_point_show", "app_pref", mac + "local_device_red_point_show");
    }

    public final void setFOCUS_NOTIFY_CANCEL_SPORT_TYPE(int i) {
        FOCUS_NOTIFY_CANCEL_SPORT_TYPE.setValue(this, $$delegatedProperties[15], Integer.valueOf(i));
    }

    public final void setGYM_REPORT_REMIND(boolean z) {
        GYM_REPORT_REMIND.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setIS_SHOW_SPORT_TAB_ROUTE_GUIDE(boolean z) {
        IS_SHOW_SPORT_TAB_ROUTE_GUIDE.setValue(this, $$delegatedProperties[11], Boolean.valueOf(z));
    }

    public final void setKEY_BG_PERMISSION(boolean z) {
        KEY_BG_PERMISSION.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setKEY_RECOVER_SPORT_GPS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_GPS.setValue(this, $$delegatedProperties[5], str);
    }

    public final void setKEY_SHOW_SPORT_SETTING_BADGE(boolean z) {
        KEY_SHOW_SPORT_SETTING_BADGE.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setLAUNCH_SPORT_PAGE_GET_WEAR_MODE(int i) {
        LAUNCH_SPORT_PAGE_GET_WEAR_MODE = i;
    }

    public final void setLOCAL_DEVICE_RED_POINT_SHOW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        LOCAL_DEVICE_RED_POINT_SHOW.setValue(this, $$delegatedProperties[7], str);
    }

    public final void setPROMPT_USERINFO(boolean z) {
        PROMPT_USERINFO.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setSHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE(boolean z) {
        SHOULD_SHOW_MOTION_SENSOR_COURSE_USER_NOTICE.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setSHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE(boolean z) {
        SHOULD_SHOW_SPORT_BEAN_MODE_WEAR_GUIDE.setValue(this, $$delegatedProperties[9], Boolean.valueOf(z));
    }

    public final void setSHOW_FOCUS_NOTIFY_DIALOG(boolean z) {
        SHOW_FOCUS_NOTIFY_DIALOG.setValue(this, $$delegatedProperties[14], Boolean.valueOf(z));
    }

    public final void setSHOW_JD_POWER_GUIDE(boolean z) {
        SHOW_JD_POWER_GUIDE.setValue(this, $$delegatedProperties[13], Boolean.valueOf(z));
    }

    public final void setSHOW_JD_TOUCH_GUIDE(boolean z) {
        SHOW_JD_TOUCH_GUIDE.setValue(this, $$delegatedProperties[12], Boolean.valueOf(z));
    }

    public final void setUSE_TREADMILL_BEFORE(boolean z) {
        USE_TREADMILL_BEFORE.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setUSE_TREADMILL_BEFORE_MODEL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        USE_TREADMILL_BEFORE_MODEL.setValue(this, $$delegatedProperties[2], str);
    }
}
