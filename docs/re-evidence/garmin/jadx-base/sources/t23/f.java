package t23;

import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes3.dex */
public enum f {
    CLASS(Action.CLASS_ATTRIBUTE),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    f(String str) {
    }

    public final boolean a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
