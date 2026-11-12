package ti;

import aj.h;
import com.bumptech.glide.g;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import qj.c;
import qj.l;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d<InputStream>, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f164561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f164562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f164563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResponseBody f164564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a<? super InputStream> f164565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Call f164566f;

    public a(Call.Factory factory, h hVar) {
        this.f164561a = factory;
        this.f164562b = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final ui.a b() {
        return ui.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        Call call = this.f164566f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cleanup() {
        try {
            c cVar = this.f164563c;
            if (cVar != null) {
                cVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f164564d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f164565e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(g gVar, d.a<? super InputStream> aVar) {
        Request.Builder builderUrl = new Request.Builder().url(this.f164562b.d());
        for (Map.Entry<String, String> entry : this.f164562b.f3349b.getHeaders().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        Request requestBuild = builderUrl.build();
        this.f164565e = aVar;
        this.f164566f = this.f164561a.newCall(requestBuild);
        this.f164566f.enqueue(this);
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.f164565e.e(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.f164564d = response.body();
        if (!response.isSuccessful()) {
            this.f164565e.e(new HttpException(response.message(), response.code()));
            return;
        }
        ResponseBody responseBody = this.f164564d;
        l.c(responseBody, "Argument must not be null");
        c cVarC = c.c(this.f164564d.byteStream(), responseBody.getContentLength());
        this.f164563c = cVarC;
        this.f164565e.c(cVarC);
    }
}
