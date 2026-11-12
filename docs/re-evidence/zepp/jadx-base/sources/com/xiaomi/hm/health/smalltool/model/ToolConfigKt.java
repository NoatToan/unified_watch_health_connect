package com.xiaomi.hm.health.smalltool.model;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\t\"\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\t\"\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\t\"\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\t\"\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0007\u001a\u0004\b$\u0010\t\"\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\t*&\u0010+\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020*0)2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020*0)¨\u0006,"}, d2 = {"", "a", "Ljava/lang/String;", "TAG", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getWATCH_EVEREST_SERIES", "()[Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "WATCH_EVEREST_SERIES", "c", "getWATCH_EVEREST_2_SERIES_MAINLAND", "WATCH_EVEREST_2_SERIES_MAINLAND", GoogleApiAvailabilityLight.a, "getWATCH_EVEREST_2_SERIES", "WATCH_EVEREST_2_SERIES", "e", "getWATCH_XIHU_SERIES", "WATCH_XIHU_SERIES", "f", "getWATCH_XIHU_OVERSEA", "WATCH_XIHU_OVERSEA", "g", "getWATCH_SUPPORT_NFC", "WATCH_SUPPORT_NFC", "h", "getWATCH_SMART_FAMILY", "WATCH_SMART_FAMILY", "i", "getWATCH_SPORT_FAMILY", "WATCH_SPORT_FAMILY", z.j, "getBAND_MI", "BAND_MI", hl.k, "getMILI_ANETO_SERIES", "MILI_ANETO_SERIES", "l", "getGUEST_MODE_SERIES", "GUEST_MODE_SERIES", "Lkotlin/Function1;", "", "IDeviceFeatureCheck", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ToolConfigKt {

    @NotNull
    private static final String a = "SmallTool-Config";

    @NotNull
    private static final HMDeviceSource[] b;

    @NotNull
    private static final HMDeviceSource[] c;

    @NotNull
    private static final HMDeviceSource[] d;

    @NotNull
    private static final HMDeviceSource[] e;

    @NotNull
    private static final HMDeviceSource[] f;

    @NotNull
    private static final HMDeviceSource[] g;

    @NotNull
    private static final HMDeviceSource[] h;

    @NotNull
    private static final HMDeviceSource[] i;

    @NotNull
    private static final HMDeviceSource[] j;

    @NotNull
    private static final HMDeviceSource[] k;

    @NotNull
    private static final HMDeviceSource[] l;

    static {
        HMDeviceSource[] hMDeviceSourceArr = {HMDeviceSource.WATCH_EVEREST, HMDeviceSource.WATCH_EVEREST_2S};
        b = hMDeviceSourceArr;
        HMDeviceSource[] hMDeviceSourceArr2 = {HMDeviceSource.SMART_WATCH_EVEREST_2, HMDeviceSource.SMART_WATCH_EVEREST_2S, HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR};
        c = hMDeviceSourceArr2;
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.addSpread(hMDeviceSourceArr2);
        spreadBuilder.add(HMDeviceSource.SMART_WATCH_EVEREST_2W);
        spreadBuilder.add(HMDeviceSource.SMART_WATCH_EVEREST_2SW);
        HMDeviceSource[] hMDeviceSourceArr3 = (HMDeviceSource[]) spreadBuilder.toArray(new HMDeviceSource[spreadBuilder.size()]);
        d = hMDeviceSourceArr3;
        HMDeviceSource hMDeviceSource = HMDeviceSource.WATCH_AMAZFIT_XIHU;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.WATCH_AMAZFIT_XIHU_EA;
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY;
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.WATCH_AMAZFIT_XIHU_E;
        HMDeviceSource[] hMDeviceSourceArr4 = {hMDeviceSource, hMDeviceSource2, hMDeviceSource3, hMDeviceSource4};
        e = hMDeviceSourceArr4;
        f = new HMDeviceSource[]{hMDeviceSource2};
        SpreadBuilder spreadBuilder2 = new SpreadBuilder(5);
        HMDeviceSource hMDeviceSource5 = HMDeviceSource.WATCH_AMAZFIT_QOG;
        spreadBuilder2.add(hMDeviceSource5);
        spreadBuilder2.add(hMDeviceSource);
        spreadBuilder2.add(hMDeviceSource3);
        spreadBuilder2.add(hMDeviceSource4);
        spreadBuilder2.addSpread(hMDeviceSourceArr2);
        g = (HMDeviceSource[]) spreadBuilder2.toArray(new HMDeviceSource[spreadBuilder2.size()]);
        SpreadBuilder spreadBuilder3 = new SpreadBuilder(2);
        spreadBuilder3.add(hMDeviceSource5);
        spreadBuilder3.addSpread(hMDeviceSourceArr4);
        h = (HMDeviceSource[]) spreadBuilder3.toArray(new HMDeviceSource[spreadBuilder3.size()]);
        SpreadBuilder spreadBuilder4 = new SpreadBuilder(3);
        spreadBuilder4.add(HMDeviceSource.WATCH_AMAZFIT);
        spreadBuilder4.addSpread(hMDeviceSourceArr);
        spreadBuilder4.addSpread(hMDeviceSourceArr3);
        i = (HMDeviceSource[]) spreadBuilder4.toArray(new HMDeviceSource[spreadBuilder4.size()]);
        j = new HMDeviceSource[]{HMDeviceSource.MILI, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_1S, HMDeviceSource.MILI_PRO_OLD, HMDeviceSource.MILI_PRO, HMDeviceSource.MILI_WUHAN, HMDeviceSource.MILI_CHONGQING, HMDeviceSource.MILI_CINCO, HMDeviceSource.MILI_CINCO_L};
        k = new HMDeviceSource[]{HMDeviceSource.MILI_ANETO};
        l = new HMDeviceSource[]{HMDeviceSource.WEIGHT_BFS, HMDeviceSource.WEIGHT_AMAZFIT_SCALE};
    }

    @NotNull
    public static final HMDeviceSource[] getBAND_MI() {
        return j;
    }

    @NotNull
    public static final HMDeviceSource[] getGUEST_MODE_SERIES() {
        return l;
    }

    @NotNull
    public static final HMDeviceSource[] getMILI_ANETO_SERIES() {
        return k;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_EVEREST_2_SERIES() {
        return d;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_EVEREST_2_SERIES_MAINLAND() {
        return c;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_EVEREST_SERIES() {
        return b;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_SMART_FAMILY() {
        return h;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_SPORT_FAMILY() {
        return i;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_SUPPORT_NFC() {
        return g;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_XIHU_OVERSEA() {
        return f;
    }

    @NotNull
    public static final HMDeviceSource[] getWATCH_XIHU_SERIES() {
        return e;
    }
}
