package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.mi.health.course.export.data.CourseConfigModel;
import com.reactnativepagerview.PagerViewViewManager;
import com.reactnativepagerview.event.PageScrollEvent;
import com.reactnativepagerview.event.PageScrollStateChangedEvent;
import com.reactnativepagerview.event.PageSelectedEvent;
import com.xiaomi.onetrack.api.b;
import defpackage.e4f;
import defpackage.g9p;
import defpackage.iej;
import defpackage.pd8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010\u001dJ\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b'\u0010\u001dJ\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010&J'\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030+0*H\u0016¢\u0006\u0004\b,\u0010-J+\u00102\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00032\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00104\u001a\u00020\rH\u0007¢\u0006\u0004\b5\u0010\u001dR\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/NestedScrollableHost;", "", "getName", "()Ljava/lang/String;", "Lg9p;", "reactContext", "createViewInstance", "(Lg9p;)Lcom/reactnativepagerview/NestedScrollableHost;", b.E, "Landroid/view/View;", "child", "", "index", "", "addView", "(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;I)V", "parent", "getChildCount", "(Lcom/reactnativepagerview/NestedScrollableHost;)I", "getChildAt", "(Lcom/reactnativepagerview/NestedScrollableHost;I)Landroid/view/View;", "view", "removeView", "(Lcom/reactnativepagerview/NestedScrollableHost;Landroid/view/View;)V", "removeAllViews", "(Lcom/reactnativepagerview/NestedScrollableHost;)V", "removeViewAt", "(Lcom/reactnativepagerview/NestedScrollableHost;I)V", "", "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(Lcom/reactnativepagerview/NestedScrollableHost;Z)V", "setInitialPage", "setOrientation", "(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;)V", CourseConfigModel.DevCmd.CMD_ACTION_SET, "setOverScrollMode", "setLayoutDirection", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/reactnativepagerview/NestedScrollableHost;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "margin", "setPageMargin", "Lpd8;", "eventDispatcher", "Lpd8;", "<init>", "()V", "Companion", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0})
public final class PagerViewViewManager extends ViewGroupManager<NestedScrollableHost> {

    @NotNull
    private static final String COMMAND_SET_PAGE = "setPage";

    @NotNull
    private static final String COMMAND_SET_PAGE_WITHOUT_ANIMATION = "setPageWithoutAnimation";

