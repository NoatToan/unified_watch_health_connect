package defpackage;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class rqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f32800a = JsonReader.a.a("nm", "mm", "hd");

    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        boolean zL = false;
        MergePaths.MergePathsMode mergePathsModeForId = null;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f32800a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
            } else if (iP == 1) {
                mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.nextInt());
            } else if (iP != 2) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                zL = jsonReader.l();
            }
        }
        return new MergePaths(strNextString, mergePathsModeForId, zL);
    }
}
