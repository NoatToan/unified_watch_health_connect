package org.cybergarage.upnp.std.av.server.object.container;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class ContainerNode extends ContentNode {
    public static final String CHILD_COUNT = "childCount";
    public static final String NAME = "container";
    public static final String OBJECT_CONTAINER = "object.container";
    public static final String SEARCHABLE = "searchable";

    public ContainerNode() {
        setID(-1);
        setName("container");
        setSearchable(0);
        setChildCount(0);
        setUPnPClass("object.container");
        setWriteStatus("UNKNOWN");
    }

    public static final boolean isContainerNode(Node node) {
        String name = node.getName();
        if (name == null) {
            return false;
        }
        return name.equals("container");
    }

    public void addContentNode(ContentNode contentNode) {
        addNode(contentNode);
        contentNode.setParentID(getID());
        setChildCount(getNContentNodes());
        contentNode.setContentDirectory(getContentDirectory());
    }

    public ContentNode findContentNodeByID(String str) {
        ContentNode contentNodeFindContentNodeByID;
        if (str == null) {
            return null;
        }
        if (str.equals(getID())) {
            return this;
        }
        int nContentNodes = getNContentNodes();
        for (int i = 0; i < nContentNodes; i++) {
            ContentNode contentNode = getContentNode(i);
            if (contentNode.isContainerNode() && (contentNodeFindContentNodeByID = ((ContainerNode) contentNode).findContentNodeByID(str)) != null) {
                return contentNodeFindContentNodeByID;
            }
        }
        return null;
    }

    public int getChildCount() {
        return getAttributeIntegerValue(CHILD_COUNT);
    }

    public ContentNode getContentNode(int i) {
        return (ContentNode) getNode(i);
    }

    public int getNContentNodes() {
        return getNNodes();
    }

    public int getSearchable() {
        return getAttributeIntegerValue("searchable");
    }

    public boolean hasContentNodes() {
        return hasNodes();
    }

    public void removeAllContentNodes() {
        removeAllNodes();
    }

    public boolean removeContentNode(ContentNode contentNode) {
        boolean zRemoveNode = removeNode(contentNode);
        setChildCount(getNContentNodes());
        return zRemoveNode;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.ContentNode, org.cybergarage.xml.Node
    public boolean set(Node node) {
        int nNodes = node.getNNodes();
        for (int i = 0; i < nNodes; i++) {
            Node node2 = node.getNode(i);
            if (!isContainerNode(node2) && !ItemNode.isItemNode(node2)) {
                setProperty(node2.getName(), node2.getValue());
            }
        }
        int nAttributes = node.getNAttributes();
        for (int i2 = 0; i2 < nAttributes; i2++) {
            Attribute attribute = node.getAttribute(i2);
            setAttribute(attribute.getName(), attribute.getValue());
        }
        return true;
    }

    public void setChildCount(int i) {
        setAttribute(CHILD_COUNT, i);
    }

    public void setSearchable(int i) {
        setAttribute("searchable", i);
    }

    public ContentNode getContentNode(String str) {
        return (ContentNode) getNode(str);
    }
}
