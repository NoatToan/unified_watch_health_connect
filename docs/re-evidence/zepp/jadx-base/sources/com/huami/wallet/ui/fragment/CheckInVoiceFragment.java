package com.huami.wallet.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.BusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/wallet/ui/fragment/CheckInVoiceFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "a", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceDetailEntity", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class CheckInVoiceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private InVoiceInfo inVoiceDetailEntity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/wallet/ui/fragment/CheckInVoiceFragment$Companion;", "", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceDetailDataFragment", "Lcom/huami/wallet/ui/fragment/CheckInVoiceFragment;", "newInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CheckInVoiceFragment newInstance(@NotNull InVoiceInfo inVoiceDetailDataFragment) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(BusConstKt.KEY_INVOICE_INFO, inVoiceDetailDataFragment);
            CheckInVoiceFragment checkInVoiceFragment = new CheckInVoiceFragment();
            checkInVoiceFragment.setArguments(bundle);
            return checkInVoiceFragment;
        }
    }

    private final void initView() {
        String identifier;
        String companyName;
        String phoneNumber;
        String address;
        String name;
        String email;
        if (Intrinsics.areEqual(this.inVoiceDetailEntity.getType(), "PERSONAL")) {
            View view = getView();
            CheckInVoiceFragmentKt.visible(view == null ? null : view.findViewById(R.id.rl_invoice_head_check));
            View view2 = getView();
            CheckInVoiceFragmentKt.gone(view2 == null ? null : view2.findViewById(R.id.rl_tax_payer_number_check));
            InVoiceInfo inVoiceInfo = this.inVoiceDetailEntity;
            String name2 = inVoiceInfo == null ? null : inVoiceInfo.getName();
            if (name2 == null || m.isBlank(name2)) {
                View view3 = getView();
                CheckInVoiceFragmentKt.gone(view3 == null ? null : view3.findViewById(R.id.rl_company_name_check));
            } else {
                View view4 = getView();
                CheckInVoiceFragmentKt.visible(view4 == null ? null : view4.findViewById(R.id.rl_company_name_check));
                View view5 = getView();
                ((TextView) (view5 == null ? null : view5.findViewById(R.id.tv_company))).setText(R.string.wl_invoice_user_name);
                View view6 = getView();
                TextView textView = (TextView) (view6 == null ? null : view6.findViewById(R.id.tv_company_name_check));
                InVoiceInfo inVoiceInfo2 = this.inVoiceDetailEntity;
                textView.setText(inVoiceInfo2 == null ? null : inVoiceInfo2.getName());
            }
        } else {
            View view7 = getView();
            CheckInVoiceFragmentKt.gone(view7 == null ? null : view7.findViewById(R.id.rl_invoice_head_check));
            View view8 = getView();
            CheckInVoiceFragmentKt.visible(view8 == null ? null : view8.findViewById(R.id.rl_company_name_check));
            View view9 = getView();
            CheckInVoiceFragmentKt.visible(view9 == null ? null : view9.findViewById(R.id.rl_tax_payer_number_check));
            View view10 = getView();
            ((TextView) (view10 == null ? null : view10.findViewById(R.id.tv_invoice_type_check))).setText(R.string.wl_invoice_type_company_name);
            View view11 = getView();
            ((TextView) (view11 == null ? null : view11.findViewById(R.id.tv_company))).setText(R.string.wl_invoice_company_name);
            InVoiceInfo inVoiceInfo3 = this.inVoiceDetailEntity;
            if (inVoiceInfo3 != null && (companyName = inVoiceInfo3.getCompanyName()) != null) {
                View view12 = getView();
                ((TextView) (view12 == null ? null : view12.findViewById(R.id.tv_company_name_check))).setText(companyName);
            }
            InVoiceInfo inVoiceInfo4 = this.inVoiceDetailEntity;
            if (inVoiceInfo4 != null && (identifier = inVoiceInfo4.getIdentifier()) != null) {
                View view13 = getView();
                ((TextView) (view13 == null ? null : view13.findViewById(R.id.tv_taxpayer_number_check))).setText(identifier);
            }
        }
        InVoiceInfo inVoiceInfo5 = this.inVoiceDetailEntity;
        String email2 = inVoiceInfo5 == null ? null : inVoiceInfo5.getEmail();
        if (!(email2 == null || email2.length() == 0)) {
            View view14 = getView();
            CheckInVoiceFragmentKt.visible(view14 == null ? null : view14.findViewById(R.id.rl_new_email_version_view));
            View view15 = getView();
            CheckInVoiceFragmentKt.gone(view15 == null ? null : view15.findViewById(R.id.ll_paper_version_view));
            InVoiceInfo inVoiceInfo6 = this.inVoiceDetailEntity;
            if (inVoiceInfo6 == null || (email = inVoiceInfo6.getEmail()) == null) {
                return;
            }
            View view16 = getView();
            ((TextView) (view16 != null ? view16.findViewById(R.id.tv_receive_email_check) : null)).setText(email);
            return;
        }
        View view17 = getView();
        CheckInVoiceFragmentKt.gone(view17 == null ? null : view17.findViewById(R.id.rl_new_email_version_view));
        View view18 = getView();
        CheckInVoiceFragmentKt.visible(view18 == null ? null : view18.findViewById(R.id.ll_paper_version_view));
        InVoiceInfo inVoiceInfo7 = this.inVoiceDetailEntity;
        if (inVoiceInfo7 != null && (name = inVoiceInfo7.getName()) != null) {
            View view19 = getView();
            ((TextView) (view19 == null ? null : view19.findViewById(R.id.tv_receive_name_check))).setText(name);
        }
        InVoiceInfo inVoiceInfo8 = this.inVoiceDetailEntity;
        if (inVoiceInfo8 != null && (address = inVoiceInfo8.getAddress()) != null) {
            View view20 = getView();
            ((TextView) (view20 == null ? null : view20.findViewById(R.id.tv_receive_address_check))).setText(address);
        }
        InVoiceInfo inVoiceInfo9 = this.inVoiceDetailEntity;
        if (inVoiceInfo9 == null || (phoneNumber = inVoiceInfo9.getPhoneNumber()) == null) {
            return;
        }
        View view21 = getView();
        ((TextView) (view21 != null ? view21.findViewById(R.id.tv_receive_number_check) : null)).setText(phoneNumber);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_check_in_voice, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.inVoiceDetailEntity = (InVoiceInfo) requireArguments().getParcelable(BusConstKt.KEY_INVOICE_INFO);
        initView();
    }
}
