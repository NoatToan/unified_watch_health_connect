package defpackage;

import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;
import org.apache.commons.compress.archivers.zip.ZipShort;

/* JADX INFO: loaded from: classes3.dex */
public class ipr extends PKWareExtraHeader {
    public ipr() {
        super(new ZipShort(20));
    }
}
