package com.huawei.health.manager.migration;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPerferenceUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MigrationAtheneTwoToAtheneThree implements InterfaceMigration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<FileDeleteList> f8097b = new ArrayList(5);

    static class FileDeleteList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String[] f8098a;
        File d;

        FileDeleteList(File file, String[] strArr) {
            this.d = file;
            this.f8098a = strArr;
        }
    }

    public MigrationAtheneTwoToAtheneThree() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(File.separator);
        sb.append("sdcard");
        sb.append(File.separator);
        sb.append("huawei");
        sb.append(File.separator);
        sb.append("com.huawei.health");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append(string);
        sb2.append(File.separator);
        sb2.append("com.huawei.health");
        String string2 = sb2.toString();
        this.f8097b.add(new FileDeleteList(new File(string2), new String[]{"log.0", "log.1", "log.2", "log.3", "log.4"}));
        StringBuilder sb3 = new StringBuilder(16);
        sb3.append(string);
        sb3.append(File.separator);
        sb3.append("com.huawei.health_DaemonService");
        String string3 = sb3.toString();
        this.f8097b.add(new FileDeleteList(new File(string3), new String[]{"log.0", "log.1", "log.2", "log.3", "log.4"}));
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(string);
        sb4.append(File.separator);
        sb4.append("com.huawei.health_leakcanary");
        String string4 = sb4.toString();
        this.f8097b.add(new FileDeleteList(new File(string4), new String[]{"log.0", "log.1", "log.2", "log.3", "log.4"}));
        StringBuilder sb5 = new StringBuilder(16);
        sb5.append(string);
        sb5.append(File.separator);
        sb5.append("com.huawei.health_pushservice");
        String string5 = sb5.toString();
        this.f8097b.add(new FileDeleteList(new File(string5), new String[]{"log.0", "log.1", "log.2", "log.3", "log.4"}));
        this.f8097b.add(new FileDeleteList(new File(string), new String[]{"huawei_crashLog_0.txt", "huawei_crashLog_1.txt", "huawei_crashLog_2.txt", "leak.txt"}));
    }

    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public boolean filter(String str) {
        return "Athene2".equals(str);
    }

    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public void migration(Context context) {
        if (context == null) {
            LogUtil.a("Step_MigrationAtheneTwoToAtheneThree", "context is null");
        } else {
            SharedPerferenceUtils.c(context, "Athene3");
        }
    }

    public static void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.manager.migration.MigrationAtheneTwoToAtheneThree.1
            @Override // java.lang.Runnable
            public void run() {
                if (new File(File.separator + "sdcard" + File.separator + "huawei" + File.separator + "com.huawei.health").exists()) {
                    new MigrationAtheneTwoToAtheneThree().d();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<FileDeleteList> it = this.f8097b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    private void b(FileDeleteList fileDeleteList) {
        if (fileDeleteList == null || fileDeleteList.d == null) {
            return;
        }
        LogUtil.d("Step_MigrationAtheneTwoToAtheneThree", "check file");
        if (fileDeleteList.d.exists()) {
            LogUtil.d("Step_MigrationAtheneTwoToAtheneThree", "file exist");
            for (int i = 0; i < fileDeleteList.f8098a.length; i++) {
                File file = new File(fileDeleteList.d + File.separator + fileDeleteList.f8098a[i]);
                if (file.exists() && !file.delete()) {
                    LogUtil.j("Step_MigrationAtheneTwoToAtheneThree", "item delete failed");
                }
            }
            String[] list = fileDeleteList.d.list();
            if (list == null) {
                LogUtil.j("Step_MigrationAtheneTwoToAtheneThree", "fileDeleteList.mDirectory.list ret null");
                return;
            }
            for (String str : list) {
                LogUtil.j("Step_MigrationAtheneTwoToAtheneThree", "exist:", str);
            }
            if (list.length != 0 || fileDeleteList.d.delete()) {
                return;
            }
            LogUtil.j("Step_MigrationAtheneTwoToAtheneThree", "file delete failed");
        }
    }
}
