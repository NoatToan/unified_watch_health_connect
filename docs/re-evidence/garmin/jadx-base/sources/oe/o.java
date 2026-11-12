package oe;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Loe/o;", "Loe/n;", "Lse/g;", "densityCompatHelper", "<init>", "(Lse/g;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se.g f131246b;

    public o(se.g gVar) {
        gVar.getClass();
        this.f131246b = gVar;
        x.d(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public final m a(Activity activity) {
        se.l lVar;
        se.l.f158736a.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            lVar = se.n.f158739b;
        } else {
            lVar = i14 >= 30 ? se.m.f158738b : se.o.f158740b;
        }
        return lVar.a(activity, this.f131246b);
    }

    public final m b(Context context) {
        se.l lVar;
        se.l.f158736a.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            lVar = se.n.f158739b;
        } else {
            lVar = i14 >= 30 ? se.m.f158738b : se.o.f158740b;
        }
        return lVar.b(context, this.f131246b);
    }

    public o() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(se.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            se.g.f158730a.getClass();
            if (Build.VERSION.SDK_INT >= 34) {
                gVar = se.h.f158732b;
            } else {
                gVar = se.i.f158733b;
            }
        }
        this(gVar);
    }
}
