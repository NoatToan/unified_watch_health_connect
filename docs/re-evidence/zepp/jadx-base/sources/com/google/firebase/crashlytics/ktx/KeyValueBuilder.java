package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007J\u0016\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u0016\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tJ\u0016\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nJ\u0016\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "", "key", "", "value", "", "", "", "", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "a", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "com.google.firebase-firebase-crashlytics-ktx"}, k = 1, mv = {1, 4, 0})
public final class KeyValueBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        this.crashlytics = firebaseCrashlytics;
    }

    public final void key(@NotNull String key, boolean value) {
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, double value) {
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, float value) {
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, int value) {
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, long value) {
        this.crashlytics.setCustomKey(key, value);
    }

    public final void key(@NotNull String key, @NotNull String value) {
        this.crashlytics.setCustomKey(key, value);
    }
}
