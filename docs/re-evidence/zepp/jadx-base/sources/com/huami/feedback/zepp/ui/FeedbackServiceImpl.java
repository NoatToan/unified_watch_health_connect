package com.huami.feedback.zepp.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.feedback.autowork.AutoUploadAppLogConfigKt;
import com.huami.feedback.entity.Issue;
import com.huami.feedback.entity.IssueItem;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.repo.IssueRepository;
import com.huami.feedback.util.ConstantsKt;
import com.huami.feedback.util.FeedbackKeeper;
import com.huami.feedback.zepp.ui.FeedbackServiceImpl;
import com.huami.feedback.zepp.ui.edit.FeedbackWorkService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J%\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/feedback/zepp/ui/FeedbackServiceImpl;", "Lcom/huami/feedback/api/FeedbackService;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "g", "Lcom/huami/feedback/api/FeedbackParams;", "params", GoogleApiAvailabilityLight.a, "(Landroid/content/Context;Lcom/huami/feedback/api/FeedbackParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "issueId", "Lkotlin/Triple;", "", "Lcom/huami/feedback/entity/IssueItem;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "feedback", "clearFeedbackNotification", "showAutoUploadLogConfigDialogIfNeeded", "Lcom/huami/feedback/repo/IssueRepository;", "a", "Lcom/huami/feedback/repo/IssueRepository;", "issueRepository", "<init>", "(Lcom/huami/feedback/repo/IssueRepository;)V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class FeedbackServiceImpl implements FeedbackService {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IssueRepository issueRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackServiceImpl$feedback$1", f = "FeedbackServiceImpl.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ FeedbackParams d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, FeedbackParams feedbackParams, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = feedbackParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeedbackServiceImpl.this.new a(this.c, this.d, continuation);
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
                FeedbackServiceImpl feedbackServiceImpl = FeedbackServiceImpl.this;
                Context context = this.c;
                FeedbackParams feedbackParams = this.d;
                this.a = 1;
                if (feedbackServiceImpl.d(context, feedbackParams, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackServiceImpl", f = "FeedbackServiceImpl.kt", i = {0}, l = {112}, m = "getIssueInfoByIssueID", n = {"issueId"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FeedbackServiceImpl.this.c(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackServiceImpl", f = "FeedbackServiceImpl.kt", i = {0, 0}, l = {75, 99}, m = "goFeedback", n = {DbUtils.Const.Table.CONTEXT, "params"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return FeedbackServiceImpl.this.d(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.FeedbackServiceImpl$goFeedback$2", f = "FeedbackServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Intent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Intent intent, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = intent;
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
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.startActivity(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "AutoUploadDialog已经显示过了！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "提示用户后台正在提交数据！";
        }
    }

    public FeedbackServiceImpl(@NotNull IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, Continuation<? super Triple<Integer, String, IssueItem>> continuation) {
        b bVar;
        Object next;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objFirst = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            if (str == null) {
                return null;
            }
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.issueRepository.getIssues(CollectionsKt__CollectionsKt.emptyList()));
            bVar.a = str;
            bVar.d = 1;
            objFirst = FlowKt.first(flowFilterNotNull, bVar);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.a;
            ResultKt.throwOnFailure(objFirst);
        }
        for (Issue issue : (List) objFirst) {
            Iterator<T> it2 = issue.getItems().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(String.valueOf(((IssueItem) next).getId()), str));
            IssueItem issueItem = (IssueItem) next;
            if (issueItem != null) {
                return new Triple(Boxing.boxInt(issue.getId()), issue.getType(), issueItem);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(Context context, FeedbackParams feedbackParams, Continuation<? super Unit> continuation) {
        c cVar;
        Intent intent;
        String fromSource;
        List<Uri> images;
        String feedbackInfo;
        FeedbackParams feedbackParams2 = feedbackParams;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objC = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                feedbackParams2 = (FeedbackParams) cVar.b;
                context = (Context) cVar.a;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        String issueId = feedbackParams2 == null ? null : feedbackParams.getIssueId();
        cVar.a = context;
        cVar.b = feedbackParams2;
        cVar.e = 1;
        objC = c(issueId, cVar);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Triple triple = (Triple) objC;
        if (triple == null) {
            intent = new Intent(context, (Class<?>) FeedbackActivity.class);
            if (feedbackParams2 != null && (feedbackInfo = feedbackParams2.getFeedbackInfo()) != null) {
                intent.putExtra(FeedbackActivity.KEY_USER_DESCRIPTION, feedbackInfo);
            }
            if (feedbackParams2 != null && (images = feedbackParams2.getImages()) != null) {
                Object[] array = images.toArray(new Uri[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                intent.putExtra(FeedbackActivity.KEY_USER_IMAGES, (Parcelable[]) array);
            }
            if (feedbackParams2 != null && (fromSource = feedbackParams2.getFromSource()) != null) {
                intent.putExtra(FeedbackActivity.KEY_FEEDBACK_SOURCE, fromSource);
            }
            if (feedbackParams2 != null) {
                intent.putExtra(ConstantsKt.EXTRA_FORCE_DARK, feedbackParams2.isForceDark());
            }
        } else {
            UserForm userForm = new UserForm(null, ((String) triple.getSecond()) + '-' + ((IssueItem) triple.getThird()).getTitle(), ((Number) triple.getFirst()).intValue(), (IssueItem) triple.getThird(), feedbackParams2 == null ? null : feedbackParams2.getFeedbackInfo(), null, feedbackParams2 == null ? null : feedbackParams2.getImages(), 0L, 128, null);
            intent = new Intent(context, (Class<?>) FeedbackActivity.class);
            intent.putExtra(FeedbackActivity.KEY_USER_FORM, userForm);
            if (feedbackParams2 != null) {
                intent.putExtra(ConstantsKt.EXTRA_FORCE_DARK, feedbackParams2.isForceDark());
            }
        }
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        d dVar = new d(context, intent, null);
        cVar.a = null;
        cVar.b = null;
        cVar.e = 2;
        if (BuildersKt.withContext(immediate, dVar, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Context context, DialogInterface dialogInterface, int i) {
        FeedbackKeeper.INSTANCE.saveAutoUpload(true);
        AutoUploadAppLogConfigKt.enableAutoUpload(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Context context, DialogInterface dialogInterface, int i) {
        FeedbackKeeper.INSTANCE.saveAutoUpload(false);
        AutoUploadAppLogConfigKt.cancelAutoUpload(context.getApplicationContext());
    }

    private final void g(Context context, FragmentManager fragmentManager) {
        HMLog.info("feedback", f.a);
        new AlertDialogFragment.Builder(context).setTitle(R.string.feedback_ialog_title_notice).setMessage(R.string.feedback_dialog_msg_uploading).setNeutralButton(R.string.feedback_dialog_neature_text, (DialogInterface.OnClickListener) null).show(fragmentManager);
    }

    @Override // com.huami.feedback.api.FeedbackService
    public void clearFeedbackNotification(@NotNull Context context) {
        FeedbackWorkService.INSTANCE.stopFeedback(context);
    }

    @Override // com.huami.feedback.api.FeedbackService
    public void feedback(@Nullable CoroutineScope coroutineScope, @NotNull Context context, @NotNull FragmentManager fragmentManager, @Nullable FeedbackParams params) {
        if (FeedbackWorkService.INSTANCE.isSubmitting()) {
            g(context, fragmentManager);
            return;
        }
        if (coroutineScope == null) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate());
        }
        kotlinx.coroutines.e.f(coroutineScope, Dispatchers.getMain().getImmediate(), null, new a(context, params, null), 2, null);
    }

    @Override // com.huami.feedback.api.FeedbackService
    public void showAutoUploadLogConfigDialogIfNeeded(@NotNull final Context context, @NotNull FragmentManager fragmentManager) {
        if (FeedbackKeeper.INSTANCE.getAutoUpload() != null) {
            HMLog.info("feedback", e.a);
        } else {
            new AlertDialogFragment.Builder(context).setTitle(com.huami.feedback.R.string.dialog_auto_upload_title).setMessage(com.huami.feedback.R.string.dialog_auto_upload_content).setNegativeButton(com.huami.feedback.R.string.dialog_auto_upload_refuse, new DialogInterface.OnClickListener() { // from class: x42
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    FeedbackServiceImpl.f(context, dialogInterface, i);
                }
            }).setPositiveButton(com.huami.feedback.R.string.got_it, new DialogInterface.OnClickListener() { // from class: y42
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    FeedbackServiceImpl.e(context, dialogInterface, i);
                }
            }).show(fragmentManager).setGravity(17);
        }
    }
}
