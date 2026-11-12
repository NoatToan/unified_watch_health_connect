package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import am.c2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
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
import android.widget.Button;
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
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import fo1.s1;
import fo1.z1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mt0.p3;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/k;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/o0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/j$a;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends o0 implements j.a {
    public static final a O0 = new a(null);
    public boolean I0;
    public boolean J0;
    public ot0.a K0;
    public com.garmin.android.apps.connectmobile.leaderboard.challenges.b M0;
    public MenuItem N0;
    public View Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f37634k0;
    public final Object Y = o13.m.a(o13.n.NONE, new e(this, null, new d(this), null, null));
    public final o13.t H0 = o13.m.b(new mh1.i(this, 8));
    public final ArrayList L0 = new ArrayList();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37635a;

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
            f37635a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37636a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f37636a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37636a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37636a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37637a;

        public d(Fragment fragment) {
            this.f37637a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37637a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<p3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37642e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37638a = fragment;
            this.f37639b = qualifier;
            this.f37640c = aVar;
            this.f37641d = aVar2;
            this.f37642e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.p3] */
        @Override // e23.a
        public final p3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37640c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37638a;
            e23.a aVar = this.f37641d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(p3.class), f189591b, null, defaultViewModelCreationExtras, this.f37639b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37642e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/k$f", "Ljava/util/Comparator;", "Lot0/a;", "Lkotlin/Comparator;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements Comparator<ot0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37643a = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());

        @Override // java.util.Comparator
        public final int compare(ot0.a aVar, ot0.a aVar2) {
            ot0.a aVar3 = aVar;
            ot0.a aVar4 = aVar2;
            String str = aVar3 != null ? aVar3.f133706a : null;
            String str2 = this.f37643a;
            if (p005kotlin.jvm.internal.s.g(str, str2)) {
                return -1;
            }
            return p005kotlin.jvm.internal.s.g(aVar4 != null ? aVar4.f133706a : null, str2) ? 1 : 0;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        super.I6();
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.M0;
        if (bVar != null) {
            bVar.A6(false);
        }
    }

    @Override // mt0.h2
    public final boolean U6(int i14) {
        int i15;
        u6();
        int headerViewsCount = this.f7311e.getHeaderViewsCount();
        if (i14 >= headerViewsCount && (i15 = i14 - headerViewsCount) < u7().getCount()) {
            ot0.a item = u7().getItem(i15);
            if (item == null) {
                item = null;
            }
            if (!(item == null ? false : p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), item.f133706a))) {
                return true;
            }
        }
        return false;
    }

    @Override // mt0.h2
    public final boolean V6() {
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        return p005kotlin.jvm.internal.s.g(strValueOf, adHocChallengeDTO != null ? adHocChallengeDTO.f37992f : null) && !x.t(this.f37694z);
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
        ot0.a item;
        String str;
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = u7().f37623h;
        int count = u7().getCount();
        for (int i14 = 0; i14 < count; i14++) {
            if (sparseBooleanArray.get(i14, false) && (item = u7().getItem(i14)) != null && (str = item.f133706a) != null) {
                arrayList.add(str);
            }
        }
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = this.M0;
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
        dh.b.L(jVarN, this, new c(new ap.b(this, i15, 9)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final ListAdapter f7() {
        x7();
        return u7();
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.j.a
    public final void k1(AdHocChallengePlayersActivity.b bVar) {
        bVar.getClass();
        Context context = getContext();
        if (context == null) {
            return;
        }
        AdHocChallengePlayersActivity.a aVar = AdHocChallengePlayersActivity.f37175a;
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        aVar.getClass();
        startActivityForResult(AdHocChallengePlayersActivity.a.a(context, adHocChallengeDTO, bVar), 1);
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
        dh.b.L(o0VarG7.C4(str, str2, str3), this, new c(new mt0.e0(this, str, str2, str3, 0)));
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
        dh.b.L(o53.f0.N(new fo1.i0(l0Var, c2Var, str, conversationCommentDTO, null)), this, new c(new mt0.f0(this)));
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0
    public final boolean m7() {
        return !this.I0;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, mt0.h2, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        w7();
        super.onActivityCreated(bundle);
        u6();
        ListView listView = this.f7311e;
        listView.getClass();
        listView.setChoiceMode(1);
        if (V6()) {
            listView.setOnItemLongClickListener(new com.garmin.android.apps.connectmobile.connectiq.m0(this, 4));
        } else {
            listView.setOnLongClickListener(null);
        }
        listView.setOnItemClickListener(new ey.a(this, 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar;
        if (i14 == 1 && i15 == -1 && (bVar = this.M0) != null) {
            bVar.A6(false);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        if (bundleC == null) {
            bundleC = getArguments();
        }
        if (bundleC != null) {
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
            this.I0 = bundleC.getBoolean("ARGS_SHOW_INVITATION");
            this.F = bundleC.getBoolean("ARGS_FOCUS_ON_COMMENTS");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, mt0.h2, android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        super.onCreateActionMode(actionMode, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_delete);
        this.N0 = menuItemFindItem;
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setEnabled(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.o0, mt0.h2, android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        super.onDestroyActionMode(actionMode);
        j jVarU7 = u7();
        jVarU7.f37623h.clear();
        jVarU7.notifyDataSetChanged();
        v7(false);
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
    }

    public final j u7() {
        return (j) this.H0.getValue();
    }

    public final void v7(boolean z14) {
        if (!z14) {
            u7().f37624i = false;
            u7().f37622g = true;
        } else {
            u7().f37624i = true;
            u7().f37622g = false;
            requireActivity().startActionMode(this);
        }
    }

    public final void w7() {
        if (this.f37694z != null) {
            if (this.Z == null) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.challenge_details_header_3_0, (ViewGroup) null, false);
                View viewFindViewById = viewInflate.findViewById(R.id.challenge_details_pending);
                this.f37634k0 = viewFindViewById;
                if (viewFindViewById != null) {
                    final View viewFindViewById2 = viewFindViewById.findViewById(R.id.challenge_accept_decline_container);
                    Button button = (Button) viewFindViewById2.findViewById(R.id.challenge_accept);
                    TextView textView = (TextView) viewFindViewById2.findViewById(R.id.challenge_decline);
                    final View viewFindViewById3 = viewFindViewById.findViewById(R.id.challenge_declined_container);
                    TextView textView2 = (TextView) viewFindViewById3.findViewById(R.id.challenge_declined_undo);
                    button.setOnClickListener(new js0.d(this, 29));
                    final int i14 = 0;
                    textView.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.d0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.k f120565b;

                        {
                            this.f120565b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i14) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar = this.f120565b;
                                    kVar.J0 = true;
                                    viewFindViewById2.setVisibility(8);
                                    viewFindViewById3.setVisibility(0);
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = kVar.M0;
                                    if (bVar != null) {
                                        bVar.f37330h = true;
                                    }
                                    ot0.a aVar = kVar.K0;
                                    if (aVar != null) {
                                        kVar.L0.remove(aVar);
                                        kVar.u7().notifyDataSetChanged();
                                        break;
                                    }
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar2 = this.f120565b;
                                    kVar2.J0 = false;
                                    viewFindViewById2.setVisibility(0);
                                    viewFindViewById3.setVisibility(8);
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar2 = kVar2.M0;
                                    if (bVar2 != null) {
                                        bVar2.f37330h = false;
                                    }
                                    ot0.a aVar2 = kVar2.K0;
                                    if (aVar2 != null) {
                                        kVar2.L0.add(aVar2);
                                        kVar2.u7().notifyDataSetChanged();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    final int i15 = 1;
                    textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mt0.d0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.k f120565b;

                        {
                            this.f120565b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i15) {
                                case 0:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar = this.f120565b;
                                    kVar.J0 = true;
                                    viewFindViewById2.setVisibility(8);
                                    viewFindViewById3.setVisibility(0);
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar = kVar.M0;
                                    if (bVar != null) {
                                        bVar.f37330h = true;
                                    }
                                    ot0.a aVar = kVar.K0;
                                    if (aVar != null) {
                                        kVar.L0.remove(aVar);
                                        kVar.u7().notifyDataSetChanged();
                                        break;
                                    }
                                    break;
                                default:
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar2 = this.f120565b;
                                    kVar2.J0 = false;
                                    viewFindViewById2.setVisibility(0);
                                    viewFindViewById3.setVisibility(8);
                                    com.garmin.android.apps.connectmobile.leaderboard.challenges.b bVar2 = kVar2.M0;
                                    if (bVar2 != null) {
                                        bVar2.f37330h = false;
                                    }
                                    ot0.a aVar2 = kVar2.K0;
                                    if (aVar2 != null) {
                                        kVar2.L0.add(aVar2);
                                        kVar2.u7().notifyDataSetChanged();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                u6();
                this.f7311e.addHeaderView(viewInflate, null, false);
                this.Z = viewInflate;
            }
            View view2 = this.Z;
            if (view2 == null) {
                return;
            }
            TextView textView3 = (TextView) view2.findViewById(R.id.challenge_details_title);
            TextView textView4 = (TextView) view2.findViewById(R.id.challenge_details_period);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            textView3.setText(x.p(contextRequireContext, this.f37694z));
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            textView4.setText(x.o(contextRequireContext2, this.f37694z, !this.I0));
            View view3 = this.f37634k0;
            if (view3 != null) {
                view3.setVisibility(this.I0 ? 0 : 8);
            }
            TextView textView5 = (TextView) view2.findViewById(R.id.consent_message);
            AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
            textView5.setText((adHocChallengeDTO != null ? com.garmin.android.apps.connectmobile.leaderboard.model.s.b(adHocChallengeDTO.f37989c) : null) == com.garmin.android.apps.connectmobile.leaderboard.model.s.f38315k ? requireContext().getString(R.string.lbl_adhoc_challenge_rules_wheelchair) : requireContext().getString(R.string.lbl_adhoc_challenge_rules));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o13.l] */
    public final void x7() {
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        ArrayList arrayList = new ArrayList();
        ArrayList<ot0.a> arrayList2 = this.L0;
        arrayList2.clear();
        AdHocChallengeDTO adHocChallengeDTO = this.f37694z;
        List<? extends AdHocChallengePlayerDTO> list = adHocChallengeDTO != null ? adHocChallengeDTO.f38001o : null;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                AdHocChallengePlayerDTO adHocChallengePlayerDTO = list.get(i14);
                p3 p3Var = (p3) this.Y.getValue();
                String str = adHocChallengePlayerDTO.f38007a;
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = p3Var.f120809b.get(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
                x xVar = x.f37955a;
                b12.b bVar = new b12.b((lVar == null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls2.f46878g, null, null, null, null, 30, null);
                b12.b bVar2 = new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46879h, null, null, null, null, 30, null);
                xVar.getClass();
                ot0.a aVarX = x.x(adHocChallengePlayerDTO, bVar, bVar2);
                if (adHocChallengePlayerDTO.f38017k) {
                    arrayList.add(aVarX);
                } else if (this.J0) {
                    String str2 = adHocChallengePlayerDTO.f38007a;
                    ot0.a aVar = this.K0;
                    aVar.getClass();
                    if (!p005kotlin.jvm.internal.s.g(str2, aVar.f133706a)) {
                        arrayList2.add(aVarX);
                    }
                } else {
                    arrayList2.add(aVarX);
                }
            }
        }
        f fVar = new f();
        p13.c0.u(arrayList, fVar);
        p13.c0.u(arrayList2, fVar);
        if (!u7().isEmpty()) {
            j jVarU7 = u7();
            jVarU7.f81385b.clear();
            jVarU7.f81386c.clear();
        }
        u7().a(getString(R.string.social_participants), arrayList);
        u7().a(getString(R.string.social_waiting_for_response), arrayList2);
        u7().notifyDataSetChanged();
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        for (ot0.a aVar2 : arrayList2) {
            if (p005kotlin.jvm.internal.s.g(strValueOf, aVar2 != null ? aVar2.f133706a : null)) {
                this.K0 = aVar2;
                return;
            }
        }
    }

    public final void z7(int i14) {
        if (U6(i14)) {
            u6();
            int headerViewsCount = i14 - this.f7311e.getHeaderViewsCount();
            SparseBooleanArray sparseBooleanArray = u7().f37623h;
            sparseBooleanArray.put(headerViewsCount, !sparseBooleanArray.get(headerViewsCount, false));
            u7().notifyDataSetChanged();
            SparseBooleanArray sparseBooleanArray2 = u7().f37623h;
            int size = sparseBooleanArray2.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                if (u7().f37623h.get(sparseBooleanArray2.keyAt(i16))) {
                    i15++;
                }
            }
            TextView textView = this.f120642w;
            if (textView != null) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String string = getString(R.string.lbl_num_selected);
                string.getClass();
                q6.f.y(new Object[]{Integer.valueOf(i15)}, 1, string, textView);
            }
            MenuItem menuItem = this.N0;
            if (menuItem != null) {
                menuItem.setEnabled(i15 > 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/k$a;", "", "<init>", "()V", "", "ARGS_CHALLENGE", "Ljava/lang/String;", "ARGS_SHOW_INVITATION", "", "REQ_CODE_PARTICIPANTS_LIST_CHANGED", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
