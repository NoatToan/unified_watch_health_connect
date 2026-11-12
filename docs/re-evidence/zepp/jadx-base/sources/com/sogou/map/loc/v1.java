package com.sogou.map.loc;

import android.os.Environment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpEntity;

/* JADX INFO: loaded from: classes18.dex */
class v1 implements l1 {
    public final /* synthetic */ b0 a;

    public v1(b0 b0Var) {
        this.a = b0Var;
    }

    public static o0 b(String str, HttpEntity httpEntity) {
        n0 n0Var = f0.b;
        if (n0Var == null) {
            return null;
        }
        return n0Var.a(str, httpEntity);
    }

    public static String c(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.equals(null)) {
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                if (i2 > 8) {
                    i2 %= 9;
                }
                int iCodePointAt = str.codePointAt(i) + "SogouMap_".codePointAt(i2);
                if (iCodePointAt > 65535) {
                    iCodePointAt %= 65535;
                }
                sb.append((char) iCodePointAt);
                i++;
                i2++;
            }
        }
        return sb.toString();
    }

    public static String d(byte[] bArr, int i, int i2) {
        try {
            i0 i0Var = new i0(null);
            int i3 = (i2 / 3) << 2;
            int i4 = i2 % 3;
            if (i4 == 1) {
                i3 += 2;
            } else if (i4 == 2) {
                i3 += 3;
            }
            i0Var.a = new byte[i3];
            i0Var.a(bArr, 0, i2);
            return new String(i0Var.a, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static /* synthetic */ void e(SGLocClient sGLocClient, String str, String str2) {
        if (str == null || !str.trim().equals("go2map-coordinate")) {
            return;
        }
        d dVar = d.SG;
        if ("latlon".equalsIgnoreCase(str2)) {
            dVar = d.LL;
        } else if ("gcj-02".equalsIgnoreCase(str2)) {
            dVar = d.GCJ02;
        }
        sGLocClient.c = dVar;
    }

    private static boolean f() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static synchronized boolean g(File file) {
        if (f()) {
            try {
                if (file.exists() && file.isFile()) {
                    return file.delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static synchronized boolean h(File file, String... strArr) {
        if (strArr.length == 0) {
            return true;
        }
        if (f()) {
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    if (!file.exists()) {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    }
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
                    try {
                        for (String str : strArr) {
                            bufferedWriter2.write(str);
                            bufferedWriter2.write(10);
                        }
                        bufferedWriter2.flush();
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        th.printStackTrace();
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        }
                        return false;
                    }
                } catch (Throwable th2) {
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (Exception e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return false;
    }

    public static String i(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.equals("SogouMap_")) {
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                if (i2 > 8) {
                    i2 %= 9;
                }
                int iCodePointAt = (str.codePointAt(i) + 65535) - "SogouMap_".codePointAt(i2);
                if (iCodePointAt > 65535) {
                    iCodePointAt %= 65535;
                }
                sb.append((char) iCodePointAt);
                i++;
                i2++;
            }
        }
        return sb.toString();
    }

    public static synchronized List j(File file) {
        if (f()) {
            try {
                if (file.exists() && file.isFile()) {
                    ArrayList arrayList = new ArrayList();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            return arrayList;
                        }
                        arrayList.add(line);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static synchronized List k(File file) {
        if (f()) {
            try {
                if (file.exists() && file.isDirectory()) {
                    return Arrays.asList(file.listFiles());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.sogou.map.loc.l1
    public final void a(y0 y0Var) {
        this.a.a(new w1(this, y0Var));
    }
}
