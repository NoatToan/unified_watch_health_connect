package defpackage;

import android.util.SparseBooleanArray;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ckl extends HandshakeGeneralCommandBase {
    private cqe g = new cqe();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Integer> f1684c = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, SparseBooleanArray> f1682a = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Boolean> f1683b = new ConcurrentHashMap<>(2);
    public static final ConcurrentHashMap<String, Boolean> j = new ConcurrentHashMap<>(2);
    public static final ConcurrentHashMap<String, List<cmk>> e = new ConcurrentHashMap<>(2);
    public static final ConcurrentHashMap<String, List<Integer>> d = new ConcurrentHashMap<>(2);
    private static int h = 0;

    ckl() {
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        return e(deviceInfo);
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        cmh cmhVar = new cmh();
        if (!cku.d(deviceInfo, cmmVar)) {
            LogUtil.e("DeviceCreateDualChannelCommand", "Get ServiceCapability parameterCheck Failed.");
            cmhVar.e(13);
            cmhVar.d(50160);
            return cmhVar;
        }
        byte[] bArrD = cmmVar.d();
        cpl.d("DeviceCreateDualChannelCommand", bArrD, "processReceivedData dataInfos:");
        if (!cku.d(bArrD)) {
            LogUtil.e("DeviceCreateDualChannelCommand", "processReceivedData checkResponseCode Failed.");
            cmhVar.e(13);
            cmhVar.d(50160);
            return cmhVar;
        }
        LogUtil.b("DeviceCreateDualChannelCommand", "processReceivedData checkResponseCode Success.");
        d(deviceInfo, bArrD);
        DeviceCapability deviceCapabilityD = cnk.c().d(deviceInfo.getDeviceMac());
        if (deviceCapabilityD == null) {
            LogUtil.e("DeviceCreateDualChannelCommand", "processReceivedData deviceCapability is null.");
            cmhVar.e(13);
            cmhVar.d(50160);
            return cmhVar;
        }
        cms cmsVarB = b(deviceCapabilityD);
        if (!cmsVarB.c()) {
            LogUtil.e("DeviceCreateDualChannelCommand", "judgeSetTimeZoneIdCapability Failed");
            cmhVar.e(13);
            cmhVar.d(50160);
            return cmhVar;
        }
        this.mNextCommand = cmsVarB.e();
        if (this.mNextCommand == null) {
            cmhVar.e(53);
            cmhVar.d(100000);
            return cmhVar;
        }
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null) {
            LogUtil.e("DeviceCreateDualChannelCommand", "handleDualSocket deviceInfo is invalid.");
            return;
        }
        String strD = cph.d(bArr);
        if (bArr == null || bArr.length < 4) {
            LogUtil.e("DeviceCreateDualChannelCommand", "handleDualSocket dataInfos is error");
            return;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = j;
        boolean zBooleanValue = concurrentHashMap.get(deviceInfo.getDeviceMac()) != null ? concurrentHashMap.get(deviceInfo.getDeviceMac()).booleanValue() : false;
        LogUtil.b("DeviceCreateDualChannelCommand", "isSupportExtendCommand: ", Boolean.valueOf(zBooleanValue));
        if (zBooleanValue) {
            e(deviceInfo, strD);
        } else {
            b(deviceInfo, strD);
        }
    }

    private void e(DeviceInfo deviceInfo, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            cqb cqbVarA = this.g.a(str.substring(4));
            for (cqa cqaVar : cqbVarA.b()) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 1) {
                    LogUtil.b("DeviceCreateDualChannelCommand", "dealNewParse dual socket channel is ", Integer.valueOf(cpb.a(cqaVar.c())));
                    int iA2 = cpb.a(cqaVar.c());
                    h = iA2;
                    LogUtil.b("DeviceCreateDualChannelCommand", "dealNewParse channel is ", Integer.valueOf(iA2));
                    cll.c().e(deviceInfo, h);
                    f1684c.put(deviceInfo.getDeviceMac(), Integer.valueOf(h));
                } else if (iA == 2) {
                    d(deviceInfo.getDeviceMac(), cqaVar.c());
                } else if (iA != 3) {
                    LogUtil.e("DeviceCreateDualChannelCommand", "dealNewParse deal else value");
                } else {
                    c(deviceInfo.getDeviceMac(), cqaVar.c());
                }
            }
            List<cqb> listE = cqbVarA.e();
            if (listE != null && !listE.isEmpty()) {
                for (cqb cqbVar : listE.get(0).e()) {
                    cmk cmkVar = new cmk();
                    c(cqbVar, cmkVar);
                    arrayList.add(cmkVar);
                }
                LogUtil.b("DeviceCreateDualChannelCommand", "deviceIdentify: ", cpl.e(deviceInfo.getDeviceMac()), " mcuCommandList: ", arrayList);
                e.put(deviceInfo.getDeviceMac(), arrayList);
                return;
            }
            LogUtil.e("DeviceCreateDualChannelCommand", "dealNewParse tlvFathers is null.");
        } catch (cpy unused) {
            LogUtil.d("DeviceCreateDualChannelCommand", "dealNewParse handleDualSocket TlvException");
        } catch (NumberFormatException unused2) {
            LogUtil.d("DeviceCreateDualChannelCommand", "dealNewParse handleDualSocket NumberFormatException");
        }
    }

    private void c(cqb cqbVar, cmk cmkVar) {
        if (cqbVar == null || cmkVar == null) {
            LogUtil.e("DeviceCreateDualChannelCommand", "parseMcuCommandData tlvFather or mcuCommand is null");
            return;
        }
        for (cqa cqaVar : cqbVar.b()) {
            int iA = cpb.a(cqaVar.b());
            if (iA == 6) {
                cmkVar.b(cpb.a(cqaVar.c()));
            } else if (iA == 7) {
                c(cqaVar.c(), cmkVar);
            } else if (iA != 8) {
                LogUtil.e("DeviceCreateDualChannelCommand", "parseMcuCommandData deal else value");
            } else {
                String strA = cph.a(cqaVar.c());
                if (strA == null) {
                    LogUtil.d("DeviceCreateDualChannelCommand", "packageNames is null");
                    return;
                }
                List<String> arrayList = new ArrayList<>();
                if (strA.contains("#")) {
                    arrayList = Arrays.asList(strA.split("#"));
                } else {
                    arrayList.add(strA);
                }
                cmkVar.e(arrayList);
            }
        }
    }

    private void c(String str, cmk cmkVar) {
        if (str == null) {
            LogUtil.d("DeviceCreateDualChannelCommand", "value is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        for (int i = 2; i <= length; i += 2) {
            arrayList.add(Integer.valueOf(cpb.a(str.substring(i - 2, i))));
        }
        cmkVar.d(arrayList);
    }

    private void c(String str, String str2) {
        if (str != null && str2 != null) {
            if (str2.length() >= 2) {
                ArrayList arrayList = new ArrayList();
                int length = str2.length();
                for (int i = 2; i <= length; i += 2) {
                    arrayList.add(Integer.valueOf(cpb.a(str2.substring(i - 2, i))));
                }
                d.put(str, arrayList);
                LogUtil.b("DeviceCreateDualChannelCommand", "updateFileTypes, allFileTypes: ", arrayList);
                return;
            }
        }
        LogUtil.e("DeviceCreateDualChannelCommand", "updateFileTypes input is invalid.");
    }

    private void b(DeviceInfo deviceInfo, String str) {
        try {
            List<cqa> listB = this.g.a(str.substring(4)).b();
            if (listB == null || listB.size() <= 0) {
                return;
            }
            for (cqa cqaVar : listB) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 1) {
                    h = cpb.a(cqaVar.c());
                    LogUtil.b("DeviceCreateDualChannelCommand", "dealOldParse dual socket channel is ", Integer.valueOf(cpb.a(cqaVar.c())), "dealOldParse channel is ", Integer.valueOf(h));
                    cll.c().e(deviceInfo, h);
                    f1684c.put(deviceInfo.getDeviceMac(), Integer.valueOf(h));
                } else if (iA != 2) {
                    LogUtil.e("DeviceCreateDualChannelCommand", "dealOldParse parameter is invalid.");
                } else {
                    d(deviceInfo.getDeviceMac(), cqaVar.c());
                }
            }
        } catch (cpy unused) {
            LogUtil.d("DeviceCreateDualChannelCommand", "dealOldParse handleDualSocket TlvException");
        } catch (NumberFormatException unused2) {
            LogUtil.d("DeviceCreateDualChannelCommand", "dealOldParse handleDualSocket NumberFormatException");
        }
    }

    private void d(String str, String str2) {
        if (str != null && str2 != null) {
            if (str2.length() >= 2) {
                int length = str2.length();
                SparseBooleanArray sparseBooleanArray = f1682a.get(str);
                if (sparseBooleanArray != null) {
                    sparseBooleanArray.clear();
                } else {
                    sparseBooleanArray = new SparseBooleanArray(length / 2);
                }
                for (int i = 2; i <= length; i += 2) {
                    sparseBooleanArray.append(cpb.a(str2.substring(i - 2, i)), true);
                }
                LogUtil.b("DeviceCreateDualChannelCommand", "updateDualSocketService, dualServices: ", sparseBooleanArray);
                f1682a.put(str, sparseBooleanArray);
                return;
            }
        }
        LogUtil.e("DeviceCreateDualChannelCommand", "updateDualSocketService input is invalid.");
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "013C";
    }

    private cmg e(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        LogUtil.b("DeviceCreateDualChannelCommand", "Enter constructDualChannelCapabilityCommandMessage().");
        if (deviceInfo == null) {
            LogUtil.d("DeviceCreateDualChannelCommand", "deviceInfo is null");
            return super.getDeviceCommand(deviceInfo);
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = j;
        boolean zBooleanValue = concurrentHashMap.get(deviceInfo.getDeviceMac()) != null ? concurrentHashMap.get(deviceInfo.getDeviceMac()).booleanValue() : false;
        if (zBooleanValue) {
            byteBufferAllocate = ByteBuffer.allocate(10);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(6);
        }
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 60);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        if (zBooleanValue) {
            byteBufferAllocate.put((byte) 3);
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put((byte) 4);
            byteBufferAllocate.put((byte) 0);
        }
        cmg deviceCommand = super.getDeviceCommand(deviceInfo);
        deviceCommand.a(byteBufferAllocate.array());
        return deviceCommand;
    }

    public static cms b(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            LogUtil.e("DeviceCreateDualChannelCommand", "deviceCapability is null");
            return new cms(false);
        }
        if (deviceCapability.isSupportZoneId()) {
            return new cms(true, new ckw(false));
        }
        return ckw.c(deviceCapability);
    }
}
