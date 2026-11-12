package com.huami.ai.notify;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.Observable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/ai/notify/DialogState;", "Ljava/util/Observable;", "", "dialogState", "", WatchFaceArrivingEvent.CMD_SET, "get", "assertState", "updateState", "", "compareAndSet", "a", LogUtil.I, "state", "<init>", "(I)V", "Companion", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class DialogState extends Observable {
    public static final int CMD_PROCESSED = 5;
    public static final int COMMAND = 4;
    public static final int DIALOG = 1;
    public static final int IDLE = 0;
    public static final int VAD = 2;
    public static final int WAITE_COMMAND = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int state;

    public DialogState(int i) {
        this.state = i;
    }

    public final synchronized boolean compareAndSet(int assertState, int updateState) {
        boolean z;
        if (this.state == assertState) {
            set(updateState);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized int get() {
        return this.state;
    }

    public final synchronized void set(int dialogState) {
        this.state = dialogState;
        setChanged();
        notifyObservers(Integer.valueOf(dialogState));
    }
}
