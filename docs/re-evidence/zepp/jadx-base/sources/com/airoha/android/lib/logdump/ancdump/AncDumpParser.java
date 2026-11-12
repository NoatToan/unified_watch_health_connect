package com.airoha.android.lib.logdump.ancdump;

import android.os.Environment;
import android.util.Log;
import com.airoha.android.lib.logdump.AbstractLogParser;
import com.airoha.android.lib.util.Converter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class AncDumpParser extends AbstractLogParser {
    public static final String k = "AncDumpParser";
    private File d = null;
    private FileOutputStream e = null;
    private File f = null;
    private FileOutputStream g = null;
    private String h;
    private String i;
    private String j;

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public void createLogFile(String str, String str2) {
        this.i = str2;
        this.j = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("Airoha");
        sb.append(str3);
        sb.append("AB155x");
        sb.append(str3);
        sb.append(str);
        this.h = sb.toString();
        File file = new File(this.h);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public void logToFile(byte[] bArr) {
        if (this.d == null || this.f == null) {
            return;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length);
        try {
            this.e.write(bArr2);
            this.g.write(bArr3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.d(k, "FileNotFoundException: " + e.getMessage());
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.d(k, "IOException 2: " + e2.getMessage());
        }
    }

    @Override // com.airoha.android.lib.logdump.AbstractLogParser
    public boolean parseRxDataToQueue(byte[] bArr) {
        byte b = bArr[7];
        byte b2 = bArr[8];
        int iBytesToInt32 = Converter.bytesToInt32(new byte[]{bArr[9], bArr[10], bArr[11], bArr[12]});
        byte b3 = bArr[13];
        int i = iBytesToInt32 * 2;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 14, bArr2, 0, i);
        if (this.d == null) {
            File file = new File(this.h, this.i + "_MainMic_" + this.j + ".pcm");
            this.d = file;
            if (!file.exists()) {
                try {
                    this.d.createNewFile();
                    this.e = new FileOutputStream(this.d, true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.f == null) {
            if (b3 == 3) {
                this.f = new File(this.h, this.i + "_RefMic_" + this.j + ".pcm");
            }
            if (b3 == 5) {
                this.f = new File(this.h, this.i + "_EchoRef_" + this.j + ".pcm");
            }
            if (!this.f.exists()) {
                try {
                    this.f.createNewFile();
                    this.g = new FileOutputStream(this.f, true);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        addLogToQueue(bArr2);
        return true;
    }
}
