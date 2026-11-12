package com.huami.bluetooth.profile.ecf.data;

import com.xiaomi.hm.health.Constant;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016B\u001f\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0014\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HRZone;", "", "", "toString", "", "", "component1", "hrLevel", "copy", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getHrLevel", "()Ljava/util/List;", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(Ljava/util/List;)V", Constant.PAI_KEY_MAX_HR, "(ILjava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HRZone {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> hrLevel;

    public HRZone(@NotNull List<Integer> list) {
        this.hrLevel = list;
        if (!(list.size() == 6)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Illegal heart rate zone count! 5/", Integer.valueOf(getHrLevel().size())).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HRZone copy$default(HRZone hRZone, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hRZone.hrLevel;
        }
        return hRZone.copy(list);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.hrLevel;
    }

    @NotNull
    public final HRZone copy(@NotNull List<Integer> hrLevel) {
        return new HRZone(hrLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HRZone) && Intrinsics.areEqual(this.hrLevel, ((HRZone) other).hrLevel);
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<T> it2 = getHrLevel().iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(((Number) it2.next()).intValue());
        }
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public final List<Integer> getHrLevel() {
        return this.hrLevel;
    }

    public int hashCode() {
        return this.hrLevel.hashCode();
    }

    @NotNull
    public String toString() {
        return Arrays.toString(CollectionsKt___CollectionsKt.toIntArray(this.hrLevel));
    }

    public HRZone(int i, @NotNull List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        arrayList.addAll(1, list);
        Unit unit = Unit.INSTANCE;
        this(arrayList);
    }
}
