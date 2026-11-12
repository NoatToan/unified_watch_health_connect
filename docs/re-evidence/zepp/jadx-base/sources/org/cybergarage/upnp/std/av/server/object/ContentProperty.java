package org.cybergarage.upnp.std.av.server.object;

import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.AttributeList;

/* JADX INFO: loaded from: classes23.dex */
public class ContentProperty {
    private String name = new String();
    private String value = new String();
    private AttributeList attrList = new AttributeList();

    public ContentProperty() {
    }

    public void addAttribute(Attribute attribute) {
        this.attrList.add(attribute);
    }

    public Attribute getAttribute(int i) {
        return this.attrList.getAttribute(i);
    }

    public int getAttributeIntegerValue(String str) {
        try {
            return Integer.parseInt(getAttributeValue(str));
        } catch (Exception unused) {
            return 0;
        }
    }

    public String getAttributeValue(String str) {
        Attribute attribute = getAttribute(str);
        return attribute != null ? attribute.getValue() : "";
    }

    public int getNAttributes() {
        return this.attrList.size();
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public boolean hasAttributes() {
        return getNAttributes() > 0;
    }

    public void insertAttributeAt(Attribute attribute, int i) {
        this.attrList.insertElementAt(attribute, i);
    }

    public boolean removeAttribute(Attribute attribute) {
        return this.attrList.remove(attribute);
    }

    public void setAttribute(String str, String str2) {
        Attribute attribute = getAttribute(str);
        if (attribute != null) {
            attribute.setValue(str2);
        } else {
            addAttribute(new Attribute(str, str2));
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void addAttribute(String str, String str2) {
        addAttribute(new Attribute(str, str2));
    }

    public Attribute getAttribute(String str) {
        return this.attrList.getAttribute(str);
    }

    public boolean removeAttribute(String str) {
        return removeAttribute(getAttribute(str));
    }

    public ContentProperty(String str, String str2) {
        setName(str);
        setValue(str2);
    }

    public void setAttribute(String str, int i) {
        setAttribute(str, Integer.toString(i));
    }
}
