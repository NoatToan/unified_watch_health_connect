package com.huami.watchfacesstore.device;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.device.config.Bari;
import com.huami.watchfacesstore.device.config.Circle;
import com.huami.watchfacesstore.device.config.Crater;
import com.huami.watchfacesstore.device.config.IDeviceConfig;
import com.huami.watchfacesstore.device.config.Provence;
import com.huami.watchfacesstore.device.config.York;
import com.huami.watchfacesstore.device.process.DialFileType;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.repo.WatchFaceSettingRepo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 42\u00020\u0001:\u000245B\u000f\u0012\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b2\u00103J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\fJ\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010\u0018\u001a\u00020\fJ\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dJ\u0006\u0010#\u001a\u00020\u001dJ\u0006\u0010$\u001a\u00020\u001dJ\u0006\u0010%\u001a\u00020\u001dJ\u0006\u0010&\u001a\u00020\fR\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b(\u00100¨\u00066"}, d2 = {"Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;", "deviceSize", "", "setImageInCardParamsByDevice", "setShadowImageParamsByDevice", "setMiddleImageParamsByDevice", "setBigImageParamsByDevice", "Lkotlin/Pair;", "", "imageSize", "setViewLayoutParams", "getDeviceSmallDialSize", "getDeviceDialMiddleSize", "getDeviceDialRealSize", "getDeviceDialRealRadius", "getDialRadius", "getHeadDialRadius", "getReplaceDialogItemWidth", "getMyWatchItemDivider", "getDialSize", "getDialRadiusForDevicePage", "getCropDialSize", "getCropDialRadius", "Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "getCurrentDeviceConfig", "", "isSupportDialDelete", "isSupportDialStyle", "isSupportDialColor", "isSupportDialReplace", "isSupportRadius", "isZeepOs", "isSupportPay", "isDirectReplaceDial", "getImageFmt", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "a", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "getDeviceInfo", "()Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "deviceInfo", "Lcom/huami/watchfacesstore/repo/WatchFaceSettingRepo;", "b", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/repo/WatchFaceSettingRepo;", "settingRepo", "<init>", "(Lcom/huami/watchfacesstore/device/channel/DeviceInfo;)V", "Companion", "DeviceSize", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceConfigManager {

    @NotNull
    public static final String TAG = "DeviceSizeManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huami/watchfacesstore/device/DeviceConfigManager$DeviceSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_ONE", "SIZE_TWO", "SIZE_THREE", "SIZE_FOUR", "SIZE_FIVE", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum DeviceSize {
        SIZE_ONE,
        SIZE_TWO,
        SIZE_THREE,
        SIZE_FOUR,
        SIZE_FIVE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceSize.values().length];
            iArr[DeviceSize.SIZE_ONE.ordinal()] = 1;
            iArr[DeviceSize.SIZE_TWO.ordinal()] = 2;
            iArr[DeviceSize.SIZE_THREE.ordinal()] = 3;
            iArr[DeviceSize.SIZE_FOUR.ordinal()] = 4;
            iArr[DeviceSize.SIZE_FIVE.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "此设备是否支持展示和删除设备上表盘-----" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceConfigManager(@NotNull DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.settingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchFaceSettingRepo>() { // from class: com.huami.watchfacesstore.device.DeviceConfigManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.repo.WatchFaceSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WatchFaceSettingRepo invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WatchFaceSettingRepo.class), qualifier, objArr);
            }
        });
    }

    private final WatchFaceSettingRepo a() {
        return (WatchFaceSettingRepo) this.settingRepo.getValue();
    }

    public final int getCropDialRadius() {
        return ExtensionsKt.getDp(this.deviceInfo.getDeviceConfig().getRadiusOne() * 2);
    }

    @NotNull
    public final Pair<Integer, Integer> getCropDialSize() {
        Pair<Integer, Integer> middleDialSize = this.deviceInfo.getDeviceConfig().getMiddleDialSize();
        return TuplesKt.to(Integer.valueOf(ExtensionsKt.getDp(middleDialSize.getFirst().intValue() * 2)), Integer.valueOf(ExtensionsKt.getDp(middleDialSize.getSecond().intValue() * 2)));
    }

    @NotNull
    public final IDeviceConfig getCurrentDeviceConfig() {
        return this.deviceInfo.getDeviceConfig();
    }

    @NotNull
    public final Pair<Integer, Integer> getDeviceDialMiddleSize() {
        return this.deviceInfo.getDeviceConfig().getMiddleDialSize();
    }

    public final int getDeviceDialRealRadius() {
        return this.deviceInfo.getDeviceConfig().getRealDialRadius();
    }

    @NotNull
    public final Pair<Integer, Integer> getDeviceDialRealSize() {
        return this.deviceInfo.getDeviceConfig().getRealDialSize();
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final Pair<Integer, Integer> getDeviceSmallDialSize() {
        return this.deviceInfo.getDeviceConfig().getSmallDialSize();
    }

    public final int getDialRadius() {
        return this.deviceInfo.getDeviceConfig().getDialRadiusInCard();
    }

    public final int getDialRadiusForDevicePage() {
        return this.deviceInfo.getDeviceConfig() instanceof Circle ? this.deviceInfo.getDeviceConfig().getRadiusOne() : c.roundToInt(((double) this.deviceInfo.getDeviceConfig().getRadiusOne()) / 1.585d);
    }

    @NotNull
    public final Pair<Integer, Integer> getDialSize() {
        Pair<Integer, Integer> middleDialSize = this.deviceInfo.getDeviceConfig().getMiddleDialSize();
        return TuplesKt.to(Integer.valueOf(c.roundToInt(middleDialSize.getFirst().doubleValue() / 1.585d)), Integer.valueOf(c.roundToInt(middleDialSize.getSecond().doubleValue() / 1.585d)));
    }

    public final int getHeadDialRadius() {
        return c.roundToInt(((double) this.deviceInfo.getDeviceConfig().getRadiusOne()) / 4.6d);
    }

    public final int getImageFmt() {
        return Intrinsics.areEqual(this.deviceInfo.getDeviceConfig().getClass(), Provence.class) ? 4 : 3;
    }

    public final int getMyWatchItemDivider() {
        return ExtensionsKt.getDp(((this.deviceInfo.getDeviceConfig() instanceof York) || (this.deviceInfo.getDeviceConfig() instanceof Bari)) ? 20 : 7);
    }

    public final int getReplaceDialogItemWidth() {
        return this.deviceInfo.getDeviceConfig().getShadowInCardSizeFive().getFirst().intValue();
    }

    public final boolean isDirectReplaceDial() {
        return this.deviceInfo.getDeviceConfig() instanceof Crater;
    }

    public final boolean isSupportDialColor() {
        return this.deviceInfo.getDeviceConfig().getIsSupportDialColor();
    }

    public final boolean isSupportDialDelete() {
        boolean zIsSupportDialDelete = this.deviceInfo.getDeviceConfig().isSupportDialDelete();
        HMLog.info(TAG, new a(zIsSupportDialDelete));
        return zIsSupportDialDelete;
    }

    public final boolean isSupportDialReplace() {
        return this.deviceInfo.getDeviceConfig().getIsSupportDialReplace();
    }

    public final boolean isSupportDialStyle() {
        return this.deviceInfo.getDeviceConfig().isSupportDialStyle();
    }

    public final boolean isSupportPay() {
        return a().isSupportPay();
    }

    public final boolean isSupportRadius() {
        return getDeviceDialRealRadius() > 0;
    }

    public final boolean isZeepOs() {
        return this.deviceInfo.getDeviceConfig().getDialFileType() == DialFileType.JS_DIAL;
    }

    public final void setBigImageParamsByDevice(@NotNull View view) {
        setViewLayoutParams(view, getCurrentDeviceConfig().getBigDialSize());
    }

    public final void setImageInCardParamsByDevice(@NotNull View view, @NotNull DeviceSize deviceSize) {
        Pair<Integer, Integer> dialInCardSizeOne;
        IDeviceConfig currentDeviceConfig = getCurrentDeviceConfig();
        int i = WhenMappings.$EnumSwitchMapping$0[deviceSize.ordinal()];
        if (i == 1) {
            dialInCardSizeOne = currentDeviceConfig.getDialInCardSizeOne();
        } else if (i == 2) {
            dialInCardSizeOne = currentDeviceConfig.getDialInCardSizeTwo();
        } else if (i == 3) {
            dialInCardSizeOne = currentDeviceConfig.getDialInCardSizeThree();
        } else if (i == 4) {
            dialInCardSizeOne = currentDeviceConfig.getDialInCardSizeFour();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            dialInCardSizeOne = currentDeviceConfig.getDialInCardSizeFive();
        }
        setViewLayoutParams(view, dialInCardSizeOne);
    }

    public final void setMiddleImageParamsByDevice(@NotNull View view) {
        setViewLayoutParams(view, getCurrentDeviceConfig().getMiddleDialSize());
    }

    public final void setShadowImageParamsByDevice(@NotNull View view, @NotNull DeviceSize deviceSize) {
        Pair<Integer, Integer> shadowInCardSizeOne;
        IDeviceConfig currentDeviceConfig = getCurrentDeviceConfig();
        int i = WhenMappings.$EnumSwitchMapping$0[deviceSize.ordinal()];
        if (i == 1) {
            shadowInCardSizeOne = currentDeviceConfig.getShadowInCardSizeOne();
        } else if (i == 2) {
            shadowInCardSizeOne = currentDeviceConfig.getShadowInCardSizeTwo();
        } else if (i == 3) {
            shadowInCardSizeOne = currentDeviceConfig.getShadowInCardSizeThree();
        } else if (i == 4) {
            shadowInCardSizeOne = currentDeviceConfig.getShadowInCardSizeFour();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            shadowInCardSizeOne = currentDeviceConfig.getShadowInCardSizeFive();
        }
        setViewLayoutParams(view, shadowInCardSizeOne);
    }

    public final void setViewLayoutParams(@NotNull View view, @NotNull Pair<Integer, Integer> imageSize) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ExtensionsKt.getDp(imageSize.getFirst().intValue());
        layoutParams.height = ExtensionsKt.getDp(imageSize.getSecond().intValue());
        Unit unit = Unit.INSTANCE;
        view.setLayoutParams(layoutParams);
    }
}
