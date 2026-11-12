package xx;

import android.content.Context;
import com.garmin.android.apps.connectmobile.k1;
import java.util.ArrayList;
import java.util.HashSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxx/c;", "", "<init>", "()V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f192471b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<d> f192472a;

    public c() {
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        this.f192472a = new ArrayList<>();
        b().add(new d(e.f192476f));
        if (k1Var.l0()) {
            b().add(new d(e.f192479i));
            if (k1Var.C0()) {
                b().add(new d(e.f192478h));
            }
        } else {
            b().add(new d(e.f192478h));
            if (k1Var.i0()) {
                b().add(new d(e.f192479i));
            }
        }
        b().add(new d(e.f192480j));
        if (k1Var.W()) {
            b().add(new d(e.f192481k));
        }
        if (k1Var.Q()) {
            b().add(new d(e.f192482l));
        }
        b().add(new d(e.f192483m));
        if (k1Var.n()) {
            b().add(new d(e.C));
        }
        if (k1Var.o()) {
            b().add(new d(e.A));
        } else {
            b().add(new d(e.f192494z));
        }
        b().add(new d(e.B));
        b().add(new d(e.f192485o));
        b().add(new d(e.f192486p));
        b().add(new d(e.f192487q));
        b().add(new d(e.f192488r));
        b().add(new d(e.f192492x));
        b().add(new d(e.f192493y));
        b().add(new d(e.f192477g));
        b().add(new d(e.f192489t));
        b().add(new d(e.f192490v));
        b().add(new d(e.f192491w));
        if (k1Var.Y()) {
            b().add(new d(e.f192484n));
        }
    }

    public static final HashSet a(Context context) {
        f192471b.getClass();
        context.getClass();
        HashSet hashSet = new HashSet();
        w13.c cVar = e.E;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            e eVar = (e) bVarN.next();
            if (eVar != e.f192476f && eVar != e.f192477g) {
                String string = context.getString(eVar.f192495a);
                string.getClass();
                hashSet.add(string);
            }
        }
        return hashSet;
    }

    public final ArrayList<d> b() {
        ArrayList<d> arrayList = this.f192472a;
        if (arrayList != null) {
            return arrayList;
        }
        s.m("itemsList");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxx/c$a;", "", "<init>", "()V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
