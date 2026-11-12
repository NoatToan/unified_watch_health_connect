package org.cybergarage.upnp.std.av.server.object;

import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class DIDLLiteNode extends Node {
    public DIDLLiteNode() {
        setName(DIDLLite.NAME);
        setAttribute("xmlns", DIDLLite.XMLNS_URL);
        setAttribute(DIDLLite.XMLNS_DC, DIDLLite.XMLNS_DC_URL);
        setAttribute(DIDLLite.XMLNS_UPNP, DIDLLite.XMLNS_UPNP_URL);
    }

    public void addContentNode(ContentNode contentNode) {
        addNode(contentNode);
    }

    public boolean removeContentNode(ContentNode contentNode) {
        return removeNode(contentNode);
    }
}
