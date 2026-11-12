package defpackage;

import com.huawei.health.hwhealthlinkage.linkage.parsedata.LinkageDataHandler;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class fik {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, LinkageDataHandler> f34119b = new HashMap<Integer, LinkageDataHandler>() { // from class: fik.5
        {
            put(50004765, new fiy());
            put(50004838, new fjj());
            put(50004799, new fjy());
            put(50004396, new fiz());
            put(50004721, new fiv());
            put(50004684, new fjx());
            put(50004829, new fiw());
            put(50004146, new fjm());
            put(50004979, new fjq());
            put(50004395, new fki());
            put(50004774, new fkj());
            put(50004286, new fkd());
            put(50004172, new fin());
            put(50004881, new fir());
            put(50004011, new fju());
            put(50004549, new fkc());
            put(50004770, new fjn());
            put(50004428, new fjs());
            put(50004160, new fjo());
            put(50004589, new fim());
            put(50004934, new fjl());
            put(50004861, new fka());
            put(50004757, new fjw());
            put(50004184, new fjz());
            put(50004232, new fkb());
            put(50004254, new fix());
            put(50004872, new fis());
            put(50004858, new fip());
            put(50004935, new fjk());
            put(50004388, new fji());
            put(50004540, new fjd());
            put(50004642, new fjr());
            put(50004579, new fjp());
            put(50004617, new fil());
            put(50004749, new fiq());
            put(50004559, new fjt());
            put(50004567, new fjv());
            put(50004151, new fio());
            put(50004439, new fit());
            put(50004929, new fiu());
            put(50004086, new fke());
            put(50004826, new fkf());
            put(300001465, new fjf());
            put(300001099, new fje());
            put(300001397, new fja());
            put(300001296, new fkg());
            put(300001385, new fjg());
            put(300001574, new fjc());
            put(300001396, new fjh());
            put(300001547, new fkk());
            put(300001371, new fkl());
            put(300001648, new fij());
            put(300001367, new fkh());
        }
    };

    public static LinkageDataHandler a(int i) {
        LogUtil.a("LINKAGE_HandlerFactory", "getParsor dicId: ", Integer.valueOf(i));
        Map<Integer, LinkageDataHandler> map = f34119b;
        if (map.get(Integer.valueOf(i)) != null) {
            return map.get(Integer.valueOf(i));
        }
        return new fjb();
    }

    public static void b() {
        Iterator<Map.Entry<Integer, LinkageDataHandler>> it = f34119b.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().reset();
        }
    }
}
