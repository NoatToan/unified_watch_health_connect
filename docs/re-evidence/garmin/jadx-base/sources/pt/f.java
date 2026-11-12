package pt;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.s<JsonObject, JsonObject, JsonObject, Integer, Integer, Unit> {
    public f(Object obj) {
        super(5, obj, g.class, "modifyShareImageMonthlyBar", "modifyShareImageMonthlyBar(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;II)V", 0);
    }

    @Override // e23.s
    public final Unit invoke(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, Integer num, Integer num2) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
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
        i iVar = i.f140571a;
        iVar.getClass();
        JsonObject jsonObjectU = i.u(jsonObject4);
        JsonObject asJsonObject = null;
        JsonArray jsonArrayL = i.l((jsonObjectU == null || (jsonElement4 = jsonObjectU.get("p")) == null) ? null : jsonElement4.getAsJsonObject());
        iVar.getClass();
        JsonObject jsonObjectU2 = i.u(jsonObject5);
        JsonArray jsonArrayL2 = i.l((jsonObjectU2 == null || (jsonElement3 = jsonObjectU2.get("p")) == null) ? null : jsonElement3.getAsJsonObject());
        iVar.getClass();
        JsonObject jsonObjectU3 = i.u(jsonObject6);
        JsonArray jsonArrayL3 = i.l((jsonObjectU3 == null || (jsonElement2 = jsonObjectU3.get("p")) == null) ? null : jsonElement2.getAsJsonObject());
        iVar.getClass();
        JsonObject jsonObjectU4 = i.u(jsonObject6);
        if (jsonObjectU4 != null && (jsonElement = jsonObjectU4.get("s")) != null) {
            asJsonObject = jsonElement.getAsJsonObject();
        }
        JsonArray jsonArrayL4 = i.l(asJsonObject);
        float fC = g.c(jsonArrayL);
        float fC2 = g.c(jsonArrayL2);
        float fC3 = g.c(jsonArrayL3);
        float fC4 = g.c(jsonArrayL4);
        StringBuilder sbI = e0.i("original: blue=[", fC, "], white=[", fC2, "], barCenter=[");
        sbI.append(fC3);
        sbI.append("], barScale=[");
        sbI.append(fC4);
        sbI.append("]");
        String string = sbI.toString();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BodyBatteryUtils", string);
        float f14 = fC2 - fC;
        float f15 = (((100 - iIntValue) * f14) / 100.0f) + fC;
        float f16 = ((f14 * (100 - iIntValue2)) / 100.0f) + fC;
        float f17 = (f15 + f16) / 2.0f;
        float f18 = (fC4 * (iIntValue - iIntValue2)) / 100.0f;
        StringBuilder sbI2 = e0.i("modified: blue=[", f15, "], white=[", f16, "], barCenter=[");
        sbI2.append(f17);
        sbI2.append("], barScale=[");
        sbI2.append(f18);
        sbI2.append("]");
        i2.a.b(a2Var, "BodyBatteryUtils", sbI2.toString());
        g.e(jsonArrayL, f15);
        g.e(jsonArrayL2, f16);
        g.e(jsonArrayL3, f17);
        g.e(jsonArrayL4, f18);
        return Unit.INSTANCE;
    }
}
