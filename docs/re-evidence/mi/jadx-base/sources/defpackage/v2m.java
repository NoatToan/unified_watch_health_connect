package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v2m implements snq<u2m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2m f36416a = new v2m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f36417b = JsonReader.a.a(PluginDeviceInfo.FICONON, "v", "i", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER);

    @Override // defpackage.snq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u2m a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.n() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.beginObject();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zL = false;
        while (jsonReader.d()) {
            int iP = jsonReader.p(f36417b);
            if (iP == 0) {
                zL = jsonReader.l();
            } else if (iP == 1) {
                listF = sud.f(jsonReader, f);
            } else if (iP == 2) {
                listF2 = sud.f(jsonReader, f);
            } else if (iP != 3) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                listF3 = sud.f(jsonReader, f);
            }
        }
        jsonReader.endObject();
        if (jsonReader.n() == JsonReader.Token.END_ARRAY) {
            jsonReader.c();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new u2m(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listF.get(i);
            int i2 = i - 1;
            arrayList.add(new d55(d5g.a(listF.get(i2), listF3.get(i2)), d5g.a(pointF2, listF2.get(i)), pointF2));
        }
        if (zL) {
            PointF pointF3 = listF.get(0);
            int i3 = size - 1;
            arrayList.add(new d55(d5g.a(listF.get(i3), listF3.get(i3)), d5g.a(pointF3, listF2.get(0)), pointF3));
        }
        return new u2m(pointF, zL, arrayList);
    }
}
