package com.xiaomi.fitness.nfc.ui.realname;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.net.AuthApiException;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import defpackage.av6;
import defpackage.gzp;
import defpackage.o0j;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t¨\u0006\n"}, d2 = {"handleAuthApiException", "", "fragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "authApiException", "Lcom/miui/tsmclient/net/AuthApiException;", "handlerError", "Lkotlin/Function1;", "nfc_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRealNameRemindInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealNameRemindInfo.kt\ncom/xiaomi/fitness/nfc/ui/realname/RealNameRemindInfoKt\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,108:1\n29#2:109\n*S KotlinDebug\n*F\n+ 1 RealNameRemindInfo.kt\ncom/xiaomi/fitness/nfc/ui/realname/RealNameRemindInfoKt\n*L\n44#1:109\n*E\n"})
public final class RealNameRemindInfoKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$1", f = "RealNameRemindInfo.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthApiException $authApiException;
        final /* synthetic */ BaseFragment $fragment;
        final /* synthetic */ Function1<AuthApiException, Unit> $handlerError;
        final /* synthetic */ boolean $isBmacMot;
        final /* synthetic */ RealNameRemindInfo $realNameInfo;
        final /* synthetic */ String $redirectURL;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(RealNameRemindInfo realNameRemindInfo, BaseFragment baseFragment, String str, boolean z, Function1<? super AuthApiException, Unit> function1, AuthApiException authApiException, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$realNameInfo = realNameRemindInfo;
            this.$fragment = baseFragment;
            this.$redirectURL = str;
            this.$isBmacMot = z;
            this.$handlerError = function1;
            this.$authApiException = authApiException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$realNameInfo, this.$fragment, this.$redirectURL, this.$isBmacMot, this.$handlerError, this.$authApiException, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                RealNameRemindInfoKt$handleAuthApiException$1$cplc$1 realNameRemindInfoKt$handleAuthApiException$1$cplc$1 = new RealNameRemindInfoKt$handleAuthApiException$1$cplc$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, realNameRemindInfoKt$handleAuthApiException$1$cplc$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final String str = (String) obj;
            CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(o0j.S5).setDialogDescriptionString(new DialogParams.DialogDescriptionString(this.$realNameInfo.getMsg())).setNegativeText(o0j.d).setPositiveText(this.$realNameInfo.getButton()).setCanceledOnTouchOutside(true).create();
            final RealNameRemindInfo realNameRemindInfo = this.$realNameInfo;
            final String str2 = this.$redirectURL;
            final boolean z = this.$isBmacMot;
            final Function1<AuthApiException, Unit> function1 = this.$handlerError;
            final AuthApiException authApiException = this.$authApiException;
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt.handleAuthApiException.1.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    if (!Intrinsics.areEqual(realNameRemindInfo.getType(), "REDIRECT") || str2.length() <= 0) {
                        function1.invoke2(authApiException);
                    } else {
                        Uri.Builder builderClearQuery = Uri.parse(str2).buildUpon().clearQuery();
                        Intrinsics.checkNotNullExpressionValue(builderClearQuery, "clearQuery(...)");
                        builderClearQuery.appendQueryParameter("source", "wearable");
                        builderClearQuery.appendQueryParameter("cardName", z ? "BMAC_MOT" : "");
                        vqg.d("real name url = " + builderClearQuery.build() + ",cplc = " + str);
                        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) RealNameWebViewActivity.class);
                        String str3 = str;
                        intent.putExtra("URL", builderClearQuery.build().toString());
                        intent.putExtra("cplc", str3);
                        intent.setFlags(268435456);
                        ApplicationExtKt.getApplication().startActivity(intent);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).show(this.$fragment.getParentFragmentManager(), "");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$2", f = "RealNameRemindInfo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthApiException $authApiException;
        final /* synthetic */ Function1<AuthApiException, Unit> $handlerError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super AuthApiException, Unit> function1, AuthApiException authApiException, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$handlerError = function1;
            this.$authApiException = authApiException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$handlerError, this.$authApiException, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$handlerError.invoke2(this.$authApiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$3", f = "RealNameRemindInfo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthApiException $authApiException;
        final /* synthetic */ Function1<AuthApiException, Unit> $handlerError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super AuthApiException, Unit> function1, AuthApiException authApiException, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$handlerError = function1;
            this.$authApiException = authApiException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$handlerError, this.$authApiException, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$handlerError.invoke2(this.$authApiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void handleAuthApiException(@NotNull BaseFragment fragment, @NotNull CardWrapper cardWrapper, @NotNull AuthApiException authApiException, @NotNull Function1<? super AuthApiException, Unit> handlerError) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(authApiException, "authApiException");
        Intrinsics.checkNotNullParameter(handlerError, "handlerError");
        vqg.d("mErrorInfo: " + authApiException.mErrorInfo);
        Object obj = authApiException.mErrorInfo;
        if (obj == null || TextUtils.isEmpty(obj.toString())) {
            AnyExtKt.main$default(null, new AnonymousClass3(handlerError, authApiException, null), 1, null);
            return;
        }
        RealNameRemindInfo realNameRemindInfo = (RealNameRemindInfo) new Gson().fromJson(authApiException.mErrorInfo.toString(), new TypeToken<RealNameRemindInfo>() { // from class: com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt$handleAuthApiException$$inlined$fromJson$1
        }.getType());
        boolean zC = gzp.c(cardWrapper);
        String redirectURL = realNameRemindInfo.getRedirectURL();
        vqg.d("isBmacMot:" + zC + " redirectURL:" + redirectURL);
        if (!zC || redirectURL.length() <= 0) {
            AnyExtKt.main$default(null, new AnonymousClass2(handlerError, authApiException, null), 1, null);
        } else {
            AnyExtKt.main$default(null, new AnonymousClass1(realNameRemindInfo, fragment, redirectURL, zC, handlerError, authApiException, null), 1, null);
        }
    }
}
