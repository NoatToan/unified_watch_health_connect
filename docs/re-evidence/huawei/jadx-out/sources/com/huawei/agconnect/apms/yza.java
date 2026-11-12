package com.huawei.agconnect.apms;

import android.os.Environment;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class yza {
    public static final AgentLog bcd = AgentLogManager.getAgentLog();
    public static yza cde;
    public final Properties abc;

    public yza() throws IOException {
        Properties properties = new Properties();
        this.abc = properties;
        FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        try {
            properties.load(fileInputStream);
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                AgentLog agentLog = bcd;
                StringBuilder sbAbc = abc.abc("failed to close build prop file: ");
                sbAbc.append(e.getMessage());
                agentLog.warn(sbAbc.toString());
            }
        }
    }
}
