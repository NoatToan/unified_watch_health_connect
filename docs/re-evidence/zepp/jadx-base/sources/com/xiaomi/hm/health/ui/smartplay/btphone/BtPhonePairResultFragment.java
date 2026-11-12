package com.xiaomi.hm.health.ui.smartplay.btphone;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhonePairResultFragment;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhonePairResultFragment;", "Landroidx/fragment/app/Fragment;", "", "c", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onActivityCreated", "com/xiaomi/hm/health/ui/smartplay/btphone/BtPhonePairResultFragment$onBackCallback$1", "a", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhonePairResultFragment$onBackCallback$1;", "onBackCallback", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhonePairResultFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "pair_status";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BtPhonePairResultFragment$onBackCallback$1 onBackCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhonePairResultFragment$Companion;", "", "", "pairResult", "Landroid/os/Bundle;", "getArguments", "", "EXTRA_PAIR_STATUS", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle getArguments(boolean pairResult) {
            return BundleKt.bundleOf(TuplesKt.to(BtPhonePairResultFragment.b, Boolean.valueOf(pairResult)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.hm.health.ui.smartplay.btphone.BtPhonePairResultFragment$onBackCallback$1] */
    public BtPhonePairResultFragment() {
        super(R.layout.fragment_bt_phone_pair_result);
        this.onBackCallback = new OnBackPressedCallback() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhonePairResultFragment$onBackCallback$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentKt.findNavController(this.a).navigate(R.id.pair_result_back_to_bt_phone);
            }
        };
    }

    private final void b() {
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.pair_result_iv))).setImageResource(R.drawable.bt_phone_pair_fail);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.bt_phone_tv))).setText(R.string.bt_phone_pair_fail_tips);
        View view3 = getView();
        ViewExKt.setVisible(view3 != null ? view3.findViewById(com.xiaomi.hm.health.R.id.bt_phone_tips_tv) : null, true);
    }

    private final void c() {
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.pair_result_iv))).setImageResource(R.drawable.bt_phone_pair_success);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.bt_phone_tv))).setText(R.string.bt_phone_pair_success);
        View view3 = getView();
        ViewExKt.setVisible(view3 != null ? view3.findViewById(com.xiaomi.hm.health.R.id.bt_phone_tips_tv) : null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BtPhonePairResultFragment btPhonePairResultFragment, View view) {
        FragmentKt.findNavController(btPhonePairResultFragment).navigate(R.id.pair_result_back_to_bt_phone);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        if (arguments.getBoolean(b, false)) {
            c();
        } else {
            b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((RainbowTitleBar) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.title_bar))).setNavigationOnClickListener(new View.OnClickListener() { // from class: z80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BtPhonePairResultFragment.d(this.a, view3);
            }
        });
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), this.onBackCallback);
    }
}
