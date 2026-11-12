package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class by9 implements snq<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final by9 f4721a = new by9();

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(sud.g(jsonReader) * f);
    }
}
