package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d53.t;
import fo2.p;
import fo2.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.jvm.internal.s;
import zn2.h;
import zn2.y;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/FitPayDevicesDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lfo2/v;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayDevicesDeserializer implements JsonDeserializer<v> {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51736a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.WATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51736a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.JsonDeserializer
    public final v deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws NewFitPayException {
        h hVar;
        JsonElement jsonElement2;
        String asString;
        String asString2;
        Long lJ;
        String asString3;
        y yVar;
        int i14;
        JsonObject asJsonObject;
        JsonElement jsonElement3;
        JsonObject asJsonObject2;
        JsonElement jsonElement4;
        JsonObject asJsonObject3;
        JsonElement jsonElement5;
        JsonObject asJsonObject4;
        JsonElement jsonElement6;
        JsonObject asJsonObject5;
        JsonElement jsonElement7;
        JsonObject asJsonObject6;
        JsonElement jsonElement8;
        JsonObject asJsonObject7;
        JsonElement jsonElement9;
        JsonObject asJsonObject8;
        JsonElement jsonElement10;
        JsonObject asJsonObject9;
        JsonElement jsonElement11;
        JsonObject asJsonObject10;
        JsonElement jsonElement12;
        JsonObject asJsonObject11;
        JsonElement jsonElement13;
        JsonObject asJsonObject12;
        JsonElement jsonElement14;
        JsonObject asJsonObject13;
        JsonElement jsonElement15;
        JsonObject asJsonObject14;
        JsonElement jsonElement16;
        JsonObject asJsonObject15;
        JsonElement jsonElement17;
        JsonObject asJsonObject16;
        JsonElement jsonElement18;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            if (jsonElement == null) {
                throw new NewFitPayException("received null response for creditCard call", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
            }
            JsonElement jsonElement19 = jsonElement.getAsJsonObject().get("_links");
            String str = "self";
            String str2 = "href";
            int i15 = 0;
            p pVar = new p((jsonElement19 == null || (asJsonObject15 = jsonElement19.getAsJsonObject()) == null || (jsonElement17 = asJsonObject15.get("self")) == null || (asJsonObject16 = jsonElement17.getAsJsonObject()) == null || (jsonElement18 = asJsonObject16.get("href")) == null) ? null : jsonElement18.getAsString(), false);
            JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("results");
            asJsonArray.getClass();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonObject asJsonObject17 = it.next().getAsJsonObject();
                h[] hVarArrValues = h.values();
                int length = hVarArrValues.length;
                int i16 = i15;
                while (true) {
                    if (i16 >= length) {
                        hVar = null;
                        break;
                    }
                    h hVar2 = hVarArrValues[i16];
                    String strName = hVar2.name();
                    JsonElement jsonElement20 = asJsonObject17.get("deviceType");
                    if (s.g(strName, jsonElement20 != null ? jsonElement20.getAsString() : null)) {
                        hVar = hVar2;
                        break;
                    }
                    i16++;
                }
                if (hVar == null) {
                    throw new NewFitPayException("device type is missing", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
                }
                if (asJsonObject17 == null || (jsonElement2 = asJsonObject17.get("deviceIdentifier")) == null || (asString = jsonElement2.getAsString()) == null) {
                    throw new NewFitPayException("deviceId is not available from device response", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
                }
                int i17 = a.f51736a[hVar.ordinal()];
                if (i17 == 1) {
                    JsonElement jsonElement21 = asJsonObject17.get("serialNumber");
                    if (jsonElement21 == null || (asString2 = jsonElement21.getAsString()) == null || (lJ = t.j(asString2)) == null) {
                        JsonElement jsonElement22 = asJsonObject17.get("serialNumber");
                        throw new NewFitPayException("unitId is not available from the device response " + (jsonElement22 != null ? jsonElement22.getAsString() : null), z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
                    }
                    long jLongValue = lJ.longValue();
                    JsonElement jsonElement23 = asJsonObject17.get("deviceName");
                    if (jsonElement23 == null || (asString3 = jsonElement23.getAsString()) == null) {
                        asString3 = "UNKNOWN";
                    }
                    y[] yVarArrValues = y.values();
                    int length2 = yVarArrValues.length;
                    while (true) {
                        if (i15 >= length2) {
                            yVar = null;
                            break;
                        }
                        yVar = yVarArrValues[i15];
                        String strName2 = yVar.name();
                        JsonElement jsonElement24 = asJsonObject17.get(RemoteConfigConstants.ResponseFieldKey.STATE);
                        if (s.g(strName2, jsonElement24 != null ? jsonElement24.getAsString() : null)) {
                            break;
                        }
                        i15++;
                    }
                    if (yVar == null) {
                        yVar = y.UNKNOWN;
                    }
                    h hVar3 = hVar;
                    JsonElement jsonElement25 = asJsonObject17.get("_links");
                    p pVar2 = new p((jsonElement25 == null || (asJsonObject11 = jsonElement25.getAsJsonObject()) == null || (jsonElement13 = asJsonObject11.get("webapp.addCredential")) == null || (asJsonObject12 = jsonElement13.getAsJsonObject()) == null || (jsonElement14 = asJsonObject12.get(str2)) == null) ? null : jsonElement14.getAsString(), true);
                    JsonElement jsonElement26 = asJsonObject17.get("_links");
                    p pVar3 = pVar;
                    p pVar4 = new p((jsonElement26 == null || (asJsonObject9 = jsonElement26.getAsJsonObject()) == null || (jsonElement11 = asJsonObject9.get("deviceStatistics")) == null || (asJsonObject10 = jsonElement11.getAsJsonObject()) == null || (jsonElement12 = asJsonObject10.get(str2)) == null) ? null : jsonElement12.getAsString(), false, 2, null);
                    JsonElement jsonElement27 = asJsonObject17.get("_links");
                    String str3 = asString3;
                    p pVar5 = new p((jsonElement27 == null || (asJsonObject7 = jsonElement27.getAsJsonObject()) == null || (jsonElement9 = asJsonObject7.get("commits")) == null || (asJsonObject8 = jsonElement9.getAsJsonObject()) == null || (jsonElement10 = asJsonObject8.get(str2)) == null) ? null : jsonElement10.getAsString(), false, 2, null);
                    JsonElement jsonElement28 = asJsonObject17.get("_links");
                    p pVar6 = new p((jsonElement28 == null || (asJsonObject5 = jsonElement28.getAsJsonObject()) == null || (jsonElement7 = asJsonObject5.get("lastAckCommit")) == null || (asJsonObject6 = jsonElement7.getAsJsonObject()) == null || (jsonElement8 = asJsonObject6.get(str2)) == null) ? null : jsonElement8.getAsString(), false, 2, null);
                    JsonElement jsonElement29 = asJsonObject17.get("_links");
                    p pVar7 = new p((jsonElement29 == null || (asJsonObject3 = jsonElement29.getAsJsonObject()) == null || (jsonElement5 = asJsonObject3.get("securityDomains")) == null || (asJsonObject4 = jsonElement5.getAsJsonObject()) == null || (jsonElement6 = asJsonObject4.get(str2)) == null) ? null : jsonElement6.getAsString(), false, 2, null);
                    JsonElement jsonElement30 = asJsonObject17.get("_links");
                    i14 = 0;
                    pVar = pVar3;
                    arrayList.add(new fo2.s(asString, pVar, jLongValue, str3, hVar3, yVar, pVar2, pVar4, pVar5, pVar6, pVar7, new p((jsonElement30 == null || (asJsonObject = jsonElement30.getAsJsonObject()) == null || (jsonElement3 = asJsonObject.get(str)) == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null || (jsonElement4 = asJsonObject2.get(str2)) == null) ? null : jsonElement4.getAsString(), false, 2, null)));
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    JsonElement jsonElement31 = asJsonObject17.get("manufacturerName");
                    String asString4 = jsonElement31 != null ? jsonElement31.getAsString() : null;
                    JsonElement jsonElement32 = asJsonObject17.get("deviceName");
                    String asString5 = jsonElement32 != null ? jsonElement32.getAsString() : null;
                    JsonElement jsonElement33 = asJsonObject17.get("softwareRevision");
                    String asString6 = jsonElement33 != null ? jsonElement33.getAsString() : null;
                    JsonElement jsonElement34 = asJsonObject17.get("osName");
                    String asString7 = jsonElement34 != null ? jsonElement34.getAsString() : null;
                    JsonElement jsonElement35 = asJsonObject17.get("_links");
                    arrayList2.add(new fo2.t(asString, hVar, asString4, asString5, asString6, asString7, ((jsonElement35 == null || (asJsonObject13 = jsonElement35.getAsJsonObject()) == null || (jsonElement15 = asJsonObject13.get("makeActive")) == null || (asJsonObject14 = jsonElement15.getAsJsonObject()) == null || (jsonElement16 = asJsonObject14.get(str2)) == null) ? null : jsonElement16.getAsString()) == null ? 1 : i15));
                    i14 = i15;
                }
                str = str;
                str2 = str2;
                i15 = i14;
            }
            return new v(arrayList, arrayList2);
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            throw new NewFitPayException(message, z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
        }
    }
}
