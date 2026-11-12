package com.garmin.android.apps.connectmobile.powerguide.model;

import ab1.g;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/model/PowerGuideSummaryAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lab1/g;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerGuideSummaryAdapter implements JsonDeserializer<g>, JsonSerializer<g> {
    static {
        new a(null);
    }

    @Override // com.google.gson.JsonDeserializer
    public final g deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            g gVar = new g();
            gVar.b(new JSONObject(String.valueOf(jsonElement)));
            return gVar;
        } catch (Exception e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "PowerGuideSummaryAdapter", e4);
            return null;
        }
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(g gVar, Type type, JsonSerializationContext jsonSerializationContext) {
        g gVar2 = gVar;
        if (gVar2 == null) {
            return null;
        }
        try {
            return (JsonElement) GsonUtil.f47253b.fromJson(gVar2.k().toString(), JsonElement.class);
        } catch (Exception e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "PowerGuideSummaryAdapter", e4);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/model/PowerGuideSummaryAdapter$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
