package com.xiaomi.hm.health.device.watch_skin;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.watchskinnew.ui.DialConfig;
import com.xiaomi.hm.health.device.watchskinnew.ui.ImageSize;
import com.xiaomi.hm.health.device.watchskinstore.config.DeviceDialsConfig;
import com.xiaomi.hm.health.device.watchskinstore.config.DialsConfigManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapProcessorFactory;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialBitmapProcessorFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<HMDeviceSource, ImageSize> a = kotlin.collections.r.mapOf(TuplesKt.to(HMDeviceSource.MILI_KONGMING, new ImageSize(90, com.baseflow.permissionhandler.m.d)), TuplesKt.to(HMDeviceSource.MILI_KONGMING_L, new ImageSize(90, com.baseflow.permissionhandler.m.d)), TuplesKt.to(HMDeviceSource.MILI_KONGMING_LITE, new ImageSize(84, 168)), TuplesKt.to(HMDeviceSource.MILI_KONGMING_PRO, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_KONGMING_PRO_L, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_PANGU, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_PANGU_L, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66_AP, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66_I, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66_IN, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66_NFC, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66_NFC_I, new ImageSize(110, 352)), TuplesKt.to(HMDeviceSource.MILI_L66_WE, new ImageSize(110, 352)));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\"\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapProcessorFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "createBitmapProcessor", "createPreviewBackgroundProcessor", "Lcom/xiaomi/hm/health/device/watchskinstore/config/DeviceDialsConfig;", "dialsConfig", "Lcom/xiaomi/hm/health/device/watchskinnew/ui/ImageSize;", "imageSize", "createBmpTypeProcessor", "", "bgPath", "", "argb", "createEmbedProcessor", "processor", "changeColorProcessor", "", "previewBackgroundSize", "Ljava/util/Map;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IDialProcessor changeColorProcessor(@Nullable IDialProcessor processor, @NotNull HMDeviceSource deviceSource, @Nullable byte[] argb) {
            return ConfigHelperKt.hasFeature(deviceSource, Feature.CINCO_SERIES_S) ? new DialColorProcessor(processor, argb) : new DialColorKongmingProcessor(processor, argb);
        }

        @Nullable
        public final IDialProcessor createBitmapProcessor(@NotNull HMDeviceSource deviceSource) {
            DialConfig.Companion companion = DialConfig.INSTANCE;
            ImageSize imageSizeDialBgSize = companion.dialBgSize(deviceSource);
            Feature feature = Feature.CINCO_SERIES_S;
            if (ConfigHelperKt.hasFeature(deviceSource, feature)) {
                return new DialBitmap565Processor(new DialBitmapBmpProcessor(new DialDitherProcessor(new DialBitmapScaleProcessor(imageSizeDialBgSize.getWidth(), imageSizeDialBgSize.getHeight(), null, 4, null)), false, false, 0, 14, null));
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.COMPRESS_DIAL) || ConfigHelperKt.hasFeature(deviceSource, Feature.GT_SOURCE_S) || ConfigHelperKt.hasFeature(deviceSource, Feature.PYH_SERIES_S)) {
                return new DialBitmapDtaHeaderProcessor(new DialBitmapBmpProcessor(new DialBitmapCornerProcessor(new DialBitmapScaleProcessor(imageSizeDialBgSize.getWidth(), imageSizeDialBgSize.getHeight(), null, 4, null), companion.dialBgRadius(deviceSource)), true, false, 0, 8, null), 0, 2, null);
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.UIH_COMPRESS_DIAL)) {
                return new DialBitmapDtaHeaderProcessor(new DialBitmapBmpProcessor(new DialBitmapCornerProcessor(new DialBitmapScaleProcessor(imageSizeDialBgSize.getWidth(), imageSizeDialBgSize.getHeight(), null, 4, null), companion.dialBgRadius(deviceSource)), true, false, 1), 0, 2, null);
            }
            if (ConfigHelperKt.hasFeature(deviceSource, feature) || ConfigHelperKt.hasFeature(deviceSource, Feature.KONGMING_SERIES_S) || ConfigHelperKt.hasFeature(deviceSource, Feature.PANGU_SERIES_S)) {
                return createBmpTypeProcessor(DialsConfigManager.INSTANCE.getDialsConfig(deviceSource), imageSizeDialBgSize);
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.JS_DIAL)) {
                return new DialPngProcessor(new DialBitmapCornerProcessor(new DialBitmapScaleProcessor(imageSizeDialBgSize.getWidth(), imageSizeDialBgSize.getHeight(), null, 4, null), (int) DialsConfigManager.INSTANCE.getDialsConfig(deviceSource).round()));
            }
            return null;
        }

        @NotNull
        public final IDialProcessor createBmpTypeProcessor(@NotNull DeviceDialsConfig dialsConfig, @NotNull ImageSize imageSize) {
            DialBitmapScaleProcessor dialBitmapScaleProcessor = new DialBitmapScaleProcessor(imageSize.getWidth(), imageSize.getHeight(), dialsConfig.deviceCropRoundPx());
            return dialsConfig.deviceBmpType() == IDialProcessor.INSTANCE.getBG_TYPE_BMP_565() ? new DialBitmap565Processor(new DialBitmapBmpProcessor(new DialDitherProcessor(dialBitmapScaleProcessor), false, false, 0, 10, null)) : new DialBitmapBmpProcessor(dialBitmapScaleProcessor, false, false, 0, 10, null);
        }

        @Nullable
        public final IDialProcessor createEmbedProcessor(@NotNull HMDeviceSource deviceSource, @NotNull String bgPath, @Nullable byte[] argb) {
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.CINCO_SERIES_S)) {
                return new DialEmbedBgProcessor(changeColorProcessor(new DialPassProcessor(), deviceSource, argb), bgPath, 0L, 0, 0, 0L, 60, null);
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.COMPRESS_DIAL)) {
                return new DialCompressComProcessor(new DialEmbedBgProcessor(new DialDecompressProcessor(), bgPath, 0L, 0, 0, 0L, 60, null));
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.UIH_COMPRESS_DIAL)) {
                return new UihDialEmbedBgProcessor(new DialCompressComProcessor(new DialEmbedBgProcessor(new DialDecompressProcessor(), bgPath, 13L, 14, 3, 21L)));
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.KONGMING_SERIES_S) || ConfigHelperKt.hasFeature(deviceSource, Feature.PANGU_SERIES_S)) {
                return new UihDialEmbedBgProcessor(new DialEmbedKongmingBgProcessor(changeColorProcessor(new DialPassProcessor(), deviceSource, argb), bgPath, createPreviewBackgroundProcessor(deviceSource).process(bgPath), DialsConfigManager.INSTANCE.getDialsConfig(deviceSource).deviceBmpType()));
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.JS_DIAL)) {
                return new DialZeppOSProcessor(bgPath);
            }
            return null;
        }

        @Nullable
        public final IDialProcessor createPreviewBackgroundProcessor(@NotNull HMDeviceSource deviceSource) {
            ImageSize imageSize = (ImageSize) DialBitmapProcessorFactory.a.get(deviceSource);
            if (imageSize == null) {
                throw new IllegalStateException("no such preview image size".toString());
            }
            if (ConfigHelperKt.hasFeature(deviceSource, Feature.KONGMING_SERIES_S) || ConfigHelperKt.hasFeature(deviceSource, Feature.PANGU_SERIES_S) || ConfigHelperKt.hasFeature(deviceSource, Feature.L66_SERIES_S)) {
                return createBmpTypeProcessor(DialsConfigManager.INSTANCE.getDialsConfig(deviceSource), imageSize);
            }
            return null;
        }
    }
}
