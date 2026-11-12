package c8;

import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0374a f25261a;

    /* JADX INFO: renamed from: c8.a$a, reason: collision with other inner class name */
    public static class C0374a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f25262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f25263b;

        public C0374a(EditText editText, boolean z14) {
            this.f25262a = editText;
            g gVar = new g(editText, z14);
            this.f25263b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(c8.b.getInstance());
        }
    }

    public static class b {
    }

    public a(EditText editText, boolean z14) {
        k7.h.e(editText, "editText cannot be null");
        this.f25261a = new C0374a(editText, z14);
    }

    public a(EditText editText) {
        this(editText, true);
    }
}
