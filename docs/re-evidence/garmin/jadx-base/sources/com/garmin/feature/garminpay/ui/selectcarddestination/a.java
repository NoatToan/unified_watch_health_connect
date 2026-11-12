package com.garmin.feature.garminpay.ui.selectcarddestination;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.x1;
import br2.d;
import br2.f;
import com.bumptech.glide.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.GenericHelpPageActivity;
import g22.e;
import hn2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1101a f52159b = new C1101a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sr2.a f52160a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/selectcarddestination/a$b", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.menu_gp_help, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_help) {
                return false;
            }
            C1101a c1101a = a.f52159b;
            a aVar = a.this;
            aVar.getClass();
            GenericHelpPageActivity.a aVar2 = GenericHelpPageActivity.f51857k;
            m activity = aVar.getActivity();
            activity.getClass();
            GenericHelpPageActivity.b bVar = GenericHelpPageActivity.b.HOW_TO_UPDATE;
            aVar2.getClass();
            GenericHelpPageActivity.a.a(activity, bVar);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        f fVar;
        Parcelable parcelable;
        i.a supportActionBar;
        super.onCreate(bundle);
        this.f52160a = (sr2.a) new x1(this).b(s0.f105811a.b(sr2.a.class));
        m activity = getActivity();
        c cVar = activity instanceof c ? (c) activity : null;
        if (cVar != null && (supportActionBar = cVar.getSupportActionBar()) != null) {
            supportActionBar.C(getString(R.string.label_select_watch));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("DeviceItemBundleKey", f.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("DeviceItemBundleKey");
                if (!(parcelable2 instanceof f)) {
                    parcelable2 = null;
                }
                parcelable = (f) parcelable2;
            }
            fVar = (f) parcelable;
        } else {
            fVar = null;
        }
        sr2.a aVar = this.f52160a;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("fwUpdateAvailableViewModel");
            throw null;
        }
        if (fVar == null) {
            fVar = new f(0L, "--", "", d.NOT_CONNECTED, "--", "--", false, false, 192, null);
        }
        aVar.f160592a = fVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_firmware_update_available, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        e.k(this, new b(), b0.b.RESUMED);
        Context context = getContext();
        if (context != null) {
            ImageView imageView = (ImageView) view2.findViewById(R.id.software_update_available_image_view);
            k kVarC = com.bumptech.glide.b.c(context).c(context);
            sr2.a aVar = this.f52160a;
            if (aVar == null) {
                p005kotlin.jvm.internal.s.m("fwUpdateAvailableViewModel");
                throw null;
            }
            f fVar = aVar.f160592a;
            if (fVar == null) {
                p005kotlin.jvm.internal.s.m("deviceItemModel");
                throw null;
            }
            kVarC.l(fVar.f19601c).E(imageView);
            ((TextView) view2.findViewById(R.id.software_update_available_header_text_view)).setText(context.getText(R.string.msg_garmin_device_software_update_available));
            TextView textView = (TextView) view2.findViewById(R.id.software_update_available_message_text_view);
            String string = context.getString(R.string.watch_install_update);
            string.getClass();
            sr2.a aVar2 = this.f52160a;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("fwUpdateAvailableViewModel");
                throw null;
            }
            f fVar2 = aVar2.f160592a;
            if (fVar2 != null) {
                q6.f.y(new Object[]{fVar2.f19600b}, 1, string, textView);
            } else {
                p005kotlin.jvm.internal.s.m("deviceItemModel");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.selectcarddestination.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/selectcarddestination/a$a;", "", "<init>", "()V", "", "DEVICE_ITEM_BUNDLE_KEY", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1101a {
        public /* synthetic */ C1101a(j jVar) {
            this();
        }

        private C1101a() {
        }
    }
}
