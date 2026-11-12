package org.koin.android.error;

import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/koin/android/error/MissingAndroidContextException;", "", "", SOAP.XMLNS, "<init>", "(Ljava/lang/String;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class MissingAndroidContextException extends Throwable {
    public MissingAndroidContextException(@NotNull String str) {
        super(str);
    }
}
