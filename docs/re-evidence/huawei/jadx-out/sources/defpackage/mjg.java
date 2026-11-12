package defpackage;

import android.os.Environment;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.IoUtils;
import health.compact.a.KeyValDbManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mjg implements MaintenaceInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mjg f41738a;
    private IBaseResponseCallback e;
    private ArrayList<byte[]> i;
    private boolean j;
    private String k;
    private ArrayList<byte[]> l;
    private String n;
    public static final String d = Environment.getExternalStorageDirectory() + "/huaweisystem/CoreSleepLog";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41739c = new Object();
    private String g = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41740b = "";
    private String h = "";
    private Runnable f = new Runnable() { // from class: mjg.3
        @Override // java.lang.Runnable
        public void run() {
            synchronized (mjg.f41739c) {
                LogUtil.a("DetailSleepUtil", "DetailSleep saveFile run mIsStateFileWrite = ", Boolean.valueOf(mjg.this.j));
                if (!mjg.this.j || mjg.this.getmTransferDataContentPath() != null) {
                    mjg.this.i();
                    mjg.this.g();
                    mjg.this.b();
                    if (mjg.this.getmTransferStateContentPath() == null && mjg.this.getmTransferDataContentPath() == null) {
                        LogUtil.j("DetailSleepUtil", "getmTransferStateContentPath() is null. getmTransferDataContentPath() is null. ");
                        mjg.this.j = false;
                        if (mjg.this.e != null) {
                            mjg.this.e.a(10001, "path is all null.");
                        }
                    }
                    return;
                }
                LogUtil.e("DetailSleepUtil", "error: when mIsStateFileWriteis true,getmTransferDataContentPath() should not be null");
                if (mjg.this.e != null) {
                    mjg.this.e.a(10001, "error: when mIsStateFileWriteis true,getmTransferDataContentPath() should not be null");
                }
                mjg.this.j = false;
            }
        }
    };

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void cutFolder(String str, String str2) {
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void deleteTenDayFile() {
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public ArrayList filtertFile(ArrayList arrayList, int i) {
        return arrayList;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public int getMaintRetryNum() {
        return 0;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public boolean getMaintRetryResult() {
        return false;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initMaintenanceParame(TransferFileInfo transferFileInfo) {
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initName() {
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void setMaintCheckTime(String str) {
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void setMaintRetryNum(int i) {
    }

    private mjg() {
        this.j = false;
        LogUtil.a("DetailSleepUtil", "DetailSleepUtil constructor()");
        this.k = null;
        this.n = null;
        synchronized (f41739c) {
            this.j = false;
        }
        this.i = new ArrayList<>(20);
        this.l = new ArrayList<>(20);
    }

    public static mjg e() {
        mjg mjgVar;
        synchronized (f41739c) {
            if (f41738a == null) {
                f41738a = new mjg();
            }
            mjgVar = f41738a;
        }
        return mjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (getmTransferDataContentPath() != null) {
            try {
                ObjectOutputStream objectOutputStreamF = f();
                try {
                    if (objectOutputStreamF != null) {
                        objectOutputStreamF.close();
                    }
                } catch (IOException e) {
                    LogUtil.e("DetailSleepUtil", "write data file Exception e = ", e.getMessage());
                } finally {
                    LogUtil.e("DetailSleepUtil", "finally write data file ok");
                }
            } catch (IOException e2) {
                LogUtil.e("DetailSleepUtil", "write data file Exception e = ", e2.getMessage());
                if (this.e != null) {
                    this.e.a(10001, "write data file Exception");
                }
            } catch (FileNotFoundException e3) {
                LogUtil.e("DetailSleepUtil", "write data File FileNotFoundException e = ", e3.getMessage());
                if (this.e != null) {
                    this.e.a(10001, "write data FileNotFoundException");
                }
            } catch (ConcurrentModificationException unused) {
                LogUtil.e("DetailSleepUtil", "saveFile exception is ConcurrentModificationException");
                if (this.e != null) {
                    this.e.a(10001, "write data file ConcurrentModificationException");
                }
            } finally {
                this.j = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    public void d(String str) throws Throwable {
        ?? r0;
        FileInputStream fileInputStreamOpenInputStream;
        LogUtil.a("DetailSleepUtil", "DetailSleepUtil saveFile, is_debug_version:", Boolean.valueOf(CompileParameterUtil.d("IS_DEBUG_VERSION")), "saveFile path is empty:", Boolean.valueOf(TextUtils.isEmpty(str)));
        if ((!CommonUtil.ao() && !CommonUtil.ap() && !h()) || TextUtils.isEmpty(str)) {
            return;
        }
        String strA = a();
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            LogUtil.j("DetailSleepUtil", "path is wrong.");
            return;
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            LogUtil.j("DetailSleepUtil", "path is wrong. no file name.");
            return;
        }
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            try {
                File file = FileUtils.getFile(strA + new SimpleDateFormat("YYYYMMddHHmmss").format(new Date()) + "_" + strSubstring);
                File file2 = FileUtils.getFile(strA);
                if (!file.exists()) {
                    LogUtil.d("DetailSleepUtil", "isSuccess mkdir : ", Boolean.valueOf(file2.mkdirs()));
                }
                fileInputStreamOpenInputStream = FileUtils.openInputStream(FileUtils.getFile(str));
                try {
                    fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStreamOpenInputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStreamOpenOutputStream.write(bArr, 0, i);
                        } else {
                            fileOutputStreamOpenOutputStream.flush();
                            LogUtil.d("DetailSleepUtil", "copy file success.");
                            IoUtils.c(fileOutputStreamOpenOutputStream);
                            IoUtils.c(fileInputStreamOpenInputStream);
                            return;
                        }
                    }
                } catch (IOException unused) {
                    LogUtil.e("DetailSleepUtil", "save File IOException");
                    IoUtils.c(fileOutputStreamOpenOutputStream);
                    IoUtils.c(fileInputStreamOpenInputStream);
                }
            } catch (Throwable th) {
                r0 = str;
                th = th;
                IoUtils.c(null);
                IoUtils.c(r0);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            r0 = 0;
            IoUtils.c(null);
            IoUtils.c(r0);
            throw th;
        }
    }

    private ObjectOutputStream f() throws IOException, ConcurrentModificationException {
        ArrayList<byte[]> arrayList = this.i;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(BaseApplication.getContext().openFileOutput(getmTransferDataContentPath(), 0));
        if (arrayList == null) {
            LogUtil.j("DetailSleepUtil", "saveFile saveDataBytes is null");
            return objectOutputStream;
        }
        LogUtil.a("DetailSleepUtil", " mTransferDataContent size : ", Integer.valueOf(arrayList.size()));
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.close();
        if (!TextUtils.isEmpty(getmTransferDataContentPath())) {
            mrq.b(BaseApplication.getContext().getFileStreamPath(getmTransferDataContentPath()), 15);
        }
        if (h() && (CommonUtil.ao() || CommonUtil.ap())) {
            e(this.f41740b, arrayList);
        }
        IBaseResponseCallback iBaseResponseCallback = this.e;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, "success");
        }
        return objectOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws Throwable {
        ObjectOutputStream objectOutputStream;
        String str = getmTransferStateContentPath();
        if (str == null || this.j) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(BaseApplication.getContext().openFileOutput(str, 0));
                try {
                    ArrayList<byte[]> arrayList = this.l;
                    if (arrayList == null) {
                        LogUtil.j("DetailSleepUtil", "handleStateFalse mTransferStateBytes is null");
                        try {
                            objectOutputStream.close();
                        } catch (IOException e) {
                            LogUtil.e("DetailSleepUtil", "write stateFile Exception e = ", e.getMessage());
                        } finally {
                            LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                        }
                        this.j = true;
                        return;
                    }
                    LogUtil.a("DetailSleepUtil", " mTransferStateBytes size : ", Integer.valueOf(arrayList.size()));
                    objectOutputStream.writeObject(this.l);
                    objectOutputStream.close();
                    mrq.b(BaseApplication.getContext().getFileStreamPath(str), 14);
                    if (h() && (CommonUtil.ao() || CommonUtil.ap())) {
                        e(this.h, this.l);
                    }
                    IBaseResponseCallback iBaseResponseCallback = this.e;
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(100000, "success");
                    }
                    try {
                        try {
                            objectOutputStream.close();
                            LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                        } catch (IOException e2) {
                            LogUtil.e("DetailSleepUtil", "write stateFile Exception e = ", e2.getMessage());
                            LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                        }
                        this.j = true;
                    } catch (Throwable th) {
                        LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                        throw th;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    objectOutputStream2 = objectOutputStream;
                    LogUtil.e("DetailSleepUtil", "write stateFile FileNotFoundException e = ", e.getMessage());
                    IBaseResponseCallback iBaseResponseCallback2 = this.e;
                    if (iBaseResponseCallback2 != null) {
                        iBaseResponseCallback2.a(10001, "write state FileNotFoundException e.");
                    }
                    if (objectOutputStream2 != null) {
                        try {
                            try {
                                objectOutputStream2.close();
                                LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                            } catch (IOException e4) {
                                LogUtil.e("DetailSleepUtil", "write stateFile Exception e = ", e4.getMessage());
                                LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                            }
                        } catch (Throwable th2) {
                            LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                            throw th2;
                        }
                    }
                } catch (IOException e5) {
                    e = e5;
                    objectOutputStream2 = objectOutputStream;
                    LogUtil.e("DetailSleepUtil", "write stateFile Exception e = ", e.getMessage());
                    IBaseResponseCallback iBaseResponseCallback3 = this.e;
                    if (iBaseResponseCallback3 != null) {
                        iBaseResponseCallback3.a(10001, "write state file Exception");
                    }
                    try {
                        if (objectOutputStream2 != null) {
                            objectOutputStream2.close();
                        }
                    } catch (IOException e6) {
                        LogUtil.e("DetailSleepUtil", "write stateFile Exception e = ", e6.getMessage());
                    } finally {
                        LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    } catch (IOException e7) {
                        LogUtil.e("DetailSleepUtil", "write stateFile Exception e = ", e7.getMessage());
                    } finally {
                        LogUtil.e("DetailSleepUtil", "finally write stateFile ok");
                    }
                    this.j = true;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                objectOutputStream = null;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getmTransferDataContentPath() {
        return this.k;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getmTransferStateContentPath() {
        return this.n;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getDeviceName(int i) {
        return "Huawei";
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getMaintCheckTime() {
        return "0";
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void setMaintRetryResult(boolean z) {
        LogUtil.a("DetailSleepUtil", " mTransferStateBytes = ", this.l);
        if (z) {
            if (this.k != null) {
                LogUtil.a("DetailSleepUtil", "isDeleteDataSuccess :", Boolean.valueOf(BaseApplication.getContext().deleteFile(this.k)));
                this.k = null;
            }
            if (this.n != null) {
                LogUtil.a("DetailSleepUtil", "isDeleteStateSuccess :", Boolean.valueOf(BaseApplication.getContext().deleteFile(this.n)));
                this.n = null;
            }
            ArrayList<byte[]> arrayList = this.i;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<byte[]> arrayList2 = this.l;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        synchronized (f41739c) {
            this.j = false;
            LogUtil.a("DetailSleepUtil", "mIsStateFileWrite= ", false);
        }
        this.g = "";
        LogUtil.a("DetailSleepUtil", "Leave setMaintRetryResult fileName = ", "");
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getDayDateTime() {
        return "";
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void writeLogToFile(ArrayList<byte[]> arrayList, String str, Date date) {
        LogUtil.a("DetailSleepUtil", "writeLogToFile file_name = ", str);
        if (arrayList != null && arrayList.size() > 0) {
            LogUtil.a("DetailSleepUtil", "writeLogToFile file_name = ", str, " file size = ", Integer.valueOf(arrayList.size()));
            for (byte[] bArr : arrayList) {
                if ("sleep_data.bin".equals(str)) {
                    this.i.add(bArr);
                } else if ("sleep_state.bin".equals(str)) {
                    this.l.add(bArr);
                } else {
                    LogUtil.j("DetailSleepUtil", "writeLogToFile else fileNameValue:", str);
                }
            }
        }
        if ("".equals(this.g) || !this.g.equals(str)) {
            LogUtil.a("DetailSleepUtil", "file_name = ", str);
            this.g = str;
            initMaintenanceFile();
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void save2File(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.a("DetailSleepUtil", "save2File enter");
        synchronized (f41739c) {
            this.e = iBaseResponseCallback;
            LogUtil.a("DetailSleepUtil", "mCallback = ", iBaseResponseCallback);
        }
        mit.b("DetailSleepUtil", this.f);
    }

    private void e(String str, ArrayList<byte[]> arrayList) {
        LogUtil.a("DetailSleepUtil", "writeFileToSd() enter, fileName = ", str, "content = ", arrayList, "is_debug_version = ", Boolean.valueOf(CompileParameterUtil.d("IS_DEBUG_VERSION")), "writeLogToFile don't write sleepstate and sleepdate bin file to sdCard :", Boolean.valueOf(CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")));
        if ((CommonUtil.ao() || CommonUtil.ap() || h()) && !CompileParameterUtil.d("RELEASE_EVENT_LOG_UPLOAD")) {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                LogUtil.a("DetailSleepUtil", "SD card is not avaiable/writeable right now.");
            } else {
                c(str, arrayList);
            }
        }
    }

    private void c(String str, ArrayList<byte[]> arrayList) {
        String str2;
        if (!CommonUtil.at()) {
            str2 = d;
        } else {
            str2 = LogConfig.o() + "/CoreSleepLog";
        }
        File file = new File(str2);
        File file2 = new File(str2, str);
        LogUtil.a("DetailSleepUtil", "Path exists:", Boolean.valueOf(file.exists()), "File exists:", Boolean.valueOf(file2.exists()));
        if (!file.exists() && !file.mkdir()) {
            LogUtil.e("DetailSleepUtil", "path.mkdir() fail!");
            return;
        }
        if (!file2.exists()) {
            try {
                if (!file2.createNewFile()) {
                    LogUtil.e("DetailSleepUtil", "getLogFile() createNewFile is failed.");
                }
            } catch (IOException e) {
                LogUtil.e("DetailSleepUtil", "createNewFile Exception e = ", e.getMessage());
                return;
            }
        }
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file2);
            Iterator<byte[]> it = arrayList.iterator();
            while (it.hasNext()) {
                fileOutputStreamOpenOutputStream.write(it.next());
                fileOutputStreamOpenOutputStream.flush();
            }
        } catch (IOException e2) {
            LogUtil.e("DetailSleepUtil", "stream write Exception e = ", e2.getMessage());
        } finally {
            if (fileOutputStreamOpenOutputStream != null) {
                try {
                    fileOutputStreamOpenOutputStream.close();
                } catch (IOException e3) {
                    LogUtil.e("DetailSleepUtil", "stream.close() Exception e = ", e3.getMessage());
                }
            }
        }
    }

    public void b() {
        LogUtil.a("DetailSleepUtil", "enter updateCoreSleepDir.");
        String str = !CommonUtil.at() ? d : LogConfig.o() + "/CoreSleepLog";
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.j("DetailSleepUtil", "coreSleepFile is not exists.");
            return;
        }
        LogUtil.a("DetailSleepUtil", "coreSleepFile path: ", str);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.j("DetailSleepUtil", "CoreSleepFile is empty.");
            return;
        }
        try {
            long j = Long.parseLong(new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis() - 604800000)));
            LogUtil.a("DetailSleepUtil", "oneWeekDateLong: ", Long.valueOf(j));
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory()) {
                    String name = file2.getName();
                    if (name.contains("_")) {
                        long j2 = Long.parseLong(name.substring(0, name.indexOf("_")));
                        LogUtil.d("DetailSleepUtil", "oneWeekDateLong: ", Long.valueOf(j), ",fileDateLong: ", Long.valueOf(j2));
                        if (j2 < j) {
                            LogUtil.d("DetailSleepUtil", "deleteDirWithFile result=", Boolean.valueOf(file2.delete()));
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("DetailSleepUtil", "NumberFormatException error occurs.");
        }
    }

    private String d() {
        String str = "CoreSleep_" + this.g;
        LogUtil.a("DetailSleepUtil", " getFileName()  deviceVersion targetPath ", str);
        return str;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initMaintenanceFile() {
        String strD = d();
        LogUtil.a("DetailSleepUtil", "enter initMaintenanceFile() filePath = ", strD);
        if (strD.contains("sleep_data.bin")) {
            this.k = strD;
        } else if (strD.contains("sleep_state.bin")) {
            this.n = strD;
        } else {
            LogUtil.j("DetailSleepUtil", "initMaintenanceFile else filePath");
        }
        if (h()) {
            if (CommonUtil.ao() || CommonUtil.ap()) {
                a(strD);
            }
        }
    }

    private void a(String str) {
        String str2 = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date());
        if (str.contains("sleep_data.bin")) {
            this.f41740b = str2 + "_" + str;
        } else if (str.contains("sleep_state.bin")) {
            this.h = str2 + "_" + str;
        } else {
            LogUtil.j("DetailSleepUtil", "initCoreSleepDataSaveDir else filePath");
        }
        LogUtil.a("DetailSleepUtil", "initCoreSleepDataSaveDir filePath = ", str, "  mDataFilePath = ", this.f41740b, "  mStateFilePath = ", this.h);
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void onDestroyMaintenance() {
        LogUtil.a("DetailSleepUtil", "enter onDestroyMaintenance()");
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public DeviceCommand maintParametersCommand() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(2);
        String str = eeq.d(6) + eeq.d(1) + eeq.d(1);
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setDataContent(eeq.c(str));
        LogUtil.a("DetailSleepUtil", "getMaintenanceParameters deviceCommand = ", deviceCommand.toString());
        return deviceCommand;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public DeviceCommand transferFileEndProcess() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(6);
        String str = eeq.d(1) + eeq.d(1) + eeq.d(1);
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setDataContent(eeq.c(str));
        LogUtil.a("DetailSleepUtil", "transferFileEndProcess deviceCommand");
        return deviceCommand;
    }

    private String a() {
        if (!CommonUtil.at()) {
            return Environment.getExternalStorageDirectory() + "/huaweisystem/CoreSleepLog/";
        }
        return LogConfig.o() + "/CoreSleepLog/";
    }

    private boolean h() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("save_sleep_key");
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }
}
