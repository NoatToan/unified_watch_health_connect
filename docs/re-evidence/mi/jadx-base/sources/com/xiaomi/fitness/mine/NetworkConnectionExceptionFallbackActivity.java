package com.xiaomi.fitness.mine;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.NetworkConnectionExceptionFallbackActivity;
import defpackage.rui;
import defpackage.z1g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/mine/NetworkConnectionExceptionFallbackActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/mine/MineViewModel;", "Lz1g;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NetworkConnectionExceptionFallbackActivity extends BaseBindingActivity<MineViewModel, z1g> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_STATUS = "status";

    @NotNull
    private static final String KEY_TITLE = "title";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/mine/NetworkConnectionExceptionFallbackActivity$Companion;", "", "<init>", "()V", "KEY_TITLE", "", "KEY_STATUS", "goToNetworkConnectionExceptionFallbackPage", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "title", "statusStr", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void goToNetworkConnectionExceptionFallbackPage$default(Companion companion, FragmentActivity fragmentActivity, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.goToNetworkConnectionExceptionFallbackPage(fragmentActivity, str, str2);
        }

        public final void goToNetworkConnectionExceptionFallbackPage(@NotNull FragmentActivity fragmentActivity, @Nullable String title, @Nullable String statusStr) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            Intent intent = new Intent(fragmentActivity, (Class<?>) NetworkConnectionExceptionFallbackActivity.class);
            intent.putExtra("title", title);
            intent.putExtra("status", statusStr);
            fragmentActivity.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(NetworkConnectionExceptionFallbackActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.lambda$onCreate$0();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return rui.q;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("title") : null;
        if (stringExtra != null) {
            setTitle(stringExtra);
        }
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra("status") : null;
        if (stringExtra2 != null) {
            getMBinding().A.setText(stringExtra2);
        }
        ViewExtKt.clickWithTrigger$default(getMBinding().A, 0L, new Function1() { // from class: akg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NetworkConnectionExceptionFallbackActivity.onCreate$lambda$0(this.f1131a, (TextView) obj);
            }
        }, 1, null);
    }
}
