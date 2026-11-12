package com.garmin.feature.garminpay.providers.gpay.util.deserializers;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d53.t;
import fo2.p;
import fo2.s;
import java.lang.reflect.Type;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import zn2.h;
import zn2.y;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/deserializers/FitPayDeviceDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lfo2/s;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayDeviceDeserializer implements JsonDeserializer<s> {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51735a;

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
            f51735a = iArr;
        }
    }

    @Override // com.google.gson.JsonDeserializer
    public final s deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws NewFitPayException {
        h hVar;
        JsonElement jsonElement2;
        String asString;
        String asString2;
        Long lJ;
        String asString3;
        y yVar;
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
        try {
            if (jsonElement == null) {
                throw new NewFitPayException("received null response for creditCard call", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
            }
            JsonObject asJsonObject13 = jsonElement.getAsJsonObject();
            h[] hVarArrValues = h.values();
            int length = hVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i14];
                String strName = hVar.name();
                JsonElement jsonElement15 = asJsonObject13.get("deviceType");
                if (p005kotlin.jvm.internal.s.g(strName, jsonElement15 != null ? jsonElement15.getAsString() : null)) {
                    break;
                }
                i14++;
            }
            if (hVar == null) {
                throw new NewFitPayException("device type is missing", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
            }
            if (asJsonObject13 == null || (jsonElement2 = asJsonObject13.get("deviceIdentifier")) == null || (asString = jsonElement2.getAsString()) == null) {
                throw new NewFitPayException("deviceId is not available from device response", z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
            }
            int i15 = a.f51735a[hVar.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new RuntimeException("Cannot load a device of type \"PHONE\" into NewFitPayDevice.");
            }
            JsonElement jsonElement16 = asJsonObject13.get("serialNumber");
            if (jsonElement16 == null || (asString2 = jsonElement16.getAsString()) == null || (lJ = t.j(asString2)) == null) {
                JsonElement jsonElement17 = asJsonObject13.get("serialNumber");
                throw new NewFitPayException("unitId is not available from the device response " + (jsonElement17 != null ? jsonElement17.getAsString() : null), z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
            }
            long jLongValue = lJ.longValue();
            JsonElement jsonElement18 = asJsonObject13.get("deviceName");
            if (jsonElement18 == null || (asString3 = jsonElement18.getAsString()) == null) {
                asString3 = "UNKNOWN";
            }
            y[] yVarArrValues = y.values();
            int length2 = yVarArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    yVar = null;
                    break;
                }
                yVar = yVarArrValues[i16];
                String strName2 = yVar.name();
                JsonElement jsonElement19 = asJsonObject13.get(RemoteConfigConstants.ResponseFieldKey.STATE);
                if (p005kotlin.jvm.internal.s.g(strName2, jsonElement19 != null ? jsonElement19.getAsString() : null)) {
                    break;
                }
                i16++;
            }
            if (yVar == null) {
                yVar = y.UNKNOWN;
            }
            JsonElement jsonElement20 = asJsonObject13.get("_links");
            p pVar = new p((jsonElement20 == null || (asJsonObject11 = jsonElement20.getAsJsonObject()) == null || (jsonElement13 = asJsonObject11.get("webapp.addCredential")) == null || (asJsonObject12 = jsonElement13.getAsJsonObject()) == null || (jsonElement14 = asJsonObject12.get("href")) == null) ? null : jsonElement14.getAsString(), true);
            JsonElement jsonElement21 = asJsonObject13.get("_links");
            p pVar2 = new p((jsonElement21 == null || (asJsonObject9 = jsonElement21.getAsJsonObject()) == null || (jsonElement11 = asJsonObject9.get("deviceStatistics")) == null || (asJsonObject10 = jsonElement11.getAsJsonObject()) == null || (jsonElement12 = asJsonObject10.get("href")) == null) ? null : jsonElement12.getAsString(), false, 2, null);
            JsonElement jsonElement22 = asJsonObject13.get("_links");
            p pVar3 = new p((jsonElement22 == null || (asJsonObject7 = jsonElement22.getAsJsonObject()) == null || (jsonElement9 = asJsonObject7.get("commits")) == null || (asJsonObject8 = jsonElement9.getAsJsonObject()) == null || (jsonElement10 = asJsonObject8.get("href")) == null) ? null : jsonElement10.getAsString(), false, 2, null);
            JsonElement jsonElement23 = asJsonObject13.get("_links");
            String str = asString3;
            p pVar4 = new p((jsonElement23 == null || (asJsonObject5 = jsonElement23.getAsJsonObject()) == null || (jsonElement7 = asJsonObject5.get("lastAckCommit")) == null || (asJsonObject6 = jsonElement7.getAsJsonObject()) == null || (jsonElement8 = asJsonObject6.get("href")) == null) ? null : jsonElement8.getAsString(), false, 2, null);
            JsonElement jsonElement24 = asJsonObject13.get("_links");
            p pVar5 = new p((jsonElement24 == null || (asJsonObject3 = jsonElement24.getAsJsonObject()) == null || (jsonElement5 = asJsonObject3.get("securityDomains")) == null || (asJsonObject4 = jsonElement5.getAsJsonObject()) == null || (jsonElement6 = asJsonObject4.get("href")) == null) ? null : jsonElement6.getAsString(), false, 2, null);
            h hVar2 = hVar;
            y yVar2 = yVar;
            JsonElement jsonElement25 = asJsonObject13.get("_links");
            return new s(asString, new p(null, false, 3, null), jLongValue, str, hVar2, yVar2, pVar, pVar2, pVar3, pVar4, pVar5, new p((jsonElement25 == null || (asJsonObject = jsonElement25.getAsJsonObject()) == null || (jsonElement3 = asJsonObject.get("securityDomains")) == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null || (jsonElement4 = asJsonObject2.get("self")) == null) ? null : jsonElement4.getAsString(), false, 2, null));
        } catch (Exception e4) {
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            throw new NewFitPayException(message, z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
        }
    }
}
