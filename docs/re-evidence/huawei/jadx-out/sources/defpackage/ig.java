package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class ig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f37579c = JsonReader.d.e("nm", "p", "s", "r", "hd");

    static gj b(JsonReader jsonReader, cx cxVar) throws IOException {
        String strNextString = null;
        AnimatableValue<PointF, PointF> animatableValueB = null;
        fz fzVarC = null;
        fu fuVarB = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37579c);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                animatableValueB = hd.b(jsonReader, cxVar);
            } else if (iSelectName == 2) {
                fzVarC = hl.c(jsonReader, cxVar);
            } else if (iSelectName == 3) {
                fuVarB = hl.b(jsonReader, cxVar);
            } else if (iSelectName == 4) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        return new gj(strNextString, animatableValueB, fzVarC, fuVarB, zNextBoolean);
    }
}
