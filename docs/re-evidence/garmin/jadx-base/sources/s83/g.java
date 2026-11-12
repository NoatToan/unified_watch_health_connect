package s83;

import j83.o;

/* JADX INFO: loaded from: classes11.dex */
public class g implements n83.d<n83.a, o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j83.h f157963a;

    public g(i iVar, j83.h hVar) {
        this.f157963a = hVar;
    }

    @Override // n83.d
    public final o call(n83.a aVar) {
        j83.h.a aVarCreateWorker = this.f157963a.createWorker();
        aVarCreateWorker.a(new f(this, aVar, aVarCreateWorker));
        return aVarCreateWorker;
    }
}
