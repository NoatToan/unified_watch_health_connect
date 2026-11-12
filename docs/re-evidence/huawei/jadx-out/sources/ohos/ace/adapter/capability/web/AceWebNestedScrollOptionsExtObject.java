package ohos.ace.adapter.capability.web;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebNestedScrollOptionsExtObject {
    private NestedScrollMode scrollDown;
    private NestedScrollMode scrollLeft;
    private NestedScrollMode scrollRight;
    private NestedScrollMode scrollUp;

    enum NestedScrollMode {
        SELF_ONLY,
        SELF_FIRST,
        PARENT_FIRST,
        PARALLEL
    }

    public void set(int i, int i2, int i3, int i4) {
        this.scrollUp = fromInt(i);
        this.scrollDown = fromInt(i2);
        this.scrollLeft = fromInt(i3);
        this.scrollRight = fromInt(i4);
    }

    public boolean needParallelScroll(float f, float f2) {
        if (Float.compare(Math.abs(f), 0.0f) == 0 && Float.compare(Math.abs(f2), 0.0f) == 0) {
            return false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            if (Float.compare(f, 0.0f) < 0) {
                if (this.scrollRight == NestedScrollMode.PARALLEL) {
                    return true;
                }
            } else if (this.scrollLeft == NestedScrollMode.PARALLEL) {
                return true;
            }
        } else if (Math.abs(f) < Math.abs(f2)) {
            if (Float.compare(f2, 0.0f) < 0) {
                if (this.scrollDown == NestedScrollMode.PARALLEL) {
                    return true;
                }
            } else if (this.scrollUp == NestedScrollMode.PARALLEL) {
                return true;
            }
        }
        return false;
    }

    private NestedScrollMode fromInt(int i) {
        if (i == 0) {
            return NestedScrollMode.SELF_ONLY;
        }
        if (i == 1) {
            return NestedScrollMode.SELF_FIRST;
        }
        if (i == 2) {
            return NestedScrollMode.PARENT_FIRST;
        }
        if (i == 3) {
            return NestedScrollMode.PARALLEL;
        }
        return NestedScrollMode.SELF_ONLY;
    }
}
