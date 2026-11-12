package com.xiaomi.hm.health.speech.entity;

import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;

/* JADX INFO: loaded from: classes21.dex */
public class AlarmEventSkill extends BaseSkill {
    private String a;
    private long b;
    private String c;
    private String d;
    private AlarmTimerOffset e;
    private AlarmDateTime f;
    private String g;
    private String h;
    private boolean i;

    public AlarmEventSkill() {
        this.aiEnginePlatform = AiEnginePlatform.XIAOMI;
    }

    public String getAction() {
        return this.g;
    }

    public String getCircle() {
        return this.d;
    }

    public AlarmDateTime getDateTime() {
        return this.f;
    }

    public String getDialogStatus() {
        return this.h;
    }

    public AlarmTimerOffset getOffset() {
        return this.e;
    }

    public String getOperation() {
        return this.c;
    }

    public long getRelativeTimestamp() {
        return this.b;
    }

    public String getReplyText() {
        return this.a;
    }

    public boolean isComplete() {
        return this.i;
    }

    public void setAction(String action) {
        this.g = action;
    }

    public void setCircle(String circle) {
        this.d = circle;
    }

    public void setComplete(boolean complete) {
        this.i = complete;
    }

    public void setDateTime(AlarmDateTime dateTime) {
        this.f = dateTime;
    }

    public void setDialogStatus(String dialogStatus) {
        this.h = dialogStatus;
    }

    public void setOffset(AlarmTimerOffset offset) {
        this.e = offset;
    }

    public void setOperation(String operation) {
        this.c = operation;
    }

    public void setRelativeTimestamp(long relativeTimestamp) {
        this.b = relativeTimestamp;
    }

    public void setReplyText(String replyText) {
        this.a = replyText;
    }
}
