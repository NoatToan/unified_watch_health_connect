package com.xiaomi.hm.health.device.watchskinnew.ui;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.huami.devicex.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import it.sauronsoftware.ftp4j.FTPCodes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DialConfig;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/ui/DialConfig$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "deviceImgResId", "Lcom/xiaomi/hm/health/device/watchskinnew/ui/ImageSize;", "deviceImgSize", "dialImgSize", "dialItemSize", "dialItemImageSize", "", "dialIsRound", "dialBgSize", "dialBgRadius", "", "dialSupportFwVersion", "", "getDeviceGapPaddingRight", "Lkotlin/Pair;", "getCropSize", "getCropRadius", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMDeviceSource.values().length];
                iArr[HMDeviceSource.MILI_ATHENS.ordinal()] = 1;
                iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 2;
                iArr[HMDeviceSource.MILI_CINCO_L.ordinal()] = 3;
                iArr[HMDeviceSource.MILI_FALCON.ordinal()] = 4;
                iArr[HMDeviceSource.MILI_FALCON_L.ordinal()] = 5;
                iArr[HMDeviceSource.MILI_FALCON_W.ordinal()] = 6;
                iArr[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 7;
                iArr[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 8;
                iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 9;
                iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 10;
                iArr[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 11;
                iArr[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 12;
                iArr[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 13;
                iArr[HMDeviceSource.MILI_HAWK.ordinal()] = 14;
                iArr[HMDeviceSource.MILI_HAWK_L.ordinal()] = 15;
                iArr[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 16;
                iArr[HMDeviceSource.MILI_HAWK_W.ordinal()] = 17;
                iArr[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 18;
                iArr[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 19;
                iArr[HMDeviceSource.MILI_PYH.ordinal()] = 20;
                iArr[HMDeviceSource.MILI_PYH_W.ordinal()] = 21;
                iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 22;
                iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 23;
                iArr[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 24;
                iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 25;
                iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 26;
                iArr[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 27;
                iArr[HMDeviceSource.MILI_KONGMING_LITE.ordinal()] = 28;
                iArr[HMDeviceSource.MILI_KONGMING.ordinal()] = 29;
                iArr[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 30;
                iArr[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 31;
                iArr[HMDeviceSource.MILI_KONGMING_PRO_L.ordinal()] = 32;
                iArr[HMDeviceSource.MILI_PANGU.ordinal()] = 33;
                iArr[HMDeviceSource.MILI_PANGU_L.ordinal()] = 34;
                iArr[HMDeviceSource.MILI_L66.ordinal()] = 35;
                iArr[HMDeviceSource.MILI_L66_AP.ordinal()] = 36;
                iArr[HMDeviceSource.MILI_L66_I.ordinal()] = 37;
                iArr[HMDeviceSource.MILI_L66_IN.ordinal()] = 38;
                iArr[HMDeviceSource.MILI_L66_NFC.ordinal()] = 39;
                iArr[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 40;
                iArr[HMDeviceSource.MILI_L66_WE.ordinal()] = 41;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int deviceImgResId(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return R.drawable.img_cinco_bg;
                case 4:
                case 5:
                case 6:
                case 7:
                    return R.drawable.img_gtr_watch_dial_device;
                case 8:
                    return R.drawable.img_gtr_watch_dial_disney_device;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return R.drawable.img_gts_watch_dial_device;
                case 14:
                case 15:
                case 16:
                case 17:
                    return R.drawable.img_gtr_watch_dial_h;
                case 18:
                case 19:
                    return R.drawable.img_gtr_watch_dial_swk;
                case 20:
                case 21:
                    return R.drawable.img_pyh_watch_dial;
                case 22:
                    return R.drawable.onyx_img_gt2_onyx_dial;
                case 23:
                case 24:
                    return R.drawable.onyx_img_gt2_onyx_dial;
                case 25:
                case 26:
                case 27:
                    return R.drawable.onyx_img_gt2_onyx_dial;
                default:
                    return R.drawable.img_cinco_bg;
            }
        }

        @NotNull
        public final ImageSize deviceImgSize(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return new ImageSize(120, 206);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(240, 240);
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return new ImageSize(240, 241);
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return new ImageSize(240, 240);
                case 20:
                case 21:
                    return new ImageSize(240, 240);
                case 22:
                    return new ImageSize(240, 240);
                case 23:
                case 24:
                    return new ImageSize(240, 240);
                case 25:
                case 26:
                case 27:
                    return new ImageSize(240, 240);
                default:
                    return new ImageSize(120, 206);
            }
        }

        public final int dialBgRadius(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                default:
                    return 0;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return FTPCodes.ENTER_PASSIVE_MODE;
                case 9:
                    return 60;
                case 10:
                case 11:
                case 12:
                case 13:
                    return 54;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return Constant.WEIGHT_DEFAULT_IMPERIAL;
                case 20:
                case 21:
                    return 180;
                case 22:
                    return 208;
            }
        }

        @NotNull
        public final ImageSize dialBgSize(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return new ImageSize(120, 240);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(454, 454);
                case 9:
                    return new ImageSize(348, PsExtractor.l);
                case 10:
                case 11:
                case 12:
                case 13:
                    return new ImageSize(348, PsExtractor.l);
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return new ImageSize(390, 390);
                case 20:
                case 21:
                    return new ImageSize(360, 360);
                case 22:
                    return new ImageSize(416, 416);
                case 23:
                case 24:
                    return new ImageSize(454, 454);
                case 25:
                case 26:
                case 27:
                    return new ImageSize(454, 454);
                case 28:
                    return new ImageSize(120, 240);
                case 29:
                case 30:
                    return new ImageSize(126, 294);
                case 31:
                case 32:
                case 33:
                case 34:
                    return new ImageSize(152, 486);
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    return new ImageSize(192, 486);
                default:
                    return new ImageSize(120, 240);
            }
        }

        @NotNull
        public final ImageSize dialImgSize(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return new ImageSize(40, 80);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(120, 120);
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return new ImageSize(90, 115);
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return new ImageSize(120, 120);
                case 20:
                case 21:
                    return new ImageSize(120, 120);
                case 22:
                    return new ImageSize(120, 120);
                case 23:
                case 24:
                    return new ImageSize(120, 120);
                case 25:
                case 26:
                case 27:
                    return new ImageSize(120, 120);
                default:
                    return new ImageSize(120, 206);
            }
        }

        public final boolean dialIsRound(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                default:
                    return false;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return true;
            }
        }

        @NotNull
        public final ImageSize dialItemImageSize(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return new ImageSize(60, 120);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(90, 90);
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return new ImageSize(90, 115);
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return new ImageSize(90, 90);
                case 20:
                case 21:
                    return new ImageSize(90, 90);
                case 22:
                    return new ImageSize(90, 90);
                case 23:
                case 24:
                    return new ImageSize(90, 90);
                case 25:
                case 26:
                case 27:
                    return new ImageSize(90, 90);
                default:
                    return new ImageSize(60, 120);
            }
        }

        @NotNull
        public final ImageSize dialItemSize(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return new ImageSize(72, 132);
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(90, 90);
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return new ImageSize(98, 123);
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return new ImageSize(90, 90);
                case 20:
                case 21:
                    return new ImageSize(95, 95);
                case 22:
                    return new ImageSize(95, 95);
                case 23:
                case 24:
                    return new ImageSize(95, 95);
                case 25:
                case 26:
                case 27:
                    return new ImageSize(95, 95);
                default:
                    return new ImageSize(72, 132);
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        @NotNull
        public final String dialSupportFwVersion(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
            }
            return "0.0.0.0";
        }

        public final int getCropRadius(@NotNull HMDeviceSource deviceSource) {
            return ExtensionsKt.getDp(kotlin.math.c.roundToInt(((dialBgRadius(deviceSource) * 1.0f) / dialBgSize(deviceSource).getWidth()) * dialImgSize(deviceSource).getWidth() * 2));
        }

        @NotNull
        public final Pair<Integer, Integer> getCropSize(@NotNull HMDeviceSource deviceSource) {
            ImageSize imageSizeDialImgSize = dialImgSize(deviceSource);
            return TuplesKt.to(Integer.valueOf(ExtensionsKt.getDp(imageSizeDialImgSize.getWidth() * 2)), Integer.valueOf(ExtensionsKt.getDp(imageSizeDialImgSize.getHeight() * 2)));
        }

        public final float getDeviceGapPaddingRight(@NotNull HMDeviceSource deviceSource) {
            switch (WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
                case 10:
                case 11:
                case 12:
                case 13:
                    return 2.0f;
                default:
                    return 12.0f;
            }
        }
    }
}
