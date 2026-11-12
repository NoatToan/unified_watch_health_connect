package com.xiaomi.hm.health.device.deviceconfig;

import androidx.annotation.IntegerRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u00020\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u001b\u001a\u00020\u00108\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R&\u0010\"\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001d\u0018\u00010\u001c8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010'\u001a\u0004\u0018\u00010\u00108\u0016@\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0014¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "Ljava/util/BitSet;", "b", "Ljava/util/BitSet;", "getConfigBitSet", "()Ljava/util/BitSet;", "configBitSet", "", "c", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", GoogleApiAvailabilityLight.a, "getDevicePageBg", "devicePageBg", "e", "getDeviceIcon", "deviceIcon", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "f", "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "g", "Ljava/lang/Integer;", "getBindingHintTitle", "()Ljava/lang/Integer;", "bindingHintTitle", "getDeviceShortDesc", "deviceShortDesc", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class HMBaseDeviceConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BitSet configBitSet = new BitSet(Feature.values().length);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int deviceDesc = R.string.unknown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int devicePageBg = R.drawable.img_head_bg_default;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int deviceIcon = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseDevice> deviceClass;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @IntegerRes
    @Nullable
    private final Integer bindingHintTitle;

    @Nullable
    public Integer getBindingHintTitle() {
        return this.bindingHintTitle;
    }

    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @NotNull
    public final BitSet getConfigBitSet() {
        return this.configBitSet;
    }

    @Nullable
    public Class<? extends HMBaseDevice> getDeviceClass() {
        return this.deviceClass;
    }

    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    public int getDeviceIcon() {
        return this.deviceIcon;
    }

    public int getDevicePageBg() {
        return this.devicePageBg;
    }

    public int getDeviceShortDesc() {
        return getDeviceDesc();
    }
}
