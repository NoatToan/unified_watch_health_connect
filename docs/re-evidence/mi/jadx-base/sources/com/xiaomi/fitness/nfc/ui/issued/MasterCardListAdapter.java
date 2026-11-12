package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListAdapter;
import com.xiaomi.fitness.nfc.utils.CardFaceHelper;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.mri;
import defpackage.pli;
import defpackage.sui;
import defpackage.wni;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter$MasterCardListViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "onClickListener", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "MasterCardListViewHolder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MasterCardListAdapter extends RecyclerView.Adapter<MasterCardListViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<CardWrapper> dataList;

    @NotNull
    private Function1<? super CardWrapper, Unit> onClickListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter$MasterCardListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "", "bindData", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "faceIv", "Landroid/widget/ImageView;", "getFaceIv", "()Landroid/widget/ImageView;", "setFaceIv", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "statusTV", "Landroid/widget/TextView;", "getStatusTV", "()Landroid/widget/TextView;", "setStatusTV", "(Landroid/widget/TextView;)V", "bankNameTV", "getBankNameTV", "setBankNameTV", "holdNameTV", "getHoldNameTV", "setHoldNameTV", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMasterCardListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MasterCardListAdapter.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter$MasterCardListViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,88:1\n54#2,3:89\n24#2:92\n59#2,6:93\n54#2,3:99\n24#2:102\n59#2,6:103\n*S KotlinDebug\n*F\n+ 1 MasterCardListAdapter.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter$MasterCardListViewHolder\n*L\n68#1:89,3\n68#1:92\n68#1:93,6\n72#1:99,3\n72#1:102\n72#1:103,6\n*E\n"})
    public static final class MasterCardListViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView bankNameTV;

        @NotNull
        private ImageView faceIv;

        @NotNull
        private TextView holdNameTV;

        @NotNull
        private TextView statusTV;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MasterCardListViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            View viewFindViewById = view.findViewById(mri.I2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.faceIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.view.findViewById(mri.f0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.statusTV = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.view.findViewById(mri.b0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.bankNameTV = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.view.findViewById(mri.c0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.holdNameTV = (TextView) viewFindViewById4;
        }

        public final void bindData(@NotNull CardWrapper cardWrapper) {
            Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
            int screenWidth = DisplayUtil.getScreenWidth() - (((int) ApplicationExtKt.getApplication().getResources().getDimension(pli.e)) * 2);
            if (cardWrapper.bankCard.getCardType() == 2) {
                String foregroundColor = cardWrapper.bankCard.getCardMetaData().getForegroundColor();
                if (foregroundColor != null && foregroundColor.length() != 0) {
                    String foregroundColor2 = cardWrapper.bankCard.getCardMetaData().getForegroundColor();
                    Intrinsics.checkNotNullExpressionValue(foregroundColor2, "getForegroundColor(...)");
                    if (StringsKt__StringsKt.contains$default((CharSequence) foregroundColor2, (CharSequence) "0x", false, 2, (Object) null)) {
                        String foregroundColor3 = cardWrapper.bankCard.getCardMetaData().getForegroundColor();
                        Intrinsics.checkNotNullExpressionValue(foregroundColor3, "getForegroundColor(...)");
                        String strReplace$default = StringsKt__StringsJVMKt.replace$default(foregroundColor3, "0x", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, false, 4, (Object) null);
                        this.bankNameTV.setTextColor(Color.parseColor(strReplace$default));
                        this.holdNameTV.setTextColor(Color.parseColor(strReplace$default));
                    }
                }
                CardFaceHelper.INSTANCE.loadVISACardFace(cardWrapper, this.faceIv);
                Unit unit = Unit.INSTANCE;
            } else {
                String cardFace = cardWrapper.getCardFace();
                if (cardFace == null || cardFace.length() == 0) {
                    ImageView imageView = this.faceIv;
                    Integer numValueOf = Integer.valueOf(wni.f);
                    ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
                    ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(numValueOf).target(imageView);
                    builderTarget.size(screenWidth, (screenWidth * 63) / 100);
                    imageLoader.enqueue(builderTarget.build());
                } else {
                    ImageView imageView2 = this.faceIv;
                    String cardFace2 = cardWrapper.getCardFace();
                    ImageLoader imageLoader2 = Coil.imageLoader(imageView2.getContext());
                    ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(imageView2.getContext()).data(cardFace2).target(imageView2);
                    builderTarget2.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
                    builderTarget2.error(wni.f).size(screenWidth, (screenWidth * 63) / 100);
                    imageLoader2.enqueue(builderTarget2.build());
                }
            }
            this.bankNameTV.setText(cardWrapper.getBankName());
            this.statusTV.setText(cardWrapper.getStatus());
            this.holdNameTV.setText(cardWrapper.mCardName);
        }

        @NotNull
        public final TextView getBankNameTV() {
            return this.bankNameTV;
        }

        @NotNull
        public final ImageView getFaceIv() {
            return this.faceIv;
        }

        @NotNull
        public final TextView getHoldNameTV() {
            return this.holdNameTV;
        }

        @NotNull
        public final TextView getStatusTV() {
            return this.statusTV;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setBankNameTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.bankNameTV = textView;
        }

        public final void setFaceIv(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.faceIv = imageView;
        }

        public final void setHoldNameTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.holdNameTV = textView;
        }

        public final void setStatusTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.statusTV = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public MasterCardListAdapter(@NotNull Context context, @NotNull List<CardWrapper> dataList, @NotNull Function1<? super CardWrapper, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.context = context;
        this.dataList = dataList;
        this.onClickListener = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(MasterCardListAdapter this$0, CardWrapper transaction, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(transaction, "$transaction");
        this$0.onClickListener.invoke2(transaction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MasterCardListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final CardWrapper cardWrapper = this.dataList.get(position);
        holder.bindData(cardWrapper);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: n6f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MasterCardListAdapter.onBindViewHolder$lambda$0(this.f27594a, cardWrapper, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MasterCardListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(sui.s0, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MasterCardListViewHolder(viewInflate);
    }
}
