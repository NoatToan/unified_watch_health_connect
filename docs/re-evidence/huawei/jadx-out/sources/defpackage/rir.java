package defpackage;

import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, BacklogType> f47366a = new HashMap(BacklogType.values().length);

    static {
        for (BacklogType backlogType : BacklogType.values()) {
            f47366a.put(backlogType.getId(), backlogType);
        }
    }

    public static BacklogEvent e(BacklogType backlogType) {
        try {
            Class<?> cls = Class.forName(backlogType.getClassName());
            LogUtil.b("BacklogEventFactory", "createBacklogEvent eventClass:", cls);
            return (BacklogEvent) cls.newInstance();
        } catch (ClassNotFoundException e) {
            LogUtil.d("BacklogEventFactory", "BacklogEventFactory ClassNotFoundException", LogAnonymous.b(e));
            return null;
        } catch (IllegalAccessException e2) {
            LogUtil.d("BacklogEventFactory", "BacklogEventFactory IllegalAccessException", LogAnonymous.b(e2));
            return null;
        } catch (InstantiationException e3) {
            LogUtil.d("BacklogEventFactory", "BacklogEventFactory InstantiationException", LogAnonymous.b(e3));
            return null;
        }
    }

    public static BacklogEvent d(String str) {
        BacklogType backlogType = f47366a.get(str);
        if (backlogType == null) {
            return null;
        }
        return e(backlogType);
    }
}
