package defpackage;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zxp extends dc1 {
    public final com.facebook.react.animated.a e;
    public final List<d> f;

    public class b extends d {
        public int c;

        public b() {
            super();
        }
    }

    public class c extends d {
        public double c;

        public c() {
            super();
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41789a;

        public d() {
        }
    }

    public zxp(ReadableMap readableMap, com.facebook.react.animated.a aVar) {
        ReadableArray array = readableMap.getArray("transforms");
        this.f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                b bVar = new b();
                bVar.f41789a = string;
                bVar.c = map.getInt("nodeTag");
                this.f.add(bVar);
            } else {
                c cVar = new c();
                cVar.f41789a = string;
                cVar.c = map.getDouble("value");
                this.f.add(cVar);
            }
        }
        this.e = aVar;
    }

    public void f(JavaOnlyMap javaOnlyMap) {
        double dI;
        ArrayList arrayList = new ArrayList(this.f.size());
        for (d dVar : this.f) {
            if (dVar instanceof b) {
                dc1 dc1VarL = this.e.l(((b) dVar).c);
                if (dc1VarL == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
                if (!(dc1VarL instanceof hnq)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + dc1VarL.getClass());
                }
                dI = ((hnq) dc1VarL).i();
            } else {
                dI = ((c) dVar).c;
            }
            arrayList.add(JavaOnlyMap.of(dVar.f41789a, Double.valueOf(dI)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
