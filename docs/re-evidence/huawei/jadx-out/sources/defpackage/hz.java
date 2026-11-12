package defpackage;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.network.embedded.c0;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class hz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JsonReader.d f37357b = JsonReader.d.e("w", "h", c0.h, "op", "fr", "v", "layers", ContentTemplateRecord.ASSETS, "fonts", "chars", "markers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static JsonReader.d f37358c = JsonReader.d.e("id", "layers", "w", "h", "p", "u");
    private static final JsonReader.d d = JsonReader.d.e("list");
    private static final JsonReader.d e = JsonReader.d.e("cm", "tm", "dr");

    public static cx c(JsonReader jsonReader) throws IOException {
        float fE = je.e();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat<fq> sparseArrayCompat = new SparseArrayCompat<>();
        cx cxVar = new cx();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f37357b)) {
                case 0:
                    iNextInt = jsonReader.nextInt();
                    continue;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 1:
                    iNextInt2 = jsonReader.nextInt();
                    continue;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 3:
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 4:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    continue;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
                case 5:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!je.a(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        cxVar.d("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    b(jsonReader, cxVar, arrayList, longSparseArray);
                    break;
                case 7:
                    d(jsonReader, cxVar, map, map2);
                    break;
                case 8:
                    e(jsonReader, map3);
                    break;
                case 9:
                    a(jsonReader, cxVar, sparseArrayCompat);
                    break;
                case 10:
                    c(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                    map3 = map3;
                    arrayList2 = arrayList2;
                    break;
            }
            map3 = map3;
            arrayList2 = arrayList2;
        }
        cxVar.b(new Rect(0, 0, (int) (iNextInt * fE), (int) (iNextInt2 * fE)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, longSparseArray, map, map2, je.e(), sparseArrayCompat, map3, arrayList2);
        return cxVar;
    }

    private static void b(JsonReader jsonReader, cx cxVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer layerC = hy.c(jsonReader, cxVar);
            if (layerC.h() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(layerC);
            longSparseArray.put(layerC.d(), layerC);
            if (i > 4) {
                iy.d("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    private static void d(JsonReader jsonReader, cx cxVar, Map<String, List<Layer>> map, Map<String, ed> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (jsonReader.hasNext()) {
                int iSelectName = jsonReader.selectName(f37358c);
                if (iSelectName == 0) {
                    strNextString = jsonReader.nextString();
                } else if (iSelectName == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        Layer layerC = hy.c(jsonReader, cxVar);
                        longSparseArray.put(layerC.d(), layerC);
                        arrayList.add(layerC);
                    }
                    jsonReader.endArray();
                } else if (iSelectName == 2) {
                    iNextInt = jsonReader.nextInt();
                } else if (iSelectName == 3) {
                    iNextInt2 = jsonReader.nextInt();
                } else if (iSelectName == 4) {
                    strNextString2 = jsonReader.nextString();
                } else if (iSelectName == 5) {
                    strNextString3 = jsonReader.nextString();
                } else {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                ed edVar = new ed(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(edVar.b(), edVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void e(JsonReader jsonReader, Map<String, fs> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(d) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    fs fsVarC = hs.c(jsonReader);
                    map.put(fsVarC.a(), fsVarC);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void a(JsonReader jsonReader, cx cxVar, SparseArrayCompat<fq> sparseArrayCompat) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            fq fqVarA = hq.a(jsonReader, cxVar);
            sparseArrayCompat.put(fqVarA.hashCode(), fqVarA);
        }
        jsonReader.endArray();
    }

    private static void c(JsonReader jsonReader, List<fw> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                int iSelectName = jsonReader.selectName(e);
                if (iSelectName == 0) {
                    strNextString = jsonReader.nextString();
                } else if (iSelectName == 1) {
                    fNextDouble = (float) jsonReader.nextDouble();
                } else if (iSelectName == 2) {
                    fNextDouble2 = (float) jsonReader.nextDouble();
                } else {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            list.add(new fw(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
