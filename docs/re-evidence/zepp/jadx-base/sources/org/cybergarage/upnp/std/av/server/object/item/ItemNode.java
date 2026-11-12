package org.cybergarage.upnp.std.av.server.object.item;

import com.huami.devicerecorder.UriGetter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.cybergarage.upnp.std.av.server.UPnP;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.cybergarage.util.Debug;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.AttributeList;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class ItemNode extends ContentNode {
    public static final String COLOR_DEPTH = "colorDepth";
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String IMPORT_URI = "importUri";
    public static final String NAME = "item";
    public static final String PROTOCOL_INFO = "protocolInfo";
    public static final String RES = "res";
    public static final String RESOLUTION = "resolution";
    public static final String SIZE = "size";
    private ResourceNodeList resourceNodeList = new ResourceNodeList();

    public ItemNode() {
        setID(-1);
        setName("item");
        setStorageMedium("UNKNOWN");
        setWriteStatus("UNKNOWN");
    }

    public static final boolean isItemNode(Node node) {
        String name = node.getName();
        if (name == null) {
            return false;
        }
        return name.equals("item");
    }

    public void addContentNode(ContentNode contentNode) {
        addNode(contentNode);
        contentNode.setParentID(getID());
        contentNode.setContentDirectory(getContentDirectory());
    }

    public void addResourceNode(ResourceNode resourceNode) {
        this.resourceNodeList.add(resourceNode);
    }

    public String getAlbum() {
        return getPropertyValue(UPnP.ALBUM);
    }

    public String getAlbumArtURI() {
        return getPropertyValue(UPnP.ALBUMART_URI);
    }

    public String getArtist() {
        return getPropertyValue(UPnP.ARTIST);
    }

    public InputStream getContentInputStream() {
        return null;
    }

    public long getContentLength() {
        return 0L;
    }

    public String getCreator() {
        return getPropertyValue("dc:creator");
    }

    public String getDate() {
        return getPropertyValue("dc:date");
    }

    public long getDateTime() {
        String date = getDate();
        if (date != null && date.length() >= 10) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(date).getTime();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public ResourceNode getFirstResource() {
        int nResourceNodeLists = getNResourceNodeLists();
        for (int i = 0; i < nResourceNodeLists; i++) {
            ResourceNode resourceNode = getResourceNode(i);
            if (!resourceNode.isThumbnail()) {
                return resourceNode;
            }
        }
        return null;
    }

    public String getMimeType() {
        return UriGetter.ShareContentType.File;
    }

    public int getNResourceNodeLists() {
        return this.resourceNodeList.size();
    }

    public String getProtocolInfo() {
        return getPropertyAttribureValue("res", "protocolInfo");
    }

    public String getResource() {
        return getPropertyValue("res");
    }

    public ResourceNode getResourceNode(int i) {
        return this.resourceNodeList.getResourceNode(i);
    }

    public ResourceNodeList getResourceNodeList() {
        return this.resourceNodeList;
    }

    public ResourceNode getSmallImageResource() {
        int nResourceNodeLists = getNResourceNodeLists();
        for (int i = 0; i < nResourceNodeLists; i++) {
            ResourceNode resourceNode = getResourceNode(i);
            if (resourceNode.isSmallImage()) {
                return resourceNode;
            }
        }
        return null;
    }

    public String getStorageMedium() {
        return getPropertyValue(UPnP.STORAGE_MEDIUM);
    }

    public long getStorageUsed() {
        return getPropertyLongValue(UPnP.STORAGE_USED);
    }

    public ResourceNode getThumbnailResource() {
        int nResourceNodeLists = getNResourceNodeLists();
        for (int i = 0; i < nResourceNodeLists; i++) {
            ResourceNode resourceNode = getResourceNode(i);
            if (resourceNode.isThumbnail()) {
                return resourceNode;
            }
        }
        return null;
    }

    public boolean isAudioClass() {
        return isUPnPClassStartWith("object.item.audio") || isUPnPClassStartWith("object.item.music");
    }

    public boolean isImageClass() {
        return isUPnPClassStartWith("object.item.image") || isUPnPClassStartWith("object.item.photo");
    }

    public boolean isMovieClass() {
        return isUPnPClassStartWith("object.item.movie") || isUPnPClassStartWith("object.item.video");
    }

    public boolean isVideoClass() {
        return isMovieClass();
    }

    public boolean removeContentNode(ContentNode contentNode) {
        return removeNode(contentNode);
    }

    @Override // org.cybergarage.upnp.std.av.server.object.ContentNode, org.cybergarage.xml.Node
    public boolean set(Node node) {
        int nNodes = node.getNNodes();
        for (int i = 0; i < nNodes; i++) {
            Node node2 = node.getNode(i);
            if (!ContainerNode.isContainerNode(node2) && !isItemNode(node2)) {
                if (ResourceNode.isResourceNode(node2)) {
                    ResourceNode resourceNode = new ResourceNode();
                    resourceNode.set(node2);
                    addResourceNode(resourceNode);
                } else {
                    setProperty(node2.getName(), node2.getValue());
                }
            }
        }
        int nAttributes = node.getNAttributes();
        for (int i2 = 0; i2 < nAttributes; i2++) {
            Attribute attribute = node.getAttribute(i2);
            setAttribute(attribute.getName(), attribute.getValue());
        }
        return true;
    }

    public void setAlbum(String str) {
        setProperty(UPnP.ALBUM, str);
    }

    public void setAlbumArtURI(String str) {
        setProperty(UPnP.ALBUMART_URI, str);
    }

    public void setArtist(String str) {
        setProperty(UPnP.ARTIST, str);
    }

    public void setCreator(String str) {
        setProperty("dc:creator", str);
    }

    public void setDate(String str) {
        setProperty("dc:date", str);
    }

    public void setResource(String str, String str2, AttributeList attributeList) {
        setProperty("res", str);
        setPropertyAttribure("res", "protocolInfo", str2);
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            Attribute attribute = attributeList.getAttribute(i);
            setPropertyAttribure("res", attribute.getName(), attribute.getValue());
        }
    }

    public void setStorageMedium(String str) {
        setProperty(UPnP.STORAGE_MEDIUM, str);
    }

    public void setStorageUsed(long j) {
        setProperty(UPnP.STORAGE_USED, j);
    }

    public void setDate(long j) {
        try {
            setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date(j)));
        } catch (Exception e) {
            Debug.warning(e);
        }
    }

    public void setResource(String str, String str2) {
        setResource(str, str2, new AttributeList());
    }
}
