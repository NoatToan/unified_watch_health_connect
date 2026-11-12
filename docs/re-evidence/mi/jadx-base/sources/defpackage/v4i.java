package defpackage;

import androidx.room.ColumnInfo;

/* JADX INFO: loaded from: classes9.dex */
public class v4i {
    public static final float INVALID_VALUE = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "value")
    public float f36469a;

    public v4i() {
        this.f36469a = 0.0f;
    }

    public float a() {
        return this.f36469a;
    }

    public boolean c() {
        return this.f36469a > 0.0f;
    }

    public v4i(float f) {
        this.f36469a = f;
    }
}
