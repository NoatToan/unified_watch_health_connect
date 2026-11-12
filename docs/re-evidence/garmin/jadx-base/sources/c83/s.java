package c83;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class s extends h.a {

    @IgnoreJRERequirement
    public static final class a<T> implements h<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<ResponseBody, T> f25833a;

        public a(h<ResponseBody, T> hVar) {
            this.f25833a = hVar;
        }

        @Override // c83.h
        public final Object convert(ResponseBody responseBody) {
            return Optional.ofNullable(this.f25833a.convert(responseBody));
        }
    }

    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.e(type) != Optional.class) {
            return null;
        }
        return new a(b0Var.e(null, f0.d(0, (ParameterizedType) type), annotationArr));
    }
}
