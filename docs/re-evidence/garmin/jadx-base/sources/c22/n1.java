package c22;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc22/n1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhb2/g$a;", "appEnum", "<init>", "(Landroid/content/Context;Lhb2/g$a;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb2.g.a f23169b;

    public n1(Context context, hb2.g.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f23168a = context;
        this.f23169b = aVar;
    }

    public final void a() {
        q0.f23203a.getClass();
        Context context = this.f23168a;
        context.startActivity(new Intent("android.intent.action.VIEW", q0.a.a(context, this.f23169b)));
    }
}
