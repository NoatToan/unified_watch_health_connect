package org.cybergarage.upnp.std.av.player.action;

import com.huami.devicerecorder.UriGetter;
import java.io.InputStream;
import org.cybergarage.upnp.std.av.server.object.item.ItemNode;

/* JADX INFO: loaded from: classes23.dex */
public class BrowseResultNode extends ItemNode {
    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public InputStream getContentInputStream() {
        return null;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public long getContentLength() {
        return 0L;
    }

    @Override // org.cybergarage.upnp.std.av.server.object.item.ItemNode
    public String getMimeType() {
        return UriGetter.ShareContentType.File;
    }
}
