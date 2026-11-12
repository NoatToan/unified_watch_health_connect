package com.airoha.liblogger.printer;

import com.airoha.liblogger.LogInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IPrinter {
    void destroy();

    String getPrinterName();

    boolean init(HashMap<String, String> map);

    void print(LogInfo logInfo);
}
