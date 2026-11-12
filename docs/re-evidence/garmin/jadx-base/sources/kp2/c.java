package kp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d13.v;
import dq2.f;
import dq2.g;
import er2.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k11.h;
import lc.u0;
import mt0.h0;
import np2.e;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\b\t\n\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lkp2/c;", "Landroidx/recyclerview/widget/x;", "Lkp2/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "c", "b", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x<a, RecyclerView.f0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f106028e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f106029f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f106030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13.a<AbstractC2049c> f106031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f106032d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkp2/c$d;", "Landroidx/recyclerview/widget/o$f;", "Lkp2/c$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends o.f<a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(a aVar, a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            return false;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(a aVar, a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            return false;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f106029f = gt2.b.f79005a.h("PAY#NEW_FITPAY#CardVerificationAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(new d());
        context.getClass();
        this.f106030b = context;
        m13.a<AbstractC2049c> aVar = new m13.a<>();
        this.f106031c = aVar;
        this.f106032d = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        a aVarR = r(i14);
        aVarR.getClass();
        a aVar = aVarR;
        if (aVar instanceof a.C2047a) {
            return 0;
        }
        if (aVar instanceof a.b) {
            return 1;
        }
        if (aVar instanceof a.d) {
            return 2;
        }
        if (aVar instanceof a.C2048c) {
            return 3;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a.d dVar;
        f fVar;
        a.d dVar2;
        Map<String, String> map;
        a.C2047a c2047a;
        f0Var.getClass();
        a aVarR = r(i14);
        boolean z14 = aVarR instanceof a.C2047a;
        Context context = this.f106030b;
        strA = null;
        strA = null;
        String strA = null;
        if (z14) {
            np2.a aVar = f0Var instanceof np2.a ? (np2.a) f0Var : null;
            if (aVar != null) {
                if (aVar.getBindingAdapterPosition() == -1) {
                    c2047a = null;
                } else {
                    a aVarR2 = r(aVar.getBindingAdapterPosition());
                    if (!(aVarR2 instanceof a.C2047a)) {
                        aVarR2 = null;
                    }
                    c2047a = (a.C2047a) aVarR2;
                }
                aVar.d(context, c2047a != null ? c2047a.f106033a : null);
                return;
            }
            return;
        }
        if (aVarR instanceof a.b) {
            np2.f fVar2 = f0Var instanceof np2.f ? (np2.f) f0Var : null;
            if (fVar2 != null) {
                fVar2.f126880a.setText(context.getResources().getString(R.string.add_card_verify_idenity));
                return;
            }
            return;
        }
        if (!(aVarR instanceof a.d)) {
            if (!(aVarR instanceof a.C2048c)) {
                u0.r();
                return;
            }
            e eVar = f0Var instanceof e ? (e) f0Var : null;
            if (eVar != null) {
                eVar.d(new jx0.e(this, 24), context);
                return;
            }
            return;
        }
        np2.b bVar = f0Var instanceof np2.b ? (np2.b) f0Var : null;
        if (bVar != null) {
            if (bVar.getBindingAdapterPosition() == -1) {
                dVar = null;
            } else {
                a aVarR3 = r(bVar.getBindingAdapterPosition());
                if (!(aVarR3 instanceof a.d)) {
                    aVarR3 = null;
                }
                dVar = (a.d) aVarR3;
            }
            Logger logger = f106029f;
            if (dVar == null || (fVar = dVar.f106036a) == null) {
                logger.error("onBindViewHolder: can not assign verification method, null");
                return;
            }
            if (bVar.getBindingAdapterPosition() == -1) {
                dVar2 = null;
            } else {
                a aVarR4 = r(bVar.getBindingAdapterPosition());
                if (!(aVarR4 instanceof a.d)) {
                    aVarR4 = null;
                }
                dVar2 = (a.d) aVarR4;
            }
            if (dVar2 == null || (map = dVar2.f106037b) == null) {
                logger.error("onBindViewHolder: can not assign extra strings map, null");
                return;
            }
            h hVar = new h(14, this, fVar);
            Button button = bVar.f126869a;
            context.getClass();
            mp2.a aVar2 = fVar.f60808c;
            if (aVar2 == null) {
                return;
            }
            int i15 = np2.b.a.f126871a[aVar2.ordinal()];
            if (i15 == 1 || i15 == 2) {
                String str = map.get("ISSUER_NAME");
                if (str != null) {
                    strA = aVar2.a(str);
                }
            } else {
                String str2 = fVar.f60809d;
                if (i15 != 3) {
                    if (str2 != null) {
                        strA = aVar2.a(str2);
                    }
                } else if (str2 != null) {
                    strA = aVar2.a(str2);
                }
            }
            button.setText(strA);
            TextView textView = bVar.f126870b;
            String strC = aVar2.c();
            if (strC != null) {
                textView.setVisibility(0);
                textView.setText(strC);
            } else {
                textView.setVisibility(8);
            }
            button.setOnClickListener(new h0(hVar, 25));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f106030b;
        if (i14 == 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_fitpay_card_image, viewGroup, false);
            viewInflate.getClass();
            return new np2.a(viewInflate);
        }
        if (i14 == 1) {
            View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_fitpay_card_verification_title, viewGroup, false);
            viewInflate2.getClass();
            return new np2.f(viewInflate2);
        }
        if (i14 == 2) {
            View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_fitpay_select_verification_method, viewGroup, false);
            viewInflate3.getClass();
            return new np2.b(viewInflate3);
        }
        if (i14 != 3) {
            View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_empty_section, viewGroup, false);
            viewInflate4.getClass();
            return new n(viewInflate4);
        }
        View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.item_link_button_red, viewGroup, false);
        viewInflate5.getClass();
        return new e(viewInflate5);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lkp2/c$a;", "", "<init>", "()V", "a", "b", "d", "c", "Lkp2/c$a$a;", "Lkp2/c$a$b;", "Lkp2/c$a$c;", "Lkp2/c$a$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: kp2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkp2/c$a$a;", "Lkp2/c$a;", "Lyo2/b;", "cardModel", "<init>", "(Lyo2/b;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2047a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final yo2.b f106033a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2047a(yo2.b bVar) {
                super(null);
                bVar.getClass();
                this.f106033a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2047a) && s.g(this.f106033a, ((C2047a) obj).f106033a);
            }

            public final int hashCode() {
                return this.f106033a.hashCode();
            }

            public final String toString() {
                return "CardImageSection(cardModel=" + this.f106033a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/c$a$b;", "Lkp2/c$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f106034a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: kp2.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/c$a$c;", "Lkp2/c$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2048c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2048c f106035a = new C2048c();

            private C2048c() {
                super(null);
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkp2/c$a$d;", "Lkp2/c$a;", "Ldq2/f;", "verificationMethod", "", "", "extraStringsMap", "<init>", "(Ldq2/f;Ljava/util/Map;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f106036a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map<String, String> f106037b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(f fVar, Map<String, String> map) {
                super(null);
                fVar.getClass();
                map.getClass();
                this.f106036a = fVar;
                this.f106037b = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return s.g(this.f106036a, dVar.f106036a) && s.g(this.f106037b, dVar.f106037b);
            }

            public final int hashCode() {
                return this.f106037b.hashCode() + (this.f106036a.hashCode() * 31);
            }

            public final String toString() {
                return "SelectVerificationMethodSection(verificationMethod=" + this.f106036a + ", extraStringsMap=" + this.f106037b + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public d(f fVar, Map map, int i14, j jVar) {
                if ((i14 & 2) != 0) {
                    map = k0.f134949a;
                    map.getClass();
                }
                this(fVar, map);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lkp2/c$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "TYPE_CARD_IMAGE_SECTION", "I", "TYPE_CARD_VERIFICATION_HEADER", "TYPE_SELECT_VERIFICATION_METHOD_SECTION", "TYPE_REMOVE_CARD_SECTION", "PAYLOAD_ALL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106038a;

            static {
                int[] iArr = new int[mp2.a.values().length];
                try {
                    iArr[mp2.a.f120061e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mp2.a.f120062f.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f106038a = iArr;
            }
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        public static ArrayList a(yo2.b bVar, g gVar) {
            String issuerName;
            gVar.getClass();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new a.C2047a(bVar));
            arrayList.add(a.b.f106034a);
            for (f fVar : gVar.f60815a) {
                mp2.a aVar = fVar.f60808c;
                int i14 = aVar == null ? -1 : a.f106038a[aVar.ordinal()];
                if ((i14 == 1 || i14 == 2) && (issuerName = bVar.getIssuerName()) != null) {
                }
                arrayList.add(new a.d(fVar, map));
            }
            arrayList.add(a.C2048c.f106035a);
            return arrayList;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: kp2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkp2/c$c;", "", "<init>", "()V", "b", "a", "Lkp2/c$c$a;", "Lkp2/c$c$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC2049c {

        /* JADX INFO: renamed from: kp2.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/c$c$a;", "Lkp2/c$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends AbstractC2049c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f106039a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: kp2.c$c$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkp2/c$c$b;", "Lkp2/c$c;", "Ldq2/f;", "selectedVerificationMethod", "<init>", "(Ldq2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC2049c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f106040a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar) {
                super(null);
                fVar.getClass();
                this.f106040a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.g(this.f106040a, ((b) obj).f106040a);
            }

            public final int hashCode() {
                return this.f106040a.hashCode();
            }

            public final String toString() {
                return "SelectedVerificationItem(selectedVerificationMethod=" + this.f106040a + ")";
            }
        }

        public /* synthetic */ AbstractC2049c(j jVar) {
            this();
        }

        private AbstractC2049c() {
        }
    }
}
