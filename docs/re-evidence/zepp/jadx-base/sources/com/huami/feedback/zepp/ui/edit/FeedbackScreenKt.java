package com.huami.feedback.zepp.ui.edit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.ManagedActivityResultLauncher;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.feedback.ContactType;
import com.huami.feedback.domain.ConnectDeviceStates;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.zepp.ui.FeedbackViewModel;
import com.huami.feedback.zepp.ui.R;
import com.huami.feedback.zepp.ui.domain.ActionType;
import com.huami.feedback.zepp.ui.domain.CheckFeedbackEnvUiState;
import com.huami.feedback.zepp.ui.domain.ToastType;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.TextStyleKt;
import com.huami.lib.compose.rainbow.view.BottomSheetKt;
import com.huami.lib.compose.rainbow.view.DialogKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aO\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a»\u0002\u0010%\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u001b\u001a\u00020\f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u001c2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u001c2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b%\u0010&\u001a9\u0010*\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b*\u0010+\u001a#\u0010.\u001a\u00020\u00032\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b.\u0010/\u001a5\u00104\u001a\u00020\u0003*\b\u0012\u0004\u0012\u000201002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b4\u00105\u001aK\u0010;\u001a\u00020\u0003*\b\u0012\u0004\u0012\u000206002\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u001c2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b;\u0010<\"\u0016\u0010?\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>\"\u0016\u0010A\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010>\"\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010>¨\u0006D"}, d2 = {"Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "viewModel", "Lkotlin/Function0;", "", com.alipay.sdk.m.x.d.n, "onFinish", "onOpenCamera", "onOpenAlbum", "FeedbackScreenRoute", "(Lcom/huami/feedback/zepp/ui/FeedbackViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "userId", "", "isChineseUser", "isNeedPhone", "", "descriptionLimitSize", "issueTitle", "Lkotlinx/coroutines/flow/StateFlow;", "descriptionStateFlow", "Lcom/huami/feedback/entity/Contact;", "contactFlow", "", "Landroid/net/Uri;", "images", "appLogCheckStateFlow", "deviceLogCheckStateFlow", "deviceLogCheckBoxVisible", "Lkotlin/Function1;", "onDescriptionChanged", "onDeleteImage", "Lcom/huami/feedback/ContactType;", "onContactTypeChanged", "onContactChanged", "onAppLogCheck", "onDeviceLogCheck", "onSubmitClick", "FeedbackEditRoute", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZZILjava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", ContactSettingItemActivity.KEY_CONTACT, "onPositiveClicked", "onNegativeClicked", "ContactTypeSelectView", "(Lcom/huami/feedback/entity/Contact;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/huami/feedback/zepp/ui/edit/ImageSelectWay;", "onImageSelectWay", "f", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/State;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "openBle", "checkEnvSuccess", "g", "(Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/huami/feedback/domain/ConnectDeviceStates;", "appLogChecked", "deviceLogChecked", "checkEnv", "retryConnect", "h", "(Landroidx/compose/runtime/State;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "a", LogUtil.I, "SHEET_NONE", "b", "SHEET_CONTACT_WAY", "c", "SHEET_IMAGE_WAY", "feedback-zepp-ui_release"}, k = 2, mv = {1, 5, 1})
public final class FeedbackScreenKt {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActionType.values().length];
            iArr[ActionType.OPEN_BLUETOOTH.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConnectDeviceStates.values().length];
            iArr2[ConnectDeviceStates.Connecting.ordinal()] = 1;
            iArr2[ConnectDeviceStates.Connected.ordinal()] = 2;
            iArr2[ConnectDeviceStates.ConnectFailed.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ MutableState<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Integer> mutableState) {
            super(1);
            this.a = mutableState;
        }

        public final void a(int i) {
            FeedbackScreenKt.b(this.a, i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function1<ContactType, Unit> a;
        public final /* synthetic */ MutableState<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super ContactType, Unit> function1, MutableState<Integer> mutableState) {
            super(0);
            this.a = function1;
            this.b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke(ContactType.values()[FeedbackScreenKt.a(this.b)]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Contact a;
        public final /* synthetic */ Function1<ContactType, Unit> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Contact contact, Function1<? super ContactType, Unit> function1, Function0<Unit> function0, int i) {
            super(2);
            this.a = contact;
            this.b = function1;
            this.c = function0;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackScreenKt.ContactTypeSelectView(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ StateFlow<String> g;
        public final /* synthetic */ StateFlow<List<Uri>> h;
        public final /* synthetic */ StateFlow<Boolean> i;
        public final /* synthetic */ StateFlow<Boolean> j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ Function1<String, Unit> l;
        public final /* synthetic */ Function1<Uri, Unit> m;
        public final /* synthetic */ Function1<Contact, Unit> n;
        public final /* synthetic */ Function1<Boolean, Unit> o;
        public final /* synthetic */ Function1<Boolean, Unit> p;
        public final /* synthetic */ Function0<Unit> q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;
        public final /* synthetic */ int t;
        public final /* synthetic */ State<Contact> u;
        public final /* synthetic */ CoroutineScope v;
        public final /* synthetic */ MutableState<Integer> w;
        public final /* synthetic */ ModalBottomSheetState x;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ CoroutineScope a;
            public final /* synthetic */ MutableState<Integer> b;
            public final /* synthetic */ ModalBottomSheetState c;

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$2$1$1", f = "FeedbackScreen.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0394a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ ModalBottomSheetState b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0394a(ModalBottomSheetState modalBottomSheetState, Continuation<? super C0394a> continuation) {
                    super(2, continuation);
                    this.b = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0394a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0394a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ModalBottomSheetState modalBottomSheetState = this.b;
                        this.a = 1;
                        if (modalBottomSheetState.show(this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CoroutineScope coroutineScope, MutableState<Integer> mutableState, ModalBottomSheetState modalBottomSheetState) {
                super(0);
                this.a = coroutineScope;
                this.b = mutableState;
                this.c = modalBottomSheetState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FeedbackScreenKt.d(this.b, 1);
                kotlinx.coroutines.e.f(this.a, null, null, new C0394a(this.c, null), 3, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ CoroutineScope a;
            public final /* synthetic */ MutableState<Integer> b;
            public final /* synthetic */ ModalBottomSheetState c;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$2$2$1", f = "FeedbackScreen.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ ModalBottomSheetState b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ModalBottomSheetState modalBottomSheetState, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = modalBottomSheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.b, continuation);
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
                        ModalBottomSheetState modalBottomSheetState = this.b;
                        this.a = 1;
                        if (modalBottomSheetState.show(this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CoroutineScope coroutineScope, MutableState<Integer> mutableState, ModalBottomSheetState modalBottomSheetState) {
                super(0);
                this.a = coroutineScope;
                this.b = mutableState;
                this.c = modalBottomSheetState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FeedbackScreenKt.d(this.b, 2);
                kotlinx.coroutines.e.f(this.a, null, null, new a(this.c, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<Unit> function0, String str, boolean z, boolean z2, int i, String str2, StateFlow<String> stateFlow, StateFlow<? extends List<? extends Uri>> stateFlow2, StateFlow<Boolean> stateFlow3, StateFlow<Boolean> stateFlow4, boolean z3, Function1<? super String, Unit> function1, Function1<? super Uri, Unit> function2, Function1<? super Contact, Unit> function3, Function1<? super Boolean, Unit> function4, Function1<? super Boolean, Unit> function5, Function0<Unit> function6, int i2, int i3, int i4, State<Contact> state, CoroutineScope coroutineScope, MutableState<Integer> mutableState, ModalBottomSheetState modalBottomSheetState) {
            super(2);
            this.a = function0;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = i;
            this.f = str2;
            this.g = stateFlow;
            this.h = stateFlow2;
            this.i = stateFlow3;
            this.j = stateFlow4;
            this.k = z3;
            this.l = function1;
            this.m = function2;
            this.n = function3;
            this.o = function4;
            this.p = function5;
            this.q = function6;
            this.r = i2;
            this.s = i3;
            this.t = i4;
            this.u = state;
            this.v = coroutineScope;
            this.w = mutableState;
            this.x = modalBottomSheetState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            Function0<Unit> function0 = this.a;
            String str = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            int i2 = this.e;
            String str2 = this.f;
            StateFlow<String> stateFlow = this.g;
            Contact contactE = FeedbackScreenKt.e(this.u);
            StateFlow<List<Uri>> stateFlow2 = this.h;
            StateFlow<Boolean> stateFlow3 = this.i;
            StateFlow<Boolean> stateFlow4 = this.j;
            boolean z3 = this.k;
            Function1<String, Unit> function1 = this.l;
            a aVar = new a(this.v, this.w, this.x);
            b bVar = new b(this.v, this.w, this.x);
            Function1<Uri, Unit> function2 = this.m;
            Function1<Contact, Unit> function3 = this.n;
            Function1<Boolean, Unit> function4 = this.o;
            Function1<Boolean, Unit> function5 = this.p;
            Function0<Unit> function6 = this.q;
            int i3 = this.r;
            int i4 = 1226833920 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (57344 & i3) | (i3 & 458752);
            int i5 = this.s;
            FeedbackContentScreenKt.FeedbackEditScreen(function0, str, z, z2, i2, str2, stateFlow, contactE, stateFlow2, stateFlow3, stateFlow4, z3, function1, aVar, bVar, function2, function3, function4, function5, function6, composer, i4, ((i5 >> 3) & 234881024) | (i5 & 112) | 8 | (i5 & 896) | (458752 & i5) | (3670016 & (i5 >> 3)) | (29360128 & (i5 >> 3)) | (1879048192 & (this.t << 27)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ StateFlow<String> g;
        public final /* synthetic */ StateFlow<Contact> h;
        public final /* synthetic */ StateFlow<List<Uri>> i;
        public final /* synthetic */ StateFlow<Boolean> j;
        public final /* synthetic */ StateFlow<Boolean> k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ Function1<String, Unit> m;
        public final /* synthetic */ Function0<Unit> n;
        public final /* synthetic */ Function0<Unit> o;
        public final /* synthetic */ Function1<Uri, Unit> p;
        public final /* synthetic */ Function1<ContactType, Unit> q;
        public final /* synthetic */ Function1<Contact, Unit> r;
        public final /* synthetic */ Function1<Boolean, Unit> s;
        public final /* synthetic */ Function1<Boolean, Unit> t;
        public final /* synthetic */ Function0<Unit> u;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function0<Unit> function0, String str, boolean z, boolean z2, int i, String str2, StateFlow<String> stateFlow, StateFlow<Contact> stateFlow2, StateFlow<? extends List<? extends Uri>> stateFlow3, StateFlow<Boolean> stateFlow4, StateFlow<Boolean> stateFlow5, boolean z3, Function1<? super String, Unit> function1, Function0<Unit> function2, Function0<Unit> function3, Function1<? super Uri, Unit> function4, Function1<? super ContactType, Unit> function5, Function1<? super Contact, Unit> function6, Function1<? super Boolean, Unit> function7, Function1<? super Boolean, Unit> function8, Function0<Unit> function9, int i2, int i3, int i4) {
            super(2);
            this.a = function0;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = i;
            this.f = str2;
            this.g = stateFlow;
            this.h = stateFlow2;
            this.i = stateFlow3;
            this.j = stateFlow4;
            this.k = stateFlow5;
            this.l = z3;
            this.m = function1;
            this.n = function2;
            this.o = function3;
            this.p = function4;
            this.q = function5;
            this.r = function6;
            this.s = function7;
            this.t = function8;
            this.u = function9;
            this.v = i2;
            this.w = i3;
            this.x = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackScreenKt.FeedbackEditRoute(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, composer, this.v | 1, this.w, this.x);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.checkDeviceLog(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FeedbackViewModel feedbackViewModel) {
            super(0);
            this.a = feedbackViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.submitFeedback();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ FeedbackViewModel a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FeedbackViewModel feedbackViewModel, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Function0<Unit> function3, int i) {
            super(2);
            this.a = feedbackViewModel;
            this.b = function0;
            this.c = function1;
            this.d = function2;
            this.e = function3;
            this.f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackScreenKt.FeedbackScreenRoute(this.a, this.b, this.c, this.d, this.e, composer, this.f | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher) {
            super(0);
            this.a = managedActivityResultLauncher;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.launch(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Unit> {
        public final /* synthetic */ CoroutineScope a;
        public final /* synthetic */ FeedbackViewModel b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Function0<Unit> d;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackScreenRoute$2$1", f = "FeedbackScreen.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ FeedbackViewModel b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ Function0<Unit> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FeedbackViewModel feedbackViewModel, Context context, Function0<Unit> function0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = feedbackViewModel;
                this.c = context;
                this.d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
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
                    FeedbackViewModel feedbackViewModel = this.b;
                    this.a = 1;
                    if (feedbackViewModel.submitUserForm(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intent intent = new Intent(this.c, (Class<?>) FeedbackWorkService.class);
                intent.setAction(FeedbackWorkService.ACTION_FEEDBACK);
                this.c.startService(intent);
                this.d.getA();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CoroutineScope coroutineScope, FeedbackViewModel feedbackViewModel, Context context, Function0<Unit> function0) {
            super(0);
            this.a = coroutineScope;
            this.b = feedbackViewModel;
            this.c = context;
            this.d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.e.f(this.a, null, null, new a(this.b, this.c, this.d, null), 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.checkDeviceLog(z);
            this.a.checkFeedbackEnv();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(FeedbackViewModel feedbackViewModel) {
            super(0);
            this.a = feedbackViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.connectDevice();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            this.a.updateDescription(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<Uri, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        public final void a(@NotNull Uri uri) {
            this.a.deleteImage(uri);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            a(uri);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<ContactType, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        public final void a(@NotNull ContactType contactType) {
            this.a.updateContactType(contactType);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContactType contactType) {
            a(contactType);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<Contact, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        public final void a(@NotNull Contact contact) {
            this.a.updateContact(contact);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Contact contact) {
            a(contact);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.checkAppLog(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<ActivityResult, Unit> {
        public final /* synthetic */ FeedbackViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(FeedbackViewModel feedbackViewModel) {
            super(1);
            this.a = feedbackViewModel;
        }

        public final void a(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                this.a.connectDevice();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
            a(activityResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Function1<ImageSelectWay, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(int i, Function1<? super ImageSelectWay, Unit> function1) {
            super(0);
            this.a = i;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a == 0) {
                this.b.invoke(ImageSelectWay.Camera);
            } else {
                this.b.invoke(ImageSelectWay.Album);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(3);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i) {
            if (((i & 81) ^ 16) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            TextStyle body3 = TextStyleKt.getBody3();
            TextKt.m869TextfLXpl1I(this.a, PaddingKt.m283paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m2965constructorimpl(16), 1, null), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, body3, composer, 48, 64, 32760);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function1<ImageSelectWay, Unit> a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(Function1<? super ImageSelectWay, Unit> function1, int i) {
            super(2);
            this.a = function1;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackScreenKt.f(this.a, composer, this.b | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ State<CheckFeedbackEnvUiState> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(State<? extends CheckFeedbackEnvUiState> state, Function0<Unit> function0, Function0<Unit> function1, int i) {
            super(2);
            this.a = state;
            this.b = function0;
            this.c = function1;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackScreenKt.g(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.a = mutableState;
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setValue(Boolean.FALSE);
            this.b.getA();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> a;
        public final /* synthetic */ LoadingDialog b;
        public final /* synthetic */ Function1<Boolean, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(MutableState<Boolean> mutableState, LoadingDialog loadingDialog, Function1<? super Boolean, Unit> function1) {
            super(0);
            this.a = mutableState;
            this.b = loadingDialog;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState<Boolean> mutableState = this.a;
            Boolean bool = Boolean.FALSE;
            mutableState.setValue(bool);
            this.b.dismiss();
            this.c.invoke(bool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ State<ConnectDeviceStates> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Function1<Boolean, Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(State<? extends ConnectDeviceStates> state, boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, int i) {
            super(2);
            this.a = state;
            this.b = z;
            this.c = z2;
            this.d = function1;
            this.e = function0;
            this.f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            FeedbackScreenKt.h(this.a, this.b, this.c, this.d, this.e, composer, this.f | 1);
        }
    }

    @Composable
    public static final void ContactTypeSelectView(@NotNull Contact contact, @NotNull Function1<? super ContactType, Unit> function1, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1734923511);
        String[] strArrStringArrayResource = StringResources_androidKt.stringArrayResource(R.array.contact_ways, composerStartRestartGroup, 0);
        int iIndexOf = ArraysKt___ArraysKt.indexOf(ContactType.values(), contact.getContactType());
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(iIndexOf), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-1113031299);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(276693241);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        DialogKt.DialogTitleView(R.string.select_contact_way, composerStartRestartGroup, 0);
        int iA = a(mutableState);
        composerStartRestartGroup.startReplaceableGroup(-3686930);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new a(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        DialogKt.SingleChoiceWithIndicatorView(strArrStringArrayResource, iA, (Function1) objRememberedValue2, composerStartRestartGroup, 8);
        String strStringResource = StringResources_androidKt.stringResource(R.string.save, composerStartRestartGroup, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(R.string.cancel, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-3686552);
        boolean zChanged2 = composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new b(function1, mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        DialogKt.DialogButton(strStringResource, strStringResource2, null, (Function0) objRememberedValue3, function0, null, composerStartRestartGroup, (i2 << 6) & 57344, 36);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(contact, function1, function0, i2));
    }

    @Composable
    public static final void FeedbackEditRoute(@NotNull Function0<Unit> function0, @NotNull String str, boolean z, boolean z2, int i2, @NotNull String str2, @NotNull StateFlow<String> stateFlow, @NotNull StateFlow<Contact> stateFlow2, @NotNull StateFlow<? extends List<? extends Uri>> stateFlow3, @NotNull StateFlow<Boolean> stateFlow4, @NotNull StateFlow<Boolean> stateFlow5, boolean z3, @NotNull Function1<? super String, Unit> function1, @NotNull final Function0<Unit> function2, @NotNull final Function0<Unit> function3, @NotNull Function1<? super Uri, Unit> function4, @NotNull final Function1<? super ContactType, Unit> function5, @NotNull Function1<? super Contact, Unit> function6, @NotNull Function1<? super Boolean, Unit> function7, @NotNull Function1<? super Boolean, Unit> function8, @NotNull Function0<Unit> function9, @Nullable Composer composer, int i3, int i4, int i5) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-627852567);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-723524056);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        final ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, composerStartRestartGroup, 6, 6);
        final State stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow2, null, composerStartRestartGroup, 8, 1);
        BottomSheetKt.ModalBottomSheetLayout(ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819888347, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt.FeedbackEditRoute.1

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<ContactType, Unit> {
                public final /* synthetic */ Function1<ContactType, Unit> a;
                public final /* synthetic */ CoroutineScope b;
                public final /* synthetic */ ModalBottomSheetState c;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$1$1", f = "FeedbackScreen.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DISCO}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0393a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ ModalBottomSheetState b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0393a(ModalBottomSheetState modalBottomSheetState, Continuation<? super C0393a> continuation) {
                        super(2, continuation);
                        this.b = modalBottomSheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0393a(this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C0393a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            ModalBottomSheetState modalBottomSheetState = this.b;
                            this.a = 1;
                            if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Function1<? super ContactType, Unit> function1, CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState) {
                    super(1);
                    this.a = function1;
                    this.b = coroutineScope;
                    this.c = modalBottomSheetState;
                }

                public final void a(@NotNull ContactType contactType) {
                    this.a.invoke(contactType);
                    kotlinx.coroutines.e.f(this.b, null, null, new C0393a(this.c, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContactType contactType) {
                    a(contactType);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<Unit> {
                public final /* synthetic */ CoroutineScope a;
                public final /* synthetic */ ModalBottomSheetState b;

                /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$b$a */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$2$1", f = "FeedbackScreen.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ ModalBottomSheetState b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(ModalBottomSheetState modalBottomSheetState, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = modalBottomSheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, continuation);
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
                            ModalBottomSheetState modalBottomSheetState = this.b;
                            this.a = 1;
                            if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState) {
                    super(0);
                    this.a = coroutineScope;
                    this.b = modalBottomSheetState;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit getA() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    kotlinx.coroutines.e.f(this.a, null, null, new a(this.b, null), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull ColumnScope columnScope, @Nullable Composer composer2, int i6) {
                if (((i6 & 81) ^ 16) == 0 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (FeedbackScreenKt.c(mutableState) == 1) {
                    composer2.startReplaceableGroup(1692326451);
                    FeedbackScreenKt.ContactTypeSelectView(FeedbackScreenKt.e(stateCollectAsState), new a(function5, coroutineScope, modalBottomSheetStateRememberModalBottomSheetState), new b(coroutineScope, modalBottomSheetStateRememberModalBottomSheetState), composer2, 8);
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.startReplaceableGroup(1692326863);
                final CoroutineScope coroutineScope2 = coroutineScope;
                final ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateRememberModalBottomSheetState;
                final Function0<Unit> function10 = function2;
                final Function0<Unit> function11 = function3;
                FeedbackScreenKt.f(new Function1<ImageSelectWay, Unit>() { // from class: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt.FeedbackEditRoute.1.3

                    /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$3$1, reason: invalid class name and collision with other inner class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$3$1", f = "FeedbackScreen.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C03921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int a;
                        public final /* synthetic */ ModalBottomSheetState b;
                        public final /* synthetic */ ImageSelectWay c;
                        public final /* synthetic */ Function0<Unit> d;
                        public final /* synthetic */ Function0<Unit> e;

                        /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.edit.FeedbackScreenKt$FeedbackEditRoute$1$3$1$WhenMappings */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ImageSelectWay.values().length];
                                iArr[ImageSelectWay.Camera.ordinal()] = 1;
                                iArr[ImageSelectWay.Album.ordinal()] = 2;
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C03921(ModalBottomSheetState modalBottomSheetState, ImageSelectWay imageSelectWay, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super C03921> continuation) {
                            super(2, continuation);
                            this.b = modalBottomSheetState;
                            this.c = imageSelectWay;
                            this.d = function0;
                            this.e = function1;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C03921(this.b, this.c, this.d, this.e, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C03921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                            int i = this.a;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                ModalBottomSheetState modalBottomSheetState = this.b;
                                this.a = 1;
                                if (modalBottomSheetState.hide(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            int i2 = WhenMappings.$EnumSwitchMapping$0[this.c.ordinal()];
                            if (i2 == 1) {
                                this.d.getA();
                            } else if (i2 == 2) {
                                this.e.getA();
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@NotNull ImageSelectWay imageSelectWay) {
                        kotlinx.coroutines.e.f(coroutineScope2, null, null, new C03921(modalBottomSheetState, imageSelectWay, function10, function11, null), 3, null);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageSelectWay imageSelectWay) {
                        a(imageSelectWay);
                        return Unit.INSTANCE;
                    }
                }, composer2, 0);
                composer2.endReplaceableGroup();
            }
        }), null, modalBottomSheetStateRememberModalBottomSheetState, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819889396, true, new d(function0, str, z, z2, i2, str2, stateFlow, stateFlow3, stateFlow4, stateFlow5, z3, function1, function4, function6, function7, function8, function9, i3, i4, i5, stateCollectAsState, coroutineScope, mutableState, modalBottomSheetStateRememberModalBottomSheetState)), composerStartRestartGroup, 3078, 2);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(function0, str, z, z2, i2, str2, stateFlow, stateFlow2, stateFlow3, stateFlow4, stateFlow5, z3, function1, function2, function3, function4, function5, function6, function7, function8, function9, i3, i4, i5));
    }

    @Composable
    public static final void FeedbackScreenRoute(@NotNull FeedbackViewModel feedbackViewModel, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1, @NotNull Function0<Unit> function2, @NotNull Function0<Unit> function3, @Nullable Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2038500273);
        composerStartRestartGroup.startReplaceableGroup(-723524056);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.StartActivityForResult(), new r(feedbackViewModel), composerStartRestartGroup, 8);
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        feedbackViewModel.resetCheckFeedbackUiState();
        g(SnapshotStateKt.collectAsState(feedbackViewModel.getCheckFeedbackEnvUiState(), null, composerStartRestartGroup, 8, 1), new i(managedActivityResultLauncherRememberLauncherForActivityResult), new j(coroutineScope, feedbackViewModel, context, function1), composerStartRestartGroup, 0);
        feedbackViewModel.resetConnectState();
        h(SnapshotStateKt.collectAsState(feedbackViewModel.getConnectStateFlow(), null, composerStartRestartGroup, 8, 1), feedbackViewModel.getAppLogCheckState().getValue().booleanValue(), feedbackViewModel.getDeviceLogCheckState().getValue().booleanValue(), new k(feedbackViewModel), new l(feedbackViewModel), composerStartRestartGroup, 0);
        FeedbackEditRoute(function0, feedbackViewModel.getUserId(), feedbackViewModel.getIsChineseUser(), feedbackViewModel.isNeedPhone(), feedbackViewModel.getDescriptionLimitSize(), feedbackViewModel.getIssueTitle(), feedbackViewModel.getDescriptionState(), feedbackViewModel.getContactState(), feedbackViewModel.getImagesStateFlow(), feedbackViewModel.getAppLogCheckState(), feedbackViewModel.getDeviceLogCheckState(), feedbackViewModel.getDeviceLogCheckBoxVisible(), new m(feedbackViewModel), function2, function3, new n(feedbackViewModel), new o(feedbackViewModel), new p(feedbackViewModel), new q(feedbackViewModel), new f(feedbackViewModel), new g(feedbackViewModel), composerStartRestartGroup, ((i2 >> 3) & 14) | 1226833920, (i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | 8 | (57344 & i2), 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(feedbackViewModel, function0, function1, function2, function3, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Integer> mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState<Integer> mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Contact e(State<Contact> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Composable
    public static final void f(Function1<? super ImageSelectWay, Unit> function1, Composer composer, int i2) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(2056663057);
        if (((((i2 & 14) == 0 ? (composerStartRestartGroup.changed(function1) ? 4 : 2) | i2 : i2) & 11) ^ 2) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ?? r12 = 1;
            String[] strArr = {StringResources_androidKt.stringResource(R.string.feedback_select_from_camera, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.feedback_select_from_local, composerStartRestartGroup, 0)};
            float f2 = 0.0f;
            Object obj2 = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-1113031299);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(276693241);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 2; i3 < i5; i5 = 2) {
                String str = strArr[i3];
                int i6 = i3 + 1;
                int i7 = i4 + 1;
                Integer numValueOf = Integer.valueOf(i4);
                composerStartRestartGroup.startReplaceableGroup(-3686552);
                boolean zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(function1);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new s(i4, function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i8 = i4;
                String[] strArr2 = strArr;
                ButtonKt.TextButton((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(companion2, f2, r12, obj2), false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819900425, r12, new t(str)), composerStartRestartGroup, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (i8 != 1) {
                    composerStartRestartGroup.startReplaceableGroup(-1023665541);
                    obj = null;
                    SpacerKt.Spacer(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m2965constructorimpl(1)), ColorKt.getS4(), null, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    obj = null;
                    composerStartRestartGroup.startReplaceableGroup(-1023665326);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                obj2 = obj;
                i3 = i6;
                i4 = i7;
                strArr = strArr2;
                f2 = 0.0f;
                r12 = 1;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new u(function1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void g(State<? extends CheckFeedbackEnvUiState> state, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2001430026);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function1) ? 256 : 128;
        }
        if (((i3 & 731) ^ 146) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            CheckFeedbackEnvUiState value = state.getValue();
            if (value instanceof CheckFeedbackEnvUiState.ToastError) {
                composerStartRestartGroup.startReplaceableGroup(-2001429807);
                CheckFeedbackEnvUiState.ToastError toastError = (CheckFeedbackEnvUiState.ToastError) state.getValue();
                if (toastError.getToastType() == ToastType.ICON_TOAST) {
                    composerStartRestartGroup.startReplaceableGroup(-2001429680);
                    IconToast.showError(context, StringResources_androidKt.stringResource(toastError.getMessage(), composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2001429520);
                    composerStartRestartGroup.endReplaceableGroup();
                    CustomToast.makeText(context, toastError.getMessage(), 0).show();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (value instanceof CheckFeedbackEnvUiState.ActionError) {
                composerStartRestartGroup.startReplaceableGroup(-2001429272);
                composerStartRestartGroup.endReplaceableGroup();
                if (WhenMappings.$EnumSwitchMapping$0[((CheckFeedbackEnvUiState.ActionError) state.getValue()).getAction().ordinal()] == 1) {
                    function0.getA();
                }
            } else if (value instanceof CheckFeedbackEnvUiState.Successful) {
                composerStartRestartGroup.startReplaceableGroup(-2001428985);
                composerStartRestartGroup.endReplaceableGroup();
                function1.getA();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2001428951);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new v(state, function0, function1, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void h(State<? extends ConnectDeviceStates> state, boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2001428917);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            i3 |= composerStartRestartGroup.changed(function1) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 16384 : 8192;
        }
        if (((i3 & 46811) ^ 9362) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                LoadingDialog loadingDialog = new LoadingDialog(context);
                loadingDialog.setCancelable(false);
                composerStartRestartGroup.updateRememberedValue(loadingDialog);
                obj = loadingDialog;
            }
            composerStartRestartGroup.endReplaceableGroup();
            LoadingDialog loadingDialog2 = (LoadingDialog) obj;
            int i4 = WhenMappings.$EnumSwitchMapping$1[state.getValue().ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceableGroup(-2001428542);
                loadingDialog2.setMessage(StringResources_androidKt.stringResource(R.string.feedback_device_connecting, composerStartRestartGroup, 0));
                loadingDialog2.show();
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceableGroup(-2001428366);
                composerStartRestartGroup.endReplaceableGroup();
                loadingDialog2.dismiss();
                function1.invoke(Boolean.valueOf(z2));
            } else if (i4 != 3) {
                composerStartRestartGroup.startReplaceableGroup(-2001427227);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2001428234);
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-2001428201);
                    composerStartRestartGroup.startReplaceableGroup(-3687241);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState = (MutableState) objRememberedValue2;
                    String strStringResource = StringResources_androidKt.stringResource(R.string.feedback_device_connect_failed, composerStartRestartGroup, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.feedback_device_connnect_failed_cancel_text, composerStartRestartGroup, 0);
                    String strStringResource3 = StringResources_androidKt.stringResource(R.string.feedback_device_connnect_failed_ok_text, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-3686552);
                    boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function0);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new w(mutableState, function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    DialogKt.RainbowDialog(mutableState, null, strStringResource, null, null, null, strStringResource2, strStringResource3, null, (Function0) objRememberedValue3, new x(mutableState, loadingDialog2, function1), null, composerStartRestartGroup, 6, 0, 2362);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2001427361);
                    loadingDialog2.setFailed(StringResources_androidKt.stringResource(R.string.feedback_device_conn_fail, composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new y(state, z, z2, function1, function0, i2));
    }
}
