package com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.ItemEventListener;
import com.huawei.health.suggestion.customizecourse.manager.adapter.interfaceadapter.OnStartDragListener;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hdr;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CourseMultiViewHolder extends CustomCourseDragViewHolder<hdr> implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hdr f8931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnMultiCloseListener f8932c;
    private OnStartDragListener d;
    private ImageView e;
    private ImageView f;
    private TextView g;
    private LinearLayout h;
    private ItemEventListener i;
    private List<hdr> j;
    private int m;
    private ImageView n;

    public interface OnMultiCloseListener {
        void onCloseClick(CourseMultiViewHolder courseMultiViewHolder);
    }

    public CourseMultiViewHolder(View view, Context context) {
        super(view);
        this.f8930a = context;
        this.m = 1;
        b(view);
    }

    public CourseMultiViewHolder(View view, Context context, OnStartDragListener onStartDragListener, ItemEventListener itemEventListener, OnMultiCloseListener onMultiCloseListener) {
        super(view);
        this.f8930a = context;
        this.m = 0;
        this.d = onStartDragListener;
        this.i = itemEventListener;
        this.f8932c = onMultiCloseListener;
        b(view);
    }

    private void b(View view) {
        this.f = (ImageView) view.findViewById(R.id.sug_custom_course_item_icon_drag);
        this.g = (TextView) view.findViewById(R.id.sug_custom_course_item_repeat_times);
        this.n = (ImageView) view.findViewById(R.id.sug_custom_course_item_icon_edit_action);
        this.e = (ImageView) view.findViewById(R.id.sug_custom_course_item_del_multi);
        this.h = (LinearLayout) view.findViewById(R.id.sug_custom_course_item_multi_content);
        this.f.setOnLongClickListener(this);
        this.h.setOnLongClickListener(this);
        view.findViewById(R.id.sug_custom_course_repeat_times_edit).setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    public List<hdr> c() {
        return this.j;
    }

    public void d(List<hdr> list) {
        this.j = list;
    }

    public hdr e() {
        return this.f8931b;
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(hdr hdrVar, int i) {
        if (hdrVar == null) {
            LogUtil.j("Suggestion_CourseMultiViewHolder", "init, actionItemConfig == null");
            return;
        }
        this.f8931b = hdrVar;
        LogUtil.a("Suggestion_CourseMultiViewHolder", "init, mState = ", Integer.valueOf(this.m));
        if (this.m == 1) {
            setIsCanDrag(false);
            this.f.setVisibility(8);
            this.n.setVisibility(8);
            this.e.setVisibility(8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart((int) this.f8930a.getResources().getDimension(R.dimen.defaultPaddingStart));
            layoutParams.setMarginEnd((int) this.f8930a.getResources().getDimension(R.dimen.defaultPaddingEnd));
            this.h.setLayoutParams(layoutParams);
            this.h.setPadding((int) this.f8930a.getResources().getDimension(R.dimen.cardMarginMiddle), (int) this.f8930a.getResources().getDimension(R.dimen.activity_vertical_margin), (int) this.f8930a.getResources().getDimension(R.dimen.cardMarginMiddle), 0);
        } else {
            setIsCanDrag(true);
        }
        this.g.setText(this.f8930a.getResources().getQuantityString(R.plurals.sug_courses_group_num, this.f8931b.i(), Integer.valueOf(this.f8931b.i())));
    }

    public void e(boolean z) {
        if (z) {
            hdr hdrVar = this.f8931b;
            if (hdrVar == null || TextUtils.isEmpty(hdrVar.j())) {
                return;
            }
            this.g.setText(this.f8931b.j());
            return;
        }
        hdr hdrVar2 = this.f8931b;
        int i = (hdrVar2 == null || hdrVar2.i() <= 1) ? 2 : this.f8931b.i();
        this.g.setText(this.f8930a.getResources().getQuantityString(R.plurals.sug_courses_group_num, i, Integer.valueOf(i)));
    }

    @Override // com.huawei.health.suggestion.customizecourse.manager.adapter.viewholder.CustomCourseDragViewHolder
    public void setDragState(boolean z) {
        if (z) {
            this.h.setBackgroundResource(R.drawable.sug_fitness_action_item_shape);
        } else {
            this.h.setBackgroundResource(R.drawable.sug_custom_course_item_multi_bg);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.m == 1) {
            return;
        }
        int id = view.getId();
        int adapterPosition = getAdapterPosition();
        if (adapterPosition < 0) {
            return;
        }
        if (id == R.id.sug_custom_course_repeat_times_edit) {
            ItemEventListener itemEventListener = this.i;
            if (itemEventListener != null) {
                itemEventListener.onComItemClick(adapterPosition, 3);
                return;
            }
            return;
        }
        if (id == R.id.sug_custom_course_item_del_multi) {
            ItemEventListener itemEventListener2 = this.i;
            if (itemEventListener2 != null) {
                itemEventListener2.onComItemClick(adapterPosition, 2);
                return;
            }
            return;
        }
        LogUtil.j("Suggestion_CourseMultiViewHolder", "onClick, id = ", Integer.valueOf(id));
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (this.m == 1) {
            return false;
        }
        int id = view.getId();
        if (id != R.id.sug_custom_course_item_icon_drag && id != R.id.sug_custom_course_item_multi_content) {
            return false;
        }
        OnMultiCloseListener onMultiCloseListener = this.f8932c;
        if (onMultiCloseListener != null && this.f8931b != null && this.d != null) {
            onMultiCloseListener.onCloseClick(this);
            e(true);
            this.d.onStartDrag(this);
        }
        return true;
    }
}
