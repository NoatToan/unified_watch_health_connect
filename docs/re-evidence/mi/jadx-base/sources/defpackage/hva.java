package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReadableMap f20507b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Integer f;
    public final List<hva> g;
    public final List<hva> h;

    public hva(Integer num, ReadableMap readableMap, Double d, Double d2, Double d3, Integer num2, List<hva> list, List<hva> list2) {
        this.f20506a = num;
        this.f20507b = readableMap;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = num2;
        this.g = list;
        this.h = list2;
    }

    public static List<hva> a(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(b(readableArray.getMap(i)));
        }
        return arrayList;
    }

    public static hva b(ReadableMap readableMap) {
        return new hva(Integer.valueOf(readableMap.getInt("shader")), readableMap.getMap("uniforms"), Double.valueOf(readableMap.getDouble("width")), Double.valueOf(readableMap.getDouble("height")), Double.valueOf(readableMap.getDouble("pixelRatio")), Integer.valueOf(readableMap.getInt("fboId")), a(readableMap.getArray("contextChildren")), a(readableMap.getArray("children")));
    }
}
