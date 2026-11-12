package com.amazon.identity.auth.device.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class ThirdPartyResourceParser {
    private static final String API_KEY_FILE = "api_key.txt";
    public static final String KEY_API_KEY = "APIKey";
    public static final String KEY_API_KEY_OLD = "AmazonAPIKey";
    private static final String LOG_TAG = "com.amazon.identity.auth.device.utils.ThirdPartyResourceParser";
    public static final String UTF8_BYTE_ORDER_MARK = "\ufeff";
    private static final String UTF_8 = "UTF-8";
    private final String _apiKey = parseApiKey();
    private final Context _context;
    private final String _packageName;

    public ThirdPartyResourceParser(Context context, String str) {
        this._packageName = str;
        this._context = context;
    }

    private String getStringValueFromMetaData(String str) {
        if (this._context == null) {
            return null;
        }
        MAPLog.i(LOG_TAG, "Attempting to parse API Key from meta data in Android manifest");
        try {
            Bundle bundle = this._context.getPackageManager().getApplicationInfo(this._packageName, 128).metaData;
            if (bundle != null) {
                return bundle.getString(str);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            MAPLog.w(LOG_TAG, "(key=" + str + ") " + e.getMessage());
            return null;
        }
    }

    private String parseApiKey() throws Throwable {
        InputStream inputStreamOpen;
        Context context = this._context;
        try {
            if (context != null) {
                try {
                    inputStreamOpen = context.getPackageManager().getResourcesForApplication(getPackageName()).getAssets().open(getApiKeyFile());
                    try {
                        MAPLog.i(LOG_TAG, "Attempting to parse API Key from assets directory");
                        String string = readString(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return string;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamOpen = null;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            MAPLog.i(LOG_TAG, "Unable to get api key asset document: " + e.getMessage());
        } catch (IOException e2) {
            MAPLog.i(LOG_TAG, "Unable to get api key asset document: " + e2.getMessage());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[SYNTHETIC] */
    public static String readString(InputStream inputStream) throws Throwable {
        InputStreamReader inputStreamReader;
        Throwable th;
        InputStreamReader inputStreamReader2 = null;
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null && line.startsWith(UTF8_BYTE_ORDER_MARK)) {
                        line = line.substring(1);
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e) {
                        MAPLog.w(LOG_TAG, "Unable to close InputStreamReader: " + e.getMessage());
                    }
                    try {
                        bufferedReader.close();
                        return line;
                    } catch (IOException e2) {
                        MAPLog.w(LOG_TAG, "Unable to close BufferedReader: " + e2.getMessage());
                        return line;
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStreamReader2 = inputStreamReader;
                    try {
                        MAPLog.i(LOG_TAG, "Unable read from asset: " + e.getMessage());
                        if (inputStreamReader2 != null) {
                            try {
                                inputStreamReader2.close();
                            } catch (IOException e4) {
                                MAPLog.w(LOG_TAG, "Unable to close InputStreamReader: " + e4.getMessage());
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e5) {
                                MAPLog.w(LOG_TAG, "Unable to close BufferedReader: " + e5.getMessage());
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        inputStreamReader = inputStreamReader2;
                        th = th2;
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e6) {
                                MAPLog.w(LOG_TAG, "Unable to close InputStreamReader: " + e6.getMessage());
                            }
                        }
                        if (bufferedReader != null) {
                            throw th;
                        }
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (IOException e7) {
                            MAPLog.w(LOG_TAG, "Unable to close BufferedReader: " + e7.getMessage());
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (bufferedReader != null) {
                        throw th;
                    }
                    bufferedReader.close();
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                inputStreamReader2 = inputStreamReader;
                MAPLog.i(LOG_TAG, "Unable read from asset: " + e.getMessage());
                if (inputStreamReader2 != null) {
                    inputStreamReader2.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (Throwable th5) {
            inputStreamReader = null;
            th = th5;
            bufferedReader = null;
        }
    }

    public String getApiKey() {
        if (isApiKeyInAssest()) {
            return this._apiKey;
        }
        MAPLog.w(LOG_TAG, "Unable to get API Key from Assests");
        String stringValueFromMetaData = getStringValueFromMetaData(KEY_API_KEY);
        return stringValueFromMetaData != null ? stringValueFromMetaData : getStringValueFromMetaData(KEY_API_KEY_OLD);
    }

    public String getApiKeyFile() {
        return API_KEY_FILE;
    }

    public String getPackageName() {
        return this._packageName;
    }

    public boolean isApiKeyInAssest() {
        return this._apiKey != null;
    }
}
