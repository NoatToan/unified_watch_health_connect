package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.NavController;
import androidx.navigation.d;
import androidx.navigation.e;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f19031b;
    public e c;
    public int d;
    public Bundle e;

    public gig(Context context) {
        this.f19030a = context;
        if (context instanceof Activity) {
            this.f19031b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.f19031b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.f19031b.addFlags(268468224);
    }

    public TaskStackBuilder a() {
        if (this.f19031b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.c == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        TaskStackBuilder taskStackBuilderF = TaskStackBuilder.i(this.f19030a).f(new Intent(this.f19031b));
        for (int i = 0; i < taskStackBuilderF.k(); i++) {
            taskStackBuilderF.j(i).putExtra("android-support-nav:controller:deepLinkIntent", this.f19031b);
        }
        return taskStackBuilderF;
    }

    public final void b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.c);
        d dVar = null;
        while (!arrayDeque.isEmpty() && dVar == null) {
            d dVar2 = (d) arrayDeque.poll();
            if (dVar2.m() == this.d) {
                dVar = dVar2;
            } else if (dVar2 instanceof e) {
                Iterator<d> it = ((e) dVar2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (dVar != null) {
            this.f19031b.putExtra("android-support-nav:controller:deepLinkIds", dVar.h());
            return;
        }
        throw new IllegalArgumentException("Navigation destination " + d.l(this.f19030a, this.d) + " cannot be found in the navigation graph " + this.c);
    }

    public gig c(Bundle bundle) {
        this.e = bundle;
        this.f19031b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public gig d(int i) {
        this.d = i;
        if (this.c != null) {
            b();
        }
        return this;
    }

    public gig(NavController navController) {
        this(navController.f());
        this.c = navController.j();
    }
}
