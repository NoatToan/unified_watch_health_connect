package et1;

import android.view.Window;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Let1/v1;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v1 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f65905a;

    public v1(Window window) {
        this.f65905a = window;
    }

    @Override // p3.h0
    public final void dispose() {
        Window window = this.f65905a;
        if (window != null) {
            window.setSoftInputMode(16);
        }
    }
}
