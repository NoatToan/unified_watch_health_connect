package q;

import a73.f;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl;
import e23.l;
import java.util.concurrent.ArrayBlockingQueue;
import k7.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f141954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f141955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f141956c;

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    public class C2662a implements Handler.Callback {
        public C2662a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            View view2 = cVar.f141962d;
            a aVar = a.this;
            if (view2 == null) {
                cVar.f141962d = aVar.f141954a.inflate(cVar.f141961c, cVar.f141960b, false);
            }
            f fVar = cVar.f141963e;
            ViewAnnotationManagerImpl.addViewAnnotation$lambda$0((ViewAnnotationManagerImpl) fVar.f1836d, (ViewAnnotationOptions) fVar.f1834b, (l) fVar.f1835c, cVar.f141962d, cVar.f141961c, cVar.f141960b);
            d dVar = aVar.f141956c;
            dVar.getClass();
            cVar.f141963e = null;
            cVar.f141959a = null;
            cVar.f141960b = null;
            cVar.f141961c = 0;
            cVar.f141962d = null;
            dVar.f141966b.a(cVar);
            return true;
        }
    }

    public static class b extends LayoutInflater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f141958a = {"android.widget.", "android.webkit.", "android.app."};

        public b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            for (int i14 = 0; i14 < 3; i14++) {
                try {
                    View viewCreateView = createView(str, f141958a[i14], attributeSet);
                    if (viewCreateView != null) {
                        return viewCreateView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f141959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f141960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f141961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f141962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f141963e;
    }

    public static class d extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f141964c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayBlockingQueue<c> f141965a = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g<c> f141966b = new g<>(10);

        static {
            d dVar = new d();
            f141964c = dVar;
            dVar.start();
        }

        private d() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    c cVarTake = this.f141965a.take();
                    try {
                        cVarTake.f141962d = cVarTake.f141959a.f141954a.inflate(cVarTake.f141961c, cVarTake.f141960b, false);
                    } catch (RuntimeException unused) {
                    }
                    Message.obtain(cVarTake.f141959a.f141955b, 0, cVarTake).sendToTarget();
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    public a(Context context) {
        C2662a c2662a = new C2662a();
        this.f141954a = new b(context);
        this.f141955b = new Handler(c2662a);
        this.f141956c = d.f141964c;
    }
}
