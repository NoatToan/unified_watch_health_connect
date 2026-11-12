package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/r;", "H", "Landroidx/fragment/app/o;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "(Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/m;", "(Landroidx/fragment/app/m;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r<H> extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f7357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f7360d;

    public r(Activity activity, Context context, Handler handler, int i14) {
        context.getClass();
        handler.getClass();
        this.f7357a = activity;
        this.f7358b = context;
        this.f7359c = handler;
        this.f7360d = new w();
    }

    @Override // androidx.fragment.app.o
    public View b(int i14) {
        return null;
    }

    @Override // androidx.fragment.app.o
    public boolean c() {
        return true;
    }

    public void d(PrintWriter printWriter, String[] strArr) {
    }

    public abstract m e();

    public LayoutInflater f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f7358b);
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    public boolean g(String str) {
        str.getClass();
        return false;
    }

    public void h() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Context context, Handler handler, int i14) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i14);
        context.getClass();
        handler.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(m mVar) {
        this(mVar, mVar, new Handler(), 0);
        mVar.getClass();
    }
}
