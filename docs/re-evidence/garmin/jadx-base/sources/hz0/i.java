package hz0;

import android.content.Context;
import c22.b3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg0.a f86442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewsFeedListFragment f86443c;

    public /* synthetic */ i(NewsFeedListFragment newsFeedListFragment, wg0.a aVar) {
        this.f86441a = 2;
        this.f86443c = newsFeedListFragment;
        this.f86442b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f86441a;
        wg0.a aVar = this.f86442b;
        NewsFeedListFragment newsFeedListFragment = this.f86443c;
        switch (i14) {
            case 0:
                wg0.m mVar = aVar.f185060t;
                g3 g3Var = (g3) obj;
                g3Var.getClass();
                int i15 = NewsFeedListFragment.b.a.f39439a[g3Var.f35300a.ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        if (mVar != null) {
                            mVar.f185114g = false;
                        }
                        int i16 = NewsFeedListFragment.Y;
                        newsFeedListFragment.f7(aVar);
                    } else {
                        if (i15 != 3) {
                            u0.r();
                            return null;
                        }
                        if (mVar != null) {
                            mVar.f185114g = false;
                        }
                        wg0.a aVarD = wg0.a.d(aVar);
                        wg0.m mVar2 = aVarD.f185060t;
                        if (mVar2 != null) {
                            mVar2.d();
                        }
                        int i17 = NewsFeedListFragment.Y;
                        newsFeedListFragment.f7(aVarD);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                wg0.m mVar3 = aVar.f185060t;
                g3 g3Var2 = (g3) obj;
                g3Var2.getClass();
                int i18 = NewsFeedListFragment.b.a.f39439a[g3Var2.f35300a.ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        if (mVar3 != null) {
                            mVar3.f185114g = false;
                        }
                        mo1.f fVar = (mo1.f) g3Var2.f35301b;
                        if (fVar == null) {
                            wg0.a aVarD2 = wg0.a.d(aVar);
                            wg0.m mVar4 = aVarD2.f185060t;
                            if (mVar4 != null) {
                                mVar4.d();
                            }
                            int i19 = NewsFeedListFragment.Y;
                            newsFeedListFragment.f7(aVarD2);
                        } else {
                            if ((mVar3 != null ? mVar3.f185111d : null) != null) {
                                if ((mVar3 != null ? mVar3.f185110c : null) == null) {
                                    if (mVar3 != null) {
                                        mVar3.f185111d = fVar.getUuid();
                                        mVar3.f185110c = Long.valueOf(fVar.getConversationLikePk());
                                    }
                                }
                            } else if (mVar3 != null) {
                                mVar3.f185111d = fVar.getUuid();
                                mVar3.f185110c = Long.valueOf(fVar.getConversationLikePk());
                            }
                            int i24 = NewsFeedListFragment.Y;
                            newsFeedListFragment.f7(aVar);
                        }
                    } else {
                        if (i18 != 3) {
                            u0.r();
                            return null;
                        }
                        if (zy0.g.a(g3Var2.f35304e)) {
                            Context context = newsFeedListFragment.getContext();
                            if (context == null) {
                                return Unit.INSTANCE;
                            }
                            b3.c(context);
                        }
                        if (mVar3 != null) {
                            mVar3.f185114g = false;
                        }
                        wg0.a aVarD3 = wg0.a.d(aVar);
                        wg0.m mVar5 = aVarD3.f185060t;
                        if (mVar5 != null) {
                            mVar5.d();
                        }
                        int i25 = NewsFeedListFragment.Y;
                        newsFeedListFragment.f7(aVarD3);
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var3 = (g3) obj;
                g3Var3.getClass();
                if (g3Var3.f35300a == fw.p.ERROR) {
                    int i26 = NewsFeedListFragment.Y;
                    newsFeedListFragment.c7().z4(aVar);
                    g22.e.c(newsFeedListFragment);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(wg0.a aVar, NewsFeedListFragment newsFeedListFragment, int i14) {
        this.f86441a = i14;
        this.f86442b = aVar;
        this.f86443c = newsFeedListFragment;
    }
}
