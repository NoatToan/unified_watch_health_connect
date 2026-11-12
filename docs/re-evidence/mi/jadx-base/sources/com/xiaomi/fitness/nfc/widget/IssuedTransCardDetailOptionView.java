package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.UncompletedOrderList;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.entity.ProvinceEntity;
import com.xiaomi.fitness.nfc.ui.RechargeActivity;
import com.xiaomi.fitness.nfc.ui.TransferOutIntroFragment;
import com.xiaomi.fitness.nfc.ui.issued.MoreSettingsFragment;
import com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment;
import com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView;
import defpackage.bg4;
import defpackage.jz6;
import defpackage.mri;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.vqg;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public class IssuedTransCardDetailOptionView extends LinearLayout implements View.OnClickListener {
    public static boolean t = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<ProvinceEntity> f12640b;
    public InnerCardImageView c;
    public boolean d;
    public jz6 e;
    public jz6 f;
    public jz6 g;
    public Context h;
    public BaseCardFragment i;
    public CardWrapper j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f12641k;
    public TextView l;
    public View m;
    public View n;
    public View o;
    public View p;
    public TextView q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f12642r;
    public View s;

    public interface a {
        void a();
    }

    public IssuedTransCardDetailOptionView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ BaseResponse C(CardWrapper cardWrapper) throws Exception {
        return s3q.f0().r0(cardWrapper);
    }

    public static /* synthetic */ void z() {
    }

    public final /* synthetic */ void A(a aVar, Boolean bool) throws Exception {
        bool.booleanValue();
        q(aVar);
    }

    public final /* synthetic */ void B(a aVar, Throwable th) throws Exception {
        vqg.c("queryUncompletedTransfersV2 error ", th);
        q(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.xiaomi.fitness.device.manager.DeviceModel] */
    public final /* synthetic */ void D(String str) throws Exception {
        if (this.i.isFragmentValid()) {
            this.f12639a.setEnabled(!this.j.mAid.equalsIgnoreCase(str));
            if (DeviceModelExtKt.isHuaMi(DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel())) {
                this.f12639a.setText(!this.j.mAid.equalsIgnoreCase(str) ? o0j.r6 : o0j.s6);
            } else {
                this.f12639a.setText(!this.j.mAid.equalsIgnoreCase(str) ? o0j.t6 : o0j.u6);
            }
        }
    }

    public final void F(final a aVar) {
        jz6 jz6Var = this.f;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        this.i.showLoading();
        this.f = s3q.f0().j1(this.j).O(new bg4() { // from class: ykd
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f40269a.A(aVar, (Boolean) obj);
            }
        }, new bg4() { // from class: lkd
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f25168a.B(aVar, (Throwable) obj);
            }
        });
    }

    public o4h<BaseResponse> G(final CardWrapper cardWrapper) {
        return s3q.K(new Callable() { // from class: nkd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IssuedTransCardDetailOptionView.C(cardWrapper);
            }
        });
    }

    public final void H(a aVar) {
        if (!s()) {
            aVar.a();
        } else {
            F(aVar);
            J();
        }
    }

    public final void I() {
        String str;
        if (this.j.isBalanceValid() && this.j.isCardActive()) {
            this.m.setVisibility(8);
            this.l.setVisibility(0);
            this.l.setText(this.h.getString(o0j.S0, Float.valueOf(this.j.mCardBalance / 100.0f)));
        } else {
            this.m.setVisibility(0);
            this.l.setVisibility(8);
        }
        InnerCardImageView innerCardImageView = this.c;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        innerCardImageView.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel(), this.j);
        this.n.setEnabled(false);
        this.o.setEnabled(s());
        CardConfigManager.CardConfig cardConfigByType = CardConfigManager.getInstance().getCardConfigByType(this.j.getCardType());
        boolean z = true;
        if (this.j.isCardActive() || (cardConfigByType != null && cardConfigByType.isSupportRechargeOnInvalidDate())) {
            this.n.setEnabled(true);
            this.n.setVisibility(0);
            this.o.setVisibility(8);
        } else if (s()) {
            this.n.setVisibility(8);
            this.o.setVisibility(0);
        }
        View view = this.p;
        if (view != null) {
            View viewFindViewById = view.findViewById(mri.b2);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(this.j.isCardActive() ? 8 : 0);
            }
            TextView textView = (TextView) this.p.findViewById(mri.c2);
            if (TextUtils.isEmpty(this.j.mCardNo)) {
                str = null;
            } else {
                String str2 = this.f12641k;
                if (str2 == null || !str2.equals(this.j.mAid)) {
                    str = this.h.getString(o0j.J1) + " | " + this.j.mCardNo;
                } else {
                    str = this.h.getString(o0j.T2) + " | " + this.j.mCardNo;
                }
            }
            textView.setText(str);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (!DeviceModelExtKt.isWearOS(wearableDeviceModel) && !DeviceModelExtKt.isHuaMi(wearableDeviceModel))) {
            z = false;
        }
        this.f12639a.setVisibility(z ? 0 : 8);
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            this.f12639a.setText(o0j.r6);
        }
        if (this.j.isCardActive() && z) {
            jz6 jz6Var = this.g;
            if (jz6Var != null && !jz6Var.isDisposed()) {
                this.g.dispose();
            }
            this.g = s3q.f0().c0().O(new bg4() { // from class: wkd
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f38061a.D((String) obj);
                }
            }, new bg4() { // from class: xkd
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    vqg.c("checkIsDefaultCard", (Throwable) obj);
                }
            });
        }
    }

    public void J() {
        this.d = true;
    }

    public final void K() {
        zl3.g().l(this.j);
        Bundle bundle = new Bundle();
        bundle.putString(MoreSettingsFragment.getSDefault(), this.f12641k);
        this.i.gotoPage(MoreSettingsFragment.class, bundle);
    }

    public final void L() {
        Intent intent = new Intent(this.i.getActivity(), (Class<?>) RechargeActivity.class);
        Bundle arguments = this.i.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        zl3.g().l(this.j);
        intent.putExtras(arguments);
        this.i.startActivity(intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == mri.O3) {
            H(new a() { // from class: qkd
                @Override // com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView.a
                public final void a() {
                    this.f31600a.x();
                }
            });
            return;
        }
        if (id == mri.d1) {
            return;
        }
        if (id == mri.P2) {
            H(new a() { // from class: rkd
                @Override // com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView.a
                public final void a() {
                    this.f32635a.K();
                }
            });
            return;
        }
        if (id == mri.h5) {
            p(this.j);
            return;
        }
        if (id == mri.c5) {
            H(new a() { // from class: skd
                @Override // com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView.a
                public final void a() {
                    this.f33733a.y();
                }
            });
        } else if (id == mri.k4) {
            H(new a() { // from class: tkd
                @Override // com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView.a
                public final void a() {
                    IssuedTransCardDetailOptionView.z();
                }
            });
        } else {
            vqg.a("invalid view id");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.n = findViewById(mri.h5);
        this.l = (TextView) findViewById(mri.X4);
        this.m = findViewById(mri.Y4);
        this.o = findViewById(mri.c5);
        this.f12639a = (TextView) findViewById(mri.d1);
        this.q = (TextView) findViewById(mri.E0);
        this.c = (InnerCardImageView) findViewById(mri.a0);
        this.f12642r = (TextView) findViewById(mri.O3);
        this.n.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.f12642r.setOnClickListener(this);
        findViewById(mri.P2).setOnClickListener(this);
        View viewFindViewById = findViewById(mri.k4);
        this.s = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    public final void p(final CardWrapper cardWrapper) {
        jz6 jz6Var = this.f;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        this.i.showLoading();
        this.f = G(this.j).O(new bg4() { // from class: ukd
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f35869a.t(cardWrapper, (BaseResponse) obj);
            }
        }, new bg4() { // from class: vkd
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f36979a.u((Throwable) obj);
            }
        });
    }

    public final void q(final a aVar) {
        jz6 jz6Var = this.e;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        this.e = s3q.f0().z1(this.j).O(new bg4() { // from class: okd
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f29245a.v(aVar, (CardWrapper) obj);
            }
        }, new bg4() { // from class: pkd
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f30496a.w((Throwable) obj);
            }
        });
    }

    public void r(CardWrapper cardWrapper, BaseCardFragment baseCardFragment, View view, String str) {
        this.j = cardWrapper;
        this.p = view;
        this.i = baseCardFragment;
        this.f12641k = str;
        ((DeviceImageView) findViewById(mri.F5)).show((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
        t = true;
        H(new a() { // from class: kkd
            @Override // com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView.a
            public final void a() {
                this.f23947a.I();
            }
        });
    }

    public final boolean s() {
        return !this.d;
    }

    public final /* synthetic */ void t(CardWrapper cardWrapper, BaseResponse baseResponse) throws Exception {
        Object[] objArr;
        this.i.hideLoading();
        if (!baseResponse.isSuccess() || (objArr = baseResponse.mDatas) == null || objArr.length <= 0) {
            ToastUtil.showLongToast(o0j.t2);
            return;
        }
        int i = 0;
        UncompletedOrderList uncompletedOrderList = (UncompletedOrderList) objArr[0];
        if (!uncompletedOrderList.isEmpty()) {
            for (UncompletedOrderList.UncompletedOrder uncompletedOrder : uncompletedOrderList.getList()) {
                if (Objects.equals(cardWrapper.mSeCard.getAid(), uncompletedOrder.getAid())) {
                    if (uncompletedOrder.getType() != 3) {
                        if (uncompletedOrder.getType() == 4) {
                            i = o0j.c2;
                            break;
                        }
                    } else {
                        i = o0j.d2;
                        break;
                    }
                }
            }
        }
        if (i == 0) {
            H(new a() { // from class: mkd
                @Override // com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView.a
                public final void a() {
                    this.f26955a.L();
                }
            });
        } else {
            ToastUtil.showLongToast(i);
        }
    }

    public final /* synthetic */ void u(Throwable th) throws Exception {
        this.i.hideLoading();
        ToastUtil.showLongToast(o0j.t2);
    }

    public final /* synthetic */ void v(a aVar, CardWrapper cardWrapper) throws Exception {
        BaseCardFragment baseCardFragment = this.i;
        if (baseCardFragment == null || !baseCardFragment.isFragmentValid()) {
            return;
        }
        if (this.j.isSupportTransferOut()) {
            this.f12642r.setEnabled(true);
        } else {
            this.f12642r.setEnabled(false);
            this.f12642r.append("(" + this.h.getString(o0j.common_not_support) + ")");
        }
        if (this.j.isCardActive() && t) {
            aVar.a();
        }
        this.i.hideLoading();
    }

    public final /* synthetic */ void w(Throwable th) throws Exception {
        this.i.hideLoading();
        ToastUtil.showShortToast(o0j.o4);
        FragmentActivity activity = this.i.getActivity();
        if (activity != null) {
            activity.finish();
        }
        BaseCardFragment baseCardFragment = this.i;
        if (baseCardFragment == null || !baseCardFragment.isFragmentValid()) {
            return;
        }
        this.o.setEnabled(false);
    }

    public final /* synthetic */ void x() {
        zl3.g().l(this.j);
        this.i.gotoPageForResult(TransferOutIntroFragment.class, null, TransitCardDetailFragment.getSRequestTansferOut());
    }

    public final /* synthetic */ void y() {
        this.o.setEnabled(false);
    }

    public IssuedTransCardDetailOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IssuedTransCardDetailOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12640b = new ArrayList<>();
        this.h = context;
    }
}
