package g62;

import android.content.DialogInterface;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Boolean> f76107a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(o53.j<? super Boolean> jVar) {
        this.f76107a = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f76107a.u(null);
    }
}
