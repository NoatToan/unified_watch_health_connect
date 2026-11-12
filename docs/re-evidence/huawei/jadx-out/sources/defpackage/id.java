package defpackage;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
class id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JsonReader.d f37502a = JsonReader.d.e("nm", "mm", "hd");

    static MergePaths e(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        boolean zNextBoolean = false;
        MergePaths.MergePathsMode mergePathsModeForId = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37502a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.nextInt());
            } else if (iSelectName == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        return new MergePaths(strNextString, mergePathsModeForId, zNextBoolean);
    }
}
