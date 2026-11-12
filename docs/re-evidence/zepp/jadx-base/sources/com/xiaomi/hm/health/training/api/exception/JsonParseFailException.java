package com.xiaomi.hm.health.training.api.exception;

/* JADX INFO: loaded from: classes21.dex */
public class JsonParseFailException extends RuntimeException {
    public JsonParseFailException(Throwable th) {
        super("JSON 解析失败", th);
    }
}
