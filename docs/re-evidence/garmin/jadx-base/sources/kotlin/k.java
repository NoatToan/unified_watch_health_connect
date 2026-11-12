package kotlin;

import android.content.ClipboardManager;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/k;", "Li5/p1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f91236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipboardManager f91237b;

    public k(Context context) {
        this.f91236a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.f91237b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.f91236a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f91237b = clipboardManager2;
        return clipboardManager2;
    }
}
