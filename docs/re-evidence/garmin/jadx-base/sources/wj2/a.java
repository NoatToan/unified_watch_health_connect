package wj2;

import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Authenticator;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes11.dex */
public class a implements Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f185791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f185792b;

    public a(b bVar, AtomicBoolean atomicBoolean) {
        this.f185792b = bVar;
        this.f185791a = atomicBoolean;
    }

    @Override // okhttp3.Authenticator
    public final Request authenticate(Route route, Response response) {
        AtomicBoolean atomicBoolean = this.f185791a;
        if (atomicBoolean.get()) {
            return null;
        }
        Request.Builder builderNewBuilder = response.request().newBuilder();
        MediaType mediaType = b.f185793j;
        this.f185792b.c(builderNewBuilder);
        atomicBoolean.set(true);
        return builderNewBuilder.build();
    }
}
