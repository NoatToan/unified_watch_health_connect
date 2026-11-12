package g62;

import android.content.DialogInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Boolean> f76105a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(o53.j<? super Boolean> jVar) {
        this.f76105a = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = o13.q.f128596b;
        this.f76105a.resumeWith(Boolean.TRUE);
    }
}
