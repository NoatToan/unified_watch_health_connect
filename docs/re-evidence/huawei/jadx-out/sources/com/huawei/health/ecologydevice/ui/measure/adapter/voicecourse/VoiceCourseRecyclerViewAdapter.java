package com.huawei.health.ecologydevice.ui.measure.adapter.voicecourse;

import android.content.Context;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.callback.SimpleItemTouchHelperCallback;
import com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.mediamanager.CourseModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import defpackage.esn;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class VoiceCourseRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> implements SimpleItemTouchHelperCallback.ItemTouchHelperAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<CourseModel.Course> f6654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f6655c;
    private boolean d;
    private int e;
    private int h;
    private OnCheckedChange i;
    private Vibrator j;

    public interface OnCheckedChange {
        void onCheckBoxClick();

        void onDownloadClick(int i);

        void onItemClick(int i);

        void onSortTouch(int i);

        void onSwitchClick(int i);
    }

    public VoiceCourseRecyclerViewAdapter(Context context, List<CourseModel.Course> list, int i, int i2) {
        this.f6655c = context;
        this.f6654b = list;
        this.e = i;
        this.h = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("VoiceCourseRecyclerViewAdapter", "onCreateViewHolder, parent = ", viewGroup, ", viewType = ", Integer.valueOf(i));
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_course_grid_view, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        LogUtil.a("VoiceCourseRecyclerViewAdapter", "onBindViewHolder, viewHolder = ", viewHolder, ", position = ", Integer.valueOf(i));
        if (i >= this.f6654b.size()) {
            return;
        }
        CourseModel.Course course = this.f6654b.get(i);
        if (!TextUtils.isEmpty(course.getName()) || !TextUtils.isEmpty(course.getShortDesc())) {
            viewHolder.k.setVisibility(8);
            viewHolder.h.setVisibility(0);
            viewHolder.i.setText(course.getName());
            viewHolder.f.setText(course.getLevel() + " " + this.f6655c.getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, (int) (course.getTime() / 60.0f), esn.c(course.getTime())));
            if (!this.d) {
                c(viewHolder, i, course);
                return;
            }
            viewHolder.h.setBackgroundResource(R.color.common_transparent);
            viewHolder.j.setVisibility(0);
            viewHolder.d.setVisibility(8);
            viewHolder.f6658c.setVisibility(8);
            viewHolder.f6656a.setVisibility(8);
            viewHolder.g.setVisibility(8);
            viewHolder.h.setOnTouchListener(new View.OnTouchListener() { // from class: epl
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.e.e(i, view, motionEvent);
                }
            });
            viewHolder.h.setClickable(false);
            return;
        }
        viewHolder.k.setVisibility(0);
        viewHolder.h.setVisibility(8);
    }

    public /* synthetic */ boolean e(int i, View view, MotionEvent motionEvent) {
        OnCheckedChange onCheckedChange = this.i;
        if (onCheckedChange == null || !this.d) {
            return false;
        }
        onCheckedChange.onSortTouch(i);
        return false;
    }

    private void c(ViewHolder viewHolder, final int i, final CourseModel.Course course) {
        if (course.getBackgroundResourceId() == 0) {
            viewHolder.h.setBackgroundResource(R.color.emui_card_panel_bg);
        } else {
            viewHolder.h.setBackgroundResource(course.getBackgroundResourceId());
        }
        viewHolder.j.setVisibility(8);
        int i2 = 0;
        viewHolder.d.setVisibility(0);
        Glide.with(this.f6655c).load(course.getSmallImgUrl()).transform(new RoundedCorners(this.f6655c.getResources().getDimensionPixelOffset(R.dimen.health_common_8dp))).into(viewHolder.d);
        if (!this.f6653a) {
            a(viewHolder, i, course);
        } else {
            HealthCheckBox healthCheckBox = viewHolder.f6658c;
            if (this.e == 0 && course.getStatus() > 1) {
                i2 = 8;
            }
            healthCheckBox.setVisibility(i2);
            viewHolder.f6656a.setVisibility(8);
            viewHolder.g.setVisibility(8);
            viewHolder.f6658c.setChecked(course.isCheckboxCheck());
            viewHolder.f6658c.setOnClickListener(new View.OnClickListener() { // from class: epi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(course, view);
                }
            });
        }
        viewHolder.h.setClickable(true);
        viewHolder.h.setOnClickListener(new View.OnClickListener() { // from class: epo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33321c.a(i, view);
            }
        });
    }

    public /* synthetic */ void e(CourseModel.Course course, View view) {
        course.setIsCheckboxCheck(!course.isCheckboxCheck());
        OnCheckedChange onCheckedChange = this.i;
        if (onCheckedChange != null) {
            onCheckedChange.onCheckBoxClick();
        }
    }

    public /* synthetic */ void a(int i, View view) {
        LogUtil.a("VoiceCourseRecyclerViewAdapter", "setNoSortStatusView mRelativeLayout setOnClickListener");
        OnCheckedChange onCheckedChange = this.i;
        if (onCheckedChange != null) {
            onCheckedChange.onItemClick(i);
        }
    }

    private void a(ViewHolder viewHolder, final int i, CourseModel.Course course) {
        viewHolder.f6658c.setVisibility(8);
        int i2 = this.e;
        if (i2 != 0) {
            if (i2 != 1 || this.h != 0) {
                LogUtil.a("VoiceCourseRecyclerViewAdapter", "setCommonStatusView else");
                return;
            }
            viewHolder.g.setVisibility(0);
            viewHolder.e.setChecked(course.getStatus() == 2);
            viewHolder.g.setOnClickListener(new View.OnClickListener() { // from class: epp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(i, view);
                }
            });
            return;
        }
        viewHolder.f6656a.setVisibility(0);
        if (course.getStatus() == 2) {
            viewHolder.f6656a.setText(this.f6655c.getResources().getString(R.string.IDS_motiontrack_offlinemap_load_ok));
            viewHolder.f6656a.setEnabled(false);
        } else {
            viewHolder.f6656a.setText(this.f6655c.getResources().getString(course.getStatus() == 3 ? R.string.IDS_rope_media_disable : R.string.IDS_rope_voicecourse_download));
            viewHolder.f6656a.setEnabled(true);
            viewHolder.f6656a.setOnClickListener(new View.OnClickListener() { // from class: epr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(i, view);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, View view) {
        OnCheckedChange onCheckedChange = this.i;
        if (onCheckedChange != null) {
            onCheckedChange.onDownloadClick(i);
        }
    }

    public /* synthetic */ void b(int i, View view) {
        LogUtil.a("VoiceCourseRecyclerViewAdapter", "mHealthSwitch setOnClickListener");
        OnCheckedChange onCheckedChange = this.i;
        if (onCheckedChange != null) {
            onCheckedChange.onSwitchClick(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6654b.size();
    }

    @Override // com.huawei.health.ecologydevice.callback.SimpleItemTouchHelperCallback.ItemTouchHelperAdapter
    public void onItemMove(int i, int i2) {
        CourseModel.Course course = this.f6654b.get(i);
        this.f6654b.remove(i);
        this.f6654b.add(i2, course);
        notifyItemMoved(i, i2);
        c();
    }

    public void c() {
        if (this.j == null) {
            Object systemService = this.f6655c.getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                this.j = (Vibrator) systemService;
            }
        }
        Vibrator vibrator = this.j;
        if (vibrator != null) {
            vibrator.vibrate(150L);
        }
    }

    public void b() {
        Vibrator vibrator = this.j;
        if (vibrator != null) {
            vibrator.cancel();
            this.j = null;
        }
    }

    public boolean e() {
        return this.f6653a;
    }

    public void a(boolean z) {
        this.f6653a = z;
    }

    public boolean d() {
        return this.d;
    }

    public void e(boolean z) {
        this.d = z;
        notifyDataSetChanged();
    }

    public void e(OnCheckedChange onCheckedChange) {
        this.i = onCheckedChange;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthButton f6656a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthCheckBox f6658c;
        private HealthImageView d;
        private HealthSwitchButton e;
        private HealthTextView f;
        private RelativeLayout g;
        private RelativeLayout h;
        private HealthTextView i;
        private HealthImageView j;
        private LinearLayout k;

        public ViewHolder(View view) {
            super(view);
            this.k = (LinearLayout) view.findViewById(R.id.tv_media_disable);
            this.h = (RelativeLayout) view.findViewById(R.id.rl_item_course);
            this.j = (HealthImageView) view.findViewById(R.id.iv_sort);
            this.d = (HealthImageView) view.findViewById(R.id.iv_course);
            this.i = (HealthTextView) view.findViewById(R.id.tv_course_name);
            this.f = (HealthTextView) view.findViewById(R.id.tv_course_description);
            this.f6658c = (HealthCheckBox) view.findViewById(R.id.check_box_select_all);
            this.f6656a = (HealthButton) view.findViewById(R.id.bt_download);
            this.g = (RelativeLayout) view.findViewById(R.id.rl_media_item_switch);
            this.e = (HealthSwitchButton) view.findViewById(R.id.rope_media_item_switch);
        }
    }
}
