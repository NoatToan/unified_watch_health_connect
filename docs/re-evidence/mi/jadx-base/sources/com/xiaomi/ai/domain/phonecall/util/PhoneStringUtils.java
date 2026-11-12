package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.smarthome.framework.api.UserConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneStringUtils {
    private static final Map<Character, String> zhDigitToArabic;

    static {
        HashMap map = new HashMap();
        zhDigitToArabic = map;
        map.put((char) 38646, "0");
        map.put((char) 19968, "1");
        map.put((char) 20108, "2");
        map.put((char) 19977, "3");
        map.put((char) 22235, "4");
        map.put((char) 20116, UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
        map.put((char) 20845, "6");
        map.put((char) 19971, UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP);
        map.put((char) 20843, UserConfig.KEY_MI_BRAIN_SETTING);
        map.put((char) 20061, UserConfig.KEY_LITE_SCENE_ORDER);
        map.put('0', "0");
        map.put('1', "1");
        map.put('2', "2");
        map.put('3', "3");
        map.put('4', "4");
        map.put('5', UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
        map.put('6', "6");
        map.put('7', UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP);
        map.put('8', UserConfig.KEY_MI_BRAIN_SETTING);
        map.put('9', UserConfig.KEY_LITE_SCENE_ORDER);
        map.put((char) 22777, "1");
        map.put((char) 36144, "2");
        map.put((char) 21441, "3");
        map.put((char) 32902, "4");
        map.put((char) 20237, UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
        map.put((char) 38470, "6");
        map.put((char) 26578, UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP);
        map.put((char) 25420, UserConfig.KEY_MI_BRAIN_SETTING);
        map.put((char) 29590, UserConfig.KEY_LITE_SCENE_ORDER);
    }

    public static String normZhPhoneNumberToArabic(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character chValueOf = Character.valueOf(str.charAt(i));
            Map<Character, String> map = zhDigitToArabic;
            if (map.containsKey(chValueOf)) {
                sb.append(map.get(chValueOf));
            } else {
                sb.append(chValueOf.toString());
            }
        }
        return sb.toString();
    }
}
