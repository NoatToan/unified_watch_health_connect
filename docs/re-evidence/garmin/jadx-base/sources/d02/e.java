package d02;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import m92.p0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld02/e;", "Lm92/p0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "metric", "<init>", "(Landroid/content/Context;Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57024b;

    public e(Context context, boolean z14) {
        context.getClass();
        this.f57023a = context;
        this.f57024b = z14;
    }

    @Override // m92.p0
    public final String a(double d14) {
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        return aVar.r0(this.f57023a, l3.a.p(d14, this.f57024b), this.f57024b, false, "");
    }
}
