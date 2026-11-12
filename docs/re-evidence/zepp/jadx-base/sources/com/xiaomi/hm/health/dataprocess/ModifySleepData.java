package com.xiaomi.hm.health.dataprocess;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "", "", "component1", "component2", "start", Command.STOP, "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getStart", "()I", "getStop", "<init>", "(II)V", "dataprocess_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ModifySleepData {
    private final int start;
    private final int stop;

    public ModifySleepData(int i, int i2) {
        this.start = i;
        this.stop = i2;
    }

    public static /* synthetic */ ModifySleepData copy$default(ModifySleepData modifySleepData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = modifySleepData.start;
        }
        if ((i3 & 2) != 0) {
            i2 = modifySleepData.stop;
        }
        return modifySleepData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStop() {
        return this.stop;
    }

    @NotNull
    public final ModifySleepData copy(int start, int stop) {
        return new ModifySleepData(start, stop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifySleepData)) {
            return false;
        }
        ModifySleepData modifySleepData = (ModifySleepData) other;
        return this.start == modifySleepData.start && this.stop == modifySleepData.stop;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getStop() {
        return this.stop;
    }

    public int hashCode() {
        return (this.start * 31) + this.stop;
    }

    @NotNull
    public String toString() {
        return "ModifySleepData(start=" + this.start + ", stop=" + this.stop + ")";
    }
}
