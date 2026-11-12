package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nuy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nvo.a.e f43781b;

    private static nvo.a d(String str, String str2, String str3) {
        try {
            if (TextUtils.isEmpty(str)) {
                LogUtil.d("ParseChangeLogXmlUtil", "ParseChangeLogXmlUtil parseChangeLog, changeLogFilePath is null");
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            nvo.a aVarE = nvo.e(fileInputStream, str2, str3);
            IoUtils.c(fileInputStream);
            return aVarE;
        } catch (IOException unused) {
            LogUtil.a("ParseChangeLogXmlUtil", "ParseChangeLogXmlUtil parseChangeLog error, changeLogFilePath = ", str);
            return null;
        }
    }

    public static String a(String str, String str2, String str3) {
        nvo.a aVarD = d(str, str2, str3);
        if (aVarD == null) {
            LogUtil.a("ParseChangeLogXmlUtil", "getUpdateLog null, changeLogFilePath = ", str);
            return "";
        }
        nvo.a.e eVarD = d(aVarD);
        f43781b = eVarD;
        return d(eVarD != null ? b(eVarD.f43825a) : null);
    }

    public static String e(String str, String str2, String str3) {
        nvo.a aVarD = d(str, str2, str3);
        if (aVarD == null) {
            LogUtil.a("ParseChangeLogXmlUtil", "getUpdateLog null, changeLogFilePath = ", str);
            return "";
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        nvo.a.e eVarD = d(aVarD);
        f43781b = eVarD;
        if (eVarD != null) {
            arrayList = b(eVarD.f43825a);
            arrayList2 = c(f43781b.f43827c);
        }
        arrayList.addAll(arrayList2);
        return d((List<nuk>) arrayList);
    }

    private static String d(List<nuk> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.a("ParseChangeLogXmlUtil", "upDateDetailToStr upDateDetailToStr=", "");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (nuk nukVar : list) {
            stringBuffer.append(nukVar.b()).append(System.lineSeparator()).append(nukVar.e());
        }
        String string = stringBuffer.toString();
        LogUtil.a("ParseChangeLogXmlUtil", "upDateDetailToStr features =", string);
        return string;
    }

    private static List<nuk> b(List<nvo.a.b> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (nvo.a.b bVar : list) {
                nuk nukVar = new nuk();
                StringBuffer stringBuffer = new StringBuffer("");
                if (bVar != null) {
                    nukVar.c(bVar.d);
                    Iterator<String> it = bVar.f43823c.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(it.next());
                    }
                    nukVar.a(stringBuffer.toString());
                    arrayList.add(nukVar);
                } else {
                    nukVar.c(null);
                }
            }
        }
        return arrayList;
    }

    private static List<nuk> c(List<nvo.a.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (nvo.a.c cVar : list) {
                nuk nukVar = new nuk();
                StringBuffer stringBuffer = new StringBuffer("");
                if (cVar != null) {
                    nukVar.c(cVar.d);
                    Iterator<String> it = cVar.f43824b.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(it.next());
                    }
                    nukVar.a(stringBuffer.toString());
                    arrayList.add(nukVar);
                } else {
                    nukVar.c(null);
                }
            }
        }
        return arrayList;
    }

    private static nvo.a.e d(nvo.a aVar) {
        if (aVar == null) {
            LogUtil.j("ParseChangeLogXmlUtil", "getFeatureWhenPullChangeLogSuccess msgObjOfCallBack==null");
            return null;
        }
        LogUtil.d("ParseChangeLogXmlUtil", "getFeatureWhenPullChangeLogSuccess pull change log success", ", changeLogXml.mCurrentLanguage = ", Integer.valueOf(aVar.f43822b));
        if (aVar.f43822b != -1) {
            return aVar.e.get(aVar.f43822b);
        }
        if (aVar.f43821a != -1) {
            return aVar.e.get(aVar.f43821a);
        }
        return null;
    }
}
