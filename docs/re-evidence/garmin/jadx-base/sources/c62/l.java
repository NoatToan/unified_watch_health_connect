package c62;

import android.content.DialogInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f24776a;

    /* JADX WARN: Multi-variable type inference failed */
    public l(t13.d<? super Boolean> dVar) {
        this.f24776a = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = o13.q.f128596b;
        this.f24776a.resumeWith(Boolean.FALSE);
    }
}
