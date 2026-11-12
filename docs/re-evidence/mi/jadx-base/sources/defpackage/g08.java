package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes7.dex */
public class g08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f18415a = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static String a(Object obj) {
        return f18415a.toJson(obj);
    }
}
