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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/reactnativepagerview/event/PageScrollStateChangedEvent;", "Ljd8;", "Lcom/facebook/react/bridge/WritableMap;", "serializeEventData", "()Lcom/facebook/react/bridge/WritableMap;", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "mPageScrollState", "Ljava/lang/String;", "", CloudContract.COL_VIEW_TAG, "<init>", "(ILjava/lang/String;)V", "Companion", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0})
public final class PageScrollStateChangedEvent extends jd8<PageScrollStateChangedEvent> {

    @NotNull
    public static final String EVENT_NAME = "topPageScrollStateChanged";

    @NotNull
    private final String mPageScrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageScrollStateChangedEvent(int i, @NotNull String mPageScrollState) {
        super(i);
        Intrinsics.checkNotNullParameter(mPageScrollState, "mPageScrollState");
        this.mPageScrollState = mPageScrollState;
    }

    private final WritableMap serializeEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("pageScrollState", this.mPageScrollState);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
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
