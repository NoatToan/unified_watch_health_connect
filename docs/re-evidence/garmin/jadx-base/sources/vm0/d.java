package vm0;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity;
import o53.b0;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity$triggerSearchByKeyword$1", f = "GroupInviteActivity.kt", l = {111}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInviteActivity f178742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f178743c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity$triggerSearchByKeyword$1$1", f = "GroupInviteActivity.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178744a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f178744a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f178744a = 1;
                if (m0.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GroupInviteActivity groupInviteActivity, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f178742b = groupInviteActivity;
        this.f178743c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f178742b, this.f178743c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178741a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f178741a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        GroupInviteActivity groupInviteActivity = this.f178742b;
        String str = this.f178743c;
        groupInviteActivity.f36361c = str;
        Fragment fragmentG = groupInviteActivity.getSupportFragmentManager().G("GroupInviteActivity");
        if ((fragmentG instanceof com.garmin.android.apps.connectmobile.group.details.invite.b ? (com.garmin.android.apps.connectmobile.group.details.invite.b) fragmentG : null) != null) {
            k kVar = (k) groupInviteActivity.f36359a.getValue();
            String string = str.toString();
            string.getClass();
            kVar.f178776c = string;
            kVar.f178774a.j(Unit.INSTANCE);
        } else {
            groupInviteActivity.da(str);
        }
        return Unit.INSTANCE;
    }
}
