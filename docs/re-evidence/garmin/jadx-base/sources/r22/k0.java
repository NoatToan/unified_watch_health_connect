package r22;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr22/k0;", "Landroid/app/Dialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr22/k0$a;", "configuration", "<init>", "(Landroid/content/Context;Lr22/k0$a;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends Dialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f149727b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f149728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, a aVar) {
        super(context, R.style.GCMInfoDialogStyle);
        context.getClass();
        aVar.getClass();
        String str = aVar.f149738j;
        String str2 = aVar.f149735g;
        String str3 = aVar.f149730b;
        this.f149728a = aVar;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm4_fragment_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_title);
        textView.setText(aVar.f149729a);
        Integer num = aVar.f149733e;
        if (num != null) {
            textView.setTextAppearance(num.intValue());
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_description);
        textView2.getClass();
        v22.e.v(textView2, !p005kotlin.jvm.internal.s.g(str3, ""));
        textView2.setText(str3);
        Integer num2 = aVar.f149734f;
        if (num2 != null) {
            textView2.setTextAppearance(num2.intValue());
        }
        if (aVar.f149732d) {
            textView2.setTypeface(null, 1);
        }
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.dialog_primary_button);
        if (g22.n.d(str2)) {
            textView3.setText(str2);
            final int i14 = 0;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: r22.j0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k0 f149698b;

                {
                    this.f149698b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    k0 k0Var = this.f149698b;
                    switch (i15) {
                        case 0:
                            int i16 = k0.f149727b;
                            k0Var.dismiss();
                            e23.l<View, Unit> lVar = k0Var.f149728a.f149737i;
                            if (lVar != null) {
                                view2.getClass();
                                lVar.invoke(view2);
                            }
                            break;
                        default:
                            int i17 = k0.f149727b;
                            k0Var.dismiss();
                            e23.l<View, Unit> lVar2 = k0Var.f149728a.f149740l;
                            if (lVar2 != null) {
                                view2.getClass();
                                lVar2.invoke(view2);
                            }
                            break;
                    }
                }
            });
        } else {
            textView3.getClass();
            textView3.setVisibility(8);
        }
        Integer num3 = aVar.f149736h;
        if (num3 != null) {
            textView3.setTextColor(num3.intValue());
        }
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.dialog_primary_secondary);
        if (g22.n.d(str)) {
            textView4.setText(str);
            final int i15 = 1;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: r22.j0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k0 f149698b;

                {
                    this.f149698b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    k0 k0Var = this.f149698b;
                    switch (i16) {
                        case 0:
                            int i17 = k0.f149727b;
                            k0Var.dismiss();
                            e23.l<View, Unit> lVar = k0Var.f149728a.f149737i;
                            if (lVar != null) {
                                view2.getClass();
                                lVar.invoke(view2);
                            }
                            break;
                        default:
                            int i18 = k0.f149727b;
                            k0Var.dismiss();
                            e23.l<View, Unit> lVar2 = k0Var.f149728a.f149740l;
                            if (lVar2 != null) {
                                view2.getClass();
                                lVar2.invoke(view2);
                            }
                            break;
                    }
                }
            });
        } else {
            textView4.getClass();
            textView4.setVisibility(8);
        }
        Integer num4 = aVar.f149739k;
        if (num4 != null) {
            textView3.setTextColor(num4.intValue());
        }
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setCanceledOnTouchOutside(aVar.f149731c);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lr22/k0$a;", "", "", "titleText", "descriptionText", "", "isCancellable", "applyBoldToDescription", "", "titleTextAppearance", "descriptionTextAppearance", "positiveBtnText", "positiveBtnTextColor", "Lkotlin/Function1;", "Landroid/view/View;", "", "positiveBtnClickListener", "negativeBtnText", "negativeBtnTextColor", "negativeBtnClickListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Le23/l;Ljava/lang/String;Ljava/lang/Integer;Le23/l;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f149729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f149730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f149731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f149732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f149733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f149734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f149735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f149736h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.l<View, Unit> f149737i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f149738j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Integer f149739k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final e23.l<View, Unit> f149740l;

        public /* synthetic */ a(String str, String str2, boolean z14, boolean z15, Integer num, Integer num2, String str3, Integer num3, e23.l lVar, String str4, Integer num4, e23.l lVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? true : z15, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : num3, (i14 & 256) != 0 ? null : lVar, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : num4, (i14 & 2048) != 0 ? null : lVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f149729a, aVar.f149729a) && p005kotlin.jvm.internal.s.g(this.f149730b, aVar.f149730b) && this.f149731c == aVar.f149731c && this.f149732d == aVar.f149732d && p005kotlin.jvm.internal.s.g(this.f149733e, aVar.f149733e) && p005kotlin.jvm.internal.s.g(this.f149734f, aVar.f149734f) && p005kotlin.jvm.internal.s.g(this.f149735g, aVar.f149735g) && p005kotlin.jvm.internal.s.g(this.f149736h, aVar.f149736h) && p005kotlin.jvm.internal.s.g(this.f149737i, aVar.f149737i) && p005kotlin.jvm.internal.s.g(this.f149738j, aVar.f149738j) && p005kotlin.jvm.internal.s.g(this.f149739k, aVar.f149739k) && p005kotlin.jvm.internal.s.g(this.f149740l, aVar.f149740l);
        }

        public final int hashCode() {
            int iG = q6.f.g(q6.f.g(wr.g.j(this.f149729a.hashCode() * 31, 31, this.f149730b), 31, this.f149731c), 31, this.f149732d);
            Integer num = this.f149733e;
            int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f149734f;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.f149735g;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num3 = this.f149736h;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            e23.l<View, Unit> lVar = this.f149737i;
            int iHashCode5 = (iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            String str2 = this.f149738j;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num4 = this.f149739k;
            int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            e23.l<View, Unit> lVar2 = this.f149740l;
            return iHashCode7 + (lVar2 != null ? lVar2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("GCMDialogConfiguration(titleText=", this.f149729a, ", descriptionText=", this.f149730b, ", isCancellable=");
            kg.f.q(", applyBoldToDescription=", ", titleTextAppearance=", sbI, this.f149731c, this.f149732d);
            j20.x.m(sbI, this.f149733e, ", descriptionTextAppearance=", this.f149734f, ", positiveBtnText=");
            fb1.c.u(this.f149736h, this.f149735g, ", positiveBtnTextColor=", ", positiveBtnClickListener=", sbI);
            sbI.append(this.f149737i);
            sbI.append(", negativeBtnText=");
            sbI.append(this.f149738j);
            sbI.append(", negativeBtnTextColor=");
            sbI.append(this.f149739k);
            sbI.append(", negativeBtnClickListener=");
            sbI.append(this.f149740l);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, boolean z14, boolean z15, Integer num, Integer num2, String str3, Integer num3, e23.l<? super View, Unit> lVar, String str4, Integer num4, e23.l<? super View, Unit> lVar2) {
            str.getClass();
            str2.getClass();
            this.f149729a = str;
            this.f149730b = str2;
            this.f149731c = z14;
            this.f149732d = z15;
            this.f149733e = num;
            this.f149734f = num2;
            this.f149735g = str3;
            this.f149736h = num3;
            this.f149737i = lVar;
            this.f149738j = str4;
            this.f149739k = num4;
            this.f149740l = lVar2;
        }

        public a() {
            this(null, null, false, false, null, null, null, null, null, null, null, null, 4095, null);
        }
    }
}
