package com.xiaomi.hm.health.device.notification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.drawable.DrawableKt;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoFormat;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoRequest;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoResponse;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.dial_process.DialProcess;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0003J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0004H\u0002J\u001e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/notification/TransferAppLogo;", "", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoRequest;", "request", "", "path", "", "f", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoResponse;", AbstractJSONTokenResponse.RESPONSE, "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "quest", "c", "b", "", "a", "", GoogleApiAvailabilityLight.a, "handleLogoRequest", "Ljava/lang/String;", "tag", LogUtil.I, "OK", "UNKNOWN", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TransferAppLogo {

    @NotNull
    public static final TransferAppLogo INSTANCE = new TransferAppLogo();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "TransferAppLogo";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int OK = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int UNKNOWN = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoFormat.values().length];
            iArr[LogoFormat.TGA_RGB565_GCNANOLITE.ordinal()] = 1;
            iArr[LogoFormat.TGA_L8_ARGB8888_GCNANOLITE.ordinal()] = 2;
            iArr[LogoFormat.TGA_L8_ARGB8888_DAVE2D.ordinal()] = 3;
            iArr[LogoFormat.TGA_BITMAP_ARGB8888.ordinal()] = 4;
            iArr[LogoFormat.TGA_RGB565_DAVE2D.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "checkWriteStoragePermission result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "mkdir result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ LogoRequest a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LogoRequest logoRequest) {
            super(0);
            this.a = logoRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "app about " + this.a.getPkg() + " is not installed.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "png path: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "tga path: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "png to tga result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "exception: " + this.a.getLocalizedMessage() + "\n " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ LogoRequest a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LogoRequest logoRequest) {
            super(0);
            this.a = logoRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleLogoRequest: " + this.a;
        }
    }

    private TransferAppLogo() {
    }

    private final boolean a(Context context) {
        int iCheckSelfPermission = PermissionChecker.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        HMLog.info(tag, new a(iCheckSelfPermission));
        return iCheckSelfPermission == 0;
    }

    private final String b(Context context) {
        String str = (FileUtils.getExternalStorageDirectoryCompatible(context).toString() + "/hmbletool") + File.separator + "app-icon";
        File file = new File(str);
        if (!file.exists()) {
            HMLog.info(tag, new b(file.mkdirs()));
        }
        return str;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final String c(Context context, LogoRequest quest) {
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setAction("android.intent.action.MAIN");
        intent.setPackage(quest.getPkg());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.size() == 0) {
            HMLog.info(tag, new c(quest));
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
        CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(context.getPackageManager());
        Bitmap bitmap$default = DrawableKt.toBitmap$default(resolveInfo.loadIcon(context.getPackageManager()), quest.getWidth(), quest.getHeight(), null, 4, null);
        String strB = b(context);
        String str = File.separator;
        String str2 = strB + str + ((Object) charSequenceLoadLabel) + ".png";
        String str3 = b(context) + str + "logo_" + m.replace$default(quest.getPkg(), ".", "_", false, 4, (Object) null) + ".tga";
        HMLog.info(tag, new d(str2));
        HMLog.info(tag, new e(str3));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            bitmap$default.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            int iPng2tga = DialProcess.INSTANCE.png2tga(str2, str3, d(quest));
            HMLog.info(tag, new f(iPng2tga));
            if (iPng2tga != 0) {
                return null;
            }
            return str3;
        } catch (IOException e2) {
            a(context);
            HMLog.info(tag, new g(e2));
            return null;
        }
    }

    private final int d(LogoRequest logoRequest) {
        int i = WhenMappings.$EnumSwitchMapping$0[logoRequest.getFormat().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 0;
            }
            if (i == 3) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 5) {
                return 4;
            }
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(HMMiLiProDevice device, LogoResponse response) {
        device.responseLogoRequest(response, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.notification.TransferAppLogo$responseLogoRequest$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "responseLogoRequest result: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                Debug.fi("TransferAppLogo", "responseLogoRequest result: " + result);
                HMLog.info("TransferAppLogo", new a(result));
            }
        });
    }

    private final void f(HMMiLiProDevice device, LogoRequest request, String path) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TransferAppLogo$transferLogoFile$1(device, request, path, null), 3, null);
    }

    public final void handleLogoRequest(@NotNull Context context, @NotNull HMMiLiProDevice device, @NotNull LogoRequest request) {
        HMLog.info(tag, new h(request));
        String strC = c(context, request);
        if (strC == null) {
            strC = null;
        } else {
            INSTANCE.f(device, request, strC);
        }
        if (strC == null) {
            e(device, new LogoResponse(request.getPkg(), 2));
        }
    }
}
