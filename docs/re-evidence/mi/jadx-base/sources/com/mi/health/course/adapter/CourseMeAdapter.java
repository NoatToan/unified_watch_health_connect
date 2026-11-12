package com.mi.health.course.adapter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.material.imageview.ShapeableImageView;
import com.mi.health.course.activity.CourseInfoActivityKt;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.onetrack.OneTrack;
import defpackage.czi;
import defpackage.kyi;
import defpackage.oqi;
import defpackage.zu4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00013B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u001c\u0010\u001c\u001a\u00020\u00052\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0007J\u001a\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0007J\u0006\u0010(\u001a\u00020\u0011J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0006\u0010,\u001a\u00020\u0005J \u0010-\u001a\u00020\u00052\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010/2\u0006\u00100\u001a\u00020\u000bH\u0007J\b\u00101\u001a\u00020\u0011H\u0016J\u0006\u00102\u001a\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, d2 = {"Lcom/mi/health/course/adapter/CourseMeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mi/health/course/adapter/CourseMeAdapter$Holder;", "onSelectChange", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnSelectChange", "()Lkotlin/jvm/functions/Function0;", "isEditing", "", "()Z", "setEditing", "(Z)V", "states", "", "", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "list", "", "isMale", "sContext", "Landroid/app/Application;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "selectAll", "selected", "editState", "Landroidx/lifecycle/MutableLiveData;", "getEditState", "()Landroidx/lifecycle/MutableLiveData;", "setEditMode", "edit", "clearState", "getSelectedCount", "getSelectIds", "", "", "resetSelectedIds", "addData", PluginDeviceInfo.FICONOFF, "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "getItemCount", "isAllChecked", "Holder", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseMeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseMeAdapter.kt\ncom/mi/health/course/adapter/CourseMeAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,168:1\n205#2,4:169\n216#2,2:173\n*S KotlinDebug\n*F\n+ 1 CourseMeAdapter.kt\ncom/mi/health/course/adapter/CourseMeAdapter\n*L\n64#1:169,4\n68#1:173,2\n*E\n"})
public final class CourseMeAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private final MutableLiveData<Boolean> editState;
    private boolean isEditing;
    private final boolean isMale;

    @NotNull
    private final List<CourseModel.PracticedCourse> list;

    @NotNull
    private final Function0<Unit> onSelectChange;

    @NotNull
    private final Application sContext;

    @NotNull
    private Map<Integer, CourseModel.PracticedCourse> states;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/mi/health/course/adapter/CourseMeAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "", "pos", "", "bind", "(I)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "onLongClick", "(Landroid/view/View;)Z", "Lzu4;", "binding", "Lzu4;", "<init>", "(Lcom/mi/health/course/adapter/CourseMeAdapter;Lzu4;)V", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCourseMeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseMeAdapter.kt\ncom/mi/health/course/adapter/CourseMeAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,168:1\n54#2,3:169\n24#2:172\n57#2,6:173\n63#2,2:180\n57#3:179\n*S KotlinDebug\n*F\n+ 1 CourseMeAdapter.kt\ncom/mi/health/course/adapter/CourseMeAdapter$Holder\n*L\n104#1:169,3\n104#1:172\n104#1:173,6\n104#1:180,2\n104#1:179\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener, View.OnLongClickListener {

        @NotNull
        private final zu4 binding;
        final /* synthetic */ CourseMeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull CourseMeAdapter courseMeAdapter, zu4 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = courseMeAdapter;
            this.binding = binding;
            this.itemView.setOnClickListener(this);
            this.itemView.setOnLongClickListener(this);
        }

        public final void bind(int pos) {
            this.itemView.setTag(oqi.s, Integer.valueOf(pos));
            CourseModel.PracticedCourse practicedCourse = (CourseModel.PracticedCourse) this.this$0.list.get(pos);
            this.itemView.setTag(practicedCourse);
            CourseModel.CourseData courseData = practicedCourse.courseData;
            if (courseData != null) {
                CourseMeAdapter courseMeAdapter = this.this$0;
                this.binding.E.setText(courseData.title);
                ShapeableImageView imageView = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
                Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(courseData.middleImageUrl).target(imageView).build());
                String zNTimeWithMin = TimeDateUtil.getZNTimeWithMin(courseData.duration);
                int i = courseMeAdapter.isMale ? courseData.maleCalories : courseData.femaleCalories;
                String quantityString = courseMeAdapter.sContext.getResources().getQuantityString(kyi.common_unit_calorie_desc, i, Integer.valueOf(i));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                this.binding.D.setText(ResourceExtKt.getString(czi.course_item_info, zNTimeWithMin, quantityString, CourseExtKt.getDifficult(courseData).getFirst()));
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Entrance"), TuplesKt.to("tip", "56.108.0.1.40461"), TuplesKt.to("area", 5), TuplesKt.to(FaceDetailFragment.PAGE_NAME, "在练课程"), TuplesKt.to("type_sku", Integer.valueOf(courseData.pricingStatus + 1)), TuplesKt.to("asset_id", String.valueOf(courseData.courseId)), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseData.name)));
            }
            CourseModel.PracticedSummary practicedSummary = practicedCourse.practicedSummary;
            if (practicedSummary != null) {
                CourseMeAdapter courseMeAdapter2 = this.this$0;
                TextView textView = this.binding.B;
                Resources resources = courseMeAdapter2.sContext.getResources();
                int i2 = kyi.course_practised_num;
                int i3 = practicedSummary.trainTimes;
                textView.setText(resources.getQuantityString(i2, i3, Integer.valueOf(i3)));
            }
            if (!this.this$0.getIsEditing()) {
                View checkView = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(checkView, "checkView");
                ViewExtKt.gone(checkView);
            } else {
                View checkView2 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(checkView2, "checkView");
                ViewExtKt.visible(checkView2);
                this.binding.A.setSelected(this.this$0.states.get(Integer.valueOf(pos)) != null);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            String str;
            Intrinsics.checkNotNullParameter(v, "v");
            CourseModel.PracticedCourse practicedCourse = null;
            if (this.this$0.getIsEditing()) {
                boolean zIsSelected = this.binding.A.isSelected();
                this.binding.A.setSelected(!zIsSelected);
                Map map = this.this$0.states;
                Object tag = v.getTag(oqi.s);
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                Integer num = (Integer) tag;
                if (!zIsSelected) {
                    Object tag2 = v.getTag();
                    Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.PracticedCourse");
                    practicedCourse = (CourseModel.PracticedCourse) tag2;
                }
                map.put(num, practicedCourse);
                this.this$0.getOnSelectChange().invoke();
                return;
            }
            CourseModel.PracticedCourse practicedCourse2 = (CourseModel.PracticedCourse) v.getTag();
            CourseModel.CourseData courseData = practicedCourse2 != null ? practicedCourse2.courseData : null;
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("name", "course_cover");
            pairArr[1] = TuplesKt.to("source", "my_course_list_page");
            pairArr[2] = TuplesKt.to("asset_id", String.valueOf(courseData != null ? courseData.courseId : 0L));
            if (courseData == null || (str = courseData.name) == null) {
                str = "";
            }
            pairArr[3] = TuplesKt.to(OneTrack.Param.ASSET_NAME, str);
            oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
            CourseInfoActivityKt.startCourseInfo$default(courseData != null ? courseData.courseId : 0L, null, 5, false, 10, null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            if (this.this$0.getIsEditing()) {
                return false;
            }
            this.this$0.states.clear();
            Map map = this.this$0.states;
            Object tag = v.getTag(oqi.s);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            Object tag2 = v.getTag();
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.mi.health.course.export.data.CourseModel.PracticedCourse");
            map.put((Integer) tag, (CourseModel.PracticedCourse) tag2);
            this.this$0.setEditMode(true, false);
            return true;
        }
    }

    public CourseMeAdapter(@NotNull Function0<Unit> onSelectChange) {
        Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
        this.onSelectChange = onSelectChange;
        this.states = new LinkedHashMap();
        this.list = new ArrayList();
        this.isMale = Intrinsics.areEqual(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), "male");
        this.sContext = AppUtil.getApp();
        this.editState = new MutableLiveData<>();
    }

    public static /* synthetic */ void setEditMode$default(CourseMeAdapter courseMeAdapter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        courseMeAdapter.setEditMode(z, z2);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void addData(@Nullable List<? extends CourseModel.PracticedCourse> d, boolean set) {
        if (set) {
            this.states.clear();
            this.list.clear();
        }
        List<? extends CourseModel.PracticedCourse> list = d;
        if (list != null && !list.isEmpty()) {
            this.list.addAll(list);
        }
        notifyDataSetChanged();
    }

    @NotNull
    public final MutableLiveData<Boolean> getEditState() {
        return this.editState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    @NotNull
    public final Function0<Unit> getOnSelectChange() {
        return this.onSelectChange;
    }

    @NotNull
    public final Set<Long> getSelectIds() {
        CourseModel.CourseData courseData;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<Integer, CourseModel.PracticedCourse>> it = this.states.entrySet().iterator();
        while (it.hasNext()) {
            CourseModel.PracticedCourse value = it.next().getValue();
            Long lValueOf = (value == null || (courseData = value.courseData) == null) ? null : Long.valueOf(courseData.courseId);
            if (lValueOf != null) {
                linkedHashSet.add(lValueOf);
            }
        }
        return linkedHashSet;
    }

    public final int getSelectedCount() {
        Map<Integer, CourseModel.PracticedCourse> map = this.states;
        int i = 0;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<Integer, CourseModel.PracticedCourse>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() != null) {
                    i++;
                }
            }
        }
        return i;
    }

    public final boolean isAllChecked() {
        return getSelectedCount() == this.list.size();
    }

    /* JADX INFO: renamed from: isEditing, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public final void resetSelectedIds() {
        this.states.clear();
        this.onSelectChange.invoke();
        this.editState.setValue(Boolean.FALSE);
        setEditMode(false, false);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void selectAll(boolean selected) {
        int itemCount = getCount();
        for (int i = 0; i < itemCount; i++) {
            this.states.put(Integer.valueOf(i), selected ? this.list.get(i) : null);
        }
        notifyDataSetChanged();
        this.onSelectChange.invoke();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setEditMode(boolean edit, boolean clearState) {
        if (clearState) {
            this.states.clear();
        }
        this.isEditing = edit;
        this.editState.setValue(Boolean.valueOf(edit));
        notifyDataSetChanged();
    }

    public final void setEditing(boolean z) {
        this.isEditing = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        zu4 zu4VarA0 = zu4.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(zu4VarA0, "inflate(...)");
        return new Holder(this, zu4VarA0);
    }
}
