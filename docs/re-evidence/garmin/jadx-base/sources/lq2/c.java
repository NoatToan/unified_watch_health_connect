package lq2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.SimpleColorFilter;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import er2.u;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.f0;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tn.k;
import v.e0;
import w52.u0;
import wr2.h;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\b\t\nB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Llq2/c;", "Landroidx/recyclerview/widget/x;", "Llq2/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x<b, RecyclerView.f0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f114342c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f114343b;

    /* JADX INFO: renamed from: lq2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llq2/c$c;", "Landroidx/recyclerview/widget/o$f;", "Llq2/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2180c extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.equals(bVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.a() == bVar4.a();
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(b bVar, b bVar2) {
            int i14;
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            if ((bVar3 instanceof b.C2178b) && (bVar4 instanceof b.C2178b)) {
                mq2.a aVar = ((b.C2178b) bVar3).f114345a;
                mq2.a aVar2 = ((b.C2178b) bVar4).f114345a;
                aVar.getClass();
                aVar2.getClass();
                i14 = (!aVar.f120217a.equals(aVar2.f120217a) ? 1 : 0) | (aVar.f120218b == aVar2.f120218b ? 0 : 2) | (aVar.f120219c.equals(aVar2.f120219c) ? 0 : 4);
            } else {
                i14 = -1;
            }
            return Integer.valueOf(i14);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f114342c = gt2.b.f79005a.h("PAY#PR#PreloadTransitManageCardAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(new C2180c());
        context.getClass();
        this.f114343b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return r(i14).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        int iIntValue;
        f0Var.getClass();
        list.getClass();
        b bVarR = r(i14);
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Integer) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                return;
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
            }
            iIntValue = ((Number) next).intValue();
        } else {
            iIntValue = -1;
        }
        if (bVarR instanceof b.e) {
            ((u) f0Var).f65121a.setText(((b.e) bVarR).f114349a);
            return;
        }
        if (bVarR instanceof b.C2178b) {
            nq2.b bVar = (nq2.b) f0Var;
            mq2.a aVar = ((b.C2178b) bVarR).f114345a;
            if ((iIntValue & 1) != 0) {
                j.b(bVar.f126961a, aVar.f120217a, null, 6);
            }
            if ((iIntValue & 2) != 0) {
                TextView textView = bVar.f126962b;
                h hVar = h.f186860a;
                short s8 = aVar.f120218b;
                hVar.getClass();
                textView.setText(h.a(s8, false));
            }
            if ((iIntValue & 4) != 0) {
                bVar.f126963c.setText(u0.i(aVar.f120219c));
                return;
            }
            return;
        }
        if (bVarR instanceof b.a) {
            ((nq2.a) f0Var).f126960b.setText(((b.a) bVarR).f114344a);
            return;
        }
        boolean z14 = bVarR instanceof b.C2179c;
        Context context = this.f114343b;
        if (z14) {
            nq2.c cVar = (nq2.c) f0Var;
            b.C2179c c2179c = (b.C2179c) bVarR;
            com.bumptech.glide.b.e(context).l(c2179c.f114346a).k(2131231969).E(cVar.f126964a);
            cVar.f126965b.setText(c2179c.f114347b);
            return;
        }
        if (bVarR instanceof b.d) {
            ((er2.o) f0Var).f65104a.setText(((b.d) bVarR).f114348a);
            return;
        }
        if (bVarR instanceof b.h) {
            nq2.f fVar = (nq2.f) f0Var;
            context.getClass();
            mq2.c cVar2 = ((b.h) bVarR).f114354a;
            ImageView imageView = fVar.f126969a;
            imageView.setImageResource(cVar2.f120229a.f100034a);
            imageView.setColorFilter(new SimpleColorFilter(f0.j(fVar.d().f().b())));
            jq2.e eVar = cVar2.f120230b;
            String strG = eVar == jq2.e.EMPTY ? "" : k.g(context.getString(eVar.f100044a), " - ");
            String string = cVar2.f120231c;
            if (string == null) {
                string = context.getString(R.string.wallet_purchase_title);
                string.getClass();
            }
            fVar.f126970b.setText(e5.g(strG, string, cVar2.f120232d));
            fVar.f126971c.setText(fVar.f126973e.print(cVar2.f120234f));
            TextView textView2 = fVar.f126972d;
            h hVar2 = h.f186860a;
            int i15 = -cVar2.f120233e;
            hVar2.getClass();
            textView2.setText(h.a(i15, false));
            return;
        }
        if (bVarR instanceof b.i) {
            ((nq2.d) f0Var).f126966a.setText(((b.i) bVarR).f114355a);
            return;
        }
        if (!(bVarR instanceof b.g)) {
            if (!(bVarR instanceof b.f)) {
                lc.u0.r();
                return;
            }
            nq2.e eVar2 = (nq2.e) f0Var;
            TextView textView3 = eVar2.f126968b;
            b.f fVar2 = (b.f) bVarR;
            eVar2.f126967a.setImageResource(fVar2.f114350a);
            textView3.setText(fVar2.f114351b);
            textView3.setOnClickListener(new a71.k(fVar2.f114352c, 5));
            return;
        }
        nq2.f fVar3 = (nq2.f) f0Var;
        context.getClass();
        ImageView imageView2 = fVar3.f126969a;
        imageView2.setImageResource(2131232722);
        imageView2.setColorFilter(new SimpleColorFilter(f0.j(fVar3.d().f().b())));
        fVar3.f126970b.setText(context.getString(R.string.wallet_top_up));
        TextView textView4 = fVar3.f126971c;
        DateTimeFormatter dateTimeFormatter = fVar3.f126973e;
        mq2.c cVar3 = ((b.g) bVarR).f114353a;
        textView4.setText(dateTimeFormatter.print(cVar3.f120234f));
        TextView textView5 = fVar3.f126972d;
        h hVar3 = h.f186860a;
        short s14 = cVar3.f120233e;
        hVar3.getClass();
        textView5.setText(h.a(s14, true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) throws IllegalAccessException {
        viewGroup.getClass();
        Context context = this.f114343b;
        switch (i14) {
            case 0:
                View viewD = a0.d(viewGroup, R.layout.item_section_header_all_cap, viewGroup, false);
                viewD.getClass();
                return new u(viewD);
            case 1:
                View viewD2 = a0.d(viewGroup, R.layout.item_card_image_with_balance, viewGroup, false);
                viewD2.getClass();
                return new nq2.b(context, viewD2);
            case 2:
                View viewD3 = a0.d(viewGroup, R.layout.item_card_number, viewGroup, false);
                viewD3.getClass();
                nq2.a aVar = new nq2.a(viewD3);
                aVar.f126959a.setText(context.getString(R.string.wallet_card_number));
                return aVar;
            case 3:
                View viewD4 = a0.d(viewGroup, R.layout.item_device_info_small, viewGroup, false);
                viewD4.getClass();
                return new nq2.c(viewD4);
            case 4:
                View viewD5 = a0.d(viewGroup, R.layout.item_no_transaction_info, viewGroup, false);
                viewD5.getClass();
                return new er2.o(viewD5);
            case 5:
                View viewD6 = a0.d(viewGroup, R.layout.item_preload_transit_transaction_with_upper_divider, viewGroup, false);
                viewD6.getClass();
                return new nq2.f(viewD6);
            case 6:
                View viewD7 = a0.d(viewGroup, R.layout.item_footer_description, viewGroup, false);
                viewD7.getClass();
                return new nq2.d(viewD7);
            case 7:
                View viewD8 = a0.d(viewGroup, R.layout.item_preload_transit_transaction_wrap_with_divider, viewGroup, false);
                viewD8.getClass();
                return new nq2.f(viewD8);
            case 8:
                View viewD9 = a0.d(viewGroup, R.layout.item_support_link, viewGroup, false);
                viewD9.getClass();
                return new nq2.e(viewD9);
            default:
                com.nimbusds.jose.shaded.gson.internal.a.t("Unsupported view type, developer fix me!");
                return null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Llq2/c$a;", "", "<init>", "()V", "", "VIEW_TYPE_SECTION_HEADER", "I", "VIEW_TYPE_CARD_SUMMARY", "VIEW_TYPE_CARD_NUMBER", "VIEW_TYPE_DEVICE_INFO", "VIEW_TYPE_EMPTY_TRANSACTION", "VIEW_TYPE_TRANSACTION", "VIEW_TYPE_TRANSACTION_FOOTER", "VIEW_TYPE_TOP_UP", "VIEW_TYPE_SUPPORT", "PAYLOAD_ALL", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Llq2/c$b;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "b", "a", "c", "d", "h", IntegerTokenConverter.CONVERTER_KEY, "g", "f", "Llq2/c$b$a;", "Llq2/c$b$b;", "Llq2/c$b$c;", "Llq2/c$b$d;", "Llq2/c$b$e;", "Llq2/c$b$f;", "Llq2/c$b$g;", "Llq2/c$b$h;", "Llq2/c$b$i;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$a;", "Llq2/c$b;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f114344a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(null);
                str.getClass();
                this.f114344a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.g(this.f114344a, ((a) obj).f114344a);
            }

            public final int hashCode() {
                return this.f114344a.hashCode();
            }

            public final String toString() {
                return am.j.m("CardNumber(cardNumber=", this.f114344a, ")");
            }
        }

        /* JADX INFO: renamed from: lq2.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$b;", "Llq2/c$b;", "Lmq2/a;", ModelSourceWrapper.TYPE, "<init>", "(Lmq2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2178b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mq2.a f114345a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2178b(mq2.a aVar) {
                super(null);
                aVar.getClass();
                this.f114345a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2178b) && s.g(this.f114345a, ((C2178b) obj).f114345a);
            }

            public final int hashCode() {
                return this.f114345a.hashCode();
            }

            public final String toString() {
                return "CardSummary(model=" + this.f114345a + ")";
            }
        }

        /* JADX INFO: renamed from: lq2.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llq2/c$b$c;", "Llq2/c$b;", "", "imageUrl", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2179c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f114346a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f114347b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2179c(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.f114346a = str;
                this.f114347b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2179c)) {
                    return false;
                }
                C2179c c2179c = (C2179c) obj;
                return s.g(this.f114346a, c2179c.f114346a) && s.g(this.f114347b, c2179c.f114347b);
            }

            public final int hashCode() {
                return this.f114347b.hashCode() + (this.f114346a.hashCode() * 31);
            }

            public final String toString() {
                return e0.g("DeviceInfo(imageUrl=", this.f114346a, ", name=", this.f114347b, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$d;", "Llq2/c$b;", "", "warningText", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f114348a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(null);
                str.getClass();
                this.f114348a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && s.g(this.f114348a, ((d) obj).f114348a);
            }

            public final int hashCode() {
                return this.f114348a.hashCode();
            }

            public final String toString() {
                return am.j.m("EmptyTransaction(warningText=", this.f114348a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$e;", "Llq2/c$b;", "", "title", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f114349a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(null);
                str.getClass();
                this.f114349a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && s.g(this.f114349a, ((e) obj).f114349a);
            }

            public final int hashCode() {
                return this.f114349a.hashCode();
            }

            public final String toString() {
                return am.j.m("Header(title=", this.f114349a, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Llq2/c$b$f;", "Llq2/c$b;", "", "icon", "", "linkText", "Lkotlin/Function1;", "Landroid/view/View;", "", "linkAction", "<init>", "(ILjava/lang/String;Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f114350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f114351b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final l<View, Unit> f114352c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(int i14, String str, l<? super View, Unit> lVar) {
                super(null);
                str.getClass();
                lVar.getClass();
                this.f114350a = i14;
                this.f114351b = str;
                this.f114352c = lVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f114350a == fVar.f114350a && s.g(this.f114351b, fVar.f114351b) && s.g(this.f114352c, fVar.f114352c);
            }

            public final int hashCode() {
                return this.f114352c.hashCode() + wr.g.j(Integer.hashCode(this.f114350a) * 31, 31, this.f114351b);
            }

            public final String toString() {
                StringBuilder sbR = wr.g.r(this.f114350a, "Support(icon=", ", linkText=", this.f114351b, ", linkAction=");
                sbR.append(this.f114352c);
                sbR.append(")");
                return sbR.toString();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$g;", "Llq2/c$b;", "Lmq2/c;", "transactionModel", "<init>", "(Lmq2/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mq2.c f114353a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(mq2.c cVar) {
                super(null);
                cVar.getClass();
                this.f114353a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && s.g(this.f114353a, ((g) obj).f114353a);
            }

            public final int hashCode() {
                return this.f114353a.hashCode();
            }

            public final String toString() {
                return "TopUp(transactionModel=" + this.f114353a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$h;", "Llq2/c$b;", "Lmq2/c;", "transactionModel", "<init>", "(Lmq2/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mq2.c f114354a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(mq2.c cVar) {
                super(null);
                cVar.getClass();
                this.f114354a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && s.g(this.f114354a, ((h) obj).f114354a);
            }

            public final int hashCode() {
                return this.f114354a.hashCode();
            }

            public final String toString() {
                return "Transaction(transactionModel=" + this.f114354a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llq2/c$b$i;", "Llq2/c$b;", "", "warningText", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f114355a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str) {
                super(null);
                str.getClass();
                this.f114355a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && s.g(this.f114355a, ((i) obj).f114355a);
            }

            public final int hashCode() {
                return this.f114355a.hashCode();
            }

            public final String toString() {
                return am.j.m("TransactionFooter(warningText=", this.f114355a, ")");
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final int a() {
            if (this instanceof e) {
                return 0;
            }
            if (this instanceof C2178b) {
                return 1;
            }
            if (this instanceof a) {
                return 2;
            }
            if (this instanceof C2179c) {
                return 3;
            }
            if (this instanceof d) {
                return 4;
            }
            if (this instanceof h) {
                return 5;
            }
            if (this instanceof i) {
                return 6;
            }
            if (this instanceof g) {
                return 7;
            }
            if (this instanceof f) {
                return 8;
            }
            lc.u0.r();
            return 0;
        }

        private b() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        onBindViewHolder(f0Var, i14, j0.f134944a);
    }
}
