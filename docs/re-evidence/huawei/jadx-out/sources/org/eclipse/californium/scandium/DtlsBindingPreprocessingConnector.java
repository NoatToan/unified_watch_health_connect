package org.eclipse.californium.scandium;

import defpackage.aaae;
import defpackage.aabr;
import java.net.InetSocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class DtlsBindingPreprocessingConnector extends DTLSConnector {
    private static final DtlsBindingActionWithCallback f = new DtlsBindingActionWithCallback() { // from class: org.eclipse.californium.scandium.DtlsBindingPreprocessingConnector.5
        @Override // org.eclipse.californium.scandium.DtlsBindingPreprocessingConnector.DtlsBindingActionWithCallback
        public void run(aaae aaaeVar, InetSocketAddress inetSocketAddress, Runnable runnable) {
            runnable.run();
        }
    };
    private DtlsBindingActionWithCallback j;

    public interface DtlsBindingActionWithCallback {
        void run(aaae aaaeVar, InetSocketAddress inetSocketAddress, Runnable runnable);
    }

    @Override // org.eclipse.californium.scandium.DTLSConnector
    protected void e(final List<aabr> list, final InetSocketAddress inetSocketAddress, final InetSocketAddress inetSocketAddress2) {
        this.j.run(list.get(0).a(), inetSocketAddress, new Runnable() { // from class: org.eclipse.californium.scandium.DtlsBindingPreprocessingConnector.2
            @Override // java.lang.Runnable
            public void run() {
                DtlsBindingPreprocessingConnector.this.b((List<aabr>) list, inetSocketAddress, inetSocketAddress2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<aabr> list, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        super.e(list, inetSocketAddress, inetSocketAddress2);
    }
}
