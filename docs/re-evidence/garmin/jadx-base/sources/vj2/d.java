package vj2;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import java.io.ByteArrayOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.ciq.http.rawresourcerequest.MultipartFormDataRetriever", f = "MultipartFormDataRetriever.kt", l = {51}, m = "run")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f178491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GDIConnectIQHTTPProto.RawResourceRequest.MultipartForm f178492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f178493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f178495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f178496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f178497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f178496f = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f178495e = obj;
        this.f178497g |= Integer.MIN_VALUE;
        return this.f178496f.b(this);
    }
}
