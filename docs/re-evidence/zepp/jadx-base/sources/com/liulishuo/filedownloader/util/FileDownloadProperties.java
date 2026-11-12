package com.liulishuo.filedownloader.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadProperties {
    private static final String a = "http.lenient";
    private static final String b = "process.non-separate";
    private static final String c = "download.min-progress-step";
    private static final String d = "download.min-progress-time";
    private static final String e = "download.max-network-thread-count";
    private static final String f = "file.non-pre-allocation";
    private static final String g = "broadcast.completed";
    private static final String h = "download.trial-connection-head-method";
    private static final String i = "true";
    private static final String j = "false";
    public final boolean broadcastCompleted;
    public final int downloadMaxNetworkThreadCount;
    public final int downloadMinProgressStep;
    public final long downloadMinProgressTime;
    public final boolean fileNonPreAllocation;
    public final boolean httpLenient;
    public final boolean processNonSeparate;
    public final boolean trialConnectionHeadMethod;

    public static class HolderClass {
        private static final FileDownloadProperties a = new FileDownloadProperties();
    }

    public static FileDownloadProperties getImpl() {
        return HolderClass.a;
    }

    public static int getValidNetworkThreadCount(int i2) {
        if (i2 > 12) {
            FileDownloadLog.w(FileDownloadProperties.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i2), 12, 12);
            return 12;
        }
        if (i2 >= 1) {
            return i2;
        }
        FileDownloadLog.w(FileDownloadProperties.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i2), 1, 1);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:104:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:122:0x0211  */
    /* JADX WARN: Code duplicated, block: B:125:0x0217  */
    /* JADX WARN: Code duplicated, block: B:139:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[Catch: all -> 0x0296, TryCatch #8 {all -> 0x0296, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1 A[Catch: all -> 0x0296, TryCatch #8 {all -> 0x0296, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #8 {all -> 0x0296, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x018d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:96:0x0198  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    private FileDownloadProperties() throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        String property;
        String property2;
        String property3;
        String property4;
        String property5;
        String property6;
        String property7;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r10;
        int i2;
        ?? r9;
        String str5;
        String property8;
        if (FileDownloadHelper.getAppContext() == null) {
            throw new IllegalStateException("Please invoke the 'FileDownloader#setup' before using FileDownloader. If you want to register some components on FileDownloader please invoke the 'FileDownloader#setupOnApplicationOnCreate' on the 'Application#onCreate' first.");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Properties properties = new Properties();
        try {
            inputStreamOpen = FileDownloadHelper.getAppContext().getAssets().open("filedownloader.properties");
            if (inputStreamOpen != null) {
                try {
                    try {
                        properties.load(inputStreamOpen);
                        property = properties.getProperty(a);
                        try {
                            property2 = properties.getProperty(b);
                            try {
                                property3 = properties.getProperty(c);
                                try {
                                    property4 = properties.getProperty(d);
                                    try {
                                        property5 = properties.getProperty(e);
                                        try {
                                            property6 = properties.getProperty(f);
                                            try {
                                                property7 = properties.getProperty(g);
                                                try {
                                                    str5 = property2;
                                                    property8 = properties.getProperty(h);
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    if (e instanceof FileNotFoundException) {
                                                        e.printStackTrace();
                                                    } else if (FileDownloadLog.NEED_LOG) {
                                                        FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                                                    }
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (IOException e3) {
                                                            e3.printStackTrace();
                                                        }
                                                    }
                                                    str = property2;
                                                    str2 = property6;
                                                    str3 = property7;
                                                    property = property;
                                                    str4 = null;
                                                }
                                            } catch (IOException e4) {
                                                e = e4;
                                                property7 = null;
                                                if (e instanceof FileNotFoundException) {
                                                    e.printStackTrace();
                                                } else if (FileDownloadLog.NEED_LOG) {
                                                    FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                                                }
                                                if (inputStreamOpen != null) {
                                                    inputStreamOpen.close();
                                                }
                                                str = property2;
                                                str2 = property6;
                                                str3 = property7;
                                                property = property;
                                                str4 = null;
                                                if (property == null) {
                                                    if (property.equals("true")) {
                                                    }
                                                    r10 = 0;
                                                    this.httpLenient = property.equals("true");
                                                } else {
                                                    r10 = 0;
                                                    this.httpLenient = false;
                                                }
                                                if (str == null) {
                                                    if (str.equals("true")) {
                                                    }
                                                    this.processNonSeparate = str.equals("true");
                                                } else {
                                                    this.processNonSeparate = r10;
                                                }
                                                if (property3 != null) {
                                                    this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                                } else {
                                                    this.downloadMinProgressStep = 65536;
                                                }
                                                if (property4 != null) {
                                                    this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                                                } else {
                                                    this.downloadMinProgressTime = 2000L;
                                                }
                                                if (property5 != null) {
                                                    this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                                                    i2 = 3;
                                                } else {
                                                    i2 = 3;
                                                    this.downloadMaxNetworkThreadCount = 3;
                                                }
                                                if (str2 == null) {
                                                    if (str2.equals("true")) {
                                                    }
                                                    r9 = 0;
                                                    this.fileNonPreAllocation = str2.equals("true");
                                                } else {
                                                    r9 = 0;
                                                    this.fileNonPreAllocation = false;
                                                }
                                                if (str3 == null) {
                                                    if (str3.equals("true")) {
                                                    }
                                                    this.broadcastCompleted = str3.equals("true");
                                                } else {
                                                    this.broadcastCompleted = r9;
                                                }
                                                if (str4 == null) {
                                                    if (str4.equals("true")) {
                                                    }
                                                    this.trialConnectionHeadMethod = str4.equals("true");
                                                } else {
                                                    this.trialConnectionHeadMethod = r9;
                                                }
                                                if (FileDownloadLog.NEED_LOG) {
                                                    Object[] objArr = new Object[17];
                                                    objArr[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                                    objArr[1] = a;
                                                    objArr[2] = Boolean.valueOf(this.httpLenient);
                                                    objArr[3] = b;
                                                    objArr[4] = Boolean.valueOf(this.processNonSeparate);
                                                    objArr[5] = c;
                                                    objArr[6] = Integer.valueOf(this.downloadMinProgressStep);
                                                    objArr[7] = d;
                                                    objArr[8] = Long.valueOf(this.downloadMinProgressTime);
                                                    objArr[9] = e;
                                                    objArr[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                                                    objArr[11] = f;
                                                    objArr[12] = Boolean.valueOf(this.fileNonPreAllocation);
                                                    objArr[13] = g;
                                                    objArr[14] = Boolean.valueOf(this.broadcastCompleted);
                                                    objArr[15] = h;
                                                    objArr[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                                                    FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr);
                                                }
                                            }
                                        } catch (IOException e5) {
                                            e = e5;
                                            property6 = null;
                                            property7 = null;
                                            if (e instanceof FileNotFoundException) {
                                                e.printStackTrace();
                                            } else if (FileDownloadLog.NEED_LOG) {
                                                FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                                            }
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                            str = property2;
                                            str2 = property6;
                                            str3 = property7;
                                            property = property;
                                            str4 = null;
                                            if (property == null) {
                                                if (property.equals("true")) {
                                                }
                                                r10 = 0;
                                                this.httpLenient = property.equals("true");
                                            } else {
                                                r10 = 0;
                                                this.httpLenient = false;
                                            }
                                            if (str == null) {
                                                if (str.equals("true")) {
                                                }
                                                this.processNonSeparate = str.equals("true");
                                            } else {
                                                this.processNonSeparate = r10;
                                            }
                                            if (property3 != null) {
                                                this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                            } else {
                                                this.downloadMinProgressStep = 65536;
                                            }
                                            if (property4 != null) {
                                                this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                                            } else {
                                                this.downloadMinProgressTime = 2000L;
                                            }
                                            if (property5 != null) {
                                                this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                                                i2 = 3;
                                            } else {
                                                i2 = 3;
                                                this.downloadMaxNetworkThreadCount = 3;
                                            }
                                            if (str2 == null) {
                                                if (str2.equals("true")) {
                                                }
                                                r9 = 0;
                                                this.fileNonPreAllocation = str2.equals("true");
                                            } else {
                                                r9 = 0;
                                                this.fileNonPreAllocation = false;
                                            }
                                            if (str3 == null) {
                                                if (str3.equals("true")) {
                                                }
                                                this.broadcastCompleted = str3.equals("true");
                                            } else {
                                                this.broadcastCompleted = r9;
                                            }
                                            if (str4 == null) {
                                                if (str4.equals("true")) {
                                                }
                                                this.trialConnectionHeadMethod = str4.equals("true");
                                            } else {
                                                this.trialConnectionHeadMethod = r9;
                                            }
                                            if (FileDownloadLog.NEED_LOG) {
                                                Object[] objArr2 = new Object[17];
                                                objArr2[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                                objArr2[1] = a;
                                                objArr2[2] = Boolean.valueOf(this.httpLenient);
                                                objArr2[3] = b;
                                                objArr2[4] = Boolean.valueOf(this.processNonSeparate);
                                                objArr2[5] = c;
                                                objArr2[6] = Integer.valueOf(this.downloadMinProgressStep);
                                                objArr2[7] = d;
                                                objArr2[8] = Long.valueOf(this.downloadMinProgressTime);
                                                objArr2[9] = e;
                                                objArr2[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                                                objArr2[11] = f;
                                                objArr2[12] = Boolean.valueOf(this.fileNonPreAllocation);
                                                objArr2[13] = g;
                                                objArr2[14] = Boolean.valueOf(this.broadcastCompleted);
                                                objArr2[15] = h;
                                                objArr2[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                                                FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr2);
                                            }
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        property5 = null;
                                        property6 = null;
                                        property7 = null;
                                        if (e instanceof FileNotFoundException) {
                                            e.printStackTrace();
                                        } else if (FileDownloadLog.NEED_LOG) {
                                            FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                                        }
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                        str = property2;
                                        str2 = property6;
                                        str3 = property7;
                                        property = property;
                                        str4 = null;
                                        if (property == null) {
                                            if (property.equals("true")) {
                                            }
                                            r10 = 0;
                                            this.httpLenient = property.equals("true");
                                        } else {
                                            r10 = 0;
                                            this.httpLenient = false;
                                        }
                                        if (str == null) {
                                            if (str.equals("true")) {
                                            }
                                            this.processNonSeparate = str.equals("true");
                                        } else {
                                            this.processNonSeparate = r10;
                                        }
                                        if (property3 != null) {
                                            this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                        } else {
                                            this.downloadMinProgressStep = 65536;
                                        }
                                        if (property4 != null) {
                                            this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                                        } else {
                                            this.downloadMinProgressTime = 2000L;
                                        }
                                        if (property5 != null) {
                                            this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                                            i2 = 3;
                                        } else {
                                            i2 = 3;
                                            this.downloadMaxNetworkThreadCount = 3;
                                        }
                                        if (str2 == null) {
                                            if (str2.equals("true")) {
                                            }
                                            r9 = 0;
                                            this.fileNonPreAllocation = str2.equals("true");
                                        } else {
                                            r9 = 0;
                                            this.fileNonPreAllocation = false;
                                        }
                                        if (str3 == null) {
                                            if (str3.equals("true")) {
                                            }
                                            this.broadcastCompleted = str3.equals("true");
                                        } else {
                                            this.broadcastCompleted = r9;
                                        }
                                        if (str4 == null) {
                                            if (str4.equals("true")) {
                                            }
                                            this.trialConnectionHeadMethod = str4.equals("true");
                                        } else {
                                            this.trialConnectionHeadMethod = r9;
                                        }
                                        if (FileDownloadLog.NEED_LOG) {
                                            Object[] objArr3 = new Object[17];
                                            objArr3[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                            objArr3[1] = a;
                                            objArr3[2] = Boolean.valueOf(this.httpLenient);
                                            objArr3[3] = b;
                                            objArr3[4] = Boolean.valueOf(this.processNonSeparate);
                                            objArr3[5] = c;
                                            objArr3[6] = Integer.valueOf(this.downloadMinProgressStep);
                                            objArr3[7] = d;
                                            objArr3[8] = Long.valueOf(this.downloadMinProgressTime);
                                            objArr3[9] = e;
                                            objArr3[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                                            objArr3[11] = f;
                                            objArr3[12] = Boolean.valueOf(this.fileNonPreAllocation);
                                            objArr3[13] = g;
                                            objArr3[14] = Boolean.valueOf(this.broadcastCompleted);
                                            objArr3[15] = h;
                                            objArr3[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                                            FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr3);
                                        }
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    property4 = null;
                                    property5 = null;
                                    property6 = null;
                                    property7 = null;
                                    if (e instanceof FileNotFoundException) {
                                        e.printStackTrace();
                                    } else if (FileDownloadLog.NEED_LOG) {
                                        FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                                    }
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                    str = property2;
                                    str2 = property6;
                                    str3 = property7;
                                    property = property;
                                    str4 = null;
                                    if (property == null) {
                                        if (property.equals("true")) {
                                        }
                                        r10 = 0;
                                        this.httpLenient = property.equals("true");
                                    } else {
                                        r10 = 0;
                                        this.httpLenient = false;
                                    }
                                    if (str == null) {
                                        if (str.equals("true")) {
                                        }
                                        this.processNonSeparate = str.equals("true");
                                    } else {
                                        this.processNonSeparate = r10;
                                    }
                                    if (property3 != null) {
                                        this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                    } else {
                                        this.downloadMinProgressStep = 65536;
                                    }
                                    if (property4 != null) {
                                        this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                                    } else {
                                        this.downloadMinProgressTime = 2000L;
                                    }
                                    if (property5 != null) {
                                        this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                                        i2 = 3;
                                    } else {
                                        i2 = 3;
                                        this.downloadMaxNetworkThreadCount = 3;
                                    }
                                    if (str2 == null) {
                                        if (str2.equals("true")) {
                                        }
                                        r9 = 0;
                                        this.fileNonPreAllocation = str2.equals("true");
                                    } else {
                                        r9 = 0;
                                        this.fileNonPreAllocation = false;
                                    }
                                    if (str3 == null) {
                                        if (str3.equals("true")) {
                                        }
                                        this.broadcastCompleted = str3.equals("true");
                                    } else {
                                        this.broadcastCompleted = r9;
                                    }
                                    if (str4 == null) {
                                        if (str4.equals("true")) {
                                        }
                                        this.trialConnectionHeadMethod = str4.equals("true");
                                    } else {
                                        this.trialConnectionHeadMethod = r9;
                                    }
                                    if (FileDownloadLog.NEED_LOG) {
                                        Object[] objArr4 = new Object[17];
                                        objArr4[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                        objArr4[1] = a;
                                        objArr4[2] = Boolean.valueOf(this.httpLenient);
                                        objArr4[3] = b;
                                        objArr4[4] = Boolean.valueOf(this.processNonSeparate);
                                        objArr4[5] = c;
                                        objArr4[6] = Integer.valueOf(this.downloadMinProgressStep);
                                        objArr4[7] = d;
                                        objArr4[8] = Long.valueOf(this.downloadMinProgressTime);
                                        objArr4[9] = e;
                                        objArr4[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                                        objArr4[11] = f;
                                        objArr4[12] = Boolean.valueOf(this.fileNonPreAllocation);
                                        objArr4[13] = g;
                                        objArr4[14] = Boolean.valueOf(this.broadcastCompleted);
                                        objArr4[15] = h;
                                        objArr4[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                                        FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr4);
                                    }
                                }
                            } catch (IOException e8) {
                                e = e8;
                                property3 = null;
                                property4 = null;
                                property5 = null;
                                property6 = null;
                                property7 = null;
                                if (e instanceof FileNotFoundException) {
                                    e.printStackTrace();
                                } else if (FileDownloadLog.NEED_LOG) {
                                    FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                                }
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                                str = property2;
                                str2 = property6;
                                str3 = property7;
                                property = property;
                                str4 = null;
                                if (property == null) {
                                    if (property.equals("true")) {
                                    }
                                    r10 = 0;
                                    this.httpLenient = property.equals("true");
                                } else {
                                    r10 = 0;
                                    this.httpLenient = false;
                                }
                                if (str == null) {
                                    if (str.equals("true")) {
                                    }
                                    this.processNonSeparate = str.equals("true");
                                } else {
                                    this.processNonSeparate = r10;
                                }
                                if (property3 != null) {
                                    this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                                } else {
                                    this.downloadMinProgressStep = 65536;
                                }
                                if (property4 != null) {
                                    this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                                } else {
                                    this.downloadMinProgressTime = 2000L;
                                }
                                if (property5 != null) {
                                    this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                                    i2 = 3;
                                } else {
                                    i2 = 3;
                                    this.downloadMaxNetworkThreadCount = 3;
                                }
                                if (str2 == null) {
                                    if (str2.equals("true")) {
                                    }
                                    r9 = 0;
                                    this.fileNonPreAllocation = str2.equals("true");
                                } else {
                                    r9 = 0;
                                    this.fileNonPreAllocation = false;
                                }
                                if (str3 == null) {
                                    if (str3.equals("true")) {
                                    }
                                    this.broadcastCompleted = str3.equals("true");
                                } else {
                                    this.broadcastCompleted = r9;
                                }
                                if (str4 == null) {
                                    if (str4.equals("true")) {
                                    }
                                    this.trialConnectionHeadMethod = str4.equals("true");
                                } else {
                                    this.trialConnectionHeadMethod = r9;
                                }
                                if (FileDownloadLog.NEED_LOG) {
                                    Object[] objArr5 = new Object[17];
                                    objArr5[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                    objArr5[1] = a;
                                    objArr5[2] = Boolean.valueOf(this.httpLenient);
                                    objArr5[3] = b;
                                    objArr5[4] = Boolean.valueOf(this.processNonSeparate);
                                    objArr5[5] = c;
                                    objArr5[6] = Integer.valueOf(this.downloadMinProgressStep);
                                    objArr5[7] = d;
                                    objArr5[8] = Long.valueOf(this.downloadMinProgressTime);
                                    objArr5[9] = e;
                                    objArr5[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                                    objArr5[11] = f;
                                    objArr5[12] = Boolean.valueOf(this.fileNonPreAllocation);
                                    objArr5[13] = g;
                                    objArr5[14] = Boolean.valueOf(this.broadcastCompleted);
                                    objArr5[15] = h;
                                    objArr5[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                                    FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr5);
                                }
                            }
                        } catch (IOException e9) {
                            e = e9;
                            property2 = null;
                            property3 = null;
                            property4 = null;
                            property5 = null;
                            property6 = null;
                            property7 = null;
                            if (e instanceof FileNotFoundException) {
                                e.printStackTrace();
                            } else if (FileDownloadLog.NEED_LOG) {
                                FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            str = property2;
                            str2 = property6;
                            str3 = property7;
                            property = property;
                            str4 = null;
                            if (property == null) {
                                if (property.equals("true")) {
                                }
                                r10 = 0;
                                this.httpLenient = property.equals("true");
                            } else {
                                r10 = 0;
                                this.httpLenient = false;
                            }
                            if (str == null) {
                                if (str.equals("true")) {
                                }
                                this.processNonSeparate = str.equals("true");
                            } else {
                                this.processNonSeparate = r10;
                            }
                            if (property3 != null) {
                                this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                            } else {
                                this.downloadMinProgressStep = 65536;
                            }
                            if (property4 != null) {
                                this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                            } else {
                                this.downloadMinProgressTime = 2000L;
                            }
                            if (property5 != null) {
                                this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                                i2 = 3;
                            } else {
                                i2 = 3;
                                this.downloadMaxNetworkThreadCount = 3;
                            }
                            if (str2 == null) {
                                if (str2.equals("true")) {
                                }
                                r9 = 0;
                                this.fileNonPreAllocation = str2.equals("true");
                            } else {
                                r9 = 0;
                                this.fileNonPreAllocation = false;
                            }
                            if (str3 == null) {
                                if (str3.equals("true")) {
                                }
                                this.broadcastCompleted = str3.equals("true");
                            } else {
                                this.broadcastCompleted = r9;
                            }
                            if (str4 == null) {
                                if (str4.equals("true")) {
                                }
                                this.trialConnectionHeadMethod = str4.equals("true");
                            } else {
                                this.trialConnectionHeadMethod = r9;
                            }
                            if (FileDownloadLog.NEED_LOG) {
                                Object[] objArr6 = new Object[17];
                                objArr6[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                                objArr6[1] = a;
                                objArr6[2] = Boolean.valueOf(this.httpLenient);
                                objArr6[3] = b;
                                objArr6[4] = Boolean.valueOf(this.processNonSeparate);
                                objArr6[5] = c;
                                objArr6[6] = Integer.valueOf(this.downloadMinProgressStep);
                                objArr6[7] = d;
                                objArr6[8] = Long.valueOf(this.downloadMinProgressTime);
                                objArr6[9] = e;
                                objArr6[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                                objArr6[11] = f;
                                objArr6[12] = Boolean.valueOf(this.fileNonPreAllocation);
                                objArr6[13] = g;
                                objArr6[14] = Boolean.valueOf(this.broadcastCompleted);
                                objArr6[15] = h;
                                objArr6[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                                FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr6);
                            }
                        }
                    } catch (IOException e10) {
                        e = e10;
                        property = null;
                        property2 = null;
                        property3 = null;
                        property4 = null;
                        property5 = null;
                        property6 = null;
                        property7 = null;
                        if (e instanceof FileNotFoundException) {
                            e.printStackTrace();
                        } else if (FileDownloadLog.NEED_LOG) {
                            FileDownloadLog.d(FileDownloadProperties.class, "not found filedownloader.properties", new Object[0]);
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        str = property2;
                        str2 = property6;
                        str3 = property7;
                        property = property;
                        str4 = null;
                        if (property == null) {
                            if (property.equals("true")) {
                            }
                            r10 = 0;
                            this.httpLenient = property.equals("true");
                        } else {
                            r10 = 0;
                            this.httpLenient = false;
                        }
                        if (str == null) {
                            if (str.equals("true")) {
                            }
                            this.processNonSeparate = str.equals("true");
                        } else {
                            this.processNonSeparate = r10;
                        }
                        if (property3 != null) {
                            this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
                        } else {
                            this.downloadMinProgressStep = 65536;
                        }
                        if (property4 != null) {
                            this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
                        } else {
                            this.downloadMinProgressTime = 2000L;
                        }
                        if (property5 != null) {
                            this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
                            i2 = 3;
                        } else {
                            i2 = 3;
                            this.downloadMaxNetworkThreadCount = 3;
                        }
                        if (str2 == null) {
                            if (str2.equals("true")) {
                            }
                            r9 = 0;
                            this.fileNonPreAllocation = str2.equals("true");
                        } else {
                            r9 = 0;
                            this.fileNonPreAllocation = false;
                        }
                        if (str3 == null) {
                            if (str3.equals("true")) {
                            }
                            this.broadcastCompleted = str3.equals("true");
                        } else {
                            this.broadcastCompleted = r9;
                        }
                        if (str4 == null) {
                            if (str4.equals("true")) {
                            }
                            this.trialConnectionHeadMethod = str4.equals("true");
                        } else {
                            this.trialConnectionHeadMethod = r9;
                        }
                        if (FileDownloadLog.NEED_LOG) {
                            Object[] objArr7 = new Object[17];
                            objArr7[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                            objArr7[1] = a;
                            objArr7[2] = Boolean.valueOf(this.httpLenient);
                            objArr7[3] = b;
                            objArr7[4] = Boolean.valueOf(this.processNonSeparate);
                            objArr7[5] = c;
                            objArr7[6] = Integer.valueOf(this.downloadMinProgressStep);
                            objArr7[7] = d;
                            objArr7[8] = Long.valueOf(this.downloadMinProgressTime);
                            objArr7[9] = e;
                            objArr7[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
                            objArr7[11] = f;
                            objArr7[12] = Boolean.valueOf(this.fileNonPreAllocation);
                            objArr7[13] = g;
                            objArr7[14] = Boolean.valueOf(this.broadcastCompleted);
                            objArr7[15] = h;
                            objArr7[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
                            FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr7);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStreamOpen == null) {
                        throw th;
                    }
                    try {
                        inputStreamOpen.close();
                        throw th;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        throw th;
                    }
                }
            } else {
                property = null;
                str5 = null;
                property8 = null;
                property3 = null;
                property4 = null;
                property5 = null;
                property6 = null;
                property7 = null;
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            str = str5;
            str4 = property8;
            str2 = property6;
            str3 = property7;
        } catch (IOException e13) {
            e = e13;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
        if (property == null) {
            r10 = 0;
            this.httpLenient = false;
        } else {
            if (property.equals("true") && !property.equals("false")) {
                throw new IllegalStateException(FileDownloadUtils.formatString("the value of '%s' must be '%s' or '%s'", a, "true", "false"));
            }
            r10 = 0;
            this.httpLenient = property.equals("true");
        }
        if (str == null) {
            this.processNonSeparate = r10;
        } else {
            if (str.equals("true") && !str.equals("false")) {
                Object[] objArr8 = new Object[3];
                objArr8[r10] = b;
                objArr8[1] = "true";
                objArr8[2] = "false";
                throw new IllegalStateException(FileDownloadUtils.formatString("the value of '%s' must be '%s' or '%s'", objArr8));
            }
            this.processNonSeparate = str.equals("true");
        }
        if (property3 != null) {
            this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(property3).intValue());
        } else {
            this.downloadMinProgressStep = 65536;
        }
        if (property4 != null) {
            this.downloadMinProgressTime = Math.max(0L, Long.valueOf(property4).longValue());
        } else {
            this.downloadMinProgressTime = 2000L;
        }
        if (property5 != null) {
            this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(property5).intValue());
            i2 = 3;
        } else {
            i2 = 3;
            this.downloadMaxNetworkThreadCount = 3;
        }
        if (str2 == null) {
            r9 = 0;
            this.fileNonPreAllocation = false;
        } else {
            if (str2.equals("true") && !str2.equals("false")) {
                Object[] objArr9 = new Object[i2];
                objArr9[0] = f;
                objArr9[1] = "true";
                objArr9[2] = "false";
                throw new IllegalStateException(FileDownloadUtils.formatString("the value of '%s' must be '%s' or '%s'", objArr9));
            }
            r9 = 0;
            this.fileNonPreAllocation = str2.equals("true");
        }
        if (str3 == null) {
            this.broadcastCompleted = r9;
        } else {
            if (str3.equals("true") && !str3.equals("false")) {
                Object[] objArr10 = new Object[3];
                objArr10[r9] = g;
                objArr10[1] = "true";
                objArr10[2] = "false";
                throw new IllegalStateException(FileDownloadUtils.formatString("the value of '%s' must be '%s' or '%s'", objArr10));
            }
            this.broadcastCompleted = str3.equals("true");
        }
        if (str4 == null) {
            this.trialConnectionHeadMethod = r9;
        } else {
            if (str4.equals("true") && !str4.equals("false")) {
                Object[] objArr11 = new Object[3];
                objArr11[r9] = h;
                objArr11[1] = "true";
                objArr11[2] = "false";
                throw new IllegalStateException(FileDownloadUtils.formatString("the value of '%s' must be '%s' or '%s'", objArr11));
            }
            this.trialConnectionHeadMethod = str4.equals("true");
        }
        if (FileDownloadLog.NEED_LOG) {
            Object[] objArr12 = new Object[17];
            objArr12[r9] = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            objArr12[1] = a;
            objArr12[2] = Boolean.valueOf(this.httpLenient);
            objArr12[3] = b;
            objArr12[4] = Boolean.valueOf(this.processNonSeparate);
            objArr12[5] = c;
            objArr12[6] = Integer.valueOf(this.downloadMinProgressStep);
            objArr12[7] = d;
            objArr12[8] = Long.valueOf(this.downloadMinProgressTime);
            objArr12[9] = e;
            objArr12[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
            objArr12[11] = f;
            objArr12[12] = Boolean.valueOf(this.fileNonPreAllocation);
            objArr12[13] = g;
            objArr12[14] = Boolean.valueOf(this.broadcastCompleted);
            objArr12[15] = h;
            objArr12[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
            FileDownloadLog.i(FileDownloadProperties.class, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr12);
        }
    }
}
