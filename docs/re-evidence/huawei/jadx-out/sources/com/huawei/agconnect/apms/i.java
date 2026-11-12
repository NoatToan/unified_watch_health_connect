package com.huawei.agconnect.apms;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.anr.model.AnrFileBody;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static abc bcd = new abc();

    public final class abc implements Comparator<File> {
        @Override // java.util.Comparator
        public final int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified == 0) {
                return 0;
            }
            return jLastModified > 0 ? 1 : -1;
        }
    }

    public final void abc(Context context, AnrFileBody anrFileBody) {
        Throwable th;
        if (TextUtils.isEmpty(".APMAnr")) {
            abc.error("please set dir name.");
            return;
        }
        AgentLog agentLog = abc;
        agentLog.debug("start save file.");
        File file = new File(context.getFilesDir(), ".APMAnr");
        BufferedWriter bufferedWriter = null;
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            agentLog.error("create dir failed.");
            file = null;
        }
        if (file == null) {
            agentLog.error("not found dir.");
            return;
        }
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(new File(file, UUID.randomUUID().toString())));
                try {
                    bufferedWriter2.write(anrFileBody.toJsonString());
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    try {
                        abc.error("write file error: " + th.toString());
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                    } catch (Throwable th3) {
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable th4) {
                                AgentLog agentLog2 = abc;
                                StringBuilder sbAbc = com.huawei.agconnect.apms.abc.abc("close file failed: ");
                                sbAbc.append(th4.toString());
                                agentLog2.error(sbAbc.toString());
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            AgentLog agentLog3 = abc;
            StringBuilder sbAbc2 = com.huawei.agconnect.apms.abc.abc("close file failed: ");
            sbAbc2.append(th6.toString());
            agentLog3.error(sbAbc2.toString());
        }
    }

    public final List abc(Context context, boolean z) {
        if (TextUtils.isEmpty(".APMAnr")) {
            abc.debug("please set dir name.");
            return new ArrayList(0);
        }
        File file = new File(context.getFilesDir(), ".APMAnr");
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            abc.error("create dir failed.");
            file = null;
        }
        if (file == null) {
            return new ArrayList(0);
        }
        File[] fileArrListFiles = file.listFiles();
        if (z && fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, bcd);
        }
        return fileArrListFiles == null ? Collections.EMPTY_LIST : Arrays.asList(fileArrListFiles);
    }
}
