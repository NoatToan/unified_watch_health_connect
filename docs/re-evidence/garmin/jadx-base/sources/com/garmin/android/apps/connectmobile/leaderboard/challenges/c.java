package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37365h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MenuItem f37366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ComplexEditText f37367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdHocChallengeDTO f37368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f37371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0668c f37372g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37373a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37373a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.challenges.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/c$c", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0668c extends b.s {
        public C0668c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            c cVar = c.this;
            if (cVar.f37370e) {
                new androidx.appcompat.app.e.a(cVar.requireContext()).setTitle(R.string.pagelbl_name_changed_title).setMessage(R.string.pagelbl_name_changed_content).setPositiveButton(R.string.lbl_yes, new kx0.f(cVar, 8)).setNegativeButton(R.string.lbl_no, new jm0.c(29)).create().show();
            } else {
                cVar.u6();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/c$d", "Landroid/text/TextWatcher;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            c cVar = c.this;
            MenuItem menuItem = cVar.f37366a;
            if (menuItem != null) {
                String str = cVar.f37369d;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                cVar.f37370e = !p005kotlin.jvm.internal.s.g(str, string);
                menuItem.setEnabled(editable != null && !d53.w.J(editable) && editable.length() >= 3 && cVar.f37370e);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/c$e", "Landroidx/core/view/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements androidx.core.view.s {
        public e() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            menu.clear();
            menuInflater.inflate(R.menu.save_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            if (menuItemFindItem != null) {
                c.this.f37366a = menuItemFindItem;
                menuItemFindItem.setEnabled(false);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.save_menu_item) {
                return false;
            }
            c cVar = c.this;
            ComplexEditText complexEditText = cVar.f37367b;
            if (complexEditText == null) {
                return true;
            }
            String string = d53.w.k0(d53.w.m0(complexEditText.getEditText().getText().toString()).toString()).toString();
            AdHocChallengeDTO adHocChallengeDTO = cVar.f37368c;
            if (adHocChallengeDTO == null) {
                p005kotlin.jvm.internal.s.m("challengeDTO");
                throw null;
            }
            adHocChallengeDTO.f37990d = string;
            mt0.q qVar = (mt0.q) cVar.f37371f.getValue();
            AdHocChallengeDTO adHocChallengeDTO2 = cVar.f37368c;
            if (adHocChallengeDTO2 == null) {
                p005kotlin.jvm.internal.s.m("challengeDTO");
                throw null;
            }
            y0 y0VarK = xy2.b.K(qVar, new mt0.o(qVar, adHocChallengeDTO2, null));
            androidx.lifecycle.n0 viewLifecycleOwner = cVar.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0VarK, viewLifecycleOwner, new f(new ml0.e(1, cVar, string)));
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37377a;

        public f(e23.l lVar) {
            lVar.getClass();
            this.f37377a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37377a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37377a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37378a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f37378a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f37378a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f37379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f37380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f37379a = aVar;
            this.f37380b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f37379a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f37380b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f37381a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f37381a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    private c() {
        super(R.layout.ad_hoc_challenge_detail_rename_fragment);
        this.f37369d = "";
        this.f37371f = new w1(p005kotlin.jvm.internal.s0.f105811a.b(mt0.q.class), new g(this), new i(this), new h(null, this));
        this.f37372g = new C0668c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().b(this.f37372g, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        AdHocChallengeDTO adHocChallengeDTO = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("Challenge_DTO", AdHocChallengeDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("Challenge_DTO");
                parcelable = (AdHocChallengeDTO) (parcelable2 instanceof AdHocChallengeDTO ? parcelable2 : null);
            }
            adHocChallengeDTO = (AdHocChallengeDTO) parcelable;
        }
        if (adHocChallengeDTO == null) {
            Toast.makeText(requireContext(), getString(R.string.txt_error_occurred), 0).show();
            requireActivity().getSupportFragmentManager().Z();
            return;
        }
        this.f37368c = adHocChallengeDTO;
        String str = adHocChallengeDTO.f37990d;
        if (str == null) {
            str = "";
        }
        this.f37369d = str;
        ComplexEditText complexEditText = (ComplexEditText) view2.findViewById(R.id.rename_edit);
        if (complexEditText != null) {
            this.f37367b = complexEditText;
            EditText editText = complexEditText.getEditText();
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(60)});
            editText.setText(this.f37369d);
            editText.setHint(getString(R.string.challenge_title));
            editText.setSelection(this.f37369d.length());
            editText.addTextChangedListener(new d());
            complexEditText.setDrawableOnClickListener(new mh1.x(complexEditText, 6));
        }
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        e eVar = new e();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        mVarRequireActivity.addMenuProvider(eVar, viewLifecycleOwner);
    }

    public final void u6() {
        this.f37372g.f(false);
        requireActivity().getOnBackPressedDispatcher().d();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/c$a;", "", "<init>", "()V", "", "CHALLENGE_NAME_MIN_CHAR_COUNT", "I", "CHALLENGE_NAME_MAX_CHAR_COUNT", "", "CHALLENGE_DTO", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }
}
