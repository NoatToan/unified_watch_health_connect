package com.xiaomi.fitness;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bcr;
import defpackage.im9;
import defpackage.ni4;
import defpackage.r72;
import defpackage.z0j;
import defpackage.zji;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130!J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ8\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u000e2\b\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(H\u0007J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020*2\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010+\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010-\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010.\u001a\u00020\u0005J:\u0010/\u001a\u0004\u0018\u00010,2\b\u0010$\u001a\u0004\u0018\u00010\u000e2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u00102\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0002J\u000e\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205J\u001c\u00106\u001a\u00020\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015082\u0006\u00109\u001a\u00020\u000eJ\u001c\u0010:\u001a\u00020\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015082\u0006\u0010;\u001a\u00020\u0005J\u001c\u0010<\u001a\u00020\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015082\u0006\u0010;\u001a\u00020\u0005J*\u0010=\u001a\u0004\u0018\u00010,2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0005H\u0002J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u0005H\u0002J\u0016\u0010C\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\tJ\"\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FH\u0007J,\u0010H\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010I\u001a\u00020\t2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FH\u0007J$\u0010H\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u001d2\b\b\u0003\u0010I\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\tH\u0007J\u0012\u0010L\u001a\u0004\u0018\u00010\u000e2\u0006\u0010M\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/ShareUtil;", "", "<init>", "()V", "TEMP_DIR", "", "EXTERNAL_STORAGE_ROOT_DIRECTORY", "SHARE_DIR", "drawingCacheBackgroundColor", "", "getScrollViewHeight", "scrollView", "Landroidx/core/widget/NestedScrollView;", "shotScrollView", "Landroid/graphics/Bitmap;", "shotView", "Landroid/view/ViewGroup;", "color", "shotRecyclerViewLinear", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "context", "Landroid/content/Context;", "captureView", "view", "Landroid/view/View;", "window", "Landroid/view/Window;", "bitmapCallback", "Lkotlin/Function1;", "getCacheBitmapFromView", "saveImageToGallery", "bmp", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "isJpeg", "", "isShowToast", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "saveImageToTmp", "Landroid/net/Uri;", "saveImgToTempWithCustomizedName", "fileName", "saveImage", "appDir", "Ljava/io/File;", "dir", "captureLongWebViewLollipop", "webView", "Landroid/webkit/WebView;", "shareBitmapViaMore", "reference", "Ljava/lang/ref/WeakReference;", "bitmap", "shareFileMore", "filePath", "sharePdf", "convertUriAboveN", "intent", "Landroid/content/Intent;", SportRecordBundleKey.BUNDLE_PARAM_URI, "grantPermission", "path", "getRoundedCornerBitmap", "roundRadiusInPixel", "startPercent", "", "endPercent", "loadBitmapFromView", "bgColor", "v", "extraHeight", "convertHardWareBitmap", "src", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareUtil {

    @NotNull
    private static final String EXTERNAL_STORAGE_ROOT_DIRECTORY = "MiWatch";

    @NotNull
    private static final String SHARE_DIR = "share";

    @NotNull
    private static final String TEMP_DIR = "temp";

    @NotNull
    public static final ShareUtil INSTANCE = new ShareUtil();
    private static final int drawingCacheBackgroundColor = zji.f41378a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.ShareUtil$loadBitmapFromView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.ShareUtil$loadBitmapFromView$1", f = "ShareUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.ShareUtil$saveImageToGallery$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.ShareUtil$saveImageToGallery$1", f = "ShareUtil.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ File $appDir;
        final /* synthetic */ Bitmap $bmp;
        final /* synthetic */ String $fileName;
        final /* synthetic */ boolean $isJpeg;
        final /* synthetic */ boolean $isShowToast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.ShareUtil$saveImageToGallery$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.ShareUtil$saveImageToGallery$1$1", f = "ShareUtil.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ boolean $isShowToast;
            final /* synthetic */ Deferred<Uri> $uriTask;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03711(Deferred<? extends Uri> deferred, boolean z, Activity activity, Continuation<? super C03711> continuation) {
                super(2, continuation);
                this.$uriTask = deferred;
                this.$isShowToast = z;
                this.$activity = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03711(this.$uriTask, this.$isShowToast, this.$activity, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred<Uri> deferred = this.$uriTask;
                    this.label = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Uri uri = (Uri) obj;
                if (uri != null) {
                    if (this.$isShowToast) {
                        ToastExtKt.toastShort(this.$activity, z0j.h);
                    }
                    this.$activity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                } else {
                    ToastUtil.showShortToast(z0j.g);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17151(Bitmap bitmap, File file, String str, boolean z, boolean z2, Activity activity, Continuation<? super C17151> continuation) {
            super(2, continuation);
            this.$bmp = bitmap;
            this.$appDir = file;
            this.$fileName = str;
            this.$isJpeg = z;
            this.$isShowToast = z2;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17151 c17151 = new C17151(this.$bmp, this.$appDir, this.$fileName, this.$isJpeg, this.$isShowToast, this.$activity, continuation);
            c17151.L$0 = obj;
            return c17151;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new ShareUtil$saveImageToGallery$1$uriTask$1(this.$bmp, this.$appDir, this.$fileName, this.$isJpeg, null), 3, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C03711 c03711 = new C03711(deferredAsync$default, this.$isShowToast, this.$activity, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c03711, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private ShareUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureView$lambda$0(Function1 bitmapCallback, Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(bitmapCallback, "$bitmapCallback");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (i == 0) {
            bitmapCallback.invoke2(bitmap);
        }
    }

    private final Bitmap convertHardWareBitmap(Bitmap src) {
        int i = Build.VERSION.SDK_INT;
        if (src.getConfig() != Bitmap.Config.HARDWARE) {
            return src;
        }
        int width = src.getWidth();
        int height = src.getHeight();
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(width, height);
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(...)");
        canvasBeginRecording.drawBitmap(src, 0.0f, 0.0f, (Paint) null);
        picture.endRecording();
        if (i >= 28) {
            return Bitmap.createBitmap(picture, width, height, Bitmap.Config.ARGB_8888);
        }
        return null;
    }

    private final Uri convertUriAboveN(Context context, Intent intent, Uri uri, String filePath) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(intent);
        Objects.requireNonNull(uri);
        if (TextUtils.isEmpty(filePath)) {
            return null;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", new File(filePath));
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        return uriForFile;
    }

    private final Bitmap getRecyclerView(Context context, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return null;
        }
        int itemCount = adapter.getCount();
        LruCache lruCache = new LruCache(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8);
        int measuredHeight = 0;
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.d0 d0VarCreateViewHolder = adapter.createViewHolder(recyclerView, adapter.getItemViewType(i));
            adapter.onBindViewHolder(d0VarCreateViewHolder, i);
            d0VarCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = d0VarCreateViewHolder.itemView;
            view.layout(0, 0, view.getMeasuredWidth(), d0VarCreateViewHolder.itemView.getMeasuredHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(d0VarCreateViewHolder.itemView.getMeasuredWidth(), d0VarCreateViewHolder.itemView.getMeasuredHeight(), Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Intrinsics.checkNotNull(context);
            canvas.drawColor(ni4.c(context, zji.f41379b));
            d0VarCreateViewHolder.itemView.draw(canvas);
            lruCache.put(String.valueOf(i), bitmapCreateBitmap);
            measuredHeight += d0VarCreateViewHolder.itemView.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(recyclerView.getMeasuredWidth(), measuredHeight, Bitmap.Config.RGB_565);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        int height = 0;
        for (int i2 = 0; i2 < itemCount; i2++) {
            Bitmap bitmap = (Bitmap) lruCache.get(String.valueOf(i2));
            canvas2.drawBitmap(bitmap, 0, height, paint);
            height += bitmap.getHeight();
        }
        return bitmapCreateBitmap2;
    }

    private final String grantPermission(String path) {
        Application app = AppUtil.getApp();
        Uri uriForFile = FileProvider.getUriForFile(app, im9.B(), new File(path));
        app.grantUriPermission(ApplicationExtKt.getApplication().getPackageName(), uriForFile, 1);
        String string = uriForFile.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final Bitmap loadBitmapFromView(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return loadBitmapFromView$default(v, 0, 0, 6, null);
    }

    public static /* synthetic */ Bitmap loadBitmapFromView$default(View view, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return loadBitmapFromView(view, i, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final Uri saveImage(Bitmap bmp, File appDir, String fileName, String dir, boolean isJpeg) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(appDir, fileName);
        ?? r5 = 0;
        try {
            try {
                try {
                    fileOutputStream = (Build.VERSION.SDK_INT < 29 || !Intrinsics.areEqual(dir, "share")) ? new FileOutputStream(file) : (FileOutputStream) AppUtil.getApp().getContentResolver().openOutputStream(im9.J(file.getName(), "share"));
                    try {
                        Intrinsics.checkNotNull(bmp);
                        Bitmap.CompressFormat compressFormat = isJpeg ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
                        Intrinsics.checkNotNull(fileOutputStream);
                        boolean zCompress = bmp.compress(compressFormat, 80, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Uri uriFromFile = zCompress ? Uri.fromFile(file) : null;
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return uriFromFile;
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    r5 = fileName;
                    if (r5 != 0) {
                        try {
                            r5.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Exception e6) {
                e = e6;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public static /* synthetic */ Uri saveImage$default(ShareUtil shareUtil, Bitmap bitmap, File file, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return shareUtil.saveImage(bitmap, file, str, str2, z);
    }

    @JvmStatic
    public static final void saveImageToGallery(@NotNull Activity activity, @Nullable Bitmap bmp, @Nullable LifecycleCoroutineScope coroutineScope, boolean isJpeg, boolean isShowToast) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        File file = new File(r72.n());
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = System.currentTimeMillis() + ".jpg";
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17151(bmp, file, str, isJpeg, isShowToast, activity, null), 3, null);
        }
    }

    public static /* synthetic */ void saveImageToGallery$default(Activity activity, Bitmap bitmap, LifecycleCoroutineScope lifecycleCoroutineScope, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        saveImageToGallery(activity, bitmap, lifecycleCoroutineScope, z, z2);
    }

    @NotNull
    public final Bitmap captureLongWebViewLollipop(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        int contentHeight = webView.getContentHeight();
        int width = webView.getWidth();
        int height = webView.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, contentHeight, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        while (contentHeight > 0) {
            contentHeight = contentHeight < height ? 0 : contentHeight - height;
            canvas.save();
            canvas.clipRect(0, contentHeight, width, contentHeight + height);
            webView.scrollTo(0, contentHeight);
            webView.draw(canvas);
            canvas.restore();
        }
        return bitmapCreateBitmap;
    }

    public final void captureView(@NotNull View view, @NotNull Window window, @NotNull final Function1<? super Bitmap, Unit> bitmapCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(bitmapCallback, "bitmapCallback");
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        PixelCopy.request(window, new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()), bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: z9m
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i2) {
                ShareUtil.captureView$lambda$0(bitmapCallback, bitmapCreateBitmap, i2);
            }
        }, new Handler(Looper.getMainLooper()));
    }

    @Nullable
    public final Bitmap getCacheBitmapFromView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof WebView) {
            return bcr.a((WebView) view);
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    @NotNull
    public final Bitmap getRoundedCornerBitmap(@NotNull Bitmap bitmap, int roundRadiusInPixel) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = roundRadiusInPixel;
        paint.setAntiAlias(true);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public final int getScrollViewHeight(@NotNull NestedScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        int childCount = scrollView.getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            height += scrollView.getChildAt(i).getHeight();
        }
        return height;
    }

    @Nullable
    public final Uri saveImageToTmp(@Nullable Bitmap bmp) {
        File file = new File(im9.L());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "shareTmp.jpg");
        if (file2.exists()) {
            file2.delete();
        }
        return saveImage$default(this, bmp, file, "shareTmp.jpg", TEMP_DIR, false, 16, null);
    }

    @Nullable
    public final Uri saveImgToTempWithCustomizedName(@Nullable Bitmap bmp, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(im9.L());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, fileName);
        if (file2.exists()) {
            file2.delete();
        }
        return saveImage$default(this, bmp, file, fileName, TEMP_DIR, false, 16, null);
    }

    public final void shareBitmapViaMore(@NotNull WeakReference<Activity> reference, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Activity activity = reference.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(1);
        Uri uriSaveImageToTmp = INSTANCE.saveImageToTmp(bitmap);
        if ((uriSaveImageToTmp != null ? uriSaveImageToTmp.getPath() : null) == null) {
            Logger.i("ShareUtil shareBitmapViaMore", "shareBitmapViaMore filePrefixUri?.path == null");
            return;
        }
        String path = uriSaveImageToTmp.getPath();
        Intrinsics.checkNotNull(path);
        String strGrantPermission = grantPermission(path);
        try {
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(strGrantPermission));
            intent.setType("image/*");
            activity.startActivity(Intent.createChooser(intent, ResourceExtKt.getString(z0j.i)));
        } catch (Exception unused) {
            Logger.i("ShareUtil shareBitmapViaMore", "parse failed. pathResult=" + strGrantPermission);
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), z0j.common_not_support);
        }
    }

    public final void shareFileMore(@NotNull WeakReference<Activity> reference, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Activity activity = reference.get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(1);
        Logger.i("ShareUtil shareBitmapViaMore", "parse file. filePath=" + filePath);
        String strGrantPermission = grantPermission(filePath);
        try {
            Uri uri = Uri.parse(strGrantPermission);
            Application application = ApplicationExtKt.getApplication();
            Intrinsics.checkNotNull(uri);
            intent.putExtra("android.intent.extra.STREAM", convertUriAboveN(application, intent, uri, filePath));
            intent.setType("*/*");
            activity.startActivity(Intent.createChooser(intent, ResourceExtKt.getString(z0j.i)));
        } catch (Exception unused) {
            Logger.i("ShareUtil shareBitmapViaMore", "parse failed. pathResult=" + strGrantPermission);
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), z0j.common_not_support);
        }
    }

    public final void sharePdf(@NotNull WeakReference<Activity> reference, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Activity activity = reference.get();
        File file = new File(filePath);
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(1);
            intent.addFlags(2);
            Uri uriFromFile = Uri.fromFile(file);
            Application application = ApplicationExtKt.getApplication();
            Intrinsics.checkNotNull(uriFromFile);
            Uri uriConvertUriAboveN = convertUriAboveN(application, intent, uriFromFile, filePath);
            intent.setType("application/pdf");
            Logger.i(SleepRhythmHandle.TAG, "safeUri - " + uriConvertUriAboveN + " filePath - " + filePath);
            intent.putExtra("android.intent.extra.STREAM", uriConvertUriAboveN);
            intent.setFlags(268435456);
            if (activity != null) {
                activity.startActivity(Intent.createChooser(intent, "share"));
            }
        }
    }

    public final void shotRecyclerViewLinear(@NotNull Activity activity, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        getRecyclerView(activity, recyclerView);
    }

    @Nullable
    public final Bitmap shotScrollView(@NotNull NestedScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        int childCount = scrollView.getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            height += scrollView.getChildAt(i).getHeight();
            scrollView.getChildAt(i).setBackgroundColor(Color.parseColor("#ffffff"));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(scrollView.getWidth(), height, Bitmap.Config.RGB_565);
        scrollView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @Nullable
    public final Bitmap shotView(@NotNull ViewGroup scrollView, int color) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        int childCount = scrollView.getChildCount();
        int height = 0;
        for (int i = 0; i < childCount; i++) {
            height += scrollView.getChildAt(i).getHeight();
            scrollView.getChildAt(i).setBackgroundColor(color);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(scrollView.getWidth(), height, Bitmap.Config.ARGB_8888);
        scrollView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Bitmap loadBitmapFromView(@NotNull View view, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        return loadBitmapFromView$default(view, 0, f, f2, 2, null);
    }

    public static /* synthetic */ Bitmap loadBitmapFromView$default(View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return loadBitmapFromView(view, i, i2);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final Bitmap loadBitmapFromView(@NotNull View v, int i) {
        Intrinsics.checkNotNullParameter(v, "v");
        return loadBitmapFromView$default(v, i, 0, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final Bitmap loadBitmapFromView(@NotNull View view, int bgColor, float startPercent, float endPercent) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof WebView) {
            return bcr.b((WebView) view, startPercent, endPercent);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(bgColor);
        try {
            view.draw(canvas);
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException unused) {
            Logger.i("ShareUtils", " loadBitmapFromView error");
            return null;
        }
    }

    @JvmStatic
    public static final void saveImageToGallery(@NotNull BaseActivity activity, @Nullable Bitmap bmp) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isDestroyed()) {
            return;
        }
        saveImageToGallery$default(activity, bmp, LifecycleOwnerKt.getLifecycleScope(activity), false, false, 24, null);
    }

    @JvmStatic
    @Nullable
    public static final Bitmap getCacheBitmapFromView(@NotNull View view, float startPercent, float endPercent) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof WebView) {
            return bcr.b((WebView) view, startPercent, endPercent);
        }
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache(true);
        view.setDrawingCacheBackgroundColor(AppUtil.getApp().getResources().getColor(drawingCacheBackgroundColor));
        ShareUtil shareUtil = INSTANCE;
        Bitmap drawingCache = view.getDrawingCache();
        Intrinsics.checkNotNullExpressionValue(drawingCache, "getDrawingCache(...)");
        Bitmap bitmapConvertHardWareBitmap = shareUtil.convertHardWareBitmap(drawingCache);
        if (bitmapConvertHardWareBitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapConvertHardWareBitmap);
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final Bitmap loadBitmapFromView(@NotNull View v, int bgColor, int extraHeight) {
        Intrinsics.checkNotNullParameter(v, "v");
        ScopeExtKt.scope$default(null, new AnonymousClass1(null), 1, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(v.getMeasuredWidth(), v.getMeasuredHeight() + extraHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(bgColor);
        canvas.translate(0.0f, extraHeight);
        try {
            v.draw(canvas);
        } catch (IllegalArgumentException unused) {
            Logger.i("ShareUtils", " loadBitmapFromView error");
        }
        return bitmapCreateBitmap;
    }
}
