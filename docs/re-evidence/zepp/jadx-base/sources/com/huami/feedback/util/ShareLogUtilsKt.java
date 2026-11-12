package com.huami.feedback.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\"\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "activity", "", "doShare", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "", "a", "Ljava/lang/String;", "SHARE_ZIP_FILE", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class ShareLogUtilsKt {

    @NotNull
    private static final String a = "hm_share_log.zip";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.util.ShareLogUtilsKt$doShare$1", f = "ShareLogUtils.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FragmentActivity b;

        /* JADX INFO: renamed from: com.huami.feedback.util.ShareLogUtilsKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.feedback.util.ShareLogUtilsKt$doShare$1$1", f = "ShareLogUtils.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0387a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ FragmentActivity c;

            /* JADX INFO: renamed from: com.huami.feedback.util.ShareLogUtilsKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.feedback.util.ShareLogUtilsKt$doShare$1$1$2$1", f = "ShareLogUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0388a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ FragmentActivity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0388a(FragmentActivity fragmentActivity, Continuation<? super C0388a> continuation) {
                    super(2, continuation);
                    this.b = fragmentActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0388a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0388a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setFlags(268435456);
                    FragmentActivity fragmentActivity = this.b;
                    Uri uriForFile = FileProvider.getUriForFile(fragmentActivity, ShareLogUtilsKt.a(fragmentActivity), new File(this.b.getFilesDir(), ShareLogUtilsKt.a));
                    intent.putExtra("android.intent.extra.STREAM", uriForFile);
                    intent.setType(this.b.getContentResolver().getType(uriForFile));
                    intent.addFlags(1);
                    this.b.startActivity(Intent.createChooser(intent, "分享"));
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.huami.feedback.util.ShareLogUtilsKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("Share fail:", this.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0387a(FragmentActivity fragmentActivity, Continuation<? super C0387a> continuation) {
                super(2, continuation);
                this.c = fragmentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0387a c0387a = new C0387a(this.c, continuation);
                c0387a.b = obj;
                return c0387a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0387a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0066  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                Object obj2;
                FragmentActivity fragmentActivity;
                Throwable thM3848exceptionOrNullimpl;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FragmentActivity fragmentActivity2 = this.c;
                    try {
                        Result.Companion companion = Result.Companion;
                        HMLog.flush();
                        ShareLogUtilsKt.b(fragmentActivity2);
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    FragmentActivity fragmentActivity3 = this.c;
                    if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0388a c0388a = new C0388a(fragmentActivity3, null);
                        this.b = objM3845constructorimpl;
                        this.a = 1;
                        if (BuildersKt.withContext(main, c0388a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = objM3845constructorimpl;
                    }
                    fragmentActivity = this.c;
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Toast.makeText(fragmentActivity, "分享失败！请联系张羊柱！", 1).show();
                        HMLog.warn$default("feedback", null, new b(thM3848exceptionOrNullimpl), 2, null);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.b;
                ResultKt.throwOnFailure(obj);
                objM3845constructorimpl = obj2;
                fragmentActivity = this.c;
                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    Toast.makeText(fragmentActivity, "分享失败！请联系张羊柱！", 1).show();
                    HMLog.warn$default("feedback", null, new b(thM3848exceptionOrNullimpl), 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentActivity fragmentActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = fragmentActivity;
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
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0387a c0387a = new C0387a(this.b, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, c0387a, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(Context context) {
        return Intrinsics.stringPlus(context.getPackageName(), ".fileProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context) throws IOException {
        File file = new File(((Object) context.getFilesDir().getAbsolutePath()) + ((Object) File.separator) + a);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        Utils.zipFiles(file, new File(FileUtils.getLogRootDir(context)).listFiles());
    }

    public static final void doShare(@NotNull FragmentActivity fragmentActivity) {
        e.f(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new a(fragmentActivity, null), 3, null);
    }
}
