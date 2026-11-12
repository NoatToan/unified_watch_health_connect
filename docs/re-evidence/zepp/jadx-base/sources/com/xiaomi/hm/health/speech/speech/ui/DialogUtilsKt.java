package com.xiaomi.hm.health.speech.speech.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.huami.ai.speech.simplify.register.AlexaProductIDKt;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.web.service.WebViewService;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.speech.speech.ui.DialogUtilsKt;
import com.xiaomi.hm.health.thirdbind.AlexaBindEntry;
import com.xiaomi.hm.health.thirdbind.ThirdBindActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u001a\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\n"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fm", "", "showAlexaNotSupportDialog", "Lkotlin/Function0;", "positiveButtonClick", "showAlexaAuthLawDialog", "gotoAlexaAuthPage", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class DialogUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.speech.speech.ui.DialogUtilsKt$gotoAlexaAuthPage$1", f = "DialogUtils.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ LoadingDialog c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.speech.speech.ui.DialogUtilsKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.speech.speech.ui.DialogUtilsKt$gotoAlexaAuthPage$1$1", f = "DialogUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1007a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ LoadingDialog c;
            public final /* synthetic */ Context d;
            public final /* synthetic */ String e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1007a(String str, LoadingDialog loadingDialog, Context context, String str2, Continuation<? super C1007a> continuation) {
                super(2, continuation);
                this.b = str;
                this.c = loadingDialog;
                this.d = context;
                this.e = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C1007a(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C1007a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.b == null) {
                    this.c.setFailed(this.d.getString(R.string.load_failed));
                } else {
                    this.c.dismiss();
                    AlexaBindEntry.open(this.d, this.b, this.e, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, LoadingDialog loadingDialog, Context context, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = num;
            this.c = loadingDialog;
            this.d = context;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String productIdByDeviceSource = AlexaProductIDKt.getProductIdByDeviceSource(this.b);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C1007a c1007a = new C1007a(productIdByDeviceSource, this.c, this.d, this.e, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c1007a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "跳转至Alexa授权界面，deviceId为空，默认传空字符串";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FragmentManager fragmentManager, String str, View view) {
        ((WebViewService) KoinJavaComponent.get$default(WebViewService.class, null, null, 6, null)).launch(HMServerDef.getUrl("/t/posts/watch?category=74&meta_key=tag&meta_value=faq"));
        DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(str);
        if (dialogFragment == null) {
            return;
        }
        dialogFragment.dismiss();
    }

    public static final void gotoAlexaAuthPage(@NotNull Context context) {
        HMDeviceSource mDeviceSource;
        DeviceInfo deviceInfo;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context, context.getString(R.string.loading));
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        Integer numValueOf = (miliDevice == null || (mDeviceSource = miliDevice.getMDeviceSource()) == null) ? null : Integer.valueOf(mDeviceSource.getValue());
        String deviceID = (miliDevice == null || (deviceInfo = miliDevice.getDeviceInfo()) == null) ? null : deviceInfo.getDeviceID();
        if (deviceID == null) {
            HMLog.warn$default("speech", null, b.a, 2, null);
            deviceID = "";
        }
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(numValueOf, loadingDialogShowDialog, context, deviceID, null), 3, null);
    }

    public static final void showAlexaAuthLawDialog(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull final Function0<Unit> function0) {
        new AlertDialogFragment.Builder(context).setTitle(R.string.kindly_reminder).setMessage(R.string.alexa_authorized).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.agree, new DialogInterface.OnClickListener() { // from class: ia1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogUtilsKt.c(function0, dialogInterface, i);
            }
        }).show(fragmentManager, ThirdBindActivity.ALEXA_AUTHORIZED_DIALOG_TAG).setGravity(17);
    }

    public static final void showAlexaNotSupportDialog(@NotNull Context context, @NotNull final FragmentManager fragmentManager) {
        final String str = "AlexaNotSupportDialog";
        new AlertDialogFragment.Builder(context).setTitle(R.string.kindly_reminder).setMessage(R.string.dialog_alexa_not_support).setLink(R.string.dialog_alexa_support_link_tip, new View.OnClickListener() { // from class: ja1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogUtilsKt.d(fragmentManager, str, view);
            }
        }).setNeutralButton(R.string.got_it, (DialogInterface.OnClickListener) null).show(fragmentManager, "AlexaNotSupportDialog").setGravity(17);
    }
}
