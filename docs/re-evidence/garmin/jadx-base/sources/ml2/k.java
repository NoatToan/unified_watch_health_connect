package ml2;

import com.google.common.util.concurrent.FutureCallback;

/* JADX INFO: loaded from: classes11.dex */
public class k implements FutureCallback<nl2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f119373a;

    public k(l lVar) {
        this.f119373a = lVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th3) {
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(nl2.a aVar) {
        nl2.a aVar2 = aVar;
        if (aVar2 != null) {
            this.f119373a.f119376c.debug("Closed all ML handles with status {}", Integer.valueOf(aVar2.f126501d));
        }
    }
}
