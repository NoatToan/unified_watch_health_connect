package com.xiaomi.fitness.sport.view.route.address;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.amap.api.services.core.PoiItem;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.sport.view.adapter.AddressAdapter;
import com.xiaomi.fitness.sport.view.route.address.AddressSearchActivity;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.nuf;
import defpackage.xg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0007¢\u0006\u0004\b%\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/address/AddressSearchActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/route/address/AddressSearchViewModel;", "Lxg0;", "Landroid/view/View$OnClickListener;", "onClickListener", "", "setOnItemClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "()V", "initData", LifecycleConstantKt.ON_DESTROY, "", "city", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/sport/view/adapter/AddressAdapter;", "adapter", "Lcom/xiaomi/fitness/sport/view/adapter/AddressAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/sport/view/adapter/AddressAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/sport/view/adapter/AddressAdapter;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddressSearchActivity extends BaseBindingActivity<AddressSearchViewModel, xg0> {

    @NotNull
    public static final String EXTRA_RESULT_LAT = "result_lat";

    @NotNull
    public static final String EXTRA_RESULT_LON = "result_lon";

    @NotNull
    public static final String EXTRA_SEARCH_CITY = "search_city";

    @NotNull
    private AddressAdapter adapter = new AddressAdapter();
    public String city;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AddressSearchViewModel access$getMViewModel(AddressSearchActivity addressSearchActivity) {
        return (AddressSearchViewModel) addressSearchActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$4(AddressSearchActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (list != null) {
            this$0.adapter.setData(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(AddressSearchActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initView$lambda$1(AddressSearchActivity this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 3) {
            return false;
        }
        if (keyEvent != null && keyEvent.getAction() == 0) {
            return false;
        }
        NetUtil netUtil = NetUtil.INSTANCE;
        Context applicationContext = this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (!netUtil.getNetWorkAvailable(applicationContext)) {
            ToastUtil.INSTANCE.showToast(c1j.common_hint_network_unavailable);
            return true;
        }
        String strValueOf = String.valueOf(this$0.getMBinding().C.getText());
        if (strValueOf.length() == 0) {
            this$0.adapter.setData(CollectionsKt__CollectionsKt.emptyList());
            return false;
        }
        String string = this$0.getString(c1j.f4831k);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
        ((AddressSearchViewModel) this$0.getMViewModel()).searchAddressList(this$0, strValueOf, this$0.getCity());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2(AddressSearchActivity this$0, PoiItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent();
        intent.putExtra(EXTRA_RESULT_LAT, it.getLatLonPoint().getLatitude());
        intent.putExtra(EXTRA_RESULT_LON, it.getLatLonPoint().getLongitude());
        this$0.setResult(-1, intent);
        this$0.finish();
        return Unit.INSTANCE;
    }

    @NotNull
    public final AddressAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final String getCity() {
        String str = this.city;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("city");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.f15969a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initData() {
        setCity(String.valueOf(getIntent().getStringExtra(EXTRA_SEARCH_CITY)));
        ((AddressSearchViewModel) getMViewModel()).getAddressesLiveData().observe(this, new AddressSearchActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mu0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddressSearchActivity.initData$lambda$4(this.f27210a, (List) obj);
            }
        }));
    }

    public final void initView() {
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: nu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressSearchActivity.initView$lambda$0(this.f28367a, view);
            }
        });
        nuf.f(getMBinding().B);
        getMBinding().C.setImeOptions(3);
        getMBinding().C.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ou0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return AddressSearchActivity.initView$lambda$1(this.f29677a, textView, i, keyEvent);
            }
        });
        getMBinding().C.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.sport.view.route.address.AddressSearchActivity.initView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                NetUtil netUtil = NetUtil.INSTANCE;
                Context applicationContext = AddressSearchActivity.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                if (netUtil.getNetWorkAvailable(applicationContext)) {
                    String strValueOf = String.valueOf(s);
                    if (strValueOf.length() == 0) {
                        AddressSearchActivity.this.getAdapter().setData(CollectionsKt__CollectionsKt.emptyList());
                        return;
                    }
                    AddressSearchActivity addressSearchActivity = AddressSearchActivity.this;
                    String string = addressSearchActivity.getString(c1j.f4831k);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    PageState.DefaultImpls.showLoading$default(addressSearchActivity, string, 0, false, 6, null);
                    AddressSearchViewModel addressSearchViewModelAccess$getMViewModel = AddressSearchActivity.access$getMViewModel(AddressSearchActivity.this);
                    AddressSearchActivity addressSearchActivity2 = AddressSearchActivity.this;
                    addressSearchViewModelAccess$getMViewModel.searchAddressList(addressSearchActivity2, strValueOf, addressSearchActivity2.getCity());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        this.adapter.setOnItemClickListener(new Function1() { // from class: pu0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddressSearchActivity.initView$lambda$2(this.f30768a, (PoiItem) obj);
            }
        });
        getMBinding().A.setAdapter(this.adapter);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        initData();
        initView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public final void setAdapter(@NotNull AddressAdapter addressAdapter) {
        Intrinsics.checkNotNullParameter(addressAdapter, "<set-?>");
        this.adapter = addressAdapter;
    }

    public final void setCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final void setOnItemClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
    }
}
