package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class r2i implements snq<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2i f32111a = new r2i();

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenN = jsonReader.n();
        if (tokenN != JsonReader.Token.BEGIN_ARRAY && tokenN != JsonReader.Token.BEGIN_OBJECT) {
            if (tokenN == JsonReader.Token.NUMBER) {
                PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                while (jsonReader.d()) {
                    jsonReader.skipValue();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenN);
        }
        return sud.e(jsonReader, f);
    }
}
