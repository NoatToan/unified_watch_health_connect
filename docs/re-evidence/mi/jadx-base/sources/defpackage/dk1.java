package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes4.dex */
public class dk1 extends ak1 {
    public final String c;

    public dk1(r4q r4qVar, BeanProperty beanProperty, String str) {
        super(r4qVar, beanProperty);
        this.c = str;
    }

    @Override // defpackage.f5q, defpackage.e5q
    public String b() {
        return this.c;
    }

    @Override // defpackage.ak1, defpackage.e5q
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.PROPERTY;
    }

    @Override // defpackage.ak1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public dk1 a(BeanProperty beanProperty) {
        return this.f17443b == beanProperty ? this : new dk1(this.f17442a, beanProperty, this.c);
    }
}
