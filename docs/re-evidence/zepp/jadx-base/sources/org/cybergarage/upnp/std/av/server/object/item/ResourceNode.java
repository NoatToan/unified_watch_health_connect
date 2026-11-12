package org.cybergarage.upnp.std.av.server.object.item;

import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.cybergarage.xml.Attribute;
import org.cybergarage.xml.Node;

/* JADX INFO: loaded from: classes23.dex */
public class ResourceNode extends ContentNode {
    public static final String COLOR_DEPTH = "colorDepth";
    public static final String IMPORT_URI = "importUri";
    public static final String NAME = "res";
    public static final String PROTOCOL_INFO = "protocolInfo";
    public static final String RESOLUTION = "resolution";
    public static final String SIZE = "size";

    public static final boolean isResourceNode(Node node) {
        String name = node.getName();
        if (name == null) {
            return false;
        }
        return name.equals("res");
    }

    public String getAdditionalInfo() {
        return getProtocolInfoAtIndex(3);
    }

    public String getAdditionalInfoForKey(String str) {
        String additionalInfo;
        String[] strArrSplit;
        if (str != null && (additionalInfo = getAdditionalInfo()) != null && (strArrSplit = additionalInfo.split(";")) != null && strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                if (str2.startsWith(str)) {
                    String[] strArrSplit2 = str2.split(SearchCriteria.EQ);
                    if (strArrSplit2 == null || strArrSplit2.length < 2) {
                        break;
                        break;
                    }
                    return strArrSplit2[1];
                }
            }
        }
        return "";
    }

    public String getContentFormat() {
        return getProtocolInfoAtIndex(2);
    }

    public String getDlnaOrgFlags() {
        return getAdditionalInfoForKey("DLNA.ORG_FLAGS");
    }

    public String getDlnaOrgOp() {
        return getAdditionalInfoForKey("DLNA.ORG_OP");
    }

    public String getDlnaOrgPn() {
        return getAdditionalInfoForKey("DLNA.ORG_PN");
    }

    public String getDuration() {
        return getAttributeValue("duration");
    }

    public String getNetwork() {
        return getProtocolInfoAtIndex(1);
    }

    public String getProtocol() {
        return getProtocolInfoAtIndex(0);
    }

    public String getProtocolInfo() {
        return getAttributeValue("protocolInfo");
    }

    public String getProtocolInfoAtIndex(int i) {
        String[] strArrSplit;
        String protocolInfo = getProtocolInfo();
        return (protocolInfo == null || (strArrSplit = protocolInfo.split(":")) == null || strArrSplit.length <= i) ? "" : strArrSplit[i];
    }

    public String getSize() {
        return getAttributeValue("size");
    }

    public String getURL() {
        return getValue();
    }

    public boolean isAudio() {
        String contentFormat = getContentFormat();
        if (contentFormat == null) {
            return false;
        }
        return contentFormat.startsWith("audio");
    }

    public boolean isImage() {
        String contentFormat = getContentFormat();
        if (contentFormat == null) {
            return false;
        }
        return contentFormat.startsWith("image");
    }

    public boolean isLargeImage() {
        String dlnaOrgPn = getDlnaOrgPn();
        return dlnaOrgPn != null && dlnaOrgPn.endsWith("_LRG");
    }

    public boolean isMediumImage() {
        String dlnaOrgPn = getDlnaOrgPn();
        return dlnaOrgPn != null && dlnaOrgPn.endsWith("_MED");
    }

    public boolean isMovie() {
        String contentFormat = getContentFormat();
        if (contentFormat == null) {
            return false;
        }
        if (contentFormat.startsWith("movie")) {
            return true;
        }
        return contentFormat.startsWith("video");
    }

    public boolean isSmallImage() {
        String dlnaOrgPn = getDlnaOrgPn();
        return dlnaOrgPn != null && dlnaOrgPn.endsWith("_SM");
    }

    public boolean isThumbnail() {
        String dlnaOrgPn = getDlnaOrgPn();
        return dlnaOrgPn != null && dlnaOrgPn.endsWith("_TN");
    }

    public boolean isVideo() {
        return isMovie();
    }

    @Override // org.cybergarage.upnp.std.av.server.object.ContentNode, org.cybergarage.xml.Node
    public boolean set(Node node) {
        setValue(node.getValue());
        int nAttributes = node.getNAttributes();
        for (int i = 0; i < nAttributes; i++) {
            Attribute attribute = node.getAttribute(i);
            setAttribute(attribute.getName(), attribute.getValue());
        }
        return true;
    }
}
