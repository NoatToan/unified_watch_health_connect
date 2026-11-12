package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001$B%\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b \u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÆ\u0003J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "component1", "", "component2", "()Ljava/lang/Integer;", "", "component3", "stringData", "maxLength", "containDesc", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringData;", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getStringData", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getMaxLength", "Z", "getContainDesc", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "(Ljava/lang/String;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StringData implements IPrimaryData, Serializable {
    private static final long serialVersionUID = 1;
    private final boolean containDesc;

    @Nullable
    private final Integer maxLength;

    @NotNull
    private final String stringData;

    public StringData(@NotNull String stringData, @Nullable Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(stringData, "stringData");
        this.stringData = stringData;
        this.maxLength = num;
        this.containDesc = z;
    }

    public static /* synthetic */ StringData copy$default(StringData stringData, String str, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringData.stringData;
        }
        if ((i & 2) != 0) {
            num = stringData.maxLength;
        }
        if ((i & 4) != 0) {
            z = stringData.getContainDesc();
        }
        return stringData.copy(str, num, z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        return IPrimaryData.b.a(this);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStringData() {
        return this.stringData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final boolean component3() {
        return getContainDesc();
    }

    @NotNull
    public final StringData copy(@NotNull String stringData, @Nullable Integer maxLength, boolean containDesc) {
        Intrinsics.checkNotNullParameter(stringData, "stringData");
        return new StringData(stringData, maxLength, containDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringData)) {
            return false;
        }
        StringData stringData = (StringData) other;
        return Intrinsics.areEqual(this.stringData, stringData.stringData) && Intrinsics.areEqual(this.maxLength, stringData.maxLength) && getContainDesc() == stringData.getContainDesc();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    @Nullable
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final String getStringData() {
        return this.stringData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.stringData.hashCode() * 31;
        Integer num = this.maxLength;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean containDesc = getContainDesc();
        ?? r1 = containDesc;
        if (containDesc) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    @NotNull
    public String toString() {
        return "StringData(stringData=" + this.stringData + ", maxLength=" + this.maxLength + ", containDesc=" + getContainDesc() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) throws IOException {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(32);
        byte[] bytes = (this.stringData + (char) 0).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        bos.write(bytes);
    }

    public /* synthetic */ StringData(String str, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StringData(@NotNull String stringData) {
        this(stringData, null, false);
        Intrinsics.checkNotNullParameter(stringData, "stringData");
    }
}
