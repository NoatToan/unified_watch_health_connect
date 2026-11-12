package miui.assistant.index;

/* JADX INFO: loaded from: classes23.dex */
public class BaseItem {
    private long dueTime = 604800000;
    private String groupId;
    private String uniqueId;

    public long getDueTime() {
        return this.dueTime;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setDueTime(long j) {
        this.dueTime = j;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }
}
