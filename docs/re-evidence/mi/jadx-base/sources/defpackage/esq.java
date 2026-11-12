package defpackage;

import android.view.View;
import com.jakewharton.rxbinding2.internal.Notification;

/* JADX INFO: loaded from: classes5.dex */
public final class esq extends o4h<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f17030a;

    public static final class a extends z1f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17031b;
        public final z5h<? super Object> c;

        public a(View view, z5h<? super Object> z5hVar) {
            this.f17031b = view;
            this.c = z5hVar;
        }

        @Override // defpackage.z1f
        public void a() {
            this.f17031b.setOnClickListener(null);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (isDisposed()) {
                return;
            }
            this.c.onNext(Notification.INSTANCE);
        }
    }

    public esq(View view) {
        this.f17030a = view;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super Object> z5hVar) {
        if (d6i.a(z5hVar)) {
            a aVar = new a(this.f17030a, z5hVar);
            z5hVar.onSubscribe(aVar);
            this.f17030a.setOnClickListener(aVar);
        }
    }
}
