package yc;

import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayList;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 370, 382, 388, 400, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, 431, 440, 453, 464}, m = "onInsert")
public final class y3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v3 f196641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m1.b f196642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f196643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f196644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f196645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f196646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f196647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f196648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f196649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f196650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f196651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f196652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f196653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f196654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f196655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v3<Object, Object> f196656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f196657q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(v3<Object, Object> v3Var, t13.d<? super y3> dVar) {
        super(dVar);
        this.f196656p = v3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196655o = obj;
        this.f196657q |= Integer.MIN_VALUE;
        return this.f196656p.b(null, this);
    }
}
