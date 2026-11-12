package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public class zwh {
    public static String a(String str) {
        char[] charArray = str.toCharArray();
        ukb ukbVar = new ukb();
        ukbVar.e(tkb.f34787b);
        ukbVar.f(vkb.c);
        String str2 = "";
        for (int i = 0; i < charArray.length; i++) {
            if (Character.toString(charArray[i]).matches("[\\u4E00-\\u9FA5]+")) {
                try {
                    str2 = str2 + ywh.c(charArray[i], ukbVar)[0].charAt(0);
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                str2 = str2 + charArray[i];
            }
        }
        return str2;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
        }
        String upperCase = str.substring(0, 1).toUpperCase();
        return upperCase.matches("[A-Z]") ? upperCase.toUpperCase() : PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX;
    }

    public static String c(String str) {
        ukb ukbVar = new ukb();
        ukbVar.e(tkb.c);
        ukbVar.f(vkb.c);
        ukbVar.g(wkb.c);
        if (str == null || str.length() <= 0 || AbstractJsonLexerKt.NULL.equals(str)) {
            return Marker.ANY_MARKER;
        }
        char[] charArray = str.trim().toCharArray();
        String str2 = "";
        for (int i = 0; i < charArray.length; i++) {
            try {
                str2 = Character.toString(charArray[i]).matches("[\\u4E00-\\u9FA5]+") ? str2 + ywh.c(charArray[i], ukbVar)[0] : str2 + Character.toString(charArray[i]);
            } catch (BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return str2;
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? "" : c(str);
    }
}
