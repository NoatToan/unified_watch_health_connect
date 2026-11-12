package com.huami.account;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.api.AvatarUploadApi;
import com.huami.account.api.PersonInfoLegalApi;
import com.huami.account.api.RawDataUrlResponse;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.legal.DefaultUserInfoLegalCallback;
import com.huami.account.ui.R;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.message.api.WebConst;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.utils.Utils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0007J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002R\u0016\u0010!\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/account/UserInfoLegalCheckManager;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "checkPersonInfoSecurity", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "nickName", "Lcom/huami/account/UserInfoLegalCallBack;", "callback", "checkNickNameLegal", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/Bitmap;", "bitmap", "checkAvatarLegal", "Landroid/content/Context;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "h", "", "resultCode", WebConst.QueryParam.MESSAGE_ID, GoogleApiAvailabilityLight.a, "Lkotlin/Function0;", "showInAuditTip", "Ljava/io/File;", "c", "originalURL", "g", "a", LogUtil.I, "STATUS_USER_INFO_ILLEGAL", "b", "STATUS_USER_INFO_IN_AUDIT", "DEFAULT_IMAGE_QUALITY", "Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "Lkotlin/Lazy;", "f", "()Lcom/huami/account/auth/repository/LastLoginInfoRepository;", "lastLoginInfoRepository", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoLegalCheckManager implements KoinComponent {

    @NotNull
    public static final UserInfoLegalCheckManager INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int STATUS_USER_INFO_ILLEGAL = 9;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int STATUS_USER_INFO_IN_AUDIT = 3;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int DEFAULT_IMAGE_QUALITY = 100;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy lastLoginInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ UserInfoLegalCallBack a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserInfoLegalCallBack userInfoLegalCallBack) {
            super(0);
            this.a = userInfoLegalCallBack;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.onAudit();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Job> {
        public final /* synthetic */ LifecycleOwner a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.account.UserInfoLegalCheckManager$checkPersonInfoSecurity$refreshPersonInfoAction$1$1", f = "UserInfoLegalCheckManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
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
                HMProcessLoginDataManager.fetchAndSavePersonInfo();
                HMAccountKeeper.INSTANCE.setLastCheckUserInfoSecurityTime(System.currentTimeMillis());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LifecycleOwner lifecycleOwner) {
            super(0);
            this.a = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getIO(), null, new a(null), 2, null);
        }
    }

    /* JADX INFO: renamed from: com.huami.account.UserInfoLegalCheckManager$checkAvatarLegal$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.UserInfoLegalCheckManager$checkAvatarLegal$1", f = "UserInfoLegalCheckManager.kt", i = {1, 2}, l = {155, 157, 160}, m = "invokeSuspend", n = {"rawDataURL", "rawDataURL"}, s = {"L$3", "L$3"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        private /* synthetic */ Object e;
        public final /* synthetic */ String f;
        public final /* synthetic */ AppInfo g;
        public final /* synthetic */ FragmentActivity h;
        public final /* synthetic */ Bitmap i;
        public final /* synthetic */ LoadingDialog j;
        public final /* synthetic */ UserInfoLegalCallBack k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AppInfo appInfo, FragmentActivity fragmentActivity, Bitmap bitmap, LoadingDialog loadingDialog, UserInfoLegalCallBack userInfoLegalCallBack, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = appInfo;
            this.h = fragmentActivity;
            this.i = bitmap;
            this.j = loadingDialog;
            this.k = userInfoLegalCallBack;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f, this.g, this.h, this.i, this.j, this.k, continuation);
            anonymousClass1.e = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            FragmentActivity fragmentActivity;
            LoadingDialog loadingDialog;
            UserInfoLegalCallBack userInfoLegalCallBack;
            FragmentActivity fragmentActivity2;
            Bitmap bitmap;
            LoadingDialog loadingDialog2;
            final UserInfoLegalCallBack userInfoLegalCallBack2;
            RawDataUrlResponse rawDataUrlResponse;
            FragmentActivity fragmentActivity3;
            Object avatarCheckedResult;
            final RawDataUrlResponse rawDataUrlResponse2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i != 0) {
                    if (i == 1) {
                        userInfoLegalCallBack2 = (UserInfoLegalCallBack) this.c;
                        loadingDialog2 = (LoadingDialog) this.b;
                        bitmap = (Bitmap) this.a;
                        fragmentActivity2 = (FragmentActivity) this.e;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        RawDataUrlResponse rawDataUrlResponse3 = (RawDataUrlResponse) this.c;
                        UserInfoLegalCallBack userInfoLegalCallBack3 = (UserInfoLegalCallBack) this.b;
                        loadingDialog2 = (LoadingDialog) this.a;
                        FragmentActivity fragmentActivity4 = (FragmentActivity) this.e;
                        ResultKt.throwOnFailure(obj);
                        rawDataUrlResponse = rawDataUrlResponse3;
                        userInfoLegalCallBack2 = userInfoLegalCallBack3;
                        fragmentActivity3 = fragmentActivity4;
                        PersonInfoLegalApi personInfoLegalApi = PersonInfoLegalApi.INSTANCE;
                        String strG = UserInfoLegalCheckManager.INSTANCE.g(rawDataUrlResponse.getGetURI());
                        this.e = fragmentActivity3;
                        this.a = loadingDialog2;
                        this.b = userInfoLegalCallBack2;
                        this.c = rawDataUrlResponse;
                        this.d = 3;
                        avatarCheckedResult = personInfoLegalApi.getAvatarCheckedResult(strG, this);
                        if (avatarCheckedResult == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        rawDataUrlResponse2 = rawDataUrlResponse;
                        obj = avatarCheckedResult;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rawDataUrlResponse2 = (RawDataUrlResponse) this.c;
                        userInfoLegalCallBack2 = (UserInfoLegalCallBack) this.b;
                        LoadingDialog loadingDialog3 = (LoadingDialog) this.a;
                        fragmentActivity3 = (FragmentActivity) this.e;
                        ResultKt.throwOnFailure(obj);
                        loadingDialog2 = loadingDialog3;
                    }
                    UserInfoLegalCheckManager.INSTANCE.d(fragmentActivity3, loadingDialog2, ((Number) obj).intValue(), R.string.account_ui_illegal_avatar_tip, new UserInfoLegalCallBack(rawDataUrlResponse2) { // from class: com.huami.account.UserInfoLegalCheckManager$checkAvatarLegal$1$1$1
                        private final /* synthetic */ UserInfoLegalCallBack a;
                        public final /* synthetic */ RawDataUrlResponse c;

                        {
                            this.c = rawDataUrlResponse2;
                            this.a = this.b;
                        }

                        @Override // com.huami.account.UserInfoLegalCallBack
                        public void onAudit() {
                            HMAccountKeeper.INSTANCE.setManualAuditAvatar(this.c.getGetURI());
                            this.b.onAudit();
                        }

                        @Override // com.huami.account.UserInfoLegalCallBack
                        public void onError() {
                            this.a.onError();
                        }

                        @Override // com.huami.account.UserInfoLegalCallBack
                        public void onFailed() {
                            this.a.onFailed();
                        }

                        @Override // com.huami.account.UserInfoLegalCallBack
                        public void onSuccess() {
                            HMAccountKeeper.INSTANCE.setManualAuditAvatar(null);
                            UserInfoLegalCheckManager.INSTANCE.f().updateAvatar(this.c.getGetURI());
                            this.b.onSuccess();
                        }
                    });
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    fragmentActivity = this.h;
                    loadingDialog = this.j;
                    userInfoLegalCallBack = this.k;
                    if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                        UserInfoLegalCheckManager.INSTANCE.h(fragmentActivity, loadingDialog, userInfoLegalCallBack);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                String str = this.f;
                AppInfo appInfo = this.g;
                fragmentActivity2 = this.h;
                bitmap = this.i;
                LoadingDialog loadingDialog4 = this.j;
                UserInfoLegalCallBack userInfoLegalCallBack4 = this.k;
                Result.Companion companion = Result.Companion;
                AvatarUploadApi avatarUploadApi = AvatarUploadApi.INSTANCE;
                String appId = appInfo.getAppId();
                this.e = fragmentActivity2;
                this.a = bitmap;
                this.b = loadingDialog4;
                this.c = userInfoLegalCallBack4;
                this.d = 1;
                obj = avatarUploadApi.fetchAvatarUrl(str, appId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                loadingDialog2 = loadingDialog4;
                userInfoLegalCallBack2 = userInfoLegalCallBack4;
                rawDataUrlResponse = (RawDataUrlResponse) obj;
                AvatarUploadApi avatarUploadApi2 = AvatarUploadApi.INSTANCE;
                String putURI = rawDataUrlResponse.getPutURI();
                File fileC = UserInfoLegalCheckManager.INSTANCE.c(fragmentActivity2, bitmap);
                this.e = fragmentActivity2;
                this.a = loadingDialog2;
                this.b = userInfoLegalCallBack2;
                this.c = rawDataUrlResponse;
                this.d = 2;
                if (avatarUploadApi2.uploadAvatar(putURI, fileC, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fragmentActivity3 = fragmentActivity2;
                PersonInfoLegalApi personInfoLegalApi2 = PersonInfoLegalApi.INSTANCE;
                String strG2 = UserInfoLegalCheckManager.INSTANCE.g(rawDataUrlResponse.getGetURI());
                this.e = fragmentActivity3;
                this.a = loadingDialog2;
                this.b = userInfoLegalCallBack2;
                this.c = rawDataUrlResponse;
                this.d = 3;
                avatarCheckedResult = personInfoLegalApi2.getAvatarCheckedResult(strG2, this);
                if (avatarCheckedResult == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rawDataUrlResponse2 = rawDataUrlResponse;
                obj = avatarCheckedResult;
                UserInfoLegalCheckManager.INSTANCE.d(fragmentActivity3, loadingDialog2, ((Number) obj).intValue(), R.string.account_ui_illegal_avatar_tip, new UserInfoLegalCallBack(rawDataUrlResponse2) { // from class: com.huami.account.UserInfoLegalCheckManager$checkAvatarLegal$1$1$1
                    private final /* synthetic */ UserInfoLegalCallBack a;
                    public final /* synthetic */ RawDataUrlResponse c;

                    {
                        this.c = rawDataUrlResponse2;
                        this.a = this.b;
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onAudit() {
                        HMAccountKeeper.INSTANCE.setManualAuditAvatar(this.c.getGetURI());
                        this.b.onAudit();
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onError() {
                        this.a.onError();
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onFailed() {
                        this.a.onFailed();
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onSuccess() {
                        HMAccountKeeper.INSTANCE.setManualAuditAvatar(null);
                        UserInfoLegalCheckManager.INSTANCE.f().updateAvatar(this.c.getGetURI());
                        this.b.onSuccess();
                    }
                });
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                fragmentActivity = this.h;
                loadingDialog = this.j;
                userInfoLegalCallBack = this.k;
                if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                    UserInfoLegalCheckManager.INSTANCE.h(fragmentActivity, loadingDialog, userInfoLegalCallBack);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.account.UserInfoLegalCheckManager$checkNickNameLegal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.UserInfoLegalCheckManager$checkNickNameLegal$1", f = "UserInfoLegalCheckManager.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        private /* synthetic */ Object e;
        public final /* synthetic */ String f;
        public final /* synthetic */ FragmentActivity g;
        public final /* synthetic */ LoadingDialog h;
        public final /* synthetic */ UserInfoLegalCallBack i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15091(String str, FragmentActivity fragmentActivity, LoadingDialog loadingDialog, UserInfoLegalCallBack userInfoLegalCallBack, Continuation<? super C15091> continuation) {
            super(2, continuation);
            this.f = str;
            this.g = fragmentActivity;
            this.h = loadingDialog;
            this.i = userInfoLegalCallBack;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C15091 c15091 = new C15091(this.f, this.g, this.h, this.i, continuation);
            c15091.e = obj;
            return c15091;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            final UserInfoLegalCallBack userInfoLegalCallBack;
            FragmentActivity fragmentActivity;
            LoadingDialog loadingDialog;
            final String str;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = this.f;
                    FragmentActivity fragmentActivity2 = this.g;
                    LoadingDialog loadingDialog2 = this.h;
                    UserInfoLegalCallBack userInfoLegalCallBack2 = this.i;
                    Result.Companion companion = Result.Companion;
                    PersonInfoLegalApi personInfoLegalApi = PersonInfoLegalApi.INSTANCE;
                    this.e = str2;
                    this.a = fragmentActivity2;
                    this.b = loadingDialog2;
                    this.c = userInfoLegalCallBack2;
                    this.d = 1;
                    Object nickNameCheckResult = personInfoLegalApi.getNickNameCheckResult(str2, this);
                    if (nickNameCheckResult == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    userInfoLegalCallBack = userInfoLegalCallBack2;
                    fragmentActivity = fragmentActivity2;
                    obj = nickNameCheckResult;
                    loadingDialog = loadingDialog2;
                    str = str2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    userInfoLegalCallBack = (UserInfoLegalCallBack) this.c;
                    LoadingDialog loadingDialog3 = (LoadingDialog) this.b;
                    fragmentActivity = (FragmentActivity) this.a;
                    String str3 = (String) this.e;
                    ResultKt.throwOnFailure(obj);
                    loadingDialog = loadingDialog3;
                    str = str3;
                }
                UserInfoLegalCheckManager.INSTANCE.d(fragmentActivity, loadingDialog, ((Number) obj).intValue(), R.string.account_ui_illeagl_nickname, new UserInfoLegalCallBack(str) { // from class: com.huami.account.UserInfoLegalCheckManager$checkNickNameLegal$1$1$1
                    private final /* synthetic */ UserInfoLegalCallBack a;
                    public final /* synthetic */ String c;

                    {
                        this.c = str;
                        this.a = this.b;
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onAudit() {
                        HMAccountKeeper.INSTANCE.setManualAuditNickName(this.c);
                        this.b.onAudit();
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onError() {
                        this.a.onError();
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onFailed() {
                        this.a.onFailed();
                    }

                    @Override // com.huami.account.UserInfoLegalCallBack
                    public void onSuccess() {
                        HMAccountKeeper.INSTANCE.setManualAuditNickName(null);
                        UserInfoLegalCheckManager.INSTANCE.f().updateNickname(this.c);
                        this.b.onSuccess();
                    }
                });
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            FragmentActivity fragmentActivity3 = this.g;
            LoadingDialog loadingDialog4 = this.h;
            UserInfoLegalCallBack userInfoLegalCallBack3 = this.i;
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                UserInfoLegalCheckManager.INSTANCE.h(fragmentActivity3, loadingDialog4, userInfoLegalCallBack3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final UserInfoLegalCheckManager userInfoLegalCheckManager = new UserInfoLegalCheckManager();
        INSTANCE = userInfoLegalCheckManager;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        lastLoginInfoRepository = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<LastLoginInfoRepository>() { // from class: com.huami.account.UserInfoLegalCheckManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.auth.repository.LastLoginInfoRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LastLoginInfoRepository invoke() {
                KoinComponent koinComponent = userInfoLegalCheckManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(LastLoginInfoRepository.class), qualifier, objArr);
            }
        });
    }

    private UserInfoLegalCheckManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File c(Context context, Bitmap bitmap) throws IOException {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + "tempAvatar.jpg");
        file.createNewFile();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(file));
        return file;
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkAvatarLegal(@NotNull FragmentActivity fragmentActivity, @NotNull Bitmap bitmap) {
        checkAvatarLegal$default(fragmentActivity, bitmap, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkAvatarLegal(@NotNull FragmentActivity context, @NotNull Bitmap bitmap, @NotNull UserInfoLegalCallBack callback) {
        String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
        AppInfo appInfo = Utils.getAppInfo(context);
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context, context.getString(R.string.account_ui_user_info_loading));
        loadingDialogShowDialog.setCancelable(false);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(context), Dispatchers.getMain(), null, new AnonymousClass1(userid, appInfo, context, bitmap, loadingDialogShowDialog, callback, null), 2, null);
    }

    public static /* synthetic */ void checkAvatarLegal$default(FragmentActivity fragmentActivity, Bitmap bitmap, UserInfoLegalCallBack userInfoLegalCallBack, int i, Object obj) {
        if ((i & 4) != 0) {
            userInfoLegalCallBack = new DefaultUserInfoLegalCallback(null, 1, null);
        }
        checkAvatarLegal(fragmentActivity, bitmap, userInfoLegalCallBack);
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkNickNameLegal(@NotNull FragmentActivity fragmentActivity, @NotNull String str) {
        checkNickNameLegal$default(fragmentActivity, str, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkNickNameLegal(@NotNull FragmentActivity activity, @NotNull String nickName, @NotNull UserInfoLegalCallBack callback) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, activity.getString(R.string.account_ui_user_info_loading));
        loadingDialogShowDialog.setCancelable(false);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(activity), Dispatchers.getMain(), null, new C15091(nickName, activity, loadingDialogShowDialog, callback, null), 2, null);
    }

    public static /* synthetic */ void checkNickNameLegal$default(FragmentActivity fragmentActivity, String str, UserInfoLegalCallBack userInfoLegalCallBack, int i, Object obj) {
        if ((i & 4) != 0) {
            userInfoLegalCallBack = new DefaultUserInfoLegalCallback(null, 1, null);
        }
        checkNickNameLegal(fragmentActivity, str, userInfoLegalCallBack);
    }

    @JvmStatic
    public static final void checkPersonInfoSecurity(@NotNull LifecycleOwner lifecycleOwner) {
        if (HMLoginManager.isUnInit()) {
            return;
        }
        b bVar = new b(lifecycleOwner);
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        String manualAuditNickName = hMAccountKeeper.getManualAuditNickName();
        if (hMAccountKeeper.getManualAuditAvatar() != null || manualAuditNickName != null) {
            bVar.invoke();
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hMAccountKeeper.getLastCheckUserInfoSecurityTime());
        if (TimeUtils.isToday(calendar)) {
            return;
        }
        bVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(FragmentActivity activity, LoadingDialog loadingDialog, int resultCode, @StringRes int messageId, final UserInfoLegalCallBack callback) {
        if (resultCode == 3) {
            loadingDialog.dismiss();
            showInAuditTip(activity, new a(callback));
        } else {
            if (resultCode != 9) {
                loadingDialog.setSuccess(activity.getString(R.string.account_ui_user_info_loading_success), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.UserInfoLegalCheckManager$checkCodeAndShowDialog$3
                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onAnimEnd(@Nullable LoadingDialog dialog) {
                        callback.onSuccess();
                    }

                    @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                    public void onDismiss(@Nullable LoadingDialog dialog) {
                    }
                });
                return;
            }
            loadingDialog.dismiss();
            View viewInflate = View.inflate(activity, R.layout.account_ui_dialog_info_illegal, null);
            ((TextView) viewInflate.findViewById(R.id.tv_message)).setText(messageId);
            new AlertDialogFragment.Builder(activity).setContentView(viewInflate).setMessage(messageId).setNeutralButton(R.string.account_ui_revise, new DialogInterface.OnClickListener() { // from class: d68
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    UserInfoLegalCheckManager.e(callback, dialogInterface, i);
                }
            }).show(activity.getSupportFragmentManager()).setGravity(17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(UserInfoLegalCallBack userInfoLegalCallBack, DialogInterface dialogInterface, int i) {
        userInfoLegalCallBack.onFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LastLoginInfoRepository f() {
        return (LastLoginInfoRepository) lastLoginInfoRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(String originalURL) {
        Uri.Builder builderBuildUpon = Uri.parse(originalURL).buildUpon();
        builderBuildUpon.appendQueryParameter("thumb", "1");
        builderBuildUpon.appendQueryParameter("w", "320");
        builderBuildUpon.appendQueryParameter("h", "320");
        return builderBuildUpon.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Context context, LoadingDialog loadingDialog, final UserInfoLegalCallBack callback) {
        loadingDialog.setFailed(context.getString(R.string.account_ui_user_info_loading_fail), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.account.UserInfoLegalCheckManager$showErrorDialog$1
            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(@Nullable LoadingDialog dialog) {
                callback.onError();
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(@Nullable LoadingDialog dialog) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.invoke();
    }

    @JvmStatic
    public static final void showInAuditTip(@NotNull FragmentActivity activity, @NotNull final Function0<Unit> callback) {
        new AlertDialogFragment.Builder(activity).setTitle(R.string.account_ui_audit_title).setMessage(R.string.account_ui_audit_content).setNeutralButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: e68
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserInfoLegalCheckManager.i(callback, dialogInterface, i);
            }
        }).show(activity.getSupportFragmentManager()).setGravity(17);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
