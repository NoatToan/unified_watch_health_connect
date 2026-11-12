package w5;

import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw5/c;", "Lb7/g$c;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends b7.g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Typeface> f182073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f182074b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(o53.j<? super Typeface> jVar, p0 p0Var) {
        this.f182073a = jVar;
        this.f182074b = p0Var;
    }

    @Override // b7.g.c
    /* JADX INFO: renamed from: onFontRetrievalFailed */
    public final void lambda$callbackFailAsync$1(int i14) {
        this.f182073a.u(new IllegalStateException("Unable to load font " + this.f182074b + " (reason=" + i14 + CoreConstants.RIGHT_PARENTHESIS_CHAR));
    }

    @Override // b7.g.c
    /* JADX INFO: renamed from: onFontRetrieved */
    public final void lambda$callbackSuccessAsync$0(Typeface typeface) {
        int i14 = o13.q.f128596b;
        this.f182073a.resumeWith(typeface);
    }
}
