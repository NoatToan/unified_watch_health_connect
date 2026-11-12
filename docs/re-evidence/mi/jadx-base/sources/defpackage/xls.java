package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class xls {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pbt f39250b = new pbt("MergeSliceTaskHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f39251a;

    public xls(tbs tbsVar) {
        this.f39251a = tbsVar;
    }

    public static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new ugs("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new ugs("Unable to move file: ".concat(String.valueOf(file)));
            }
            return;
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new ugs("Unable to delete directory: ".concat(String.valueOf(file)));
        }
    }

    public final void a(uls ulsVar) {
        File fileC = this.f39251a.C(ulsVar.f26969b, ulsVar.c, ulsVar.d, ulsVar.e);
        if (!fileC.exists()) {
            throw new ugs(String.format("Cannot find verified files for slice %s.", ulsVar.e), ulsVar.f26968a);
        }
        File fileV = this.f39251a.v(ulsVar.f26969b, ulsVar.c, ulsVar.d);
        if (!fileV.exists()) {
            fileV.mkdirs();
        }
        b(fileC, fileV);
        try {
            this.f39251a.a(ulsVar.f26969b, ulsVar.c, ulsVar.d, this.f39251a.p(ulsVar.f26969b, ulsVar.c, ulsVar.d) + 1);
        } catch (IOException e) {
            f39250b.b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new ugs("Writing merge checkpoint failed.", e, ulsVar.f26968a);
        }
    }
}
