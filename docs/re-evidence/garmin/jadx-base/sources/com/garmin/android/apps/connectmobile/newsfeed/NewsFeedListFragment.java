package com.garmin.android.apps.connectmobile.newsfeed;

import am.c2;
import am.l;
import am.x0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import androidx.lifecycle.u;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e0;
import com.garmin.android.apps.connectmobile.feed.activity.view.ActivityFeedLoadingView;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment;
import com.garmin.android.apps.connectmobile.newsfeed.view.NewsFeedEmptyView;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.y2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import fw.p;
import ht1.v;
import hz0.a0;
import hz0.b0;
import hz0.c0;
import hz0.g0;
import hz0.h0;
import hz0.x;
import hz0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import li0.d0;
import o13.r;
import o13.t;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.y;
import ps.q;
import r22.k0;
import r22.q0;
import r53.m1;
import wg0.m;
import xg0.n;
import xg0.o;
import yc.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment;", "Lcom/garmin/android/apps/connectmobile/e0;", "", "Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedItem;", "<init>", "()V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewsFeedListFragment extends e0<String, NewsFeedItem> {
    public static final /* synthetic */ int Y = 0;
    public NewsFeedEmptyView A;
    public int B;
    public final f.c<f.j> C;
    public final f.c<f.j> D;
    public final f.c<String[]> E;
    public final d F;
    public final e I;
    public final b P;
    public final k T;
    public final c X;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.newsfeed.b f39431r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1 f39432t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f39433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f39434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<d0> f39435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f.c<l> f39436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ActivityFeedLoadingView f39437z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment$b", "Lxg0/a;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements xg0.a {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39439a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39439a = iArr;
            }
        }

        public b() {
        }

        @Override // xg0.a
        public final void G1(wg0.a aVar) {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            m mVar = aVar.f185060t;
            y0 y0VarK = xy2.b.K(newsFeedViewModelC7, new g0(mVar != null ? mVar.f185111d : null, mVar != null ? mVar.f185110c : null, newsFeedViewModelC7, null));
            n0 viewLifecycleOwner = newsFeedListFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new g(new hz0.i(aVar, newsFeedListFragment, 0)));
            NewsFeedListFragment.e7("NewsFeedLikeClicked");
        }

        @Override // xg0.a
        public final void J0(wg0.a aVar) {
            aVar.getClass();
            Long l14 = aVar.f185042a;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                androidx.fragment.app.m mVarRequireActivity = newsFeedListFragment.requireActivity();
                mVarRequireActivity.getClass();
                c2 c2Var = c2.ACTIVITY;
                String strValueOf = String.valueOf(jLongValue);
                aVar2.getClass();
                newsFeedListFragment.requireActivity().startActivity(ConversationActivity.a.h(mVarRequireActivity, c2Var, strValueOf));
            }
            int i14 = NewsFeedListFragment.Y;
            newsFeedListFragment.getClass();
            NewsFeedListFragment.e7("NewsFeedLikeListClicked");
        }

        @Override // xg0.a
        public final void Y1(wg0.a aVar) {
            aVar.getClass();
            a(aVar, false);
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment.this.getClass();
            NewsFeedListFragment.e7("NewsFeedTotalCommentClicked");
        }

        public final void a(wg0.a aVar, boolean z14) {
            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            Context contextRequireContext = newsFeedListFragment.requireContext();
            contextRequireContext.getClass();
            c2 c2Var = c2.ACTIVITY;
            String strValueOf = String.valueOf(aVar.f185042a);
            boolean zJ = aVar.j();
            aVar2.getClass();
            newsFeedListFragment.requireContext().startActivity(ConversationActivity.a.c(contextRequireContext, c2Var, strValueOf, aVar, zJ, z14, true));
        }

        @Override // xg0.a
        public final void i2(wg0.a aVar) {
            aVar.getClass();
            a(aVar, false);
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment.this.getClass();
            NewsFeedListFragment.e7("NewsFeedHighlightedCommentClicked");
        }

        @Override // xg0.a
        public final void p2(wg0.a aVar) {
            aVar.getClass();
            a(aVar, true);
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment.this.getClass();
            NewsFeedListFragment.e7("NewsFeedCommentIconClicked");
        }

        @Override // xg0.a
        public final void r1(wg0.a aVar, String str) {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            y0 y0VarK = xy2.b.K(newsFeedViewModelC7, new b0(newsFeedViewModelC7, str, null));
            n0 viewLifecycleOwner = newsFeedListFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new g(new hz0.i(aVar, newsFeedListFragment, 1)));
            NewsFeedListFragment.e7("NewsFeedLikeClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment$c", "Lgo1/a;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements go1.a {
        public c() {
        }

        @Override // go1.a
        public final void n(String str) {
            str.getClass();
            ConversationActivity.a aVar = ConversationActivity.f44530c;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            androidx.fragment.app.m mVarRequireActivity = newsFeedListFragment.requireActivity();
            mVarRequireActivity.getClass();
            aVar.getClass();
            Intent intent = new Intent(mVarRequireActivity, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_comment_likes");
            intent.putExtra("GCM_conversation_comment_id", str);
            newsFeedListFragment.requireActivity().startActivity(intent);
        }

        @Override // go1.a
        public final void o(wg0.a aVar, String str, boolean z14) {
            m mVarB;
            wg0.b bVarB;
            aVar.getClass();
            str.getClass();
            m mVar = aVar.f185060t;
            wg0.b bVar = mVar != null ? mVar.f185112e : null;
            if (mVar != null) {
                if (bVar != null) {
                    int i14 = bVar.f185073h;
                    bVarB = wg0.b.b(bVar, null, z14 ? i14 - 1 : i14 + 1, !z14, 639);
                } else {
                    bVarB = null;
                }
                mVarB = m.b(mVar, bVarB, null, 239);
            } else {
                mVarB = null;
            }
            wg0.a aVarB = wg0.a.b(aVar, null, null, mVarB, null, null, 536608767);
            int i15 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            newsFeedListFragment.c7().z4(aVarB);
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            y0 y0VarK = xy2.b.K(newsFeedViewModelC7, new c0(z14, newsFeedViewModelC7, str, null));
            n0 viewLifecycleOwner = newsFeedListFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new g(new hz0.i(newsFeedListFragment, aVar)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment$d", "Lxg0/n;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements n {
        public d() {
        }

        @Override // xg0.n
        public final void J1(wg0.g gVar) {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            iz0.a aVarY6 = newsFeedListFragment.Y6();
            Context contextRequireContext = newsFeedListFragment.requireContext();
            contextRequireContext.getClass();
            aVarY6.n(contextRequireContext, new ps.j(null, gVar.f185090a, null, null, null, null, null, null, null, 509, null));
        }

        @Override // xg0.n
        public final void R3(wg0.k kVar) {
            VideoPlayerActivity.a aVar = VideoPlayerActivity.f44499a;
            Context contextRequireContext = NewsFeedListFragment.this.requireContext();
            contextRequireContext.getClass();
            aVar.getClass();
            contextRequireContext.startActivity(VideoPlayerActivity.a.a(contextRequireContext, kVar));
            NewsFeedListFragment.e7("NewsFeedVideoClicked");
        }

        @Override // xg0.n
        public final void S2(com.garmin.android.library.mapsdkadapter.i.d dVar, int i14) {
            dVar.getClass();
            int i15 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            androidx.fragment.app.m mVarRequireActivity = newsFeedListFragment.requireActivity();
            mVarRequireActivity.getClass();
            ((iz0.a) newsFeedViewModelC7.f39460f.getValue()).c(mVarRequireActivity, dVar, i14);
        }

        @Override // xg0.n
        public final void o4(wg0.a aVar, ie2.c cVar) {
            aVar.getClass();
            Long l14 = aVar.f185042a;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                int i14 = NewsFeedListFragment.Y;
                NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
                androidx.fragment.app.m mVarRequireActivity = newsFeedListFragment.requireActivity();
                mVarRequireActivity.getClass();
                String str = aVar.f185043b;
                x0 x0Var = aVar.f185044c;
                x0Var.getClass();
                ((iz0.a) newsFeedViewModelC7.f39460f.getValue()).u(mVarRequireActivity, jLongValue, str, x0Var, cVar);
            }
            int i15 = NewsFeedListFragment.Y;
            newsFeedListFragment.getClass();
            NewsFeedListFragment.e7("NewsFeedMapClicked");
        }

        @Override // xg0.n
        public final void r6(wg0.a aVar, wg0.c cVar) {
            ArrayList arrayList;
            List<wg0.c> list;
            aVar.getClass();
            q qVar = aVar.f185057p;
            if (qVar != null) {
                wg0.l lVar = aVar.f185059r;
                if (lVar == null || (list = lVar.f185103b) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((wg0.c) it.next()).f185077b);
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "NewsFeedListFragment", "NewsFeed should not call this callback if image list is empty");
                    return;
                }
                NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
                ArrayList arrayList2 = arrayList;
                androidx.fragment.app.m mVarRequireActivity = newsFeedListFragment.requireActivity();
                mVarRequireActivity.getClass();
                mVarRequireActivity.startActivity(arrayList2.size() == 1 ? newsFeedListFragment.Y6().h(mVarRequireActivity, qVar, new ArrayList(arrayList2), cVar, aVar.j()) : newsFeedListFragment.Y6().s(mVarRequireActivity, qVar, arrayList2, Boolean.valueOf(aVar.j())));
                NewsFeedListFragment.e7("NewsFeedPhotoClicked");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment$e", "Lxg0/o;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements o {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39443a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39443a = iArr;
            }
        }

        public e() {
        }

        @Override // xg0.o
        public final void G(wg0.a aVar) {
            aVar.getClass();
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            n0 viewLifecycleOwner = newsFeedListFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ge1.b.T(f0.w(viewLifecycleOwner), null, null, new com.garmin.android.apps.connectmobile.newsfeed.c(newsFeedListFragment, aVar, null), 3);
        }

        @Override // xg0.o
        public final void L5(String str) {
            str.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            xy2.b.K(newsFeedViewModelC7, new hz0.d0(newsFeedViewModelC7, str, null)).f(newsFeedListFragment.getViewLifecycleOwner(), new g(new hz0.k(newsFeedListFragment, str, 3)));
        }

        @Override // xg0.o
        public final void Q1(wg0.a aVar) {
            aVar.getClass();
        }

        @Override // xg0.o
        public final void T5(String str) {
            str.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            xy2.b.K(newsFeedViewModelC7, new hz0.e0(newsFeedViewModelC7, str, null)).f(newsFeedListFragment.getViewLifecycleOwner(), new g(new hz0.k(newsFeedListFragment, str, 1)));
        }

        @Override // xg0.o
        public final void V3(String str, String str2) {
            str.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            iz0.a aVarY6 = newsFeedListFragment.Y6();
            Context contextRequireContext = newsFeedListFragment.requireContext();
            contextRequireContext.getClass();
            aVarY6.b(contextRequireContext, str, str2);
            NewsFeedListFragment.e7("NewsFeedUserProfileClicked");
        }

        @Override // xg0.o
        public final void W5(wg0.a aVar) {
            aVar.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            newsFeedListFragment.c7().f39456b = aVar;
            f.c<l> cVar = newsFeedListFragment.f39436y;
            if (cVar == null) {
                s.m("activityPrivacyPageLauncher");
                throw null;
            }
            l lVar = aVar.f185050i;
            if (lVar == null) {
                lVar = l.f4051g;
            }
            cVar.a(lVar, null);
        }

        @Override // xg0.o
        public final void c4(String str) {
            str.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            xy2.b.K(newsFeedViewModelC7, new hz0.y(newsFeedViewModelC7, str, null)).f(newsFeedListFragment.getViewLifecycleOwner(), new g(new hz0.k(newsFeedListFragment, str, 2)));
        }

        @Override // xg0.o
        public final void i1(wg0.a aVar) {
            List<wg0.c> list;
            aVar.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            newsFeedListFragment.c7().f39456b = aVar;
            wg0.l lVar = aVar.f185059r;
            int size = 10 - ((lVar == null || (list = lVar.f185103b) == null) ? 0 : list.size());
            newsFeedListFragment.B = size;
            if (size <= 0) {
                Toast.makeText(newsFeedListFragment.requireContext(), newsFeedListFragment.getString(R.string.activities_photo_limit_message), 1).show();
                return;
            }
            if (Build.VERSION.SDK_INT > 29) {
                newsFeedListFragment.d7(size);
                return;
            }
            j22.b bVar = j22.b.f96736a;
            j22.a[] aVarArr = {j22.a.f96721j};
            bVar.getClass();
            if (j22.b.k(aVarArr)) {
                newsFeedListFragment.d7(newsFeedListFragment.B);
            } else {
                newsFeedListFragment.E.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, null);
            }
        }

        @Override // xg0.o
        public final void s3(wg0.a aVar) {
            aVar.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            iz0.a aVarY6 = newsFeedListFragment.Y6();
            androidx.fragment.app.m mVarRequireActivity = newsFeedListFragment.requireActivity();
            mVarRequireActivity.getClass();
            aVarY6.k(mVarRequireActivity, aVar);
            NewsFeedListFragment.e7("NewsFeedActvitiyDetailsClicked");
        }

        @Override // xg0.o
        public final void u4() {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment.this.getClass();
            NewsFeedListFragment.e7("NewsFeedReadMoreClicked");
        }

        @Override // xg0.o
        public final void w4(String str) {
            str.getClass();
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            NewsFeedViewModel newsFeedViewModelC7 = newsFeedListFragment.c7();
            xy2.b.K(newsFeedViewModelC7, new hz0.f0(newsFeedViewModelC7, str, null)).f(newsFeedListFragment.getViewLifecycleOwner(), new g(new hz0.k(newsFeedListFragment, str, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment$onViewCreated$4", f = "NewsFeedListFragment.kt", l = {513}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39444a;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment$onViewCreated$4$1", f = "NewsFeedListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<g3, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f39446a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFeedListFragment f39447b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment$f$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0705a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f39448a;

                static {
                    int[] iArr = new int[p.values().length];
                    try {
                        iArr[p.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[p.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[p.ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f39448a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NewsFeedListFragment newsFeedListFragment, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f39447b = newsFeedListFragment;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f39447b, dVar);
                aVar.f39446a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(g3 g3Var, t13.d<? super Unit> dVar) {
                return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                g3 g3Var = (g3) this.f39446a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                if (g3Var == null) {
                    return Unit.INSTANCE;
                }
                int i14 = C0705a.f39448a[g3Var.f35300a.ordinal()];
                NewsFeedListFragment newsFeedListFragment = this.f39447b;
                if (i14 == 1) {
                    g22.e.l(newsFeedListFragment);
                } else if (i14 == 2) {
                    g22.e.f(newsFeedListFragment);
                } else {
                    if (i14 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(newsFeedListFragment);
                    if (g3Var.f35303d instanceof NewsFeedViewModel.PostUpdatingError.ImageTooLarge) {
                        Context contextRequireContext = newsFeedListFragment.requireContext();
                        contextRequireContext.getClass();
                        String string = newsFeedListFragment.getString(R.string.lbl_image_upload_error);
                        string.getClass();
                        String string2 = newsFeedListFragment.getString(R.string.msg_image_size_restriction, "10 MB");
                        string2.getClass();
                        new k0(contextRequireContext, new k0.a(string, string2, true, false, null, null, newsFeedListFragment.getString(R.string.lbl_ok), null, null, null, null, null, 4024, null)).show();
                    } else {
                        String string3 = newsFeedListFragment.getString(R.string.upload_photo_error);
                        string3.getClass();
                        q0.b bVar = q0.f149800b;
                        View viewRequireView = newsFeedListFragment.requireView();
                        viewRequireView.getClass();
                        q0.b.c(bVar, viewRequireView, string3, null, 12).show();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return NewsFeedListFragment.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39444a;
            if (i14 == 0) {
                r.b(obj);
                int i15 = NewsFeedListFragment.Y;
                NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
                r53.b bVarA = u.a(newsFeedListFragment.c7().f39463i, newsFeedListFragment.getViewLifecycleOwner().getF158016a(), androidx.lifecycle.b0.b.RESUMED);
                a aVar2 = new a(newsFeedListFragment, null);
                this.f39444a = 1;
                if (r53.s.k(bVarA, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f39449a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f39449a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f39449a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39449a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f39450a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39450a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f39452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f39451a = aVar;
            this.f39452b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39451a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39452b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f39453a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39453a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment$k", "Lcom/garmin/android/apps/connectmobile/newsfeed/d$j;", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements com.garmin.android.apps.connectmobile.newsfeed.d.j {
        public k() {
        }

        @Override // com.garmin.android.apps.connectmobile.newsfeed.d.j
        public final void a() {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            newsFeedListFragment.getClass();
            if (s3.b()) {
                Context contextRequireContext = newsFeedListFragment.requireContext();
                contextRequireContext.getClass();
                x.a(contextRequireContext);
            } else {
                iz0.a aVarY6 = newsFeedListFragment.Y6();
                Context contextRequireContext2 = newsFeedListFragment.requireContext();
                contextRequireContext2.getClass();
                aVarY6.j(contextRequireContext2);
            }
            NewsFeedListFragment.e7("NewsFeedSuggestionFindConnectionsClicked");
        }

        @Override // com.garmin.android.apps.connectmobile.newsfeed.d.j
        public final void b() {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedListFragment newsFeedListFragment = NewsFeedListFragment.this;
            if (newsFeedListFragment.isAdded()) {
                iz0.a aVarY6 = newsFeedListFragment.Y6();
                Context contextRequireContext = newsFeedListFragment.requireContext();
                contextRequireContext.getClass();
                newsFeedListFragment.startActivity(aVarY6.t(contextRequireContext));
                NewsFeedListFragment.e7("NewsFeedSuggestionSeeAllClicked");
            }
        }

        @Override // com.garmin.android.apps.connectmobile.newsfeed.d.j
        public final void c() {
            int i14 = NewsFeedListFragment.Y;
            NewsFeedViewModel newsFeedViewModelC7 = NewsFeedListFragment.this.c7();
            newsFeedViewModelC7.f39461g.a(new hq.f0(26));
            newsFeedViewModelC7.A4();
            e0.b.a aVar = newsFeedViewModelC7.f34755a;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    static {
        new a(null);
    }

    public NewsFeedListFragment() {
        super(true);
        this.f39432t = new w1(s0.f105811a.b(NewsFeedViewModel.class), new h(this), new j(this), new i(null, this));
        this.f39433v = o13.m.b(new v(14));
        this.f39434w = new LinkedHashMap();
        this.B = 10;
        f.c<f.j> cVarRegisterForActivityResult = registerForActivityResult(new g.d(0, 1, null), new hz0.f(this, 1));
        cVarRegisterForActivityResult.getClass();
        this.C = cVarRegisterForActivityResult;
        f.c<f.j> cVarRegisterForActivityResult2 = registerForActivityResult(new g.e(), new hz0.f(this, 2));
        cVarRegisterForActivityResult2.getClass();
        this.D = cVarRegisterForActivityResult2;
        f.c<String[]> cVarRegisterForActivityResult3 = registerForActivityResult(new g.f(), new hz0.f(this, 3));
        cVarRegisterForActivityResult3.getClass();
        this.E = cVarRegisterForActivityResult3;
        this.F = new d();
        this.I = new e();
        this.P = new b();
        this.T = new k();
        this.X = new c();
    }

    public static void e7(String str) {
        ht.a.f85464a.getClass();
        ht.a.a(null, str);
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        this.f39434w.clear();
        NewsFeedEmptyView newsFeedEmptyView = this.A;
        if (newsFeedEmptyView == null) {
            s.m("emptyView");
            throw null;
        }
        v22.e.j(newsFeedEmptyView);
        T6().setVisibility(0);
        NewsFeedViewModel newsFeedViewModelC7 = c7();
        ge1.b.T(v1.a(newsFeedViewModelC7), null, null, new a0(newsFeedViewModelC7, null), 3);
        NewsFeedViewModel newsFeedViewModelC8 = c7();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "NewsFeedViewModel", "refresh");
        newsFeedViewModelC8.f39461g.b();
        e0.b.a aVar2 = newsFeedViewModelC8.f34755a;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final s51.d<NewsFeedItem> J6() {
        li0.f.a aVar = li0.f.f112657g;
        i0 i0VarW = f0.w(this);
        aVar.getClass();
        li0.e eVar = new li0.e(i0VarW);
        NewsFeedItem.INSTANCE.getClass();
        com.garmin.android.apps.connectmobile.newsfeed.b bVar = new com.garmin.android.apps.connectmobile.newsfeed.b(this.P, this.F, this.I, this.T, eVar, this.X, NewsFeedItem.DIFF_CALLBACK);
        bVar.f157383d = true;
        bVar.f157384e = true;
        this.f39431r = bVar;
        List<d0> list = this.f39435x;
        if (list != null) {
            bVar.I(list);
            this.f39435x = null;
        }
        com.garmin.android.apps.connectmobile.newsfeed.b bVar2 = this.f39431r;
        if (bVar2 != null) {
            return bVar2;
        }
        s.m("newsFeedListAdapter");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final RecyclerView.p K6(final Context context) {
        return new LinearLayoutManager(context) { // from class: com.garmin.android.apps.connectmobile.newsfeed.NewsFeedListFragment$createLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public final Parcelable onSaveInstanceState() {
                Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
                a.f39473a.getClass();
                a.f39474b.f148606i = parcelableOnSaveInstanceState;
                return parcelableOnSaveInstanceState;
            }
        };
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final u2 M6() {
        return new u2(10, 0, false, 0, 0, 0, 58, null);
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final e0.b<String, NewsFeedItem> U6() {
        return c7();
    }

    public final iz0.a Y6() {
        return (iz0.a) this.f39433v.getValue();
    }

    public final NewsFeedViewModel c7() {
        return (NewsFeedViewModel) this.f39432t.getValue();
    }

    public final void d7(int i14) {
        if (i14 > 1) {
            this.C.a(f.k.a(g.e.d.f74074a, i14, 12), null);
        } else {
            this.D.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        }
    }

    public final void f7(wg0.a aVar) {
        c7().z4(aVar);
    }

    public final void g7(List<? extends Uri> list) {
        Long l14;
        ContentResolver contentResolver;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (Uri uri : list) {
            if (Build.VERSION.SDK_INT > 29 && (contentResolver = requireContext().getContentResolver()) != null) {
                contentResolver.takePersistableUriPermission(uri, 1);
            }
            String string = uri.toString();
            string.getClass();
            arrayList.add(new bq0.k(uri, string, "jpg", 0.0d));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        NewsFeedViewModel newsFeedViewModelC7 = c7();
        iz0.a aVar = (iz0.a) newsFeedViewModelC7.f39460f.getValue();
        wg0.a aVar2 = newsFeedViewModelC7.f39456b;
        r53.s.C(new m1(new r53.v(new h0(newsFeedViewModelC7, null), aVar.v((aVar2 == null || (l14 = aVar2.f185042a) == null) ? -1L : l14.longValue(), arrayList)), new com.garmin.android.apps.connectmobile.newsfeed.e(newsFeedViewModelC7, null)), v1.a(newsFeedViewModelC7));
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        qz0.a aVar = com.garmin.android.apps.connectmobile.newsfeed.a.f39474b;
        if (aVar.f148604g) {
            aVar.b();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.news_feed_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        for (Runnable runnable : this.f39434w.values()) {
            View view2 = getView();
            if (view2 != null) {
                view2.removeCallbacks(runnable);
            }
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        qz0.a aVar = com.garmin.android.apps.connectmobile.newsfeed.a.f39474b;
        if (aVar.f148605h) {
            e0.b.a aVar2 = c7().f34755a;
            if (aVar2 != null) {
                aVar2.a(false);
            }
            aVar.f148604g = false;
            aVar.f148605h = false;
        }
        c7().A4();
        com.garmin.android.apps.connectmobile.newsfeed.a.f39475c.setValue(p13.h0.b1(com.garmin.android.apps.connectmobile.newsfeed.a.a()));
        NewsFeedViewModel newsFeedViewModelC7 = c7();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final int i14 = 0;
        e23.a aVar3 = new e23.a(this) { // from class: hz0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFeedListFragment f86434b;

            {
                this.f86434b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                NewsFeedListFragment newsFeedListFragment = this.f86434b;
                switch (i15) {
                    case 0:
                        int i16 = NewsFeedListFragment.Y;
                        g22.e.c(newsFeedListFragment);
                        break;
                    default:
                        int i17 = NewsFeedListFragment.Y;
                        newsFeedListFragment.M7();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        ge1.b.T(v1.a(newsFeedViewModelC7), null, null, new z(newsFeedViewModelC7, new e23.a(this) { // from class: hz0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewsFeedListFragment f86434b;

            {
                this.f86434b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                NewsFeedListFragment newsFeedListFragment = this.f86434b;
                switch (i16) {
                    case 0:
                        int i17 = NewsFeedListFragment.Y;
                        g22.e.c(newsFeedListFragment);
                        break;
                    default:
                        int i18 = NewsFeedListFragment.Y;
                        newsFeedListFragment.M7();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, aVar3, new hz0.e(this, 2), contextRequireContext, null), 3);
        androidx.lifecycle.j jVarB = androidx.lifecycle.v.b(((no1.b) KoinJavaComponent.get$default(no1.b.class, null, null, 6, null)).getF126722a());
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarB, viewLifecycleOwner, new g(new hz0.e(this, 3)));
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.loading_view);
        viewFindViewById.getClass();
        this.f39437z = (ActivityFeedLoadingView) viewFindViewById;
        RecyclerView recyclerViewT6 = T6();
        recyclerViewT6.addRecyclerListener(new hz0.h());
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i();
        y2.f49767a.getClass();
        iVar.f10317d = e53.c.e(((e53.c) y2.f49768b.getValue()).f63098a);
        iVar.f10318e = e53.c.e(((e53.c) y2.f49769c.getValue()).f63098a);
        recyclerViewT6.setItemAnimator(iVar);
        View viewFindViewById2 = view2.findViewById(R.id.custom_empty_view);
        viewFindViewById2.getClass();
        NewsFeedEmptyView newsFeedEmptyView = (NewsFeedEmptyView) viewFindViewById2;
        this.A = newsFeedEmptyView;
        newsFeedEmptyView.setActionListener(new go1.g0(this, 13));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        X6(contextRequireContext);
        I6(new hz0.e(this, 1));
        com.garmin.android.apps.connectmobile.newsfeed.a.f39473a.getClass();
        androidx.lifecycle.j jVarB = androidx.lifecycle.v.b(com.garmin.android.apps.connectmobile.newsfeed.a.f39476d);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarB, viewLifecycleOwner, new g(new hz0.e(this, 0)));
        f.c<l> cVarRegisterForActivityResult = registerForActivityResult(Y6().x(), new hz0.f(this, 0));
        cVarRegisterForActivityResult.getClass();
        this.f39436y = cVarRegisterForActivityResult;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner2), null, null, new f(null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/NewsFeedListFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_PHOTOS_COUNT", "I", "CAPTURED_IMAGE_EXTENSION", "MAX_IMAGE_SIZE_MB", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
