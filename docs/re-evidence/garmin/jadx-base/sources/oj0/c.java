package oj0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o4.v0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lc83/a0;", "Lo4/v0;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusApiImpl$fetchGCPlusImage$2", f = "GCPlusApi.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super c83.a0<v0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f132276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f132276a = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f132276a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super c83.a0<v0>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        URLConnection uRLConnectionOpenConnection = new URL(this.f132276a).openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.connect();
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        bitmapDecodeStream.getClass();
        return c83.a0.b(new o4.f(bitmapDecodeStream));
    }
}
