package com.xiaomi.hm.health.bt.profile.nfc;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteDecoder;
import com.xiaomi.market.sdk.Constants;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/NFCVersion;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCFeature;", "featureValue", "", "hasFeature", "", "a", LogUtil.I, "getVersion", "()I", "version", "Ljava/util/BitSet;", "b", "Ljava/util/BitSet;", "getFeature", "()Ljava/util/BitSet;", Constants.JSON_FEATURE, "<init>", "(ILjava/util/BitSet;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NFCVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BitSet feature;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/nfc/NFCVersion$Companion;", "", "", "data", "Lcom/xiaomi/hm/health/bt/profile/nfc/NFCVersion;", "parse", "", "VERSION_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NFCVersion parse(@NotNull byte[] data) throws Exception {
            if (data.length >= 4) {
                return new NFCVersion(new ByteDecoder(data).readInt(4), BitSet.valueOf(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(data, new IntRange(4, data.length - 1)))));
            }
            throw new Exception("Version data size not right");
        }
    }

    public NFCVersion(int i, @NotNull BitSet bitSet) {
        this.version = i;
        this.feature = bitSet;
    }

    @NotNull
    public final BitSet getFeature() {
        return this.feature;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean hasFeature(@NotNull NFCFeature featureValue) {
        return this.feature.get(featureValue.getValue());
    }

    public final boolean hasFeature(int featureValue) {
        return this.feature.get(featureValue);
    }
}
