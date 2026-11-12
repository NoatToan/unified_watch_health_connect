package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class dxc {
    public static final String e = b(new String[]{"healthdevice"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32474a = b(new String[]{"healthdevice", "catch"});
    public static final String d = b(new String[]{"plugins"});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f32475b = b(new String[]{"healthdevice", "products"});

    private static String b(String[] strArr) {
        String string;
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(File.separator);
            sb.append(str);
        }
        if (strArr.length != 0) {
            sb.append(File.separator);
            string = sb.toString();
        } else {
            string = "";
        }
        try {
            return dxw.d().getFilesDir().getCanonicalPath() + string;
        } catch (IOException unused) {
            LogUtil.a("PluginDevice_Constants", "failed to process file path");
            return string;
        }
    }
}
