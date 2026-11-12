package com.garmin.sync;

import am.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.gncs.NotificationConstants;
import com.google.common.net.HttpHeaders;
import d53.u;
import fy2.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o53.r;
import o53.s;
import o53.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.h0;
import p13.u0;
import p13.w;
import p13.y;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/garmin/sync/UploadConfigurationLoader;", "", "", "loggingPrefix", "Lcom/garmin/sync/UploadConfigurationLoader$a;", "callback", "Landroid/content/Context;", "appContext", "<init>", "(Ljava/lang/String;Lcom/garmin/sync/UploadConfigurationLoader$a;Landroid/content/Context;)V", "a", "b", "UploadConfigurationException", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UploadConfigurationLoader {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f52783g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f52784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f52785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f52786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap<Long, Set<String>> f52787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<Long, UploadConfigurationException> f52788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap<Long, r<Map<String, String>>> f52789f;

    public interface a {
        String d();

        boolean e();

        String f();

        zi2.a g();
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52799a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zi2.a.TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zi2.a.TEST_SSO_CHINA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f52799a = iArr;
        }
    }

    public UploadConfigurationLoader(String str, a aVar, Context context) {
        str.getClass();
        aVar.getClass();
        context.getClass();
        this.f52784a = aVar;
        this.f52785b = context;
        Logger logger = LoggerFactory.getLogger(str.concat("UploadEndpointConfig"));
        logger.getClass();
        this.f52786c = logger;
        this.f52787d = new ConcurrentHashMap<>();
        this.f52788e = new ConcurrentHashMap<>();
        this.f52789f = new ConcurrentHashMap<>();
    }

    public final Map<String, List<String>> a() {
        String str;
        PackageInfo packageInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HttpHeaders.ACCEPT, w.c("application/json"));
        Context context = this.f52785b;
        linkedHashMap.put(HttpHeaders.USER_AGENT, w.c(wc2.c.b(context, "util-sync", "3.9.0")));
        nd2.a.f125408a.getClass();
        HashMap map = new HashMap(5);
        map.put("Garmin-Client-Name", context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null || (str = packageInfo.versionName) == null) {
            str = PrivacyUpdateRequestError.UNKNOWN;
        }
        map.put("Garmin-Client-Version", str);
        map.put("Garmin-Client-Platform", "Android");
        map.put("Garmin-Client-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), w.c(entry.getValue()));
        }
        if (this.f52784a.e()) {
            linkedHashMap.put("Sync-Type", w.c("background"));
        }
        return u0.m(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0166 A[EDGE_INSN: B:113:0x0166->B:67:0x0166 BREAK  A[LOOP:1: B:64:0x014d->B:66:0x0155], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:27:0x0069, B:29:0x006d), top: B:102:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: JSONException -> 0x00b4, TryCatch #2 {JSONException -> 0x00b4, blocks: (B:36:0x0088, B:38:0x009d, B:40:0x00ad, B:46:0x00bb, B:56:0x00d7, B:58:0x00ea), top: B:104:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[Catch: JSONException -> 0x00b4, TryCatch #2 {JSONException -> 0x00b4, blocks: (B:36:0x0088, B:38:0x009d, B:40:0x00ad, B:46:0x00bb, B:56:0x00d7, B:58:0x00ea), top: B:104:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: JSONException -> 0x00b4, TryCatch #2 {JSONException -> 0x00b4, blocks: (B:36:0x0088, B:38:0x009d, B:40:0x00ad, B:46:0x00bb, B:56:0x00d7, B:58:0x00ea), top: B:104:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155 A[LOOP:1: B:64:0x014d->B:66:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e A[LOOP:2: B:70:0x0188->B:72:0x018e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3 A[Catch: JSONException -> 0x01f1, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01f1, blocks: (B:79:0x01c6, B:81:0x01d3, B:84:0x01da, B:87:0x01f3), top: B:100:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01f3, please report this as an issue */
    @SuppressLint({"ApplySharedPref"})
    public final Serializable b(long j8, v13.c cVar) throws Throwable {
        fy2.a aVar;
        UploadConfigurationLoader uploadConfigurationLoader;
        long j14;
        String str;
        Logger logger;
        UploadConfigurationException uploadConfigurationException;
        String strOptString;
        Logger logger2;
        HashMap map;
        ArrayList arrayList;
        Iterator it;
        boolean zHasNext;
        b bVar;
        SharedPreferences.Editor editorEdit;
        JSONArray jSONArray;
        HashMap map2;
        int length;
        int i14;
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        String strV;
        int i15;
        int i16;
        if (cVar instanceof fy2.a) {
            aVar = (fy2.a) cVar;
            int i17 = aVar.f73943e;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                aVar.f73943e = i17 - Integer.MIN_VALUE;
            } else {
                aVar = new fy2.a(this, cVar);
            }
        } else {
            aVar = new fy2.a(this, cVar);
        }
        fy2.a aVar2 = aVar;
        Object objE0 = aVar2.f73941c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i18 = aVar2.f73943e;
        int i19 = 0;
        int i24 = 1;
        if (i18 == 0) {
            o13.r.b(objE0);
            boolean z14 = c(j8) != null;
            try {
                aVar2.f73939a = this;
                aVar2.f73940b = j8;
                aVar2.f73943e = 1;
                x53.c cVar2 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new com.garmin.sync.a(this, j8, z14, null), aVar2);
                if (objE0 == aVar3) {
                    return aVar3;
                }
                uploadConfigurationLoader = this;
                j14 = j8;
                str = (String) objE0;
                if (str == null) {
                    return uploadConfigurationLoader.c(j14);
                }
                if (d53.w.z(str, "DataTypes", false)) {
                    logger = uploadConfigurationLoader.f52786c;
                    strOptString = new JSONObject(str).optString("ExceptionMessage");
                    if (strOptString != null) {
                        logger.debug("Remote device exception");
                        uploadConfigurationException = new UploadConfigurationException(UploadConfigurationException.a.REMOTE_DEVICE_EXCEPTION, "Invalid unit ID (" + j14 + ")", null, null, 12, null);
                    } else {
                        logger.debug("Remote device exception");
                        uploadConfigurationException = new UploadConfigurationException(UploadConfigurationException.a.REMOTE_DEVICE_EXCEPTION, "Invalid unit ID (" + j14 + ")", null, null, 12, null);
                    }
                    uploadConfigurationLoader.f52788e.put(Long.valueOf(j14), uploadConfigurationException);
                    return uploadConfigurationLoader.c(j14);
                }
                uploadConfigurationLoader.getClass();
                logger2 = uploadConfigurationLoader.f52786c;
                jSONArray = new JSONObject(str).getJSONArray("DataTypes");
                map2 = new HashMap();
                length = jSONArray.length();
                i14 = 0;
                while (i14 < length) {
                    jSONObject = jSONArray.getJSONObject(i14);
                    jSONObjectOptJSONObject = jSONObject.getJSONArray("UploadLocations").optJSONObject(i19);
                    if (jSONObjectOptJSONObject != null) {
                        strV = jSONObjectOptJSONObject.getString("Url");
                    } else {
                        strV = null;
                    }
                    if (strV == null) {
                        i16 = i19;
                    } else {
                        zi2.a aVarG = uploadConfigurationLoader.f52784a.g();
                        i15 = c.f52799a[aVarG.ordinal()];
                        if (i15 != i24) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        String string = jSONObject.getString("DataTypeName");
                        string.getClass();
                        map2.put(d53.w.i0(string).toString(), d53.w.i0(strV).toString());
                    }
                    i14++;
                    i19 = i16;
                    i24 = 1;
                }
                map = map2;
                if (map != null) {
                    return uploadConfigurationLoader.c(j14);
                }
                ConcurrentHashMap<Long, Set<String>> concurrentHashMap = uploadConfigurationLoader.f52787d;
                Long l14 = new Long(j14);
                Set setKeySet = map.keySet();
                arrayList = new ArrayList(y.r(setKeySet, 10));
                it = setKeySet.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    bVar = f52783g;
                    if (zHasNext) {
                        break;
                        break;
                    }
                    String str2 = (String) it.next();
                    bVar.getClass();
                    arrayList.add(b.b(j14, str2));
                }
                concurrentHashMap.put(l14, h0.g1(arrayList));
                if (!map.isEmpty()) {
                    Context context = uploadConfigurationLoader.f52785b;
                    bVar.getClass();
                    editorEdit = b.c(context).edit();
                    for (Map.Entry entry : map.entrySet()) {
                        editorEdit.putString(b.b(j14, (String) entry.getKey()), (String) entry.getValue());
                    }
                    editorEdit.commit();
                }
                logger2.debug("loadUploadConfiguration: endpointDictionary=" + map);
                return map;
            } catch (Throwable th3) {
                th = th3;
                uploadConfigurationLoader = this;
                j14 = j8;
            }
        } else {
            if (i18 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = aVar2.f73940b;
            UploadConfigurationLoader uploadConfigurationLoader2 = aVar2.f73939a;
            try {
                o13.r.b(objE0);
                uploadConfigurationLoader = uploadConfigurationLoader2;
                try {
                    str = (String) objE0;
                    if (str == null) {
                        return uploadConfigurationLoader.c(j14);
                    }
                    if (d53.w.z(str, "DataTypes", false)) {
                        logger = uploadConfigurationLoader.f52786c;
                        try {
                            strOptString = new JSONObject(str).optString("ExceptionMessage");
                            if (strOptString != null || strOptString.length() == 0) {
                                logger.debug("Remote device exception");
                                uploadConfigurationException = new UploadConfigurationException(UploadConfigurationException.a.REMOTE_DEVICE_EXCEPTION, "Invalid unit ID (" + j14 + ")", null, null, 12, null);
                            } else {
                                logger.debug("OMT exception: ".concat(strOptString));
                                uploadConfigurationException = new UploadConfigurationException(UploadConfigurationException.a.OMT_EXCEPTION_MESSAGE, strOptString, null, null, 12, null);
                            }
                        } catch (JSONException e4) {
                            logger.debug("Invalid JSON");
                            uploadConfigurationException = new UploadConfigurationException(UploadConfigurationException.a.JSON_EXCEPTION, j.m("Encountered JSONException (", e4.getMessage(), ")"), null, null, 12, null);
                        }
                        uploadConfigurationLoader.f52788e.put(Long.valueOf(j14), uploadConfigurationException);
                        return uploadConfigurationLoader.c(j14);
                    }
                    uploadConfigurationLoader.getClass();
                    logger2 = uploadConfigurationLoader.f52786c;
                    try {
                        jSONArray = new JSONObject(str).getJSONArray("DataTypes");
                        map2 = new HashMap();
                        length = jSONArray.length();
                        i14 = 0;
                        while (i14 < length) {
                            jSONObject = jSONArray.getJSONObject(i14);
                            jSONObjectOptJSONObject = jSONObject.getJSONArray("UploadLocations").optJSONObject(i19);
                            if (jSONObjectOptJSONObject != null) {
                                strV = jSONObjectOptJSONObject.getString("Url");
                            } else {
                                strV = null;
                            }
                            if (strV == null) {
                                i16 = i19;
                            } else {
                                zi2.a aVarG2 = uploadConfigurationLoader.f52784a.g();
                                i15 = c.f52799a[aVarG2.ordinal()];
                                if (i15 != i24 || i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5) {
                                    i16 = 0;
                                } else {
                                    String str3 = aVarG2.f204881b;
                                    str3.getClass();
                                    String str4 = zi2.a.TEST.f204881b;
                                    str4.getClass();
                                    i16 = 0;
                                    strV = u.v(strV, str3, str4, false);
                                }
                                String string2 = jSONObject.getString("DataTypeName");
                                string2.getClass();
                                map2.put(d53.w.i0(string2).toString(), d53.w.i0(strV).toString());
                            }
                            i14++;
                            i19 = i16;
                            i24 = 1;
                        }
                        map = map2;
                    } catch (JSONException e14) {
                        logger2.debug("Invalid JSON");
                        uploadConfigurationLoader.f52788e.put(Long.valueOf(j14), new UploadConfigurationException(UploadConfigurationException.a.JSON_EXCEPTION, j.m("Encountered JSONException (", e14.getMessage(), ")"), null, null, 12, null));
                        map = null;
                    }
                    if (map != null) {
                        return uploadConfigurationLoader.c(j14);
                    }
                    ConcurrentHashMap<Long, Set<String>> concurrentHashMap2 = uploadConfigurationLoader.f52787d;
                    Long l15 = new Long(j14);
                    Set setKeySet2 = map.keySet();
                    arrayList = new ArrayList(y.r(setKeySet2, 10));
                    it = setKeySet2.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        bVar = f52783g;
                        if (zHasNext) {
                            break;
                        }
                        String str5 = (String) it.next();
                        bVar.getClass();
                        arrayList.add(b.b(j14, str5));
                    }
                    concurrentHashMap2.put(l15, h0.g1(arrayList));
                    if (!map.isEmpty()) {
                        Context context2 = uploadConfigurationLoader.f52785b;
                        bVar.getClass();
                        editorEdit = b.c(context2).edit();
                        while (r1.hasNext()) {
                            editorEdit.putString(b.b(j14, (String) entry.getKey()), (String) entry.getValue());
                        }
                        editorEdit.commit();
                    }
                    logger2.debug("loadUploadConfiguration: endpointDictionary=" + map);
                    return map;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                uploadConfigurationLoader = uploadConfigurationLoader2;
            }
        }
        HashMap mapC = uploadConfigurationLoader.c(j14);
        if (mapC != null) {
            return mapC;
        }
        throw th;
    }

    public final HashMap c(long j8) {
        Long lValueOf = Long.valueOf(j8);
        ConcurrentHashMap<Long, Set<String>> concurrentHashMap = this.f52787d;
        Set<String> setG1 = concurrentHashMap.get(lValueOf);
        Context context = this.f52785b;
        b bVar = f52783g;
        if (setG1 == null) {
            bVar.getClass();
            Set<String> setKeySet = b.c(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                String str = (String) obj;
                str.getClass();
                if (u.y(str, j8 + "_", false)) {
                    arrayList.add(obj);
                }
            }
            setG1 = h0.g1(arrayList);
            concurrentHashMap.put(Long.valueOf(j8), setG1);
        }
        if (setG1.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        bVar.getClass();
        SharedPreferences sharedPreferencesC = b.c(context);
        for (String str2 : setG1) {
            String string = sharedPreferencesC.getString(str2, null);
            if (string != null) {
                map.put(d53.w.O(str2, j8 + "_"), string);
            }
        }
        if (setG1.isEmpty() || !map.isEmpty()) {
            return map;
        }
        this.f52786c.warn("cached data expected for " + j8 + " but not found");
        concurrentHashMap.remove(Long.valueOf(j8));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j8, v13.c cVar, boolean z14) throws Throwable {
        fy2.b bVar;
        UploadConfigurationLoader uploadConfigurationLoader;
        if (cVar instanceof fy2.b) {
            bVar = (fy2.b) cVar;
            int i14 = bVar.f73948e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f73948e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new fy2.b(this, cVar);
            }
        } else {
            bVar = new fy2.b(this, cVar);
        }
        Object objF = bVar.f73946c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f73948e;
        if (i15 == 0) {
            o13.r.b(objF);
            if (j8 <= -1) {
                throw new UploadConfigurationException(UploadConfigurationException.a.INVALID_UNIT_ID, null, null, null, 14, null);
            }
            bVar.f73944a = this;
            bVar.f73945b = j8;
            bVar.f73948e = 1;
            objF = f(j8, bVar, z14);
            if (objF == aVar) {
                return aVar;
            }
            uploadConfigurationLoader = this;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = bVar.f73945b;
            uploadConfigurationLoader = bVar.f73944a;
            o13.r.b(objF);
        }
        Map map = (Map) objF;
        Set setKeySet = map != null ? map.keySet() : null;
        UploadConfigurationException uploadConfigurationException = uploadConfigurationLoader.f52788e.get(Long.valueOf(j8));
        Set set = setKeySet;
        if ((set == null || set.isEmpty()) && uploadConfigurationException != null) {
            throw uploadConfigurationException;
        }
        return setKeySet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j8, String str, v13.c cVar) {
        fy2.c cVar2;
        if (cVar instanceof fy2.c) {
            cVar2 = (fy2.c) cVar;
            int i14 = cVar2.f73952d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f73952d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new fy2.c(this, cVar);
            }
        } else {
            cVar2 = new fy2.c(this, cVar);
        }
        Object objF = cVar2.f73950b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f73952d;
        if (i15 == 0) {
            o13.r.b(objF);
            if (j8 <= -1 || str.length() == 0) {
                return null;
            }
            cVar2.f73949a = str;
            cVar2.f73952d = 1;
            objF = f(j8, cVar2, false);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cVar2.f73949a;
            o13.r.b(objF);
        }
        Map map = (Map) objF;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: all -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00bc, blocks: (B:53:0x00a7, B:57:0x00bb), top: B:69:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j8, v13.c cVar, boolean z14) throws Throwable {
        d dVar;
        s sVarB;
        UploadConfigurationLoader uploadConfigurationLoader;
        UploadConfigurationLoader uploadConfigurationLoader2;
        HashMap mapC;
        HashMap mapC2;
        HashMap mapC3;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f73958f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f73958f = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.f73956d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f73958f;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = dVar.f73955c;
                uploadConfigurationLoader2 = dVar.f73953a;
                try {
                    o13.r.b(objB);
                    return (Map) objB;
                } catch (Throwable th3) {
                    th = th3;
                    mapC2 = uploadConfigurationLoader2.c(j8);
                    if (mapC2 != null) {
                        return mapC2;
                    }
                    throw th;
                }
            }
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = dVar.f73955c;
            sVarB = dVar.f73954b;
            uploadConfigurationLoader = dVar.f73953a;
            try {
                o13.r.b(objB);
                Map map = (Map) objB;
                sVarB.p(map);
                uploadConfigurationLoader.f52789f.remove(new Long(j8));
                return map;
            } catch (Throwable th4) {
                th = th4;
                try {
                    sVarB.O(th);
                    mapC3 = uploadConfigurationLoader.c(j8);
                    if (mapC3 != null) {
                        throw th;
                    }
                    uploadConfigurationLoader.f52789f.remove(new Long(j8));
                    return mapC3;
                } catch (Throwable th5) {
                    uploadConfigurationLoader.f52789f.remove(new Long(j8));
                    throw th5;
                }
            }
        }
        o13.r.b(objB);
        if (!z14 && (mapC = c(j8)) != null) {
            return mapC;
        }
        sVarB = gl.b.b();
        r<Map<String, String>> rVarPutIfAbsent = this.f52789f.putIfAbsent(new Long(j8), sVarB);
        if (rVarPutIfAbsent != null) {
            g.w("loadUploadConfiguration: reusing in-flight request for device ", j8, this.f52786c);
            try {
                dVar.f73953a = this;
                dVar.f73955c = j8;
                dVar.f73958f = 1;
                objB = rVarPutIfAbsent.await(dVar);
                if (objB != obj) {
                    uploadConfigurationLoader2 = this;
                    return (Map) objB;
                }
            } catch (Throwable th6) {
                th = th6;
                uploadConfigurationLoader2 = this;
                mapC2 = uploadConfigurationLoader2.c(j8);
                if (mapC2 != null) {
                    return mapC2;
                }
                throw th;
            }
        } else {
            try {
                dVar.f73953a = this;
                dVar.f73954b = sVarB;
                dVar.f73955c = j8;
                dVar.f73958f = 2;
                objB = b(j8, dVar);
                if (objB != obj) {
                    uploadConfigurationLoader = this;
                    Map map2 = (Map) objB;
                    sVarB.p(map2);
                    uploadConfigurationLoader.f52789f.remove(new Long(j8));
                    return map2;
                }
            } catch (Throwable th7) {
                th = th7;
                uploadConfigurationLoader = this;
                sVarB.O(th);
                mapC3 = uploadConfigurationLoader.c(j8);
                if (mapC3 != null) {
                    throw th;
                }
                uploadConfigurationLoader.f52789f.remove(new Long(j8));
                return mapC3;
            }
        }
        return obj;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/garmin/sync/UploadConfigurationLoader$b;", "", "<init>", "()V", "", "CACHE_PREFS", "Ljava/lang/String;", "", "DELAY_BETWEEN_CALLS_IN_MILLIS", "J", "ERA_DATA_TYPE", "", "HTTP_CONNECTION_READ_TIMEOUT_IN_MILLIS", "I", "HTTP_CONNECTION_TIMEOUT_IN_MILLIS", "INVALID_DEVICE_ID", "MAX_NUMBER_OF_ATTEMPTS", "OMT_DATA_TYPES", "OMT_DATA_TYPE_NAME", "OMT_EXCEPTION_MESSAGE", "OMT_UPLOAD_LOCATIONS", "OMT_URL", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @SuppressLint({"ApplySharedPref"})
        public static void a(Context context, Long l14) {
            SharedPreferences.Editor editorClear;
            context.getClass();
            if (l14 == null) {
                SharedPreferences.Editor editorEdit = c(context).edit();
                if (editorEdit == null || (editorClear = editorEdit.clear()) == null) {
                    return;
                }
                editorClear.commit();
                return;
            }
            Set<String> setKeySet = c(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                String str = (String) obj;
                str.getClass();
                if (u.y(str, l14 + "_", false)) {
                    arrayList.add(obj);
                }
            }
            Set setG1 = h0.g1(arrayList);
            SharedPreferences.Editor editorEdit2 = c(context).edit();
            Iterator it = setG1.iterator();
            while (it.hasNext()) {
                editorEdit2.remove((String) it.next());
            }
            editorEdit2.commit();
        }

        public static String b(long j8, String str) {
            str.getClass();
            return j8 + "_" + str;
        }

        public static SharedPreferences c(Context context) {
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences("upload_config_cache_prefs", 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0016B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/garmin/sync/UploadConfigurationLoader$UploadConfigurationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lny2/a;", "Lcom/garmin/sync/UploadConfigurationLoader$UploadConfigurationException$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "message", "", "httpCode", "url", "<init>", "(Lcom/garmin/sync/UploadConfigurationLoader$UploadConfigurationException$a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Lcom/garmin/sync/UploadConfigurationLoader$UploadConfigurationException$a;", "getType", "()Lcom/garmin/sync/UploadConfigurationLoader$UploadConfigurationException$a;", "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "a", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadConfigurationException extends Exception implements ny2.a {
        private final Integer httpCode;
        private final a type;
        private final String url;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/sync/UploadConfigurationLoader$UploadConfigurationException$a;", "", "<init>", "(Ljava/lang/String;I)V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            EMPTY_SERVER_RESPONSE,
            INVALID_SERVER_ENDPOINT,
            UNEXPECTED_SERVER_RESPONSE,
            NO_RESPONSE_ON_UPLOAD_CONFIG,
            OMT_EXCEPTION_MESSAGE,
            REMOTE_DEVICE_EXCEPTION,
            JSON_EXCEPTION,
            INVALID_UNIT_ID
        }

        public /* synthetic */ UploadConfigurationException(a aVar, String str, Integer num, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(aVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str2);
        }

        @Override // bd2.a
        public Integer getHttpCode() {
            return this.httpCode;
        }

        public final a getType() {
            return this.type;
        }

        @Override // bd2.b
        public String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadConfigurationException(a aVar, String str, Integer num, String str2) {
            super(str == null ? aVar.name() : str);
            aVar.getClass();
            this.type = aVar;
            this.httpCode = num;
            this.url = str2;
        }
    }
}
