package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class vad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f36660a;

    @RequiresApi(25)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f36661a;

        public a(Object obj) {
            this.f36661a = (InputContentInfo) obj;
        }

        @Override // vad.b
        public Object a() {
            return this.f36661a;
        }

        @Override // vad.b
        public Uri b() {
            return this.f36661a.getContentUri();
        }

        @Override // vad.b
        public void c() {
            this.f36661a.requestPermission();
        }

        @Override // vad.b
        public Uri d() {
            return this.f36661a.getLinkUri();
        }

        @Override // vad.b
        public ClipDescription getDescription() {
            return this.f36661a.getDescription();
        }
    }

    public interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public vad(b bVar) {
        this.f36660a = bVar;
    }

    public static vad f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new vad(new a(obj));
    }

    public Uri a() {
        return this.f36660a.b();
    }

    public ClipDescription b() {
        return this.f36660a.getDescription();
    }

    public Uri c() {
        return this.f36660a.d();
    }

    public void d() {
        this.f36660a.c();
    }

    public Object e() {
        return this.f36660a.a();
    }
}
