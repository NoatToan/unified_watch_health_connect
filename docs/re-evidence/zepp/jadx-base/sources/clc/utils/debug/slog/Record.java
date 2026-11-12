package clc.utils.debug.slog;

/* JADX INFO: loaded from: classes2.dex */
public class Record {
    public String content = "";
    public String timeStamp = "";
    public String tag = "";

    public String toString() {
        return "[SLOG] At [" + this.timeStamp + "] tagged [" + this.tag + "] with [" + this.content + "]";
    }
}
