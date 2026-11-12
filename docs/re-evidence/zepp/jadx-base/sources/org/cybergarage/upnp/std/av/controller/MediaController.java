package org.cybergarage.upnp.std.av.controller;

import org.cybergarage.upnp.Action;
import org.cybergarage.upnp.Argument;
import org.cybergarage.upnp.ControlPoint;
import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.DeviceList;
import org.cybergarage.upnp.Service;
import org.cybergarage.upnp.UPnP;
import org.cybergarage.upnp.std.av.player.action.BrowseAction;
import org.cybergarage.upnp.std.av.player.action.BrowseResult;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import org.cybergarage.upnp.std.av.renderer.MediaRenderer;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.cybergarage.upnp.std.av.server.MediaServer;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.cybergarage.upnp.std.av.server.object.container.RootNode;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.upnp.std.av.server.object.item.ResourceNode;
import org.cybergarage.util.Debug;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.ParserException;

/* JADX INFO: loaded from: classes23.dex */
public class MediaController extends ControlPoint {
    private DeviceList getDeviceList(String str) {
        DeviceList deviceList = new DeviceList();
        DeviceList deviceList2 = getDeviceList();
        int size = deviceList2.size();
        for (int i = 0; i < size; i++) {
            Device device = deviceList2.getDevice(i);
            if (device.isDeviceType(str)) {
                deviceList.add(device);
            }
        }
        return deviceList;
    }

    public static void main(String[] strArr) {
        MediaController mediaController = new MediaController();
        mediaController.start();
        while (true) {
            mediaController.printMediaServers();
            try {
                Thread.sleep(20000L);
            } catch (Exception unused) {
            }
        }
    }

    public Node browse(Device device, String str, String str2, String str3, int i, int i2, String str4) {
        Service service;
        Action action;
        String value;
        System.out.println("browse " + str + ", " + str2 + ", " + i + ", " + i2);
        if (device == null || (service = device.getService(ContentDirectory.SERVICE_TYPE)) == null || (action = service.getAction(ContentDirectory.BROWSE)) == null) {
            return null;
        }
        BrowseAction browseAction = new BrowseAction(action);
        browseAction.setObjectID(str);
        browseAction.setBrowseFlag(str2);
        browseAction.setStartingIndex(i);
        browseAction.setRequestedCount(i2);
        browseAction.setFilter(str3);
        browseAction.setSortCriteria(str4);
        if (!browseAction.postControlAction()) {
            return null;
        }
        if (i2 == 0) {
            int numberReturned = browseAction.getNumberReturned();
            int totalMatches = browseAction.getTotalMatches();
            if (numberReturned == 0) {
                if (totalMatches > 0) {
                    browseAction.setRequestedCount(totalMatches);
                    if (!browseAction.postControlAction()) {
                        return null;
                    }
                } else {
                    browseAction.setRequestedCount(9999);
                    if (!browseAction.postControlAction()) {
                        return null;
                    }
                }
            }
        }
        Argument argument = browseAction.getArgument("Result");
        if (argument == null || (value = argument.getValue()) == null) {
            return null;
        }
        try {
            return UPnP.getXMLParser().parse(value);
        } catch (ParserException e) {
            Debug.warning(e);
            return null;
        }
    }

    public Node browseDirectChildren(Device device, String str, String str2, int i, int i2, String str3) {
        return browse(device, str, "BrowseDirectChildren", str2, i, i2, str3);
    }

    public Node browseMetaData(Device device, String str, String str2, int i, int i2, String str3) {
        return browse(device, str, "BrowseMetadata", str2, i, i2, str3);
    }

    public ContentNode getContentDirectory(Device device) {
        return getContentDirectory(device, "0");
    }

    public Device getRendererDevice(String str) {
        Device device = getDevice(str);
        if (device.isDeviceType(MediaRenderer.DEVICE_TYPE)) {
            return device;
        }
        return null;
    }

    public DeviceList getRendererDeviceList() {
        return getDeviceList(MediaRenderer.DEVICE_TYPE);
    }

    public Device getServerDevice(String str) {
        Device device = getDevice(str);
        if (device.isDeviceType(MediaServer.DEVICE_TYPE)) {
            return device;
        }
        return null;
    }

    public DeviceList getServerDeviceList() {
        return getDeviceList(MediaServer.DEVICE_TYPE);
    }

    public boolean play(Device device) {
        Service service;
        Action action;
        if (device == null || (service = device.getService(AVTransport.SERVICE_TYPE)) == null || (action = service.getAction("Play")) == null) {
            return false;
        }
        action.setArgumentValue("InstanceID", "0");
        action.setArgumentValue("Speed", "1");
        return action.postControlAction();
    }

    public void printContentDirectory(Device device) {
        ContentNode contentDirectory = getContentDirectory(device);
        if (contentDirectory == null) {
            return;
        }
        printContentNode(contentDirectory, 1);
    }

