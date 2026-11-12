package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f36792a = JsonReader.d.e("nm", "p", "s", "hd", "d");

    static gi d(JsonReader jsonReader, cx cxVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        AnimatableValue<PointF, PointF> animatableValueB = null;
        fz fzVarC = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f36792a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                animatableValueB = hd.b(jsonReader, cxVar);
            } else if (iSelectName == 2) {
                fzVarC = hl.c(jsonReader, cxVar);
            } else if (iSelectName == 3) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName == 4) {
                z = jsonReader.nextInt() == 3;
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return new gi(strNextString, animatableValueB, fzVarC, z, zNextBoolean);
    }
}
