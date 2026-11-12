package hz0;

import android.os.Parcelable;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import c80.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.feed.activity.view.ActivityFeedLoadingView;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedActivity;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedItem;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedViewModel;
import com.garmin.android.apps.connectmobile.newsfeed.view.NewsFeedEmptyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import yc.z0;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedListFragment f86424b;

    public /* synthetic */ e(NewsFeedListFragment newsFeedListFragment, int i14) {
        this.f86423a = i14;
        this.f86424b = newsFeedListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String, java.util.ArrayList, wg0.b] */
    /* JADX WARN: Type inference failed for: r4v19 */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        z0 z0Var;
        RecyclerView.p layoutManager;
        ub1.l lVarU;
        MenuItem menuItem;
        NewsFeedEmptyView.a aVar;
        String string;
        int i14;
        MenuItem menuItem2;
        wg0.m mVar;
        List arrayList;
        b12.b bVar;
        String str;
        wg0.b bVar2;
        wg0.m mVarB;
        int i15 = this.f86423a;
        ?? r14 = 0;
        NewsFeedListFragment newsFeedListFragment = this.f86424b;
        switch (i15) {
            case 0:
                List<li0.d0> list = (List) obj;
                int i16 = NewsFeedListFragment.Y;
                list.getClass();
                com.garmin.android.apps.connectmobile.newsfeed.b bVar3 = newsFeedListFragment.f39431r;
                if (bVar3 != null) {
                    bVar3.I(list);
                } else {
                    newsFeedListFragment.f39435x = p13.h0.b1(list);
                }
                return Unit.INSTANCE;
            case 1:
                yc.s sVar = (yc.s) obj;
                int i17 = NewsFeedListFragment.Y;
                sVar.getClass();
                newsFeedListFragment.w6();
                z0 z0Var2 = sVar.f196385a;
                if (!(z0Var2 instanceof z0.b) || newsFeedListFragment.f34753o) {
                    ActivityFeedLoadingView activityFeedLoadingView = newsFeedListFragment.f39437z;
                    if (activityFeedLoadingView == null) {
                        p005kotlin.jvm.internal.s.m("fullPageLoadingView");
                        throw null;
                    }
                    activityFeedLoadingView.a();
                    newsFeedListFragment.w6();
                    boolean zIsEmpty = newsFeedListFragment.c7().f39461g.f148598a.isEmpty();
                    if (zIsEmpty) {
                        Integer num = newsFeedListFragment.c7().f39461g.f148601d;
                        boolean z15 = (num != null ? num.intValue() : 1) > 0;
                        mz0.a.f121640a.getClass();
                        if (!mz0.a.a().d()) {
                            aVar = NewsFeedEmptyView.a.f39542f;
                            string = newsFeedListFragment.getString(R.string.news_feed_empty_for_no_results_message_with_max_days, String.valueOf(newsFeedListFragment.c7().f39461g.f148603f));
                            string.getClass();
                        } else if (z15) {
                            aVar = NewsFeedEmptyView.a.f39541e;
                            string = newsFeedListFragment.getString(R.string.news_feed_empty_for_no_new_activity_message_with_max_days, String.valueOf(newsFeedListFragment.c7().f39461g.f148603f));
                            string.getClass();
                        } else {
                            aVar = NewsFeedEmptyView.a.f39540d;
                            string = newsFeedListFragment.getString(R.string.msg_review_suggestions);
                            string.getClass();
                        }
                        NewsFeedEmptyView newsFeedEmptyView = newsFeedListFragment.A;
                        if (newsFeedEmptyView == null) {
                            p005kotlin.jvm.internal.s.m("emptyView");
                            throw null;
                        }
                        aVar.getClass();
                        z14 = true;
                        newsFeedEmptyView.f39538a.setContent(new z3.e(-1727746222, true, new rz0.a(aVar, string, newsFeedEmptyView, 0)));
                        newsFeedEmptyView.setVisibility(0);
                        newsFeedListFragment.T6().setVisibility(8);
                    } else {
                        z14 = true;
                    }
                    if (z0Var2 instanceof z0.c) {
                        mz0.a.f121640a.getClass();
                        boolean zD = mz0.a.a().d();
                        androidx.fragment.app.m activity = newsFeedListFragment.getActivity();
                        NewsFeedActivity newsFeedActivity = activity instanceof NewsFeedActivity ? (NewsFeedActivity) activity : null;
                        if (newsFeedActivity != null) {
                            if (zIsEmpty && zD) {
                                z14 = false;
                            }
                            MenuItem menuItem3 = newsFeedActivity.f39430e;
                            if (menuItem3 != null) {
                                menuItem3.setVisible(z14);
                            }
                            if (z14 && (menuItem = newsFeedActivity.f39430e) != null) {
                                oc.b.G(menuItem, newsFeedActivity, R.color.gcm_icon_primary);
                            }
                        }
                        if (!zIsEmpty) {
                            com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
                            com.garmin.android.apps.connectmobile.newsfeed.a.f39475c.setValue(p13.h0.b1(com.garmin.android.apps.connectmobile.newsfeed.a.a()));
                            try {
                                lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), s0.NEWS_FEED, null, 6);
                            } catch (Exception unused) {
                                lVarU = null;
                            }
                            com.garmin.android.apps.connectmobile.newsfeed.b bVar4 = newsFeedListFragment.f39431r;
                            if (bVar4 == null) {
                                p005kotlin.jvm.internal.s.m("newsFeedListAdapter");
                                throw null;
                            }
                            bVar4.f39484p = lVarU;
                            bVar4.f157385f.notifyItemChanged(0);
                            RecyclerView recyclerView = newsFeedListFragment.f34749k;
                            if (recyclerView == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            androidx.recyclerview.widget.g gVar = (androidx.recyclerview.widget.g) recyclerView.getAdapter();
                            if (gVar != null) {
                                s51.d<Item> dVar = newsFeedListFragment.f34748j;
                                if (dVar == 0) {
                                    p005kotlin.jvm.internal.s.m("pagedListAdapter");
                                    throw null;
                                }
                                gVar.f10457a.a(0, dVar.f157385f);
                            }
                        }
                    }
                    if (newsFeedListFragment.V6()) {
                        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
                        Parcelable parcelable = com.garmin.android.apps.connectmobile.newsfeed.a.f39474b.f148606i;
                        if (parcelable != null && (layoutManager = newsFeedListFragment.T6().getLayoutManager()) != null) {
                            layoutManager.onRestoreInstanceState(parcelable);
                        }
                        com.garmin.android.apps.connectmobile.newsfeed.b bVar5 = newsFeedListFragment.f39431r;
                        if (bVar5 == null) {
                            p005kotlin.jvm.internal.s.m("newsFeedListAdapter");
                            throw null;
                        }
                        bVar5.f39483o = newsFeedListFragment.c7().f39461g.f148603f;
                    }
                    z0 z0Var3 = sVar.f196386b;
                    if (z0Var3 instanceof z0.a) {
                        z0Var = z0Var3;
                    } else if (z0Var2 instanceof z0.a) {
                        z0Var = z0Var2;
                    } else {
                        z0 z0Var4 = sVar.f196387c;
                        z0Var = z0Var4 instanceof z0.a ? z0Var4 : null;
                    }
                    if (z0Var != null) {
                        g22.e.c(newsFeedListFragment);
                    }
                    break;
                } else {
                    androidx.fragment.app.m activity2 = newsFeedListFragment.getActivity();
                    NewsFeedActivity newsFeedActivity2 = activity2 instanceof NewsFeedActivity ? (NewsFeedActivity) activity2 : null;
                    if (newsFeedActivity2 == null || (menuItem2 = newsFeedActivity2.f39430e) == null) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        menuItem2.setVisible(false);
                    }
                    NewsFeedEmptyView newsFeedEmptyView2 = newsFeedListFragment.A;
                    if (newsFeedEmptyView2 == null) {
                        p005kotlin.jvm.internal.s.m("emptyView");
                        throw null;
                    }
                    v22.e.j(newsFeedEmptyView2);
                    newsFeedListFragment.T6().setVisibility(i14);
                    ActivityFeedLoadingView activityFeedLoadingView2 = newsFeedListFragment.f39437z;
                    if (activityFeedLoadingView2 == null) {
                        p005kotlin.jvm.internal.s.m("fullPageLoadingView");
                        throw null;
                    }
                    activityFeedLoadingView2.animatorSet.start();
                    activityFeedLoadingView2.setVisibility(i14);
                }
                return Unit.INSTANCE;
            case 2:
                wg0.a aVar2 = (wg0.a) obj;
                int i18 = NewsFeedListFragment.Y;
                aVar2.getClass();
                newsFeedListFragment.f7(aVar2);
                return Unit.INSTANCE;
            default:
                no1.c cVar = (no1.c) obj;
                int i19 = NewsFeedListFragment.Y;
                if (cVar != null) {
                    NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
                    f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                    f12.b bVar6 = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                    qz0.a aVar3 = newsFeedViewModelC7.f39461g;
                    Iterator it = aVar3.f148598a.iterator();
                    boolean z16 = false;
                    int i24 = 0;
                    boolean z17 = false;
                    boolean z18 = false;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        NewsFeedItem newsFeedItem = (NewsFeedItem) next;
                        if (newsFeedItem instanceof NewsFeedItem.ActivityPost) {
                            wg0.a aVarB = wg0.a.b(((NewsFeedItem.ActivityPost) newsFeedItem).getActivityPost(), null, null, null, null, null, 536870911);
                            String userDisplayName = bVar6.getUserDisplayName();
                            b12.b bVarB = b12.b.b(aVarB.C, r14, 31);
                            wg0.m mVar2 = aVarB.f185060t;
                            if (mVar2 != null) {
                                mVarB = wg0.m.b(mVar2, r14, r14, 255);
                            } else {
                                mVar = r14;
                            }
                            if (mVar == 0 || (arrayList = mVar.f185115h) == null) {
                                mVar = mVarB;
                                mVar = mVarB;
                                arrayList = new ArrayList();
                            }
                            wg0.b bVarB2 = (mVar == 0 || (bVar2 = mVar.f185112e) == null) ? null : wg0.b.b(bVar2, null, 0, false, 1023);
                            if (aVarB.j()) {
                                bVar = new b12.b(lVar.z4("PREMIUM_FRIEND"), null, null, null, null, 30, null);
                                z16 = true;
                            } else {
                                bVar = bVarB;
                            }
                            Iterator it3 = p13.h0.S0(arrayList, 3).iterator();
                            int i26 = 0;
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                int i27 = i26 + 1;
                                if (i26 < 0) {
                                    p13.x.q();
                                    throw null;
                                }
                                Iterator it4 = it3;
                                wg0.n nVar = (wg0.n) next2;
                                boolean z19 = z16;
                                if (nVar.f185116a.equals(userDisplayName)) {
                                    arrayList.set(i26, new wg0.n(nVar.f185116a, nVar.f185117b, lVar.z4("FRAMED_THUMBNAIL")));
                                    z17 = true;
                                }
                                z16 = z19;
                                i26 = i27;
                                it3 = it4;
                                z18 = z18;
                            }
                            boolean z24 = z16;
                            boolean z25 = z18;
                            if (bVarB2 == null || (str = bVarB2.f185066a) == null || !str.equals(userDisplayName)) {
                                z18 = z25;
                            } else {
                                bVarB2 = wg0.b.b(bVarB2, new b12.b(lVar.z4("PREMIUM_FRIEND"), null, null, null, null, 30, null), 0, false, 959);
                                z18 = true;
                            }
                            aVar3.f148598a.set(i24, new NewsFeedItem.ActivityPost(wg0.a.b(aVarB, null, null, mVar != 0 ? wg0.m.b(mVar, bVarB2, new ArrayList(arrayList), 111) : null, bVar, null, 469499903)));
                            z16 = z24;
                        } else {
                            bVar6 = bVar6;
                            it = it;
                        }
                        bVar6 = bVar6;
                        i24 = i25;
                        it = it;
                        r14 = 0;
                    }
                    boolean z26 = z18;
                    if (z16 || z17 || z26) {
                        newsFeedViewModelC7.A4();
                        com.garmin.android.apps.connectmobile.e0.b.a aVar4 = newsFeedViewModelC7.f34755a;
                        if (aVar4 != null) {
                            aVar4.a(true);
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
