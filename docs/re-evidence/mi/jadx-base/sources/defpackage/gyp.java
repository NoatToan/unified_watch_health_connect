package defpackage;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class gyp extends pvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<c> f19473a;

    public static class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19474b;

        public a() {
            super();
        }

        @Override // gyp.c
        public Object a(svg svgVar) {
            return svgVar.p(this.f19474b);
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19475b;

        public b() {
            super();
        }

        @Override // gyp.c
        public Object a(svg svgVar) {
            return this.f19475b;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19476a;

        public c() {
        }

        public abstract Object a(svg svgVar);
    }

    public gyp(int i, ReadableMap readableMap, svg svgVar) {
        super(i, readableMap, svgVar);
        this.f19473a = c(readableMap.getArray("transform"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<c> c(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("property");
            Object[] objArr = 0;
            if (map.hasKey("nodeID")) {
                a aVar = new a();
                aVar.f19476a = string;
                aVar.f19474b = map.getInt("nodeID");
                arrayList.add(aVar);
            } else {
                b bVar = new b();
                bVar.f19476a = string;
                ReadableType type = map.getType("value");
                if (type == ReadableType.String) {
                    bVar.f19475b = map.getString("value");
                } else if (type == ReadableType.Array) {
                    bVar.f19475b = map.getArray("value");
                } else {
                    bVar.f19475b = Double.valueOf(map.getDouble("value"));
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.pvg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WritableArray evaluate() {
        ArrayList arrayList = new ArrayList(this.f19473a.size());
        for (c cVar : this.f19473a) {
            arrayList.add(JavaOnlyMap.of(cVar.f19476a, cVar.a(this.mNodesManager)));
        }
        return JavaOnlyArray.from(arrayList);
    }
}
