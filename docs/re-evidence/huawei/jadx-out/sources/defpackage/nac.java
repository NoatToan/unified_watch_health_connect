package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Ascii;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nac implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f42807a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42808b = new Object();
    private static nac d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f42809c;
    private eet e = new eet();

    private nac(Context context) {
        this.f42809c = context;
    }

    public static nac e(Context context) {
        nac nacVar;
        synchronized (f42808b) {
            if (d == null && context != null) {
                LogUtil.a("HwWakeAppManager", "getInstance() context =", context);
                d = new nac(context);
            }
            nacVar = d;
        }
        return nacVar;
    }

    public void a(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.d("HwWakeAppManager", "handleOpenApp data =", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwWakeAppManager", "handleOpenApp messageHex is error");
            return;
        }
        try {
            List<eew> listE = this.e.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                nad nadVar = new nad();
                for (eew eewVar : listE) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    if (iB == 1) {
                        nadVar.a(eeq.d(eewVar.b()));
                    } else if (iB == 2) {
                        nadVar.d(eeq.d(eewVar.b()));
                    } else {
                        LogUtil.j("HwWakeAppManager", "handleOpenApp unknown tlv type");
                    }
                }
                d(nadVar);
                return;
            }
            LogUtil.j("HwWakeAppManager", "handleOpenApp tlv is error");
        } catch (eeu unused) {
            LogUtil.e("HwWakeAppManager", "COMMAND_ID_GET_DATE TlvException");
        }
    }

    private void d(nad nadVar) {
        try {
            if ("com.huawei.bone".equals(nadVar.a()) || nadVar.a().equals(this.f42809c.getPackageName())) {
                String strD = nadVar.d();
                if ("com.huawei.sim.esim.view.EsimActivationActivity".equals(strD)) {
                    strD = "com.huawei.sim.esim.view.WirelessManagerActivity";
                }
                Bundle bundle = new Bundle();
                Intent intent = new Intent();
                intent.putExtra("health_activity_id", strD);
                intent.setClassName(this.f42809c, "com.huawei.health.StartHealthActivity");
                intent.putExtras(bundle);
                intent.setFlags(268435456);
                f42807a = true;
                this.f42809c.startActivity(intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.setComponent(new ComponentName(nadVar.a(), nadVar.d()));
                this.f42809c.startActivity(intent2);
            }
        } catch (Exception unused) {
            LogUtil.e("HwWakeAppManager", "openApp startActivity Exception");
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(23);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(Ascii.DEL);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(eeq.c(eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)));
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        mkf.e(this.f42809c).sendDeviceData(deviceCommand);
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        a(bArr);
    }
}
