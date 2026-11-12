package hv2;

import android.content.Context;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.h;
import gw2.i;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhv2/f;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lhv2/e;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "viewAttrs", "<init>", "(Landroidx/fragment/app/Fragment;Lhv2/e;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f85909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f85910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx2.c f85911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ? extends Object> f85912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f85913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f85914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85917i;

    public f(Fragment fragment, e eVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        eVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f85909a = fragment;
        this.f85910b = eVar;
        this.f85911c = cVar;
        this.f85912d = map;
        this.f85913e = new h("HeightPicker", null, 2, null);
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this.f85914f = contextRequireContext;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x018c  */
    public final void a(int i14, NumberPicker numberPicker, StyledTextView styledTextView) {
        HashMap map;
        int iIntValue;
        this.f85913e.getClass();
        e eVar = this.f85910b;
        Context context = eVar.f207282a;
        d dVarH4 = this.f85911c.H4(this.f85912d);
        if (dVarH4 != null) {
            Integer num = dVarH4.f85906b;
            map = new HashMap();
            String str = dVarH4.f85907c;
            eVar.f85908c.getClass();
            if (i14 != 1) {
                if (i14 == 2 && !s.g(str, "METRIC") && s.g(str, "STATUTE")) {
                    map.put(i.RTS_MINIMUM_VALUE.f79975a, 0);
                    map.put(i.RTS_MAXIMUM_VALUE.f79975a, 11);
                    map.put(i.RTS_MAXIMUM_VALUE_FOR_DEPENDENCY.f79975a, 4);
                    map.put(i.RTS_SELECTED_VALUE.f79975a, Integer.valueOf((num != null ? num.intValue() : -1) % 12));
                    map.put(i.RTS_LABEL_VALUE.f79975a, context.getString(R.string.lbl_inch));
                }
            } else if (s.g(str, "METRIC")) {
                map.put(i.RTS_MINIMUM_VALUE.f79975a, 30);
                map.put(i.RTS_MAXIMUM_VALUE.f79975a, 254);
                map.put(i.RTS_SELECTED_VALUE.f79975a, Integer.valueOf(num != null ? num.intValue() : -1));
                map.put(i.RTS_LABEL_VALUE.f79975a, context.getString(R.string.lbl_cm));
            } else if (s.g(str, "STATUTE")) {
                map.put(i.RTS_MINIMUM_VALUE.f79975a, 1);
                map.put(i.RTS_MAXIMUM_VALUE.f79975a, 8);
                int iIntValue2 = num != null ? num.intValue() : -1;
                cx2.b.f56665a.getClass();
                map.put(i.RTS_SELECTED_VALUE.f79975a, Integer.valueOf(iIntValue2 / 12));
                map.put(i.RTS_LABEL_VALUE.f79975a, context.getString(R.string.lbl_foot));
            }
        } else {
            map = null;
        }
        if (map != null) {
            i iVar = i.RTS_MINIMUM_VALUE;
            if (map.containsKey(iVar.f79975a)) {
                i iVar2 = i.RTS_MAXIMUM_VALUE;
                if (map.containsKey(iVar2.f79975a)) {
                    Object obj = map.get(iVar.f79975a);
                    obj.getClass();
                    numberPicker.setMinValue(((Integer) obj).intValue());
                    Object obj2 = map.get(iVar2.f79975a);
                    obj2.getClass();
                    Integer num2 = (Integer) obj2;
                    int iIntValue3 = num2.intValue();
                    if (i14 == 1) {
                        this.f85915g = iIntValue3;
                    } else {
                        this.f85916h = iIntValue3;
                    }
                    numberPicker.setMaxValue(num2.intValue());
                    i iVar3 = i.RTS_SELECTED_VALUE;
                    if (map.containsKey(iVar3.f79975a)) {
                        Object obj3 = map.get(iVar3.f79975a);
                        obj3.getClass();
                        numberPicker.setValue(((Integer) obj3).intValue());
                    }
                    if (i14 == 2) {
                        i iVar4 = i.RTS_MAXIMUM_VALUE_FOR_DEPENDENCY;
                        if (map.containsKey(iVar4.f79975a)) {
                            Object obj4 = map.get(iVar4.f79975a);
                            obj4.getClass();
                            iIntValue = ((Integer) obj4).intValue();
                        } else {
                            iIntValue = this.f85916h;
                        }
                        this.f85917i = iIntValue;
                    }
                } else {
                    numberPicker.setVisibility(8);
                }
            } else {
                numberPicker.setVisibility(8);
            }
            i iVar5 = i.RTS_LABEL_VALUE;
            if (map.containsKey(iVar5.f79975a)) {
                Object obj5 = map.get(iVar5.f79975a);
                obj5.getClass();
                styledTextView.setText((String) obj5);
            }
        }
    }
}
