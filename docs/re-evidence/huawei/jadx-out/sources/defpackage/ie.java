package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class ie implements ValueParser<PointF> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ie f37525b = new ie();

    private ie() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF parse(JsonReader jsonReader, float f) throws IOException {
        return hw.b(jsonReader, f);
    }
}
