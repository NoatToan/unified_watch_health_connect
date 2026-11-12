package defpackage;

import com.google.gson.Gson;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;

/* JADX INFO: loaded from: classes7.dex */
public class mq5 {
    public static Gson i = new Gson();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27094b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;

    public mq5() {
    }

    public String a() {
        return this.e;
    }

    public boolean b() {
        return this.g;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.f27093a;
    }

    public String g() {
        return this.f27094b;
    }

    public void h(String str) {
        this.e = str;
    }

    public void i(boolean z) {
        this.h = z;
    }

    public void j(boolean z) {
        this.g = z;
    }

    public void k(GrainType grainType) {
        l(grainType.getGrainType());
    }

    public void l(String str) {
        this.f = str;
    }

    public void m(String str) {
        this.d = str;
    }

    public void n(TimeSubType timeSubType) {
        o(timeSubType.getSubType());
    }

    public void o(String str) {
        this.c = str;
    }

    public void p(String str) {
        this.f27093a = str;
    }

    public void q(String str) {
        this.f27094b = str;
    }

    public String toString() {
        return i.toJson(this);
    }

    public mq5(DateType dateType) {
        this.f27093a = dateType.getType();
    }
}
