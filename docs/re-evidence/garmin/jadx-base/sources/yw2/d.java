package yw2;

import android.app.Dialog;
import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyw2/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f199995a = new a();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f199995a;
        Dialog dialog = aVar.f199990b;
        if (dialog != null) {
            dialog.dismiss();
        }
        aVar.f199990b = null;
        super.onDestroy();
    }
}
