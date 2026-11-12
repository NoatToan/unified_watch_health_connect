package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.SendMode;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xjf {
    public static cmg b(eef eefVar) {
        if (a(eefVar) || eefVar.getConfigInfoList() == null) {
            LogUtil.e("ConvertCommandUtil", "getCommandTlv getCommandTlv error");
            return null;
        }
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        cqj cqjVar = new cqj();
        cqjVar.e(55, 1);
        cqjVar.b(1, eefVar.getSrcPkgName()).b(2, eefVar.getWearPkgName()).a(3);
        for (eeg eegVar : configInfoList) {
            if (eegVar != null) {
                cqjVar.d(4).d(5, (int) eegVar.c()).c(6, eegVar.d());
                if (eegVar.e() != null) {
                    cqjVar.a(7, eegVar.e());
                }
                Long lB = eegVar.b();
                if (lB != null) {
                    cqjVar.b(8, lB.longValue());
                    LogUtil.b("ConvertCommandUtil", "getCommandTlv lose weight:", lB);
                }
                cqjVar.b(cqjVar.b());
            }
        }
        return b(cqjVar.a(cqjVar.d()).e());
    }

    public static cmg c(eee eeeVar) {
        if (a(eeeVar)) {
            LogUtil.e("ConvertCommandUtil", "getCommandTlv sampleEvent error");
            return null;
        }
        cqj cqjVar = new cqj();
        cqjVar.e(55, 2).b(1, eeeVar.getSrcPkgName()).b(2, eeeVar.getWearPkgName()).j(3, (int) eeeVar.d()).g(4, eeeVar.b());
        if (eeeVar.c() != null) {
            cqjVar.e(5, eeeVar.c());
        }
        return b(cqjVar.e());
    }

    public static cmg c(eeh eehVar) {
        if (a(eehVar) || eehVar.b() == null) {
            LogUtil.e("ConvertCommandUtil", "getCommandTlv SamplePoint error");
            return null;
        }
        cqj cqjVar = new cqj();
        cqjVar.e(55, 3).b(1, eehVar.getSrcPkgName()).b(2, eehVar.getWearPkgName()).j(3, (int) eehVar.c());
        if (eehVar.d() != -1) {
            cqjVar.j(4, (int) eehVar.d());
        }
        if (eehVar.a() != -1) {
            cqjVar.j(5, (int) eehVar.a());
        }
        cqjVar.a(6);
        for (eed eedVar : eehVar.b()) {
            if (eedVar != null) {
                cqjVar.d(7).d(8, (int) eedVar.a());
                if (eedVar.b() != null) {
                    cqjVar.a(9, eedVar.b());
                }
                cqjVar.b(cqjVar.b());
            }
        }
        cqjVar.a(cqjVar.d());
        byte[] bArrE = eehVar.e();
        if (bArrE != null) {
            cqjVar.e(10, bArrE);
        }
        return b(cqjVar.e());
    }

    public static cmg c(eea eeaVar) {
        LogUtil.b("ConvertCommandUtil", "getCommandTlv start");
        if (a(eeaVar) || eeaVar.e() == null) {
            LogUtil.e("ConvertCommandUtil", "getCommandTlv DictionaryPointInfo error");
            return null;
        }
        cqj cqjVar = new cqj();
        cqjVar.e(55, 4).b(1, eeaVar.getSrcPkgName()).b(2, eeaVar.getWearPkgName()).j(3, (int) eeaVar.c());
        cqjVar.a(4);
        List<eeb> listE = eeaVar.e();
        int iB = eeaVar.b();
        for (eeb eebVar : listE) {
            if (eebVar != null) {
                cqjVar.d(5);
                cqjVar.b(6, eebVar.e());
                cqjVar.b(7, eebVar.c());
                if (eebVar.d() != -1) {
                    cqjVar.b(8, eebVar.d());
                }
                cqjVar.e(e(eebVar.b())).a(13, eebVar.a());
                cqjVar.b(cqjVar.b());
                iB--;
                if (iB <= 0) {
                    LogUtil.e("ConvertCommandUtil", "overload all data is " + listE.size() + " current is " + eeaVar.b());
                    break;
                }
            }
        }
        cqjVar.a(cqjVar.d());
        return b(cqjVar.e());
    }

    private static byte[] e(List<eed> list) {
        if (list == null || list.isEmpty()) {
            return new byte[0];
        }
        cqj cqjVar = new cqj();
        cqjVar.a(9);
        for (eed eedVar : list) {
            cqjVar.d(10).d(11, (int) eedVar.a()).a(12, eedVar.b());
            cqjVar.b(cqjVar.b());
        }
        return cqjVar.d();
    }

    private static cmg b(byte[] bArr) {
        cmg cmgVar = new cmg();
        cmgVar.a(bArr);
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        return cmgVar;
    }

    private static boolean a(eec eecVar) {
        if (eecVar != null) {
            return TextUtils.isEmpty(eecVar.getSrcPkgName()) || TextUtils.isEmpty(eecVar.getWearPkgName());
        }
        LogUtil.e("ConvertCommandUtil", "sampleBase is null.");
        return true;
    }
}
