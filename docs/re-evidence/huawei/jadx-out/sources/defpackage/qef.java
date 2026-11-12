package defpackage;

import android.content.Context;
import com.huawei.taboo.TabooReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class qef {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile qef f46055c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f46057b;
    private d d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<String, HashMap<String, String>> f46056a = null;
    private List<String> e = null;

    public class d {
        private HashMap<String, String> e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f46058a = new ArrayList();
        private List<String> d = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f46060c = new ArrayList();

        public d(HashMap<String, String> map) {
            this.e = new HashMap<>();
            if (map.isEmpty()) {
                return;
            }
            this.e = map;
            e(map.get(TabooReader.ParamType.CITY_NAME.getScopeName()), map.get(TabooReader.ParamType.LANGUAGE_NAME.getScopeName()), map.get(TabooReader.ParamType.REGION_NAME.getScopeName()));
        }

        private void e(String str, String str2, String str3) {
            if (str != null && !str.isEmpty()) {
                this.f46058a = Arrays.asList(str.split(","));
            }
            if (str2 != null && !str2.isEmpty()) {
                this.d = Arrays.asList(str2.split(","));
            }
            if (str3 == null || str3.isEmpty()) {
                return;
            }
            this.f46060c = Arrays.asList(str3.split(","));
        }

        public List<String> a() {
            return this.f46058a;
        }

        public List<String> b() {
            return this.d;
        }

        public List<String> d() {
            return this.f46060c;
        }

        public String a(String str) {
            HashMap<String, String> map = this.e;
            if (map != null) {
                return map.get(str);
            }
            return "";
        }
    }

    private qef(Context context) {
        this.f46057b = context;
    }

    public static qef b(Context context) {
        if (f46055c == null) {
            synchronized (qef.class) {
                if (f46055c == null) {
                    f46055c = new qef(context);
                    f46055c.e = qel.c(context);
                    qef qefVar = f46055c;
                    qef qefVar2 = f46055c;
                    qefVar2.getClass();
                    qefVar.d = qefVar2.new d(qel.b(context));
                    if (f46055c.d.e == null || f46055c.d.e.isEmpty()) {
                        f46055c = null;
                    }
                }
            }
        }
        return f46055c;
    }

    public String a(String str, String str2) {
        HashMap<String, String> map;
        if (this.f46056a == null) {
            this.f46056a = new WeakHashMap<>();
        }
        if (this.f46056a.containsKey(str) && (map = this.f46056a.get(str)) != null && map.containsKey(str2)) {
            return map.get(str2);
        }
        HashMap<String, String> mapE = new qel().e(str, this.f46057b);
        if (mapE.isEmpty()) {
            return "";
        }
        this.f46056a.put(str, mapE);
        return mapE.get(str2);
    }

    public d b() {
        return this.d;
    }

    public List<String> c() {
        return this.e;
    }

    public Context e() {
        return this.f46057b;
    }
}
