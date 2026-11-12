package com.xiaomi.fitness.main.export;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bt\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR+\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR+\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR+\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR+\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR+\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0010\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR+\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0010\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR+\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0010\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR+\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0010\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR+\u0010=\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u0010\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010@R+\u0010B\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0010\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010@R+\u0010F\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u0010\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010@R+\u0010J\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010\u0010\u001a\u0004\bK\u0010\u0007\"\u0004\bL\u0010@R+\u0010N\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u0010\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010@R+\u0010R\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0010\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010@R+\u0010V\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0010\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR+\u0010Z\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0010\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u000eR+\u0010^\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010\u0010\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010\u000eR+\u0010b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010\u0010\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010\u000eR+\u0010f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010\u0010\u001a\u0004\bg\u0010\f\"\u0004\bh\u0010\u000eR+\u0010j\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010\u0010\u001a\u0004\bk\u0010\u0007\"\u0004\bl\u0010@R+\u0010n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010\u0010\u001a\u0004\bo\u0010\f\"\u0004\bp\u0010\u000eR+\u0010r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010\u0010\u001a\u0004\bs\u0010\f\"\u0004\bt\u0010\u000eR+\u0010v\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\u0010\u001a\u0004\bw\u0010\f\"\u0004\bx\u0010\u000eR+\u0010z\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b}\u0010\u0010\u001a\u0004\b{\u0010\f\"\u0004\b|\u0010\u000eR0\u0010\u007f\u001a\u00020~2\u0006\u0010\b\u001a\u00020~8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0084\u0001\u0010\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/xiaomi/fitness/main/export/ConfigPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "OPEN_MIUI_CONNECTION", "getOPEN_MIUI_CONNECTION", "()Z", "setOPEN_MIUI_CONNECTION", "(Z)V", "OPEN_MIUI_CONNECTION$delegate", "Lkotlin/properties/ReadWriteProperty;", "OPEN_MIUI_CONNECTION_V2", "getOPEN_MIUI_CONNECTION_V2", "setOPEN_MIUI_CONNECTION_V2", "OPEN_MIUI_CONNECTION_V2$delegate", "OPEN_MIUI_CONNECTION_V3", "getOPEN_MIUI_CONNECTION_V3", "setOPEN_MIUI_CONNECTION_V3", "OPEN_MIUI_CONNECTION_V3$delegate", "OPEN_MIUI_CONNECTION_V4", "getOPEN_MIUI_CONNECTION_V4", "setOPEN_MIUI_CONNECTION_V4", "OPEN_MIUI_CONNECTION_V4$delegate", "OPEN_MIUI_CONNECTION_V5", "getOPEN_MIUI_CONNECTION_V5", "setOPEN_MIUI_CONNECTION_V5", "OPEN_MIUI_CONNECTION_V5$delegate", "OPEN_MIUI_CONNECTION_V6", "getOPEN_MIUI_CONNECTION_V6", "setOPEN_MIUI_CONNECTION_V6", "OPEN_MIUI_CONNECTION_V6$delegate", "OPEN_MIUI_CONNECTION_V7", "getOPEN_MIUI_CONNECTION_V7", "setOPEN_MIUI_CONNECTION_V7", "OPEN_MIUI_CONNECTION_V7$delegate", "OPEN_MIUI_SPP_CONNECTION", "getOPEN_MIUI_SPP_CONNECTION", "setOPEN_MIUI_SPP_CONNECTION", "OPEN_MIUI_SPP_CONNECTION$delegate", "IS_APP_CHOSEN_OPEN", "getIS_APP_CHOSEN_OPEN", "setIS_APP_CHOSEN_OPEN", "IS_APP_CHOSEN_OPEN$delegate", "IS_GRAY", "getIS_GRAY", "setIS_GRAY", "IS_GRAY$delegate", "IS_SUPPORT_DEVICE_STATISTICS", "getIS_SUPPORT_DEVICE_STATISTICS", "setIS_SUPPORT_DEVICE_STATISTICS", "IS_SUPPORT_DEVICE_STATISTICS$delegate", "IS_SPORT_TARGET_SHARE_SHOW", "getIS_SPORT_TARGET_SHARE_SHOW", "setIS_SPORT_TARGET_SHARE_SHOW", "IS_SPORT_TARGET_SHARE_SHOW$delegate", "NOTIFICATION_APP_IN_WHITE_LIST", "getNOTIFICATION_APP_IN_WHITE_LIST", "setNOTIFICATION_APP_IN_WHITE_LIST", "(Ljava/lang/String;)V", "NOTIFICATION_APP_IN_WHITE_LIST$delegate", "NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST", "getNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST", "setNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST", "NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST$delegate", "NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST", "getNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST", "setNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST", "NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST$delegate", "UPDATER_DIALOG_APP_IN_BLACK_LIST", "getUPDATER_DIALOG_APP_IN_BLACK_LIST", "setUPDATER_DIALOG_APP_IN_BLACK_LIST", "UPDATER_DIALOG_APP_IN_BLACK_LIST$delegate", "CARRIER_ENTRIES", "getCARRIER_ENTRIES", "setCARRIER_ENTRIES", "CARRIER_ENTRIES$delegate", "CARRIER_HOST_BLACK_LIST", "getCARRIER_HOST_BLACK_LIST", "setCARRIER_HOST_BLACK_LIST", "CARRIER_HOST_BLACK_LIST$delegate", "SHOW_SUUNTO_PARTNER_BTN", "getSHOW_SUUNTO_PARTNER_BTN", "setSHOW_SUUNTO_PARTNER_BTN", "SHOW_SUUNTO_PARTNER_BTN$delegate", "SHOW_WATCH_FACE_PRICE", "getSHOW_WATCH_FACE_PRICE", "setSHOW_WATCH_FACE_PRICE", "SHOW_WATCH_FACE_PRICE$delegate", "IS_SUPPORT_SLEEP_RHYTHM", "getIS_SUPPORT_SLEEP_RHYTHM", "setIS_SUPPORT_SLEEP_RHYTHM", "IS_SUPPORT_SLEEP_RHYTHM$delegate", "IS_SUPPORT_SCHEMA", "getIS_SUPPORT_SCHEMA", "setIS_SUPPORT_SCHEMA", "IS_SUPPORT_SCHEMA$delegate", "WEATHER_LOCATION_BY_ANDROID", "getWEATHER_LOCATION_BY_ANDROID", "setWEATHER_LOCATION_BY_ANDROID", "WEATHER_LOCATION_BY_ANDROID$delegate", "MEDIASESSION_BLACKLIST", "getMEDIASESSION_BLACKLIST", "setMEDIASESSION_BLACKLIST", "MEDIASESSION_BLACKLIST$delegate", "FOCUS_SPORT_NOTIFICATION", "getFOCUS_SPORT_NOTIFICATION", "setFOCUS_SPORT_NOTIFICATION", "FOCUS_SPORT_NOTIFICATION$delegate", "SHOW_VIP_BANNER", "getSHOW_VIP_BANNER", "setSHOW_VIP_BANNER", "SHOW_VIP_BANNER$delegate", "IS_HFP_CONNECT", "getIS_HFP_CONNECT", "setIS_HFP_CONNECT", "IS_HFP_CONNECT$delegate", "ROUTE_NEW_FACE_POOL_FROM_ENTRANCE", "getROUTE_NEW_FACE_POOL_FROM_ENTRANCE", "setROUTE_NEW_FACE_POOL_FROM_ENTRANCE", "ROUTE_NEW_FACE_POOL_FROM_ENTRANCE$delegate", "", "AUTO_SHOW_KEEPALIVE", "getAUTO_SHOW_KEEPALIVE", "()J", "setAUTO_SHOW_KEEPALIVE", "(J)V", "AUTO_SHOW_KEEPALIVE$delegate", "main-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConfigPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigPreference.kt\ncom/xiaomi/fitness/main/export/ConfigPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,86:1\n135#2,6:87\n135#2,6:93\n135#2,6:99\n135#2,6:105\n135#2,6:111\n135#2,6:117\n135#2,6:123\n135#2,6:129\n135#2,6:135\n135#2,6:141\n135#2,6:147\n135#2,6:153\n135#2,6:159\n135#2,6:165\n135#2,6:171\n135#2,6:177\n135#2,6:183\n135#2,6:189\n135#2,6:195\n135#2,6:201\n135#2,6:207\n135#2,6:213\n135#2,6:219\n135#2,6:225\n135#2,6:231\n135#2,6:237\n135#2,6:243\n135#2,6:249\n135#2,6:255\n*S KotlinDebug\n*F\n+ 1 ConfigPreference.kt\ncom/xiaomi/fitness/main/export/ConfigPreference\n*L\n12#1:87,6\n14#1:93,6\n16#1:99,6\n18#1:105,6\n20#1:111,6\n22#1:117,6\n24#1:123,6\n26#1:129,6\n28#1:135,6\n30#1:141,6\n35#1:147,6\n37#1:153,6\n40#1:159,6\n42#1:165,6\n47#1:171,6\n52#1:177,6\n57#1:183,6\n59#1:189,6\n63#1:195,6\n66#1:201,6\n68#1:207,6\n70#1:213,6\n72#1:219,6\n74#1:225,6\n76#1:231,6\n78#1:237,6\n80#1:243,6\n82#1:249,6\n84#1:255,6\n*E\n"})
public final class ConfigPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION", "getOPEN_MIUI_CONNECTION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION_V2", "getOPEN_MIUI_CONNECTION_V2()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION_V3", "getOPEN_MIUI_CONNECTION_V3()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION_V4", "getOPEN_MIUI_CONNECTION_V4()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION_V5", "getOPEN_MIUI_CONNECTION_V5()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION_V6", "getOPEN_MIUI_CONNECTION_V6()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_CONNECTION_V7", "getOPEN_MIUI_CONNECTION_V7()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "OPEN_MIUI_SPP_CONNECTION", "getOPEN_MIUI_SPP_CONNECTION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_APP_CHOSEN_OPEN", "getIS_APP_CHOSEN_OPEN()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_GRAY", "getIS_GRAY()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_SUPPORT_DEVICE_STATISTICS", "getIS_SUPPORT_DEVICE_STATISTICS()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_SPORT_TARGET_SHARE_SHOW", "getIS_SPORT_TARGET_SHARE_SHOW()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "NOTIFICATION_APP_IN_WHITE_LIST", "getNOTIFICATION_APP_IN_WHITE_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST", "getNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST", "getNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "UPDATER_DIALOG_APP_IN_BLACK_LIST", "getUPDATER_DIALOG_APP_IN_BLACK_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "CARRIER_ENTRIES", "getCARRIER_ENTRIES()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "CARRIER_HOST_BLACK_LIST", "getCARRIER_HOST_BLACK_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "SHOW_SUUNTO_PARTNER_BTN", "getSHOW_SUUNTO_PARTNER_BTN()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "SHOW_WATCH_FACE_PRICE", "getSHOW_WATCH_FACE_PRICE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_SUPPORT_SLEEP_RHYTHM", "getIS_SUPPORT_SLEEP_RHYTHM()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_SUPPORT_SCHEMA", "getIS_SUPPORT_SCHEMA()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "WEATHER_LOCATION_BY_ANDROID", "getWEATHER_LOCATION_BY_ANDROID()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "MEDIASESSION_BLACKLIST", "getMEDIASESSION_BLACKLIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "FOCUS_SPORT_NOTIFICATION", "getFOCUS_SPORT_NOTIFICATION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "SHOW_VIP_BANNER", "getSHOW_VIP_BANNER()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "IS_HFP_CONNECT", "getIS_HFP_CONNECT()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "ROUTE_NEW_FACE_POOL_FROM_ENTRANCE", "getROUTE_NEW_FACE_POOL_FROM_ENTRANCE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConfigPreference.class, "AUTO_SHOW_KEEPALIVE", "getAUTO_SHOW_KEEPALIVE()J", 0))};

    /* JADX INFO: renamed from: AUTO_SHOW_KEEPALIVE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AUTO_SHOW_KEEPALIVE;

    /* JADX INFO: renamed from: CARRIER_ENTRIES$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CARRIER_ENTRIES;

    /* JADX INFO: renamed from: CARRIER_HOST_BLACK_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CARRIER_HOST_BLACK_LIST;

    /* JADX INFO: renamed from: FOCUS_SPORT_NOTIFICATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FOCUS_SPORT_NOTIFICATION;

    @NotNull
    public static final ConfigPreference INSTANCE;

    /* JADX INFO: renamed from: IS_APP_CHOSEN_OPEN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_APP_CHOSEN_OPEN;

    /* JADX INFO: renamed from: IS_GRAY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_GRAY;

    /* JADX INFO: renamed from: IS_HFP_CONNECT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_HFP_CONNECT;

    /* JADX INFO: renamed from: IS_SPORT_TARGET_SHARE_SHOW$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SPORT_TARGET_SHARE_SHOW;

    /* JADX INFO: renamed from: IS_SUPPORT_DEVICE_STATISTICS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SUPPORT_DEVICE_STATISTICS;

    /* JADX INFO: renamed from: IS_SUPPORT_SCHEMA$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SUPPORT_SCHEMA;

    /* JADX INFO: renamed from: IS_SUPPORT_SLEEP_RHYTHM$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_SUPPORT_SLEEP_RHYTHM;

    /* JADX INFO: renamed from: MEDIASESSION_BLACKLIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty MEDIASESSION_BLACKLIST;

    /* JADX INFO: renamed from: NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST;

    /* JADX INFO: renamed from: NOTIFICATION_APP_IN_WHITE_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOTIFICATION_APP_IN_WHITE_LIST;

    /* JADX INFO: renamed from: NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V2$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V2;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V3$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V3;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V4$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V4;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V5$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V5;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V6$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V6;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V7$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V7;

    /* JADX INFO: renamed from: OPEN_MIUI_SPP_CONNECTION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_SPP_CONNECTION;

    /* JADX INFO: renamed from: ROUTE_NEW_FACE_POOL_FROM_ENTRANCE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ROUTE_NEW_FACE_POOL_FROM_ENTRANCE;

    /* JADX INFO: renamed from: SHOW_SUUNTO_PARTNER_BTN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_SUUNTO_PARTNER_BTN;

    /* JADX INFO: renamed from: SHOW_VIP_BANNER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_VIP_BANNER;

    /* JADX INFO: renamed from: SHOW_WATCH_FACE_PRICE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_WATCH_FACE_PRICE;

    /* JADX INFO: renamed from: UPDATER_DIALOG_APP_IN_BLACK_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty UPDATER_DIALOG_APP_IN_BLACK_LIST;

    /* JADX INFO: renamed from: WEATHER_LOCATION_BY_ANDROID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty WEATHER_LOCATION_BY_ANDROID;

    static {
        ConfigPreference configPreference = new ConfigPreference();
        INSTANCE = configPreference;
        Boolean bool = Boolean.FALSE;
        OPEN_MIUI_CONNECTION = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, false);
        OPEN_MIUI_CONNECTION_V2 = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, false);
        OPEN_MIUI_CONNECTION_V3 = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, false);
        OPEN_MIUI_CONNECTION_V4 = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, false);
        OPEN_MIUI_CONNECTION_V5 = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), bool, null, false);
        OPEN_MIUI_CONNECTION_V6 = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, false);
        OPEN_MIUI_CONNECTION_V7 = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), bool, null, false);
        OPEN_MIUI_SPP_CONNECTION = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), bool, null, false);
        Boolean bool2 = Boolean.TRUE;
        IS_APP_CHOSEN_OPEN = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), bool2, null, false);
        IS_GRAY = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$10
        }.getType(), bool, null, false);
        IS_SUPPORT_DEVICE_STATISTICS = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$11
        }.getType(), bool2, null, false);
        IS_SPORT_TARGET_SHARE_SHOW = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$12
        }.getType(), bool, null, false);
        NOTIFICATION_APP_IN_WHITE_LIST = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$13
        }.getType(), "", null, false);
        NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$14
        }.getType(), "", null, false);
        NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$15
        }.getType(), "", null, false);
        UPDATER_DIALOG_APP_IN_BLACK_LIST = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$16
        }.getType(), "", null, true);
        CARRIER_ENTRIES = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$17
        }.getType(), "", null, false);
        CARRIER_HOST_BLACK_LIST = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$18
        }.getType(), "", null, false);
        SHOW_SUUNTO_PARTNER_BTN = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$19
        }.getType(), bool2, null, true);
        SHOW_WATCH_FACE_PRICE = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$20
        }.getType(), bool2, null, true);
        IS_SUPPORT_SLEEP_RHYTHM = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$21
        }.getType(), bool, null, false);
        IS_SUPPORT_SCHEMA = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$22
        }.getType(), bool2, null, true);
        WEATHER_LOCATION_BY_ANDROID = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$23
        }.getType(), bool2, null, true);
        MEDIASESSION_BLACKLIST = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$24
        }.getType(), "", null, true);
        FOCUS_SPORT_NOTIFICATION = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$25
        }.getType(), bool2, null, true);
        SHOW_VIP_BANNER = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$26
        }.getType(), bool, null, true);
        IS_HFP_CONNECT = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$27
        }.getType(), bool2, null, true);
        ROUTE_NEW_FACE_POOL_FROM_ENTRANCE = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$28
        }.getType(), bool, null, true);
        AUTO_SHOW_KEEPALIVE = configPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.main.export.ConfigPreference$special$$inlined$bindToPreferenceField$default$29
        }.getType(), 86400L, null, true);
    }

    private ConfigPreference() {
    }

    public final long getAUTO_SHOW_KEEPALIVE() {
        return ((Number) AUTO_SHOW_KEEPALIVE.getValue(this, $$delegatedProperties[28])).longValue();
    }

    @NotNull
    public final String getCARRIER_ENTRIES() {
        return (String) CARRIER_ENTRIES.getValue(this, $$delegatedProperties[16]);
    }

    @NotNull
    public final String getCARRIER_HOST_BLACK_LIST() {
        return (String) CARRIER_HOST_BLACK_LIST.getValue(this, $$delegatedProperties[17]);
    }

    public final boolean getFOCUS_SPORT_NOTIFICATION() {
        return ((Boolean) FOCUS_SPORT_NOTIFICATION.getValue(this, $$delegatedProperties[24])).booleanValue();
    }

    public final boolean getIS_APP_CHOSEN_OPEN() {
        return ((Boolean) IS_APP_CHOSEN_OPEN.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public final boolean getIS_GRAY() {
        return ((Boolean) IS_GRAY.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    public final boolean getIS_HFP_CONNECT() {
        return ((Boolean) IS_HFP_CONNECT.getValue(this, $$delegatedProperties[26])).booleanValue();
    }

    public final boolean getIS_SPORT_TARGET_SHARE_SHOW() {
        return ((Boolean) IS_SPORT_TARGET_SHARE_SHOW.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    public final boolean getIS_SUPPORT_DEVICE_STATISTICS() {
        return ((Boolean) IS_SUPPORT_DEVICE_STATISTICS.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public final boolean getIS_SUPPORT_SCHEMA() {
        return ((Boolean) IS_SUPPORT_SCHEMA.getValue(this, $$delegatedProperties[21])).booleanValue();
    }

    public final boolean getIS_SUPPORT_SLEEP_RHYTHM() {
        return ((Boolean) IS_SUPPORT_SLEEP_RHYTHM.getValue(this, $$delegatedProperties[20])).booleanValue();
    }

    @NotNull
    public final String getMEDIASESSION_BLACKLIST() {
        return (String) MEDIASESSION_BLACKLIST.getValue(this, $$delegatedProperties[23]);
    }

    @NotNull
    public final String getNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST() {
        return (String) NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST.getValue(this, $$delegatedProperties[13]);
    }

    @NotNull
    public final String getNOTIFICATION_APP_IN_WHITE_LIST() {
        return (String) NOTIFICATION_APP_IN_WHITE_LIST.getValue(this, $$delegatedProperties[12]);
    }

    @NotNull
    public final String getNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST() {
        return (String) NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST.getValue(this, $$delegatedProperties[14]);
    }

    public final boolean getOPEN_MIUI_CONNECTION() {
        return ((Boolean) OPEN_MIUI_CONNECTION.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V2() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V2.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V3() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V3.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V4() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V4.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V5() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V5.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V6() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V6.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V7() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V7.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public final boolean getOPEN_MIUI_SPP_CONNECTION() {
        return ((Boolean) OPEN_MIUI_SPP_CONNECTION.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    public final boolean getROUTE_NEW_FACE_POOL_FROM_ENTRANCE() {
        return ((Boolean) ROUTE_NEW_FACE_POOL_FROM_ENTRANCE.getValue(this, $$delegatedProperties[27])).booleanValue();
    }

    public final boolean getSHOW_SUUNTO_PARTNER_BTN() {
        return ((Boolean) SHOW_SUUNTO_PARTNER_BTN.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public final boolean getSHOW_VIP_BANNER() {
        return ((Boolean) SHOW_VIP_BANNER.getValue(this, $$delegatedProperties[25])).booleanValue();
    }

    public final boolean getSHOW_WATCH_FACE_PRICE() {
        return ((Boolean) SHOW_WATCH_FACE_PRICE.getValue(this, $$delegatedProperties[19])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "global_config";
    }

    @NotNull
    public final String getUPDATER_DIALOG_APP_IN_BLACK_LIST() {
        return (String) UPDATER_DIALOG_APP_IN_BLACK_LIST.getValue(this, $$delegatedProperties[15]);
    }

    public final boolean getWEATHER_LOCATION_BY_ANDROID() {
        return ((Boolean) WEATHER_LOCATION_BY_ANDROID.getValue(this, $$delegatedProperties[22])).booleanValue();
    }

    public final void setAUTO_SHOW_KEEPALIVE(long j) {
        AUTO_SHOW_KEEPALIVE.setValue(this, $$delegatedProperties[28], Long.valueOf(j));
    }

    public final void setCARRIER_ENTRIES(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CARRIER_ENTRIES.setValue(this, $$delegatedProperties[16], str);
    }

    public final void setCARRIER_HOST_BLACK_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CARRIER_HOST_BLACK_LIST.setValue(this, $$delegatedProperties[17], str);
    }

    public final void setFOCUS_SPORT_NOTIFICATION(boolean z) {
        FOCUS_SPORT_NOTIFICATION.setValue(this, $$delegatedProperties[24], Boolean.valueOf(z));
    }

    public final void setIS_APP_CHOSEN_OPEN(boolean z) {
        IS_APP_CHOSEN_OPEN.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setIS_GRAY(boolean z) {
        IS_GRAY.setValue(this, $$delegatedProperties[9], Boolean.valueOf(z));
    }

    public final void setIS_HFP_CONNECT(boolean z) {
        IS_HFP_CONNECT.setValue(this, $$delegatedProperties[26], Boolean.valueOf(z));
    }

    public final void setIS_SPORT_TARGET_SHARE_SHOW(boolean z) {
        IS_SPORT_TARGET_SHARE_SHOW.setValue(this, $$delegatedProperties[11], Boolean.valueOf(z));
    }

    public final void setIS_SUPPORT_DEVICE_STATISTICS(boolean z) {
        IS_SUPPORT_DEVICE_STATISTICS.setValue(this, $$delegatedProperties[10], Boolean.valueOf(z));
    }

    public final void setIS_SUPPORT_SCHEMA(boolean z) {
        IS_SUPPORT_SCHEMA.setValue(this, $$delegatedProperties[21], Boolean.valueOf(z));
    }

    public final void setIS_SUPPORT_SLEEP_RHYTHM(boolean z) {
        IS_SUPPORT_SLEEP_RHYTHM.setValue(this, $$delegatedProperties[20], Boolean.valueOf(z));
    }

    public final void setMEDIASESSION_BLACKLIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MEDIASESSION_BLACKLIST.setValue(this, $$delegatedProperties[23], str);
    }

    public final void setNOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        NOTIFICATION_APP_IN_FOREGROUND_WHITE_LIST.setValue(this, $$delegatedProperties[13], str);
    }

    public final void setNOTIFICATION_APP_IN_WHITE_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        NOTIFICATION_APP_IN_WHITE_LIST.setValue(this, $$delegatedProperties[12], str);
    }

    public final void setNOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        NOTIFICATION_SPOTLIGHT_APP_IN_WHITE_LIST.setValue(this, $$delegatedProperties[14], str);
    }

    public final void setOPEN_MIUI_CONNECTION(boolean z) {
        OPEN_MIUI_CONNECTION.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_CONNECTION_V2(boolean z) {
        OPEN_MIUI_CONNECTION_V2.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_CONNECTION_V3(boolean z) {
        OPEN_MIUI_CONNECTION_V3.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_CONNECTION_V4(boolean z) {
        OPEN_MIUI_CONNECTION_V4.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_CONNECTION_V5(boolean z) {
        OPEN_MIUI_CONNECTION_V5.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_CONNECTION_V6(boolean z) {
        OPEN_MIUI_CONNECTION_V6.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_CONNECTION_V7(boolean z) {
        OPEN_MIUI_CONNECTION_V7.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setOPEN_MIUI_SPP_CONNECTION(boolean z) {
        OPEN_MIUI_SPP_CONNECTION.setValue(this, $$delegatedProperties[7], Boolean.valueOf(z));
    }

    public final void setROUTE_NEW_FACE_POOL_FROM_ENTRANCE(boolean z) {
        ROUTE_NEW_FACE_POOL_FROM_ENTRANCE.setValue(this, $$delegatedProperties[27], Boolean.valueOf(z));
    }

    public final void setSHOW_SUUNTO_PARTNER_BTN(boolean z) {
        SHOW_SUUNTO_PARTNER_BTN.setValue(this, $$delegatedProperties[18], Boolean.valueOf(z));
    }

    public final void setSHOW_VIP_BANNER(boolean z) {
        SHOW_VIP_BANNER.setValue(this, $$delegatedProperties[25], Boolean.valueOf(z));
    }

    public final void setSHOW_WATCH_FACE_PRICE(boolean z) {
        SHOW_WATCH_FACE_PRICE.setValue(this, $$delegatedProperties[19], Boolean.valueOf(z));
    }

    public final void setUPDATER_DIALOG_APP_IN_BLACK_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        UPDATER_DIALOG_APP_IN_BLACK_LIST.setValue(this, $$delegatedProperties[15], str);
    }

    public final void setWEATHER_LOCATION_BY_ANDROID(boolean z) {
        WEATHER_LOCATION_BY_ANDROID.setValue(this, $$delegatedProperties[22], Boolean.valueOf(z));
    }
}
