package org.cybergarage.upnp.control;

import org.cybergarage.http.HTTPRequest;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.Service;
import org.cybergarage.upnp.StateVariable;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class QueryRequest extends ControlRequest {
    public QueryRequest() {
    }

    private Node createContentNode(StateVariable stateVariable) {
        Node node = new Node();
        node.setName("u", Control.QUERY_STATE_VARIABLE);
        node.setNameSpace("u", Control.XMLNS);
        Node node2 = new Node();
        node2.setName("u", Control.VAR_NAME);
        node2.setValue(stateVariable.getName());
        node.addNode(node2);
        return node;
    }

    private Node getVarNameNode() {
        Node node;
        Node bodyNode = getBodyNode();
        if (bodyNode != null && bodyNode.hasNodes() && (node = bodyNode.getNode(0)) != null && node.hasNodes()) {
            return node.getNode(0);
        }
        return null;
    }

    public String getVarName() {
        Node varNameNode = getVarNameNode();
        return varNameNode == null ? "" : varNameNode.getValue();
    }

    public QueryResponse post() {
        return new QueryResponse(postMessage(getRequestHost(), getRequestPort()));
    }

    public void setRequest(StateVariable stateVariable) {
        Service service = stateVariable.getService();
        service.getControlURL();
        setRequestHost(service);
        setEnvelopeNode(SOAP.createEnvelopeBodyNode());
        Node envelopeNode = getEnvelopeNode();
        getBodyNode().addNode(createContentNode(stateVariable));
        setContent(envelopeNode);
        setSOAPAction(Control.QUERY_SOAPACTION);
    }

    public QueryRequest(HTTPRequest hTTPRequest) {
        set(hTTPRequest);
    }
}
