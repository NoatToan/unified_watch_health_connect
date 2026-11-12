package com.garmin.android.apps.connectmobile.performance.stats.improvement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vg1.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f40115g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0747b f40116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.performance.model.a> f40117b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.performance.model.a f40118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f40119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f40120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f40121f;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.stats.improvement.b$b, reason: collision with other inner class name */
    public interface InterfaceC0747b {
        void m5(String str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        if (i14 == 111) {
            Object obj = null;
            String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("extra_device_id");
            if (string != null) {
                InterfaceC0747b interfaceC0747b = this.f40116a;
                if (interfaceC0747b != null) {
                    interfaceC0747b.m5(string);
                }
                for (Object obj2 : this.f40117b) {
                    com.garmin.android.apps.connectmobile.performance.model.a aVar = (com.garmin.android.apps.connectmobile.performance.model.a) obj2;
                    if (!TextUtils.isEmpty(aVar.f39917a) && s.g(aVar.f39917a, string)) {
                        obj = obj2;
                        break;
                    }
                }
                com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) obj;
                if (aVar2 == null) {
                    aVar2 = this.f40118c;
                }
                this.f40118c = aVar2;
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f40116a = (InterfaceC0747b) context;
        } catch (ClassCastException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "TrainingStatusDeviceFragment", "Activity should implement OnDeviceChangedCallback");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_device_selector_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f40119d = view2.findViewById(R.id.device_selector_layout);
        this.f40120e = (TextView) view2.findViewById(R.id.device_selector_view);
        this.f40121f = (ImageView) view2.findViewById(R.id.device_selector_image);
    }

    public final void u6(com.garmin.android.apps.connectmobile.performance.model.a aVar) {
        this.f40118c = aVar;
        if (aVar != null) {
            com.garmin.android.apps.connectmobile.performance.model.a.b bVar = com.garmin.android.apps.connectmobile.performance.model.a.f39916e;
            Context context = getContext();
            String str = aVar.f39918b;
            int i14 = aVar.f39920d;
            bVar.getClass();
            String strA = com.garmin.android.apps.connectmobile.performance.model.a.b.a(context, i14, str);
            TextView textView = this.f40120e;
            if (textView != null) {
                textView.setText(strA);
            }
            ImageView imageView = this.f40121f;
            if (imageView != null) {
                Context context2 = imageView.getContext();
                context2.getClass();
                zp0.c cVar = new zp0.c(context2);
                cVar.f206565e = aVar.f39919c;
                cVar.f206570j = 2131231969;
                cVar.h(imageView);
            }
        }
    }

    public final void v6(List<com.garmin.android.apps.connectmobile.performance.model.a> list) {
        View view2;
        list.getClass();
        this.f40117b = list;
        View view3 = this.f40119d;
        if (view3 == null || view3.hasOnClickListeners() || this.f40117b.isEmpty() || (view2 = this.f40119d) == null) {
            return;
        }
        view2.setOnClickListener(new z0(this, 8));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEVICE_LIST_REQUEST_CODE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
