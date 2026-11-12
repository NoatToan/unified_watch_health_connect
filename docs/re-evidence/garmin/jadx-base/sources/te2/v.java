package te2;

import android.content.Context;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {214, 216}, m = "attemptDI2ForDI2")
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f164336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sc2.l f164338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f164339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ve2.e f164340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f164341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f164342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f164343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f164344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h0 h0Var, t13.d<? super v> dVar) {
        super(dVar);
        this.f164343h = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164342g = obj;
        this.f164344i |= Integer.MIN_VALUE;
        return this.f164343h.g(this);
    }
}
