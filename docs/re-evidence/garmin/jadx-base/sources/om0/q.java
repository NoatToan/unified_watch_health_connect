package om0;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity$onCreate$1$1$onConfirm$1", f = "GroupTransferOwnershipActivity.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f132956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<com.garmin.android.apps.connectmobile.connections.groups.services.model.b> f132957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupTransferOwnershipActivity f132958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f132959e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GroupTransferOwnershipActivity f132960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f132961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f132962c;

        /* JADX INFO: renamed from: om0.q$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2522a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132963a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f132963a = iArr;
            }
        }

        public a(GroupTransferOwnershipActivity groupTransferOwnershipActivity, Context context, p1<Boolean> p1Var) {
            this.f132960a = groupTransferOwnershipActivity;
            this.f132961b = context;
            this.f132962c = p1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            g3 g3Var = (g3) obj;
            int i14 = C2522a.f132963a[g3Var.f35300a.ordinal()];
            p1<Boolean> p1Var = this.f132962c;
            if (i14 == 1) {
                GroupTransferOwnershipActivity.a aVar = GroupTransferOwnershipActivity.f36209d;
                p1Var.setValue(Boolean.FALSE);
                GroupDTO groupDTO = (GroupDTO) g3Var.f35301b;
                GroupTransferOwnershipActivity groupTransferOwnershipActivity = this.f132960a;
                groupTransferOwnershipActivity.f36210a = groupDTO;
                groupTransferOwnershipActivity.f36211b = true;
                groupTransferOwnershipActivity.finish();
            } else if (i14 == 2) {
                GroupTransferOwnershipActivity.a aVar2 = GroupTransferOwnershipActivity.f36209d;
                p1Var.setValue(Boolean.FALSE);
                Toast.makeText(this.f132961b, R.string.txt_error_occurred, 0).show();
            } else if (i14 != 3) {
                u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p1<Boolean> p1Var, p1<com.garmin.android.apps.connectmobile.connections.groups.services.model.b> p1Var2, GroupTransferOwnershipActivity groupTransferOwnershipActivity, Context context, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f132956b = p1Var;
        this.f132957c = p1Var2;
        this.f132958d = groupTransferOwnershipActivity;
        this.f132959e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f132956b, this.f132957c, this.f132958d, this.f132959e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String userProfileId;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132955a;
        if (i14 == 0) {
            o13.r.b(obj);
            GroupTransferOwnershipActivity.a aVar2 = GroupTransferOwnershipActivity.f36209d;
            Boolean bool = Boolean.TRUE;
            p1<Boolean> p1Var = this.f132956b;
            p1Var.setValue(bool);
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b f182175a = this.f132957c.getF182175a();
            if (f182175a != null && (userProfileId = f182175a.getUserProfileId()) != null) {
                GroupTransferOwnershipActivity groupTransferOwnershipActivity = this.f132958d;
                c2 c2Var = new c2(new r((com.garmin.android.apps.connectmobile.group.details.about.member.d) groupTransferOwnershipActivity.f36212c.getValue(), userProfileId, null));
                a aVar3 = new a(groupTransferOwnershipActivity, this.f132959e, p1Var);
                this.f132955a = 1;
                if (c2Var.collect(aVar3, this) == aVar) {
                    return aVar;
                }
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
