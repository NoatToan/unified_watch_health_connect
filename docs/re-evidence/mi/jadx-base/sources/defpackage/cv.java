package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import androidx.core.graphics.drawable.DrawableKt;
import com.huami.watchfacesstore.dial_process.DialProcess;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.hm.health.bt.device.HMCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0003J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\u0011*\u00020\u0006H\u0002¨\u0006\u0014"}, d2 = {"Lcv;", "", "Landroid/content/Context;", "context", "Lne;", "device", "Lsk;", "request", "", PluginDeviceInfo.FMODEL, "", "path", "Ltk;", com.xiaomi.onetrack.api.b.I, "quest", PluginDeviceInfo.FDESC, "", "", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class cv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final cv f14758a = new cv();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14759a;

        static {
            int[] iArr = new int[rk.values().length];
            try {
                iArr[rk.TGA_RGB565_GCNANOLITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rk.TGA_L8_ARGB8888_GCNANOLITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rk.TGA_L8_ARGB8888_DAVE2D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rk.TGA_BITMAP_ARGB8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rk.TGA_RGB565_DAVE2D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14759a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "checkWriteStoragePermission result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.t = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "mkdirs result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "dirPath: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ LogoRequest t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LogoRequest logoRequest) {
            super(0);
            this.t = logoRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "app about " + this.t.getPkg() + " is not installed.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "png path: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "tga path: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "png to tga result: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(IOException iOException) {
            super(0);
            this.t = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "exception: " + this.t.getLocalizedMessage() + "\n " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ LogoRequest t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LogoRequest logoRequest) {
            super(0);
            this.t = logoRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "handleLogoRequest: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"cv$k", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "result", "", "onFinish", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class k extends HMCallback<Boolean> {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.t = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "responseLogoRequest result: " + this.t;
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
            onFinish(bool.booleanValue());
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            t5t.d("TransferAppLogo", "responseLogoRequest result: " + result);
            le.c("TransferAppLogo", new a(result));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bletool.device.notificaiton.TransferAppLogo$transferLogoFile$1", f = "TransferAppLogo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ ne u;
        public final /* synthetic */ LogoRequest v;
        public final /* synthetic */ String w;

        @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"cv$l$a", "Lqp;", "", PluginDeviceInfo.FMODEL, LifecycleConstantKt.ON_START, "", "throwable", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a implements qp {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ne f14760a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoRequest f14761b;

            /* JADX INFO: renamed from: cv$l$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class C0905a extends Lambda implements Function0<String> {
                public static final C0905a t = new C0905a();

                public C0905a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "file transfer onCompleted";
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Throwable th) {
                    super(0);
                    this.t = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "file transfer error: " + this.t;
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c t = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "file transfer start";
                }
            }

            public a(ne neVar, LogoRequest logoRequest) {
                this.f14760a = neVar;
                this.f14761b = logoRequest;
            }

            @Override // defpackage.ev
            public void a(int i) {
                qp.a.a(this, i);
            }

            @Override // defpackage.ev
            public void onStart() {
                le.c("TransferAppLogo", c.t);
                t5t.d("TransferAppLogo", "file transfer start");
            }

            @Override // defpackage.qp
            public void a() {
                le.c("TransferAppLogo", C0905a.t);
                t5t.d("TransferAppLogo", "file transfer onCompleted");
                cv.f14758a.a(this.f14760a, new LogoResponse(this.f14761b.getPkg(), 1));
            }

            @Override // defpackage.ev
            public void a(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                le.c("TransferAppLogo", new b(throwable));
                t5t.d("TransferAppLogo", "file transfer error: " + throwable);
                cv.f14758a.a(this.f14760a, new LogoResponse(this.f14761b.getPkg(), 2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ne neVar, LogoRequest logoRequest, String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.u = neVar;
            this.v = logoRequest;
            this.w = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                ga gaVarA = new la().a(this.u);
                if (gaVarA != null) {
                    LogoRequest logoRequest = this.v;
                    gaVarA.a(new FileInfo("notification://logo?app_id=" + logoRequest.getPkg() + "&width=" + logoRequest.getWidth() + "&height=" + logoRequest.getHeight() + "&format=" + logoRequest.getFormat(), this.w), new a(this.u, logoRequest));
                } else {
                    t5t.d("TransferAppLogo", "file transfer is null");
                }
            } catch (Exception e) {
                t5t.d("TransferAppLogo", "transferLogoFile exception: " + e);
            }
            return Unit.INSTANCE;
        }
    }

    public final String b(Context context) {
        File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? context.getExternalFilesDir("") : Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder();
        sb.append(externalFilesDir != null ? externalFilesDir.getPath() : null);
        sb.append(File.separator);
        sb.append("app-icon");
        String string = sb.toString();
        File file = new File(string);
        if (!file.exists()) {
            boolean zMkdirs = file.mkdirs();
            le.c("TransferAppLogo", new c(zMkdirs));
            t5t.d("TransferAppLogo", "mkdirs result: " + zMkdirs);
        }
        le.c("TransferAppLogo", new d(string));
        t5t.d("TransferAppLogo", "dirPath: " + string);
        return string;
    }

    public final void a(@NotNull Context context, @NotNull ne device, @NotNull LogoRequest request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(request, "request");
        le.c("TransferAppLogo", new j(request));
        t5t.d("TransferAppLogo", "handleLogoRequest: " + request);
        String strA = a(context, request);
        if (strA != null) {
            f14758a.a(device, request, strA);
        } else {
            a(device, new LogoResponse(request.getPkg(), 2));
        }
    }

    public final void a(ne device, LogoRequest request, String path) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new l(device, request, path, null), 3, null);
    }

    public final void a(ne device, LogoResponse response) {
        device.U2(response, new k());
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public final String a(Context context, LogoRequest quest) {
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setAction("android.intent.action.MAIN");
        intent.setPackage(quest.getPkg());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        if (listQueryIntentActivities.size() == 0) {
            le.c("TransferAppLogo", new e(quest));
            t5t.d("TransferAppLogo", "app about " + quest.getPkg() + " is not installed.");
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
        CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(context.getPackageManager());
        Drawable drawableLoadIcon = resolveInfo.loadIcon(context.getPackageManager());
        Intrinsics.checkNotNullExpressionValue(drawableLoadIcon, "resolveInfo.loadIcon(context.packageManager)");
        Bitmap bitmap$default = DrawableKt.toBitmap$default(drawableLoadIcon, quest.getWidth(), quest.getHeight(), null, 4, null);
        StringBuilder sb = new StringBuilder();
        sb.append(b(context));
        String str = File.separator;
        sb.append(str);
        sb.append((Object) charSequenceLoadLabel);
        sb.append(".png");
        String string = sb.toString();
        String str2 = b(context) + str + "logo_" + StringsKt__StringsJVMKt.replace$default(quest.getPkg(), ".", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, false, 4, (Object) null) + ".tga";
        le.c("TransferAppLogo", new f(string));
        le.c("TransferAppLogo", new g(str2));
        t5t.d("TransferAppLogo", "png path: " + string);
        t5t.d("TransferAppLogo", "tag path: " + str2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            bitmap$default.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            int iPng2tga = DialProcess.f9903a.png2tga(string, str2, a(quest));
            le.c("TransferAppLogo", new h(iPng2tga));
            t5t.d("TransferAppLogo", "png to tga result: " + iPng2tga);
            if (iPng2tga != 0) {
                return null;
            }
            return str2;
        } catch (IOException e2) {
            a(context);
            le.c("TransferAppLogo", new i(e2));
            t5t.d("TransferAppLogo", "exception: " + e2.getLocalizedMessage() + "\n " + e2);
            return null;
        }
    }

    public final boolean a(Context context) {
        int iB = trh.b(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        le.c("TransferAppLogo", new b(iB));
        t5t.d("TransferAppLogo", "checkWriteStoragePermission result: " + iB);
        return iB == 0;
    }

    public final int a(LogoRequest logoRequest) {
        int i2 = a.f14759a[logoRequest.getFormat().ordinal()];
        if (i2 == 2) {
            return 0;
        }
        if (i2 == 3) {
            return 1;
        }
        if (i2 != 4) {
            return i2 != 5 ? 3 : 4;
        }
        return 2;
    }
}
