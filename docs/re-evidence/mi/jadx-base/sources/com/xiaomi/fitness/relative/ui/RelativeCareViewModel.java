package com.xiaomi.fitness.relative.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.account.api.bean.QrInfo;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.RelativeShipRequest;
import com.xiaomi.fitness.relative.server.model.AcceptInvitationModel;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.server.model.RelativeSetting;
import com.xiaomi.fitness.relative.server.model.RelativeUserInfo;
import com.xiaomi.fitness.relative.server.model.SendInvitationModel;
import com.xiaomi.fitness.relative.server.model.TopicSubscriptions;
import com.xiaomi.fitness.relative.ui.RelativeCareViewModel;
import commi.health.message.center.export.IMessageCenter;
import commi.health.message.center.export.MessageCenterExtKt;
import defpackage.aoi;
import defpackage.kfi;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000bJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\f0\u000bJ;\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\f0\u000bJ \u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u0017J \u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u0017J(\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\rJ.\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\r0\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\rJ(\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\rJ\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u0017J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010)\u001a\u00020%J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\f0\u000bJ\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bJ(\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\rJ.\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\r0\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\f\u00100\u001a\b\u0012\u0004\u0012\u00020%0\rJ*\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u00100\u001a\u00020%2\u0006\u00102\u001a\u000203JH\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00172\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\rJ\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b2\u0006\u0010:\u001a\u00020;J\"\u0010<\u001a\u00020=2\u0006\u0010\u0019\u001a\u00020\u00172\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020=0?J\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u000bJ \u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00100K¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "relationshipRequest", "Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "getRelationshipRequest", "()Lcom/xiaomi/fitness/relative/server/RelativeShipRequest;", "relationshipRequest$delegate", "Lkotlin/Lazy;", "getRelativeList", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "sendInvitation", "", "sendRelativeInviteModel", "Lcom/xiaomi/fitness/relative/server/model/SendInvitationModel;", "getFamilyMembersLiveData", "Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "getUserInfoByUid", "uid", "", "inviteLinkId", "qrCodeId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "getUniqueInvitationIdLiveData", "getSharedDataTypesToRelativeLiveData", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "relativeId", "getSharedDataTypesToMeLiveData", "updateSharedDataTypes", "dataTypes", "getRelativeSettings", "Lcom/xiaomi/fitness/relative/server/model/RelativeSetting;", "keys", "", "upRelativeSettings", "deleteRelativeShip", "modifyRelativeNode", "relativeNode", "getPersonalQrCodeLiveData", "Lcom/xiaomi/fitness/account/api/bean/QrInfo;", "showNewMsgDotEnableLiveData", "applySharedDataTypes", "getTopicSubscriptions", "Lcom/xiaomi/fitness/relative/server/model/TopicSubscriptions;", "topic", "upTopicSubscriptions", "act", "", "acceptAppliedSharedDataTypes", "msgId", PkConstants.PARAM_INVITE_ID, "appliedTypes", "confirmedTypes", "acceptInvitation", "model", "Lcom/xiaomi/fitness/relative/server/model/AcceptInvitationModel;", "createMyQrCodeBitmap", "", "drawQrCode", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "getMyUserInfoLiveData", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getAppliedSharedDataTypes", "connectionStatusLiveData", "Landroidx/lifecycle/MutableLiveData;", "getConnectionStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeCareViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "RelativeCareViewModel";
    public UserInfoManager mUserInfoManager;

    /* JADX INFO: renamed from: relationshipRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy relationshipRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hgk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RelativeCareViewModel.relationshipRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<Boolean> connectionStatusLiveData = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.ui.RelativeCareViewModel$getMyUserInfoLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.ui.RelativeCareViewModel$getMyUserInfoLiveData$1", f = "RelativeCareViewModel.kt", i = {}, l = {177, 177}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<AccountCoreInfo>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RelativeCareViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<AccountCoreInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            UserInfoManager mUserInfoManager = RelativeCareViewModel.this.getMUserInfoManager();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = UserInfoManager.getMiAccountCoreInfo$default(mUserInfoManager, false, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.ui.RelativeCareViewModel$showNewMsgDotEnableLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.relative.ui.RelativeCareViewModel$showNewMsgDotEnableLiveData$1", f = "RelativeCareViewModel.kt", i = {}, l = {112, 112}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27981 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C27981(Continuation<? super C27981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27981 c27981 = new C27981(continuation);
            c27981.L$0 = obj;
            return c27981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C27981) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            IMessageCenter instance = MessageCenterExtKt.getINSTANCE(IMessageCenter.INSTANCE);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = instance.showNewMsgDotEnable(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.graphics.Bitmap, java.lang.Object] */
    public static final void createMyQrCodeBitmap$lambda$1(Ref.ObjectRef bitmap, String qrCodeUrl, Bitmap bitmap2, Function1 drawQrCode) {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(qrCodeUrl, "$qrCodeUrl");
        Intrinsics.checkNotNullParameter(drawQrCode, "$drawQrCode");
        ?? C = kfi.c(qrCodeUrl, ExtUtilsKt.getDp(Float.valueOf(200.0f)), -16777216, bitmap2);
        bitmap.element = C;
        drawQrCode.invoke2(C);
    }

    private final RelativeShipRequest getRelationshipRequest() {
        return (RelativeShipRequest) this.relationshipRequest.getValue();
    }

    public static /* synthetic */ LiveData getUserInfoByUid$default(RelativeCareViewModel relativeCareViewModel, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            l3 = null;
        }
        return relativeCareViewModel.getUserInfoByUid(l, l2, l3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeShipRequest relationshipRequest_delegate$lambda$0() {
        return RelativeShipRequest.INSTANCE.getInstance();
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> acceptAppliedSharedDataTypes(long relativeId, long msgId, long inviteId, @NotNull List<? extends HomeDataType> appliedTypes, @Nullable List<? extends HomeDataType> confirmedTypes) {
        Intrinsics.checkNotNullParameter(appliedTypes, "appliedTypes");
        return getRelationshipRequest().acceptAppliedSharedDataTypes(relativeId, msgId, inviteId, appliedTypes, confirmedTypes);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> acceptInvitation(@NotNull AcceptInvitationModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getRelationshipRequest().acceptInvitation(model);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> applySharedDataTypes(long relativeId, @NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return getRelationshipRequest().applySharedDataTypes(relativeId, dataTypes);
    }

    public final void createMyQrCodeBitmap(long qrCodeId, @NotNull final Function1<? super Bitmap, Unit> drawQrCode) {
        Intrinsics.checkNotNullParameter(drawQrCode, "drawQrCode");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), aoi.c);
        final String str = "com.mi.health://relativecare/qrcodeid/" + qrCodeId;
        ExecutorHelper.runInBackground(new Runnable() { // from class: fgk
            @Override // java.lang.Runnable
            public final void run() {
                RelativeCareViewModel.createMyQrCodeBitmap$lambda$1(objectRef, str, bitmapDecodeResource, drawQrCode);
            }
        });
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> deleteRelativeShip(long relativeId) {
        return getRelationshipRequest().deleteRelative(relativeId);
    }

    @NotNull
    public final LiveData<RelativeResult<List<HomeDataType>>> getAppliedSharedDataTypes(long relativeId) {
        return getRelationshipRequest().getAppliedSharedDataTypes(relativeId);
    }

    @NotNull
    public final MutableLiveData<Boolean> getConnectionStatusLiveData() {
        return this.connectionStatusLiveData;
    }

    @NotNull
    public final LiveData<RelativeResult<List<AccountUserInfo>>> getFamilyMembersLiveData() {
        return getRelationshipRequest().getFamilyMembers();
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final LiveData<AccountCoreInfo> getMyUserInfoLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<RelativeResult<QrInfo>> getPersonalQrCodeLiveData() {
        return getRelationshipRequest().getPersonalQrCode();
    }

    @NotNull
    public final LiveData<RelativeResult<List<RelativeUserInfo>>> getRelativeList() {
        return getRelationshipRequest().getRelativeList();
    }

    @NotNull
    public final LiveData<RelativeResult<List<RelativeSetting>>> getRelativeSettings(long relativeId, @NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return getRelationshipRequest().getRelativeSettings(relativeId, keys);
    }

    @NotNull
    public final LiveData<RelativeResult<List<HomeDataType>>> getSharedDataTypesToMeLiveData(long relativeId) {
        return getRelationshipRequest().getSharedDataTypesToMe(relativeId);
    }

    @NotNull
    public final LiveData<RelativeResult<List<HomeDataType>>> getSharedDataTypesToRelativeLiveData(long relativeId) {
        return getRelationshipRequest().getSharedDataTypesToRelative(relativeId);
    }

    @NotNull
    public final LiveData<RelativeResult<List<TopicSubscriptions>>> getTopicSubscriptions(long relativeId, @NotNull List<String> topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return getRelationshipRequest().getTopicSubscriptions(relativeId, topic);
    }

    @NotNull
    public final LiveData<RelativeResult<Long>> getUniqueInvitationIdLiveData() {
        return getRelationshipRequest().getInviteLinkId();
    }

    @NotNull
    public final LiveData<RelativeResult<AccountUserInfo>> getUserInfoByUid(@Nullable Long uid, @Nullable Long inviteLinkId, @Nullable Long qrCodeId) {
        return getRelationshipRequest().getUserInfoByUid(uid, inviteLinkId, qrCodeId);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> modifyRelativeNode(long relativeId, @NotNull String relativeNode) {
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        return getRelationshipRequest().modifyRelativeNode(relativeId, relativeNode);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> sendInvitation(@NotNull SendInvitationModel sendRelativeInviteModel) {
        Intrinsics.checkNotNullParameter(sendRelativeInviteModel, "sendRelativeInviteModel");
        return getRelationshipRequest().sendInvitation(sendRelativeInviteModel);
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    @NotNull
    public final LiveData<Boolean> showNewMsgDotEnableLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C27981(null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> upRelativeSettings(long relativeId, @NotNull List<RelativeSetting> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return getRelationshipRequest().upRelativeSettings(relativeId, keys);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> upTopicSubscriptions(long relativeId, @NotNull String topic, int act) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return getRelationshipRequest().updateTopicSubscription(relativeId, topic, act);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> updateSharedDataTypes(long relativeId, @NotNull List<? extends HomeDataType> dataTypes) {
        Intrinsics.checkNotNullParameter(dataTypes, "dataTypes");
        return getRelationshipRequest().updateSharedDataTypes(relativeId, dataTypes);
    }
}
