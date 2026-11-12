package com.huami.account.ui.register;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.huami.account.event.EventRegisterErrorTipExit;
import com.huami.account.ui.R;
import com.huami.account.ui.register.RegErrorActionTipFragment;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.model.WebItem;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\bH\u0014¨\u0006\u000e"}, d2 = {"Lcom/huami/account/ui/register/RegErrorActionTipFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "initView", "", "hasPadding", "hasBackground", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class RegErrorActionTipFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String e = "hrefUrl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/account/ui/register/RegErrorActionTipFragment$Companion;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", RegErrorActionTipFragment.e, "", "show", "ARG_HREF_URL", "Ljava/lang/String;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void show(@NotNull FragmentManager fragmentManager, @NotNull String hrefUrl) {
            Bundle bundle = new Bundle();
            bundle.putString(RegErrorActionTipFragment.e, hrefUrl);
            RegErrorActionTipFragment regErrorActionTipFragment = new RegErrorActionTipFragment();
            regErrorActionTipFragment.setArguments(bundle);
            regErrorActionTipFragment.show(fragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RegErrorActionTipFragment regErrorActionTipFragment, View view) {
        regErrorActionTipFragment.dismiss();
        EventBus.getDefault().postSticky(new EventRegisterErrorTipExit());
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        Bundle arguments = getArguments();
        String string = arguments == null ? null : arguments.getString(e);
        if (string == null) {
            throw new IllegalStateException();
        }
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_custom_action_tip_dialog, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_known_it);
        getChildFragmentManager().beginTransaction().replace(R.id.web_container, WebFragment.newInstance(new WebItem(string))).commit();
        textView.setOnClickListener(new View.OnClickListener() { // from class: oa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegErrorActionTipFragment.d(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }
}
