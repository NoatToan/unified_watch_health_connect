package org.cybergarage.upnp;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import org.cybergarage.http.HTTP;
import org.cybergarage.upnp.control.ActionListener;
import org.cybergarage.upnp.control.QueryListener;
import org.cybergarage.upnp.device.InvalidDescriptionException;
import org.cybergarage.upnp.device.NTS;
import org.cybergarage.upnp.device.ST;
import org.cybergarage.upnp.event.NotifyRequest;
import org.cybergarage.upnp.event.Subscriber;
import org.cybergarage.upnp.event.SubscriberList;
import org.cybergarage.upnp.ssdp.SSDPNotifyRequest;
import org.cybergarage.upnp.ssdp.SSDPNotifySocket;
import org.cybergarage.upnp.ssdp.SSDPPacket;
import org.cybergarage.upnp.xml.ServiceData;
import org.cybergarage.util.Debug;
import org.cybergarage.util.Mutex;
import org.cybergarage.util.StringUtil;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.ParserException;

/* JADX INFO: loaded from: classes23.dex */
public class Service {
    private static final String CONFIG_ID = "configId";
    private static final String CONTROL_URL = "controlURL";
    public static final String ELEM_NAME = "service";
    private static final String EVENT_SUB_URL = "eventSubURL";
    public static final String MAJOR = "major";
    public static final String MAJOR_VALUE = "1";
    public static final String MINOR = "minor";
    public static final String MINOR_VALUE = "0";
    private static final String SCPDURL = "SCPDURL";
    public static final String SCPD_ROOTNODE = "scpd";
    public static final String SCPD_ROOTNODE_NS = "urn:schemas-upnp-org:service-1-0";
    private static final String SERVICE_ID = "serviceId";
    private static final String SERVICE_TYPE = "serviceType";
    public static final String SPEC_VERSION = "specVersion";
    private Mutex mutex;
    private Node serviceNode;
    private Object userData;

    public Service() {
        this(new Node("service"));
        Node node = new Node("specVersion");
        Node node2 = new Node("major");
        node2.setValue("1");
        node.addNode(node2);
        Node node3 = new Node("minor");
        node3.setValue("0");
        node.addNode(node3);
        Node node4 = new Node(SCPD_ROOTNODE);
        node4.addAttribute("xmlns", SCPD_ROOTNODE_NS);
        node4.addNode(node);
        getServiceData().setSCPDNode(node4);
    }

    private Node getDeviceNode() {
        Node parentNode = getServiceNode().getParentNode();
        if (parentNode == null) {
            return null;
        }
        return parentNode.getParentNode();
    }

    private String getNotifyServiceTypeNT() {
        return getServiceType();
    }

    private String getNotifyServiceTypeUSN() {
        return getDevice().getUDN() + "::" + getServiceType();
    }

    private Node getRootNode() {
        return getServiceNode().getRootNode();
    }

    private Node getSCPDNode(URL url) throws ParserException {
        return UPnP.getXMLParser().parse(url);
    }

    private ServiceData getServiceData() {
        Node serviceNode = getServiceNode();
        ServiceData serviceData = (ServiceData) serviceNode.getUserData();
        if (serviceData != null) {
            return serviceData;
        }
        ServiceData serviceData2 = new ServiceData();
        serviceNode.setUserData(serviceData2);
        serviceData2.setNode(serviceNode);
        return serviceData2;
    }

    public static boolean isServiceNode(Node node) {
        return "service".equals(node.getName());
    }

    private boolean isURL(String str, String str2) {
        return (str == null || str2 == null || (!str2.equals(str) && !str2.equals(HTTP.toRelativeURL(str, false)))) ? false : true;
    }

    private boolean notify(Subscriber subscriber, StateVariable stateVariable) {
        String name = stateVariable.getName();
        String value = stateVariable.getValue();
        String deliveryHost = subscriber.getDeliveryHost();
        int deliveryPort = subscriber.getDeliveryPort();
        NotifyRequest notifyRequest = new NotifyRequest();
        notifyRequest.setRequest(subscriber, name, value);
        if (!notifyRequest.post(deliveryHost, deliveryPort).isSuccessful()) {
            return false;
        }
        subscriber.incrementNotifyCount();
        return true;
    }

