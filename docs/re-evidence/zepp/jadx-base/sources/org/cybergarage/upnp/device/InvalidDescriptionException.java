package org.cybergarage.upnp.device;

import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public class InvalidDescriptionException extends Exception {
    public InvalidDescriptionException() {
    }

    public InvalidDescriptionException(String str) {
        super(str);
    }

    public InvalidDescriptionException(String str, File file) {
        super(str + " (" + file.toString() + ")");
    }

    public InvalidDescriptionException(Exception exc) {
        super(exc.getMessage());
    }
}
