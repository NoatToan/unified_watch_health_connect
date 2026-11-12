package com.reactnativepagerview.event;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import defpackage.jd8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/reactnativepagerview/event/PageSelectedEvent;", "Ljd8;", "Lcom/facebook/react/bridge/WritableMap;", "serializeEventData", "()Lcom/facebook/react/bridge/WritableMap;", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "", "mPosition", "I", CloudContract.COL_VIEW_TAG, "<init>", "(II)V", "Companion", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0})
public final class PageSelectedEvent extends jd8<PageSelectedEvent> {

    @NotNull
    public static final String EVENT_NAME = "topPageSelected";
    private final int mPosition;

    public PageSelectedEvent(int i, int i2) {
        super(i);
        this.mPosition = i2;
    }

    private final WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.mPosition);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    @Override // defpackage.jd8
    public boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.jd8
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // defpackage.jd8
    @NotNull
    public String getEventName() {
        return EVENT_NAME;
    }
}
