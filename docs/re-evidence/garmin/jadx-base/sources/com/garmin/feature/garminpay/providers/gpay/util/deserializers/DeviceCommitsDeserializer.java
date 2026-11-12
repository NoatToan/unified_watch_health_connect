package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import aq2.j;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d53.w;
import fo2.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import jo2.b;
import jo2.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vo2.y;
import xo2.c;
import xo2.e;
import xo2.f;
import xo2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/DeviceCommitsDeserializer;", "Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/AbstractDeserializer;", "Lxo2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceCommitsDeserializer extends AbstractDeserializer<e> {
    public DeviceCommitsDeserializer() {
        super("DeviceCommitsDeserializer");
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject;
        y yVar;
        JsonElement jsonElement2;
        Object objFromJson;
        Object objFromJson2;
        Object objFromJson3;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        JsonElement jsonElement6;
        String asString;
        y yVar2;
        JsonElement jsonElement7;
        JsonObject asJsonObject2;
        JsonElement jsonElement8;
        JsonObject asJsonObject3;
        JsonElement jsonElement9;
        JsonElement jsonElement10;
        JsonObject asJsonObject4;
        JsonElement jsonElement11;
        JsonObject asJsonObject5;
        JsonElement jsonElement12;
        JsonElement jsonElement13;
        JsonObject asJsonObject6;
        JsonElement jsonElement14;
        JsonObject asJsonObject7;
        JsonElement jsonElement15;
        JsonElement jsonElement16;
        JsonObject asJsonObject8;
        JsonElement jsonElement17;
        if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) {
            return new e(null, null, null, null, false, 31, null);
        }
        JsonArray asJsonArray = asJsonObject.getAsJsonArray("results");
        if (asJsonArray == null) {
            return new e(null, null, null, null, false, 31, null);
        }
        JsonObject asJsonObject9 = asJsonObject.get("_links").getAsJsonObject();
        int i14 = 0;
        p pVar = new p((asJsonObject9 == null || (jsonElement16 = asJsonObject9.get("next")) == null || (asJsonObject8 = jsonElement16.getAsJsonObject()) == null || (jsonElement17 = asJsonObject8.get("href")) == null) ? null : jsonElement17.getAsString(), false);
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        JsonObject jsonObject = null;
        String asString2 = null;
        for (JsonElement jsonElement18 : asJsonArray) {
            JsonObject asJsonObject10 = jsonElement18.getAsJsonObject();
            String asString3 = (asJsonObject10 == null || (jsonElement13 = asJsonObject10.get("_links")) == null || (asJsonObject6 = jsonElement13.getAsJsonObject()) == null || (jsonElement14 = asJsonObject6.get("apduResponse")) == null || (asJsonObject7 = jsonElement14.getAsJsonObject()) == null || (jsonElement15 = asJsonObject7.get("href")) == null) ? null : jsonElement15.getAsString();
            JsonObject asJsonObject11 = jsonElement18.getAsJsonObject();
            String asString4 = (asJsonObject11 == null || (jsonElement10 = asJsonObject11.get("_links")) == null || (asJsonObject4 = jsonElement10.getAsJsonObject()) == null || (jsonElement11 = asJsonObject4.get("confirm")) == null || (asJsonObject5 = jsonElement11.getAsJsonObject()) == null || (jsonElement12 = asJsonObject5.get("href")) == null) ? null : jsonElement12.getAsString();
            JsonObject asJsonObject12 = jsonElement18.getAsJsonObject();
            String asString5 = (asJsonObject12 == null || (jsonElement7 = asJsonObject12.get("_links")) == null || (asJsonObject2 = jsonElement7.getAsJsonObject()) == null || (jsonElement8 = asJsonObject2.get("credential")) == null || (asJsonObject3 = jsonElement8.getAsJsonObject()) == null || (jsonElement9 = asJsonObject3.get("href")) == null) ? null : jsonElement9.getAsString();
            JsonObject asJsonObject13 = jsonElement18.getAsJsonObject();
            if (asJsonObject13 == null || (jsonElement6 = asJsonObject13.get("commitType")) == null || (asString = jsonElement6.getAsString()) == null) {
                yVar = null;
            } else {
                y[] yVarArrValues = y.values();
                int length = yVarArrValues.length;
                int i15 = i14;
                while (true) {
                    if (i15 >= length) {
                        yVar2 = null;
                        break;
                    }
                    yVar2 = yVarArrValues[i15];
                    if (s.g(yVar2.f179240a, asString)) {
                        break;
                    }
                    i15++;
                }
                if (yVar2 == null) {
                    a().warn("Unknown commitType: ".concat(asString));
                }
                yVar = yVar2;
            }
            JsonObject asJsonObject14 = jsonElement18.getAsJsonObject();
            String asString6 = (asJsonObject14 == null || (jsonElement5 = asJsonObject14.get("commitId")) == null) ? null : jsonElement5.getAsString();
            try {
                JsonObject asJsonObject15 = jsonElement18.getAsJsonObject();
                asString2 = (asJsonObject15 == null || (jsonElement4 = asJsonObject15.get("encryptedData")) == null) ? null : jsonElement4.getAsString();
            } catch (UnsupportedOperationException e4) {
                JsonObject asJsonObject16 = jsonElement18.getAsJsonObject();
                JsonObject asJsonObject17 = (asJsonObject16 == null || (jsonElement2 = asJsonObject16.get("encryptedData")) == null) ? null : jsonElement2.getAsJsonObject();
                a().error("Error when parsing encryptedData: " + e4.getMessage());
                a().error("encryptedData: " + asJsonObject17);
                jsonObject = asJsonObject17;
            }
            if (asString2 != null) {
                g gVar = g.f99843a;
                b bVar = b.KEY_API;
                gVar.getClass();
                String strA = g.a(bVar, asString2);
                if (strA != null) {
                    if (w.z(strA, "packageId", false)) {
                        j.f12491a.getClass();
                        objFromJson3 = j.d().fromJson(strA, (Class<Object>) c.class);
                        objFromJson = null;
                        objFromJson2 = null;
                    } else {
                        if (w.z(strA, "creditCardId", false)) {
                            j.f12491a.getClass();
                            objFromJson = j.d().fromJson(strA, (Class<Object>) f.class);
                            objFromJson2 = null;
                        } else if (w.z(strA, "transitCardId", false)) {
                            j.f12491a.getClass();
                            objFromJson2 = j.d().fromJson(strA, (Class<Object>) h.class);
                            objFromJson = null;
                        }
                        objFromJson3 = null;
                    }
                }
                objFromJson = null;
                objFromJson2 = null;
                objFromJson3 = null;
            } else {
                objFromJson = null;
                objFromJson2 = null;
                objFromJson3 = null;
            }
            if (jsonObject != null) {
                z14 = true;
            }
            JsonObject asJsonObject18 = jsonElement18.getAsJsonObject();
            arrayList.add(new xo2.g(asString6, yVar, asString3, asString4, asString5, (c) objFromJson3, (f) objFromJson, (h) objFromJson2, (asJsonObject18 == null || (jsonElement3 = asJsonObject18.get("createdTs")) == null) ? null : Long.valueOf(jsonElement3.getAsLong())));
            i14 = 0;
        }
        return new e(null, null, pVar, arrayList, z14);
    }
}
