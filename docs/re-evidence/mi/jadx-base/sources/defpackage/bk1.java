package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes4.dex */
public class bk1 extends dk1 {
    public bk1(r4q r4qVar, BeanProperty beanProperty, String str) {
        super(r4qVar, beanProperty, str);
    }

    @Override // defpackage.dk1, defpackage.ak1, defpackage.e5q
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    @Override // defpackage.dk1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public bk1 a(BeanProperty beanProperty) {
        return this.f17443b == beanProperty ? this : new bk1(this.f17442a, beanProperty, this.c);
    }
}
