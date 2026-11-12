package com.huami.account.ui.legal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountProperties;
import com.huami.account.HMLoginManager;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.service.EdmService;
import com.huami.account.service.model.Area;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.legal.UserAgreementFooterFragment;
import com.huami.account.utils.UtilsKt;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.Language;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u0013\u001a\u00020\u0004J\u0014\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014J\u0006\u0010\u0017\u001a\u00020\u0002R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010(\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010,\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010+R\u001f\u0010-\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010+R\u001d\u00101\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b)\u00100R\u001d\u00102\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b/\u00100R\u001f\u00104\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b\u001e\u00100¨\u00067"}, d2 = {"Lcom/huami/account/ui/legal/UserAgreementFooterFragment;", "Landroidx/fragment/app/Fragment;", "", "showUx", "", "setShowUx", "", "value", "setValue", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "saveUxPreference", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setUserAgreementCheckListener", "isUserAgreementChecked", "a", "Ljava/lang/String;", "mValue", "b", "Z", "isShowUx", "c", "Lkotlin/jvm/functions/Function0;", "agreementCheckListener", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "e", "()Landroid/widget/TextView;", "useragreementInfo", "g", "useragreementUx", "f", "i", "()Landroid/view/View;", "useragreementUxLl", "useragreementEdmLl", "Landroid/widget/CheckBox;", "h", "()Landroid/widget/CheckBox;", "useragreementInfoCheckbox", "useragreementUxCheckbox", z.j, "useragreementEdmCheckbox", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserAgreementFooterFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String mValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isShowUx;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> agreementCheckListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementInfo = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementUx = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementUxLl = LazyKt__LazyJVMKt.lazy(new g());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementEdmLl = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementInfoCheckbox = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementUxCheckbox = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy useragreementEdmCheckbox = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CheckBox> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CheckBox getA() {
            return (CheckBox) UserAgreementFooterFragment.this.requireView().findViewById(R.id.useragreement_edm_checkbox);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<View> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return UserAgreementFooterFragment.this.requireView().findViewById(R.id.useragreement_edm_ll);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<TextView> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) UtilsKt.findViewById(UserAgreementFooterFragment.this, R.id.useragreement_info);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/CheckBox;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CheckBox> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CheckBox getA() {
            return (CheckBox) UtilsKt.findViewById(UserAgreementFooterFragment.this, R.id.useragreement_info_checkbox);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<TextView> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) UtilsKt.findViewById(UserAgreementFooterFragment.this, R.id.useragreement_ux);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/CheckBox;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<CheckBox> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CheckBox getA() {
            return (CheckBox) UtilsKt.findViewById(UserAgreementFooterFragment.this, R.id.useragreement_ux_checkbox);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<View> {
        public g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            return UtilsKt.findViewById(UserAgreementFooterFragment.this, R.id.useragreement_ux_ll);
        }
    }

    private final CheckBox c() {
        return (CheckBox) this.useragreementEdmCheckbox.getValue();
    }

    private final View d() {
        return (View) this.useragreementEdmLl.getValue();
    }

    private final TextView e() {
        return (TextView) this.useragreementInfo.getValue();
    }

    private final CheckBox f() {
        return (CheckBox) this.useragreementInfoCheckbox.getValue();
    }

    private final TextView g() {
        return (TextView) this.useragreementUx.getValue();
    }

    private final CheckBox h() {
        return (CheckBox) this.useragreementUxCheckbox.getValue();
    }

    private final View i() {
        return (View) this.useragreementUxLl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(UserAgreementFooterFragment userAgreementFooterFragment, CompoundButton compoundButton, boolean z) {
        Function0<Unit> function0 = userAgreementFooterFragment.agreementCheckListener;
        if (function0 == null) {
            return;
        }
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(CompoundButton compoundButton, boolean z) {
        AccountProperties.INSTANCE.setEdmConfirmedByRegister(Boolean.valueOf(z));
    }

    public final boolean isUserAgreementChecked() {
        if (getView() == null) {
            return false;
        }
        return f().isChecked();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_ui_fragment_useragreement_footer, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        UserLegalInfoManager.assembleRegisterAgreementAndPrivacyText(AccountExternalsKt.getAppContext(), e(), getString(R.string.account_ui_user_agreement_regist_title), this.mValue);
        UserLegalInfoManager.assembleRegisterExperienceText(AccountExternalsKt.getAppContext(), g(), this.mValue);
        if (Language.isEnglish()) {
            e().append(".");
        }
        i().setVisibility(this.isShowUx ? 0 : 8);
        CheckBox checkBoxF = f();
        if (checkBoxF != null) {
            checkBoxF.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o58
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UserAgreementFooterFragment.j(this.a, compoundButton, z);
                }
            });
        }
        AccountProperties.INSTANCE.setEdmConfirmedByRegister(Boolean.FALSE);
        CheckBox checkBoxC = c();
        if (checkBoxC != null) {
            checkBoxC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: p58
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    UserAgreementFooterFragment.k(compoundButton, z);
                }
            });
        }
        Area areaByCountryCode = SelectAreaHelper.getAreaByCountryCode(this.mValue);
        View viewD = d();
        if (viewD == null) {
            return;
        }
        viewD.setVisibility(((EdmService) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(EdmService.class), null, null)).shouldShowEdm(areaByCountryCode) ? 0 : 8);
    }

    public final void saveUxPreference() {
        if (this.isShowUx) {
            HMLoginManager.saveAgreeUserExperienceForRegister(h().isChecked());
        }
    }

    public final void setShowUx(boolean showUx) {
        this.isShowUx = showUx;
    }

    public final void setUserAgreementCheckListener(@NotNull Function0<Unit> listener) {
        this.agreementCheckListener = listener;
    }

    public final void setValue(@NotNull String value) {
        this.mValue = value;
    }
}
