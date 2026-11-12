package com.xiaomi.fitness.electronic.scale.export;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/EcoDialogHelper;", "", "showDialog", "", "context", "Landroidx/fragment/app/FragmentActivity;", "inviter", "", "pIcon", "inviteCallback", "Lcom/xiaomi/fitness/electronic/scale/export/InviteCallback;", "showConnectDialogForUnbindMember", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "showWeightErrorDialog", "errorType", "", "Companion", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDialogHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/EcoDialogHelper$Companion;", "", "<init>", "()V", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void showConnectDialogForUnbindMember(@NotNull BaseActivity activity);

    void showDialog(@NotNull FragmentActivity context, @NotNull String inviter, @Nullable String pIcon, @NotNull InviteCallback inviteCallback);

    void showWeightErrorDialog(@NotNull BaseActivity activity, int errorType);
}
