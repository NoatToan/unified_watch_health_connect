package com.mi.fitness.checkupdate.util;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.a33;
import defpackage.s33;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/mi/fitness/checkupdate/util/CheckUpdateUtil;", "", "<init>", "()V", "REGEX_FIRMWARE_VERSION_2", "", "compareFirmwareVersion2", "", "latestVersion", "currentVersion", "getThrowableString", PluginDeviceInfo.FICONOFFLINE, "", "checkAndOpenBluetooth", "", "callBack", "Lkotlin/Function1;", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckUpdateUtil {

    @NotNull
    public static final CheckUpdateUtil INSTANCE = new CheckUpdateUtil();

    @NotNull
    private static final String REGEX_FIRMWARE_VERSION_2 = "^(\\d+).(\\d+).(\\d+)$";

    private CheckUpdateUtil() {
    }

    public final void checkAndOpenBluetooth(@NotNull final Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (s33.e()) {
            callBack.invoke2(Boolean.TRUE);
        } else if (s33.f()) {
            BluetoothManager.INSTANCE.get().addBluetoothStateListener(new a33() { // from class: com.mi.fitness.checkupdate.util.CheckUpdateUtil.checkAndOpenBluetooth.1
                @Override // defpackage.a33
                public void onStateChanged(int state) {
                    BluetoothManager.INSTANCE.get().removeBluetoothStateListener(this);
                    boolean z = state == 12;
                    Logger.d("checkAndOpenBluetooth bluetooth opened:" + z, new Object[0]);
                    if (z) {
                        callBack.invoke2(Boolean.TRUE);
                    } else {
                        callBack.invoke2(Boolean.FALSE);
                    }
                }
            });
        } else {
            callBack.invoke2(Boolean.FALSE);
        }
    }

    public final int compareFirmwareVersion2(@Nullable String latestVersion, @Nullable String currentVersion) {
        Logger.i("CheckUpdate", "compareFirmwareVersion2() called with: latestVersion = " + latestVersion + ", currentVersion = " + currentVersion);
        if (latestVersion != null && currentVersion != null) {
            Pattern patternCompile = Pattern.compile(REGEX_FIRMWARE_VERSION_2);
            Matcher matcher = patternCompile.matcher(latestVersion);
            Matcher matcher2 = patternCompile.matcher(currentVersion);
            if (matcher.matches() && matcher2.matches()) {
                Logger.i("CheckUpdate", "compareFirmwareVersion2() called matched");
                for (int i = 1; i < 4; i++) {
                    Integer numValueOf = Integer.valueOf(matcher.group(i));
                    Integer numValueOf2 = Integer.valueOf(matcher2.group(i));
                    Logger.i("CheckUpdate", "compareFirmwareVersion2: latest:" + numValueOf + ", current:" + numValueOf2);
                    if (numValueOf.intValue() > numValueOf2.intValue()) {
                        return 1;
                    }
                    if (numValueOf.intValue() < numValueOf2.intValue()) {
                        return -1;
                    }
                }
                return 0;
            }
            Logger.i("CheckUpdate", "firmware version not matched");
        }
        return 0;
    }

    @Nullable
    public final String getThrowableString(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }
}
