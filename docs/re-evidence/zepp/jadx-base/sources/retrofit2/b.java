package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes23.dex */
final class b extends CallAdapter.Factory {
    public static final CallAdapter.Factory a = new b();

    public class a implements CallAdapter<Object, Call<?>> {
        public final /* synthetic */ Type a;

        public a(Type type) {
            this.a = type;
        }

        @Override // retrofit2.CallAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Call<Object> adapt(Call<Object> call) {
            return call;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.a;
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        return new a(i.f(type));
    }
}
