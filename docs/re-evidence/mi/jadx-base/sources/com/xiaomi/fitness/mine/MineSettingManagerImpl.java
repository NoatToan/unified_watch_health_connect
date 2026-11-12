package com.xiaomi.fitness.mine;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.xiaomi.fitness.about.utils.MineHtmlUrlsKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.mine.MineSettingManagerImpl;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.mine.export.IWebSyncKt;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.personal.data.management.AuthConfigListActivity;
import com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyRequest;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.util.MineUtil;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.onetrack.c.q;
import defpackage.dbm;
import defpackage.m0j;
import defpackage.pji;
import defpackage.vni;
import defpackage.wam;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u001fJ&\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/mine/MineSettingManagerImpl;", "Lcom/xiaomi/fitness/mine/export/MineSettingManager;", "<init>", "()V", "dataManagementRepository", "Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;", "getDataManagementRepository", "()Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;", "setDataManagementRepository", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementRepository;)V", "showWebSyncDialogIfNeed", "", "context", "Landroidx/fragment/app/FragmentActivity;", "action", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "goToAidongCoursePaymentPage", "", "getAidongMemberExpireTimestamp", "success", "Lkotlin/Function1;", "", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "showAidongMemberPaymentEntrance", "goToAuthConfigListActivityAsTaskTop", "Landroid/content/Context;", "getThirdPartyAuthStatus", "thirdPartyType", "", q.f13858b, "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setThirdPartyAuth", "authStatus", "(IJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIntentToMyEventsPage", "Landroid/content/Intent;", "addMyCampaignsShortcut", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineSettingManagerImpl implements MineSettingManager {

    @NotNull
    public static final String TAG = "MineSettingManagerImpl";
    public DataManagementRepository dataManagementRepository;

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.MineSettingManagerImpl$getThirdPartyAuthStatus$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.MineSettingManagerImpl", f = "MineSettingManagerImpl.kt", i = {}, l = {94}, m = "getThirdPartyAuthStatus", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MineSettingManagerImpl.this.getThirdPartyAuthStatus(0, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAidongMemberExpireTimestamp$lambda$0(Function1 success, AidongVipUserInfo it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getAidongMemberExpireTimestamp succeed. dueTime=" + it.getDueTime());
        success.invoke2(Long.valueOf(!it.isVip() ? 0L : it.getDueTime()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAidongMemberExpireTimestamp$lambda$1(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getAidongMemberExpireTimestamp failed. error=" + it);
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    public void addMyCampaignsShortcut() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mi.fitness://localhost/d?action=check_my_events"));
        intent.setFlags(268468224);
        wam wamVarA = new wam.b(ApplicationExtKt.getApplication(), "checkMyCampaign").f(ResourceExtKt.getString(m0j.d)).b(IconCompat.j(ApplicationExtKt.getApplication(), vni.h)).c(intent).e(2).a();
        Intrinsics.checkNotNullExpressionValue(wamVarA, "build(...)");
        dbm.f(ApplicationExtKt.getApplication(), wamVarA);
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    public void getAidongMemberExpireTimestamp(@NotNull final Function1<? super Long, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        CourseApiKt.getCourseApi().getAidongMemberUserInfo(new Function1() { // from class: t2g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineSettingManagerImpl.getAidongMemberExpireTimestamp$lambda$0(success, (AidongVipUserInfo) obj);
            }
        }, new Function1() { // from class: u2g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineSettingManagerImpl.getAidongMemberExpireTimestamp$lambda$1(error, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final DataManagementRepository getDataManagementRepository() {
        DataManagementRepository dataManagementRepository = this.dataManagementRepository;
        if (dataManagementRepository != null) {
            return dataManagementRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataManagementRepository");
        return null;
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    @NotNull
    public Intent getIntentToMyEventsPage() {
        AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        if (!accountManagerExtKt.isLogin()) {
            return HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getAppHomeIntent();
        }
        String activityHtmlUrlStaging = accountManagerExtKt.isStaging() ? MineHtmlUrlsKt.getActivityHtmlUrlStaging() : MineHtmlUrlsKt.getActivityHtmlUrl();
        Logger.d(TAG, "goToMyEventsPage url=" + activityHtmlUrlStaging);
        Intent intent = new Intent();
        intent.setClass(ApplicationExtKt.getApplication(), HealthWebViewActivity.class);
        intent.putExtra("data4", ResourceExtKt.getString(m0j.d));
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, true);
        intent.putExtra("URL", activityHtmlUrlStaging);
        intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, pji.c);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    @Nullable
    public Object getThirdPartyAuthStatus(int i, long j, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object thirdParty = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(thirdParty);
            DataManagementRepository dataManagementRepository = getDataManagementRepository();
            GetThirdPartyRequest getThirdPartyRequest = new GetThirdPartyRequest(i, j);
            anonymousClass1.label = 1;
            thirdParty = dataManagementRepository.getThirdParty(getThirdPartyRequest, anonymousClass1);
            if (thirdParty == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(thirdParty);
        }
        GetThirdPartyResult getThirdPartyResult = (GetThirdPartyResult) thirdParty;
        return Boxing.boxBoolean(Intrinsics.areEqual(getThirdPartyResult != null ? Boxing.boxInt(getThirdPartyResult.getAuthStatus()) : Boxing.boxBoolean(false), Boxing.boxInt(1)));
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    public void goToAidongCoursePaymentPage() {
        MineUtil.INSTANCE.goToAidongMemberPaymentPage();
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    public void goToAuthConfigListActivityAsTaskTop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) AuthConfigListActivity.class);
        intent.addFlags(603979776);
        context.startActivity(intent);
    }

    public final void setDataManagementRepository(@NotNull DataManagementRepository dataManagementRepository) {
        Intrinsics.checkNotNullParameter(dataManagementRepository, "<set-?>");
        this.dataManagementRepository = dataManagementRepository;
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    @Nullable
    public Object setThirdPartyAuth(int i, long j, boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return getDataManagementRepository().setThirdPartyAuth(new SetThirdPartyAuthRequest(i, j, z ? 1 : 0), continuation);
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    public boolean showAidongMemberPaymentEntrance() {
        return IWebSyncKt.getSHOW_AIDONG_PAYMENT_ENTRANCE();
    }

    @Override // com.xiaomi.fitness.mine.export.MineSettingManager
    public boolean showWebSyncDialogIfNeed(@NotNull FragmentActivity context, @NotNull IWebSync action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        return MineSettingHelper.INSTANCE.showSyncWebDialogIfNeed(context, action);
    }
}
