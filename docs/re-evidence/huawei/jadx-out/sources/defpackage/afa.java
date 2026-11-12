package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class afa {
    private static final aez[] i = new aez[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BeanDescription f348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected yt f350c;
    protected aez[] d;
    protected afb e;
    protected List<aez> g = Collections.EMPTY_LIST;
    protected afj h;
    protected AnnotatedMember j;

    public afa(BeanDescription beanDescription) {
        this.f348a = beanDescription;
    }

    protected void d(yt ytVar) {
        this.f350c = ytVar;
    }

    public void e(List<aez> list) {
        this.g = list;
    }

    public void b(aez[] aezVarArr) {
        if (aezVarArr != null && aezVarArr.length != this.g.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(aezVarArr.length), Integer.valueOf(this.g.size())));
        }
        this.d = aezVarArr;
    }

    public void c(afb afbVar) {
        this.e = afbVar;
    }

    public void c(Object obj) {
        this.f349b = obj;
    }

    public void b(AnnotatedMember annotatedMember) {
        if (this.j != null) {
            throw new IllegalArgumentException("Multiple type ids specified with " + this.j + " and " + annotatedMember);
        }
        this.j = annotatedMember;
    }

    public void e(afj afjVar) {
        this.h = afjVar;
    }

    public BeanDescription d() {
        return this.f348a;
    }

    public List<aez> i() {
        return this.g;
    }

    public afb b() {
        return this.e;
    }

    public Object a() {
        return this.f349b;
    }

    public AnnotatedMember j() {
        return this.j;
    }

    public afj f() {
        return this.h;
    }

    public JsonSerializer<?> e() {
        aez[] aezVarArr;
        if (this.j != null && this.f350c.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.j.fixAccess(this.f350c.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        afb afbVar = this.e;
        if (afbVar != null) {
            afbVar.c(this.f350c);
        }
        List<aez> list = this.g;
        if (list == null || list.isEmpty()) {
            if (this.e == null && this.h == null) {
                return null;
            }
            aezVarArr = i;
        } else {
            List<aez> list2 = this.g;
            aezVarArr = (aez[]) list2.toArray(new aez[list2.size()]);
            if (this.f350c.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (aez aezVar : aezVarArr) {
                    aezVar.fixAccess(this.f350c);
                }
            }
        }
        aez[] aezVarArr2 = this.d;
        if (aezVarArr2 != null && aezVarArr2.length != this.g.size()) {
            throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.g.size()), Integer.valueOf(this.d.length)));
        }
        return new afc(this.f348a.getType(), this, aezVarArr, this.d);
    }

    public afc c() {
        return afc.c(this.f348a.getType(), this);
    }
}
