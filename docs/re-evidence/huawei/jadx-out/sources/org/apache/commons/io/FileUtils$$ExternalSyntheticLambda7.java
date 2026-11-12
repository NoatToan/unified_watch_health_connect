package org.apache.commons.io;

import java.net.URL;
import org.apache.commons.io.function.IOSupplier;

/* JADX INFO: loaded from: classes46.dex */
public final /* synthetic */ class FileUtils$$ExternalSyntheticLambda7 implements IOSupplier {
    public final /* synthetic */ URL f$0;

    public /* synthetic */ FileUtils$$ExternalSyntheticLambda7(URL url) {
        this.f$0 = url;
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public final Object get() {
        return this.f$0.openStream();
    }
}
