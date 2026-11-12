package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeTransform;
import androidx.transition.Fade;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.Visibility;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.miui.tsmclient.net.TSMAuthContants;
import miuix.animation.FolmeEase;

/* JADX INFO: loaded from: classes6.dex */
public class c0q {
    public static void a(Transition transition, ReadableMap readableMap) {
        if (readableMap.hasKey("durationMs")) {
            transition.b0(readableMap.getInt("durationMs"));
        }
        if (readableMap.hasKey("interpolation")) {
            String string = readableMap.getString("interpolation");
            if (string.equals("easeIn")) {
                transition.d0(new AccelerateInterpolator());
            } else if (string.equals("easeOut")) {
                transition.d0(new DecelerateInterpolator());
            } else if (string.equals("easeInOut")) {
                transition.d0(new AccelerateDecelerateInterpolator());
            } else {
                if (!string.equals(FolmeEase.LINEAR)) {
                    throw new JSApplicationIllegalArgumentException("Invalid interpolation type " + string);
                }
                transition.d0(new LinearInterpolator());
            }
        }
        if (readableMap.hasKey("propagation")) {
            String string2 = readableMap.getString("propagation");
            r9l r9lVar = new r9l();
            if ("top".equals(string2)) {
                r9lVar.j(80);
            } else if ("bottom".equals(string2)) {
                r9lVar.j(48);
            } else if ("left".equals(string2)) {
                r9lVar.j(5);
            } else if (TSMAuthContants.PARAM_KEY_RIGHT.equals(string2)) {
                r9lVar.j(3);
            }
            transition.g0(r9lVar);
        } else {
            transition.g0(null);
        }
        if (readableMap.hasKey("delayMs")) {
            transition.h0(readableMap.getInt("delayMs"));
        }
    }

    public static Visibility b(String str) {
        if (str == null || "none".equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new Fade(3);
        }
        if ("scale".equals(str)) {
            return new jal();
        }
        if ("slide-top".equals(str)) {
            return new Slide(48);
        }
        if ("slide-bottom".equals(str)) {
            return new Slide(80);
        }
        if ("slide-right".equals(str)) {
            return new Slide(5);
        }
        if ("slide-left".equals(str)) {
            return new Slide(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    public static Transition c(ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("group".equals(string)) {
            return e(readableMap);
        }
        if ("in".equals(string)) {
            return f(readableMap);
        }
        if ("out".equals(string)) {
            return g(readableMap);
        }
        if ("change".equals(string)) {
            return d(readableMap);
        }
        throw new JSApplicationIllegalArgumentException("Unrecognized transition type " + string);
    }

    public static Transition d(ReadableMap readableMap) {
        ChangeBounds changeBounds = new ChangeBounds();
        ChangeTransform changeTransform = new ChangeTransform();
        a(changeBounds, readableMap);
        a(changeTransform, readableMap);
        return new TransitionSet().m0(changeBounds).m0(changeTransform);
    }

    public static Transition e(ReadableMap readableMap) {
        TransitionSet transitionSet = new TransitionSet();
        if (readableMap.hasKey("sequence") && readableMap.getBoolean("sequence")) {
            transitionSet.v0(1);
        } else {
            transitionSet.v0(0);
        }
        ReadableArray array = readableMap.getArray("transitions");
        int size = array.size();
        for (int i = 0; i < size; i++) {
            Transition transitionC = c(array.getMap(i));
            if (transitionC != null) {
                transitionSet.m0(transitionC);
            }
        }
        return transitionSet;
    }

    public static Transition f(ReadableMap readableMap) {
        Visibility visibilityB = b(readableMap.getString("animation"));
        if (visibilityB == null) {
            return null;
        }
        visibilityB.s0(1);
        a(visibilityB, readableMap);
        return visibilityB;
    }

    public static Transition g(ReadableMap readableMap) {
        Visibility visibilityB = b(readableMap.getString("animation"));
        if (visibilityB == null) {
            return null;
        }
        visibilityB.s0(2);
        a(visibilityB, readableMap);
        return visibilityB;
    }
}
