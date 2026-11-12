package defpackage;

import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import health.compact.a.ReleaseLogUtil;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes3.dex */
public class ofp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DateTimeFormatter f44292c = DateTimeFormatter.ofPattern("yyyyMMdd");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateTimeFormatter f44290a = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
    private static final int e = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Gson f44291b = new Gson();
    private static final SharedPreferences j = SharedStoreManager.a("data_traffic");
    private static final Map<String, String> h = new ConcurrentHashMap();
    private static final Map<String, Map<String, Map<String, Long>>> i = new ConcurrentHashMap();
    private static final Map<String, Map<String, Long>> d = new ConcurrentHashMap();

    public static void c(final String str, final long j2, final long j3) {
        if (!NetworkUtil.i() || TextUtils.isEmpty(str)) {
            return;
        }
        if (j2 > 0 || j3 > 0) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ofs
                @Override // java.lang.Runnable
                public final void run() {
                    ofp.c(ofp.j(str), j2 + j3);
                }
            });
        }
    }

    public static void e(final String str, final long j2) {
        if (!NetworkUtil.i() || TextUtils.isEmpty(str) || j2 <= 0) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: ofw
            @Override // java.lang.Runnable
            public final void run() {
                ofp.c(ofp.j(str), j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, long j2) {
        String strE = e();
        String str2 = strE + "total";
        Map<String, Map<String, Long>> mapComputeIfAbsent = i.computeIfAbsent(strE, new ofq());
        Map<String, Long> mapComputeIfAbsent2 = d.computeIfAbsent(str2, new Function() { // from class: ofy
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ofp.a(ofp.j, (String) obj);
            }
        });
        a(str, j2, mapComputeIfAbsent, mapComputeIfAbsent2);
        j.edit().putString(strE, a(mapComputeIfAbsent)).putString(str2, a(mapComputeIfAbsent2)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConcurrentHashMap<String, Long> a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return new ConcurrentHashMap<>();
        }
        return (ConcurrentHashMap) d(string, new TypeToken<ConcurrentHashMap<String, Long>>() { // from class: com.huawei.networkclient.util.DataTrafficUtils$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConcurrentHashMap<String, Map<String, Long>> g(String str) {
        String string = j.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return new ConcurrentHashMap<>();
        }
        return (ConcurrentHashMap) d(string, new TypeToken<ConcurrentHashMap<String, ConcurrentHashMap<String, Long>>>() { // from class: com.huawei.networkclient.util.DataTrafficUtils$2
        }.getType());
    }

    public static String c() {
        Map<String, String> map = h;
        String str = map.get("last");
        if (str != null) {
            return str;
        }
        String string = j.getString("last", null);
        if (string != null) {
            map.put("last", string);
        }
        return string;
    }

    private static String j(String str) {
        int iIndexOf = str.indexOf(63);
        return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
    }

    private static void a(String str, long j2, Map<String, Map<String, Long>> map, Map<String, Long> map2) {
        String str2;
        if (NetworkUtil.f()) {
            str2 = JsNetwork.NetworkType.MOBILE;
        } else {
            str2 = NetworkUtil.k() ? "wifi" : "other";
        }
        Map<String, Long> mapComputeIfAbsent = map.computeIfAbsent(str, new Function() { // from class: oft
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ofp.e((String) obj);
            }
        });
        mapComputeIfAbsent.merge(str2, Long.valueOf(j2), new BiFunction() { // from class: ofu
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Long.valueOf(Long.sum(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        });
        mapComputeIfAbsent.merge("total", Long.valueOf(j2), new BiFunction() { // from class: ofu
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Long.valueOf(Long.sum(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        });
        map2.merge(str2, Long.valueOf(j2), new BiFunction() { // from class: ofu
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Long.valueOf(Long.sum(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        });
        map2.merge("total", Long.valueOf(j2), new BiFunction() { // from class: ofu
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Long.valueOf(Long.sum(((Long) obj).longValue(), ((Long) obj2).longValue()));
            }
        });
    }

    static /* synthetic */ Map e(String str) {
        return new ConcurrentHashMap();
    }

    private static String e() {
        return LocalDate.now().format(f44292c);
    }

    private static String a() {
        return LocalDateTime.now().format(f44290a);
    }

    public static Map<String, Long> d(String str) {
        Map<String, Long> mapComputeIfAbsent = d.computeIfAbsent(str + "total", new Function() { // from class: ofv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ofp.a(ofp.j, (String) obj);
            }
        });
        if (mapComputeIfAbsent.get("total") == null || mapComputeIfAbsent.get("total").longValue() < Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE) {
            return null;
        }
        return mapComputeIfAbsent;
    }

    public static Map<String, Map<String, Long>> b(String str) {
        Map<String, Map<String, Long>> mapComputeIfAbsent = i.computeIfAbsent(str, new ofq());
        if (mapComputeIfAbsent.isEmpty()) {
            return null;
        }
        return d(mapComputeIfAbsent, 5);
    }

    private static Map<String, Map<String, Long>> d(Map<String, Map<String, Long>> map, int i2) {
        PriorityQueue priorityQueue = new PriorityQueue(Comparator.comparingLong(new ToLongFunction() { // from class: ofx
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((Long) ((Map) ((Map.Entry) obj).getValue()).getOrDefault("total", 0L)).longValue();
            }
        }));
        HashMap map2 = new HashMap();
        if (map != null) {
            Iterator<Map.Entry<String, Map<String, Long>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                priorityQueue.offer(it.next());
                if (priorityQueue.size() > i2) {
                    priorityQueue.poll();
                }
            }
            while (!priorityQueue.isEmpty()) {
                Map.Entry entry = (Map.Entry) priorityQueue.poll();
                map2.put((String) entry.getKey(), (Map) entry.getValue());
            }
        }
        return map2;
    }

    public static void b(String str, String str2) {
        i.clear();
        d.clear();
        SharedPreferences sharedPreferences = j;
        String string = sharedPreferences.getString(str, null);
        String string2 = sharedPreferences.getString(str + "total", null);
        String string3 = sharedPreferences.getString(str + "DFX", null);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
        editorEdit.putString(str, string);
        editorEdit.putString(str + "total", string2);
        editorEdit.putString(str + "DFX", string3);
        editorEdit.putString("last", str2);
        editorEdit.apply();
        h.put("last", str2);
    }

    public static String b() {
        String strE = e();
        SharedPreferences sharedPreferences = j;
        String string = sharedPreferences.getString(strE + "total", null);
        Map<String, Long> mapComputeIfAbsent = d.computeIfAbsent(strE + "total", new Function() { // from class: ofr
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ofp.a(ofp.j, (String) obj);
            }
        });
        if (mapComputeIfAbsent.isEmpty() || mapComputeIfAbsent.get("total") == null) {
            return "";
        }
        long jLongValue = mapComputeIfAbsent.get("total").longValue();
        if (jLongValue - sharedPreferences.getLong(strE + "DFX", 0L) < 10485760) {
            return "";
        }
        Map<String, Map<String, Long>> mapComputeIfAbsent2 = i.computeIfAbsent(strE, new ofq());
        if (mapComputeIfAbsent2.isEmpty()) {
            return "";
        }
        String strA = a(d(mapComputeIfAbsent2, 10));
        if (strA.isEmpty()) {
            return "";
        }
        sharedPreferences.edit().putLong(strE + "DFX", jLongValue).apply();
        return a() + string + strA;
    }

    private static <T> T d(String str, Type type) {
        if (str == null || str.trim().isEmpty()) {
            ReleaseLogUtil.c("R_DataTrafficUtils", "json is null");
            return (T) new ConcurrentHashMap();
        }
        try {
            return (T) f44291b.fromJson(str, type);
        } catch (JsonIOException | JsonSyntaxException | NullPointerException e2) {
            ReleaseLogUtil.b("R_DataTrafficUtils", "exception: ", ExceptionUtils.c(e2));
            return (T) new ConcurrentHashMap();
        }
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return f44291b.toJson(obj);
        } catch (JsonIOException | NullPointerException e2) {
            ReleaseLogUtil.b("R_DataTrafficUtils", "exception: ", ExceptionUtils.c(e2));
            return "";
        }
    }
}
