package defpackage;

import android.os.ParcelFileDescriptor;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.open.HdpMeasureController;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class eiv extends HdpMeasureController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ems f33043a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<HealthData> f33044c = new ArrayList<>();
    private eiu e;

    @Override // com.huawei.health.ecologydevice.open.HdpMeasureController
    public int getDataType() {
        return 4103;
    }

    @Override // com.huawei.health.ecologydevice.open.HdpMeasureController
    public void handleHealthChannelStateChange(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, int i3) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            try {
                FileOutputStream fileOutputStream4 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    this.e = new eiu();
                    while (fileInputStream2.read(bArr) > -1) {
                        byte b2 = bArr[0];
                        if (b2 == -30) {
                            LogUtil.d("HdpBloodPressureMeasureController", "handleHealthChannelStateChange fos.write RESPONSE_2_2_3");
                            fileOutputStream4.write(eix.f33048b);
                        } else if (b2 == -25 && bArr[18] == 13 && bArr[19] == 28) {
                            LogUtil.d("HdpBloodPressureMeasureController", "handleHealthChannelStateChange fos.write RESPONSE_3_2_3");
                            fileOutputStream4.write(eix.d);
                        } else if (b2 == -25 && bArr[18] == 13 && bArr[19] == 31) {
                            a(1, bArr, fileOutputStream4);
                        } else if (b2 == -26) {
                            LogUtil.d("HdpBloodPressureMeasureController", "handleHealthChannelStateChange ABORT_APDU");
                            c();
                        } else if (b2 == -28) {
                            LogUtil.d("HdpBloodPressureMeasureController", "handleHealthChannelStateChange fos.write RESPONSE_6_2");
                            fileOutputStream4.write(eix.e);
                            c();
                        } else {
                            LogUtil.j("HdpBloodPressureMeasureController", "handleHealthChannelStateChange other type");
                        }
                        bArr = new byte[1024];
                        fileOutputStream4.flush();
                    }
                    d(parcelFileDescriptor, fileInputStream2, fileOutputStream4);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream4;
                    fileOutputStream = fileOutputStream2;
                    fileInputStream = fileInputStream2;
                    try {
                        LogUtil.e("HdpBloodPressureMeasureController", "handleHealthChannelStateChange error = ", e.getMessage());
                        d(parcelFileDescriptor, fileInputStream, fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        d(parcelFileDescriptor, fileInputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream4;
                    fileOutputStream = fileOutputStream3;
                    fileInputStream = fileInputStream2;
                    d(parcelFileDescriptor, fileInputStream, fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private void d(ParcelFileDescriptor parcelFileDescriptor, FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        IoUtils.c(parcelFileDescriptor);
        IoUtils.c(fileInputStream);
        IoUtils.c(fileOutputStream);
    }

    private void c() {
        if (this.f33044c.size() <= 0 || this.mBaseResponseCallback == null) {
            return;
        }
        this.mBaseResponseCallback.onDataChanged(this.mDevice, this.f33044c);
    }

    private void a(int i, byte[] bArr, FileOutputStream fileOutputStream) {
        eiu eiuVar = this.e;
        if (eiuVar != null) {
            HealthData data = eiuVar.parseData(bArr);
            if (data instanceof ems) {
                ems emsVar = (ems) data;
                this.f33043a = emsVar;
                this.f33044c.add(emsVar);
            }
            eix.f33047a[7] = (byte) (i + 1);
            try {
                fileOutputStream.write(eix.f33047a);
            } catch (IOException e) {
                LogUtil.e("HdpBloodPressureMeasureController", "handleHealthChannelStateChange error = ", e.getMessage());
            }
        }
    }
}
