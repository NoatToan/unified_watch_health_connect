package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.r2;
import com.garmin.android.apps.connectmobile.social.LegacyCommentsAndLikesActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mt0.p3;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import z10.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/p;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "b", "c", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends com.garmin.android.apps.connectmobile.m0 {
    public static final c H0 = new c(null);
    public FrameLayout A;
    public q1 B;
    public TextView C;
    public ImageView D;
    public TextView E;
    public LinearLayout F;
    public q1 I;
    public boolean P;
    public final w1 T;
    public r2 X;
    public final w1 Y;
    public final Object Z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.i f37700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.i f37701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.f f37702j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public d3 f37704k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public mo1.d f37705l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ComposeView f37708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ComposeView f37709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f37710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f37711r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f37712t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f37713v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayoutManager f37714w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public mt0.q0 f37715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f37716y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f37717z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f37703k = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f37706m = p3.p0.n(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/p$a;", "", "", "reasonCode", "", "reasonMessage", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        HAS_CHALLENGE(0, "Has challenge"),
        USER_OPTED_OUT(1, "User Opted out"),
        /* JADX INFO: Fake field, exist only in values array */
        USER_DOES_NOT_HAVE_WELLNESS_PROFILE(2, "User does not have wellness profile"),
        PENDING(3, "Challenge request is in pending state"),
        UNKNOWN_REASON(4, "Unknown reason");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37723a;

        a(int i14, String str) {
            this.f37723a = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/p$b;", "", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ACTIVE(1, AppMeasurementSdk.ConditionalUserProperty.ACTIVE),
        /* JADX INFO: Fake field, exist only in values array */
        COMPLETED(4, "completed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37726a;

        b(int i14, String str) {
            this.f37726a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeLeaderboardFragment$collectMultipleProfileInfos$1", f = "AutoChallengeLeaderboardFragment.kt", l = {379}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.leaderboard.model.j> f37728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f37729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.i f37730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f37731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f37732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f37733g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AutoChallengeLeaderboardFragment$collectMultipleProfileInfos$1$profileInfoMap$1", f = "AutoChallengeLeaderboardFragment.kt", l = {379}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f37734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f37735b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List<Integer> f37736c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, List<Integer> list, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f37735b = pVar;
                this.f37736c = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f37735b, this.f37736c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o13.l] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f37734a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                p3 p3Var = (p3) this.f37735b.Z.getValue();
                this.f37734a = 1;
                Object objX4 = p3Var.x4(this.f37736c, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
                return objX4 == aVar ? aVar : objX4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.garmin.android.apps.connectmobile.leaderboard.model.j> list, p pVar, com.garmin.android.apps.connectmobile.leaderboard.model.i iVar, boolean z14, boolean z15, List<Integer> list2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f37728b = list;
            this.f37729c = pVar;
            this.f37730d = iVar;
            this.f37731e = z14;
            this.f37732f = z15;
            this.f37733g = list2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f37728b, this.f37729c, this.f37730d, this.f37731e, this.f37732f, this.f37733g, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37727a;
            p pVar = this.f37729c;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(pVar, this.f37733g, null);
                this.f37727a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Map map = (Map) obj;
            for (com.garmin.android.apps.connectmobile.leaderboard.model.j jVar : this.f37728b) {
                String str = jVar.f38210a;
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(str != null ? new Integer(Integer.parseInt(str)) : null);
                if (lVar != null) {
                    com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = lVar.getProfileImageUrls();
                    jVar.f38220k = new b12.b(profileImageUrls != null ? profileImageUrls.f46879h : null, null, null, null, null, 30, null);
                }
            }
            if (!pVar.requireActivity().isFinishing() && pVar.isAdded()) {
                pVar.U6(this.f37730d, this.f37731e, this.f37732f);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/p$e", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements androidx.core.view.s {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            boolean zBooleanValue;
            menu.getClass();
            menuInflater.getClass();
            p pVar = p.this;
            com.garmin.android.apps.connectmobile.leaderboard.model.i iVarT6 = pVar.T6();
            Integer numValueOf = iVarT6 != null ? Integer.valueOf(iVarT6.f38188a) : null;
            int i14 = a.HAS_CHALLENGE.f37723a;
            if (numValueOf == null || numValueOf.intValue() != i14) {
                int i15 = a.PENDING.f37723a;
                if (numValueOf == null || numValueOf.intValue() != i15) {
                    int i16 = a.UNKNOWN_REASON.f37723a;
                    if (numValueOf == null || numValueOf.intValue() != i16) {
                        return;
                    }
                }
            }
            if (pVar.P) {
                return;
            }
            menuInflater.inflate(R.menu.challenges_3_0, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_opt_out);
            com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = pVar.f37702j;
            if (fVar != null) {
                x xVar = x.f37955a;
                com.garmin.android.apps.connectmobile.leaderboard.model.k kVar = fVar.f38144i;
                zBooleanValue = kVar == null ? false : p005kotlin.jvm.internal.s.g(kVar.f38229b, b.ACTIVE.f37726a);
            } else {
                zBooleanValue = ((Boolean) pVar.f37706m.getF182175a()).booleanValue();
            }
            menuItemFindItem.setVisible(zBooleanValue);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_opt_out) {
                return false;
            }
            q1.b bVar = q1.f41066b;
            p pVar = p.this;
            String string = pVar.getString(R.string.mgs_challenges_confirm_opt_out_question);
            string.getClass();
            mt0.v0 v0Var = new mt0.v0(pVar, 1);
            bVar.getClass();
            q1 q1VarA = q1.b.a(R.string.title_challenges_confirm_opt_out, string, R.string.lbl_yes, R.string.lbl_no, v0Var);
            pVar.I = q1VarA;
            androidx.fragment.app.v childFragmentManager = pVar.getChildFragmentManager();
            childFragmentManager.getClass();
            q1VarA.v6(childFragmentManager, "challengeLeaveDialogTag");
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/p$f", "Landroidx/recyclerview/widget/RecyclerView$u;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends RecyclerView.u {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            int iFindFirstCompletelyVisibleItemPosition;
            recyclerView.getClass();
            super.onScrolled(recyclerView, i14, i15);
            int childCount = recyclerView.getChildCount();
            p pVar = p.this;
            if (childCount == 0) {
                iFindFirstCompletelyVisibleItemPosition = 0;
            } else {
                LinearLayoutManager linearLayoutManager = pVar.f37714w;
                if (linearLayoutManager == null) {
                    p005kotlin.jvm.internal.s.m("layoutManager");
                    throw null;
                }
                iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            }
            pVar.F6(iFindFirstCompletelyVisibleItemPosition == 0);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37739a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f37739a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37739a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37739a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37740a;

        public h(Fragment fragment) {
            this.f37740a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37740a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<p3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37745e;

        public i(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37741a = fragment;
            this.f37742b = qualifier;
            this.f37743c = aVar;
            this.f37744d = aVar2;
            this.f37745e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.p3] */
        @Override // e23.a
        public final p3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37743c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37741a;
            e23.a aVar = this.f37744d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(p3.class), f189591b, null, defaultViewModelCreationExtras, this.f37742b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37745e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f37746a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37746a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37747a = aVar;
            this.f37748b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37747a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37748b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f37749a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37749a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class m extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f37750a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37750a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class n extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37751a = aVar;
            this.f37752b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37751a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37752b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class o extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37753a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment) {
            super(0);
            this.f37753a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37753a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public p() {
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.T = new w1(t0Var.b(i3.class), new j(this), new l(this), new k(null, this));
        this.Y = new w1(t0Var.b(pt0.g.class), new m(this), new o(this), new n(null, this));
        this.Z = o13.m.a(o13.n.NONE, new i(this, null, new h(this), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        if (((Boolean) this.f37706m.getF182175a()).booleanValue()) {
            K6(false);
        } else {
            M6(false);
        }
    }

    public final void I6(com.garmin.android.apps.connectmobile.leaderboard.model.i iVar, boolean z14, boolean z15) {
        com.garmin.android.apps.connectmobile.leaderboard.model.f[] fVarArr;
        Iterable iterableC = (iVar == null || (fVarArr = iVar.f38190c) == null) ? p13.j0.f134944a : p13.u.C(fVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableC.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.j[] jVarArr = ((com.garmin.android.apps.connectmobile.leaderboard.model.f) it.next()).f38145j;
            List listI0 = jVarArr != null ? p13.u.i0(jVarArr) : null;
            if (listI0 != null) {
                arrayList.add(listI0);
            }
        }
        ArrayList arrayListZ = p13.h0.Z(p13.y.s(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayListZ.iterator();
        while (it3.hasNext()) {
            String str = ((com.garmin.android.apps.connectmobile.leaderboard.model.j) it3.next()).f38210a;
            Integer numValueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
            if (numValueOf != null) {
                arrayList2.add(numValueOf);
            }
        }
        ge1.b.T(g22.f.b(this), null, null, new d(arrayListZ, this, iVar, z14, z15, p13.h0.b1(p13.h0.f1(arrayList2)), null), 3);
    }

    public final void J6(boolean z14) {
        com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = this.f37702j;
        if (fVar == null) {
            return;
        }
        am.c2 c2Var = am.c2.AUTO_CHALLENGE;
        String str = fVar.f38136a;
        LegacyCommentsAndLikesActivity.a aVar = LegacyCommentsAndLikesActivity.f44483f;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        boolean z15 = this.f37707n;
        aVar.getClass();
        c2Var.getClass();
        Intent intent = new Intent(mVarRequireActivity, (Class<?>) LegacyCommentsAndLikesActivity.class);
        intent.putExtra("GCM_conversation_resource_type", c2Var.ordinal());
        intent.putExtra("GCM_conversation_resource_id", str);
        intent.putExtra("GCM_conversation_open_keyboard", z14);
        intent.setAction(z15 ? "GCM_action_view_comments_disable_social" : "GCM_action_view_comments");
        intent.putExtra("GCM_news_feed_item", fVar);
        intent.putExtra("GCM_conversation_allow_detail_view_navigation", false);
        startActivityForResult(intent, 1);
    }

    public final void K6(boolean z14) {
        if (z14) {
            r2 r2Var = this.X;
            if (r2Var != null) {
                r2Var.U7();
            }
        } else {
            G6();
        }
        androidx.lifecycle.m.a(null, new pt0.j(S6(), null), 3).f(getViewLifecycleOwner(), new g(new mt0.s0(this, z14, 1)));
    }

    public final void M6(boolean z14) {
        if (z14) {
            r2 r2Var = this.X;
            if (r2Var != null) {
                r2Var.U7();
            }
        } else {
            G6();
        }
        androidx.lifecycle.m.a(null, new pt0.k(S6(), null), 3).f(getViewLifecycleOwner(), new g(new mt0.s0(this, z14, 2)));
    }

    public final pt0.g S6() {
        return (pt0.g) this.Y.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.i T6() {
        return ((Boolean) this.f37706m.getF182175a()).booleanValue() ? this.f37700h : this.f37701i;
    }

    public final void U6(com.garmin.android.apps.connectmobile.leaderboard.model.i iVar, boolean z14, boolean z15) {
        if (z14) {
            this.f37700h = iVar;
        } else {
            this.f37701i = iVar;
        }
        e7();
        g7();
        requireActivity().invalidateOptionsMenu();
        if (!X6()) {
            if (!z15) {
                w6();
                return;
            }
            r2 r2Var = this.X;
            if (r2Var != null) {
                r2Var.t8();
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = this.f37702j;
        DateTime dateTime = new DateTime(fVar != null ? fVar.f38142g : null);
        x xVar = x.f37955a;
        int i14 = 0;
        this.f37707n = dateTime.plusDays(5).getMillis() < DateTime.now().getMillis();
        com.garmin.android.apps.connectmobile.leaderboard.model.f fVar2 = this.f37702j;
        String str = fVar2 != null ? fVar2.f38136a : null;
        if (str == null) {
            return;
        }
        am.c2 c2Var = am.c2.AUTO_CHALLENGE;
        pt0.g gVarS6 = S6();
        String strName = c2Var.name();
        strName.getClass();
        androidx.lifecycle.m.a(v1.a(gVarS6).f183565a, new pt0.i(gVarS6, strName, str, null), 2).f(getViewLifecycleOwner(), new g(new mt0.s0(this, z15, i14)));
    }

    public final void V6(boolean z14) {
        TextView textView = this.f37713v;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("errorLabelTextView");
            throw null;
        }
        textView.setText(R.string.leaderboard_error_label);
        Y6(false, true);
        this.f37703k.clear();
        mt0.q0 q0Var = this.f37715x;
        if (q0Var != null) {
            q0Var.notifyDataSetChanged();
        }
        if (!z14) {
            w6();
            return;
        }
        r2 r2Var = this.X;
        if (r2Var != null) {
            r2Var.t8();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean X6() {
        if (!((Boolean) this.f37706m.getF182175a()).booleanValue()) {
            return this.f37702j != null;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.i iVarT6 = T6();
        return (iVarT6 == null || iVarT6.f38188a != a.HAS_CHALLENGE.f37723a || this.f37702j == null) ? false : true;
    }

    public final void Y6(boolean z14, boolean z15) {
        ComposeView composeView = this.f37708o;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("dateContainer");
            throw null;
        }
        composeView.setVisibility(z14 ? 0 : 8);
        ComposeView composeView2 = this.f37709p;
        if (composeView2 == null) {
            p005kotlin.jvm.internal.s.m("notJoinedView");
            throw null;
        }
        composeView2.setVisibility(z14 ? 0 : 8);
        TextView textView = this.f37713v;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("errorLabelTextView");
            throw null;
        }
        textView.setVisibility(z15 ? 0 : 8);
        View view2 = this.f37710q;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("challengeTopSection");
            throw null;
        }
        view2.setVisibility(8);
        RecyclerView recyclerView = this.f37711r;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        FrameLayout frameLayout = this.f37712t;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("headerFrameLayout");
            throw null;
        }
        frameLayout.removeAllViews();
        FrameLayout frameLayout2 = this.f37712t;
        if (frameLayout2 == null) {
            p005kotlin.jvm.internal.s.m("headerFrameLayout");
            throw null;
        }
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = this.A;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(z14 ? 8 : 0);
        } else {
            p005kotlin.jvm.internal.s.m("challengesFirstUseContainer");
            throw null;
        }
    }

    public final void c7() {
        Y6(false, false);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(-1267290479, true, new mt0.r0(this, 1)));
        FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("challengesFirstUseContainer");
            throw null;
        }
        frameLayout.removeAllViews();
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            frameLayout2.addView(composeView);
        } else {
            p005kotlin.jvm.internal.s.m("challengesFirstUseContainer");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d7() {
        if (X6()) {
            ComposeView composeView = this.f37708o;
            if (composeView == null) {
                p005kotlin.jvm.internal.s.m("dateContainer");
                throw null;
            }
            composeView.setVisibility(0);
            com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = this.f37702j;
            com.garmin.android.apps.connectmobile.leaderboard.model.h hVar = fVar != null ? fVar.f38139d : null;
            if (hVar != null) {
                int i14 = hVar.f38171c;
                TextView textView = this.f37716y;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("challengeTitleTextView");
                    throw null;
                }
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                textView.setText(x.q(i14, contextRequireContext));
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.f fVar2 = this.f37702j;
            Date date = fVar2 != null ? fVar2.f38142g : null;
            if (!((Boolean) this.f37706m.getF182175a()).booleanValue() || date == null) {
                TextView textView2 = this.f37717z;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("challengeDaysLeftTextView");
                    throw null;
                }
                textView2.setVisibility(8);
            } else {
                long time = date.getTime() - Calendar.getInstance().getTimeInMillis();
                TextView textView3 = this.f37717z;
                if (time > 0) {
                    if (textView3 == null) {
                        p005kotlin.jvm.internal.s.m("challengeDaysLeftTextView");
                        throw null;
                    }
                    textView3.setText(getString(R.string.lbl_days_left, NumberFormat.getInstance().format(time / 86400000)));
                } else {
                    if (textView3 == null) {
                        p005kotlin.jvm.internal.s.m("challengeDaysLeftTextView");
                        throw null;
                    }
                    textView3.setText(R.string.challenge_in_evaluation_label);
                }
                TextView textView4 = this.f37717z;
                if (textView4 == null) {
                    p005kotlin.jvm.internal.s.m("challengeDaysLeftTextView");
                    throw null;
                }
                textView4.setVisibility(0);
            }
            View view2 = this.f37710q;
            if (view2 != null) {
                view2.setVisibility(0);
            } else {
                p005kotlin.jvm.internal.s.m("challengeTopSection");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e7() {
        com.garmin.android.apps.connectmobile.leaderboard.model.j[] jVarArr;
        com.garmin.android.apps.connectmobile.leaderboard.model.i iVarT6 = T6();
        if (iVarT6 == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.f fVar = null;
        fVar = null;
        Object obj = null;
        if (((Boolean) this.f37706m.getF182175a()).booleanValue()) {
            com.garmin.android.apps.connectmobile.leaderboard.model.f[] fVarArr = iVarT6.f38190c;
            if (fVarArr != null) {
                fVar = (com.garmin.android.apps.connectmobile.leaderboard.model.f) p13.u.H(fVarArr);
            }
        } else {
            ot0.j jVar = (ot0.j) S6().f140679f.f150540a.getValue();
            LocalDate localDateW = jVar != null ? oe2.f.w(jVar) : null;
            com.garmin.android.apps.connectmobile.leaderboard.model.f[] fVarArr2 = iVarT6.f38190c;
            if (fVarArr2 != null) {
                for (Object obj2 : p13.u.C(fVarArr2)) {
                    Date date = ((com.garmin.android.apps.connectmobile.leaderboard.model.f) obj2).f38141f;
                    if (date != null ? p005kotlin.jvm.internal.s.g(LocalDate.fromDateFields(date), localDateW) : false) {
                        obj = obj2;
                        break;
                    }
                }
                fVar = (com.garmin.android.apps.connectmobile.leaderboard.model.f) obj;
            }
        }
        this.f37702j = fVar;
        ArrayList arrayList = this.f37703k;
        arrayList.clear();
        com.garmin.android.apps.connectmobile.leaderboard.model.f fVar2 = this.f37702j;
        arrayList.addAll((fVar2 == null || (jVarArr = fVar2.f38145j) == null) ? p13.j0.f134944a : p13.u.C(jVarArr));
    }

    public final void f7() {
        View viewC;
        TextView textView = this.f37713v;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("errorLabelTextView");
            throw null;
        }
        textView.setVisibility(8);
        FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("challengesFirstUseContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        ComposeView composeView = this.f37709p;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("notJoinedView");
            throw null;
        }
        composeView.setVisibility(8);
        RecyclerView recyclerView = this.f37711r;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        int size = 0;
        recyclerView.setVisibility(0);
        ArrayList arrayList = this.f37703k;
        if (arrayList.isEmpty()) {
            mt0.q0 q0Var = this.f37715x;
            if (q0Var != null) {
                q0Var.notifyDataSetChanged();
                return;
            }
            return;
        }
        p13.c0.u(arrayList, new a61.c(new ml0.a(12), 13));
        mt0.q0 q0Var2 = this.f37715x;
        if (q0Var2 != null) {
            q0Var2.notifyDataSetChanged();
        }
        FrameLayout frameLayout2 = this.f37712t;
        if (frameLayout2 == null) {
            p005kotlin.jvm.internal.s.m("headerFrameLayout");
            throw null;
        }
        frameLayout2.removeAllViews();
        FrameLayout frameLayout3 = this.f37712t;
        if (frameLayout3 == null) {
            p005kotlin.jvm.internal.s.m("headerFrameLayout");
            throw null;
        }
        frameLayout3.setVisibility(4);
        c cVar = H0;
        int iA = c.a(cVar, arrayList);
        if (iA < 0) {
            viewC = null;
        } else {
            String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
            boolean z14 = arrayList.size() == 1;
            boolean zG = p005kotlin.jvm.internal.s.g(userDisplayName, ((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(0)).f38211b);
            int size2 = arrayList.size() - 1;
            boolean z15 = p005kotlin.jvm.internal.s.g(userDisplayName, ((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(size2)).f38211b) || ((((double) Math.abs(((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(size2)).f38215f - ((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(iA)).f38215f)) > 1.0E-7d ? 1 : (((double) Math.abs(((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(size2)).f38215f - ((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(iA)).f38215f)) == 1.0E-7d ? 0 : -1)) < 0);
            com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var = new com.garmin.android.apps.connectmobile.leaderboard.model.e0((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(iA));
            com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var2 = new com.garmin.android.apps.connectmobile.leaderboard.model.e0((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(0));
            com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var3 = new com.garmin.android.apps.connectmobile.leaderboard.model.e0((com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(size2));
            mt0.x0 x0Var = mt0.x0.STEPS;
            if (z14) {
                mt0.z0.f120946a.getClass();
                viewC = mt0.z0.c(requireActivity(), x0Var, false, e0Var);
            } else if (zG) {
                mt0.z0.f120946a.getClass();
                viewC = mt0.z0.c(requireActivity(), x0Var, true, e0Var, e0Var3);
            } else if (z15) {
                mt0.z0.f120946a.getClass();
                viewC = mt0.z0.c(requireActivity(), x0Var, false, e0Var, e0Var2);
            } else {
                mt0.z0.f120946a.getClass();
                viewC = mt0.z0.c(requireActivity(), x0Var, false, e0Var, e0Var2, e0Var3);
            }
        }
        if (viewC != null) {
            FrameLayout frameLayout4 = this.f37712t;
            if (frameLayout4 == null) {
                p005kotlin.jvm.internal.s.m("headerFrameLayout");
                throw null;
            }
            frameLayout4.addView(viewC);
            FrameLayout frameLayout5 = this.f37712t;
            if (frameLayout5 == null) {
                p005kotlin.jvm.internal.s.m("headerFrameLayout");
                throw null;
            }
            frameLayout5.setVisibility(0);
        }
        mt0.q0 q0Var3 = this.f37715x;
        if (q0Var3 == null) {
            return;
        }
        List<com.garmin.android.apps.connectmobile.leaderboard.model.j> list = q0Var3.f120817b;
        int iA2 = c.a(cVar, arrayList);
        if (iA2 >= 0) {
            size = iA2 >= list.size() ? list.size() - 1 : iA2;
        }
        LinearLayoutManager linearLayoutManager = this.f37714w;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(size, 120);
        } else {
            p005kotlin.jvm.internal.s.m("layoutManager");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g7() {
        com.garmin.android.apps.connectmobile.leaderboard.model.i iVarT6 = T6();
        if (iVarT6 == null) {
            return;
        }
        c2 c2Var = this.f37706m;
        if (!((Boolean) c2Var.getF182175a()).booleanValue()) {
            if (this.f37702j == null) {
                Y6(true, false);
                return;
            }
            f7();
            d7();
            h7();
            return;
        }
        int i14 = iVarT6.f38188a;
        if (i14 == a.HAS_CHALLENGE.f37723a) {
            if (X6()) {
                f7();
                d7();
                h7();
                return;
            } else {
                if (((Boolean) c2Var.getF182175a()).booleanValue()) {
                    c7();
                    return;
                }
                TextView textView = this.f37713v;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("errorLabelTextView");
                    throw null;
                }
                textView.setText(R.string.msg_no_challenge_available);
                Y6(false, true);
                return;
            }
        }
        if (i14 == a.PENDING.f37723a) {
            Y6(true, false);
            return;
        }
        if (i14 == a.UNKNOWN_REASON.f37723a) {
            TextView textView2 = this.f37713v;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("errorLabelTextView");
                throw null;
            }
            textView2.setText(R.string.msg_no_challenge_available);
            Y6(false, true);
            return;
        }
        if (i14 != a.USER_OPTED_OUT.f37723a) {
            c7();
        } else if (((Boolean) c2Var.getF182175a()).booleanValue()) {
            c7();
        } else {
            Y6(true, false);
        }
    }

    public final void h7() {
        com.garmin.android.apps.connectmobile.leaderboard.model.f fVar;
        com.garmin.android.apps.connectmobile.leaderboard.model.h hVar;
        if (!X6() || (fVar = this.f37702j) == null || (hVar = fVar.f38139d) == null) {
            return;
        }
        int i14 = hVar.f38171c;
        d3 d3Var = this.f37704k0;
        if (d3Var != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            d3Var.updateActionBarTitle(x.q(i14, contextRequireContext));
        }
    }

    public final void i7() {
        if (X6()) {
            TextView textView = this.C;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("commentTextView");
                throw null;
            }
            textView.setVisibility(this.f37707n ? 8 : 0);
            TextView textView2 = this.C;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("commentTextView");
                throw null;
            }
            final int i14 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.w0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p f120904b;

                {
                    this.f120904b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar = this.f120904b;
                    switch (i15) {
                        case 0:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                            pVar.J6(true);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                            pVar.J6(false);
                            break;
                    }
                }
            });
            mo1.d dVar = this.f37705l;
            TextView textView3 = this.E;
            if (dVar == null) {
                if (textView3 == null) {
                    p005kotlin.jvm.internal.s.m("commentCountTextView");
                    throw null;
                }
                textView3.setVisibility(8);
                ImageView imageView = this.D;
                if (imageView == null) {
                    p005kotlin.jvm.internal.s.m("commentIcon");
                    throw null;
                }
                imageView.setVisibility(8);
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("commentLayout");
                    throw null;
                }
            }
            int numberOfComments = dVar.getNumberOfComments();
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("commentCountTextView");
                throw null;
            }
            textView3.setText(String.valueOf(numberOfComments));
            TextView textView4 = this.E;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("commentCountTextView");
                throw null;
            }
            textView4.setVisibility(numberOfComments == 0 ? 8 : 0);
            ImageView imageView2 = this.D;
            if (imageView2 == null) {
                p005kotlin.jvm.internal.s.m("commentIcon");
                throw null;
            }
            imageView2.setVisibility(numberOfComments == 0 ? 8 : 0);
            LinearLayout linearLayout2 = this.F;
            if (linearLayout2 == null) {
                p005kotlin.jvm.internal.s.m("commentLayout");
                throw null;
            }
            linearLayout2.setVisibility(numberOfComments == 0 ? 8 : 0);
            String string = numberOfComments == 1 ? getString(R.string.lbl_comments_count_singular, Integer.valueOf(numberOfComments)) : getString(R.string.lbl_comments_count, Integer.valueOf(numberOfComments));
            string.getClass();
            LinearLayout linearLayout3 = this.F;
            if (linearLayout3 == null) {
                p005kotlin.jvm.internal.s.m("commentLayout");
                throw null;
            }
            linearLayout3.setContentDescription(string);
            LinearLayout linearLayout4 = this.F;
            if (linearLayout4 == null) {
                p005kotlin.jvm.internal.s.m("commentLayout");
                throw null;
            }
            final int i15 = 1;
            linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.w0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p f120904b;

                {
                    this.f120904b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar = this.f120904b;
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                            pVar.J6(true);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                            pVar.J6(false);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("GCM_challenge_list", com.garmin.android.apps.connectmobile.leaderboard.model.i.class);
            } else {
                Parcelable parcelable3 = arguments.getParcelable("GCM_challenge_list");
                if (!(parcelable3 instanceof com.garmin.android.apps.connectmobile.leaderboard.model.i)) {
                    parcelable3 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.leaderboard.model.i) parcelable3;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.i iVar = (com.garmin.android.apps.connectmobile.leaderboard.model.i) parcelable;
            if (i14 >= 33) {
                parcelable2 = (Parcelable) arguments.getParcelable("GCM_conversation", mo1.d.class);
            } else {
                Parcelable parcelable4 = arguments.getParcelable("GCM_conversation");
                if (!(parcelable4 instanceof mo1.d)) {
                    parcelable4 = null;
                }
                parcelable2 = (mo1.d) parcelable4;
            }
            this.f37705l = (mo1.d) parcelable2;
            Boolean boolValueOf = Boolean.valueOf(arguments.getBoolean("GCM_show_current_challenge"));
            c2 c2Var = this.f37706m;
            c2Var.setValue(boolValueOf);
            if (((Boolean) c2Var.getF182175a()).booleanValue()) {
                this.f37700h = iVar;
                pt0.g gVarS6 = S6();
                ot0.j jVar = ot0.j.CURRENT_WEEK;
                jVar.getClass();
                gVarS6.f140676c.k(null, jVar);
                gVarS6.f140678e.k(null, jVar);
            }
        }
        pt0.g gVarS7 = S6();
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(gVarS7);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new pt0.l(y0Var, null), 2);
        y0Var.f(getViewLifecycleOwner(), new g(new mt0.t0(this, 3)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1 && i15 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("GCM_conversation_comments_edited_count", 0);
            if (intExtra == 0) {
                return;
            }
            mo1.d dVar = this.f37705l;
            if (dVar != null) {
                int numberOfComments = dVar.getNumberOfComments() + intExtra;
                dVar.q(numberOfComments >= 0 ? numberOfComments : 0);
            }
            i7();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.X = (r2) context;
            this.f37704k0 = (d3) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.CHALLENGES;
            String str = context + " must implement " + r2.class.getName();
            aVar.getClass();
            i2.a.f(a2Var, "AutoChallengeLeaderboardFragment", str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewA6 = A6(viewGroup, layoutInflater, R.layout.gcm3_challenges_layout);
        View viewFindViewById = viewA6.findViewById(R.id.date_container);
        viewFindViewById.getClass();
        this.f37708o = (ComposeView) viewFindViewById;
        View viewFindViewById2 = viewA6.findViewById(R.id.not_joined_view);
        viewFindViewById2.getClass();
        this.f37709p = (ComposeView) viewFindViewById2;
        View viewFindViewById3 = viewA6.findViewById(R.id.challenge_top_section);
        viewFindViewById3.getClass();
        this.f37710q = viewFindViewById3;
        View viewFindViewById4 = viewA6.findViewById(R.id.leaderboard_list);
        viewFindViewById4.getClass();
        this.f37711r = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = viewA6.findViewById(R.id.leaderboard_header);
        viewFindViewById5.getClass();
        this.f37712t = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = viewA6.findViewById(R.id.leaderboard_error_label);
        viewFindViewById6.getClass();
        this.f37713v = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewA6.findViewById(R.id.challenge_title);
        viewFindViewById7.getClass();
        this.f37716y = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewA6.findViewById(R.id.challenge_days_left);
        viewFindViewById8.getClass();
        this.f37717z = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewA6.findViewById(R.id.challenges_message_container);
        viewFindViewById9.getClass();
        this.A = (FrameLayout) viewFindViewById9;
        View viewFindViewById10 = viewA6.findViewById(R.id.challenge_comment_btn);
        viewFindViewById10.getClass();
        this.C = (TextView) viewFindViewById10;
        View viewFindViewById11 = viewA6.findViewById(R.id.challenge_comment_icon);
        viewFindViewById11.getClass();
        this.D = (ImageView) viewFindViewById11;
        View viewFindViewById12 = viewA6.findViewById(R.id.challenge_comment_count);
        viewFindViewById12.getClass();
        this.E = (TextView) viewFindViewById12;
        View viewFindViewById13 = viewA6.findViewById(R.id.challenge_comment_layout);
        viewFindViewById13.getClass();
        this.F = (LinearLayout) viewFindViewById13;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (!c22.b.e(contextRequireContext)) {
            return viewA6;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        int iC = (int) c22.b.c(contextRequireContext2, getResources().getDimensionPixelSize(R.dimen.icon_default), 1.5f);
        ImageView imageView = this.D;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("commentIcon");
            throw null;
        }
        imageView.getLayoutParams().width = iC;
        ImageView imageView2 = this.D;
        if (imageView2 != null) {
            imageView2.getLayoutParams().height = iC;
            return viewA6;
        }
        p005kotlin.jvm.internal.s.m("commentIcon");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        androidx.fragment.app.m activity;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new e(), androidx.lifecycle.b0.b.RESUMED);
        ComposeView composeView = this.f37708o;
        if (composeView == null) {
            p005kotlin.jvm.internal.s.m("dateContainer");
            throw null;
        }
        composeView.setContent(new z3.e(556601950, true, new mt0.r0(this, 3)));
        ComposeView composeView2 = this.f37709p;
        if (composeView2 == null) {
            p005kotlin.jvm.internal.s.m("notJoinedView");
            throw null;
        }
        composeView2.setContent(new z3.e(1573841749, true, new mt0.r0(this, 4)));
        RecyclerView recyclerView = this.f37711r;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        this.f37714w = linearLayoutManager;
        RecyclerView recyclerView2 = this.f37711r;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.f37711r;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView3.setOnScrollListener(new f());
        if (!x.v() || (activity = getActivity()) == null || activity.isFinishing()) {
            return;
        }
        com.garmin.android.apps.connectmobile.x.a aVar = com.garmin.android.apps.connectmobile.x.f49750f;
        String string = activity.getString(R.string.social_challenge_wrong_activity_type_message_steps);
        string.getClass();
        com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar, null, string, null, 0, 61);
        androidx.fragment.app.v supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.notification_layout, xVarA, null);
        aVar2.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/p$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CHALLENGE_LEAVE_DIALOG_TAG", "CHALLENGE_ERROR_DIALOG_TAG", "", "COMMENT_REQUEST_CODE", "I", "SCROLL_POSITION_TOP_OFFSET", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final int a(c cVar, ArrayList arrayList) {
            cVar.getClass();
            if (arrayList.isEmpty()) {
                return -1;
            }
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                com.garmin.android.apps.connectmobile.leaderboard.model.j jVar = (com.garmin.android.apps.connectmobile.leaderboard.model.j) arrayList.get(i14);
                String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                String str = jVar.f38211b;
                if (str != null && str.equals(userDisplayName)) {
                    return i14;
                }
            }
            return -1;
        }

        private c() {
        }
    }
}
