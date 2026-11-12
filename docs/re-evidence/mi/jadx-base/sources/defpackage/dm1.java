package defpackage;

import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import io.sentry.protocol.z;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class dm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public byte[] f15674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final cud f15675b;

    @Nullable
    public String c;

    @NotNull
    public final String d;

    @Nullable
    public final String e;
    public final boolean f;

    @Nullable
    public String g;

    public dm1(@NotNull String str, @NotNull String str2) {
        this(str, str2, (String) null);
    }

    @NotNull
    public static dm1 a(byte[] bArr) {
        return new dm1(bArr, "screenshot.png", "image/png", false);
    }

    @NotNull
    public static dm1 b(byte[] bArr) {
        return new dm1(bArr, "thread-dump.txt", HTTP.PLAIN_TEXT_TYPE, false);
    }

    @NotNull
    public static dm1 c(z zVar) {
        return new dm1((cud) zVar, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    @Nullable
    public String d() {
        return this.g;
    }

    @Nullable
    public byte[] e() {
        return this.f15674a;
    }

    @Nullable
    public String f() {
        return this.e;
    }

    @NotNull
    public String g() {
        return this.d;
    }

    @Nullable
    public String h() {
        return this.c;
    }

    @Nullable
    public cud i() {
        return this.f15675b;
    }

    public boolean j() {
        return this.f;
    }

    public dm1(@NotNull byte[] bArr, @NotNull String str) {
        this(bArr, str, (String) null);
    }

    public dm1(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2) {
        this(bArr, str, str2, false);
    }

    public dm1(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, boolean z) {
        this(bArr, str, str2, "event.attachment", z);
    }

    public dm1(@NotNull byte[] bArr, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        this.f15674a = bArr;
        this.f15675b = null;
        this.d = str;
        this.e = str2;
        this.g = str3;
        this.f = z;
    }

    public dm1(@NotNull cud cudVar, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        this.f15674a = null;
        this.f15675b = cudVar;
        this.d = str;
        this.e = str2;
        this.g = str3;
        this.f = z;
    }

    public dm1(@NotNull String str) {
        this(str, new File(str).getName());
    }

    public dm1(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(str, str2, str3, "event.attachment", false);
    }

    public dm1(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z) {
        this.c = str;
        this.d = str2;
        this.f15675b = null;
        this.e = str3;
        this.g = str4;
        this.f = z;
    }
}
