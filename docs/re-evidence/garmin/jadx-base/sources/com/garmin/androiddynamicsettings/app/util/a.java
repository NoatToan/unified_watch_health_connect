package com.garmin.androiddynamicsettings.app.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import hi2.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/util/a;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1021a f50704a = new C1021a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f50705b = new d("JSONUtil", null, 2, null);

    /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.util.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/util/a$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1021a {

        /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.util.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00060\u00020\u0001¨\u0006\u0007"}, d2 = {"com/garmin/androiddynamicsettings/app/util/a$a$a", "Lcom/google/gson/reflect/TypeToken;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C1022a extends TypeToken<List<? extends HashMap<String, Object>>> {
        }

        /* JADX INFO: renamed from: com.garmin.androiddynamicsettings.app.util.a$a$b */
        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001¨\u0006\u0006"}, d2 = {"com/garmin/androiddynamicsettings/app/util/a$a$b", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends TypeToken<HashMap<String, Object>> {
        }

        public /* synthetic */ C1021a(j jVar) {
            this();
        }

        public static HashMap a(String str, String str2) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject2.keys();
                itKeys.getClass();
                while (true) {
                    Object obj = null;
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    String next = itKeys.next();
                    Object obj2 = jSONObject.has(next) ? jSONObject.get(next) : null;
                    Object obj3 = jSONObject2.get(next);
                    if (obj2 instanceof JSONObject) {
                        obj3.getClass();
                        String string = ((JSONObject) obj2).toString(1);
                        string.getClass();
                        String string2 = ((JSONObject) obj3).toString(1);
                        string2.getClass();
                        HashMap mapA = a(string, string2);
                        if (mapA != null) {
                            next.getClass();
                            map.put(next, mapA);
                        }
                    } else if (obj2 instanceof JSONArray) {
                        if (obj3 instanceof JSONArray) {
                            obj = obj3;
                        }
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray != null) {
                            JSONArray jSONArray2 = (JSONArray) obj2;
                            a.f50704a.getClass();
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArray2.length();
                            for (int i14 = 0; i14 < length; i14++) {
                                arrayList.add(jSONArray2.get(i14).toString());
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int length2 = jSONArray.length();
                            for (int i15 = 0; i15 < length2; i15++) {
                                arrayList2.add(jSONArray.get(i15).toString());
                            }
                            if (arrayList.size() == arrayList2.size()) {
                                HashSet hashSet = new HashSet(arrayList);
                                hashSet.removeAll(arrayList2);
                                if (hashSet.size() > 0) {
                                }
                            }
                            next.getClass();
                            map.put(next, jSONArray);
                        }
                    } else if (!s.g(obj2, obj3)) {
                        d dVar = a.f50705b;
                        Objects.toString(obj2);
                        Objects.toString(obj3);
                        dVar.getClass();
                        if (s.g(obj3, JSONObject.NULL)) {
                            next.getClass();
                            map.put(next, null);
                        } else {
                            next.getClass();
                            map.put(next, obj3.toString());
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            } catch (JSONException unused) {
                a.f50705b.getClass();
                throw new JSONException("Unknown error");
            }
        }

        public static List b(Object obj) {
            obj.getClass();
            try {
                GsonBuilder gsonBuilder = new GsonBuilder();
                GSONDeserializer.f50700b.getClass();
                Gson gsonCreate = gsonBuilder.registerTypeAdapterFactory(GSONDeserializer.f50701c).setPrettyPrinting().create();
                gsonCreate.getClass();
                Type type = new C1022a().getType();
                type.getClass();
                Object objFromJson = gsonCreate.fromJson(obj.toString(), type);
                objFromJson.getClass();
                return (List) objFromJson;
            } catch (IllegalStateException unused) {
                d dVar = a.f50705b;
                obj.toString();
                dVar.getClass();
                return j0.f134944a;
            }
        }

        public static HashMap c(Object obj) {
            obj.getClass();
            try {
                GsonBuilder gsonBuilder = new GsonBuilder();
                GSONDeserializer.f50700b.getClass();
                Gson gsonCreate = gsonBuilder.registerTypeAdapterFactory(GSONDeserializer.f50701c).setPrettyPrinting().create();
                gsonCreate.getClass();
                Type type = new b().getType();
                type.getClass();
                Object objFromJson = gsonCreate.fromJson(obj.toString(), type);
                objFromJson.getClass();
                return (HashMap) objFromJson;
            } catch (IllegalStateException unused) {
                d dVar = a.f50705b;
                obj.toString();
                dVar.getClass();
                return new HashMap();
            }
        }

        public static String d(Map map) {
            map.getClass();
            return new JSONObject(map).toString();
        }

        private C1021a() {
        }
    }
}
