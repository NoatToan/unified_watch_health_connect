package com.garmin.android.apps.connectmobile.newsfeed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import li0.d0;
import li0.f;
import n23.j;
import p005kotlin.Metadata;
import p3.c2;
import tn.k;
import ub1.l;
import xg0.i;
import xg0.m;
import xg0.n;
import xg0.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/b;", "Ls51/d;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "Lxg0/a;", "conversationEventListener", "Lxg0/n;", "mediaEventListener", "Lxg0/o;", "postEventListener", "Lcom/garmin/android/apps/connectmobile/newsfeed/d$j;", "suggestedFollowEventListener", "Lli0/f;", "followAction", "Lgo1/a;", "highlightedCommentEventListener", "Landroidx/recyclerview/widget/o$f;", "itemCallback", "<init>", "(Lxg0/a;Lxg0/n;Lxg0/o;Lcom/garmin/android/apps/connectmobile/newsfeed/d$j;Lli0/f;Lgo1/a;Landroidx/recyclerview/widget/o$f;)V", "b", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends s51.d<NewsFeedItem> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xg0.a f39477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f39478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f39479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d.j f39480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f39481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final go1.a f39482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f39484p;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.newsfeed.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/b$b;", "", "", "Lli0/d0;", "suggestedFollowingList", "<init>", "(Ljava/util/List;)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0706b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d0> f39485a;

        public C0706b(List<d0> list) {
            list.getClass();
            this.f39485a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0706b) && this.f39485a.equals(((C0706b) obj).f39485a);
        }

        public final int hashCode() {
            return this.f39485a.hashCode();
        }

        public final String toString() {
            return k.h("NewsFeedSuggestionFollowingPayload(suggestedFollowingList=", ")", this.f39485a);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xg0.a aVar, n nVar, o oVar, d.j jVar, f fVar, go1.a aVar2, androidx.recyclerview.widget.o.f<NewsFeedItem> fVar2) {
        super(fVar2);
        aVar.getClass();
        nVar.getClass();
        oVar.getClass();
        jVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        this.f39477i = aVar;
        this.f39478j = nVar;
        this.f39479k = oVar;
        this.f39480l = jVar;
        this.f39481m = fVar;
        this.f39482n = aVar2;
    }

    @Override // s51.d
    public final void B(RecyclerView.f0 f0Var) {
        if (f0Var instanceof hz0.d) {
            hz0.d dVar = (hz0.d) f0Var;
            l lVar = this.f39484p;
            c2 c2Var = dVar.f86419c;
            ComposeView composeView = dVar.f86418b;
            if (composeView != null) {
                View view2 = dVar.f86417a;
                if (lVar == null) {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    composeView.setVisibility(8);
                    c2Var.setValue(null);
                    return;
                }
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                composeView.setVisibility(0);
                c2Var.setValue(lVar);
            }
        }
    }

    @Override // s51.d
    public final void C(RecyclerView.f0 f0Var) {
        if (f0Var instanceof i) {
            ((i) f0Var).d();
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 D(ViewGroup viewGroup) {
        hz0.b bVar = new hz0.b(j.b(viewGroup, R.layout.gcm4_atp_dashboard_footer, viewGroup, false));
        String string = bVar.itemView.getContext().getString(R.string.news_feed_no_new_activities_footer, String.valueOf(this.f39483o));
        string.getClass();
        bVar.f86406a.setText(string);
        return bVar;
    }

    @Override // s51.d
    public final RecyclerView.f0 E(ViewGroup viewGroup) {
        View viewD = a0.d(viewGroup, R.layout.news_feed_post_header, viewGroup, false);
        viewD.getClass();
        return new hz0.d(viewD);
    }

    @Override // s51.d
    public final RecyclerView.f0 F(ViewGroup viewGroup) {
        return new i(j.b(viewGroup, R.layout.news_feed_loading_item, viewGroup, false));
    }

    @Override // s51.d
    public final void G(int i14, RecyclerView.f0 f0Var) {
        wg0.a activityPost;
        List<d0> suggestedFollowingList;
        if (f0Var instanceof d) {
            NewsFeedItem newsFeedItemT = t(i14);
            NewsFeedItem.SuggestedFollowingList suggestedFollowingList2 = newsFeedItemT instanceof NewsFeedItem.SuggestedFollowingList ? (NewsFeedItem.SuggestedFollowingList) newsFeedItemT : null;
            if (suggestedFollowingList2 == null || (suggestedFollowingList = suggestedFollowingList2.getSuggestedFollowingList()) == null) {
                return;
            }
            d.h((d) f0Var, suggestedFollowingList);
            return;
        }
        if (f0Var instanceof m) {
            NewsFeedItem newsFeedItemT2 = t(i14);
            NewsFeedItem.ActivityPost activityPost2 = newsFeedItemT2 instanceof NewsFeedItem.ActivityPost ? (NewsFeedItem.ActivityPost) newsFeedItemT2 : null;
            if (activityPost2 == null || (activityPost = activityPost2.getActivityPost()) == null) {
                return;
            }
            ((m) f0Var).j(activityPost, i14, u22.a.NORMAL);
        }
    }

    @Override // s51.d
    public final RecyclerView.f0 H(ViewGroup viewGroup, int i14) {
        if (i14 != 1) {
            View viewD = a0.d(viewGroup, R.layout.item_activity_feed, viewGroup, false);
            viewD.getClass();
            return new m(viewD, this.f39477i, this.f39478j, this.f39479k, false, this.f39482n, 16, null);
        }
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new d(composeView, this.f39480l, this.f39481m);
    }

    public final void I(List<d0> list) {
        list.getClass();
        C0706b c0706b = new C0706b(list);
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        Iterator<NewsFeedItem> it = com.garmin.android.apps.connectmobile.newsfeed.a.f39474b.f148598a.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (it.next() instanceof NewsFeedItem.SuggestedFollowingList) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 != -1) {
            notifyItemChanged(i14, c0706b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        NewsFeedItem newsFeedItemT = t(i14);
        return newsFeedItemT != null ? newsFeedItemT.getViewType() : R.layout.item_activity_feed;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<Object> list) {
        wg0.a activityPost;
        f0Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            super.onBindViewHolder(f0Var, i14, list);
            return;
        }
        if (!(f0Var instanceof m)) {
            for (Object obj : list) {
                if ((f0Var instanceof d) && (obj instanceof C0706b)) {
                    d.h((d) f0Var, ((C0706b) obj).f39485a);
                }
            }
            return;
        }
        NewsFeedItem newsFeedItemT = t(i14);
        NewsFeedItem.ActivityPost activityPost2 = newsFeedItemT instanceof NewsFeedItem.ActivityPost ? (NewsFeedItem.ActivityPost) newsFeedItemT : null;
        if (activityPost2 == null || (activityPost = activityPost2.getActivityPost()) == null) {
            super.onBindViewHolder(f0Var, i14, list);
            return;
        }
        Object obj2 = list.get(0);
        List list2 = obj2 instanceof List ? (List) obj2 : null;
        if (list2 == null) {
            super.onBindViewHolder(f0Var, i14, list);
            return;
        }
        for (Object obj3 : list2) {
            if (obj3 instanceof wg0.m) {
                m mVar = (m) f0Var;
                mVar.h(activityPost);
                mVar.e(activityPost);
            } else if (obj3 instanceof wg0.l) {
                m mVar2 = (m) f0Var;
                mVar2.g(activityPost, i14);
                mVar2.f(activityPost);
            } else if (obj3 instanceof wg0.o) {
                m mVar3 = (m) f0Var;
                wg0.o oVar = (wg0.o) obj3;
                mVar3.f190795g.setProfileImageData(oVar.f185119a);
                mVar3.Z.setProfileImageData(oVar.f185120b);
                wg0.m mVar4 = activityPost.f185060t;
                if (mVar4 != null) {
                    mVar3.Y.a(mVar4, activityPost.A);
                }
            } else {
                ((m) f0Var).j(activityPost, i14, u22.a.NORMAL);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(xg0.a aVar, n nVar, o oVar, d.j jVar, f fVar, go1.a aVar2, androidx.recyclerview.widget.o.f fVar2, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(aVar, nVar, oVar, jVar, fVar, (i14 & 32) != 0 ? null : aVar2, fVar2);
    }
}
