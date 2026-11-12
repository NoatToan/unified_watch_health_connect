package com.xiaomi.fitness.sport_eco.course;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.course.CourseGridHolder;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.e1j;
import defpackage.gak;
import defpackage.iq4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/course/CourseGridHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/content/Context;", "context", "", "getRecyclerViewSpan", "(Landroid/content/Context;)I", "Liq4;", "view", "Liq4;", "getView", "()Liq4;", "source", "", "", "data", "<init>", "(Liq4;ILjava/util/List;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseGridHolder extends RecyclerView.d0 {

    @NotNull
    private final iq4 view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseGridHolder(@NotNull iq4 view, int i, @NotNull List<? extends Object> data) {
        int i2;
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        this.view = view;
        if (data.isEmpty()) {
            View root = view.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setHeight(root, 0);
        }
        view.C.addItemDecoration(new gak(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(13)));
        TextView textView = view.A;
        if (i != 1) {
            i2 = i != 2 ? e1j.p0 : e1j.o0;
        } else {
            i2 = e1j.e0;
        }
        textView.setText(ResourceExtKt.getString(i2));
        boolean z = i == 2;
        TextView moreView = view.B;
        Intrinsics.checkNotNullExpressionValue(moreView, "moreView");
        ExtUtilsKt.setVisible(moreView, z && data.size() > 2);
        view.B.setOnClickListener(new View.OnClickListener() { // from class: ir4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CourseGridHolder._init_$lambda$0(view2);
            }
        });
        Context context = view.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CourseGridAdapter courseGridAdapter = new CourseGridAdapter(context, i, null, 4, null);
        view.C.setLayoutManager(new GridLayoutManager(view.getRoot().getContext(), getRecyclerViewSpan(ApplicationExtKt.getApplication()), 1, false));
        view.C.setAdapter(courseGridAdapter);
        courseGridAdapter.setData(z ? data.subList(0, Math.min(2, data.size())) : data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public static final void _init_$lambda$0(View view) {
        String str;
        CourseApi courseApi = CourseApiKt.getCourseApi();
        switch (SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE()) {
            case "yesoul.exbike.jsc01y":
            case "runmi.exbike.jscrm1":
                str = "exercise_bike";
                break;
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr805":
                str = "skipping_rope";
                break;
            default:
                str = "treadmill";
                break;
        }
        courseApi.startCourseMe(str);
    }

    private final int getRecyclerViewSpan(Context context) {
        return SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() ? 3 : 2;
    }

    @NotNull
    public final iq4 getView() {
        return this.view;
    }
}
