package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B1\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\fj\b\u0012\u0004\u0012\u00020\u0007`\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\fj\b\u0012\u0004\u0012\u00020\u0007`\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\fj\b\u0012\u0004\u0012\u00020\u0007`\r2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR2\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\fj\b\u0012\u0004\u0012\u00020\u0007`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "index", "", "checkValid", "component1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component2", "component3", "value", "enums", "containDesc", "copy", "", "toString", "hashCode", "", "other", "equals", "I", "getValue", "()I", "setValue", "(I)V", "Ljava/util/ArrayList;", "getEnums", "()Ljava/util/ArrayList;", "setEnums", "(Ljava/util/ArrayList;)V", "Z", "getContainDesc", "()Z", "<init>", "(ILjava/util/ArrayList;Z)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class EnumData implements IPrimaryData, Serializable {
    private static final long serialVersionUID = 1;
    private final boolean containDesc;

    @NotNull
    private ArrayList<Integer> enums;
    private int value;

    public EnumData(int i, @NotNull ArrayList<Integer> enums, boolean z) {
        Intrinsics.checkNotNullParameter(enums, "enums");
        this.value = i;
        this.enums = enums;
        this.containDesc = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnumData copy$default(EnumData enumData, int i, ArrayList arrayList, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = enumData.value;
        }
        if ((i2 & 2) != 0) {
            arrayList = enumData.enums;
        }
        if ((i2 & 4) != 0) {
            z = enumData.getContainDesc();
        }
        return enumData.copy(i, arrayList, z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        if (getContainDesc()) {
            return this.enums.contains(Integer.valueOf(this.value));
        }
        return true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final ArrayList<Integer> component2() {
        return this.enums;
    }

    public final boolean component3() {
        return getContainDesc();
    }

    @NotNull
    public final EnumData copy(int value, @NotNull ArrayList<Integer> enums, boolean containDesc) {
        Intrinsics.checkNotNullParameter(enums, "enums");
        return new EnumData(value, enums, containDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnumData)) {
            return false;
        }
        EnumData enumData = (EnumData) other;
        return this.value == enumData.value && Intrinsics.areEqual(this.enums, enumData.enums) && getContainDesc() == enumData.getContainDesc();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    @NotNull
    public final ArrayList<Integer> getEnums() {
        return this.enums;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.value) * 31) + this.enums.hashCode()) * 31;
        boolean containDesc = getContainDesc();
        ?? r1 = containDesc;
        if (containDesc) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final int index() {
        return this.enums.indexOf(Integer.valueOf(this.value));
    }

    public final void setEnums(@NotNull ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.enums = arrayList;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "EnumData(value=" + this.value + ", enums=" + this.enums + ", containDesc=" + getContainDesc() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) {
        Intrinsics.checkNotNullParameter(bos, "bos");
        bos.write(16);
        bos.write(this.value);
    }

    public /* synthetic */ EnumData(int i, ArrayList arrayList, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, arrayList, (i2 & 4) != 0 ? false : z);
    }

    public EnumData(int i) {
        this(i, new ArrayList(), false);
    }
}
