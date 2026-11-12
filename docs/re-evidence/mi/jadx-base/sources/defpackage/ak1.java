package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes4.dex */
public class ak1 extends f5q {
    public ak1(r4q r4qVar, BeanProperty beanProperty) {
        super(r4qVar, beanProperty);
    }

    @Override // defpackage.e5q
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    @Override // defpackage.e5q
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ak1 a(BeanProperty beanProperty) {
        return this.f17443b == beanProperty ? this : new ak1(this.f17442a, beanProperty);
    }
}
