package com.xiaomi.hm.health.running.calori;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "histroySource", "", "is4ByteDevice", "Lkotlin/sequences/Sequence;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Lkotlin/sequences/Sequence;", "getCALORI_FILTER_DEVICES", "()Lkotlin/sequences/Sequence;", "CALORI_FILTER_DEVICES", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class CalorieDeviceFilterKt {

    @NotNull
    private static final Sequence<HMDeviceSource> a;

    static {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_JIUHUASHAN;
        a = SequencesKt__SequencesKt.sequenceOf(HMDeviceSource.VDEVICE, HMDeviceSource.WEIGHT, HMDeviceSource.WEIGHT_BODYFAT, HMDeviceSource.WEIGHT_BFS, HMDeviceSource.WEIGHT_SCALE2, HMDeviceSource.WEIGHT_AMAZFIT_SCALE, HMDeviceSource.SHOES, HMDeviceSource.SHOES_CHILD, HMDeviceSource.SHOES_LIGHT, HMDeviceSource.SHOES_SPRANDI, HMDeviceSource.SHOES_MARS, HMDeviceSource.MILI, HMDeviceSource.MILI_1S, HMDeviceSource.MILI_1A, HMDeviceSource.MILI_AMAZFIT, HMDeviceSource.MILI_PRO, HMDeviceSource.MILI_ROCKY, HMDeviceSource.MILI_NFC, HMDeviceSource.MILI_QINLING, HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_TEMPO, HMDeviceSource.MILI_PRO_I, HMDeviceSource.MILI_WUHAN, HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_BEATS, HMDeviceSource.MILI_BEATS_W, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_CINCO, HMDeviceSource.MILI_CINCO_L, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_L, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL, HMDeviceSource.MILI_PYH, HMDeviceSource.MILI_RIO, hMDeviceSource, HMDeviceSource.MILI_QINLING_S2, HMDeviceSource.MILI_PYH_W, HMDeviceSource.MILI_PEYTO_L, HMDeviceSource.MILI_PEYTO_WL, HMDeviceSource.MILI_ATHENS, HMDeviceSource.MILI_ANETO, HMDeviceSource.MILI_GARDA, hMDeviceSource, HMDeviceSource.MILI_JIUHUASHAN_PRO, HMDeviceSource.OTHER_BM, HMDeviceSource.OTHER_BOLT, HMDeviceSource.OTHER_BOLT_SECOND, HMDeviceSource.OTHER_MOZART, HMDeviceSource.OTHER_HAYDN, HMDeviceSource.EARBUD_CHOPIN, HMDeviceSource.TIMEX_SIMPLY_GPS, HMDeviceSource.TIMEX_CROSS_FIT_ENTRY, HMDeviceSource.TIMEX_CROSS_FIT_GPS, HMDeviceSource.TIMEX_FALCON, HMDeviceSource.TIMEX_HAWK, HMDeviceSource.TIMEX_KESTREL, HMDeviceSource.TIMEX_HEARTFIT_ZONE, HMDeviceSource.MILI_HAWK_L, HMDeviceSource.MILI_FALCON_L, HMDeviceSource.MILI_KESTREL_L, HMDeviceSource.MILI_KESTREL_WL, HMDeviceSource.WATCH_AMAZFIT, HMDeviceSource.WATCH_EVEREST, HMDeviceSource.WATCH_EVEREST_2S, HMDeviceSource.WATCH_AMAZFIT_QOG, HMDeviceSource.WATCH_AMAZFIT_XIHU, HMDeviceSource.WATCH_AMAZFIT_XIHU_E, HMDeviceSource.WATCH_AMAZFIT_XIHU_EA, HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY, HMDeviceSource.SMART_WATCH_EVEREST_2, HMDeviceSource.SMART_WATCH_EVEREST_2S, HMDeviceSource.SMART_WATCH_EVEREST_2W, HMDeviceSource.SMART_WATCH_EVEREST_2SW, HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR);
    }

    @NotNull
    public static final Sequence<HMDeviceSource> getCALORI_FILTER_DEVICES() {
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final boolean is4ByteDevice(int i) {
        for (HMDeviceSource hMDeviceSource : a) {
            if (i == hMDeviceSource.getValue()) {
                if (hMDeviceSource != null) {
                    return true;
                }
                return false;
            }
        }
        hMDeviceSource = null;
        if (hMDeviceSource != null) {
            return true;
        }
        return false;
    }
}
