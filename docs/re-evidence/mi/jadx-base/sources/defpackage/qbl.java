package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class qbl implements snq<pbl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qbl f31344a = new qbl();

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pbl a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.n() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.b();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.d()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.c();
        }
        return new pbl((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
