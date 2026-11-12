package org.cybergarage.xml;

import com.alipay.sdk.m.s.a;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
public class Node {
    private AttributeList attrList;
    private String name;
    private NodeList nodeList;
    private Node parentNode;
    private Object userData;
    private String value;

    public Node() {
        this.parentNode = null;
        this.name = new String();
        this.value = new String();
        this.attrList = new AttributeList();
        this.nodeList = new NodeList();
        this.userData = null;
        setUserData(null);
        setParentNode(null);
    }

    public void addAttribute(Attribute attribute) {
        this.attrList.add(attribute);
    }

    public void addNode(Node node) {
        node.setParentNode(this);
        this.nodeList.add(node);
    }

    public void addValue(String str) {
        if (this.value == null) {
            this.value = str;
        } else if (str != null) {
            this.value += str;
        }
    }

    public boolean equals(Node node) {
        if (node == null) {
            return false;
        }
        return toString().equals(node.toString());
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

    public String getIndentLevelString(int i) {
        return getIndentLevelString(i, "   ");
    }

    public int getIndex(String str) {
        Iterator it2 = this.nodeList.iterator();
        int i = -1;
        while (it2.hasNext()) {
            i++;
            if (((Node) it2.next()).getName().equals(str)) {
                break;
            }
        }
        return i;
    }

    public int getNAttributes() {
        return this.attrList.size();
    }

    public int getNNodes() {
        return this.nodeList.size();
    }

    public String getName() {
        return this.name;
    }

    public Node getNode(int i) {
        return this.nodeList.getNode(i);
    }

    public Node getNodeEndsWith(String str) {
        return this.nodeList.getEndsWith(str);
    }

    public String getNodeValue(String str) {
        Node node = getNode(str);
        return node != null ? node.getValue() : "";
    }

    public Node getParentNode() {
        return this.parentNode;
    }

    public Node getRootNode() {
        Node node = null;
        for (Node parentNode = getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            node = parentNode;
        }
        return node;
    }

    public Object getUserData() {
        return this.userData;
    }

    public String getValue() {
        return this.value;
    }

    public boolean hasAttributes() {
        return getNAttributes() > 0;
    }

    public boolean hasNode(String str) {
        return getNode(str) != null;
    }

    public boolean hasNodes() {
        return getNNodes() > 0;
    }

    public void insertAttributeAt(Attribute attribute, int i) {
        this.attrList.insertElementAt(attribute, i);
    }

    public void insertNode(Node node, int i) {
        node.setParentNode(this);
        this.nodeList.insertElementAt(node, i);
    }

    public boolean isName(String str) {
        return this.name.equals(str);
    }

    public void output(PrintWriter printWriter, int i, boolean z) {
        String indentLevelString = getIndentLevelString(i);
        String name = getName();
        String value = getValue();
        if (hasNodes() && z) {
            printWriter.print(indentLevelString + SearchCriteria.LT + name);
            outputAttributes(printWriter);
            printWriter.println(SearchCriteria.GT);
            int nNodes = getNNodes();
            for (int i2 = 0; i2 < nNodes; i2++) {
                getNode(i2).output(printWriter, i + 1, true);
            }
            printWriter.println(indentLevelString + "</" + name + SearchCriteria.GT);
            return;
        }
        printWriter.print(indentLevelString + SearchCriteria.LT + name);
        outputAttributes(printWriter);
        if (value == null || value.length() == 0) {
            printWriter.println("></" + name + SearchCriteria.GT);
            return;
        }
        printWriter.println(SearchCriteria.GT + XML.escapeXMLChars(value) + "</" + name + SearchCriteria.GT);
    }

    public void outputAttributes(PrintWriter printWriter) {
        int nAttributes = getNAttributes();
        for (int i = 0; i < nAttributes; i++) {
            Attribute attribute = getAttribute(i);
            printWriter.print(" " + attribute.getName() + "=\"" + XML.escapeXMLChars(attribute.getValue()) + "\"");
        }
    }

    public void print(boolean z) {
        PrintWriter printWriter = new PrintWriter(System.out);
        output(printWriter, 0, z);
        printWriter.flush();
    }

    public void removeAllAttributes() {
        this.attrList.clear();
    }

    public void removeAllNodes() {
        this.nodeList.clear();
    }

    public boolean removeAttribute(Attribute attribute) {
        return this.attrList.remove(attribute);
    }

    public boolean removeNode(Node node) {
        node.setParentNode(null);
        return this.nodeList.remove(node);
    }

    public boolean set(Node node) {
        if (node == null) {
            return false;
        }
        setName(node.getName());
        setValue(node.getValue());
        removeAllAttributes();
        int nAttributes = node.getNAttributes();
        for (int i = 0; i < nAttributes; i++) {
            addAttribute(new Attribute(node.getAttribute(i)));
        }
        removeAllNodes();
        int nNodes = node.getNNodes();
        for (int i2 = 0; i2 < nNodes; i2++) {
            Node node2 = node.getNode(i2);
            Node node3 = new Node();
            node3.set(node2);
            addNode(node3);
        }
        return true;
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

    public void setNameSpace(String str, String str2) {
        setAttribute("xmlns:" + str, str2);
    }

    public void setNode(String str) {
        if (hasNode(str)) {
            return;
        }
        addNode(new Node(str));
    }

    public void setParentNode(Node node) {
        this.parentNode = node;
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString(String str, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        output(printWriter, 0, z);
        printWriter.flush();
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return byteArrayOutputStream.toString(str);
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return byteArrayOutputStream.toString();
    }

    public String toXMLString(boolean z) {
        return toString().replaceAll(SearchCriteria.LT, "&lt;").replaceAll(SearchCriteria.GT, "&gt;").replaceAll(a.l, "&amp;").replaceAll("\"", "&quot;").replaceAll("'", "&apos;");
    }

    public void addAttribute(String str, String str2) {
        addAttribute(new Attribute(str, str2));
    }

    public Attribute getAttribute(String str) {
        return this.attrList.getAttribute(str);
    }

    public String getIndentLevelString(int i, String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() * i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public Node getNode(String str) {
        return this.nodeList.getNode(str);
    }

    public boolean removeAttribute(String str) {
        return removeAttribute(getAttribute(str));
    }

    public void setName(String str, String str2) {
        this.name = str + ":" + str2;
    }

    public void setValue(int i) {
        setValue(Integer.toString(i));
    }

    public boolean removeNode(String str) {
        return this.nodeList.remove(getNode(str));
    }

    public void print() {
        print(true);
    }

    public void setNode(String str, String str2) {
        Node node = getNode(str);
        if (node == null) {
            node = new Node(str);
            addNode(node);
        }
        node.setValue(str2);
    }

    public void setAttribute(String str, int i) {
        setAttribute(str, Integer.toString(i));
    }

    public String toXMLString() {
        return toXMLString(true);
    }

    public String toString() {
        return toString("utf-8", true);
    }

    public Node(String str) {
        this();
        setName(str);
    }

    public Node(String str, String str2) {
        this();
        setName(str, str2);
    }

    public Node(Node node) {
        this();
        set(node);
    }
}
