package xd2;

import android.content.SharedPreferences;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/b1;", "", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f190056a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f190057b;

    private b1() {
    }

    public static String a(long j8, String str) {
        return str + j8;
    }

    public static void b(String str, boolean z14) {
        SharedPreferences sharedPreferences = f190057b;
        if (sharedPreferences == null) {
            p005kotlin.jvm.internal.s.m("prefs");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putBoolean(str, z14);
        editorEdit.commit();
    }
}
