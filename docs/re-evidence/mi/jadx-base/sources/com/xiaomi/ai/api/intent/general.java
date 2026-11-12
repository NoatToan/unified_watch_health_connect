package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.core.JsonProcessingException;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class general implements EntityType {
    public static general read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new general();
    }

    public static c4h write(general generalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return IntentUtils.objectMapper.createObjectNode();
    }
}
