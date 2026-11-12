package cc2;

import android.annotation.SuppressLint;
import bc2.h;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcc2/g;", "Lfc2/b;", "Lmy2/a$c;", "networkServiceFactory", "Lmy2/a;", "delegate", "<init>", "(Lmy2/a$c;Lmy2/a;)V", "connect-device-sync-retrofit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CheckResult"})
public class g implements fc2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my2.a f26752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f26753b;

    public /* synthetic */ g(my2.a.c cVar, my2.a aVar, int i14, j jVar) {
        my2.a.c cVar2;
        if ((i14 & 2) != 0) {
            cVar2 = cVar;
            aVar = new my2.a("SYNC#", cVar2, 0, 4, null);
        } else {
            cVar2 = cVar;
        }
        this(cVar2, aVar);
    }

    public final void a(long j8, String str, byte[] bArr, String str2, ArrayList arrayList, boolean z14, h hVar) {
        str.getClass();
        str2.getClass();
        ge1.b.T(this.f26753b, null, null, new f(bArr, hVar, this, j8, str, str2, arrayList, z14, null), 3);
    }

    public g(my2.a.c cVar, my2.a aVar) {
        cVar.getClass();
        aVar.getClass();
        this.f26752a = aVar;
        this.f26753b = q2.l("SyncingRetrofitServerDelegate");
    }
}
