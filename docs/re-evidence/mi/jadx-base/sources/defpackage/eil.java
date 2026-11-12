package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.View;
import java.lang.ref.WeakReference;
import miuix.appcompat.internal.app.widget.SearchActionModeView;

/* JADX INFO: loaded from: classes3.dex */
public class eil extends le0 implements dil {
    public eil(Context context, ActionMode.Callback callback) {
        super(context, callback);
    }

    @Override // defpackage.dil
    public void a(dil.a aVar) {
        ((SearchActionModeView) this.f24958b.get()).setAnimatedViewListener(aVar);
    }

    public void g(Rect rect) {
        WeakReference<me0> weakReference = this.f24958b;
        SearchActionModeView searchActionModeView = weakReference != null ? (SearchActionModeView) weakReference.get() : null;
        if (searchActionModeView != null) {
            searchActionModeView.K(rect);
        }
    }

    @Override // defpackage.le0, android.view.ActionMode
    public View getCustomView() {
        return ((SearchActionModeView) this.f24958b.get()).getCustomView();
    }

    @Override // defpackage.le0, android.view.ActionMode
    public void setCustomView(View view) {
        ((SearchActionModeView) this.f24958b.get()).setCustomView(view);
    }
}
