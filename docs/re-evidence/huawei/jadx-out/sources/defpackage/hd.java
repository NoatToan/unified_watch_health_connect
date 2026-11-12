package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class hd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f36438c = JsonReader.d.e("k", "x", "y");

    public static ga d(JsonReader jsonReader, cx cxVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(ic.a(jsonReader, cxVar));
            }
            jsonReader.endArray();
            ia.d(arrayList);
        } else {
            arrayList.add(new jb(hw.b(jsonReader, je.e())));
        }
        return new ga(arrayList);
    }

    static AnimatableValue<PointF, PointF> b(JsonReader jsonReader, cx cxVar) throws IOException {
        jsonReader.beginObject();
        ga gaVarD = null;
        fu fuVarB = null;
        boolean z = false;
        fu fuVarB2 = null;
        while (jsonReader.peek() != JsonReader.Token.END_OBJECT) {
            int iSelectName = jsonReader.selectName(f36438c);
            if (iSelectName == 0) {
                gaVarD = d(jsonReader, cxVar);
            } else if (iSelectName != 1) {
                if (iSelectName == 2) {
                    if (jsonReader.peek() == JsonReader.Token.STRING) {
                        jsonReader.skipValue();
                        z = true;
                    } else {
                        fuVarB = hl.b(jsonReader, cxVar);
                    }
                } else {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                }
            } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                z = true;
            } else {
                fuVarB2 = hl.b(jsonReader, cxVar);
            }
        }
        jsonReader.endObject();
        if (z) {
            cxVar.d("Lottie doesn't support expressions.");
        }
        return gaVarD != null ? gaVarD : new gh(fuVarB2, fuVarB);
    }
}
