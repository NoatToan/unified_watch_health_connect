package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes4.dex */
public class ck1 extends f5q {
    public final String c;

    public ck1(r4q r4qVar, BeanProperty beanProperty, String str) {
        super(r4qVar, beanProperty);
        this.c = str;
    }

    @Override // defpackage.f5q, defpackage.e5q
    public String b() {
        return this.c;
    }

    @Override // defpackage.e5q
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    @Override // defpackage.e5q
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ck1 a(BeanProperty beanProperty) {
        return this.f17443b == beanProperty ? this : new ck1(this.f17442a, beanProperty, this.c);
    }
}
