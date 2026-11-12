package com.huawei.agconnect.apms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public final class zab implements Runnable {
    public final /* synthetic */ zyx abc;

    public zab(zyx zyxVar) {
        this.abc = zyxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yxw yxwVar;
        long j;
        long j2;
        long j3;
        long j4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zyx zyxVar = this.abc;
        zyxVar.getClass();
        yxw yxwVar2 = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(zyxVar.def));
            try {
                String line = bufferedReader.readLine();
                if (line == null || line.length() == 0) {
                    yxwVar = null;
                } else {
                    String[] strArrSplit = line.split(" ");
                    if (16 < strArrSplit.length) {
                        j = Long.parseLong(strArrSplit[13]);
                        j3 = Long.parseLong(strArrSplit[15]);
                        j4 = Long.parseLong(strArrSplit[14]);
                        j2 = Long.parseLong(strArrSplit[16]);
                    } else {
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                        j4 = 0;
                    }
                    double d = (j + j3) / zyxVar.efg;
                    double d2 = zyx.hij;
                    yxwVar = new yxw(jCurrentTimeMillis, Math.round(d * d2), Math.round(((j4 + j2) / zyxVar.efg) * d2));
                }
                bufferedReader.close();
                yxwVar2 = yxwVar;
            } catch (Throwable th) {
                try {
                    zyx.ghi.warn(String.format(Locale.ENGLISH, "unable to read 'proc/[pid]/stat' file: %s", th.getMessage()));
                    bufferedReader.close();
                } catch (Throwable th2) {
                    bufferedReader.close();
                    throw th2;
                }
            }
        } catch (IOException e) {
            zyx.ghi.warn(String.format(Locale.ENGLISH, "unable to read 'proc/[pid]/stat' file:  %s", e.getMessage()));
        } catch (Throwable th3) {
            zyx.ghi.warn(String.format(Locale.ENGLISH, "unexpected '/proc/[pid]/stat' file format encountered: %s", th3.getMessage()));
        }
        if (yxwVar2 != null) {
            this.abc.fgh.offer(yxwVar2);
        }
    }
}
