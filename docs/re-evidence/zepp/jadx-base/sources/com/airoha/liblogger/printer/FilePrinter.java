package com.airoha.liblogger.printer;

import android.os.Environment;
import android.util.Log;
import com.airoha.liblogger.LogInfo;
import com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FilePrinter implements IPrinter {
    public static final String e = "FilePrinter";
    public String a;
    public File b;
    public FileOutputStream c;
    public boolean d;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LogInfo.LOG_TYPE.values().length];
            a = iArr;
            try {
                iArr[LogInfo.LOG_TYPE.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LogInfo.LOG_TYPE.BINARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void a(String str) {
        try {
            this.c.write(str.getBytes());
        } catch (Exception e2) {
            Log.e(e, e2.getMessage());
        }
    }

    public void b(byte[] bArr) {
        try {
            this.c.write(bArr);
        } catch (Exception e2) {
            Log.e(e, e2.getMessage());
        }
    }

    @Override // com.airoha.liblogger.printer.IPrinter
    public void destroy() {
        try {
            FileOutputStream fileOutputStream = this.c;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (Exception e2) {
            Log.e(e, e2.getMessage());
        }
    }

    @Override // com.airoha.liblogger.printer.IPrinter
    public String getPrinterName() {
        return this.a;
    }

    @Override // com.airoha.liblogger.printer.IPrinter
    public boolean init(HashMap<String, String> map) {
        String str;
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("Airoha");
        sb.append(str3);
        sb.append("AB155x");
        String string = sb.toString();
        if (map.get("file_name") != null) {
            str = map.get(FileDownloadModel.FILENAME);
            this.d = false;
        } else if (map.get(WeChatBindSuccessFragment.DEVICE_NAME) != null) {
            str = str2 + "_" + map.get(WeChatBindSuccessFragment.DEVICE_NAME) + ".txt";
            this.d = true;
        } else {
            str = str2 + "_AirohaLog_.txt";
            this.d = true;
        }
        try {
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(string, str);
            this.b = file2;
            if (!file2.exists()) {
                this.b.createNewFile();
            }
            this.c = new FileOutputStream(this.b, true);
            this.a = str;
            return true;
        } catch (Exception e2) {
            Log.e(e, e2.getMessage());
            return false;
        }
    }

    @Override // com.airoha.liblogger.printer.IPrinter
    public void print(LogInfo logInfo) {
        if (this.d || logInfo.getTargetPrinterName() == this.a) {
            int i = a.a[logInfo.getLogType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                b(logInfo.getRaw());
                return;
            }
            a(new SimpleDateFormat("yyyyMMdd_HH:mm:ss.SSS").format(logInfo.getTimeStamp()) + "--" + logInfo.getTag() + ":" + logInfo.getText() + "\n");
        }
    }
}
