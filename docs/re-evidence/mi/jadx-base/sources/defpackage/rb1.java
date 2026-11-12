package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f32368a = JsonReader.a.a(PluginDeviceInfo.FMODEL, FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "s", "rz", "r", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f32369b = JsonReader.a.a(Constant.KeyValue.KEY_COLUMN);

    public static boolean a(hb1 hb1Var) {
        return hb1Var == null || (hb1Var.isStatic() && hb1Var.b().get(0).f16153b.equals(0.0f, 0.0f));
    }

    public static boolean b(sb1<PointF, PointF> sb1Var) {
        return sb1Var == null || (!(sb1Var instanceof mb1) && sb1Var.isStatic() && sb1Var.b().get(0).f16153b.equals(0.0f, 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(eb1 eb1Var) {
        return eb1Var == null || (eb1Var.isStatic() && ((Float) ((e1e) eb1Var.b().get(0)).f16153b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(kb1 kb1Var) {
        return kb1Var == null || (kb1Var.isStatic() && ((pbl) ((e1e) kb1Var.b().get(0)).f16153b).a(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(eb1 eb1Var) {
        return eb1Var == null || (eb1Var.isStatic() && ((Float) ((e1e) eb1Var.b().get(0)).f16153b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(eb1 eb1Var) {
        return eb1Var == null || (eb1Var.isStatic() && ((Float) ((e1e) eb1Var.b().get(0)).f16153b).floatValue() == 0.0f);
    }

    public static qb1 g(JsonReader jsonReader, lse lseVar) throws IOException {
        boolean z;
        boolean z2 = false;
        boolean z3 = jsonReader.n() == JsonReader.Token.BEGIN_OBJECT;
        if (z3) {
            jsonReader.beginObject();
        }
        eb1 eb1Var = null;
        hb1 hb1VarA = null;
        sb1<PointF, PointF> sb1VarB = null;
        kb1 kb1VarJ = null;
        eb1 eb1VarF = null;
        eb1 eb1VarF2 = null;
        gb1 gb1VarH = null;
        eb1 eb1VarF3 = null;
        eb1 eb1VarF4 = null;
        while (jsonReader.d()) {
            switch (jsonReader.p(f32368a)) {
                case 0:
                    boolean z4 = z2;
                    jsonReader.beginObject();
                    while (jsonReader.d()) {
                        if (jsonReader.p(f32369b) != 0) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            hb1VarA = ib1.a(jsonReader, lseVar);
                        }
                    }
                    jsonReader.endObject();
                    z2 = z4;
                    continue;
                case 1:
                    sb1VarB = ib1.b(jsonReader, lseVar);
                    continue;
                case 2:
                    kb1VarJ = tb1.j(jsonReader, lseVar);
                    continue;
                case 3:
                    lseVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    gb1VarH = tb1.h(jsonReader, lseVar);
                    continue;
                case 6:
                    eb1VarF3 = tb1.f(jsonReader, lseVar, z2);
                    continue;
                case 7:
                    eb1VarF4 = tb1.f(jsonReader, lseVar, z2);
                    continue;
                case 8:
                    eb1VarF = tb1.f(jsonReader, lseVar, z2);
                    continue;
                case 9:
                    eb1VarF2 = tb1.f(jsonReader, lseVar, z2);
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    continue;
            }
            eb1 eb1VarF5 = tb1.f(jsonReader, lseVar, z2);
            if (eb1VarF5.b().isEmpty()) {
                eb1VarF5.b().add(new e1e(lseVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lseVar.f())));
            } else {
                if (((e1e) eb1VarF5.b().get(0)).f16153b == 0) {
                    z = false;
                    eb1VarF5.b().set(0, new e1e(lseVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lseVar.f())));
                }
                z2 = z;
                eb1Var = eb1VarF5;
            }
            z = false;
            z2 = z;
            eb1Var = eb1VarF5;
        }
        if (z3) {
            jsonReader.endObject();
        }
        hb1 hb1Var = a(hb1VarA) ? null : hb1VarA;
        sb1<PointF, PointF> sb1Var = b(sb1VarB) ? null : sb1VarB;
        eb1 eb1Var2 = c(eb1Var) ? null : eb1Var;
        if (d(kb1VarJ)) {
            kb1VarJ = null;
        }
        return new qb1(hb1Var, sb1Var, kb1VarJ, eb1Var2, gb1VarH, eb1VarF3, eb1VarF4, f(eb1VarF) ? null : eb1VarF, e(eb1VarF2) ? null : eb1VarF2);
    }
}
