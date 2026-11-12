package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB)\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/h;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lkotlin/Function1;", "Lcom/garmin/proto/generated/WifiSetup$ScannedAccessPoint;", "", "onAddNetwork", "Lkotlin/Function0;", "onAddNetworkManually", "<init>", "(Le23/l;Le23/a;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends x<f, RecyclerView.f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<WifiSetup.ScannedAccessPoint, Unit> f43304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f43305c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.l<? super WifiSetup.ScannedAccessPoint, Unit> lVar, e23.a<Unit> aVar) {
        super(new di1.i());
        lVar.getClass();
        aVar.getClass();
        this.f43304b = lVar;
        this.f43305c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        f fVarR = r(i14);
        if (fVarR instanceof f.b) {
            return 1;
        }
        if (fVarR instanceof f.a) {
            return 2;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (!(f0Var instanceof g)) {
            if (f0Var instanceof com.garmin.android.apps.connectmobile.settings.devices.wifi.a) {
                com.garmin.android.apps.connectmobile.settings.devices.wifi.a aVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.a) f0Var;
                e23.a<Unit> aVar2 = this.f43305c;
                aVar2.getClass();
                k32.l lVar = aVar.f43258a;
                String string = aVar.itemView.getResources().getString(R.string.wifi_add_network_manually);
                string.getClass();
                lVar.b(string, null);
                aVar.itemView.setOnClickListener(new q1(aVar2, 3));
                return;
            }
            return;
        }
        f fVarR = r(i14);
        fVarR.getClass();
        g gVar = (g) f0Var;
        WifiSetup.ScannedAccessPoint scannedAccessPoint = ((f.b) fVarR).f43299a;
        scannedAccessPoint.getClass();
        e23.l<WifiSetup.ScannedAccessPoint, Unit> lVar2 = this.f43304b;
        lVar2.getClass();
        k32.l lVar3 = gVar.f43303a;
        String ssid = scannedAccessPoint.getSsid();
        ssid.getClass();
        lVar3.b(ssid, null);
        if (scannedAccessPoint.getSecurityType() != WifiSetup.SecurityType.OPEN) {
            lVar3.c(R.drawable.lock, Integer.valueOf(R.color.gcm_icon_primary), 20, lVar3.f102707b.getContext().getString(R.string.lbl_secured_network));
        }
        gVar.itemView.setOnClickListener(new cw2.b(1, lVar2, scannedAccessPoint));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != 1) {
            if (i14 != 2) {
                throw new ClassCastException(am.j.h(i14, "Unknown viewType "));
            }
            com.garmin.android.apps.connectmobile.settings.devices.wifi.a.f43257b.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_row_item, viewGroup, false);
            viewInflate.getClass();
            return new com.garmin.android.apps.connectmobile.settings.devices.wifi.a(viewInflate, new k32.l(viewInflate));
        }
        g.f43302b.getClass();
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_row_item, viewGroup, false);
        viewInflate2.getClass();
        k32.l lVar = new k32.l(viewInflate2);
        Context context = viewGroup.getContext();
        context.getClass();
        int iC = (int) c22.b.c(context, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.icon_small), 1.5f);
        ImageView imageView = lVar.f102710e;
        imageView.getLayoutParams().width = iC;
        imageView.getLayoutParams().height = iC;
        return new g(viewInflate2, lVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/h$a;", "", "<init>", "()V", "", "ITEM_VIEW_TYPE_NETWORK", "I", "ITEM_VIEW_TYPE_ADD_MANUALLY", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
