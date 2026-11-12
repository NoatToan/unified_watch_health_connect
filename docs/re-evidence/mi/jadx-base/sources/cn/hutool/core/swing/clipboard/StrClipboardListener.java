package cn.hutool.core.swing.clipboard;

import defpackage.d14;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class StrClipboardListener implements Serializable {
    private static final long serialVersionUID = 1;

    public Transferable onChange(Clipboard clipboard, Transferable transferable) {
        if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return onChange(clipboard, d14.b(transferable));
        }
        return null;
    }

    public abstract Transferable onChange(Clipboard clipboard, String str);
}
