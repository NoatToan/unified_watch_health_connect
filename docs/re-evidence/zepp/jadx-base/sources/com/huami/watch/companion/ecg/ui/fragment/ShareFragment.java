package com.huami.watch.companion.ecg.ui.fragment;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.FileProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.ui.fragment.ShareFragment;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.StorageUtil;
import com.huami.widget.share.Constant;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.open.SocialConstants;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J?\u0010\u0016\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2-\u0010\u0015\u001a)\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0004\u0012\u00020\u00040\u0010R?\u0010\u0019\u001a+\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment;", "Landroid/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroid/app/Activity;", "activity", "Lkotlin/Function1;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "file", "share", "showShareDialog", "a", "Lkotlin/jvm/functions/Function1;", "mShareFun", "Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment$EcgShareHelper;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment$EcgShareHelper;", "mEcgShareHelper", "<init>", "()V", "EcgShareHelper", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class ShareFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Function1<? super File, Unit>, Unit> mShareFun;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgShareHelper = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment$EcgShareHelper;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "Ljava/io/File;", "file", "Landroid/net/Uri;", "e", "", "g", "h", "i", "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "p0", "onReq", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "onResp", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "onSuccess", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "c", "Lkotlin/Lazy;", "f", "()Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "mWeixinApi", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", GoogleApiAvailabilityLight.a, "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class EcgShareHelper implements CoroutineScope, IWXAPIEventHandler {
        private static final long e = 500;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Activity activity;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function0<Unit> onSuccess;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy mWeixinApi = LazyKt__LazyJVMKt.lazy(new a());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<IWXAPI> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWXAPI invoke() {
                Intent intent = EcgShareHelper.this.activity.getIntent();
                IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(EcgShareHelper.this.activity.getApplicationContext(), Constant.WX_APP_ID);
                EcgShareHelper ecgShareHelper = EcgShareHelper.this;
                iwxapiCreateWXAPI.registerApp(Constant.WX_APP_ID);
                iwxapiCreateWXAPI.handleIntent(intent, ecgShareHelper);
                return iwxapiCreateWXAPI;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watch.companion.ecg.ui.fragment.ShareFragment$EcgShareHelper$shareOther$1", f = "ShareFragment.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ File c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(File file, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return EcgShareHelper.this.new b(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.a = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", EcgShareHelper.this.e(this.c));
                intent.setType("application/pdf");
                EcgShareHelper.this.activity.startActivity(Intent.createChooser(intent, EcgShareHelper.this.activity.getString(R.string.ecg_share_simple)));
                EcgShareHelper.this.onSuccess.invoke();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watch.companion.ecg.ui.fragment.ShareFragment$EcgShareHelper$shareToQq$1", f = "ShareFragment.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ File c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(File file, Continuation<? super c> continuation) {
                super(2, continuation);
                this.c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return EcgShareHelper.this.new c(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.a = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", EcgShareHelper.this.e(this.c));
                intent.setComponent(new ComponentName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity"));
                intent.setType("application/pdf");
                EcgShareHelper.this.activity.startActivity(Intent.createChooser(intent, EcgShareHelper.this.activity.getString(R.string.ecg_share)));
                EcgShareHelper.this.onSuccess.invoke();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watch.companion.ecg.ui.fragment.ShareFragment$EcgShareHelper$shareToWechat$1", f = "ShareFragment.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ File b;
            public final /* synthetic */ EcgShareHelper c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(File file, EcgShareHelper ecgShareHelper, Continuation<? super d> continuation) {
                super(2, continuation);
                this.b = file;
                this.c = ecgShareHelper;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new d(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.a = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                WXFileObject wXFileObject = new WXFileObject();
                wXFileObject.setContentLengthLimit(10485760);
                wXFileObject.setFilePath(this.b.getAbsolutePath());
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                wXMediaMessage.description = this.c.activity.getString(com.huami.watch.companionlib.R.string.share_to_topic);
                wXMediaMessage.mediaObject = wXFileObject;
                wXMediaMessage.title = this.b.getName();
                SendMessageToWX.Req req = new SendMessageToWX.Req();
                req.transaction = Intrinsics.stringPlus(SocialConstants.PARAM_IMG_URL, Boxing.boxLong(System.currentTimeMillis()));
                req.message = wXMediaMessage;
                req.scene = 0;
                this.c.f().sendReq(req);
                this.c.onSuccess.invoke();
                return Unit.INSTANCE;
            }
        }

        public EcgShareHelper(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
            this.activity = activity;
            this.onSuccess = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri e(File file) {
            return Build.VERSION.SDK_INT < 24 ? Uri.fromFile(file) : FileProvider.getUriForFile(this.activity, StorageUtil.FILE_PROVIDER_AUTH, file);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IWXAPI f() {
            return (IWXAPI) this.mWeixinApi.getValue();
        }

        public final void g(@NotNull File file) {
            e.f(this, null, null, new b(file, null), 3, null);
        }

        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return JobKt__JobKt.d(null, 1, null).plus(Dispatchers.getMain());
        }

        public final void h(@NotNull File file) {
            e.f(this, null, null, new c(file, null), 3, null);
        }

        public final void i(@NotNull File file) {
            e.f(this, null, null, new d(file, this, null), 3, null);
        }

        @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
        public void onReq(@Nullable BaseReq p0) {
        }

        @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
        public void onResp(@Nullable BaseResp p0) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment$EcgShareHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EcgShareHelper> {

        /* JADX INFO: renamed from: com.huami.watch.companion.ecg.ui.fragment.ShareFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0655a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ ShareFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0655a(ShareFragment shareFragment) {
                super(0);
                this.a = shareFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LoadingDialog.dismiss(this.a);
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgShareHelper invoke() {
            return new EcgShareHelper(ShareFragment.this.getActivity(), new C0655a(ShareFragment.this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "file", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<File, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull File file) {
            ShareFragment.this.d().h(file);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File file) {
            a(file);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "file", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<File, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull File file) {
            ShareFragment.this.d().i(file);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File file) {
            a(file);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "file", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<File, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull File file) {
            ShareFragment.this.d().g(file);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File file) {
            a(file);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgShareHelper d() {
        return (EcgShareHelper) this.mEcgShareHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ShareFragment shareFragment, View view) {
        Function1<? super Function1<? super File, Unit>, Unit> function1 = shareFragment.mShareFun;
        if (function1 == null) {
            return;
        }
        function1.invoke(shareFragment.new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ShareFragment shareFragment, View view) {
        Function1<? super Function1<? super File, Unit>, Unit> function1 = shareFragment.mShareFun;
        if (function1 == null) {
            return;
        }
        function1.invoke(shareFragment.new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ShareFragment shareFragment, View view) {
        Function1<? super Function1<? super File, Unit>, Unit> function1 = shareFragment.mShareFun;
        if (function1 == null) {
            return;
        }
        function1.invoke(shareFragment.new d());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.ShareDialog);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(1);
        return inflater.inflate(R.layout.fragment_share, container, false);
    }

    @Override // android.app.Fragment
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setCancelable(true);
        View view2 = getView();
        ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.share_qq))).setOnClickListener(new View.OnClickListener() { // from class: ks6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ShareFragment.e(this.a, view3);
            }
        });
        View view3 = getView();
        ((LinearLayout) (view3 == null ? null : view3.findViewById(R.id.share_wechat))).setOnClickListener(new View.OnClickListener() { // from class: js6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                ShareFragment.f(this.a, view4);
            }
        });
        View view4 = getView();
        ((LinearLayout) (view4 != null ? view4.findViewById(R.id.share_other) : null)).setOnClickListener(new View.OnClickListener() { // from class: ls6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                ShareFragment.g(this.a, view5);
            }
        });
    }

    public final void showShareDialog(@Nullable Activity activity, @NotNull Function1<? super Function1<? super File, Unit>, Unit> share) {
        this.mShareFun = share;
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        try {
            show(activity.getFragmentManager(), "ecg_share");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
