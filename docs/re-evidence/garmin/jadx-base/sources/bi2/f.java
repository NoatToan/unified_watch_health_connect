package bi2;

import android.app.AlertDialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import com.google.gson.stream.MalformedJsonException;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbi2/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei2/h;", "transform", "Lii2/b;", "settingsViewModel", "", "", "attributeMap", "<init>", "(Landroid/content/Context;Lei2/h;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei2.h f18137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii2.b f18138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f18139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hi2.d f18140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f18141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StyledTextView f18142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StyledTextView f18143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EditText f18144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StyledTextView f18145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StyledTextView f18146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StyledTextView f18147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f18149n;

    public f(Context context, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        context.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        this.f18136a = context;
        this.f18137b = hVar;
        this.f18138c = bVar;
        this.f18139d = map;
        this.f18140e = new hi2.d("BaseNumberInputDialog", null, 2, null);
        View viewInflate = View.inflate(context, R.layout.dsl_generic_number_input_view, null);
        viewInflate.getClass();
        this.f18141f = viewInflate;
        this.f18148m = -1;
        View viewFindViewById = viewInflate.findViewById(R.id.input_view_edit_text);
        viewFindViewById.getClass();
        this.f18144i = (EditText) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.input_view_title_text_view);
        viewFindViewById2.getClass();
        this.f18142g = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.input_view_unit_text_view);
        viewFindViewById3.getClass();
        this.f18145j = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.input_view_error_text_view);
        viewFindViewById4.getClass();
        this.f18147l = (StyledTextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.usage_description_text_view);
        viewFindViewById5.getClass();
        this.f18143h = (StyledTextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.input_view_use_default_button);
        viewFindViewById6.getClass();
        StyledTextView styledTextView = (StyledTextView) viewFindViewById6;
        this.f18146k = styledTextView;
        styledTextView.setText(styledTextView.getContext().getString(R.string.common_use_default));
        styledTextView.setOnClickListener(new a32.b(this, 14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object i(f fVar, AlertDialog alertDialog, v13.c cVar) throws MalformedJsonException {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f18109e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f18109e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar, cVar);
            }
        } else {
            bVar = new b(fVar, cVar);
        }
        Object objI = bVar.f18107c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f18109e;
        if (i15 == 0) {
            o13.r.b(objI);
            ei2.h hVar = fVar.f18137b;
            ii2.b bVar2 = fVar.f18138c;
            Map<String, Object> map = fVar.f18139d;
            bVar.f18105a = fVar;
            bVar.f18106b = alertDialog;
            bVar.f18109e = 1;
            objI = hVar.i(bVar2, map, 0);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            alertDialog = bVar.f18106b;
            fVar = bVar.f18105a;
            o13.r.b(objI);
        }
        HashMap map2 = (HashMap) objI;
        if (map2 == null) {
            throw new MalformedJsonException("BaseNumberInputDialog: Unable to parse metadata");
        }
        mh2.i iVar = mh2.i.DS_SELECTED_VALUE;
        String strValueOf = map2.containsKey(iVar.f118617a) ? String.valueOf(map2.get(iVar.f118617a)) : "";
        EditText editText = fVar.f18144i;
        editText.setText(strValueOf);
        editText.requestFocus();
        editText.setSelection(0, editText.getText().length());
        editText.setOnKeyListener(new a(fVar, editText, alertDialog, 0));
        editText.addTextChangedListener(new c(fVar));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public int getF18148m() {
        return this.f18148m;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public hi2.d getF18140e() {
        return this.f18140e;
    }

    public abstract int c();

    public abstract int d();

    public Object e(t13.d<? super String> dVar) {
        return "";
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract String h();

    public abstract void j();

    public abstract void k();

    public final void l() {
        ge1.b.T(o53.f0.w((androidx.lifecycle.n0) this.f18136a), null, null, new e(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    public final boolean m(Editable editable) {
        Integer numValueOf;
        if (editable != null) {
            try {
                String string = editable.toString();
                if (string != null) {
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                } else {
                    numValueOf = null;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return false;
        }
        int iIntValue = numValueOf.intValue();
        return iIntValue <= c() && d() <= iIntValue;
    }
}
