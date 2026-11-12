package p005kotlin.reflect.jvm.internal.impl.km;

import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class InconsistentKotlinMetadataException extends IllegalArgumentException {
    public /* synthetic */ InconsistentKotlinMetadataException(String str, Throwable th3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : th3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InconsistentKotlinMetadataException(String str, Throwable th3) {
        super(str, th3);
        str.getClass();
    }
}
