package com.xmlywind.sdk.base.services;

/* JADX INFO: loaded from: classes22.dex */
public class j {
    private static a a;
    private static a b;
    private static a c;
    private static a d;

    public interface a {
        boolean b();

        void c();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static a a(String str) {
        byte b2;
        a eVar;
        synchronized (j.class) {
            switch (str.hashCode()) {
                case -967662845:
                    if (!str.equals("WifiScanService")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 353926395:
                    if (!str.equals("AppInstallService")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 854806816:
                    if (!str.equals("LocationService")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 1382229229:
                    if (!str.equals("DownloadService")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                eVar = a;
                if (eVar == null) {
                    eVar = new e();
                    a = eVar;
                }
            } else if (b2 == 1) {
                eVar = b;
                if (eVar == null) {
                    eVar = new b();
                    b = eVar;
                }
            } else if (b2 == 2) {
                eVar = c;
                if (eVar == null) {
                    eVar = new l();
                    c = eVar;
                }
            } else if (b2 != 3) {
                eVar = null;
            } else {
                eVar = d;
                if (eVar == null) {
                    eVar = new d();
                    d = eVar;
                }
            }
        }
        return eVar;
    }

    public static void a(String str, boolean z) {
        a aVar;
        str.hashCode();
        switch (str) {
            case "WifiScanService":
                if (!z) {
                    aVar = c;
                    if (aVar == null) {
                    }
                    aVar.c();
                    break;
                }
                a(str).b();
                break;
            case "AppInstallService":
                if (!z) {
                    aVar = b;
                    if (aVar == null) {
                    }
                    aVar.c();
                    break;
                }
                a(str).b();
                break;
            case "LocationService":
                if (z) {
                    a(str).b();
                } else {
                    a aVar2 = a;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                com.xmlywind.sdk.common.a.n().b(z);
                break;
            case "DownloadService":
                if (!z) {
                    aVar = d;
                    if (aVar == null) {
                    }
                    aVar.c();
                    break;
                }
                a(str).b();
                break;
        }
    }
}
