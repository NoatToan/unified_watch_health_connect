package te2;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.ContinueAsHandler", f = "ContinueAsHandler.kt", l = {476}, m = "attemptDI2ForIT2")
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f164356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f164358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f164359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h0 h0Var, t13.d<? super w> dVar) {
        super(dVar);
        this.f164359d = h0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164358c = obj;
        this.f164360e |= Integer.MIN_VALUE;
        return this.f164359d.h(this);
    }
}
