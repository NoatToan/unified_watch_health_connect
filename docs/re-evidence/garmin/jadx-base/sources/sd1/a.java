package sd1;

import c83.b0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsd1/a;", "Lc83/h$a;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c83.h.a {
    @Override // c83.h.a
    public final c83.h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        type.getClass();
        annotationArr2.getClass();
        return b0Var.d(this, type, annotationArr, annotationArr2);
    }

    @Override // c83.h.a
    public final c83.h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        type.getClass();
        annotationArr.getClass();
        return new fz0.a(b0Var.e(this, type, annotationArr), 1);
    }
}
