package com.xiaomi.ai.domain.phonecall.util;

import defpackage.t08;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class ABTestConfigLoader {
    private static final String PHONECALL_ABTEST_FILE = "phonecall-abtest.conf";
    private static ABTestConfigLoader abTestConfigLoader;
    private ABTestConfig testConfig = new ABTestConfig();

    private ABTestConfigLoader() throws Exception {
        InputStream inputStreamA = t08.a(PHONECALL_ABTEST_FILE);
        try {
            this.testConfig.load(inputStreamA);
            if (inputStreamA != null) {
                inputStreamA.close();
            }
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ABTestConfigLoader getInstance() throws Exception {
        if (abTestConfigLoader == null) {
            synchronized (ABTestConfigLoader.class) {
                try {
                    if (abTestConfigLoader == null) {
                        abTestConfigLoader = new ABTestConfigLoader();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return abTestConfigLoader;
    }

    public ABTestConfig getTestConfig() {
        return this.testConfig;
    }
}
