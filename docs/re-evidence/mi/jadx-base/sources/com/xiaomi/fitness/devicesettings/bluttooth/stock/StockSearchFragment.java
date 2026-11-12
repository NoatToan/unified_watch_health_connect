package com.xiaomi.fitness.devicesettings.bluttooth.stock;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel;
import com.xiaomi.fitness.sync.export.FirmwareVersionLowException;
import com.xiaomi.fitness.sync.export.model.StockModel;
import defpackage.af6;
import defpackage.b1e;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.zgo;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003456B\u0007¢\u0006\u0004\b3\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010)\u001a\b\u0018\u00010(R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel;", "Laf6;", "", "showEmpty", "()V", "hideEmpty", "", "adapterPosition", "Lzgo$a;", "getSortedList", "(I)Lzgo$a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "", "symbol", "", "isAdded", "(Ljava/lang/String;)Z", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "mStockSuggestResult", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "getMStockSuggestResult", "()Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "setMStockSuggestResult", "(Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;)V", "", "Lzgo;", "mStockSymbolList", "Ljava/util/List;", "getMStockSymbolList", "()Ljava/util/List;", "setMStockSymbolList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment$StockSearchAdapter;", "mStockSearchAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment$StockSearchAdapter;", "mLastFailText", "Ljava/lang/String;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "StockSearchAdapter", "StockSearchViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStockSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockSearchFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,278:1\n37#2:279\n36#2,3:280\n*S KotlinDebug\n*F\n+ 1 StockSearchFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment\n*L\n213#1:279\n213#1:280,3\n*E\n"})
public final class StockSearchFragment extends BaseLoadableBindingFragment<StockSearchViewModel, af6> {
    public static final int MESSAGE_QUERY = 1;

    @NotNull
    public static final String TAG = "StockSearchFragment";

    @NotNull
    private final Handler mHandler;

    @Nullable
    private String mLastFailText;

    @Nullable
    private StockSearchAdapter mStockSearchAdapter;

    @Nullable
    private StockModel.StockSuggestResult mStockSuggestResult;

