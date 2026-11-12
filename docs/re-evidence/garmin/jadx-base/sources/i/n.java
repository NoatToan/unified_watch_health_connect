package i;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.z;
import androidx.core.view.g1;
import androidx.core.view.o0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class n {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final k1<String, Constructor<? extends View>> sConstructorMap = new k1<>();

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f86639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f86641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f86642d;

        public a(View view2, String str) {
            this.f86639a = view2;
            this.f86640b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            String str;
            Method method;
            if (this.f86641c != null) {
                break;
            }
            View view3 = this.f86639a;
            Context context = view3.getContext();
            while (true) {
                String str2 = this.f86640b;
                if (context == null) {
                    int id3 = view3.getId();
                    if (id3 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view3.getContext().getResources().getResourceEntryName(id3) + "'";
                    }
                    o2.c.t(hb.a.l("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "), view3.getClass(), str);
                    return;
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f86641c = method;
                        this.f86642d = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f86641c.invoke(this.f86642d, view2);
            } catch (IllegalAccessException e4) {
                com.airbnb.lottie.animation.keyframe.a.x("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e14) {
                com.airbnb.lottie.animation.keyframe.a.x("Could not execute method for android:onClick", e14);
            }
        }
    }

    private void backportAccessibilityAttributes(Context context, View view2, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            new r0(com.garmin.android.apps.connectmobile.R.id.tag_accessibility_heading, Boolean.class, 28).d(view2, Boolean.valueOf(z14));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            s0.s(view2, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            boolean z15 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            new o0(com.garmin.android.apps.connectmobile.R.id.tag_screen_reader_focusable, Boolean.class, 28).d(view2, Boolean.valueOf(z15));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void checkOnClickListener(View view2, AttributeSet attributeSet) {
        Context context = view2.getContext();
        if ((context instanceof ContextWrapper) && view2.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view2.setOnClickListener(new a(view2, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        k1<String, Constructor<? extends View>> k1Var = sConstructorMap;
        Constructor<? extends View> constructor = k1Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            k1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i14 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i14 >= strArr.length) {
                    return null;
                }
                View viewCreateViewByPrefix = createViewByPrefix(context, str, strArr[i14]);
                if (viewCreateViewByPrefix != null) {
                    return viewCreateViewByPrefix;
                }
                i14++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z14, boolean z15) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.A, 0, 0);
        int resourceId = z14 ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z15 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof m.d) && ((m.d) context).f115425a == resourceId)) ? context : new m.d(context, resourceId);
    }

    private void verifyNotNull(View view2, String str) {
        if (view2 != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public androidx.appcompat.widget.d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public androidx.appcompat.widget.f createCheckBox(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    public androidx.appcompat.widget.m createImageButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.m(context, attributeSet);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public androidx.appcompat.widget.o createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.o(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public androidx.appcompat.widget.r createRatingBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    public androidx.appcompat.widget.t createSeekBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public z createToggleButton(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final View createView(View view2, String str, Context context, AttributeSet attributeSet, boolean z14, boolean z15, boolean z16, boolean z17) {
        View viewCreateRatingBar;
        Context context2 = (!z14 || view2 == null) ? context : view2.getContext();
        if (z15 || z16) {
            context2 = themifyContext(context2, attributeSet, z15, z16);
        }
        if (z17) {
            t0.a(context2);
        }
        str.getClass();
        byte b14 = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b14 = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b14 = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b14 = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b14 = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b14 = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b14 = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b14 = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b14 = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b14 = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b14 = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b14 = 10;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    b14 = Ascii.VT;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b14 = Ascii.FF;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    b14 = Ascii.CR;
                }
                break;
        }
        switch (b14) {
            case 0:
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 1:
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 2:
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 3:
                viewCreateRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 4:
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 5:
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 6:
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 7:
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 8:
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 9:
                viewCreateRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 10:
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 11:
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 12:
                viewCreateRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 13:
                viewCreateRatingBar = createButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (viewCreateRatingBar != null) {
            checkOnClickListener(viewCreateRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, viewCreateRatingBar, attributeSet);
        }
        return viewCreateRatingBar;
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
