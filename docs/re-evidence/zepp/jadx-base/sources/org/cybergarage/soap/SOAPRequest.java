package org.cybergarage.soap;

import java.io.ByteArrayInputStream;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.util.Debug;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.ParserException;

/* JADX INFO: loaded from: classes23.dex */
public class SOAPRequest extends HTTPRequest {
    private static final String SOAPACTION = "SOAPACTION";
    private Node rootNode;

    public SOAPRequest() {
        setContentType("text/xml; charset=\"utf-8\"");
        setMethod("POST");
    }

    private synchronized Node getRootNode() {
        Node node = this.rootNode;
        if (node != null) {
            return node;
        }
        try {
            this.rootNode = SOAP.getXMLParser().parse(new ByteArrayInputStream(getContent()));
        } catch (ParserException e) {
            Debug.warning(e);
        }
        return this.rootNode;
    }

    private void setRootNode(Node node) {
        this.rootNode = node;
    }

    public Node getBodyNode() {
        Node envelopeNode = getEnvelopeNode();
        if (envelopeNode != null && envelopeNode.hasNodes()) {
            return envelopeNode.getNode(0);
        }
        return null;
    }

    public Node getEnvelopeNode() {
        return getRootNode();
    }

    public String getSOAPAction() {
        return getStringHeaderValue("SOAPACTION");
    }

    public boolean isSOAPAction(String str) {
        String headerValue = getHeaderValue("SOAPACTION");
        if (headerValue == null) {
            return false;
        }
        if (headerValue.equals(str)) {
            return true;
        }
        String sOAPAction = getSOAPAction();
        if (sOAPAction == null) {
            return false;
        }
        return sOAPAction.equals(str);
    }

    public SOAPResponse postMessage(String str, int i) {
        SOAPResponse sOAPResponse = new SOAPResponse(post(str, i));
        byte[] content = sOAPResponse.getContent();
        if (content.length <= 0) {
            return sOAPResponse;
        }
        try {
            sOAPResponse.setEnvelopeNode(SOAP.getXMLParser().parse(new ByteArrayInputStream(content)));
        } catch (Exception e) {
            Debug.warning(e);
        }
        return sOAPResponse;
    }

    @Override // org.cybergarage.http.HTTPRequest
    public void print() {
        Node rootNode;
        Debug.message(toString());
        if (hasContent() || (rootNode = getRootNode()) == null) {
            return;
        }
        Debug.message(rootNode.toString());
    }

    public void setContent(Node node) {
        setContent((("<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + node.toString());
    }

    public void setEnvelopeNode(Node node) {
        setRootNode(node);
    }

    public void setSOAPAction(String str) {
        setStringHeader("SOAPACTION", str);
    }

    public SOAPRequest(HTTPRequest hTTPRequest) {
        set(hTTPRequest);
    }
}
