package defpackage;

import org.eclipse.californium.core.network.Outbox;
import org.eclipse.californium.core.network.stack.BaseCoapStack;
import org.eclipse.californium.core.network.stack.Layer;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public class zwu extends BaseCoapStack {
    public zwu(String str, Configuration configuration, EndpointContextMatcher endpointContextMatcher, Outbox outbox) {
        super(outbox);
        setLayers(new Layer[]{new zxb(), new zxe(configuration), new zwr(str, true, configuration, endpointContextMatcher), new zwz()});
    }
}
