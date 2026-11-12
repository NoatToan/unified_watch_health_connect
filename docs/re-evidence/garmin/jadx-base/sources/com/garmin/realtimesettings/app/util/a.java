package com.garmin.realtimesettings.app.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import cx2.h;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/realtimesettings/app/util/a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1130a f52669a = new C1130a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f52670b = new h("JSONUtil", null, 2, null);

    /* JADX INFO: renamed from: com.garmin.realtimesettings.app.util.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/realtimesettings/app/util/a$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1130a {

        /* JADX INFO: renamed from: com.garmin.realtimesettings.app.util.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00060\u00020\u0001¨\u0006\u0007"}, d2 = {"com/garmin/realtimesettings/app/util/a$a$a", "Lcom/google/gson/reflect/TypeToken;", "", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C1131a extends TypeToken<List<? extends HashMap<String, Object>>> {
        }

        /* JADX INFO: renamed from: com.garmin.realtimesettings.app.util.a$a$b */
        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001¨\u0006\u0006"}, d2 = {"com/garmin/realtimesettings/app/util/a$a$b", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends TypeToken<HashMap<String, Object>> {
        }

        public /* synthetic */ C1130a(j jVar) {
            this();
        }

        public static List a(JSONArray jSONArray) {
            try {
                GsonBuilder gsonBuilder = new GsonBuilder();
                GSONDeserializer.f52665b.getClass();
                Gson gsonCreate = gsonBuilder.registerTypeAdapterFactory(GSONDeserializer.f52666c).setPrettyPrinting().create();
                gsonCreate.getClass();
                Type type = new C1131a().getType();
                type.getClass();
                Object objFromJson = gsonCreate.fromJson(jSONArray.toString(), type);
                objFromJson.getClass();
                return (List) objFromJson;
            } catch (IllegalStateException unused) {
                h hVar = a.f52670b;
                jSONArray.toString();
                hVar.getClass();
                return j0.f134944a;
            }
        }

        public static HashMap b(Object obj) {
            obj.getClass();
            try {
                GsonBuilder gsonBuilder = new GsonBuilder();
                GSONDeserializer.f52665b.getClass();
                Gson gsonCreate = gsonBuilder.registerTypeAdapterFactory(GSONDeserializer.f52666c).setPrettyPrinting().create();
                gsonCreate.getClass();
                Type type = new b().getType();
                type.getClass();
                Object objFromJson = gsonCreate.fromJson(obj.toString(), type);
                objFromJson.getClass();
                return (HashMap) objFromJson;
            } catch (IllegalStateException unused) {
                h hVar = a.f52670b;
                obj.toString();
                hVar.getClass();
                return new HashMap();
            }
        }

        private C1130a() {
        }
    }
}
