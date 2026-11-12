package com.huawei.health.suggestion.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddv;
import defpackage.ien;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MySingleCourseAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9023c;
    private OnItemClickListener d;
    private List<SleepAudioSeries> e;

    public interface OnItemClickListener {
        void onItemCheckBoxClick(View view, int i);
    }

    public MySingleCourseAdapter(Context context, List<SleepAudioSeries> list, int i) {
        this.f9023c = context;
        this.e = list;
        this.f9022b = i;
    }

    public List<SleepAudioSeries> b() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.f9023c).inflate(R.layout.sug_my_course_single_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
        LogUtil.a("Suggestion_MySingleCourseAdapter", "MySingleCourseAdapter onBindViewHolder position = ", Integer.valueOf(i));
        if (njy.e(this.e, i)) {
            LogUtil.d("Suggestion_MySingleCourseAdapter", "onBindViewHolder : out of bound! position:", Integer.valueOf(i));
            return;
        }
        SleepAudioSeries sleepAudioSeries = this.e.get(i);
        if (sleepAudioSeries == null) {
            LogUtil.d("Suggestion_MySingleCourseAdapter", "onBindViewHolder : singleData == null");
            return;
        }
        String strValueOf = String.valueOf(sleepAudioSeries.getId());
        LogUtil.a("Suggestion_MySingleCourseAdapter", "onBindViewHolder audioCourseId = ", strValueOf);
        eVar.e.setText(sleepAudioSeries.getName());
        eVar.f9031b.setVisibility(sleepAudioSeries.getIsVip() == 1 ? 0 : 8);
        qqf.b(eVar.f9032c, sleepAudioSeries.getSmallImage(), qqf.e, 0, R.drawable.sug_bg_trining_defuct);
        c(eVar, sleepAudioSeries, strValueOf);
        c(eVar, sleepAudioSeries, i);
    }

    private void c(final e eVar, final SleepAudioSeries sleepAudioSeries, final String str) {
        eVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.adapter.MySingleCourseAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eVar.d.getVisibility() == 0) {
                    return;
                }
                if (qrs.e(500, view)) {
                    LogUtil.d("Suggestion_MySingleCourseAdapter", "itemView click too fast.");
                } else {
                    LogUtil.a("Suggestion_MySingleCourseAdapter", "onClick() audioCourseId = ", str);
                    MySingleCourseAdapter.this.a(str, sleepAudioSeries, false);
                }
            }
        });
        eVar.f9030a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.adapter.MySingleCourseAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eVar.d.getVisibility() == 0) {
                    return;
                }
                if (!qrs.e(500, view)) {
                    MySingleCourseAdapter.this.a(str, sleepAudioSeries, true);
                } else {
                    LogUtil.d("Suggestion_MySingleCourseAdapter", "itemView click too fast.");
                }
            }
        });
    }

    private void c(e eVar, SleepAudioSeries sleepAudioSeries, final int i) {
        if (sleepAudioSeries.getIsShowCheckBox() == 1) {
            eVar.d.setVisibility(0);
        } else {
            eVar.d.setVisibility(8);
        }
        if (sleepAudioSeries.getIsSelected() == 1) {
            eVar.d.setChecked(true);
        } else {
            eVar.d.setChecked(false);
        }
        eVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.adapter.MySingleCourseAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MySingleCourseAdapter.this.d != null) {
                    MySingleCourseAdapter.this.d.onItemCheckBoxClick(view, i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SleepAudioSeries> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, SleepAudioSeries sleepAudioSeries, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Suggestion_MySingleCourseAdapter", "gotoSeriesCourseH5 id is empty");
            return;
        }
        if (!ien.a(this.f9022b, sleepAudioSeries.getAudioType())) {
            str2 = "";
        } else {
            str2 = "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + str + "&type=sleepAudio";
        }
        if (ien.e(this.f9022b, sleepAudioSeries.getDecompressType())) {
            str2 = "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + str + "&type=decompressAudio";
        }
        if (z) {
            str2 = str2 + "&playing=true";
        }
        LogUtil.a("Suggestion_MySingleCourseAdapter", "gotoAudioCourseH5 url = ", str2);
        ddv.b().startOperationWebPage(this.f9023c, str2);
    }

    public void a(OnItemClickListener onItemClickListener) {
        this.d = onItemClickListener;
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f9030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f9031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f9032c;
        private HealthCheckBox d;
        private HealthTextView e;
        private ConstraintLayout f;

        e(View view) {
            super(view);
            this.f = (ConstraintLayout) view.findViewById(R.id.single_course_item);
            this.e = (HealthTextView) view.findViewById(R.id.course_title);
            this.f9030a = (ImageView) view.findViewById(R.id.audio_play_image_button);
            this.d = (HealthCheckBox) view.findViewById(R.id.single_audio_course_checkbox);
            this.f9031b = (HealthTextView) view.findViewById(R.id.single_audio_course_tag);
            this.f9032c = (ImageView) view.findViewById(R.id.recycle_item_picture);
        }
    }
}
