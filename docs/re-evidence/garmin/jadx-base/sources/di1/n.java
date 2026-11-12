package di1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldi1/n;", "Landroidx/recyclerview/widget/x;", "Ldi1/k;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lkotlin/Function1;", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "", "onItemSelected", "<init>", "(Le23/l;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends androidx.recyclerview.widget.x<k, RecyclerView.f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<WifiSetup.StoredAccessPoint, Unit> f59766b;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.l<? super WifiSetup.StoredAccessPoint, Unit> lVar) {
        super(new l());
        lVar.getClass();
        this.f59766b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        k kVarR = r(i14);
        if (kVarR instanceof k.b) {
            return 1;
        }
        if (kVarR instanceof k.a) {
            return 2;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (!(f0Var instanceof m)) {
            if (f0Var instanceof j) {
                k kVarR = r(i14);
                kVarR.getClass();
                j jVar = (j) f0Var;
                jVar.f59758a.setText(jVar.itemView.getResources().getString(R.string.wifi_max_no_of_devices_hint, String.valueOf(((k.a) kVarR).f59759a)));
                return;
            }
            return;
        }
        k kVarR2 = r(i14);
        kVarR2.getClass();
        m mVar = (m) f0Var;
        WifiSetup.StoredAccessPoint storedAccessPoint = ((k.b) kVarR2).f59761a;
        storedAccessPoint.getClass();
        e23.l<WifiSetup.StoredAccessPoint, Unit> lVar = this.f59766b;
        lVar.getClass();
        k32.l lVar2 = mVar.f59765a;
        String ssid = storedAccessPoint.getSsid();
        ssid.getClass();
        lVar2.b(ssid, null);
        mVar.itemView.setOnClickListener(new cw2.b(2, lVar, storedAccessPoint));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 1) {
            m.f59764b.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_row_item, viewGroup, false);
            viewInflate.getClass();
            return new m(viewInflate, new k32.l(viewInflate));
        }
        if (i14 != 2) {
            throw new ClassCastException(am.j.h(i14, "Unknown viewType "));
        }
        j.f59757b.getClass();
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_text_footer, viewGroup, false);
        viewInflate2.getClass();
        return new j(viewInflate2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldi1/n$a;", "", "<init>", "()V", "", "ITEM_VIEW_TYPE_ITEM", "I", "ITEM_VIEW_TYPE_FOOTER", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
