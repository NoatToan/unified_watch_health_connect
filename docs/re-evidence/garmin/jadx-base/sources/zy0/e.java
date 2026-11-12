package zy0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import o13.r;
import o4.v0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo4/v0;", "<anonymous>", "(Lo53/b0;)Lo4/v0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.network.DefaultPromosImageDownloader$fetchImageAtUrl$2", f = "PromosImageDownloader.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super v0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f207444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f207445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f207445b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f207445b, dVar);
        eVar.f207444a = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v0> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.f207445b).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.connect();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            bitmapDecodeStream.getClass();
            return new o4.f(bitmapDecodeStream);
        } catch (Exception e4) {
            a2 a2Var = a2.PROMOTIONS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error while fetching a promotion image. ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "DefaultPromosImageDownloader", strD);
            return null;
        }
    }
}
