package com.xiaomi.hm.health.smalltool.model;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_DEVICE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Sort;", "", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "filter", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "getFilter", "()Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "", "Lcom/xiaomi/hm/health/smalltool/model/Tool;", "sort", "[Lcom/xiaomi/hm/health/smalltool/model/Tool;", "getSort", "()[Lcom/xiaomi/hm/health/smalltool/model/Tool;", "<init>", "(Ljava/lang/String;ILcom/xiaomi/hm/health/smalltool/model/IFilter;[Lcom/xiaomi/hm/health/smalltool/model/Tool;)V", "NO_DEVICE", "BAND", "BAND_YORK", "COMO_AND_NESS", "SMART_WATCH", "SMART_WATCH_SPORT", "SCALE", "TREADMILL", "CHOPIN", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class Sort {
    private static final /* synthetic */ Sort[] $VALUES;
    public static final Sort BAND;
    public static final Sort BAND_YORK;
    public static final Sort CHOPIN;
    public static final Sort COMO_AND_NESS;
    public static final Sort NO_DEVICE;
    public static final Sort SCALE;
    public static final Sort SMART_WATCH;
    public static final Sort SMART_WATCH_SPORT;
    public static final Sort TREADMILL;

    @NotNull
    private final IFilter filter;

    @NotNull
    private final Tool[] sort;

    static {
        Filter filter = Filter.NO_DEVICE;
        Tool tool = Tool.SPORT_RUN;
        Tool tool2 = Tool.SPORT_WALK;
        Tool tool3 = Tool.SPORT_BIKE;
        Tool tool4 = Tool.TRAINING_FITNESS;
        Tool tool5 = Tool.TRAINING_BREATHE;
        Tool tool6 = Tool.FRIENT;
        Tool tool7 = Tool.TARGET_SETTING;
        Tool tool8 = Tool.FEMALE_HEALTH;
        Tool tool9 = Tool.SNORE_MONITOR;
        Tool tool10 = Tool.STRESS_TRAINING_BREATH;
        NO_DEVICE = new Sort("NO_DEVICE", 0, filter, new Tool[]{tool, tool2, tool3, tool4, tool5, tool6, tool7, tool8, tool9, tool10});
        Filter filter2 = Filter.BAND_DEFAULT;
        Tool tool11 = Tool.WATCHFACE_SETTING;
        Tool tool12 = Tool.CALL_ALERT;
        Tool tool13 = Tool.APP_ALERT;
        Tool tool14 = Tool.CUSTOM_VIBRATE;
        Tool tool15 = Tool.UNLOCK_SCRENN;
        Tool tool16 = Tool.ALARM;
        Tool tool17 = Tool.REMINDER;
        Tool tool18 = Tool.NFC_WALLET;
        Tool tool19 = Tool.FIND_DEVICE;
        Tool tool20 = Tool.SPORT_HELP;
        Tool tool21 = Tool.WIDGET_MANAGER;
        BAND = new Sort("BAND", 1, filter2, new Tool[]{tool, tool2, tool3, tool4, tool5, tool11, tool12, tool13, tool14, tool15, tool16, tool17, tool18, tool19, tool20, tool21, tool6, tool7, tool8, tool9, tool10, Tool.OFFLINE_VOICE_COMD});
        Filter filter3 = Filter.YORK;
        Tool tool22 = Tool.WORLD_CLOCK;
        Tool tool23 = Tool.BAND_APPS_SETTING;
        BAND_YORK = new Sort("BAND_YORK", 2, filter3, new Tool[]{tool, tool2, tool3, tool4, tool5, tool11, tool16, tool17, tool22, tool12, tool13, tool14, tool15, tool18, tool19, tool23, Tool.SHORTCUTS_SETTING, tool6, tool7, tool9, tool8, tool10});
        COMO_AND_NESS = new Sort("COMO_AND_NESS", 3, Filter.COMO_NESS, new Tool[]{tool, tool2, tool3, tool4, tool5, tool11, tool16, tool22, tool12, tool13, tool14, tool15, tool19, tool23, tool6, tool7, tool9, tool8, tool10});
        HMDeviceSource[] watch_smart_family = ToolConfigKt.getWATCH_SMART_FAMILY();
        Filter.Devices devices = new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_smart_family, watch_smart_family.length));
        Tool tool24 = Tool.XIMALAYA;
        SMART_WATCH = new Sort("SMART_WATCH", 4, devices, new Tool[]{Tool.ASSISTANT, tool24, tool, tool2, tool3, tool4, tool5, tool11, tool13, tool15, tool18, tool19, tool6, tool7, tool9, tool10});
        HMDeviceSource[] watch_sport_family = ToolConfigKt.getWATCH_SPORT_FAMILY();
        SMART_WATCH_SPORT = new Sort("SMART_WATCH_SPORT", 5, new Filter.Devices((HMDeviceSource[]) Arrays.copyOf(watch_sport_family, watch_sport_family.length)), new Tool[]{tool, tool2, tool3, tool4, tool5, tool11, tool24, tool12, tool13, tool21, tool15, tool20, tool16, tool18, tool19, tool6, tool7, tool9, tool10});
        SCALE = new Sort("SCALE", 6, Filter.SCALE, new Tool[]{tool, tool2, tool3, tool4, tool5, Tool.SCALE_BABY, Tool.LOSE_WEIGHT_PLAN, Tool.SCALE_BALANCE, tool6, tool7, tool9, tool10, Tool.HJ_SCALE_BALANCE});
        TREADMILL = new Sort("TREADMILL", 7, Filter.TREADMILL, new Tool[]{tool, tool2, tool3, tool4, Tool.TREADMILL, tool5, tool6, tool7, tool9, tool10});
        CHOPIN = new Sort("CHOPIN", 8, Filter.CHOPIN_HANDSET, new Tool[]{tool, tool2, tool3, tool4, Tool.ZENBUDS, tool5, tool6, tool7, tool9, tool10});
        $VALUES = a();
    }

    private Sort(String str, int i, IFilter iFilter, Tool[] toolArr) {
        super(str, i);
        this.filter = iFilter;
        this.sort = toolArr;
    }

    private static final /* synthetic */ Sort[] a() {
        return new Sort[]{NO_DEVICE, BAND, BAND_YORK, COMO_AND_NESS, SMART_WATCH, SMART_WATCH_SPORT, SCALE, TREADMILL, CHOPIN};
    }

    public static Sort valueOf(String str) {
        return (Sort) Enum.valueOf(Sort.class, str);
    }

    public static Sort[] values() {
        return (Sort[]) $VALUES.clone();
    }

    @NotNull
    public final IFilter getFilter() {
        return this.filter;
    }

    @NotNull
    public final Tool[] getSort() {
        return this.sort;
    }
}
