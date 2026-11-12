package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.acj;
import defpackage.ack;
import defpackage.aco;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AccessorNamingStrategy {

    public static abstract class Provider implements Serializable {
        private static final long serialVersionUID = 1;

        public abstract AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, ack ackVar, BeanDescription beanDescription);

        public abstract AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, ack ackVar);

        public abstract AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, ack ackVar);
    }

    public abstract String findNameForIsGetter(aco acoVar, String str);

    public abstract String findNameForMutator(aco acoVar, String str);

    public abstract String findNameForRegularGetter(aco acoVar, String str);

    public abstract String modifyFieldName(acj acjVar, String str);
}
