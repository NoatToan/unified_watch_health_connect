package org.cybergarage.upnp.std.av.server;

import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Directory extends ContainerNode {
    public Directory(ContentDirectory contentDirectory, String str) {
        setContentDirectory(contentDirectory);
        setFriendlyName(str);
    }

    public String getFriendlyName() {
        return getTitle();
    }

    public void setFriendlyName(String str) {
        setTitle(str);
    }

    public abstract boolean update();

    public void updateContentList() {
        if (update()) {
            setChildCount(getNContentNodes());
            getContentDirectory().updateSystemUpdateID();
        }
    }

    public Directory(String str) {
        this(null, str);
    }
}
