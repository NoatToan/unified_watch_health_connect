package com.huami.step.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.step.R;
import com.huami.step.model.StepTimeLineInfo;
import com.huami.step.utils.UnitManager;
import com.huami.step.view.StepUnitTextView;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class StepTimeLineAdapter extends BaseAdapter {
    private static final int h = 4;
    public StepUnitTextView a;
    public StepUnitTextView b;
    public StepUnitTextView c;
    public StepUnitTextView d;
    public Context e;
    private List<StepTimeLineInfo> f = new ArrayList();
    private List<StepTimeLineInfo> g = new ArrayList();

    public StepTimeLineAdapter(Context context) {
        this.e = context;
    }

    private String a(int i) {
        return new DecimalFormat(",###").format(Long.valueOf(i));
    }

    private String b(int i, int i2) {
        String str = "";
        if (i != 0) {
            str = "" + i + this.e.getString(R.string.step_unit_hour_long);
        }
        if (i2 == 0) {
            return str;
        }
        return str + i2 + this.e.getString(R.string.step_unit_min);
    }

    private int c(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return R.drawable.step_icon_walk;
        }
        return i != 7 ? R.drawable.step_icon_running : R.drawable.step_icon_slight;
    }

    private String d(int i, int i2, int i3) {
        String[] stringArray = this.e.getResources().getStringArray(R.array.step_timeline_type);
        if (i < 0 || i >= stringArray.length) {
            return "";
        }
        return stringArray[i] + " " + b(i2, i3);
    }

    private String e(int i, int i2) {
        Context context = this.e;
        return context.getString(R.string.time_line_start_end, TimeUtils.formatTime(context, i), TimeUtils.formatTime(this.e, i2));
    }

    public void clear() {
        this.f.clear();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseViewHolder baseViewHolder;
        if (view == null) {
            view = LayoutInflater.from(this.e).inflate(R.layout.step_item_timeline, viewGroup, false);
            baseViewHolder = new BaseViewHolder(view);
            view.setTag(baseViewHolder);
        } else {
            baseViewHolder = (BaseViewHolder) view.getTag();
        }
        ((ImageView) baseViewHolder.getView(R.id.step_time_line)).setImageDrawable(ContextCompat.getDrawable(this.e, c(this.f.get(i).getMode())));
        setupView(baseViewHolder, getItem(i));
        return view;
    }

    public void setupView(BaseViewHolder baseViewHolder, StepTimeLineInfo stepTimeLineInfo) {
        ((TextView) baseViewHolder.getView(R.id.step_title)).setText(d(stepTimeLineInfo.getMode(), stepTimeLineInfo.getDurationHour(), stepTimeLineInfo.getDurationMin()));
        ((TextView) baseViewHolder.getView(R.id.step_time)).setText(e(stepTimeLineInfo.getStartTime(), stepTimeLineInfo.getEndTime()));
        StepUnitTextView stepUnitTextView = (StepUnitTextView) baseViewHolder.getView(R.id.step_value);
        this.b = stepUnitTextView;
        stepUnitTextView.setValue(a(stepTimeLineInfo.getStep()), (String) this.e.getResources().getQuantityText(R.plurals.step_text_unit_step, stepTimeLineInfo.getStep()));
        StepUnitTextView stepUnitTextView2 = (StepUnitTextView) baseViewHolder.getView(R.id.step_distance);
        this.c = stepUnitTextView2;
        stepUnitTextView2.setValue(UnitManager.formatValue(stepTimeLineInfo.getDistance()), this.e.getString(R.string.step_distance_desc));
        StepUnitTextView stepUnitTextView3 = (StepUnitTextView) baseViewHolder.getView(R.id.step_calorie);
        this.d = stepUnitTextView3;
        stepUnitTextView3.setValue(a(stepTimeLineInfo.getCalorie()), this.e.getString(R.string.step_kal_desc));
    }

    public void update(List<StepTimeLineInfo> list) {
        if (list != null) {
            this.f.clear();
            this.g.clear();
            if (list.size() > 4) {
                this.f.addAll(list.subList(0, 4));
            } else {
                this.f.addAll(list);
            }
            this.g.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void updateAll(List<StepTimeLineInfo> list) {
        List<StepTimeLineInfo> list2;
        if (list == null || list == (list2 = this.f)) {
            return;
        }
        list2.clear();
        this.f.addAll(list);
        notifyDataSetChanged();
    }

    public void updateAllDate() {
        this.f.clear();
        this.f.addAll(this.g);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public StepTimeLineInfo getItem(int i) {
        return this.f.get(i);
    }
}
