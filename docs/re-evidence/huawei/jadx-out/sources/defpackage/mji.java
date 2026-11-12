package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mji implements MaintenaceInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mji f41748c;
    private IBaseResponseCallback e;
    private ArrayList<byte[]> h;
    private final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41749a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f41750b = new Runnable() { // from class: mji.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (mji.this.d) {
                if (mji.this.getmTransferDataContentPath() != null) {
                    File filesDir = BaseApplication.getContext().getFilesDir();
                    if (filesDir.exists()) {
                        LogUtil.a("PeriodRRIFileUtil", "create is success ：", Boolean.valueOf(filesDir.mkdirs()));
                    }
                    File file = new File(filesDir, mji.this.getmTransferDataContentPath());
                    FileOutputStream fileOutputStreamOpenOutputStream = null;
                    try {
                        try {
                            if (!file.exists()) {
                                LogUtil.a("PeriodRRIFileUtil", "create success ", Boolean.valueOf(file.createNewFile()));
                            }
                            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
                            if (mji.this.h != null) {
                                Iterator it = mji.this.h.iterator();
                                while (it.hasNext()) {
                                    fileOutputStreamOpenOutputStream.write((byte[]) it.next());
                                    fileOutputStreamOpenOutputStream.flush();
                                }
                            }
                            mrq.b(file, 16);
                            if (fileOutputStreamOpenOutputStream != null) {
                                try {
                                    try {
                                        fileOutputStreamOpenOutputStream.close();
                                        LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                    } catch (IOException e) {
                                        LogUtil.e("PeriodRRIFileUtil", "write data file Exception e is ", e.getMessage());
                                        LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                    }
                                } catch (Throwable th) {
                                    LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                    throw th;
                                }
                            }
                            mji.this.d(100000, "success");
                        } catch (IOException unused) {
                            LogUtil.e("PeriodRRIFileUtil", "mLogRunnable stream write exception");
                            mji.this.d(10001, "write data FileNotFoundException e.");
                            if (fileOutputStreamOpenOutputStream != null) {
                                try {
                                    try {
                                        fileOutputStreamOpenOutputStream.close();
                                        LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                    } catch (IOException e2) {
                                        LogUtil.e("PeriodRRIFileUtil", "write data file Exception e is ", e2.getMessage());
                                        LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                    throw th2;
                                }
                            }
                            return;
                        }
                    } catch (Throwable th3) {
                        if (fileOutputStreamOpenOutputStream != null) {
                            try {
                                try {
                                    fileOutputStreamOpenOutputStream.close();
                                    LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                } catch (IOException e3) {
                                    LogUtil.e("PeriodRRIFileUtil", "write data file Exception e is ", e3.getMessage());
                                    LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                LogUtil.e("PeriodRRIFileUtil", "finally write data file ok.");
                                throw th4;
                            }
                        }
                        throw th3;
                    }
                }
                if (mji.this.getmTransferDataContentPath() == null) {
                    mji.this.d(10001, "path is all null.");
                }
            }
        }
    };
    private String j = null;
    private ArrayList<byte[]> i = new ArrayList<>(0);

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
    public String getmTransferStateContentPath() {
        return null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        IBaseResponseCallback iBaseResponseCallback = this.e;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, str);
        } else {
            LogUtil.e("PeriodRRIFileUtil", "mCallback is null");
        }
    }

    private mji() {
    }

    public static mji c() {
        mji mjiVar;
        synchronized (mji.class) {
            if (f41748c == null) {
                f41748c = new mji();
            }
            mjiVar = f41748c;
        }
        return mjiVar;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getmTransferDataContentPath() {
        return this.j;
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
        if (z) {
            if (this.j != null) {
                this.j = null;
            }
            ArrayList<byte[]> arrayList = this.i;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        this.f41749a = "";
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public String getDayDateTime() {
        return "";
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void writeLogToFile(ArrayList<byte[]> arrayList, String str, Date date) {
        if (this.i == null) {
            return;
        }
        if (arrayList != null && arrayList.size() > 0) {
            for (byte[] bArr : arrayList) {
                if ("rrisqi_data.bin".equals(str)) {
                    this.i.add(bArr);
                }
            }
        }
        if ("".equals(this.f41749a) || !this.f41749a.equals(str)) {
            this.f41749a = str;
            initMaintenanceFile();
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void save2File(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        synchronized (this.d) {
            this.e = iBaseResponseCallback;
            ArrayList<byte[]> arrayList = new ArrayList<>(16);
            this.h = arrayList;
            arrayList.addAll(this.i);
        }
        mit.b("PeriodRRIFileUtil", this.f41750b);
    }

    private String b() {
        String str = ("RRI_" + new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date())) + "_" + this.f41749a;
        LogUtil.a("PeriodRRIFileUtil", " getFileName()  deviceVersion targetPath ", str);
        return str;
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void initMaintenanceFile() {
        LogUtil.a("PeriodRRIFileUtil", "enter initMaintenanceFile():");
        String strB = b();
        if (strB.contains("rrisqi_data.bin")) {
            this.j = strB;
        }
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public void onDestroyMaintenance() {
        LogUtil.a("PeriodRRIFileUtil", "onDestroyMaintenance");
    }

    @Override // com.huawei.hwdevice.outofprocess.util.hwdfx.MaintenaceInterface
    public DeviceCommand maintParametersCommand() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(10);
        deviceCommand.setCommandID(2);
        String str = eeq.d(6) + eeq.d(1) + eeq.d(4);
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setDataContent(eeq.c(str));
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
        return deviceCommand;
    }
}
