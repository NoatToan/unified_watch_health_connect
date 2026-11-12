package com.airoha.android.lib.logdump.minidump;

import android.os.Environment;
import android.util.Log;
import com.airoha.android.lib.logdump.AbstractLogParser;
import com.airoha.android.lib.util.Converter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LogDumpParser extends AbstractLogParser {
    public static final String f = "LogDumpParser";
    private File d = null;
    private FileOutputStream e = null;

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public void createLogFile(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("Airoha");
        sb.append(str3);
        sb.append("AB155x");
        sb.append(str3);
        sb.append(str);
        String string = sb.toString();
        this.d = new File(string, str2);
        try {
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!this.d.exists()) {
                this.d.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.e = new FileOutputStream(this.d, true);
        } catch (IOException e2) {
            Log.d(f, "create FileOutputStream fail");
            e2.printStackTrace();
        }
    }

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public void logToFile(byte[] bArr) {
        if (this.d == null) {
            return;
        }
        try {
            this.e.write(bArr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.d(f, "FileNotFoundException: " + e.getMessage());
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.d(f, "IOException 2: " + e2.getMessage());
        }
    }

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public boolean parseRxDataToQueue(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        System.arraycopy(bArr, 14, bArr2, 0, 256);
        addLogToQueue(bArr2);
        addLogToTextureQueue(Converter.byte2HexStr(bArr2));
        return true;
    }
}
