package defpackage;

import org.eclipse.californium.core.network.Outbox;
import org.eclipse.californium.core.network.stack.BaseCoapStack;
import org.eclipse.californium.core.network.stack.CongestionControlLayer;
import org.eclipse.californium.core.network.stack.Layer;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public class zws extends BaseCoapStack {
    public zws(String str, Configuration configuration, EndpointContextMatcher endpointContextMatcher, Outbox outbox) {
        super(outbox);
        setLayers(new Layer[]{new zww(configuration), new zwy(configuration), new zwr(str, false, configuration, endpointContextMatcher), CongestionControlLayer.newImplementation(str, configuration)});
    }
}
