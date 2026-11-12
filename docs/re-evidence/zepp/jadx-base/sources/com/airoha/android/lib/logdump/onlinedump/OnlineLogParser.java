package com.airoha.android.lib.logdump.onlinedump;

import android.os.Environment;
import android.util.Log;
import com.airoha.android.lib.logdump.AbstractLogParser;
import com.airoha.android.lib.util.Converter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineLogParser extends AbstractLogParser {
    public static final String i = "OnlineLogParser";
    private LoggerList<Byte> d = null;
    private int e = 4;
    private int f = 8;
    private File g = null;
    private FileOutputStream h = null;

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
        this.g = new File(string, str2);
        try {
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!this.g.exists()) {
                this.g.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.h = new FileOutputStream(this.g, true);
        } catch (IOException e2) {
            Log.d(i, "create FileOutputStream fail");
            e2.printStackTrace();
        }
    }

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public void logToFile(byte[] bArr) {
        if (this.g == null) {
            return;
        }
        try {
            this.h.write(bArr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.d(i, "FileNotFoundException: " + e.getMessage());
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.d(i, "IOException 2: " + e2.getMessage());
        }
    }

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public boolean parseRxDataToQueue(byte[] bArr) {
        int iBytesToShort = Converter.BytesToShort(bArr[3], bArr[2]);
        byte[] bArr2 = new byte[iBytesToShort];
        int i2 = 0;
        System.arraycopy(bArr, 6, bArr2, 0, iBytesToShort - 2);
        addLogToQueue(bArr2);
        Byte[] bArr3 = new Byte[iBytesToShort];
        int i3 = 0;
        while (i2 < iBytesToShort) {
            bArr3[i3] = Byte.valueOf(bArr2[i2]);
            i2++;
            i3++;
        }
        LoggerList<Byte> loggerList = new LoggerList<>();
        Collections.addAll(loggerList, bArr3);
        LoggerList<Byte> loggerList2 = this.d;
        if (loggerList2 == null || loggerList2.size() <= 0) {
            this.d = parsingTextureLog(loggerList);
            return true;
        }
        this.d.addAll(loggerList);
        this.d = parsingTextureLog(this.d);
        return true;
    }

    public synchronized LoggerList<Byte> parsingTextureLog(LoggerList<Byte> loggerList) {
        while (loggerList.size() > 0) {
            int iIndexOf = loggerList.indexOf((byte) -85);
            if (iIndexOf == -1) {
                return loggerList;
            }
            loggerList.removeRange(0, iIndexOf);
            if (loggerList.size() < this.e) {
                return loggerList;
            }
            byte bByteValue = loggerList.get(0).byteValue();
            byte bByteValue2 = loggerList.get(1).byteValue();
            int iBytesToInt = Converter.BytesToInt(loggerList.get(3).byteValue(), loggerList.get(2).byteValue());
            if (loggerList.size() - this.e < iBytesToInt) {
                return loggerList;
            }
            int i2 = bByteValue2 & 255;
            if (i2 != 16) {
                loggerList.removeRange(0, iBytesToInt);
            } else {
                Log.d(i, "parsingTextureLog raw.size=" + loggerList.size());
                Log.d(i, "parsingTextureLog texture length=" + iBytesToInt);
                loggerList.removeRange(0, 4);
                loggerList.removeRange(0, this.f);
                int i3 = iBytesToInt - this.f;
                if ((bByteValue & 255) == 171 && i2 == 16) {
                    addLogToTextureQueue(Converter.hexToAsciiString(loggerList.subArray(0, i3, loggerList)).replaceAll("\\[.*\\]:", ""));
                    loggerList.removeRange(0, i3);
                } else {
                    loggerList.removeRange(0, i3);
                }
            }
        }
        return loggerList;
    }
}
