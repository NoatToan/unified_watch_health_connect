package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsReportDataCapture {
    private static final Map<String, Integer> e;
    public static final String f;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 3;
    public static final String j = "0";
    private final Context a;
    private final IdManager b;
    private final AppData c;
    private final StackTraceTrimmingStrategy d;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.6");
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        this.a = context;
        this.b = idManager;
        this.c = appData;
        this.d = stackTraceTrimmingStrategy;
    }

    private CrashlyticsReport.Builder a() {
        return CrashlyticsReport.builder().setSdkVersion("18.2.6").setGmpAppId(this.c.googleAppId).setInstallationUuid(this.b.getCrashlyticsInstallId()).setBuildVersion(this.c.versionCode).setDisplayVersion(this.c.versionName).setPlatform(4);
    }

    private static int b() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.BinaryImage c() {
        return CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder().setBaseAddress(0L).setSize(0L).setName(this.c.packageName).setUuid(this.c.buildId).build();
    }

    private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> d() {
        return ImmutableList.from(c());
    }

    private CrashlyticsReport.Session.Event.Application e(int i2, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(Boolean.valueOf(applicationExitInfo.getImportance() != 100)).setUiOrientation(i2).setExecution(j(applicationExitInfo)).build();
    }

    private CrashlyticsReport.Session.Event.Application f(int i2, TrimmedThrowableData trimmedThrowableData, Thread thread, int i3, int i4, boolean z) {
        Boolean boolValueOf;
        ActivityManager.RunningAppProcessInfo appProcessInfo = CommonUtils.getAppProcessInfo(this.c.packageName, this.a);
        if (appProcessInfo != null) {
            boolValueOf = Boolean.valueOf(appProcessInfo.importance != 100);
        } else {
            boolValueOf = null;
        }
        return CrashlyticsReport.Session.Event.Application.builder().setBackground(boolValueOf).setUiOrientation(i2).setExecution(k(trimmedThrowableData, thread, i3, i4, z)).build();
    }

    private CrashlyticsReport.Session.Event.Device g(int i2) {
        b bVarA = b.a(this.a);
        Float fB = bVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = bVarA.c();
        boolean proximitySensorEnabled = CommonUtils.getProximitySensorEnabled(this.a);
        return CrashlyticsReport.Session.Event.Device.builder().setBatteryLevel(dValueOf).setBatteryVelocity(iC).setProximityOn(proximitySensorEnabled).setOrientation(i2).setRamUsed(CommonUtils.getTotalRamInBytes() - CommonUtils.calculateFreeRamInBytes(this.a)).setDiskUsed(CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Exception h(TrimmedThrowableData trimmedThrowableData, int i2, int i3) {
        return i(trimmedThrowableData, i2, i3, 0);
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Exception i(TrimmedThrowableData trimmedThrowableData, int i2, int i3, int i4) {
        String str = trimmedThrowableData.className;
        String str2 = trimmedThrowableData.localizedMessage;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (i4 >= i3) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.cause;
                i5++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder overflowCount = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder().setType(str).setReason(str2).setFrames(ImmutableList.from(m(stackTraceElementArr, i2))).setOverflowCount(i5);
        if (trimmedThrowableData2 != null && i5 == 0) {
            overflowCount.setCausedBy(i(trimmedThrowableData2, i2, i3, i4 + 1));
        }
        return overflowCount.build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution j(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setAppExitInfo(applicationExitInfo).setSignal(r()).setBinaries(d()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution k(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, int i3, boolean z) {
        return CrashlyticsReport.Session.Event.Application.Execution.builder().setThreads(u(trimmedThrowableData, thread, i2, z)).setException(h(trimmedThrowableData, i2, i3)).setSignal(r()).setBinaries(d()).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame l(StackTraceElement stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return builder.setPc(jMax).setSymbol(str).setFile(fileName).setOffset(lineNumber).build();
    }

    private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> m(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(l(stackTraceElement, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder().setImportance(i2)));
        }
        return ImmutableList.from(arrayList);
    }

    private CrashlyticsReport.Session.Application n() {
        return CrashlyticsReport.Session.Application.builder().setIdentifier(this.b.getAppIdentifier()).setVersion(this.c.versionCode).setDisplayVersion(this.c.versionName).setInstallationUuid(this.b.getCrashlyticsInstallId()).setDevelopmentPlatform(this.c.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.c.developmentPlatformProvider.getDevelopmentPlatformVersion()).build();
    }

    private CrashlyticsReport.Session o(String str, long j2) {
        return CrashlyticsReport.Session.builder().setStartedAt(j2).setIdentifier(str).setGenerator(f).setApp(n()).setOs(q()).setDevice(p()).setGeneratorType(3).build();
    }

    private CrashlyticsReport.Session.Device p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iB = b();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long totalRamInBytes = CommonUtils.getTotalRamInBytes();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIsEmulator = CommonUtils.isEmulator(this.a);
        int deviceState = CommonUtils.getDeviceState(this.a);
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.Session.Device.builder().setArch(iB).setModel(Build.MODEL).setCores(iAvailableProcessors).setRam(totalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(str).setModelClass(Build.PRODUCT).build();
    }

    private CrashlyticsReport.Session.OperatingSystem q() {
        return CrashlyticsReport.Session.OperatingSystem.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(CommonUtils.isRooted(this.a)).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Signal r() {
        return CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build();
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread s(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return t(thread, stackTraceElementArr, 0);
    }

    private CrashlyticsReport.Session.Event.Application.Execution.Thread t(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread.getName()).setImportance(i2).setFrames(ImmutableList.from(m(stackTraceElementArr, i2))).build();
    }

    private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> u(TrimmedThrowableData trimmedThrowableData, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t(thread, trimmedThrowableData.stacktrace, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(s(key, this.d.getTrimmedStackTrace(entry.getValue())));
                }
            }
        }
        return ImmutableList.from(arrayList);
    }

    public CrashlyticsReport.Session.Event captureAnrEventData(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i2 = this.a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.builder().setType("anr").setTimestamp(applicationExitInfo.getTimestamp()).setApp(e(i2, applicationExitInfo)).setDevice(g(i2)).build();
    }

    public CrashlyticsReport.Session.Event captureEventData(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.Session.Event.builder().setType(str).setTimestamp(j2).setApp(f(i4, new TrimmedThrowableData(th, this.d), thread, i2, i3, z)).setDevice(g(i4)).build();
    }

    public CrashlyticsReport captureReportData(String str, long j2) {
        return a().setSession(o(str, j2)).build();
    }
}
