package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pwg {

    public class a extends TypeToken<List<owg.a>> {
    }

    public static String a(List<owg.a> list) {
        return new Gson().toJson(list);
    }

    public static List<owg.a> b(String str) {
        return (List) new Gson().fromJson(str, new a().getType());
    }
}
