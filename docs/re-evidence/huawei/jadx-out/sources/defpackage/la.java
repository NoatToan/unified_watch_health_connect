package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class la implements FileFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ky f39695b;

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }

    public la(ky kyVar) {
        this.f39695b = kyVar;
    }
}
