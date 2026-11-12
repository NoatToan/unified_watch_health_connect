package com.huami.moving.ui.utils;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes4.dex */
public class SportRecordQueryConstrainUtils {
    private static final List<Integer> a;
    private static StringBuffer b;
    private static List<Integer> c;

    @Deprecated
    private static List<Integer> d;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(21);
        arrayList.add(2001);
        arrayList.add(2002);
        arrayList.add(22);
        arrayList.add(23);
        arrayList.add(24);
        arrayList.add(25);
        arrayList.add(26);
        arrayList.add(40);
        arrayList.add(41);
        arrayList.add(42);
        arrayList.add(43);
        arrayList.add(44);
        arrayList.add(45);
        arrayList.add(105);
        arrayList.add(46);
        arrayList.add(47);
        arrayList.add(48);
        arrayList.add(49);
        arrayList.add(50);
        arrayList.add(51);
        arrayList.add(52);
        arrayList.add(53);
        arrayList.add(54);
        arrayList.add(55);
        arrayList.add(57);
        arrayList.add(58);
        arrayList.add(59);
        arrayList.add(60);
        arrayList.add(61);
        arrayList.add(62);
        arrayList.add(63);
        arrayList.add(64);
        arrayList.add(65);
        arrayList.add(66);
        arrayList.add(67);
        arrayList.add(68);
        arrayList.add(69);
        arrayList.add(70);
        arrayList.add(71);
        arrayList.add(72);
        arrayList.add(73);
        arrayList.add(74);
        arrayList.add(75);
        arrayList.add(76);
        arrayList.add(77);
        arrayList.add(78);
        arrayList.add(79);
        arrayList.add(80);
        arrayList.add(81);
        arrayList.add(82);
        arrayList.add(83);
        arrayList.add(84);
        arrayList.add(85);
        arrayList.add(86);
        arrayList.add(87);
        arrayList.add(88);
        arrayList.add(89);
        arrayList.add(90);
        arrayList.add(91);
        arrayList.add(92);
        arrayList.add(93);
        arrayList.add(94);
        arrayList.add(95);
        arrayList.add(96);
        arrayList.add(97);
        arrayList.add(98);
        arrayList.add(99);
        arrayList.add(100);
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        arrayList.add(104);
        arrayList.add(106);
        arrayList.add(107);
        arrayList.add(108);
        arrayList.add(109);
        arrayList.add(110);
        arrayList.add(111);
        arrayList.add(112);
        arrayList.add(113);
        arrayList.add(114);
        arrayList.add(115);
        arrayList.add(116);
        arrayList.add(117);
        arrayList.add(118);
        arrayList.add(119);
        arrayList.add(120);
        arrayList.add(121);
        arrayList.add(122);
        arrayList.add(123);
        arrayList.add(124);
        arrayList.add(125);
        arrayList.add(126);
        arrayList.add(127);
        arrayList.add(128);
        arrayList.add(129);
        arrayList.add(130);
        arrayList.add(131);
        arrayList.add(132);
        arrayList.add(133);
        arrayList.add(189);
        arrayList.add(190);
        arrayList.add(136);
        arrayList.add(137);
        arrayList.add(138);
        arrayList.add(139);
        arrayList.add(140);
        arrayList.add(141);
        arrayList.add(142);
        arrayList.add(143);
        arrayList.add(145);
        arrayList.add(146);
        arrayList.add(147);
        arrayList.add(148);
        arrayList.add(149);
        arrayList.add(150);
        arrayList.add(151);
        arrayList.add(152);
        arrayList.add(153);
        arrayList.add(154);
        arrayList.add(155);
        arrayList.add(156);
        arrayList.add(157);
        arrayList.add(158);
        arrayList.add(159);
        arrayList.add(160);
        arrayList.add(161);
        arrayList.add(162);
        arrayList.add(163);
        arrayList.add(164);
        arrayList.add(165);
        arrayList.add(166);
        arrayList.add(167);
        arrayList.add(168);
        arrayList.add(169);
        arrayList.add(170);
        arrayList.add(171);
        arrayList.add(172);
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHESS));
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_CHECKERS));
        arrayList.add(175);
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BRIDGE));
        arrayList.add(177);
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING));
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_SHOOT));
        arrayList.add(180);
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_DOWNHILL));
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING));
        arrayList.add(183);
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_BOULDERING));
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_MODERN_DANCE));
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_DISCO));
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_TAP_DANCE));
        arrayList.add(188);
        arrayList.add(Integer.valueOf(DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER));
        arrayList.add(192);
        ArrayList arrayList2 = new ArrayList();
        c = arrayList2;
        arrayList2.add(1001);
        c.add(1015);
        c.add(1009);
        d = new ArrayList();
    }

    public static boolean isSilentProcessSportType(int i) {
        return (a.contains(Integer.valueOf(i)) || c.contains(Integer.valueOf(i))) ? false : true;
    }

    public static boolean isSubSportType(int i) {
        return c.contains(Integer.valueOf(i));
    }

    public static WhereCondition querySportRecordBySportType() {
        return TrackrecordDao.Properties.Type.in(a);
    }

    public static String sportTypesToInSql() {
        if (b == null) {
            b = new StringBuffer();
            for (Integer num : a) {
                StringBuffer stringBuffer = b;
                stringBuffer.append(num);
                stringBuffer.append(',');
            }
            StringBuffer stringBuffer2 = b;
            stringBuffer2.deleteCharAt(stringBuffer2.length() - 1);
        }
        return b.toString();
    }
}
