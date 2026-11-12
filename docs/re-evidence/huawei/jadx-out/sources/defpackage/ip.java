package defpackage;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.parser.ValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ip implements ValueParser<gq> {
    public static final ip d = new ip();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37937b = JsonReader.d.e("c", "v", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "o");

    private ip() {
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gq parse(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listA = null;
        List<PointF> listA2 = null;
        List<PointF> listA3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f37937b);
            if (iSelectName == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName == 1) {
                listA = hw.a(jsonReader, f);
            } else if (iSelectName == 2) {
                listA2 = hw.a(jsonReader, f);
            } else if (iSelectName == 3) {
                listA3 = hw.a(jsonReader, f);
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonReader.Token.END_ARRAY) {
            jsonReader.endArray();
        }
        if (listA == null || listA2 == null || listA3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listA.isEmpty()) {
            return new gq(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listA.size();
        PointF pointF = listA.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listA.get(i);
            int i2 = i - 1;
            arrayList.add(new fr(jc.a(listA.get(i2), listA3.get(i2)), jc.a(pointF2, listA2.get(i)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listA.get(0);
            int i3 = size - 1;
            arrayList.add(new fr(jc.a(listA.get(i3), listA3.get(i3)), jc.a(pointF3, listA2.get(0)), pointF3));
        }
        return new gq(pointF, zNextBoolean, arrayList);
    }
}
