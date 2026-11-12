package defpackage;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class luh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40839a = new Object();
    private static Map<Integer, List<IBaseResponseCallback>> e = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f40840b = new ArrayList(Arrays.asList(2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 16, 20, 21, 23, 24, 25, 27, 26, 29, 34, 35, 36));

    public static void a() {
        synchronized (f40839a) {
            if (e.isEmpty()) {
                Iterator<Integer> it = f40840b.iterator();
                while (it.hasNext()) {
                    e.put(it.next(), new ArrayList(10));
                }
            }
        }
    }

    public static void a(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("CommandCallback", "Enter addToCommandCallbackMap method. commandId: ", Integer.valueOf(i));
        synchronized (f40839a) {
            if (iBaseResponseCallback != null) {
                e.get(Integer.valueOf(i)).add(iBaseResponseCallback);
            }
        }
    }

    public static List<IBaseResponseCallback> b(int i) {
        LogUtil.a("CommandCallback", "Enter getCommandCallback method");
        synchronized (f40839a) {
            if (e.containsKey(Integer.valueOf(i))) {
                return e.get(Integer.valueOf(i));
            }
            return new ArrayList(10);
        }
    }

    public static void b() {
        LogUtil.a("CommandCallback", "Enter releaseAllCommandCallbackMap method");
        synchronized (f40839a) {
            Iterator<Integer> it = f40840b.iterator();
            while (it.hasNext()) {
                e(it.next().intValue());
            }
        }
    }

    public static void e() {
        LogUtil.a("CommandCallback", "Enter resetCommandCallbackMap method");
        synchronized (f40839a) {
            Iterator<Integer> it = f40840b.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (iIntValue != 13) {
                    e(iIntValue);
                }
            }
        }
    }

    private static void e(int i) {
        LogUtil.a("CommandCallback", "Enter removeCommandCallback method");
        synchronized (f40839a) {
            if (e.get(Integer.valueOf(i)) != null) {
                e.get(Integer.valueOf(i)).clear();
            }
        }
    }

    public static void e(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("CommandCallback", "Enter removeCommandCallByCommandId method. commandId: ", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            LogUtil.a("CommandCallback", " removeCommandCallByCommandId callback is null ");
            return;
        }
        synchronized (f40839a) {
            List<IBaseResponseCallback> list = e.get(Integer.valueOf(i));
            if (!CollectionUtils.a(list)) {
                LogUtil.a("CommandCallback", "removeCommandCallByCommandId. result: ", Boolean.valueOf(list.remove(iBaseResponseCallback)));
            } else {
                LogUtil.a("CommandCallback", "removeCommandCallByCommandId. callbackList is empty");
            }
        }
    }
}