    public void addAction(Action action) {
        Iterator it2 = action.getArgumentList().iterator();
        while (it2.hasNext()) {
            ((Argument) it2.next()).setService(this);
        }
        Node sCPDNode = getSCPDNode();
        Node node = sCPDNode.getNode(ActionList.ELEM_NAME);
        if (node == null) {
            node = new Node(ActionList.ELEM_NAME);
            sCPDNode.addNode(node);
        }
        node.addNode(action.getActionNode());
    }

    public void addStateVariable(StateVariable stateVariable) {
        Node node = getSCPDNode().getNode(ServiceStateTable.ELEM_NAME);
        if (node == null) {
            node = new Node(ServiceStateTable.ELEM_NAME);
            getSCPDNode().addNode(node);
        }
        stateVariable.setServiceNode(getServiceNode());
        node.addNode(stateVariable.getStateVariableNode());
    }

    public void addSubscriber(Subscriber subscriber) {
        getSubscriberList().add(subscriber);
    }

    public void announce(String str) {
        String locationURL = getRootDevice().getLocationURL(str);
        String notifyServiceTypeNT = getNotifyServiceTypeNT();
        String notifyServiceTypeUSN = getNotifyServiceTypeUSN();
        Device device = getDevice();
        SSDPNotifyRequest sSDPNotifyRequest = new SSDPNotifyRequest();
        sSDPNotifyRequest.setServer(UPnP.getServerName());
        sSDPNotifyRequest.setLeaseTime(device.getLeaseTime());
        sSDPNotifyRequest.setLocation(locationURL);
        sSDPNotifyRequest.setNTS(NTS.ALIVE);
        sSDPNotifyRequest.setNT(notifyServiceTypeNT);
        sSDPNotifyRequest.setUSN(notifyServiceTypeUSN);
        SSDPNotifySocket sSDPNotifySocket = new SSDPNotifySocket(str);
        Device.notifyWait();
        sSDPNotifySocket.post(sSDPNotifyRequest);
    }

    public void byebye(String str) {
        String notifyServiceTypeNT = getNotifyServiceTypeNT();
        String notifyServiceTypeUSN = getNotifyServiceTypeUSN();
        SSDPNotifyRequest sSDPNotifyRequest = new SSDPNotifyRequest();
        sSDPNotifyRequest.setNTS(NTS.BYEBYE);
        sSDPNotifyRequest.setNT(notifyServiceTypeNT);
        sSDPNotifyRequest.setUSN(notifyServiceTypeUSN);
        SSDPNotifySocket sSDPNotifySocket = new SSDPNotifySocket(str);
        Device.notifyWait();
        sSDPNotifySocket.post(sSDPNotifyRequest);
    }

    public void clearSID() {
        setSID("");
        setTimeout(0L);
    }

