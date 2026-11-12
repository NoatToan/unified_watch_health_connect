package hr2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import ms2.d;
import ms2.g;
import p005kotlin.Metadata;
import ps2.n;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhr2/c;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hr2.a f85298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f85299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f85300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<a> f85301d = new y0<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr2/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        WEBVIEW_AVAILABLE,
        LOADING,
        PROVISIONING,
        /* JADX INFO: Fake field, exist only in values array */
        ERROR
    }

    public void x4(hr2.a aVar) {
        this.f85298a = aVar;
        w wVar = w.f140538a;
        is2.b bVar = aVar.f85289b;
        this.f85299b = wVar.a(bVar);
        n nVarI = w.i(aVar.f85290c.getUnitID());
        this.f85300c = nVarI != null ? nVarI.g(bVar) : null;
    }
}
