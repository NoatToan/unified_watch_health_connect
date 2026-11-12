package clc.utils.debug.slog;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class SlogFile {
    private static SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS");
    private static Handler d;
    private static HandlerThread e;
    private String a;
    private ConcurrentLinkedQueue<Record> b = new ConcurrentLinkedQueue<>();

    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ File b;

        public b(File file) {
            this.b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                Log.i(SlogConfig.STORAGE_NAME, "文件: " + SlogFile.this.a + " 无法创建呢.");
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SlogFile.this.f();
        }
    }

    public class d implements FileFilter {
        public final /* synthetic */ File b;

        public d(File file) {
            this.b = file;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            Log.i(SlogConfig.STORAGE_NAME, "检查文件: " + name);
            if (!name.startsWith(this.b.getName())) {
                return false;
            }
            Log.i(SlogConfig.STORAGE_NAME, "找到文件: " + name);
            return true;
        }
    }

    public class e implements Comparator<File> {
        public e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return file.lastModified() < file2.lastModified() ? -1 : 0;
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ Runnable b;

        public f(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            SlogFile.this.h();
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("slog-file", 10);
        e = handlerThread;
        handlerThread.start();
        d = new a(e.getLooper());
    }

    public SlogFile(String str) {
        this.a = SlogConfig.STORAGE_PATH;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(this.a, str)) {
            this.a = str;
            if (new File(this.a).exists()) {
                Log.i(SlogConfig.STORAGE_NAME, "已经有文件存在于: " + this.a + " , 旧文件可能被覆盖或删除呢.");
            }
        }
        String strSubstring = this.a.substring(0, this.a.lastIndexOf(File.separator));
        File file = new File(strSubstring);
        File file2 = new File(this.a);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.i(SlogConfig.STORAGE_NAME, "文件夹: " + strSubstring + " 无法创建呢.");
            }
        }
        if (file2.exists()) {
            f();
        } else {
            d.post(new b(file2));
        }
    }

    public static void closeUp() {
        Handler handler = d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            d = null;
        }
        HandlerThread handlerThread = e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            e = null;
        }
    }

    private void e(StringBuffer stringBuffer, Record record) {
        if (record != null) {
            stringBuffer.append(record.timeStamp + " " + record.tag + ": => " + record.content + "\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (this) {
            String str = this.a;
            String str2 = File.separator;
            int iLastIndexOf = str.lastIndexOf(str2);
            File file = new File(this.a);
            String strSubstring = this.a.substring(0, iLastIndexOf);
            if (file.length() > 2097152) {
                String str3 = strSubstring + str2 + file.getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + c.format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
                Log.i(SlogConfig.STORAGE_NAME, "文件 " + this.a + " 已超出大小范围. 备份为: " + str3);
                boolean zRenameTo = file.renameTo(new File(str3));
                StringBuilder sb = new StringBuilder();
                sb.append("备份结果: ");
                sb.append(zRenameTo ? "成功" : "失败");
                Log.i(SlogConfig.STORAGE_NAME, sb.toString());
                File[] fileArrListFiles = new File(strSubstring).listFiles(new d(file));
                if (fileArrListFiles.length <= 3) {
                    Log.i(SlogConfig.STORAGE_NAME, "不需要删除文件，现在有: " + fileArrListFiles.length + " , limit : 3");
                    return;
                }
                Collections.sort(Arrays.asList(fileArrListFiles), new e());
                int iMax = Math.max(1, fileArrListFiles.length - 3);
                Log.i(SlogConfig.STORAGE_NAME, "准备删除的文件数目是: " + iMax);
                for (int i = 0; i <= iMax; i++) {
                    Log.i(SlogConfig.STORAGE_NAME, "删除了文件: " + fileArrListFiles[i].getAbsolutePath() + " , 结果: " + fileArrListFiles[i].delete());
                }
            }
        }
    }

    private boolean g() {
        return this.b.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        RandomAccessFile randomAccessFile;
        synchronized (this) {
            try {
                randomAccessFile = new RandomAccessFile(this.a, "rw");
            } catch (FileNotFoundException e2) {
                try {
                    String str = this.a;
                    new File(str.substring(0, str.lastIndexOf(File.separator))).mkdirs();
                    new File(this.a).createNewFile();
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.a, "rw");
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused) {
                        Log.i(SlogConfig.STORAGE_NAME, "file close failed : " + this.a, e2);
                    }
                    randomAccessFile = randomAccessFile2;
                } catch (IOException unused2) {
                    Log.i(SlogConfig.STORAGE_NAME, "file write failed : " + this.a, e2);
                    return;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (Record record : this.b) {
                if (record != null) {
                    e(stringBuffer, record);
                }
            }
            this.b.clear();
            String string = stringBuffer.toString();
            try {
                randomAccessFile.seek(randomAccessFile.length());
                randomAccessFile.write(string.getBytes());
                randomAccessFile.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void d(Record record) {
        this.b.add(record);
        if (g()) {
            i(new c());
        }
    }

    public void i(Runnable runnable) {
        synchronized (this) {
            d.post(new f(runnable));
        }
    }
}
