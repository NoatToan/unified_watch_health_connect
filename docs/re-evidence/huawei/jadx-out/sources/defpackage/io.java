package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
class io {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JsonReader.d f37889c = JsonReader.d.e("nm", "c", "o", "fillEnabled", "r", "hd");

    static gn a(JsonReader jsonReader, cx cxVar) throws IOException {
        gb gbVar = null;
        String strNextString = null;
        fx fxVarE = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37889c);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                fxVarE = hl.e(jsonReader, cxVar);
            } else if (iSelectName == 2) {
                gbVar = hl.d(jsonReader, cxVar);
            } else if (iSelectName == 3) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName == 4) {
                iNextInt = jsonReader.nextInt();
            } else if (iSelectName == 5) {
                zNextBoolean2 = jsonReader.nextBoolean();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (gbVar == null) {
            gbVar = new gb(Collections.singletonList(new jb(100)));
        }
        return new gn(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, fxVarE, gbVar, zNextBoolean2);
    }
}
