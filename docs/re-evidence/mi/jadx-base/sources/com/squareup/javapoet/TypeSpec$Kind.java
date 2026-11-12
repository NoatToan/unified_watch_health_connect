package com.squareup.javapoet;

import defpackage.ylq;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import javax.lang.model.element.Modifier;

/* JADX INFO: loaded from: classes6.dex */
public enum TypeSpec$Kind {
    CLASS(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet()),
    INTERFACE(ylq.a(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)), ylq.a(Arrays.asList(Modifier.PUBLIC, Modifier.ABSTRACT)), ylq.a(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC)), ylq.a(Collections.singletonList(Modifier.STATIC))),
    ENUM(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.singleton(Modifier.STATIC)),
    ANNOTATION(ylq.a(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)), ylq.a(Arrays.asList(Modifier.PUBLIC, Modifier.ABSTRACT)), ylq.a(Arrays.asList(Modifier.PUBLIC, Modifier.STATIC)), ylq.a(Collections.singletonList(Modifier.STATIC)));

    private final Set<Modifier> asMemberModifiers;
    private final Set<Modifier> implicitFieldModifiers;
    private final Set<Modifier> implicitMethodModifiers;
    private final Set<Modifier> implicitTypeModifiers;

    TypeSpec$Kind(Set set, Set set2, Set set3, Set set4) {
        this.implicitFieldModifiers = set;
        this.implicitMethodModifiers = set2;
        this.implicitTypeModifiers = set3;
        this.asMemberModifiers = set4;
    }
}
