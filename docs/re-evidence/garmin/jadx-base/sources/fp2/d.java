package fp2;

import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.ComplexEditText;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.w;
import fb1.d0;
import g22.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lfp2/d;", "Landroid/text/TextWatcher;", "Landroid/content/res/Resources;", "resources", "", "Lep2/b;", "cardTypeList", "Landroid/widget/EditText;", "cardNumberEditText", "securityCodeEditText", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;", TtmlNode.TAG_LAYOUT, "<init>", "(Landroid/content/res/Resources;Ljava/util/List;Landroid/widget/EditText;Landroid/widget/EditText;Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements TextWatcher {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f73189k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f73190l = m.b(new d0(22));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ep2.b> f73191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f73192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f73193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComplexEditText f73194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ep2.b f73196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f73197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f73198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f73199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<ep2.b> f73200j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((ep2.b) t14).getPriority(), ((ep2.b) t7).getPriority());
        }
    }

    public d(Resources resources, List<ep2.b> list, EditText editText, EditText editText2, ComplexEditText complexEditText) {
        resources.getClass();
        editText.getClass();
        editText2.getClass();
        complexEditText.getClass();
        this.f73191a = list;
        this.f73192b = editText;
        this.f73193c = editText2;
        this.f73194d = complexEditText;
        this.f73200j = list != null ? h0.N0(list, new b()) : null;
        this.f73195e = (int) (editText.getPaint().measureText("x") * 1.0f);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Integer maxLength;
        editable.getClass();
        String string = w.i0(editable.toString()).toString();
        if (n.d(string)) {
            eo2.d.f64794a.getClass();
            ep2.b bVarB = eo2.d.b(string, this.f73200j);
            this.f73196f = bVarB;
            t tVar = f73190l;
            a aVar = f73189k;
            if (bVarB == null || (maxLength = bVarB.getMaxLength()) == null) {
                aVar.getClass();
                com.airbnb.lottie.animation.keyframe.a.z("afterTextChanged: Unable to set length for ", bVarB != null ? bVarB.getCardType() : null, " because maxLength is null", (Logger) tVar.getValue());
            } else {
                int iIntValue = maxLength.intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                this.f73192b.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(iIntValue)});
                this.f73197g = numValueOf;
                Integer cvvLength = bVarB.getCvvLength();
                if (cvvLength != null) {
                    int iIntValue2 = cvvLength.intValue();
                    this.f73198h = Integer.valueOf(iIntValue2);
                    this.f73193c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(iIntValue2)});
                }
                aVar.getClass();
                Logger logger = (Logger) tVar.getValue();
                String cardType = bVarB.getCardType();
                Integer num = this.f73197g;
                Integer num2 = this.f73198h;
                StringBuilder sbN = u0.n("Current card type: ", num, cardType, " and pan max length: ", " and cvv max length: ");
                sbN.append(num2);
                logger.debug(sbN.toString());
            }
        }
        if (this.f73199i) {
            return;
        }
        this.f73199i = true;
        ep2.b bVar = this.f73196f;
        ArrayList<Integer> arrayListK = bVar != null ? bVar.k() : null;
        Integer num3 = this.f73197g;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            int length = editable.length();
            for (f fVar : (f[]) editable.getSpans(0, editable.length(), f.class)) {
                editable.removeSpan(fVar);
            }
            if (iIntValue3 > 0 && length > iIntValue3 - 1) {
                editable.replace(iIntValue3, length, "");
            }
            if (arrayListK != null) {
                int i14 = 0;
                for (Object obj : arrayListK) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    int iIntValue4 = ((Number) obj).intValue();
                    if (editable.length() <= iIntValue4) {
                        break;
                    }
                    Integer num4 = i14 == 0 ? 0 : arrayListK.get(i14 - 1);
                    num4.getClass();
                    editable.setSpan(new f(this.f73195e), num4.intValue(), iIntValue4, 33);
                    i14 = i15;
                }
            }
        }
        this.f73199i = false;
        this.f73194d.i();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfp2/d$a;", "", "<init>", "()V", "", "NO_MAX_LENGTH", "I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
