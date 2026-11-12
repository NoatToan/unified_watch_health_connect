package androidx.media3.common;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class PriorityTaskManager$PriorityTooLowException extends IOException {
    public PriorityTaskManager$PriorityTooLowException(int i14, int i15) {
        super(am.j.g(i14, i15, "Priority too low [priority=", ", highest=", "]"));
    }
}
