package com.xiaomi.fitness.sport.view.justdance.control;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import androidx.core.graphics.drawable.DrawableKt;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.util.Utils;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.c1j;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceShareWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "songName", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "saveImage", "extra", "checkPermission", "granted", "Lkotlin/Function0;", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceShareWebViewActivity extends Hilt_JustDanceShareWebViewActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String JD_SONG_NAME = "jd_song_name";

    @NotNull
    private static final String TAG = "JustDanceShareWebViewActivity";

    @NotNull
    private String songName = "";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceShareWebViewActivity$Companion;", "", "<init>", "()V", "TAG", "", "JD_SONG_NAME", StatConstants.PARAM_START, "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "url", "songName", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull BaseActivity activity, @NotNull String url, @Nullable String songName) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent(activity, (Class<?>) JustDanceShareWebViewActivity.class);
            intent.putExtra("URL", url);
            intent.putExtra(JustDanceShareWebViewActivity.JD_SONG_NAME, songName);
            intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, false);
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity$checkPermission$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity$checkPermission$1", f = "JustDanceShareWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $granted;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity$checkPermission$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity$checkPermission$1$2", f = "JustDanceShareWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $granted;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Function0<Unit> function0, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$granted = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$granted, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$granted.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$granted = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(final Function0 function0, final JustDanceShareWebViewActivity justDanceShareWebViewActivity, PermissionBuilder permissionBuilder) {
            permissionBuilder.granted(new Function1() { // from class: com.xiaomi.fitness.sport.view.justdance.control.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JustDanceShareWebViewActivity.AnonymousClass1.invokeSuspend$lambda$2$lambda$0(function0, (String) obj);
                }
            });
            permissionBuilder.denied(new Function1() { // from class: com.xiaomi.fitness.sport.view.justdance.control.d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JustDanceShareWebViewActivity.AnonymousClass1.invokeSuspend$lambda$2$lambda$1(justDanceShareWebViewActivity, (String) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$0(Function0 function0, String str) {
            AnyExtKt.io$default(null, new JustDanceShareWebViewActivity$checkPermission$1$1$1$1(function0, null), 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1(JustDanceShareWebViewActivity justDanceShareWebViewActivity, String str) {
            PermissionsUtil.showSettingDialog$default(PermissionsUtil.INSTANCE, justDanceShareWebViewActivity, "android.permission.WRITE_EXTERNAL_STORAGE", false, null, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return JustDanceShareWebViewActivity.this.new AnonymousClass1(this.$granted, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Build.VERSION.SDK_INT >= 29 || PermissionExtKt.isPermissionGranted(JustDanceShareWebViewActivity.this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                AnyExtKt.io$default(null, new AnonymousClass2(this.$granted, null), 1, null);
            } else {
                JustDanceShareWebViewActivity justDanceShareWebViewActivity = JustDanceShareWebViewActivity.this;
                String string = justDanceShareWebViewActivity.getString(c1j.Q);
                final Function0<Unit> function0 = this.$granted;
                final JustDanceShareWebViewActivity justDanceShareWebViewActivity2 = JustDanceShareWebViewActivity.this;
                PermissionExtKt.permission(justDanceShareWebViewActivity, "android.permission.WRITE_EXTERNAL_STORAGE", string, (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: com.xiaomi.fitness.sport.view.justdance.control.e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return JustDanceShareWebViewActivity.AnonymousClass1.invokeSuspend$lambda$2(function0, justDanceShareWebViewActivity2, (PermissionBuilder) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity$saveImage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity$saveImage$1", f = "JustDanceShareWebViewActivity.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nJustDanceShareWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceShareWebViewActivity.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceShareWebViewActivity$saveImage$1\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,131:1\n24#2:132\n*S KotlinDebug\n*F\n+ 1 JustDanceShareWebViewActivity.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceShareWebViewActivity$saveImage$1\n*L\n56#1:132\n*E\n"})
    public static final class C29951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $extra;
        int label;
        final /* synthetic */ JustDanceShareWebViewActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29951(String str, JustDanceShareWebViewActivity justDanceShareWebViewActivity, Continuation<? super C29951> continuation) {
            super(2, continuation);
            this.$extra = str;
            this.this$0 = justDanceShareWebViewActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(JustDanceShareWebViewActivity justDanceShareWebViewActivity, ContentValues contentValues, Bitmap bitmap) throws IOException {
            Uri uriInsert = justDanceShareWebViewActivity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                return Unit.INSTANCE;
            }
            OutputStream outputStreamOpenOutputStream = justDanceShareWebViewActivity.getContentResolver().openOutputStream(uriInsert);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            Intrinsics.checkNotNull(outputStreamOpenOutputStream);
            bitmap.compress(compressFormat, 100, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.flush();
            AnyExtKt.main$default(null, new JustDanceShareWebViewActivity$saveImage$1$1$1(justDanceShareWebViewActivity, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29951(this.$extra, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0080  */
        /* JADX WARN: Code duplicated, block: B:22:0x0083  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x0083, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            final Bitmap bitmapDecodeByteArray = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (URLUtil.isValidUrl(this.$extra)) {
                    ImageRequest imageRequestBuild = new ImageRequest.Builder(this.this$0).data(this.$extra).build();
                    ImageLoader imageLoader = Coil.imageLoader(this.this$0);
                    this.label = 1;
                    obj = imageLoader.execute(imageRequestBuild, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (StringsKt__StringsKt.contains$default((CharSequence) this.$extra, (CharSequence) ",", false, 2, (Object) null)) {
                    byte[] bArrDecode = Base64.decode((String) StringsKt__StringsKt.split$default((CharSequence) this.$extra, new String[]{","}, false, 0, 6, (Object) null).get(1), 2);
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                }
                if (bitmapDecodeByteArray == null) {
                    return Unit.INSTANCE;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", this.this$0.songName + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + jCurrentTimeMillis);
                contentValues.put("mime_type", Utils.MIME_TYPE_JPEG);
                try {
                    final JustDanceShareWebViewActivity justDanceShareWebViewActivity = this.this$0;
                    justDanceShareWebViewActivity.checkPermission(new Function0() { // from class: com.xiaomi.fitness.sport.view.justdance.control.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JustDanceShareWebViewActivity.C29951.invokeSuspend$lambda$1(justDanceShareWebViewActivity, contentValues, bitmapDecodeByteArray);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Drawable drawable = ((ImageResult) obj).getDrawable();
            if (drawable != null) {
                bitmapDecodeByteArray = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
            }
            if (bitmapDecodeByteArray == null) {
                return Unit.INSTANCE;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            final ContentValues contentValues2 = new ContentValues();
            contentValues2.put("_display_name", this.this$0.songName + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + jCurrentTimeMillis2);
            contentValues2.put("mime_type", Utils.MIME_TYPE_JPEG);
            final JustDanceShareWebViewActivity justDanceShareWebViewActivity2 = this.this$0;
            justDanceShareWebViewActivity2.checkPermission(new Function0() { // from class: com.xiaomi.fitness.sport.view.justdance.control.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JustDanceShareWebViewActivity.C29951.invokeSuspend$lambda$1(justDanceShareWebViewActivity2, contentValues2, bitmapDecodeByteArray);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkPermission(Function0<Unit> granted) {
        AnyExtKt.main$default(null, new AnonymousClass1(granted, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$1(JustDanceShareWebViewActivity this$0, View view) {
        String extra;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebView.HitTestResult hitTestResult = this$0.getWebView().getHitTestResult();
        Intrinsics.checkNotNullExpressionValue(hitTestResult, "getHitTestResult(...)");
        Logger.i(TAG, "long click type: " + hitTestResult.getType());
        if ((hitTestResult.getType() != 5 && hitTestResult.getType() != 8) || (extra = hitTestResult.getExtra()) == null) {
            return false;
        }
        this$0.saveImage(extra);
        return true;
    }

    private final void saveImage(String extra) {
        AnyExtKt.io$default(null, new C29951(extra, this, null), 1, null);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(JD_SONG_NAME);
        if (stringExtra == null) {
            stringExtra = "JD_SONG";
        }
        this.songName = stringExtra;
        getWebView().setOnLongClickListener(new View.OnLongClickListener() { // from class: yyd
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return JustDanceShareWebViewActivity.onCreate$lambda$1(this.f40684a, view);
            }
        });
    }
}