    public Action getAction(String str) {
        ActionList actionList = getActionList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            Action action = actionList.getAction(i);
            String name = action.getName();
            if (name != null && name.equals(str)) {
                return action;
            }
        }
        return null;
    }

    public ActionList getActionList() {
        Node node;
        ActionList actionList = new ActionList();
        Node sCPDNode = getSCPDNode();
        if (sCPDNode == null || (node = sCPDNode.getNode(ActionList.ELEM_NAME)) == null) {
            return actionList;
        }
        int nNodes = node.getNNodes();
        for (int i = 0; i < nNodes; i++) {
            Node node2 = node.getNode(i);
            if (Action.isActionNode(node2)) {
                actionList.add(new Action(this.serviceNode, node2));
            }
        }
        return actionList;
    }

    public int getConfigId() {
        Node sCPDNode = getSCPDNode();
        if (sCPDNode == null) {
            return 0;
        }
        return sCPDNode.getAttributeIntegerValue(CONFIG_ID);
    }

    public String getControlURL() {
        return getServiceNode().getNodeValue(CONTROL_URL);
    }

    public String getDescriptionURL() {
        return getServiceData().getDescriptionURL();
    }

    public Device getDevice() {
        return new Device(getRootNode(), getDeviceNode());
    }

    public String getEventSubURL() {
        return getServiceNode().getNodeValue(EVENT_SUB_URL);
    }

    public Device getRootDevice() {
        return getDevice().getRootDevice();
    }

    public byte[] getSCPDData() {
        Node sCPDNode = getSCPDNode();
        if (sCPDNode == null) {
            return new byte[0];
        }
        return (((new String() + "<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n") + sCPDNode.toString()).getBytes();
    }

    public String getSCPDURL() {
        return getServiceNode().getNodeValue(SCPDURL);
    }

    public String getSID() {
        return getServiceData().getSID();
    }

    public String getServiceID() {
        return getServiceNode().getNodeValue(SERVICE_ID);
    }

    public Node getServiceNode() {
        return this.serviceNode;
    }

    public ServiceStateTable getServiceStateTable() {
        ServiceStateTable serviceStateTable = new ServiceStateTable();
        Node node = getSCPDNode().getNode(ServiceStateTable.ELEM_NAME);
        if (node == null) {
            return serviceStateTable;
        }
        Node serviceNode = getServiceNode();
        int nNodes = node.getNNodes();
        for (int i = 0; i < nNodes; i++) {
            Node node2 = node.getNode(i);
            if (StateVariable.isStateVariableNode(node2)) {
                serviceStateTable.add(new StateVariable(serviceNode, node2));
            }
        }
        return serviceStateTable;
    }

    public String getServiceType() {
        return getServiceNode().getNodeValue(SERVICE_TYPE);
    }

    public StateVariable getStateVariable(String str) {
        ServiceStateTable serviceStateTable = getServiceStateTable();
        int size = serviceStateTable.size();
        for (int i = 0; i < size; i++) {
            StateVariable stateVariable = serviceStateTable.getStateVariable(i);
            String name = stateVariable.getName();
            if (name != null && name.equals(str)) {
                return stateVariable;
            }
        }
        return null;
    }

    public Subscriber getSubscriber(String str) {
        String sid;
        SubscriberList subscriberList = getSubscriberList();
        int size = subscriberList.size();
        for (int i = 0; i < size; i++) {
            Subscriber subscriber = subscriberList.getSubscriber(i);
            if (subscriber != null && (sid = subscriber.getSID()) != null && sid.equals(str)) {
                return subscriber;
            }
        }
        return null;
    }

    public SubscriberList getSubscriberList() {
        return getServiceData().getSubscriberList();
    }

    public long getTimeout() {
        return getServiceData().getTimeout();
    }

    public Object getUserData() {
        return this.userData;
    }

    public boolean hasSID() {
        return StringUtil.hasData(getSID());
    }

    public boolean hasStateVariable(String str) {
        return getStateVariable(str) != null;
    }

    public boolean isControlURL(String str) {
        return isURL(getControlURL(), str);
    }

    public boolean isEventSubURL(String str) {
        return isURL(getEventSubURL(), str);
    }

    public boolean isSCPDURL(String str) {
        return isURL(getSCPDURL(), str);
    }

    public boolean isService(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(getServiceType()) || str.endsWith(getServiceID());
    }

    public boolean isSubscribed() {
        return hasSID();
    }

    public boolean loadSCPD(String str) throws InvalidDescriptionException {
        try {
            Node node = UPnP.getXMLParser().parse(str);
            if (node == null) {
                return false;
            }
            getServiceData().setSCPDNode(node);
            return true;
        } catch (ParserException e) {
            throw new InvalidDescriptionException(e);
        }
    }

    public void lock() {
        this.mutex.lock();
    }

    public void notifyAllStateVariables() {
        ServiceStateTable serviceStateTable = getServiceStateTable();
        int size = serviceStateTable.size();
        for (int i = 0; i < size; i++) {
            StateVariable stateVariable = serviceStateTable.getStateVariable(i);
            if (stateVariable.isSendEvents()) {
                notify(stateVariable);
            }
        }
    }

    public void removeSubscriber(Subscriber subscriber) {
        getSubscriberList().remove(subscriber);
    }

    public boolean serviceSearchResponse(SSDPPacket sSDPPacket) {
        String st = sSDPPacket.getST();
        if (st == null) {
            return false;
        }
        Device device = getDevice();
        String notifyServiceTypeNT = getNotifyServiceTypeNT();
        String notifyServiceTypeUSN = getNotifyServiceTypeUSN();
        if (ST.isAllDevice(st)) {
            device.postSearchResponse(sSDPPacket, notifyServiceTypeNT, notifyServiceTypeUSN);
        } else if (ST.isURNService(st)) {
            String serviceType = getServiceType();
            if (st.equals(serviceType)) {
                device.postSearchResponse(sSDPPacket, serviceType, notifyServiceTypeUSN);
            }
        }
        return true;
    }

    public void setActionListener(ActionListener actionListener) {
        ActionList actionList = getActionList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            actionList.getAction(i).setActionListener(actionListener);
        }
    }

    public void setControlURL(String str) {
        getServiceNode().setNode(CONTROL_URL, str);
    }

    public void setDescriptionURL(String str) {
        getServiceData().setDescriptionURL(str);
    }

    public void setEventSubURL(String str) {
        getServiceNode().setNode(EVENT_SUB_URL, str);
    }

    public void setQueryListener(QueryListener queryListener) {
        ServiceStateTable serviceStateTable = getServiceStateTable();
        int size = serviceStateTable.size();
        for (int i = 0; i < size; i++) {
            serviceStateTable.getStateVariable(i).setQueryListener(queryListener);
        }
    }

    public void setSCPDURL(String str) {
        getServiceNode().setNode(SCPDURL, str);
    }

    public void setSID(String str) {
        getServiceData().setSID(str);
    }

    public void setServiceID(String str) {
        getServiceNode().setNode(SERVICE_ID, str);
    }

    public void setServiceType(String str) {
        getServiceNode().setNode(SERVICE_TYPE, str);
    }

    public void setTimeout(long j) {
        getServiceData().setTimeout(j);
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public void unlock() {
        this.mutex.unlock();
    }

    public void updateConfigId() {
        Node sCPDNode = getSCPDNode();
        if (sCPDNode == null) {
            return;
        }
        sCPDNode.setAttribute(CONFIG_ID, UPnP.caluculateConfigId(sCPDNode.toString()));
    }

    private Node getSCPDNode(File file) throws ParserException {
        return UPnP.getXMLParser().parse(file);
    }

    private Node getSCPDNode() {
        ServiceData serviceData = getServiceData();
        Node sCPDNode = serviceData.getSCPDNode();
        if (sCPDNode != null) {
            return sCPDNode;
        }
        Device rootDevice = getRootDevice();
        if (rootDevice == null) {
            return null;
        }
        String scpdurl = getSCPDURL();
        String descriptionFilePath = rootDevice.getDescriptionFilePath();
        if (descriptionFilePath != null) {
            File file = new File(descriptionFilePath.concat(scpdurl));
            if (file.exists()) {
                try {
                    sCPDNode = getSCPDNode(file);
                } catch (ParserException e) {
                    e.printStackTrace();
                }
                if (sCPDNode != null) {
                    serviceData.setSCPDNode(sCPDNode);
                    return sCPDNode;
                }
            }
        }
        try {
            Node sCPDNode2 = getSCPDNode(new URL(rootDevice.getAbsoluteURL(scpdurl)));
            if (sCPDNode2 != null) {
                serviceData.setSCPDNode(sCPDNode2);
                return sCPDNode2;
            }
        } catch (Exception unused) {
        }
        try {
            return getSCPDNode(new File(rootDevice.getDescriptionFilePath() + HTTP.toRelativeURL(scpdurl)));
        } catch (Exception e2) {
            Debug.warning(e2);
            return null;
        }
    }

    public boolean loadSCPD(File file) throws ParserException {
        Node node = UPnP.getXMLParser().parse(file);
        if (node == null) {
            return false;
        }
        getServiceData().setSCPDNode(node);
        return true;
    }

    public boolean loadSCPD(InputStream inputStream) throws ParserException {
        Node node = UPnP.getXMLParser().parse(inputStream);
        if (node == null) {
            return false;
        }
        getServiceData().setSCPDNode(node);
        return true;
    }

    public void notify(StateVariable stateVariable) {
        SubscriberList subscriberList = getSubscriberList();
        int size = subscriberList.size();
        Subscriber[] subscriberArr = new Subscriber[size];
        for (int i = 0; i < size; i++) {
            subscriberArr[i] = subscriberList.getSubscriber(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            Subscriber subscriber = subscriberArr[i2];
            if (subscriber != null && subscriber.isExpired()) {
                removeSubscriber(subscriber);
            }
        }
        int size2 = subscriberList.size();
        Subscriber[] subscriberArr2 = new Subscriber[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            subscriberArr2[i3] = subscriberList.getSubscriber(i3);
        }
        for (int i4 = 0; i4 < size2; i4++) {
            Subscriber subscriber2 = subscriberArr2[i4];
            if (subscriber2 != null) {
                notify(subscriber2, stateVariable);
            }
        }
    }

    public Service(Node node) {
        this.mutex = new Mutex();
        this.userData = null;
        this.serviceNode = node;
    }
}
