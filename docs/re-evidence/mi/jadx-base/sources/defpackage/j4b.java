package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

/* JADX INFO: loaded from: classes7.dex */
public class j4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f22402a = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonParser f22403b = new JsonParser();

    public static JsonParser a() {
        return f22403b;
    }

    public static Gson b() {
        return f22402a;
    }
}
