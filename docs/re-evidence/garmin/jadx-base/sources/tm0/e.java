package tm0;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm0/e;", "Landroid/text/TextWatcher;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f165365a;

    public e(c cVar) {
        this.f165365a = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        c cVar = this.f165365a;
        MenuItem menuItem = cVar.f165356g;
        if (menuItem != null) {
            menuItem.setEnabled(c.u6(cVar));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
