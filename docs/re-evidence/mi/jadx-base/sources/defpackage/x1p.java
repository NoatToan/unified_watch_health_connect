package defpackage;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* JADX INFO: loaded from: classes3.dex */
public class x1p extends rio {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f38587b;

    public x1p() throws IOException {
        File fileCreateTempFile = File.createTempFile("commons-compress", "packtemp");
        this.f38587b = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        ((FilterOutputStream) this).out = Files.newOutputStream(fileCreateTempFile.toPath(), new OpenOption[0]);
    }
}
