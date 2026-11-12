package iv2;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.h;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Liv2/g;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Liv2/e;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "attributeMap", "<init>", "(Landroidx/fragment/app/Fragment;Liv2/e;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f95233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f95234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx2.c f95235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f95236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f95237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f95238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f95239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StyledTextView f95240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StyledTextView f95241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public StyledTextView f95242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StyledTextView f95243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f95244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f95245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f95246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f95247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f95248p;

    public g(Fragment fragment, e eVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        eVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f95233a = fragment;
        this.f95234b = eVar;
        this.f95235c = cVar;
        this.f95236d = map;
        this.f95237e = new h("IntegerInputView", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[Catch: NumberFormatException -> 0x0023, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0023, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0015), top: B:16:0x0003 }] */
    public final boolean a(Editable editable) {
        Integer numValueOf;
        int iIntValue;
        if (editable != null) {
            try {
                String string = editable.toString();
                if (string != null) {
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                    int i14 = this.f95245m;
                    if (iIntValue > this.f95246n && i14 <= iIntValue) {
                        return true;
                    }
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            numValueOf = null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
                int i15 = this.f95245m;
                if (iIntValue > this.f95246n) {
                }
            }
        }
        return false;
    }
}
