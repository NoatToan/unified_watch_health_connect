package com.huami.feedback.screencapture;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.feedback.FeedbackBaseActivity;
import com.huami.feedback.screencapture.ImageInfo;
import com.huami.feedback.screencapture.ScreenShotMonitor;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001cR!\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006("}, d2 = {"Lcom/huami/feedback/screencapture/ScreenShotMonitor;", "", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "", "f", "Landroid/content/Context;", "g", "Landroid/net/Uri;", "uri", "Landroid/database/ContentObserver;", "contentObserver", GoogleApiAvailabilityLight.a, "Landroidx/appcompat/app/AppCompatActivity;", "activity", "b", "e", MimeTypes.BASE_TYPE_APPLICATION, "addScreenCaptureToFeedback", "", "a", "J", "mStartListenTime", "Landroid/os/Handler;", "Landroid/os/Handler;", "mUiHandler", "Lcom/huami/feedback/screencapture/MediaContentObserver;", "c", "Lcom/huami/feedback/screencapture/MediaContentObserver;", "mInternalObserver", "mExternalObserver", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/feedback/screencapture/ImageInfo;", "Landroidx/lifecycle/MutableLiveData;", "getImageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "imageLiveData", "CAPTURE_DIALOG_DISMISS_DURATION", "<init>", "()V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenShotMonitor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static long mStartListenTime = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static MediaContentObserver mInternalObserver = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static MediaContentObserver mExternalObserver = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final long CAPTURE_DIALOG_DISMISS_DURATION = 2000;

    @NotNull
    public static final ScreenShotMonitor INSTANCE = new ScreenShotMonitor();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Handler mUiHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final MutableLiveData<ImageInfo> imageLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.screencapture.ScreenShotMonitor$showDialog$1", f = "ScreenShotMonitor.kt", i = {0}, l = {135}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ AlertDialogFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AlertDialogFragment alertDialogFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = alertDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
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
                this.b = (CoroutineScope) this.b;
                this.a = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AlertDialogFragment alertDialogFragment = this.c;
            try {
                Result.Companion companion = Result.Companion;
                alertDialogFragment.dismissAnyway();
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    private ScreenShotMonitor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final AppCompatActivity activity) {
        imageLiveData.observe(activity, new Observer() { // from class: zj6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ScreenShotMonitor.c(activity, (ImageInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AppCompatActivity appCompatActivity, ImageInfo imageInfo) {
        if ((imageInfo == null ? null : imageInfo.getUri()) == null) {
            return;
        }
        if (!(appCompatActivity instanceof FeedbackBaseActivity)) {
            INSTANCE.e(appCompatActivity, imageInfo.getUri());
        }
        INSTANCE.getImageLiveData().setValue(null);
    }

    private final void d(Context context, Uri uri, ContentObserver contentObserver) {
        context.getContentResolver().registerContentObserver(uri, true, contentObserver);
    }

    private final void e(AppCompatActivity activity, Uri uri) {
        e.f(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new a(ScreenCapture.INSTANCE.showCaptureDialog(LifecycleOwnerKt.getLifecycleScope(activity), activity, activity.getSupportFragmentManager(), uri), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Application context) {
        mStartListenTime = System.currentTimeMillis();
        Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        Handler handler = mUiHandler;
        MediaContentObserver mediaContentObserver = new MediaContentObserver(context, uri, handler);
        ScreenShotMonitor screenShotMonitor = INSTANCE;
        screenShotMonitor.d(context, MediaStore.Images.Media.INTERNAL_CONTENT_URI, mediaContentObserver);
        mInternalObserver = mediaContentObserver;
        MediaContentObserver mediaContentObserver2 = new MediaContentObserver(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, handler);
        screenShotMonitor.d(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, mediaContentObserver2);
        mExternalObserver = mediaContentObserver2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Context context) {
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            MediaContentObserver mediaContentObserver = mInternalObserver;
            if (mediaContentObserver != null) {
                context.getContentResolver().unregisterContentObserver(mediaContentObserver);
            }
            MediaContentObserver mediaContentObserver2 = mExternalObserver;
            if (mediaContentObserver2 == null) {
                unit = null;
            } else {
                context.getContentResolver().unregisterContentObserver(mediaContentObserver2);
                unit = Unit.INSTANCE;
            }
            Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        mInternalObserver = null;
        mExternalObserver = null;
    }

    public final void addScreenCaptureToFeedback(@NotNull final Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.huami.feedback.screencapture.ScreenShotMonitor.addScreenCaptureToFeedback.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                if (activity instanceof AppCompatActivity) {
                    ScreenShotMonitor.INSTANCE.getImageLiveData().removeObservers((LifecycleOwner) activity);
                }
                ScreenShotMonitor.INSTANCE.g(application);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                if (HMLoginManager.isUnInit()) {
                    return;
                }
                ScreenShotMonitor screenShotMonitor = ScreenShotMonitor.INSTANCE;
                screenShotMonitor.f(application);
                if (activity instanceof AppCompatActivity) {
                    screenShotMonitor.b((AppCompatActivity) activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
            }
        });
    }

    @NotNull
    public final MutableLiveData<ImageInfo> getImageLiveData() {
        return imageLiveData;
    }
}
