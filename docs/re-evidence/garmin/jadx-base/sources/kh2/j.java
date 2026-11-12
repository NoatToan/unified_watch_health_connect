package kh2;

import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkh2/j;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f104800a;

    public j(Fragment fragment) {
        this.f104800a = fragment;
    }

    public final void a(String str) {
        m activity = this.f104800a.getActivity();
        if (activity != null && hi2.c.a(activity)) {
            Toast.makeText(activity, str, 0).show();
        }
        k.f104802b.getClass();
    }

    public final void b() {
        k.f104802b.getClass();
        m activity = this.f104800a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
