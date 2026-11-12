package defpackage;

import cn.hutool.core.exceptions.UtilException;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class d14 {
    public static Object a(Transferable transferable, DataFlavor dataFlavor) {
        if (transferable == null || !transferable.isDataFlavorSupported(dataFlavor)) {
            return null;
        }
        try {
            return transferable.getTransferData(dataFlavor);
        } catch (UnsupportedFlavorException | IOException e) {
            throw new UtilException((Throwable) e);
        }
    }

    public static String b(Transferable transferable) {
        return (String) a(transferable, DataFlavor.stringFlavor);
    }
}
