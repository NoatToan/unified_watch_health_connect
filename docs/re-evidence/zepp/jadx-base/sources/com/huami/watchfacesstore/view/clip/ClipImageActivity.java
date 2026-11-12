package com.huami.watchfacesstore.view.clip;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watchfacesstore.databinding.WfActivityClipImageBinding;
import com.huami.watchfacesstore.device.process.BitmapUtils;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.watchfacesstore.view.clip.ClipImageActivity;
import com.loc.z;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/huami/watchfacesstore/view/clip/ClipImageActivity;", "Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "", "updateUI", "initView", "Landroidx/viewbinding/ViewBinding;", "getBinding", "Lcom/huami/watchfacesstore/databinding/WfActivityClipImageBinding;", "g", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "i", "()Lcom/huami/watchfacesstore/databinding/WfActivityClipImageBinding;", "binding", "", "h", "Ljava/lang/String;", "imagePath", "Lkotlin/Pair;", "", "Lkotlin/Pair;", "clipSize", z.j, LogUtil.I, "radius", hl.k, "transImgPath", "l", "outFilePath", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ClipImageActivity extends BaseActivity {

    @NotNull
    private static final String n = "image_path";

    @NotNull
    private static final String o = "clip_size";

    @NotNull
    private static final String p = "clip_radius";

    @NotNull
    private static final String q = "trans_path";

    @NotNull
    private static final String r = "out_path";

    @NotNull
    private static final String s = "ClipImageActivity";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int radius;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String transImgPath;
    public static final /* synthetic */ KProperty<Object>[] m = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ClipImageActivity.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfActivityClipImageBinding;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new ClipImageActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WfActivityClipImageBinding.class)));

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private String imagePath = "";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private Pair<Integer, Integer> clipSize = TuplesKt.to(0, 0);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String outFilePath = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/view/clip/ClipImageActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "inputFilePath", "outFilePath", "Lkotlin/Pair;", "", "clipSize", "radius", "transImgPath", "requestCode", "", "actionStart", "CLIP_RADIUS", "Ljava/lang/String;", "CLIP_SIZE", "IMAGE_PATH", "OUT_PATH", "TAG", "TRANS_PATH", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Pair<Integer, Integer> c;
            public final /* synthetic */ int d;
            public final /* synthetic */ String e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, Pair<Integer, Integer> pair, int i, String str3) {
                super(0);
                this.a = str;
                this.b = str2;
                this.c = pair;
                this.d = i;
                this.e = str3;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "start ClipImageActivity inputFilePath: " + this.a + "  outFilePath: " + this.b + " clipSize: " + this.c + " radius: " + this.d + " transImgPath: " + this.e;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void actionStart(@NotNull Activity activity, @NotNull String inputFilePath, @NotNull String outFilePath, @NotNull Pair<Integer, Integer> clipSize, int radius, @Nullable String transImgPath, int requestCode) {
            HMLog.info(ClipImageActivity.s, new a(inputFilePath, outFilePath, clipSize, radius, transImgPath));
            Intent intent = new Intent(activity, (Class<?>) ClipImageActivity.class);
            intent.putExtra(ClipImageActivity.n, inputFilePath);
            intent.putExtra(ClipImageActivity.o, clipSize);
            intent.putExtra(ClipImageActivity.p, radius);
            intent.putExtra(ClipImageActivity.q, transImgPath);
            intent.putExtra(ClipImageActivity.r, outFilePath);
            Unit unit = Unit.INSTANCE;
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.view.clip.ClipImageActivity$initView$3$1", f = "ClipImageActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.view.clip.ClipImageActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0710a extends Lambda implements Function0<String> {
            public static final C0710a a = new C0710a();

            public C0710a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "clip success";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ClipImageActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapClip = ClipImageActivity.this.i().CropImageView.clip();
            if (bitmapClip == null) {
                unit = null;
            } else {
                ClipImageActivity clipImageActivity = ClipImageActivity.this;
                BitmapUtils.INSTANCE.saveBitmap(bitmapClip, clipImageActivity.outFilePath);
                clipImageActivity.setResult(-1);
                HMLog.info(ClipImageActivity.s, C0710a.a);
                clipImageActivity.finish();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                ClipImageActivity.this.setResult(0);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "path = " + ClipImageActivity.this.imagePath;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WfActivityClipImageBinding i() {
        return (WfActivityClipImageBinding) this.binding.getValue(this, m[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ClipImageActivity clipImageActivity, View view) {
        clipImageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ClipImageActivity clipImageActivity, View view) {
        clipImageActivity.showLoadingDialog();
        e.f(LifecycleOwnerKt.getLifecycleScope(clipImageActivity), Dispatchers.getIO(), null, clipImageActivity.new a(null), 2, null);
    }

    private final void updateUI() {
        HMLog.info(s, new b());
        HMImageLoader.with((FragmentActivity) this).load(this.imagePath).asBitmap().override(600).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.NONE).into(new HMLoadTarget<Bitmap>() { // from class: com.huami.watchfacesstore.view.clip.ClipImageActivity.updateUI.2

            /* JADX INFO: renamed from: com.huami.watchfacesstore.view.clip.ClipImageActivity$updateUI$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "Exception = " + this.a.getMessage();
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.view.clip.ClipImageActivity$updateUI$2$b */
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
                    return "onLoadFinish";
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.view.clip.ClipImageActivity$updateUI$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/ImageView;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function1<ImageView, Unit> {
                public final /* synthetic */ ClipImageActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(ClipImageActivity clipImageActivity) {
                    super(1);
                    this.a = clipImageActivity;
                }

                public final void a(@NotNull ImageView imageView) {
                    ExtensionsKt.loadUrl(imageView, this.a.transImgPath);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ImageView imageView) {
                    a(imageView);
                    return Unit.INSTANCE;
                }
            }

            @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
            public void onLoadFailed(@NotNull Exception e) {
                HMLog.info(ClipImageActivity.s, new a(e));
                ClipImageActivity.this.setResult(0);
                ClipImageActivity.this.finish();
            }

            @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
            public void onLoadFinish(@Nullable Bitmap resource) {
                HMLog.info(ClipImageActivity.s, b.a);
                ClipImageActivity.this.i().CropImageView.setImageInfo(resource, ClipImageActivity.this.clipSize, ClipImageActivity.this.radius, new c(ClipImageActivity.this));
            }
        });
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public ViewBinding getBinding() {
        return i();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        StatusBarUtil.setStatusBarColor(this, Color.parseColor("#000000"));
        Intent intent = getIntent();
        if (intent != null) {
            this.imagePath = intent.getStringExtra(n);
            Serializable serializableExtra = intent.getSerializableExtra(o);
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
            this.clipSize = (Pair) serializableExtra;
            this.radius = intent.getIntExtra(p, 0);
            this.transImgPath = intent.getStringExtra(q);
            this.outFilePath = intent.getStringExtra(r);
        }
        i().commonTitleBar.setLeftVisible(false);
        updateUI();
        i().tvCropCancel.setOnClickListener(new View.OnClickListener() { // from class: jp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClipImageActivity.j(this.a, view);
            }
        });
        i().tvCropConfirm.setOnClickListener(new View.OnClickListener() { // from class: ip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClipImageActivity.k(this.a, view);
            }
        });
    }
}
