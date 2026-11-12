package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class acj extends z07 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f880b;

    public acj(z07 z07Var, File file) {
        super(z07Var);
        this.f880b = file;
    }

    public static boolean n(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zN = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zN &= n(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete ");
                    sb.append(file2);
                    zN = false;
                }
            }
        }
        return zN;
    }

    public static String o(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // defpackage.z07
    public z07 a(String str) {
        File file = new File(this.f880b, str);
        if (file.isDirectory() || file.mkdir()) {
            return new acj(this, file);
        }
        return null;
    }

    @Override // defpackage.z07
    public z07 b(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f880b, str2);
        try {
            file.createNewFile();
            return new acj(this, file);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to createFile: ");
            sb.append(e);
            return null;
        }
    }

    @Override // defpackage.z07
    public boolean c() {
        n(this.f880b);
        return this.f880b.delete();
    }

    @Override // defpackage.z07
    public boolean d() {
        return this.f880b.exists();
    }

    @Override // defpackage.z07
    public String i() {
        return this.f880b.getName();
    }

    @Override // defpackage.z07
    public String j() {
        if (this.f880b.isDirectory()) {
            return null;
        }
        return o(this.f880b.getName());
    }

    @Override // defpackage.z07
    public Uri k() {
        return Uri.fromFile(this.f880b);
    }

    @Override // defpackage.z07
    public boolean l() {
        return this.f880b.isDirectory();
    }

    @Override // defpackage.z07
    public z07[] m() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f880b.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new acj(this, file));
            }
        }
        return (z07[]) arrayList.toArray(new z07[arrayList.size()]);
    }
}
