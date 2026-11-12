package com.facebook.react.uimanager.events;

/* JADX INFO: loaded from: classes4.dex */
public enum TouchEventType {
    START,
    END,
    MOVE,
    CANCEL;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7509a;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            f7509a = iArr;
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7509a[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7509a[TouchEventType.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7509a[TouchEventType.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String getJSEventName(TouchEventType touchEventType) {
        int i = a.f7509a[touchEventType.ordinal()];
        if (i == 1) {
            return "topTouchStart";
        }
        if (i == 2) {
            return "topTouchEnd";
        }
        if (i == 3) {
            return "topTouchMove";
        }
        if (i == 4) {
            return "topTouchCancel";
        }
        throw new IllegalArgumentException("Unexpected type " + touchEventType);
    }
}
