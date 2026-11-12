package com.xiaomi.ai.nlp.contact.common;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.SensorHelper;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ZhCharPinyinUtils {
    public static final Map<String, String> c;
    public static final Map<String, String> d;
    public static final Map<String, a> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Character, List<a>> f11042a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Character, List<a>> f11043b = new HashMap();

    public enum ZhCharType {
        RARELY_USED(0),
        FREQUENTLY_USED(1),
        LAST_NAME(2);

        private int value;

        ZhCharType(int i) {
            this.value = i;
        }

        public static ZhCharType findByValue(int i) {
            if (i == 0) {
                return RARELY_USED;
            }
            if (i == 1) {
                return FREQUENTLY_USED;
            }
            if (i == 2) {
                return LAST_NAME;
            }
            throw new IllegalArgumentException("zh char type invalid: " + i);
        }

        public int value() {
            return this.value;
        }
    }

    static {
        HashMap map = new HashMap();
        c = map;
        HashMap map2 = new HashMap();
        d = map2;
        HashMap map3 = new HashMap();
        e = map3;
        map.put("sh", "s");
        map.put("s", "sh");
        map.put("ch", PluginDeviceInfo.FICONON);
        map.put(PluginDeviceInfo.FICONON, "ch");
        map.put("zh", "z");
        map.put("z", "zh");
        map.put("n", e.f13808a);
        map.put(e.f13808a, "n");
        map2.put("ang", "an");
        map2.put("an", "ang");
        map2.put("eng", "en");
        map2.put("en", "eng");
        map2.put("ing", "in");
        map2.put("in", "ing");
        map2.put("iang", "ian");
        map2.put("ian", "iang");
        map2.put("uang", "uan");
        map2.put("uan", "uang");
        map3.put("f,a", new a("h,ua", "h", "ua", "", 0));
        map3.put("h,ua", new a("f,a", PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FMODEL, "", 0));
        map3.put("f,ei", new a("h,ui", "h", SensorHelper.INTERVAL_UI, "", 0));
        map3.put("h,ui", new a("f,ei", PluginDeviceInfo.FBLUETOOTHPAIR, "ei", "", 0));
        map3.put("f,u", new a("h,u", "h", "u", "", 0));
        map3.put("h,u", new a("f,u", PluginDeviceInfo.FBLUETOOTHPAIR, "u", "", 0));
    }

    public ZhCharPinyinUtils() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        HashSet hashSet = new HashSet();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pinyin/hzpy-utf8.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                        for (Map.Entry<Character, List<a>> entry : this.f11042a.entrySet()) {
                            Character key = entry.getKey();
                            HashSet hashSet2 = new HashSet();
                            Iterator<a> it = entry.getValue().iterator();
                            while (it.hasNext()) {
                                hashSet2.add(it.next().f11044a);
                            }
                            Iterator<a> it2 = entry.getValue().iterator();
                            while (it2.hasNext()) {
                                for (a aVar : it2.next().b()) {
                                    if (!hashSet2.contains(aVar.f11044a) && hashSet.contains(aVar.f11044a)) {
                                        e(key, aVar, this.f11043b);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    if (!line.isEmpty() && !line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                        String[] strArrSplit = line.split(",");
                        if (strArrSplit.length != 7) {
                            throw new IOException("hzpy data format error: " + line);
                        }
                        Character chValueOf = Character.valueOf(strArrSplit[0].charAt(0));
                        a aVar2 = new a(strArrSplit[1], strArrSplit[2], strArrSplit[3], strArrSplit[4], Integer.parseInt(strArrSplit[5]), strArrSplit[6]);
                        e(chValueOf, aVar2, this.f11042a);
                        hashSet.add(aVar2.f11044a);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    if (resourceAsStream != null) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public List<a> d(Character ch, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (this.f11042a.containsKey(ch)) {
            if (z) {
                arrayList.addAll(this.f11042a.get(ch));
            } else {
                arrayList.add(this.f11042a.get(ch).get(0));
            }
        }
        if (z2 && this.f11043b.containsKey(ch)) {
            if (z) {
                arrayList.addAll(this.f11043b.get(ch));
            } else {
                arrayList.add(this.f11043b.get(ch).get(0));
            }
        }
        if (arrayList.isEmpty()) {
            String string = ch.toString();
            arrayList.add(new a(string, string, string, Integer.toHexString(ch.charValue()), ZhCharType.RARELY_USED.value()));
        }
        return arrayList;
    }

    public final void e(Character ch, a aVar, Map<Character, List<a>> map) {
        if (!map.containsKey(ch)) {
            map.put(ch, new ArrayList());
        }
        if (map.get(ch).contains(aVar)) {
            return;
        }
        map.get(ch).add(aVar);
    }

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11045b;
        public final String c;
        public final String d;
        public final ZhCharType e;
        public final String f;

        public a(String str, String str2, String str3, String str4, int i) {
            this.f11044a = str;
            this.f11045b = str2;
            this.c = str3;
            this.d = str4;
            this.e = ZhCharType.findByValue(i);
            this.f = "1";
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f11044a.compareTo(aVar.f11044a);
        }

        public List<a> b() {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(this.f11045b);
            if (ZhCharPinyinUtils.c.containsKey(this.f11045b)) {
                arrayList.add(ZhCharPinyinUtils.c.get(this.f11045b));
            }
            ArrayList<String> arrayList2 = new ArrayList();
            arrayList2.add(this.c);
            if (ZhCharPinyinUtils.d.containsKey(this.c)) {
                arrayList2.add(ZhCharPinyinUtils.d.get(this.c));
            }
            ArrayList arrayList3 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (String str : arrayList) {
                for (String str2 : arrayList2) {
                    String str3 = this.c.equals(this.f11044a) ? str2 : str + str2;
                    hashSet.add(str3);
                    arrayList3.add(new a(str3, str, str2, this.d, this.e.value()));
                }
            }
            if (ZhCharPinyinUtils.e.containsKey(this.f11044a)) {
                a aVar = (a) ZhCharPinyinUtils.e.get(this.f11044a);
                if (!hashSet.contains(aVar.f11044a)) {
                    arrayList3.add(new a(aVar.f11044a, aVar.f11045b, aVar.c, this.d, this.e.value()));
                }
            }
            return arrayList3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.f11044a;
            String str2 = ((a) obj).f11044a;
            if (str != null) {
                return str.equals(str2);
            }
            return str2 == null;
        }

        public int hashCode() {
            String str = this.f11044a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public a(String str, String str2, String str3, String str4, int i, String str5) {
            this.f11044a = str;
            this.f11045b = str2;
            this.c = str3;
            this.d = str4;
            this.e = ZhCharType.findByValue(i);
            this.f = str5;
        }
    }
}
