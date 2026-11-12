package u23;

import w52.u0;

/* JADX INFO: loaded from: classes3.dex */
public enum e {
    /* JADX INFO: Fake field, exist only in values array */
    ALL(null, 1, null),
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168219a;

    e(String str) {
        this.f168219a = str == null ? u0.v(name()) : str;
    }

    /* synthetic */ e(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str);
    }
}
