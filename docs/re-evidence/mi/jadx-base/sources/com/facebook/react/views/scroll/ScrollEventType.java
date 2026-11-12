package com.facebook.react.views.scroll;

/* JADX INFO: loaded from: classes4.dex */
public enum ScrollEventType {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7549a;

        static {
            int[] iArr = new int[ScrollEventType.values().length];
            f7549a = iArr;
            try {
                iArr[ScrollEventType.BEGIN_DRAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7549a[ScrollEventType.END_DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7549a[ScrollEventType.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7549a[ScrollEventType.MOMENTUM_BEGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7549a[ScrollEventType.MOMENTUM_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String getJSEventName(ScrollEventType scrollEventType) {
        int i = a.f7549a[scrollEventType.ordinal()];
        if (i == 1) {
            return "topScrollBeginDrag";
        }
        if (i == 2) {
            return "topScrollEndDrag";
        }
        if (i == 3) {
            return "topScroll";
        }
        if (i == 4) {
            return "topMomentumScrollBegin";
        }
        if (i == 5) {
            return "topMomentumScrollEnd";
        }
        throw new IllegalArgumentException("Unsupported ScrollEventType: " + scrollEventType);
    }

    public String getJSEventName() {
        return getJSEventName(this);
    }
}
