package com.beaglebuddy.id3.pojo;

import com.beaglebuddy.id3.enums.EventType;

/* JADX INFO: loaded from: classes2.dex */
public class EventCode {
    private EventType a;
    private int b;

    public EventCode(EventType eventType, int i) {
        if (i >= 0) {
            this.a = eventType;
            this.b = i;
        } else {
            throw new IllegalArgumentException("Invalid time stamp, " + i + ".  It must be >= 0.");
        }
    }

    public EventType getEventType() {
        return this.a;
    }

    public int getTimeStamp() {
        return this.b;
    }
}
