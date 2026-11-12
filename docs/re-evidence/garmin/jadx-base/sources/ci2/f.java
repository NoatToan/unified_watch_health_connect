package ci2;

import android.app.Dialog;
import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci2/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class f extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f27692a = new c();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        c cVar = this.f27692a;
        Dialog dialog = cVar.f27688a;
        if (dialog != null) {
            dialog.dismiss();
        }
        cVar.f27688a = null;
        super.onDestroy();
    }
}
