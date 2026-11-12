package yc;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", l = {190, 230, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "onNext")
public final class r4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s4 f196378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f196379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f196380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f196382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s4<Object, Object> f196383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f196384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(s4<Object, Object> s4Var, t13.d<? super r4> dVar) {
        super(dVar);
        this.f196383f = s4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196382e = obj;
        this.f196384g |= Integer.MIN_VALUE;
        return this.f196383f.a(0, null, this);
    }
}
