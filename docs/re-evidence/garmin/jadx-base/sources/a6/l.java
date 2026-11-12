package a6;

import android.text.style.ClickableSpan;
import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La6/l;", "Landroid/text/style/ClickableSpan;", "Ls5/m;", "link", "<init>", "(Ls5/m;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.m f1512a;

    public l(s5.m mVar) {
        this.f1512a = mVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        s5.m mVar = this.f1512a;
        s5.n f157244c = mVar.getF157244c();
        if (f157244c != null) {
            f157244c.a(mVar);
        }
    }
}
