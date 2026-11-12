package com.xiaomi.hm.health.device.assistant.smart.sync;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB+\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardsSyncBean;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "type", "isEnable", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getType", "()I", "b", "Z", "()Z", "<init>", "(IZ)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SmartCardsSyncBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardsSyncBean$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardsSyncBean;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SmartCardsSyncBean> serializer() {
            return SmartCardsSyncBean$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SmartCardsSyncBean(int i, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SmartCardsSyncBean$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.isEnable = z;
    }

    public static /* synthetic */ SmartCardsSyncBean copy$default(SmartCardsSyncBean smartCardsSyncBean, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = smartCardsSyncBean.type;
        }
        if ((i2 & 2) != 0) {
            z = smartCardsSyncBean.isEnable;
        }
        return smartCardsSyncBean.copy(i, z);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SmartCardsSyncBean self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.type);
        output.encodeBooleanElement(serialDesc, 1, self.isEnable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final SmartCardsSyncBean copy(int type, boolean isEnable) {
        return new SmartCardsSyncBean(type, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartCardsSyncBean)) {
            return false;
        }
        SmartCardsSyncBean smartCardsSyncBean = (SmartCardsSyncBean) other;
        return this.type == smartCardsSyncBean.type && this.isEnable == smartCardsSyncBean.isEnable;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i = this.type * 31;
        boolean z = this.isEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    @NotNull
    public String toString() {
        return "SmartCardsSyncBean(type=" + this.type + ", isEnable=" + this.isEnable + ")";
    }

    public SmartCardsSyncBean(int i, boolean z) {
        this.type = i;
        this.isEnable = z;
    }
}
