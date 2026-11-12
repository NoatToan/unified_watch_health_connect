package com.huami.training.api.pojo;

import com.huami.training.api.DisplayModeBo;
import com.huami.training.api.ks.DisplayModeBoSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/training/api/pojo/ExtensionClassify;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/huami/training/api/DisplayModeBo;", "component1", "displayMode", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/training/api/DisplayModeBo;", "getDisplayMode", "()Lcom/huami/training/api/DisplayModeBo;", "getDisplayMode$annotations", "()V", "<init>", "(Lcom/huami/training/api/DisplayModeBo;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/huami/training/api/DisplayModeBo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class ExtensionClassify {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final DisplayModeBo displayMode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/training/api/pojo/ExtensionClassify$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/training/api/pojo/ExtensionClassify;", "serializer", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ExtensionClassify> serializer() {
            return ExtensionClassify$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionClassify() {
        this((DisplayModeBo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ExtensionClassify(int i, @SerialName("name") @Serializable(with = DisplayModeBoSerializer.class) DisplayModeBo displayModeBo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, ExtensionClassify$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.displayMode = null;
        } else {
            this.displayMode = displayModeBo;
        }
    }

    public static /* synthetic */ ExtensionClassify copy$default(ExtensionClassify extensionClassify, DisplayModeBo displayModeBo, int i, Object obj) {
        if ((i & 1) != 0) {
            displayModeBo = extensionClassify.displayMode;
        }
        return extensionClassify.copy(displayModeBo);
    }

    @SerialName("name")
    @Serializable(with = DisplayModeBoSerializer.class)
    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull ExtensionClassify self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        boolean z = true;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.displayMode == null) {
            z = false;
        }
        if (z) {
            output.encodeNullableSerializableElement(serialDesc, 0, new DisplayModeBoSerializer(), self.displayMode);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DisplayModeBo getDisplayMode() {
        return this.displayMode;
    }

    @NotNull
    public final ExtensionClassify copy(@Nullable DisplayModeBo displayMode) {
        return new ExtensionClassify(displayMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExtensionClassify) && this.displayMode == ((ExtensionClassify) other).displayMode;
    }

    @Nullable
    public final DisplayModeBo getDisplayMode() {
        return this.displayMode;
    }

    public int hashCode() {
        DisplayModeBo displayModeBo = this.displayMode;
        if (displayModeBo == null) {
            return 0;
        }
        return displayModeBo.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExtensionClassify(displayMode=" + this.displayMode + ')';
    }

    public ExtensionClassify(@Nullable DisplayModeBo displayModeBo) {
        this.displayMode = displayModeBo;
    }

    public /* synthetic */ ExtensionClassify(DisplayModeBo displayModeBo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : displayModeBo);
    }
}
