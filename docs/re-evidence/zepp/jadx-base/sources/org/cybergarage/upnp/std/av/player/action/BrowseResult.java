package org.cybergarage.upnp.std.av.player.action;

import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class BrowseResult {
    private Node resultNode;

    public BrowseResult(Node node) {
        setResultNode(node);
    }

    public Node getContentNode(int i) {
        return this.resultNode.getNode(i);
    }

    public int getNContentNodes() {
        return this.resultNode.getNNodes();
    }

    public Node getResultNode() {
        return this.resultNode;
    }

    public void setResultNode(Node node) {
        this.resultNode = node;
    }
}