    @NotNull
    private static final String COMMAND_SET_SCROLL_ENABLED = "setScrollEnabledImperatively";
    private pd8 eventDispatcher;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(ViewPager2 vp, final PagerViewViewManager this$0, final NestedScrollableHost host) {
        Intrinsics.checkNotNullParameter(vp, "$vp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(host, "$host");
        vp.h(new ViewPager2.i() { // from class: com.reactnativepagerview.PagerViewViewManager$createViewInstance$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int state) {
                String str;
                super.onPageScrollStateChanged(state);
                if (state == 0) {
                    str = "idle";
                } else if (state == 1) {
                    str = "dragging";
                } else {
                    if (state != 2) {
                        throw new IllegalStateException("Unsupported pageScrollState");
                    }
                    str = "settling";
                }
                pd8 pd8Var = this.this$0.eventDispatcher;
                if (pd8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventDispatcher");
                    pd8Var = null;
                }
                pd8Var.dispatchEvent(new PageScrollStateChangedEvent(host.getId(), str));
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                pd8 pd8Var = this.this$0.eventDispatcher;
                if (pd8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventDispatcher");
                    pd8Var = null;
                }
                pd8Var.dispatchEvent(new PageScrollEvent(host.getId(), position, positionOffset));
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                pd8 pd8Var = this.this$0.eventDispatcher;
                if (pd8Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventDispatcher");
                    pd8Var = null;
                }
                pd8Var.dispatchEvent(new PageSelectedEvent(host.getId(), position));
            }
        });
        pd8 pd8Var = this$0.eventDispatcher;
        if (pd8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventDispatcher");
            pd8Var = null;
        }
        pd8Var.dispatchEvent(new PageSelectedEvent(host.getId(), vp.getCurrentItem()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public NestedScrollableHost createViewInstance(@NotNull g9p reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(reactContext);
        nestedScrollableHost.setId(View.generateViewId());
        nestedScrollableHost.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nestedScrollableHost.setSaveEnabled(false);
        final ViewPager2 viewPager2 = new ViewPager2(reactContext);
        viewPager2.setAdapter(new ViewPagerAdapter());
        viewPager2.setSaveEnabled(false);
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        Intrinsics.checkNotNull(nativeModule);
        this.eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        viewPager2.post(new Runnable() { // from class: fih
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(viewPager2, this, nestedScrollableHost);
            }
        });
        nestedScrollableHost.addView(viewPager2);
        return nestedScrollableHost;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> mapF = e4f.f(PageScrollEvent.EVENT_NAME, e4f.d("registrationName", "onPageScroll"), PageScrollStateChangedEvent.EVENT_NAME, e4f.d("registrationName", "onPageScrollStateChanged"), PageSelectedEvent.EVENT_NAME, e4f.d("registrationName", "onPageSelected"));
        Intrinsics.checkNotNullExpressionValue(mapF, "of(...)");
        return mapF;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return PagerViewViewManagerImpl.NAME;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.o0d
    public boolean needsCustomLayoutForChildren() {
        return PagerViewViewManagerImpl.INSTANCE.needsCustomLayoutForChildren();
    }

    @iej(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(@NotNull NestedScrollableHost host, int value) {
        Intrinsics.checkNotNullParameter(host, "host");
        PagerViewViewManagerImpl.INSTANCE.setOffscreenPageLimit(host, value);
    }

    @iej(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(@NotNull NestedScrollableHost host, int value) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        PagerViewViewManagerImpl.INSTANCE.setInitialPage(host, value);
    }

    @iej(name = "layoutDirection")
    public final void setLayoutDirection(@NotNull NestedScrollableHost host, @NotNull String value) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        PagerViewViewManagerImpl.INSTANCE.setLayoutDirection(host, value);
    }

    @iej(name = "orientation")
    public final void setOrientation(@NotNull NestedScrollableHost host, @NotNull String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        PagerViewViewManagerImpl.INSTANCE.setOrientation(host, value);
    }

    @iej(name = "overScrollMode")
    public final void setOverScrollMode(@NotNull NestedScrollableHost host, @NotNull String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        PagerViewViewManagerImpl.INSTANCE.setOverScrollMode(host, value);
    }

    @iej(defaultInt = 0, name = "pageMargin")
    public final void setPageMargin(@NotNull NestedScrollableHost host, int margin) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        PagerViewViewManagerImpl.INSTANCE.setPageMargin(host, margin);
    }

    @iej(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(@NotNull NestedScrollableHost host, boolean value) {
        Intrinsics.checkNotNullParameter(host, "host");
        PagerViewViewManagerImpl.INSTANCE.setScrollEnabled(host, value);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull NestedScrollableHost host, @NotNull View child, int index) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(child, "child");
        PagerViewViewManagerImpl.INSTANCE.addView(host, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull NestedScrollableHost parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return PagerViewViewManagerImpl.INSTANCE.getChildAt(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull NestedScrollableHost parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return PagerViewViewManagerImpl.INSTANCE.getChildCount(parent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE_WITHOUT_ANIMATION) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r9);
        r9 = r9.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1.intValue() <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r9 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r9 >= r1.intValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r0.setCurrentItem(r7, r9, kotlin.jvm.internal.Intrinsics.areEqual(r8, com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiveCommand(@org.jetbrains.annotations.NotNull com.reactnativepagerview.NestedScrollableHost r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable com.facebook.react.bridge.ReadableArray r9) throws java.lang.ClassNotFoundException {
        /*
            r6 = this;
            java.lang.String r0 = "root"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            super.receiveCommand(r7, r8, r9)
            com.reactnativepagerview.PagerViewViewManagerImpl r0 = com.reactnativepagerview.PagerViewViewManagerImpl.INSTANCE
            androidx.viewpager2.widget.ViewPager2 r7 = r0.getViewPager(r7)
            defpackage.sk1.c(r7)
            defpackage.sk1.c(r9)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r7.getAdapter()
            if (r1 == 0) goto L23
            int r1 = r1.getItemCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L24
        L23:
            r1 = 0
        L24:
            if (r8 == 0) goto L7d
            int r2 = r8.hashCode()
            r3 = -445763635(0xffffffffe56e2fcd, float:-7.030031E22)
            r4 = 0
            java.lang.String r5 = "setPage"
            if (r2 == r3) goto L56
            r3 = 1747675147(0x682b680b, float:3.2377757E24)
            if (r2 == r3) goto L43
            r3 = 1984860689(0x764e9211, float:1.0474372E33)
            if (r2 != r3) goto L7d
            boolean r2 = r8.equals(r5)
            if (r2 == 0) goto L7d
            goto L5e
        L43:
            java.lang.String r0 = "setScrollEnabledImperatively"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L7d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            boolean r8 = r9.getBoolean(r4)
            r7.setUserInputEnabled(r8)
            goto L7c
        L56:
            java.lang.String r2 = "setPageWithoutAnimation"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L7d
        L5e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r9 = r9.getInt(r4)
            if (r1 == 0) goto L7c
            int r2 = r1.intValue()
            if (r2 <= 0) goto L7c
            if (r9 < 0) goto L7c
            int r1 = r1.intValue()
            if (r9 >= r1) goto L7c
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r5)
            r0.setCurrentItem(r7, r9, r8)
        L7c:
            return
        L7d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            kotlin.jvm.internal.StringCompanionObject r9 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.lang.Class<com.reactnativepagerview.PagerViewViewManager> r9 = com.reactnativepagerview.PagerViewViewManager.class
            java.lang.String r9 = r9.getSimpleName()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            r9 = 2
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "Unsupported command %d received by %s."
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.String r9 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.PagerViewViewManager.receiveCommand(com.reactnativepagerview.NestedScrollableHost, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(@NotNull NestedScrollableHost parent) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PagerViewViewManagerImpl.INSTANCE.removeAllViews(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull NestedScrollableHost parent, @NotNull View view) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        PagerViewViewManagerImpl.INSTANCE.removeView(parent, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull NestedScrollableHost parent, int index) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PagerViewViewManagerImpl.INSTANCE.removeViewAt(parent, index);
    }
}
