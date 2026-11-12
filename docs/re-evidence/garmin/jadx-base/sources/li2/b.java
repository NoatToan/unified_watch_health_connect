package li2;

import android.os.Handler;
import android.os.Looper;
import k32.n;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lli2/b;", "Lni2/a;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements ni2.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<Unit> f112909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f112910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ni2.c f112911c;

    public b(ni2.a<Unit> aVar, String str, ni2.c cVar) {
        this.f112909a = aVar;
        this.f112910b = str;
        this.f112911c = cVar;
    }

    @Override // ni2.a
    public final void a() {
        new Handler(Looper.getMainLooper()).post(new n(this.f112909a, 9));
    }

    @Override // ni2.a
    public final void b(String str, Throwable th3) {
        th3.getClass();
        new Handler(Looper.getMainLooper()).post(new fh2.a(this.f112909a, 15, th3, str));
    }

    @Override // ni2.a
    public final void onSuccess(Unit unit) {
        Unit unit2 = unit;
        unit2.getClass();
        new Handler(Looper.getMainLooper()).post(new at0.c(this.f112910b, this.f112911c, this.f112909a, unit2, 15));
    }
}
