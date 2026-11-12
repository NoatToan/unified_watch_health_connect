package com.huawei.hianalytics.visual.autocollect.instrument;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.ToggleButton;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.R;
import com.huawei.hianalytics.visual.h1;
import com.huawei.hianalytics.visual.i1;
import com.huawei.hianalytics.visual.j1;
import com.huawei.hianalytics.visual.k0;
import com.huawei.hianalytics.visual.k1;
import com.huawei.hianalytics.visual.o0;
import com.huawei.hianalytics.visual.r1;
import com.huawei.hianalytics.visual.t;
import com.huawei.hianalytics.visual.v1;
import com.huawei.hianalytics.visual.w;
import com.huawei.hianalytics.visual.y1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ViewClickInstrumentation {
    public static void a(View view) {
        k1 k1VarA;
        boolean zIsPressed = view.isPressed();
        if (v1.a() || v1.h(view) || v1.a((Object) view)) {
            return;
        }
        if ((((view instanceof CheckBox) || (view instanceof RadioButton) || (view instanceof ToggleButton) || (view instanceof CompoundButton) || (view instanceof RatingBar)) && !zIsPressed) || k0.a(view) || (k1VarA = v1.a((AdapterView) null, view, view.getClass())) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_id", v1.e(view));
            jSONObject.put("$event_name", v1.e(view));
            String strB = v1.b(view);
            if (!TextUtils.isEmpty(strB)) {
                jSONObject.put("$view_checked", strB);
            }
            r1 r1VarD = v1.d(view);
            jSONObject.put("$view_type", r1VarD.f11691c);
            jSONObject.put("$view_content", v1.a(r1VarD.d));
            i1.a(o0.b(k1VarA.f11657a), jSONObject);
            i1.a(t.a(k1VarA.f11657a, k1VarA.f11658b), jSONObject);
            a(view, jSONObject);
            w.a().a(jSONObject, v1.a(k1VarA.f11657a, view, jSONObject));
        } catch (Exception unused) {
            HiLog.w("HAVCI", "fail to report click event");
        }
    }

    public static void childClickOnExpandableListView(ExpandableListView expandableListView, View view, int i, int i2) {
        groupClickOnExpandableListView(expandableListView, view, -1);
    }

    public static void clickOnDialog(final DialogInterface dialogInterface, final int i) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(dialogInterface, i);
            }
        });
    }

    public static void clickOnDrawerClosed(View view) {
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_content", "Close");
            w.a().a(view, jSONObject);
            clickOnView(view);
        } catch (Exception unused) {
            HiLog.w("HAVCI", "fail to report drawer closed click data");
        }
    }

    public static void clickOnDrawerOpened(View view) {
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_content", "Open");
            w.a().a(view, jSONObject);
            clickOnView(view);
        } catch (Exception unused) {
            HiLog.w("HAVCI", "fail to report drawer opened click data");
        }
    }

    public static void clickOnListView(final AdapterView<?> adapterView, final View view, int i) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(adapterView, view);
            }
        });
    }

    public static void clickOnMenuItem(MenuItem menuItem) {
        clickOnMenuItem(null, menuItem);
    }

    public static void clickOnRadioGroup(final RadioGroup radioGroup, final int i) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(radioGroup, i);
            }
        });
    }

    public static void clickOnTabHost(String str) {
        h1.a().execute(new j1(str));
    }

    public static void clickOnView(final View view) {
        if (view == null) {
            return;
        }
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(view);
            }
        });
    }

    public static void groupClickOnExpandableListView(final ExpandableListView expandableListView, final View view, int i) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(expandableListView, view);
            }
        });
    }

    public static void selectClickOnTabLayout(final Object obj, final Object obj2) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(obj, obj2);
            }
        });
    }

    public static void clickOnMenuItem(final Object obj, final MenuItem menuItem) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.autocollect.instrument.ViewClickInstrumentation$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ViewClickInstrumentation.a(menuItem, obj);
            }
        });
    }

    public static void a(ExpandableListView expandableListView, View view) {
        k1 k1VarA;
        String strC;
        if (expandableListView == null || view == null || v1.a() || v1.h(expandableListView) || v1.c(ExpandableListView.class) || v1.h(view) || v1.a((Object) view) || (k1VarA = v1.a((AdapterView) null, expandableListView, ExpandableListView.class)) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_type", "ExpandableListView");
            String strE = v1.e(view);
            jSONObject.put("$view_id", strE);
            jSONObject.put("$event_name", strE);
            if (view instanceof ViewGroup) {
                strC = v1.a(new StringBuilder(), (ViewGroup) view);
                if (!TextUtils.isEmpty(strC)) {
                    strC = strC.substring(0, strC.length() - 1);
                }
            } else {
                strC = v1.c(view);
            }
            jSONObject.put("$view_content", v1.a(strC));
            i1.a(o0.b(k1VarA.f11657a), jSONObject);
            i1.a(t.a(k1VarA.f11657a, k1VarA.f11658b), jSONObject);
            r1 r1VarA = v1.a(k1VarA.f11657a, view, jSONObject);
            JSONObject jSONObject2 = (JSONObject) view.getTag(R.id.hianalytics_view_custom_property_tag);
            if (jSONObject2 != null) {
                jSONObject.put("$custom_property", jSONObject2);
            }
            w.a().a(jSONObject, r1VarA);
        } catch (Exception unused) {
            HiLog.w("HAVCI", "fail to report click on ExpandableListView event");
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016e A[Catch: Exception -> 0x01b7, TryCatch #2 {Exception -> 0x01b7, blocks: (B:97:0x0155, B:104:0x016e, B:106:0x0174, B:109:0x017e, B:113:0x018f, B:117:0x019a, B:118:0x019e, B:120:0x01a6, B:122:0x01b0, B:102:0x0168), top: B:134:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x017e A[Catch: Exception -> 0x01b7, TRY_ENTER, TryCatch #2 {Exception -> 0x01b7, blocks: (B:97:0x0155, B:104:0x016e, B:106:0x0174, B:109:0x017e, B:113:0x018f, B:117:0x019a, B:118:0x019e, B:120:0x01a6, B:122:0x01b0, B:102:0x0168), top: B:134:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x018c  */
    /* JADX WARN: Code duplicated, block: B:112:0x018e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0198  */
    /* JADX WARN: Code duplicated, block: B:116:0x0199  */
    /* JADX WARN: Code duplicated, block: B:118:0x019e A[Catch: Exception -> 0x01b7, TryCatch #2 {Exception -> 0x01b7, blocks: (B:97:0x0155, B:104:0x016e, B:106:0x0174, B:109:0x017e, B:113:0x018f, B:117:0x019a, B:118:0x019e, B:120:0x01a6, B:122:0x01b0, B:102:0x0168), top: B:134:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6 A[Catch: Exception -> 0x01b7, TryCatch #2 {Exception -> 0x01b7, blocks: (B:97:0x0155, B:104:0x016e, B:106:0x0174, B:109:0x017e, B:113:0x018f, B:117:0x019a, B:118:0x019e, B:120:0x01a6, B:122:0x01b0, B:102:0x0168), top: B:134:0x0155 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed A[Catch: Exception -> 0x01c5, TRY_LEAVE, TryCatch #10 {Exception -> 0x01c5, blocks: (B:56:0x00b3, B:69:0x00ed, B:125:0x01b8, B:126:0x01bd, B:63:0x00df, B:59:0x00d4, B:57:0x00cd, B:61:0x00da), top: B:148:0x00b3, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x010b  */
    /* JADX WARN: Code duplicated, block: B:79:0x010c A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:76:0x0105, B:88:0x0138, B:94:0x014a, B:79:0x010c, B:81:0x0110, B:84:0x0123, B:85:0x012d), top: B:132:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0110 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:76:0x0105, B:88:0x0138, B:94:0x014a, B:79:0x010c, B:81:0x0110, B:84:0x0123, B:85:0x012d), top: B:132:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:84:0x0123 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:76:0x0105, B:88:0x0138, B:94:0x014a, B:79:0x010c, B:81:0x0110, B:84:0x0123, B:85:0x012d), top: B:132:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x012d A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:76:0x0105, B:88:0x0138, B:94:0x014a, B:79:0x010c, B:81:0x0110, B:84:0x0123, B:85:0x012d), top: B:132:0x0105 }] */
    public static void a(Object obj, Object obj2) {
        Class<?> cls;
        Class<?> cls2;
        Activity activityA;
        Activity activityA2;
        Object obj3;
        JSONObject jSONObject;
        Class<?> cls3;
        Class<?> cls4;
        Field declaredField;
        View viewA;
        String strC;
        String strA;
        Field declaredField2;
        r1 r1VarA;
        JSONObject jSONObject2;
        Resources resources;
        String resourceEntryName;
        String str;
        String str2 = "";
        if (obj2 == null || v1.a() || v1.a(obj2)) {
            return;
        }
        r1 r1Var = null;
        Field declaredField3 = null;
        r1Var = null;
        try {
            cls = Class.forName("com.google.android.material.tabs.TabLayout");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            cls2 = Class.forName("android.support.design.widget.TabLayout");
        } catch (Exception unused2) {
            cls2 = null;
        }
        if (cls == null && cls2 == null) {
            return;
        }
        if (cls2 != null && v1.c(cls2)) {
            return;
        }
        if (cls != null && v1.c(cls)) {
            return;
        }
        try {
            try {
                try {
                    if (obj instanceof Context) {
                        activityA = o0.a((Context) obj, null);
                    } else {
                        try {
                            Field[] declaredFields = obj.getClass().getDeclaredFields();
                            int length = declaredFields.length;
                            activityA2 = null;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    obj3 = null;
                                    break;
                                }
                                try {
                                    Field field = declaredFields[i];
                                    field.setAccessible(true);
                                    obj3 = field.get(obj);
                                    if (obj3 instanceof Activity) {
                                        activityA2 = (Activity) obj3;
                                    } else if (obj3 instanceof View) {
                                        activityA2 = o0.a(((View) obj3).getContext(), null);
                                    } else if (t.e(obj3)) {
                                        break;
                                    }
                                    i++;
                                } catch (Exception unused3) {
                                    activityA = activityA2;
                                    HiLog.w("HAVCI", "fail to get activity from field");
                                    activityA2 = activityA;
                                    obj3 = null;
                                    break;
                                }
                            }
                        } catch (Exception unused4) {
                            activityA = null;
                        }
                        if (activityA2 != null) {
                            if (w.a().i(activityA2.getClass())) {
                                return;
                            }
                        }
                        if (obj3 != null) {
                            if (w.a().i(obj3.getClass())) {
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject.put("$view_type", "TabLayout");
                        i1.a(o0.b(activityA2), jSONObject);
                        i1.a(t.a(activityA2, obj3), jSONObject);
                        cls3 = Class.forName("com.google.android.material.tabs.TabLayout$Tab");
                        cls4 = Class.forName("");
                        if (cls3 != null) {
                            cls3 = cls4;
                        }
                        if (cls3 == null) {
                            return;
                        }
                        jSONObject.put("$view_content", a((Class) cls3, obj2));
                        if (activityA2 != null) {
                            try {
                                try {
                                    declaredField = cls3.getDeclaredField("mCustomView");
                                } catch (Exception unused5) {
                                    declaredField = cls3.getDeclaredField("customView");
                                }
                            } catch (Exception unused6) {
                                declaredField = null;
                            }
                            try {
                                viewA = a(declaredField, obj2);
                                try {
                                    try {
                                        if (viewA != null) {
                                            if (viewA instanceof ViewGroup) {
                                                strA = v1.a(new StringBuilder(), (ViewGroup) viewA);
                                                if (TextUtils.isEmpty(strA)) {
                                                    strC = strA.substring(0, strA.length() - 1);
                                                }
                                            } else {
                                                strC = v1.c(viewA);
                                                if (TextUtils.isEmpty(strC)) {
                                                }
                                            }
                                            jSONObject.put("$view_content", strC);
                                            declaredField2 = cls3.getDeclaredField("mView");
                                            r1VarA = v1.a(activityA2, a(declaredField2, obj2), jSONObject);
                                            if (viewA != null) {
                                                try {
                                                    if (viewA.getId() == -1) {
                                                        try {
                                                            try {
                                                                declaredField3 = cls3.getDeclaredField("mParent");
                                                            } catch (Exception unused7) {
                                                            }
                                                        } catch (Exception unused8) {
                                                            declaredField3 = cls3.getDeclaredField("parent");
                                                        }
                                                        viewA = a(declaredField3, obj2);
                                                    }
                                                    if (viewA != null && viewA.getId() != -1) {
                                                        resources = activityA2.getResources();
                                                        if (resources != null) {
                                                            resourceEntryName = resources.getResourceEntryName(viewA.getId());
                                                            if (TextUtils.isEmpty(resourceEntryName)) {
                                                                str = "";
                                                            } else {
                                                                str = resourceEntryName;
                                                            }
                                                            jSONObject.put("$view_id", str);
                                                            if (TextUtils.isEmpty(resourceEntryName)) {
                                                                str2 = resourceEntryName;
                                                            }
                                                            jSONObject.put("$event_name", str2);
                                                        } else {
                                                            jSONObject.put("$view_id", "");
                                                            jSONObject.put("$event_name", "");
                                                        }
                                                    }
                                                    if (viewA != null && (jSONObject2 = (JSONObject) viewA.getTag(R.id.hianalytics_view_custom_property_tag)) != null) {
                                                        jSONObject.put("$custom_property", jSONObject2);
                                                    }
                                                    r1Var = r1VarA;
                                                } catch (Exception unused9) {
                                                    r1Var = r1VarA;
                                                    HiLog.w("HAVCI", "fail to acquire view path on tab");
                                                }
                                            } else {
                                                declaredField3 = cls3.getDeclaredField("mParent");
                                                viewA = a(declaredField3, obj2);
                                                if (viewA != null) {
                                                    resources = activityA2.getResources();
                                                    if (resources != null) {
                                                        resourceEntryName = resources.getResourceEntryName(viewA.getId());
                                                        if (TextUtils.isEmpty(resourceEntryName)) {
                                                            str = "";
                                                        } else {
                                                            str = resourceEntryName;
                                                        }
                                                        jSONObject.put("$view_id", str);
                                                        if (TextUtils.isEmpty(resourceEntryName)) {
                                                            str2 = resourceEntryName;
                                                        }
                                                        jSONObject.put("$event_name", str2);
                                                    } else {
                                                        jSONObject.put("$view_id", "");
                                                        jSONObject.put("$event_name", "");
                                                    }
                                                }
                                                if (viewA != null) {
                                                    jSONObject.put("$custom_property", jSONObject2);
                                                }
                                                r1Var = r1VarA;
                                            }
                                        }
                                        declaredField2 = cls3.getDeclaredField("mView");
                                    } catch (Exception unused10) {
                                        declaredField2 = null;
                                    }
                                } catch (Exception unused11) {
                                    declaredField2 = cls3.getDeclaredField("view");
                                }
                                strC = "";
                                jSONObject.put("$view_content", strC);
                                r1VarA = v1.a(activityA2, a(declaredField2, obj2), jSONObject);
                                if (viewA != null) {
                                    if (viewA.getId() == -1) {
                                        declaredField3 = cls3.getDeclaredField("mParent");
                                        viewA = a(declaredField3, obj2);
                                    }
                                    if (viewA != null) {
                                        resources = activityA2.getResources();
                                        if (resources != null) {
                                            resourceEntryName = resources.getResourceEntryName(viewA.getId());
                                            if (TextUtils.isEmpty(resourceEntryName)) {
                                                str = "";
                                            } else {
                                                str = resourceEntryName;
                                            }
                                            jSONObject.put("$view_id", str);
                                            if (TextUtils.isEmpty(resourceEntryName)) {
                                                str2 = resourceEntryName;
                                            }
                                            jSONObject.put("$event_name", str2);
                                        } else {
                                            jSONObject.put("$view_id", "");
                                            jSONObject.put("$event_name", "");
                                        }
                                    }
                                    if (viewA != null) {
                                        jSONObject.put("$custom_property", jSONObject2);
                                    }
                                    r1Var = r1VarA;
                                } else {
                                    declaredField3 = cls3.getDeclaredField("mParent");
                                    viewA = a(declaredField3, obj2);
                                    if (viewA != null) {
                                        resources = activityA2.getResources();
                                        if (resources != null) {
                                            resourceEntryName = resources.getResourceEntryName(viewA.getId());
                                            if (TextUtils.isEmpty(resourceEntryName)) {
                                                str = "";
                                            } else {
                                                str = resourceEntryName;
                                            }
                                            jSONObject.put("$view_id", str);
                                            if (TextUtils.isEmpty(resourceEntryName)) {
                                                str2 = resourceEntryName;
                                            }
                                            jSONObject.put("$event_name", str2);
                                        } else {
                                            jSONObject.put("$view_id", "");
                                            jSONObject.put("$event_name", "");
                                        }
                                    }
                                    if (viewA != null) {
                                        jSONObject.put("$custom_property", jSONObject2);
                                    }
                                    r1Var = r1VarA;
                                }
                            } catch (Exception unused12) {
                            }
                        }
                        w.a().a(jSONObject, r1Var);
                        return;
                    }
                    cls4 = Class.forName("");
                } catch (Exception unused13) {
                    HiLog.d("HAVCI", "fail to find support tab class");
                    cls4 = null;
                }
                cls3 = Class.forName("com.google.android.material.tabs.TabLayout$Tab");
            } catch (Exception unused14) {
                HiLog.d("HAVCI", "fail to find android tab class");
                cls3 = null;
            }
            jSONObject = new JSONObject();
            jSONObject.put("$view_type", "TabLayout");
            i1.a(o0.b(activityA2), jSONObject);
            i1.a(t.a(activityA2, obj3), jSONObject);
            if (cls3 != null) {
                cls3 = cls4;
            }
            if (cls3 == null) {
                return;
            }
            jSONObject.put("$view_content", a((Class) cls3, obj2));
            if (activityA2 != null) {
                declaredField = cls3.getDeclaredField("mCustomView");
                viewA = a(declaredField, obj2);
                if (viewA != null) {
                    if (viewA instanceof ViewGroup) {
                        strA = v1.a(new StringBuilder(), (ViewGroup) viewA);
                        if (TextUtils.isEmpty(strA)) {
                            strC = strA.substring(0, strA.length() - 1);
                        }
                    } else {
                        strC = v1.c(viewA);
                        if (TextUtils.isEmpty(strC)) {
                        }
                    }
                    jSONObject.put("$view_content", strC);
                    declaredField2 = cls3.getDeclaredField("mView");
                    r1VarA = v1.a(activityA2, a(declaredField2, obj2), jSONObject);
                    if (viewA != null) {
                        if (viewA.getId() == -1) {
                            declaredField3 = cls3.getDeclaredField("mParent");
                            viewA = a(declaredField3, obj2);
                        }
                        if (viewA != null) {
                            resources = activityA2.getResources();
                            if (resources != null) {
                                resourceEntryName = resources.getResourceEntryName(viewA.getId());
                                if (TextUtils.isEmpty(resourceEntryName)) {
                                    str = "";
                                } else {
                                    str = resourceEntryName;
                                }
                                jSONObject.put("$view_id", str);
                                if (TextUtils.isEmpty(resourceEntryName)) {
                                    str2 = resourceEntryName;
                                }
                                jSONObject.put("$event_name", str2);
                            } else {
                                jSONObject.put("$view_id", "");
                                jSONObject.put("$event_name", "");
                            }
                        }
                        if (viewA != null) {
                            jSONObject.put("$custom_property", jSONObject2);
                        }
                        r1Var = r1VarA;
                    } else {
                        declaredField3 = cls3.getDeclaredField("mParent");
                        viewA = a(declaredField3, obj2);
                        if (viewA != null) {
                            resources = activityA2.getResources();
                            if (resources != null) {
                                resourceEntryName = resources.getResourceEntryName(viewA.getId());
                                if (TextUtils.isEmpty(resourceEntryName)) {
                                    str = "";
                                } else {
                                    str = resourceEntryName;
                                }
                                jSONObject.put("$view_id", str);
                                if (TextUtils.isEmpty(resourceEntryName)) {
                                    str2 = resourceEntryName;
                                }
                                jSONObject.put("$event_name", str2);
                            } else {
                                jSONObject.put("$view_id", "");
                                jSONObject.put("$event_name", "");
                            }
                        }
                        if (viewA != null) {
                            jSONObject.put("$custom_property", jSONObject2);
                        }
                        r1Var = r1VarA;
                    }
                }
                strC = "";
                jSONObject.put("$view_content", strC);
                declaredField2 = cls3.getDeclaredField("mView");
                r1VarA = v1.a(activityA2, a(declaredField2, obj2), jSONObject);
                if (viewA != null) {
                    if (viewA.getId() == -1) {
                        declaredField3 = cls3.getDeclaredField("mParent");
                        viewA = a(declaredField3, obj2);
                    }
                    if (viewA != null) {
                        resources = activityA2.getResources();
                        if (resources != null) {
                            resourceEntryName = resources.getResourceEntryName(viewA.getId());
                            if (TextUtils.isEmpty(resourceEntryName)) {
                                str = "";
                            } else {
                                str = resourceEntryName;
                            }
                            jSONObject.put("$view_id", str);
                            if (TextUtils.isEmpty(resourceEntryName)) {
                                str2 = resourceEntryName;
                            }
                            jSONObject.put("$event_name", str2);
                        } else {
                            jSONObject.put("$view_id", "");
                            jSONObject.put("$event_name", "");
                        }
                    }
                    if (viewA != null) {
                        jSONObject.put("$custom_property", jSONObject2);
                    }
                    r1Var = r1VarA;
                } else {
                    declaredField3 = cls3.getDeclaredField("mParent");
                    viewA = a(declaredField3, obj2);
                    if (viewA != null) {
                        resources = activityA2.getResources();
                        if (resources != null) {
                            resourceEntryName = resources.getResourceEntryName(viewA.getId());
                            if (TextUtils.isEmpty(resourceEntryName)) {
                                str = "";
                            } else {
                                str = resourceEntryName;
                            }
                            jSONObject.put("$view_id", str);
                            if (TextUtils.isEmpty(resourceEntryName)) {
                                str2 = resourceEntryName;
                            }
                            jSONObject.put("$event_name", str2);
                        } else {
                            jSONObject.put("$view_id", "");
                            jSONObject.put("$event_name", "");
                        }
                    }
                    if (viewA != null) {
                        jSONObject.put("$custom_property", jSONObject2);
                    }
                    r1Var = r1VarA;
                }
            }
            w.a().a(jSONObject, r1Var);
            return;
        } catch (Exception unused15) {
            HiLog.w("HAVCI", "fail to report layout data click event");
            return;
        }
        activityA2 = activityA;
        obj3 = null;
        if (activityA2 != null) {
            if (w.a().i(activityA2.getClass())) {
                return;
            }
        }
        if (obj3 != null) {
            if (w.a().i(obj3.getClass())) {
            }
        }
    }

    public static void a(MenuItem menuItem, Object obj) {
        View viewFindViewById;
        if (menuItem == null || v1.a() || v1.c(MenuItem.class) || v1.a(menuItem)) {
            return;
        }
        Context context = obj instanceof Context ? (Context) obj : null;
        y1.b();
        View[] viewArrA = y1.a();
        try {
            int length = viewArrA.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    View view = viewArrA[i2];
                    if (view.getClass() == y1.i && (viewFindViewById = y1.a(view, menuItem)) != null) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    int length2 = viewArrA.length;
                    while (true) {
                        if (i >= length2) {
                            viewFindViewById = null;
                            break;
                        }
                        View view2 = viewArrA[i];
                        if (view2.getClass() != y1.i && (viewFindViewById = y1.a(view2, menuItem)) != null) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (context == null && viewFindViewById != null) {
            context = viewFindViewById.getContext();
        }
        if (context == null) {
            HiLog.w("HAVCI", "clickOnMenuItem ctx null");
            return;
        }
        Activity activityA = o0.a(context, null);
        if (activityA != null) {
            if (!w.a().i(activityA.getClass())) {
                if (viewFindViewById == null) {
                    try {
                        viewFindViewById = activityA.findViewById(menuItem.getItemId());
                        if (viewFindViewById == null) {
                            HiLog.w("HAVCI", "get view from activity failed");
                        }
                    } catch (Exception unused2) {
                        HiLog.w("HAVCI", "fail to report menuItem click event");
                        return;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("$view_type", "MenuItem");
                jSONObject.put("$view_id", context.getResources() != null ? context.getResources().getResourceEntryName(menuItem.getItemId()) : "");
                jSONObject.put("$event_name", context.getResources() != null ? context.getResources().getResourceEntryName(menuItem.getItemId()) : "");
                String string = TextUtils.isEmpty(menuItem.getTitle()) ? "" : menuItem.getTitle().toString();
                if (TextUtils.isEmpty(string) && viewFindViewById != null) {
                    string = v1.a(v1.d(viewFindViewById).d);
                }
                jSONObject.put("$view_content", v1.a(string));
                i1.a(o0.b(activityA), jSONObject);
                w.a().a(jSONObject, viewFindViewById != null ? v1.a(activityA, viewFindViewById, jSONObject) : null);
                return;
            }
        }
        HiLog.w("HAVCI", "clickOnMenuItem activity From View is null， or is Activity Disable Collect");
    }

    public static void a(RadioGroup radioGroup, int i) {
        View viewFindViewById;
        k1 k1VarA;
        String strA;
        RadioButton radioButton;
        RadioButton radioButton2;
        if (radioGroup == null || v1.a() || v1.h(radioGroup)) {
            return;
        }
        r1 r1VarA = null;
        try {
            viewFindViewById = radioGroup.findViewById(i);
        } catch (Exception unused) {
            HiLog.e("HAVCI", "clickOnRadioGroupThread failed");
            viewFindViewById = null;
        }
        if (viewFindViewById == null || !viewFindViewById.isPressed() || (k1VarA = v1.a((AdapterView) null, viewFindViewById, RadioGroup.class)) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_id", v1.e(radioGroup));
            jSONObject.put("$event_name", v1.e(radioGroup));
            jSONObject.put("$view_type", v1.a(viewFindViewById.getClass().getCanonicalName(), "RadioButton"));
            Activity activity = k1VarA.f11657a;
            if (activity != null) {
                try {
                    radioButton2 = (RadioButton) activity.findViewById(radioGroup.getCheckedRadioButtonId());
                } catch (Exception unused2) {
                    HiLog.e("HAVCI", "getRadioGroupContent error");
                    radioButton2 = null;
                }
                if (radioButton2 != null && !TextUtils.isEmpty(radioButton2.getText())) {
                    strA = v1.a(radioButton2.getText().toString());
                } else {
                    strA = "";
                }
            } else {
                strA = "";
            }
            jSONObject.put("$view_content", strA);
            i1.a(o0.b(k1VarA.f11657a), jSONObject);
            i1.a(t.a(k1VarA.f11657a, k1VarA.f11658b), jSONObject);
            Activity activity2 = k1VarA.f11657a;
            if (activity2 != null) {
                try {
                    radioButton = (RadioButton) activity2.findViewById(radioGroup.getCheckedRadioButtonId());
                } catch (Exception unused3) {
                    HiLog.e("HAVCI", "getRadioGroupViewNode failed");
                    radioButton = null;
                }
                if (radioButton != null) {
                    r1VarA = v1.a(activity2, radioButton, jSONObject);
                }
            }
            JSONObject jSONObject2 = (JSONObject) radioGroup.getTag(R.id.hianalytics_view_custom_property_tag);
            if (jSONObject2 != null) {
                jSONObject.put("$custom_property", jSONObject2);
            }
            String strB = v1.b(viewFindViewById);
            if (!TextUtils.isEmpty(strB)) {
                jSONObject.put("$view_checked", strB);
            }
            w.a().a(jSONObject, r1VarA);
        } catch (Exception unused4) {
            HiLog.w("HAVCI", "fail to report click on RadioGroup event");
        }
    }

    public static void a(DialogInterface dialogInterface, int i) {
        Button button;
        r1 r1VarA;
        Object tag;
        Object tag2;
        if (dialogInterface == null || v1.a()) {
            return;
        }
        r1 r1Var = null;
        Dialog dialog = dialogInterface instanceof Dialog ? (Dialog) dialogInterface : null;
        if (dialog == null || v1.a(dialog)) {
            return;
        }
        Activity activityA = o0.a(dialog.getContext(), null);
        if (activityA == null) {
            activityA = dialog.getOwnerActivity();
        }
        if ((activityA == null || !w.a().i(activityA.getClass())) && !v1.c(Dialog.class)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("$view_type", "Dialog");
                Window window = dialog.getWindow();
                String string = "";
                jSONObject.put("$view_id", (window == null || !window.isActive() || (tag2 = window.getDecorView().getTag(R.id.hianalytics_view_id_tag)) == null) ? "" : (String) tag2);
                Window window2 = dialog.getWindow();
                jSONObject.put("$event_name", (window2 == null || !window2.isActive() || (tag = window2.getDecorView().getTag(R.id.hianalytics_view_id_tag)) == null) ? "" : (String) tag);
                i1.a(o0.b(activityA), jSONObject);
                Class clsA = i1.a();
                if (dialog instanceof AlertDialog) {
                    AlertDialog alertDialog = (AlertDialog) dialog;
                    Button button2 = alertDialog.getButton(i);
                    if (button2 != null) {
                        if (!TextUtils.isEmpty(button2.getText())) {
                            string = v1.a(button2.getText().toString());
                        }
                        jSONObject.put("$view_content", string);
                        r1VarA = v1.a(activityA, button2, jSONObject);
                    } else {
                        ListView listView = alertDialog.getListView();
                        if (listView != null) {
                            jSONObject.put("$view_content", Long.valueOf(listView.getAdapter().getItemId(i)));
                            r1VarA = v1.a(activityA, listView.getChildAt(i), jSONObject);
                        }
                    }
                    r1Var = r1VarA;
                } else if (clsA != null && clsA.isInstance(dialog)) {
                    try {
                        button = (Button) dialog.getClass().getMethod("getButton", Integer.TYPE).invoke(dialog, Integer.valueOf(i));
                    } catch (Exception unused) {
                        HiLog.w("HAVCI", "fail to find getButton method on dialog");
                        button = null;
                    }
                    if (button != null) {
                        if (!TextUtils.isEmpty(button.getText())) {
                            string = button.getText().toString();
                        }
                        jSONObject.put("$view_content", string);
                        r1VarA = v1.a(activityA, button, jSONObject);
                    } else {
                        try {
                            ListView listView2 = (ListView) dialog.getClass().getMethod("getListView", new Class[0]).invoke(dialog, new Object[0]);
                            if (listView2 != null) {
                                jSONObject.put("$view_content", Long.valueOf(listView2.getAdapter().getItemId(i)));
                                r1VarA = v1.a(activityA, listView2.getChildAt(i), jSONObject);
                            }
                        } catch (Exception unused2) {
                            HiLog.w("HAVCI", "fail to find getListView method on dialog");
                        }
                        HiLog.w("HAVCI", "fail to report click dialog event");
                    }
                    r1Var = r1VarA;
                }
                w.a().a(jSONObject, r1Var);
            } catch (Exception unused3) {
                HiLog.w("HAVCI", "fail to report click dialog event");
            }
        }
    }

    public static void a(AdapterView adapterView, View view) {
        String str;
        Object obj;
        String strC;
        if (view == null || v1.a() || v1.h(adapterView) || k0.a(view)) {
            return;
        }
        if (adapterView instanceof ListView) {
            obj = ListView.class;
            str = "ListView";
        } else if (adapterView instanceof GridView) {
            obj = GridView.class;
            str = "GridView";
        } else if (!(adapterView instanceof Spinner)) {
            str = "";
            obj = null;
        } else {
            obj = Spinner.class;
            str = "Spinner";
        }
        Pair pair = new Pair(str, obj);
        k1 k1VarA = v1.a(adapterView, view, (Class) pair.second);
        if (k1VarA == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_type", pair.first);
            jSONObject.put("$view_id", v1.e(view));
            jSONObject.put("$event_name", v1.e(adapterView));
            if (view instanceof ViewGroup) {
                strC = v1.a(new StringBuilder(), (ViewGroup) view);
                if (!TextUtils.isEmpty(strC)) {
                    strC = strC.substring(0, strC.length() - 1);
                }
            } else {
                strC = v1.c(view);
            }
            jSONObject.put("$view_content", v1.a(strC));
            i1.a(o0.b(k1VarA.f11657a), jSONObject);
            i1.a(t.a(k1VarA.f11657a, k1VarA.f11658b), jSONObject);
            r1 r1VarA = v1.a(k1VarA.f11657a, view, jSONObject);
            JSONObject jSONObject2 = (JSONObject) view.getTag(R.id.hianalytics_view_custom_property_tag);
            if (jSONObject2 != null) {
                jSONObject.put("$custom_property", jSONObject2);
            }
            w.a().a(jSONObject, r1VarA);
        } catch (Exception unused) {
            HiLog.w("HAVCI", "fail to report click on Listview event");
        }
    }

    public static String a(Class cls, Object obj) {
        Method method;
        try {
            method = cls.getMethod("getText", new Class[0]);
        } catch (Exception unused) {
            HiLog.d("HAVCI", "fail to find getText method");
            method = null;
        }
        if (method == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke != null) {
                return v1.a((String) objInvoke);
            }
        } catch (Exception unused2) {
            HiLog.d("HAVCI", "fail to find getText content");
        }
        return "";
    }

    public static View a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            if (obj2 != null) {
                return (View) obj2;
            }
        } catch (Exception unused) {
            HiLog.w("HAVCI", "fail to get tab view");
        }
        return null;
    }

    public static void a(View view, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        Object tag = view.getTag(R.id.hianalytics_view_custom_property_tag);
        if (tag instanceof JSONObject) {
            jSONObject2 = (JSONObject) tag;
        } else {
            jSONObject2 = new JSONObject();
        }
        Map<String, String> clickParams = ParamCollectorInstrumentation.getClickParams(view);
        for (String str : clickParams.keySet()) {
            jSONObject2.put(str, clickParams.get(str));
        }
        if (jSONObject2.length() > 0) {
            jSONObject.put("$custom_property", jSONObject2);
        }
    }
}
