package com.miuipub.internal.hybrid;

import android.content.Context;
import io.netty.util.internal.StringUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public class SecurityManager {
    private static final String KEY_FILE_NAME = "mipay_sdk_hybrid_key.pem";
    private static String sPublicKey;
    private Config mConfig;
    private long mExpiredTime;
    private String mSign;
    private Boolean mValidSignature;

    public SecurityManager(Config config, Context context) {
        this.mConfig = config;
        if (config != null && config.getSecurity() != null) {
            this.mExpiredTime = config.getSecurity().getTimestamp();
            this.mSign = config.getSecurity().getSignature();
        }
        if (sPublicKey == null) {
            sPublicKey = getPublicKey(context);
        }
    }

    private File getHybridBaseFolder(Context context) {
        return context.getFilesDir();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.InputStream] */
    private String getPublicKey(Context context) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            try {
                context = context.getResources().getAssets().open("keys/mipay_sdk_hybrid_key.pem");
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(context));
                    try {
                        String publicKey = readPublicKey(bufferedReader);
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (context != 0) {
                            try {
                                context.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return publicKey;
                    } catch (IOException unused) {
                        throw new IllegalStateException("cannot read hybrid key.");
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (context == 0) {
                            throw th;
                        }
                        try {
                            context.close();
                            throw th;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (IOException unused3) {
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            context = 0;
        }
    }

    private String readPublicKey(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.substring(0, sb.length() - 1);
            }
            if (!"".equals(line.trim()) && !line.startsWith("-----")) {
                sb.append(line);
                sb.append(StringUtil.CARRIAGE_RETURN);
            }
        }
    }

    public boolean isExpired() {
        long j = this.mExpiredTime;
        return 0 < j && j < System.currentTimeMillis();
    }

    public boolean isValidSignature() {
        if (this.mValidSignature == null) {
            try {
                this.mValidSignature = Boolean.valueOf(isValidSignature(ConfigUtils.getRawConfig(this.mConfig), this.mSign));
            } catch (Exception unused) {
                this.mValidSignature = Boolean.FALSE;
            }
        }
        return this.mValidSignature.booleanValue();
    }

    private boolean isValidSignature(String str, String str2) throws Exception {
        return str2 != null && SignUtils.verify(str, SignUtils.getPublicKey(sPublicKey), str2);
    }
}
