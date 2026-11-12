package te2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {330}, m = "attemptIT2ForDI2")
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f163950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f163951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f163952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f163953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f163954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h0 h0Var, t13.d<? super a0> dVar) {
        super(dVar);
        this.f163953d = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163952c = obj;
        this.f163954e |= Integer.MIN_VALUE;
        return this.f163953d.l(this);
    }
}
