package com.huawei.agconnect.apms.anr;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.anr.model.AnrFileBody;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.def;
import com.huawei.agconnect.apms.i;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class abc {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public static final i cde = new i();
    public final Handler abc;

    /* JADX INFO: renamed from: com.huawei.agconnect.apms.anr.abc$abc, reason: collision with other inner class name */
    public final class C0050abc implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            def.abc(th, com.huawei.agconnect.apms.abc.abc("upload ANR info failed. "), abc.bcd);
        }
    }

    public static final class bcd {
        public static final abc abc = new abc();
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class cde implements Runnable {
        public Context abc;

        /* JADX INFO: renamed from: com.huawei.agconnect.apms.anr.abc$cde$abc, reason: collision with other inner class name */
        public static class C0051abc extends TypeToken<AnrFileBody> {
            private C0051abc() {
            }

            public /* synthetic */ C0051abc(int i) {
                this();
            }
        }

        public cde(Context context) {
            this.abc = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Agent.isDisabled()) {
                return;
            }
            abc.bcd.info("start upload anr files.");
            List arrayList = new ArrayList();
            int i = 0;
            try {
                arrayList = abc.cde.abc(this.abc, false);
            } catch (Throwable th) {
                def.abc(th, com.huawei.agconnect.apms.abc.abc("load anr dir failed. "), abc.bcd);
            }
            for (Object obj : arrayList) {
                try {
                    if (obj instanceof File) {
                        BufferedReader bufferedReader = null;
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new FileReader((File) obj));
                            try {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb.append(line);
                                    }
                                }
                                String string = sb.toString();
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused) {
                                    abc.bcd.warn("close ANR Reader failed");
                                }
                                if (string != null) {
                                    try {
                                        AnrFileBody anrFileBody = (AnrFileBody) new Gson().fromJson(string, new C0051abc(i).getType());
                                        if (anrFileBody != null) {
                                            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                                            linkedHashMap.put(HeaderType.AGENT_VERSION, anrFileBody.getAgentVersion());
                                            linkedHashMap.put(HeaderType.USER_IDENTIFIER, anrFileBody.getUserId());
                                            linkedHashMap.put("platform", anrFileBody.getPlatformInformation().toJsonString());
                                            linkedHashMap.put(EventType.USER_SETTINGS, anrFileBody.getUserSettingsInformation().toJsonString());
                                            linkedHashMap.put("device", anrFileBody.getDeviceInformation().toJsonString());
                                            linkedHashMap.put("app", anrFileBody.getApplicationInformation().toJsonString());
                                            linkedHashMap.put(EventType.ANR, anrFileBody.getAnrInfo().toJsonString());
                                            HiAnalyticsManager.getInstance().onEvent(HiAnalyticsManager.APM_EVENT_ID, linkedHashMap);
                                            abc.bcd.info("upload anr info success, data size: " + linkedHashMap.toString().length());
                                            abc.abc((File) obj);
                                            HiAnalyticsManager.getInstance().onReport();
                                        }
                                    } catch (Throwable unused2) {
                                        abc.abc((File) obj);
                                    }
                                }
                            } catch (IOException unused3) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused4) {
                                        abc.bcd.warn("close ANR Reader failed");
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused5) {
                                        abc.bcd.warn("close ANR Reader failed");
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused6) {
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th4) {
                    def.abc(th4, com.huawei.agconnect.apms.abc.abc("upload anr files failed. "), abc.bcd);
                }
            }
            try {
                List listAbc = abc.cde.abc(this.abc, true);
                int size = listAbc.size();
                while (i < size - 10) {
                    if (listAbc.get(i) instanceof File) {
                        abc.abc((File) listAbc.get(i));
                    }
                    i++;
                }
            } catch (Throwable unused7) {
                abc.bcd.debug("delete unused files failed. ");
            }
        }
    }

    public abc() {
        HandlerThread handlerThread = new HandlerThread("upload-anr-thread");
        handlerThread.setUncaughtExceptionHandler(new C0050abc());
        handlerThread.start();
        this.abc = new Handler(handlerThread.getLooper());
    }

    public static i cde() {
        return cde;
    }

    public static abc def() {
        return bcd.abc;
    }

    public final void abc(Context context) {
        if (this.abc.post(new cde(context))) {
            return;
        }
        bcd.warn("enqueue upload ANR task failed.");
    }

    public static void abc(File file) {
        if (file.delete()) {
            return;
        }
        bcd.info("delete anr file failed.");
    }
}
