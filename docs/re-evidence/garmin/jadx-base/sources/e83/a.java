package e83;

import c83.b0;
import c83.h;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import j20.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f63464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63465b;

    private a(Gson gson, boolean z14) {
        this.f63464a = gson;
        this.f63465b = z14;
    }

    public static a c() {
        return d(new Gson());
    }

    public static a d(Gson gson) {
        if (gson != null) {
            return new a(gson, false);
        }
        x.l("gson == null");
        return null;
    }

    @Override // c83.h.a
    public final h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f63464a;
        return new b(gson, gson.getAdapter(typeToken), this.f63465b);
    }

    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f63464a;
        return new c(gson, gson.getAdapter(typeToken));
    }
}
