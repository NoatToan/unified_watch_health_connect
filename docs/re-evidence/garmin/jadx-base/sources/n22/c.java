package n22;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f122376a = new ArrayList<>();

    public static class a implements b {
        @Override // n22.c.b
        public void a() {
        }

        @Override // n22.c.b
        public void b() {
        }

        @Override // n22.c.b
        public void c() {
        }
    }

    public interface b {
        void a();

        void b();

        void c();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<b> it = this.f122376a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Iterator<b> it = this.f122376a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        Iterator<b> it = this.f122376a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Iterator<b> it = this.f122376a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
