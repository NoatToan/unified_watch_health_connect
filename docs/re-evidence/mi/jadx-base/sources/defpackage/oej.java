package defpackage;

import com.facebook.react.uimanager.NativeKind;
import com.facebook.react.uimanager.e;
import com.facebook.yoga.YogaDirection;
import defpackage.oej;

/* JADX INFO: loaded from: classes4.dex */
public interface oej<T extends oej> {
    void addChildAt(T t, int i);

    void addNativeChildAt(T t, int i);

    void calculateLayout();

    void calculateLayout(float f, float f2);

    Iterable<? extends oej> calculateLayoutOnChildren();

    void dirty();

    boolean dispatchUpdates(float f, float f2, e eVar, aig aigVar);

    void dispose();

    T getChildAt(int i);

    int getChildCount();

    Integer getHeightMeasureSpec();

    float getLayoutHeight();

    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    NativeKind getNativeKind();

    int getNativeOffsetForChild(T t);

    T getNativeParent();

    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    o0s getStyleHeight();

    o0s getStyleWidth();

    g9p getThemedContext();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasUpdates();

    int indexOf(T t);

    int indexOfNativeChild(T t);

    boolean isDescendantOf(T t);

    boolean isLayoutOnly();

    boolean isVirtual();

    void markUpdateSeen();

    void onBeforeLayout(aig aigVar);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i);

    T removeNativeChildAt(int i);

    void setIsLayoutOnly(boolean z);

    void setLayoutDirection(YogaDirection yogaDirection);

    void setLayoutParent(T t);

    void setLocalData(Object obj);

    void setMeasureSpecs(int i, int i2);

    void setReactTag(int i);

    void setRootTag(int i);

    void setStyleHeight(float f);

    void setStyleWidth(float f);

    void setThemedContext(g9p g9pVar);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(yej yejVar);
}
