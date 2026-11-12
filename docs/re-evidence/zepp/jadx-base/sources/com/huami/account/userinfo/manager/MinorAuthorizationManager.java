package com.huami.account.userinfo.manager;

import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.WebHelper;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.entity.MinorAuthorizationEntity;
import com.huami.account.event.EventMinorAuthMailSent;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.Option;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserInfoModuleInitializerKt;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.bean.Birthday;
import com.huami.account.userinfo.event.EventAgeHasConfirmed;
import com.huami.account.userinfo.manager.MinorAuthorizationManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.module.ktx.ContextExtKt;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebItem;
import com.huami.web.service.event.EventWebActivityFinish;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0004H\u0002J\f\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huami/account/userinfo/manager/MinorAuthorizationManager;", "", "", "f", "Lcom/huami/account/api/entity/MinorAuthorizationEntity;", "entity", "m", "l", "", z.j, "", "h", "release", "Lcom/huami/account/userinfo/event/EventAgeHasConfirmed;", "event", "onEventMainThread", "getLegalInfoVersion", "showMinorAuthorizationDialog", "Landroidx/appcompat/app/AppCompatActivity;", "a", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "MinorAuthWebViewExitReceiver", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class MinorAuthorizationManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "MinorAuthorizationManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/account/userinfo/manager/MinorAuthorizationManager$Companion;", "", "Lrx/functions/Action1;", "Lcom/huami/account/api/entity/MinorAuthorizationEntity;", "callback", "", "requestMinorAuthorization$userinfo_release", "(Lrx/functions/Action1;)V", "requestMinorAuthorization", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("requestMinorAuthorization failed: ", this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MinorAuthorizationEntity d() {
            return HMAccountWebAPI.queryMinorAuthorization();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Action1 action1, MinorAuthorizationEntity minorAuthorizationEntity) {
            if (minorAuthorizationEntity.needAuthorize()) {
                action1.call(minorAuthorizationEntity);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Throwable th) {
            HMLog.debug(MinorAuthorizationManager.b, new a(th));
        }

        public final void requestMinorAuthorization$userinfo_release(@NotNull final Action1<MinorAuthorizationEntity> callback) {
            Observable.fromCallable(new Callable() { // from class: l75
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MinorAuthorizationManager.Companion.d();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: m75
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MinorAuthorizationManager.Companion.e(callback, (MinorAuthorizationEntity) obj);
                }
            }, new Action1() { // from class: n75
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MinorAuthorizationManager.Companion.f((Throwable) obj);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.manager.MinorAuthorizationManager$showAccountFrozenDialog$1", f = "MinorAuthorizationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DialogInterface dialogInterface, int i) {
            WebItem webItem = new WebItem(HMServerDef.getUrl(HMAccountWebAPI.URL_MINOR_AUTHORIZATION));
            webItem.hasFinishEvent = true;
            WebHelper.launch(webItem);
            EventBus.getDefault().register(new MinorAuthWebViewExitReceiver(dialogInterface));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DialogInterface dialogInterface, int i) {
            HMLogoutManager.logout(5);
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MinorAuthorizationManager.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            new AlertDialogFragment.Builder(MinorAuthorizationManager.this.activity).setTitle(R.string.account_ui_account_frozen_title).setMessage(this.c).themed().autoDismiss(false).setPositiveButton(R.string.account_ui_account_unfreeze, new DialogInterface.OnClickListener() { // from class: com.huami.account.userinfo.manager.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MinorAuthorizationManager.a.c(dialogInterface, i);
                }
            }).setNegativeButton(R.string.account_ui_account_unfreeze_exit, new DialogInterface.OnClickListener() { // from class: com.huami.account.userinfo.manager.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MinorAuthorizationManager.a.e(dialogInterface, i);
                }
            }).show(MinorAuthorizationManager.this.activity.getSupportFragmentManager()).setGravity(17);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.manager.MinorAuthorizationManager$showMinorAuthorizationDialog$1", f = "MinorAuthorizationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MinorAuthorizationEntity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MinorAuthorizationEntity minorAuthorizationEntity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = minorAuthorizationEntity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DialogInterface dialogInterface, int i) {
            WebItem webItem = new WebItem(HMServerDef.getUrl(HMAccountWebAPI.URL_MINOR_AUTHORIZATION));
            webItem.hasFinishEvent = true;
            WebHelper.launch(webItem);
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(DialogInterface dialogInterface, int i) {
            HMAccountKeeper.INSTANCE.setCheckMinorAuthorizationTime(System.currentTimeMillis());
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MinorAuthorizationManager.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(MinorAuthorizationManager.this.activity);
            MinorAuthorizationManager minorAuthorizationManager = MinorAuthorizationManager.this;
            MinorAuthorizationEntity minorAuthorizationEntity = this.c;
            builder.setTitle(R.string.user_info_authorize_title);
            builder.setMessage(minorAuthorizationManager.h(minorAuthorizationEntity));
            builder.themed();
            builder.autoDismiss(false);
            builder.setPositiveButton(R.string.user_info_authorize_btn_positive, new DialogInterface.OnClickListener() { // from class: com.huami.account.userinfo.manager.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MinorAuthorizationManager.b.c(dialogInterface, i);
                }
            });
            builder.setNegativeButton(R.string.account_ui_close, new DialogInterface.OnClickListener() { // from class: com.huami.account.userinfo.manager.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MinorAuthorizationManager.b.e(dialogInterface, i);
                }
            });
            builder.create();
            builder.show(minorAuthorizationManager.activity.getSupportFragmentManager()).setGravity(17);
            return Unit.INSTANCE;
        }
    }

    public MinorAuthorizationManager(@NotNull AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    private final void f() {
        if (HMLoginManager.isAdultGlobal()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(HMAccountKeeper.INSTANCE.getCheckMinorAuthorizationTime());
        if (TimeUtils.isToday(calendar)) {
            return;
        }
        INSTANCE.requestMinorAuthorization$userinfo_release(new Action1() { // from class: j75
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MinorAuthorizationManager.g(this.a, (MinorAuthorizationEntity) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MinorAuthorizationManager minorAuthorizationManager, MinorAuthorizationEntity minorAuthorizationEntity) {
        minorAuthorizationManager.m(minorAuthorizationEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(MinorAuthorizationEntity minorAuthorizationEntity) {
        if (minorAuthorizationEntity.isReauthorize) {
            return ContextExtKt.getQuantityString(this.activity, R.plurals.account_ui_account_age_check_content_by_upgrade, minorAuthorizationEntity.remainDays);
        }
        String quantityString = this.activity.getResources().getQuantityString(R.plurals.user_info_authorize_message_first_part, HMLoginManager.getAdultAge(), Integer.valueOf(HMLoginManager.getAdultAge()));
        Resources resources = this.activity.getResources();
        int i = R.plurals.user_info_authorize_message_second_part;
        int i2 = minorAuthorizationEntity.remainDays;
        return Intrinsics.stringPlus(quantityString, resources.getQuantityString(i, i2, Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MinorAuthorizationManager minorAuthorizationManager) {
        minorAuthorizationManager.f();
    }

    private final boolean j(MinorAuthorizationEntity minorAuthorizationEntity) {
        return minorAuthorizationEntity.remainDays <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MinorAuthorizationManager minorAuthorizationManager, MinorAuthorizationEntity minorAuthorizationEntity) {
        minorAuthorizationManager.showMinorAuthorizationDialog(minorAuthorizationEntity);
    }

    private final void l() {
        LifecycleOwnerKt.getLifecycleScope(this.activity).launchWhenResumed(new a(UserinfoExternalsKt.getAppContext().getString(R.string.account_ui_account_frozen_content, HMLoginManager.getHuamiId()), null));
    }

    private final void m(final MinorAuthorizationEntity entity) {
        if (entity == null) {
            return;
        }
        if (!UserLegalInfoManager.hasMinorAgeConfirmed()) {
            new AlertDialogFragment.Builder(this.activity).setCancelable(false).setTitle(R.string.account_ui_account_minor_authorization_info_title).setMessage(Intrinsics.stringPlus(this.activity.getString(R.string.account_ui_account_minor_authorization_info_birth), Birthday.fromStr(HMPersonInfo.getInstance().getUserInfo().getBirthday()))).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: h75
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MinorAuthorizationManager.n(this.a, entity, dialogInterface, i);
                }
            }).setNegativeButton(R.string.account_ui_account_minor_authorization_info_go_modify, new DialogInterface.OnClickListener() { // from class: g75
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MinorAuthorizationManager.o(this.a, dialogInterface, i);
                }
            }).show(this.activity.getSupportFragmentManager());
        } else if (j(entity)) {
            l();
        } else {
            showMinorAuthorizationDialog(entity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MinorAuthorizationManager minorAuthorizationManager, MinorAuthorizationEntity minorAuthorizationEntity, DialogInterface dialogInterface, int i) {
        UserLegalInfoManager.makeMinorAgeConfirmed();
        minorAuthorizationManager.showMinorAuthorizationDialog(minorAuthorizationEntity);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MinorAuthorizationManager minorAuthorizationManager, DialogInterface dialogInterface, int i) {
        UserInfoModuleInitializerKt.getUserInfoService().navigateToPersonInfo(minorAuthorizationManager.activity, new Option(true));
        dialogInterface.dismiss();
    }

    public final void getLegalInfoVersion() {
        if (HMLoginManager.isUnInit()) {
            return;
        }
        UserLegalInfoManager.checkAgreementUpdate(this.activity, true, new UserLegalInfoManager.OnLegalInfoEndListener() { // from class: i75
            @Override // com.huami.account.UserLegalInfoManager.OnLegalInfoEndListener
            public final void onEnd() {
                MinorAuthorizationManager.i(this.a);
            }
        });
    }

    public final void onEventMainThread(@NotNull EventAgeHasConfirmed event) {
        UserLegalInfoManager.makeMinorAgeConfirmed();
        INSTANCE.requestMinorAuthorization$userinfo_release(new Action1() { // from class: k75
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MinorAuthorizationManager.k(this.a, (MinorAuthorizationEntity) obj);
            }
        });
    }

    public final void release() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    public final void showMinorAuthorizationDialog(@NotNull MinorAuthorizationEntity entity) {
        LifecycleOwnerKt.getLifecycleScope(this.activity).launchWhenResumed(new b(entity, null));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/account/userinfo/manager/MinorAuthorizationManager$MinorAuthWebViewExitReceiver;", "", "Lcom/huami/account/event/EventMinorAuthMailSent;", "event", "", "onEventMainThread", "Lcom/huami/web/service/event/EventWebActivityFinish;", "Landroid/content/DialogInterface;", "a", "Landroid/content/DialogInterface;", "dialogInterface", "<init>", "(Landroid/content/DialogInterface;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class MinorAuthWebViewExitReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final DialogInterface dialogInterface;

        public MinorAuthWebViewExitReceiver(@NotNull DialogInterface dialogInterface) {
            this.dialogInterface = dialogInterface;
        }

        public final void onEventMainThread(@NotNull EventMinorAuthMailSent event) {
            EventBus.getDefault().unregister(this);
            this.dialogInterface.dismiss();
            HMLogoutManager.logout(5);
        }

        public final void onEventMainThread(@NotNull EventWebActivityFinish event) {
            EventBus.getDefault().unregister(this);
        }
    }
}
