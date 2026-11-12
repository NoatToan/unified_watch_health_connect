package com.huami.watch.transport.httpsupport.StageFright;

import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes6.dex */
public class SyncProcessManager {
    public static final byte STATE_BEGIN_UPLOAD_TOCLOUD = 3;
    public static final byte STATE_CLOUD_DEC = 9;
    public static final byte STATE_OF_CHECK_ROM_DATA = 7;
    public static final byte STATE_OF_CLEAR = 0;
    public static final byte STATE_OF_COLLECT_INFO = 1;
    public static final byte STATE_OF_END_FAILED = 4;
    public static final byte STATE_OF_END_SUCCESS = 5;
    public static final byte STATE_OF_PREPARING_UPLOADING = 8;
    public static final byte STATE_OF_STATISTICS = 2;
    public static final byte STATE_OF_WAIT_FOR_ROM = 6;
    private static String c = "";
    private static int d;
    private static int e;
    private static volatile SyncProcessManager f;
    private String a;
    private byte b = (byte) 0;

    private SyncProcessManager() {
    }

    private void a(String str) {
        Log.i("yzls", "me -> " + str, new Throwable());
    }

    public static SyncProcessManager getInstance() {
        if (f == null) {
            synchronized (SyncProcessManager.class) {
                if (f == null) {
                    f = new SyncProcessManager();
                }
            }
        }
        return f;
    }

    public void b(String str) {
    }

    public String getCurrPkg() {
        return this.a;
    }

    public int getPercent() {
        int i = e;
        float fMax = i / Math.max(d, i);
        a("percent : " + fMax);
        if (fMax > 1.0f) {
            fMax = 1.0f;
        } else if (fMax < 0.0f) {
            fMax = 0.0f;
        }
        return (int) (fMax * 100.0f);
    }

    public void setCurrPkg(String str) {
        this.a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void tellWith(String str, byte b, int... iArr) {
        String string;
        String str2;
        StringBuilder sb;
        int i;
        int i2 = 0;
        switch (b) {
            case 0:
                d = 0;
                a("正在更新...");
                e = 0;
                string = "正在更新手表数据...";
                c = string;
                this.b = b;
                b(str);
                break;
            case 1:
                str2 = "正在收集手表数据...";
                a(str2);
                this.b = b;
                b(str);
                break;
            case 2:
                str2 = "正在统计...";
                a(str2);
                this.b = b;
                b(str);
                break;
            case 3:
                d = iArr[0];
                a("正在上传云端... [" + e + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + Math.max(d, e) + "]");
                sb = new StringBuilder();
                sb.append("已上传云端 ");
                sb.append(getPercent());
                sb.append("%");
                string = sb.toString();
                c = string;
                this.b = b;
                b(str);
                break;
            case 4:
                str2 = "同步失败";
                a(str2);
                this.b = b;
                b(str);
                break;
            case 5:
                str2 = "同步成功";
                a(str2);
                this.b = b;
                b(str);
                break;
            case 6:
                if (iArr == null || iArr.length <= 0) {
                    i = 0;
                } else {
                    int i3 = iArr[0];
                    if (iArr.length > 1) {
                        i = iArr[1];
                        i2 = i3;
                    } else {
                        i2 = i3;
                        i = 0;
                    }
                }
                int i4 = i2 - i;
                if (i4 != i2) {
                    a("正在同步手表数据... [" + i4 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + i2 + "]");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("正在同步手表数据... ");
                    sb2.append(((int) (((float) i4) / ((float) i2))) * 100);
                    sb2.append("%");
                    string = sb2.toString();
                    c = string;
                    this.b = b;
                    b(str);
                    break;
                }
                break;
            case 7:
                str2 = "检查手表数据...";
                a(str2);
                this.b = b;
                b(str);
                break;
            case 8:
                a("准备上传... " + iArr[0]);
                d = iArr[0];
                this.b = b;
                b(str);
                break;
            case 9:
                int i5 = e + 1;
                e = i5;
                int iMax = Math.max(d, i5);
                if (i5 != iMax) {
                    a("正在上传云端... [" + i5 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + iMax + "]");
                    sb = new StringBuilder();
                    sb.append("已上传云端 ");
                    sb.append(getPercent());
                    sb.append("%");
                    string = sb.toString();
                    c = string;
                }
                this.b = b;
                b(str);
                break;
            default:
                this.b = b;
                b(str);
                break;
        }
    }
}
