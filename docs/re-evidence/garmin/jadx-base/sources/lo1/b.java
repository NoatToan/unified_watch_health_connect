package lo1;

import android.widget.PopupMenu;

/* JADX INFO: loaded from: classes10.dex */
public class b implements PopupMenu.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f114008a;

    public b(c cVar) {
        this.f114008a = cVar;
    }

    @Override // android.widget.PopupMenu.OnDismissListener
    public final void onDismiss(PopupMenu popupMenu) {
        this.f114008a.f114012d = false;
    }
}
