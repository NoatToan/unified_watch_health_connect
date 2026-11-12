package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
interface FlexContainer {
    public static final int NOT_SET = -1;

    void addView(View view2);

    void addView(View view2, int i14);

    int getAlignContent();

    int getAlignItems();

    int getChildHeightMeasureSpec(int i14, int i15, int i16);

    int getChildWidthMeasureSpec(int i14, int i15, int i16);

    int getDecorationLengthCrossAxis(View view2);

    int getDecorationLengthMainAxis(View view2, int i14, int i15);

    int getFlexDirection();

    View getFlexItemAt(int i14);

    int getFlexItemCount();

    List<FlexLine> getFlexLines();

    List<FlexLine> getFlexLinesInternal();

    int getFlexWrap();

    int getJustifyContent();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    View getReorderedFlexItemAt(int i14);

    int getSumOfCrossSize();

    boolean isMainAxisDirectionHorizontal();

    void onNewFlexItemAdded(View view2, int i14, int i15, FlexLine flexLine);

    void onNewFlexLineAdded(FlexLine flexLine);

    void removeAllViews();

    void removeViewAt(int i14);

    void setAlignContent(int i14);

    void setAlignItems(int i14);

    void setFlexDirection(int i14);

    void setFlexLines(List<FlexLine> list);

    void setFlexWrap(int i14);

    void setJustifyContent(int i14);

    void setMaxLine(int i14);

    void updateViewCache(int i14, View view2);
}
