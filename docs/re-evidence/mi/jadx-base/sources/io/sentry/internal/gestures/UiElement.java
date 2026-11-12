package io.sentry.internal.gestures;

import io.sentry.util.p;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class UiElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<Object> f21721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f21722b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @NotNull
    public final String e;

    public enum Type {
        CLICKABLE,
        SCROLLABLE
    }

    public UiElement(@Nullable Object obj, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4) {
        this.f21721a = new WeakReference<>(obj);
        this.f21722b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Nullable
    public String a() {
        return this.f21722b;
    }

    @NotNull
    public String b() {
        String str = this.c;
        return str != null ? str : (String) p.c(this.d, "UiElement.tag can't be null");
    }

    @NotNull
    public String c() {
        return this.e;
    }

    @Nullable
    public String d() {
        return this.c;
    }

    @Nullable
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UiElement.class != obj.getClass()) {
            return false;
        }
        UiElement uiElement = (UiElement) obj;
        return p.a(this.f21722b, uiElement.f21722b) && p.a(this.c, uiElement.c) && p.a(this.d, uiElement.d);
    }

    @Nullable
    public Object f() {
        return this.f21721a.get();
    }

    public int hashCode() {
        return p.b(this.f21721a, this.c, this.d);
    }
}
