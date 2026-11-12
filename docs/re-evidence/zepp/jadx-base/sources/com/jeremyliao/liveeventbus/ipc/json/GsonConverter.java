package com.jeremyliao.liveeventbus.ipc.json;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/* JADX INFO: loaded from: classes18.dex */
public class GsonConverter implements JsonConverter {
    private Gson a = new Gson();

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) this.a.fromJson(str, (Class) cls);
    }

    @Override // com.jeremyliao.liveeventbus.ipc.json.JsonConverter
    public String toJson(Object obj) {
        return this.a.toJson(obj);
    }
}
