package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;
import l7.f;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public interface a<T> {
    }

    /* JADX INFO: renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0091b<T, V> {
    }

    public static class c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f6625a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f6626b = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a<T> f6628d;

        public c(boolean z14, a<T> aVar) {
            this.f6627c = z14;
            this.f6628d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            androidx.customview.widget.a.C0090a c0090a = (androidx.customview.widget.a.C0090a) this.f6628d;
            c0090a.getClass();
            Rect rect = this.f6625a;
            ((f) t7).f(rect);
            c0090a.getClass();
            Rect rect2 = this.f6626b;
            ((f) t14).f(rect2);
            int i14 = rect.top;
            int i15 = rect2.top;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.left;
            int i17 = rect2.left;
            boolean z14 = this.f6627c;
            if (i16 < i17) {
                return z14 ? 1 : -1;
            }
            if (i16 > i17) {
                return z14 ? -1 : 1;
            }
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if (i18 < i19) {
                return -1;
            }
            if (i18 > i19) {
                return 1;
            }
            int i24 = rect.right;
            int i25 = rect2.right;
            if (i24 < i25) {
                return z14 ? 1 : -1;
            }
            if (i24 > i25) {
                return z14 ? -1 : 1;
            }
            return 0;
        }
    }

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean a(int i14, Rect rect, Rect rect2, Rect rect3) {
        int iD;
        int i15;
        int i16;
        boolean zB = b(i14, rect, rect2);
        if (b(i14, rect, rect3) || !zB) {
            return false;
        }
        if (i14 != 17) {
            if (i14 != 33) {
                if (i14 != 66) {
                    if (i14 != 130) {
                        h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i14 != 17 && i14 != 66) {
                            iD = d(i14, rect, rect2);
                            if (i14 != 17) {
                                i15 = rect.left;
                                i16 = rect3.left;
                            } else if (i14 != 33) {
                                i15 = rect.top;
                                i16 = rect3.top;
                            } else if (i14 != 66) {
                                i15 = rect3.right;
                                i16 = rect.right;
                            } else {
                                if (i14 == 130) {
                                    h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i15 = rect3.bottom;
                                i16 = rect.bottom;
                            }
                            if (iD < Math.max(1, i15 - i16)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i14 != 17) {
                        iD = d(i14, rect, rect2);
                        if (i14 != 17) {
                            i15 = rect.left;
                            i16 = rect3.left;
                        } else if (i14 != 33) {
                            i15 = rect.top;
                            i16 = rect3.top;
                        } else if (i14 != 66) {
                            i15 = rect3.right;
                            i16 = rect.right;
                        } else {
                            if (i14 == 130) {
                                h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i15 = rect3.bottom;
                            i16 = rect.bottom;
                        }
                        if (iD < Math.max(1, i15 - i16)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i14 != 17) {
                    iD = d(i14, rect, rect2);
                    if (i14 != 17) {
                        i15 = rect.left;
                        i16 = rect3.left;
                    } else if (i14 != 33) {
                        i15 = rect.top;
                        i16 = rect3.top;
                    } else if (i14 != 66) {
                        i15 = rect3.right;
                        i16 = rect.right;
                    } else {
                        if (i14 == 130) {
                            h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i15 = rect3.bottom;
                        i16 = rect.bottom;
                    }
                    if (iD < Math.max(1, i15 - i16)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i14 != 17) {
                iD = d(i14, rect, rect2);
                if (i14 != 17) {
                    i15 = rect.left;
                    i16 = rect3.left;
                } else if (i14 != 33) {
                    i15 = rect.top;
                    i16 = rect3.top;
                } else if (i14 != 66) {
                    i15 = rect3.right;
                    i16 = rect.right;
                } else {
                    if (i14 == 130) {
                        h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    i15 = rect3.bottom;
                    i16 = rect.bottom;
                }
                if (iD < Math.max(1, i15 - i16)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(int i14, Rect rect, Rect rect2) {
        if (i14 != 17) {
            if (i14 != 33) {
                if (i14 != 66) {
                    if (i14 != 130) {
                        h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i14, Rect rect, Rect rect2) {
        if (i14 == 17) {
            int i15 = rect.right;
            int i16 = rect2.right;
            return (i15 > i16 || rect.left >= i16) && rect.left > rect2.left;
        }
        if (i14 == 33) {
            int i17 = rect.bottom;
            int i18 = rect2.bottom;
            return (i17 > i18 || rect.top >= i18) && rect.top > rect2.top;
        }
        if (i14 == 66) {
            int i19 = rect.left;
            int i24 = rect2.left;
            return (i19 < i24 || rect.right <= i24) && rect.right < rect2.right;
        }
        if (i14 != 130) {
            h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i25 = rect.top;
        int i26 = rect2.top;
        return (i25 < i26 || rect.bottom <= i26) && rect.bottom < rect2.bottom;
    }

    public static int d(int i14, Rect rect, Rect rect2) {
        int i15;
        int i16;
        if (i14 == 17) {
            i15 = rect.left;
            i16 = rect2.right;
        } else if (i14 == 33) {
            i15 = rect.top;
            i16 = rect2.bottom;
        } else if (i14 == 66) {
            i15 = rect2.left;
            i16 = rect.right;
        } else {
            if (i14 != 130) {
                h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i15 = rect2.top;
            i16 = rect.bottom;
        }
        return Math.max(0, i15 - i16);
    }

    public static int e(int i14, Rect rect, Rect rect2) {
        if (i14 != 17) {
            if (i14 != 33) {
                if (i14 != 66) {
                    if (i14 != 130) {
                        h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
