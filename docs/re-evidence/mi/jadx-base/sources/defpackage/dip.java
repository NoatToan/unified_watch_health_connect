package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class dip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dip f15573a = new dip();

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public dip c() {
        return this;
    }

    public dip d() {
        return this;
    }

    public dip e(int i) {
        return this;
    }

    public dip f(String str) {
        return this;
    }

    public dip g(int i) {
        return this;
    }

    public boolean h(JsonParser jsonParser) throws IOException {
        return a();
    }

    public String toString() {
        return this == f15573a ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
