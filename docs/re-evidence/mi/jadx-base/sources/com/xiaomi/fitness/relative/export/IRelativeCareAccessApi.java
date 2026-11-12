package com.xiaomi.fitness.relative.export;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0016H&J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0016H&J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0016H&J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&J\"\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00130\u00122\u0006\u0010\u001f\u001a\u00020\tH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J9\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&J\u0014\u0010&\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/relative/export/IRelativeCareAccessApi;", "", "goToRelativeCareHomePage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "goToRelativeDataSettingPage", "Landroid/app/Activity;", "relativeUid", "", "relativeNode", "", "goToAcceptInvitation", "context", "Landroid/content/Context;", "msgModel", "Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "goToRefuseInvitation", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "goToAcceptAppliedSharedDataTypes", "Lcom/xiaomi/fitness/relative/export/SharedDataTypeMsgModel;", "goToRefuseAppliedSharedDataTypes", "validateAppliedSharedDataTypes", "getIntentToConfirmUserInfoPage", "Landroid/content/Intent;", "srcIntent", "getSharedDataTypesToMe", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "relativeId", "goToMyRelativeCareQrCodePage", "goToConfirmUserinfoPage", "inviteLinkId", "qrCodeId", "(Landroid/app/Activity;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getIntentForFamilyService", "getIntentForRelativeCareHomePage", "hasOnGoingRelativeRelationship", "Companion", "relative-care-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRelativeCareAccessApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/relative/export/IRelativeCareAccessApi$Companion;", "", "<init>", "()V", "relative-care-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Intent getIntentForRelativeCareHomePage$default(IRelativeCareAccessApi iRelativeCareAccessApi, Intent intent, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntentForRelativeCareHomePage");
            }
            if ((i & 1) != 0) {
                intent = null;
            }
            return iRelativeCareAccessApi.getIntentForRelativeCareHomePage(intent);
        }

        public static /* synthetic */ void goToConfirmUserinfoPage$default(IRelativeCareAccessApi iRelativeCareAccessApi, Activity activity, Long l, Long l2, Long l3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToConfirmUserinfoPage");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            if ((i & 4) != 0) {
                l2 = null;
            }
            if ((i & 8) != 0) {
                l3 = null;
            }
            iRelativeCareAccessApi.goToConfirmUserinfoPage(activity, l, l2, l3);
        }
    }

    @NotNull
    Intent getIntentForFamilyService(@Nullable Intent srcIntent);

    @NotNull
    Intent getIntentForRelativeCareHomePage(@Nullable Intent srcIntent);

    @NotNull
    Intent getIntentToConfirmUserInfoPage(@Nullable Intent srcIntent);

    @NotNull
    LiveData<RelativeResult<List<HomeDataType>>> getSharedDataTypesToMe(long relativeId);

    void goToAcceptAppliedSharedDataTypes(@NotNull Context context, @NotNull SharedDataTypeMsgModel msgModel);

    void goToAcceptInvitation(@NotNull Context context, @NotNull InvitationMsgModel msgModel);

    void goToConfirmUserinfoPage(@NotNull Activity activity, @Nullable Long relativeUid, @Nullable Long inviteLinkId, @Nullable Long qrCodeId);

    void goToMyRelativeCareQrCodePage(@NotNull Activity activity);

    @NotNull
    LiveData<RelativeResult<Boolean>> goToRefuseAppliedSharedDataTypes(@NotNull Context context, @NotNull SharedDataTypeMsgModel msgModel);

    @NotNull
    LiveData<RelativeResult<Boolean>> goToRefuseInvitation(@NotNull Context context, @NotNull InvitationMsgModel msgModel);

    void goToRelativeCareHomePage(@NotNull FragmentActivity activity);

    void goToRelativeDataSettingPage(@NotNull Activity activity, long relativeUid, @NotNull String relativeNode);

    @NotNull
    LiveData<Boolean> hasOnGoingRelativeRelationship();

    @NotNull
    LiveData<RelativeResult<Boolean>> validateAppliedSharedDataTypes(@NotNull SharedDataTypeMsgModel msgModel);
}
