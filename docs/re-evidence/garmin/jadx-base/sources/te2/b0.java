package te2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {369}, m = "attemptIT2ForGC1")
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f163969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f163970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f163971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f163972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f163973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f163972d = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163971c = obj;
        this.f163973e |= Integer.MIN_VALUE;
        return this.f163972d.m(this);
    }
}
