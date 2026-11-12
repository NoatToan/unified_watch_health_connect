package qo2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import java.util.Locale;
import ko2.c;
import lc.u0;
import n23.j;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import po2.h0;
import po2.i0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqo2/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lqo2/a$a;", "", "Lpo2/h0;", "transactionList", "<init>", "(Ljava/util/List;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<C2750a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h0> f145983a;

    /* JADX INFO: renamed from: qo2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqo2/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2750a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f145984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f145985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f145986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2750a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text_summary);
            viewFindViewById.getClass();
            this.f145984a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.text_time);
            viewFindViewById2.getClass();
            this.f145985b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.text_amount);
            viewFindViewById3.getClass();
            this.f145986c = (TextView) viewFindViewById3;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145987a;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.TOP_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.MULTI_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145987a = iArr;
        }
    }

    public a(List<h0> list) {
        list.getClass();
        this.f145983a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f145983a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String str;
        C2750a c2750a = (C2750a) f0Var;
        c2750a.getClass();
        h0 h0Var = this.f145983a.get(i14);
        TextView textView = c2750a.f145984a;
        i0 i0Var = h0Var.f139207a;
        double d14 = h0Var.f139208b;
        textView.setText(i0Var.f139230a);
        int i15 = b.f145987a[h0Var.f139207a.ordinal()];
        if (i15 != 1) {
            if (i15 != 2 && i15 != 3) {
                u0.r();
                return;
            } else if (d14 != 0.0d) {
                d14 = -d14;
            }
        }
        TextView textView2 = c2750a.f145986c;
        c.f105778b.getClass();
        if (d14 == 0.0d) {
            ko2.b.f105773a.getClass();
            str = ko2.b.f105776d.format(d14);
            str.getClass();
        } else {
            ko2.b.f105773a.getClass();
            str = ko2.b.f105775c.format(d14);
            str.getClass();
        }
        textView2.setText(str);
        TextView textView3 = c2750a.f145985b;
        DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormat.shortDateTime().withLocale(Locale.getDefault());
        Object value = h0Var.f139211e.getValue();
        value.getClass();
        textView3.setText(dateTimeFormatterWithLocale.print((DateTime) value));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C2750a(j.b(viewGroup, R.layout.item_snowball_transaction_record, viewGroup, false));
    }
}
