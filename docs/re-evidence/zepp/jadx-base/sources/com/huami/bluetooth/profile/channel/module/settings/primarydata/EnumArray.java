package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'BC\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003JG\u0010\u0012\u001a\u00020\u00002\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R)\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR2\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\u001c\u0010\u0011\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "checkValid", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "component1", "component2", "component3", "values", "enums", "containDesc", "copy", "", "toString", "hashCode", "", "other", "equals", "a", "Ljava/util/ArrayList;", "getValues", "()Ljava/util/ArrayList;", "b", "getEnums", "setEnums", "(Ljava/util/ArrayList;)V", "c", "Z", "getContainDesc", "()Z", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EnumArray implements IPrimaryData, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> values;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private ArrayList<Integer> enums;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean containDesc;

    public EnumArray(@NotNull ArrayList<Integer> arrayList, @NotNull ArrayList<Integer> arrayList2, boolean z) {
        this.values = arrayList;
        this.enums = arrayList2;
        this.containDesc = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnumArray copy$default(EnumArray enumArray, ArrayList arrayList, ArrayList arrayList2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = enumArray.values;
        }
        if ((i & 2) != 0) {
            arrayList2 = enumArray.enums;
        }
        if ((i & 4) != 0) {
            z = enumArray.getContainDesc();
        }
        return enumArray.copy(arrayList, arrayList2, z);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean checkValid() {
        if (getContainDesc()) {
            return this.enums.containsAll(this.values);
        }
        return true;
    }

    @NotNull
    public final ArrayList<Integer> component1() {
        return this.values;
    }

    @NotNull
    public final ArrayList<Integer> component2() {
        return this.enums;
    }

    public final boolean component3() {
        return getContainDesc();
    }

    @NotNull
    public final EnumArray copy(@NotNull ArrayList<Integer> values, @NotNull ArrayList<Integer> enums, boolean containDesc) {
        return new EnumArray(values, enums, containDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnumArray)) {
            return false;
        }
        EnumArray enumArray = (EnumArray) other;
        return Intrinsics.areEqual(this.values, enumArray.values) && Intrinsics.areEqual(this.enums, enumArray.enums) && getContainDesc() == enumArray.getContainDesc();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public boolean getContainDesc() {
        return this.containDesc;
    }

    @NotNull
    public final ArrayList<Integer> getEnums() {
        return this.enums;
    }

    @NotNull
    public final ArrayList<Integer> getValues() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.values.hashCode() * 31) + this.enums.hashCode()) * 31;
        boolean containDesc = getContainDesc();
        ?? r1 = containDesc;
        if (containDesc) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setEnums(@NotNull ArrayList<Integer> arrayList) {
        this.enums = arrayList;
    }

    @NotNull
    public String toString() {
        return "EnumArray(values=" + this.values + ", enums=" + this.enums + ", containDesc=" + getContainDesc() + ')';
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData
    public void write(@NotNull ByteArrayOutputStream bos) {
        bos.write(17);
        bos.write(this.values.size());
        Iterator<T> it2 = this.values.iterator();
        while (it2.hasNext()) {
            bos.write(((Number) it2.next()).intValue());
        }
    }

    public /* synthetic */ EnumArray(ArrayList arrayList, ArrayList arrayList2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? false : z);
    }
}
