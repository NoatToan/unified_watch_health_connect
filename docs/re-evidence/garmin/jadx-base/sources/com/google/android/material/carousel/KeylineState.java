package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    private KeylineState(float f14, List<Keyline> list, int i14, int i15) {
        this.itemSize = f14;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i14;
        this.lastFocalKeylineIndex = i15;
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f14) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            h.s("Keylines being linearly interpolated must have the same item size.");
            return null;
        }
        List<Keyline> keylines = keylineState.getKeylines();
        List<Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            h.s("Keylines being linearly interpolated must have the same number of keylines.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < keylineState.getKeylines().size(); i14++) {
            arrayList.add(Keyline.lerp(keylines.get(i14), keylines2.get(i14), f14));
        }
        return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f14), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f14));
    }

    public static KeylineState reverse(KeylineState keylineState, float f14) {
        Builder builder = new Builder(keylineState.getItemSize(), f14);
        float f15 = (f14 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f15, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f15 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    public Keyline getFirstNonAnchorKeyline() {
        for (int i14 = 0; i14 < this.keylines.size(); i14++) {
            Keyline keyline = this.keylines.get(i14);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        return (Keyline) com.airbnb.lottie.animation.keyframe.a.c(1, this.keylines);
    }

    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i14++;
            }
        }
        return this.keylines.size() - i14;
    }

    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        public Keyline(float f14, float f15, float f16, float f17, boolean z14, float f18, float f19, float f22) {
            this.loc = f14;
            this.locOffset = f15;
            this.mask = f16;
            this.maskedItemSize = f17;
            this.isAnchor = z14;
            this.cutoff = f18;
            this.leftOrTopPaddingShift = f19;
            this.rightOrBottomPaddingShift = f22;
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, float f14) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f14), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f14), AnimationUtils.lerp(keyline.mask, keyline2.mask, f14), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f14));
        }

        public Keyline(float f14, float f15, float f16, float f17) {
            this(f14, f15, f16, f17, false, 0.0f, 0.0f, 0.0f);
        }
    }

    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        public Builder(float f14, float f15) {
            this.itemSize = f14;
            this.availableSpace = f15;
        }

        private static float calculateKeylineLocationForItemPosition(float f14, float f15, int i14, int i15) {
            return (i15 * f15) + (f14 - (i14 * f15));
        }

        @CanIgnoreReturnValue
        public Builder addAnchorKeyline(float f14, float f15, float f16) {
            return addKeyline(f14, f15, f16, false, true);
        }

        @CanIgnoreReturnValue
        public Builder addKeyline(float f14, float f15, float f16, boolean z14, boolean z15, float f17, float f18, float f19) {
            if (f16 <= 0.0f) {
                return this;
            }
            if (z15) {
                if (z14) {
                    h.s("Anchor keylines cannot be focal.");
                    return null;
                }
                int i14 = this.latestAnchorKeylineIndex;
                if (i14 != -1 && i14 != 0) {
                    h.s("Anchor keylines must be either the first or last keyline.");
                    return null;
                }
                this.latestAnchorKeylineIndex = this.tmpKeylines.size();
            }
            Keyline keyline = new Keyline(UNKNOWN_LOC, f14, f15, f16, z15, f17, f18, f19);
            Keyline keyline2 = this.tmpFirstFocalKeyline;
            if (z14) {
                if (keyline2 == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    h.s("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                    return null;
                }
                if (f16 != this.tmpFirstFocalKeyline.maskedItemSize) {
                    h.s("Keylines that are marked as focal must all have the same masked item size.");
                    return null;
                }
                this.tmpLastFocalKeyline = keyline;
                this.lastFocalKeylineIndex = this.tmpKeylines.size();
            } else {
                if (keyline2 == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    h.s("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                    return null;
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    h.s("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                    return null;
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f14, float f15, float f16, int i14, boolean z14) {
            if (i14 > 0 && f16 > 0.0f) {
                for (int i15 = 0; i15 < i14; i15++) {
                    addKeyline((i15 * f16) + f14, f15, f16, z14);
                }
            }
            return this;
        }

        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                h.z("There must be a keyline marked as focal.");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < this.tmpKeylines.size(); i14++) {
                Keyline keyline = this.tmpKeylines.get(i14);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i14), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
        }

        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f14, float f15, float f16, int i14) {
            return addKeylineRange(f14, f15, f16, i14, false);
        }

        @CanIgnoreReturnValue
        public Builder addKeyline(float f14, float f15, float f16) {
            return addKeyline(f14, f15, f16, false);
        }

        @CanIgnoreReturnValue
        public Builder addKeyline(float f14, float f15, float f16, boolean z14) {
            return addKeyline(f14, f15, f16, z14, false);
        }

        @CanIgnoreReturnValue
        public Builder addKeyline(float f14, float f15, float f16, boolean z14, boolean z15, float f17) {
            return addKeyline(f14, f15, f16, z14, z15, f17, 0.0f, 0.0f);
        }

        @CanIgnoreReturnValue
        public Builder addKeyline(float f14, float f15, float f16, boolean z14, boolean z15) {
            float fAbs;
            float f17 = f16 / 2.0f;
            float f18 = f14 - f17;
            float f19 = f17 + f14;
            float f22 = this.availableSpace;
            if (f19 > f22) {
                fAbs = Math.abs(f19 - Math.max(f19 - f16, f22));
            } else {
                fAbs = 0.0f;
                if (f18 < 0.0f) {
                    fAbs = Math.abs(f18 - Math.min(f18 + f16, 0.0f));
                }
            }
            return addKeyline(f14, f15, f16, z14, z15, fAbs);
        }
    }
}
