package nd2;

import e23.l;
import java.net.HttpURLConnection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class d implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<HttpURLConnection> f125413a;

    public d(r0<HttpURLConnection> r0Var) {
        this.f125413a = r0Var;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        try {
            HttpURLConnection httpURLConnection = this.f125413a.f105810a;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
