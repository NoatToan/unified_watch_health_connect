package pt;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.s<JsonObject, JsonObject, JsonObject, Integer, Integer, Unit> {
    public e(Object obj) {
        super(5, obj, g.class, "modifyChapterMonthlyBar", "modifyChapterMonthlyBar(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;II)V", 0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e0  */
    @Override // e23.s
    public final Unit invoke(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, Integer num, Integer num2) {
        String str;
        String str2;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        JsonObject asJsonObject2;
        JsonElement jsonElement2;
        JsonArray asJsonArray;
        JsonObject asJsonObject3;
        JsonElement jsonElement3;
        JsonObject asJsonObject4;
        JsonElement jsonElement4;
        JsonArray asJsonArray2;
        JsonElement jsonElement5;
        JsonArray asJsonArray3;
        JsonElement jsonElement6;
        JsonArray asJsonArray4;
        JsonElement jsonElement7;
        JsonElement jsonElement8;
        float asFloat;
        JsonElement jsonElement9;
        JsonArray asJsonArray5;
        JsonElement jsonElement10;
        JsonArray asJsonArray6;
        JsonElement jsonElement11;
        JsonElement jsonElement12;
        JsonElement jsonElement13;
        JsonElement jsonElement14;
        JsonObject jsonObject4 = jsonObject;
        JsonObject jsonObject5 = jsonObject2;
        JsonObject jsonObject6 = jsonObject3;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        jsonObject4.getClass();
        jsonObject5.getClass();
        jsonObject6.getClass();
        g gVar = (g) this.receiver;
        g gVar2 = g.f140567a;
        gVar.getClass();
        d dVar = g.f140568b;
        g gVar3 = g.f140567a;
        JsonElement jsonElement15 = jsonObject4.get("ks");
        if (jsonElement15 != null) {
            JsonObject jsonObject7 = jsonElement15 instanceof JsonObject ? (JsonObject) jsonElement15 : null;
            if (jsonObject7 != null && (jsonElement7 = jsonObject7.get("p")) != null) {
                JsonObject jsonObject8 = jsonElement7 instanceof JsonObject ? (JsonObject) jsonElement7 : null;
                if (jsonObject8 != null && (jsonElement8 = jsonObject8.get(JWKParameterNames.OCT_KEY_VALUE)) != null) {
                    JsonArray jsonArray = jsonElement8 instanceof JsonArray ? (JsonArray) jsonElement8 : null;
                    if (jsonArray != null) {
                        gVar3.getClass();
                        JsonObject jsonObjectA = g.a(jsonArray);
                        float asFloat2 = 0.0f;
                        if (jsonObjectA == null || (jsonElement13 = jsonObjectA.get("s")) == null) {
                            asFloat = 0.0f;
                        } else {
                            JsonArray jsonArray2 = jsonElement13 instanceof JsonArray ? (JsonArray) jsonElement13 : null;
                            if (jsonArray2 == null || (jsonElement14 = jsonArray2.get(1)) == null) {
                                asFloat = 0.0f;
                            } else {
                                asFloat = jsonElement14.getAsFloat();
                            }
                        }
                        JsonObject jsonObjectB = g.b(jsonArray);
                        if (jsonObjectB != null && (jsonElement11 = jsonObjectB.get("s")) != null) {
                            JsonArray jsonArray3 = jsonElement11 instanceof JsonArray ? (JsonArray) jsonElement11 : null;
                            if (jsonArray3 != null && (jsonElement12 = jsonArray3.get(1)) != null) {
                                asFloat2 = jsonElement12.getAsFloat();
                            }
                        }
                        float f14 = asFloat2;
                        float f15 = 2;
                        float f16 = (f14 - asFloat) * f15;
                        float f17 = asFloat + f16;
                        float f18 = f17 - ((iIntValue * f16) / 100.0f);
                        float f19 = f17 - ((iIntValue2 * f16) / 100.0f);
                        StringBuilder sbI = e0.i("setBlueDotPosition endY = ", asFloat, ", middleY = ", f14, ", startY = ");
                        sbI.append(f17);
                        sbI.append(", range = ");
                        sbI.append(f16);
                        sbI.append(", ");
                        String string = sbI.toString();
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.b(a2Var, "BodyBatteryUtils", string);
                        float f22 = f19 - f18;
                        float f24 = f19 - (f22 / f15);
                        if (jsonObjectA != null && (jsonElement10 = jsonObjectA.get("s")) != null && (asJsonArray6 = jsonElement10.getAsJsonArray()) != null) {
                            asJsonArray6.set(1, new JsonPrimitive(Float.valueOf(f18)));
                        }
                        if (jsonObjectB != null && (jsonElement9 = jsonObjectB.get("s")) != null && (asJsonArray5 = jsonElement9.getAsJsonArray()) != null) {
                            asJsonArray5.set(1, new JsonPrimitive(Float.valueOf(f24)));
                        }
                        dVar.f140563a = f18;
                        dVar.f140564b = f19;
                        dVar.f140565c = f24;
                        dVar.f140566d = (f22 / f16) * 100.0f;
                        i2.a.b(a2Var, "BodyBatteryUtils", "setBlueDotPosition bodyBatteryPosition = " + dVar);
                    }
                }
            }
        }
        JsonElement jsonElement16 = jsonObject5.get("ks");
        if (jsonElement16 == null) {
            str = r9;
            str2 = r10;
        } else {
            JsonObject jsonObject9 = jsonElement16 instanceof JsonObject ? (JsonObject) jsonElement16 : null;
            if (jsonObject9 != null) {
                str2 = "p";
                JsonElement jsonElement17 = jsonObject9.get(str2);
                if (jsonElement17 == null) {
                    str = r9;
                } else {
                    JsonObject jsonObject10 = jsonElement17 instanceof JsonObject ? (JsonObject) jsonElement17 : null;
                    if (jsonObject10 != null) {
                        str = JWKParameterNames.OCT_KEY_VALUE;
                        JsonElement jsonElement18 = jsonObject10.get(str);
                        if (jsonElement18 != null) {
                            JsonArray jsonArray4 = jsonElement18 instanceof JsonArray ? (JsonArray) jsonElement18 : null;
                            if (jsonArray4 != null) {
                                gVar3.getClass();
                                JsonObject jsonObjectA2 = g.a(jsonArray4);
                                JsonObject jsonObjectB2 = g.b(jsonArray4);
                                if (jsonObjectA2 != null && (jsonElement6 = jsonObjectA2.get("s")) != null && (asJsonArray4 = jsonElement6.getAsJsonArray()) != null) {
                                    asJsonArray4.set(1, new JsonPrimitive(Float.valueOf(dVar.f140564b)));
                                }
                                if (jsonObjectB2 != null && (jsonElement5 = jsonObjectB2.get("s")) != null && (asJsonArray3 = jsonElement5.getAsJsonArray()) != null) {
                                    asJsonArray3.set(1, new JsonPrimitive(Float.valueOf(dVar.f140565c)));
                                }
                            }
                        }
                    } else {
                        str = r9;
                    }
                }
            } else {
                str = r9;
                str2 = r10;
            }
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "BodyBatteryUtils", "setBarPosition bodyBatteryPosition = " + dVar);
        JsonElement jsonElement19 = jsonObject6.get("ks");
        if (jsonElement19 != null && (asJsonObject3 = jsonElement19.getAsJsonObject()) != null && (jsonElement3 = asJsonObject3.get(str2)) != null && (asJsonObject4 = jsonElement3.getAsJsonObject()) != null && (jsonElement4 = asJsonObject4.get(str)) != null && (asJsonArray2 = jsonElement4.getAsJsonArray()) != null) {
            asJsonArray2.set(1, new JsonPrimitive(Float.valueOf(dVar.f140565c)));
        }
        JsonElement jsonElement20 = jsonObject6.get("ks");
        if (jsonElement20 != null && (asJsonObject = jsonElement20.getAsJsonObject()) != null && (jsonElement = asJsonObject.get("s")) != null && (asJsonObject2 = jsonElement.getAsJsonObject()) != null && (jsonElement2 = asJsonObject2.get(str)) != null && (asJsonArray = jsonElement2.getAsJsonArray()) != null) {
            asJsonArray.set(1, new JsonPrimitive(Float.valueOf(dVar.f140566d)));
        }
        return Unit.INSTANCE;
    }
}
