package com.garmin.android.apps.connectmobile.startup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.z1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0854a f44798c = new C0854a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f44799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44800b = "";

    public interface b {
        void X1(String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f44799a = (b) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "GenericServerErrorFrag", context + " must implement GenericServerErrorListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("keyActionTag")) {
            String string = arguments.getString("keyActionTag", "");
            string.getClass();
            this.f44800b = string;
        }
        if (this.f44800b.length() > 0) {
            String strN = fb1.c.n("Showing for action: ", this.f44800b);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "GenericServerErrorFrag", strN);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_generic_server_error_screen, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getActivity() instanceof z1) {
            androidx.fragment.app.m activity = getActivity();
            activity.getClass();
            ((z1) activity).hideToolBar();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (getActivity() instanceof z1) {
            androidx.fragment.app.m activity = getActivity();
            activity.getClass();
            ((z1) activity).showToolBar();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((Button) view2.findViewById(R.id.server_error_btn)).setOnClickListener(new a32.b(this, 6));
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.startup.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_ACTION_TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0854a {
        public /* synthetic */ C0854a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(C0854a c0854a, String str) {
            c0854a.getClass();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("keyActionTag", str);
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0854a() {
        }
    }
}
