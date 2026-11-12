package p004k6;

import e23.l;
import g6.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg6/m;", "it", "", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class k extends w implements l<m, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f103081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x xVar) {
        super(1);
        this.f103081a = xVar;
    }

    @Override // e23.l
    public final Unit invoke(m mVar) {
        m mVarA = m.a(mVar.f76013a);
        x xVar = this.f103081a;
        xVar.m332setPopupContentSizefhxjrPA(mVarA);
        xVar.g();
        return Unit.INSTANCE;
    }
}
