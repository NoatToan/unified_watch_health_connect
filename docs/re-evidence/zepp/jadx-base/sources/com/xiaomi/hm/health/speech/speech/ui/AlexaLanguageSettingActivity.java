package com.xiaomi.hm.health.speech.speech.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chenenyu.router.annotation.Route;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageSettingViewModel;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.ui.language.AdapterLanguage;
import com.xiaomi.hm.health.ui.language.LanguageBean;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.view.RecyclerItemDecoration;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes21.dex */
@Route({"AlexaLanguageSettingActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R$\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u001d0\u001d0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/ui/AlexaLanguageSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "u", DTransferConstants.SEARCH_KEY, "initRecyclerView", "", "msg", "v", "hideLoadingDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/ui/language/AdapterLanguage;", "x", "Lcom/xiaomi/hm/health/ui/language/AdapterLanguage;", "adapter", "Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageSettingViewModel;", "y", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/ai/speech/simplify/alexa/language/AlexaLanguageSettingViewModel;", "viewModel", "Lkotlin/Lazy;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "z", "loadingDialog", "Lcom/huami/android/design/dialog/AlertDialogFragment;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "failDialog", "Landroidx/recyclerview/widget/RecyclerView;", "B", "o", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlexaLanguageSettingActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private AdapterLanguage adapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AlexaLanguageSettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy<LoadingDialog> loadingDialog = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy<AlertDialogFragment> failDialog = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy recyclerView = LazyKt__LazyJVMKt.lazy(new d());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/speech/speech/ui/AlexaLanguageSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fm", "", "show", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$Companion$show$1$1", f = "AlexaLanguageSettingActivity.kt", i = {}, l = {48, 51, 55}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ FragmentManager c;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$Companion$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$Companion$show$1$1$1", f = "AlexaLanguageSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C1005a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Context b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1005a(Context context, Continuation<? super C1005a> continuation) {
                    super(2, continuation);
                    this.b = context;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C1005a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C1005a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DialogUtilsKt.gotoAlexaAuthPage(this.b);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$Companion$show$1$1$2", f = "AlexaLanguageSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Context b;
                public final /* synthetic */ FragmentManager c;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$Companion$a$b$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C1006a extends Lambda implements Function0<Unit> {
                    public final /* synthetic */ Context a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1006a(Context context) {
                        super(0);
                        this.a = context;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit getA() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DialogUtilsKt.gotoAlexaAuthPage(this.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Context context, FragmentManager fragmentManager, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = context;
                    this.c = fragmentManager;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.b, this.c, continuation);
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
                    Context context = this.b;
                    DialogUtilsKt.showAlexaAuthLawDialog(context, this.c, new C1006a(context));
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.speech.speech.ui.AlexaLanguageSettingActivity$Companion$show$1$1$3", f = "AlexaLanguageSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ Context b;
                public final /* synthetic */ FragmentManager c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Context context, FragmentManager fragmentManager, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.b = context;
                    this.c = fragmentManager;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new c(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DialogUtilsKt.showAlexaNotSupportDialog(this.b, this.c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, FragmentManager fragmentManager, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = context;
                this.c = fragmentManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                    if (((AuthApi) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AuthApi.class), null, null)).isLogin()) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C1005a c1005a = new C1005a(this.b, null);
                        this.a = 1;
                        if (BuildersKt.withContext(main, c1005a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (CheckDeviceSupportAlexaKt.isLoginCountrySupportAlexa(this.b)) {
                        MainCoroutineDispatcher main2 = Dispatchers.getMain();
                        b bVar = new b(this.b, this.c, null);
                        this.a = 2;
                        if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        MainCoroutineDispatcher main3 = Dispatchers.getMain();
                        c cVar = new c(this.b, this.c, null);
                        this.a = 3;
                        if (BuildersKt.withContext(main3, cVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void show(@NotNull Context context, @NotNull FragmentManager fm) {
            try {
                Result.Companion companion = Result.Companion;
                Result.m3845constructorimpl(e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(context, fm, null), 2, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/AlertDialogFragment;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AlertDialogFragment> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AlertDialogFragment getA() {
            return new AlertDialogFragment.Builder(AlexaLanguageSettingActivity.this).setCancelable(false).setMessage(AlexaLanguageSettingActivity.this.getString(R.string.language_seting_title)).setNeutralButton(AlexaLanguageSettingActivity.this.getString(R.string.nfc_lab_known), new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.speech.speech.ui.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlexaLanguageSettingActivity.a.c(dialogInterface, i);
                }
            }).create();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            AlexaLanguageSettingActivity.this.hideLoadingDialog();
            if (z) {
                AlexaLanguageSettingActivity.this.finish();
            } else {
                ((AlertDialogFragment) AlexaLanguageSettingActivity.this.failDialog.getValue()).show(AlexaLanguageSettingActivity.this.getSupportFragmentManager());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialog> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            return LoadingDialog.showDialog(AlexaLanguageSettingActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RecyclerView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) AlexaLanguageSettingActivity.this.findViewById(R.id.recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoadingDialog() {
        this.loadingDialog.getValue().dismiss();
    }

    private final void initRecyclerView() {
        RecyclerView recyclerViewO = o();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        recyclerViewO.setLayoutManager(linearLayoutManager);
        o().addItemDecoration(new RecyclerItemDecoration(this, 0, Utils.dip2px(this, 0.5f), ContextCompat.getColor(this, R.color.cl_cccccc)));
        this.adapter = new AdapterLanguage();
        RecyclerView recyclerViewO2 = o();
        AdapterLanguage adapterLanguage = this.adapter;
        Objects.requireNonNull(adapterLanguage);
        recyclerViewO2.setAdapter(adapterLanguage);
        p().getAllDeviceSupportLanguage().observe(this, new Observer() { // from class: bc
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AlexaLanguageSettingActivity.t(this.a, (List) obj);
            }
        });
    }

    private final RecyclerView o() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    private final AlexaLanguageSettingViewModel p() {
        return (AlexaLanguageSettingViewModel) this.viewModel.getValue();
    }

    private final void q() {
        getLeftText().setOnClickListener(new View.OnClickListener() { // from class: ac
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlexaLanguageSettingActivity.r(this.a, view);
            }
        });
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: zb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlexaLanguageSettingActivity.s(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AlexaLanguageSettingActivity alexaLanguageSettingActivity, View view) {
        alexaLanguageSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(AlexaLanguageSettingActivity alexaLanguageSettingActivity, View view) {
        Object next;
        if (Utils.isFastDoubleClick(view)) {
            return;
        }
        alexaLanguageSettingActivity.v(alexaLanguageSettingActivity.getString(R.string.language_setting));
        AdapterLanguage adapterLanguage = alexaLanguageSettingActivity.adapter;
        Objects.requireNonNull(adapterLanguage);
        Iterator<T> it2 = adapterLanguage.getSupportLanguage().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((LanguageBean) next).isChecked());
        LanguageBean languageBean = (LanguageBean) next;
        alexaLanguageSettingActivity.p().saveSelectedLanguage(languageBean != null ? new com.huami.ai.speech.simplify.alexa.language.LanguageBean(languageBean.isChecked(), languageBean.getLangCode(), languageBean.getLanguageName(), null, 8, null) : null, alexaLanguageSettingActivity.new b());
    }

    @JvmStatic
    public static final void show(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        INSTANCE.show(context, fragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(AlexaLanguageSettingActivity alexaLanguageSettingActivity, List list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.huami.ai.speech.simplify.alexa.language.LanguageBean languageBean = (com.huami.ai.speech.simplify.alexa.language.LanguageBean) it2.next();
            arrayList.add(new LanguageBean(languageBean.isChecked(), languageBean.getLangCode(), languageBean.getLanguageName(), languageBean.getLocale()));
        }
        List<LanguageBean> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        AdapterLanguage adapterLanguage = alexaLanguageSettingActivity.adapter;
        Objects.requireNonNull(adapterLanguage);
        adapterLanguage.setSupportLanguage(mutableList);
    }

    private final void u() {
        setStyle(BaseTitleActivity.STYLE.CANCEL_AND_SAVE, GlobalConfig.get().isBuildMidong() ? -1 : 0, getString(R.string.title_language_setting), GlobalConfig.get().isBuildMidong());
        setBaseTitleColor(-16777216);
        setRightTitle(getString(R.string.confirm));
        setBaseTitleColor(-16777216, -16777216, -16777216);
        getLeftText().setBackgroundResource(R.drawable.transparent_shape);
        getRightTitle().setBackgroundResource(R.drawable.transparent_shape);
    }

    private final void v(String msg) {
        if (!this.loadingDialog.getValue().isShowing()) {
            this.loadingDialog.getValue().show();
        }
        this.loadingDialog.getValue().setCancelable(false);
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        this.loadingDialog.getValue().setMessage(msg);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_language_setting);
        u();
        q();
        initRecyclerView();
    }
}
