package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class aeb extends ValueInstantiators.e implements Serializable {
    private static final long serialVersionUID = -8929386427526115130L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HashMap<ahd, ValueInstantiator> f317b = new HashMap<>();

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiators.e, com.fasterxml.jackson.databind.deser.ValueInstantiators
    public ValueInstantiator findValueInstantiator(yi yiVar, BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
        ValueInstantiator valueInstantiator2 = this.f317b.get(new ahd(beanDescription.getBeanClass()));
        return valueInstantiator2 == null ? valueInstantiator : valueInstantiator2;
    }
}
