package defpackage;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.jd8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jd8<T extends jd8> {
    private static int sUniqueID;
    private boolean mInitialized;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    public jd8() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    public boolean canCoalesce() {
        return true;
    }

    public T coalesce(T t) {
        return getTimestampMs() >= t.getTimestampMs() ? this : t;
    }

    public abstract void dispatch(RCTEventEmitter rCTEventEmitter);

    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public abstract String getEventName();

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    public void init(int i) {
        this.mViewTag = i;
        this.mTimestampMs = uvo.c();
        this.mInitialized = true;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    public jd8(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }
}
