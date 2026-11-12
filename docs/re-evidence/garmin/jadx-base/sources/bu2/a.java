package bu2;

import c83.b0;
import c83.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbu2/a;", "Lc83/h;", "Lokhttp3/ResponseBody;", "", "<init>", "()V", "a", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements h<ResponseBody, byte[]> {

    /* JADX INFO: renamed from: bu2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbu2/a$a;", "Lc83/h$a;", "<init>", "()V", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0299a extends h.a {
        @Override // c83.h.a
        public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
            return new a();
        }
    }

    @Override // c83.h
    public final byte[] convert(ResponseBody responseBody) {
        byte[] bArrBytes;
        ResponseBody responseBody2 = responseBody;
        return (responseBody2 == null || (bArrBytes = responseBody2.bytes()) == null) ? new byte[0] : bArrBytes;
    }
}
