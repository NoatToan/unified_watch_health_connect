package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.util.UCropImageUtil", f = "UCropImageUtil.kt", l = {65}, m = "storeBitmapToUri", v = 2)
public final class i3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f23094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3 f23096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, t13.d<? super i3> dVar) {
        super(dVar);
        this.f23096c = k3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23095b = obj;
        this.f23097d |= Integer.MIN_VALUE;
        return this.f23096c.c(null, null, this);
    }
}
