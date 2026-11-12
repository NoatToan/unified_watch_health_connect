package com.xiaomi.miot.centralclientsdk;

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.SecureRandom;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f13597a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f13598b = null;
    public static e c = null;
    public static boolean d = false;
    public static b e;

    /* JADX INFO: renamed from: com.xiaomi.miot.centralclientsdk.a$a, reason: collision with other inner class name */
    public class C0826a implements e.a {
    }

    public interface b extends CentralClient.c {
    }

    public static void a(String str, String str2, CentralClient.b bVar, Object obj, int i) throws Exception {
        CentralClient.b(str, str2, bVar, obj, i);
    }

    public static void b(String str) {
        f13598b = str;
        e eVar = c;
        if (eVar != null) {
            eVar.b(f13597a, str);
        }
    }

    public static void c(String str, CentralClient.a aVar, Object obj) throws Exception {
        CentralClient.d(str, aVar, obj);
    }

    public static void d(String str) {
        e eVar = c;
        if (eVar != null) {
            eVar.d(str);
        }
    }

    public static void e(Context context, String str, String str2, String str3, b bVar) throws Exception {
        if (d) {
            throw new Exception("Direct restart is not allowed");
        }
        f13597a = str;
        f13598b = str2;
        e = bVar;
        String unsignedString = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str3 + "/central_client_pseudo_did"));
            String line = bufferedReader.readLine();
            bufferedReader.close();
            String[] strArrSplit = line.split(",");
            if (strArrSplit.length == 2 && Objects.equals(strArrSplit[0], strArrSplit[1])) {
                unsignedString = strArrSplit[0];
            }
        } catch (Exception unused) {
        }
        if (unsignedString == null || unsignedString.length() == 0) {
            unsignedString = Long.toUnsignedString(new SecureRandom().nextLong());
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str3 + "/central_client_pseudo_did"));
            bufferedWriter.write(unsignedString + "," + unsignedString);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        String str4 = unsignedString;
        e eVar = new e(new C0826a());
        c = eVar;
        CentralClient.e(context, eVar, str4, 1, str3, bVar);
        d = true;
    }

    public static void f() {
        CentralClient.f();
        d = false;
    }
}
