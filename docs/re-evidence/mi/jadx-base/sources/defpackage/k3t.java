package defpackage;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k3t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f23404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f23405b;
    public boolean c;
    public int d;
    public int e;

    public k3t(Calendar calendar, List<T> list) {
        this.c = false;
        this.d = -1;
        this.e = -1;
        this.f23404a = calendar;
        this.e = list.size();
        this.f23405b = list;
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        List<T> list = this.f23405b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public String toString() {
        return "[[[ " + getClass().getSimpleName() + " ]]]\n    timestamp: " + DateFormat.getDateTimeInstance().format(this.f23404a.getTime()) + "\n      dataLen: " + this.e + "\n     totalLen: " + this.d;
    }

    public k3t(Calendar calendar, boolean z) {
        this.c = false;
        this.d = -1;
        this.e = -1;
        this.f23404a = calendar;
        this.f23405b = new ArrayList();
        this.c = z;
    }
}
