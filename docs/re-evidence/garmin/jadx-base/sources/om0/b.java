package om0;

import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment$initView$1$1$1", f = "GroupDetailMemberListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> f132899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailMemberListFragment f132900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f132901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zc.d<com.garmin.android.apps.connectmobile.group.details.about.member.a> dVar, GroupDetailMemberListFragment groupDetailMemberListFragment, p1<Boolean> p1Var, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f132899a = dVar;
        this.f132900b = groupDetailMemberListFragment;
        this.f132901c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f132899a, this.f132900b, this.f132901c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z0 z0Var = this.f132899a.d().f196385a;
        boolean z14 = z0Var instanceof z0.a;
        p1<Boolean> p1Var = this.f132901c;
        GroupDetailMemberListFragment groupDetailMemberListFragment = this.f132900b;
        if (z14) {
            p1Var.setValue(Boolean.FALSE);
            g22.e.f(groupDetailMemberListFragment);
            g22.e.a(groupDetailMemberListFragment, null);
        } else if (s.g(z0Var, z0.b.f196664b)) {
            if (!p1Var.getF182175a().booleanValue()) {
                g22.e.l(groupDetailMemberListFragment);
            }
        } else {
            if (!(z0Var instanceof z0.c)) {
                u0.r();
                return null;
            }
            p1Var.setValue(Boolean.FALSE);
            g22.e.f(groupDetailMemberListFragment);
        }
        return Unit.INSTANCE;
    }
}
