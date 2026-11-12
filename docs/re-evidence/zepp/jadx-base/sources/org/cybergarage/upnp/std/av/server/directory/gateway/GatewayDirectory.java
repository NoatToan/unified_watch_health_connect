package org.cybergarage.upnp.std.av.server.directory.gateway;

import org.cybergarage.upnp.Device;
import org.cybergarage.upnp.DeviceList;
import org.cybergarage.upnp.std.av.controller.MediaController;
import org.cybergarage.upnp.std.av.player.MediaPlayer;
import org.cybergarage.upnp.std.av.server.Directory;
import org.cybergarage.upnp.std.av.server.MediaServer;
import org.cybergarage.upnp.std.av.server.object.ContentNode;
import org.cybergarage.upnp.std.av.server.object.container.ContainerNode;

/* JADX INFO: loaded from: classes23.dex */
public class GatewayDirectory extends Directory {
    private static final String NAME = "CyberMediaGate";
    private MediaPlayer mplayer;

    public GatewayDirectory(String str) {
        super(str);
        this.mplayer = new MediaPlayer();
        getMediaPlayer().start();
    }

    private boolean updateMediaServerList() {
        MediaController controller;
        MediaPlayer mediaPlayer = getMediaPlayer();
        if (mediaPlayer == null || (controller = mediaPlayer.getController()) == null) {
            return false;
        }
        DeviceList deviceList = controller.getDeviceList();
        int size = deviceList.size();
        for (int i = 0; i < size; i++) {
            Device device = deviceList.getDevice(i);
            if (device.isDeviceType(MediaServer.DEVICE_TYPE)) {
                System.out.println("[" + i + "] " + device.getFriendlyName() + ", " + device.getLeaseTime() + ", " + device.getElapsedTime());
            }
        }
        int nContentNodes = getNContentNodes();
        ContentNode[] contentNodeArr = new ContentNode[nContentNodes];
        for (int i2 = 0; i2 < nContentNodes; i2++) {
            contentNodeArr[i2] = getContentNode(i2);
        }
        for (int i3 = 0; i3 < nContentNodes; i3++) {
            String name = contentNodeArr[i3].getName();
            if (!controller.hasDevice(name)) {
                ContainerNode containerNode = new ContainerNode();
                containerNode.setName(name);
                addContentNode(containerNode);
            }
        }
        return false;
    }

    public MediaPlayer getMediaPlayer() {
        return this.mplayer;
    }

    @Override // org.cybergarage.upnp.std.av.server.Directory
    public boolean update() {
        return updateMediaServerList();
    }

    public GatewayDirectory() {
        this(NAME);
    }
}
