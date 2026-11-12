package org.eclipse.californium.core.network.stack;

/* JADX INFO: loaded from: classes20.dex */
public interface ExtendedCoapStack extends CoapStack {
    <T extends Layer> T getLayer(Class<T> cls);
}
