package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.domain.phonecall.contact.ContactData;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes7.dex */
public class YellowPageDataLoader {
    private static final String YELLOW_PAGE_FILE = "yellow-pages.dat";
    private static YellowPageDataLoader yellowPageDataLoader;
    private ContactData yellowPageData = new ContactData();

    /* JADX WARN: Code duplicated, block: B:36:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private YellowPageDataLoader() throws IOException {
        InputStream inputStreamA = t08.a(YELLOW_PAGE_FILE);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA));
            try {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!line.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) && !line.isEmpty()) {
                        if (i != 0) {
                            sb.append("@@@");
                        }
                        sb.append(line);
                        i++;
                    }
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    throw th;
                }
                this.yellowPageData.initContactsFromLabelPtStr(sb.toString(), false);
                bufferedReader.close();
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            throw th4;
        }
    }

    public static YellowPageDataLoader getInstantce() throws IOException {
        if (yellowPageDataLoader == null) {
            synchronized (YellowPageDataLoader.class) {
                try {
                    if (yellowPageDataLoader == null) {
                        yellowPageDataLoader = new YellowPageDataLoader();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return yellowPageDataLoader;
    }

    public ContactData getYellowPageData() {
        return this.yellowPageData;
    }
}
