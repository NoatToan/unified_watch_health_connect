package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends d.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f7029a;

    public c(d.a aVar) {
        this.f7029a = aVar;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th3) {
        this.f7029a.f7043a.g(th3);
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        d.a aVar = this.f7029a;
        aVar.f7042c = hVar;
        h hVar2 = aVar.f7042c;
        d dVar = aVar.f7043a;
        aVar.f7041b = new f(hVar2, dVar.f7038g, dVar.f7040i, false, null, Build.VERSION.SDK_INT >= 34 ? a8.e.a() : a8.f.a());
        d dVar2 = aVar.f7043a;
        dVar2.getClass();
        ArrayList arrayList = new ArrayList();
        dVar2.f7032a.writeLock().lock();
        try {
            dVar2.f7034c = 1;
            arrayList.addAll(dVar2.f7033b);
            dVar2.f7033b.clear();
            dVar2.f7032a.writeLock().unlock();
            dVar2.f7035d.post(new d.g(arrayList, dVar2.f7034c));
        } catch (Throwable th3) {
            dVar2.f7032a.writeLock().unlock();
            throw th3;
        }
    }
}
