package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class tx3 implements sx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35153b;
    public xw3 c;

    public tx3(Context context, String str) {
        this.f35152a = context;
        this.f35153b = str;
    }

    @Override // defpackage.sx3
    public xw3 a(yw3 yw3Var) {
        ex3 ex3Var = new ex3(yw3Var, this.f35152a, this.f35153b);
        this.c = ex3Var;
        return ex3Var;
    }
}
