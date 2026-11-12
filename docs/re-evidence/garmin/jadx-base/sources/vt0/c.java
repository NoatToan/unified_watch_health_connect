package vt0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import g22.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvt0/c;", "Lq82/c;", "Ln82/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements q82.c<n82.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi0.e f180063a;

    public c(Context context) {
        context.getClass();
        this.f180063a = new pi0.e(context);
    }

    @Override // q82.c
    public final String a(n82.d dVar) {
        o82.a aVar = dVar.f124956a;
        return this.f180063a.m(l.h(aVar.f130843a), l.h(aVar.f130844b), pi0.f.SHORT_MONTH_NO_WEEKDAY);
    }
}
