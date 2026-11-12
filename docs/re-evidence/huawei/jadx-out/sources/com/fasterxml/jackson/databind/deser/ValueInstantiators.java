package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import defpackage.yi;

/* JADX INFO: loaded from: classes21.dex */
public interface ValueInstantiators {

    public static class e implements ValueInstantiators {
        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiators
        public ValueInstantiator findValueInstantiator(yi yiVar, BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
            return valueInstantiator;
        }
    }

    ValueInstantiator findValueInstantiator(yi yiVar, BeanDescription beanDescription, ValueInstantiator valueInstantiator);
}