    @NotNull
    private List<zgo> mStockSymbolList = new ArrayList();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment$StockSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment$StockSearchViewHolder;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "myViewHolder", "getItemCount", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class StockSearchAdapter extends RecyclerView.Adapter<StockSearchViewHolder> {
        public StockSearchAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            if (StockSearchFragment.this.getMStockSuggestResult() != null) {
                StockModel.StockSuggestResult mStockSuggestResult = StockSearchFragment.this.getMStockSuggestResult();
                Intrinsics.checkNotNull(mStockSuggestResult);
                if (mStockSuggestResult.items != null) {
                    StockModel.StockSuggestResult mStockSuggestResult2 = StockSearchFragment.this.getMStockSuggestResult();
                    Intrinsics.checkNotNull(mStockSuggestResult2);
                    return mStockSuggestResult2.items.size();
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull StockSearchViewHolder myViewHolder, int i) {
            Intrinsics.checkNotNullParameter(myViewHolder, "myViewHolder");
            TextView nameTV = myViewHolder.getNameTV();
            StockModel.StockSuggestResult mStockSuggestResult = StockSearchFragment.this.getMStockSuggestResult();
            Intrinsics.checkNotNull(mStockSuggestResult);
            nameTV.setText(mStockSuggestResult.items.get(i).nameCN);
            TextView marketTV = myViewHolder.getMarketTV();
            StockModel.StockSuggestResult mStockSuggestResult2 = StockSearchFragment.this.getMStockSuggestResult();
            Intrinsics.checkNotNull(mStockSuggestResult2);
            marketTV.setText(mStockSuggestResult2.items.get(i).market);
            TextView symbolTV = myViewHolder.getSymbolTV();
            StockModel.StockSuggestResult mStockSuggestResult3 = StockSearchFragment.this.getMStockSuggestResult();
            Intrinsics.checkNotNull(mStockSuggestResult3);
            symbolTV.setText(mStockSuggestResult3.items.get(i).symbol);
            StockSearchFragment stockSearchFragment = StockSearchFragment.this;
            StockModel.StockSuggestResult mStockSuggestResult4 = stockSearchFragment.getMStockSuggestResult();
            Intrinsics.checkNotNull(mStockSuggestResult4);
            String symbol = mStockSuggestResult4.items.get(i).symbol;
            Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
            if (stockSearchFragment.isAdded(symbol)) {
                myViewHolder.getBtn().setImageResource(jni.b1);
                myViewHolder.getBtn().setEnabled(false);
            } else {
                myViewHolder.getBtn().setImageResource(jni.a1);
                myViewHolder.getBtn().setEnabled(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public StockSearchViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            StockSearchFragment stockSearchFragment = StockSearchFragment.this;
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(eui.c3, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new StockSearchViewHolder(stockSearchFragment, viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment$StockSearchViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "nameTV", "Landroid/widget/TextView;", "getNameTV", "()Landroid/widget/TextView;", "setNameTV", "(Landroid/widget/TextView;)V", "marketTV", "getMarketTV", "setMarketTV", "symbolTV", "getSymbolTV", "setSymbolTV", "Landroid/widget/ImageView;", "btn", "Landroid/widget/ImageView;", "getBtn", "()Landroid/widget/ImageView;", "setBtn", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchFragment;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class StockSearchViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView btn;

        @NotNull
        private TextView marketTV;

        @NotNull
        private TextView nameTV;

        @NotNull
        private TextView symbolTV;
        final /* synthetic */ StockSearchFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StockSearchViewHolder(@NotNull final StockSearchFragment stockSearchFragment, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = stockSearchFragment;
            View viewFindViewById = itemView.findViewById(zqi.B5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.nameTV = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.S4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.marketTV = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(zqi.e9);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.symbolTV = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(zqi.W);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById4;
            this.btn = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: kho
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StockSearchFragment.StockSearchViewHolder._init_$lambda$0(stockSearchFragment, this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(StockSearchFragment this$0, StockSearchViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            b1e.b(StockSearchFragment.access$getMBinding(this$0).E);
            if (this$0.getMStockSymbolList().size() >= 20) {
                FragmentActivity mActivity = this$0.getMActivity();
                Intrinsics.checkNotNull(mActivity);
                String string = this$0.getString(wzi.d8);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(mActivity, string);
                return;
            }
            StockModel.StockSuggestResult mStockSuggestResult = this$0.getMStockSuggestResult();
            Intrinsics.checkNotNull(mStockSuggestResult);
            String symbol = mStockSuggestResult.items.get(this$1.getAdapterPosition()).symbol;
            Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
            if (this$0.isAdded(symbol)) {
                return;
            }
            this$1.btn.setImageResource(jni.b1);
            this$1.btn.setEnabled(false);
            StockSearchViewModel stockSearchViewModelAccess$getMViewModel = StockSearchFragment.access$getMViewModel(this$0);
            int adapterPosition = this$1.getAdapterPosition();
            StockModel.StockSuggestResult mStockSuggestResult2 = this$0.getMStockSuggestResult();
            Intrinsics.checkNotNull(mStockSuggestResult2);
            StockModel.StockSuggestResult.Item item = mStockSuggestResult2.items.get(this$1.getAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(item, "get(...)");
            stockSearchViewModelAccess$getMViewModel.add(adapterPosition, item, this$0.getSortedList(this$1.getAdapterPosition()));
        }

        @NotNull
        public final ImageView getBtn() {
            return this.btn;
        }

        @NotNull
        public final TextView getMarketTV() {
            return this.marketTV;
        }

        @NotNull
        public final TextView getNameTV() {
            return this.nameTV;
        }

        @NotNull
        public final TextView getSymbolTV() {
            return this.symbolTV;
        }

        public final void setBtn(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.btn = imageView;
        }

        public final void setMarketTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.marketTV = textView;
        }

        public final void setNameTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.nameTV = textView;
        }

        public final void setSymbolTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.symbolTV = textView;
        }
    }

    public StockSearchFragment() {
        final Looper mainLooper = Looper.getMainLooper();
        this.mHandler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchFragment$mHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 1) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    if (TextUtils.isEmpty(str) || !Intrinsics.areEqual(str, String.valueOf(StockSearchFragment.access$getMBinding(this.this$0).E.getText()))) {
                        return;
                    }
                    Logger.i(StockSearchFragment.TAG, "requestStockSuggest = " + str);
                    StockSearchFragment.access$getMViewModel(this.this$0).requestStockSuggest(str);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ af6 access$getMBinding(StockSearchFragment stockSearchFragment) {
        return (af6) stockSearchFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ StockSearchViewModel access$getMViewModel(StockSearchFragment stockSearchFragment) {
        return (StockSearchViewModel) stockSearchFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zgo.a getSortedList(int adapterPosition) {
        int i = 2;
        boolean z = this.mStockSymbolList.size() >= 2 && this.mStockSymbolList.get(0).d && this.mStockSymbolList.get(1).d;
        ArrayList arrayList = new ArrayList();
        if (z) {
            zgo zgoVar = new zgo();
            zgoVar.c = this.mStockSymbolList.get(0).c;
            zgoVar.d = true;
            zgoVar.e = 0;
            arrayList.add(zgoVar);
            zgo zgoVar2 = new zgo();
            zgoVar2.c = this.mStockSymbolList.get(1).c;
            zgoVar2.d = true;
            zgoVar2.e = 1;
            arrayList.add(zgoVar2);
            zgo zgoVar3 = new zgo();
            StockModel.StockSuggestResult stockSuggestResult = this.mStockSuggestResult;
            Intrinsics.checkNotNull(stockSuggestResult);
            zgoVar3.c = stockSuggestResult.items.get(adapterPosition).symbol;
            zgoVar3.d = false;
            zgoVar3.e = 2;
            arrayList.add(zgoVar3);
            int size = this.mStockSymbolList.size();
            while (i < size) {
                zgo zgoVar4 = new zgo();
                zgoVar4.c = this.mStockSymbolList.get(i).c;
                zgoVar4.d = false;
                i++;
                zgoVar4.e = i;
                arrayList.add(zgoVar4);
            }
        } else {
            zgo zgoVar5 = new zgo();
            StockModel.StockSuggestResult stockSuggestResult2 = this.mStockSuggestResult;
            Intrinsics.checkNotNull(stockSuggestResult2);
            zgoVar5.c = stockSuggestResult2.items.get(adapterPosition).symbol;
            zgoVar5.d = true;
            zgoVar5.e = 0;
            arrayList.add(zgoVar5);
            int size2 = this.mStockSymbolList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size2) {
                zgo zgoVar6 = new zgo();
                zgoVar6.c = this.mStockSymbolList.get(i2).c;
                if (i3 <= 0) {
                    zgoVar6.d = this.mStockSymbolList.get(i2).d;
                } else {
                    zgoVar6.d = false;
                }
                i2++;
                zgoVar6.e = i2;
                i3++;
                arrayList.add(zgoVar6);
            }
        }
        zgo.a aVar = new zgo.a();
        aVar.c = (zgo[]) arrayList.toArray(new zgo[0]);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideEmpty() {
        ((af6) getMBinding()).A.setVisibility(8);
        ((af6) getMBinding()).D.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$0(StockSearchFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b1e.b(((af6) this$0.getMBinding()).E);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(StockSearchFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mLastFailText = null;
        if (!Intrinsics.areEqual(str, "")) {
            this$0.mHandler.removeMessages(1);
            Handler handler = this$0.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(1, str), 100L);
        } else {
            this$0.mHandler.removeMessages(1);
            this$0.mStockSuggestResult = null;
            StockSearchAdapter stockSearchAdapter = this$0.mStockSearchAdapter;
            Intrinsics.checkNotNull(stockSearchAdapter);
            stockSearchAdapter.notifyDataSetChanged();
            this$0.showEmpty();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$2(StockSearchFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 3) {
            return false;
        }
        b1e.b(((af6) this$0.getMBinding()).E);
        String str = this$0.mLastFailText;
        if (str != null && Intrinsics.areEqual(str, String.valueOf(((af6) this$0.getMBinding()).E.getText()))) {
            this$0.mHandler.removeMessages(1);
            Handler handler = this$0.mHandler;
            handler.sendMessage(handler.obtainMessage(1, this$0.mLastFailText));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(StockSearchFragment this$0, StockSearchViewModel.StockSymbolResult stockSymbolResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mStockSymbolList = new ArrayList();
        if (stockSymbolResult.getThrowable() == null) {
            List<zgo> stockSymbolList = stockSymbolResult.getStockSymbolList();
            if (stockSymbolList != null && !stockSymbolList.isEmpty()) {
                List<zgo> stockSymbolList2 = stockSymbolResult.getStockSymbolList();
                Intrinsics.checkNotNull(stockSymbolList2);
                this$0.mStockSymbolList = stockSymbolList2;
            }
        } else if (stockSymbolResult.getThrowable() instanceof FirmwareVersionLowException) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.Ra);
            }
        } else {
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 != null) {
                ToastExtKt.toastShort(mActivity2, wzi.cf);
            }
        }
        List<zgo> list = this$0.mStockSymbolList;
        final Function2 function2 = new Function2() { // from class: aho
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(StockSearchFragment.onViewCreated$lambda$5$lambda$3((zgo) obj, (zgo) obj2));
            }
        };
        Collections.sort(list, new Comparator() { // from class: bho
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return StockSearchFragment.onViewCreated$lambda$5$lambda$4(function2, obj, obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$5$lambda$3(zgo zgoVar, zgo zgoVar2) {
        return zgoVar.e - zgoVar2.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$5$lambda$4(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(StockSearchFragment this$0, StockSearchViewModel.AddSymbolResult addSymbolResult) {
        List<zgo> arrayList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (addSymbolResult.isSuc()) {
            List<zgo> stockSymbolList = addSymbolResult.getStockSymbolList();
            if (stockSymbolList == null || stockSymbolList.isEmpty()) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = addSymbolResult.getStockSymbolList();
                Intrinsics.checkNotNull(arrayList);
            }
            this$0.mStockSymbolList = arrayList;
            final Function2 function2 = new Function2() { // from class: cho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(StockSearchFragment.onViewCreated$lambda$8$lambda$6((zgo) obj, (zgo) obj2));
                }
            };
            Collections.sort(arrayList, new Comparator() { // from class: dho
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StockSearchFragment.onViewCreated$lambda$8$lambda$7(function2, obj, obj2);
                }
            });
            StockSearchAdapter stockSearchAdapter = this$0.mStockSearchAdapter;
            Intrinsics.checkNotNull(stockSearchAdapter);
            stockSearchAdapter.notifyItemChanged(addSymbolResult.getAdapterPosition());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$8$lambda$6(zgo zgoVar, zgo zgoVar2) {
        return zgoVar.e - zgoVar2.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$8$lambda$7(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$9(StockSearchFragment this$0, StockSearchViewModel.RequestStockSuggestResult requestStockSuggestResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (requestStockSuggestResult.isSuc()) {
            if (requestStockSuggestResult.getStockInfo() == null) {
                this$0.showEmpty();
            } else if (Intrinsics.areEqual(requestStockSuggestResult.getText(), String.valueOf(((af6) this$0.getMBinding()).E.getText()))) {
                this$0.mStockSuggestResult = requestStockSuggestResult.getStockInfo();
                StockSearchAdapter stockSearchAdapter = this$0.mStockSearchAdapter;
                Intrinsics.checkNotNull(stockSearchAdapter);
                stockSearchAdapter.notifyDataSetChanged();
                StockModel.StockSuggestResult stockSuggestResult = this$0.mStockSuggestResult;
                if (stockSuggestResult != null) {
                    Intrinsics.checkNotNull(stockSuggestResult);
                    if (stockSuggestResult.items != null) {
                        StockModel.StockSuggestResult stockSuggestResult2 = this$0.mStockSuggestResult;
                        Intrinsics.checkNotNull(stockSuggestResult2);
                        List<StockModel.StockSuggestResult.Item> list = stockSuggestResult2.items;
                        Intrinsics.checkNotNull(list);
                        if (list.size() <= 0) {
                            this$0.showEmpty();
                        } else {
                            this$0.hideEmpty();
                        }
                    } else {
                        this$0.showEmpty();
                    }
                } else {
                    this$0.showEmpty();
                }
            }
        } else if (Intrinsics.areEqual(requestStockSuggestResult.getText(), String.valueOf(((af6) this$0.getMBinding()).E.getText()))) {
            this$0.mLastFailText = requestStockSuggestResult.getText();
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                String string = this$0.getString(wzi.i2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(mActivity, string);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showEmpty() {
        ((af6) getMBinding()).A.setVisibility(0);
        ((af6) getMBinding()).D.setVisibility(8);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.H;
    }

    @Nullable
    public final StockModel.StockSuggestResult getMStockSuggestResult() {
        return this.mStockSuggestResult;
    }

    @NotNull
    public final List<zgo> getMStockSymbolList() {
        return this.mStockSymbolList;
    }

    public final boolean isAdded(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (!this.mStockSymbolList.isEmpty()) {
            int size = this.mStockSymbolList.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(this.mStockSymbolList.get(i).c, symbol)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        ((StockSearchViewModel) getMViewModel()).loadStockList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(wzi.c8));
        ((af6) getMBinding()).D.setLayoutManager(new LinearLayoutManager(getMActivity()));
        this.mStockSearchAdapter = new StockSearchAdapter();
        ((af6) getMBinding()).D.setAdapter(this.mStockSearchAdapter);
        ((af6) getMBinding()).D.setOnTouchListener(new View.OnTouchListener() { // from class: eho
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return StockSearchFragment.onViewCreated$lambda$0(this.f16655a, view2, motionEvent);
            }
        });
        ((af6) getMBinding()).E.setTextChangedLister(new ClearEditText.a() { // from class: fho
            @Override // com.xiaomi.fitness.baseui.dialog.ClearEditText.a
            public final void a(String str) {
                StockSearchFragment.onViewCreated$lambda$1(this.f17794a, str);
            }
        });
        ((af6) getMBinding()).E.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gho
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return StockSearchFragment.onViewCreated$lambda$2(this.f19010a, textView, i, keyEvent);
            }
        });
        ((StockSearchViewModel) getMViewModel()).getStockSymbolList().observe(getViewLifecycleOwner(), new StockSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchFragment.onViewCreated$lambda$5(this.f20078a, (StockSearchViewModel.StockSymbolResult) obj);
            }
        }));
        ((StockSearchViewModel) getMViewModel()).getAddSymbolList().observe(getViewLifecycleOwner(), new StockSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchFragment.onViewCreated$lambda$8(this.f21155a, (StockSearchViewModel.AddSymbolResult) obj);
            }
        }));
        ((StockSearchViewModel) getMViewModel()).getRequestStockSuggest().observe(getViewLifecycleOwner(), new StockSearchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchFragment.onViewCreated$lambda$9(this.f22815a, (StockSearchViewModel.RequestStockSuggestResult) obj);
            }
        }));
    }

    public final void setMStockSuggestResult(@Nullable StockModel.StockSuggestResult stockSuggestResult) {
        this.mStockSuggestResult = stockSuggestResult;
    }

    public final void setMStockSymbolList(@NotNull List<zgo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mStockSymbolList = list;
    }
}
