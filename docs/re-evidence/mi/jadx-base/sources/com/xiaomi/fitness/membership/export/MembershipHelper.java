package com.xiaomi.fitness.membership.export;

import android.content.Context;
import com.xiaomi.fitness.membership.export.data.MembershipListResponse;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH&J\u0010\u0010\t\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012H¦@¢\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0005H&J\u001c\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0016H&J\u001c\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0016H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H&¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/membership/export/MembershipHelper;", "", "showVipPurchaseDialog", "", "contentSource", "", "showVipExpiredFaceDialog", "dismissAction", "Lkotlin/Function0;", "getVipList", "Lcom/xiaomi/fitness/membership/export/data/MembershipListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVipInfo", "Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "refresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOperationConfig", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "getMemberStatus", "addMemberStatusChangeListener", "callback", "Lkotlin/Function1;", "removeMemberStatusChangeListener", "onPay", "context", "Landroid/content/Context;", "jsonParams", "Companion", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MembershipHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/membership/export/MembershipHelper$Companion;", "", "<init>", "()V", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getVipInfo$default(MembershipHelper membershipHelper, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVipInfo");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return membershipHelper.getVipInfo(z, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showVipExpiredFaceDialog$default(MembershipHelper membershipHelper, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showVipExpiredFaceDialog");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            membershipHelper.showVipExpiredFaceDialog(function0);
        }
    }

    void addMemberStatusChangeListener(@NotNull Function1<? super Boolean, Unit> callback);

    @NotNull
    String getMemberStatus();

    @Nullable
    Object getOperationConfig(@NotNull Continuation<? super VipConfigInfo> continuation);

    @Nullable
    Object getVipInfo(boolean z, @NotNull Continuation<? super VipInfo> continuation);

    @Nullable
    Object getVipList(@NotNull Continuation<? super MembershipListResponse> continuation);

    void onPay(@NotNull Context context, @NotNull String jsonParams);

    void removeMemberStatusChangeListener(@NotNull Function1<? super Boolean, Unit> callback);

    void showVipExpiredFaceDialog(@Nullable Function0<Unit> dismissAction);

    void showVipPurchaseDialog(@NotNull String contentSource);
}
