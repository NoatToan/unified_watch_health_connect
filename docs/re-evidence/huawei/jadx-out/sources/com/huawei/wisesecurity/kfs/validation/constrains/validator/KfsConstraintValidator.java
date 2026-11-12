package com.huawei.wisesecurity.kfs.validation.constrains.validator;

import defpackage.yny;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes20.dex */
public interface KfsConstraintValidator<A extends Annotation, T> {
    String getMessage();

    void initialize(String str, A a2) throws yny;

    boolean isValid(T t);
}
