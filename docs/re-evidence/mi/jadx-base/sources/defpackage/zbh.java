package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class zbh extends dk4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dk4.a f41097a = new zbh();

    @IgnoreJRERequirement
    public static final class a<T> implements dk4<ResponseBody, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dk4<ResponseBody, T> f41098a;

        public a(dk4<ResponseBody, T> dk4Var) {
            this.f41098a = dk4Var;
        }

        @Override // defpackage.dk4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f41098a.convert(responseBody));
        }
    }

    @Override // dk4.a
    public dk4<ResponseBody, ?> d(Type type, Annotation[] annotationArr, etk etkVar) {
        if (dk4.a.b(type) != Optional.class) {
            return null;
        }
        return new a(etkVar.i(dk4.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
