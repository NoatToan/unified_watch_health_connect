package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.dc;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class at {
    private static volatile at d;
    public SharedPreferences a;
    public SharedPreferences b;
    private HashSet<a> c = new HashSet<>();

    public static abstract class a implements Runnable {
        private int a;
        private String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public abstract void a();

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    private at(Context context) {
        this.a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public static at a(Context context) {
        if (d == null) {
            synchronized (at.class) {
                if (d == null) {
                    d = new at(context);
                }
            }
        }
        return d;
    }

    private String b(int i) {
        return "oc_" + i;
    }

    private String c(dc dcVar) {
        return "oc_version_" + dcVar.a();
    }

    private void d(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public int a(int i, int i2) {
        try {
            String strB = b(i);
            if (this.b.contains(strB)) {
                return this.b.getInt(strB, 0);
            }
            return this.a.contains(strB) ? this.a.getInt(strB, 0) : i2;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(i + " oc int error " + e);
            return i2;
        }
    }

    public int a(dc dcVar, int i) {
        try {
            return this.a.getInt(c(dcVar), i);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(dcVar + " version error " + e);
            return i;
        }
    }

    public synchronized void a() {
        this.c.clear();
    }

    public synchronized void a(a aVar) {
        if (!this.c.contains(aVar)) {
            this.c.add(aVar);
        }
    }

    public void a(List<Pair<Integer, Object>> list) {
        if (com.xiaomi.push.k.a(list)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String strB = b(((Integer) obj).intValue());
                if (pair.second == null) {
                    editorEdit.remove(strB);
                } else {
                    d(editorEdit, pair, strB);
                }
            }
        }
        editorEdit.apply();
    }

    public void a(List<Pair<dc, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (com.xiaomi.push.k.a(list) || com.xiaomi.push.k.a(list2)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.clear();
        for (Pair<dc, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                editorEdit.putInt(c((dc) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                d(editorEdit, pair2, b(((Integer) obj2).intValue()));
            }
        }
        editorEdit.apply();
    }

    public boolean a(int i, boolean z) {
        try {
            String strB = b(i);
            if (this.b.contains(strB)) {
                return this.b.getBoolean(strB, false);
            }
            return this.a.contains(strB) ? this.a.getBoolean(strB, false) : z;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(i + " oc boolean error " + e);
            return z;
        }
    }

    public void e() {
        com.xiaomi.channel.commonutils.logger.b.c("OC_Callback : receive new oc data");
        HashSet<a> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.c);
        }
        for (a aVar : hashSet) {
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }
}
