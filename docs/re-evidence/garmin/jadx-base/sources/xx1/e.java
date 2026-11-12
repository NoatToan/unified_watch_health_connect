package xx1;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements l<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f192563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<String> f192564b;

    public e(p1<Boolean> p1Var, p1<String> p1Var2) {
        this.f192563a = p1Var;
        this.f192564b = p1Var2;
    }

    @Override // e23.l
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        this.f192563a.setValue(Boolean.TRUE);
        this.f192564b.setValue(str2);
        return Unit.INSTANCE;
    }
}
