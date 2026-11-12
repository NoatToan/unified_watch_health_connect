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
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.ConfirmServiceInVoiceActivity;
import com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.ServiceChargeFragment;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.FormatUtils;
import com.huami.wallet.ui.widget.EditTextWatcher;
import com.huami.widget.toast.CustomToast;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u000e\u001a\u00020\n*\u00020\rH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/wallet/ui/fragment/ServiceChargeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "f", "", "e", "(Landroid/view/View;)Ljava/lang/Integer;", "", "isShow", hl.k, "", "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "a", "Z", "isPersonal", "()Z", "setPersonal", "(Z)V", "b", "Ljava/lang/String;", "busCardIdCharge", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "c", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ServiceChargeFragment extends Fragment {

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/wallet/ui/fragment/ServiceChargeFragment$Companion;", "", "", "busCardIdCharge", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "Lcom/huami/wallet/ui/fragment/ServiceChargeFragment;", "getInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ServiceChargeFragment getInstance(@NotNull String busCardIdCharge, @NotNull BusCardDetailData busCardDetailData) {
            Bundle bundle = new Bundle();
            bundle.putString(BusConstKt.KEY_BUS_ID, busCardIdCharge);
            bundle.putParcelable(BusConstKt.KEY_BUS_DETAIL_DATA, busCardDetailData);
            ServiceChargeFragment serviceChargeFragment = new ServiceChargeFragment();
            serviceChargeFragment.setArguments(bundle);
            return serviceChargeFragment;
        }
    }

    private final Integer e(View view) {
        if (this.isPersonal) {
            String string = ((EditText) view.findViewById(R.id.et_user_name)).getText().toString();
            if (string == null || m.isBlank(string)) {
                return Integer.valueOf(R.string.wl_invoice_input_user_name_please);
            }
        } else {
            String string2 = ((EditText) view.findViewById(R.id.et_company_name)).getText().toString();
            if (string2 == null || m.isBlank(string2)) {
                return Integer.valueOf(R.string.wl_invoice_input_company_name_please);
            }
            int i = R.id.et_taxpayer_number;
            String string3 = ((EditText) view.findViewById(i)).getText().toString();
            if (string3 == null || m.isBlank(string3)) {
                return Integer.valueOf(R.string.wl_invoice_input_taxpayer_number_please);
            }
            if (!l(StringsKt__StringsKt.trim(((EditText) view.findViewById(i)).getText()).toString())) {
                return Integer.valueOf(R.string.wl_invoice_input_taxpayer_number_rule);
            }
            if (!CollectionsKt__CollectionsKt.mutableListOf(15, 17, 18, 20).contains(Integer.valueOf(StringsKt__StringsKt.trim(((EditText) view.findViewById(i)).getText()).toString().length()))) {
                return Integer.valueOf(R.string.wl_invoice_input_taxpayer_number_rule);
            }
        }
        int i2 = R.id.et_receive_email;
        String string4 = ((EditText) view.findViewById(i2)).getText().toString();
        if (string4 == null || m.isBlank(string4)) {
            return Integer.valueOf(R.string.wl_invoice_input_receive_email);
        }
        if (FormatUtils.isEmailFormat(((EditText) view.findViewById(i2)).getText().toString())) {
            return null;
        }
        return Integer.valueOf(R.string.wl_invoice_input_receive_email_error);
    }

    private final void f() {
        new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setTitle(R.string.wl_invoice_tip).setMessage(R.string.wl_invoice_message).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: fo6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ServiceChargeFragment.g(dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final ServiceChargeFragment serviceChargeFragment, final View view, View view2) {
        final SelectInVoiceTypeDialogFragment selectInVoiceTypeDialogFragmentNewInstance = SelectInVoiceTypeDialogFragment.INSTANCE.newInstance();
        selectInVoiceTypeDialogFragmentNewInstance.setOnInVoiceTypeItemListener(new SelectInVoiceTypeDialogFragment.OnInVoiceTypeItemListener() { // from class: com.huami.wallet.ui.fragment.ServiceChargeFragment$initView$1$1
            @Override // com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment.OnInVoiceTypeItemListener
            public void clickCompany() {
                ((TextView) view.findViewById(R.id.tv_invoice_type)).setText(R.string.wl_invoice_type_company_name);
                serviceChargeFragment.k(true, view);
                serviceChargeFragment.setPersonal(false);
                selectInVoiceTypeDialogFragmentNewInstance.dismiss();
            }

            @Override // com.huami.wallet.ui.dialog.SelectInVoiceTypeDialogFragment.OnInVoiceTypeItemListener
            public void clickPerson() {
                ((TextView) view.findViewById(R.id.tv_invoice_type)).setText(R.string.wl_invoice_type_name);
                serviceChargeFragment.k(false, view);
                serviceChargeFragment.setPersonal(true);
                selectInVoiceTypeDialogFragmentNewInstance.dismiss();
            }
        });
        selectInVoiceTypeDialogFragmentNewInstance.show(serviceChargeFragment.getChildFragmentManager(), "ServiceChargeFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ServiceChargeFragment serviceChargeFragment, View view) {
        serviceChargeFragment.f();
    }

    private final void initView(final View view) {
        int i = R.id.et_receive_email;
        ((EditText) view.findViewById(i)).addTextChangedListener(new EditTextWatcher(200, (EditText) view.findViewById(i)));
        ((RelativeLayout) view.findViewById(R.id.rl_invoice_head)).setOnClickListener(new View.OnClickListener() { // from class: io6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ServiceChargeFragment.h(this.a, view, view2);
            }
        });
        ((TextView) view.findViewById(R.id.tv_inVoice_tip)).setOnClickListener(new View.OnClickListener() { // from class: go6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ServiceChargeFragment.i(this.a, view2);
            }
        });
        ((Button) view.findViewById(R.id.tv_submit)).setOnClickListener(new View.OnClickListener() { // from class: ho6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ServiceChargeFragment.j(this.a, view, view2);
            }
        });
        View view2 = getView();
        ((EditText) (view2 == null ? null : view2.findViewById(R.id.et_taxpayer_number))).addTextChangedListener(new TextWatcher() { // from class: com.huami.wallet.ui.fragment.ServiceChargeFragment.initView.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            @SuppressLint({"DefaultLocale"})
            public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
                View view3 = ServiceChargeFragment.this.getView();
                ((EditText) (view3 == null ? null : view3.findViewById(R.id.et_taxpayer_number))).removeTextChangedListener(this);
                View view4 = ServiceChargeFragment.this.getView();
                ((EditText) (view4 == null ? null : view4.findViewById(R.id.et_taxpayer_number))).setText(String.valueOf(s).toUpperCase());
                View view5 = ServiceChargeFragment.this.getView();
                ((EditText) (view5 == null ? null : view5.findViewById(R.id.et_taxpayer_number))).setSelection(start + count);
                View view6 = ServiceChargeFragment.this.getView();
                ((EditText) (view6 != null ? view6.findViewById(R.id.et_taxpayer_number) : null)).addTextChangedListener(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ServiceChargeFragment serviceChargeFragment, View view, View view2) {
        Integer numE = serviceChargeFragment.e(view);
        if (numE != null) {
            CustomToast.showShort(serviceChargeFragment.requireContext(), serviceChargeFragment.getResources().getString(numE.intValue()));
            return;
        }
        ConfirmServiceInVoiceActivity.INSTANCE.open(serviceChargeFragment.requireContext(), new InVoiceInfo(serviceChargeFragment.getIsPersonal() ? "PERSONAL" : "COMPANY", ((TextView) view.findViewById(R.id.tv_content_massage)).getText().toString(), ((EditText) view.findViewById(R.id.et_company_name)).getText().toString(), ((EditText) view.findViewById(R.id.et_taxpayer_number)).getText().toString(), ((EditText) view.findViewById(R.id.et_receive_email)).getText().toString(), serviceChargeFragment.getIsPersonal() ? ((EditText) view.findViewById(R.id.et_user_name)).getText().toString() : "", "", ""), serviceChargeFragment.busCardIdCharge, serviceChargeFragment.busCardDetailData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean isShow, View view) {
        if (isShow) {
            CheckInVoiceFragmentKt.visible((RelativeLayout) view.findViewById(R.id.rl_company_name));
            CheckInVoiceFragmentKt.visible((RelativeLayout) view.findViewById(R.id.rl_tax_payer_number));
            CheckInVoiceFragmentKt.gone((RelativeLayout) view.findViewById(R.id.rl_user_name));
        } else {
            CheckInVoiceFragmentKt.gone((RelativeLayout) view.findViewById(R.id.rl_company_name));
            CheckInVoiceFragmentKt.gone((RelativeLayout) view.findViewById(R.id.rl_tax_payer_number));
            CheckInVoiceFragmentKt.visible((RelativeLayout) view.findViewById(R.id.rl_user_name));
        }
    }

    private final boolean l(String str) {
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

    /* JADX INFO: renamed from: isPersonal, reason: from getter */
    public final boolean getIsPersonal() {
        return this.isPersonal;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_service_charge, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.busCardIdCharge = arguments.getString(BusConstKt.KEY_BUS_ID);
            this.busCardDetailData = (BusCardDetailData) arguments.getParcelable(BusConstKt.KEY_BUS_DETAIL_DATA);
        }
        k(false, view);
        initView(view);
    }

    public final void setPersonal(boolean z) {
        this.isPersonal = z;
    }
}
