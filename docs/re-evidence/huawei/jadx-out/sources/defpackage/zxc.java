package defpackage;

import org.eclipse.californium.core.network.stack.CongestionControlLayer;
import org.eclipse.californium.core.network.stack.RemoteEndpoint;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public class zxc extends CongestionControlLayer {
    public zxc(String str, Configuration configuration) {
        super(str, configuration);
    }

    @Override // org.eclipse.californium.core.network.stack.CongestionControlLayer
    public RemoteEndpoint createRemoteEndpoint(Object obj) {
        return new RemoteEndpoint(obj, this.defaultReliabilityLayerParameters.c(), this.defaultReliabilityLayerParameters.f(), false) { // from class: zxc.3
            @Override // org.eclipse.californium.core.network.stack.RemoteEndpoint
            public void processRttMeasurement(RemoteEndpoint.RtoType rtoType, long j) {
                updateRTO(j + (j / 2));
            }
        };
    }
}
