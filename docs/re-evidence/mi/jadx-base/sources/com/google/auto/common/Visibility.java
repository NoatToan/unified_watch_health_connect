package com.google.auto.common;

import defpackage.c6i;
import defpackage.ich;
import defpackage.sc8;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;

/* JADX INFO: loaded from: classes5.dex */
public enum Visibility {
    PRIVATE,
    DEFAULT,
    PROTECTED,
    PUBLIC;

    private static final ElementKind MODULE = (ElementKind) sc8.b(ElementKind.class, "MODULE").orNull();

    public static Visibility effectiveVisibilityOfElement(Element element) {
        c6i.o(element);
        Visibility visibility = PUBLIC;
        while (element != null) {
            visibility = (Visibility) ich.e().d(visibility, ofElement(element));
            element = element.getEnclosingElement();
        }
        return visibility;
    }

    public static Visibility ofElement(Element element) {
        c6i.o(element);
        if (element.getKind().equals(ElementKind.PACKAGE) || element.getKind().equals(MODULE)) {
            return PUBLIC;
        }
        Set modifiers = element.getModifiers();
        if (modifiers.contains(Modifier.PRIVATE)) {
            return PRIVATE;
        }
        if (modifiers.contains(Modifier.PROTECTED)) {
            return PROTECTED;
        }
        return modifiers.contains(Modifier.PUBLIC) ? PUBLIC : DEFAULT;
    }
}
