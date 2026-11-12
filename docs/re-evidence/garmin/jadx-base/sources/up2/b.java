package up2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lup2/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lup2/b$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lvp2/c;", "dataSet", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<vp2.c> f172162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wp2.a f172163c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lup2/b$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f172164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f172165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f172166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f172167d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.transaction_title_text_view);
            viewFindViewById.getClass();
            this.f172164a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.transaction_amount_text_view);
            viewFindViewById2.getClass();
            this.f172165b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.transaction_date_time_text_view);
            viewFindViewById3.getClass();
            this.f172166c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.transaction_status_text_view);
            viewFindViewById4.getClass();
            this.f172167d = (TextView) viewFindViewById4;
        }
    }

    /* JADX INFO: renamed from: up2.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3214b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172168a;

        static {
            int[] iArr = new int[vp2.a.values().length];
            try {
                iArr[vp2.a.DECLINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vp2.a.REFUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vp2.a.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f172168a = iArr;
        }
    }

    public b(Context context, List<vp2.c> list) {
        context.getClass();
        list.getClass();
        this.f172161a = context;
        this.f172162b = list;
        this.f172163c = new wp2.a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f172162b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String symbol;
        String str;
        a aVar = (a) f0Var;
        aVar.getClass();
        TextView textView = aVar.f172167d;
        TextView textView2 = aVar.f172165b;
        vp2.c cVar = this.f172162b.get(i14);
        String merchantName = cVar.getMerchantName();
        TextView textView3 = aVar.f172164a;
        if (merchantName.length() == 0) {
            merchantName = "Unknown";
        }
        textView3.setText(merchantName);
        Currency currency = Currency.getInstance(cVar.getCurrencyCode());
        String str2 = "";
        if (currency == null || (symbol = currency.getSymbol()) == null) {
            symbol = "";
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        DecimalFormat decimalFormat = currencyInstance instanceof DecimalFormat ? (DecimalFormat) currencyInstance : null;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat != null ? decimalFormat.getDecimalFormatSymbols() : null;
        if (decimalFormatSymbols != null) {
            decimalFormatSymbols.setCurrencySymbol("");
        }
        if (decimalFormat != null) {
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
        vp2.a fitPayCardAuthorizationStatus = cVar.getFitPayCardAuthorizationStatus();
        if (fitPayCardAuthorizationStatus != null && (str = fitPayCardAuthorizationStatus.f179407a) != null) {
            str2 = str;
        }
        textView2.setText(str2 + symbol + currencyInstance.format(cVar.getAmount()));
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3, Locale.getDefault());
        Date transactionTime = cVar.getTransactionTime();
        String str3 = transactionTime != null ? dateTimeInstance.format(transactionTime) : null;
        if (str3 != null) {
            aVar.f172166c.setText(str3);
        }
        vp2.a fitPayCardAuthorizationStatus2 = cVar.getFitPayCardAuthorizationStatus();
        int i15 = fitPayCardAuthorizationStatus2 == null ? -1 : C3214b.f172168a[fitPayCardAuthorizationStatus2.ordinal()];
        Context context = this.f172161a;
        if (i15 == 1) {
            textView.setText(textView.getContext().getString(R.string.declined));
            textView.setTextColor(textView.getContext().getColor(R.color.GPcolorTextDarkGray));
            textView.setVisibility(0);
            textView2.setTextColor(context.getColor(R.color.GPcolorText));
            return;
        }
        if (i15 == 2) {
            textView.setText(textView.getContext().getString(R.string.refunded));
            textView.setTextColor(textView.getContext().getColor(R.color.GPcolorTextDarkGray));
            textView.setVisibility(0);
            textView2.setTextColor(context.getColor(R.color.GPcolorText));
            return;
        }
        if (i15 != 3) {
            textView.setVisibility(8);
            textView2.setTextColor(context.getColor(R.color.GPcolorText));
        } else {
            textView.setText(textView.getContext().getString(R.string.pending));
            textView.setTextColor(textView.getContext().getColor(R.color.GPcolorTextDarkGray));
            textView.setVisibility(0);
            textView2.setTextColor(context.getColor(R.color.GPcolorTextDarkGray));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewInflate;
        viewGroup.getClass();
        wp2.a aVar = this.f172163c;
        float f14 = aVar.f186534a;
        LayoutInflater layoutInflater = aVar.f186535b;
        if (f14 >= 1.3f) {
            viewInflate = layoutInflater.inflate(R.layout.item_fitpay_card_transaction_font_scaled, viewGroup, false);
            viewInflate.getClass();
        } else {
            viewInflate = layoutInflater.inflate(R.layout.item_fitpay_card_transaction, viewGroup, false);
            viewInflate.getClass();
        }
        return new a(viewInflate);
    }
}
