package com.xiaomi.fitness.watch.face.data;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FaceResp extends BaseResp {
    public int code;
    public String err_msg;
    public String msg;
    public long sys_time;

    @Override // com.xiaomi.fitness.watch.face.data.BaseResp
    public int getCode() {
        return this.code;
    }

    @Override // com.xiaomi.fitness.watch.face.data.BaseResp
    public String getMsg() {
        return this.msg;
    }

    @Override // com.xiaomi.fitness.watch.face.data.BaseResp
    public boolean oK() {
        return this.code == 200;
    }
}
