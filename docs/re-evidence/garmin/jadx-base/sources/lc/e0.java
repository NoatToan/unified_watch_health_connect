package lc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Llc/e0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Llc/y;", "navController", "(Llc/y;)V", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.f f111756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f111757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f111758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f111759e;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llc/e0$a;", "", "", "destinationId", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "<init>", "(ILandroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f111760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f111761b;

        public a(int i14, Bundle bundle) {
            this.f111760a = i14;
            this.f111761b = bundle;
        }
    }

    public e0(Context context) {
        Intent launchIntentForPackage;
        context.getClass();
        this.f111755a = context;
        this.f111756b = new qc.f(context);
        Activity activity = (Activity) c53.c0.j(c53.c0.p(c53.q.e(new l72.b1(9), context), new l72.b1(10)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f111757c = launchIntentForPackage;
        this.f111759e = new ArrayList();
    }

    public final z6.h0 a() {
        j0 j0Var = this.f111758d;
        if (j0Var == null) {
            vb.h.z("You must call setGraph() before constructing the deep link");
            return null;
        }
        ArrayList arrayList = this.f111759e;
        if (arrayList.isEmpty()) {
            vb.h.z("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        h0 h0Var = null;
        while (true) {
            int i14 = 0;
            if (!it.hasNext()) {
                int[] iArrA1 = p13.h0.a1(arrayList2);
                Intent intent = this.f111757c;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrA1);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                z6.h0 h0VarE = z6.h0.e(this.f111755a);
                ArrayList<Intent> arrayList4 = h0VarE.f202637a;
                h0VarE.b(new Intent(intent));
                int size = arrayList4.size();
                while (i14 < size) {
                    Intent intent2 = arrayList4.get(i14);
                    if (intent2 != null) {
                        intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i14++;
                }
                return h0VarE;
            }
            a aVar = (a) it.next();
            int i15 = aVar.f111760a;
            Bundle bundle = aVar.f111761b;
            h0 h0VarB = b(i15);
            if (h0VarB == null) {
                h0.f111771f.getClass();
                c22.t.i("Navigation destination ", h0.a.a(this.f111756b, i15), " cannot be found in the navigation graph ", j0Var);
                return null;
            }
            int[] iArrC = h0VarB.c(h0Var);
            int length = iArrC.length;
            while (i14 < length) {
                arrayList2.add(Integer.valueOf(iArrC[i14]));
                arrayList3.add(bundle);
                i14++;
            }
            h0Var = h0VarB;
        }
    }

    public final h0 b(int i14) {
        p13.k kVar = new p13.k();
        j0 j0Var = this.f111758d;
        j0Var.getClass();
        kVar.addLast(j0Var);
        while (!kVar.isEmpty()) {
            h0 h0Var = (h0) kVar.removeFirst();
            if (h0Var.f111773b.f144346e == i14) {
                return h0Var;
            }
            if (h0Var instanceof j0) {
                Iterator<h0> it = ((j0) h0Var).iterator();
                while (true) {
                    qc.k kVar2 = (qc.k) it;
                    if (kVar2.hasNext()) {
                        kVar.addLast((h0) kVar2.next());
                    }
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.f111759e.iterator();
        while (it.hasNext()) {
            int i14 = ((a) it.next()).f111760a;
            if (b(i14) == null) {
                h0.f111771f.getClass();
                com.nimbusds.jose.shaded.gson.internal.a.v(hb.a.l("Navigation destination ", h0.a.a(this.f111756b, i14), " cannot be found in the navigation graph "), this.f111758d);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(y yVar) {
        this(yVar.f111903a);
        yVar.getClass();
        this.f111758d = yVar.f111904b.k();
    }
}
