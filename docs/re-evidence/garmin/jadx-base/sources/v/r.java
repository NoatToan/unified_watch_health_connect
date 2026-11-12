package v;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f173996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f173997c;

    public /* synthetic */ r(s sVar, ArrayList arrayList, int i14) {
        this.f173995a = i14;
        this.f173996b = sVar;
        this.f173997c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        s.f.a aVar;
        switch (this.f173995a) {
            case 0:
                s sVar = this.f173996b;
                ArrayList arrayList = this.f173997c;
                l lVar = sVar.f174013h;
                try {
                    sVar.G(arrayList);
                    return;
                } finally {
                    lVar.q();
                }
            default:
                s sVar2 = this.f173996b;
                ArrayList<s.i> arrayList2 = this.f173997c;
                ArrayList arrayList3 = new ArrayList();
                boolean z14 = false;
                boolean z15 = false;
                for (s.i iVar : arrayList2) {
                    if (sVar2.f174006a.e(iVar.f())) {
                        sVar2.f174006a.f5492a.remove(iVar.f());
                        arrayList3.add(iVar.f());
                        if (iVar.g() == b0.w0.class) {
                            z15 = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                TextUtils.join(", ", arrayList3);
                sVar2.toString();
                if (z15) {
                    sVar2.f174013h.f173884h.f173952e = null;
                }
                sVar2.q();
                if (sVar2.f174006a.d().isEmpty()) {
                    l lVar2 = sVar2.f174013h;
                    s2 s2Var = lVar2.f173889m;
                    boolean z16 = s2Var.f174072d;
                    s2Var.f174072d = false;
                    lVar2.z(false);
                } else {
                    sVar2.L();
                    sVar2.K();
                }
                if (!sVar2.f174006a.c().isEmpty()) {
                    sVar2.J();
                    sVar2.C();
                    if (sVar2.f174010e == s.g.OPENED) {
                        sVar2.B();
                        return;
                    }
                    return;
                }
                sVar2.f174013h.q();
                sVar2.C();
                sVar2.f174013h.y(false);
                sVar2.f174019m = sVar2.z();
                sVar2.toString();
                switch (sVar2.f174010e.ordinal()) {
                    case 3:
                    case 4:
                        k7.h.f(sVar2.f174016k == null, null);
                        sVar2.D(s.g.INITIALIZED);
                        return;
                    case 5:
                    default:
                        Objects.toString(sVar2.f174010e);
                        sVar2.toString();
                        return;
                    case 6:
                    case 7:
                    case 8:
                        if (sVar2.f174014i.a() || ((aVar = sVar2.I0.f174038a) != null && !aVar.f174041b.get())) {
                            z14 = true;
                        }
                        sVar2.I0.a();
                        sVar2.D(s.g.CLOSING);
                        if (z14) {
                            k7.h.f(sVar2.f174023q.isEmpty(), null);
                            sVar2.s();
                            return;
                        }
                        return;
                    case 9:
                    case 10:
                        sVar2.D(s.g.CLOSING);
                        sVar2.r();
                        return;
                }
        }
    }
}
