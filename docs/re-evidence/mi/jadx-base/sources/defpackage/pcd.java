package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class pcd implements snq<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pcd f30243a = new pcd();

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(sud.g(jsonReader) * f));
    }
}
