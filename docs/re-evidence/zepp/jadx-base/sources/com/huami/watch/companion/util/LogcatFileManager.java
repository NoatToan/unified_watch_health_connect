package com.huami.watch.companion.util;

import android.os.Process;
import com.huami.watch.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class LogcatFileManager {
    private static final String f = "Util-LogcatManager";
    private static LogcatFileManager g;
    public static boolean sIsEnabled;
    private File a;
    private a b = null;
    private long d = 25165824;
    private SimpleDateFormat e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private int c = Process.myPid();

    public class a extends Thread {
        private Process a;
        private BufferedReader b = null;
        private boolean c = true;
        public String d;
        private String e;
        private FileOutputStream f;
        private File g;

        public a(String str, File file) {
            this.d = null;
            this.f = null;
            this.e = str;
            try {
                this.g = file;
                this.f = new FileOutputStream(file, true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            this.d = "logcat *:e *:i | grep \"(" + this.e + ")\"";
        }

        public void a() {
            this.c = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String line;
            try {
                try {
                    LogcatFileManager.sIsEnabled = true;
                    this.a = Runtime.getRuntime().exec(this.d);
                    this.b = new BufferedReader(new InputStreamReader(this.a.getInputStream()), 1024);
                    while (this.c && (line = this.b.readLine()) != null && this.c) {
                        if (line.length() != 0) {
                            FileOutputStream fileOutputStream = this.f;
                            if (fileOutputStream == null || fileOutputStream.getChannel().size() > LogcatFileManager.this.d) {
                                Log.d(LogcatFileManager.f, "LogcatFileManager: 文件超过大小限制,重新创建", new Object[0]);
                                FileOutputStream fileOutputStream2 = this.f;
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (this.g.exists()) {
                                    this.g.delete();
                                }
                                if (!this.g.exists()) {
                                    try {
                                        this.g.createNewFile();
                                        this.f = new FileOutputStream(this.g, true);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } else if (line.contains(this.e)) {
                                this.f.write((LogcatFileManager.this.e.format(new Date()) + "  " + line + "\n").getBytes());
                            }
                        }
                    }
                    Process process = this.a;
                    if (process != null) {
                        process.destroy();
                        this.a = null;
                    }
                    BufferedReader bufferedReader = this.b;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            this.b = null;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    FileOutputStream fileOutputStream3 = this.f;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        this.f = null;
                    }
                    Log.d(LogcatFileManager.f, "LogcatFileManager: LogDumper:关闭资源", new Object[0]);
                } catch (IOException e4) {
                    e4.printStackTrace();
                    Process process2 = this.a;
                    if (process2 != null) {
                        process2.destroy();
                        this.a = null;
                    }
                    BufferedReader bufferedReader2 = this.b;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                            this.b = null;
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    FileOutputStream fileOutputStream4 = this.f;
                    if (fileOutputStream4 != null) {
                        try {
                            fileOutputStream4.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        this.f = null;
                    }
                    Log.d(LogcatFileManager.f, "LogcatFileManager: LogDumper:关闭资源", new Object[0]);
                }
                LogcatFileManager.sIsEnabled = false;
            } catch (Throwable th) {
                Process process3 = this.a;
                if (process3 != null) {
                    process3.destroy();
                    this.a = null;
                }
                BufferedReader bufferedReader3 = this.b;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                        this.b = null;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                FileOutputStream fileOutputStream5 = this.f;
                if (fileOutputStream5 != null) {
                    try {
                        fileOutputStream5.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    this.f = null;
                }
                Log.d(LogcatFileManager.f, "LogcatFileManager: LogDumper:关闭资源", new Object[0]);
                LogcatFileManager.sIsEnabled = false;
                throw th;
            }
        }
    }

    private LogcatFileManager() {
    }

    public static LogcatFileManager get() {
        if (g == null) {
            g = new LogcatFileManager();
        }
        return g;
    }

    public void start(File file) {
        Log.d(f, "Start Save Logcat to File: " + file, new Object[0]);
        if (file == null) {
            return;
        }
        this.a = file;
        stop();
        if (this.b == null) {
            this.b = new a(String.valueOf(this.c), this.a);
        }
        this.b.start();
    }

    public void stop() {
        Log.d(f, "Stop Save Logcat!!", new Object[0]);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
        }
    }
}
