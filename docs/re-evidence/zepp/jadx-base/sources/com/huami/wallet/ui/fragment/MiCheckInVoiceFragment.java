package com.huami.wallet.ui.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.MiCheckInVoiceFragment;
import com.huami.wallet.ui.utils.BusConstKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/huami/wallet/ui/fragment/MiCheckInVoiceFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "", "a", "Ljava/lang/String;", "inVoiceAddress", "b", "inVoiceVersion", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiCheckInVoiceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "MiCheckInVoiceFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String inVoiceAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String inVoiceVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/ui/fragment/MiCheckInVoiceFragment$Companion;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "version", "Lcom/huami/wallet/ui/fragment/MiCheckInVoiceFragment;", "newInstance", "TAG", "Ljava/lang/String;", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiCheckInVoiceFragment newInstance(@Nullable String address, @Nullable String version) {
            Bundle bundle = new Bundle();
            bundle.putString(BusConstKt.KEY_INVOICE_ADDRESS, address);
            bundle.putString(BusConstKt.KEY_INVOICE_VERSION, version);
            MiCheckInVoiceFragment miCheckInVoiceFragment = new MiCheckInVoiceFragment();
            miCheckInVoiceFragment.setArguments(bundle);
            return miCheckInVoiceFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MiCheckInVoiceFragment miCheckInVoiceFragment, View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(miCheckInVoiceFragment.inVoiceAddress));
        miCheckInVoiceFragment.startActivity(intent);
    }

    private final void initView(View view) {
        boolean zAreEqual = Intrinsics.areEqual("v2", this.inVoiceVersion);
        String str = this.inVoiceAddress;
        if (str == null || str.length() == 0) {
            ((RelativeLayout) view.findViewById(R.id.rl_inVoice_wait)).setVisibility(0);
            ((RelativeLayout) view.findViewById(R.id.rl_inVoice_success)).setVisibility(8);
            if (zAreEqual) {
                ((TextView) view.findViewById(R.id.tv_submit_tip)).setText(getString(R.string.wl_invoice_submit_success_v2_tip));
            } else {
                ((TextView) view.findViewById(R.id.tv_submit_tip)).setText(getString(R.string.wl_invoice_submit_success_tip));
            }
        } else {
            ((RelativeLayout) view.findViewById(R.id.rl_inVoice_wait)).setVisibility(8);
            ((RelativeLayout) view.findViewById(R.id.rl_inVoice_success)).setVisibility(0);
            if (zAreEqual) {
                ((TextView) view.findViewById(R.id.tv_submit_success)).setText(getString(R.string.wl_invoice_has_complete_v2));
                ((Button) view.findViewById(R.id.tv_click_download)).setVisibility(8);
            } else {
                ((TextView) view.findViewById(R.id.tv_submit_success)).setText(getString(R.string.wl_invoice_has_complete));
                ((Button) view.findViewById(R.id.tv_click_download)).setVisibility(0);
            }
        }
        ((Button) view.findViewById(R.id.tv_click_download)).setOnClickListener(new View.OnClickListener() { // from class: b45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MiCheckInVoiceFragment.b(this.a, view2);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mi_check_in_voice, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.inVoiceAddress = arguments == null ? null : arguments.getString(BusConstKt.KEY_INVOICE_ADDRESS);
        Bundle arguments2 = getArguments();
        this.inVoiceVersion = arguments2 != null ? arguments2.getString(BusConstKt.KEY_INVOICE_VERSION) : null;
        initView(view);
    }
}
