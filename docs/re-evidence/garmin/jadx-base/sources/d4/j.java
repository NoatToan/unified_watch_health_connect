package d4;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.o0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld4/j;", "Ld4/f;", "Lnd/e;", TtmlNode.RUBY_BASE, "<init>", "(Ld4/f;)V", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements f, nd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f57450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f57451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nd.d f57452c;

    public j(f fVar) {
        this.f57450a = fVar;
        Object objE = fVar.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null && this.f57452c == null) {
            nd.d.f125385c.getClass();
            nd.d dVarA = nd.d.a.a(this);
            this.f57452c = dVarA;
            dVarA.a(bundle);
        }
        f("androidx.savedstate.SavedStateRegistry", new cq0.g(this, 9));
    }

    @Override // d4.f
    public final boolean a(Object obj) {
        return this.f57450a.a(obj);
    }

    @Override // d4.f
    public final Map<String, List<Object>> b() {
        return this.f57450a.b();
    }

    @Override // d4.f
    public final Object e(String str) {
        return this.f57450a.e(str);
    }

    @Override // d4.f
    public final f.a f(String str, e23.a<? extends Object> aVar) {
        return this.f57450a.f(str, aVar);
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public final b0 getF158016a() {
        o0 o0Var = this.f57451b;
        if (o0Var != null) {
            return o0Var;
        }
        o0.f7970k.getClass();
        o0 o0Var2 = new o0(this, false, null);
        this.f57451b = o0Var2;
        return o0Var2;
    }

    @Override // nd.e
    public final nd.c getSavedStateRegistry() {
        nd.d dVarA = this.f57452c;
        if (dVarA == null) {
            nd.d.f125385c.getClass();
            dVarA = nd.d.a.a(this);
            this.f57452c = dVarA;
            dVarA.a(null);
        }
        return dVarA.f125387b;
    }
}
