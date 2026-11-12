package com.huami.widget.share.dialog;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.share.internal.ShareConstants;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.widget.share.R;
import com.huami.widget.share.config.ShareKitConfig;
import com.huami.widget.share.dialog.SuccessDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\tH\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/widget/share/dialog/SuccessDialogFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "e", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "initView", "", "hasBackground", "hasPadding", "", "Ljava/lang/String;", "mPostId", "<init>", "()V", "Companion", "share_release"}, k = 1, mv = {1, 5, 1})
public final class SuccessDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "com.xiaomi.hm.health";

    @NotNull
    private static final String g = "com.xiaomi.hm.health.discovery.WebActivity";

    @NotNull
    private static final String h = "com.xiaomi.hm.health.action.WEB_URL";

    @NotNull
    private static final String i = "postID";

    @NotNull
    private static final String j = "item";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String mPostId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/widget/share/dialog/SuccessDialogFragment$Companion;", "", "", ShareConstants.RESULT_POST_ID, "Lcom/huami/widget/share/dialog/SuccessDialogFragment;", "newInstance", "ARG_ID", "Ljava/lang/String;", ShareConstants.PAGE_ID, "WEB_ACTIVITY_EXTRA", "WEB_ACTIVITY_NAME", "WEB_ACTIVITY_PACKAGE", "<init>", "()V", "share_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SuccessDialogFragment newInstance(@NotNull String postId) {
            Bundle bundle = new Bundle();
            bundle.putString(SuccessDialogFragment.i, postId);
            SuccessDialogFragment successDialogFragment = new SuccessDialogFragment();
            successDialogFragment.setArguments(bundle);
            return successDialogFragment;
        }
    }

    private final void e() {
        Function2<Context, String, Unit> fitTimeNavigator = ShareKitConfig.INSTANCE.getFitTimeNavigator();
        if (fitTimeNavigator != null) {
            fitTimeNavigator.invoke(requireContext(), this.mPostId);
            return;
        }
        ComponentName componentName = new ComponentName(f, g);
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setComponent(componentName);
        intent.putExtra(h, HMServerDef.getRestfulCircleUrl(j, this.mPostId));
        requireContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SuccessDialogFragment successDialogFragment, View view) {
        successDialogFragment.e();
        successDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SuccessDialogFragment successDialogFragment, View view) {
        successDialogFragment.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        setGravity(17);
        View viewInflate = View.inflate(getContext(), R.layout.dialog_success, null);
        viewInflate.findViewById(R.id.go).setOnClickListener(new View.OnClickListener() { // from class: ii7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuccessDialogFragment.f(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: ji7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuccessDialogFragment.g(this.a, view);
            }
        });
        setCancelable(false);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mPostId = arguments.getString(i);
        }
    }
}
