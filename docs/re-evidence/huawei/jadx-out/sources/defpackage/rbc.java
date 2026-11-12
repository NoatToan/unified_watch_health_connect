package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes16.dex */
public final class rbc {
    private static final rbc d = new rbc();

    public static rbc d() {
        return d;
    }

    public rbq a(String str, String str2) throws XmlPullParserException, IOException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("DeclarationHelper", "param is empty");
            return new rbq();
        }
        return c(b(str), str2);
    }

    public rbh c(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            LogUtil.j("DeclarationHelper", "emuiVersion or featureDirPath is null");
            return null;
        }
        rbi rbiVarC = rbp.c(str);
        if (rbiVarC == null) {
            LogUtil.j("DeclarationHelper", "configJson is null");
            return null;
        }
        String strE = rbp.e(str2, str, rbiVarC);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("DeclarationHelper", "featureName is null");
            return null;
        }
        return new rbh(strE, str + File.separator + strE + WatchFaceConstant.XML_SUFFIX);
    }

    private rbq b(String str) throws XmlPullParserException, IOException {
        rce rceVar = new rce();
        try {
            FileInputStream fileInputStreamOpenInputStream = FileUtils.openInputStream(FileUtils.getFile(str));
            try {
                rbq rbqVar = rceVar.parse(fileInputStreamOpenInputStream);
                if (fileInputStreamOpenInputStream != null) {
                    fileInputStreamOpenInputStream.close();
                }
                return rbqVar;
            } catch (Throwable th) {
                if (fileInputStreamOpenInputStream != null) {
                    try {
                        fileInputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            LogUtil.e("DeclarationHelper", "parseConfig excption");
            throw e;
        }
    }

    private rbq c(rbq rbqVar, String str) throws XmlPullParserException, IOException {
        if (rbqVar == null) {
            return new rbq();
        }
        if (TextUtils.isEmpty(str)) {
            return new rbq();
        }
        rci rciVar = new rci();
        try {
            FileInputStream fileInputStreamOpenInputStream = FileUtils.openInputStream(FileUtils.getFile(str));
            try {
                rbs rbsVar = rciVar.parse(fileInputStreamOpenInputStream);
                if (fileInputStreamOpenInputStream != null) {
                    fileInputStreamOpenInputStream.close();
                }
                rbqVar.b(b(rbqVar, rbsVar));
                rbqVar.a(b(rbqVar.o(), rbsVar));
                rbqVar.c(c(rbqVar.c(), rbsVar));
                return rbqVar;
            } catch (Throwable th) {
                if (fileInputStreamOpenInputStream != null) {
                    try {
                        fileInputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            LogUtil.e("DeclarationHelper", "parseLanguage catch excption");
            throw e;
        }
    }

    private String b(rbq rbqVar, rbs rbsVar) {
        String strE = rbqVar.e();
        LogUtil.a("DeclarationHelper", "fillContentVersion", strE);
        return rbsVar.e(strE);
    }

    private rbr b(rbr rbrVar, rbs rbsVar) {
        rbrVar.e(rbsVar.e(rbrVar.b()));
        return rbrVar;
    }

    private rbo c(rbo rboVar, rbs rbsVar) {
        List<rbx> listC = rboVar.c();
        for (int i = 0; i < listC.size(); i++) {
            e(listC.get(i), rbsVar);
        }
        return rboVar;
    }

    private void e(rbx rbxVar, rbs rbsVar) {
        if (rbxVar instanceof rbw) {
            c((rbw) rbxVar, rbsVar);
            return;
        }
        if (rbxVar instanceof rby) {
            d((rby) rbxVar, rbsVar);
        } else if (rbxVar instanceof rca) {
            a((rca) rbxVar, rbsVar);
        } else {
            LogUtil.a("DeclarationHelper", "fillPart: not supported type");
        }
    }

    private void c(rbw rbwVar, rbs rbsVar) {
        if (rbwVar == null || rbsVar == null) {
            LogUtil.j("DeclarationHelper", "paragraph or stringResource is null");
            return;
        }
        String strE = rbsVar.e(rbwVar.b());
        d(rbwVar, rbsVar);
        rbwVar.d(strE);
    }

    private void d(rbx rbxVar, rbs rbsVar) {
        List<rcb> listE = rbxVar.e();
        int size = listE.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            rcb rcbVar = listE.get(i);
            c(rbsVar, strArr, i, rcbVar);
            if (rcbVar instanceof rcd) {
                d(rbsVar, (rcd) rcbVar);
            } else if (rcbVar instanceof rcc) {
                e(rbsVar, (rcc) rcbVar);
            } else {
                LogUtil.a("DeclarationHelper", "parsePlaceHolder: not supported placeholder.");
            }
        }
    }

    private void c(rbs rbsVar, Object[] objArr, int i, rcb rcbVar) {
        String strE = rbsVar.e(rcbVar.c());
        objArr[i] = strE;
        rcbVar.d(strE);
    }

    private void d(rbs rbsVar, rcd rcdVar) {
        rcdVar.b(rbsVar.e(rcdVar.a()));
    }

    private void e(rbs rbsVar, rcc rccVar) {
        rccVar.b(rbsVar.e(rccVar.a()));
    }

    private void d(rby rbyVar, rbs rbsVar) {
        if (rbyVar == null || rbsVar == null) {
            LogUtil.j("DeclarationHelper", "checkbox or stringResource is null");
            return;
        }
        rbyVar.d(rbsVar.e(rbyVar.d()));
        rbyVar.e(rbsVar.e(rbyVar.a()));
        d((rbx) rbyVar, rbsVar);
    }

    private void a(rca rcaVar, rbs rbsVar) {
        if (rcaVar == null || rbsVar == null) {
            LogUtil.j("DeclarationHelper", "switchFace or stringResource is null");
            return;
        }
        rcaVar.b(rbsVar.e(rcaVar.b()));
        rbu rbuVarA = rcaVar.a();
        if (rbuVarA == null) {
            LogUtil.j("DeclarationHelper", "SwitchFaceConfig is null");
        } else {
            rbuVarA.b(rbsVar.e(rbuVarA.a()));
            rcaVar.a(rbuVarA);
        }
    }
}
