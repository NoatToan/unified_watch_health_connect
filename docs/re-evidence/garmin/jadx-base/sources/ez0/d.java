package ez0;

import c83.b0;
import c83.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lez0/d;", "Lc83/h$a;", "<init>", "()V", "a", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f67493a = new d();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lez0/d$a;", "Lc83/h;", "Lokhttp3/ResponseBody;", "", "<init>", "()V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements h<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f67494a = new a();

        private a() {
        }

        @Override // c83.h
        public final Unit convert(ResponseBody responseBody) {
            ResponseBody responseBody2 = responseBody;
            responseBody2.getClass();
            responseBody2.close();
            return Unit.INSTANCE;
        }
    }

    private d() {
    }

    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        type.getClass();
        annotationArr.getClass();
        if (type.equals(Unit.class)) {
            return a.f67494a;
        }
        return null;
    }
}
