package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c4b extends dk4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f4908a;

    public c4b(Gson gson) {
        this.f4908a = gson;
    }

    public static c4b f() {
        return g(new Gson());
    }

    public static c4b g(Gson gson) {
        if (gson != null) {
            return new c4b(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // dk4.a
    public dk4<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, etk etkVar) {
        return new d4b(this.f4908a, this.f4908a.getAdapter(TypeToken.get(type)));
    }

    @Override // dk4.a
    public dk4<ResponseBody, ?> d(Type type, Annotation[] annotationArr, etk etkVar) {
        return new e4b(this.f4908a, this.f4908a.getAdapter(TypeToken.get(type)));
    }
}
