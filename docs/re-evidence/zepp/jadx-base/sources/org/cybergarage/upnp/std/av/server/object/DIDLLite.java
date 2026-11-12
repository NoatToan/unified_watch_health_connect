package org.cybergarage.upnp.std.av.server.object;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class DIDLLite {
    public static final String CONTAINER = "container";
    public static final String ID = "id";
    public static final String NAME = "DIDL-Lite";
    public static final String OBJECT_CONTAINER = "object.container";
    public static final String PARENTID = "parentID";
    public static final String RES = "res";
    public static final String RESTICTED = "restricted";
    public static final String RES_PROTOCOLINFO = "protocolInfo";
    public static final String SEARCHABLE = "searchable";
    public static final String XMLNS = "xmlns";
    public static final String XMLNS_DC = "xmlns:dc";
    public static final String XMLNS_DC_URL = "http://purl.org/dc/elements/1.1/";
    public static final String XMLNS_UPNP = "xmlns:upnp";
    public static final String XMLNS_UPNP_URL = "urn:schemas-upnp-org:metadata-1-0/upnp/";
    public static final String XMLNS_URL = "urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/";
    private ContentNodeList nodeList = new ContentNodeList();

    public void addContentNode(ContentNode contentNode) {
        this.nodeList.add(contentNode);
    }

    public ContentNode getContentNode(int i) {
        return this.nodeList.getContentNode(i);
    }

    public int getNContentNodes() {
        return this.nodeList.size();
    }

    public void output(PrintWriter printWriter) {
        printWriter.print("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        DIDLLiteNode dIDLLiteNode = new DIDLLiteNode();
        String name = dIDLLiteNode.getName();
        printWriter.print(SearchCriteria.LT + name);
        dIDLLiteNode.outputAttributes(printWriter);
        printWriter.println(SearchCriteria.GT);
        int nContentNodes = getNContentNodes();
        for (int i = 0; i < nContentNodes; i++) {
            getContentNode(i).output(printWriter, 1, false);
        }
        printWriter.println("</" + name + SearchCriteria.GT);
    }

    public void setContentNode(ContentNode contentNode) {
        this.nodeList.clear();
        this.nodeList.add(contentNode);
    }

    public String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, "UTF-8"));
            output(printWriter);
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (UnsupportedEncodingException e) {
            Debug.warning(e);
            return "";
        }
    }
}
