package fb2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aq.q1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfb2/o;", "T", "Lfb2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final View a() {
        if (this.f70367d == null) {
            View viewInflate = LayoutInflater.from(this.f70343a).inflate(R.layout.gcm3_settings_section_header, (ViewGroup) null, false);
            this.f70367d = viewInflate;
            View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.section_header_text) : null;
            TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
            if (textView != null) {
                textView.setText(r());
            }
            View view2 = this.f70367d;
            View viewFindViewById2 = view2 != null ? view2.findViewById(R.id.section_header_action_text) : null;
            TextView textView2 = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
            if (textView2 != null) {
                textView2.setText(q());
            }
        }
        return this.f70367d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        cVar.getClass();
        t7.getClass();
        View viewFindViewById = cVar.findViewById(R.id.section_header_container);
        if (viewFindViewById != null) {
            this.f70367d = viewFindViewById;
            o(viewFindViewById);
            this.f70345c = new p(viewFindViewById);
            return k(t7);
        }
        View viewA = a();
        o(viewA);
        viewA.getClass();
        this.f70345c = new p(viewA);
        return k(t7);
    }

    @Override // fb2.e
    public final boolean k(T t7) {
        p pVar;
        t7.getClass();
        f.a(this.f70345c, "View decorator is not found. Please call initialize() first before calling update().");
        this.f70344b = t7;
        if (h(t7) && (pVar = (p) this.f70345c) != null) {
            TextView textView = pVar.f70369c;
            String strR = r();
            TextView textView2 = pVar.f70368b;
            if (TextUtils.isEmpty(strR)) {
                strR = "";
            }
            textView2.setText(strR);
            String strQ = q();
            textView.setText(TextUtils.isEmpty(strQ) ? "" : strQ);
            textView.setOnClickListener(new q1(p(), 4));
        }
        return h(t7);
    }

    public e23.a<Unit> p() {
        return null;
    }

    public String q() {
        return null;
    }

    public abstract String r();
}
