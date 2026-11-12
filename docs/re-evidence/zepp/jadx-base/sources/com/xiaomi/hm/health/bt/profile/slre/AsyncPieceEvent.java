package com.xiaomi.hm.health.bt.profile.slre;

/* JADX INFO: loaded from: classes18.dex */
public class AsyncPieceEvent {
    private int a;
    private int b;
    private int c;

    public AsyncPieceEvent(int appId, int protocol, int result) {
        this.a = appId;
        this.b = protocol;
        this.c = result;
    }

    public int getAppId() {
        return this.a;
    }

    public int getProtocol() {
        return this.b;
    }

    public int getResult() {
        return this.c;
    }

    public void setAppId(int appId) {
        this.a = appId;
    }

    public void setProtocol(int protocol) {
        this.b = protocol;
    }

    public void setResult(int result) {
        this.c = result;
    }

    public String toString() {
        return "AsyncPieceEvent{appId=" + this.a + ", protocol=" + this.b + ", result=" + this.c + '}';
    }
}
