package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/JsTreadmillMaintainData;", "", "", "component1", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getType", "()I", "<init>", "(I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class JsTreadmillMaintainData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    public JsTreadmillMaintainData(int i) {
        this.type = i;
    }

    public static /* synthetic */ JsTreadmillMaintainData copy$default(JsTreadmillMaintainData jsTreadmillMaintainData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jsTreadmillMaintainData.type;
        }
        return jsTreadmillMaintainData.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final JsTreadmillMaintainData copy(int type) {
        return new JsTreadmillMaintainData(type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsTreadmillMaintainData) && this.type == ((JsTreadmillMaintainData) other).type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return "JsTreadmillMaintainData(type=" + this.type + ")";
    }
}
