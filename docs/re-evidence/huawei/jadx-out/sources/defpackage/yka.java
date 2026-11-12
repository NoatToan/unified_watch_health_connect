package defpackage;

import com.huawei.wearengine.notify.Action;
import com.huawei.wearengine.notify.NotificationTemplate;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class yka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Action f53546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Integer, String> f53547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53548c;
    private int d;
    private String e;
    private String g;
    private int i;
    private String j;

    private yka(d dVar) {
        this.d = dVar.f53551c;
        this.e = dVar.d;
        this.g = dVar.i;
        this.j = dVar.j;
        this.f53547b = dVar.e;
        this.i = dVar.g;
        this.f53548c = dVar.f53549a;
        this.f53546a = dVar.f53550b;
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Action f53550b;
        private String d;
        private HashMap<Integer, String> e;
        private String i;
        private String j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53551c = -1;
        private int g = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53549a = -1;

        public d e(NotificationTemplate notificationTemplate) {
            this.f53551c = notificationTemplate == null ? -1 : notificationTemplate.value();
            return this;
        }

        public d b(String str) {
            this.d = str;
            return this;
        }

        public d d(String str) {
            this.i = str;
            return this;
        }

        public d a(String str) {
            this.j = str;
            return this;
        }

        public d c(HashMap<Integer, String> map) {
            this.e = map;
            return this;
        }

        public d c(Action action) {
            this.f53550b = action;
            return this;
        }

        public yka d() {
            return new yka(this);
        }
    }

    public int e() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String f() {
        return this.g;
    }

    public String d() {
        return this.j;
    }

    public HashMap<Integer, String> a() {
        return this.f53547b;
    }

    public Action c() {
        return this.f53546a;
    }
}
