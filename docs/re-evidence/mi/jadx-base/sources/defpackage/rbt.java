package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class rbt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f32393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f32394b;
    public final /* synthetic */ String c;
    public final /* synthetic */ u8t d;

    public rbt(u8t u8tVar, String str, String str2, String str3) {
        this.d = u8tVar;
        this.f32393a = str;
        this.f32394b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        SharedPreferences.Editor editorEdit = this.d.f35534a.getSharedPreferences(this.f32393a, 4).edit();
        editorEdit.putString(this.f32394b, this.c);
        editorEdit.commit();
    }
}
