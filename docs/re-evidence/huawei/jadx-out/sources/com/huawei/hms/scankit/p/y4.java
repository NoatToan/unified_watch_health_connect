package com.huawei.hms.scankit.p;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes34.dex */
public abstract class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f16435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f16436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f16437c;

    public static byte[] a() {
        return f16436b;
    }

    public static byte[] b() {
        return f16437c;
    }

    public static void c(Context context, String str) {
        o4.d("MsModel", "load model...." + str);
        if (f16435a != null) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    o4.d("MsModel", "inputStream" + inputStreamOpen);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    f16435a = bArr;
                    inputStreamOpen.close();
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                            o4.b("MsModel", "loadModel inputStream.close() IOException");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                o4.b("MsModel", "loadModel IOException");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Exception unused3) {
                o4.b("MsModel", "loadModel Exception");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (IOException unused4) {
            o4.b("MsModel", "loadModel inputStream.close() IOException");
        }
    }

    public static void a(Context context, String str) {
        o4.d("MsModel", "load angle model...." + str);
        if (f16436b != null) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    o4.d("MsModel", "3inputStream" + inputStreamOpen);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    f16436b = bArr;
                    inputStreamOpen.close();
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                            o4.b("MsModel", "loadAngleModel inputStream.close() IOException");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                o4.b("MsModel", "loadAngleModel IOException");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Exception unused3) {
                o4.b("MsModel", "loadAngleModel Exception");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (IOException unused4) {
            o4.b("MsModel", "loadAngleModel inputStream.close() IOException");
        }
    }

    public static void b(Context context, String str) {
        o4.d("MsModel", "load corner model...." + str);
        if (f16437c != null) {
            return;
        }
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    o4.d("MsModel", "4inputStream" + inputStreamOpen);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    f16437c = bArr;
                    inputStreamOpen.close();
                } catch (Throwable th) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                            o4.b("MsModel", "loadConerModel inputStream.close() IOException");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                o4.b("MsModel", "loadConerModel IOException");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Exception unused3) {
                o4.b("MsModel", "loadConerModel Exception");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
        } catch (IOException unused4) {
            o4.b("MsModel", "loadConerModel inputStream.close() IOException");
        }
    }

    public static byte[] c() {
        return f16435a;
    }
}
