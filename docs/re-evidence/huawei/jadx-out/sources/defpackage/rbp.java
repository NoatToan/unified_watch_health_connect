package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class rbp {
    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("VersionUtil", "version1 or version2 is null");
            return -2;
        }
        if (str.equals(str2)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length - strArrSplit2.length != 0) {
            LogUtil.a("VersionUtil", "The lengths of version1 and version2 are different");
            return -2;
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]) - Integer.parseInt(strArrSplit2[0]);
            for (int i2 = 0; i2 < strArrSplit.length && i == 0; i2++) {
                i = Integer.parseInt(strArrSplit[i2]) - Integer.parseInt(strArrSplit2[i2]);
            }
            return i > 0 ? 1 : -1;
        } catch (NumberFormatException unused) {
            LogUtil.e("VersionUtil", "compareVersion NumberFormatException");
            return -2;
        }
    }

    private static int b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.j("VersionUtil", "dir is not exists");
            return -1;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            LogUtil.j("VersionUtil", "dir is null");
            return -1;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                if (file2.isFile()) {
                    String path = file2.getPath();
                    if (path.substring(path.lastIndexOf(".") + 1).equals(str2)) {
                        i3++;
                    }
                    i2++;
                } else {
                    i++;
                }
            }
        }
        LogUtil.a("VersionUtil", "dirCount", Integer.valueOf(i), "fileCount", Integer.valueOf(i2), str2, "extCount", Integer.valueOf(i3));
        return i3 == 1 ? 1 : 0;
    }

    private static void d(List<rbk> list) {
        Collections.sort(list, new Comparator<rbk>() { // from class: rbp.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(rbk rbkVar, rbk rbkVar2) {
                if (rbkVar != null && rbkVar2 != null) {
                    return rbp.e(rbkVar.d(), rbkVar2.d());
                }
                LogUtil.j("VersionUtil", "v1 or v2 is null, just return.");
                return -2;
            }
        });
    }

    public static rbi c(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("VersionUtil", "featureDirPath is empty");
            return null;
        }
        File file = new File(str, "config.json");
        if (!file.exists()) {
            LogUtil.j("VersionUtil", "configJsonFile is not exists");
            return null;
        }
        String strA = pia.a(file);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("VersionUtil", "configJsonText is null");
            return null;
        }
        try {
            return (rbi) new Gson().fromJson(new JSONObject(CommonUtil.ac(strA)).toString(), new TypeToken<rbi>() { // from class: com.huawei.ui.device.declaration.jsonparser.util.VersionUtil$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("VersionUtil", "loadConfigJson JsonSyntaxException");
            return null;
        } catch (JSONException unused2) {
            LogUtil.e("VersionUtil", "loadConfigJson - JSONException");
            return null;
        }
    }

    public static String e(String str, String str2, rbi rbiVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || rbiVar == null) {
            LogUtil.j("VersionUtil", "emuiVersion or featureDirPath or configJson is null");
            return null;
        }
        int iE = e(str, rbiVar.c());
        LogUtil.a("VersionUtil", "scene1Result", Integer.valueOf(iE));
        if (iE != -1) {
            LogUtil.a("VersionUtil", "SCENE: delete scenario, not display");
            return null;
        }
        return b(str, str2, rbiVar);
    }

    private static String b(String str, String str2, rbi rbiVar) {
        int iB = b(str2, "xml");
        String strC = null;
        if (iB == -1) {
            LogUtil.a("VersionUtil", "isDirOneXmlFile is null");
            return null;
        }
        if (iB == 1) {
            LogUtil.a("VersionUtil", "SCENE: new and existing scenarios, display");
            int iE = e(str, rbiVar.b());
            LogUtil.a("VersionUtil", "scene2Result", Integer.valueOf(iE));
            if (iE == -1) {
                LogUtil.a("VersionUtil", "scene2 not config valid versoin");
                return null;
            }
            return rbiVar.d();
        }
        LogUtil.a("VersionUtil", "SCENE: update and re-signing scenarios, display");
        List<rbk> listA = rbiVar.a();
        if (listA == null) {
            LogUtil.j("VersionUtil", "listVersion is null");
            return null;
        }
        d(listA);
        for (rbk rbkVar : listA) {
            if (rbkVar != null && e(rbkVar.d(), str) != 1) {
                strC = rbkVar.c();
            }
        }
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a("VersionUtil", "scene3 not config valid versoin");
            return strC;
        }
        return rbiVar.d() + "_" + strC;
    }
}
