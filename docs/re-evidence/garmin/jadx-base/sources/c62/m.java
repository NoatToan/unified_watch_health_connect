package c62;

import android.content.DialogInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<Boolean> f24805a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(t13.d<? super Boolean> dVar) {
        this.f24805a = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i14 = o13.q.f128596b;
        this.f24805a.resumeWith(Boolean.FALSE);
    }
}
