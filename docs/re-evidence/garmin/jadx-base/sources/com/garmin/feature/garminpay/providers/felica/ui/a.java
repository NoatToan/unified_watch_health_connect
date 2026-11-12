package com.garmin.feature.garminpay.providers.felica.ui;

import am.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import do1.l;
import i3.e5;
import j20.x;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import pn2.k;
import tn2.e;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<AbstractC1046a> f50996b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, List<? extends AbstractC1046a> list) {
        context.getClass();
        list.getClass();
        this.f50995a = context;
        this.f50996b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f50996b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return this.f50996b.get(i14).f50997a.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        this.f50996b.get(i14).a(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        AbstractC1046a.d dVar;
        viewGroup.getClass();
        AbstractC1046a.d[] dVarArrValues = AbstractC1046a.d.values();
        int length = dVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i15];
            if (dVar.ordinal() == i14) {
                break;
            }
            i15++;
        }
        if (dVar == null) {
            h.z(j.h(i14, "Unhandled viewType: "));
            return null;
        }
        View viewInflate = LayoutInflater.from(this.f50995a).inflate(dVar.getF51009e(), viewGroup, false);
        viewInflate.getClass();
        return new b(viewInflate);
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a$a;", "", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$d;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$d;)V", "d", "c", "b", "a", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$a;", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$b;", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC1046a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f50997a;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$a;", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a;", "", "text", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1047a extends AbstractC1046a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50998b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1047a(String str) {
                super(d.f51005c, null);
                str.getClass();
                this.f50998b = str;
            }

            @Override // com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a
            public final void a(b bVar) {
                bVar.getClass();
                ((TextView) bVar.itemView.findViewById(R.id.secondary_text)).setText(this.f50998b);
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$c;", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a;", "Lpn2/k;", "record", "<init>", "(Lpn2/k;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends AbstractC1046a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final k f51001b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f51002c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(k kVar) {
                super(d.f51003a, null);
                kVar.getClass();
                this.f51001b = kVar;
                this.f51002c = new e(new vb1.d(29));
            }

            @Override // com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a
            @SuppressLint({"SetTextI18n"})
            public final void a(b bVar) {
                String strO;
                String strA;
                bVar.getClass();
                View view2 = bVar.itemView;
                TextView textView = (TextView) view2.findViewById(R.id.summary);
                k kVar = this.f51001b;
                if (kVar.getType1() != null && kVar.getPlace1() != null && kVar.getType2() != null && kVar.getPlace2() != null) {
                    strO = j.o(StringUtils.SPACE, kVar.getPlace2(), e5.l(kVar.getType1(), StringUtils.SPACE, kVar.getPlace1(), " - ", kVar.getType2()));
                } else if (kVar.getType1() != null && kVar.getPlace1() != null && kVar.getPlace2() != null) {
                    strO = x.d(kVar.getType1(), StringUtils.SPACE, kVar.getPlace1(), " - ", kVar.getPlace2());
                } else if (kVar.getType1() != null && kVar.getPlace1() != null) {
                    strO = e5.g(kVar.getType1(), StringUtils.SPACE, kVar.getPlace1());
                } else if (kVar.getType2() != null && kVar.getPlace2() != null) {
                    strO = e5.g(kVar.getType2(), StringUtils.SPACE, kVar.getPlace2());
                } else if (kVar.getType1() != null) {
                    strO = String.valueOf(kVar.getType1());
                } else if (kVar.getPlace1() != null) {
                    strO = String.valueOf(kVar.getPlace1());
                } else {
                    FelicaCardDetailActivity.f50960l.getClass();
                    FelicaCardDetailActivity.f50961m.warn("Not predefined pattern");
                    strO = j.o(StringUtils.SPACE, kVar.getPlace2(), e5.l(kVar.getType1(), StringUtils.SPACE, kVar.getPlace1(), " - ", kVar.getType2()));
                }
                textView.setText(strO);
                TextView textView2 = (TextView) view2.findViewById(R.id.amount);
                String amount = kVar.getAmount();
                if (amount != null) {
                    strA = this.f51002c.a(Integer.valueOf(Integer.parseInt(amount)));
                } else {
                    strA = null;
                }
                textView2.setText(strA);
                ((TextView) view2.findViewById(R.id.date)).setText(DateTimeFormat.shortDate().print(g22.k.v(kVar.getDate(), "yyyyMMdd")));
            }
        }

        private AbstractC1046a(d dVar) {
            this.f50997a = dVar;
        }

        public abstract void a(b bVar);

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$d */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$d;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f51003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f51004b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1048a f51005c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ d[] f51006d;

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$d$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/HistoryAdapter.Item.Type.SECONDARY_TEXT", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C1048a extends d {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f51007e;

                public C1048a(String str, int i14) {
                    super(str, i14, null);
                    this.f51007e = R.layout.item_felica_history_secondary_text;
                }

                @Override // com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.d
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF51009e() {
                    return this.f51007e;
                }
            }

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$d$b */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/HistoryAdapter.Item.Type.SIMPLE_TEXT", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class b extends d {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f51008e;

                public b(String str, int i14) {
                    super(str, i14, null);
                    this.f51008e = R.layout.item_felica_history_simple_text;
                }

                @Override // com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.d
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF51009e() {
                    return this.f51008e;
                }
            }

            /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$d$c */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/ui/HistoryAdapter.Item.Type.TRANSACTION_RECORD", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class c extends d {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f51009e;

                public c(String str, int i14) {
                    super(str, i14, null);
                    this.f51009e = R.layout.item_felica_history_transaction_record;
                }

                @Override // com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a.d
                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getF51009e() {
                    return this.f51009e;
                }
            }

            static {
                c cVar = new c("TRANSACTION_RECORD", 0);
                f51003a = cVar;
                b bVar = new b("SIMPLE_TEXT", 1);
                f51004b = bVar;
                C1048a c1048a = new C1048a("SECONDARY_TEXT", 2);
                f51005c = c1048a;
                f51006d = new d[]{cVar, bVar, c1048a};
            }

            public /* synthetic */ d(String str, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, i14);
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) f51006d.clone();
            }

            /* JADX INFO: renamed from: a */
            public abstract int getF51009e();

            private d(String str, int i14) {
                super(str, i14);
            }
        }

        public /* synthetic */ AbstractC1046a(d dVar, p005kotlin.jvm.internal.j jVar) {
            this(dVar);
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.a$a$b */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/a$a$b;", "Lcom/garmin/feature/garminpay/providers/felica/ui/a$a;", "", "text", "Landroid/view/View$OnClickListener;", "clickListener", "<init>", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends AbstractC1046a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50999b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final View.OnClickListener f51000c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, View.OnClickListener onClickListener) {
                super(d.f51004b, null);
                str.getClass();
                onClickListener.getClass();
                this.f50999b = str;
                this.f51000c = onClickListener;
            }

            @Override // com.garmin.feature.garminpay.providers.felica.ui.a.AbstractC1046a
            public final void a(b bVar) {
                bVar.getClass();
                View view2 = bVar.itemView;
                ((TextView) view2.findViewById(R.id.content_text)).setText(this.f50999b);
                view2.setOnClickListener(this.f51000c);
            }

            public /* synthetic */ b(String str, View.OnClickListener onClickListener, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, (i14 & 2) != 0 ? new l(2) : onClickListener);
            }
        }
    }
}
