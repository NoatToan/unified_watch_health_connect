package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mjj implements MaintenaceInterface {
    private String ac;
    private IBaseResponseCallback i;
    private ByteBuffer o;
    private FileChannel u;
    private FileOutputStream v;
    public static final String e = LogConfig.k() + "MaintenanceLogTemp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41752c = LogConfig.k() + "MaintenanceLog";
    public static final String d = LogConfig.k() + "tempdumplog";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41751b = LogConfig.h();
    private static final byte[] j = new byte[0];
    private static mnm g = null;
    private static mjj h = null;
    private static String f = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<byte[]> f41753a = new ArrayList<>(0);
    private Queue<byte[]> w = new ConcurrentLinkedQueue();
    private Queue<byte[]> l = new ConcurrentLinkedQueue();
    private b x = null;
    private Date m = null;
    private int r = 7;
    private String s = "";
    private String t = "";
    private boolean y = false;
    private String aa = "";
    private Date ab = null;
    private long k = 0;
    private String q = "";
    private String p = "";
    private int n = 0;

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getmTransferDataContentPath() {
        return null;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getmTransferStateContentPath() {
        return null;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public DeviceCommand transferFileEndProcess() {
        return null;
    }

    static /* synthetic */ int h(mjj mjjVar) {
        int i = mjjVar.n;
        mjjVar.n = i + 1;
        return i;
    }

    public static mjj c() {
        mjj mjjVar;
        g = mnm.a();
        synchronized (j) {
            if (h == null) {
                h = new mjj();
            }
            mjjVar = h;
        }
        return mjjVar;
    }

    public static void e() {
        f = "";
    }

    public static void c(String str) {
        f = str;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initName() {
        c("");
        this.aa = "";
        this.ab = null;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public ArrayList filtertFile(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(0);
        if (Utils.o()) {
            ArrayList arrayListD = d(arrayList);
            ReleaseLogUtil.d("MaintenanceUtil", "oversea filtertFileList:", arrayListD.toString());
            return arrayListD;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof String) {
                String lowerCase = ((String) obj).toLowerCase(Locale.ENGLISH);
                boolean z = true;
                boolean z2 = lowerCase.contains("event") || lowerCase.contains(VastAttribute.ERROR) || lowerCase.contains("dump.log");
                if (!lowerCase.contains("power.log") && !lowerCase.contains("fs.log")) {
                    z = false;
                }
                boolean zContains = lowerCase.contains("debug");
                if (z2 || z) {
                    arrayList2.add(arrayList.get(i2));
                }
                if (i == 2 && zContains) {
                    arrayList2.add(arrayList.get(i2));
                }
            }
        }
        return arrayList2;
    }

    private ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(0);
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if ((obj instanceof String) && ((String) obj).toLowerCase(Locale.ENGLISH).contains("event")) {
                arrayList2.add(arrayList.get(i));
            }
        }
        return arrayList2;
    }

    public String e(int i, String str) {
        return (i < 19 || i == 20 || TextUtils.isEmpty(this.q)) ? str : this.q;
    }

    public String c(int i, String str, String str2) {
        this.q = str2;
        return e(i, str);
    }

    public String a(int i, String str) {
        this.q = str;
        return getDeviceName(i);
    }

    public String a() {
        String encryptionLogMark;
        String str;
        String str2;
        String strE = e(this.r, getDeviceName(this.r));
        if (TextUtils.isEmpty(this.ac)) {
            LogUtil.a("MaintenanceUtil", "getMacAddress() size:", BTDeviceMgrUtil.c().e(this.s), " identify size: ", BTDeviceMgrUtil.c().e(this.p), " isOversea is ", Boolean.valueOf(Utils.o()));
            encryptionLogMark = FoundationCommonUtil.getEncryptionLogMark(this.s, this.p, this.r);
        } else {
            encryptionLogMark = this.ac;
        }
        String str3 = this.t;
        String str4 = "";
        if (str3 == null || "".equals(str3)) {
            this.t = "00.00.00";
        }
        try {
            str4 = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(this.m);
        } catch (Exception e2) {
            LogUtil.e("MaintenanceUtil", "Exception: ", ExceptionUtils.c(e2));
        }
        if (!TextUtils.isEmpty(this.q) && eei.b(this.q)) {
            str = "/" + strE + "-HONOR_" + this.t + "_" + encryptionLogMark + "_";
        } else {
            str = "/" + strE + "_" + this.t + "_" + encryptionLogMark + "_";
        }
        if (!eel.d(this.r) && g.x()) {
            str2 = d + str;
        } else {
            str2 = e + str;
        }
        if (CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) {
            str2 = str2 + str4 + "_WearableBeta_" + f;
        } else if (this.r == 10 && !TextUtils.isEmpty(f)) {
            String[] strArrSplit = f.split("_");
            if (strArrSplit != null && strArrSplit.length > 0) {
                str2 = str2 + strArrSplit[0] + "_WearableBeta_" + f.substring(strArrSplit[0].length() + 1, f.length());
            }
        } else {
            str2 = str2 + str4 + "_WearableBeta_" + f;
        }
        LogUtil.a("MaintenanceUtil", "getFileName() deviceVersion targetPath: ", str2);
        return str2;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getDeviceName(int i) {
        if (c(i)) {
            return a(i);
        }
        if (i == 10) {
            return "Leo";
        }
        if (i == 63) {
            return "AW70-B49HN";
        }
        if (i == 23 || i == 24) {
            return "AW70";
        }
        if (i == 36 || i == 37) {
            return "AW70-B39";
        }
        if (i == 44) {
            return "Andes_B19";
        }
        if (i != 45) {
            switch (i) {
                case 18:
                    return "Crius";
                case 19:
                    return "Terra";
                case 20:
                    return "Talos";
                case 21:
                    return "Fortuna";
                default:
                    return d(i);
            }
        }
        return "Andes_B29";
    }

    private boolean c(int i) {
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 8) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    LogUtil.j("MaintenanceUtil", "new device.");
                    return false;
            }
        }
        return true;
    }

    private String a(int i) {
        if (i == 1) {
            return "B2";
        }
        if (i == 2) {
            return "K1";
        }
        if (i == 3) {
            return "W1";
        }
        if (i == 5) {
            return "B0";
        }
        if (i == 7) {
            return "Gemini";
        }
        if (i == 8) {
            return "Metis";
        }
        switch (i) {
            case 13:
                return "NYX";
            case 14:
                return "GRUS";
            case 15:
                return "Eris";
            case 16:
                return "Janus";
            default:
                LogUtil.j("MaintenanceUtil", "go to default branch.");
                return "HUAWEI WEAR";
        }
    }

    private String d(int i) {
        String strI;
        if (ProcessUtil.c().endsWith(":PhoneService")) {
            strI = mmx.d(i).b();
        } else {
            strI = lvi.a(i).i();
        }
        return d(strI);
    }

    private String d(String str) {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.q)) {
            return "HUAWEI WEAR";
        }
        for (int i = 0; i < str.length(); i++) {
            if (!"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(str.charAt(i) + "") || str.contains("_")) {
                return "HUAWEI WEAR";
            }
        }
        return str;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initMaintenanceParame(TransferFileInfo transferFileInfo) {
        this.p = transferFileInfo.getDeviceSn();
        this.s = transferFileInfo.getDeviceMac();
        this.t = transferFileInfo.getDeviceVersion();
        this.r = transferFileInfo.getDeviceType();
        this.q = transferFileInfo.getDeviceModel();
        this.ac = transferFileInfo.getUdidFromDevice();
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getDayDateTime() {
        Log.e("MaintenanceUtil", "getCurrentTime: strCurTime");
        long time = Calendar.getInstance().getTime().getTime();
        Log.e("MaintenanceUtil", "getCurrentTime: strCurTime = " + String.valueOf(time));
        return String.valueOf(time);
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void deleteTenDayFile() {
        ArrayList<File> arrayListI = i();
        if (arrayListI == null) {
            LogUtil.j("MaintenanceUtil", "deleteTenDayFile, not have ten days log");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH);
        String str = simpleDateFormat.format(new Date());
        String str2 = "";
        for (File file : arrayListI) {
            String[] strArrSplit = file.getName().split("_");
            if (strArrSplit.length > 4) {
                str2 = strArrSplit[4];
            }
            try {
                if ((simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse(str2).getTime()) / 86400000 > 10) {
                    LogUtil.a("MaintenanceUtil", "deleteTenDayFile isDelete: ", Boolean.valueOf(file.delete()));
                }
            } catch (ParseException unused) {
                LogUtil.e("MaintenanceUtil", "deleteTenDayFile, Exception ParseException");
            }
        }
    }

    private ArrayList<File> i() {
        ArrayList<File> arrayList = new ArrayList<>(0);
        File[] fileArrListFiles = new File(e).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return null;
        }
        for (int i = 0; i < fileArrListFiles.length; i++) {
            if (!fileArrListFiles[i].isDirectory()) {
                arrayList.add(fileArrListFiles[i]);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void writeLogToFile(ArrayList<byte[]> arrayList, String str, Date date) {
        LogUtil.d("MaintenanceUtil", "Enter writeLogToFile");
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                byte[] bArr = arrayList.get(i);
                if (bArr != null) {
                    this.k += (long) bArr.length;
                }
            }
            this.f41753a.addAll(arrayList);
            this.aa = str;
            if (date != null && (date.clone() instanceof Date)) {
                this.ab = (Date) date.clone();
            }
            LogUtil.a("MaintenanceUtil", "writeLogToFile dataSize: ", Long.valueOf(this.k), ",tmpFileName: ", this.aa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Date date, ArrayList<byte[]> arrayList, String str) {
        LogUtil.a("MaintenanceUtil", "enter writeLog", ";fileName: ", f, ";inputName: ", str);
        try {
            this.y = true;
            if (date != null) {
                this.m = new Date(date.getTime());
            }
            if (str == null || f == null) {
                StringBuilder sb = new StringBuilder("MaintenanceUtil, writeLog, null == inputName? ");
                sb.append(str == null);
                sb.append(", null == fileName? ");
                sb.append(f == null);
                xjt.r(sb.toString());
            }
            if (TextUtils.isEmpty(f) || !f.equals(str)) {
                LogUtil.a("MaintenanceUtil", "inputName: ", str);
                f = str;
                if (!eel.d(this.r) && g.x()) {
                    f();
                } else {
                    initMaintenanceFile();
                }
            }
            this.w.clear();
            this.l.clear();
            for (byte[] bArr : arrayList) {
                if (bArr != null) {
                    this.l.add(bArr);
                } else {
                    LogUtil.e("MaintenanceUtil", "items: null");
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.clear();
            }
            this.w = this.l;
            b bVar = this.x;
            if (bVar == null) {
                b bVar2 = new b();
                this.x = bVar2;
                bVar2.start();
            } else {
                synchronized (bVar) {
                    this.x.notifyAll();
                }
            }
        } catch (IndexOutOfBoundsException unused) {
            LogUtil.e("MaintenanceUtil", "IndexOutOfBoundsException occur.");
        } catch (OutOfMemoryError e2) {
            LogUtil.a("MaintenanceUtil", "Exception: ", e2.getMessage());
        } catch (ConcurrentModificationException unused2) {
            LogUtil.e("MaintenanceUtil", "ConcurrentModificationException occur.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        boolean zCreateNewFile;
        boolean z = this.y;
        if (!z) {
            LogUtil.e("MaintenanceUtil", "initMaintenanceFile isWrite is ", Boolean.valueOf(z));
        }
        FileChannel fileChannel = this.u;
        if (fileChannel != null) {
            try {
                fileChannel.close();
                this.u = null;
            } catch (IOException unused) {
                LogUtil.e("MaintenanceUtil", "IOException occur.");
            }
        }
        try {
            String strB = b();
            File file = new File(strB);
            if (!file.exists() && !(zCreateNewFile = file.createNewFile())) {
                LogUtil.e("MaintenanceUtil", "initMaintenanceFile isCreated is ", Boolean.valueOf(zCreateNewFile));
            }
            if (CommonUtil.c(strB) == null) {
                LogUtil.e("MaintenanceUtil", "filepath is illegale: ", strB);
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(strB, true);
            this.v = fileOutputStream;
            this.u = fileOutputStream.getChannel();
        } catch (IOException unused2) {
            LogUtil.e("MaintenanceUtil", "Exception IOException");
            try {
                FileChannel fileChannel2 = this.u;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                FileOutputStream fileOutputStream2 = this.v;
                if (fileOutputStream2 == null || !fileOutputStream2.getFD().valid()) {
                    return;
                }
                this.v.close();
            } catch (Exception unused3) {
                LogUtil.e("MaintenanceUtil", "Exception close");
            }
        }
    }

    private String b() {
        String str = d;
        File file = new File(str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                LogUtil.e("MaintenanceUtil", "folder mkdirs failed.");
            }
            return a();
        }
        String strA = a();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            if (fileArrListFiles.length == 1) {
                return str + "/" + fileArrListFiles[0].getName();
            }
            a(fileArrListFiles);
        }
        return strA;
    }

    private void a(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            LogUtil.a("MaintenanceUtil", "isDeleted is ", Boolean.valueOf(file.delete()));
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initMaintenanceFile() {
        boolean zCreateNewFile;
        boolean zMkdirs;
        boolean z = this.y;
        if (!z) {
            LogUtil.e("MaintenanceUtil", "initMaintenanceFile isWrite is ", Boolean.valueOf(z));
        }
        FileChannel fileChannel = this.u;
        if (fileChannel != null) {
            try {
                fileChannel.close();
                this.u = null;
            } catch (IOException unused) {
                LogUtil.e("MaintenanceUtil", "IOException IOException.");
            }
        }
        try {
            File file = new File(e);
            if (!file.exists() && !(zMkdirs = file.mkdirs())) {
                LogUtil.e("MaintenanceUtil", "initMaintenanceFile isSuccess is ", Boolean.valueOf(zMkdirs));
            }
            String strA = a();
            File file2 = new File(strA);
            if (!file2.exists() && !(zCreateNewFile = file2.createNewFile())) {
                LogUtil.e("MaintenanceUtil", "initMaintenanceFile isCreated is ", Boolean.valueOf(zCreateNewFile));
            }
            FileOutputStream fileOutputStream = new FileOutputStream(strA, true);
            this.v = fileOutputStream;
            this.u = fileOutputStream.getChannel();
        } catch (IOException unused2) {
            LogUtil.e("MaintenanceUtil", "Exception IOException.");
            try {
                FileChannel fileChannel2 = this.u;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                FileOutputStream fileOutputStream2 = this.v;
                if (fileOutputStream2 == null || !fileOutputStream2.getFD().valid()) {
                    return;
                }
                this.v.close();
            } catch (Exception unused3) {
                LogUtil.e("MaintenanceUtil", "Exception close");
            }
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void onDestroyMaintenance() {
        try {
            try {
                FileChannel fileChannel = this.u;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                FileOutputStream fileOutputStream = this.v;
                if (fileOutputStream != null) {
                    try {
                        if (fileOutputStream.getFD().valid()) {
                            this.v.close();
                        }
                    } catch (IOException unused) {
                        LogUtil.e("MaintenanceUtil", "fileOutputStream IOException");
                    }
                }
            } catch (IOException e2) {
                LogUtil.e("MaintenanceUtil", e2.getMessage());
                FileOutputStream fileOutputStream2 = this.v;
                if (fileOutputStream2 != null) {
                    try {
                        if (fileOutputStream2.getFD().valid()) {
                            this.v.close();
                        }
                    } catch (IOException unused2) {
                        LogUtil.e("MaintenanceUtil", "fileOutputStream IOException");
                    }
                }
            }
            this.u = null;
            this.f41753a.clear();
            this.k = 0L;
        } catch (Throwable th) {
            FileOutputStream fileOutputStream3 = this.v;
            if (fileOutputStream3 != null) {
                try {
                    if (fileOutputStream3.getFD().valid()) {
                        this.v.close();
                    }
                } catch (IOException unused3) {
                    LogUtil.e("MaintenanceUtil", "fileOutputStream IOException");
                }
            }
            throw th;
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void cutFolder(String str, String str2) throws Throwable {
        File file;
        File file2 = new File(str);
        LogUtil.a("MaintenanceUtil", "cutFolder old: ", str, " newPath: ", str2, " oldFile.exists() is ", Boolean.valueOf(file2.exists()));
        if (file2.exists()) {
            File file3 = new File(str2);
            if (!file3.exists()) {
                LogUtil.a("MaintenanceUtil", "isSuccess = ", Boolean.valueOf(file3.mkdirs()));
            }
            String[] list = file2.list();
            if (list == null) {
                LogUtil.a("MaintenanceUtil", "cutFolder old file list = null");
                return;
            }
            for (int i = 0; i < list.length; i++) {
                if (f41751b.equals(str) && list[i].endsWith("appdft_Beta.zip")) {
                    LogUtil.a("MaintenanceUtil", "appdft is not cut");
                } else {
                    if (str.endsWith(File.separator)) {
                        if (CommonUtil.c(str + list[i]) == null) {
                            LogUtil.e("MaintenanceUtil", "file illegal: ", str + list[i]);
                            return;
                        }
                        file = new File(CommonUtil.c(str + list[i]));
                    } else {
                        if (CommonUtil.c(str + File.separator + list[i]) == null) {
                            LogUtil.e("MaintenanceUtil", "file illegal: ", str + File.separator + list[i]);
                            return;
                        }
                        file = new File(CommonUtil.c(str + File.separator + list[i]));
                    }
                    if (file.isFile() && file.exists()) {
                        LogUtil.a("MaintenanceUtil", "temp.isFile() = " + file.isFile() + "exists() = " + file.exists());
                        a(file, str2);
                    } else if (file.isDirectory() && file.exists()) {
                        cutFolder(str + File.separator + list[i], str2 + File.separator + list[i]);
                    } else {
                        LogUtil.j("MaintenanceUtil", "enter else");
                    }
                    String str3 = CommonUtil.c(str2) + File.separator + file.getName();
                    LogUtil.a("MaintenanceUtil", "oldFile.delete() isDelete is ", file2.delete() + ", new file = " + str3 + ", is exist? " + new File(str3).exists());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void a(File file, String str) throws Throwable {
        LogUtil.a("MaintenanceUtil", "saveFile path origin = " + file.getAbsolutePath());
        String str2 = CommonUtil.c(str) + File.separator + file.getName();
        LogUtil.a("MaintenanceUtil", "saveFile path new = " + str2);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        fileInputStream = null;
        try {
            FileInputStream fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
            try {
                FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(CommonUtil.c(str) + File.separator + file.getName()));
                byte[] bArr = new byte[5120];
                while (true) {
                    try {
                        try {
                            int i = fileInputStreamOpenInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                fileOutputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                        } catch (IOException unused) {
                            LogUtil.e("MaintenanceUtil", "copy crashLog failed.");
                        }
                    } catch (Throwable th) {
                        fileOutputStreamOpenOutputStream.close();
                        fileInputStreamOpenInputStream.close();
                        throw th;
                    }
                }
                fileOutputStreamOpenOutputStream.flush();
                fileOutputStreamOpenOutputStream.close();
                fileInputStreamOpenInputStream.close();
                if (fileInputStreamOpenInputStream != null) {
                    try {
                        try {
                            fileInputStreamOpenInputStream.close();
                        } catch (IOException unused2) {
                            LogUtil.e("MaintenanceUtil", "copyFolder input close occur IOException.");
                            LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                        }
                    } catch (Throwable th2) {
                        LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                        throw th2;
                    }
                }
                LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        try {
                            fileOutputStreamOpenOutputStream.close();
                        } catch (IOException unused3) {
                            LogUtil.e("MaintenanceUtil", "copyFolder output close IOException.");
                            LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                        }
                    } catch (Throwable th3) {
                        LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                        throw th3;
                    }
                }
                LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
            } catch (IOException unused4) {
                fileInputStream = fileInputStreamOpenInputStream;
                try {
                    LogUtil.e("MaintenanceUtil", "copyFolder IOException.");
                    try {
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    } catch (IOException unused5) {
                        LogUtil.e("MaintenanceUtil", "copyFolder input close occur IOException.");
                        if (fileInputStream != 0) {
                            try {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused6) {
                                    LogUtil.e("MaintenanceUtil", "copyFolder output close IOException.");
                                    LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                                }
                            } catch (Throwable th4) {
                                LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                                throw th4;
                            }
                        }
                        LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                        LogUtil.a("MaintenanceUtil", "saveFile newFile = " + str2 + ", isExist new = " + new File(str2).exists());
                        boolean zDelete = file.delete();
                        LogUtil.a("MaintenanceUtil", "saveFile delete file = " + file + ", isExist origin = " + file.exists() + "newFile = " + str2 + ", isExist final = " + new File(str2).exists());
                        LogUtil.a("MaintenanceUtil", "deleteFolder file name is ", file.getCanonicalPath(), " isDelete is ", Boolean.valueOf(zDelete));
                    } finally {
                        LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                    }
                    if (fileInputStream != 0) {
                        fileInputStream.close();
                    }
                    LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                } catch (Throwable th5) {
                    th = th5;
                    if (fileInputStream != null) {
                        try {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                                LogUtil.e("MaintenanceUtil", "copyFolder input close occur IOException.");
                                LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                            throw th6;
                        }
                    }
                    LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                    try {
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    } catch (IOException unused8) {
                        LogUtil.e("MaintenanceUtil", "copyFolder output close IOException.");
                        throw th;
                    } finally {
                        LogUtil.e("MaintenanceUtil", "copyFolder output close finally");
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                fileOutputStream = null;
                fileInputStream = fileInputStreamOpenInputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                LogUtil.e("MaintenanceUtil", "copyFolder input close finally");
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (IOException unused9) {
        } catch (Throwable th8) {
            th = th8;
            fileOutputStream = null;
        }
        LogUtil.a("MaintenanceUtil", "saveFile newFile = " + str2 + ", isExist new = " + new File(str2).exists());
        boolean zDelete2 = file.delete();
        LogUtil.a("MaintenanceUtil", "saveFile delete file = " + file + ", isExist origin = " + file.exists() + "newFile = " + str2 + ", isExist final = " + new File(str2).exists());
        try {
            LogUtil.a("MaintenanceUtil", "deleteFolder file name is ", file.getCanonicalPath(), " isDelete is ", Boolean.valueOf(zDelete2));
        } catch (IOException unused10) {
            LogUtil.a("MaintenanceUtil", "deleteFolder meet exception.");
        }
    }

    class b extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f41756c;

        private b() {
            this.f41756c = false;
        }

        @Override // java.lang.Thread
        public void start() {
            synchronized (this) {
                LogUtil.a("MaintenanceUtil", "LogThread start enter");
                if (mjj.this.v == null) {
                    if (!eel.d(mjj.this.r) && mjj.g.x()) {
                        mjj.this.f();
                    } else {
                        mjj.this.initMaintenanceFile();
                    }
                }
                super.start();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this) {
                LogUtil.e("MaintenanceUtil", "run isWrite is ", Boolean.valueOf(mjj.this.y), ";fileChannel is null: ", Boolean.valueOf(mjj.this.u == null));
                mjj.this.n = 0;
                while (mjj.this.y) {
                    this.f41756c = false;
                    if (mjj.this.u == null) {
                        if (!eel.d(mjj.this.r) && mjj.g.x()) {
                            mjj.this.f();
                        } else {
                            mjj.this.initMaintenanceFile();
                        }
                        mjj.h(mjj.this);
                        if (mjj.this.n > 200) {
                            mjj.this.i.a(10001, "Failed");
                            break;
                        }
                    } else {
                        while (true) {
                            byte[] bArr = (byte[]) mjj.this.w.poll();
                            if (bArr == null) {
                                break;
                            }
                            try {
                                mjj.this.o = ByteBuffer.wrap(bArr);
                                if (mjj.this.u != null) {
                                    mjj.this.u.write(mjj.this.o);
                                    mjj.this.n = 0;
                                }
                            } catch (IOException unused) {
                                LogUtil.e("MaintenanceUtil", "Exception write IOException.");
                                this.f41756c = true;
                                if (!eel.d(mjj.this.r) && mjj.g.x()) {
                                    mjj.this.f();
                                } else {
                                    mjj.this.initMaintenanceFile();
                                }
                                mjj.h(mjj.this);
                                if (mjj.this.n > 200) {
                                    mjj.this.n = 0;
                                    mjj.this.f41753a.clear();
                                    a();
                                }
                            }
                        }
                        mjj.this.f41753a.clear();
                        a();
                    }
                }
            }
        }

        private void a() {
            mjj.this.k = 0L;
            if (mjj.this.i != null) {
                if (this.f41756c) {
                    mjj.this.i.a(10001, "Failed");
                } else {
                    mjj.this.i.a(100000, "success");
                }
            }
            try {
                mjj.this.n = 0;
                wait();
            } catch (InterruptedException unused) {
                LogUtil.e("MaintenanceUtil", "InterruptedException");
            }
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void setMaintCheckTime(String str) {
        LogUtil.a("MaintenanceUtil", "setMaintCheckTime, time: ", str);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "MAINT_KEY_CHECK_TIME", str, new StorageParams());
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getMaintCheckTime() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "MAINT_KEY_CHECK_TIME");
        LogUtil.a("MaintenanceUtil", "getMaintCheckTime,maintCheckTime: ", strE);
        return strE;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void setMaintRetryResult(boolean z) {
        LogUtil.a("MaintenanceUtil", "setMaintRetryResult, result is ", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "MAINT_KEY_RESULT", String.valueOf(z), new StorageParams());
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public boolean getMaintRetryResult() {
        return "true".equals(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "MAINT_KEY_RESULT"));
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void setMaintRetryNum(int i) {
        LogUtil.a("MaintenanceUtil", "setMaintRetryTime, retry: ", Integer.valueOf(i));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "MAINT_KEY_RETRY_TIME", String.valueOf(i), new StorageParams());
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public int getMaintRetryNum() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10), "MAINT_KEY_RETRY_TIME");
        if (qrs.b(strE)) {
            try {
                int i = Integer.parseInt(strE);
                LogUtil.a("MaintenanceUtil", "getMaintRetryTime, retry: ", Integer.valueOf(i));
                return i;
            } catch (NumberFormatException e2) {
                LogUtil.e("MaintenanceUtil", "getMaintRetryTime: ", e2.getMessage());
            }
        }
        return 0;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public DeviceCommand maintParametersCommand() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(2);
        deviceCommand.setmIdentify(this.p);
        return deviceCommand;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void save2File(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.e("MaintenanceUtil", "enter save2File");
        this.i = iBaseResponseCallback;
        if (this.ab == null) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(10001, "Failed");
                return;
            }
            return;
        }
        LogUtil.a("MaintenanceUtil", "dataSize: ", Long.valueOf(this.k), ";isForce: ", Boolean.valueOf(z), ";callback: ", iBaseResponseCallback);
        if (this.k >= 200000 || z) {
            ThreadPoolManager.c().b("MaintenanceUtil", new Runnable() { // from class: mjj.2
                @Override // java.lang.Runnable
                public void run() {
                    mjj mjjVar = mjj.this;
                    mjjVar.d(mjjVar.ab, mjj.this.f41753a, mjj.this.aa);
                }
            });
        } else if (iBaseResponseCallback != null) {
            this.i.a(100000, "success");
        }
    }

    public static String c(JSONObject jSONObject, Context context, String str, String str2) {
        if (jSONObject == null) {
            return "";
        }
        try {
            jSONObject.put("datatime", mjh.e(SharedPreferenceManager.b(context, "ota_datatime")));
            jSONObject.put("EXCE_OTA_APP_UPG_TYPE", mjl.a(context));
            jSONObject.put("EXCE_OTA_APP_UPG_TLV", mjl.d(context));
            jSONObject.put("EXCE_OTA_APP_UPG_START_VERSION", mjl.c(context));
            jSONObject.put("EXCE_OTA_APP_UPG_GOAL_VERSION", mjl.b(context));
            long jB = SharedPreferenceManager.b(context, "EXCE_OTA_APP_UPG_TRANS_START");
            long jB2 = SharedPreferenceManager.b(context, "EXCE_OTA_APP_UPG_TRANS_STOP_TIME");
            jSONObject.put("EXCE_OTA_APP_UPG_TRANS_START", mjh.e(jB));
            jSONObject.put("EXCE_OTA_APP_UPG_TRANS_STOP", UnitUtil.e((jB2 - jB) / 60000, 1, 1));
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            LogUtil.a("MaintenanceUtil", "JSONException jsonException ", e2.getMessage());
        }
        return jSONObject.toString();
    }

    public static String e(String str) {
        if (str == null) {
            return "";
        }
        if (str.contains("Talos-")) {
            return "Talos-";
        }
        if (str.contains("Fortuna-")) {
            return "Fortuna-";
        }
        if (str.contains("Latona")) {
            return "Latona";
        }
        if (str.contains("ELA")) {
            return "ELA";
        }
        if (str.contains("Crius")) {
            return "Crius";
        }
        if (str.contains("TerraB09")) {
            return "TerraB09";
        }
        if (str.contains("Terra")) {
            return "Terra";
        }
        if (!str.contains("Diana")) {
            return "";
        }
        return "Diana";
    }

    public static String a(String str) {
        if (System.currentTimeMillis() - SharedPreferenceManager.b(BaseApplication.getContext(), "BETA_CLUB_QUESTION_NUMBER_TIME") > 43200000) {
            SharedPreferenceManager.f(BaseApplication.getContext(), "");
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext());
        return (TextUtils.isEmpty(strE) || TextUtils.isEmpty(str)) ? str : str.replace("00000000", strE);
    }

    public static String b(String str) {
        if (eei.b(str)) {
            String str2 = mjh.e + str;
            ReleaseLogUtil.d("Dfx_MaintenanceUtil", "current log is honor");
            return str2;
        }
        String str3 = mjh.f41743c + str;
        ReleaseLogUtil.d("Dfx_MaintenanceUtil", "current log isn't honor");
        return str3;
    }

    public String a(DeviceInfo deviceInfo) {
        String str;
        if (deviceInfo == null) {
            return "";
        }
        int productType = deviceInfo.getProductType();
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        String softVersion = deviceInfo.getSoftVersion();
        String deviceModel = deviceInfo.getDeviceModel();
        this.q = deviceModel;
        String strE = e(productType, getDeviceName(productType));
        if (TextUtils.isEmpty(udidFromDevice)) {
            LogUtil.a("MaintenanceUtil", "getDetectFileName getMacAddress() size:", BTDeviceMgrUtil.c().e(securityDeviceId), " identify size: ", BTDeviceMgrUtil.c().e(deviceIdentify), " isOversea is ", Boolean.valueOf(Utils.o()));
            udidFromDevice = FoundationCommonUtil.getEncryptionLogMark(securityDeviceId, deviceIdentify, productType);
        }
        if (softVersion == null || "".equals(softVersion)) {
            softVersion = "00.00.00";
        }
        String str2 = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date());
        if (!TextUtils.isEmpty(deviceModel) && eei.b(deviceModel)) {
            str = strE + "-HONOR_" + softVersion + "_" + udidFromDevice + "_";
        } else {
            str = strE + "_" + softVersion + "_" + udidFromDevice + "_";
        }
        String strReplace = str + str2 + "_WearableBeta";
        if (CommonUtil.bu()) {
            strReplace = strReplace.replace("_WearableBeta", "_WearableCommercial");
        }
        LogUtil.a("MaintenanceUtil", "getDetectFileName deviceVersion targetPath: ", strReplace);
        return strReplace;
    }
}
