package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class ylw {
    public static void b(yka ykaVar) throws yib {
        if (ykaVar == null) {
            yis.c("NotifyParamCheckUtil", "checkStyleAndButtonMatch Notification is null");
        }
        int iE = ykaVar.e();
        HashMap<Integer, String> mapA = ykaVar.a();
        switch (iE) {
            case 50:
                d(mapA);
                break;
            case 51:
                b(mapA);
                break;
            case 52:
                a(mapA);
                break;
            case 53:
                e(mapA);
                break;
        }
    }

    private static void e(HashMap<Integer, String> map) throws yib {
        c(map);
        Set<Integer> setKeySet = map.keySet();
        b(setKeySet, 3);
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        c(setKeySet, hashSet);
        e(12, map.get(2));
        e(12, map.get(3));
        e(12, map.get(4));
    }

    private static void a(HashMap<Integer, String> map) throws yib {
        c(map);
        Set<Integer> setKeySet = map.keySet();
        b(setKeySet, 2);
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        hashSet.add(3);
        c(setKeySet, hashSet);
        e(12, map.get(2));
        e(12, map.get(3));
    }

    private static void b(HashMap<Integer, String> map) throws yib {
        c(map);
        Set<Integer> setKeySet = map.keySet();
        b(setKeySet, 1);
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        c(setKeySet, hashSet);
        e(12, map.get(2));
    }

    private static void d(HashMap<Integer, String> map) throws yib {
        if (map == null || map.isEmpty()) {
            return;
        }
        yis.c("NotifyParamCheckUtil", "checkNoButtonStyle styles and buttons not match");
        throw new yib(5);
    }

    private static void c(Set<Integer> set, HashSet<Integer> hashSet) throws yib {
        if (new HashSet(set).containsAll(hashSet)) {
            return;
        }
        yis.c("NotifyParamCheckUtil", "checkInputButtonIndex keySet index not match");
        throw new yib(5);
    }

    private static void b(Set<Integer> set, int i) throws yib {
        if (set.size() == i) {
            return;
        }
        yis.c("NotifyParamCheckUtil", "checkInputIndexSize button indexSize not match");
        throw new yib(5);
    }

    private static void c(HashMap<Integer, String> map) throws yib {
        if (map == null || map.isEmpty()) {
            yis.c("NotifyParamCheckUtil", "checkHashMapIsEmpty hashMap is null or hashMap is Empty");
            throw new yib(5);
        }
    }

    private static void e(int i, String str) throws yib {
        try {
            if (TextUtils.isEmpty(str) || str.getBytes("UTF-8").length > i) {
                yis.c("NotifyParamCheckUtil", "checkBtnContentLength content length not match");
                throw new yib(5);
            }
        } catch (UnsupportedEncodingException unused) {
            yis.c("NotifyParamCheckUtil", "checkBtnContentLength UnsupportedEncodingException");
            throw new yib(5);
        }
    }

    public static void b(int i) {
        if (i != -1) {
            return;
        }
        yis.c("NotifyParamCheckUtil", "checkNotifTemplateId templateId type is error");
        throw new yib(5);
    }
}
