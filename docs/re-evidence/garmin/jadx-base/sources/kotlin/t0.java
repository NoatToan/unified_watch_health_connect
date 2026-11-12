package kotlin;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import n23.j;
import o2.c;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/t0;", "Li5/t3;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t0 implements t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f91482a;

    public t0(Context context) {
        this.f91482a = context;
    }

    @Override // kotlin.t3
    public final void a(String str) {
        try {
            this.f91482a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e4) {
            j.w(c.c('.', "Can't open ", str), e4);
        }
    }
}
