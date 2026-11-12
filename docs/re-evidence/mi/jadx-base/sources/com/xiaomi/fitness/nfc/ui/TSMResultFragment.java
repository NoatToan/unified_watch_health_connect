package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.TSMResultFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.hqg;
import defpackage.mri;
import defpackage.njh;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.vqg;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TSMResultFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/TsmResultViewModel;", "Lhqg;", "", "doFinish", "()V", "onRechargeSuccess", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "setListener", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "mIntentFrom", "Ljava/lang/String;", "<init>", "Companion", "RechargeInfoAdapter", "ViewHolder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TSMResultFragment extends BaseCardFragment<TsmResultViewModel, hqg> {

    @Nullable
    private String mIntentFrom;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String FROM_RECHARGE = "recharge";

    @NotNull
    private static String FROM_OPEN_CARD = "open_card";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TSMResultFragment$Companion;", "", "<init>", "()V", "FROM_RECHARGE", "", "getFROM_RECHARGE", "()Ljava/lang/String;", "setFROM_RECHARGE", "(Ljava/lang/String;)V", "FROM_OPEN_CARD", "getFROM_OPEN_CARD", "setFROM_OPEN_CARD", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getFROM_OPEN_CARD() {
            return TSMResultFragment.FROM_OPEN_CARD;
        }

        @NotNull
        public final String getFROM_RECHARGE() {
            return TSMResultFragment.FROM_RECHARGE;
        }

        public final void setFROM_OPEN_CARD(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            TSMResultFragment.FROM_OPEN_CARD = str;
        }

        public final void setFROM_RECHARGE(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            TSMResultFragment.FROM_RECHARGE = str;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TSMResultFragment$RechargeInfoAdapter;", "Landroid/widget/BaseAdapter;", "", "getCount", "()I", "position", "Lnjh;", "", "getItem", "(I)Lnjh;", "", "getItemId", "(I)J", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "", "listData", "", "updateData", "(Ljava/util/List;)V", "pairList", "Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "mContext", "Ljava/lang/ref/WeakReference;", "context", "<init>", "(Landroid/content/Context;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RechargeInfoAdapter extends BaseAdapter {

        @NotNull
        private final WeakReference<Context> mContext;

        @NotNull
        private List<? extends njh<String, String>> pairList;

        public RechargeInfoAdapter(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.pairList = new ArrayList();
            this.mContext = new WeakReference<>(context);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.pairList.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @NotNull View view, @NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.nfc.ui.TSMResultFragment.ViewHolder");
            ViewHolder viewHolder = (ViewHolder) tag;
            TextView mItemNameText = viewHolder.getMItemNameText();
            Intrinsics.checkNotNull(mItemNameText);
            mItemNameText.setText(this.pairList.get(position).f27979a);
            TextView mItemValueText = viewHolder.getMItemValueText();
            Intrinsics.checkNotNull(mItemValueText);
            mItemValueText.setText(this.pairList.get(position).f27980b);
            return view;
        }

        public final void updateData(@NotNull List<? extends njh<String, String>> listData) {
            Intrinsics.checkNotNullParameter(listData, "listData");
            this.pairList = listData;
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        @NotNull
        public njh<String, String> getItem(int position) {
            return this.pairList.get(position);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TSMResultFragment$ViewHolder;", "", "<init>", "()V", "mItemNameText", "Landroid/widget/TextView;", "getMItemNameText", "()Landroid/widget/TextView;", "setMItemNameText", "(Landroid/widget/TextView;)V", "mItemValueText", "getMItemValueText", "setMItemValueText", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder {

        @Nullable
        private TextView mItemNameText;

        @Nullable
        private TextView mItemValueText;

        @Nullable
        public final TextView getMItemNameText() {
            return this.mItemNameText;
        }

        @Nullable
        public final TextView getMItemValueText() {
            return this.mItemValueText;
        }

        public final void setMItemNameText(@Nullable TextView textView) {
            this.mItemNameText = textView;
        }

        public final void setMItemValueText(@Nullable TextView textView) {
            this.mItemValueText = textView;
        }
    }

    public TSMResultFragment() {
        super(sui.j0, 0, true);
    }

    private final void doFinish() {
        Intent intent = new Intent();
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            mActivity2.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onRechargeSuccess() {
        Bundle arguments = getArguments();
        ((hqg) getMBinding()).D.setVisibility(8);
        ((hqg) getMBinding()).A.setVisibility(0);
        ((hqg) getMBinding()).C.setVisibility(0);
        ListView listView = (ListView) ((hqg) getMBinding()).C.findViewById(mri.y2);
        listView.setVisibility(8);
        Intrinsics.checkNotNull(arguments);
        int i = arguments.getInt("recharge_amount");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new njh(getString(o0j.Q1), getString(o0j.O1, Float.valueOf(i / 100.0f))));
        if (getCardWrapper() != null) {
            String string = getString(o0j.Z5);
            int i2 = o0j.O1;
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            arrayList.add(new njh(string, getString(i2, Float.valueOf((cardWrapper.mCardBalance + i) / 100.0f))));
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            if (!TextUtils.isEmpty(cardWrapper2.getEndDate())) {
                CardWrapper cardWrapper3 = getCardWrapper();
                Intrinsics.checkNotNull(cardWrapper3);
                vqg.d("onRechargeSuccess card validity:" + cardWrapper3.getEndDate());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
                try {
                    CardWrapper cardWrapper4 = getCardWrapper();
                    Intrinsics.checkNotNull(cardWrapper4);
                    arrayList.add(new njh(getString(o0j.b6), (Intrinsics.areEqual(Locale.CHINA, Locale.getDefault()) ? new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault()) : DateFormat.getDateInstance()).format(simpleDateFormat.parse(cardWrapper4.getEndDate()))));
                } catch (ParseException e) {
                    vqg.c("onRechargeSuccess parse card validity failed.", e);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        RechargeInfoAdapter rechargeInfoAdapter = new RechargeInfoAdapter(mActivity);
        rechargeInfoAdapter.updateData(arrayList);
        listView.setAdapter((ListAdapter) rechargeInfoAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(TSMResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doFinish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        doFinish();
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((hqg) getMBinding()).B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        UtilsKt.resetL18BtnView(((hqg) getMBinding()).A);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        onRechargeSuccess();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            String string = args.getString(Constants.KEY_INTENT_FROM);
            this.mIntentFrom = string;
            if (TextUtils.isEmpty(string)) {
                return;
            }
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((hqg) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ryo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TSMResultFragment.setListener$lambda$0(this.f33072a, view);
            }
        });
    }
}
