package com.google.android.material.carousel;

import am.j;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = Collections.unmodifiableList(list);
        this.endStateSteps = Collections.unmodifiableList(list2);
        float f14 = ((KeylineState) com.airbnb.lottie.animation.keyframe.a.c(1, list)).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f14;
        float f15 = keylineState.getLastKeyline().loc - ((KeylineState) com.airbnb.lottie.animation.keyframe.a.c(1, list2)).getLastKeyline().loc;
        this.endShiftRange = f15;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f14, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f15, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f14, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f14, fArr);
        return stateStepsRange[0] >= 0.5f ? list.get((int) stateStepsRange[2]) : list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f14) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f14 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i14 = 0; i14 < keylineState.getKeylines().size(); i14++) {
            if (!keylineState.getKeylines().get(i14).isAnchor) {
                return i14;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f14) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f14 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f14, float f15, float f16) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f14, f15), getStateStepsEnd(carousel, keylineState, f14, f16));
    }

    private static float[] getStateStepInterpolationPoints(float f14, List<KeylineState> list, boolean z14) {
        int size = list.size();
        float[] fArr = new float[size];
        int i14 = 1;
        while (i14 < size) {
            int i15 = i14 - 1;
            KeylineState keylineState = list.get(i15);
            KeylineState keylineState2 = list.get(i14);
            fArr[i14] = i14 == size + (-1) ? 1.0f : fArr[i15] + ((z14 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f14);
            i14++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f14, float f15) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && iFindLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = iFindLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f16 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f16 - keylineState.getLastFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            int i14 = 0;
            float f17 = 0.0f;
            while (i14 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) j.f(1, arrayList);
                int i15 = iFindLastNonAnchorKeylineIndex - i14;
                float f18 = f17 + keylineState.getKeylines().get(i15).cutoff;
                int i16 = i15 + 1;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindLastNonAnchorKeylineIndex, i16 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i16).mask) + 1 : 0, f16 - f18, keylineState.getFirstFocalKeylineIndex() + i14 + 1, keylineState.getLastFocalKeylineIndex() + i14 + 1, containerWidth);
                if (i14 == lastFocalKeylineIndex - 1 && f15 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f15, containerWidth, false, f14);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i14++;
                f17 = f18;
            }
        } else if (f15 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f15, containerWidth, false, f14));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f14, float[] fArr) {
        int size = list.size();
        float f15 = fArr[0];
        int i14 = 1;
        while (i14 < size) {
            float f16 = fArr[i14];
            if (f14 <= f16) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f15, f16, f14), i14 - 1, i14};
            }
            i14++;
            f15 = f16;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f14, float f15) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && iFindFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - iFindFirstNonAnchorKeylineIndex;
            float f16 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f16 + keylineState.getFirstFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            int i14 = 0;
            float f17 = 0.0f;
            while (i14 < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) j.f(1, arrayList);
                int i15 = iFindFirstNonAnchorKeylineIndex + i14;
                int size = keylineState.getKeylines().size() - 1;
                float f18 = f17 + keylineState.getKeylines().get(i15).cutoff;
                int i16 = i15 - 1;
                if (i16 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i16).mask) - 1;
                }
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindFirstNonAnchorKeylineIndex, size, f16 + f18, (keylineState.getFirstFocalKeylineIndex() - i14) - 1, (keylineState.getLastFocalKeylineIndex() - i14) - 1, containerWidth);
                if (i14 == firstFocalKeylineIndex - 1 && f15 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f15, containerWidth, true, f14);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i14++;
                f17 = f18;
            }
        } else if (f15 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f15, containerWidth, true, f14));
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        return keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline();
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        return (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) + keylineState.getLastFocalKeyline().locOffset <= ((float) containerHeight) && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline();
    }

    private static KeylineState lerp(List<KeylineState> list, float f14, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f14, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i14, int i15, float f14, int i16, int i17, float f15) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i15, (KeylineState.Keyline) arrayList.remove(i14));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f15);
        int i18 = 0;
        while (i18 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i18);
            float f16 = keyline.maskedItemSize;
            builder.addKeyline((f16 / 2.0f) + f14, keyline.mask, f16, i18 >= i16 && i18 <= i17, keyline.isAnchor, keyline.cutoff);
            f14 += keyline.maskedItemSize;
            i18++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f14, float f15, boolean z14, float f16) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f15);
        float numberOfNonAnchorKeylines = f14 / keylineState.getNumberOfNonAnchorKeylines();
        float f17 = z14 ? f14 : 0.0f;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i14);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z15 = i14 >= keylineState.getFirstFocalKeylineIndex() && i14 <= keylineState.getLastFocalKeylineIndex();
                float f18 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f18, keylineState.getItemSize(), f16);
                float f19 = (f18 / 2.0f) + f17;
                float f22 = f19 - keyline.locOffset;
                builder.addKeyline(f19, childMaskPercentage, f18, z15, false, keyline.cutoff, z14 ? f22 : 0.0f, z14 ? 0.0f : f22);
                f17 += f18;
            }
            i14++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f14, float f15) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f14, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f15);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        return (KeylineState) com.airbnb.lottie.animation.keyframe.a.c(1, this.endStateSteps);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i14, int i15, int i16, boolean z14) {
        float itemSize = this.defaultState.getItemSize();
        HashMap map = new HashMap();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i17 >= i14) {
                break;
            }
            int i19 = z14 ? (i14 - i17) - 1 : i17;
            if (i19 * itemSize * (z14 ? -1 : 1) > i16 - this.endShiftRange || i17 >= i14 - this.endStateSteps.size()) {
                Integer numValueOf = Integer.valueOf(i19);
                List<KeylineState> list = this.endStateSteps;
                map.put(numValueOf, list.get(g7.a.b(i18, 0, list.size() - 1)));
                i18++;
            }
            i17++;
        }
        int i24 = 0;
        for (int i25 = i14 - 1; i25 >= 0; i25--) {
            int i26 = z14 ? (i14 - i25) - 1 : i25;
            if (i26 * itemSize * (z14 ? -1 : 1) < i15 + this.startShiftRange || i25 < this.startStateSteps.size()) {
                Integer numValueOf2 = Integer.valueOf(i26);
                List<KeylineState> list2 = this.startStateSteps;
                map.put(numValueOf2, list2.get(g7.a.b(i24, 0, list2.size() - 1)));
                i24++;
            }
        }
        return map;
    }

    public KeylineState getShiftedState(float f14, float f15, float f16, boolean z14) {
        float fLerp;
        List<KeylineState> list;
        float[] fArr;
        float f17 = this.startShiftRange + f15;
        float f18 = f16 - this.endShiftRange;
        float f19 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f22 = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f19) {
            f17 += f19;
        }
        if (this.endShiftRange == f22) {
            f18 -= f22;
        }
        if (f14 < f17) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f15, f17, f14);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f14 <= f18) {
                return this.defaultState;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f18, f16, f14);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z14 ? closestStateStepFromInterpolation(list, fLerp, fArr) : lerp(list, fLerp, fArr);
    }

    public KeylineState getStartState() {
        return (KeylineState) com.airbnb.lottie.animation.keyframe.a.c(1, this.startStateSteps);
    }

    public KeylineState getShiftedState(float f14, float f15, float f16) {
        return getShiftedState(f14, f15, f16, false);
    }
}
