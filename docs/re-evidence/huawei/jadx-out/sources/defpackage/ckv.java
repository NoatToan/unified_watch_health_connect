package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase;
import com.huawei.devicesdk.connect.physical.PhysicalLayerBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ckv extends HandshakeGeneralCommandBase {
    private boolean e = false;

    public ckv(DeviceInfo deviceInfo) {
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmg getDeviceCommand(DeviceInfo deviceInfo) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferAllocate2;
        boolean zN = Utils.n();
        ReleaseLogUtil.c("DEVMGR_LinkNegotiationCommand", "is demo mobile ", Boolean.valueOf(zN));
        if (deviceInfo == null || deviceInfo.getDeviceBtType() != 0) {
            boolean z = (zN || Utils.o()) ? false : true;
            LogUtil.b("LinkNegotiationCommand", "isNotDemoPhone ", Boolean.valueOf(z));
            this.e = z;
            if (z) {
                byteBufferAllocate = ByteBuffer.allocate(12);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(10);
            }
            byteBufferAllocate.put((byte) 1).put((byte) 1);
            byteBufferAllocate.put((byte) 1).put((byte) 0);
            byteBufferAllocate.put((byte) 2).put((byte) 0);
            byteBufferAllocate.put((byte) 3).put((byte) 0);
            byteBufferAllocate.put((byte) 4).put((byte) 0);
            if (z) {
                byteBufferAllocate.put((byte) 16).put((byte) 0);
            }
            byteBufferAllocate2 = byteBufferAllocate;
        } else {
            LogUtil.b("LinkNegotiationCommand", "get device command. device bt type is AW ");
            byteBufferAllocate2 = ByteBuffer.allocate(12);
            byteBufferAllocate2.put(clu.a());
        }
        cmg unencryptedDeviceCommand = getUnencryptedDeviceCommand(deviceInfo);
        unencryptedDeviceCommand.a(byteBufferAllocate2.array());
        if (deviceInfo != null && cnk.c().c(deviceInfo.getDeviceMac()) != null) {
            LogUtil.b("LinkNegotiationCommand", "remove DeviceExInfo cache");
            cnk.c().o(deviceInfo.getDeviceMac());
        }
        ReleaseLogUtil.c("DEVMGR_LinkNegotiationCommand", cku.d("0101"));
        return unencryptedDeviceCommand;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeGeneralCommandBase, com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public cmh processReceivedData(DeviceInfo deviceInfo, cmm cmmVar) {
        int bondState;
        cmh cmhVar = new cmh();
        if (cmmVar == null || deviceInfo == null) {
            LogUtil.d("LinkNegotiationCommand", "invalid input param");
            cmhVar.e(13);
            cmhVar.d(50101);
            return cmhVar;
        }
        try {
            cml cmlVarA = a(cmmVar.d(), deviceInfo);
            if (cmlVarA == null) {
                LogUtil.d("LinkNegotiationCommand", "DeviceLinkParameter is null");
                cmhVar.e(13);
                cmhVar.d(50101);
                return cmhVar;
            }
            if (CommonUtil.ao()) {
                LogUtil.b("LinkNegotiationCommand", "debug bypassing.");
            } else if (cmlVarA.b() == 0) {
                LogUtil.e("LinkNegotiationCommand", "invalid device version.");
                cmhVar.e(13);
                cmhVar.d(50101);
                return cmhVar;
            }
            cqp.a(100061, deviceInfo.getDeviceName(), String.valueOf(cmlVarA.i()), "");
            cnc.c(deviceInfo, false);
            cmz.a(deviceInfo, false);
            cnk.c().e(deviceInfo.getDeviceMac(), cmlVarA);
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(deviceInfo.getDeviceMac());
            if (remoteDevice != null) {
                LogUtil.b("LinkNegotiationCommand", "getBondState");
                bondState = remoteDevice.getBondState();
            } else {
                bondState = 0;
            }
            LogUtil.b("LinkNegotiationCommand", "received device bondState:", Integer.valueOf(cmlVarA.a()), ",bluetoothDevice state:", Integer.valueOf(bondState));
            if (deviceInfo.getDeviceBtType() == 2 && cmlVarA.a() == 2 && bondState == 12) {
                LogUtil.b("LinkNegotiationCommand", "process KeyMiss");
                PhysicalLayerBase physicalLayerBaseD = cll.c().d(deviceInfo.getDeviceMac());
                if (physicalLayerBaseD == null) {
                    LogUtil.e("LinkNegotiationCommand", "process physicalLayerBase is empty.");
                    cmhVar.e(13);
                    cmhVar.d(50101);
                    return cmhVar;
                }
                boolean zUnPairDevice = physicalLayerBaseD.unPairDevice(deviceInfo);
                LogUtil.b("LinkNegotiationCommand", "unPair device.", cpl.a(deviceInfo.getDeviceMac()), " result:", Boolean.valueOf(zUnPairDevice));
                if (zUnPairDevice) {
                    LogUtil.b("LinkNegotiationCommand", "unPairResult success");
                    cmlVarA.e(true);
                    cmhVar.e(56);
                    cmhVar.d(50101);
                    return cmhVar;
                }
                LogUtil.b("LinkNegotiationCommand", "keyMiss unPairResult fail");
            }
            coi.b().c(deviceInfo.getDeviceMac());
            return d(deviceInfo, cmlVarA, cmhVar);
        } catch (SecurityException e) {
            LogUtil.d("LinkNegotiationCommand", "processReceivedData SecurityException:", ExceptionUtils.c(e));
            cmhVar.e(13);
            cmhVar.d(50101);
            return cmhVar;
        }
    }

    private cmh d(DeviceInfo deviceInfo, cml cmlVar, cmh cmhVar) {
        if (deviceInfo.getDeviceBtType() == 2) {
            cke ckeVar = new cke(cmlVar);
            this.mNextCommand = ckeVar.d(this.mNextCommand, 50101);
            return ckeVar.b();
        }
        this.mNextCommand = new ckr(cmlVar);
        cmhVar.e(12);
        cmhVar.d(100000);
        return cmhVar;
    }

    @Override // com.huawei.devicesdk.connect.handshake.HandshakeCommandBase
    public String getTag() {
        return "0101";
    }

    private cml a(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || coq.d(a(bArr))) {
            LogUtil.d("LinkNegotiationCommand", "get link param failed by data is null or tlvList is empty");
            return null;
        }
        List<cqa> listA = a(bArr);
        cml cmlVar = new cml();
        int i = 0;
        boolean zA = false;
        for (cqa cqaVar : listA) {
            int iA = cpb.a(cqaVar.b());
            if (iA == 15) {
                int iA2 = cpb.a(cqaVar.c());
                ReleaseLogUtil.c("DEVMGR_LinkNegotiationCommand", "setSingleFrameDevice singleFrame : ", Integer.valueOf(iA2));
                cmlVar.i(iA2);
            } else if (iA != 16) {
                switch (iA) {
                    case 1:
                        cmlVar.a(cpb.a(cqaVar.c()));
                        break;
                    case 2:
                        cmlVar.f(cpb.a(cqaVar.c()));
                        break;
                    case 3:
                        cmlVar.h(cpb.a(cqaVar.c()));
                        break;
                    case 4:
                        int iA3 = cpb.a(cqaVar.c());
                        ReleaseLogUtil.c("DEVMGR_LinkNegotiationCommand", "getLinkParameter interval : ", Integer.valueOf(iA3));
                        cmlVar.g(iA3);
                        break;
                    case 5:
                        d(cqaVar, cmlVar);
                        break;
                    case 6:
                        break;
                    default:
                        zA = a(cmlVar, zA, cqaVar);
                        break;
                }
            } else if (cpb.a(cqaVar.c()) == 1) {
                i = 1;
            }
        }
        deviceInfo.setDemoWatch((byte) i);
        if (i == 0 || !this.e) {
            b(cmlVar);
            if (!zA) {
                return cmlVar;
            }
        }
        return null;
    }

    private void b(cml cmlVar) {
        if (cmlVar.i() == 2698) {
            ReleaseLogUtil.c("DEVMGR_LinkNegotiationCommand", "avoid phone problem saga mtu 2698");
            cmlVar.h(990);
            cmlVar.f(990);
            cmlVar.g(10);
        }
    }

    private boolean a(cml cmlVar, boolean z, cqa cqaVar) {
        int iA = cpb.a(cqaVar.b());
        if (iA == 7) {
            cmlVar.m(cpb.a(cqaVar.c()));
            return z;
        }
        if (iA == 8) {
            cmlVar.c(cpb.a(cqaVar.c()));
            return z;
        }
        if (iA == 9) {
            cmlVar.e(cpb.a(cqaVar.c()));
            return z;
        }
        if (iA == 12) {
            cmlVar.d(cpb.a(cqaVar.c()));
            return z;
        }
        if (iA == 17) {
            cmlVar.j(cpb.a(cqaVar.c()));
            return z;
        }
        if (iA == 127) {
            return true;
        }
        LogUtil.d("LinkNegotiationCommand", "unknown Protocol Type");
        return z;
    }

    private List<cqa> a(byte[] bArr) {
        if (bArr == null) {
            LogUtil.d("LinkNegotiationCommand", "data is empty and return");
            return new ArrayList();
        }
        String strD = cph.d(bArr);
        if (strD == null || strD.length() < 4) {
            LogUtil.e("LinkNegotiationCommand", "dataStrInfo is null");
            return new ArrayList();
        }
        try {
            return new cqe().a(strD.substring(4)).b();
        } catch (cpy unused) {
            LogUtil.d("LinkNegotiationCommand", "resolveBTDeviceLinkParameter tlv resolve exception.");
            return new ArrayList();
        }
    }

    private void d(cqa cqaVar, cml cmlVar) {
        String strC = cqaVar.c();
        if (36 == strC.length()) {
            String strSubstring = strC.substring(0, 4);
            cmlVar.b(cpb.a(strSubstring));
            String strSubstring2 = strC.substring(4, 36);
            LogUtil.b("LinkNegotiationCommand", "resolveBTDeviceLinkParameter Authentic version : ", strSubstring, " resolveBTDeviceLinkParameter Authentic randA info : ", strSubstring2);
            cmlVar.a(strSubstring2);
            return;
        }
        LogUtil.b("LinkNegotiationCommand", "resolveBTDeviceLinkParameter error with handshake parameter is incorrect.");
    }
}
