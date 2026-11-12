package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class lps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f25308a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: ips
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return lps.f25308a.matcher(str).matches();
            }
        });
        if (fileArrListFiles != null) {
            File[] fileArr2 = new File[fileArrListFiles.length];
            int i = 0;
            while (true) {
                int length = fileArrListFiles.length;
                if (i >= length) {
                    fileArr = fileArr2;
                    break;
                }
                File file3 = fileArrListFiles[i];
                int i2 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i2 > length || fileArr2[i2] != null) {
                    throw new ugs("Metadata folder ordering corrupt.");
                }
                fileArr2[i2] = file3;
                i++;
            }
        } else {
            fileArr = new File[0];
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    ups upsVarB = new pds(fileInputStream).b();
                    if (upsVarB.c() == null) {
                        throw new ugs("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, upsVarB.c());
                    if (!file5.exists()) {
                        throw new ugs(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
