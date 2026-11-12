package com.huami.health.afppg.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/health/afppg/model/AFPPGDataFragment;", "", "Ljava/util/Calendar;", "component1", "", "", "component2", "", "component3", "timestamp", "data", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "Ljava/util/Calendar;", "getTimestamp", "()Ljava/util/Calendar;", "Ljava/util/List;", "getData", "()Ljava/util/List;", LogUtil.I, "getType", "()I", "<init>", "(Ljava/util/Calendar;Ljava/util/List;I)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AFPPGDataFragment {

    @NotNull
    private final List<Byte> data;

    @NotNull
    private final Calendar timestamp;
    private final int type;

    public AFPPGDataFragment(@NotNull Calendar calendar, @NotNull List<Byte> list, int i) {
        this.timestamp = calendar;
        this.data = list;
        this.type = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AFPPGDataFragment copy$default(AFPPGDataFragment aFPPGDataFragment, Calendar calendar, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            calendar = aFPPGDataFragment.timestamp;
        }
        if ((i2 & 2) != 0) {
            list = aFPPGDataFragment.data;
        }
        if ((i2 & 4) != 0) {
            i = aFPPGDataFragment.type;
        }
        return aFPPGDataFragment.copy(calendar, list, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final List<Byte> component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final AFPPGDataFragment copy(@NotNull Calendar timestamp, @NotNull List<Byte> data, int type) {
        return new AFPPGDataFragment(timestamp, data, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPPGDataFragment)) {
            return false;
        }
        AFPPGDataFragment aFPPGDataFragment = (AFPPGDataFragment) other;
        return Intrinsics.areEqual(this.timestamp, aFPPGDataFragment.timestamp) && Intrinsics.areEqual(this.data, aFPPGDataFragment.data) && this.type == aFPPGDataFragment.type;
    }

    @NotNull
    public final List<Byte> getData() {
        return this.data;
    }

    @NotNull
    public final Calendar getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.timestamp.hashCode() * 31) + this.data.hashCode()) * 31) + this.type;
    }

    @NotNull
    public String toString() {
        return "AFPPGDataFragment(timestamp=" + this.timestamp + ", data=" + this.data + ", type=" + this.type + ')';
    }
}
