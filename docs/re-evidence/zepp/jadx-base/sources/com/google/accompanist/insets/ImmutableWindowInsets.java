package com.google.accompanist.insets;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.dw8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/google/accompanist/insets/ImmutableWindowInsets;", "Lcom/google/accompanist/insets/WindowInsets;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "a", "Lcom/google/accompanist/insets/WindowInsets$Type;", "getSystemGestures", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "systemGestures", "b", "getNavigationBars", "navigationBars", "c", "getStatusBars", "statusBars", GoogleApiAvailabilityLight.a, "getIme", "ime", "e", "getDisplayCutout", "displayCutout", "f", "getSystemBars", "systemBars", "<init>", "(Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class ImmutableWindowInsets implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type systemGestures;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type navigationBars;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type statusBars;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type ime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type displayCutout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final WindowInsets.Type systemBars;

    public ImmutableWindowInsets() {
        this(null, null, null, null, null, 31, null);
    }

    public ImmutableWindowInsets(@NotNull WindowInsets.Type type, @NotNull WindowInsets.Type type2, @NotNull WindowInsets.Type type3, @NotNull WindowInsets.Type type4, @NotNull WindowInsets.Type type5) {
        this.systemGestures = type;
        this.navigationBars = type2;
        this.statusBars = type3;
        this.ime = type4;
        this.displayCutout = type5;
        this.systemBars = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(getStatusBars(), getNavigationBars());
    }

    @Override // com.google.accompanist.insets.WindowInsets
    public /* synthetic */ WindowInsets copy(WindowInsets.Type type, WindowInsets.Type type2, WindowInsets.Type type3, WindowInsets.Type type4, WindowInsets.Type type5) {
        return dw8.a(this, type, type2, type3, type4, type5);
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getDisplayCutout() {
        return this.displayCutout;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getIme() {
        return this.ime;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getNavigationBars() {
        return this.navigationBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getStatusBars() {
        return this.statusBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getSystemBars() {
        return this.systemBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getSystemGestures() {
        return this.systemGestures;
    }

    public /* synthetic */ ImmutableWindowInsets(WindowInsets.Type type, WindowInsets.Type type2, WindowInsets.Type type3, WindowInsets.Type type4, WindowInsets.Type type5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WindowInsets.Type.Companion.getEmpty() : type, (i & 2) != 0 ? WindowInsets.Type.Companion.getEmpty() : type2, (i & 4) != 0 ? WindowInsets.Type.Companion.getEmpty() : type3, (i & 8) != 0 ? WindowInsets.Type.Companion.getEmpty() : type4, (i & 16) != 0 ? WindowInsets.Type.Companion.getEmpty() : type5);
    }
}
