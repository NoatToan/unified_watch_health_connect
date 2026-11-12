package g62;

import android.content.DialogInterface;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Unit> f76086a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(o53.j<? super Unit> jVar) {
        this.f76086a = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        this.f76086a.u(null);
    }
}
