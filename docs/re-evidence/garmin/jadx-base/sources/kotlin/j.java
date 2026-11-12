package kotlin;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Li5/j;", "Li5/o1;", "Li5/k;", "androidClipboardManager", "<init>", "(Li5/k;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f91218a;

    public j(Context context) {
        this(new k(context));
    }

    @Override // kotlin.o1
    public final m1 a() {
        ClipData primaryClip = this.f91218a.a().getPrimaryClip();
        if (primaryClip != null) {
            return new m1(primaryClip);
        }
        return null;
    }

    @Override // kotlin.o1
    public final ClipboardManager b() {
        return this.f91218a.a();
    }

    @Override // kotlin.o1
    public final p005kotlin.Unit c(m1 m1Var) {
        k kVar = this.f91218a;
        if (m1Var == null) {
            ClipboardManager clipboardManagerA = kVar.a();
            int i14 = y0.f91648a;
            clipboardManagerA.clearPrimaryClip();
        } else {
            kVar.a().setPrimaryClip(m1Var.f91340a);
        }
        return p005kotlin.Unit.INSTANCE;
    }

    public j(k kVar) {
        this.f91218a = kVar;
    }
}
