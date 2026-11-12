package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class oam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28935a;

    public oam(Context context, String str) {
        this.f28935a = context.getSharedPreferences(str, 0);
    }

    public int a(String str, int i) {
        return this.f28935a.getInt(str, i);
    }

    public long b(String str, long j) {
        return this.f28935a.getLong(str, j);
    }

    public void c(String str, int i) {
        this.f28935a.edit().putInt(str, i).apply();
    }

    public void d(String str, long j) {
        this.f28935a.edit().putLong(str, j).apply();
    }
}
