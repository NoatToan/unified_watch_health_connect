package ws0;

import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lws0/j;", "Lws0/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lus0/a;", "lactateThresholdApi", "<init>", "(Lus0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us0.a f186946a;

    public j(us0.a aVar) {
        aVar.getClass();
        this.f186946a = aVar;
    }

    @Override // ws0.a
    public final Object a(String str, o oVar, o oVar2, List list, String str2, v13.i iVar) {
        return f0.J(this, new e(this, str, oVar, oVar2, list, str2, null), iVar);
    }

    @Override // ws0.a
    public final Object b(String str, o oVar, o oVar2, List list, String str2, v13.i iVar) {
        return f0.J(this, new i(this, str, oVar, oVar2, list, str2, null), iVar);
    }

    @Override // ws0.a
    public final Object c(String str, o oVar, o oVar2, List list, String str2, v13.i iVar) {
        return f0.J(this, new c(this, str, oVar, oVar2, list, str2, null), iVar);
    }

    @Override // ws0.a
    public final Object d(String str, o oVar, o oVar2, String str2, String str3, List list, v13.i iVar) {
        return f0.J(this, new f(this, str, str3, oVar, oVar2, str2, list, null), iVar);
    }

    @Override // ws0.a
    public final Object f(String str, o oVar, o oVar2, List list, String str2, v13.i iVar) {
        return f0.J(this, new d(this, str, oVar, oVar2, list, str2, null), iVar);
    }

    @Override // ws0.a
    public final Object g(String str, v13.c cVar) {
        return f0.J(this, new g(this, str, null), cVar);
    }

    @Override // ws0.a
    public final Object h(String str, v13.c cVar) {
        return f0.J(this, new b(this, str, null), cVar);
    }

    @Override // ws0.a
    public final Object i(String str, o oVar, xs0.a aVar, v13.c cVar) {
        return f0.J(this, new h(this, str, oVar, aVar, null), cVar);
    }
}
