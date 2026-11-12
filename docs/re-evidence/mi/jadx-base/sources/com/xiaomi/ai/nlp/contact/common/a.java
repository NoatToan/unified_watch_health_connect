package com.xiaomi.ai.nlp.contact.common;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f11046b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZhCharPinyinUtils f11047a;

    /* JADX INFO: renamed from: com.xiaomi.ai.nlp.contact.common.a$a, reason: collision with other inner class name */
    public static class C0349a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient List<ZhCharPinyinUtils.a> f11048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11049b;
        public String c;
        public String d;
        public String e;
        public transient List<String> f;
        public transient List<String> g;
        public transient List<String> h;
        public transient String i;
        public transient List<String> j;

        public C0349a(List<ZhCharPinyinUtils.a> list) {
            ArrayList arrayList = new ArrayList();
            this.f11048a = arrayList;
            arrayList.addAll(list);
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = new ArrayList();
            this.j = new ArrayList();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                ZhCharPinyinUtils.a aVar = list.get(i);
                if (i != 0) {
                    sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
                    sb3.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
                    sb4.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
                }
                String str = aVar.f11045b + "," + aVar.c;
                String str2 = aVar.f11045b + aVar.c;
                String str3 = aVar.f11045b + "," + aVar.c + "," + aVar.f;
                sb.append(str);
                sb2.append(str2);
                sb3.append(str3);
                sb4.append(aVar.f);
                sb5.append(aVar.f11045b);
                this.f.add(str);
                this.g.add(str2);
                this.h.add(str3);
                this.j.add(aVar.f11045b);
                this.j.add(aVar.c);
            }
            this.f11049b = sb.toString();
            this.c = sb2.toString();
            this.i = sb5.toString();
            this.d = sb3.toString();
            this.e = sb4.toString();
        }

        public String a() {
            return this.i;
        }

        public String b() {
            return this.f11049b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.e;
        }

        public List<ZhCharPinyinUtils.a> e() {
            return this.f11048a;
        }

        public List<String> f() {
            return this.g;
        }
    }

    public a(ZhCharPinyinUtils zhCharPinyinUtils) {
        this.f11047a = zhCharPinyinUtils;
    }

    public static void a() {
        f11046b = null;
    }

    public static a b() {
        if (f11046b == null) {
            synchronized (a.class) {
                if (f11046b == null) {
                    try {
                        f11046b = new a(new ZhCharPinyinUtils());
                    } catch (IOException e) {
                        throw new ExceptionInInitializerError(e);
                    }
                }
            }
        }
        return f11046b;
    }

    public final List<ZhCharPinyinUtils.a> c(String str) {
        ZhCharPinyinUtils.a aVar = new ZhCharPinyinUtils.a(str, str, str, Integer.toHexString(str.charAt(0)), ZhCharPinyinUtils.ZhCharType.RARELY_USED.value());
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return arrayList;
    }

    public final void d(List<List<ZhCharPinyinUtils.a>> list, int i, List<ZhCharPinyinUtils.a> list2, List<C0349a> list3) {
        if (list3.size() >= 100) {
            return;
        }
        if (i >= list.size()) {
            list3.add(new C0349a(list2));
            return;
        }
        Iterator<ZhCharPinyinUtils.a> it = list.get(i).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            d(list, i + 1, list2, list3);
            list2.remove(list2.size() - 1);
        }
    }

    public List<C0349a> e(String str) {
        return f(str, false);
    }

    public List<C0349a> f(String str, boolean z) {
        return g(str, z, true);
    }

    public List<C0349a> g(String str, boolean z, boolean z2) {
        List<List<ZhCharPinyinUtils.a>> listH = h(str, z2, z);
        ArrayList arrayList = new ArrayList();
        d(listH, 0, new ArrayList(), arrayList);
        return arrayList;
    }

    public final List<List<ZhCharPinyinUtils.a>> h(String str, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            Character chValueOf = Character.valueOf(cCharAt);
            if ((cCharAt < 19968 || cCharAt > 40869) && (cCharAt < '0' || cCharAt > '9')) {
                str2 = str2 + chValueOf;
            } else {
                if (!str2.isEmpty()) {
                    arrayList.add(c(str2));
                    str2 = "";
                }
                arrayList.add(this.f11047a.d(Character.valueOf(str.charAt(i)), z, z2));
            }
        }
        if (!str2.isEmpty()) {
            arrayList.add(c(str2));
        }
        return arrayList;
    }
}
