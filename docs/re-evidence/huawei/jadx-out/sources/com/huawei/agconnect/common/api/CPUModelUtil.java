package com.huawei.agconnect.common.api;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public class CPUModelUtil {
    private static final String FILE_KEY = "Hardware";
    private static final String FILE_PATH = "/proc/cpuinfo";
    private static final String SPLIT_KEY = ":";
    private static final String TAG = "CPUModelUtil";

    public static String getCpuModel() throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb;
        BufferedReader bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        BufferedReader bufferedReader4 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                bufferedReader.close();
                                bufferedReader2 = line;
                                break;
                            } catch (IOException e) {
                                e = e;
                                sb = new StringBuilder("close cpuinfo io error :");
                                sb.append(e.getMessage());
                                Logger.e(TAG, sb.toString());
                                return "";
                            }
                        }
                        if (line.contains(FILE_KEY) && line.split(":").length > 1 && line.split(":")[1] != null) {
                            String strTrim = line.split(":")[1].trim();
                            try {
                                bufferedReader.close();
                                return strTrim;
                            } catch (IOException e2) {
                                Logger.e(TAG, "close cpuinfo io error :" + e2.getMessage());
                                return strTrim;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        bufferedReader3 = bufferedReader;
                        Logger.e(TAG, "can not find cpuinfo file");
                        bufferedReader2 = bufferedReader3;
                        if (bufferedReader3 != null) {
                            try {
                                bufferedReader3.close();
                                bufferedReader2 = bufferedReader3;
                            } catch (IOException e3) {
                                e = e3;
                                sb = new StringBuilder("close cpuinfo io error :");
                                sb.append(e.getMessage());
                                Logger.e(TAG, sb.toString());
                                return "";
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader4 = bufferedReader;
                        Logger.e(TAG, "read cpuinfo file error :" + e.getMessage());
                        bufferedReader2 = bufferedReader4;
                        if (bufferedReader4 != null) {
                            try {
                                bufferedReader4.close();
                                bufferedReader2 = bufferedReader4;
                            } catch (IOException e5) {
                                e = e5;
                                sb = new StringBuilder("close cpuinfo io error :");
                                sb.append(e.getMessage());
                                Logger.e(TAG, sb.toString());
                                return "";
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e6) {
                                Logger.e(TAG, "close cpuinfo io error :" + e6.getMessage());
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e7) {
            e = e7;
        }
        return "";
    }
}
