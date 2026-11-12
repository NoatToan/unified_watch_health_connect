package ew2;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import o13.p;
import org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f66889b;

    public /* synthetic */ a(Fragment fragment, int i14) {
        this.f66888a = i14;
        this.f66889b = fragment;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66888a;
        Fragment fragment = this.f66889b;
        switch (i14) {
            case 0:
                d.a aVar = d.f66899a;
                Context contextRequireContext = fragment.requireContext();
                contextRequireContext.getClass();
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                e.a.a(e.f66901a, contextRequireContext, contextRequireContext.getString(R.string.device_only_setting_title), contextRequireContext.getString(R.string.device_only_setting_description, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192451c), new p(fragment.requireContext().getString(R.string.lbl_ok), new el1.a(20)), null, 880).show();
                return Unit.INSTANCE;
            default:
                return ViewModelLazyKt.viewModelForClass$lambda$1(fragment);
        }
    }
}
