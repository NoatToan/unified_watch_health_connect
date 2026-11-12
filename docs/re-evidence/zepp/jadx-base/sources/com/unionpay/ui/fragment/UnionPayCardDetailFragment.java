package com.unionpay.ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.Observer;
import com.google.gson.Gson;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.nfc.ble.AppletType;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.UnionPayResource;
import com.unionpay.entity.UnionPayStatus;
import com.unionpay.entity.WatchBankCardInfo;
import com.unionpay.tsm.TsmServiceDownloader;
import com.unionpay.tsm.constant.TsmErrorMsg;
import com.unionpay.tsmservice.data.Constant;
import com.unionpay.tsmservice.data.UniteAppDetail;
import com.unionpay.tsmservice.data.UpdateInfo;
import com.unionpay.ui.activity.AddUnionPayCardActivity;
import com.unionpay.ui.activity.InstalledUnionPayCardActivity;
import com.unionpay.ui.activity.SmsCodeVerifyActivity;
import com.unionpay.ui.activity.WatchUnlockActivity;
import com.unionpay.ui.viewmodel.CardDetailViewModel;
import com.unionpay.util.BankEventUtil;
import com.unionpay.util.BankRx;
import com.unionpay.util.UnionImageLoadUtils;
import com.unionpay.util.UnionPayUtil;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class UnionPayCardDetailFragment extends BaseUnionPayFragment<CardDetailViewModel> {
    public static final String CARD_TYPE_CREDIT = "02";
    public static final String CARD_TYPE_DEBIT = "01";
    private static final int h = 8;
    private a c;
    private ProgressDialogFragment d;
    private TsmServiceDownloader e;
    private String f;
    private String g;

    public static class a {
        public View a;
        public ImageView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public View h;
        public View i;
        public View j;
        public TextView k;
        public FrameLayout l;
        public View m;
        public View n;

        public a(View view) {
            this.a = view.findViewById(R.id.card_info);
            this.b = (ImageView) view.findViewById(R.id.union_card_img);
            this.c = (TextView) view.findViewById(R.id.union_card_state);
            this.d = (TextView) view.findViewById(R.id.union_card_info);
            this.e = (TextView) view.findViewById(R.id.union_card_no);
            this.f = (TextView) view.findViewById(R.id.union_card_active);
            this.g = (TextView) view.findViewById(R.id.union_card_delete);
            this.h = view.findViewById(R.id.faq_area);
            this.i = view.findViewById(R.id.union_card_error);
            this.j = view.findViewById(R.id.wl_load_failure_retry);
            this.k = (TextView) view.findViewById(R.id.union_card_add);
            this.n = view.findViewById(R.id.union_card_add_view);
            this.l = (FrameLayout) view.findViewById(R.id.more_card);
            this.m = view.findViewById(R.id.union_card_empty);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        if (((CardDetailViewModel) this.a).appListData.getValue() == null) {
            return;
        }
        List<UniteAppDetail> list = ((CardDetailViewModel) this.a).appListData.getValue().data;
        if (UnionPayUtil.isEmptyList(list)) {
            return;
        }
        InstalledUnionPayCardActivity.open(getActivity(), new Gson().toJson(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_DETAIL_OUT, this.f, "Delete");
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view) {
        BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_DETAIL_OUT, this.f, "FAQ");
        ((CardDetailViewModel) this.a).showFaq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        if (((CardDetailViewModel) this.a).updateInfoData.getValue() == null) {
            ((CardDetailViewModel) this.a).initTsm();
        } else {
            ((CardDetailViewModel) this.a).loadCardList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        UniteAppDetail value = ((CardDetailViewModel) this.a).currentCardData.getValue();
        if (value == null) {
            return;
        }
        String status = value.getStatus().getStatus();
        if (Arrays.asList("02", "03").contains(status)) {
            u(value);
        } else if ("04".equals(status)) {
            w(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void F(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        if (unionPayResource.status == UnionPayStatus.ERROR) {
            this.b.hideLoadingDialog();
            this.b.onError(unionPayResource);
        }
        a(unionPayResource, "Init");
        T t = unionPayResource.data;
        if (t == 0 || "00".equals(((UpdateInfo) t).getType())) {
            return;
        }
        S((UpdateInfo) unionPayResource.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        a(unionPayResource, "Get Card List");
        if (unionPayResource.status == UnionPayStatus.ERROR) {
            this.c.i.setVisibility(0);
            this.b.hideLoadingDialog();
            this.b.onError(unionPayResource);
        } else {
            this.c.i.setVisibility(8);
            if (unionPayResource.status == UnionPayStatus.SUCCESS) {
                W((List) unionPayResource.data);
                T((List) unionPayResource.data);
                this.b.hideLoadingDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void H(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        a(unionPayResource, "Delete Card");
        this.b.showOrError(unionPayResource);
        if (unionPayResource.status == UnionPayStatus.ERROR) {
            BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_DELETE_FAIL, this.f);
            return;
        }
        if (unionPayResource.isSuccessful()) {
            ((CardDetailViewModel) this.a).setCardId("");
            ((CardDetailViewModel) this.a).loadCardList();
            if (unionPayResource.data != 0 && getActivity() != null) {
                ((CardDetailViewModel) this.a).syncDeleteResultToWatch(((UniteAppDetail) unionPayResource.data).getAppID());
            }
            BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_DELETE_SUCCESS, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void I(UnionPayResource unionPayResource) {
        if (unionPayResource == null) {
            return;
        }
        a(unionPayResource, "Download Card");
        if (unionPayResource.status == UnionPayStatus.ERROR) {
            ProgressDialogFragment progressDialogFragment = this.d;
            if (progressDialogFragment != null) {
                progressDialogFragment.dismissAllowingStateLoss();
            }
            this.b.onError(unionPayResource);
            BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_ISSUE_FAIL, this.f);
        } else {
            T t = unionPayResource.data;
            V(t == 0 ? 0 : ((Integer) t).intValue());
        }
        if (unionPayResource.isSuccessful()) {
            ((CardDetailViewModel) this.a).syncIssueResultToWatch(this.g);
            ((CardDetailViewModel) this.a).loadCardList();
            BankEventUtil.recordBankEvent(BankEventUtil.UNIONPAY_ISSUE_SUCCESS, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(((CardDetailViewModel) this.a).queryPwd()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Boolean bool) throws Exception {
        this.b.hideLoadingDialog();
        if (!bool.booleanValue()) {
            new AlertDialogFragment.Builder(getContext()).setTitle(R.string.wl_tsm_download_title).setMessage(R.string.wl_enable_watch_password).setNeutralButton(R.string.wl_bank_btn_known, new DialogInterface.OnClickListener() { // from class: v28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).create().show(getChildFragmentManager(), "Password");
            return;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) WatchUnlockActivity.class);
        intent.putExtra(WatchUnlockActivity.ARGS_ACTION, 0);
        startActivityForResult(intent, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(UniteAppDetail uniteAppDetail, DialogInterface dialogInterface, int i) {
        ((CardDetailViewModel) this.a).deleteCard(uniteAppDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(UpdateInfo updateInfo, DialogInterface dialogInterface, int i) {
        x(updateInfo.getDownloadUrl());
    }

    private void Q() {
        if (((CardDetailViewModel) this.a).appListData.getValue() != null && !UnionPayUtil.isEmptyList(((CardDetailViewModel) this.a).appListData.getValue().data) && ((CardDetailViewModel) this.a).appListData.getValue().data.size() >= 8) {
            this.b.showTipDialog(TsmErrorMsg.CARD_OVER_LIMIT);
        } else {
            if (getActivity() == null) {
                return;
            }
            this.b.showLoadingDialog(getString(R.string.wl_bank_loading));
            BankRx.io(new ObservableOnSubscribe() { // from class: s28
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                    this.a.J(observableEmitter);
                }
            }).safeSubscribe(new Consumer() { // from class: t28
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.L((Boolean) obj);
                }
            });
        }
    }

    private void R() {
        final UniteAppDetail value = ((CardDetailViewModel) this.a).currentCardData.getValue();
        if (value == null) {
            return;
        }
        new AlertDialogFragment.Builder(getContext()).setMessage(R.string.wl_delete_bank_card_tips).setNegativeButton(getString(R.string.wl_bank_cancel), new DialogInterface.OnClickListener() { // from class: w28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.wl_bank_confirm, new DialogInterface.OnClickListener() { // from class: k28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.N(value, dialogInterface, i);
            }
        }).create().show(getChildFragmentManager(), "delete_bank_card");
    }

    private void S(@NonNull final UpdateInfo updateInfo) {
        boolean zEquals = "02".equals(updateInfo.getType());
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: u28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.O(updateInfo, dialogInterface, i);
            }
        };
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        if (zEquals) {
            builder.setNeutralButton(R.string.wl_tsm_download, onClickListener);
        } else {
            builder.setPositiveButton(R.string.wl_tsm_download, onClickListener).setNegativeButton(R.string.wl_bank_cancel, new DialogInterface.OnClickListener() { // from class: x28
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
        }
        builder.setTitle(R.string.wl_watch_unlock_dialog_title).setMessage(R.string.wl_watch_unlock_dialog_message).create().show(getChildFragmentManager(), "Tsm Update Dialog");
    }

    private void T(List<UniteAppDetail> list) {
        if (getActivity() == null) {
            return;
        }
        int size = list.size();
        ArrayList<WatchBankCardInfo> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            UniteAppDetail uniteAppDetail = list.get(i);
            if (!UnionPayUtil.isUnActiveCard(uniteAppDetail.getStatus())) {
                WatchBankCardInfo watchBankCardInfo = new WatchBankCardInfo();
                watchBankCardInfo.id = uniteAppDetail.getAppID();
                watchBankCardInfo.name = uniteAppDetail.getAppProviderName();
                watchBankCardInfo.imageUrl = uniteAppDetail.getAppIcon();
                watchBankCardInfo.type = AppletType.WATCHUNIONPAY.getBtValue();
                watchBankCardInfo.extra = v(uniteAppDetail.getCardType(), uniteAppDetail.getSPan());
                arrayList.add(watchBankCardInfo);
            }
        }
        ((CardDetailViewModel) this.a).syncAllUnionCardInfoToWatch(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(UniteAppDetail uniteAppDetail) {
        if (uniteAppDetail == null) {
            return;
        }
        UnionImageLoadUtils.loadImage(this.c.b, uniteAppDetail.getAppIcon(), R.drawable.wl_watch_bank_card_default);
        String status = uniteAppDetail.getStatus().getStatus();
        String unionCardStatusText = UnionPayUtil.getUnionCardStatusText(getActivity(), status);
        this.c.c.setVisibility(TextUtils.isEmpty(unionCardStatusText) ? 8 : 0);
        this.c.c.setText(unionCardStatusText);
        String string = getString(R.string.wl_support_bank_debit);
        if ("02".equals(uniteAppDetail.getCardType())) {
            string = getString(R.string.wl_support_bank_credit);
        }
        this.c.d.setText(getString(R.string.wl_union_card_name_no, string, uniteAppDetail.getSPan()));
        this.c.e.setText(uniteAppDetail.getMPan());
        this.c.f.setVisibility(Arrays.asList("02", "03", "04").contains(status) ? 0 : 8);
        if (UnionPayUtil.isUnActiveCard(uniteAppDetail.getStatus())) {
            return;
        }
        ((CardDetailViewModel) this.a).syncCardInfoToDevice(uniteAppDetail);
    }

    private void V(int i) {
        if (i == 100) {
            ProgressDialogFragment progressDialogFragment = this.d;
            if (progressDialogFragment != null) {
                progressDialogFragment.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        if (this.d == null) {
            ProgressDialogFragment progressDialogFragment2 = new ProgressDialogFragment();
            this.d = progressDialogFragment2;
            progressDialogFragment2.setMessage(getString(R.string.wl_bank_download_tips));
        }
        if (!this.d.isVisible()) {
            this.d.show(getChildFragmentManager(), "union_card_download");
        }
        this.d.setTitle(getString(R.string.wl_bank_download_progress, Integer.valueOf(i)));
        this.d.setProgress(i);
    }

    private void W(List<UniteAppDetail> list) {
        this.c.n.setVisibility(0);
        if (UnionPayUtil.isEmptyList(list)) {
            this.c.a.setVisibility(8);
            this.c.l.setVisibility(8);
            this.c.m.setVisibility(0);
            this.c.k.setText(R.string.wl_bank_open_up_now);
            return;
        }
        this.c.k.setText(R.string.wl_add_bank_card);
        this.c.a.setVisibility(0);
        this.c.m.setVisibility(8);
        int iMin = Math.min(list.size(), 3);
        if (iMin <= 1) {
            this.c.l.setVisibility(8);
            return;
        }
        this.c.l.removeAllViews();
        this.c.l.setVisibility(0);
        if (getContext() == null) {
            return;
        }
        int iDpToPx = (int) dpToPx(getContext(), 10.0f);
        int iDpToPx2 = (int) dpToPx(getContext(), 200.0f);
        int iDpToPx3 = (int) dpToPx(getContext(), 10.0f);
        for (int i = 0; i < iMin; i++) {
            UniteAppDetail uniteAppDetail = list.get(i);
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            UnionImageLoadUtils.loadImageInternal(imageView, uniteAppDetail.getAppIcon(), iDpToPx3, R.drawable.wl_watch_bank_card_default);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iDpToPx2);
            layoutParams.setMargins(0, iDpToPx * i, 0, 0);
            this.c.l.addView(imageView, layoutParams);
        }
    }

    public static float dpToPx(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    private void u(UniteAppDetail uniteAppDetail) {
        if (uniteAppDetail == null) {
            return;
        }
        Intent intent = new Intent(getContext(), (Class<?>) SmsCodeVerifyActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("PanId", uniteAppDetail.getMPanId());
        intent.putExtras(bundle);
        startActivityForResult(intent, 18);
    }

    private String v(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constant.KEY_CARD_TYPE, str);
            jSONObject.put("shortCardNo", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void w(UniteAppDetail uniteAppDetail) {
        if (uniteAppDetail == null) {
            return;
        }
        ProgressDialogFragment progressDialogFragment = this.d;
        if (progressDialogFragment != null) {
            progressDialogFragment.dismissAllowingStateLoss();
            this.d = null;
        }
        this.g = uniteAppDetail.getAppID();
        ((CardDetailViewModel) this.a).downloadCard(uniteAppDetail.getMPanId());
    }

    private void x(String str) {
        TsmServiceDownloader tsmServiceDownloader = this.e;
        if (tsmServiceDownloader != null) {
            tsmServiceDownloader.cancel();
        }
        ProgressDialogFragment progressDialogFragment = this.d;
        if (progressDialogFragment != null) {
            progressDialogFragment.dismissAllowingStateLoss();
        }
        ProgressDialogFragment progressDialogFragment2 = new ProgressDialogFragment();
        this.d = progressDialogFragment2;
        progressDialogFragment2.setCancelable(false);
        this.d.setTitle(getString(R.string.wl_tsm_downloading));
        this.d.setMessage(getString(R.string.wl_tsm_dont_close_app));
        this.d.show(getChildFragmentManager(), "Tsm Download Progress");
        TsmServiceDownloader tsmServiceDownloader2 = new TsmServiceDownloader(getActivity());
        this.e = tsmServiceDownloader2;
        tsmServiceDownloader2.download(str, new TsmServiceDownloader.DownloadProgressListener() { // from class: r28
            @Override // com.unionpay.tsm.TsmServiceDownloader.DownloadProgressListener
            public final void onProgress(int i) {
                this.a.y(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(int i) {
        ProgressDialogFragment progressDialogFragment = this.d;
        if (progressDialogFragment == null) {
            return;
        }
        if (i == 100) {
            progressDialogFragment.dismissAllowingStateLoss();
        }
        this.d.setProgress(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        Q();
        BankEventUtil.recordBankEvent("Add", this.f);
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public int getContentLayout() {
        return R.layout.wl_fragment_union_card_detail;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public Class<CardDetailViewModel> getViewModelClass() {
        return CardDetailViewModel.class;
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void initView(View view) {
        this.f = ((CardDetailViewModel) this.a).getDeviceModel();
        a aVar = new a(view);
        this.c = aVar;
        aVar.k.setOnClickListener(new View.OnClickListener() { // from class: c38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.z(view2);
            }
        });
        this.c.l.setOnClickListener(new View.OnClickListener() { // from class: l28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.A(view2);
            }
        });
        this.c.g.setOnClickListener(new View.OnClickListener() { // from class: y28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.B(view2);
            }
        });
        this.c.h.setOnClickListener(new View.OnClickListener() { // from class: b38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.C(view2);
            }
        });
        this.c.j.setOnClickListener(new View.OnClickListener() { // from class: a38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.D(view2);
            }
        });
        this.c.f.setOnClickListener(new View.OnClickListener() { // from class: z28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.E(view2);
            }
        });
        this.b.showLoadingDialog(getString(R.string.wl_bank_loading));
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public void observeViewModel() {
        ((CardDetailViewModel) this.a).updateInfoData.observe(this, new Observer() { // from class: o28
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.F((UnionPayResource) obj);
            }
        });
        ((CardDetailViewModel) this.a).appListData.observe(this, new Observer() { // from class: n28
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.G((UnionPayResource) obj);
            }
        });
        ((CardDetailViewModel) this.a).currentCardData.observe(this, new Observer() { // from class: q28
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.U((UniteAppDetail) obj);
            }
        });
        ((CardDetailViewModel) this.a).deleteCardData.observe(this, new Observer() { // from class: p28
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.H((UnionPayResource) obj);
            }
        });
        ((CardDetailViewModel) this.a).downloadProgressData.observe(this, new Observer() { // from class: m28
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.I((UnionPayResource) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17 && i2 == -1) {
            startActivity(new Intent(getActivity(), (Class<?>) AddUnionPayCardActivity.class));
        }
        if (i == 18 && i2 == -1) {
            ((CardDetailViewModel) this.a).loadCardList();
            w(((CardDetailViewModel) this.a).currentCardData.getValue());
        }
    }

    public void refreshData() {
        ((CardDetailViewModel) this.a).loadCardList();
    }

    public void setCardId(String str) {
        ((CardDetailViewModel) this.a).setCardId(str);
    }

    @Override // com.unionpay.ui.fragment.BaseUnionPayFragment
    public String tag() {
        return "UnionPay-UnionPayCardDetailFragment";
    }
}
