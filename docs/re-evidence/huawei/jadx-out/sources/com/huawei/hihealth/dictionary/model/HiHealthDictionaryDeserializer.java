package com.huawei.hihealth.dictionary.model;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthDictionaryDeserializer implements JsonDeserializer<HiHealthDictionary> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HiHealthDictionary deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return null;
        }
        HiHealthDictionary hiHealthDictionary = (HiHealthDictionary) new Gson().fromJson((JsonElement) jsonElement.getAsJsonObject(), HiHealthDictionary.class);
        hiHealthDictionary.a();
        return hiHealthDictionary;
    }
}
