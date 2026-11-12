package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.thirdparty.jiqid.writepad.utils;

import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import com.chinaums.pppay.unify.UnifyPayListener;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtils {
    public static final String CHINESE_OR_BLANK_REGEX = "[\\u4e00-\\u9fa5]|\\s";
    public static String DIGIT_REGEX = "\\S*[0-9]+\\S*";
    public static final String EMAIL_REGEX = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    public static final String ID_CARD_NUM_REGEX = "([0-9]{17}([0-9]|X))|([0-9]{15})";
    public static String LETTER_REGEX = "\\S*[a-zA-Z]+\\S*";
    public static final String PHONE_REGEX = "^((13[0-9])|(14[0-9])|(15[0-9])|(18[0-9])|(17[0-9]))\\d{8}$";
    public static final String SPECIALCHARREGEX = "[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）&mdash;—|{}【】‘；：”“'。，、？]";
    public static String SYMBOL_REGEX = "\\S*[\\]\\[\\-&+*/',.:;|\"`~@%$#_<>{}=?!^()\\\\]+\\S*";
    public static String[] HAN_ARRAY = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    public static String[] UNIT_ARRAY = {"十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};

    public static boolean checkLoginPswFormat(String str) {
        Matcher matcher = Pattern.compile(DIGIT_REGEX, 66).matcher(str);
        Matcher matcher2 = Pattern.compile(LETTER_REGEX, 66).matcher(str);
        Matcher matcher3 = Pattern.compile(SYMBOL_REGEX, 66).matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        boolean zFind3 = matcher3.find();
        return (zFind && zFind2) || (zFind && zFind3) || (zFind2 && zFind3);
    }

    public static boolean find(String str, String str2) {
        return Pattern.compile(str2, 66).matcher(str).find();
    }

    public static String formatAmt(String str) {
        if (isEmpty(str)) {
            return "0.00";
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str.replaceAll(",", ""));
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(2);
            decimalFormat.setMinimumFractionDigits(2);
            return decimalFormat.format(bigDecimal);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String formatAmtFromFenToYuan(String str) {
        if (isEmpty(str)) {
            return "0.00";
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(2);
            decimalFormat.setMinimumFractionDigits(2);
            return decimalFormat.format(bigDecimal.divide(new BigDecimal(100)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String formatAmtFromLiToYuan(String str) {
        if (isEmail(str)) {
            return "0.00";
        }
        try {
            return new BigDecimal(str).divide(new BigDecimal(UnifyPayListener.ERR_USER_CANCEL), 2, 3).toString();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String formatAmtFromYuanToFen(String str) {
        if (isEmpty(str)) {
            return "0";
        }
        try {
            return new DecimalFormat("0").format(new BigDecimal(str).multiply(new BigDecimal(100)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String formatEmail(String str) {
        return str.replaceAll("(.{3}).*@(.{3}).*", "$1****@$2***");
    }

    public static String formatLoginPsw(String str) {
        return str == null ? "" : str.replaceAll(CHINESE_OR_BLANK_REGEX, "");
    }

    public static String formatSize(double d) {
        if (0.0d == d) {
            return "0";
        }
        double d2 = d / 1024.0d;
        if (d2 < 1.0d) {
            return d + "Byte(s)";
        }
        double d3 = d2 / 1024.0d;
        if (d3 < 1.0d) {
            return new BigDecimal(Double.toString(d2)).setScale(2, 4).toPlainString() + "KB";
        }
        double d4 = d3 / 1024.0d;
        if (d4 < 1.0d) {
            return new BigDecimal(Double.toString(d3)).setScale(2, 4).toPlainString() + "MB";
        }
        double d5 = d4 / 1024.0d;
        if (d5 < 1.0d) {
            return new BigDecimal(Double.toString(d4)).setScale(2, 4).toPlainString() + ServerConstants.GB_COUNTRY_CODE;
        }
        return new BigDecimal(d5).setScale(2, 4).toPlainString() + "TB";
    }

    public static String formatterMobileNO(String str) {
        return str.substring(0, 3) + " " + str.substring(3, 7) + " " + str.substring(7);
    }

    public static InputFilter[] getPasswordInputFilter() {
        return new InputFilter[]{DigitsKeyListener.getInstance("[&(/',.:;)*~%$#_+-]~@%[]<>{}=|?!^\"\\`0123456789abcdefghijklmnopqrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXZY"), new InputFilter.LengthFilter(6)};
    }

    public static InputFilter[] getSpecifyInputFilter(String str) {
        return new InputFilter[]{DigitsKeyListener.getInstance(str)};
    }

    public static String hideMobileNO(String str) {
        return (isEmpty(str) || str.length() != 11) ? str : str.replaceAll("(.{3}).*(.{3})", "$1*****$2");
    }

    public static String hideMobileNO2(String str) {
        return (isEmpty(str) || str.length() != 11) ? str : str.replaceAll("(.{3}).*(.{4})", "$1*****$2");
    }

    public static boolean isBlank(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEmail(String str) {
        return Pattern.compile(EMAIL_REGEX).matcher(str).matches();
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim()) || str.length() <= 0;
    }

    public static boolean isIdCardNum(String str) {
        return Pattern.compile(ID_CARD_NUM_REGEX).matcher(str).matches();
    }

    public static boolean isMobileNO(String str) {
        return Pattern.compile(PHONE_REGEX).matcher(str).matches();
    }

    public static boolean isNotEmpty(String str) {
        return (str == null || "".equals(str.trim()) || str.length() <= 0) ? false : true;
    }

    public static boolean matches(String str, String str2) {
        return Pattern.compile(str2, 66).matcher(str).matches();
    }

    public static double parseDouble(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    public static float parseFloat(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static int parseInt(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String specialStringFilter(String str, String str2) {
        return Pattern.compile(str2).matcher(str).replaceAll("");
    }

    public static String toHanString(String str) {
        int length = str.length();
        String str2 = "";
        for (int i = 0; i < length; i++) {
            int iCharAt = str.charAt(i) - '0';
            int i2 = length - 1;
            if (i == i2 || iCharAt == 0) {
                if (iCharAt != 0 || (!str2.substring(str2.length() - 1).equals(HAN_ARRAY[0]) && i != i2)) {
                    str2 = str2 + HAN_ARRAY[iCharAt];
                }
            } else if (2 == length && 1 == iCharAt) {
                str2 = str2 + UNIT_ARRAY[(length - 2) - i];
            } else {
                str2 = str2 + HAN_ARRAY[iCharAt] + UNIT_ARRAY[(length - 2) - i];
            }
        }
        return str2.substring(str2.length() - 1).equals(HAN_ARRAY[0]) ? str2.substring(0, str2.length() - 1) : str2;
    }

    public static boolean isNotEmpty(String... strArr) {
        for (String str : strArr) {
            if (isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
