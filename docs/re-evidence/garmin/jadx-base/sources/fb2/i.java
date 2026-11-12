package fb2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f70353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f70355g;

    public i(Context context, int i14, String str, String str2) {
        super(context);
        this.f70353e = i14;
        this.f70354f = str;
        this.f70355g = str2;
    }

    public static /* synthetic */ void p(i iVar, Object obj, CharSequence charSequence) {
        iVar.v(obj, charSequence != null ? charSequence.toString() : null);
        iVar.setChanged();
        iVar.notifyObservers(charSequence);
    }

    @Override // fb2.e
    @SuppressLint({"InflateParams"})
    public final View a() {
        if (this.f70352d == null) {
            View viewInflate = LayoutInflater.from(this.f70343a).inflate(R.layout.gcm3_input_field, (ViewGroup) null);
            this.f70352d = viewInflate;
            viewInflate.findViewById(R.id.inputField).setId(s());
            this.f70352d.findViewById(R.id.infoMessage).setId(r());
        }
        return this.f70352d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        EditText editText = (EditText) cVar.findViewById(s());
        if (editText != null) {
            return t(editText, cVar.findViewById(r()), t7);
        }
        View viewA = a();
        return viewA != null && t(viewA.findViewById(s()), viewA.findViewById(r()), t7);
    }

    @Override // fb2.e
    public final boolean k(T t7) {
        f.a(t7, "Model is required.");
        f.a(this.f70345c, "ViewDecorator is required.");
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH) {
            j jVar = (j) this.f70345c;
            String strQ = q(t7);
            EditText editText = jVar.f70356b;
            if (strQ == null) {
                strQ = "";
            }
            editText.setText(strQ);
            editText.setSelection(strQ.length());
        }
        return zH;
    }

    public abstract String q(T t7);

    public abstract int r();

    public abstract int s();

    public final boolean t(View view2, View view3, T t7) {
        String str;
        j jVar = new j(view2, view3, this.f70353e, 49152, new com.google.android.exoplayer2.analytics.q(18, this, t7));
        String str2 = this.f70354f;
        if (str2 != null) {
            jVar.f70356b.setHint(str2);
        }
        TextView textView = jVar.f70357c;
        if (textView != null && (str = this.f70355g) != null) {
            textView.setText(str);
        }
        this.f70345c = jVar;
        if (u()) {
            ((EditText) view2).setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f70353e), new InputFilter.AllCaps()});
        }
        return k(t7);
    }

    public abstract boolean u();

    public abstract void v(Object obj, String str);

    public i(Context context, int i14) {
        this(context, i14, null);
    }

    public i(Context context, int i14, String str) {
        this(context, i14, str, null);
    }

    public i(Context context) {
        this(context, 50);
    }
}
