package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public final class gbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18818a;
    public byte[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, String> f18819b = new HashMap();
    public boolean c = true;
    public int e = 10000;

    public static String a() {
        return "lc_" + ((int) dbt.a());
    }

    public static String b() {
        return dbt.g() + Marker.ANY_MARKER + dbt.m();
    }
}
