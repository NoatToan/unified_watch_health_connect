package te2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {292}, m = "attemptGC1ForGC1")
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f164388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f164390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f164391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h0 h0Var, t13.d<? super y> dVar) {
        super(dVar);
        this.f164391d = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164390c = obj;
        this.f164392e |= Integer.MIN_VALUE;
        return this.f164391d.j(this);
    }
}
