package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.PointerEventsConfig;

/* JADX INFO: loaded from: classes6.dex */
public class b9j implements nsq {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3953a;

        static {
            int[] iArr = new int[PointerEvents.values().length];
            f3953a = iArr;
            try {
                iArr[PointerEvents.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3953a[PointerEvents.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3953a[PointerEvents.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // defpackage.nsq
    public boolean a(ViewGroup viewGroup) {
        if (viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof ReactViewGroup) {
            return "hidden".equals(((ReactViewGroup) viewGroup).getOverflow());
        }
        return false;
    }

    @Override // defpackage.nsq
    public View b(ViewGroup viewGroup, int i) {
        return viewGroup instanceof ReactViewGroup ? viewGroup.getChildAt(((ReactViewGroup) viewGroup).getZIndexMappedChildIndex(i)) : viewGroup.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nsq
    public PointerEventsConfig c(View view) {
        PointerEvents pointerEvents = view instanceof hej ? ((hej) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return PointerEventsConfig.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return PointerEventsConfig.NONE;
            }
        }
        int i = a.f3953a[pointerEvents.ordinal()];
        if (i == 1) {
            return PointerEventsConfig.BOX_ONLY;
        }
        if (i != 2) {
            return i != 3 ? PointerEventsConfig.AUTO : PointerEventsConfig.NONE;
        }
        return PointerEventsConfig.BOX_NONE;
    }
}
