package com.google.maps.android;

import p005kotlin.Metadata;
import w13.a;
import w13.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/maps/android/Source;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "DEFAULT", "OUTDOOR", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Source {
    DEFAULT("default"),
    OUTDOOR("outdoor");

    private static final /* synthetic */ a $ENTRIES = b.g(values());
    private String value;

    Source(String str) {
        this.value = str;
    }

    public static a<Source> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        str.getClass();
        this.value = str;
    }
}
