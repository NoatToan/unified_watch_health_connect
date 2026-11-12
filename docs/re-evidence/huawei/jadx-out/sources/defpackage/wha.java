package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class wha {
    private String dataTypeName;
    private long endTime;
    private long modifyTime;
    private long startTime;
    private List<whd> value;

    public long getStartTime() {
        return this.startTime / 1000000;
    }

    public long getEndTime() {
        return this.endTime / 1000000;
    }

    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getDataTypeName() {
        return this.dataTypeName;
    }

    public List<whd> getValue() {
        return this.value;
    }
}
