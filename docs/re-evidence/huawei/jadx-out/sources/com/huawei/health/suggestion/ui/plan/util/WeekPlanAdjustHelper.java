package com.huawei.health.suggestion.ui.plan.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.DayInfo;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.RecyclerViewItemTouchListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btw;
import defpackage.gzx;
import defpackage.hvv;
import defpackage.ieg;
import defpackage.ift;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class WeekPlanAdjustHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f9722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ItemTouchHelper f9723c;
    private e d;
    private IntPlan e;
    private View g;

    public WeekPlanAdjustHelper(Context context) {
        this.f9721a = context;
    }

    public void a(IntPlan intPlan) {
        this.e = intPlan;
        c();
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f9721a);
        builder.a(this.g).d(R.string.IDS_save, new DialogInterface.OnClickListener() { // from class: hws
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.b(dialogInterface, i);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: hwp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("Suggestion_WeekPlanAdjustHelper", "dialog cancel");
            }
        });
        builder.e(this.f9721a.getResources().getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.health_common_12dp), this.f9721a.getResources().getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.health_common_12dp));
        builder.b().show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        c(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.ui.plan.util.WeekPlanAdjustHelper.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                if (!CommonUtil.ab(WeekPlanAdjustHelper.this.f9721a)) {
                    qpx.e(WeekPlanAdjustHelper.this.f9721a, com.huawei.health.suggestion.R.string.IDS_submit_error_message_1);
                } else {
                    qpx.e(WeekPlanAdjustHelper.this.f9721a, com.huawei.health.suggestion.R.string.IDS_plan_adjust_fail);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                ReleaseLogUtil.d("Suggestion_WeekPlanAdjustHelper", "adjustPlanSchedule success.");
            }
        });
    }

    private void c(UiCallback<IntPlan> uiCallback) {
        c cVar = this.f9722b;
        if (cVar == null || this.d == null) {
            return;
        }
        List list = cVar.f9729b;
        List list2 = this.d.f9733b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            if (njy.e(list, i)) {
                LogUtil.j("Suggestion_WeekPlanAdjustHelper", "time out of bound.");
                break;
            }
            a aVar = (a) list2.get(i);
            arrayList.add(new DayInfo.Builder().adjustDay(String.valueOf(ieg.b(((Long) list.get(i)).longValue()))).dayStatus(Integer.valueOf(!aVar.f9726c ? 1 : 0)).courseIdList(aVar.e).build());
        }
        hvv.e(this.e.getPlanId(), this.e.getPlanType().getType(), arrayList, uiCallback);
    }

    private void c() {
        View viewInflate = LayoutInflater.from(this.f9721a).inflate(com.huawei.health.suggestion.R.layout.ai_plan_adjust_week_courses, (ViewGroup) null);
        this.g = viewInflate;
        ((HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.adjustWeekPlanTip)).setText(this.f9721a.getResources().getQuantityString(com.huawei.health.suggestion.R.plurals.IDS_ai_week_plan_adjust_tip1, 7, 7));
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.g.findViewById(com.huawei.health.suggestion.R.id.date_list);
        HealthRecycleView healthRecycleView2 = (HealthRecycleView) this.g.findViewById(com.huawei.health.suggestion.R.id.course_item_list);
        ArrayList arrayList = new ArrayList();
        List<a> listB = b(this.e);
        boolean z = false;
        if (listB.size() < 7) {
            ((HealthTextView) this.g.findViewById(com.huawei.health.suggestion.R.id.absentScheduleTip)).setVisibility(0);
        }
        Iterator<a> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().f9725a));
        }
        c cVar = new c(this.f9721a, arrayList);
        this.f9722b = cVar;
        healthRecycleView.setAdapter(cVar);
        int i = 1;
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.f9721a, i, z) { // from class: com.huawei.health.suggestion.ui.plan.util.WeekPlanAdjustHelper.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        this.d = new e(this.f9721a, listB);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new g(this.d));
        this.f9723c = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(healthRecycleView2);
        healthRecycleView2.setAdapter(this.d);
        healthRecycleView2.setLayoutManager(new HealthLinearLayoutManager(this.f9721a, i, z) { // from class: com.huawei.health.suggestion.ui.plan.util.WeekPlanAdjustHelper.3
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        healthRecycleView2.setNestedScrollingEnabled(false);
        healthRecycleView2.b(false);
        healthRecycleView2.e(false);
        healthRecycleView2.addOnItemTouchListener(new RecyclerViewItemTouchListener(healthRecycleView2) { // from class: com.huawei.health.suggestion.ui.plan.util.WeekPlanAdjustHelper.5
            @Override // com.huawei.ui.commonui.listener.RecyclerViewItemTouchListener
            public void onItemTouchDown(RecyclerView.ViewHolder viewHolder) {
                LogUtil.a("Suggestion_WeekPlanAdjustHelper", "courseRecyclerView onItemTouch");
                if (WeekPlanAdjustHelper.this.f9723c != null) {
                    WeekPlanAdjustHelper.this.f9723c.startDrag(viewHolder);
                }
            }
        });
        this.f9722b.notifyDataSetChanged();
        this.d.notifyDataSetChanged();
    }

    private List<a> b(IntPlan intPlan) {
        int iH = btw.h(intPlan);
        ArrayList arrayList = new ArrayList();
        long jA = ift.a(System.currentTimeMillis());
        int iD = 0;
        for (int i = 0; i < intPlan.getMetaInfo().getWeekCount(); i++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i);
            if (weekInfoByIdx.getWeekOrder() >= iH) {
                for (int i2 = 0; i2 < weekInfoByIdx.getDayCount(); i2++) {
                    IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i2);
                    if (dayByIdx != null) {
                        long jA2 = ift.a(this.e.getPlanTimeInfo().getBeginDate() * 1000, weekInfoByIdx.getWeekOrder() - 1, dayByIdx.getDayOrder());
                        if (jA2 < jA) {
                            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "dayOrder:", Integer.valueOf(dayByIdx.getDayOrder()), " ", Long.valueOf(jA2), " ", Long.valueOf(jA));
                        } else {
                            if (arrayList.size() >= 7 - iD) {
                                break;
                            }
                            iD += d(arrayList, dayByIdx, jA2);
                        }
                    }
                }
            }
        }
        LogUtil.a("Suggestion_WeekPlanAdjustHelper", "getCourseScheduleDataList thisWeek:", Integer.valueOf(iH), " absentDay:", Integer.valueOf(iD));
        return arrayList;
    }

    private int d(List<a> list, IntDayPlan intDayPlan, long j) {
        ArrayList arrayList = new ArrayList();
        if (intDayPlan.getDayStatus() == 2) {
            return 1;
        }
        if (intDayPlan.getInPlanActionCnt() == 0) {
            list.add(new a(BaseApplication.getContext().getString(com.huawei.health.suggestion.R.string.IDS_course_status_rest), arrayList, false, j));
            return 0;
        }
        if (d(intDayPlan, arrayList)) {
            return 1;
        }
        String strB = intDayPlan.getInPlanAction(0).getActionInfo().b();
        if (intDayPlan.getInPlanActionCnt() > 1) {
            for (int i = 1; i < intDayPlan.getInPlanActionCnt(); i++) {
                strB = gzx.c(this.f9721a, com.huawei.health.suggestion.R.string.IDS_music_format_split2, strB, intDayPlan.getInPlanAction(i).getActionInfo().b());
            }
        }
        list.add(new a(strB, arrayList, true, j));
        return 0;
    }

    private boolean d(IntDayPlan intDayPlan, List<String> list) {
        if (intDayPlan.getPunchFlag() == 1) {
            return true;
        }
        boolean z = false;
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            list.add(inPlanAction.getActionId());
            if (inPlanAction.getPunchFlag() == 1) {
                z = true;
            }
        }
        return z;
    }

    static class g extends ItemTouchHelper.Callback {
        private e e;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return false;
        }

        g(e eVar) {
            this.e = eVar;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "onMove, source = ", Integer.valueOf(viewHolder.getBindingAdapterPosition()), ", target = ", Integer.valueOf(viewHolder2.getBindingAdapterPosition()));
            if (this.e == null) {
                LogUtil.j("Suggestion_WeekPlanAdjustHelper", "onMove, mAdapter is null");
                return false;
            }
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
            if (!(viewHolder instanceof b) || !(viewHolder2 instanceof b)) {
                LogUtil.j("Suggestion_WeekPlanAdjustHelper", "source is not CourseScheduleViewHolder");
                return true;
            }
            this.e.c(bindingAdapterPosition, bindingAdapterPosition2, (b) viewHolder);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "onSwiped");
        }
    }

    static class c extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Long> f9729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f9730c;

        c(Context context, List<Long> list) {
            this.f9730c = context;
            this.f9729b = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup viewGroup, int i) {
            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "onCreateViewHolder.", Integer.valueOf(i));
            return new d(LayoutInflater.from(this.f9730c).inflate(com.huawei.health.suggestion.R.layout.item_date_unit_layout, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d dVar, int i) {
            if (njy.e(this.f9729b, i)) {
                LogUtil.e("Suggestion_WeekPlanAdjustHelper", "onBindViewHolder error,", Integer.valueOf(i));
                return;
            }
            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "onBindViewHolder.", Integer.valueOf(i), " ", this.f9729b.get(i));
            dVar.a(this.f9729b.get(i).longValue());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f9729b.size();
        }
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f9731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f9732c;

        d(View view) {
            super(view);
            this.f9731b = (HealthTextView) view.findViewById(com.huawei.health.suggestion.R.id.week_day_title);
            this.f9732c = (HealthTextView) view.findViewById(com.huawei.health.suggestion.R.id.date_title);
            if (qrs.y()) {
                this.f9731b.setTextSize(1, 12.0f);
                this.f9732c.setTextSize(1, 14.0f);
            }
        }

        void a(long j) {
            int[] iArr = {com.huawei.health.suggestion.R.string.IDS_monday, com.huawei.health.suggestion.R.string.IDS_tuesday, com.huawei.health.suggestion.R.string.IDS_wednesday, com.huawei.health.suggestion.R.string.IDS_thursday, com.huawei.health.suggestion.R.string.IDS_friday, com.huawei.health.suggestion.R.string.IDS_saturday, com.huawei.health.suggestion.R.string.IDS_sunday};
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            int iB = ift.b(calendar.get(7));
            if (ift.i(j).equals(ift.i(Calendar.getInstance().getTimeInMillis()))) {
                this.f9731b.setText(BaseApplication.getContext().getString(com.huawei.health.suggestion.R.string.IDS_detail_sleep_bottom_btu_day_txt));
            } else {
                this.f9731b.setText(BaseApplication.getContext().getString(iArr[iB - 1]));
            }
            this.f9732c.setText(String.valueOf(calendar.get(5)));
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9725a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9726c;
        private String d;
        private List<String> e;

        a(String str, List<String> list, boolean z, long j) {
            this.d = str;
            this.e = list;
            this.f9726c = z;
            this.f9725a = j;
        }
    }

    static class e extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<a> f9733b;
        private Context d;

        e(Context context, List<a> list) {
            this.d = context;
            this.f9733b = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "onCreateViewHolder.", Integer.valueOf(i));
            return new b(LayoutInflater.from(this.d).inflate(com.huawei.health.suggestion.R.layout.item_course_schedule_layout, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i) {
            if (!njy.e(this.f9733b, i)) {
                LogUtil.a("Suggestion_WeekPlanAdjustHelper", "onBindViewHolder.", Integer.valueOf(i), " ", this.f9733b.get(i).d);
                bVar.d(this.f9733b.get(i));
                return;
            }
            LogUtil.e("Suggestion_WeekPlanAdjustHelper", "onBindViewHolder error,", Integer.valueOf(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f9733b.size();
        }

        public void c(int i, int i2, b bVar) {
            if (bVar == null || njy.e(this.f9733b)) {
                LogUtil.j("Suggestion_WeekPlanAdjustHelper", "itemMove, dragViewHolder == null or CollectionUtils.isEmpty(mCourseNameList)");
                return;
            }
            LogUtil.a("Suggestion_WeekPlanAdjustHelper", "itemMove, fromPosition=", Integer.valueOf(i), ", toPosition =", Integer.valueOf(i2));
            if (i < 0 || i >= this.f9733b.size() || i2 < 0 || i2 >= this.f9733b.size()) {
                return;
            }
            c(i, i2);
        }

        private void c(int i, int i2) {
            if (i < i2) {
                int i3 = i;
                while (i3 < i2) {
                    int i4 = i3 + 1;
                    Collections.swap(this.f9733b, i3, i4);
                    i3 = i4;
                }
            } else {
                int i5 = i;
                int i6 = i5;
                while (i5 > i2) {
                    int i7 = i5 - 1;
                    Collections.swap(this.f9733b, i6, i7);
                    i5--;
                    i6 = i7;
                }
            }
            notifyItemMoved(i, i2);
        }
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f9727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConstraintLayout f9728b;

        b(View view) {
            super(view);
            this.f9728b = (ConstraintLayout) view.findViewById(com.huawei.health.suggestion.R.id.course_schedule_layout);
            this.f9727a = (HealthTextView) view.findViewById(com.huawei.health.suggestion.R.id.course_item_title);
        }

        void d(a aVar) {
            if (aVar.f9726c) {
                this.f9728b.setBackgroundResource(com.huawei.health.suggestion.R.drawable.bg_has_course);
            } else {
                this.f9728b.setBackgroundResource(com.huawei.health.suggestion.R.drawable.bg_no_course);
            }
            this.f9727a.setText(aVar.d);
        }
    }
}
