package defpackage;

import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.AbstractFileHeader;

/* JADX INFO: loaded from: classes20.dex */
public class zpz extends AbstractFileHeader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54461c;

    public zpz() {
        setSignature(HeaderSignature.LOCAL_FILE_HEADER);
    }

    public boolean e() {
        return this.f54461c;
    }

    public void d(boolean z) {
        this.f54461c = z;
    }
}
