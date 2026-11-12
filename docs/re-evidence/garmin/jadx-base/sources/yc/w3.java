package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "R", "T", "Lyc/p4;", "stash", "", "invoke", "(Lyc/p4;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class w3 extends p005kotlin.jvm.internal.w implements e23.l<p4<Object>, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j23.l f196572a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(j23.l lVar) {
        super(1);
        this.f196572a = lVar;
    }

    @Override // e23.l
    public final Boolean invoke(p4<Object> p4Var) {
        p4<Object> p4Var2 = p4Var;
        p4Var2.getClass();
        boolean z14 = false;
        for (int i14 : p4Var2.f196318a) {
            if (this.f196572a.d(i14)) {
                z14 = true;
                break;
            }
        }
        return Boolean.valueOf(z14);
    }
}
