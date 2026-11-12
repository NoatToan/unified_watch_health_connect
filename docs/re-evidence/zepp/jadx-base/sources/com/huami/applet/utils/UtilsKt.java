package com.huami.applet.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0001\u001a\b\u0010\u0012\u001a\u00020\u0011H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\b\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000\u001a\b\u0010\u001a\u001a\u00020\u0015H\u0000\"\u001d\u0010 \u001a\u00020\u001b8@@\u0000X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, HMFwOnlineAnalyticsKt.COST, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "id", "Lorg/json/JSONObject;", "result", "errorMsg", "packRpcResult", "", HTTP.CONTENT_RANGE_BYTES, "byteToHexString", "hex", "hexStrToByte", "", "createRequestId", "Ljava/lang/Runnable;", "runnable", "", "executeOnSubThread", "", "isMainThread", "executeOnMainThread", "printLibInfo", "Landroid/os/Handler;", "a", "Lkotlin/Lazy;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Handler> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "================================";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "当前小程序伴生服务库版本：0.0.14";
        }
    }

    /* JADX INFO: renamed from: com.huami.applet.utils.UtilsKt$cost$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j) {
            super(0);
            this.a = str;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 耗时：" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "================================";
        }
    }

    @Nullable
    public static final String byteToHexString(@NotNull byte[] bArr) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            int length = bArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = i + 1;
                    String hexString = Integer.toHexString(bArr[i]);
                    if (hexString.length() > 3) {
                        stringBuffer.append(hexString.substring(6));
                    } else if (hexString.length() < 2) {
                        stringBuffer.append(Intrinsics.stringPlus("0", hexString));
                    } else {
                        stringBuffer.append(hexString);
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(stringBuffer.toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }

    public static final <T> T cost(@NotNull String str, @NotNull Function0<? extends T> function0) {
        long jNanoTime = System.nanoTime();
        T tInvoke = function0.invoke();
        HMLog.info(ConstantKt.TAG_APPLET, new AnonymousClass1(str, System.nanoTime() - jNanoTime));
        return tInvoke;
    }

    public static final int createRequestId() throws InterruptedException {
        String str = new SimpleDateFormat("HHmmssSSS", Locale.getDefault()).format(new Date());
        Thread.sleep(1L);
        return Integer.parseInt(str);
    }

    public static final void executeOnMainThread(@Nullable Runnable runnable) {
        getMainHandler().post(runnable);
    }

    public static final void executeOnSubThread(@NotNull Runnable runnable) {
        BooleanExt withData;
        if (isMainThread()) {
            AppletConfig.INSTANCE.getExecutor().execute(runnable);
            withData = new WithData(Unit.INSTANCE);
        } else {
            withData = Otherwise.INSTANCE;
        }
        if (withData instanceof Otherwise) {
            runnable.run();
        } else {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
        }
    }

    @NotNull
    public static final Handler getMainHandler() {
        return (Handler) a.getValue();
    }

    @Nullable
    public static final byte[] hexStrToByte(@NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() / 2);
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 1;
                byteBufferAllocate.put((byte) Integer.parseInt(Intrinsics.stringPlus(str.charAt(i) + "", Character.valueOf(str.charAt(i2))), kotlin.text.a.checkRadix(16)));
                i = i2 + 1;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(byteBufferAllocate.array());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (byte[]) objM3845constructorimpl;
    }

    public static final boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @NotNull
    public static final JSONObject packRpcResult(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("jsonrpc", ConstantKt.RPC_VERSION);
        jSONObject2.put("id", str);
        if (str2 == null) {
            jSONObject2.put("result", jSONObject);
        } else {
            jSONObject2.put("error", new JSONObject().put("message", str2));
        }
        return jSONObject2;
    }

    public static /* synthetic */ JSONObject packRpcResult$default(String str, JSONObject jSONObject, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return packRpcResult(str, jSONObject, str2);
    }

    public static final void printLibInfo() {
        HMLog.info(ConstantKt.TAG_APPLET, b.a);
        HMLog.info(ConstantKt.TAG_APPLET, c.a);
        HMLog.info(ConstantKt.TAG_APPLET, d.a);
    }
}
