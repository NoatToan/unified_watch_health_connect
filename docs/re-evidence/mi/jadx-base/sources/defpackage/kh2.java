package defpackage;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class kh2 {
    public static final BeanPropertyWriter[] i = new BeanPropertyWriter[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh2 f23839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SerializationConfig f23840b;
    public List<BeanPropertyWriter> c = Collections.emptyList();
    public BeanPropertyWriter[] d;
    public qd1 e;
    public Object f;
    public AnnotatedMember g;
    public a4h h;

    public kh2(fh2 fh2Var) {
        this.f23839a = fh2Var;
    }

    public eud<?> a() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        List<BeanPropertyWriter> list = this.c;
        if (list == null || list.isEmpty()) {
            if (this.e == null && this.h == null) {
                return null;
            }
            beanPropertyWriterArr = i;
        } else {
            List<BeanPropertyWriter> list2 = this.c;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.f23840b.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                    beanPropertyWriter.fixAccess(this.f23840b);
                }
            }
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.d;
        if (beanPropertyWriterArr2 != null && beanPropertyWriterArr2.length != this.c.size()) {
            throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.c.size()), Integer.valueOf(this.d.length)));
        }
        qd1 qd1Var = this.e;
        if (qd1Var != null) {
            qd1Var.a(this.f23840b);
        }
        if (this.g != null && this.f23840b.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.g.fixAccess(this.f23840b.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new BeanSerializer(this.f23839a.z(), this, beanPropertyWriterArr, this.d);
    }

    public BeanSerializer b() {
        return BeanSerializer.createDummy(this.f23839a.z());
    }

    public qd1 c() {
        return this.e;
    }

    public fh2 d() {
        return this.f23839a;
    }

    public Object e() {
        return this.f;
    }

    public a4h f() {
        return this.h;
    }

    public List<BeanPropertyWriter> g() {
        return this.c;
    }

    public AnnotatedMember h() {
        return this.g;
    }

    public void i(qd1 qd1Var) {
        this.e = qd1Var;
    }

    public void j(SerializationConfig serializationConfig) {
        this.f23840b = serializationConfig;
    }

    public void k(Object obj) {
        this.f = obj;
    }

    public void l(BeanPropertyWriter[] beanPropertyWriterArr) {
        if (beanPropertyWriterArr != null && beanPropertyWriterArr.length != this.c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(beanPropertyWriterArr.length), Integer.valueOf(this.c.size())));
        }
        this.d = beanPropertyWriterArr;
    }

    public void m(a4h a4hVar) {
        this.h = a4hVar;
    }

    public void n(List<BeanPropertyWriter> list) {
        this.c = list;
    }

    public void o(AnnotatedMember annotatedMember) {
        if (this.g == null) {
            this.g = annotatedMember;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.g + " and " + annotatedMember);
    }
}
