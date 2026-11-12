package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class hft implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f20029b;
    public Runnable c;

    public /* synthetic */ hft(Context context, File file, xft xftVar) {
        this(context, file);
    }

    public static void b(Context context, File file, Runnable runnable) {
        new xft(context, file, runnable).run();
    }

    public abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        ret retVarA = null;
        try {
            if (this.f20029b == null) {
                this.f20029b = new File(this.f20028a.getFilesDir(), "default_locker");
            }
            retVarA = ret.a(this.f20028a, this.f20029b);
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
            a(this.f20028a);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (retVarA != null) {
                retVarA.b();
            }
        }
    }

    public hft(Context context, File file) {
        this.f20028a = context;
        this.f20029b = file;
    }
}
