package health.compact.a;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class EmuiBuild extends BaseBuild {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f36544b = f();
    public static final int e = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36543a = d();

    private EmuiBuild() {
    }

    private static boolean f() {
        if (!b() && e() && !c()) {
            String strD = SystemProperties.d("ro.build.version.emui");
            if (!TextUtils.isEmpty(strD) && strD.contains("EmotionUI")) {
                return true;
            }
        }
        return false;
    }

    private static String d() {
        if (!e()) {
            return "";
        }
        String strD = SystemProperties.d("ro.build.version.emui");
        if (TextUtils.isEmpty(strD)) {
            return "";
        }
        try {
            Matcher matcher = Pattern.compile("EmotionUI[ _]([0-9][0-9.]*)").matcher(strD);
            if (!matcher.find()) {
                return "";
            }
            return matcher.group(1);
        } catch (PatternSyntaxException e2) {
            LogUtil.d("HAF_SystemBuild", "getEmuiVersionImpl ex=", LogUtil.c(e2));
            return "";
        }
    }
}
