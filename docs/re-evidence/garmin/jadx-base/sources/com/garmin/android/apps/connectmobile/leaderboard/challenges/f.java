package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import am.c2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import fo1.s1;
import fo1.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mt0.p3;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/o0;", "<init>", "()V", "b", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends o0 {
    public static final a R0 = new a(null);
    public View H0;
    public View I0;
    public View J0;
    public MenuItem K0;
    public com.garmin.android.apps.connectmobile.leaderboard.challenges.b N0;
    public View Y;
    public View Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f37455k0;
    public final o13.t L0 = o13.m.b(new mh1.i(this, 6));
    public Object M0 = p13.j0.f134944a;
    public final Object O0 = o13.m.a(o13.n.NONE, new g(this, null, new C0671f(this), null, null));
    public final kt0.a P0 = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
    public final d Q0 = new d();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f$b;", "Lg22/c;", "Ljava/lang/Void;", "", "Lsd2/f;", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends g22.c<Void, List<? extends sd2.f>> {
        public b() {
            super(null, 1, null);
        }

        @Override // g22.c
        public final List<? extends sd2.f> b(Void[] voidArr) {
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListD = rd2.j.d();
            if (arrayListD == null) {
                return null;
            }
            f12.l.f68084a.getClass();
            long jS4 = f12.l.a.a().s4();
            if (jS4 == -1) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.CHALLENGES;
                aVar.getClass();
                i2.a.p(a2Var, "AdHocChallengeLeaderboardFragment", "Preferred device not found.");
            }
            ArrayList arrayList = new ArrayList();
            int size = arrayListD.size();
            for (int i14 = 0; i14 < size; i14++) {
                sd2.f fVar = (sd2.f) arrayListD.get(i14);
                if (fVar.getUnitID() > -1 && fVar.isPaired()) {
                    arrayList.add(fVar);
                }
            }
            p13.c0.u(arrayList, new a61.c(new d81.z(f.this, jS4, 7), 12));
            return arrayList;
        }

        @Override // g22.c
        public final void d(List<? extends sd2.f> list) {
            sd2.f fVar;
            List<? extends sd2.f> list2 = list;
            sd2.f fVar2 = null;
            f fVar3 = f.this;
            if (list2 == null || list2.isEmpty()) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.CHALLENGES;
                aVar.getClass();
                i2.a.b(a2Var, "AdHocChallengeLeaderboardFragment", "Device not found. Display dialog to add device.");
                a aVar2 = f.R0;
                fVar3.getClass();
                q1.b bVar = q1.f41066b;
                String string = fVar3.getString(R.string.social_add_garmin_device);
                string.getClass();
                String string2 = fVar3.getString(R.string.social_add_garmin_device_message);
                string2.getClass();
                mn2.e eVar = new mn2.e(fVar3, 25);
                bVar.getClass();
                q1 q1VarC = q1.b.c(string, string2, R.string.lbl_add, R.string.lbl_close, eVar);
                androidx.fragment.app.v childFragmentManager = fVar3.getChildFragmentManager();
                childFragmentManager.getClass();
                q1VarC.v6(childFragmentManager, "TAG_ADD_DEVICE");
                fVar3.F6();
                View view2 = fVar3.J0;
                if (view2 != null) {
                    view2.setEnabled(true);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mSyncNowButton");
                    throw null;
                }
            }
            kt0.a aVar3 = fVar3.P0;
            int i14 = 0;
            if (aVar3.b(((sd2.f) p13.h0.b0(list2)).getUnitID())) {
                if (!list2.isEmpty()) {
                    int size = list2.size();
                    while (i14 < size) {
                        sd2.f fVar4 = list2.get(i14);
                        String productNumber = fVar4.getProductNumber();
                        productNumber.getClass();
                        if (aVar3.s(productNumber)) {
                            fVar2 = fVar4;
                            break;
                        }
                        i14++;
                    }
                }
                if (fVar2 != null) {
                    f.u7(fVar3, fVar2);
                }
                aVar3.p();
                return;
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.CHALLENGES;
            aVar4.getClass();
            i2.a.b(a2Var2, "AdHocChallengeLeaderboardFragment", "Did not found any connected devices. Display help dialog.");
            if (!list2.isEmpty()) {
                f12.l.f68084a.getClass();
                long jS4 = f12.l.a.a().s4();
                int size2 = list2.size();
                while (true) {
                    if (i14 >= size2) {
                        fVar = (sd2.f) p13.h0.b0(list2);
                        break;
                    }
                    fVar = list2.get(i14);
                    if (fVar.getUnitID() == jS4) {
                        break;
                    } else {
                        i14++;
                    }
                }
            } else {
                fVar = null;
            }
            f.u7(fVar3, fVar);
            fVar3.F6();
            View view3 = fVar3.J0;
            if (view3 != null) {
                view3.setEnabled(true);
            } else {
                p005kotlin.jvm.internal.s.m("mSyncNowButton");
                throw null;
            }
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37457a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37457a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/f$d", "Lwf0/a;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends wf0.a {
        public d() {
        }

        @Override // wf0.a
        public final void deviceSyncFinished(pi2.i iVar) {
            iVar.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.CHALLENGES;
            aVar.getClass();
            i2.a.b(a2Var, "AdHocChallengeLeaderboardFragment", "Received deviceSyncFinished");
            new Handler(Looper.getMainLooper()).post(new k32.n(f.this, 15));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37459a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f37459a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37459a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37459a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0671f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37460a;

        public C0671f(Fragment fragment) {
            this.f37460a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37460a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<p3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37465e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37461a = fragment;
            this.f37462b = qualifier;
            this.f37463c = aVar;
            this.f37464d = aVar2;
            this.f37465e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.p3] */
        @Override // e23.a
        public final p3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37463c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37461a;
            e23.a aVar = this.f37464d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(p3.class), f189591b, null, defaultViewModelCreationExtras, this.f37462b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37465e, 4, null);
        }
    }

    public static final void u7(f fVar, sd2.f fVar2) {
        if (fVar2 == null) {
            fVar.getClass();
            return;
        }
        kt0.a aVar = fVar.P0;
        Context contextRequireContext = fVar.requireContext();
        contextRequireContext.getClass();
        q1 q1VarF = aVar.f(contextRequireContext, fVar2);
        androidx.fragment.app.v childFragmentManager = fVar.getChildFragmentManager();
        childFragmentManager.getClass();
        q1VarF.v6(childFragmentManager, "TAG_SYNC_NOW_HELP");
    }

    public static void z7(int i14, View view2) {
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.header_container) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i14);
            return;
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2.CHALLENGES, "AdHocChallengeLeaderboardFragment", "Header container @id/header_container not found. The visibility won't change: " + view2);
    }

    public final void A7(UserLevelImageView userLevelImageView, TextView textView) {
        int dimension = (int) getResources().getDimension(R.dimen.leaderboard_image_large_size);
        userLevelImageView.getLayoutParams().height = dimension;
        userLevelImageView.getLayoutParams().width = dimension;
        textView.setBackgroundResource(2131231818);
        textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_yellow));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        textView.setTextSize(0, (int) c22.b.b(contextRequireContext, getResources().getDimension(R.dimen.leaderboard_ranking_text_size), 1.0f));
    }

    public final void B7(UserLevelImageView userLevelImageView, TextView textView) {
        int dimension = (int) getResources().getDimension(R.dimen.leaderboard_image_medium_size);
        userLevelImageView.getLayoutParams().height = dimension;
        userLevelImageView.getLayoutParams().width = dimension;
        textView.setBackground(null);
        textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        textView.setTextSize(0, (int) c22.b.b(contextRequireContext, getResources().getDimension(R.dimen.andfont_h_2), 1.0f));
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.List] */
    public final void C7() {
        ArrayList arrayList;
        long j8;
        View view2 = this.Z;
        if (view2 == null) {
            p005kotlin.jvm.internal.s.m("mCurrentLeaderHeaderView");
            throw null;
        }
        z7(8, view2);
        View view3 = this.H0;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mLockedHeaderView");
            throw null;
        }
        z7(8, view3);
        View view4 = this.f37455k0;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
            throw null;
        }
        z7(8, view4);
        View view5 = this.I0;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mAwardsHeaderView");
            throw null;
        }
        z7(8, view5);
        View view6 = this.Y;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("mTitleHeaderView");
            throw null;
        }
        TextView textView = (TextView) view6.findViewById(R.id.challenge_details_title);
        View view7 = this.Y;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("mTitleHeaderView");
            throw null;
        }
        TextView textView2 = (TextView) view7.findViewById(R.id.challenge_details_period);
        Context context = textView.getContext();
        context.getClass();
        textView.setText(x.p(context, this.f37694z));
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        com.garmin.android.apps.connectmobile.leaderboard.model.v vVarC = adHocChallengeDTO != null ? adHocChallengeDTO.C() : null;
        if (vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED || vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED) {
            textView2.setText(R.string.social_gathering_results);
        } else {
            Context context2 = textView2.getContext();
            context2.getClass();
            textView2.setText(x.o(context2, this.f37694z, true));
        }
        View view8 = this.Y;
        if (view8 == null) {
            p005kotlin.jvm.internal.s.m("mTitleHeaderView");
            throw null;
        }
        TextView textView3 = (TextView) view8.findViewById(R.id.consent_message);
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        textView3.setText((adHocChallengeDTO2 != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO2.f37989c) : null) == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k ? requireContext().getString(R.string.lbl_adhoc_challenge_rules_wheelchair) : requireContext().getString(R.string.lbl_adhoc_challenge_rules));
        ?? r14 = this.M0;
        if (r14.isEmpty()) {
            return;
        }
        AdHocChallengeDTO adHocChallengeDTO3 = this.f37694z;
        if ((adHocChallengeDTO3 != null ? adHocChallengeDTO3.C() : null) != com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED) {
            if (w7()) {
                View view9 = this.H0;
                if (view9 != null) {
                    z7(0, view9);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mLockedHeaderView");
                    throw null;
                }
            }
            View view10 = this.Z;
            if (view10 == null) {
                p005kotlin.jvm.internal.s.m("mCurrentLeaderHeaderView");
                throw null;
            }
            z7(0, view10);
            ot0.a aVar = (ot0.a) p13.h0.b0(r14);
            View view11 = this.Z;
            if (view11 == null) {
                p005kotlin.jvm.internal.s.m("mCurrentLeaderHeaderView");
                throw null;
            }
            UserLevelImageView userLevelImageView = (UserLevelImageView) view11.findViewById(R.id.challenge_leaderboard_current_leader_image);
            if (p005kotlin.jvm.internal.s.g(aVar.f133714i, Boolean.TRUE)) {
                userLevelImageView.setImageUrl(uu.i0.e(aVar.f133715j, uu.i0.g(), false));
                return;
            } else {
                userLevelImageView.setProfileImageData(aVar.f133716k);
                return;
            }
        }
        if (r14.size() >= 2) {
            View view12 = this.f37455k0;
            if (view12 == null) {
                p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                throw null;
            }
            z7(0, view12);
            ?? r15 = this.M0;
            ot0.a aVar2 = (ot0.a) p13.h0.d0(r15);
            if (aVar2 != null) {
                View view13 = this.f37455k0;
                if (view13 == null) {
                    p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                    throw null;
                }
                TextView textView4 = (TextView) view13.findViewById(R.id.leaderboard_header_first_rank);
                View view14 = this.f37455k0;
                if (view14 == null) {
                    p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                    throw null;
                }
                UserLevelImageView userLevelImageView2 = (UserLevelImageView) view14.findViewById(R.id.leaderboard_header_profile_picture_center);
                textView4.setText(String.valueOf(aVar2.f133709d));
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                textView4.setTextSize(0, (int) c22.b.b(contextRequireContext, getResources().getDimension(R.dimen.leaderboard_ranking_text_size), 1.0f));
                Boolean bool = aVar2.f133714i;
                Boolean bool2 = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                    userLevelImageView2.setImageUrl(uu.i0.e(aVar2.f133715j, uu.i0.g(), false));
                } else {
                    userLevelImageView2.setProfileImageData(aVar2.f133716k);
                }
                View view15 = this.f37455k0;
                if (view15 == null) {
                    p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                    throw null;
                }
                TextView textView5 = (TextView) view15.findViewById(R.id.leaderboard_header_second_rank);
                View view16 = this.f37455k0;
                if (view16 == null) {
                    p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                    throw null;
                }
                UserLevelImageView userLevelImageView3 = (UserLevelImageView) view16.findViewById(R.id.leaderboard_header_profile_picture_left);
                if (r15.size() >= 2) {
                    ot0.a aVar3 = (ot0.a) r15.get(1);
                    j8 = 1;
                    if (aVar3.f133709d == 1) {
                        userLevelImageView3.getClass();
                        textView5.getClass();
                        A7(userLevelImageView3, textView5);
                    } else {
                        userLevelImageView3.getClass();
                        textView5.getClass();
                        B7(userLevelImageView3, textView5);
                    }
                    textView5.setText(String.valueOf(aVar3.f133709d));
                    if (p005kotlin.jvm.internal.s.g(aVar3.f133714i, bool2)) {
                        userLevelImageView3.setImageUrl(uu.i0.e(aVar3.f133715j, uu.i0.g(), false));
                    } else {
                        userLevelImageView3.setProfileImageData(aVar3.f133716k);
                    }
                } else {
                    j8 = 1;
                    textView5.setVisibility(4);
                    userLevelImageView3.setVisibility(4);
                }
                View view17 = this.f37455k0;
                if (view17 == null) {
                    p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                    throw null;
                }
                TextView textView6 = (TextView) view17.findViewById(R.id.leaderboard_header_third_rank);
                View view18 = this.f37455k0;
                if (view18 == null) {
                    p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
                    throw null;
                }
                UserLevelImageView userLevelImageView4 = (UserLevelImageView) view18.findViewById(R.id.leaderboard_header_profile_picture_right);
                if (r15.size() >= 3) {
                    ot0.a aVar4 = (ot0.a) r15.get(2);
                    long j14 = aVar4.f133709d;
                    if (j14 == j8) {
                        userLevelImageView4.getClass();
                        textView6.getClass();
                        A7(userLevelImageView4, textView6);
                    } else if (j14 == 2) {
                        userLevelImageView4.getClass();
                        textView6.getClass();
                        B7(userLevelImageView4, textView6);
                    } else {
                        userLevelImageView4.getClass();
                        textView6.getClass();
                        int dimension = (int) getResources().getDimension(R.dimen.leaderboard_image_small_size);
                        userLevelImageView4.getLayoutParams().height = dimension;
                        userLevelImageView4.getLayoutParams().width = dimension;
                        textView6.setBackground(null);
                        textView6.setTextColor(a7.b.getColor(textView6.getContext(), R.color.gcm_text_primary));
                        Context contextRequireContext2 = requireContext();
                        contextRequireContext2.getClass();
                        textView6.setTextSize(0, (int) c22.b.b(contextRequireContext2, getResources().getDimension(R.dimen.andfont_h_2), 1.0f));
                    }
                    textView6.setText(String.valueOf(aVar4.f133709d));
                    if (p005kotlin.jvm.internal.s.g(aVar4.f133714i, bool2)) {
                        userLevelImageView4.setImageUrl(uu.i0.e(aVar4.f133715j, uu.i0.g(), false));
                    } else {
                        userLevelImageView4.setProfileImageData(aVar4.f133716k);
                    }
                } else {
                    textView6.setVisibility(4);
                    userLevelImageView4.setVisibility(4);
                }
            }
            if (x.t(this.f37694z)) {
                return;
            }
            View view19 = this.I0;
            if (view19 == null) {
                p005kotlin.jvm.internal.s.m("mAwardsHeaderView");
                throw null;
            }
            z7(0, view19);
            AdHocChallengeDTO adHocChallengeDTO4 = this.f37694z;
            if (adHocChallengeDTO4 == null || (arrayList = adHocChallengeDTO4.f38002p) == null) {
                return;
            }
            View view20 = this.I0;
            if (view20 == null) {
                p005kotlin.jvm.internal.s.m("mAwardsHeaderView");
                throw null;
            }
            AdHocChallengeAwardsView adHocChallengeAwardsView = (AdHocChallengeAwardsView) view20.findViewById(R.id.challenge_awards_view);
            if (adHocChallengeAwardsView != null) {
                adHocChallengeAwardsView.setAwards(arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public final void D7() {
        Object arrayList;
        AdHocChallengeDTO adHocChallengeDTO;
        ArrayList<com.garmin.android.apps.connectmobile.leaderboard.model.b> arrayList2;
        AdHocChallengePlayerDTO adHocChallengePlayerDTO;
        String str;
        List<? extends AdHocChallengePlayerDTO> list;
        String str2;
        String str3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        ?? r14 = this.O0;
        Integer numValueOf = null;
        if (adHocChallengeDTO2 == null || (list = adHocChallengeDTO2.f38001o) == null) {
            arrayList = p13.j0.f134944a;
        } else {
            ArrayList<AdHocChallengePlayerDTO> arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((AdHocChallengePlayerDTO) obj).f38017k) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(p13.y.r(arrayList3, 10));
            for (AdHocChallengePlayerDTO adHocChallengePlayerDTO2 : arrayList3) {
                p3 p3Var = (p3) r14.getValue();
                String str4 = adHocChallengePlayerDTO2.f38007a;
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = p3Var.f120809b.get(str4 != null ? Integer.valueOf(Integer.parseInt(str4)) : null);
                x xVar = x.f37955a;
                if (lVar == null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null || (str2 = profileImageUrls2.f46878g) == null) {
                    str2 = adHocChallengePlayerDTO2.f38012f;
                }
                b12.b bVar = new b12.b(str2, null, null, null, null, 30, null);
                if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (str3 = profileImageUrls.f46879h) == null) {
                    str3 = adHocChallengePlayerDTO2.f38012f;
                }
                b12.b bVar2 = new b12.b(str3, null, null, null, null, 30, null);
                xVar.getClass();
                arrayList.add(x.x(adHocChallengePlayerDTO2, bVar, bVar2));
            }
        }
        this.M0 = arrayList;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.e eVarV7 = v7();
        p3 p3Var2 = (p3) r14.getValue();
        AdHocChallengeDTO adHocChallengeDTO3 = this.f37694z;
        if (adHocChallengeDTO3 != null && (adHocChallengePlayerDTO = adHocChallengeDTO3.f37998l) != null && (str = adHocChallengePlayerDTO.f38007a) != null) {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        }
        eVarV7.f37441f = p3Var2.f120809b.get(numValueOf);
        if (!x.t(this.f37694z) && (adHocChallengeDTO = this.f37694z) != null && (arrayList2 = adHocChallengeDTO.f38002p) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (com.garmin.android.apps.connectmobile.leaderboard.model.b bVar3 : arrayList2) {
                ArrayList arrayList5 = bVar3.f38079c;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    String str5 = (String) p13.h0.b0(arrayList5);
                    for (ot0.a aVar : this.M0) {
                        String str6 = aVar.f133706a;
                        String str7 = aVar.f133712g;
                        if (p005kotlin.jvm.internal.s.g(str6, str5)) {
                            if (TextUtils.isEmpty(str7)) {
                                bVar3.f38081e = aVar.f133713h;
                                break;
                            } else {
                                bVar3.f38081e = str7;
                                break;
                            }
                        }
                    }
                }
                if (bVar3.C() != com.garmin.android.apps.connectmobile.leaderboard.model.t.f38322e) {
                    arrayList4.add(bVar3);
                }
            }
            AdHocChallengeDTO adHocChallengeDTO4 = this.f37694z;
            if (adHocChallengeDTO4 != null) {
                adHocChallengeDTO4.f38002p = arrayList4;
            }
        }
        if (!v7().isEmpty()) {
            v7().clear();
        }
        if (w7()) {
            v7().f37440e = true;
        } else {
            v7().addAll((Collection) this.M0);
            v7().f37440e = false;
        }
    }

    public final void E7(int i14) {
        if (U6(i14)) {
            u6();
            int headerViewsCount = this.f7311e.getHeaderViewsCount();
            com.garmin.android.apps.connectmobile.leaderboard.challenges.e eVarV7 = v7();
            int i15 = i14 - headerViewsCount;
            if (eVarV7.f37438c == null) {
                eVarV7.f37438c = new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = eVarV7.f37438c;
            sparseBooleanArray.getClass();
            boolean z14 = !sparseBooleanArray.get(i15, false);
            SparseBooleanArray sparseBooleanArray2 = eVarV7.f37438c;
            sparseBooleanArray2.getClass();
            sparseBooleanArray2.put(i15, z14);
            v7().notifyDataSetChanged();
            SparseBooleanArray sparseBooleanArray3 = v7().f37438c;
            sparseBooleanArray3.getClass();
            int size = sparseBooleanArray3.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                int iKeyAt = sparseBooleanArray3.keyAt(i17);
                SparseBooleanArray sparseBooleanArray4 = v7().f37438c;
                sparseBooleanArray4.getClass();
                if (sparseBooleanArray4.get(iKeyAt)) {
                    i16++;
                }
            }
            TextView textView = this.f120642w;
            if (textView != null) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String string = getString(R.string.lbl_num_selected);
                string.getClass();
                q6.f.y(new Object[]{Integer.valueOf(i16)}, 1, string, textView);
            }
            MenuItem menuItem = this.K0;
            if (menuItem != null) {
                menuItem.setEnabled(i16 > 0);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        super.I6();
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.N0;
        if (bVar != null) {
            bVar.A6(false);
        }
    }

    @Override // mt0.h2
    public final boolean U6(int i14) {
        u6();
        int headerViewsCount = this.f7311e.getHeaderViewsCount();
        if (i14 >= headerViewsCount) {
            int i15 = i14 - headerViewsCount;
            com.garmin.android.apps.connectmobile.leaderboard.challenges.e eVarV7 = v7();
            eVarV7.getClass();
            if (i15 < eVarV7.getCount()) {
                ot0.a item = v7().getItem(i15);
                if (!(item == null ? false : p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), item.f133706a))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mt0.h2
    public final boolean V6() {
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        if (!p005kotlin.jvm.internal.s.g(strValueOf, adHocChallengeDTO != null ? adHocChallengeDTO.f37992f : null)) {
            return false;
        }
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
        return ((adHocChallengeDTO2 != null ? adHocChallengeDTO2.C() : null) == com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED || x.t(this.f37694z)) ? false : true;
    }

    @Override // mt0.h2
    public final void X6() {
    }

    @Override // mt0.h2
    public final int Y6() {
        return R.menu.challenge_leaderboard_remove_people_menu;
    }

    @Override // mt0.h2
    public final void c7() {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = v7().f37438c;
        int count = v7().getCount();
        for (int i14 = 0; i14 < count; i14++) {
            if (sparseBooleanArray != null && sparseBooleanArray.get(i14, false)) {
                ot0.a item = v7().getItem(i14);
                String str = item != null ? item.f133706a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.N0;
        if (bVar != null) {
            bVar.G6(arrayList);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final void e7(int i14) {
        int i15;
        androidx.lifecycle.j jVarN;
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        String str = adHocChallengeDTO != null ? adHocChallengeDTO.f37993g : null;
        if (adHocChallengeDTO == null || str == null) {
            i7(g3.a.a(g3.f35298f, adHocChallengeDTO == null ? "Challenge DTO is null" : "Challenge uuid is null", null, null, null, 14), i14);
            return;
        }
        if (x.t(adHocChallengeDTO)) {
            fo1.o0 o0VarG7 = g7();
            c2 c2VarS = x.s(adHocChallengeDTO);
            c2VarS.getClass();
            fo1.c2 c2Var = o0VarG7.f72655b;
            c2Var.getClass();
            i15 = i14;
            jVarN = o53.f0.N(new z1(c2Var, c2VarS, str, i15, 6, null));
        } else {
            i15 = i14;
            fo1.o0 o0VarG8 = g7();
            c2 c2Var2 = c2.ADHOC_CHALLENGE;
            c2Var2.getClass();
            fo1.l0 l0Var = o0VarG8.f72654a;
            l0Var.getClass();
            jVarN = o53.f0.N(new fo1.e0(l0Var, c2Var2, str, i15, 6, null));
        }
        dh.b.L(jVarN, this, new e(new ap.b(this, i15, 8)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final ListAdapter f7() {
        D7();
        return v7();
    }

    @Override // lo1.c.a
    public final void k3(ConversationCommentDTO conversationCommentDTO) {
        conversationCommentDTO.getClass();
        String str = conversationCommentDTO.f44547b;
        String str2 = conversationCommentDTO.f44546a;
        String str3 = conversationCommentDTO.f44548c;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            n7();
            return;
        }
        fo1.o0 o0VarG7 = g7();
        str.getClass();
        str2.getClass();
        str3.getClass();
        dh.b.L(o0VarG7.C4(str, str2, str3), this, new e(new ev2.f(this, str, str2, str3, 29)));
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView.b
    public final void m6(Editable editable) {
        p7();
        ConversationCommentDTO conversationCommentDTO = new ConversationCommentDTO();
        conversationCommentDTO.f44555j = editable.toString();
        mo1.d dVar = this.A;
        if (dVar != null) {
            conversationCommentDTO.f44547b = dVar.getUuid();
        }
        fo1.o0 o0VarG7 = g7();
        c2 c2Var = c2.ADHOC_CHALLENGE;
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        adHocChallengeDTO.getClass();
        String str = adHocChallengeDTO.f37993g;
        str.getClass();
        c2Var.getClass();
        fo1.l0 l0Var = o0VarG7.f72654a;
        l0Var.getClass();
        dh.b.L(o53.f0.N(new fo1.i0(l0Var, c2Var, str, conversationCommentDTO, null)), this, new e(new mt0.s(this)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final boolean m7() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, mt0.h2, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C7();
        u6();
        ListView listView = this.f7311e;
        listView.getClass();
        listView.setChoiceMode(1);
        if (V6()) {
            listView.setOnItemLongClickListener(new com.garmin.android.apps.connectmobile.connectiq.m0(this, 3));
        } else {
            listView.setOnLongClickListener(null);
        }
        listView.setOnItemClickListener(new ey.a(this, 2));
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        if (bundleC == null && (bundleC = getArguments()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundleC.getParcelable("ARGS_CHALLENGE", AdHocChallengeDTO.class);
        } else {
            Parcelable parcelable2 = bundleC.getParcelable("ARGS_CHALLENGE");
            if (!(parcelable2 instanceof AdHocChallengeDTO)) {
                parcelable2 = null;
            }
            parcelable = (AdHocChallengeDTO) parcelable2;
        }
        AdHocChallengeDTO adHocChallengeDTO = (AdHocChallengeDTO) parcelable;
        if (adHocChallengeDTO == null) {
            return;
        }
        this.f37694z = adHocChallengeDTO;
        this.F = bundleC.getBoolean("ARGS_FOCUS_ON_COMMENTS");
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, mt0.h2, android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        super.onCreateActionMode(actionMode, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_delete);
        this.K0 = menuItemFindItem;
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setEnabled(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.challenge_leaderboard_3_0, viewGroup, false);
        View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.challenge_details_header_3_0, (ViewGroup) null, false);
        viewInflate2.getClass();
        this.Y = viewInflate2;
        View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.challenge_leaderboard_header_3_0, (ViewGroup) null, false);
        viewInflate3.getClass();
        this.Z = viewInflate3;
        View viewInflate4 = LayoutInflater.from(getContext()).inflate(R.layout.ad_hoc_challenge_leaderboard_locked_header, (ViewGroup) null, false);
        viewInflate4.getClass();
        this.H0 = viewInflate4;
        View viewInflate5 = LayoutInflater.from(getContext()).inflate(R.layout.ad_hoc_challenge_leaderboard_podium_header, (ViewGroup) null, false);
        viewInflate5.getClass();
        this.f37455k0 = viewInflate5;
        View viewInflate6 = LayoutInflater.from(getContext()).inflate(R.layout.ad_hoc_challenge_leaderboard_award_header, (ViewGroup) null, false);
        viewInflate6.getClass();
        this.I0 = viewInflate6;
        return viewInflate;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, mt0.h2, android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        super.onDestroyActionMode(actionMode);
        com.garmin.android.apps.connectmobile.leaderboard.challenges.e eVarV7 = v7();
        eVarV7.getClass();
        SparseBooleanArray sparseBooleanArray = eVarV7.f37438c;
        sparseBooleanArray.getClass();
        sparseBooleanArray.clear();
        eVarV7.notifyDataSetChanged();
        x7(false);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.P0.g("Normal");
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.Q0);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kt0.a aVar = this.P0;
        aVar.g("Block");
        if (!aVar.c()) {
            View view2 = this.J0;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("mSyncNowButton");
                throw null;
            }
            view2.setEnabled(true);
        }
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.Q0);
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        c2 c2Var = c2.ADHOC_CHALLENGE;
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        s1 s1Var = new s1(c2Var, adHocChallengeDTO != null ? adHocChallengeDTO.f37993g : null, null, null, false, false, false, false, 252, null);
        y1 f189591b = getF189591b();
        f189591b.getClass();
        this.P = (fo1.o0) new x1(f189591b, s1Var, null, 4, null).b(p005kotlin.jvm.internal.s0.f105811a.b(fo1.o0.class));
        u6();
        ListView listView = this.f7311e;
        View view3 = this.Y;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mTitleHeaderView");
            throw null;
        }
        listView.addHeaderView(view3, null, false);
        View view4 = this.Z;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mCurrentLeaderHeaderView");
            throw null;
        }
        listView.addHeaderView(view4, null, false);
        View view5 = this.H0;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mLockedHeaderView");
            throw null;
        }
        listView.addHeaderView(view5, null, false);
        View view6 = this.f37455k0;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("mPodiumHeaderView");
            throw null;
        }
        listView.addHeaderView(view6, null, false);
        View view7 = this.I0;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("mAwardsHeaderView");
            throw null;
        }
        listView.addHeaderView(view7, null, false);
        View view8 = this.H0;
        if (view8 == null) {
            p005kotlin.jvm.internal.s.m("mLockedHeaderView");
            throw null;
        }
        View viewFindViewById = view8.findViewById(R.id.leaderboard_sync_now);
        viewFindViewById.getClass();
        this.J0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new js0.d(this, 26));
    }

    public final com.garmin.android.apps.connectmobile.leaderboard.challenges.e v7() {
        return (com.garmin.android.apps.connectmobile.leaderboard.challenges.e) this.L0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c A[RETURN] */
    public final boolean w7() {
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        if (adHocChallengeDTO != null && adHocChallengeDTO.C() != com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED && (com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g || com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38312h)) {
            AdHocChallengeDTO adHocChallengeDTO2 = this.f37694z;
            AdHocChallengePlayerDTO adHocChallengePlayerDTO = adHocChallengeDTO2 != null ? adHocChallengeDTO2.f37998l : null;
            DateTime dateTimeN = !TextUtils.isEmpty(adHocChallengeDTO.f37994h) ? c22.j0.N(adHocChallengeDTO.f37994h, false) : null;
            Long lValueOf = dateTimeN != null ? Long.valueOf(dateTimeN.getMillis()) : null;
            if (adHocChallengePlayerDTO != null && lValueOf != null) {
                long millis = DateTime.now().getMillis();
                long jLongValue = millis - lValueOf.longValue();
                String str = adHocChallengePlayerDTO.f38009c;
                if (str != null) {
                    if (millis - new DateTime(TextUtils.isEmpty(str) ? null : c22.j0.N(adHocChallengePlayerDTO.f38009c, true)).getMillis() >= 86400000 && jLongValue >= 43200000) {
                        return true;
                    }
                } else if (jLongValue >= 43200000) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void x7(boolean z14) {
        if (!z14) {
            v7().f37437b = false;
            v7().f37439d = true;
        } else {
            v7().f37437b = true;
            v7().f37439d = false;
            requireActivity().startActionMode(this);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f$a;", "", "<init>", "()V", "", "INVALID_POSITION", "I", "", "TAG", "Ljava/lang/String;", "ARGS_CHALLENGE", "TAG_SYNC_NOW_HELP", "TAG_ADD_DEVICE", "INVALID_DEVICE_ID", "", "INIT_SYNC_CRITERION_IN_MILLIS", "J", "LAST_SYNC_CRITERION_IN_MILLIS", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
