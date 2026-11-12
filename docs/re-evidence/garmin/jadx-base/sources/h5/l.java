package h5;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final View a(j jVar) {
        if (!jVar.getNode().getIsAttached()) {
            e5.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) i0.a(k.g(jVar));
    }
}
