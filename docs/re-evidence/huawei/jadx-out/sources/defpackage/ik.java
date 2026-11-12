package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class ik {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f37731c = JsonReader.d.e("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static PolystarShape c(JsonReader jsonReader, cx cxVar, int i) throws IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        String strNextString = null;
        PolystarShape.Type typeForValue = null;
        fu fuVarE = null;
        AnimatableValue<PointF, PointF> animatableValueB = null;
        fu fuVarE2 = null;
        fu fuVarB = null;
        fu fuVarB2 = null;
        fu fuVarE3 = null;
        fu fuVarE4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f37731c)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    fuVarE = hl.e(jsonReader, cxVar, false);
                    break;
                case 3:
                    animatableValueB = hd.b(jsonReader, cxVar);
                    break;
                case 4:
                    fuVarE2 = hl.e(jsonReader, cxVar, false);
                    break;
                case 5:
                    fuVarB2 = hl.b(jsonReader, cxVar);
                    break;
                case 6:
                    fuVarE4 = hl.e(jsonReader, cxVar, false);
                    break;
                case 7:
                    fuVarB = hl.b(jsonReader, cxVar);
                    break;
                case 8:
                    fuVarE3 = hl.e(jsonReader, cxVar, false);
                    break;
                case 9:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 10:
                    z = jsonReader.nextInt() == 3;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new PolystarShape(strNextString, typeForValue, fuVarE, animatableValueB, fuVarE2, fuVarB, fuVarB2, fuVarE3, fuVarE4, zNextBoolean, z);
    }
}
