package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.fqi;
import defpackage.l1j;
import defpackage.m80;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ReactAccessibilityDelegate extends androidx.core.view.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f7475b = 1056964608;
    public static final HashMap<String, Integer> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, String> f7476a = new HashMap<>();

    public enum AccessibilityRole {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        TOOLBAR;

        public static AccessibilityRole fromValue(String str) {
            for (AccessibilityRole accessibilityRole : values()) {
                if (accessibilityRole.name().equalsIgnoreCase(str)) {
                    return accessibilityRole;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String getValue(AccessibilityRole accessibilityRole) {
            switch (a.f7477a[accessibilityRole.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.EditText";
                case 3:
                    return "android.widget.ImageView";
                case 4:
                    return "android.widget.ImageButon";
                case 5:
                    return "android.inputmethodservice.Keyboard$Key";
                case 6:
                    return "android.widget.TextView";
                case 7:
                    return "android.widget.SeekBar";
                case 8:
                    return "android.widget.CheckBox";
                case 9:
                    return "android.widget.RadioButton";
                case 10:
                    return "android.widget.SpinButton";
                case 11:
                    return "android.widget.Switch";
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + accessibilityRole);
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7477a;

        static {
            int[] iArr = new int[AccessibilityRole.values().length];
            f7477a = iArr;
            try {
                iArr[AccessibilityRole.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7477a[AccessibilityRole.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7477a[AccessibilityRole.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7477a[AccessibilityRole.IMAGEBUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7477a[AccessibilityRole.KEYBOARDKEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7477a[AccessibilityRole.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7477a[AccessibilityRole.ADJUSTABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7477a[AccessibilityRole.CHECKBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7477a[AccessibilityRole.RADIO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7477a[AccessibilityRole.SPINBUTTON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7477a[AccessibilityRole.SWITCH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7477a[AccessibilityRole.NONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7477a[AccessibilityRole.LINK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7477a[AccessibilityRole.SUMMARY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7477a[AccessibilityRole.HEADER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7477a[AccessibilityRole.ALERT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7477a[AccessibilityRole.COMBOBOX.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7477a[AccessibilityRole.MENU.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f7477a[AccessibilityRole.MENUBAR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7477a[AccessibilityRole.MENUITEM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7477a[AccessibilityRole.PROGRESSBAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7477a[AccessibilityRole.RADIOGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7477a[AccessibilityRole.SCROLLBAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7477a[AccessibilityRole.TAB.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7477a[AccessibilityRole.TABLIST.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7477a[AccessibilityRole.TIMER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7477a[AccessibilityRole.TOOLBAR.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        c = map;
        map.put("activate", Integer.valueOf(m80.a.i.b()));
        map.put("longpress", Integer.valueOf(m80.a.j.b()));
        map.put("increment", Integer.valueOf(m80.a.q.b()));
        map.put("decrement", Integer.valueOf(m80.a.f25864r.b()));
    }

    public static void a(View view) {
        if (androidx.core.view.c.O(view)) {
            return;
        }
        if (view.getTag(fqi.d) == null && view.getTag(fqi.f) == null && view.getTag(fqi.e) == null && view.getTag(fqi.f18087a) == null) {
            return;
        }
        androidx.core.view.c.r0(view, new ReactAccessibilityDelegate());
    }

    public static void b(m80 m80Var, AccessibilityRole accessibilityRole, Context context) {
        if (accessibilityRole == null) {
            accessibilityRole = AccessibilityRole.NONE;
        }
        m80Var.i0(AccessibilityRole.getValue(accessibilityRole));
        if (accessibilityRole.equals(AccessibilityRole.LINK)) {
            m80Var.D0(context.getString(l1j.C));
            if (m80Var.r() != null) {
                SpannableString spannableString = new SpannableString(m80Var.r());
                spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                m80Var.m0(spannableString);
            }
            if (m80Var.y() != null) {
                SpannableString spannableString2 = new SpannableString(m80Var.y());
                spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
                m80Var.L0(spannableString2);
                return;
            }
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SEARCH)) {
            m80Var.D0(context.getString(l1j.K));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGE)) {
            m80Var.D0(context.getString(l1j.A));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.IMAGEBUTTON)) {
            m80Var.D0(context.getString(l1j.B));
            m80Var.j0(true);
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SUMMARY)) {
            m80Var.D0(context.getString(l1j.S));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.HEADER)) {
            m80Var.D0(context.getString(l1j.z));
            m80Var.l0(m80.f.a(0, 1, 0, 1, true));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.ALERT)) {
            m80Var.D0(context.getString(l1j.f24527a));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.COMBOBOX)) {
            m80Var.D0(context.getString(l1j.y));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENU)) {
            m80Var.D0(context.getString(l1j.D));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUBAR)) {
            m80Var.D0(context.getString(l1j.E));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.MENUITEM)) {
            m80Var.D0(context.getString(l1j.F));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.PROGRESSBAR)) {
            m80Var.D0(context.getString(l1j.G));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.RADIOGROUP)) {
            m80Var.D0(context.getString(l1j.H));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SCROLLBAR)) {
            m80Var.D0(context.getString(l1j.J));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.SPINBUTTON)) {
            m80Var.D0(context.getString(l1j.L));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TAB)) {
            m80Var.D0(context.getString(l1j.I));
            return;
        }
        if (accessibilityRole.equals(AccessibilityRole.TABLIST)) {
            m80Var.D0(context.getString(l1j.T));
        } else if (accessibilityRole.equals(AccessibilityRole.TIMER)) {
            m80Var.D0(context.getString(l1j.U));
        } else if (accessibilityRole.equals(AccessibilityRole.TOOLBAR)) {
            m80Var.D0(context.getString(l1j.V));
        }
    }

    public static void c(m80 m80Var, ReadableMap readableMap, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("setState ");
        sb.append(readableMap);
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                m80Var.G0(dynamic.asBoolean());
            } else if (strNextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                m80Var.o0(!dynamic.asBoolean());
            } else if (strNextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                m80Var.g0(true);
                m80Var.h0(zAsBoolean);
                if (m80Var.o().equals(AccessibilityRole.getValue(AccessibilityRole.SWITCH))) {
                    m80Var.L0(context.getString(zAsBoolean ? l1j.R : l1j.Q));
                }
            }
        }
    }

    public static void d(m80 m80Var, ReadableArray readableArray, Context context) {
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            string.hashCode();
            switch (string) {
                case "unchecked":
                    m80Var.g0(true);
                    m80Var.h0(false);
                    if (m80Var.o().equals(AccessibilityRole.getValue(AccessibilityRole.SWITCH))) {
                        m80Var.L0(context.getString(l1j.Q));
                        break;
                    } else {
                        break;
                    }
                    break;
                case "disabled":
                    m80Var.o0(false);
                    break;
                case "checked":
                    m80Var.g0(true);
                    m80Var.h0(true);
                    if (m80Var.o().equals(AccessibilityRole.getValue(AccessibilityRole.SWITCH))) {
                        m80Var.L0(context.getString(l1j.R));
                        break;
                    } else {
                        break;
                    }
                    break;
                case "selected":
                    m80Var.G0(true);
                    break;
            }
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
        super.onInitializeAccessibilityNodeInfo(view, m80Var);
        AccessibilityRole accessibilityRole = (AccessibilityRole) view.getTag(fqi.d);
        if (accessibilityRole != null) {
            b(m80Var, accessibilityRole, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(fqi.f);
        ReadableMap readableMap = (ReadableMap) view.getTag(fqi.e);
        if (readableArray != null) {
            d(m80Var, readableArray, view.getContext());
        }
        if (readableMap != null) {
            c(m80Var, readableMap, view.getContext());
        }
        ReadableArray readableArray2 = (ReadableArray) view.getTag(fqi.f18087a);
        if (readableArray2 != null) {
            for (int i = 0; i < readableArray2.size(); i++) {
                ReadableMap map = readableArray2.getMap(i);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = f7475b;
                String string = map.hasKey("label") ? map.getString("label") : null;
                HashMap<String, Integer> map2 = c;
                if (map2.containsKey(map.getString("name"))) {
                    iIntValue = map2.get(map.getString("name")).intValue();
                } else {
                    f7475b++;
                }
                this.f7476a.put(Integer.valueOf(iIntValue), map.getString("name"));
                m80Var.b(new m80.a(iIntValue, string));
            }
        }
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!this.f7476a.containsKey(Integer.valueOf(i))) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", this.f7476a.get(Integer.valueOf(i)));
        ((RCTEventEmitter) ((ReactContext) view.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), "topAccessibilityAction", writableMapCreateMap);
        return true;
    }
}
