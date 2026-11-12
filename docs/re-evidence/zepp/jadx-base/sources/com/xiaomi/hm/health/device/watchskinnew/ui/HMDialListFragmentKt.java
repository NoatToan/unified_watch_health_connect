package com.xiaomi.hm.health.device.watchskinnew.ui;

import com.huami.devicex.R;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u0006\u0010\n\u001a\u00020\u0000¨\u0006\u000b"}, d2 = {"", "isCincoUI", "isKestrelUI", "isVeniceUI", "Lkotlin/Pair;", "", "getDialLayoutSize", "", "getDefaultPlaceholder", "getWatchSize", "isRoundWatch", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMDialListFragmentKt {
    public static final int getDefaultPlaceholder() {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (isCincoUI()) {
            return R.drawable.icon_default_cinco_dial_list;
        }
        if (isKestrelUI()) {
            return R.drawable.icon_default_kestrel_dial_list;
        }
        if (isVeniceUI()) {
            return R.drawable.icon_default_venice_dial_list;
        }
        return boundDeviceSource == HMDeviceSource.MILI_ANETO ? R.drawable.icon_default_kestrel_dial_list : R.drawable.icon_gt_dial_default_bg;
    }

    @NotNull
    public static final Pair<Float, Float> getDialLayoutSize() {
        if (isCincoUI()) {
            return new Pair<>(Float.valueOf(60.0f), Float.valueOf(120.0f));
        }
        if (isKestrelUI()) {
            return new Pair<>(Float.valueOf(98.0f), Float.valueOf(122.0f));
        }
        return isVeniceUI() ? new Pair<>(Float.valueOf(58.0f), Float.valueOf(179.0f)) : new Pair<>(Float.valueOf(-1.0f), Float.valueOf(-1.0f));
    }

    @NotNull
    public static final Pair<Float, Float> getWatchSize() {
        boolean zIsCincoUI = isCincoUI();
        Float fValueOf = Float.valueOf(120.0f);
        if (zIsCincoUI) {
            return new Pair<>(Float.valueOf(60.0f), fValueOf);
        }
        if (isKestrelUI()) {
            return new Pair<>(Float.valueOf(90.0f), fValueOf);
        }
        return isVeniceUI() ? new Pair<>(Float.valueOf(58.0f), Float.valueOf(179.0f)) : new Pair<>(Float.valueOf(-1.0f), Float.valueOf(-1.0f));
    }

    public static final boolean isCincoUI() {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        return boundDeviceSource == HMDeviceSource.MILI_ATHENS || ConfigHelperKt.hasFeature(boundDeviceSource, Feature.CINCO_SERIES_S);
    }

    public static final boolean isKestrelUI() {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        return ConfigHelperKt.hasFeature(boundDeviceSource, Feature.KESTREL_SERIES_S) || boundDeviceSource == HMDeviceSource.MILI_CORSICA || boundDeviceSource == HMDeviceSource.MILI_CORSICA_W || boundDeviceSource == HMDeviceSource.MILI_NEWTON || boundDeviceSource == HMDeviceSource.MILI_NEWTON_W;
    }

    public static final boolean isRoundWatch() {
        return (isCincoUI() || isKestrelUI() || isVeniceUI() || ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_ANETO) ? false : true;
    }

    public static final boolean isVeniceUI() {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        return boundDeviceSource == HMDeviceSource.MILI_VENICE || boundDeviceSource == HMDeviceSource.MILI_VENICE_W || boundDeviceSource == HMDeviceSource.MILI_LONDON || boundDeviceSource == HMDeviceSource.MILI_LONDON_W;
    }
}
