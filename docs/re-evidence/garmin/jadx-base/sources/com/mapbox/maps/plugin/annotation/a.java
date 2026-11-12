package com.mapbox.maps.plugin.annotation;

import a6.d;
import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.concurrent.futures.b;
import com.mapbox.maps.ScreenCoordinate;
import f4.f;
import g6.c;
import g6.o;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.j0;
import s5.x0;
import s5.y0;
import ue.y;
import w5.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f54548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f54549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f54550f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f54545a = i14;
        this.f54546b = obj;
        this.f54547c = obj2;
        this.f54548d = obj3;
        this.f54549e = obj4;
        this.f54550f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f54545a;
        Object obj = this.f54550f;
        Object obj2 = this.f54549e;
        Object obj3 = this.f54548d;
        Object obj4 = this.f54547c;
        Object obj5 = this.f54546b;
        switch (i14) {
            case 0:
                AnnotationManagerImpl.queryMapForFeatures$lambda$28((AnnotationManagerImpl) obj5, (ScreenCoordinate) obj4, (ArrayList) obj3, (CountDownLatch) obj2, (r0) obj);
                return;
            case 1:
                x0 x0Var = (x0) obj5;
                o oVar = (o) obj4;
                String str = (String) obj3;
                c cVar = (c) obj2;
                q.b bVar = (q.b) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    f.f68735e.getClass();
                    f4.a aVarG = f.a.g(null, null);
                    try {
                        f fVarJ = aVarG.j();
                        try {
                            x0 x0VarA = y0.a(x0Var, oVar);
                            j0 j0Var = j0.f134944a;
                            new d(str, x0VarA, j0Var, j0Var, bVar, cVar).a();
                            Unit unit = Unit.INSTANCE;
                            f.q(fVarJ);
                            aVarG.w().a();
                            aVarG.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th3) {
                            f.q(fVarJ);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            aVarG.c();
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    Trace.endSection();
                    throw th6;
                }
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj3;
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                int i15 = ro1.c.f153915b;
                int iR = ((ro1.c) obj5).r((View) obj4, viewGroup);
                Context context = viewGroup.getContext();
                context.getClass();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iR, iR);
                layoutParams.addRule(13);
                int iA = hb2.f.a(4, context);
                layoutParams.setMargins(iA, 0, iA, 0);
                layoutParams.addRule(13);
                imageView.setLayoutParams(layoutParams);
                imageView2.setLayoutParams(layoutParams);
                int iA2 = hb2.f.a(viewGroup.getContext().getResources().getDimensionPixelSize(com.garmin.android.apps.connectmobile.R.dimen.gcm3_divider_height), viewGroup.getContext());
                imageView.setPadding(iA2, iA2, iA2, iA2);
                imageView2.setPadding(iA2, iA2, iA2, iA2);
                return;
            default:
                ue.d dVar = (ue.d) obj5;
                String str2 = (String) obj4;
                e23.a aVar = (e23.a) obj3;
                androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) obj2;
                b.a aVar2 = (b.a) obj;
                boolean zC = dVar.c();
                if (zC) {
                    try {
                        dVar.a(str2);
                    } catch (Throwable th7) {
                        if (zC) {
                            dVar.b();
                        }
                        throw th7;
                    }
                }
                try {
                    aVar.invoke();
                    y.b.c cVar2 = y.f170132a;
                    y0Var.j(cVar2);
                    aVar2.b(cVar2);
                    break;
                } catch (Throwable th8) {
                    y0Var.j(new y.b.a(th8));
                    aVar2.d(th8);
                }
                Unit unit2 = Unit.INSTANCE;
                if (zC) {
                    dVar.b();
                    return;
                }
                return;
        }
    }
}
