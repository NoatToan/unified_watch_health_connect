package g40;

import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg40/f;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f75776f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f75777g = f.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f75778a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f75780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.e f75781d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75779b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f75782e = "";

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String strReplace;
        LayoutInflater layoutInflater;
        Bundle arguments = getArguments();
        Double dValueOf = arguments != null ? Double.valueOf(arguments.getDouble("EXTRA_SPEED", 0.0d)) : null;
        Double dValueOf2 = arguments != null ? Double.valueOf(arguments.getDouble("EXTRA_MIN_ALLOWED_TYPING_RANGE", Double.MIN_VALUE)) : null;
        Double dValueOf3 = arguments != null ? Double.valueOf(arguments.getDouble("EXTRA_MAX_ALLOWED_TYPING_RANGE", Double.MAX_VALUE)) : null;
        x0 x0Var = x0.f105818a;
        boolean z14 = this.f75779b;
        this.f75780c = String.format(" (%.1f-%.1f %s)", Arrays.copyOf(new Object[]{dValueOf2, dValueOf3, getString(z14 ? R.string.kph : R.string.mph)}, 3));
        this.f75782e = k.g(arguments != null ? arguments.getString("EXTRA_TITLE", null) : null, this.f75780c);
        q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        m activity = getActivity();
        View viewInflate = (activity == null || (layoutInflater = activity.getLayoutInflater()) == null) ? null : layoutInflater.inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
        View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.dialog_edit_text) : null;
        viewFindViewById.getClass();
        EditText editText = (EditText) viewFindViewById;
        editText.setInputType(8194);
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            l3.f23124b.getClass();
            strReplace = l3.a.L0(dDoubleValue, q3Var, l3.f23130h).replace(CoreConstants.COMMA_CHAR, '.');
            strReplace.getClass();
        } else {
            strReplace = null;
        }
        editText.setText(strReplace);
        u20.f fVar = dValueOf3 != null ? new u20.f(0.0d, dValueOf3.doubleValue(), "(([0-9]+)?)((\\.)?([0-9][0-9]?)?)") : null;
        editText.setFilters(fVar != null ? new InputFilter[]{fVar} : null);
        if (strReplace != null && !TextUtils.isEmpty(strReplace)) {
            editText.setSelection(strReplace.length());
        }
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireActivity()).setTitle(this.f75782e).setCancelable(true).setView(viewInflate).setPositiveButton(R.string.lbl_done, new bi2.k(this, 13, editText, dValueOf2)).create();
        eVarCreate.getClass();
        Window window = eVarCreate.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        this.f75781d = eVarCreate;
        return eVarCreate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lg40/f$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_SPEED", "EXTRA_MIN_ALLOWED_TYPING_RANGE", "EXTRA_MAX_ALLOWED_TYPING_RANGE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
