package com.xiaomi.fitness.membership.dialog;

import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.membership.api.MembershipRequest;
import com.xiaomi.fitness.membership.dialog.MembershipDialogManager;
import com.xiaomi.fitness.membership.export.data.Membership;
import com.xiaomi.fitness.membership.export.data.MembershipListResponse;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceData;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceItem;
import com.xiaomi.fitness.membership.export.data.VipExpiredFaceResponse;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.onetrack.c.q;
import defpackage.k0j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ.\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015J,\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/membership/dialog/MembershipDialogManager;", "", "<init>", "()V", "mRequest", "Lcom/xiaomi/fitness/membership/api/MembershipRequest;", "requestMembershipDialog", "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "contentSource", "", "showMembershipDialog", "configInfo", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "comboList", "", "Lcom/xiaomi/fitness/membership/export/data/Membership;", "requestMembershipExpiredFaceDialog", "Landroidx/fragment/app/FragmentActivity;", "dismissAction", "Lkotlin/Function0;", "showMembershipExpiredFaceDialog", "checkVipExpiredFaceListData", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MembershipDialogManager {

    @NotNull
    public static final MembershipDialogManager INSTANCE = new MembershipDialogManager();

    @NotNull
    private static final MembershipRequest mRequest = new MembershipRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.dialog.MembershipDialogManager$requestMembershipDialog$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.dialog.MembershipDialogManager$requestMembershipDialog$1", f = "MembershipDialogManager.kt", i = {0, 1}, l = {33, 34}, m = "invokeSuspend", n = {"productJob", q.f13857a}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseActivity $activity;
        final /* synthetic */ String $contentSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseActivity baseActivity, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = baseActivity;
            this.$contentSource = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.$contentSource, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            VipConfigInfo vipConfigInfo;
            MembershipListResponse membershipListResponse;
            List<Membership> listEmptyList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    deferredAsync$default = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vipConfigInfo = (VipConfigInfo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                membershipListResponse = (MembershipListResponse) obj;
                if (membershipListResponse != null || (listEmptyList = membershipListResponse.getMembership()) == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                this.$activity.hideLoading();
                if (vipConfigInfo != null || listEmptyList.isEmpty()) {
                    ToastExtKt.toastShort(this.$activity, k0j.common_hint_unkonwn_error);
                    return Unit.INSTANCE;
                }
                MembershipDialogManager.INSTANCE.showMembershipDialog(this.$activity, this.$contentSource, vipConfigInfo, listEmptyList);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MembershipDialogManager$requestMembershipDialog$1$configJob$1(null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MembershipDialogManager$requestMembershipDialog$1$productJob$1(null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            obj = deferredAsync$default2.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            VipConfigInfo vipConfigInfo2 = (VipConfigInfo) obj;
            this.L$0 = vipConfigInfo2;
            this.label = 2;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            vipConfigInfo = vipConfigInfo2;
            obj = objAwait;
            membershipListResponse = (MembershipListResponse) obj;
            if (membershipListResponse != null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            this.$activity.hideLoading();
            if (vipConfigInfo != null) {
            }
            ToastExtKt.toastShort(this.$activity, k0j.common_hint_unkonwn_error);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.dialog.MembershipDialogManager$requestMembershipExpiredFaceDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.dialog.MembershipDialogManager$requestMembershipExpiredFaceDialog$1", f = "MembershipDialogManager.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function0<Unit> $dismissAction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26131(Function0<Unit> function0, FragmentActivity fragmentActivity, Continuation<? super C26131> continuation) {
            super(2, continuation);
            this.$dismissAction = function0;
            this.$activity = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26131 c26131 = new C26131(this.$dismissAction, this.$activity, continuation);
            c26131.L$0 = obj;
            return c26131;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VipExpiredFaceData membershipExpirePaidWatch;
            VipExpiredFaceData membershipExpirePaidWatch2;
            ArrayList<VipExpiredFaceItem> watchfaceList;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new MembershipDialogManager$requestMembershipExpiredFaceDialog$1$checkVipExpiredFaceListDataJob$1(null), 3, null);
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            VipExpiredFaceResponse vipExpiredFaceResponse = (VipExpiredFaceResponse) obj;
            if (vipExpiredFaceResponse != null && vipExpiredFaceResponse.getMembershipExpirePaidWatch() != null && (((membershipExpirePaidWatch = vipExpiredFaceResponse.getMembershipExpirePaidWatch()) == null || membershipExpirePaidWatch.getHasShowPopup() != 1) && ((membershipExpirePaidWatch2 = vipExpiredFaceResponse.getMembershipExpirePaidWatch()) == null || (watchfaceList = membershipExpirePaidWatch2.getWatchfaceList()) == null || !watchfaceList.isEmpty()))) {
                MembershipDialogManager.INSTANCE.showMembershipExpiredFaceDialog(this.$activity, vipExpiredFaceResponse.getMembershipExpirePaidWatch(), this.$dismissAction);
                return Unit.INSTANCE;
            }
            Function0<Unit> function0 = this.$dismissAction;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private MembershipDialogManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestMembershipExpiredFaceDialog$default(MembershipDialogManager membershipDialogManager, FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        membershipDialogManager.requestMembershipExpiredFaceDialog(fragmentActivity, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestMembershipExpiredFaceDialog$lambda$0(Function0 function0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMembershipDialog(BaseActivity activity, String contentSource, VipConfigInfo configInfo, List<Membership> comboList) {
        MembershipDialog.INSTANCE.newInstance(configInfo, comboList, contentSource).show(activity.getSupportFragmentManager(), "MembershipDialog");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.122.0.1.44620"), TuplesKt.to("name", "member_center_pop_up"), TuplesKt.to("source", contentSource), TuplesKt.to("detail", activity.getClass().getName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMembershipExpiredFaceDialog(FragmentActivity activity, VipExpiredFaceData checkVipExpiredFaceListData, Function0<Unit> dismissAction) {
        MembershipExpiredFaceDialog membershipExpiredFaceDialogNewInstance = MembershipExpiredFaceDialog.INSTANCE.newInstance(checkVipExpiredFaceListData);
        membershipExpiredFaceDialogNewInstance.setDismissAction(dismissAction);
        membershipExpiredFaceDialogNewInstance.show(activity.getSupportFragmentManager(), "MembershipExpiredFaceDialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showMembershipExpiredFaceDialog$default(MembershipDialogManager membershipDialogManager, FragmentActivity fragmentActivity, VipExpiredFaceData vipExpiredFaceData, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        membershipDialogManager.showMembershipExpiredFaceDialog(fragmentActivity, vipExpiredFaceData, function0);
    }

    public final void requestMembershipDialog(@NotNull BaseActivity activity, @NotNull String contentSource) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        activity.showLoading();
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(activity, contentSource, null), 1, null);
    }

    public final void requestMembershipExpiredFaceDialog(@NotNull FragmentActivity activity, @Nullable final Function0<Unit> dismissAction) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ScopeExtKt.scopeNet$default(null, new C26131(dismissAction, activity, null), 1, null).m503catch(new Function2() { // from class: lof
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MembershipDialogManager.requestMembershipExpiredFaceDialog$lambda$0(dismissAction, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }
}
