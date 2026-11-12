package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.scroll.ScrollEventType;

/* JADX INFO: loaded from: classes4.dex */
public class nej {
    public static void a(ViewGroup viewGroup) {
        d(viewGroup, ScrollEventType.BEGIN_DRAG);
    }

    public static void b(ViewGroup viewGroup, float f, float f2) {
        e(viewGroup, ScrollEventType.END_DRAG, f, f2);
    }

    public static void c(ViewGroup viewGroup, float f, float f2) {
        e(viewGroup, ScrollEventType.SCROLL, f, f2);
    }

    public static void d(ViewGroup viewGroup, ScrollEventType scrollEventType) {
        e(viewGroup, scrollEventType, 0.0f, 0.0f);
    }

    public static void e(ViewGroup viewGroup, ScrollEventType scrollEventType, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ((UIManagerModule) ((ReactContext) viewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(vhl.b(viewGroup.getId(), scrollEventType, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
    }

    public static void f(ViewGroup viewGroup, int i, int i2) {
        e(viewGroup, ScrollEventType.MOMENTUM_BEGIN, i, i2);
    }

    public static void g(ViewGroup viewGroup) {
        d(viewGroup, ScrollEventType.MOMENTUM_END);
    }

    public static int h(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }
}
