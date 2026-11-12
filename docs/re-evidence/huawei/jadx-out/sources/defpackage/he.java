package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class he {
    private static final JsonReader.d e = JsonReader.d.e("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    private static final JsonReader.d d = JsonReader.d.e("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    public static gf e(JsonReader jsonReader, cx cxVar) throws IOException {
        fu fuVarE;
        boolean z;
        boolean z2 = false;
        boolean z3 = jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
        if (z3) {
            jsonReader.beginObject();
        }
        fu fuVar = null;
        ga gaVarD = null;
        AnimatableValue<PointF, PointF> animatableValueB = null;
        gc gcVarG = null;
        fu fuVarE2 = null;
        fu fuVarE3 = null;
        gb gbVarD = null;
        fu fuVarE4 = null;
        fu fuVarE5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(e)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(d) == 0) {
                            gaVarD = hd.d(jsonReader, cxVar);
                        } else {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    z2 = z2;
                    break;
                case 1:
                    animatableValueB = hd.b(jsonReader, cxVar);
                    z2 = z2;
                    break;
                case 2:
                    gcVarG = hl.g(jsonReader, cxVar);
                    z2 = z2;
                    break;
                case 3:
                    cxVar.d("Lottie doesn't support 3D layers.");
                    fuVarE = hl.e(jsonReader, cxVar, z2);
                    if (fuVarE.getKeyframes().isEmpty()) {
                        fuVarE.getKeyframes().add(new jb(cxVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cxVar.b())));
                    } else {
                        if (((jb) fuVarE.getKeyframes().get(0)).j == 0) {
                            z = false;
                            fuVarE.getKeyframes().set(0, new jb(cxVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cxVar.b())));
                        }
                        z2 = z;
                        fuVar = fuVarE;
                    }
                    z = false;
                    z2 = z;
                    fuVar = fuVarE;
                    break;
                case 4:
                    fuVarE = hl.e(jsonReader, cxVar, z2);
                    if (fuVarE.getKeyframes().isEmpty()) {
                        fuVarE.getKeyframes().add(new jb(cxVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cxVar.b())));
                    } else {
                        if (((jb) fuVarE.getKeyframes().get(0)).j == 0) {
                            z = false;
                            fuVarE.getKeyframes().set(0, new jb(cxVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cxVar.b())));
                        }
                        z2 = z;
                        fuVar = fuVarE;
                    }
                    z = false;
                    z2 = z;
                    fuVar = fuVarE;
                    break;
                case 5:
                    gbVarD = hl.d(jsonReader, cxVar);
                    break;
                case 6:
                    fuVarE4 = hl.e(jsonReader, cxVar, z2);
                    break;
                case 7:
                    fuVarE5 = hl.e(jsonReader, cxVar, z2);
                    break;
                case 8:
                    fuVarE2 = hl.e(jsonReader, cxVar, z2);
                    break;
                case 9:
                    fuVarE3 = hl.e(jsonReader, cxVar, z2);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    z2 = z2;
                    break;
            }
        }
        if (z3) {
            jsonReader.endObject();
        }
        ga gaVar = c(gaVarD) ? null : gaVarD;
        AnimatableValue<PointF, PointF> animatableValue = b(animatableValueB) ? null : animatableValueB;
        fu fuVar2 = b(fuVar) ? null : fuVar;
        if (b(gcVarG)) {
            gcVarG = null;
        }
        return new gf(gaVar, animatableValue, gcVarG, fuVar2, gbVarD, fuVarE4, fuVarE5, c(fuVarE2) ? null : fuVarE2, a(fuVarE3) ? null : fuVarE3);
    }

    private static boolean c(ga gaVar) {
        if (gaVar != null) {
            return gaVar.isStatic() && gaVar.getKeyframes().get(0).j.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean b(AnimatableValue<PointF, PointF> animatableValue) {
        if (animatableValue != null) {
            return !(animatableValue instanceof gh) && animatableValue.isStatic() && animatableValue.getKeyframes().get(0).j.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean b(fu fuVar) {
        if (fuVar != null) {
            return fuVar.isStatic() && ((Float) ((jb) fuVar.getKeyframes().get(0)).j).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean b(gc gcVar) {
        if (gcVar != null) {
            return gcVar.isStatic() && ((jj) ((jb) gcVar.getKeyframes().get(0)).j).b(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(fu fuVar) {
        if (fuVar != null) {
            return fuVar.isStatic() && ((Float) ((jb) fuVar.getKeyframes().get(0)).j).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(fu fuVar) {
        if (fuVar != null) {
            return fuVar.isStatic() && ((Float) ((jb) fuVar.getKeyframes().get(0)).j).floatValue() == 0.0f;
        }
        return true;
    }
}
