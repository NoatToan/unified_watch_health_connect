package com.huami.watchfacesstore.device.config;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.baseflow.permissionhandler.m;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.device.process.DialFileType;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b:\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b]\u0010^R(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R(\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007R(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007R(\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\"\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010%\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001c\u0010(\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010+\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u001c\u0010.\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R(\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u0005\u001a\u0004\b0\u0010\u0007R(\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010\u0005\u001a\u0004\b3\u0010\u0007R(\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u0005\u001a\u0004\b6\u0010\u0007R(\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u0005\u001a\u0004\b9\u0010\u0007R(\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\u0005\u001a\u0004\b<\u0010\u0007R\u001c\u0010C\u001a\u00020>8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR(\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010\u0005\u001a\u0004\bE\u0010\u0007R*\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\u0005\u001a\u0004\bH\u0010\u0007R\u001c\u0010L\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010!R\u001c\u0010O\u001a\u00020\u00038\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\bM\u0010\u001f\u001a\u0004\bN\u0010!R\u001c\u0010U\u001a\u00020P8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010Y\u001a\u00020V8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010\\\u001a\u00020V8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010Z¨\u0006_"}, d2 = {"Lcom/huami/watchfacesstore/device/config/Ness;", "Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "Lkotlin/Pair;", "", "a", "Lkotlin/Pair;", "getSmallDialSize", "()Lkotlin/Pair;", "smallDialSize", "b", "getMiddleDialSize", "middleDialSize", "c", "getBigDialSize", "bigDialSize", GoogleApiAvailabilityLight.a, "getDialInCardSizeOne", "dialInCardSizeOne", "e", "getDialInCardSizeTwo", "dialInCardSizeTwo", "f", "getDialInCardSizeThree", "dialInCardSizeThree", "g", "getDialInCardSizeFour", "dialInCardSizeFour", "h", "getDialInCardSizeFive", "dialInCardSizeFive", "i", LogUtil.I, "getDefaultDeviceImage", "()I", "defaultDeviceImage", z.j, "getDefaultLargeDeviceImage", "defaultLargeDeviceImage", hl.k, "getRadiusOne", "radiusOne", "l", "getRadiusTwo", "radiusTwo", "m", "getPlaceHolderImage", "placeHolderImage", GoogleApiAvailabilityLight.b, "getShadowInCardSizeOne", "shadowInCardSizeOne", "o", "getShadowInCardSizeTwo", "shadowInCardSizeTwo", b.r, "getShadowInCardSizeThree", "shadowInCardSizeThree", DTransferConstants.SEARCH_KEY, "getShadowInCardSizeFour", "shadowInCardSizeFour", "r", "getShadowInCardSizeFive", "shadowInCardSizeFive", "", SOAP.XMLNS, "[I", "getRankPlaceHolderImage", "()[I", "rankPlaceHolderImage", "t", "getRealDialSize", "realDialSize", "u", "getRealDialPreviewSize", "realDialPreviewSize", "v", "getRealDialRadius", "realDialRadius", "w", "getDialRadiusInCard", "dialRadiusInCard", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "x", "Lcom/huami/watchfacesstore/device/process/DialFileType;", "getDialFileType", "()Lcom/huami/watchfacesstore/device/process/DialFileType;", "dialFileType", "", "y", "Z", "isSupportDialColor", "()Z", "z", "isSupportDialReplace", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class Ness implements IDeviceConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> smallDialSize = TuplesKt.to(27, 28);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> middleDialSize = TuplesKt.to(124, 143);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> bigDialSize = TuplesKt.to(146, 169);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeOne = TuplesKt.to(86, 100);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeTwo = TuplesKt.to(112, 130);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeThree = TuplesKt.to(102, 118);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeFour = TuplesKt.to(78, 90);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> dialInCardSizeFive = TuplesKt.to(78, 90);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int defaultDeviceImage = R.drawable.wf_img_ness_default;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int defaultLargeDeviceImage = R.drawable.wf_img_ness_large_default;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int radiusOne = 16;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int radiusTwo = 26;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int placeHolderImage = R.drawable.wf_watch_face_ness_shadow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> shadowInCardSizeOne = TuplesKt.to(92, 110);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> shadowInCardSizeTwo = TuplesKt.to(122, 144);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> shadowInCardSizeThree = TuplesKt.to(108, 124);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> shadowInCardSizeFour = TuplesKt.to(84, 100);

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> shadowInCardSizeFive = TuplesKt.to(84, 100);

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final int[] rankPlaceHolderImage = {R.drawable.wf_rank_first_ness_shadow, R.drawable.wf_rank_third_ness_shadow, R.drawable.wf_rank_second_ness_shadow};

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> realDialSize = TuplesKt.to(306, 354);

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    private final Pair<Integer, Integer> realDialPreviewSize = TuplesKt.to(Integer.valueOf(m.d), 242);

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int realDialRadius = 64;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int dialRadiusInCard = 15;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final DialFileType dialFileType = DialFileType.UIH_ORIGIN_DIAL;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean isSupportDialColor = true;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean isSupportDialReplace = true;

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getBigDialSize() {
        return this.bigDialSize;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getDefaultDeviceImage() {
        return this.defaultDeviceImage;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getDefaultLargeDeviceImage() {
        return this.defaultLargeDeviceImage;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public DialFileType getDialFileType() {
        return this.dialFileType;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeFive() {
        return this.dialInCardSizeFive;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeFour() {
        return this.dialInCardSizeFour;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeOne() {
        return this.dialInCardSizeOne;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeThree() {
        return this.dialInCardSizeThree;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getDialInCardSizeTwo() {
        return this.dialInCardSizeTwo;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getDialRadiusInCard() {
        return this.dialRadiusInCard;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getMiddleDialSize() {
        return this.middleDialSize;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getPlaceHolderImage() {
        return this.placeHolderImage;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getRadiusOne() {
        return this.radiusOne;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getRadiusTwo() {
        return this.radiusTwo;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public int[] getRankPlaceHolderImage() {
        return this.rankPlaceHolderImage;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @Nullable
    public Pair<Integer, Integer> getRealDialPreviewSize() {
        return this.realDialPreviewSize;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public int getRealDialRadius() {
        return this.realDialRadius;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getRealDialSize() {
        return this.realDialSize;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getShadowInCardSizeFive() {
        return this.shadowInCardSizeFive;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getShadowInCardSizeFour() {
        return this.shadowInCardSizeFour;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getShadowInCardSizeOne() {
        return this.shadowInCardSizeOne;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getShadowInCardSizeThree() {
        return this.shadowInCardSizeThree;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getShadowInCardSizeTwo() {
        return this.shadowInCardSizeTwo;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    @NotNull
    public Pair<Integer, Integer> getSmallDialSize() {
        return this.smallDialSize;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    /* JADX INFO: renamed from: isSupportDialColor, reason: from getter */
    public boolean getIsSupportDialColor() {
        return this.isSupportDialColor;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public boolean isSupportDialDelete() {
        return IDeviceConfig.DefaultImpls.isSupportDialDelete(this);
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    /* JADX INFO: renamed from: isSupportDialReplace, reason: from getter */
    public boolean getIsSupportDialReplace() {
        return this.isSupportDialReplace;
    }

    @Override // com.huami.watchfacesstore.device.config.IDeviceConfig
    public boolean isSupportDialStyle() {
        return IDeviceConfig.DefaultImpls.isSupportDialStyle(this);
    }
}
