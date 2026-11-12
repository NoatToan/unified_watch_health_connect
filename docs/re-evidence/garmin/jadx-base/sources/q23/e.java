package q23;

import w23.i0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.a<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f142318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.reflect.jvm.internal.impl.builtins.d f142319b;

    public e(p005kotlin.reflect.jvm.internal.impl.builtins.d dVar, i0 i0Var) {
        this.f142319b = dVar;
        this.f142318a = i0Var;
    }

    @Override // e23.a
    public final Void invoke() {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVar = this.f142319b;
        i0 i0Var = dVar.f105833a;
        i0 i0Var2 = this.f142318a;
        if (i0Var == null) {
            dVar.f105833a = i0Var2;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + dVar.f105833a + " (attempting to reset to " + i0Var2 + ")");
    }
}
