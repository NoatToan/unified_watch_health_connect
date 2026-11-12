package ohos.ace.plugin.taskmanagerplugin;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class Progress {
    private Map<String, String> extras;
    private int index;
    private long lastProcessed;
    private long processed;
    private List<Long> sizes;
    private int state;

    public long getLastProcessed() {
        return this.lastProcessed;
    }

    public void setLastProcessed(long j) {
        this.lastProcessed = j;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public long getProcessed() {
        return this.processed;
    }

    public void setProcessed(long j) {
        this.processed = j;
    }

    public List<Long> getSizes() {
        return this.sizes;
    }

    public void setSizes(List<Long> list) {
        this.sizes = list;
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public void setExtras(Map<String, String> map) {
        this.extras = map;
    }
}
