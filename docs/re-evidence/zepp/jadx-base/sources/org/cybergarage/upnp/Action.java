package org.cybergarage.upnp;

import java.util.Iterator;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.ActionRequest;
import org.cybergarage.upnp.control.ActionResponse;
import org.cybergarage.upnp.control.ControlResponse;
import org.cybergarage.upnp.xml.ActionData;
import org.cybergarage.util.Debug;
import org.cybergarage.util.Mutex;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class Action {
    public static final String ELEM_NAME = "action";
    private static final String NAME = "name";
    private Node actionNode;
    private Mutex mutex;
    private Node serviceNode;
    private UPnPStatus upnpStatus;
    private Object userData;

    public Action(Node node) {
        this.mutex = new Mutex();
        this.upnpStatus = new UPnPStatus();
        this.userData = null;
        this.serviceNode = node;
        this.actionNode = new Node("action");
    }

    private void clearOutputAgumentValues() {
        ArgumentList argumentList = getArgumentList();
        int size = argumentList.size();
        for (int i = 0; i < size; i++) {
            Argument argument = argumentList.getArgument(i);
            if (argument.isOutDirection()) {
                argument.setValue("");
            }
        }
    }

    private ActionData getActionData() {
        Node actionNode = getActionNode();
        ActionData actionData = (ActionData) actionNode.getUserData();
        if (actionData != null) {
            return actionData;
        }
        ActionData actionData2 = new ActionData();
        actionNode.setUserData(actionData2);
        actionData2.setNode(actionNode);
        return actionData2;
    }

    private ControlResponse getControlResponse() {
        return getActionData().getControlResponse();
    }

    private Node getServiceNode() {
        return this.serviceNode;
    }

    public static boolean isActionNode(Node node) {
        return "action".equals(node.getName());
    }

    private void setControlResponse(ControlResponse controlResponse) {
        getActionData().setControlResponse(controlResponse);
    }

    public ActionListener getActionListener() {
        return getActionData().getActionListener();
    }

    public Node getActionNode() {
        return this.actionNode;
    }

    public Argument getArgument(String str) {
        ArgumentList argumentList = getArgumentList();
        int size = argumentList.size();
        for (int i = 0; i < size; i++) {
            Argument argument = argumentList.getArgument(i);
            String name = argument.getName();
            if (name != null && str.equals(name)) {
                return argument;
            }
        }
        return null;
    }

    public int getArgumentIntegerValue(String str) {
        Argument argument = getArgument(str);
        if (argument == null) {
            return 0;
        }
        return argument.getIntegerValue();
    }

    public ArgumentList getArgumentList() {
        ArgumentList argumentList = new ArgumentList();
        Node node = getActionNode().getNode(ArgumentList.ELEM_NAME);
        if (node == null) {
            return argumentList;
        }
        int nNodes = node.getNNodes();
        for (int i = 0; i < nNodes; i++) {
            Node node2 = node.getNode(i);
            if (Argument.isArgumentNode(node2)) {
                argumentList.add(new Argument(getServiceNode(), node2));
            }
        }
        return argumentList;
    }

    public String getArgumentValue(String str) {
        Argument argument = getArgument(str);
        return argument == null ? "" : argument.getValue();
    }

    public UPnPStatus getControlStatus() {
        return getControlResponse().getUPnPError();
    }

    public ArgumentList getInputArgumentList() {
        ArgumentList argumentList = getArgumentList();
        int size = argumentList.size();
        ArgumentList argumentList2 = new ArgumentList();
        for (int i = 0; i < size; i++) {
            Argument argument = argumentList.getArgument(i);
            if (argument.isInDirection()) {
                argumentList2.add(argument);
            }
        }
        return argumentList2;
    }

    public String getName() {
        return getActionNode().getNodeValue("name");
    }

    public ArgumentList getOutputArgumentList() {
        ArgumentList argumentList = getArgumentList();
        int size = argumentList.size();
        ArgumentList argumentList2 = new ArgumentList();
        for (int i = 0; i < size; i++) {
            Argument argument = argumentList.getArgument(i);
            if (argument.isOutDirection()) {
                argumentList2.add(argument);
            }
        }
        return argumentList2;
    }

    public Service getService() {
        return new Service(getServiceNode());
    }

    public UPnPStatus getStatus() {
        return this.upnpStatus;
    }

    public Object getUserData() {
        return this.userData;
    }

    public void lock() {
        this.mutex.lock();
    }

    public boolean performActionListener(ActionRequest actionRequest) {
        ActionListener actionListener = getActionListener();
        if (actionListener == null) {
            return false;
        }
        ActionResponse actionResponse = new ActionResponse();
        setStatus(401);
        clearOutputAgumentValues();
        if (actionListener.actionControlReceived(this)) {
            actionResponse.setResponse(this);
        } else {
            UPnPStatus status = getStatus();
            actionResponse.setFaultResponse(status.getCode(), status.getDescription());
        }
        if (Debug.isOn()) {
            actionResponse.print();
        }
        actionRequest.post(actionResponse);
        return true;
    }

    public boolean postControlAction() {
        ArgumentList argumentList = getArgumentList();
        ArgumentList inputArgumentList = getInputArgumentList();
        ActionRequest actionRequest = new ActionRequest();
        actionRequest.setRequest(this, inputArgumentList);
        if (Debug.isOn()) {
            actionRequest.print();
        }
        ActionResponse actionResponsePost = actionRequest.post();
        if (Debug.isOn()) {
            actionResponsePost.print();
        }
        setControlResponse(actionResponsePost);
        setStatus(actionResponsePost.getStatusCode());
        if (!actionResponsePost.isSuccessful()) {
            return false;
        }
        try {
            argumentList.setResArgs(actionResponsePost.getResponse());
            return true;
        } catch (IllegalArgumentException unused) {
            setStatus(402, "Action succesfully delivered but invalid arguments returned.");
            return false;
        }
    }

    public void print() {
        System.out.println("Action : " + getName());
        ArgumentList argumentList = getArgumentList();
        int size = argumentList.size();
        for (int i = 0; i < size; i++) {
            Argument argument = argumentList.getArgument(i);
            String name = argument.getName();
            String value = argument.getValue();
            String direction = argument.getDirection();
            System.out.println(" [" + i + "] = " + direction + ", " + name + ", " + value);
        }
    }

    public void setActionListener(ActionListener actionListener) {
        getActionData().setActionListener(actionListener);
    }

    public void setArgumentList(ArgumentList argumentList) {
        Node node = getActionNode().getNode(ArgumentList.ELEM_NAME);
        if (node == null) {
            node = new Node(ArgumentList.ELEM_NAME);
            getActionNode().addNode(node);
        } else {
            node.removeAllNodes();
        }
        Iterator it2 = argumentList.iterator();
        while (it2.hasNext()) {
            Argument argument = (Argument) it2.next();
            argument.setService(getService());
            node.addNode(argument.getArgumentNode());
        }
    }

    public void setArgumentValue(String str, String str2) {
        Argument argument = getArgument(str);
        if (argument == null) {
            return;
        }
        argument.setValue(str2);
    }

    @Deprecated
    public void setArgumentValues(ArgumentList argumentList) {
        getArgumentList().set(argumentList);
    }

    public void setInArgumentValues(ArgumentList argumentList) {
        getArgumentList().setReqArgs(argumentList);
    }

    public void setName(String str) {
        getActionNode().setNode("name", str);
    }

    public void setOutArgumentValues(ArgumentList argumentList) {
        getArgumentList().setResArgs(argumentList);
    }

    public void setService(Service service) {
        this.serviceNode = service.getServiceNode();
        Iterator it2 = getArgumentList().iterator();
        while (it2.hasNext()) {
            ((Argument) it2.next()).setService(service);
        }
    }

    public void setStatus(int i, String str) {
        this.upnpStatus.setCode(i);
        this.upnpStatus.setDescription(str);
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public void unlock() {
        this.mutex.unlock();
    }

    public void setArgumentValue(String str, int i) {
        setArgumentValue(str, Integer.toString(i));
    }

    public void setStatus(int i) {
        setStatus(i, UPnPStatus.code2String(i));
    }

    public Action(Node node, Node node2) {
        this.mutex = new Mutex();
        this.upnpStatus = new UPnPStatus();
        this.userData = null;
        this.serviceNode = node;
        this.actionNode = node2;
    }

    public Action(Action action) {
        this.mutex = new Mutex();
        this.upnpStatus = new UPnPStatus();
        this.userData = null;
        this.serviceNode = action.getServiceNode();
        this.actionNode = action.getActionNode();
    }
}
