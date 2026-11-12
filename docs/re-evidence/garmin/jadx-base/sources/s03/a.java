package s03;

import i13.g;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, v03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g<b> f155448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f155449b;

    public a(Iterable<? extends b> iterable) {
        w03.b.a(iterable, "disposables is null");
        this.f155448a = new g<>();
        for (b bVar : iterable) {
            w03.b.a(bVar, "A Disposable item in the disposables sequence is null");
            this.f155448a.a(bVar);
        }
    }

    public static void f(g gVar) {
        if (gVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : gVar.f87115e) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw i13.d.b((Throwable) arrayList.get(0));
        }
    }

    @Override // v03.b
    public final boolean a(b bVar) {
        w03.b.a(bVar, "disposable is null");
        if (!this.f155449b) {
            synchronized (this) {
                try {
                    if (!this.f155449b) {
                        g<b> gVar = this.f155448a;
                        if (gVar == null) {
                            gVar = new g<>();
                            this.f155448a = gVar;
                        }
                        gVar.a(bVar);
                        return true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // s03.b
    public final boolean b() {
        return this.f155449b;
    }

    @Override // v03.b
    public final boolean c(b bVar) {
        if (!d(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // v03.b
    public final boolean d(b bVar) {
        b bVar2;
        int i14 = w03.b.f181178a;
        if (this.f155449b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f155449b) {
                    return false;
                }
                g<b> gVar = this.f155448a;
                if (gVar != null) {
                    b[] bVarArr = gVar.f87115e;
                    int i15 = gVar.f87112b;
                    int iHashCode = bVar.hashCode() * (-1640531527);
                    int i16 = (iHashCode ^ (iHashCode >>> 16)) & i15;
                    b bVar3 = bVarArr[i16];
                    if (bVar3 != null) {
                        if (bVar3.equals(bVar)) {
                            gVar.b(i16, i15, bVarArr);
                        } else {
                            do {
                                i16 = (i16 + 1) & i15;
                                bVar2 = bVarArr[i16];
                                if (bVar2 == null) {
                                }
                            } while (!bVar2.equals(bVar));
                            gVar.b(i16, i15, bVarArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // s03.b
    public final void dispose() {
        if (this.f155449b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f155449b) {
                    return;
                }
                this.f155449b = true;
                g<b> gVar = this.f155448a;
                this.f155448a = null;
                f(gVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e() {
        if (this.f155449b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f155449b) {
                    return;
                }
                g<b> gVar = this.f155448a;
                this.f155448a = null;
                f(gVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public a(b... bVarArr) {
        w03.b.a(bVarArr, "disposables is null");
        this.f155448a = new g<>(bVarArr.length + 1);
        for (b bVar : bVarArr) {
            w03.b.a(bVar, "A Disposable in the disposables array is null");
            this.f155448a.a(bVar);
        }
    }

    public a() {
    }
}
