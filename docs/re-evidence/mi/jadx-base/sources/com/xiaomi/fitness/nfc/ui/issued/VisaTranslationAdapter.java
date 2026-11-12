package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.service.mi.visa.entity.transactionresp.EncTransactionInfo;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.nfc.ui.issued.VisaTranslationAdapter;
import defpackage.mri;
import defpackage.o0j;
import defpackage.sui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/VisaTranslationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/nfc/ui/issued/VisaTranslationAdapter$MasterTranslationViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/service/mi/visa/entity/transactionresp/EncTransactionInfo;", "onClickListener", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "MasterTranslationViewHolder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VisaTranslationAdapter extends RecyclerView.Adapter<MasterTranslationViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<EncTransactionInfo> dataList;

    @NotNull
    private Function1<? super EncTransactionInfo, Unit> onClickListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/VisaTranslationAdapter$MasterTranslationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/service/mi/visa/entity/transactionresp/EncTransactionInfo;", "transaction", "", "bindData", "(Lcom/service/mi/visa/entity/transactionresp/EncTransactionInfo;)V", "", "timeStr", "utc2localTime", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "payWayNameView", "Landroid/widget/TextView;", "getPayWayNameView", "()Landroid/widget/TextView;", "setPayWayNameView", "(Landroid/widget/TextView;)V", "payView", "getPayView", "setPayView", "dateView", "getDateView", "setDateView", "reversedView", "getReversedView", "setReversedView", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class MasterTranslationViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView dateView;

        @NotNull
        private TextView payView;

        @NotNull
        private TextView payWayNameView;

        @NotNull
        private TextView reversedView;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MasterTranslationViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            View viewFindViewById = view.findViewById(mri.r3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.payWayNameView = (TextView) viewFindViewById;
            View viewFindViewById2 = this.view.findViewById(mri.q3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.payView = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.view.findViewById(mri.c1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.dateView = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.view.findViewById(mri.c4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.reversedView = (TextView) viewFindViewById4;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        public final void bindData(@NotNull EncTransactionInfo transaction) {
            String string;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.payWayNameView.setText(transaction.getMerchantName());
            this.payView.setText(transaction.getAmount() + transaction.getCurrencyCode());
            this.dateView.setText(utc2localTime(transaction.getTransactionDate()));
            String transactionStatus = transaction.getTransactionStatus();
            if (transactionStatus != null) {
                switch (transactionStatus) {
                    case "1":
                        string = ResourceExtKt.getString(o0j.u7);
                        break;
                    case "2":
                        string = ResourceExtKt.getString(o0j.w7);
                        break;
                    case "3":
                        string = ResourceExtKt.getString(o0j.v7);
                        break;
                    case "4":
                        string = ResourceExtKt.getString(o0j.x7);
                        break;
                    default:
                        string = "";
                        break;
                }
            } else {
                string = "";
            }
            this.reversedView.setText(string);
        }

        @NotNull
        public final TextView getDateView() {
            return this.dateView;
        }

        @NotNull
        public final TextView getPayView() {
            return this.payView;
        }

        @NotNull
        public final TextView getPayWayNameView() {
            return this.payWayNameView;
        }

        @NotNull
        public final TextView getReversedView() {
            return this.reversedView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setDateView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.dateView = textView;
        }

        public final void setPayView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.payView = textView;
        }

        public final void setPayWayNameView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.payWayNameView = textView;
        }

        public final void setReversedView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.reversedView = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }

        @Nullable
        public final String utc2localTime(@Nullable String timeStr) {
            try {
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT3);
                simpleDateFormat.setTimeZone(timeZone);
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(simpleDateFormat.parse(timeStr).getTime()));
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public VisaTranslationAdapter(@NotNull Context context, @NotNull List<EncTransactionInfo> dataList, @NotNull Function1<? super EncTransactionInfo, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.context = context;
        this.dataList = dataList;
        this.onClickListener = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(VisaTranslationAdapter this$0, EncTransactionInfo transaction, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(transaction, "$transaction");
        this$0.onClickListener.invoke2(transaction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MasterTranslationViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EncTransactionInfo encTransactionInfo = this.dataList.get(position);
        holder.bindData(encTransactionInfo);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: r0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisaTranslationAdapter.onBindViewHolder$lambda$0(this.f32061a, encTransactionInfo, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MasterTranslationViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(sui.t0, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MasterTranslationViewHolder(viewInflate);
    }
}
