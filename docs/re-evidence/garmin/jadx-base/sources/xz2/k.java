package xz2;

import android.graphics.drawable.Drawable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f192912b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList<a> f192913c = new LinkedList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f192914d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f192911a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f192915a;

        public a(Object obj) {
            this.f192915a = obj;
        }
    }

    public final void a() {
        this.f192914d = true;
        this.f192911a = true;
    }

    public final void b(Drawable drawable) {
        if (drawable == null) {
            vb.h.s("Cannot be null");
        } else {
            this.f192912b = drawable;
            this.f192911a = true;
        }
    }
}
