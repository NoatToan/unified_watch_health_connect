package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeInviteDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mt0.p3;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.i3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/b;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f37321p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f37322q = b.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f37323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f37324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f37325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Menu f37326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdHocChallengeDTO f37328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.leaderboard.model.d> f37329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e1 f37333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b.u f37334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f37335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f37337o;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0667b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f37340c;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37338a = iArr;
            int[] iArr2 = new int[com.garmin.android.apps.connectmobile.leaderboard.model.v.values().length];
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.v.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.v.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f37339b = iArr2;
            int[] iArr3 = new int[com.garmin.android.apps.connectmobile.leaderboard.model.s.values().length];
            try {
                iArr3[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f37340c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/b$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            b.w6(b.this);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/b$d", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.core.view.s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.challenge_details, menu);
            b bVar = b.this;
            bVar.f37326d = menu;
            bVar.M6();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v21, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v36, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            ?? arrayList;
            ?? arrayList2;
            List<? extends AdHocChallengePlayerDTO> list;
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            final b bVar = b.this;
            final int i14 = 1;
            if (itemId == 16908332) {
                b.w6(bVar);
                return true;
            }
            final int i15 = 0;
            ?? r14 = 0;
            if (itemId == R.id.challenge_rules) {
                ChallengeRulesActivity.a aVar = ChallengeRulesActivity.f37225j;
                Context contextRequireContext = bVar.requireContext();
                AdHocChallengeDTO adHocChallengeDTO = bVar.f37328f;
                adHocChallengeDTO.getClass();
                aVar.getClass();
                if (contextRequireContext != null) {
                    Intent intent = new Intent(contextRequireContext, (Class<?>) ChallengeRulesActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("ad_hoc_challenge_start_date", !TextUtils.isEmpty(adHocChallengeDTO.f37994h) ? c22.j0.N(adHocChallengeDTO.f37994h, false) : null);
                    bundle.putSerializable("ad_hoc_challenge_end_date", TextUtils.isEmpty(adHocChallengeDTO.f37995i) ? null : c22.j0.N(adHocChallengeDTO.f37995i, false));
                    bundle.putInt("ad_hoc_challenge_activity_type_id", adHocChallengeDTO.f37989c);
                    bundle.putBoolean("GCM_challenge_is_vivokid", x.t(adHocChallengeDTO));
                    intent.putExtras(bundle);
                    contextRequireContext.startActivity(intent);
                    return true;
                }
            } else {
                if (itemId == R.id.challenge_invite_people) {
                    List<com.garmin.android.apps.connectmobile.leaderboard.model.d> list2 = bVar.f37329g;
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            Integer numA = ((com.garmin.android.apps.connectmobile.leaderboard.model.d) it.next()).getUserProfileId();
                            Long lValueOf = numA != null ? Long.valueOf(numA.intValue()) : null;
                            if (lValueOf != null) {
                                arrayList.add(lValueOf);
                            }
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    AdHocChallengeDTO adHocChallengeDTO2 = bVar.f37328f;
                    if (adHocChallengeDTO2 == null || (list = adHocChallengeDTO2.f38001o) == null) {
                        arrayList2 = p13.j0.f134944a;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : list) {
                            AdHocChallengePlayerDTO adHocChallengePlayerDTO = (AdHocChallengePlayerDTO) obj;
                            if (adHocChallengePlayerDTO.f38017k && !p005kotlin.jvm.internal.s.g(adHocChallengePlayerDTO.f38007a, bVar.E6().U1())) {
                                arrayList3.add(obj);
                            }
                        }
                        arrayList2 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            String str = ((AdHocChallengePlayerDTO) it3.next()).f38007a;
                            Long lValueOf2 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                            if (lValueOf2 != null) {
                                arrayList2.add(lValueOf2);
                            }
                        }
                    }
                    AdHocChallengeInviteFollowersActivity.a aVar2 = AdHocChallengeInviteFollowersActivity.f37174c;
                    Context contextRequireContext2 = bVar.requireContext();
                    contextRequireContext2.getClass();
                    ArrayList arrayListC0 = p13.h0.C0((Collection) arrayList, (Iterable) arrayList2);
                    AdHocChallengeDTO adHocChallengeDTO3 = bVar.f37328f;
                    int i16 = adHocChallengeDTO3 != null ? adHocChallengeDTO3.f37999m + adHocChallengeDTO3.f38000n : 0;
                    com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = adHocChallengeDTO3 != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO3.f37989c) : null;
                    aVar2.getClass();
                    Intent intent2 = new Intent(contextRequireContext2, (Class<?>) AdHocChallengeInviteFollowersActivity.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLongArray("EXTRA_SELECTED_FOLLOWER_USER_IDS", p13.h0.c1(arrayListC0));
                    if (!TextUtils.isEmpty(null)) {
                        bundle2.putString("GCM_challenge_invite_menu_item_text", null);
                    }
                    bundle2.putInt("GCM_challenge_player_count", i16);
                    bundle2.putBoolean("EXTRA_SELECTED_FOLLOWERS_READ_ONLY", true);
                    bundle2.putSerializable("GCM_challenge_activity_type", sVarB);
                    bundle2.putBoolean("GCM_challenge_is_within_multiple_steps", false);
                    com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent2, bundle2);
                    bVar.startActivityForResult(intent2, 3);
                    return true;
                }
                if (itemId == R.id.challenge_rename) {
                    a aVar3 = b.f37321p;
                    androidx.fragment.app.m activity = bVar.getActivity();
                    if (activity != null) {
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.c.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.c.f37365h;
                        AdHocChallengeDTO adHocChallengeDTO4 = bVar.f37328f;
                        adHocChallengeDTO4.getClass();
                        aVar4.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.c cVar = new com.garmin.android.apps.connectmobile.leaderboard.challenges.c(r14 == true ? 1 : 0);
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("Challenge_DTO", adHocChallengeDTO4);
                        cVar.setArguments(bundle3);
                        androidx.fragment.app.v supportFragmentManager = activity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar5.v(bVar);
                        aVar5.j(R.id.content_frame, cVar, "Rename", 1);
                        aVar5.d(null);
                        aVar5.e();
                        return true;
                    }
                } else {
                    if (itemId == R.id.challenge_delete) {
                        a aVar6 = b.f37321p;
                        bVar.getClass();
                        q1.b bVar2 = q1.f41066b;
                        String string = bVar.getString(R.string.msg_delete_challenge);
                        string.getClass();
                        q1.a aVar7 = new q1.a() { // from class: mt0.c
                            @Override // com.garmin.android.apps.connectmobile.q1.a
                            public final void g(boolean z14) {
                                String str2;
                                String str3;
                                int i17 = i15;
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar3 = bVar;
                                switch (i17) {
                                    case 0:
                                        if (!z14) {
                                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                                            break;
                                        } else {
                                            AdHocChallengeDTO adHocChallengeDTO5 = bVar3.f37328f;
                                            if (adHocChallengeDTO5 != null && (str2 = adHocChallengeDTO5.f37993g) != null) {
                                                q qVarC6 = bVar3.C6();
                                                xy2.b.K(qVarC6, new i(qVarC6, str2, null)).f(bVar3.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.b.e(new b(bVar3, 2)));
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        if (!z14) {
                                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar9 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                                            break;
                                        } else {
                                            AdHocChallengeDTO adHocChallengeDTO6 = bVar3.f37328f;
                                            if (adHocChallengeDTO6 != null && (str3 = adHocChallengeDTO6.f37993g) != null) {
                                                boolean zT = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.t(adHocChallengeDTO6);
                                                String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                                                q qVarC7 = bVar3.C6();
                                                strValueOf.getClass();
                                                xy2.b.K(qVarC7, new m(qVarC7, str3, strValueOf, zT, null)).f(bVar3.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.b.e(new b(bVar3, 1)));
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                        bVar2.getClass();
                        q1 q1VarA = q1.b.a(R.string.lbl_delete_challenge, string, R.string.lbl_delete, R.string.lbl_cancel, aVar7);
                        androidx.fragment.app.v childFragmentManager = bVar.getChildFragmentManager();
                        childFragmentManager.getClass();
                        q1VarA.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                        return true;
                    }
                    if (itemId == R.id.challenge_leave) {
                        a aVar8 = b.f37321p;
                        bVar.getClass();
                        q1.b bVar3 = q1.f41066b;
                        String string2 = bVar.getString(R.string.social_leave_challenge_msg);
                        string2.getClass();
                        q1.a aVar9 = new q1.a() { // from class: mt0.c
                            @Override // com.garmin.android.apps.connectmobile.q1.a
                            public final void g(boolean z14) {
                                String str2;
                                String str3;
                                int i17 = i14;
                                com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar4 = bVar;
                                switch (i17) {
                                    case 0:
                                        if (!z14) {
                                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar10 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                                            break;
                                        } else {
                                            AdHocChallengeDTO adHocChallengeDTO5 = bVar4.f37328f;
                                            if (adHocChallengeDTO5 != null && (str2 = adHocChallengeDTO5.f37993g) != null) {
                                                q qVarC6 = bVar4.C6();
                                                xy2.b.K(qVarC6, new i(qVarC6, str2, null)).f(bVar4.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.b.e(new b(bVar4, 2)));
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        if (!z14) {
                                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar11 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                                            break;
                                        } else {
                                            AdHocChallengeDTO adHocChallengeDTO6 = bVar4.f37328f;
                                            if (adHocChallengeDTO6 != null && (str3 = adHocChallengeDTO6.f37993g) != null) {
                                                boolean zT = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.t(adHocChallengeDTO6);
                                                String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                                                q qVarC7 = bVar4.C6();
                                                strValueOf.getClass();
                                                xy2.b.K(qVarC7, new m(qVarC7, str3, strValueOf, zT, null)).f(bVar4.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.b.e(new b(bVar4, 1)));
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                        bVar3.getClass();
                        q1 q1VarA2 = q1.b.a(R.string.social_leave_challenge, string2, R.string.lbl_leave, R.string.lbl_cancel, aVar9);
                        androidx.fragment.app.v childFragmentManager2 = bVar.getChildFragmentManager();
                        childFragmentManager2.getClass();
                        q1VarA2.v6(childFragmentManager2, null);
                        return true;
                    }
                    if (itemId != R.id.challenge_remove_people) {
                        return false;
                    }
                    a aVar10 = b.f37321p;
                    Fragment fragmentF = bVar.getChildFragmentManager().F(R.id.challenge_details_fragment);
                    if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.f) {
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragmentF;
                        if (!fVar.w7()) {
                            fVar.x7(true);
                            fVar.E7(-1);
                            return true;
                        }
                        bVar.f37332j = true;
                        bVar.T6();
                        bVar.M6();
                        return true;
                    }
                    if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.k) {
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.k) fragmentF;
                        kVar.v7(true);
                        kVar.z7(-1);
                    }
                }
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37343a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f37343a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37343a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37343a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37344a;

        public f(Fragment fragment) {
            this.f37344a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37344a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<p3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37349e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37345a = fragment;
            this.f37346b = qualifier;
            this.f37347c = aVar;
            this.f37348d = aVar2;
            this.f37349e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.p3] */
        @Override // e23.a
        public final p3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37347c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37345a;
            e23.a aVar = this.f37348d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(p3.class), viewModelStore, null, defaultViewModelCreationExtras, this.f37346b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37349e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37350a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f37350a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37350a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37352b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37351a = aVar;
            this.f37352b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37351a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37352b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f37353a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37353a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f37354a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37354a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class l extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37355a = aVar;
            this.f37356b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37355a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37356b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class m extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f37357a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37357a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f37323a = new w1(t0Var.b(i3.class), new h(this), new j(this), new i(null, this));
        this.f37324b = new w1(t0Var.b(mt0.q.class), new k(this), new m(this), new l(null, this));
        this.f37325c = o13.m.a(o13.n.NONE, new g(this, null, new f(this), null, null));
        this.f37335m = o13.m.b(new mh1.q(10));
        this.f37337o = new c();
    }

    public static void S6(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.challenge_invite_people);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z14);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.challenge_rules);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(z15);
        }
        MenuItem menuItemFindItem3 = menu.findItem(R.id.challenge_rename);
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setVisible(z16);
        }
        MenuItem menuItemFindItem4 = menu.findItem(R.id.challenge_remove_people);
        if (menuItemFindItem4 != null) {
            menuItemFindItem4.setVisible(z17);
        }
        MenuItem menuItemFindItem5 = menu.findItem(R.id.challenge_leave);
        if (menuItemFindItem5 != null) {
            menuItemFindItem5.setVisible(z18);
        }
        MenuItem menuItemFindItem6 = menu.findItem(R.id.challenge_delete);
        if (menuItemFindItem6 != null) {
            menuItemFindItem6.setVisible(z19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    public static final ArrayList v6(b bVar) {
        Iterable iterableB1;
        AdHocChallengePlayerDTO adHocChallengePlayerDTO;
        String str;
        List<? extends AdHocChallengePlayerDTO> list;
        AdHocChallengeDTO adHocChallengeDTO = bVar.f37328f;
        if (adHocChallengeDTO == null || (list = adHocChallengeDTO.f38001o) == null) {
            iterableB1 = p13.j0.f134944a;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((AdHocChallengePlayerDTO) it.next()).f38007a;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            iterableB1 = p13.h0.b1(p13.h0.f1(arrayList));
            if (iterableB1 == null) {
                iterableB1 = p13.j0.f134944a;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(p13.y.r(iterableB1, 10));
        Iterator it3 = iterableB1.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(Integer.parseInt((String) it3.next())));
        }
        arrayList2.addAll(arrayList3);
        AdHocChallengeDTO adHocChallengeDTO2 = bVar.f37328f;
        if (adHocChallengeDTO2 != null && (adHocChallengePlayerDTO = adHocChallengeDTO2.f37998l) != null && (str = adHocChallengePlayerDTO.f38007a) != null) {
            int i14 = Integer.parseInt(str);
            if (!arrayList2.contains(Integer.valueOf(i14))) {
                arrayList2.add(Integer.valueOf(i14));
            }
        }
        return arrayList2;
    }

    public static final void w6(b bVar) {
        if (bVar.f37332j) {
            bVar.f37332j = false;
            bVar.K6();
            bVar.M6();
            return;
        }
        if (!bVar.f37330h) {
            bVar.f37337o.f(false);
            b.u uVar = bVar.f37334l;
            if (uVar != null) {
                uVar.d();
                return;
            } else {
                p005kotlin.jvm.internal.s.m("onBackPressedDispatcher");
                throw null;
            }
        }
        if (bVar.F6()) {
            boolean zT = x.t(bVar.f37328f);
            mt0.q qVarC6 = bVar.C6();
            String str = bVar.f37327e;
            str.getClass();
            xy2.b.K(qVarC6, new mt0.h(qVarC6, str, zT, null)).f(bVar.getViewLifecycleOwner(), new e(new mt0.b(bVar, 6)));
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.CHALLENGES;
        aVar.getClass();
        i2.a.f(a2Var, f37322q, "declineChallenge() with null invitationId");
        Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
        bVar.y6(null);
    }

    public final void A6(boolean z14) {
        boolean zT = x.t(this.f37328f);
        AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
        adHocChallengeDTO.getClass();
        z6(adHocChallengeDTO.f37993g, zT, z14);
    }

    public final mt0.q C6() {
        return (mt0.q) this.f37324b.getValue();
    }

    public final f12.l E6() {
        return (f12.l) this.f37335m.getValue();
    }

    public final boolean F6() {
        return !TextUtils.isEmpty(this.f37327e);
    }

    public final void G6(ArrayList arrayList) {
        String str;
        AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
        if (adHocChallengeDTO == null || (str = adHocChallengeDTO.f37993g) == null) {
            return;
        }
        mt0.q qVarC6 = C6();
        xy2.b.K(qVarC6, new mt0.n(qVarC6, str, arrayList, null)).f(getViewLifecycleOwner(), new e(new mt0.b(this, 3)));
    }

    public final void H6() {
        AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
        com.garmin.android.apps.connectmobile.leaderboard.model.v vVarC = adHocChallengeDTO != null ? adHocChallengeDTO.C() : null;
        int i14 = vVarC == null ? -1 : C0667b.f37339b[vVarC.ordinal()];
        if (i14 == 1) {
            T6();
            return;
        }
        if (i14 == 2 || i14 == 3 || i14 == 4) {
            if (F6()) {
                T6();
                return;
            } else {
                K6();
                return;
            }
        }
        if (i14 != 5) {
            T6();
        } else {
            K6();
        }
    }

    public final void I6() {
        androidx.fragment.app.m activity;
        String string;
        this.f37332j = false;
        M6();
        H6();
        AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
        adHocChallengeDTO.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVarB = com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c);
        if (sVarB == null) {
            return;
        }
        boolean zV = x.v();
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar = com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k;
        boolean z14 = sVarB == sVar || sVarB == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l;
        boolean z15 = sVarB == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38311g || sVarB == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38308d || sVarB == sVar || sVarB == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38316l;
        if (!(zV ^ z14) || !z15 || this.f37336n || (activity = getActivity()) == null || activity.isFinishing()) {
            return;
        }
        this.f37336n = true;
        int i14 = C0667b.f37340c[sVarB.ordinal()];
        if (i14 == 1) {
            string = requireContext().getString(R.string.social_challenge_wrong_activity_type_message_steps);
            string.getClass();
        } else if (i14 == 2) {
            string = requireContext().getString(R.string.social_challenge_wrong_activity_type_message_running);
            string.getClass();
        } else if (i14 == 3) {
            string = requireContext().getString(R.string.social_challenge_wrong_activity_type_message_pushes);
            string.getClass();
        } else if (i14 != 4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.CHALLENGES;
            aVar.getClass();
            i2.a.b(a2Var, f37322q, "Unsupported challengea activity type for banner");
            string = "";
        } else {
            string = requireContext().getString(R.string.social_challenge_wrong_activity_type_message_parasports);
            string.getClass();
        }
        com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(com.garmin.android.apps.connectmobile.x.f49750f, null, string, null, 0, 61);
        androidx.fragment.app.v supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.notification_layout, xVarA, null);
        aVar2.e();
    }

    public final void J6() {
        if (this.f37327e != null) {
            AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
            adHocChallengeDTO.getClass();
            AdHocChallengePlayerDTO adHocChallengePlayerDTO = adHocChallengeDTO.f37998l;
            if (adHocChallengePlayerDTO == null || !adHocChallengePlayerDTO.f38017k) {
                return;
            }
            this.f37327e = null;
            this.f37330h = false;
            requireActivity().setResult(-1);
        }
    }

    public final void K6() {
        Fragment fragmentF = getChildFragmentManager().F(R.id.challenge_details_fragment);
        if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.f) {
            com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragmentF;
            AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
            if (adHocChallengeDTO == null) {
                fVar.F6();
                return;
            }
            fVar.f37694z = adHocChallengeDTO;
            Bundle arguments = fVar.getArguments();
            if (arguments != null) {
                arguments.putParcelable("ARGS_CHALLENGE", fVar.f37694z);
            }
            if (arguments != null) {
                l2.f37135b.getClass();
                l2.a.c(fVar, arguments);
            }
            fVar.D7();
            fVar.C7();
            fVar.d7();
            return;
        }
        com.garmin.android.apps.connectmobile.leaderboard.challenges.f.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.R0;
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37328f;
        boolean z14 = this.f37331i;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar2 = new com.garmin.android.apps.connectmobile.leaderboard.challenges.f();
        Bundle bundle = new Bundle();
        if (adHocChallengeDTO2 != null) {
            bundle.putParcelable("ARGS_CHALLENGE", adHocChallengeDTO2);
            bundle.putBoolean("ARGS_FOCUS_ON_COMMENTS", z14);
        }
        l2.f37135b.getClass();
        l2.a.c(fVar2, bundle);
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
        aVar2.l(R.id.challenge_details_fragment, fVar2, null);
        aVar2.e();
        this.f37331i = false;
    }

    public final void M6() {
        Menu menu;
        AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
        if (adHocChallengeDTO == null || (menu = this.f37326d) == null) {
            return;
        }
        String str = adHocChallengeDTO.f37992f;
        if (str == null) {
            S6(false, false, false, false, false, false, menu);
            return;
        }
        if (p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), str)) {
            com.garmin.android.apps.connectmobile.leaderboard.model.v vVarC = adHocChallengeDTO.C();
            if (vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED || vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED || vVarC == com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED) {
                S6(false, true, false, false, false, false, menu);
                return;
            }
            if (x.t(adHocChallengeDTO)) {
                S6(false, true, false, false, false, false, menu);
                return;
            } else if (this.f37332j) {
                S6(false, false, false, false, false, false, menu);
                return;
            } else {
                S6(true, true, true, true, false, true, menu);
                return;
            }
        }
        AdHocChallengePlayerDTO adHocChallengePlayerDTO = adHocChallengeDTO.f37998l;
        if (adHocChallengePlayerDTO == null) {
            S6(false, true, false, false, false, false, menu);
            return;
        }
        if (!adHocChallengePlayerDTO.f38017k) {
            S6(false, true, false, false, false, false, menu);
            return;
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.v vVarC2 = adHocChallengeDTO.C();
        if (vVarC2 == com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED || vVarC2 == com.garmin.android.apps.connectmobile.leaderboard.model.v.STOPPED || vVarC2 == com.garmin.android.apps.connectmobile.leaderboard.model.v.LOCKED) {
            S6(false, true, false, false, false, false, menu);
        } else if (x.t(adHocChallengeDTO)) {
            S6(false, true, false, false, true, false, menu);
        } else {
            S6(true, true, false, false, true, false, menu);
        }
    }

    public final void T6() {
        Fragment fragmentF = getChildFragmentManager().F(R.id.challenge_details_fragment);
        if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.k) {
            com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.k) fragmentF;
            AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
            boolean zF6 = F6();
            if (adHocChallengeDTO != null) {
                kVar.f37694z = adHocChallengeDTO;
                kVar.I0 = zF6;
                Bundle arguments = kVar.getArguments();
                if (arguments != null) {
                    arguments.putParcelable("ARGS_CHALLENGE", kVar.f37694z);
                }
                Bundle arguments2 = kVar.getArguments();
                if (arguments2 != null) {
                    arguments2.putBoolean("ARGS_SHOW_INVITATION", kVar.I0);
                }
                Bundle arguments3 = kVar.getArguments();
                if (arguments3 != null) {
                    l2.f37135b.getClass();
                    l2.a.c(kVar, arguments3);
                }
                kVar.x7();
                kVar.w7();
                kVar.d7();
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.leaderboard.challenges.k.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.O0;
        AdHocChallengeDTO adHocChallengeDTO2 = this.f37328f;
        boolean zF7 = F6();
        boolean z14 = this.f37331i;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar2 = new com.garmin.android.apps.connectmobile.leaderboard.challenges.k();
        Bundle bundle = new Bundle();
        if (adHocChallengeDTO2 != null) {
            bundle.putParcelable("ARGS_CHALLENGE", adHocChallengeDTO2);
            bundle.putBoolean("ARGS_SHOW_INVITATION", zF7);
            bundle.putBoolean("ARGS_FOCUS_ON_COMMENTS", z14);
        }
        l2.f37135b.getClass();
        l2.a.c(kVar2, bundle);
        kVar2.M0 = this;
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
        aVar2.l(R.id.challenge_details_fragment, kVar2, null);
        aVar2.e();
        this.f37331i = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 3 && i15 == -1) {
            g22.e.l(this);
            l2.f37135b.getClass();
            Bundle bundleA = l2.a.a(intent);
            if (bundleA != null) {
                long[] longArray = bundleA.getLongArray("GCM_challenge_selected_player_user_ids");
                List<Long> listH0 = longArray != null ? p13.u.h0(longArray) : null;
                if (listH0 != null && !listH0.isEmpty()) {
                    AdHocChallengeInviteDTO adHocChallengeInviteDTO = new AdHocChallengeInviteDTO();
                    AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
                    adHocChallengeDTO.getClass();
                    adHocChallengeInviteDTO.f38003a = adHocChallengeDTO.f37993g;
                    adHocChallengeInviteDTO.f38004b = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                    ArrayList arrayList = new ArrayList(p13.y.r(listH0, 10));
                    Iterator<T> it = listH0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).longValue()));
                    }
                    adHocChallengeInviteDTO.f38005c = arrayList;
                    mt0.q qVarC6 = C6();
                    xy2.b.K(qVarC6, new mt0.p(qVarC6, adHocChallengeInviteDTO, null)).f(getViewLifecycleOwner(), new e(new mt0.b(this, 5)));
                }
            }
        } else if (i14 == 4 && i15 == -1) {
            u6();
        }
        super.onActivityResult(i14, i15, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f37333k = (e1) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.f(a2.CHALLENGES, f37322q, context + " must implement FragmentFinishListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        fragment.getClass();
        super.onAttachFragment(fragment);
        if (fragment instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.f) {
            ((com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragment).N0 = this;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        this.f37334l = onBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.b(this.f37337o, this);
        } else {
            p005kotlin.jvm.internal.s.m("onBackPressedDispatcher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.challenge_details_3_0, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        boolean z14;
        String string;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new d(), androidx.lifecycle.b0.b.CREATED);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("GCM_challenge_uuid");
            z14 = arguments.getBoolean("GCM_challenge_is_vivokid");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("GCM_ad_hoc_challenge", AdHocChallengeDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("GCM_ad_hoc_challenge");
                if (!(parcelable2 instanceof AdHocChallengeDTO)) {
                    parcelable2 = null;
                }
                parcelable = (AdHocChallengeDTO) parcelable2;
            }
            this.f37328f = (AdHocChallengeDTO) parcelable;
            this.f37327e = arguments.getString("GCM_challenge_invitation_id");
            this.f37331i = arguments.getBoolean("GCM_challenge_focus_on_comments");
        } else {
            z14 = false;
            string = null;
        }
        AdHocChallengeDTO adHocChallengeDTO = this.f37328f;
        if (adHocChallengeDTO == null) {
            if (string == null) {
                Toast.makeText(requireContext(), R.string.txt_error_occurred, 0).show();
                y6(null);
            } else {
                AdHocChallengeDTO adHocChallengeDTO2 = new AdHocChallengeDTO();
                adHocChallengeDTO2.f37993g = string;
                this.f37328f = adHocChallengeDTO2;
                z6(string, z14, true);
            }
        } else if (adHocChallengeDTO.f37998l == null) {
            z6(adHocChallengeDTO.f37993g, z14, true);
        } else {
            I6();
        }
        y0<String> y0Var = C6().f120815b;
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new e(new mt0.b(this, 4)));
    }

    public final void u6() {
        if (F6()) {
            boolean zT = x.t(this.f37328f);
            mt0.q qVarC6 = C6();
            String str = this.f37327e;
            str.getClass();
            xy2.b.K(qVarC6, new mt0.g(qVarC6, str, zT, null)).f(getViewLifecycleOwner(), new e(new mt0.b(this, 0)));
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.CHALLENGES;
        aVar.getClass();
        i2.a.f(a2Var, f37322q, "acceptChallenge() with null invitationId");
        Toast.makeText(requireContext(), R.string.txt_error_occurred, 0).show();
        y6(null);
    }

    public final void y6(Integer num) {
        Intent intent = num == null ? null : new Intent();
        e1 e1Var = this.f37333k;
        if (e1Var != null) {
            e1Var.onFragmentFinished(num, intent);
        } else {
            p005kotlin.jvm.internal.s.m("mFragmentFinishListener");
            throw null;
        }
    }

    public final void z6(String str, boolean z14, final boolean z15) {
        if (str != null) {
            if (z14) {
                String strB = c22.j0.b(DateTime.now(), "yyyy-MM-dd", null);
                if (strB != null) {
                    mt0.q qVarC6 = C6();
                    final int i14 = 0;
                    xy2.b.K(qVarC6, new mt0.l(qVarC6, str, strB, null)).f(getViewLifecycleOwner(), new e(new e23.l() { // from class: mt0.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            String str2;
                            int i15 = i14;
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this;
                            boolean z16 = z15;
                            switch (i15) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                                    g3Var.getClass();
                                    fw.p pVar = g3Var.f35300a;
                                    AdHocChallengeDTO adHocChallengeDTO = (AdHocChallengeDTO) g3Var.f35301b;
                                    int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[pVar.ordinal()];
                                    if (i16 != 1) {
                                        if (i16 == 2) {
                                            bVar.f37328f = adHocChallengeDTO;
                                            ge1.b.T(g22.f.b(bVar), null, null, new f(bVar, null), 3);
                                        } else {
                                            if (i16 != 3) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            g22.e.f(bVar);
                                            bVar.J6();
                                            LeaderboardActivity.a aVar2 = LeaderboardActivity.f37145i;
                                            Context contextRequireContext = bVar.requireContext();
                                            aVar2.getClass();
                                            Intent intentA = LeaderboardActivity.a.a(contextRequireContext);
                                            intentA.putExtra("EXTRA_VIEW_DETAIL_RESULT", 701);
                                            intentA.setFlags(67108864);
                                            bVar.startActivity(intentA);
                                            bVar.y6(null);
                                        }
                                    } else if (z16) {
                                        g22.e.l(bVar);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    o13.p pVar2 = (o13.p) obj;
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                                    pVar2.getClass();
                                    com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) pVar2.f128594a;
                                    Integer num = (Integer) pVar2.f128595b;
                                    int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var2.f35300a.ordinal()];
                                    if (i17 != 1) {
                                        if (i17 == 2) {
                                            AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) g3Var2.f35301b;
                                            if (adHocChallengeDTO2 != null) {
                                                bVar.f37328f = adHocChallengeDTO2;
                                                str2 = adHocChallengeDTO2.f37993g;
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                q qVarC7 = bVar.C6();
                                                xy2.b.K(qVarC7, new j(qVarC7, str2, null)).f(bVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.b.e(new b(bVar, 7)));
                                            }
                                        } else {
                                            if (i17 != 3) {
                                                lc.u0.r();
                                                return null;
                                            }
                                            g22.e.f(bVar);
                                            if (num == null || !(num.intValue() == 400 || num.intValue() == 403 || num.intValue() == 404 || num.intValue() == 410)) {
                                                Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
                                                bVar.J6();
                                                AdHocChallengeDTO adHocChallengeDTO3 = bVar.f37328f;
                                                if (adHocChallengeDTO3 == null || TextUtils.isEmpty(adHocChallengeDTO3.f37993g) || adHocChallengeDTO3.f37994h == null || adHocChallengeDTO3.f37995i == null) {
                                                    bVar.y6(null);
                                                } else {
                                                    Fragment fragmentF = bVar.getChildFragmentManager().F(R.id.challenge_details_fragment);
                                                    if (fragmentF != null) {
                                                        if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.k) {
                                                            bVar.F6();
                                                        } else if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.f) {
                                                            ((com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragmentF).F6();
                                                        }
                                                    }
                                                }
                                            } else {
                                                LeaderboardActivity.a aVar4 = LeaderboardActivity.f37145i;
                                                Context contextRequireContext2 = bVar.requireContext();
                                                aVar4.getClass();
                                                Intent intentA2 = LeaderboardActivity.a.a(contextRequireContext2);
                                                intentA2.putExtra("EXTRA_VIEW_DETAIL_RESULT", 701);
                                                intentA2.setFlags(67108864);
                                                bVar.startActivity(intentA2);
                                                bVar.y6(null);
                                            }
                                        }
                                    } else if (z16) {
                                        g22.e.l(bVar);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }));
                    return;
                }
                return;
            }
            mt0.q qVarC7 = C6();
            y0 y0Var = new y0();
            w9.a aVarA = v1.a(qVarC7);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new mt0.k(y0Var, qVarC7, str, null), 2);
            final int i15 = 1;
            y0Var.f(getViewLifecycleOwner(), new e(new e23.l() { // from class: mt0.d
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    String str2;
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this;
                    boolean z16 = z15;
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                            g3Var.getClass();
                            fw.p pVar = g3Var.f35300a;
                            AdHocChallengeDTO adHocChallengeDTO = (AdHocChallengeDTO) g3Var.f35301b;
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[pVar.ordinal()];
                            if (i17 != 1) {
                                if (i17 == 2) {
                                    bVar.f37328f = adHocChallengeDTO;
                                    ge1.b.T(g22.f.b(bVar), null, null, new f(bVar, null), 3);
                                } else {
                                    if (i17 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    g22.e.f(bVar);
                                    bVar.J6();
                                    LeaderboardActivity.a aVar2 = LeaderboardActivity.f37145i;
                                    Context contextRequireContext = bVar.requireContext();
                                    aVar2.getClass();
                                    Intent intentA = LeaderboardActivity.a.a(contextRequireContext);
                                    intentA.putExtra("EXTRA_VIEW_DETAIL_RESULT", 701);
                                    intentA.setFlags(67108864);
                                    bVar.startActivity(intentA);
                                    bVar.y6(null);
                                }
                            } else if (z16) {
                                g22.e.l(bVar);
                            }
                            return Unit.INSTANCE;
                        default:
                            o13.p pVar2 = (o13.p) obj;
                            com.garmin.android.apps.connectmobile.leaderboard.challenges.b.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.f37321p;
                            pVar2.getClass();
                            com.garmin.android.apps.connectmobile.g3 g3Var2 = (com.garmin.android.apps.connectmobile.g3) pVar2.f128594a;
                            Integer num = (Integer) pVar2.f128595b;
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.b.C0667b.f37338a[g3Var2.f35300a.ordinal()];
                            if (i18 != 1) {
                                if (i18 == 2) {
                                    AdHocChallengeDTO adHocChallengeDTO2 = (AdHocChallengeDTO) g3Var2.f35301b;
                                    if (adHocChallengeDTO2 != null) {
                                        bVar.f37328f = adHocChallengeDTO2;
                                        str2 = adHocChallengeDTO2.f37993g;
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        q qVarC8 = bVar.C6();
                                        xy2.b.K(qVarC8, new j(qVarC8, str2, null)).f(bVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.b.e(new b(bVar, 7)));
                                    }
                                } else {
                                    if (i18 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    g22.e.f(bVar);
                                    if (num == null || !(num.intValue() == 400 || num.intValue() == 403 || num.intValue() == 404 || num.intValue() == 410)) {
                                        Toast.makeText(bVar.requireContext(), R.string.txt_error_occurred, 0).show();
                                        bVar.J6();
                                        AdHocChallengeDTO adHocChallengeDTO3 = bVar.f37328f;
                                        if (adHocChallengeDTO3 == null || TextUtils.isEmpty(adHocChallengeDTO3.f37993g) || adHocChallengeDTO3.f37994h == null || adHocChallengeDTO3.f37995i == null) {
                                            bVar.y6(null);
                                        } else {
                                            Fragment fragmentF = bVar.getChildFragmentManager().F(R.id.challenge_details_fragment);
                                            if (fragmentF != null) {
                                                if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.k) {
                                                    bVar.F6();
                                                } else if (fragmentF instanceof com.garmin.android.apps.connectmobile.leaderboard.challenges.f) {
                                                    ((com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragmentF).F6();
                                                }
                                            }
                                        }
                                    } else {
                                        LeaderboardActivity.a aVar4 = LeaderboardActivity.f37145i;
                                        Context contextRequireContext2 = bVar.requireContext();
                                        aVar4.getClass();
                                        Intent intentA2 = LeaderboardActivity.a.a(contextRequireContext2);
                                        intentA2.putExtra("EXTRA_VIEW_DETAIL_RESULT", 701);
                                        intentA2.setFlags(67108864);
                                        bVar.startActivity(intentA2);
                                        bVar.y6(null);
                                    }
                                }
                            } else if (z16) {
                                g22.e.l(bVar);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/b$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "REQ_CODE_INVITE_MORE_FOLLOWERS", "I", "REQ_CODE_AGREE_CHALLENGE_TERMS", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
