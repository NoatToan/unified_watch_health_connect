package z6;

import android.app.ActivityOptions;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityOptions f202598a;

        public a(ActivityOptions activityOptions) {
            this.f202598a = activityOptions;
        }

        @Override // z6.b
        public final Bundle a() {
            return this.f202598a.toBundle();
        }
    }

    public Bundle a() {
        return null;
    }
}