    public void printContentNode(ContentNode contentNode, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            System.out.print("  ");
        }
        System.out.print(contentNode.getTitle());
        if (contentNode.isItemNode()) {
            ItemNode itemNode = (ItemNode) contentNode;
            String resource = itemNode.getResource();
            itemNode.getProtocolInfo();
            System.out.print(" (" + resource + ")");
        }
        System.out.println("");
        if (contentNode.isContainerNode()) {
            ContainerNode containerNode = (ContainerNode) contentNode;
            int nContentNodes = containerNode.getNContentNodes();
            for (int i3 = 0; i3 < nContentNodes; i3++) {
                printContentNode(containerNode.getContentNode(i3), i + 1);
            }
        }
    }

    public void printMediaServers() {
        DeviceList deviceList = getDeviceList();
        int size = deviceList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Device device = deviceList.getDevice(i2);
            if (device.isDeviceType(MediaServer.DEVICE_TYPE)) {
                System.out.println("[" + i2 + "] " + device.getFriendlyName() + ", " + device.getLeaseTime() + ", " + device.getElapsedTime());
                printContentDirectory(device);
                i++;
            }
        }
        if (i == 0) {
            System.out.println("MediaServer is not found");
        }
    }

    public boolean setAVTransportURI(Device device, ItemNode itemNode) {
        ResourceNode firstResource;
        String url;
        Service service;
        Action action;
        if (device == null || (firstResource = itemNode.getFirstResource()) == null || (url = firstResource.getURL()) == null || url.length() <= 0 || (service = device.getService(AVTransport.SERVICE_TYPE)) == null || (action = service.getAction(AVTransport.SETAVTRANSPORTURI)) == null) {
            return false;
        }
        action.setArgumentValue("InstanceID", "0");
        action.setArgumentValue(AVTransport.CURRENTURI, url);
        action.setArgumentValue(AVTransport.CURRENTURIMETADATA, "");
        return action.postControlAction();
    }

    public boolean stop(Device device) {
        Service service;
        Action action;
        if (device == null || (service = device.getService(AVTransport.SERVICE_TYPE)) == null || (action = service.getAction("Stop")) == null) {
            return false;
        }
        action.setArgumentValue("InstanceID", "0");
        return action.postControlAction();
    }

    public Node browseDirectChildren(Device device, String str) {
        return browseDirectChildren(device, str, "*", 0, 0, "");
    }

    public Node browseMetaData(Device device, String str) {
        return browseMetaData(device, str, "*", 0, 0, "");
    }

    public ContentNode getContentDirectory(Device device, String str) {
        return browse(device, str, true);
    }

    public boolean play(Device device, ItemNode itemNode) {
        stop(device);
        if (setAVTransportURI(device, itemNode)) {
            return play(device);
        }
        return false;
    }

    public ContainerNode browse(Device device) {
        return browse(device, "0");
    }

    public ContainerNode browse(Device device, String str) {
        return browse(device, str, false);
    }

    public ContainerNode browse(Device device, String str, boolean z, boolean z2) {
        Node nodeBrowseMetaData;
        RootNode rootNode = new RootNode();
        if (z2 && (nodeBrowseMetaData = browseMetaData(device, str, "*", 0, 0, "")) != null) {
            rootNode.set(nodeBrowseMetaData);
        }
        browse(rootNode, device, str, z2);
        return rootNode;
    }

    public ContainerNode browse(Device device, String str, boolean z) {
        return browse(device, str, z, false);
    }

    private int browse(ContainerNode containerNode, Device device, String str, boolean z) {
        Node nodeBrowseDirectChildren;
        if (str == null || (nodeBrowseDirectChildren = browseDirectChildren(device, str, "*", 0, 0, "")) == null) {
            return 0;
        }
        BrowseResult browseResult = new BrowseResult(nodeBrowseDirectChildren);
        int nContentNodes = browseResult.getNContentNodes();
        int i = 0;
        for (int i2 = 0; i2 < nContentNodes; i2++) {
            Node contentNode = browseResult.getContentNode(i2);
            ContentNode itemNode = null;
            if (ContainerNode.isContainerNode(contentNode)) {
                itemNode = new ContainerNode();
            } else if (ItemNode.isItemNode(contentNode)) {
                itemNode = new ItemNode();
            }
            if (itemNode != null) {
                itemNode.set(contentNode);
                containerNode.addContentNode(itemNode);
                itemNode.setParentID(str);
                i++;
                if (z && itemNode.isContainerNode()) {
                    ContainerNode containerNode2 = (ContainerNode) itemNode;
                    if (containerNode2.getChildCount() > 0) {
                        browse(containerNode2, device, containerNode2.getID(), true);
                    }
                }
            }
        }
        return i;
    }
}
