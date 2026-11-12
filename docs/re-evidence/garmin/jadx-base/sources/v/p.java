package v;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f173978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f173979c;

    public /* synthetic */ p(s sVar, androidx.concurrent.futures.b.a aVar, int i14) {
        this.f173977a = i14;
        this.f173978b = sVar;
        this.f173979c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s.f.a aVar;
        boolean z14 = false;
        switch (this.f173977a) {
            case 0:
                s sVar = this.f173978b;
                androidx.concurrent.futures.b.a aVar2 = this.f173979c;
                if (sVar.f174021o == null) {
                    if (sVar.f174010e != s.g.RELEASED) {
                        androidx.concurrent.futures.b.a<Void> aVar3 = new androidx.concurrent.futures.b.a<>();
                        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar3);
                        aVar3.f6080b = dVar;
                        aVar3.f6079a = h.class;
                        try {
                            k7.h.f(sVar.f174022p == null, "Camera can only be released once, so release completer should be null on creation.");
                            sVar.f174022p = aVar3;
                            aVar3.f6079a = "Release[camera=" + sVar + "]";
                        } catch (Exception e4) {
                            dVar.a(e4);
                        }
                        sVar.f174021o = dVar;
                    } else {
                        l0.j.a aVar4 = l0.j.f107810a;
                        sVar.f174021o = l0.m.c.f107817b;
                    }
                }
                ListenableFuture<Void> listenableFuture = sVar.f174021o;
                switch (sVar.f174010e.ordinal()) {
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        if (sVar.f174014i.a() || ((aVar = sVar.I0.f174038a) != null && !aVar.f174041b.get())) {
                            z14 = true;
                        }
                        sVar.I0.a();
                        sVar.D(s.g.RELEASING);
                        if (z14) {
                            k7.h.f(sVar.f174023q.isEmpty(), null);
                            sVar.s();
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        k7.h.f(sVar.f174016k == null, null);
                        sVar.D(s.g.RELEASING);
                        k7.h.f(sVar.f174023q.isEmpty(), null);
                        sVar.s();
                        break;
                    case 9:
                    case 10:
                        sVar.D(s.g.RELEASING);
                        sVar.r();
                        break;
                    default:
                        Objects.toString(sVar.f174010e);
                        sVar.toString();
                        break;
                }
                l0.j.g(listenableFuture, aVar2);
                break;
            default:
                s sVar2 = this.f173978b;
                androidx.concurrent.futures.b.a aVar5 = this.f173979c;
                w1 w1Var = sVar2.D;
                aVar5.b(Boolean.valueOf(w1Var != null ? sVar2.f174006a.e(s.w(w1Var)) : false));
                break;
        }
    }
}
