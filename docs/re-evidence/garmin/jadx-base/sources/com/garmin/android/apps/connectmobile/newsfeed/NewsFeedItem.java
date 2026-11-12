package com.garmin.android.apps.connectmobile.newsfeed;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.o;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import li0.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\n\u000b\fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "", "", "viewType", "<init>", "(I)V", "I", "getViewType", "()I", "Companion", "ActivityPost", "SuggestedFollowingList", "b", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$ActivityPost;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$SuggestedFollowingList;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class NewsFeedItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final o.f<NewsFeedItem> DIFF_CALLBACK = new a();
    public static final int SUGGESTED_FOLLOWING_LIST = 1;
    private final int viewType;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$ActivityPost;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "Lwg0/a;", "activityPost", "<init>", "(Lwg0/a;)V", "component1", "()Lwg0/a;", "copy", "(Lwg0/a;)Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$ActivityPost;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwg0/a;", "getActivityPost", "setActivityPost", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityPost extends NewsFeedItem {
        public static final int $stable = 8;
        private wg0.a activityPost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityPost(wg0.a aVar) {
            super(R.layout.item_activity_feed, null);
            aVar.getClass();
            this.activityPost = aVar;
        }

        public static /* synthetic */ ActivityPost copy$default(ActivityPost activityPost, wg0.a aVar, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                aVar = activityPost.activityPost;
            }
            return activityPost.copy(aVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final wg0.a getActivityPost() {
            return this.activityPost;
        }

        public final ActivityPost copy(wg0.a activityPost) {
            activityPost.getClass();
            return new ActivityPost(activityPost);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActivityPost) && s.g(this.activityPost, ((ActivityPost) other).activityPost);
        }

        public final wg0.a getActivityPost() {
            return this.activityPost;
        }

        public int hashCode() {
            return this.activityPost.hashCode();
        }

        public final void setActivityPost(wg0.a aVar) {
            aVar.getClass();
            this.activityPost = aVar;
        }

        public String toString() {
            return "ActivityPost(activityPost=" + this.activityPost + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$SuggestedFollowingList;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "", "Lli0/d0;", "suggestedFollowingList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$SuggestedFollowingList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSuggestedFollowingList", "setSuggestedFollowingList", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedFollowingList extends NewsFeedItem {
        public static final int $stable = 8;
        private List<d0> suggestedFollowingList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedFollowingList(List<d0> list) {
            super(1, null);
            list.getClass();
            this.suggestedFollowingList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuggestedFollowingList copy$default(SuggestedFollowingList suggestedFollowingList, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                list = suggestedFollowingList.suggestedFollowingList;
            }
            return suggestedFollowingList.copy(list);
        }

        public final List<d0> component1() {
            return this.suggestedFollowingList;
        }

        public final SuggestedFollowingList copy(List<d0> suggestedFollowingList) {
            suggestedFollowingList.getClass();
            return new SuggestedFollowingList(suggestedFollowingList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SuggestedFollowingList) && s.g(this.suggestedFollowingList, ((SuggestedFollowingList) other).suggestedFollowingList);
        }

        public final List<d0> getSuggestedFollowingList() {
            return this.suggestedFollowingList;
        }

        public int hashCode() {
            return this.suggestedFollowingList.hashCode();
        }

        public final void setSuggestedFollowingList(List<d0> list) {
            list.getClass();
            this.suggestedFollowingList = list;
        }

        public String toString() {
            return k.h("SuggestedFollowingList(suggestedFollowingList=", ")", this.suggestedFollowingList);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends o.f<NewsFeedItem> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(NewsFeedItem newsFeedItem, NewsFeedItem newsFeedItem2) {
            NewsFeedItem newsFeedItem3 = newsFeedItem;
            NewsFeedItem newsFeedItem4 = newsFeedItem2;
            newsFeedItem3.getClass();
            newsFeedItem4.getClass();
            if ((newsFeedItem3 instanceof ActivityPost) && (newsFeedItem4 instanceof ActivityPost)) {
                wg0.a.F.getClass();
                return wg0.a.P.a(((ActivityPost) newsFeedItem3).getActivityPost(), ((ActivityPost) newsFeedItem4).getActivityPost());
            }
            if ((newsFeedItem3 instanceof SuggestedFollowingList) && (newsFeedItem4 instanceof SuggestedFollowingList)) {
                return s.g(((SuggestedFollowingList) newsFeedItem3).getSuggestedFollowingList(), ((SuggestedFollowingList) newsFeedItem4).getSuggestedFollowingList());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(NewsFeedItem newsFeedItem, NewsFeedItem newsFeedItem2) {
            NewsFeedItem newsFeedItem3 = newsFeedItem;
            NewsFeedItem newsFeedItem4 = newsFeedItem2;
            newsFeedItem3.getClass();
            newsFeedItem4.getClass();
            if ((newsFeedItem3 instanceof ActivityPost) && (newsFeedItem4 instanceof ActivityPost)) {
                wg0.a.F.getClass();
                return wg0.a.P.b(((ActivityPost) newsFeedItem3).getActivityPost(), ((ActivityPost) newsFeedItem4).getActivityPost());
            }
            if ((newsFeedItem3 instanceof SuggestedFollowingList) && (newsFeedItem4 instanceof SuggestedFollowingList)) {
                return s.g(((SuggestedFollowingList) newsFeedItem3).getSuggestedFollowingList(), ((SuggestedFollowingList) newsFeedItem4).getSuggestedFollowingList());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(NewsFeedItem newsFeedItem, NewsFeedItem newsFeedItem2) {
            NewsFeedItem newsFeedItem3 = newsFeedItem;
            NewsFeedItem newsFeedItem4 = newsFeedItem2;
            newsFeedItem3.getClass();
            newsFeedItem4.getClass();
            if (!(newsFeedItem3 instanceof ActivityPost) || !(newsFeedItem4 instanceof ActivityPost)) {
                return null;
            }
            wg0.a.F.getClass();
            return wg0.a.P.c(((ActivityPost) newsFeedItem3).getActivityPost(), ((ActivityPost) newsFeedItem4).getActivityPost());
        }
    }

    public /* synthetic */ NewsFeedItem(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, null);
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.newsfeed.NewsFeedItem$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem$b;", "", "<init>", "()V", "", "SUGGESTED_FOLLOWING_LIST", "I", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    private NewsFeedItem(int i14) {
        this.viewType = i14;
    }

    public /* synthetic */ NewsFeedItem(int i14, j jVar) {
        this(i14);
    }
}
