package org.cybergarage.upnp.std.av.player;

import org.cybergarage.upnp.std.av.controller.MediaController;
import org.cybergarage.upnp.std.av.renderer.MediaRenderer;

/* JADX INFO: loaded from: classes23.dex */
public class MediaPlayer {
    private MediaController controller;
    private MediaRenderer renderer;

    public MediaPlayer(boolean z, boolean z2) {
        this.renderer = null;
        this.controller = null;
        if (z) {
            enableRenderer();
        }
        if (z2) {
            enableController();
        }
    }

    public void disableController() {
        this.controller = null;
    }

    public void disableRenderer() {
        this.renderer = null;
    }

    public void enableController() {
        if (this.controller == null) {
            this.controller = new MediaController();
        }
    }

    public void enableRenderer() {
        if (this.renderer == null) {
            this.renderer = new MediaRenderer();
        }
    }

    public MediaController getController() {
        return this.controller;
    }

    public MediaRenderer getRenderer() {
        return this.renderer;
    }

    public boolean isControllerEnable() {
        return this.controller != null;
    }

    public boolean isRendererEnable() {
        return this.renderer != null;
    }

    public void start() {
        MediaRenderer mediaRenderer = this.renderer;
        if (mediaRenderer != null) {
            mediaRenderer.start();
        }
        MediaController mediaController = this.controller;
        if (mediaController != null) {
            mediaController.start();
        }
    }

    public void stop() {
        MediaRenderer mediaRenderer = this.renderer;
        if (mediaRenderer != null) {
            mediaRenderer.stop();
        }
        MediaController mediaController = this.controller;
        if (mediaController != null) {
            mediaController.stop();
        }
    }

    public MediaPlayer() {
        this(true, true);
    }
}
