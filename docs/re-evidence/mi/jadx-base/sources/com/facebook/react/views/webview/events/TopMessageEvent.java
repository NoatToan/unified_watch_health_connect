package com.facebook.react.views.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.jd8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/webview/events/TopMessageEvent;", "Ljd8;", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "", "getCoalescingKey", "()S", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/bridge/WritableMap;", "mEventData", "Lcom/facebook/react/bridge/WritableMap;", "", "viewId", "<init>", "(ILcom/facebook/react/bridge/WritableMap;)V", "Companion", "android_debug"}, k = 1, mv = {1, 4, 0})
public class TopMessageEvent extends jd8<TopMessageEvent> {

    @NotNull
    public static final String EVENT_NAME = "topMessage";
    private final WritableMap mEventData;

    public TopMessageEvent(int i, @NotNull WritableMap writableMap) {
        super(i);
        this.mEventData = writableMap;
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.jd8
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        rctEventEmitter.receiveEvent(getViewTag(), EVENT_NAME, this.mEventData);
    }

    @Override // defpackage.jd8
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.jd8
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }
}
