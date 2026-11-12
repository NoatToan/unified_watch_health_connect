package com.xiaomi.fitness.mine.export;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J0\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0012H&J\u001e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0017J&\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\tH&¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/mine/export/MineSettingManager;", "", "showWebSyncDialogIfNeed", "", "context", "Landroidx/fragment/app/FragmentActivity;", "action", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "goToAidongCoursePaymentPage", "", "getAidongMemberExpireTimestamp", "success", "Lkotlin/Function1;", "", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "showAidongMemberPaymentEntrance", "goToAuthConfigListActivityAsTaskTop", "Landroid/content/Context;", "getThirdPartyAuthStatus", "thirdPartyType", "", q.f13858b, "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setThirdPartyAuth", "authStatus", "(IJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIntentToMyEventsPage", "Landroid/content/Intent;", "addMyCampaignsShortcut", "Companion", "mine-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MineSettingManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/mine/export/MineSettingManager$Companion;", "", "<init>", "()V", "mine-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addMyCampaignsShortcut();

    void getAidongMemberExpireTimestamp(@NotNull Function1<? super Long, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    @NotNull
    Intent getIntentToMyEventsPage();

    @Nullable
    Object getThirdPartyAuthStatus(int i, long j, @NotNull Continuation<? super Boolean> continuation);

    void goToAidongCoursePaymentPage();

    void goToAuthConfigListActivityAsTaskTop(@NotNull Context context);

    @Nullable
    Object setThirdPartyAuth(int i, long j, boolean z, @NotNull Continuation<? super Boolean> continuation);

    boolean showAidongMemberPaymentEntrance();

    boolean showWebSyncDialogIfNeed(@NotNull FragmentActivity context, @NotNull IWebSync action);
}
