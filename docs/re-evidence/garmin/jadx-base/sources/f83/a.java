package f83;

import c83.h;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf83/a;", "T", "Lc83/h;", "Lokhttp3/ResponseBody;", "Li63/b;", "loader", "Lf83/e;", "serializer", "<init>", "(Li63/b;Lf83/e;)V", "kotlinx-serialization"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.b<T> f69949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f69950b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(i63.b<? extends T> bVar, e eVar) {
        bVar.getClass();
        eVar.getClass();
        this.f69949a = bVar;
        this.f69950b = eVar;
    }

    @Override // c83.h
    public final Object convert(ResponseBody responseBody) {
        ResponseBody responseBody2 = responseBody;
        responseBody2.getClass();
        return this.f69950b.a(this.f69949a, responseBody2);
    }
}
