package com.huami.wallet.ui.fragment;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.MiConfirmServiceInVoiceActivity;
import com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.MiServiceChargeFragment;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.FormatUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.widget.toast.CustomToast;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0013\u001a\u00020\u0010*\u00020\nH\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006,"}, d2 = {"Lcom/huami/wallet/ui/fragment/MiServiceChargeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "h", "", "e", "(Landroid/view/View;)Ljava/lang/Integer;", "", "email", "f", "(Ljava/lang/String;)Ljava/lang/Integer;", "info", "g", "", "isShow", "m", GoogleApiAvailabilityLight.b, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "a", "Z", "isPersonal", "b", "Ljava/lang/String;", "busCardIdCharge", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "c", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", GoogleApiAvailabilityLight.a, "inVoiceAmount", "version", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiServiceChargeFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isPersonal = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String busCardIdCharge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private BusCardDetailData busCardDetailData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String inVoiceAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/huami/wallet/ui/fragment/MiServiceChargeFragment$Companion;", "", "", "busId", "amount", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "version", "Lcom/huami/wallet/ui/fragment/MiServiceChargeFragment;", "getInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiServiceChargeFragment getInstance(@NotNull String busId, @NotNull String amount, @NotNull BusCardDetailData busCardDetailData, @Nullable String version) {
            Bundle bundle = new Bundle();
            bundle.putString(BusConstKt.KEY_INVOICE_AMOUNT, amount);
            bundle.putString(BusConstKt.KEY_BUS_ID, busId);
            bundle.putString(BusConstKt.KEY_INVOICE_VERSION, version);
            bundle.putParcelable(BusConstKt.KEY_BUS_DETAIL_DATA, busCardDetailData);
            MiServiceChargeFragment miServiceChargeFragment = new MiServiceChargeFragment();
            miServiceChargeFragment.setArguments(bundle);
            return miServiceChargeFragment;
        }
    }

    private final Integer e(View view) {
        if (this.isPersonal) {
            Editable text = ((EditText) view.findViewById(R.id.et_mi_invoice_title)).getText();
            return text == null || m.isBlank(text) ? Integer.valueOf(R.string.wl_invoice_input_receive_name_please) : f(((EditText) view.findViewById(R.id.et_mi_email)).getText().toString());
        }
        Editable text2 = ((EditText) view.findViewById(R.id.et_mi_company_name)).getText();
        return text2 == null || m.isBlank(text2) ? Integer.valueOf(R.string.wl_invoice_input_company_name_please) : g(((EditText) view.findViewById(R.id.et_mi_taxpayer_number)).getText().toString());
    }

    private final Integer f(String email) {
        if (!Intrinsics.areEqual("v2", this.version)) {
            return null;
        }
        if (email == null || m.isBlank(email)) {
            return Integer.valueOf(R.string.wl_invoice_input_receive_email);
        }
        if (FormatUtils.isEmailFormat(email)) {
            return null;
        }
        return Integer.valueOf(R.string.wl_invoice_input_receive_email_error);
    }

    private final Integer g(String info) {
        if (info == null || m.isBlank(info)) {
            return Integer.valueOf(R.string.wl_invoice_input_taxpayer_number_please);
        }
        Objects.requireNonNull(info, "null cannot be cast to non-null type kotlin.CharSequence");
        if (!n(StringsKt__StringsKt.trim(info).toString())) {
            return Integer.valueOf(R.string.wl_invoice_input_taxpayer_number_rule);
        }
        if (CollectionsKt__CollectionsKt.mutableListOf(15, 17, 18, 20).contains(Integer.valueOf(info.length()))) {
            return null;
        }
        return Integer.valueOf(R.string.wl_invoice_input_taxpayer_number_rule);
    }

    private final void h() {
        new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setTitle(R.string.wl_invoice_tip).setMessage(R.string.wl_invoice_tip_info).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: v45
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MiServiceChargeFragment.i(dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i) {
    }

    private final void initView(final View view) {
        if (!Intrinsics.areEqual("v2", this.version)) {
            ViewExtensionKt.gone((RelativeLayout) view.findViewById(R.id.rl_mi_phone));
            ViewExtensionKt.gone((RelativeLayout) view.findViewById(R.id.rl_mi_email));
        }
        ((TextView) view.findViewById(R.id.tv_mi_money_content)).setText(getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(Integer.parseInt(this.inVoiceAmount))));
        ((RelativeLayout) view.findViewById(R.id.rl_mi_invoice_head)).setOnClickListener(new View.OnClickListener() { // from class: y45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiServiceChargeFragment.j(this.a, view, view2);
            }
        });
        ((TextView) view.findViewById(R.id.tv_mi_inVoice_tip)).setOnClickListener(new View.OnClickListener() { // from class: w45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiServiceChargeFragment.k(this.a, view2);
            }
        });
        ((Button) view.findViewById(R.id.tv_mi_submit)).setOnClickListener(new View.OnClickListener() { // from class: x45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiServiceChargeFragment.l(this.a, view, view2);
            }
        });
        View view2 = getView();
        ((EditText) (view2 == null ? null : view2.findViewById(R.id.et_mi_taxpayer_number))).addTextChangedListener(new TextWatcher() { // from class: com.huami.wallet.ui.fragment.MiServiceChargeFragment.initView.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            @SuppressLint({"DefaultLocale"})
            public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
                View view3 = MiServiceChargeFragment.this.getView();
                ((EditText) (view3 == null ? null : view3.findViewById(R.id.et_mi_taxpayer_number))).removeTextChangedListener(this);
                View view4 = MiServiceChargeFragment.this.getView();
                ((EditText) (view4 == null ? null : view4.findViewById(R.id.et_mi_taxpayer_number))).setText(String.valueOf(s).toUpperCase());
                View view5 = MiServiceChargeFragment.this.getView();
                ((EditText) (view5 == null ? null : view5.findViewById(R.id.et_mi_taxpayer_number))).setSelection(start + count);
                View view6 = MiServiceChargeFragment.this.getView();
                ((EditText) (view6 != null ? view6.findViewById(R.id.et_mi_taxpayer_number) : null)).addTextChangedListener(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final MiServiceChargeFragment miServiceChargeFragment, final View view, View view2) {
        final SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragmentNewInstance = SelectInVoiceTypeDialogFragment.INSTANCE.newInstance();
        selectInVoiceTypeDialogFragmentNewInstance.setOnInVoiceTypeItemListener(new SelectInVoiceTypeDialogFragment.OnInVoiceTypeItemListener() { // from class: com.huami.wallet.ui.fragment.MiServiceChargeFragment$initView$1$1
            @Override // com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment.OnInVoiceTypeItemListener
            public void clickCompany() {
                ((TextView) view.findViewById(R.id.tv_mi_invoice_type)).setText(R.string.wl_invoice_type_company_name);
                miServiceChargeFragment.m(true, view);
                miServiceChargeFragment.isPersonal = false;
                selectInVoiceTypeDialogFragmentNewInstance.dismiss();
            }

            @Override // com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment.OnInVoiceTypeItemListener
            public void clickPerson() {
                ((TextView) view.findViewById(R.id.tv_mi_invoice_type)).setText(R.string.wl_invoice_type_name);
                miServiceChargeFragment.m(false, view);
                miServiceChargeFragment.isPersonal = true;
                selectInVoiceTypeDialogFragmentNewInstance.dismiss();
            }
        });
        selectInVoiceTypeDialogFragmentNewInstance.show(miServiceChargeFragment.getChildFragmentManager(), "ServiceChargeFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MiServiceChargeFragment miServiceChargeFragment, View view) {
        miServiceChargeFragment.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MiServiceChargeFragment miServiceChargeFragment, View view, View view2) {
        Integer numE = miServiceChargeFragment.e(view);
        if (numE != null) {
            CustomToast.showShort(miServiceChargeFragment.requireContext(), miServiceChargeFragment.getString(numE.intValue()));
            return;
        }
        boolean z = miServiceChargeFragment.isPersonal;
        MiConfirmServiceInVoiceActivity.INSTANCE.open(miServiceChargeFragment.requireContext(), String.valueOf(miServiceChargeFragment.inVoiceAmount), new InVoiceInfo(z ? "PERSONAL" : "COMPANY", ((TextView) view.findViewById(R.id.tv_mi_content_massage)).getText().toString(), z ? ((EditText) view.findViewById(R.id.et_mi_invoice_title)).getText().toString() : ((EditText) view.findViewById(R.id.et_mi_company_name)).getText().toString(), ((EditText) view.findViewById(R.id.et_mi_taxpayer_number)).getText().toString(), ((EditText) view.findViewById(R.id.et_mi_email)).getText().toString(), "", ((EditText) view.findViewById(R.id.et_mi_phone)).getText().toString(), ""), miServiceChargeFragment.busCardIdCharge, miServiceChargeFragment.busCardDetailData, miServiceChargeFragment.version);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(boolean isShow, View view) {
        if (isShow) {
            ((RelativeLayout) view.findViewById(R.id.rl_mi_company_name)).setVisibility(0);
            ((RelativeLayout) view.findViewById(R.id.rl_mi_tax_payer_number)).setVisibility(0);
            ((RelativeLayout) view.findViewById(R.id.rl_mi_invoice_title)).setVisibility(8);
        } else {
            ((RelativeLayout) view.findViewById(R.id.rl_mi_invoice_title)).setVisibility(0);
            ((RelativeLayout) view.findViewById(R.id.rl_mi_company_name)).setVisibility(8);
            ((RelativeLayout) view.findViewById(R.id.rl_mi_tax_payer_number)).setVisibility(8);
        }
    }

    private final boolean n(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!Character.isUpperCase(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
                return false;
            }
            if (i2 >= length) {
                return true;
            }
            i = i2;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mi_service_charge, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.inVoiceAmount = arguments.getString(BusConstKt.KEY_INVOICE_AMOUNT);
            this.busCardIdCharge = arguments.getString(BusConstKt.KEY_BUS_ID);
            this.version = arguments.getString(BusConstKt.KEY_INVOICE_VERSION);
            this.busCardDetailData = (BusCardDetailData) arguments.getParcelable(BusConstKt.KEY_BUS_DETAIL_DATA);
        }
        m(false, view);
        initView(view);
    }
}
