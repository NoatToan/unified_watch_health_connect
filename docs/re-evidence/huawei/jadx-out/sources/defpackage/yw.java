package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class yw implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JsonSetter.e f53887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map<Class<?>, zb> f53888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Boolean f53889c;
    protected Boolean d;
    protected JsonInclude.b e;
    protected VisibilityChecker<?> f;

    public yw() {
        this(null, JsonInclude.b.e(), JsonSetter.e.c(), VisibilityChecker.c.a(), null, null);
    }

    protected yw(Map<Class<?>, zb> map, JsonInclude.b bVar, JsonSetter.e eVar, VisibilityChecker<?> visibilityChecker, Boolean bool, Boolean bool2) {
        this.f53888b = map;
        this.e = bVar;
        this.f53887a = eVar;
        this.f = visibilityChecker;
        this.d = bool;
        this.f53889c = bool2;
    }

    public ConfigOverride d(Class<?> cls) {
        Map<Class<?>, zb> map = this.f53888b;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public zb c(Class<?> cls) {
        if (this.f53888b == null) {
            this.f53888b = e();
        }
        zb zbVar = this.f53888b.get(cls);
        if (zbVar != null) {
            return zbVar;
        }
        zb zbVar2 = new zb();
        this.f53888b.put(cls, zbVar2);
        return zbVar2;
    }

    public JsonFormat.c e(Class<?> cls) {
        zb zbVar;
        JsonFormat.c format;
        Map<Class<?>, zb> map = this.f53888b;
        if (map != null && (zbVar = map.get(cls)) != null && (format = zbVar.getFormat()) != null) {
            return !format.h() ? format.c(this.f53889c) : format;
        }
        Boolean bool = this.f53889c;
        if (bool == null) {
            return JsonFormat.c.e();
        }
        return JsonFormat.c.b(bool.booleanValue());
    }

    public JsonInclude.b c() {
        return this.e;
    }

    public JsonSetter.e a() {
        return this.f53887a;
    }

    public Boolean b() {
        return this.d;
    }

    public VisibilityChecker<?> d() {
        return this.f;
    }

    public void e(JsonInclude.b bVar) {
        this.e = bVar;
    }

    public void e(JsonSetter.e eVar) {
        this.f53887a = eVar;
    }

    public void d(Boolean bool) {
        this.d = bool;
    }

    public void c(Boolean bool) {
        this.f53889c = bool;
    }

    public void e(VisibilityChecker<?> visibilityChecker) {
        this.f = visibilityChecker;
    }

    protected Map<Class<?>, zb> e() {
        return new HashMap();
    }
}
