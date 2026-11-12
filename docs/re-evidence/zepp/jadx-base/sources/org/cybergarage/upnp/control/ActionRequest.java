package org.cybergarage.upnp.control;

import com.huami.watch.ota.UpdateUtils;
import org.cybergarage.http.HTTPRequest;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.Argument;
import org.cybergarage.upnp.ArgumentList;
import org.cybergarage.upnp.Service;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class ActionRequest extends ControlRequest {
    public ActionRequest() {
    }

    private Node createContentNode(Service service, Action action, ArgumentList argumentList) {
        String name = action.getName();
        String serviceType = service.getServiceType();
        Node node = new Node();
        node.setName("u", name);
        node.setNameSpace("u", serviceType);
        int size = argumentList.size();
        for (int i = 0; i < size; i++) {
            Argument argument = argumentList.getArgument(i);
            Node node2 = new Node();
            node2.setName(argument.getName());
            node2.setValue(argument.getValue());
            node.addNode(node2);
        }
        return node;
    }

    public String getActionName() {
        String name;
        int iIndexOf;
        Node actionNode = getActionNode();
        return (actionNode == null || (name = actionNode.getName()) == null || (iIndexOf = name.indexOf(":") + 1) < 0) ? "" : name.substring(iIndexOf, name.length());
    }

    public Node getActionNode() {
        Node bodyNode = getBodyNode();
        if (bodyNode != null && bodyNode.hasNodes()) {
            return bodyNode.getNode(0);
        }
        return null;
    }

    public ArgumentList getArgumentList() {
        Node actionNode = getActionNode();
        int nNodes = actionNode.getNNodes();
        ArgumentList argumentList = new ArgumentList();
        for (int i = 0; i < nNodes; i++) {
            Argument argument = new Argument();
            Node node = actionNode.getNode(i);
            argument.setName(node.getName());
            argument.setValue(node.getValue());
            argumentList.add(argument);
        }
        return argumentList;
    }

    public ActionResponse post() {
        return new ActionResponse(postMessage(getRequestHost(), getRequestPort()));
    }

    public void setRequest(Action action, ArgumentList argumentList) {
        Service service = action.getService();
        setRequestHost(service);
        setEnvelopeNode(SOAP.createEnvelopeBodyNode());
        Node envelopeNode = getEnvelopeNode();
        getBodyNode().addNode(createContentNode(service, action, argumentList));
        setContent(envelopeNode);
        setSOAPAction("\"" + service.getServiceType() + UpdateUtils.CMD_FILTER + action.getName() + "\"");
    }

    public ActionRequest(HTTPRequest hTTPRequest) {
        set(hTTPRequest);
    }
}
