package fz0;

import c83.b0;
import c83.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfz0/b;", "Lc83/h$a;", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h.a {
    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        type.getClass();
        annotationArr.getClass();
        return new a(b0Var.e(this, type, annotationArr), 0);
    }
}
