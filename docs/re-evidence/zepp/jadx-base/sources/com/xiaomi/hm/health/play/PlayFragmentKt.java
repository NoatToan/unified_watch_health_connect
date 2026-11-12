package com.xiaomi.hm.health.play;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Landroidx/viewpager2/widget/ViewPager2;", "", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class PlayFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ViewPager2 viewPager2) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(viewPager2);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) obj;
        Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(recyclerView);
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        declaredField2.set(recyclerView, Integer.valueOf(((Integer) obj2).intValue() * 3));
    }
}
