package ci2;

import android.app.Dialog;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci2/c;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f27688a;

    public final void a(Dialog dialog) {
        dialog.getClass();
        Dialog dialog2 = this.f27688a;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.f27688a = dialog;
        dialog.show();
    }
}
