package defpackage;

import android.content.SharedPreferences;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes11.dex */
public class z6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Object f40961a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Queue<String>> f40962b = new HashMap();

    public static boolean a(XMPushService xMPushService, String str, String str2) {
        synchronized (f40961a) {
            try {
                SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
                Queue<String> queue = f40962b.get(str);
                if (queue == null) {
                    String[] strArrSplit = sharedPreferences.getString(str, "").split(",");
                    LinkedList linkedList = new LinkedList();
                    for (String str3 : strArrSplit) {
                        linkedList.add(str3);
                    }
                    f40962b.put(str, linkedList);
                    queue = linkedList;
                }
                if (queue.contains(str2)) {
                    return true;
                }
                queue.add(str2);
                if (queue.size() > 25) {
                    queue.poll();
                }
                String strD = qcs.d(queue, ",");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(str, strD);
                editorEdit.commit();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
