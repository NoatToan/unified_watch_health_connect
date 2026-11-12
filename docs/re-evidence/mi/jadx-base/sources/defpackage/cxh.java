package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class cxh implements tpo<bxh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5d f14840b;
    public final dxh c;
    public final Set<uj4> d;

    public cxh(Context context, m5d m5dVar, f57 f57Var) {
        this(context, m5dVar, null, f57Var);
    }

    @Override // defpackage.tpo
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bxh get() {
        return new bxh(this.f14839a, this.c, this.f14840b, this.d);
    }

    public cxh(Context context, f57 f57Var) {
        this(context, m5d.k(), f57Var);
    }

    public cxh(Context context, m5d m5dVar, Set<uj4> set, f57 f57Var) {
        this.f14839a = context;
        j5d j5dVarI = m5dVar.i();
        this.f14840b = j5dVarI;
        dxh dxhVar = new dxh();
        this.c = dxhVar;
        dxhVar.a(context.getResources(), jy5.e(), m5dVar.a(context), v8q.g(), j5dVarI.i(), null, null);
        this.d = set;
    }
}
