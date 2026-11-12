package com.huawei.phoneservice.feedbackcommon.utils;

import android.net.Uri;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class UriSerializer implements JsonSerializer<Uri> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Uri uri, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(uri.toString());
    }
}
