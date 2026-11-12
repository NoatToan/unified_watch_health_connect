package cn.hutool.core.util;

import androidx.room.RoomMasterTable;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.a;
import com.miui.tsmclient.util.CarKeyConstants;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import defpackage.b4s;
import defpackage.imh;
import defpackage.jcj;
import defpackage.lio;
import defpackage.qk1;
import defpackage.wp5;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class IdcardUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5562a = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f5563b;
    public static final Map<Character, Integer> c;

    public static class Idcard implements Serializable {
        private static final long serialVersionUID = 1;
        private final int age;
        private final DateTime birthDate;
        private final String cityCode;
        private final Integer gender;
        private final String provinceCode;

        public Idcard(String str) {
            this.provinceCode = IdcardUtil.m(str);
            this.cityCode = IdcardUtil.j(str);
            this.birthDate = IdcardUtil.g(str);
            this.gender = Integer.valueOf(IdcardUtil.k(str));
            this.age = IdcardUtil.c(str);
        }

        public int getAge() {
            return this.age;
        }

        public DateTime getBirthDate() {
            return this.birthDate;
        }

        public String getCityCode() {
            return this.cityCode;
        }

        public Integer getGender() {
            return this.gender;
        }

        public String getProvince() {
            return (String) IdcardUtil.f5563b.get(this.provinceCode);
        }

        public String getProvinceCode() {
            return this.provinceCode;
        }

        public String toString() {
            return "Idcard{provinceCode='" + this.provinceCode + "', cityCode='" + this.cityCode + "', birthDate=" + this.birthDate + ", gender=" + this.gender + ", age=" + this.age + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static {
        HashMap map = new HashMap();
        f5563b = map;
        HashMap map2 = new HashMap();
        c = map2;
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
        map.put("83", "台湾");
        map.put("91", "国外");
        map2.put('A', 10);
        map2.put('B', 11);
        map2.put('C', 12);
        map2.put('D', 13);
        map2.put('E', 14);
        map2.put('F', 15);
        map2.put('G', 16);
        map2.put('H', 17);
        map2.put('J', 18);
        map2.put('K', 19);
        map2.put('L', 20);
        map2.put('M', 21);
        map2.put('N', 22);
        map2.put('P', 23);
        map2.put('Q', 24);
        map2.put('R', 25);
        map2.put('S', 26);
        map2.put('T', 27);
        map2.put('U', 28);
        map2.put('V', 29);
        map2.put('X', 30);
        map2.put('Y', 31);
        map2.put('W', 32);
        map2.put('Z', 33);
        map2.put('I', 34);
        map2.put('O', 35);
    }

    public static String b(String str) {
        if (str.length() != 15 || !jcj.a(imh.f21296b, str)) {
            return null;
        }
        int iZ = a.z(a.t(str.substring(6, 12), "yyMMdd"));
        if (iZ > 2000) {
            iZ -= 100;
        }
        StringBuilder sbA0 = lio.A0();
        sbA0.append((CharSequence) str, 0, 6);
        sbA0.append(iZ);
        sbA0.append(str.substring(8));
        sbA0.append(i(sbA0.toString()));
        return sbA0.toString();
    }

    public static int c(String str) {
        return d(str, a.e());
    }

    public static int d(String str, Date date) {
        return a.d(a.t(f(str), "yyyyMMdd"), date);
    }

    public static String e(String str) {
        qk1.p(str, "id card must be not blank!", new Object[0]);
        int length = str.length();
        if (length < 15) {
            return null;
        }
        if (length == 15) {
            str = b(str);
        }
        Objects.requireNonNull(str);
        return str.substring(6, 14);
    }

    public static String f(String str) {
        return e(str);
    }

    public static DateTime g(String str) {
        String strF = f(str);
        if (strF == null) {
            return null;
        }
        return a.s(strF, wp5.v);
    }

    public static char h(int i) {
        switch (i % 11) {
            case 0:
                return '1';
            case 1:
                return '0';
            case 2:
                return 'X';
            case 3:
                return '9';
            case 4:
                return '8';
            case 5:
                return '7';
            case 6:
                return '6';
            case 7:
                return '5';
            case 8:
                return '4';
            case 9:
                return '3';
            case 10:
                return '2';
            default:
                return ' ';
        }
    }

    public static char i(String str) {
        return h(l(str.toCharArray()));
    }

    public static String j(String str) {
        int length = str.length();
        if (length == 15 || length == 18) {
            return str.substring(0, 5);
        }
        return null;
    }

    public static int k(String str) {
        qk1.o(str);
        int length = str.length();
        if (length < 15) {
            throw new IllegalArgumentException("ID Card length must be 15 or 18");
        }
        if (length == 15) {
            str = b(str);
        }
        Objects.requireNonNull(str);
        return str.charAt(16) % 2 != 0 ? 1 : 0;
    }

    public static int l(char[] cArr) {
        if (f5562a.length != cArr.length) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < cArr.length; i2++) {
            i += Integer.parseInt(String.valueOf(cArr[i2])) * f5562a[i2];
        }
        return i;
    }

    public static String m(String str) {
        int length = str.length();
        if (length == 15 || length == 18) {
            return str.substring(0, 2);
        }
        return null;
    }
}
