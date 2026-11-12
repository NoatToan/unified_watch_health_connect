package com.miui.tsmclient.util;

import android.text.Editable;
import android.text.TextUtils;
import androidx.room.RoomMasterTable;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class IdCardFormatter extends Formatter {
    private static int[] ID_CARD_SEP = {6, 10, 14};

    private boolean checkIDCardNum(String str) {
        if (!TextUtils.isEmpty(str) && str.matches("^\\d{15}|\\d{17}[Xx\\d]$")) {
            String[] strArr = {"1", "0", "X", UserConfig.KEY_LITE_SCENE_ORDER, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, "6", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "4", "3", "2"};
            String[] strArr2 = {UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_LITE_SCENE_ORDER, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD, UserConfig.KEY_DEVICE_LITE_SORT_GROUP, UserConfig.KEY_MI_BRAIN_SETTING, "4", "2", "1", "6", "3", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_LITE_SCENE_ORDER, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD, UserConfig.KEY_DEVICE_LITE_SORT_GROUP, UserConfig.KEY_MI_BRAIN_SETTING, "4", "2"};
            if (str.length() != 15 && str.length() != 18) {
                return false;
            }
            String strSubstring = str.length() == 18 ? str.substring(0, 17) : str.substring(0, 6) + "19" + str.substring(6, 15);
            if (!isNumeric(strSubstring)) {
                return false;
            }
            String strSubstring2 = strSubstring.substring(6, 10);
            String strSubstring3 = strSubstring.substring(10, 12);
            String strSubstring4 = strSubstring.substring(12, 14);
            if (!isDate(strSubstring2 + "-" + strSubstring3 + "-" + strSubstring4)) {
                return false;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                if (gregorianCalendar.get(1) - Integer.parseInt(strSubstring2) <= 150) {
                    if (gregorianCalendar.getTime().getTime() - simpleDateFormat.parse(strSubstring2 + "-" + strSubstring3 + "-" + strSubstring4).getTime() < 0 || Integer.parseInt(strSubstring3) > 12 || Integer.parseInt(strSubstring3) == 0 || Integer.parseInt(strSubstring4) > 31 || Integer.parseInt(strSubstring4) == 0 || getRegionMap().get(strSubstring.substring(0, 2)) == null) {
                        return false;
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < 17; i2++) {
                        i += Integer.parseInt(String.valueOf(strSubstring.charAt(i2))) * Integer.parseInt(strArr2[i2]);
                    }
                    String str2 = strArr[i % 11];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strSubstring);
                    sb.append(str2);
                    return str.length() != 18 || sb.toString().equals(str);
                }
            } catch (ParseException unused) {
            }
        }
        return false;
    }

    private HashMap<String, String> getRegionMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, "北京");
        map.put("12", "天津");
        map.put("13", "河北");
        map.put("14", "山西");
        map.put("15", "内蒙古");
        map.put("21", "辽宁");
        map.put("22", "吉林");
        map.put("23", "黑龙江");
        map.put(CardInfoBeanKt.sStatusDisableCard, "上海");
        map.put("32", "江苏");
        map.put("33", "浙江");
        map.put("34", "安徽");
        map.put("35", "福建");
        map.put("36", "江西");
        map.put("37", "山东");
        map.put("41", "河南");
        map.put(RoomMasterTable.DEFAULT_ID, "湖北");
        map.put("43", "湖南");
        map.put("44", "广东");
        map.put("45", "广西");
        map.put("46", "海南");
        map.put(CarKeyConstants.CCC_ACTION_VEHICLE_TRIGGERED_LOCK, "重庆");
        map.put(CarKeyConstants.CCC_ACTION_VEHICLE_TRIGGERED_UNLOCK, "四川");
        map.put("52", "贵州");
        map.put("53", "云南");
        map.put("54", "西藏");
        map.put("61", "陕西");
        map.put("62", "甘肃");
        map.put("63", "青海");
        map.put("64", "宁夏");
        map.put("65", "新疆");
        map.put("71", "台湾");
        map.put("81", "香港");
        map.put("82", "澳门");
        map.put("91", "国外");
        return map;
    }

    private boolean isDate(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
    }

    private boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[0-9]*");
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void format(Editable editable) {
        clean(editable);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < editable.length()) {
            int[] iArr = ID_CARD_SEP;
            if (i2 < iArr.length && i3 == iArr[i2]) {
                editable.insert(i, Character.toString(this.SEPARATOR));
                i2++;
                i++;
            }
            i++;
            i3++;
        }
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValid(String str) {
        return checkIDCardNum(str);
    }

    @Override // com.miui.tsmclient.util.Formatter
    public boolean isValidCharacter(char c) {
        return Character.isDigit(c) || 'x' == Character.toLowerCase(c);
    }

    @Override // com.miui.tsmclient.util.Formatter
    public void setContentDescription(String str) {
        super.setContentDescription(StringUtils.replaceAll(str, StringUtils.SOURCE_ANY_FORMAT, StringUtils.SOURCE_SPACE_FORMAT));
    }
}
