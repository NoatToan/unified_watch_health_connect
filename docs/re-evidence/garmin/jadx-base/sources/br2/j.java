package br2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import o72.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import wr2.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lbr2/j;", "Landroidx/fragment/app/Fragment;", "Lwr2/v;", "Landroid/widget/ImageView;", "cardImageUpdater", "Landroid/widget/TextView;", "description1Updater", "description2Updater", "rapidPassGuideUpdater", "<init>", "(Lwr2/v;Lwr2/v;Lwr2/v;Lwr2/v;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f19631f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f19632g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<ImageView> f19633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v<TextView> f19634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<TextView> f19635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v<TextView> f19636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f19637e;

    public interface b {
        void a();
    }

    static {
        int i14 = gt2.c.f79010a;
        f19632g = gt2.b.f79005a.h("PAY#RapidPassSetupFrag");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(v<? super ImageView> vVar, v<? super TextView> vVar2, v<? super TextView> vVar3, v<? super TextView> vVar4) {
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        vVar4.getClass();
        this.f19633a = vVar;
        this.f19634b = vVar2;
        this.f19635c = vVar3;
        this.f19636d = vVar4;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_garminpay_setup_express_transit, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f19637e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hn2.c cVarF = t.F(this);
        if (cVarF == null) {
            f19632g.error("Failed to cast activity to GarminPayBaseActivity");
            return;
        }
        cVarF.X9(false);
        String string = cVarF.getString(R.string.wallet_rapid_pass_card);
        string.getClass();
        cVarF.W9(string, hn2.c.a.NONE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.card_image);
        viewFindViewById.getClass();
        v<ImageView> vVar = this.f19633a;
        vVar.getClass();
        vVar.x0(viewFindViewById);
        View viewFindViewById2 = view2.findViewById(R.id.description1);
        viewFindViewById2.getClass();
        v<TextView> vVar2 = this.f19634b;
        vVar2.getClass();
        vVar2.x0(viewFindViewById2);
        View viewFindViewById3 = view2.findViewById(R.id.description2);
        viewFindViewById3.getClass();
        v<TextView> vVar3 = this.f19635c;
        vVar3.getClass();
        vVar3.x0(viewFindViewById3);
        View viewFindViewById4 = view2.findViewById(R.id.rapid_pass_guide);
        viewFindViewById4.getClass();
        v<TextView> vVar4 = this.f19636d;
        vVar4.getClass();
        vVar4.x0(viewFindViewById4);
        ((Button) view2.findViewById(R.id.button_ok)).setOnClickListener(new a32.b(this, 20));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbr2/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
