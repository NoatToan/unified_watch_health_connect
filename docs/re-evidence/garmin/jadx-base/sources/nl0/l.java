package nl0;

import android.app.Activity;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnl0/l;", "Lnl0/a;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/app/Activity;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f126496a;

    public l(Activity activity) {
        activity.getClass();
        this.f126496a = activity;
    }

    @Override // nl0.a
    public final void execute() {
        this.f126496a.finish();
    }
}
