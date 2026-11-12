package com.xiaomi.hm.health.share;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.view.text.UnitTextView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ShareBodyFatAdapter extends RecyclerView.Adapter<a> {
    private Context a;
    private List<ScoreParamsObject> b;

    public class a extends RecyclerView.ViewHolder {
        public ImageView a;
        public TextView b;
        public UnitTextView c;
        public TextView d;

        public a(View itemView) {
            super(itemView);
            this.a = (ImageView) itemView.findViewById(R.id.bf_score_ll_pre);
            this.b = (TextView) itemView.findViewById(R.id.params_name_tv);
            this.c = (UnitTextView) itemView.findViewById(R.id.params_value_tv);
            this.d = (TextView) itemView.findViewById(R.id.content_state_tv);
        }
    }

    public ShareBodyFatAdapter(Context context, List<ScoreParamsObject> data) {
        this.a = context;
        this.b = data;
    }

    private void a(ScoreParamsObject paramsObject, ImageView view, int statusColor) {
        switch (paramsObject.getWfType()) {
            case 0:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_bmi_24), ColorStateList.valueOf(statusColor)));
                break;
            case 1:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_basal_metabolism_24), ColorStateList.valueOf(statusColor)));
                break;
            case 2:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_body_fat_24), ColorStateList.valueOf(statusColor)));
                break;
            case 3:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_bone_mass_24), ColorStateList.valueOf(statusColor)));
                break;
            case 4:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_visceral_fat_24), ColorStateList.valueOf(statusColor)));
                break;
            case 5:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_water_24), ColorStateList.valueOf(statusColor)));
                break;
            case 6:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_muscle_mass_24), ColorStateList.valueOf(statusColor)));
                break;
            case 7:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_protein_24), ColorStateList.valueOf(statusColor)));
                break;
            case 10:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_sfp_24), ColorStateList.valueOf(statusColor)));
                break;
            case 11:
                view.setImageDrawable(Utils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.ic_skeletal_muscle_24), ColorStateList.valueOf(statusColor)));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull a holder, int position) {
        ScoreParamsObject scoreParamsObject = this.b.get(position);
        if (scoreParamsObject.getType() == 1) {
            a(scoreParamsObject, holder.a, this.a.getResources().getColor(R.color.p3));
        } else if (scoreParamsObject.getType() == 2) {
            a(scoreParamsObject, holder.a, this.a.getResources().getColor(R.color.s33));
        } else if (scoreParamsObject.getType() == 0) {
            a(scoreParamsObject, holder.a, this.a.getResources().getColor(R.color.s20));
        }
        holder.b.setText(String.valueOf(scoreParamsObject.getParamsName()));
        String paramsValue = scoreParamsObject.getParamsValue();
        if (TextUtils.isEmpty(scoreParamsObject.getUnitValue())) {
            holder.c.setValue(paramsValue, "");
        } else {
            holder.c.setValue(paramsValue, scoreParamsObject.getUnitValue());
        }
        holder.d.setText(scoreParamsObject.getLevel());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public a onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new a(LayoutInflater.from(this.a).inflate(R.layout.score_parent_item_share_bf, parent, false));
    }
}
