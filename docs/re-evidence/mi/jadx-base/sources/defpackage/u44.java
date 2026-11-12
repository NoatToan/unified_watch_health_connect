package defpackage;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class u44 implements snq<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u44 f35356a = new u44();

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.n() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.b();
        }
        double dNextDouble = jsonReader.nextDouble();
        double dNextDouble2 = jsonReader.nextDouble();
        double dNextDouble3 = jsonReader.nextDouble();
        double dNextDouble4 = jsonReader.n() == JsonReader.Token.NUMBER ? jsonReader.nextDouble() : 1.0d;
        if (z) {
            jsonReader.c();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
