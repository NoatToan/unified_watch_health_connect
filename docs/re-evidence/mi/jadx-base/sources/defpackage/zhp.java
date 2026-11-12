package defpackage;

import com.typesafe.config.ConfigException;

/* JADX INFO: loaded from: classes6.dex */
public class zhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lip f41301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41302b;
    public final jc4 c;

    public zhp(lip lipVar, jc4 jc4Var) {
        this(lipVar, jc4Var, null);
    }

    public static zhp c(lip lipVar, String str) {
        return new zhp(lipVar, null, str);
    }

    public boolean a(Object obj) {
        return obj instanceof zhp;
    }

    public final int b() {
        jc4 jc4Var = this.c;
        if (jc4Var != null) {
            return jc4Var.b();
        }
        return -1;
    }

    public final jc4 d() {
        jc4 jc4Var = this.c;
        if (jc4Var != null) {
            return jc4Var;
        }
        throw new ConfigException.BugOrBroken("tried to get origin from token that doesn't have one: " + this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof zhp) && a(obj) && this.f41301a == ((zhp) obj).f41301a;
    }

    public int hashCode() {
        return this.f41301a.hashCode();
    }

    public String toString() {
        String str = this.f41302b;
        return str != null ? str : this.f41301a.name();
    }

    public zhp(lip lipVar, jc4 jc4Var, String str) {
        this.f41301a = lipVar;
        this.c = jc4Var;
        this.f41302b = str;
    }
}
