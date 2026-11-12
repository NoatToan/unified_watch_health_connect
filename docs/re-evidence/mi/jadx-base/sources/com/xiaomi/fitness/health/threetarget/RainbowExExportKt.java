package com.xiaomi.fitness.health.threetarget;

import android.graphics.drawable.Drawable;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.jji;
import defpackage.qni;
import defpackage.x44;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\u00020\u0002¢\u0006\u0002\u0010\t\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0005*\u00020\u0002¨\u0006\u000e"}, d2 = {"getItemColor", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "circleCount", "getItemColors", "", "getDrawables", "", "Landroid/graphics/drawable/Drawable;", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;)[Landroid/graphics/drawable/Drawable;", "getItemBgColors", "isWhite", "", "getItemBgColorsWithAlpha", "health-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RainbowExExportKt {
    @NotNull
    public static final Drawable[] getDrawables(@NotNull GoalItem goalItem) {
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            return new Drawable[]{AppUtil.getApp().getDrawable(qni.e), AppUtil.getApp().getDrawable(qni.f)};
        }
        if (type == 2) {
            return new Drawable[]{AppUtil.getApp().getDrawable(qni.f31678a), AppUtil.getApp().getDrawable(qni.f31679b)};
        }
        if (type != 3) {
            return type != 4 ? new Drawable[]{AppUtil.getApp().getDrawable(qni.g), AppUtil.getApp().getDrawable(qni.h)} : new Drawable[]{AppUtil.getApp().getDrawable(qni.g), AppUtil.getApp().getDrawable(qni.h)};
        }
        return new Drawable[]{AppUtil.getApp().getDrawable(qni.c), AppUtil.getApp().getDrawable(qni.d)};
    }

    @NotNull
    public static final int[] getItemBgColors(@NotNull GoalItem goalItem, boolean z) {
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            return z ? new int[]{x44.a(jji.z), x44.a(jji.x)} : new int[]{x44.a(jji.y), x44.a(jji.w)};
        }
        if (type == 2) {
            return z ? new int[]{x44.a(jji.j), x44.a(jji.h)} : new int[]{x44.a(jji.i), x44.a(jji.g)};
        }
        if (type == 3) {
            return z ? new int[]{x44.a(jji.t), x44.a(jji.f22867r)} : new int[]{x44.a(jji.s), x44.a(jji.q)};
        }
        if (type != 4) {
            return z ? new int[]{x44.a(jji.H), x44.a(jji.E)} : new int[]{x44.a(jji.G), x44.a(jji.D)};
        }
        return z ? new int[]{x44.a(jji.H), x44.a(jji.E)} : new int[]{x44.a(jji.G), x44.a(jji.D)};
    }

    @NotNull
    public static final int[] getItemBgColorsWithAlpha(@NotNull GoalItem goalItem) {
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            return new int[]{x44.a(jji.P), x44.a(jji.O)};
        }
        if (type == 2) {
            return new int[]{x44.a(jji.L), x44.a(jji.K)};
        }
        if (type != 3) {
            return type != 4 ? new int[]{x44.a(jji.F), x44.a(jji.C)} : new int[]{x44.a(jji.R), x44.a(jji.Q)};
        }
        return new int[]{x44.a(jji.N), x44.a(jji.M)};
    }

    public static final int getItemColor(@NotNull GoalItem goalItem) {
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            return x44.a(jji.B);
        }
        if (type == 2) {
            return x44.a(jji.l);
        }
        if (type != 3) {
            return type != 4 ? x44.a(jji.B) : x44.a(jji.J);
        }
        return x44.a(jji.v);
    }

    public static /* synthetic */ int getItemColor$default(GoalItem goalItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return getItemColor(goalItem, i);
    }

    @NotNull
    public static final int[] getItemColors(@NotNull GoalItem goalItem) {
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            return new int[]{x44.a(jji.B), x44.a(jji.A)};
        }
        if (type == 2) {
            return new int[]{x44.a(jji.l), x44.a(jji.f22866k)};
        }
        if (type != 3) {
            return type != 4 ? new int[]{x44.a(jji.J), x44.a(jji.I)} : new int[]{x44.a(jji.J), x44.a(jji.I)};
        }
        return new int[]{x44.a(jji.v), x44.a(jji.u)};
    }

    public static /* synthetic */ int[] getItemColors$default(GoalItem goalItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return getItemColors(goalItem, i);
    }

    public static final int getItemColor(@NotNull GoalItem goalItem, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            if (i == 0) {
                i2 = jji.B;
            } else {
                i2 = jji.o;
            }
            return x44.a(i2);
        }
        if (type == 2) {
            if (i == 0) {
                i3 = jji.l;
            } else {
                i3 = jji.m;
            }
            return x44.a(i3);
        }
        if (type == 3) {
            if (i == 0) {
                i4 = jji.v;
            } else {
                i4 = jji.n;
            }
            return x44.a(i4);
        }
        if (type != 4) {
            return x44.a(jji.B);
        }
        if (i == 0) {
            i5 = jji.J;
        } else {
            i5 = jji.p;
        }
        return x44.a(i5);
    }

    @NotNull
    public static final int[] getItemColors(@NotNull GoalItem goalItem, int i) {
        Intrinsics.checkNotNullParameter(goalItem, "<this>");
        int type = goalItem.getType();
        if (type == 1) {
            if (i == 0) {
                return new int[]{x44.a(jji.B), x44.a(jji.A)};
            }
            return new int[]{x44.a(jji.B), x44.a(jji.o)};
        }
        if (type == 2) {
            if (i == 0) {
                return new int[]{x44.a(jji.l), x44.a(jji.f22866k)};
            }
            return new int[]{x44.a(jji.l), x44.a(jji.m)};
        }
        if (type == 3) {
            if (i == 0) {
                return new int[]{x44.a(jji.v), x44.a(jji.u)};
            }
            return new int[]{x44.a(jji.v), x44.a(jji.n)};
        }
        if (type != 4) {
            return new int[]{x44.a(jji.J), x44.a(jji.I)};
        }
        if (i == 0) {
            return new int[]{x44.a(jji.J), x44.a(jji.I)};
        }
        return new int[]{x44.a(jji.J), x44.a(jji.p)};
    }
}
