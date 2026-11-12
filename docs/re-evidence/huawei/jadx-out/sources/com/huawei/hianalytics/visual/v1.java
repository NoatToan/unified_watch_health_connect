package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.widget.NestedScrollView;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.openalliance.ad.constant.Constants;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f11708a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f11709b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11710c = false;
    public static final boolean d;
    public static Class e;
    public static Method f;
    public static SparseArray g;

    static {
        boolean z = false;
        try {
            try {
                Class.forName("android.support.v7.widget.RecyclerView");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Class.forName("androidx.recyclerview.widget.RecyclerView");
        }
        z = true;
        d = z;
        HashSet hashSet = f11709b;
        hashSet.add("androidx*appcompat*widget");
        hashSet.add("androidx*cardview*widget");
        hashSet.add("androidx*emoji*widget");
        hashSet.add("com*google*android*material");
        hashSet.add("android*support*design*widget");
        hashSet.add("android*support*text*emoji*widget");
        hashSet.add("android*widget");
        hashSet.add("android*support*v7*widget");
    }

    public static boolean a() {
        if (w.a().f()) {
            return true;
        }
        return w.a().a(EventType.VIEW_CLICK);
    }

    public static boolean c(Class cls) {
        if (cls == null) {
            return true;
        }
        try {
            Iterator it = w.a().a().iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static r1 f(View view) {
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            arrayList.add((ViewGroup) parent);
        }
        View view2 = (View) arrayList.get(arrayList.size() - 1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (!(view2 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        String str = "";
        String str2 = "";
        for (int size = arrayList.size() - 2; size >= 0; size--) {
            View view3 = (View) arrayList.get(size);
            r1 r1VarA = a(view3, viewGroup.indexOfChild(view3));
            if (r1VarA != null) {
                if (!TextUtils.isEmpty(r1VarA.e) && r1VarA.e.contains(Constants.LINK) && !TextUtils.isEmpty(str2) && (iIndexOf = sb.indexOf(Constants.LINK)) != -1) {
                    sb.replace(iIndexOf, iIndexOf + 1, str2);
                }
                sb2.append(r1VarA.f);
                sb.append(r1VarA.e);
                str2 = r1VarA.g;
                str = r1VarA.d;
            }
            if (!(view3 instanceof ViewGroup)) {
                break;
            }
            viewGroup = (ViewGroup) view3;
        }
        return new r1(view, e(view), "", str, sb.toString(), sb2.toString(), str2, false, b(view));
    }

    public static boolean g(View view) {
        Class cls;
        boolean zA = i1.a(view, "android.support.v7.widget.RecyclerView", "androidx.recyclerview.widget.RecyclerView");
        if (zA) {
            return zA;
        }
        return f11710c && view != null && (cls = e) != null && cls.isAssignableFrom(view.getClass());
    }

    public static boolean h(View view) {
        if (view == null) {
            return true;
        }
        try {
            Iterator it = w.a().a().iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(view.getClass())) {
                    return true;
                }
            }
            return "disabled".equals(view.getTag(R.id.hianalytics_view_disabled_user_tag));
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean i(View view) {
        if (view == null || view.getWindowVisibility() == 8) {
            return false;
        }
        if (y1.a(view.getClass())) {
            return true;
        }
        boolean localVisibleRect = view.getLocalVisibleRect(new Rect());
        if (view.getWidth() <= 0 || view.getHeight() <= 0 || view.getAlpha() <= 0.0f || !localVisibleRect) {
            return false;
        }
        return !(view.getVisibility() == 0 || view.getAnimation() == null || !view.getAnimation().getFillAfter()) || view.getVisibility() == 0;
    }

    public static String a(StringBuilder sb, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return sb.toString();
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    a(sb, (ViewGroup) childAt);
                } else if (!h(childAt)) {
                    String strC = c(childAt);
                    if (!TextUtils.isEmpty(strC)) {
                        sb.append(strC);
                        sb.append(Constants.LINK);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String e(View view) {
        int id;
        Context context;
        Resources resources;
        if (view == null) {
            return "";
        }
        String resourceEntryName = (String) view.getTag(R.id.hianalytics_view_id_tag);
        if (TextUtils.isEmpty(resourceEntryName) && (id = view.getId()) != -1 && ((-16777216) & id) != 0 && (id & HwColorPicker.MASK_RESULT_STATE) != 0 && (context = view.getContext()) != null && (resources = context.getResources()) != null) {
            resourceEntryName = resources.getResourceEntryName(view.getId());
        }
        return TextUtils.isEmpty(resourceEntryName) ? "" : resourceEntryName;
    }

    public static String c(View view) {
        Class clsA;
        String string;
        Method method;
        String string2 = "";
        if (view instanceof EditText) {
            return "";
        }
        try {
            clsA = i1.a("android.support.v7.widget.SwitchCompat");
        } catch (Exception unused) {
            clsA = null;
        }
        try {
            clsA = i1.a("androidx.appcompat.widget.SwitchCompat");
        } catch (Exception unused2) {
        }
        try {
            if (view instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) view;
                string = TextUtils.isEmpty(checkBox.getText()) ? "" : checkBox.getText().toString();
            } else if (clsA != null && clsA.isInstance(view)) {
                if (((CompoundButton) view).isChecked()) {
                    method = view.getClass().getMethod("getTextOn", new Class[0]);
                } else {
                    method = view.getClass().getMethod("getTextOff", new Class[0]);
                }
                string = (String) method.invoke(view, new Object[0]);
            } else if (view instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) view;
                if (radioButton.getText() != null) {
                    string = radioButton.getText().toString();
                }
            } else if (view instanceof ToggleButton) {
                ToggleButton toggleButton = (ToggleButton) view;
                if (toggleButton.isChecked()) {
                    if (toggleButton.getTextOn() != null) {
                        string = toggleButton.getTextOn().toString();
                    }
                } else if (toggleButton.getTextOff() != null) {
                    string = toggleButton.getTextOff().toString();
                }
            } else if (view instanceof Button) {
                Button button = (Button) view;
                if (button.getText() != null) {
                    string = button.getText().toString();
                }
            } else if (view instanceof CheckedTextView) {
                CheckedTextView checkedTextView = (CheckedTextView) view;
                if (checkedTextView.getText() != null) {
                    string = checkedTextView.getText().toString();
                }
            } else if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getText() != null) {
                    string = textView.getText().toString();
                }
            } else if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                if (imageView.getContentDescription() != null) {
                    string = imageView.getContentDescription().toString();
                }
            } else if (view.getContentDescription() != null) {
                string = view.getContentDescription().toString();
            }
            try {
                if (TextUtils.isEmpty(string) && (view instanceof TextView)) {
                    TextView textView2 = (TextView) view;
                    if (textView2.getHint() != null) {
                        string2 = textView2.getHint().toString();
                    }
                    string = string2;
                }
            } catch (Exception unused3) {
                string2 = string;
            }
        } catch (Exception unused4) {
        }
        return a(string);
    }

    /* JADX WARN: Code duplicated, block: B:189:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150 A[PHI: r1
      0x0150: PHI (r1v74 java.lang.String) = 
      (r1v54 java.lang.String)
      (r1v56 java.lang.String)
      (r1v58 java.lang.String)
      (r1v60 java.lang.String)
      (r1v62 java.lang.String)
      (r1v73 java.lang.String)
      (r1v87 java.lang.String)
     binds: [B:64:0x014e, B:58:0x012c, B:52:0x010a, B:46:0x00e8, B:40:0x00c5, B:11:0x003c, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static r1 d(View view) {
        String strA;
        String string;
        String str;
        String strSubstring;
        Class clsA;
        String string2;
        if (view instanceof CheckBox) {
            strA = a("", "CheckBox");
            CheckBox checkBox = (CheckBox) view;
            if (TextUtils.isEmpty(checkBox.getText())) {
                strSubstring = "";
            } else {
                strSubstring = checkBox.getText().toString();
            }
            str = strA;
            string = strSubstring;
        } else if (view instanceof RadioButton) {
            strA = a("", "RadioButton");
            RadioButton radioButton = (RadioButton) view;
            if (TextUtils.isEmpty(radioButton.getText())) {
                strSubstring = "";
            } else {
                strSubstring = radioButton.getText().toString();
            }
            str = strA;
            string = strSubstring;
        } else {
            if (view instanceof ToggleButton) {
                strA = a("", "ToggleButton");
                strSubstring = a(view);
            } else if (view instanceof CompoundButton) {
                if (view == null) {
                    strA = "";
                } else {
                    strA = x1.a().a(view.getClass());
                    Class clsA2 = i1.a("android.widget.Switch");
                    if (clsA2 != null && clsA2.isInstance(view)) {
                        strA = a(strA, "Switch");
                    } else {
                        Class clsA3 = i1.a("android.support.v7.widget.SwitchCompat");
                        if (clsA3 != null && clsA3.isInstance(view)) {
                            strA = a(strA, "SwitchCompat");
                        } else {
                            Class clsA4 = i1.a("androidx.appcompat.widget.SwitchCompat");
                            if (clsA4 != null && clsA4.isInstance(view)) {
                                strA = a(strA, "SwitchCompat");
                            }
                        }
                    }
                }
                strSubstring = a(view);
            } else if (view instanceof Button) {
                strA = a("", "Button");
                Button button = (Button) view;
                if (TextUtils.isEmpty(button.getText())) {
                    strSubstring = "";
                } else {
                    strSubstring = button.getText().toString();
                }
            } else if (view instanceof CheckedTextView) {
                strA = a("", "CheckedTextView");
                CheckedTextView checkedTextView = (CheckedTextView) view;
                if (TextUtils.isEmpty(checkedTextView.getText())) {
                    strSubstring = "";
                } else {
                    strSubstring = checkedTextView.getText().toString();
                }
            } else if (view instanceof EditText) {
                strA = a("", "EditText");
                EditText editText = (EditText) view;
                if (TextUtils.isEmpty(editText.getHint())) {
                    strSubstring = "";
                } else {
                    strSubstring = editText.getHint().toString();
                }
            } else if (view instanceof TextView) {
                strA = a("", "TextView");
                TextView textView = (TextView) view;
                if (TextUtils.isEmpty(textView.getText())) {
                    strSubstring = "";
                } else {
                    strSubstring = textView.getText().toString();
                }
            } else if (view instanceof ImageView) {
                strA = a("", "ImageView");
                ImageView imageView = (ImageView) view;
                if (TextUtils.isEmpty(imageView.getContentDescription())) {
                    strSubstring = "";
                } else {
                    strSubstring = imageView.getContentDescription().toString();
                }
            } else if (view instanceof RatingBar) {
                strA = a("", "RatingBar");
                strSubstring = String.valueOf(((RatingBar) view).getRating());
            } else if (view instanceof SeekBar) {
                strA = a("", "SeekBar");
                strSubstring = String.valueOf(((SeekBar) view).getProgress());
            } else if (view instanceof Spinner) {
                strA = a("", "Spinner");
                Spinner spinner = (Spinner) view;
                Object selectedItem = spinner.getSelectedItem();
                if (selectedItem instanceof String) {
                    strSubstring = (String) selectedItem;
                } else {
                    View selectedView = spinner.getSelectedView();
                    if (selectedView instanceof TextView) {
                        TextView textView2 = (TextView) selectedView;
                        if (textView2.getText() != null) {
                            strSubstring = textView2.getText().toString();
                        }
                    }
                    str = strA;
                    string = "";
                }
            } else {
                Class clsA5 = i1.a(new String[]{"android.support.design.widget.TabLayout$TabView", "com.google.android.material.tabs.TabLayout$TabView"});
                Object objA = (clsA5 == null || !clsA5.isAssignableFrom(view.getClass())) ? null : i1.a(clsA5, view, "mTab", "tab");
                if (objA != null) {
                    String strA2 = a("", "TabLayout");
                    try {
                        Class clsA6 = i1.a(new String[]{"android.support.design.widget.TabLayout$Tab", "com.google.android.material.tabs.TabLayout$Tab"});
                        if (clsA6 == null) {
                            string = "";
                        } else {
                            Object objA2 = i1.a(objA, "getText", new Object[0]);
                            string = objA2 != null ? objA2.toString() : "";
                            try {
                                View view2 = (View) i1.a(clsA6, objA, "mCustomView", "customView");
                                if (view2 != null && (view2 instanceof ViewGroup)) {
                                    string = a(new StringBuilder(), (ViewGroup) view2);
                                    if (!TextUtils.isEmpty(string)) {
                                        strSubstring = string.substring(0, string.length() - 1);
                                        strA = strA2;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    str = strA2;
                } else if (i1.a(view, "com.google.android.material.bottomnavigation.BottomNavigationItemView", "android.support.design.internal.NavigationMenuItemView")) {
                    Object objA3 = i1.a(view, "getItemData", new Object[0]);
                    if (objA3 == null || (clsA = i1.a(new String[]{"androidx.appcompat.view.menu.MenuItemImpl"})) == null) {
                        string = "";
                        str = string;
                    } else {
                        strSubstring = (String) i1.a(clsA, objA3, "mTitle");
                        strA = "";
                    }
                } else if (i1.a(view, "android.support.design.widget.NavigationView", "com.google.android.material.navigation.NavigationView")) {
                    strA = a("", "NavigationView");
                    strSubstring = (view == null || view.getWindowVisibility() == 8 || (!y1.a(view.getClass()) && (view.getWidth() <= 0 || view.getHeight() <= 0 || view.getAlpha() <= 0.0f || !view.getLocalVisibleRect(new Rect()) || ((view.getVisibility() == 0 || view.getAnimation() == null || !view.getAnimation().getFillAfter()) && view.getVisibility() != 0)))) ? "Close" : "Open";
                } else if (view instanceof RadioGroup) {
                    strA = a("", "RadioGroup");
                    RadioGroup radioGroup = (RadioGroup) view;
                    View viewFindViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                    if (viewFindViewById instanceof RadioButton) {
                        RadioButton radioButton2 = (RadioButton) viewFindViewById;
                        if (radioButton2.getText() != null) {
                            strSubstring = radioButton2.getText().toString();
                        }
                    }
                    str = strA;
                    string = "";
                } else if (view instanceof ViewGroup) {
                    String strA3 = x1.a().a(view.getClass());
                    Class clsA7 = i1.a("android.support.v7.widget.CardView");
                    if (clsA7 != null && clsA7.isInstance(view)) {
                        strA = a(strA3, "CardView");
                    } else {
                        Class clsA8 = i1.a("androidx.cardview.widget.CardView");
                        if (clsA8 != null && clsA8.isInstance(view)) {
                            strA = a(strA3, "CardView");
                        } else {
                            Class clsA9 = i1.a("android.support.design.widget.NavigationView");
                            if (clsA9 != null && clsA9.isInstance(view)) {
                                strA = a(strA3, "NavigationView");
                            } else {
                                Class clsA10 = i1.a("com.google.android.material.navigation.NavigationView");
                                strA = (clsA10 == null || !clsA10.isInstance(view)) ? strA3 : a(strA3, "NavigationView");
                            }
                        }
                    }
                    String string3 = TextUtils.isEmpty(view.getContentDescription()) ? "" : view.getContentDescription().toString();
                    if (TextUtils.isEmpty(string3)) {
                        string3 = a(new StringBuilder(), (ViewGroup) view);
                        if (!TextUtils.isEmpty(string3)) {
                            strSubstring = string3.substring(0, string3.length() - 1);
                        }
                    }
                    string = string3;
                    str = strA;
                } else {
                    string = "";
                    str = string;
                }
            }
            str = strA;
            string = strSubstring;
        }
        if (TextUtils.isEmpty(string) && (view instanceof TextView)) {
            TextView textView3 = (TextView) view;
            string = TextUtils.isEmpty(textView3.getHint()) ? "" : textView3.getHint().toString();
        }
        if (TextUtils.isEmpty(string)) {
            string2 = TextUtils.isEmpty(view.getContentDescription()) ? "" : view.getContentDescription().toString();
        } else {
            string2 = string;
        }
        x1.a().a(view, str);
        return new r1(null, null, str, string2, null, null, null, false, b(view));
    }

    public static String b(View view) {
        if (view == null) {
            return "";
        }
        if (view instanceof CheckBox) {
            return String.valueOf(((CheckBox) view).isChecked());
        }
        if (view instanceof RadioButton) {
            return String.valueOf(((RadioButton) view).isChecked());
        }
        if (view instanceof ToggleButton) {
            return String.valueOf(((ToggleButton) view).isChecked());
        }
        if (view instanceof CompoundButton) {
            return String.valueOf(((CompoundButton) view).isChecked());
        }
        return view instanceof CheckedTextView ? String.valueOf(((CheckedTextView) view).isChecked()) : "";
    }

    public static String b(Class cls) {
        String strB = x1.a().b(cls);
        if (!d && !f11710c && strB != null && strB.contains("RecyclerView")) {
            try {
                if (a(cls) != null && f != null) {
                    e = cls;
                    f11710c = true;
                }
            } catch (Exception unused) {
            }
        }
        return strB;
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String strReplace = str.replace(".", "*");
            Iterator it = f11709b.iterator();
            while (it.hasNext()) {
                if (strReplace.startsWith((String) it.next())) {
                }
            }
            return str;
        }
        return str2;
    }

    public static r1 a(Activity activity, View view, JSONObject jSONObject) {
        r1 r1VarA;
        if (activity == null || view == null || w.a().f()) {
            return null;
        }
        if (w.a().i(activity.getClass())) {
            return null;
        }
        try {
            a0 a0VarA = a0.a();
            a0VarA.getClass();
            try {
                r1VarA = a0VarA.a(view, false);
            } catch (Exception unused) {
                HiLog.w("HAViewNodeService", "fail to get view node");
                r1VarA = null;
            }
            if (r1VarA == null) {
                return null;
            }
            if (w.a().i()) {
                HiLog.d("ViewUtils", "viewPath: " + r1VarA.e);
                jSONObject.put("$view_path", r1VarA.e);
            }
            jSONObject.put("$view_position", r1VarA.g);
            return r1VarA;
        } catch (Exception e2) {
            d0.a(e2, new StringBuilder("fail to acquire view path and selector, ex: "), "ViewUtils");
            return null;
        }
    }

    public static Class a(Class cls) {
        while (cls != null && !cls.equals(ViewGroup.class)) {
            try {
                f = cls.getMethod("getChildAdapterPosition", View.class);
            } catch (NoSuchMethodException unused) {
            }
            if (f == null) {
                try {
                    f = cls.getMethod("getChildPosition", View.class);
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (f != null) {
                return cls;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a9 -> B:37:0x00aa). Please report as a decompilation issue!!! */
    public static r1 a(View view, int i) {
        int iIntValue;
        String str;
        String string;
        String str2;
        boolean z;
        int i2;
        Object objInvoke;
        Object objInvoke2;
        int i3 = -1;
        if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            iIntValue = i;
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (!i1.a(viewGroup, "androidx.viewpager.widget.ViewPager") && !i1.a(viewGroup, "android.support.v4.view.ViewPager")) {
                if (viewGroup instanceof AdapterView) {
                    iIntValue = ((AdapterView) viewGroup).getFirstVisiblePosition() + i;
                } else if (g(viewGroup)) {
                    try {
                        if (g(viewGroup)) {
                            try {
                                f = viewGroup.getClass().getMethod("getChildAdapterPosition", View.class);
                            } catch (Exception unused) {
                            }
                            if (f == null) {
                                try {
                                    f = viewGroup.getClass().getMethod("getChildPosition", View.class);
                                } catch (Exception unused2) {
                                }
                            }
                            Method method = f;
                            if (method == null || (objInvoke = method.invoke(viewGroup, view)) == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = ((Integer) objInvoke).intValue();
                            }
                        } else if (f11710c && viewGroup.getClass() == e && (objInvoke2 = f.invoke(viewGroup, view)) != null) {
                            iIntValue = ((Integer) objInvoke2).intValue();
                        } else {
                            iIntValue = -1;
                        }
                    } catch (Exception unused3) {
                    }
                    if (iIntValue < 0) {
                        iIntValue = i;
                    }
                } else {
                    iIntValue = i;
                }
            } else {
                try {
                    Object objInvoke3 = viewGroup.getClass().getMethod("getCurrentItem", new Class[0]).invoke(viewGroup, new Object[0]);
                    iIntValue = objInvoke3 != null ? ((Integer) objInvoke3).intValue() : -1;
                } catch (Exception unused4) {
                }
            }
        }
        Object parent = view.getParent();
        if (parent == null || y1.a(view.getClass()) || !(parent instanceof View)) {
            return null;
        }
        String strB = b(view.getClass());
        View view2 = (View) parent;
        Object parent2 = view2.getParent();
        if (parent2 instanceof View) {
            View view3 = (View) parent2;
            if (g == null) {
                g = new SparseArray();
            }
            str = (String) g.get(view3.hashCode());
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (view2 instanceof ExpandableListView) {
            ExpandableListView expandableListView = (ExpandableListView) view2;
            long expandableListPosition = expandableListView.getExpandableListPosition(iIntValue);
            if (ExpandableListView.getPackedPositionType(expandableListPosition) != 2) {
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (packedPositionChild != -1) {
                    Locale locale = Locale.ENGLISH;
                    string = packedPositionGroup + ":" + packedPositionChild;
                    sb2.append((CharSequence) sb);
                    sb2.append("/ELVG[");
                    sb2.append(packedPositionGroup);
                    sb2.append("]/ELVC[-]/");
                    sb2.append(strB);
                    sb2.append("[0]");
                    sb.append("/ELVG[");
                    sb.append(packedPositionGroup);
                    sb.append("]/ELVC[");
                    sb.append(packedPositionChild);
                    sb.append("]/");
                    sb.append(strB);
                    sb.append("[0]");
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(packedPositionGroup);
                    string = sb3.toString();
                    sb2.append((CharSequence) sb);
                    sb2.append("/ELVG[-]/");
                    sb2.append(strB);
                    sb2.append("[0]");
                    sb.append("/ELVG[");
                    sb.append(packedPositionGroup);
                    sb.append("]/");
                    sb.append(strB);
                    sb.append("[0]");
                }
                str2 = string;
                z = true;
            } else {
                if (iIntValue < expandableListView.getHeaderViewsCount()) {
                    sb.append("/ELH[");
                    sb.append(iIntValue);
                    sb.append("]/");
                    sb.append(strB);
                    sb.append("[0]");
                    sb2.append("/ELH[");
                    sb2.append(iIntValue);
                    sb2.append("]/");
                    sb2.append(strB);
                    sb2.append("[0]");
                } else {
                    int count = iIntValue - (expandableListView.getCount() - expandableListView.getFooterViewsCount());
                    sb.append("/ELF[");
                    sb.append(count);
                    sb.append("]/");
                    sb.append(strB);
                    sb.append("[0]");
                    sb2.append("/ELF[");
                    sb2.append(count);
                    sb2.append("]/");
                    sb2.append(strB);
                    sb2.append("[0]");
                }
                str2 = str;
                z = false;
            }
        } else if (!(view2 instanceof AdapterView) && !g(view2) && !i1.a(view2, "androidx.viewpager.widget.ViewPager") && !i1.a(view2, "android.support.v4.view.ViewPager")) {
            if (i1.a(view2, "android.support.v4.widget.SwipeRefreshLayout", "androidx.swiperefreshlayout.widget.SwipeRefreshLayout")) {
                sb.append("/");
                sb.append(strB);
                sb.append("[0]");
                sb2.append("/");
                sb2.append(strB);
                sb2.append("[0]");
            } else {
                Object obj = null;
                Object objA = t.a(view2, (Activity) null);
                Object objA2 = t.a(view, (Activity) null);
                if (objA == null && objA2 != null) {
                    obj = objA2;
                }
                if (obj != null) {
                    String strB2 = b(obj.getClass());
                    sb.append("/");
                    sb.append(strB2);
                    sb.append("[0]");
                    sb2.append("/");
                    sb2.append(strB2);
                    sb2.append("[0]");
                } else {
                    try {
                        if (parent instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) parent;
                            String strE = e(view);
                            String strA = x1.a().a(view.getClass());
                            int i4 = 0;
                            for (int i5 = 0; i5 < viewGroup2.getChildCount(); i5++) {
                                View childAt = viewGroup2.getChildAt(i5);
                                HashSet hashSet = i1.f11653a;
                                Class<?> superclass = childAt.getClass();
                                String strA2 = x1.a().a(superclass);
                                while (strA2 != null) {
                                    if (strA2.equals(strA)) {
                                        if (((view instanceof RelativeLayout) || (view instanceof LinearLayout)) && (!childAt.isShown() || !i(childAt) || (childAt instanceof Spinner))) {
                                            break;
                                            break;
                                            break;
                                        }
                                        String strE2 = e(childAt);
                                        if ((strE == null || strE.equals(strE2)) && childAt == view) {
                                            break;
                                        }
                                        i4++;
                                        break;
                                    }
                                    if (superclass == Object.class || (superclass = superclass.getSuperclass()) == null) {
                                        break;
                                        break;
                                    }
                                    strA2 = x1.a().a(superclass);
                                }
                            }
                            i3 = i4;
                        }
                    } catch (Exception unused5) {
                    }
                    sb.append("/");
                    sb.append(strB);
                    sb.append("[");
                    sb.append(i3);
                    sb.append("]");
                    sb2.append("/");
                    sb2.append(strB);
                    sb2.append("[");
                    sb2.append(i3);
                    sb2.append("]");
                }
            }
            str2 = str;
            z = false;
        } else {
            Locale locale3 = Locale.ENGLISH;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(iIntValue);
            string = sb4.toString();
            sb2.append((CharSequence) sb);
            sb2.append("/ELVG[-]/");
            sb2.append(strB);
            sb2.append("[0]");
            sb.append("/ELVG[");
            sb.append(iIntValue);
            sb.append("]/");
            sb.append(strB);
            sb.append("[0]");
            str2 = string;
            z = true;
        }
        if (y1.a(view2.getClass())) {
            if (sb.length() > 0) {
                i2 = 0;
                sb.deleteCharAt(0);
            } else {
                i2 = 0;
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(i2);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (g == null) {
                g = new SparseArray();
            }
            g.put(view2.hashCode(), str2);
        }
        r1 r1VarD = d(view);
        return new r1(view, e(view), r1VarD.f11691c, r1VarD.d, sb2.toString(), sb.toString(), str2, z, b(view));
    }

    public static String a(View view) {
        Method method;
        try {
            if (((CompoundButton) view).isChecked()) {
                method = view.getClass().getMethod("getTextOn", new Class[0]);
            } else {
                method = view.getClass().getMethod("getTextOff", new Class[0]);
            }
            Object objInvoke = method.invoke(view, new Object[0]);
            return objInvoke != null ? (String) objInvoke : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll("[0-9]", "*");
    }

    public static ArrayList a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                arrayList.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(a((ViewGroup) childAt));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:37:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0012 A[SYNTHETIC] */
    public static String a(ArrayList arrayList, Activity activity) {
        int iIntValue;
        int measuredHeight;
        NestedScrollView nestedScrollView;
        int i = activity.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        Iterator it = arrayList.iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                measuredHeight = i;
                break;
            }
            View view = (View) it.next();
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (scrollView.getChildAt(0) != null && scrollView.getChildAt(0).getMeasuredHeight() >= i) {
                    measuredHeight = scrollView.getChildAt(0).getMeasuredHeight();
                    if (view.getTag(R.id.hianalytics_scroll_view_tag) == null) {
                        break;
                    }
                    iIntValue = ((Integer) view.getTag(R.id.hianalytics_scroll_view_tag)).intValue();
                    break;
                }
                if (view instanceof NestedScrollView) {
                    nestedScrollView = (NestedScrollView) view;
                    if (nestedScrollView.getChildAt(0) != null && nestedScrollView.getChildAt(0).getMeasuredHeight() >= i) {
                        measuredHeight = nestedScrollView.getChildAt(0).getMeasuredHeight();
                        if (view.getTag(R.id.hianalytics_scroll_view_tag) == null) {
                            break;
                        }
                        iIntValue = ((Integer) view.getTag(R.id.hianalytics_scroll_view_tag)).intValue();
                        break;
                    }
                }
            } else if (view instanceof NestedScrollView) {
                nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.getChildAt(0) != null) {
                    continue;
                }
            }
        }
        if (measuredHeight == 0) {
            return "";
        }
        float f2 = ((i + iIntValue) * 100.0f) / measuredHeight;
        try {
            f2 = Float.parseFloat(new DecimalFormat("#.##").format(f2));
        } catch (NumberFormatException unused) {
            HiLog.i("ViewUtils", "format percent 2 digit failed, direct use false");
        }
        return f2 + "%";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k1 a(AdapterView adapterView, View view, Class cls) {
        if (c(cls)) {
            return null;
        }
        Context context = adapterView instanceof Context ? (Context) adapterView : null;
        if (view != null) {
            if (h(view)) {
                return null;
            }
            if (context == null && (context = view.getContext()) == null) {
                return null;
            }
        }
        Activity activityA = o0.a(context, view);
        if (activityA != null) {
            if (w.a().i(activityA.getClass())) {
                return null;
            }
        }
        Object objA = t.a(view, activityA);
        if (objA != null) {
            if (w.a().b(objA.getClass())) {
                return null;
            }
        }
        return new k1(activityA, objA);
    }

    public static boolean a(Object obj) {
        Long l;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = f11708a;
        if (map.containsKey(Integer.valueOf(obj.hashCode())) && (l = (Long) map.get(Integer.valueOf(obj.hashCode()))) != null) {
            map.put(Integer.valueOf(obj.hashCode()), Long.valueOf(jElapsedRealtime));
            return jElapsedRealtime - l.longValue() < 500;
        }
        map.put(Integer.valueOf(obj.hashCode()), Long.valueOf(jElapsedRealtime));
        return false;
    }
}
