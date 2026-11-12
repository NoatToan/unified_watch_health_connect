package com.xiaomi.fitness.relative.export;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudKey;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.relative.export.RelativeCareAccessImpl;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.RelativeShipRequest;
import com.xiaomi.fitness.relative.ui.ConfirmUserInfoActivity;
import com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity;
import com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity;
import com.xiaomi.fitness.relative.ui.DataSharedByTAActivity;
import com.xiaomi.fitness.relative.ui.MyQRCodeActivity;
import com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity;
import com.xiaomi.fitness.relative.ui.RelativeDataSettingsActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001eH\u0016J\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u001eH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\"\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u001b0\u001a2\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH\u0016J3\u0010)\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010*\u001a\u0004\u0018\u00010\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010,J\u0012\u0010-\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010.\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001eH\u0002J\u0018\u00101\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/relative/export/RelativeCareAccessImpl;", "Lcom/xiaomi/fitness/relative/export/IRelativeCareAccessApi;", "<init>", "()V", "relationshipRepository", "Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "getRelationshipRepository", "()Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "relationshipRepository$delegate", "Lkotlin/Lazy;", "goToRelativeCareHomePage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "goToRelativeDataSettingPage", "Landroid/app/Activity;", "relativeUid", "", "relativeNode", "", "goToAcceptInvitation", "context", "Landroid/content/Context;", "msgModel", "Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "goToRefuseInvitation", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "goToAcceptAppliedSharedDataTypes", "Lcom/xiaomi/fitness/relative/export/SharedDataTypeMsgModel;", "goToRefuseAppliedSharedDataTypes", "validateAppliedSharedDataTypes", "getIntentToConfirmUserInfoPage", "Landroid/content/Intent;", "srcIntent", "getSharedDataTypesToMe", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "relativeId", "goToMyRelativeCareQrCodePage", "goToConfirmUserinfoPage", "inviteLinkId", "qrCodeId", "(Landroid/app/Activity;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getIntentForFamilyService", "getIntentForRelativeCareHomePage", "hasOnGoingRelativeRelationship", "goToDataRequestedByTAActivity", "goToDataAccessibleToTAActivity", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeCareAccessImpl implements IRelativeCareAccessApi {

    @NotNull
    public static final String TAG = "RelativeCareAccessImpl";

    /* JADX INFO: renamed from: relationshipRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy relationshipRepository = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tdk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeCareAccessImpl.relationshipRepository_delegate$lambda$0();
        }
    });

    private final RelativeShipRequest getRelationshipRepository() {
        return (RelativeShipRequest) this.relationshipRepository.getValue();
    }

    private final void goToDataAccessibleToTAActivity(Context context, InvitationMsgModel msgModel) {
        Intent intent = new Intent(context, (Class<?>) DataAccessibleToTAActivity.class);
        intent.putExtra("key_relative_uid", msgModel.getRelativeId());
        intent.putExtra(RelativeCareConstants.KEY_INVITE_ID, msgModel.getInviteId());
        intent.putExtra(RelativeCareConstants.KEY_MSG_ID, msgModel.getMsgId());
        context.startActivity(intent);
    }

    private final void goToDataRequestedByTAActivity(Context context, SharedDataTypeMsgModel msgModel) {
        List<HomeDataType> listConvertToHomeDataTypes = CloudKey.INSTANCE.convertToHomeDataTypes(msgModel.getAuthKeys());
        if (listConvertToHomeDataTypes == null) {
            throw new IllegalArgumentException("goToAcceptAppliedSharedDataTypes: no authType");
        }
        Intent intent = new Intent(context, (Class<?>) DataRequestedByTAActivity.class);
        intent.putExtra("key_relative_uid", msgModel.getRelativeId());
        intent.putParcelableArrayListExtra(RelativeCareConstants.KEY_AUTH_DATA_LIST, new ArrayList<>(listConvertToHomeDataTypes));
        intent.putExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME, msgModel.getNickName());
        intent.putExtra(RelativeCareConstants.KEY_MSG_ID, msgModel.getMsgId());
        intent.putExtra(RelativeCareConstants.KEY_INVITE_ID, msgModel.getInviteId());
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasOnGoingRelativeRelationship$lambda$2(RelativeResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Collection collection = (Collection) it.getData();
        return !(collection == null || collection.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeShipRequest relationshipRepository_delegate$lambda$0() {
        return RelativeShipRequest.INSTANCE.getInstance();
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public Intent getIntentForFamilyService(@Nullable Intent srcIntent) {
        Intent intentForRelativeCareHomePage$default;
        Uri data;
        String queryParameter = (srcIntent == null || (data = srcIntent.getData()) == null) ? null : data.getQueryParameter("key_relative_uid");
        if (queryParameter == null) {
            return IRelativeCareAccessApi.DefaultImpls.getIntentForRelativeCareHomePage$default(this, null, 1, null);
        }
        long j = Long.parseLong(queryParameter);
        Uri data2 = srcIntent.getData();
        String queryParameter2 = data2 != null ? data2.getQueryParameter("key_relative_note") : null;
        Uri data3 = srcIntent.getData();
        String queryParameter3 = data3 != null ? data3.getQueryParameter("origin") : null;
        Uri data4 = srcIntent.getData();
        String queryParameter4 = data4 != null ? data4.getQueryParameter(RelativeCareConstants.KEY_FAMILY_SERVICE_SHARE_STATUS) : null;
        Logger.i(TAG, "getIntentForFamilyServiceShare relativeUid=" + queryParameter + " origin=" + queryParameter3 + " KEY_FAMILY_SERVICE_SHARE_STATUS=" + queryParameter4);
        Integer numValueOf = queryParameter4 != null ? Integer.valueOf(Integer.parseInt(queryParameter4)) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            intentForRelativeCareHomePage$default = new Intent(ApplicationExtKt.getApplication(), (Class<?>) DataAccessibleToTAActivity.class);
            intentForRelativeCareHomePage$default.putExtra("origin", queryParameter3);
            Intrinsics.checkNotNull(intentForRelativeCareHomePage$default.putExtra("key_relative_uid", j));
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            intentForRelativeCareHomePage$default = new Intent(ApplicationExtKt.getApplication(), (Class<?>) DataSharedByTAActivity.class);
            intentForRelativeCareHomePage$default.putExtra("origin", queryParameter3);
            Intrinsics.checkNotNull(intentForRelativeCareHomePage$default.putExtra("key_relative_uid", j));
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            if (queryParameter2 == null || StringsKt__StringsKt.isBlank(queryParameter2)) {
                queryParameter2 = String.valueOf(j);
            }
            intentForRelativeCareHomePage$default = HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getIntentForRelativeHealthPage(j, queryParameter2, queryParameter3);
        } else {
            intentForRelativeCareHomePage$default = IRelativeCareAccessApi.DefaultImpls.getIntentForRelativeCareHomePage$default(this, null, 1, null);
        }
        intentForRelativeCareHomePage$default.setFlags(268468224);
        return intentForRelativeCareHomePage$default;
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public Intent getIntentForRelativeCareHomePage(@Nullable Intent srcIntent) {
        Uri data;
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) RelativeCareHomePageActivity.class);
        String queryParameter = (srcIntent == null || (data = srcIntent.getData()) == null) ? null : data.getQueryParameter("origin");
        if (queryParameter != null) {
            intent.putExtra("origin", queryParameter);
        }
        if (queryParameter == null) {
            queryParameter = "";
        }
        Logger.i(TAG, "getIntentForRelativeCareHomePage origin=" + queryParameter);
        intent.setFlags(268468224);
        return intent;
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public Intent getIntentToConfirmUserInfoPage(@Nullable Intent srcIntent) {
        Uri data;
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) ConfirmUserInfoActivity.class);
        String queryParameter = (srcIntent == null || (data = srcIntent.getData()) == null) ? null : data.getQueryParameter(RelativeCareConstants.KEY_INVITE_LINK_ID);
        Logger.i(TAG, "getIntentToConfirmUserInfoPage inviteLinkId=" + queryParameter);
        if (queryParameter != null) {
            intent.putExtra(RelativeCareConstants.KEY_INVITE_LINK_ID, Long.parseLong(queryParameter));
        }
        intent.setFlags(268468224);
        return intent;
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public LiveData<RelativeResult<List<HomeDataType>>> getSharedDataTypesToMe(long relativeId) {
        return getRelationshipRepository().getSharedDataTypesToMe(relativeId);
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    public void goToAcceptAppliedSharedDataTypes(@NotNull Context context, @NotNull SharedDataTypeMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        goToDataRequestedByTAActivity(context, msgModel);
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    public void goToAcceptInvitation(@NotNull Context context, @NotNull InvitationMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        goToDataAccessibleToTAActivity(context, msgModel);
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    public void goToConfirmUserinfoPage(@NotNull Activity activity, @Nullable Long relativeUid, @Nullable Long inviteLinkId, @Nullable Long qrCodeId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) ConfirmUserInfoActivity.class);
        intent.putExtra("key_relative_uid", relativeUid);
        intent.putExtra(RelativeCareConstants.KEY_INVITE_LINK_ID, inviteLinkId);
        intent.putExtra(RelativeCareConstants.KEY_QR_CODE_ID, qrCodeId);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    public void goToMyRelativeCareQrCodePage(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) MyQRCodeActivity.class));
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public LiveData<RelativeResult<Boolean>> goToRefuseAppliedSharedDataTypes(@NotNull Context context, @NotNull SharedDataTypeMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        List<HomeDataType> listConvertToHomeDataTypes = CloudKey.INSTANCE.convertToHomeDataTypes(msgModel.getAuthKeys());
        if (listConvertToHomeDataTypes != null) {
            return getRelationshipRepository().refuseAppliedSharedDataTypes(msgModel.getRelativeId(), msgModel.getMsgId(), msgModel.getInviteId(), listConvertToHomeDataTypes);
        }
        throw new IllegalArgumentException("goToRefuseAppliedSharedDataTypes: no authType");
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public LiveData<RelativeResult<Boolean>> goToRefuseInvitation(@NotNull Context context, @NotNull InvitationMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        return getRelationshipRepository().refuseInvitation(msgModel.getMsgId(), msgModel.getInviteId());
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    public void goToRelativeCareHomePage(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) RelativeCareHomePageActivity.class));
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    public void goToRelativeDataSettingPage(@NotNull Activity activity, long relativeUid, @NotNull String relativeNode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        Intent intent = new Intent(activity, (Class<?>) RelativeDataSettingsActivity.class);
        intent.putExtra("key_relative_uid", relativeUid);
        intent.putExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME, relativeNode);
        activity.startActivityForResult(intent, 1);
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public LiveData<Boolean> hasOnGoingRelativeRelationship() {
        return Transformations.map(getRelationshipRepository().getRelativeList(), new Function1() { // from class: sdk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(RelativeCareAccessImpl.hasOnGoingRelativeRelationship$lambda$2((RelativeResult) obj));
            }
        });
    }

    @Override // com.xiaomi.fitness.relative.export.IRelativeCareAccessApi
    @NotNull
    public LiveData<RelativeResult<Boolean>> validateAppliedSharedDataTypes(@NotNull SharedDataTypeMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        return getRelationshipRepository().validateAppliedSharedDataTypes(msgModel.getRelativeId(), msgModel.getInviteId());
    }
}
