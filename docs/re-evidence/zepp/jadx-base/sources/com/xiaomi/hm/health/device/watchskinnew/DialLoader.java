package com.xiaomi.hm.health.device.watchskinnew;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.watchskinnew.api.WatchSkinAPIKt;
import com.xiaomi.hm.health.device.watchskinnew.bean.WatchSkinBean;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0018\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ%\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019R)\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/DialLoader;", "", "", "type", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "Lkotlin/collections/ArrayList;", "getDials", "", Configs.Params.RESET, "clear", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "diy", "", "loadData", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Z)[Lcom/xiaomi/hm/health/device/watchskinnew/bean/WatchSkinBean;", "a", LogUtil.I, DTransferConstants.PAGE, "b", "diyPages", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "dials", GoogleApiAvailabilityLight.a, "getDiyDials", "diyDials", "e", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int PAGE_DIAL_DETAIL = 2;
    public static final int PAGE_DIAL_LIST = 1;

    @Nullable
    private static DialLoader f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int page;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int diyPages;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<WatchSkinBean> dials;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<WatchSkinBean> diyDials;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int currentPage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinnew/DialLoader$Companion;", "", "Lcom/xiaomi/hm/health/device/watchskinnew/DialLoader;", "getInstance", "INSTANCE", "Lcom/xiaomi/hm/health/device/watchskinnew/DialLoader;", "", "PAGE_DIAL_DETAIL", LogUtil.I, "PAGE_DIAL_LIST", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DialLoader getInstance() {
            if (DialLoader.f == null) {
                DialLoader.f = new DialLoader(null);
            }
            return DialLoader.f;
        }
    }

    private DialLoader() {
        this.page = 1;
        this.diyPages = 1;
        this.dials = new ArrayList<>();
        this.diyDials = new ArrayList<>();
        this.currentPage = 1;
    }

    public /* synthetic */ DialLoader(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void clear() {
        f = null;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @NotNull
    public final ArrayList<WatchSkinBean> getDials() {
        return this.dials;
    }

    @NotNull
    public final ArrayList<WatchSkinBean> getDiyDials() {
        return this.diyDials;
    }

    @Nullable
    public final WatchSkinBean[] loadData(@NotNull HMDeviceSource deviceSource, boolean diy) {
        WatchSkinBean[] selectedWatchSkinsNew;
        if (ConfigHelperKt.hasFeature(deviceSource, Feature.SUPPORT_NEW_DEVICE_SETTING)) {
            selectedWatchSkinsNew = WatchSkinAPIKt.getSelectedWatchSkinsNew(deviceSource, this.page, diy);
            if (selectedWatchSkinsNew == null) {
                return null;
            }
        } else {
            selectedWatchSkinsNew = WatchSkinAPIKt.getSelectedWatchSkins(deviceSource, this.page, diy);
            if (selectedWatchSkinsNew == null) {
                return null;
            }
        }
        if (diy) {
            this.diyPages++;
            this.diyDials.addAll(ArraysKt___ArraysKt.toList(selectedWatchSkinsNew));
        } else {
            this.page++;
            this.dials.addAll(ArraysKt___ArraysKt.toList(selectedWatchSkinsNew));
        }
        return selectedWatchSkinsNew;
    }

    public final void reset() {
        this.page = 1;
        this.dials.clear();
        this.diyPages = 1;
        this.diyDials.clear();
    }

    public final void setCurrentPage(int i) {
        this.currentPage = i;
    }

    @NotNull
    public final ArrayList<WatchSkinBean> getDials(int type) {
        return type == 0 ? this.dials : this.diyDials;
    }
}
