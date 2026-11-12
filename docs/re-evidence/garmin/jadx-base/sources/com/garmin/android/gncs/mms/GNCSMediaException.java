package com.garmin.android.gncs.mms;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/gncs/mms/GNCSMediaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GNCSMediaException extends Exception {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GNCSMediaException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNCSMediaException(String str, Throwable th3) {
        super(str, th3);
        str.getClass();
    }

    public /* synthetic */ GNCSMediaException(String str, Throwable th3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : th3);
    }
}
