package com.xiaomi.hm.health.device;

import android.content.Context;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.device.setting.appsort.AppSortCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001b\u001aR\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010 \u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010!\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010\"\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010#\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u001aJ\u0010$\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006%"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Ljava/util/HashMap;", "", "", "nameMap", "drawableMap", "colorMap", "", "createAppSort", "createGTRHAppSort", "createGTRLAppSort", "createVultureAppSort", "createPYHAppSort", "createTempoAppSort", "createWuhanAppSort", "createChongqingAppSort", "createAthensAppSort", "createKongmingLSort", "createYorkSport", "createKongmingSort", "createAnetoAppSort", "createCincoAppSort", "createCincoLAppSort", "createTonlesapAppSort", "createRioAppSort", "createPeytoAppSort", "createPeytoLAppSort", "createDTHAppSort", "createBeatsWAppSort", "createBeatsAppSort", "createVeniceAppSort", "createVeniceWAppSort", "createBeatsPAppSort", "createTokyoAppSort", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AppSortHelperKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_TEMPO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_WUHAN.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_PEYTO.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_DTH.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_DTH_W.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_BEATS.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_BEATS_W.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_BEATS_P.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_CHONGQING.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_CINCO_L.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_TONLESAP.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_RIO.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_FALCON.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_HAWK.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_FALCON_L.ordinal()] = 24;
            iArr[HMDeviceSource.MILI_FALCON_W.ordinal()] = 25;
            iArr[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 26;
            iArr[HMDeviceSource.MILI_HAWK_L.ordinal()] = 27;
            iArr[HMDeviceSource.MILI_HAWK_W.ordinal()] = 28;
            iArr[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 29;
            iArr[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 30;
            iArr[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 31;
            iArr[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 32;
            iArr[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 33;
            iArr[HMDeviceSource.MILI_VULTURE.ordinal()] = 34;
            iArr[HMDeviceSource.MILI_PYH.ordinal()] = 35;
            iArr[HMDeviceSource.MILI_PYH_W.ordinal()] = 36;
            iArr[HMDeviceSource.MILI_ATHENS.ordinal()] = 37;
            iArr[HMDeviceSource.MILI_TOKYO.ordinal()] = 38;
            iArr[HMDeviceSource.MILI_VENICE.ordinal()] = 39;
            iArr[HMDeviceSource.MILI_VENICE_W.ordinal()] = 40;
            iArr[HMDeviceSource.MILI_ANETO.ordinal()] = 41;
            iArr[HMDeviceSource.MILI_YORK.ordinal()] = 42;
            iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 43;
            iArr[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 44;
            iArr[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 45;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void createAnetoAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(1, context.getString(R.string.setting_app_activity));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(17, context.getString(R.string.bind_alipay));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(12, context.getString(R.string.setting_app_seconds));
        map.put(13, context.getString(R.string.setting_app_countdown));
        map.put(11, context.getString(R.string.app_sort_music));
        map.put(30, context.getString(R.string.widget_sport_state));
        map.put(25, context.getString(R.string.pai_name));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(17, Integer.valueOf(R.drawable.icon_alipay));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        int i = R.drawable.chaohu_app_sport;
        map2.put(3, Integer.valueOf(i));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        int i2 = R.drawable.chaohu_app_timer;
        map2.put(12, Integer.valueOf(i2));
        map2.put(13, Integer.valueOf(i2));
        map2.put(11, Integer.valueOf(R.drawable.setting_app_music));
        map2.put(30, Integer.valueOf(i));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        int i3 = R.color.common_light_color;
        map3.put(1, Integer.valueOf(i3));
        map3.put(2, Integer.valueOf(i3));
        map3.put(17, Integer.valueOf(i3));
        map3.put(4, Integer.valueOf(i3));
        map3.put(3, Integer.valueOf(i3));
        map3.put(9, Integer.valueOf(i3));
        map3.put(6, Integer.valueOf(i3));
        map3.put(12, Integer.valueOf(i3));
        map3.put(13, Integer.valueOf(i3));
        map3.put(11, Integer.valueOf(i3));
        map3.put(30, Integer.valueOf(i3));
        map3.put(25, Integer.valueOf(i3));
    }

    public static final void createAppSort(@NotNull Context context, @NotNull HMDeviceSource hMDeviceSource, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        switch (WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()]) {
            case 1:
                createTempoAppSort(context, map, map2, map3);
                break;
            case 2:
                createWuhanAppSort(context, map, map2, map3);
                break;
            case 3:
                createPeytoAppSort(context, map, map2, map3);
                break;
            case 4:
                createPeytoLAppSort(context, map, map2, map3);
                break;
            case 5:
                createPeytoLAppSort(context, map, map2, map3);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                createDTHAppSort(context, map, map2, map3);
                break;
            case 10:
                createBeatsAppSort(context, map, map2, map3);
                break;
            case 11:
                createBeatsWAppSort(context, map, map2, map3);
                break;
            case 12:
                createBeatsPAppSort(context, map, map2, map3);
                break;
            case 13:
                createChongqingAppSort(context, map, map2, map3);
                break;
            case 14:
                createCincoAppSort(context, map, map2, map3);
                break;
            case 15:
                createCincoLAppSort(context, map, map2, map3);
                break;
            case 16:
            case 17:
                createTonlesapAppSort(context, map, map2, map3);
                break;
            case 18:
                createRioAppSort(context, map, map2, map3);
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                createGTRHAppSort(context, map, map2, map3);
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                createGTRLAppSort(context, map, map2, map3);
                break;
            case 34:
                createVultureAppSort(context, map, map2, map3);
                break;
            case 35:
            case 36:
                createPYHAppSort(context, map, map2, map3);
                break;
            case 37:
                createAthensAppSort(context, map, map2, map3);
                break;
            case 38:
                createTokyoAppSort(context, map, map2, map3);
                break;
            case 39:
                createVeniceAppSort(context, map, map2, map3);
                break;
            case 40:
                createVeniceWAppSort(context, map, map2, map3);
                break;
            case 41:
                createAnetoAppSort(context, map, map2, map3);
                break;
            case 42:
                createYorkSport(context, map, map2, map3);
                break;
            case 43:
            case 44:
                createKongmingSort(context, map, map2, map3);
                break;
            case 45:
                createKongmingLSort(context, map, map2, map3);
                break;
            default:
                AppSortMapFactory appSortMapFactoryMapByDeviceSource = AppSortCenter.INSTANCE.mapByDeviceSource(hMDeviceSource);
                if (appSortMapFactoryMapByDeviceSource != null) {
                    map.putAll(appSortMapFactoryMapByDeviceSource.createItemNames(context));
                    map2.putAll(appSortMapFactoryMapByDeviceSource.createDrawables(context));
                    map3.putAll(appSortMapFactoryMapByDeviceSource.createColors(context));
                    break;
                }
                break;
        }
    }

    public static final void createAthensAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(18, context.getString(R.string.setting_app_band_dialplate));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(18, Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        int i = R.color.common_light_color;
        map3.put(18, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
    }

    public static final void createBeatsAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeBeats appTypeBeats = HMDisplaySetting.AppTypeBeats.DIAL;
        map.put(Integer.valueOf(appTypeBeats.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeBeats appTypeBeats2 = HMDisplaySetting.AppTypeBeats.PAI;
        map.put(Integer.valueOf(appTypeBeats2.getValue()), context.getString(R.string.card_pai));
        HMDisplaySetting.AppTypeBeats appTypeBeats3 = HMDisplaySetting.AppTypeBeats.STATUS;
        map.put(Integer.valueOf(appTypeBeats3.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeBeats appTypeBeats4 = HMDisplaySetting.AppTypeBeats.NOTIFICATION;
        map.put(Integer.valueOf(appTypeBeats4.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeBeats appTypeBeats5 = HMDisplaySetting.AppTypeBeats.SPORT;
        map.put(Integer.valueOf(appTypeBeats5.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeBeats appTypeBeats6 = HMDisplaySetting.AppTypeBeats.WEATHER;
        map.put(Integer.valueOf(appTypeBeats6.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeBeats appTypeBeats7 = HMDisplaySetting.AppTypeBeats.ALARM;
        map.put(Integer.valueOf(appTypeBeats7.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppTypeBeats appTypeBeats8 = HMDisplaySetting.AppTypeBeats.TIMER;
        map.put(Integer.valueOf(appTypeBeats8.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeBeats appTypeBeats9 = HMDisplaySetting.AppTypeBeats.SETTING;
        map.put(Integer.valueOf(appTypeBeats9.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppTypeBeats appTypeBeats10 = HMDisplaySetting.AppTypeBeats.ALIPAY;
        map.put(Integer.valueOf(appTypeBeats10.getValue()), context.getString(R.string.bind_alipay));
        HMDisplaySetting.AppTypeBeats appTypeBeats11 = HMDisplaySetting.AppTypeBeats.MUSIC;
        map.put(Integer.valueOf(appTypeBeats11.getValue()), context.getString(R.string.app_sort_music));
        HMDisplaySetting.AppTypeBeats appTypeBeats12 = HMDisplaySetting.AppTypeBeats.NFC;
        map.put(Integer.valueOf(appTypeBeats12.getValue()), context.getString(R.string.app_sort_card_bag));
        map2.put(Integer.valueOf(appTypeBeats.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeBeats2.getValue()), Integer.valueOf(R.drawable.icon_pai));
        map2.put(Integer.valueOf(appTypeBeats3.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeBeats4.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeBeats5.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeBeats6.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeBeats7.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appTypeBeats8.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeBeats9.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appTypeBeats10.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        map2.put(Integer.valueOf(appTypeBeats11.getValue()), Integer.valueOf(R.drawable.setting_app_music));
        map2.put(Integer.valueOf(appTypeBeats12.getValue()), Integer.valueOf(R.drawable.app_sort_bus_card));
        Integer numValueOf = Integer.valueOf(appTypeBeats.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats9.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats10.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats11.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeats12.getValue()), Integer.valueOf(i));
    }

    public static final void createBeatsPAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP = HMDisplaySetting.AppTypeBeatsP.DIAL;
        map.put(Integer.valueOf(appTypeBeatsP.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP2 = HMDisplaySetting.AppTypeBeatsP.STATUS;
        map.put(Integer.valueOf(appTypeBeatsP2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP3 = HMDisplaySetting.AppTypeBeatsP.NOTIFICATION;
        map.put(Integer.valueOf(appTypeBeatsP3.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP4 = HMDisplaySetting.AppTypeBeatsP.SPORT;
        map.put(Integer.valueOf(appTypeBeatsP4.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP5 = HMDisplaySetting.AppTypeBeatsP.WEATHER;
        map.put(Integer.valueOf(appTypeBeatsP5.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP6 = HMDisplaySetting.AppTypeBeatsP.ALARM;
        map.put(Integer.valueOf(appTypeBeatsP6.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP7 = HMDisplaySetting.AppTypeBeatsP.TIMER;
        map.put(Integer.valueOf(appTypeBeatsP7.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP8 = HMDisplaySetting.AppTypeBeatsP.SETTING;
        map.put(Integer.valueOf(appTypeBeatsP8.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP9 = HMDisplaySetting.AppTypeBeatsP.ALIPAY;
        map.put(Integer.valueOf(appTypeBeatsP9.getValue()), context.getString(R.string.bind_alipay));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP10 = HMDisplaySetting.AppTypeBeatsP.MUSIC;
        map.put(Integer.valueOf(appTypeBeatsP10.getValue()), context.getString(R.string.app_sort_music));
        HMDisplaySetting.AppTypeBeatsP appTypeBeatsP11 = HMDisplaySetting.AppTypeBeatsP.NFC;
        map.put(Integer.valueOf(appTypeBeatsP11.getValue()), context.getString(R.string.app_sort_card_bag));
        map2.put(Integer.valueOf(appTypeBeatsP.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeBeatsP2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeBeatsP3.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeBeatsP4.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeBeatsP5.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeBeatsP6.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appTypeBeatsP7.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeBeatsP8.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appTypeBeatsP9.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        map2.put(Integer.valueOf(appTypeBeatsP10.getValue()), Integer.valueOf(R.drawable.setting_app_music));
        map2.put(Integer.valueOf(appTypeBeatsP11.getValue()), Integer.valueOf(R.drawable.app_sort_bus_card));
        Integer numValueOf = Integer.valueOf(appTypeBeatsP.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP9.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP10.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsP11.getValue()), Integer.valueOf(i));
    }

    public static final void createBeatsWAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW = HMDisplaySetting.AppTypeBeatsW.DIAL;
        map.put(Integer.valueOf(appTypeBeatsW.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW2 = HMDisplaySetting.AppTypeBeatsW.PAI;
        map.put(Integer.valueOf(appTypeBeatsW2.getValue()), context.getString(R.string.card_pai));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW3 = HMDisplaySetting.AppTypeBeatsW.STATUS;
        map.put(Integer.valueOf(appTypeBeatsW3.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW4 = HMDisplaySetting.AppTypeBeatsW.NOTIFICATION;
        map.put(Integer.valueOf(appTypeBeatsW4.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW5 = HMDisplaySetting.AppTypeBeatsW.SPORT;
        map.put(Integer.valueOf(appTypeBeatsW5.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW6 = HMDisplaySetting.AppTypeBeatsW.WEATHER;
        map.put(Integer.valueOf(appTypeBeatsW6.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW7 = HMDisplaySetting.AppTypeBeatsW.ALARM;
        map.put(Integer.valueOf(appTypeBeatsW7.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW8 = HMDisplaySetting.AppTypeBeatsW.TIMER;
        map.put(Integer.valueOf(appTypeBeatsW8.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW9 = HMDisplaySetting.AppTypeBeatsW.SETTING;
        map.put(Integer.valueOf(appTypeBeatsW9.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW10 = HMDisplaySetting.AppTypeBeatsW.ALIPAY;
        map.put(Integer.valueOf(appTypeBeatsW10.getValue()), context.getString(R.string.bind_alipay));
        HMDisplaySetting.AppTypeBeatsW appTypeBeatsW11 = HMDisplaySetting.AppTypeBeatsW.MUSIC;
        map.put(Integer.valueOf(appTypeBeatsW11.getValue()), context.getString(R.string.app_sort_music));
        map2.put(Integer.valueOf(appTypeBeatsW.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeBeatsW2.getValue()), Integer.valueOf(R.drawable.icon_pai));
        map2.put(Integer.valueOf(appTypeBeatsW3.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeBeatsW4.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeBeatsW5.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeBeatsW6.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeBeatsW7.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appTypeBeatsW8.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeBeatsW9.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appTypeBeatsW10.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        map2.put(Integer.valueOf(appTypeBeatsW11.getValue()), Integer.valueOf(R.drawable.setting_app_music));
        Integer numValueOf = Integer.valueOf(appTypeBeatsW.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW9.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW10.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeBeatsW11.getValue()), Integer.valueOf(i));
    }

    public static final void createChongqingAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeChongqing appTypeChongqing = HMDisplaySetting.AppTypeChongqing.DIAL;
        map.put(Integer.valueOf(appTypeChongqing.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing2 = HMDisplaySetting.AppTypeChongqing.STATUS;
        map.put(Integer.valueOf(appTypeChongqing2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing3 = HMDisplaySetting.AppTypeChongqing.HR;
        map.put(Integer.valueOf(appTypeChongqing3.getValue()), context.getString(R.string.setting_app_hr));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing4 = HMDisplaySetting.AppTypeChongqing.WEATHER;
        map.put(Integer.valueOf(appTypeChongqing4.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing5 = HMDisplaySetting.AppTypeChongqing.SPORT;
        map.put(Integer.valueOf(appTypeChongqing5.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing6 = HMDisplaySetting.AppTypeChongqing.NOTIFICATION;
        map.put(Integer.valueOf(appTypeChongqing6.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing7 = HMDisplaySetting.AppTypeChongqing.SETTING;
        map.put(Integer.valueOf(appTypeChongqing7.getValue()), context.getString(R.string.mine_more));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing8 = HMDisplaySetting.AppTypeChongqing.NFC;
        map.put(Integer.valueOf(appTypeChongqing8.getValue()), context.getString(R.string.app_sort_card_bag));
        HMDisplaySetting.AppTypeChongqing appTypeChongqing9 = HMDisplaySetting.AppTypeChongqing.TIMER;
        map.put(Integer.valueOf(appTypeChongqing9.getValue()), context.getString(R.string.setting_app_timer));
        map2.put(Integer.valueOf(appTypeChongqing.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeChongqing2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeChongqing3.getValue()), Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(Integer.valueOf(appTypeChongqing4.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeChongqing5.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeChongqing6.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeChongqing7.getValue()), Integer.valueOf(R.drawable.wuhan_app_setup));
        map2.put(Integer.valueOf(appTypeChongqing8.getValue()), Integer.valueOf(R.drawable.app_sort_bus_card));
        map2.put(Integer.valueOf(appTypeChongqing9.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        Integer numValueOf = Integer.valueOf(appTypeChongqing.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChongqing9.getValue()), Integer.valueOf(i));
    }

    public static final void createCincoAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(255, context.getString(R.string.setting_app_band_dialplate));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(7, context.getString(R.string.mine_more));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map2.put(255, Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        map2.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
        int i = R.color.common_light_color;
        map3.put(255, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
        map3.put(16, Integer.valueOf(i));
    }

    public static final void createCincoLAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(255, context.getString(R.string.setting_app_band_dialplate));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(255, Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        int i = R.color.common_light_color;
        map3.put(255, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
    }

    public static final void createDTHAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(25, context.getString(R.string.pai_name));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(17, context.getString(R.string.bind_alipay));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(9, context.getString(R.string.setting_app_alarm));
        int i = R.string.setting_app_timer;
        map.put(12, context.getString(i));
        map.put(27, context.getString(i));
        map.put(22, context.getString(R.string.setting_app_compass));
        map.put(11, context.getString(R.string.app_sort_music));
        map.put(26, context.getString(R.string.world_clock));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(17, Integer.valueOf(R.drawable.icon_alipay));
        map2.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(12, Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(27, Integer.valueOf(R.drawable.app_sort_timer_countdown));
        map2.put(22, Integer.valueOf(R.drawable.chaohu_app_compass));
        map2.put(11, Integer.valueOf(R.drawable.setting_app_music));
        map2.put(26, Integer.valueOf(R.drawable.app_sort_application_world_clock));
        map2.put(19, Integer.valueOf(R.drawable.chaohu_app_setup));
        int i2 = R.color.common_light_color;
        map3.put(1, Integer.valueOf(i2));
        map3.put(2, Integer.valueOf(i2));
        map3.put(25, Integer.valueOf(i2));
        map3.put(3, Integer.valueOf(i2));
        map3.put(17, Integer.valueOf(i2));
        map3.put(16, Integer.valueOf(i2));
        map3.put(4, Integer.valueOf(i2));
        map3.put(9, Integer.valueOf(i2));
        map3.put(12, Integer.valueOf(i2));
        map3.put(27, Integer.valueOf(i2));
        map3.put(22, Integer.valueOf(i2));
        map3.put(11, Integer.valueOf(i2));
        map3.put(26, Integer.valueOf(i2));
        map3.put(19, Integer.valueOf(i2));
    }

    public static final void createGTRHAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(20, context.getString(R.string.setting_app_sport_record));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(11, context.getString(R.string.setting_app_music));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map.put(7, context.getString(R.string.mine_more));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(20, Integer.valueOf(R.drawable.pyh_setting_sport_record));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(11, Integer.valueOf(R.drawable.setting_app_music));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        map2.put(19, Integer.valueOf(R.drawable.chaohu_app_setup));
        int i = R.color.common_light_color;
        map3.put(1, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(20, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(11, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(9, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(16, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
        map3.put(19, Integer.valueOf(i));
    }

    public static final void createGTRLAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(20, context.getString(R.string.setting_app_sport_record));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(11, context.getString(R.string.setting_app_music));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(7, context.getString(R.string.mine_more));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(20, Integer.valueOf(R.drawable.pyh_setting_sport_record));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(11, Integer.valueOf(R.drawable.setting_app_music));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        map2.put(19, Integer.valueOf(R.drawable.chaohu_app_setup));
        int i = R.color.common_light_color;
        map3.put(1, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(20, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(11, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(9, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
        map3.put(19, Integer.valueOf(i));
    }

    public static final void createKongmingLSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(18, context.getString(R.string.setting_app_band_dialplate));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(28, context.getString(R.string.setting_app_pressure));
        map.put(51, context.getString(R.string.setting_app_breath_train));
        map.put(29, context.getString(R.string.setting_app_women_health));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(18, Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(28, Integer.valueOf(R.drawable.icon_pressure));
        map2.put(51, Integer.valueOf(R.drawable.icon_breathe));
        map2.put(29, Integer.valueOf(R.drawable.icon_women_health));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        int i = R.color.common_light_color;
        map3.put(18, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(28, Integer.valueOf(i));
        map3.put(51, Integer.valueOf(i));
        map3.put(29, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
    }

    public static final void createKongmingSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(18, context.getString(R.string.setting_app_band_dialplate));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(28, context.getString(R.string.setting_app_pressure));
        map.put(51, context.getString(R.string.setting_app_breath_train));
        map.put(29, context.getString(R.string.setting_app_women_health));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(18, Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(28, Integer.valueOf(R.drawable.icon_pressure));
        map2.put(51, Integer.valueOf(R.drawable.icon_breathe));
        map2.put(29, Integer.valueOf(R.drawable.icon_women_health));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        int i = R.color.common_light_color;
        map3.put(18, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(28, Integer.valueOf(i));
        map3.put(51, Integer.valueOf(i));
        map3.put(29, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(16, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
    }

    public static final void createPYHAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(20, context.getString(R.string.setting_app_sport_record));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(11, context.getString(R.string.setting_app_music));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(7, context.getString(R.string.mine_more));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(20, Integer.valueOf(R.drawable.pyh_setting_sport_record));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(11, Integer.valueOf(R.drawable.setting_app_music));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        map2.put(19, Integer.valueOf(R.drawable.chaohu_app_setup));
        int i = R.color.common_light_color;
        map3.put(1, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(20, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(11, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(9, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
        map3.put(19, Integer.valueOf(i));
    }

    public static final void createPeytoAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppType appType = HMDisplaySetting.AppType.DIAL;
        map.put(Integer.valueOf(appType.getValue()), context.getString(R.string.setting_app_dialplate));
        HMDisplaySetting.AppType appType2 = HMDisplaySetting.AppType.STATUS;
        map.put(Integer.valueOf(appType2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppType appType3 = HMDisplaySetting.AppType.SPORT;
        map.put(Integer.valueOf(appType3.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppType appType4 = HMDisplaySetting.AppType.WEATHER;
        map.put(Integer.valueOf(appType4.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppType appType5 = HMDisplaySetting.AppType.ALARM;
        map.put(Integer.valueOf(appType5.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppType appType6 = HMDisplaySetting.AppType.TIMER;
        map.put(Integer.valueOf(appType6.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppType appType7 = HMDisplaySetting.AppType.COMPASS;
        map.put(Integer.valueOf(appType7.getValue()), context.getString(R.string.setting_app_compass));
        HMDisplaySetting.AppType appType8 = HMDisplaySetting.AppType.SETTING;
        map.put(Integer.valueOf(appType8.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppType appType9 = HMDisplaySetting.AppType.ALIPAY;
        map.put(Integer.valueOf(appType9.getValue()), context.getString(R.string.bind_alipay));
        map2.put(Integer.valueOf(appType.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appType2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appType3.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appType4.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appType5.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appType6.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appType7.getValue()), Integer.valueOf(R.drawable.chaohu_app_compass));
        map2.put(Integer.valueOf(appType8.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appType9.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        Integer numValueOf = Integer.valueOf(appType.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appType2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appType9.getValue()), Integer.valueOf(i));
    }

    public static final void createPeytoLAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL = HMDisplaySetting.AppTypeChaohuL.DIAL;
        map.put(Integer.valueOf(appTypeChaohuL.getValue()), context.getString(R.string.setting_app_dialplate));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL2 = HMDisplaySetting.AppTypeChaohuL.STATUS;
        map.put(Integer.valueOf(appTypeChaohuL2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL3 = HMDisplaySetting.AppTypeChaohuL.SPORT;
        map.put(Integer.valueOf(appTypeChaohuL3.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL4 = HMDisplaySetting.AppTypeChaohuL.WEATHER;
        map.put(Integer.valueOf(appTypeChaohuL4.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL5 = HMDisplaySetting.AppTypeChaohuL.ALARM;
        map.put(Integer.valueOf(appTypeChaohuL5.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL6 = HMDisplaySetting.AppTypeChaohuL.TIMER;
        map.put(Integer.valueOf(appTypeChaohuL6.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL7 = HMDisplaySetting.AppTypeChaohuL.COMPASS;
        map.put(Integer.valueOf(appTypeChaohuL7.getValue()), context.getString(R.string.setting_app_compass));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL8 = HMDisplaySetting.AppTypeChaohuL.SETTING;
        map.put(Integer.valueOf(appTypeChaohuL8.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppTypeChaohuL appTypeChaohuL9 = HMDisplaySetting.AppTypeChaohuL.ALIPAY;
        map.put(Integer.valueOf(appTypeChaohuL9.getValue()), context.getString(R.string.bind_alipay));
        map2.put(Integer.valueOf(appTypeChaohuL.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeChaohuL2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeChaohuL3.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeChaohuL4.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeChaohuL5.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appTypeChaohuL6.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeChaohuL7.getValue()), Integer.valueOf(R.drawable.chaohu_app_compass));
        map2.put(Integer.valueOf(appTypeChaohuL8.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appTypeChaohuL9.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        Integer numValueOf = Integer.valueOf(appTypeChaohuL.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeChaohuL9.getValue()), Integer.valueOf(i));
    }

    public static final void createRioAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeRio appTypeRio = HMDisplaySetting.AppTypeRio.DIAL;
        map.put(Integer.valueOf(appTypeRio.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeRio appTypeRio2 = HMDisplaySetting.AppTypeRio.STATUS;
        map.put(Integer.valueOf(appTypeRio2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeRio appTypeRio3 = HMDisplaySetting.AppTypeRio.WEATHER;
        map.put(Integer.valueOf(appTypeRio3.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeRio appTypeRio4 = HMDisplaySetting.AppTypeRio.SPORT;
        map.put(Integer.valueOf(appTypeRio4.getValue()), context.getString(R.string.chaohu_setting_run_indoor));
        HMDisplaySetting.AppTypeRio appTypeRio5 = HMDisplaySetting.AppTypeRio.NOTIFICATION;
        map.put(Integer.valueOf(appTypeRio5.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeRio appTypeRio6 = HMDisplaySetting.AppTypeRio.TIMER;
        map.put(Integer.valueOf(appTypeRio6.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeRio appTypeRio7 = HMDisplaySetting.AppTypeRio.SETTINGS;
        map.put(Integer.valueOf(appTypeRio7.getValue()), context.getString(R.string.mine_more));
        map2.put(Integer.valueOf(appTypeRio.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeRio2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeRio3.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeRio4.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeRio5.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeRio6.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeRio7.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        Integer numValueOf = Integer.valueOf(appTypeRio.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeRio2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeRio3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeRio4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeRio5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeRio6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeRio7.getValue()), Integer.valueOf(i));
    }

    public static final void createTempoAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeTempo appTypeTempo = HMDisplaySetting.AppTypeTempo.DIAL;
        map.put(Integer.valueOf(appTypeTempo.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeTempo appTypeTempo2 = HMDisplaySetting.AppTypeTempo.STATUS;
        map.put(Integer.valueOf(appTypeTempo2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeTempo appTypeTempo3 = HMDisplaySetting.AppTypeTempo.NOTIFICATION;
        map.put(Integer.valueOf(appTypeTempo3.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeTempo appTypeTempo4 = HMDisplaySetting.AppTypeTempo.SPORT;
        map.put(Integer.valueOf(appTypeTempo4.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeTempo appTypeTempo5 = HMDisplaySetting.AppTypeTempo.WEATHER;
        map.put(Integer.valueOf(appTypeTempo5.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeTempo appTypeTempo6 = HMDisplaySetting.AppTypeTempo.ALARM;
        map.put(Integer.valueOf(appTypeTempo6.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppTypeTempo appTypeTempo7 = HMDisplaySetting.AppTypeTempo.TIMER;
        map.put(Integer.valueOf(appTypeTempo7.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeTempo appTypeTempo8 = HMDisplaySetting.AppTypeTempo.SETTING;
        map.put(Integer.valueOf(appTypeTempo8.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppTypeTempo appTypeTempo9 = HMDisplaySetting.AppTypeTempo.ALIPAY;
        map.put(Integer.valueOf(appTypeTempo9.getValue()), context.getString(R.string.bind_alipay));
        HMDisplaySetting.AppTypeTempo appTypeTempo10 = HMDisplaySetting.AppTypeTempo.MUSIC;
        map.put(Integer.valueOf(appTypeTempo10.getValue()), context.getString(R.string.setting_app_music));
        map2.put(Integer.valueOf(appTypeTempo.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeTempo2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeTempo3.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeTempo4.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeTempo5.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeTempo6.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appTypeTempo7.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeTempo8.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appTypeTempo9.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        map2.put(Integer.valueOf(appTypeTempo10.getValue()), Integer.valueOf(R.drawable.icon_music));
        Integer numValueOf = Integer.valueOf(appTypeTempo.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo9.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeTempo10.getValue()), Integer.valueOf(i));
    }

    public static final void createTokyoAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(52, context.getString(R.string.setting_app_step_count));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(25, context.getString(R.string.pai_name));
        map.put(53, context.getString(R.string.setting_app_distance));
        map.put(54, context.getString(R.string.setting_app_cost));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(8, context.getString(R.string.setting_app_dnd));
        map.put(12, context.getString(R.string.setting_app_seconds));
        map.put(58, context.getString(R.string.app_sort_power));
        map.put(26, context.getString(R.string.world_clock));
        map2.put(52, Integer.valueOf(R.drawable.icon_app_setting_step_count));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(53, Integer.valueOf(R.drawable.icon_app_setting_distance));
        map2.put(54, Integer.valueOf(R.drawable.icon_app_setting_cost));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(8, Integer.valueOf(R.drawable.icon_do_not_disturb));
        map2.put(12, Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(58, Integer.valueOf(R.drawable.icon_app_sort_power));
        map2.put(26, Integer.valueOf(R.drawable.app_sort_application_world_clock));
        int i = R.color.common_light_color;
        map3.put(52, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(53, Integer.valueOf(i));
        map3.put(54, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(9, Integer.valueOf(i));
        map3.put(8, Integer.valueOf(i));
        map3.put(12, Integer.valueOf(i));
        map3.put(58, Integer.valueOf(i));
        map3.put(26, Integer.valueOf(i));
    }

    public static final void createTonlesapAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeDTH appTypeDTH = HMDisplaySetting.AppTypeDTH.DIAL;
        map.put(Integer.valueOf(appTypeDTH.getValue()), context.getString(R.string.setting_app_dialplate));
        HMDisplaySetting.AppTypeDTH appTypeDTH2 = HMDisplaySetting.AppTypeDTH.STATUS;
        map.put(Integer.valueOf(appTypeDTH2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeDTH appTypeDTH3 = HMDisplaySetting.AppTypeDTH.SPORT;
        map.put(Integer.valueOf(appTypeDTH3.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeDTH appTypeDTH4 = HMDisplaySetting.AppTypeDTH.WEATHER;
        map.put(Integer.valueOf(appTypeDTH4.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeDTH appTypeDTH5 = HMDisplaySetting.AppTypeDTH.ALARM;
        map.put(Integer.valueOf(appTypeDTH5.getValue()), context.getString(R.string.setting_app_alarm));
        HMDisplaySetting.AppTypeDTH appTypeDTH6 = HMDisplaySetting.AppTypeDTH.TIMER;
        map.put(Integer.valueOf(appTypeDTH6.getValue()), context.getString(R.string.setting_app_timer));
        HMDisplaySetting.AppTypeDTH appTypeDTH7 = HMDisplaySetting.AppTypeDTH.COMPASS;
        map.put(Integer.valueOf(appTypeDTH7.getValue()), context.getString(R.string.setting_app_compass));
        HMDisplaySetting.AppTypeDTH appTypeDTH8 = HMDisplaySetting.AppTypeDTH.SETTING;
        map.put(Integer.valueOf(appTypeDTH8.getValue()), context.getString(R.string.setting_app_moreset));
        HMDisplaySetting.AppTypeDTH appTypeDTH9 = HMDisplaySetting.AppTypeDTH.ALIPAY;
        map.put(Integer.valueOf(appTypeDTH9.getValue()), context.getString(R.string.bind_alipay));
        HMDisplaySetting.AppTypeDTH appTypeDTH10 = HMDisplaySetting.AppTypeDTH.MUSIC;
        map.put(Integer.valueOf(appTypeDTH10.getValue()), context.getString(R.string.app_sort_music));
        HMDisplaySetting.AppTypeDTH appTypeDTH11 = HMDisplaySetting.AppTypeDTH.NFC;
        map.put(Integer.valueOf(appTypeDTH11.getValue()), context.getString(R.string.app_sort_card_bag));
        map2.put(Integer.valueOf(appTypeDTH.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeDTH2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeDTH3.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeDTH4.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeDTH5.getValue()), Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(Integer.valueOf(appTypeDTH6.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(Integer.valueOf(appTypeDTH7.getValue()), Integer.valueOf(R.drawable.chaohu_app_compass));
        map2.put(Integer.valueOf(appTypeDTH8.getValue()), Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(Integer.valueOf(appTypeDTH9.getValue()), Integer.valueOf(R.drawable.icon_alipay));
        map2.put(Integer.valueOf(appTypeDTH10.getValue()), Integer.valueOf(R.drawable.setting_app_music));
        map2.put(Integer.valueOf(appTypeDTH11.getValue()), Integer.valueOf(R.drawable.app_sort_bus_card));
        Integer numValueOf = Integer.valueOf(appTypeDTH.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH8.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH9.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH10.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeDTH11.getValue()), Integer.valueOf(i));
    }

    public static final void createVeniceAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(33, context.getString(R.string.app_sort_activity_goal));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(36, context.getString(R.string.app_sort_spo2_for_venice));
        map.put(28, context.getString(R.string.app_sort_pressure_for_venice));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(21, context.getString(R.string.schedule));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(3, Integer.valueOf(R.drawable.app_sort_sport_new));
        map2.put(33, Integer.valueOf(R.drawable.app_sort_activity_goal_new));
        map2.put(2, Integer.valueOf(R.drawable.app_sort_hr_new));
        map2.put(36, Integer.valueOf(R.drawable.app_sort_spo2_new));
        map2.put(28, Integer.valueOf(R.drawable.app_sort_pressure_new));
        map2.put(4, Integer.valueOf(R.drawable.app_sort_weather_new));
        map2.put(21, Integer.valueOf(R.drawable.app_sort_schedule_new));
        map2.put(16, Integer.valueOf(R.drawable.app_sort_nfc_new));
        map2.put(9, Integer.valueOf(R.drawable.app_sort_alarm_new));
        map2.put(19, Integer.valueOf(R.drawable.app_sort_settings_new));
        map2.put(7, Integer.valueOf(R.drawable.app_sort_utils_new));
    }

    public static final void createVeniceWAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(33, context.getString(R.string.app_sort_activity_goal));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(36, context.getString(R.string.app_sort_spo2_for_venice));
        map.put(28, context.getString(R.string.app_sort_pressure_for_venice));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(21, context.getString(R.string.schedule));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(3, Integer.valueOf(R.drawable.app_sort_sport_new));
        map2.put(33, Integer.valueOf(R.drawable.app_sort_activity_goal_new));
        map2.put(2, Integer.valueOf(R.drawable.app_sort_hr_new));
        map2.put(36, Integer.valueOf(R.drawable.app_sort_spo2_new));
        map2.put(28, Integer.valueOf(R.drawable.app_sort_pressure_new));
        map2.put(4, Integer.valueOf(R.drawable.app_sort_weather_new));
        map2.put(21, Integer.valueOf(R.drawable.app_sort_schedule_new));
        map2.put(9, Integer.valueOf(R.drawable.app_sort_alarm_new));
        map2.put(19, Integer.valueOf(R.drawable.app_sort_settings_new));
        map2.put(7, Integer.valueOf(R.drawable.app_sort_utils_new));
    }

    public static final void createVultureAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(25, context.getString(R.string.pai_name));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(20, context.getString(R.string.setting_app_sport_record));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(11, context.getString(R.string.setting_app_music));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(12, context.getString(R.string.setting_app_seconds));
        map.put(13, context.getString(R.string.setting_app_countdown));
        map.put(14, context.getString(R.string.app_sort_find_phone));
        map.put(22, context.getString(R.string.setting_app_compass));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map.put(17, context.getString(R.string.bind_alipay));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(20, Integer.valueOf(R.drawable.pyh_setting_sport_record));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(11, Integer.valueOf(R.drawable.setting_app_music));
        map2.put(9, Integer.valueOf(R.drawable.chaohu_app_alarm));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(12, Integer.valueOf(R.drawable.chaohu_app_timer));
        map2.put(13, Integer.valueOf(R.drawable.icon_countdown));
        map2.put(14, Integer.valueOf(R.drawable.icon_find_phone));
        map2.put(22, Integer.valueOf(R.drawable.chaohu_app_compass));
        map2.put(19, Integer.valueOf(R.drawable.chaohu_app_setup));
        map2.put(17, Integer.valueOf(R.drawable.icon_alipay));
        int i = R.color.common_light_color;
        map3.put(25, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(20, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(11, Integer.valueOf(i));
        map3.put(9, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(12, Integer.valueOf(i));
        map3.put(13, Integer.valueOf(i));
        map3.put(14, Integer.valueOf(i));
        map3.put(22, Integer.valueOf(i));
        map3.put(19, Integer.valueOf(i));
        map3.put(17, Integer.valueOf(i));
    }

    public static final void createWuhanAppSort(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        HMDisplaySetting.AppTypeWuhan appTypeWuhan = HMDisplaySetting.AppTypeWuhan.DIAL;
        map.put(Integer.valueOf(appTypeWuhan.getValue()), context.getString(R.string.setting_app_band_dialplate));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan2 = HMDisplaySetting.AppTypeWuhan.STATUS;
        map.put(Integer.valueOf(appTypeWuhan2.getValue()), context.getString(R.string.setting_app_status));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan3 = HMDisplaySetting.AppTypeWuhan.HR;
        map.put(Integer.valueOf(appTypeWuhan3.getValue()), context.getString(R.string.setting_app_hr));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan4 = HMDisplaySetting.AppTypeWuhan.WEATHER;
        map.put(Integer.valueOf(appTypeWuhan4.getValue()), context.getString(R.string.setting_app_weather));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan5 = HMDisplaySetting.AppTypeWuhan.SPORT;
        map.put(Integer.valueOf(appTypeWuhan5.getValue()), context.getString(R.string.setting_app_activities));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan6 = HMDisplaySetting.AppTypeWuhan.NOTIFICATION;
        map.put(Integer.valueOf(appTypeWuhan6.getValue()), context.getString(R.string.setting_app_notification));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan7 = HMDisplaySetting.AppTypeWuhan.SETTING;
        map.put(Integer.valueOf(appTypeWuhan7.getValue()), context.getString(R.string.mine_more));
        HMDisplaySetting.AppTypeWuhan appTypeWuhan8 = HMDisplaySetting.AppTypeWuhan.TIMER;
        map.put(Integer.valueOf(appTypeWuhan8.getValue()), context.getString(R.string.setting_app_timer));
        map2.put(Integer.valueOf(appTypeWuhan.getValue()), Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(Integer.valueOf(appTypeWuhan2.getValue()), Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(Integer.valueOf(appTypeWuhan3.getValue()), Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(Integer.valueOf(appTypeWuhan4.getValue()), Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(Integer.valueOf(appTypeWuhan5.getValue()), Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(Integer.valueOf(appTypeWuhan6.getValue()), Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(Integer.valueOf(appTypeWuhan7.getValue()), Integer.valueOf(R.drawable.wuhan_app_setup));
        map2.put(Integer.valueOf(appTypeWuhan8.getValue()), Integer.valueOf(R.drawable.chaohu_app_timer));
        Integer numValueOf = Integer.valueOf(appTypeWuhan.getValue());
        int i = R.color.common_light_color;
        map3.put(numValueOf, Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan2.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan3.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan4.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan5.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan6.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan7.getValue()), Integer.valueOf(i));
        map3.put(Integer.valueOf(appTypeWuhan8.getValue()), Integer.valueOf(i));
    }

    public static final void createYorkSport(@NotNull Context context, @NotNull HashMap<Integer, String> map, @NotNull HashMap<Integer, Integer> map2, @NotNull HashMap<Integer, Integer> map3) {
        map.put(18, context.getString(R.string.setting_app_band_dialplate));
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(36, context.getString(R.string.setting_app_spo2));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(28, context.getString(R.string.setting_app_pressure));
        map.put(51, context.getString(R.string.setting_app_breath_train));
        map.put(29, context.getString(R.string.setting_app_women_health));
        map.put(21, context.getString(R.string.event_remind_title));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map.put(7, context.getString(R.string.mine_more));
        map2.put(18, Integer.valueOf(R.drawable.chaohu_app_dialplate));
        map2.put(1, Integer.valueOf(R.drawable.chaohu_app_status));
        map2.put(25, Integer.valueOf(R.drawable.icon_pai));
        map2.put(2, Integer.valueOf(R.drawable.chaohu_app_hr));
        map2.put(36, Integer.valueOf(R.drawable.app_sort_spo2_new));
        map2.put(6, Integer.valueOf(R.drawable.tempo_app_notification));
        map2.put(28, Integer.valueOf(R.drawable.icon_pressure));
        map2.put(51, Integer.valueOf(R.drawable.icon_breathe));
        map2.put(29, Integer.valueOf(R.drawable.icon_women_health));
        map2.put(21, Integer.valueOf(R.drawable.pyh_setting_event_remind));
        map2.put(4, Integer.valueOf(R.drawable.chaohu_app_weather));
        map2.put(3, Integer.valueOf(R.drawable.chaohu_app_sport));
        map2.put(16, Integer.valueOf(R.drawable.app_sort_bus_card));
        map2.put(7, Integer.valueOf(R.drawable.wuhan_app_setup));
        int i = R.color.common_light_color;
        map3.put(18, Integer.valueOf(i));
        map3.put(1, Integer.valueOf(i));
        map3.put(25, Integer.valueOf(i));
        map3.put(2, Integer.valueOf(i));
        map3.put(36, Integer.valueOf(i));
        map3.put(6, Integer.valueOf(i));
        map3.put(28, Integer.valueOf(i));
        map3.put(51, Integer.valueOf(i));
        map3.put(29, Integer.valueOf(i));
        map3.put(21, Integer.valueOf(i));
        map3.put(4, Integer.valueOf(i));
        map3.put(3, Integer.valueOf(i));
        map3.put(16, Integer.valueOf(i));
        map3.put(7, Integer.valueOf(i));
    }
}
