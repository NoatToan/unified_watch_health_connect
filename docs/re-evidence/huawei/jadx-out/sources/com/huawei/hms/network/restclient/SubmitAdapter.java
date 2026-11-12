package com.huawei.hms.network.restclient;

import com.huawei.hms.network.httpclient.Submit;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SubmitAdapter<R, T> {

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Factory {
        public abstract SubmitAdapter<?, ?> get(Type type, Annotation[] annotationArr, RestClient restClient);
    }

    public abstract T adapt(Submit<R> submit);

    public abstract Type responseType();
}
