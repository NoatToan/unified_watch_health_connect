package com.huawei.agconnect.apms;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.CollectData;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.collect.model.event.resource.CPUMemoryEvent;
import com.huawei.agconnect.apms.exception.APMSException;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.videoedit.gles.transition.SquareChangeAnimation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class fgh implements ijk, rst {
    public static final AgentLog klm = AgentLogManager.getAgentLog();
    public final Context bcd;
    public w cde;
    public final hij def;
    public DeviceInformation efg;
    public PlatformInformation fgh;
    public UserSettingsInformation ghi;
    public ApplicationInformation hij;
    public String ijk;
    public final Object jkl = new Object();
    public final long abc = System.currentTimeMillis();

    public final class abc implements Runnable {
        public final /* synthetic */ String abc;
        public final /* synthetic */ Map bcd;

        public abc(String str, Map map) {
            this.abc = str;
            this.bcd = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(HeaderType.AGENT_VERSION, Agent.getVersion());
            linkedHashMap.put(HeaderType.USER_IDENTIFIER, Agent.getUserIdentifier());
            linkedHashMap.put(HeaderType.EVENT_ID, this.abc);
            linkedHashMap.put("device", fgh.this.def().toJsonString());
            linkedHashMap.put("platform", fgh.this.ghi().toJsonString());
            linkedHashMap.put(EventType.USER_SETTINGS, fgh.this.lmn().toJsonString());
            linkedHashMap.put("app", fgh.this.opq().toJsonString());
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(fgh.this.cde().asJsonArray());
            jsonArray.add(new Gson().toJson(this.bcd));
            linkedHashMap.put(EventType.QOES_EVENT, jsonArray.toString());
            linkedHashMap.put(HeaderType.NQOES_TRANSACTION_ID, "");
            AgentLog agentLog = fgh.klm;
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("report custom data size: ");
            sbAbc.append(linkedHashMap.size());
            agentLog.info(sbAbc.toString());
            HiAnalyticsManager.getInstance().onEvent(HiAnalyticsManager.APM_EVENT_ID, linkedHashMap);
        }
    }

    public fgh(Context context, hij hijVar) throws Throwable {
        Context contextAbc = abc(context);
        this.bcd = contextAbc;
        this.def = hijVar;
        this.cde = new w(contextAbc);
        vwx.abc().abc(this);
        ghi ghiVar = new ghi();
        if (contextAbc instanceof Application) {
            ((Application) contextAbc).registerActivityLifecycleCallbacks(ghiVar);
        }
        context.registerComponentCallbacks(ghiVar);
        stu();
        hijVar.cde(this.cde.pqr());
        hijVar.bcd(this.cde.opq());
        hijVar.bcd(this.cde.lmn());
        hijVar.abc(this.cde.klm());
        hijVar.abc(this.cde.nop());
        hijVar.def(this.cde.qrs());
        hijVar.abc(rst());
        vwx.abc().abc(m0.klm());
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final long abc() {
        return this.abc;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void bcd(boolean z) {
        synchronized (this.jkl) {
            this.def.fgh = z;
            this.cde.abc("apms.enable_web_view_monitor", z);
        }
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final RuntimeEnvInformation cde() {
        boolean z;
        int intExtra;
        RuntimeEnvInformation runtimeEnvInformation = new RuntimeEnvInformation();
        Context context = this.bcd;
        if (context != null) {
            int intExtra2 = 0;
            try {
                AgentLog agentLog = wxy.abc;
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                z = intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5);
            } catch (Throwable th) {
                def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get device charging status: "), wxy.abc);
            }
            runtimeEnvInformation.setDeviceCharging(z);
            try {
                Intent intentRegisterReceiver2 = this.bcd.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 != null) {
                    intExtra2 = (int) ((intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1)) * 100.0f);
                }
            } catch (Throwable th2) {
                def.abc(th2, com.huawei.agconnect.apms.abc.abc("failed to get device battery percentage: "), wxy.abc);
            }
            runtimeEnvInformation.setBatteryPercentage(intExtra2);
            runtimeEnvInformation.setNetworkWanType(lkj.abc(this.bcd));
        }
        Context context2 = this.bcd;
        if (context2 != null && context2.getResources() != null && this.bcd.getResources().getConfiguration() != null) {
            runtimeEnvInformation.setOrientation(this.bcd.getResources().getConfiguration().orientation);
        }
        runtimeEnvInformation.setAppBackgrounded(!vwx.abc().cde.get());
        runtimeEnvInformation.addSession(m0.cde.abc);
        Context context3 = this.bcd;
        if (context3 != null) {
            runtimeEnvInformation.setMemoryUsage(xyz.abc(context3));
        }
        runtimeEnvInformation.setDiskAvailable(xyz.abc());
        return runtimeEnvInformation;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    @Override // com.huawei.agconnect.apms.ijk
    public final DeviceInformation def() {
        String str;
        String str2;
        String property;
        FileReader fileReader;
        Display defaultDisplay;
        String str3;
        int length;
        BufferedReader bufferedReader;
        long blockCount;
        FileReader fileReader2;
        String str4 = "";
        DeviceInformation deviceInformation = this.efg;
        if (deviceInformation != null) {
            return deviceInformation;
        }
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                str = Build.MANUFACTURER;
                                try {
                                    str2 = Build.MODEL;
                                    try {
                                        property = System.getProperty("os.arch");
                                        while (true) {
                                            try {
                                                String line = bufferedReader.readLine();
                                                if (line == null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e) {
                                                        cde.abc(e, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                                                    }
                                                    fileReader2.close();
                                                    break;
                                                }
                                                if (line.contains("Hardware") && line.split(":").length > 1) {
                                                    str4 = line.split(":")[1];
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e2) {
                                                        cde.abc(e2, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                                                    }
                                                    try {
                                                        fileReader2.close();
                                                        break;
                                                    } catch (IOException e3) {
                                                        cde.abc(e3, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                fileReader = fileReader2;
                                                try {
                                                    xyz.abc.warn("failed to open /proc/cpuinfo file: " + th.getMessage());
                                                    if (bufferedReader != null) {
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (IOException e4) {
                                                            cde.abc(e4, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                                                        }
                                                    }
                                                    if (fileReader != null) {
                                                        fileReader.close();
                                                        break;
                                                        break;
                                                    }
                                                } catch (Throwable th2) {
                                                    if (bufferedReader != null) {
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (IOException e5) {
                                                            cde.abc(e5, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                                                        }
                                                    }
                                                    if (fileReader == null) {
                                                        throw th2;
                                                    }
                                                    try {
                                                        fileReader.close();
                                                        throw th2;
                                                    } catch (IOException e6) {
                                                        cde.abc(e6, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get architecture info: "), klm);
                                        property = "";
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str2 = "";
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str = "";
                                str2 = str;
                            }
                            bufferedReader = new BufferedReader(fileReader2);
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedReader = null;
                        }
                        fileReader2 = new FileReader("/proc/cpuinfo");
                    } catch (IOException e7) {
                        cde.abc(e7, com.huawei.agconnect.apms.abc.abc("failed to close /proc/cpuinfo file: "), xyz.abc);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    bufferedReader = null;
                }
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(xyz.cde);
                length = fileArrListFiles == null ? -1 : fileArrListFiles.length;
            } catch (Throwable unused) {
            }
            WindowManager windowManager = (WindowManager) this.bcd.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        } catch (Throwable unused2) {
        }
        DeviceInformation deviceInformation2 = new DeviceInformation(str, property, str2);
        deviceInformation2.setScreenSize(wxy.abc(this.bcd));
        deviceInformation2.setResolution(wxy.bcd(this.bcd));
        fileReader = null;
        deviceInformation2.setRefreshRate(defaultDisplay == null ? 0.0f : defaultDisplay.getRefreshRate());
        Context context = this.bcd;
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            str3 = "unknown";
        } else {
            int i = context.getResources().getConfiguration().screenLayout & 15;
            if (i == 1) {
                str3 = SquareChangeAnimation.SMALL;
            } else if (i == 2) {
                str3 = "normal";
            } else if (i == 3) {
                str3 = CardMgrSdkConst.CardInfoDescEX.DISPLAY_LARGE;
            } else if (i > 3) {
                str3 = "xlarge";
            } else {
                str3 = "unknown";
            }
        }
        deviceInformation2.setScreenType(str3);
        AgentLog agentLog = xyz.abc;
        deviceInformation2.setCpuCores(length);
        deviceInformation2.setCpuModel(str4);
        deviceInformation2.setRamMemory(xyz.bcd(this.bcd));
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused3) {
            blockCount = -1;
        }
        deviceInformation2.setDiskSize(blockCount);
        this.efg = deviceInformation2;
        return deviceInformation2;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final String efg() {
        a0 a0Var;
        synchronized (a0.class) {
            if (a0.def == null) {
                a0.def = new a0();
            }
            a0Var = a0.def;
        }
        zyx zyxVar = a0Var.abc;
        ScheduledFuture scheduledFuture = zyxVar.bcd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            zyxVar.bcd = null;
            zyxVar.cde = -1L;
        }
        k kVar = a0Var.bcd;
        ScheduledFuture scheduledFuture2 = kVar.cde;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            kVar.cde = null;
            kVar.def = -1L;
        }
        a0.cde.debug(String.format(Locale.ENGLISH, "stop collect cpu and memory.", new Object[0]));
        CPUMemoryEvent cPUMemoryEvent = new CPUMemoryEvent();
        cPUMemoryEvent.setTimestamp(System.currentTimeMillis());
        while (!a0Var.abc.fgh.isEmpty()) {
            cPUMemoryEvent.getCpuResourceList().add(a0Var.abc.fgh.poll());
        }
        while (!a0Var.bcd.efg.isEmpty()) {
            cPUMemoryEvent.getAppMemoryResourceList().add(a0Var.bcd.efg.poll());
        }
        return cPUMemoryEvent.changeCpuAndMemoryAsJsonObject().toString();
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void fgh(boolean z) {
        this.def.efg = z;
        this.cde.abc("apms.enable_anr_monitor", z);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:6:0x0018, B:9:0x0025, B:21:0x008d, B:13:0x0042, B:14:0x0058, B:18:0x0075, B:10:0x0038, B:15:0x006b), top: B:29:0x0018, inners: #0, #2 }] */
    @Override // com.huawei.agconnect.apms.ijk
    public final PlatformInformation ghi() {
        Object objAbc;
        String str = "";
        PlatformInformation platformInformation = this.fgh;
        if (platformInformation != null) {
            return platformInformation;
        }
        PlatformInformation platformInformation2 = new PlatformInformation();
        platformInformation2.setOsVersion(Build.VERSION.RELEASE);
        platformInformation2.setRomName(wxy.bcd());
        try {
            if (wxy.abc()) {
                try {
                    objAbc = wxy.abc(Class.forName("android.os.SystemProperties"), new Class[]{String.class, String.class}, new Object[]{"ro.build.version.magic", ""});
                } catch (Throwable th) {
                    wxy.abc.warn("failed to get method: " + th.getMessage());
                    objAbc = null;
                }
                if (objAbc != null) {
                    str = (String) objAbc;
                }
            } else {
                try {
                    objAbc = wxy.abc(Class.forName("android.os.SystemProperties"), new Class[]{String.class, String.class}, new Object[]{"ro.build.version.emui", ""});
                } catch (Throwable th2) {
                    wxy.abc.warn("failed to get method: " + th2.getMessage());
                    objAbc = null;
                }
                if (objAbc != null) {
                    str = (String) objAbc;
                }
            }
        } catch (Throwable th3) {
            def.abc(th3, com.huawei.agconnect.apms.abc.abc("failed to get EMUI version: "), wxy.abc);
        }
        platformInformation2.setRomVersion(str);
        this.fgh = platformInformation2;
        return platformInformation2;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final String hij() {
        return TextUtils.isEmpty(this.ijk) ? "" : this.ijk;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final Context ijk() {
        return this.bcd;
    }

    @Override // com.huawei.agconnect.apms.rst
    public final void jkl() {
        klm.debug("APMS: application foregrounded.");
        start();
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void klm() {
        tsr.abc(false);
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final UserSettingsInformation lmn() {
        UserSettingsInformation userSettingsInformation = this.ghi;
        if (userSettingsInformation != null) {
            return userSettingsInformation;
        }
        UserSettingsInformation userSettingsInformation2 = new UserSettingsInformation();
        TimeZone timeZone = TimeZone.getDefault();
        userSettingsInformation2.setTimeZone(timeZone.getID() + "/" + timeZone.getDisplayName(false, 0));
        Context context = this.bcd;
        if (context == null || context.getResources() == null || this.bcd.getResources().getConfiguration() == null || this.bcd.getResources().getConfiguration().locale == null) {
            userSettingsInformation2.setDefaultLanguage("");
        } else {
            Locale locale = this.bcd.getResources().getConfiguration().locale;
            userSettingsInformation2.setDefaultLanguage(locale.getLanguage() + "_" + locale.getCountry());
        }
        this.ghi = userSettingsInformation2;
        return userSettingsInformation2;
    }

    @Override // com.huawei.agconnect.apms.rst
    public final void mno() {
        klm.debug("APMS: application backgrounded.");
        ghi(true);
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final hij nop() {
        return this.def;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final ApplicationInformation opq() {
        return this.hij;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final boolean pqr() {
        return !this.def.fgh;
    }

    public final int rst() {
        WindowManager windowManager = (WindowManager) this.bcd.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager != null) {
            return (int) windowManager.getDefaultDisplay().getRefreshRate();
        }
        return 0;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void start() {
        try {
            if (bcd()) {
                ghi(false);
            } else {
                tuv();
                tsr.bcd();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("failed to start APMS. "), klm);
        }
    }

    public final void stu() throws APMSException {
        String str;
        if (this.hij != null) {
            return;
        }
        this.hij = new ApplicationInformation();
        String packageName = this.bcd.getPackageName();
        AgentLog agentLog = klm;
        agentLog.debug("using app packageId " + packageName);
        this.hij.setPackageId(packageName);
        PackageManager packageManager = this.bcd.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo == null || (str = packageInfo.versionName) == null || str.length() <= 0) {
                throw new APMSException("the app doesn't have a version defined, ensure 'versionName' has been defined in build.gradle or AndroidManifest.xml.");
            }
            String str2 = packageInfo.versionName;
            agentLog.debug("using app version " + str2);
            this.hij.setAppVersion(str2);
            int i = packageInfo.versionCode;
            agentLog.debug("using app versionCode " + i);
            this.hij.setVersionCode(i);
            try {
                packageName = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
            } catch (Throwable th) {
                def.abc(th, com.huawei.agconnect.apms.abc.abc("failed to get appName, use packageName instead: "), klm);
            }
            klm.debug("using app name " + packageName);
            this.hij.setAppName(packageName);
        } catch (Throwable th2) {
            StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("could not get package version: ");
            sbAbc.append(th2.getMessage());
            throw new APMSException(sbAbc.toString());
        }
    }

    public final void tuv() {
        w wVar = this.cde;
        if (wVar == null) {
            AgentLog agentLog = tsr.efg;
        } else if (tsr.abc()) {
            mlk mlkVar = tsr.fgh.abc;
            synchronized (mlkVar.fgh) {
                if (!mlkVar.fgh.contains(wVar)) {
                    mlkVar.fgh.add(wVar);
                }
            }
        } else {
            ArrayList arrayList = tsr.ghi;
            if (!arrayList.contains(wVar)) {
                synchronized (arrayList) {
                    arrayList.add(wVar);
                }
            }
        }
        m0 m0Var = m0.cde;
        if (m0Var != null) {
            if (tsr.abc()) {
                mlk mlkVar2 = tsr.fgh.abc;
                synchronized (mlkVar2.fgh) {
                    if (!mlkVar2.fgh.contains(m0Var)) {
                        mlkVar2.fgh.add(m0Var);
                    }
                }
            } else {
                ArrayList arrayList2 = tsr.ghi;
                if (!arrayList2.contains(m0Var)) {
                    synchronized (arrayList2) {
                        arrayList2.add(m0Var);
                    }
                }
            }
        }
        hij hijVar = this.def;
        try {
            tsr tsrVar = tsr.fgh;
            if (tsrVar != null) {
                tsrVar.abc(hijVar);
                for (qpo qpoVar : tsr.ghi) {
                    if (qpoVar != null) {
                        mlk mlkVar3 = tsr.fgh.abc;
                        synchronized (mlkVar3.fgh) {
                            if (!mlkVar3.fgh.contains(qpoVar)) {
                                mlkVar3.fgh.add(qpoVar);
                            }
                        }
                    }
                }
                tsr.ghi.clear();
            }
        } catch (Throwable th) {
            bcd.abc(th, com.huawei.agconnect.apms.abc.abc("apms initialize failed, detail is "), tsr.efg);
        }
        tsr.abc(this.cde.abc);
        if (pon.def == null) {
            pon.def = pon.bcd.scheduleAtFixedRate(pon.efg, 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        if (d.def == null) {
            d.def = d.bcd.scheduleAtFixedRate(d.efg, 0L, 1000L, TimeUnit.MILLISECONDS);
        }
        if (this.def.hij) {
            AgentLog agentLog2 = cba.cde;
            cba cbaVar = cba.abc.abc;
            if (!cbaVar.bcd) {
                if (cbaVar.abc == null) {
                    cbaVar.abc = new dcb();
                }
                Looper.getMainLooper().setMessageLogging(cbaVar.abc);
                cbaVar.bcd = true;
                cba.cde.debug("start trace");
            }
        }
        AgentLog agentLog3 = klm;
        StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("APMS v");
        sbAbc.append(Agent.getVersion());
        agentLog3.info(sbAbc.toString());
    }

    public static Context abc(Context context) {
        return context instanceof Application ? context : context.getApplicationContext();
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final boolean fgh() {
        return this.def.ghi;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(String str) {
        synchronized (this.jkl) {
            klm.info("APMS: disable collection for app versions: " + str);
            try {
                this.def.cde = str;
                this.cde.bcd(str);
                if (abc(str, this.hij.getAppVersion())) {
                    ghi(false);
                } else {
                    start();
                }
            } catch (Throwable th) {
                if (abc(str, this.hij.getAppVersion())) {
                    ghi(false);
                } else {
                    start();
                }
                throw th;
            }
        }
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void bcd(String str) {
        this.ijk = str;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final boolean bcd() {
        hij hijVar = this.def;
        return hijVar.abc || hijVar.bcd || abc(hijVar.cde, this.hij.getAppVersion());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    @Override // com.huawei.agconnect.apms.ijk
    public final void bcd(int i) {
        a0 a0Var;
        synchronized (a0.class) {
            if (a0.def == null) {
                a0.def = new a0();
            }
            a0Var = a0.def;
        }
        a0Var.getClass();
        if (Agent.isDisabled()) {
            return;
        }
        AgentLog agentLog = a0.cde;
        Locale locale = Locale.ENGLISH;
        agentLog.debug(String.format(locale, "start collect cpu and memory.", new Object[0]));
        AgentLog agentLog2 = zyx.ghi;
        int i2 = i <= 0 ? -1 : i;
        if (i2 > 0) {
            zyx zyxVar = a0Var.abc;
            zyxVar.getClass();
            zyx.ghi.debug("collectAtFixedFrequency =" + i2);
            if (zyxVar.efg > 0 && i2 > 0) {
                ScheduledFuture scheduledFuture = zyxVar.bcd;
                if (scheduledFuture == null) {
                    synchronized (zyxVar) {
                        long j = i2;
                        zyxVar.cde = j;
                        try {
                            zyxVar.bcd = zyxVar.abc.scheduleAtFixedRate(new zab(zyxVar), 0L, j, TimeUnit.MILLISECONDS);
                        } catch (RejectedExecutionException e) {
                            zyx.ghi.warn(String.format(Locale.ENGLISH, "unable to start collecting cpu metrics: %s", e.getMessage()));
                        }
                    }
                } else if (i2 != zyxVar.cde) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        zyxVar.bcd = null;
                        zyxVar.cde = -1L;
                    }
                    synchronized (zyxVar) {
                        long j2 = i2;
                        zyxVar.cde = j2;
                        zyxVar.bcd = zyxVar.abc.scheduleAtFixedRate(new zab(zyxVar), 0L, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        } else {
            agentLog.debug(String.format(locale, "invalid cpu metrics collection frequency-%d. Did not report cpu metrics.", Integer.valueOf(i2)));
        }
        if (i2 > 0) {
            k kVar = a0Var.bcd;
            kVar.getClass();
            if (i2 <= 0) {
                return;
            }
            ScheduledFuture scheduledFuture2 = kVar.cde;
            if (scheduledFuture2 != null) {
                if (i2 == kVar.def) {
                    return;
                }
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    kVar.cde = null;
                    kVar.def = -1L;
                }
            }
            synchronized (kVar) {
                long j3 = i2;
                kVar.def = j3;
                try {
                    kVar.cde = kVar.abc.scheduleAtFixedRate(new j(kVar), 0L, j3, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException e2) {
                    k.fgh.warn(String.format(Locale.ENGLISH, "unable to start collecting memory metrics: %s", e2.getMessage()));
                }
            }
            return;
        }
        a0.cde.debug(String.format(Locale.ENGLISH, "invalid memory metrics collection frequency-%d. Did not report memory metrics.", Integer.valueOf(i2)));
    }

    public static boolean abc(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            for (String str3 : str.split(",")) {
                if (str2.trim().equalsIgnoreCase(str3.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void efg(boolean z) {
        synchronized (this.jkl) {
            this.def.ghi = z;
        }
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(String str, Map<String, String> map) {
        if (bcd() || map == null || map.size() == 0) {
            return;
        }
        Agent.getExecutor().execute(new abc(str, map));
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(boolean z) {
        synchronized (this.jkl) {
            this.def.hij = z;
        }
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void abc(int i) {
        synchronized (this.jkl) {
            hij hijVar = this.def;
            int iMin = 2;
            if (i > 2) {
                hijVar.getClass();
                iMin = Math.min(i, 60);
            }
            hijVar.ijk = ((iMin + 1) * 1000) / hijVar.jkl;
        }
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void def(boolean z) {
        synchronized (this.jkl) {
            try {
                boolean z2 = !z;
                this.def.bcd = z2;
                this.cde.abc("apms.disable_collection", z2);
                if (z) {
                    klm.info("APMS: enable collection.");
                    start();
                } else {
                    klm.info("APMS: disable collection.");
                    ghi(false);
                }
            } catch (Throwable th) {
                if (z) {
                    klm.info("APMS: enable collection.");
                    start();
                } else {
                    klm.info("APMS: disable collection.");
                    ghi(false);
                }
                throw th;
            }
        }
    }

    @Override // com.huawei.agconnect.apms.ijk
    public final void cde(boolean z) {
        synchronized (this.jkl) {
            if (z) {
                klm.info("APMS: enable collection by user.");
                try {
                    this.def.abc = false;
                    this.cde.abc("apms.disable_collection_by_user", false);
                    start();
                } catch (Throwable th) {
                    start();
                    throw th;
                }
            } else {
                klm.info("APMS: disable collection by user.");
                try {
                    this.def.abc = true;
                    this.cde.abc("apms.disable_collection_by_user", true);
                    ghi(false);
                } catch (Throwable th2) {
                    ghi(false);
                    throw th2;
                }
            }
        }
    }

    public static void ghi(boolean z) {
        if (z) {
            try {
                tsr.abc(true);
            } catch (Throwable th) {
                bcd.abc(th, com.huawei.agconnect.apms.abc.abc("failed to stop APMS. "), klm);
                return;
            }
        }
        ScheduledFuture scheduledFuture = d.def;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            d.def = null;
        }
        if (tsr.abc()) {
            tsr tsrVar = tsr.fgh;
            if (tsrVar != null) {
                nml nmlVar = tsrVar.bcd;
                if (nmlVar == null) {
                    tsr.efg.warn("the collect timer is null, can not stop timer.");
                } else if (nmlVar.bcd != null) {
                    try {
                        nmlVar.fgh.lock();
                        ScheduledFuture scheduledFuture2 = nmlVar.bcd;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(true);
                            nmlVar.bcd = null;
                        }
                        nmlVar.fgh.unlock();
                        nml.ghi.debug("collector stopped.");
                        nmlVar.def.ghi();
                    } catch (Throwable th2) {
                        nmlVar.fgh.unlock();
                        throw th2;
                    }
                }
            }
            tsr tsrVar2 = tsr.fgh;
            nml nmlVar2 = tsrVar2.bcd;
            if (nmlVar2 != null) {
                try {
                    nmlVar2.fgh.lock();
                    ScheduledFuture scheduledFuture3 = nmlVar2.bcd;
                    if (scheduledFuture3 != null) {
                        scheduledFuture3.cancel(true);
                        nmlVar2.bcd = null;
                    }
                    nmlVar2.fgh.unlock();
                    nmlVar2.abc.shutdownNow();
                } catch (Throwable th3) {
                    nmlVar2.fgh.unlock();
                    throw th3;
                }
            }
            CollectData collectData = tsrVar2.cde;
            if (collectData != null) {
                collectData.shutDownCollectData();
            }
            tsrVar2.bcd = null;
            tsrVar2.abc = null;
            tsrVar2.cde = null;
        }
        ScheduledFuture scheduledFuture4 = pon.def;
        if (scheduledFuture4 != null) {
            scheduledFuture4.cancel(true);
            pon.def = null;
        }
        AgentLog agentLog = cba.cde;
        cba cbaVar = cba.abc.abc;
        if (cbaVar.bcd) {
            Looper.getMainLooper().setMessageLogging(null);
            cbaVar.abc.abc();
            cbaVar.abc = null;
            cbaVar.bcd = false;
            cba.cde.debug("stop trace");
        }
    }
}
