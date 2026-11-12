package org.cybergarage.upnp.std.av.server.object;

import java.io.PrintWriter;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.cybergarage.upnp.std.av.server.MediaServer;
import org.cybergarage.upnp.std.av.server.UPnP;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ContentNode extends Node {
    public static final String ID = "id";
    public static final String PARENT_ID = "parentID";
    public static final String RESTRICTED = "restricted";
    public static final String UNKNOWN = "UNKNOWN";
    private ContentDirectory contentDir;
    private ContentPropertyList propList = new ContentPropertyList();

    public ContentNode() {
        setID(0);
        setParentID(-1);
        setRestricted(1);
        setContentDirectory(null);
    }

    private void outputPropertyAttributes(PrintWriter printWriter, ContentProperty contentProperty) {
        int nAttributes = contentProperty.getNAttributes();
        for (int i = 0; i < nAttributes; i++) {
            Attribute attribute = contentProperty.getAttribute(i);
            printWriter.print(" " + attribute.getName() + "=\"" + attribute.getValue() + "\"");
        }
    }

    public void addProperty(ContentProperty contentProperty) {
        this.propList.add(contentProperty);
    }

    public ContentDirectory getContentDirectory() {
        return this.contentDir;
    }

    public String getID() {
        return getAttributeValue("id");
    }

    public MediaServer getMediaServer() {
        return getContentDirectory().getMediaServer();
    }

    public int getNProperties() {
        return this.propList.size();
    }

    public String getParentID() {
        return getAttributeValue("parentID");
    }

    public ContentProperty getProperty(int i) {
        return this.propList.getContentProperty(i);
    }

    public String getPropertyAttribureValue(String str, String str2) {
        ContentProperty property = getProperty(str);
        return property != null ? property.getAttributeValue(str2) : "";
    }

    public int getPropertyIntegerValue(String str) {
        try {
            return Integer.parseInt(getPropertyValue(str));
        } catch (Exception unused) {
            return 0;
        }
    }

    public long getPropertyLongValue(String str) {
        try {
            return Long.parseLong(getPropertyValue(str));
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getPropertyValue(String str) {
        ContentProperty property = getProperty(str);
        return property != null ? property.getValue() : "";
    }

    public int getRestricted() {
        return getAttributeIntegerValue("restricted");
    }

    public String getTitle() {
        return getPropertyValue("dc:title");
    }

    public String getUPnPClass() {
        return getPropertyValue("upnp:class");
    }

    public String getWriteStatus() {
        return getPropertyValue(UPnP.WRITE_STATUS);
    }

    public boolean hasProperties() {
        return getNProperties() > 0;
    }

    public void insertPropertyAt(ContentProperty contentProperty, int i) {
        this.propList.insertElementAt(contentProperty, i);
    }

    public boolean isContainerNode() {
        return this instanceof ContainerNode;
    }

    public boolean isItemNode() {
        return this instanceof ItemNode;
    }

    public boolean isUPnPClassStartWith(String str) {
        String uPnPClass;
        if (str == null || (uPnPClass = getUPnPClass()) == null) {
            return false;
        }
        return uPnPClass.startsWith(str);
    }

    @Override // org.cybergarage.xml.Node
    public void output(PrintWriter printWriter, int i, boolean z) {
        String indentLevelString = getIndentLevelString(i);
        String name = getName();
        String value = getValue();
        if (!hasNodes() && !hasProperties()) {
            printWriter.print(indentLevelString + SearchCriteria.LT + name);
            outputAttributes(printWriter);
            printWriter.println(SearchCriteria.GT + value + "</" + name + SearchCriteria.GT);
            return;
        }
        printWriter.print(indentLevelString + SearchCriteria.LT + name);
        outputAttributes(printWriter);
        printWriter.println(SearchCriteria.GT);
        int nProperties = getNProperties();
        for (int i2 = 0; i2 < nProperties; i2++) {
            String indentLevelString2 = getIndentLevelString(i + 1);
            ContentProperty property = getProperty(i2);
            String name2 = property.getName();
            String value2 = property.getValue();
            if (property.hasAttributes()) {
                printWriter.print(indentLevelString2 + SearchCriteria.LT + name2);
                outputPropertyAttributes(printWriter, property);
                printWriter.println(SearchCriteria.GT + value2 + "</" + name2 + SearchCriteria.GT);
            } else {
                printWriter.println(indentLevelString2 + SearchCriteria.LT + name2 + SearchCriteria.GT + value2 + "</" + name2 + SearchCriteria.GT);
            }
        }
        if (z) {
            int nNodes = getNNodes();
            for (int i3 = 0; i3 < nNodes; i3++) {
                getNode(i3).output(printWriter, i + 1, true);
            }
        }
        printWriter.println(indentLevelString + "</" + name + SearchCriteria.GT);
    }

    public boolean removeProperty(ContentProperty contentProperty) {
        return this.propList.remove(contentProperty);
    }

    @Override // org.cybergarage.xml.Node
    public abstract boolean set(Node node);

    public void setContentDirectory(ContentDirectory contentDirectory) {
        this.contentDir = contentDirectory;
    }

    public void setID(int i) {
        setAttribute("id", i);
    }

    public void setParentID(int i) {
        setAttribute("parentID", i);
    }

    public void setProperty(String str, String str2) {
        ContentProperty property = getProperty(str);
        if (property != null) {
            property.setValue(str2);
        } else {
            addProperty(new ContentProperty(str, str2));
        }
    }

    public void setPropertyAttribure(String str, String str2, String str3) {
        ContentProperty property = getProperty(str);
        if (property == null) {
            property = new ContentProperty(str, "");
            addProperty(property);
        }
        property.setAttribute(str2, str3);
    }

    public void setRestricted(int i) {
        setAttribute("restricted", i);
    }

    public void setTitle(String str) {
        setProperty("dc:title", str);
    }

    public void setUPnPClass(String str) {
        setProperty("upnp:class", str);
    }

    public void setWriteStatus(String str) {
        setProperty(UPnP.WRITE_STATUS, str);
    }

    public void addProperty(String str, String str2) {
        addProperty(new ContentProperty(str, str2));
    }

    public ContentProperty getProperty(String str) {
        return this.propList.getContentProperty(str);
    }

    public boolean removeProperty(String str) {
        return removeProperty(getProperty(str));
    }

    public void setID(String str) {
        setAttribute("id", str);
    }

    public void setParentID(String str) {
        setAttribute("parentID", str);
    }

    public void setProperty(String str, int i) {
        setProperty(str, Integer.toString(i));
    }

    public void setProperty(String str, long j) {
        setProperty(str, Long.toString(j));
    }
}
