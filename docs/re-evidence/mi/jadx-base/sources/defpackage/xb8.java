package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class xb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38940b;
    public int c;
    public int d;
    public String e;
    public String f;
    public EntityType g;
    public JsonObject h;
    public Map<String, String> i;

    public xb8(int i, int i2, String str) {
        this(i, i2, str, str);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public EntityType c() {
        return this.g;
    }

    public JsonObject d() {
        return this.h;
    }

    public String e() {
        return this.f38940b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xb8 xb8Var = (xb8) obj;
        if (this.c != xb8Var.c || this.d != xb8Var.d || !this.f38939a.equals(xb8Var.f38939a)) {
            return false;
        }
        String str = this.f38940b;
        if (str == null ? xb8Var.f38940b == null : str.equals(xb8Var.f38940b)) {
            return this.e.equals(xb8Var.e);
        }
        return false;
    }

    public String f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.f38939a;
    }

    public int hashCode() {
        int iHashCode = this.f38939a.hashCode() * 31;
        String str = this.f38940b;
        return ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public void i(EntityType entityType) {
        this.g = entityType;
    }

    public void j(String str) {
        this.e = str;
    }

    public void k(String str) {
        this.f = str;
    }

    public String toString() {
        return "Entity{token='" + this.f38939a + "', normToken='" + this.f38940b + "', beginIndex=" + this.c + ", endIndex=" + this.d + ", slot=" + this.e + ", slotValue=" + this.f + ", meta=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public xb8(int i, int i2, String str, String str2) {
        this(i, i2, str, str2, "eps");
    }

    public xb8(int i, int i2, String str, String str2, String str3) {
        this(i, i2, str, str2, str3, str2, EntityType.INIT_PARSED_ENTITY);
    }

    public xb8(int i, int i2, String str, String str2, String str3, String str4, EntityType entityType) {
        this.i = new HashMap();
        this.c = i;
        this.d = i2;
        this.f38939a = str;
        this.f38940b = str2;
        this.e = str3;
        if (klo.b(str4)) {
            this.f = str2;
        } else {
            this.f = str4;
        }
        this.g = entityType;
    }

    public xb8(int i, int i2, String str, String str2, String str3, String str4, EntityType entityType, JsonObject jsonObject) {
        this.i = new HashMap();
        this.c = i;
        this.d = i2;
        this.f38939a = str;
        this.f38940b = str2;
        this.e = str3;
        if (klo.b(str4)) {
            this.f = str2;
        } else {
            this.f = str4;
        }
        this.g = entityType;
        this.h = jsonObject;
    }
}
