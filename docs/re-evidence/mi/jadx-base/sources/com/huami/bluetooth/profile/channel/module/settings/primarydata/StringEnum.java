package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B=\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u000b`\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u000b`\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u000b`\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\tHÆ\u0001J\t\u0010\u0017\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000ej\b\u0012\u0004\u0012\u00020\u000b`\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "index", "", "checkValid", "", "component1", "component2", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component3", "component4", "value", "maxLength", "enums", "containDesc", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "I", "getMaxLength", "()I", "Ljava/util/ArrayList;", "getEnums", "()Ljava/util/ArrayList;", "Z", "getContainDesc", "()Z", "<init>", "(Ljava/lang/String;ILjava/util/ArrayList;Z)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StringEnum implements IPrimaryData, Serializable {
    private static final long serialVersionUID = 1;
    private final boolean containDesc;

    @NotNull
    private final ArrayList<String> enums;
    private final int maxLength;

    @NotNull
    private String value;

    public StringEnum(@NotNull String value, int i, @NotNull ArrayList<String> enums, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(enums, "enums");
        this.value = value;
        this.maxLength = i;
        this.enums = enums;
        this.containDesc = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StringEnum copy$default(StringEnum stringEnum, String str, int i, ArrayList arrayList, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stringEnum.value;
        }
        if ((i2 & 2) != 0) {
            i = stringEnum.maxLength;
        }
        if ((i2 & 4) != 0) {
            arrayList = stringEnum.enums;
        }
        if ((i2 & 8) != 0) {
            z = stringEnum.getContainDesc();
        }
        return stringEnum.copy(str, i, arrayList, z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        if (getContainDesc()) {
            return this.enums.contains(this.value);
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final ArrayList<String> component3() {
        return this.enums;
    }

    public final boolean component4() {
        return getContainDesc();
    }

    @NotNull
    public final StringEnum copy(@NotNull String value, int maxLength, @NotNull ArrayList<String> enums, boolean containDesc) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(enums, "enums");
        return new StringEnum(value, maxLength, enums, containDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringEnum)) {
            return false;
        }
        StringEnum stringEnum = (StringEnum) other;
        return Intrinsics.areEqual(this.value, stringEnum.value) && this.maxLength == stringEnum.maxLength && Intrinsics.areEqual(this.enums, stringEnum.enums) && getContainDesc() == stringEnum.getContainDesc();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    @NotNull
    public final ArrayList<String> getEnums() {
        return this.enums;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.value.hashCode() * 31) + Integer.hashCode(this.maxLength)) * 31) + this.enums.hashCode()) * 31;
        boolean containDesc = getContainDesc();
        ?? r1 = containDesc;
        if (containDesc) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final int index() {
        return this.enums.indexOf(this.value);
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "StringEnum(value=" + this.value + ", maxLength=" + this.maxLength + ", enums=" + this.enums + ", containDesc=" + getContainDesc() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) throws IOException {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(33);
        byte[] bytes = this.value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        bos.write(ArraysKt___ArraysJvmKt.plus(bytes, (byte) 0));
    }

    public /* synthetic */ StringEnum(String str, int i, ArrayList arrayList, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new ArrayList() : arrayList, (i2 & 8) != 0 ? false : z);
    }
}
