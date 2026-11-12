package defpackage;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.miui.circulate.device.api.DeviceInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.onetrack.util.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class vse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f37184a = JsonReader.a.a(Constants.DEVICE_TYPE_WEAR, "h", DeviceInfo.Builder.PrivateDataKey.IP, "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JsonReader.a f37185b = JsonReader.a.a("id", "layers", Constants.DEVICE_TYPE_WEAR, "h", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "u");
    public static final JsonReader.a c = JsonReader.a.a("list");
    public static final JsonReader.a d = JsonReader.a.a("cm", "tm", "dr");

    public static lse a(JsonReader jsonReader) throws IOException {
        float fE = emq.e();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat<vz9> sparseArrayCompat = new SparseArrayCompat<>();
        lse lseVar = new lse();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.d()) {
            switch (jsonReader.p(f37184a)) {
                case 0:
                    iNextInt = jsonReader.nextInt();
                    continue;
                case 1:
                    iNextInt2 = jsonReader.nextInt();
                    continue;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                case 3:
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    String[] strArrSplit = jsonReader.nextString().split(z.f14007a);
                    if (!emq.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        lseVar.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    break;
                case 6:
                    e(jsonReader, lseVar, arrayList, longSparseArray);
                    continue;
                case 7:
                    b(jsonReader, lseVar, map, map2);
                    continue;
                case 8:
                    d(jsonReader, map3);
                    continue;
                case 9:
                    c(jsonReader, lseVar, sparseArrayCompat);
                    continue;
                case 10:
                    f(jsonReader, arrayList2);
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    continue;
            }
            map3 = map3;
            arrayList2 = arrayList2;
        }
        lseVar.s(new Rect(0, 0, (int) (iNextInt * fE), (int) (iNextInt2 * fE)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, longSparseArray, map, map2, sparseArrayCompat, map3, arrayList2);
        return lseVar;
    }

    public static void b(JsonReader jsonReader, lse lseVar, Map<String, List<Layer>> map, Map<String, mte> map2) throws IOException {
        jsonReader.b();
        while (jsonReader.d()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (jsonReader.d()) {
                int iP = jsonReader.p(f37185b);
                if (iP == 0) {
                    strNextString = jsonReader.nextString();
                } else if (iP == 1) {
                    jsonReader.b();
                    while (jsonReader.d()) {
                        Layer layerB = t6e.b(jsonReader, lseVar);
                        longSparseArray.put(layerB.d(), layerB);
                        arrayList.add(layerB);
                    }
                    jsonReader.c();
                } else if (iP == 2) {
                    iNextInt = jsonReader.nextInt();
                } else if (iP == 3) {
                    iNextInt2 = jsonReader.nextInt();
                } else if (iP == 4) {
                    strNextString2 = jsonReader.nextString();
                } else if (iP != 5) {
                    jsonReader.s();
                    jsonReader.skipValue();
                } else {
                    strNextString3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                mte mteVar = new mte(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(mteVar.d(), mteVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.c();
    }

    public static void c(JsonReader jsonReader, lse lseVar, SparseArrayCompat<vz9> sparseArrayCompat) throws IOException {
        jsonReader.b();
        while (jsonReader.d()) {
            vz9 vz9VarA = wz9.a(jsonReader, lseVar);
            sparseArrayCompat.put(vz9VarA.hashCode(), vz9VarA);
        }
        jsonReader.c();
    }

    public static void d(JsonReader jsonReader, Map<String, sz9> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.d()) {
            if (jsonReader.p(c) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.d()) {
                    sz9 sz9VarA = b0a.a(jsonReader);
                    map.put(sz9VarA.b(), sz9VarA);
                }
                jsonReader.c();
            }
        }
        jsonReader.endObject();
    }

    public static void e(JsonReader jsonReader, lse lseVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.b();
        int i = 0;
        while (jsonReader.d()) {
            Layer layerB = t6e.b(jsonReader, lseVar);
            if (layerB.f() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(layerB);
            longSparseArray.put(layerB.d(), layerB);
            if (i > 4) {
                rpe.c("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.c();
    }

    public static void f(JsonReader jsonReader, List<g5f> list) throws IOException {
        jsonReader.b();
        while (jsonReader.d()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.d()) {
                int iP = jsonReader.p(d);
                if (iP == 0) {
                    strNextString = jsonReader.nextString();
                } else if (iP == 1) {
                    fNextDouble = (float) jsonReader.nextDouble();
                } else if (iP != 2) {
                    jsonReader.s();
                    jsonReader.skipValue();
                } else {
                    fNextDouble2 = (float) jsonReader.nextDouble();
                }
            }
            jsonReader.endObject();
            list.add(new g5f(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.c();
    }
}
