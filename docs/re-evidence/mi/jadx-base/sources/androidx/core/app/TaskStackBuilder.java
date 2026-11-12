package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.lig;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f2065a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2066b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(Context context) {
        this.f2066b = context;
    }

    public static TaskStackBuilder i(Context context) {
        return new TaskStackBuilder(context);
    }

    public TaskStackBuilder e(Intent intent) {
        this.f2065a.add(intent);
        return this;
    }

    public TaskStackBuilder f(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f2066b.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        e(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskStackBuilder g(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = lig.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2066b.getPackageManager());
            }
            h(component);
            e(supportParentActivityIntent);
        }
        return this;
    }

    public TaskStackBuilder h(ComponentName componentName) {
        int size = this.f2065a.size();
        try {
            Intent intentB = lig.b(this.f2066b, componentName);
            while (intentB != null) {
                this.f2065a.add(size, intentB);
                intentB = lig.b(this.f2066b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2065a.iterator();
    }

    public Intent j(int i) {
        return this.f2065a.get(i);
    }

    public int k() {
        return this.f2065a.size();
    }

    public PendingIntent l(int i, int i2) {
        return m(i, i2, null);
    }

    public PendingIntent m(int i, int i2, Bundle bundle) {
        if (this.f2065a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f2065a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f2066b, i, intentArr, i2, bundle);
    }

    public void o() {
        q(null);
    }

    public void q(Bundle bundle) {
        if (this.f2065a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f2065a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (ni4.m(this.f2066b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f2066b.startActivity(intent);
    }
}
