package so2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import fo2.a0;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import n23.j;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lso2/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "d", "c", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f160469b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SnowballCardDetailActivity.d f160470a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lso2/b$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f160472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f160473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f160474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f160475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f160476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f160477f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            this.f160472a = (TextView) view2.findViewById(R.id.text_type);
            this.f160473b = (TextView) view2.findViewById(R.id.text_channel);
            this.f160474c = (TextView) view2.findViewById(R.id.text_time);
            this.f160475d = (TextView) view2.findViewById(R.id.text_order_number);
            this.f160476e = (TextView) view2.findViewById(R.id.text_status);
            this.f160477f = (TextView) view2.findViewById(R.id.text_amount);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lso2/b$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_snowball_order_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f160470a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        SnowballCardDetailActivity.d dVar = this.f160470a;
        if (dVar != null) {
            SnowballCardDetailActivity.this.b().r();
        }
    }

    /* JADX INFO: renamed from: so2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lso2/b$b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "Lfo2/a0;", "orderList", "<init>", "(Ljava/util/List;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3032b extends RecyclerView.h<RecyclerView.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a0> f160471a;

        static {
            new a(null);
        }

        public C3032b(List<a0> list) {
            list.getClass();
            this.f160471a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return org.apache.commons.lang3.e.c(2, 1, this.f160471a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i14) {
            return i14 % 2 == 0 ? 1 : 2;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            String string;
            f0Var.getClass();
            if (getItemViewType(i14) == 2 && (f0Var instanceof c)) {
                c cVar = (c) f0Var;
                a0 a0Var = this.f160471a.get(i14 / 2);
                a0Var.getClass();
                TextView textView = cVar.f160472a;
                Context context = textView.getContext();
                context.getClass();
                String str = a0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
                String string2 = "";
                if (s.g(str, "ISSUE")) {
                    string = context.getString(R.string.wallet_activation);
                    string.getClass();
                } else if (s.g(str, "TOPUP")) {
                    string = context.getString(R.string.wallet_top_up);
                    string.getClass();
                } else {
                    string = "";
                }
                textView.setText(string);
                TextView textView2 = cVar.f160473b;
                Context context2 = textView2.getContext();
                context2.getClass();
                String string3 = context2.getString(a0Var.getPaymentChannel().getF73135d());
                string3.getClass();
                textView2.setText(string3);
                cVar.f160474c.setText(DateTimeFormat.shortDateTime().withLocale(Locale.getDefault()).print(a0Var.getCreatedTs().toDateTime(DateTimeZone.forTimeZone(TimeZone.getDefault()))));
                cVar.f160475d.setText(a0Var.getExtOrderNumber());
                TextView textView3 = cVar.f160476e;
                Context context3 = textView3.getContext();
                context3.getClass();
                String extOrderStatus = a0Var.getExtOrderStatus();
                if (extOrderStatus != null) {
                    int iHashCode = extOrderStatus.hashCode();
                    if (iHashCode != 1477632) {
                        switch (iHashCode) {
                            case 1507423:
                                if (extOrderStatus.equals("1000")) {
                                    string2 = context3.getString(R.string.wallet_order_state_new);
                                    string2.getClass();
                                }
                                break;
                            case 1507424:
                                if (extOrderStatus.equals("1001")) {
                                    string2 = context3.getString(R.string.wallet_order_state_charged_successfully_activation_failed);
                                    string2.getClass();
                                }
                                break;
                            case 1507425:
                                if (extOrderStatus.equals("1002")) {
                                    string2 = context3.getString(R.string.wallet_order_state_charged_successfully_failed_to_recharge);
                                    string2.getClass();
                                }
                                break;
                            case 1507426:
                                if (extOrderStatus.equals("1003")) {
                                    string2 = context3.getString(R.string.wallet_order_state_charge_failed);
                                    string2.getClass();
                                }
                                break;
                            case 1507427:
                                if (extOrderStatus.equals("1004")) {
                                    string2 = context3.getString(R.string.wallet_order_state_charged_successfully_refunding);
                                    string2.getClass();
                                }
                                break;
                            case 1507428:
                                if (extOrderStatus.equals("1005")) {
                                    string2 = context3.getString(R.string.wallet_order_state_charged_successfully_refunding_failed);
                                    string2.getClass();
                                }
                                break;
                            case 1507429:
                                if (extOrderStatus.equals("1006")) {
                                    string2 = context3.getString(R.string.wallet_order_state_charged_successfully_not_processed);
                                    string2.getClass();
                                }
                                break;
                            case 1507430:
                                if (extOrderStatus.equals("1007")) {
                                    string2 = context3.getString(R.string.wallet_order_state_suspicious_charge_under_review);
                                    string2.getClass();
                                }
                                break;
                            case 1507431:
                                if (extOrderStatus.equals("1008")) {
                                    string2 = context3.getString(R.string.wallet_order_state_refunded_successfully);
                                    string2.getClass();
                                }
                                break;
                        }
                    } else if (extOrderStatus.equals("0000")) {
                        string2 = context3.getString(R.string.wallet_order_state_successful);
                        string2.getClass();
                    }
                }
                textView3.setText(string2);
                TextView textView4 = cVar.f160477f;
                ko2.c cVar2 = ko2.c.f105778b;
                double dA = a0Var.getTotalCost().a();
                cVar2.getClass();
                textView4.setText(ko2.c.e(dA));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            if (i14 == 1) {
                return new d(j.b(viewGroup, R.layout.gp_vertical_list_item_divider, viewGroup, false));
            }
            if (i14 == 2) {
                return new c(j.b(viewGroup, R.layout.item_snowball_order_record, viewGroup, false));
            }
            h.z(am.j.h(i14, "Unknown viewType: "));
            return null;
        }

        /* JADX INFO: renamed from: so2.b$b$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lso2/b$b$a;", "", "<init>", "()V", "", "VIEW_TYPE_DIVIDER", "I", "VIEW_TYPE_RECORD", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lso2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
