package m;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.g1;
import androidx.core.view.h1;
import androidx.core.view.i1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f115479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f115480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115481e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f115478b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f115482f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<g1> f115477a = new ArrayList<>();

    public class a extends i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f115483a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f115484b = 0;

        public a() {
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void a() {
            if (this.f115483a) {
                return;
            }
            this.f115483a = true;
            h1 h1Var = h.this.f115480d;
            if (h1Var != null) {
                h1Var.a();
            }
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public final void onAnimationEnd() {
            int i14 = this.f115484b + 1;
            this.f115484b = i14;
            h hVar = h.this;
            if (i14 == hVar.f115477a.size()) {
                h1 h1Var = hVar.f115480d;
                if (h1Var != null) {
                    h1Var.onAnimationEnd();
                }
                this.f115484b = 0;
                this.f115483a = false;
                hVar.f115481e = false;
            }
        }
    }

    public final void a() {
        if (this.f115481e) {
            Iterator<g1> it = this.f115477a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f115481e = false;
        }
    }

    public final void b() {
        View view2;
        if (this.f115481e) {
            return;
        }
        for (g1 g1Var : this.f115477a) {
            long j8 = this.f115478b;
            if (j8 >= 0) {
                g1Var.c(j8);
            }
            Interpolator interpolator = this.f115479c;
            if (interpolator != null && (view2 = g1Var.f6450a.get()) != null) {
                view2.animate().setInterpolator(interpolator);
            }
            if (this.f115480d != null) {
                g1Var.d(this.f115482f);
            }
            View view3 = g1Var.f6450a.get();
            if (view3 != null) {
                view3.animate().start();
            }
        }
        this.f115481e = true;
    }
}
