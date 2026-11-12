package com.google.accompanist.insets;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.dw8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0019\u001a\u00020\u00148\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/google/accompanist/insets/RootWindowInsets;", "Lcom/google/accompanist/insets/WindowInsets;", "Lcom/google/accompanist/insets/MutableWindowInsetsType;", "a", "Lcom/google/accompanist/insets/MutableWindowInsetsType;", "getSystemGestures", "()Lcom/google/accompanist/insets/MutableWindowInsetsType;", "systemGestures", "b", "getNavigationBars", "navigationBars", "c", "getStatusBars", "statusBars", GoogleApiAvailabilityLight.a, "getIme", "ime", "e", "getDisplayCutout", "displayCutout", "Lcom/google/accompanist/insets/WindowInsets$Type;", "f", "Lcom/google/accompanist/insets/WindowInsets$Type;", "getSystemBars", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "systemBars", "<init>", "()V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class RootWindowInsets implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableWindowInsetsType systemGestures = new MutableWindowInsetsType();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableWindowInsetsType navigationBars = new MutableWindowInsetsType();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableWindowInsetsType statusBars = new MutableWindowInsetsType();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableWindowInsetsType ime = new MutableWindowInsetsType();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableWindowInsetsType displayCutout = new MutableWindowInsetsType();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type systemBars = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(getStatusBars(), getNavigationBars());

    @Override // com.google.accompanist.insets.WindowInsets
    public /* synthetic */ WindowInsets copy(WindowInsets.Type type, WindowInsets.Type type2, WindowInsets.Type type3, WindowInsets.Type type4, WindowInsets.Type type5) {
        return dw8.a(this, type, type2, type3, type4, type5);
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getSystemBars() {
        return this.systemBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getDisplayCutout() {
        return this.displayCutout;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getIme() {
        return this.ime;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getNavigationBars() {
        return this.navigationBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getStatusBars() {
        return this.statusBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getSystemGestures() {
        return this.systemGestures;
    }
}
