package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.view.text.UnitTextView;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BodyFatDetailAdapter;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BodyFatDetailAdapter extends RecyclerView.Adapter<a> {
    private Context a;
    private List<ScoreParamsObject> b;
    private int c;

    public class a extends RecyclerView.ViewHolder {
        public ImageView a;
        public TextView b;
        public UnitTextView c;
        public TextView d;
        public LinearLayout e;
        public TextView f;

        public a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.bf_score_ll_pre);
            this.b = (TextView) view.findViewById(R.id.params_name_tv);
            this.c = (UnitTextView) view.findViewById(R.id.params_value_tv);
            this.d = (TextView) view.findViewById(R.id.content_state_tv);
            this.e = (LinearLayout) view.findViewById(R.id.ll_bf3_params);
            this.f = (TextView) view.findViewById(R.id.text_view_details);
        }
    }

    public BodyFatDetailAdapter(Context context, List<ScoreParamsObject> list, int i) {
        this.a = context;
        this.b = list;
        this.c = i;
    }

    private void b(ScoreParamsObject scoreParamsObject, ImageView imageView, int i) {
        switch (scoreParamsObject.getWfType()) {
            case 0:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_b_m_i), ColorStateList.valueOf(i)));
                break;
            case 1:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_metabolize), ColorStateList.valueOf(i)));
                break;
            case 2:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_fat), ColorStateList.valueOf(i)));
                break;
            case 3:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_bone), ColorStateList.valueOf(i)));
                break;
            case 4:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_viscera), ColorStateList.valueOf(i)));
                break;
            case 5:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_water), ColorStateList.valueOf(i)));
                break;
            case 6:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_muscle), ColorStateList.valueOf(i)));
                break;
            case 7:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_protein), ColorStateList.valueOf(i)));
                break;
            case 8:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_figure), ColorStateList.valueOf(i)));
                break;
            case 9:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.bf3_weight_icon), ColorStateList.valueOf(i)));
                break;
            case 10:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.icon_subcutaneous_fat), ColorStateList.valueOf(i)));
                break;
            case 11:
                imageView.setImageDrawable(TintUtils.tintDrawable(ContextCompat.getDrawable(this.a, R.drawable.icon_skeletal_muscle), ColorStateList.valueOf(i)));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(ScoreParamsObject scoreParamsObject, View view) {
        BFCallback.getInstance().startBodyIndexDetails(view.getContext(), scoreParamsObject.getWfType());
    }

    private void d(String str, ImageView imageView, ScoreParamsObject scoreParamsObject, int i) {
        b(scoreParamsObject, imageView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull a aVar, int i) {
        final ScoreParamsObject scoreParamsObject = this.b.get(i);
        if (scoreParamsObject.getType() == 1) {
            d("fail", aVar.a, scoreParamsObject, this.a.getResources().getColor(R.color.bf3_list_not_stand));
        } else if (scoreParamsObject.getType() == 2) {
            d(BFConstant.IMAGE_POSITION_FOCUS, aVar.a, scoreParamsObject, this.a.getResources().getColor(R.color.bf3_list_attention));
        } else if (scoreParamsObject.getType() == 0) {
            d("health", aVar.a, scoreParamsObject, this.a.getResources().getColor(R.color.bf3_list_health));
        }
        aVar.b.setText(String.valueOf(scoreParamsObject.getParamsName()));
        String paramsValue = scoreParamsObject.getParamsValue();
        if (TextUtils.isEmpty(scoreParamsObject.getUnitValue())) {
            aVar.c.setValue(paramsValue, "");
        } else {
            aVar.c.setValue(paramsValue, scoreParamsObject.getUnitValue());
        }
        if (TextUtils.isEmpty(scoreParamsObject.getLevel())) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aVar.e.getLayoutParams();
            layoutParams.addRule(15, -1);
            aVar.e.setLayoutParams(layoutParams);
        }
        aVar.d.setText(scoreParamsObject.getLevel());
        scoreParamsObject.getWfType();
        if (!BFCallback.getInstance().enableMiDongFlavor() || !HMWeightUtils.isSelf(scoreParamsObject.getUid())) {
            aVar.f.setVisibility(8);
        } else {
            aVar.f.setVisibility(0);
            aVar.f.setOnClickListener(new View.OnClickListener() { // from class: l30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BodyFatDetailAdapter.c(scoreParamsObject, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.a).inflate(R.layout.score_item_extend, viewGroup, false));
    }
}
