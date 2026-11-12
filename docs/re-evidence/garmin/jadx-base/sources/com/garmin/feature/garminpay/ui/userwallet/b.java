package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import k32.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t61.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/b;", "Landroidx/fragment/app/Fragment;", "Lcr2/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements cr2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f52252e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UserWalletActivity.d f52254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f52255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j22.e f52256d = j22.e.a.b(j22.e.f96744g, "EmptyUserWalletFragment", new tr2.g(this, 1), new tk0.a(26));

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_empty_user_wallet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = this.f52255c;
        if (gVar != null) {
            gVar.f102685a.setVisibility(this.f52253a ? 0 : 8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.bluetooth_prompt_container);
        viewFindViewById.getClass();
        this.f52255c = new g(viewFindViewById, g.a.BLUETOOTH);
        view2.findViewById(R.id.button_get_started).setOnClickListener(new m(this, 2));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.e(contextRequireContext)) {
            ((Guideline) view2.findViewById(R.id.guideline_empty_user_wallet)).setGuidelinePercent(0.3f);
        }
        g gVar = this.f52255c;
        if (gVar != null) {
            gVar.f102685a.setOnClickListener(new js0.d(new tr2.g(this, 0), 2));
        }
    }

    @Override // cr2.b
    public final void t1(boolean z14) {
        g gVar = this.f52255c;
        if (gVar == null) {
            this.f52253a = z14;
        } else {
            gVar.f102685a.setVisibility(z14 ? 0 : 8);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
