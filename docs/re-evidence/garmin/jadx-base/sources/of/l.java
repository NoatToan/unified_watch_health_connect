package of;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lof/l;", "Lof/j$a;", "Lwf/f;", "initialRequest", "", "Lof/j;", "interceptors", "", FirebaseAnalytics.Param.INDEX, "request", "Lxf/g;", "size", "Lhf/e;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lwf/f;Ljava/util/List;ILwf/f;Lxf/g;Lhf/e;Z)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf.f f131658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j> f131659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f131660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wf.f f131661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xf.g f131662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hf.e f131663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131664g;

    /* JADX WARN: Multi-variable type inference failed */
    public l(wf.f fVar, List<? extends j> list, int i14, wf.f fVar2, xf.g gVar, hf.e eVar, boolean z14) {
        this.f131658a = fVar;
        this.f131659b = list;
        this.f131660c = i14;
        this.f131661d = fVar2;
        this.f131662e = gVar;
        this.f131663f = eVar;
        this.f131664g = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        k kVar;
        j jVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f131657d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f131657d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f131655b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f131657d;
        if (i15 == 0) {
            r.b(obj);
            List<j> list = this.f131659b;
            int i16 = this.f131660c;
            j jVar2 = list.get(i16);
            hf.e eVar = this.f131663f;
            boolean z14 = this.f131664g;
            l lVar = new l(this.f131658a, this.f131659b, i16 + 1, this.f131661d, this.f131662e, eVar, z14);
            kVar.f131654a = jVar2;
            kVar.f131657d = 1;
            Object objA = jVar2.a(lVar, kVar);
            if (objA == aVar) {
                return aVar;
            }
            jVar = jVar2;
            obj = objA;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = kVar.f131654a;
            r.b(obj);
        }
        wf.i iVar = (wf.i) obj;
        wf.f f185007b = iVar.getF185007b();
        Context context = f185007b.f184902a;
        wf.f fVar = this.f131658a;
        if (context != fVar.f184902a) {
            n23.j.t("Interceptor '", jVar, "' cannot modify the request's context.");
            return null;
        }
        if (f185007b.f184903b == wf.k.f184994a) {
            n23.j.t("Interceptor '", jVar, "' cannot set the request's data to null.");
            return null;
        }
        if (f185007b.f184904c != fVar.f184904c) {
            n23.j.t("Interceptor '", jVar, "' cannot modify the request's target.");
            return null;
        }
        if (f185007b.f184922u == fVar.f184922u) {
            return iVar;
        }
        n23.j.t("Interceptor '", jVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        return null;
    }

    @Override // of.j.a
    /* JADX INFO: renamed from: getRequest, reason: from getter */
    public final wf.f getF131661d() {
        return this.f131661d;
    }
}
