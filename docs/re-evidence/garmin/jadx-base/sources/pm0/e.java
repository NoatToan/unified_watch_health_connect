package pm0;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import u62.z;
import v62.w0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f138609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f138610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f138611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.d.b f138612e;

    public /* synthetic */ e(boolean z14, boolean z15, boolean z16, com.garmin.android.apps.connectmobile.group.details.challenges.d.b bVar, int i14) {
        this.f138608a = i14;
        this.f138609b = z14;
        this.f138610c = z15;
        this.f138611d = z16;
        this.f138612e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x0113  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        boolean z14 = false;
        final int i14 = 1;
        switch (this.f138608a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = com.garmin.android.apps.connectmobile.group.details.challenges.d.b.f36327c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-924289142, new e(this.f138609b, this.f138610c, this.f138611d, this.f138612e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = com.garmin.android.apps.connectmobile.group.details.challenges.d.b.f36327c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean z15 = this.f138609b;
                    final com.garmin.android.apps.connectmobile.group.details.challenges.d.b bVar = this.f138612e;
                    if (z15 || this.f138610c) {
                        mVar2.C(-462389326);
                        boolean z16 = this.f138611d;
                        m.a aVar = m.f135153a;
                        if (z16) {
                            mVar2.C(-462364154);
                            s62.a.f157643a.getClass();
                            u4.d dVarA = w0.a(t62.b.f162798a);
                            String string = bVar.itemView.getContext().getString(R.string.social_group_no_challenges_yet);
                            String strB = z.b(R.string.social_group_empty_challenge_no_members, bVar.itemView);
                            String string2 = bVar.itemView.getContext().getString(R.string.social_group_invite_members);
                            boolean zR = mVar2.r(bVar);
                            Object objQ = mVar2.q();
                            if (zR) {
                                obj4 = objQ;
                                final boolean z17 = z14 ? 1 : 0;
                                e23.a aVar2 = new e23.a() { // from class: pm0.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (z17) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar = bVar.f36328a;
                                                if (iVar != null) {
                                                    iVar.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_INVITE_MEMBERS);
                                                }
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar2 = bVar.f36328a;
                                                if (iVar2 != null) {
                                                    iVar2.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_CREATE_CHALLENGE);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar2);
                                obj4 = aVar2;
                            } else {
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    obj4 = objQ;
                                    final int z18 = z14 ? 1 : 0;
                                    e23.a aVar3 = new e23.a() { // from class: pm0.f
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (z18) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar = bVar.f36328a;
                                                    if (iVar != null) {
                                                        iVar.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_INVITE_MEMBERS);
                                                    }
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar2 = bVar.f36328a;
                                                    if (iVar2 != null) {
                                                        iVar2.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_CREATE_CHALLENGE);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(aVar3);
                                    obj4 = aVar3;
                                }
                            }
                            obj4 = objQ;
                            b82.n.d(dVarA, string, strB, null, string2, (e23.a) obj4, null, null, mVar2, 0, 200);
                            mVar2.f();
                        } else {
                            mVar2.C(-461609676);
                            s62.a.f157643a.getClass();
                            u4.d dVarA2 = w0.a(t62.b.f162798a);
                            String string3 = bVar.itemView.getContext().getString(R.string.social_group_no_challenges_yet);
                            String strB2 = z.b(R.string.social_group_empty_challenge_as_admin_message, bVar.itemView);
                            String string4 = bVar.itemView.getContext().getString(R.string.social_group_create_a_group_challenge);
                            boolean zR2 = mVar2.r(bVar);
                            Object objQ2 = mVar2.q();
                            if (zR2) {
                                obj3 = objQ2;
                                e23.a aVar4 = new e23.a() { // from class: pm0.f
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar = bVar.f36328a;
                                                if (iVar != null) {
                                                    iVar.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_INVITE_MEMBERS);
                                                }
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar2 = bVar.f36328a;
                                                if (iVar2 != null) {
                                                    iVar2.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_CREATE_CHALLENGE);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(aVar4);
                                obj3 = aVar4;
                            } else {
                                aVar.getClass();
                                if (objQ2 == m.a.f135155b) {
                                    obj3 = objQ2;
                                    e23.a aVar5 = new e23.a() { // from class: pm0.f
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar = bVar.f36328a;
                                                    if (iVar != null) {
                                                        iVar.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_INVITE_MEMBERS);
                                                    }
                                                    break;
                                                default:
                                                    com.garmin.android.apps.connectmobile.group.details.challenges.d.i iVar2 = bVar.f36328a;
                                                    if (iVar2 != null) {
                                                        iVar2.B2(com.garmin.android.apps.connectmobile.group.details.challenges.d.h.NAVIGATE_TO_CREATE_CHALLENGE);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(aVar5);
                                    obj3 = aVar5;
                                }
                            }
                            obj3 = objQ2;
                            b82.n.d(dVarA2, string3, strB2, null, string4, (e23.a) obj3, null, null, mVar2, 0, 200);
                            mVar2.f();
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(-460828259);
                        s62.a.f157643a.getClass();
                        b82.n.c(w0.a(t62.b.f162798a), bVar.itemView.getContext().getString(R.string.social_group_no_challenges_yet), z.b(R.string.social_group_empty_challenge_as_member_message, bVar.itemView), null, null, mVar2, 0, 24);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
