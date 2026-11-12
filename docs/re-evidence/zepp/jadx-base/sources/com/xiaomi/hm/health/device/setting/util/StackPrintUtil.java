package com.xiaomi.hm.health.device.setting.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/util/StackPrintUtil;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StackPrintUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int a = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/util/StackPrintUtil$Companion;", "", "", "Ljava/lang/StackTraceElement;", Const.PARAM_STACK_TRACE, "", FirebaseAnalytics.Param.LEVEL, "", "fetchCallStack", "([Ljava/lang/StackTraceElement;I)Ljava/lang/String;", "breakIndex", LogUtil.I, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String fetchCallStack(@NotNull StackTraceElement[] stackTrace, int level) {
            int i;
            if (!DeviceXFunctionsKt.getBuildConfigApi().isDebug() && !GlobalConfig.get().isBuildInner()) {
                return "*";
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("\n --- stack ----> \n ");
                int i2 = 0;
                if ((!(stackTrace.length == 0)) && (i = level + 2) > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 >= stackTrace.length) {
                            break;
                        }
                        if (i2 >= 2) {
                            StackTraceElement stackTraceElement = stackTrace[i2];
                            stringBuffer.append(i2 + " --> " + stackTraceElement.getClassName() + UpdateUtils.CMD_FILTER + stackTraceElement.getMethodName() + UpdateUtils.CMD_FILTER + stackTraceElement.getLineNumber() + "\n");
                        }
                        if (i3 >= i) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                stringBuffer.append("<--- stack ---- \n ");
                return stringBuffer.toString();
            } catch (Throwable unused) {
                return "fetch stack error";
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final String fetchCallStack(@NotNull StackTraceElement[] stackTraceElementArr, int i) {
        return INSTANCE.fetchCallStack(stackTraceElementArr, i);
    }
}
