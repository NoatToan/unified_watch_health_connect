package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class dio implements pzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f15571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f15572b;

    public dio(Context context) {
        this.f15571a = context.getSharedPreferences("resource_manager", 0);
        File dir = context.getDir("resource_updated", 0);
        this.f15572b = dir;
        if (dir.exists()) {
            return;
        }
        this.f15572b.mkdirs();
    }

    @Override // defpackage.pzc
    public String a(String str) {
        String string = this.f15571a.getString(str, "");
        vpe.a("StorageProviderImp", "get value: " + str + " value:" + string);
        return string;
    }

    @Override // defpackage.pzc
    public File b(String str) {
        if (!this.f15572b.exists()) {
            this.f15572b.mkdirs();
        }
        if (this.f15572b.isFile()) {
            vpe.d("StorageProviderImp", "删除重名文件 resource_updated");
            this.f15572b.deleteOnExit();
            this.f15572b.mkdirs();
        }
        File file = new File(this.f15572b, str);
        vpe.a("StorageProviderImp", "getFile: " + file);
        return file;
    }

    @Override // defpackage.pzc
    public void c(String str, String str2) {
        vpe.a("StorageProviderImp", "Save key: " + str + " value:" + str2);
        SharedPreferences.Editor editorEdit = this.f15571a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
