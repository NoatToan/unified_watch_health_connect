package com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer;

import aq2.j;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.AbstractDeserializer;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dq2.a;
import dq2.f;
import java.lang.reflect.Type;
import mp2.b;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/util/deserializer/FitPayVerificationMethodDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Ldq2/f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayVerificationMethodDeserializer extends AbstractDeserializer<f> {
    public FitPayVerificationMethodDeserializer() {
        super("FitPayVerificationMethodDeserializer");
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Enum enumValueOf;
        Enum enumValueOf2;
        a aVar;
        eq2.a aVar2;
        eq2.a aVar3;
        a aVar4;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        JsonObject asJsonObject2;
        JsonElement jsonElement3;
        JsonObject asJsonObject3;
        JsonElement jsonElement4;
        JsonObject asJsonObject4;
        JsonElement jsonElement5;
        JsonObject asJsonObject5;
        JsonElement jsonElement6;
        JsonObject asJsonObject6;
        JsonElement jsonElement7;
        if (jsonElement == null) {
            a().error("deserialize: received null response for verification request");
            return null;
        }
        try {
            JsonObject asJsonObject7 = jsonElement.getAsJsonObject();
            JsonElement jsonElement8 = asJsonObject7.get("_links");
            String asString = (jsonElement8 == null || (asJsonObject5 = jsonElement8.getAsJsonObject()) == null || (jsonElement6 = asJsonObject5.get("self")) == null || (asJsonObject6 = jsonElement6.getAsJsonObject()) == null || (jsonElement7 = asJsonObject6.get("href")) == null) ? null : jsonElement7.getAsString();
            JsonElement jsonElement9 = asJsonObject7.get("_links");
            String asString2 = (jsonElement9 == null || (asJsonObject3 = jsonElement9.getAsJsonObject()) == null || (jsonElement4 = asJsonObject3.get("verify")) == null || (asJsonObject4 = jsonElement4.getAsJsonObject()) == null || (jsonElement5 = asJsonObject4.get("href")) == null) ? null : jsonElement5.getAsString();
            JsonElement jsonElement10 = asJsonObject7.get("_links");
            String asString3 = (jsonElement10 == null || (asJsonObject = jsonElement10.getAsJsonObject()) == null || (jsonElement2 = asJsonObject.get("select")) == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null || (jsonElement3 = asJsonObject2.get("href")) == null) ? null : jsonElement3.getAsString();
            JsonElement jsonElement11 = asJsonObject7.get("verificationId");
            String asString4 = jsonElement11 != null ? jsonElement11.getAsString() : null;
            JsonElement jsonElement12 = asJsonObject7.get(RemoteConfigConstants.ResponseFieldKey.STATE);
            String asString5 = jsonElement12 != null ? jsonElement12.getAsString() : null;
            if (asString5 == null || asString5.length() == 0) {
                enumValueOf = null;
            } else {
                try {
                    enumValueOf = Enum.valueOf(b.class, asString5);
                } catch (IllegalArgumentException unused) {
                    enumValueOf = null;
                }
            }
            b bVar = (b) enumValueOf;
            JsonElement jsonElement13 = asJsonObject7.get("methodType");
            String asString6 = jsonElement13 != null ? jsonElement13.getAsString() : null;
            if (asString6 == null || asString6.length() == 0) {
                enumValueOf2 = null;
            } else {
                try {
                    enumValueOf2 = Enum.valueOf(mp2.a.class, asString6);
                } catch (IllegalArgumentException unused2) {
                    enumValueOf2 = null;
                }
            }
            mp2.a aVar5 = (mp2.a) enumValueOf2;
            JsonElement jsonElement14 = asJsonObject7.get("value");
            String asString7 = jsonElement14 != null ? jsonElement14.getAsString() : null;
            try {
                JsonElement jsonElement15 = asJsonObject7.get("appToAppContext");
                JsonObject asJsonObject8 = jsonElement15 != null ? jsonElement15.getAsJsonObject() : null;
                if (asJsonObject8 != null) {
                    j.f12491a.getClass();
                    aVar4 = (a) j.d().fromJson((JsonElement) asJsonObject8, a.class);
                } else {
                    aVar4 = null;
                }
                aVar = aVar4;
            } catch (Exception unused3) {
                aVar = null;
            }
            try {
                JsonElement jsonElement16 = asJsonObject7.get("appToWebContext");
                JsonObject asJsonObject9 = jsonElement16 != null ? jsonElement16.getAsJsonObject() : null;
                if (asJsonObject9 != null) {
                    j.f12491a.getClass();
                    aVar3 = (eq2.a) j.d().fromJson((JsonElement) asJsonObject9, eq2.a.class);
                } else {
                    aVar3 = null;
                }
                aVar2 = aVar3;
            } catch (Exception unused4) {
                aVar2 = null;
            }
            return new f(asString4, bVar, aVar5, asString7, aVar, aVar2, asString2, asString3, asString);
        } catch (Exception e4) {
            a().error("deserialize: " + e4);
            return null;
        }
    }
}
