package defpackage;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public class k7h implements jl5<InputStream>, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call.Factory f23554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0b f23555b;
    public InputStream c;
    public ResponseBody d;
    public jl5.a<? super InputStream> e;
    public volatile Call f;

    public k7h(Call.Factory factory, e0b e0bVar) {
        this.f23554a = factory;
        this.f23555b = e0bVar;
    }

    @Override // defpackage.jl5
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.jl5
    public void b() {
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.e = null;
    }

    @Override // defpackage.jl5
    public void c(Priority priority, jl5.a<? super InputStream> aVar) {
        Request.Builder builderUrl = new Request.Builder().url(this.f23555b.h());
        for (Map.Entry<String, String> entry : this.f23555b.e().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        Request requestBuild = builderUrl.build();
        this.e = aVar;
        this.f = this.f23554a.newCall(requestBuild);
        this.f.enqueue(this);
    }

    @Override // defpackage.jl5
    public void cancel() {
        Call call = this.f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.jl5
    public DataSource d() {
        return DataSource.REMOTE;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Log.isLoggable("OkHttpFetcher", 3);
        this.e.f(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.d = response.body();
        if (!response.isSuccessful()) {
            this.e.f(new HttpException(response.message(), response.code()));
            return;
        }
        InputStream inputStreamB = ai4.b(this.d.byteStream(), ((ResponseBody) a6i.d(this.d)).getContentLength());
        this.c = inputStreamB;
        this.e.e(inputStreamB);
    }
}
